"""Structured catalog localization tests."""

from __future__ import annotations

import importlib.util
import json
import re
import sys
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
COMPONENT_DIR = ROOT / "custom_components" / "kitchen_cooking_engine"
RECIPE_DIR = COMPONENT_DIR / "www" / "recipes"
I18N_DIR = COMPONENT_DIR / "i18n"
GENERATED_PANEL = COMPONENT_DIR / "www" / "kitchen-cooking-panel.js"
PANEL_TEMPLATE = COMPONENT_DIR / "www" / "panel-class-template.js"
METHOD_STYLE_MAP_RE = re.compile(
    r"const MEATER_METHOD_TO_AI_STYLE = \{(.*?)\n\};",
    re.DOTALL,
)
METHOD_STYLE_ENTRY_RE = re.compile(r"([a-z_]+):\s*'([a-z_]+)'")


def load_module(name: str, path: Path):
    """Load a repository module without importing Home Assistant."""
    spec = importlib.util.spec_from_file_location(name, path)
    assert spec and spec.loader
    module = importlib.util.module_from_spec(spec)
    sys.modules[name] = module
    spec.loader.exec_module(module)
    return module


def parse_generated_constant(source: str, name: str):
    """Parse a JSON-compatible constant from the checked-in panel."""
    declaration = re.search(
        rf"^const {re.escape(name)} = ",
        source,
        re.MULTILINE,
    )
    if declaration is None:
        raise AssertionError(f"Generated panel is missing {name}")
    value, end = json.JSONDecoder().raw_decode(source[declaration.end():])
    if not source[declaration.end() + end:].startswith(";\n"):
        raise AssertionError(f"Generated panel has a malformed {name} declaration")
    return value


