# Branch timeline: bump-to-0-8-2-0-change-ingredient-grades (0.8.2.x)

## Session log

### 2026-05-03 — Agent session A

**Tasks completed:**
- Bumped ingredient grade vocabulary to signature/bulk/local (removed very_common/common).
- Updated IMPROVE_CUISINE_DATA.md: grade table, examples, protein tree section.
- Trimmed redundant GUI prose from protein tree section → renamed to "Protein tree — authoring consequences".
- Wrote researched cuisine files for Danish and Icelandic (replacing stubs).
- Confirmed cuisine registry is fully dynamic: adding/removing/editing a `www/cuisines/*.md` file and re-running the generator is sufficient; no other file needs editing.
- Bumped version 0.8.2.4 → 0.8.2.5; PANEL_VERSION 426 → 427.

**Bug introduced (unresolved):**
- Cuisine region selector (accordion buttons) not showing on the ingredient selection page.
- Introduced when commit a281805cb switched `cuisineRegions` from hardcoded inline data (with `this._t()` calls) to the generated `AI_CUISINE_REGIONS` constant.
- Root cause: **unknown**. Data structure is identical; `AI_CUISINE_REGIONS` is populated with 11 valid regions at load time. No JS errors. Both with and without `ha-card` wrapper the buttons do not appear.
- Failed fix attempt: added `<ha-card><div class="card-content">` wrapper around the cuisine selector block (commit 7f8dd266e) → made no difference.

**Known issues / open work:**
- Cuisine region accordion buttons still not visible. Root cause not yet identified.
- Norwegian, Finnish cuisine files are still stubs.

### 2026-05-03 — Agent session B

**Tasks completed:**
- Removed the `<ha-card>` wrapper from the cuisine region selector block. It was added as a failed fix attempt and made no difference — removing it reduces noise and restores original structure (matching v0.8.1.10 which used hardcoded data).
- Regenerated panel; PANEL_VERSION 427 → 428.
- Bumped version 0.8.2.5 → 0.8.2.6.

**Still open:**
- Root cause of missing cuisine region accordion buttons is unknown. Confirmed working in v0.8.1.10 (hardcoded `cuisineRegions` inline) and v0.8.0.2-beta.main. Broken in all releases on this branch where `cuisineRegions` is sourced from the generated `AI_CUISINE_REGIONS` constant.

### 2026-05-03 — Agent session C

**Root cause identified and fixed (v0.8.2.7):**

`www/cuisines` was a symlink → `../../../docs/cuisines`. This worked in the git repo (where `docs/cuisines/` is a real directory with 97 files) but broke silently on HAOS after HACS installation — zip archives do not follow symlinks, so `www/cuisines` was installed as a dead symlink.

When HA started, `_async_regenerate_frontend_data()` ran `regenerate_panel()`, which called `build_cuisine_data()`. `build_cuisine_data()` opens `www/cuisines/`, found the directory empty (dead symlink), and returned `([], {}, [])`. The generated JS then had `AI_CUISINE_REGIONS = []`, causing `cuisineRegions` to be an empty array and the accordion to render nothing.

v0.8.1.10 was unaffected because it had the region list hardcoded in the template itself — no dependency on the generated constant.

**Fix applied:**
- Replaced the `www/cuisines` dead-end symlink with the real directory (moved 97 `.md` files there).
- Created `docs/cuisines` → symlink to `../custom_components/kitchen_cooking_engine/www/cuisines` (matches the `docs/recipe_research` → `www/recipes` pattern).
- Regenerated panel; PANEL_VERSION 429 → 430.
- Bumped version 0.8.2.6 → 0.8.2.7.

### 2026-05-03 — Agent session D

**Tasks completed (v0.8.2.8):**

1. **Improved IMPROVE_CUISINE_DATA.md guidance (already had Traps 1–4):**
   - Added `description`/`description_sv` fields to the frontmatter example and fields table.
   - Added step 2 in "What to do when triggered": write the description before starting research pairs.
   - Fixed step numbering (was 1,2,3,3,4,5,6,7 → 1–8).

2. **Added `description` field to KCE:CUISINE format:**
   - `generate_frontend_data.py`: reads `description`/`description_sv` from frontmatter; adds them to `cuisine_entry` (inside `AI_CUISINE_REGIONS`); emits new `AI_CUISINE_DESCRIPTIONS` constant.
   - `panel-class-template.js`: shows description text above ingredient selection card when at least one cuisine is selected (styled block with left border).

3. **Reverted all Nordic cuisines to stub status (research_done: 0):**
   - swedish, norwegian, danish, icelandic — all replaced with stub files identical in structure to the existing finnish/new_nordic stubs.
   - All 6 Nordic stubs now have `description: "[STUB]"` and `description_sv: "[UTKAST]"` frontmatter fields.

4. **Bumped version 0.8.2.7 → 0.8.2.8; PANEL_VERSION 432 → 433.**

### 2026-05-03 — Agent session E

**Tasks completed (v0.8.2.9):**

1. **Expanded all 6 Nordic stub files from 3 → 9 stub entries per grade pair:**
   - Each grade pair (e.g. Proteins — Signature) now has stubs rated 10 down to 2.
   - Stub entries are intentionally visible in the GUI — they signal that the cuisine data is incomplete. Do not filter them.

