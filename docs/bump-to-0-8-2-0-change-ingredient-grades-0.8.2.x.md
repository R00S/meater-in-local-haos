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