class CatalogLocalizationTests(unittest.TestCase):
    """Ensure Danish labels cover every live structured catalog item."""

    @classmethod
    def setUpClass(cls) -> None:
        cls.generator = load_module(
            "kce_catalog_generator",
            COMPONENT_DIR / "generate_frontend_data.py",
        )
        cls.ai_data = load_module(
            "kce_catalog_ai_data",
            COMPONENT_DIR / "ai_recipe_data.py",
        )
        cls.overviews = []
        for path in sorted(RECIPE_DIR.rglob("*.md")):
            content = path.read_text(encoding="utf-8")
            data = cls.generator._parse_kce_tag(content, "CUT")
            if data is not None:
                cls.overviews.append((path, data))

        cls.tree, cls.doneness = cls.generator.build_experimental_tree(
            str(COMPONENT_DIR)
        )
        (
            cls.protein_subcats,
            cls.protein_labels,
            cls.protein_labels_sv,
            cls.protein_labels_da,
        ) = cls.generator.build_ai_protein_subcategories(cls.tree)
        cls.generated_panel = GENERATED_PANEL.read_text(encoding="utf-8")

    def test_canonical_cut_names_have_danish_parity(self) -> None:
        # 187 after ground_moose (Minced Moose) was added on 2026-10-26.
        self.assertEqual(len(self.overviews), 187)
        missing = [
            str(path.relative_to(ROOT))
            for path, data in self.overviews
            if not isinstance(data.get("name_da"), str) or not data["name_da"].strip()
        ]
        self.assertEqual(missing, [])

    def test_generated_temperature_tree_has_complete_danish_labels(self) -> None:
        categories = list(self.tree.values())
        meats = [meat for category in categories for meat in category["meats"]]
        cut_types = [cut_type for meat in meats for cut_type in meat["cutTypes"]]
        cuts = [cut for cut_type in cut_types for cut in cut_type["cuts"]]

        self.assertEqual(len(categories), 7)
        self.assertEqual(len(meats), 35)
        self.assertEqual(len(cut_types), 48)
        self.assertEqual(len({cut_type["name"] for cut_type in cut_types}), 42)
        # 187 after ground_moose (Minced Moose) was added on 2026-10-26.
        self.assertEqual(len(cuts), 187)

        for collection in (categories, meats, cut_types, cuts):
            self.assertTrue(all(item.get("name_da") for item in collection))

        duplicate_labels = {}
        for cut_type in cut_types:
            labels = [cut["name_da"] for cut in cut_type["cuts"]]
            duplicates = sorted({label for label in labels if labels.count(label) > 1})
            if duplicates:
                duplicate_labels[cut_type["id"]] = duplicates
        self.assertEqual(duplicate_labels, {})

        self.assertEqual(
            {meat["id"] for meat in meats},
            set(self.generator._MEAT_NAME_DA),
        )
        self.assertEqual(
            {cut_type["name"] for cut_type in cut_types},
            set(self.generator._CUT_TYPE_NAME_DA),
        )

    def test_doneness_has_complete_danish_labels(self) -> None:
        self.assertEqual(set(self.doneness), set(self.generator._DONENESS_NAME_DA))
        self.assertTrue(all(option.get("name_da") for option in self.doneness.values()))

    def test_ai_catalog_has_complete_danish_labels(self) -> None:
        self.assertEqual(len(self.ai_data.COOKING_STYLES), 14)
        self.assertTrue(all(style.get("name_da") for style in self.ai_data.COOKING_STYLES))
        self.assertEqual(
            set(self.ai_data.CATEGORY_LABELS_DA),
            set(self.ai_data.CATEGORY_LABELS),
        )

        protein_cuts = [cut for cuts in self.protein_subcats.values() for cut in cuts]
        # 160 after ground_moose (Minced Moose) was added on 2026-10-26.
        self.assertEqual(len(protein_cuts), 160)
        self.assertTrue(all(cut.get("name_da") for cut in protein_cuts))
        self.assertEqual(set(self.protein_labels_da), set(self.protein_subcats))
        self.assertTrue(all(self.protein_labels_da.values()))

    def test_checked_in_panel_matches_catalog_sources(self) -> None:
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "EXP_TREE"),
            self.tree,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "EXP_DONENESS_OPTIONS"),
            self.doneness,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_COOKING_STYLES"),
            self.ai_data.COOKING_STYLES,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_CATEGORY_LABELS_DA"),
            self.ai_data.CATEGORY_LABELS_DA,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_PROTEIN_SUBCATS"),
            self.protein_subcats,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_PROTEIN_SUBCAT_LABELS_DA"),
            self.protein_labels_da,
        )

        generated_translations = parse_generated_constant(
            self.generated_panel,
            "I18N_STRINGS",
        )
        source_translations = {
            path.stem: json.loads(path.read_text(encoding="utf-8"))
            for path in sorted(I18N_DIR.glob("*.json"))
        }
        self.assertEqual(generated_translations, source_translations)
        self.assertRegex(
            self.generated_panel,
            re.compile(
                r"^\s*} else if \(this\._language === 'da' && "
                r"typeof AI_CATEGORY_LABELS_DA !== 'undefined'\) {$",
                re.MULTILINE,
            ),
        )
        self.assertRegex(
            self.generated_panel,
            re.compile(
                r"^\s*} else if \(this\._language === 'da' && "
                r"typeof AI_PROTEIN_SUBCAT_LABELS_DA !== 'undefined'\) {$",
                re.MULTILINE,
            ),
        )

    def test_meater_method_style_map_covers_live_methods(self) -> None:
        """Every live method must map to an AI cooking style that actually exists."""
        source = PANEL_TEMPLATE.read_text(encoding="utf-8")
        match = METHOD_STYLE_MAP_RE.search(source)
        self.assertIsNotNone(match, "panel template is missing MEATER_METHOD_TO_AI_STYLE")
        mapping = dict(METHOD_STYLE_ENTRY_RE.findall(match.group(1)))
        style_ids = {style["id"] for style in self.ai_data.COOKING_STYLES}

        methods = {
            method
            for _path, data in self.overviews
            for method in data.get("methods", [])
        }
        self.assertEqual(sorted(methods - set(mapping)), [])
        self.assertEqual(sorted(set(mapping) - methods), [])
        self.assertEqual(sorted(set(mapping.values()) - style_ids), [])

    def test_recommended_doneness_carries_the_recommended_flag(self) -> None:
        """The flagged band is the cut's own recommended level; other flags are safety markers."""
        unflagged = []
        extra = []
        for path, data in self.overviews:
            recommended = data.get("recommended_doneness")
            if not recommended:
                continue
            flagged = [
                band
                for band in data.get("doneness") or []
                if band.get("recommended")
            ]
            if recommended not in [band.get("name") for band in flagged]:
                unflagged.append(f"{path.name}: {recommended}")
            extra.extend(
                f"{path.name}: {band.get('name')}"
                for band in flagged
                if band.get("name") != recommended and not band.get("usda_safe")
            )
        self.assertEqual(unflagged, [])
        self.assertEqual(extra, [])

    def test_all_live_cooking_methods_are_translated(self) -> None:
        methods = {
            method
            for _path, data in self.overviews
            for method in data.get("methods", [])
        }
        # 17 methods were live when this guard was written. The 0.10.2.x research pass
        # registered `poach` and `simmer` on real cuts (hake, mackerel and others), and
        # both were added to all three i18n files with this bump — keep this in step with
        # the cut files rather than letting an untranslated method reach the panel.
        self.assertEqual(len(methods), 19)
        for path in sorted(I18N_DIR.glob("*.json")):
            translations = json.loads(path.read_text(encoding="utf-8"))
            with self.subTest(language=path.stem):
                self.assertEqual(methods - set(translations["cooking_methods"]), set())


if __name__ == "__main__":
    unittest.main()
