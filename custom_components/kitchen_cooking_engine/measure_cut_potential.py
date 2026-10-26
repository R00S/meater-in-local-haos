#!/usr/bin/env python3
"""Derive the cut-file potential queue.

This script is the measurement side of the recipe research loop. It reads the cut
hubs, their method leaves and the cut registry, and derives facts that a machine
can see: how many leaves a cut has, how many sources those leaves cite, whether a
leaf declares that no source publishes a temperature, and whether the registry,
the hub frontmatter and the actual leaf files agree with each other.

It writes ``www/recipes/CUT_POTENTIAL.md``: the queue that passes work from. It
deliberately does **not** read ``quality_score``. That field is a frozen legacy
value and has no influence on ordering.

Two tiers are shown side by side:

* **authored** — what a previous pass claimed, from the cut's
  ``## Data state and gaps`` section (its ledger). This can hold things the sweep
  cannot derive, such as searched-negatives and blocked system changes.
* **derived** — what the files say right now.

Where they disagree, the disagreement is printed. A conflict is the most useful
signal in the file: it means prose and data have drifted apart.

Usage::

    python measure_cut_potential.py            # write the queue
    python measure_cut_potential.py --stdout   # print, do not write
    python measure_cut_potential.py --top 25   # size of the ranked section
"""

from __future__ import annotations

import argparse
import importlib.util
import re
import sys
from dataclasses import dataclass, field
from pathlib import Path

BASE_DIR = Path(__file__).resolve().parent
RECIPES_DIR = BASE_DIR / "www" / "recipes"
QUEUE_PATH = RECIPES_DIR / "CUT_POTENTIAL.md"

CUT_RE = re.compile(r"<!-- KCE:CUT\n(.*?)\n-->", re.DOTALL)
METHOD_HEADER_RE = re.compile(r"<!-- KCE:CUT_METHOD\n(.*?)\n-->", re.DOTALL)
LEDGER_HEADING_RE = re.compile(r"^##\s+Data state and gaps\s*$", re.MULTILINE)
LEDGER_STATE_RE = re.compile(r"<!--\s*ledger-state:(.*?)-->", re.DOTALL)
TEMP_CELSIUS_RE = re.compile(r"\b\d{2,3}\s?°\s?C")
# Most leaves attribute sources with "**Inspired by**", but 12 older leaves use
# "**Attribution**" or "**Source**". Counting only the first form reported zero
# sources for those cuts, which read as a real gap when it was a reader bug.
SOURCE_LABEL_RE = re.compile(
    r"^\*\*(?:inspired by|attribution|source|sources)\*\*:", re.MULTILINE | re.IGNORECASE
)
# Only count "inferred" when it is used as a provenance label. Several older leaves
# say things like "none is inferred", which is the opposite claim, so a bare word
# match produced false positives.
INFERRED_LABEL_RE = re.compile(
    r"\*\*inferred\*\*|provenance\s*[:=][^\n]*inferred|inferred (?:step|steps|number|numbers)\b",
    re.IGNORECASE,
)
SILENT_PATTERNS = (
    re.compile(r"internal temperature:\s*\**\s*(not published|not stated|none published)", re.I),
    re.compile(r"no source publishes an?\s+(internal\s+)?temperature", re.I),
    re.compile(r"no internal temperature in any source", re.I),
)

# Gap ids that assert something concrete: evidence exists, or two sources of truth
# disagree. Only these drive the ranking.
#
# Weights separate two classes of problem. "Functional" gaps affect what a user
# actually gets, because the hub frontmatter is the only thing the engine and the
# panel read (__init__.py builds its doneness map from the hub, and
# generate_frontend_data.py takes methods, doneness and recommended_doneness from
# the hub too). "Hygiene" gaps are real inconsistencies in cooking_data.py, but
# nothing reads those registry fields at runtime, so they are ranked low: sending
# passes to rewrite 130 registry entries would be mechanical work instead of data.
CONCRETE_WEIGHT = {
    "hub_recommended_not_in_hub_bands": 6,
    "hub_method_without_leaf": 4,
    "orphan_leaf": 3,
    "leaf_without_any_temperature": 3,
    "recorded_unsafe_source": 3,
    "inferred_mention_near_numbers": 2,
    "authored_ledger_stale": 2,
    "usda_mismatch": 2,
    "hub_registry_method_drift": 1,
    "hub_without_registry_entry": 1,
}

