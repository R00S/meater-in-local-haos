# Branch Timeline: update-select-cut-menu (v0.6.5.x)

## Purpose

This branch continues the work from v0.6.4.x (Select Cut button-grid fix) with agent 5
taking over at v0.6.5.0. The primary new work in this version series is:

- Correct wrong `name_sv` values in KCE:CUT files (Buffelbiff, Buffelburgare, Spagettipumpa)
- Wire Swedish body-text translation for the **Styckesprofil** card and the
  **Tillagningsmetod** method description area.

---

## v0.6.5.1 — 2026-04-28

### CHORES

- Bumped version 0.6.5.0 → 0.6.5.1.
- Updated `USER_GUIDE.md` §5.9:
  - Language support table: replaced stale `description_sv:` YAML-field row with two
    correct rows for `## Styckesprofil` body sections (one for cut overview, one for
    method files).
  - Constants list: added `CUT_PROFILES_SV` / `CLASSIC_CUT_PROFILES_SV` and
    `CUT_METHOD_PROFILES` / `CLASSIC_CUT_METHOD_PROFILES` to the generator output
    description.
  - Added note that `## Styckesprofil` is the Swedish sibling of `## Cut profile`.
- No help-button anchor changes needed (all `_openHelp(...)` calls verified against
  current USER_GUIDE headings — all match).

### Files changed

- `manifest.json` — version 0.6.5.0 → 0.6.5.1
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION incremented)
- `docs/USER_GUIDE.md` — §5.9 language table + constants list + Styckesprofil note
- `docs/update-select-cut-menu-0.6.5.x.md` — this file (created)

---

## v0.6.5.0 — 2026-04-28

### Bug fix: Styckesprofil and Tillagningsmetod descriptions not translated

**Problem**: The body text in the "Styckesprofil" card and the method description in
"Tillagningsmetod" were always shown in English regardless of UI language setting.
Two root causes:
1. `CUT_PROFILES` had no Swedish equivalent — only `## Cut profile` was extracted.
2. The `description_sv:` YAML field (a single line) was structurally wrong for the
   multi-paragraph description body shown in "Tillagningsmetod".

**Fix**:
- `## Styckesprofil` is now the Swedish body-section counterpart to `## Cut profile`.
- Generator (`generate_frontend_data.py`) extracts `## Styckesprofil` and produces:
  - `CUT_PROFILES_SV` — Swedish cut overview descriptions.
  - `CLASSIC_CUT_PROFILES_SV` — Swedish classic-fork cut overview descriptions.
  - `CUT_METHOD_PROFILES[slug][method + "_sv"]` — Swedish method descriptions.
- For method files, `## Styckesprofil` is preferred over the old single-line
  `description_sv:` YAML field (retained as fallback for backwards compatibility).
- Added `_getCutProfilesSv()` getter in JS.
- `_renderCutProfileCard()`: `profileEn` / `profileSv` split; Swedish shown when
  `_language === 'sv'` and a Swedish section exists; falls back to English.
- `## Styckesprofil` sections added to `beef_shank.md`, `beef_shank-braise.md`,
  and `beef_shank-slow_cooker.md` (first three fully-translated cut files).

### Bug fix: Wrong Swedish name_sv values

- `Bufflabiff` → `Buffelbiff` (American bison, not buffalo cow)
- `Bufflaburgare` → `Buffelburgare`
- `Spagettikürbis` (German!) → `Spagettipumpa` (Swedish)

### CHORES (v0.6.5.0)

- Bumped version 0.6.4.9 → 0.6.5.0 (agent handoff increment: 4 → 5).
- Updated `USER_GUIDE.md`:
  - §5.8 Differences table: added **Language support** and **Measurement system** rows.
  - §5.8 Safety note: updated hardcoded `54°C (130°F)` example to unit-aware prose.
  - §5.9: Added "Measurement system in recipes" callout box; added "Language support"
    subsection with Swedish-name table.
  - §5.10 KCE:CUT example: added `name_sv:` at cut level and per doneness entry;
    added `## Styckesprofil` as second body section for Swedish cut description.
  - §5.10 KCE:CUT fields table: documented `name_sv` as optional field.
  - §5.10 doneness entry docs: noted `name_sv:` option with reference table.
  - §5.10 KCE:CUT_METHOD example: replaced `description_sv:` YAML field with
    `## Styckesprofil` body section.
  - §12 Measurement settings: expanded paragraph.
- No help-button anchor changes needed.

### Files changed (v0.6.5.0)

- `generate_frontend_data.py` — `_profile_sv_re`, `cut_profiles_sv`, new return value,
  `CUT_PROFILES_SV` / `CLASSIC_CUT_PROFILES_SV` output