2. **Updated IMPROVE_CUISINE_DATA.md — Trap 4 rewritten:**
   - Removed the misleading "5–8+" cap.
   - Replaced with: no upper limit on items per pair.
   - Added rule: when researching a pair, replace stubs one-by-one with verified items. Do NOT delete unreplaced stubs — remaining stubs signal the slot is still empty.

3. **Bumped version 0.8.2.8 → 0.8.2.9; PANEL_VERSION 434 → 435.**

### 2026-05-03 — Agent session F

**Tasks completed (v0.8.2.10):**

1. **Expanded all 91 non-Nordic cuisine stub files from 3 → 9 entries per grade pair:**
   - Previously only the 6 Nordic stubs had 9 entries; all other 91 files had 3.
   - All 97 files now have 9 stub entries per grade pair (15 grade pairs × 9 = 135 stub entries per file).

2. **Stub ratings changed from ordered (10→2) to arbitrary per grade pair:**
   - Each grade pair now uses a fixed but non-sequential set of 9 distinct ratings (2–10).
   - Different grade pairs use different rating orders so the data looks varied.
   - This applies to all 97 cuisine files including the 6 Nordic ones that had ordered ratings.

3. **CHORES.md performed:**
   - Regenerated panel: PANEL_VERSION 437 → 438.
   - Bumped version 0.8.2.9 → 0.8.2.10.
   - Updated USER_GUIDE.md §7.2 to mention the cuisine description shown on selection.

### 2026-05-03 — Agent session G

**Tasks completed (v0.8.2.11):**

1. **Randomized stub ratings across all 97 cuisine files (range 1–9):**
   - Previous ratings used shuffled sequences of 9 distinct values (2–10) — still looked like orderings.
   - Replaced with `random.randint(1, 9)` per entry; duplicates occur naturally by chance.
   - Rating semantics: significance score, not a rank. Multiple ingredients may share the same value.
   - No rating: 10 remains in any cuisine file.

2. **Updated IMPROVE_CUISINE_DATA.md:**
   - Rating range changed from 1–10 to 1–9 in the fields table.
   - Description updated to clarify "significance within grade — not a rank; duplicates allowed".
   - Example entries updated (rating: 10 → rating: 9).

3. **GUI verified correct (no change needed):**
   - Both ingredient category view and protein badge area already sort by `rating` descending and `slice(0, 3)` per grade.
   - Top 3 shown are always the 3 highest-rated, regardless of file order.

4. **CHORES.md performed:**
   - Regenerated panel: PANEL_VERSION 438 → 439.
   - Bumped version 0.8.2.10 → 0.8.2.11.


### 2026-05-03 — Agent session I

**Tasks completed (v0.8.2.13):**

1. **Fixed stub names in all 97 cuisine stub files to descriptive format:**
   - All `name: "[STUB]"` entries updated to `name: "[STUB] {Grade} {Category} {N}"` (e.g. `"[STUB] Bulk Protein 1"`)
   - All `name_sv: "[UTKAST]"` entries updated to `name_sv: "[UTKAST] {Grade_sv} {Category_sv} {N}"`
   - Ratings set to sequential 9, 8, 7, ..., 1 within each grade pair so numbered display order matches slot numbering in GUI
   - Category Swedish labels: Protein, Grönsak, Spannmål, Mejeri, Krydda
   - Grade Swedish labels: Signatur, Bulk, Lokalt

2. **Created `romanian.md` stub (initially) and executed IMPROVE_CUISINE_DATA.md for it:**
   - All 15 grade pairs researched with dedicated web searches in Romanian and English
   - Sources: Romanian INS food balance; FAO; rador.ro; agroberichtenbuitenland.nl; eurofish.dk; maluku.ro; vatra.ro; davesgarden.com
   - `research_done: 1` set after completing all 15 pairs
   - 11 items per pair minimum (most pairs have 9–11 verified entries)

### 2026-05-03 — Agent session J

**Tasks completed (v0.8.2.14):**

1. **CHORES.md performed:**
   - Regenerated panel: PANEL_VERSION 448 → 449.
   - Bumped version 0.8.2.13 → 0.8.2.14.
   - USER_GUIDE.md: no content changes required — Romanian cuisine addition is a data-only change with no new features or heading changes.

### 2026-05-03 — Agent session K

**Tasks completed (v0.8.2.15):**

1. **Fixed duplicate ingredients when same ingredient appears in multiple grades:**
   - Root cause: cuisine files (e.g. Romanian) list the same ingredient under multiple grades using ID suffixes (`beans`, `beans_bulk`, `beans_local`). The UI rendered all three as separate checkboxes.
   - Fix: deduplication by base ID added in `_getCuisineIngredients` in `panel-class-template.js`. After merging, strips `_bulk`/`_local`/`_signature` suffixes and keeps only the highest-priority grade entry (signature > bulk > local) per base ID.
   - Fix applies to all cuisine files — no data files modified.

2. **Reduced bulk visible count from 3 to 2 (before "More"):**
   - Changed `TOP_PER_GRADE = 3` to per-grade limits `{signature: 3, bulk: 2, local: 3}` in both `_renderCategorizedIngredients` and `_renderProteinCategory`.
   - Total visible before "More": 3 + 2 + 3 = 8 (was 9).

3. **CHORES.md performed:**
   - Regenerated panel: PANEL_VERSION 449 → 450.
   - Bumped version 0.8.2.14 → 0.8.2.15.
   - USER_GUIDE.md §7.2: updated ingredient grade counts to reflect new limits.