# Gap ids that are true but speculative: we do not know that anything exists to be
# found. They are listed, never ranked, so the queue cannot drift back into
# counting leaves.
SPECULATIVE_IDS = ("leaf_shortfall", "source_shortfall")


@dataclass
class Leaf:
    path: Path
    method: str
    sources: int = 0
    urls: list[str] = field(default_factory=list)
    declares_silence: bool = False
    silent_records: int = 0
    numeric_records: int = 0
    temperature_mentions: int = 0
    records_unsafe: bool = False
    inferred_mentions: int = 0


@dataclass
class Cut:
    slug: str
    name: str
    path: Path
    category: str
    hub_methods: list[str]
    hub_doneness: list[str]
    hub_recommended: str
    hub_usda_c: str
    legacy_score: str
    leaves: list[Leaf] = field(default_factory=list)
    registry_id: int | None = None
    registry_methods: list[str] = field(default_factory=list)
    registry_doneness: list[str] = field(default_factory=list)
    registry_recommended: str = ""
    registry_usda_c: str = ""
    concrete: dict[str, str] = field(default_factory=dict)
    speculative: dict[str, str] = field(default_factory=dict)
    authored_state: dict[str, str] = field(default_factory=dict)
    authored_gap_ids: list[str] = field(default_factory=list)
    authored_has_ledger: bool = False
    conflicts: list[str] = field(default_factory=list)

    @property
    def leaf_methods(self) -> list[str]:
        return sorted(leaf.method for leaf in self.leaves)

    @property
    def total_sources(self) -> int:
        return sum(leaf.sources for leaf in self.leaves)

    @property
    def silent_leaves(self) -> int:
        """Leaves whose source records carry no temperature at all."""
        return sum(
            1 for leaf in self.leaves if leaf.sources and leaf.numeric_records == 0
        )

    @property
    def silent_sources(self) -> int:
        """Individual source records that declare no published temperature."""
        return sum(leaf.silent_records for leaf in self.leaves)

    @property
    def potential(self) -> int:
        return sum(CONCRETE_WEIGHT.get(gap, 2) for gap in self.concrete)


def load_registry() -> dict[str, object]:
    """Load cooking_data.py without importing Home Assistant."""
    spec = importlib.util.spec_from_file_location(
        "kce_cooking_data", BASE_DIR / "cooking_data.py"
    )
    if spec is None or spec.loader is None:
        raise SystemExit("could not load cooking_data.py")
    module = importlib.util.module_from_spec(spec)
    sys.modules["kce_cooking_data"] = module
    spec.loader.exec_module(module)
    return module


def registry_cuts(module) -> dict[str, object]:
    """Every MeatCut in the registry, keyed by name."""
    found: dict[str, object] = {}
    for category in module.MEAT_CATEGORIES:
        for meat in category.meats:
            for cut_type in meat.cut_types:
                for cut in cut_type.cuts:
                    found[cut.name] = cut
    return found


def parse_frontmatter(text: str, pattern: re.Pattern[str]) -> dict[str, str] | None:
    match = pattern.search(text)
    return None if match is None else {"__raw__": match.group(1)}


def frontmatter_value(raw: str, key: str) -> str:
    match = re.search(rf"^{re.escape(key)}:[ \t]*(.*)$", raw, re.MULTILINE)
    return match.group(1).strip() if match else ""


def frontmatter_list(raw: str, key: str) -> list[str]:
    """Read a block-style YAML list such as ``methods:`` or ``doneness:``."""
    lines = raw.splitlines()
    collected: list[str] = []
    inside = False
    for line in lines:
        if re.match(rf"^{re.escape(key)}:\s*$", line):
            inside = True
            continue
        if not inside:
            continue
        item = re.match(r"^\s*-\s*(.+)$", line)
        if item:
            value = item.group(1).strip()
            if key == "doneness":
                name = re.match(r"name:\s*(.+)$", value)
                if name:
                    collected.append(name.group(1).strip())
            else:
                collected.append(value)
            continue
        if re.match(r"^[A-Za-z_][\w-]*\s*:", line):  # next top-level key
            break
    return collected