- `www/panel-class-template.js` — `_getCutProfilesSv()`, `profileEn`/`profileSv` split
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION 339 → 340)
- `docs/recipe_research/beef/braising/beef_shank.md` — `## Styckesprofil` added
- `docs/recipe_research/beef/braising/beef_shank-braise.md` — `## Styckesprofil` added
- `docs/recipe_research/beef/braising/beef_shank-slow_cooker.md` — `## Styckesprofil` added
- `manifest.json` — version 0.6.4.9 → 0.6.5.0
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change
- `docs/USER_GUIDE.md` — §5.8, §5.9, §5.10, §12 updated
- `docs/update-select-cut-menu-0.6.4.x.md` — v0.6.5.0 entry added there

---

## v0.6.5.2 — 2026-04-28

### i18n: Apply ## Styckesprofil translations to all cut markdown files

**Problem**: 537 markdown files had `## Cut profile` (English) but only 3 had `## Styckesprofil` (Swedish). The `CUT_PROFILES_SV` constant in the generated JS had only 3 entries — the beef shank files from v0.6.5.0.

**Fix**: Applied all 480 SV translations from `docs/styckesprofil-translations/step1_extracted_profiles.md` to their corresponding markdown files, adding `## Styckesprofil` sections after `## Cut profile` in each file.

**Result**:
- 534 files received `## Styckesprofil` (3 already had it from v0.6.5.0)
- `CUT_PROFILES_SV` now has **163 entries** (one per unique cut slug in the international tree)
- Generator produces correct Swedish profiles for all 163 cuts
- `PANEL_VERSION` incremented to 343

### Files changed

- `docs/recipe_research/**/*.md` — 534 files received `## Styckesprofil` section
- `manifest.json` — version 0.6.5.1 → 0.6.5.2
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION 342 → 343)
- `docs/update-select-cut-menu-0.6.5.x.md` — this entry

---

## v0.6.5.3 — 2026-04-28

### CHORES only

- Bumped version 0.6.5.2 → 0.6.5.3.
- No USER_GUIDE changes needed: no user-facing features changed.
- No `_openHelp(...)` anchor changes needed: all anchors verified against current
  USER_GUIDE headings — all match.

### Context: Grok comparison artefact

`step1_extracted_profiles_swedish.json` was committed to the branch root by the repo
owner for comparison purposes ("For comparison only"). It contains Grok's attempt at
Swedish `## Styckesprofil` translations, structured as a JSON map of entry number →
`{profile, files[]}`.

A side-by-side evaluation was performed:
- Grok's profiles are **longer and more detailed** (anatomy breakdowns, sub-muscle
  names, probe placement), and the Swedish prose reads naturally.
- Grok has a factual naming error: "Nötbog" for beef shank (bog = shoulder/chuck,
  not shank — correct is "Oxlägg").
- Copilot (this branch) uses correct Swedish anatomical names but has one significant
  error: "Entrecôtebiff" for the sirloin steak (entrecôte = ribeye in Swedish; sirloin
  should be "ryggbiff").
- Neither set is error-free; Grok profiles are richer in detail overall.

The JSON file is a dev artefact only — no markdown or code was modified by this commit.

### Files changed

- `manifest.json` — version 0.6.5.2 → 0.6.5.3
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION 343 → 344)
- `docs/update-select-cut-menu-0.6.5.x.md` — this entry

---

## v0.6.5.4 — Grok translation merge (2026-04-28)

### Task

Merge Grok's Swedish `## Styckesprofil` translations into the repo where they
improve quality over existing Copilot translations.

### Process

1. Loaded `step1_extracted_profiles_swedish.json` (480 entries: 213 Swedish, 267 English).
2. Filtered out:
   - 267 English-language entries (unusable as Swedish translations).
   - Entries with obvious content mismatches (T-bone text in vegetable/turkey/goose files;
     beef burger text in fish files; filet mignon text in halibut/mahi-mahi files, etc.) —
     Grok's JSON had systematic file-to-profile misassignments in ~100+ entries.
   - Entries using "bog" incorrectly for rump/hindquarter cuts (rump.md, rump_roast.md,
     rump-pan_sear.md, picanha.md). "Bog" in Swedish means shoulder, not rump.
   - Entries where current (Copilot) translation was equal or longer.
3. 30 valid replacements identified — all beef cuts (steaks and roasts), where Grok's
   Swedish profile was at least 50% longer and correctly described the right cut.

### Corrections applied

- `beef/steaks/sirloin_steak.md`: replaced incorrect "Entrecôtebiff" with Grok's
  correct "Sirloin-biffen" (entrecôte = ribeye in Swedish; sirloin ≠ entrecôte).

### Files changed

- `manifest.json` — version 0.6.5.3 → 0.6.5.4
- `__init__.py` — version bump + Last Change
- `const.py` — Last Change
- `www/kitchen-cooking-panel.js` — auto-generated (PANEL_VERSION 344 → 345)
- 30 markdown files in `docs/recipe_research/beef/` — `## Styckesprofil` sections updated
- `docs/update-select-cut-menu-0.6.5.x.md` — this entry