def read_leaf(path: Path, slug: str) -> Leaf:
    text = path.read_text(encoding="utf-8", errors="ignore")
    method = path.stem[len(slug) + 1 :] if path.stem.startswith(slug + "-") else path.stem
    leaf = Leaf(path=path, method=method)

    source_lines = [
        line
        for line in text.splitlines()
        if SOURCE_LABEL_RE.match(line.strip())
    ]
    leaf.sources = len(source_lines)
    for line in source_lines:
        leaf.urls.extend(re.findall(r"https?://[^\s)>\]`]+", line))

    leaf.declares_silence = any(pattern.search(text) for pattern in SILENT_PATTERNS)
    leaf.temperature_mentions = len(TEMP_CELSIUS_RE.findall(text))
    leaf.records_unsafe = bool(re.search(r"\bunsafe\b", text, re.IGNORECASE))
    leaf.inferred_mentions = len(INFERRED_LABEL_RE.findall(text))

    # Silence is a property of a single source record, not of the leaf: a leaf can
    # quote 160 °F for one recipe and report that another publishes nothing.
    for record in re.split(r"^###\s+", text, flags=re.MULTILINE)[1:]:
        if any(pattern.search(record) for pattern in SILENT_PATTERNS):
            leaf.silent_records += 1
        if TEMP_CELSIUS_RE.search(record):
            leaf.numeric_records += 1
    return leaf


def read_authored_ledger(text: str) -> tuple[bool, dict[str, str], list[str]]:
    """Return (has_ledger, snapshot_state, gap_ids) from the cut's ledger section."""
    heading = LEDGER_HEADING_RE.search(text)
    if heading is None:
        return False, {}, []

    section = text[heading.end():]
    next_heading = re.search(r"^##\s+", section, re.MULTILINE)
    if next_heading:
        section = section[: next_heading.start()]

    state: dict[str, str] = {}
    snapshot = LEDGER_STATE_RE.search(section)
    if snapshot:
        for part in snapshot.group(1).split():
            if "=" in part:
                key, value = part.split("=", 1)
                state[key.strip()] = value.strip()

    gap_ids: list[str] = []
    for line in section.splitlines():
        if not line.strip().startswith("|"):
            continue
        cells = [cell.strip() for cell in line.strip().strip("|").split("|")]
        if not cells:
            continue
        first = cells[0].strip("`").strip()
        if re.fullmatch(r"[a-z][a-z0-9_]{3,}", first) and first not in {"gap", "id"}:
            gap_ids.append(first)
    return True, state, gap_ids


def build_cuts() -> list[Cut]:
    module = load_registry()
    registry = registry_cuts(module)

    cuts: list[Cut] = []
    for path in sorted(RECIPES_DIR.rglob("*.md")):
        text = path.read_text(encoding="utf-8", errors="ignore")
        if METHOD_HEADER_RE.search(text) and not CUT_RE.search(text):
            continue
        owner = CUT_RE.search(text)
        if owner is None:
            continue
        raw = owner.group(1)
        slug = frontmatter_value(raw, "slug")
        if not slug:
            continue

        cut = Cut(
            slug=slug,
            name=frontmatter_value(raw, "name") or slug,
            path=path,
            category=frontmatter_value(raw, "category"),
            hub_methods=frontmatter_list(raw, "methods"),
            hub_doneness=frontmatter_list(raw, "doneness"),
            hub_recommended=frontmatter_value(raw, "recommended_doneness"),
            hub_usda_c=frontmatter_value(raw, "usda_safe_c"),
            legacy_score=frontmatter_value(raw, "quality_score"),
        )

        for leaf_path in sorted(RECIPES_DIR.rglob(f"{slug}-*.md")):
            leaf_text = leaf_path.read_text(encoding="utf-8", errors="ignore")
            if CUT_RE.search(leaf_text) and not METHOD_HEADER_RE.search(leaf_text):
                continue  # a different cut whose slug shares this prefix
            cut.leaves.append(read_leaf(leaf_path, slug))

        entity = registry.get(slug)
        if entity is not None:
            cut.registry_id = entity.id
            cut.registry_methods = sorted(method.value for method in entity.supported_methods)
            cut.registry_doneness = sorted(band.name for band in entity.temperature_ranges)
            cut.registry_recommended = getattr(entity, "recommended_doneness", "") or ""
            cut.registry_usda_c = str(getattr(entity, "usda_safe_c", ""))

        cut.authored_has_ledger, cut.authored_state, cut.authored_gap_ids = read_authored_ledger(text)
        cuts.append(cut)
    return cuts


def derive_gaps(cut: Cut) -> None:
    """Populate concrete and speculative gaps from derived facts.

    Functional gaps come first: the hub frontmatter is the single source of truth
    for the engine and the panel, so a hub that recommends a band it does not
    define, or declares a method with no leaf, is a defect a cook can hit. Registry
    drift is recorded too, but ranked low, because no runtime code reads those
    registry fields.
    """
    leaf_methods = set(cut.leaf_methods)
    hub_methods = set(cut.hub_methods)
    registry_methods = set(cut.registry_methods)

    # --- functional: read by __init__.py and generate_frontend_data.py ---------
    if cut.hub_doneness and cut.hub_recommended and cut.hub_recommended not in cut.hub_doneness:
        cut.concrete["hub_recommended_not_in_hub_bands"] = (
            f"hub recommends `{cut.hub_recommended}`, hub bands are "
            f"{', '.join(cut.hub_doneness) or 'none'}"
        )

    for method in sorted(hub_methods - leaf_methods):
        cut.concrete[f"hub_method_without_leaf:{method}"] = (
            f"hub declares `{method}` but no leaf file exists"
        )

    # Orphaned against the hub only: the hub is what links a leaf into the panel,
    # so a leaf the registry happens not to know about is registry drift (below),
    # not unreachable data.
    orphan = sorted(leaf_methods - hub_methods)
    if orphan:
        cut.concrete["orphan_leaf"] = (
            "leaf file(s) the hub does not declare, so the panel cannot link them: "
            + ", ".join(orphan)
        )

    # --- hygiene: registry fields with no runtime consumer ---------------------
    #
    # Deliberately not compared: registry `recommended_doneness` against registry
    # `temperature_ranges` names. A TemperatureRange name is a zone label
    # (`safe`, `dark_meat_optimal`), while `recommended_doneness` names a band in the
    # cut's own `doneness:` list. The two vocabularies never overlap, so every such
    # comparison fires on healthy cuts and teaches nothing.
    if cut.registry_id is None:
        cut.concrete["hub_without_registry_entry"] = (
            "hub file exists with no matching MeatCut in cooking_data.py"
        )

    if registry_methods and hub_methods and registry_methods != hub_methods:
        missing = sorted(registry_methods - hub_methods)
        extra = sorted(hub_methods - registry_methods)
        parts = []
        if missing:
            parts.append(f"registry-only: {', '.join(missing)}")
        if extra:
            parts.append(f"hub-only: {', '.join(extra)}")
        cut.concrete["hub_registry_method_drift"] = "; ".join(parts) + " (registry unused at runtime)"

    if cut.registry_usda_c and cut.hub_usda_c and cut.registry_usda_c != cut.hub_usda_c:
        cut.concrete["usda_mismatch"] = (
            f"hub {cut.hub_usda_c} °C vs registry {cut.registry_usda_c} °C"
        )

    no_temperature = [
        leaf.method
        for leaf in cut.leaves
        if leaf.sources and leaf.numeric_records == 0
    ]
    if no_temperature:
        cut.concrete["leaf_without_any_temperature"] = (
            "no °C value appears in any source record of: "
            + ", ".join(no_temperature)
            + (
                " (silence declared)"
                if all(
                    leaf.declares_silence
                    for leaf in cut.leaves
                    if leaf.method in no_temperature
                )
                else " (silence not declared - check whether it was searched for)"
            )
        )

    unsafe = [leaf.method for leaf in cut.leaves if leaf.records_unsafe]
    if unsafe:
        cut.concrete["recorded_unsafe_source"] = "records unsafe advice: " + ", ".join(unsafe)

    inferred_with_numbers = [
        leaf.method
        for leaf in cut.leaves
        if leaf.inferred_mentions and leaf.temperature_mentions
    ]
    if inferred_with_numbers:
        cut.concrete["inferred_mention_near_numbers"] = (
            "the word 'inferred' appears beside °C values in: "
            + ", ".join(inferred_with_numbers)
            + " - check whether those numbers were inferred rather than published"
        )

    if len(cut.leaves) < 4:
        cut.speculative["leaf_shortfall"] = f"{len(cut.leaves)} of 4 leaf slots filled"
    short = [leaf.method for leaf in cut.leaves if leaf.sources < 4]
    if short:
        cut.speculative["source_shortfall"] = "fewer than 4 readable sources: " + ", ".join(short)


def detect_conflicts(cut: Cut) -> None:
    """Compare what a pass claimed against what the files now say."""
    if not cut.authored_has_ledger:
        return

    state = cut.authored_state
    checks = {
        "leaves": len(cut.leaves),
        "sources": cut.total_sources,
        "silent": cut.silent_sources,
        "silent_leaves": cut.silent_leaves,
    }
    for key, derived in checks.items():
        claimed = state.get(key)
        if claimed is None:
            continue
        if claimed.isdigit() and int(claimed) != derived:
            cut.conflicts.append(f"ledger claims {key}={claimed}, files show {derived}")

    claimed_methods = state.get("methods")
    if claimed_methods:
        claimed_set = {item for item in claimed_methods.split(",") if item}
        actual = set(cut.leaf_methods)
        if claimed_set != actual:
            cut.conflicts.append(
                "ledger claims methods="
                + ",".join(sorted(claimed_set))
                + " but leaf files are "
                + (",".join(sorted(actual)) or "none")
            )

    if not state:
        cut.conflicts.append(
            "ledger section present but no `<!-- ledger-state: ... -->` snapshot to check against"
        )

    if cut.conflicts:
        cut.concrete["authored_ledger_stale"] = "; ".join(cut.conflicts)


def render(cuts: list[Cut], top: int) -> str:
    ranked = sorted(
        (cut for cut in cuts if cut.concrete),
        key=lambda cut: (-cut.potential, -len(cut.concrete), cut.slug),
    )
    quiet = sorted(cut.slug for cut in cuts if not cut.concrete)
    authored = [cut for cut in cuts if cut.authored_has_ledger]
    conflicting = [cut for cut in cuts if cut.conflicts]
    missing_registry = sorted(cut.slug for cut in cuts if cut.registry_id is None)

    lines: list[str] = []
    lines.append("# Cut potential queue")
    lines.append("")
    lines.append("<!-- GENERATED FILE - written by measure_cut_potential.py. Do not edit by hand. -->")
    lines.append("")
    lines.append(
        "This is the queue improvement passes work from. It replaces the legacy "
        "`quality_score` as the selection signal: that field is frozen, is not read here, "
        "and must not be used to choose work."
    )
    lines.append("")
    lines.append(
        "**Concrete gaps** assert something checkable: two sources of truth disagree, a "
        "declared method has no leaf, a leaf declares that no source publishes a "
        "temperature. They drive the ranking. **Speculative gaps** (leaf and source "
        "shortfalls) are listed but never ranked, because nothing yet shows that anything "
        "exists to be found."
    )
    lines.append("")
    lines.append("## Summary")
    lines.append("")
    lines.append("| Measure | Value |")
    lines.append("|---------|-------|")
    lines.append(f"| cuts with a hub file | {len(cuts)} |")
    lines.append(f"| cuts with at least one concrete gap | {len(ranked)} |")
    lines.append(f"| cuts with no concrete gap found | {len(quiet)} |")
    lines.append(f"| cuts carrying an authored ledger | {len(authored)} |")
    lines.append(f"| authored ledgers that conflict with the files | {len(conflicting)} |")
    lines.append(f"| hub slugs missing from the registry | {len(missing_registry)} |")
    lines.append("")
    if missing_registry:
        lines.append("Hub files with no registry entry: " + ", ".join(f"`{slug}`" for slug in missing_registry))
        lines.append("")

    lines.append(f"## Top {min(top, len(ranked))} by potential")
    lines.append("")
    lines.append("| # | Cut | Potential | Concrete gaps | Leaves | Sources | Silent sources |")
    lines.append("|---|-----|-----------|---------------|--------|---------|----------------|")
    for index, cut in enumerate(ranked[:top], start=1):
        gap_names = ", ".join(sorted(cut.concrete))
        lines.append(
            f"| {index} | `{cut.slug}` | {cut.potential} | {gap_names} | "
            f"{len(cut.leaves)} | {cut.total_sources} | {cut.silent_sources} |"
        )
    lines.append("")

    lines.append("## Conflicts between authored ledgers and the files")
    lines.append("")
    if conflicting:
        for cut in conflicting:
            for conflict in cut.conflicts:
                lines.append(f"- `{cut.slug}` — {conflict}")
    else:
        lines.append("No authored ledger contradicts its files yet.")
    lines.append("")

    lines.append("## Side by side — authored claim vs derived fact")
    lines.append("")
    lines.append(
        "`authored` is what a pass recorded in its `## Data state and gaps` section; `derived` "
        "is what the files say now. Empty authored cells have not been worked under the new "
        "instructions yet."
    )
    lines.append("")
    lines.append("| Cut | Tier | Authored snapshot | Derived facts | Concrete gaps |")
    lines.append("|-----|------|-------------------|---------------|---------------|")
    for cut in sorted(cuts, key=lambda item: (-item.potential, item.slug)):
        tier = "authored+derived" if cut.authored_has_ledger else "derived only"
        snapshot = (
            ", ".join(f"{key}={value}" for key, value in sorted(cut.authored_state.items()))
            if cut.authored_state
            else "—"
        )
        derived = (
            f"leaves={len(cut.leaves)}, sources={cut.total_sources}, "
            f"silent_sources={cut.silent_sources}, silent_leaves={cut.silent_leaves}, "
            f"methods={','.join(cut.leaf_methods) or 'none'}"
        )
        gaps = ", ".join(sorted(cut.concrete)) or "—"
        lines.append(f"| `{cut.slug}` | {tier} | {snapshot} | {derived} | {gaps} |")
    lines.append("")

    if quiet:
        lines.append("## No concrete gap found")
        lines.append("")
        lines.append(
            "Not a statement that these cuts are finished - only that no contradiction or "
            "declared hole is visible in the files. A pass that searches one of these and "
            "finds something should add the gap with its evidence."
        )
        lines.append("")
        lines.append(", ".join(f"`{slug}`" for slug in quiet))
        lines.append("")

    lines.append("## What this file cannot see")
    lines.append("")
    lines.append(
        "- Culinary-group coverage: traditions are recorded in prose, not in a machine-readable field."
    )
    lines.append(
        "- Whether a leaf's sources are human-written or machine-generated: that needs a reader."
    )
    lines.append(
        "- Searched-negatives and blocked system changes: only an authored ledger can hold those."
    )
    lines.append(
        "- Whether a cited URL still resolves (`--check-urls` is a future addition, not built)."
    )
    lines.append("")
    lines.append(f"_Cuts: {len(cuts)} · generated by `measure_cut_potential.py`_")
    lines.append("")
    return "\n".join(lines)


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--stdout", action="store_true", help="print instead of writing the queue file")
    parser.add_argument("--top", type=int, default=20, help="rows in the ranked section (default 20)")
    args = parser.parse_args()

    cuts = build_cuts()
    for cut in cuts:
        derive_gaps(cut)
        detect_conflicts(cut)

    # Re-derive so a stale-ledger gap contributes its weight to the ranking.
    for cut in cuts:
        cut.concrete.pop("authored_ledger_stale", None)
        if cut.conflicts:
            cut.concrete["authored_ledger_stale"] = "; ".join(cut.conflicts)

    document = render(cuts, args.top)

    if args.stdout:
        print(document)
        return 0

    QUEUE_PATH.write_text(document, encoding="utf-8")
    ranked = sum(1 for cut in cuts if cut.concrete)
    print(f"  Cuts measured: {len(cuts)}")
    print(f"  Cuts with concrete gaps: {ranked}")
    print(f"  Authored ledgers: {sum(1 for cut in cuts if cut.authored_has_ledger)}")
    print(f"  Conflicting ledgers: {sum(1 for cut in cuts if cut.conflicts)}")
    print(f"  Wrote {QUEUE_PATH.relative_to(BASE_DIR.parent.parent)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
