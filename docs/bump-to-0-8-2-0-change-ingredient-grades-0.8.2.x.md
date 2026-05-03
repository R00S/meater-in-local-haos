# Branch timeline: bump-to-0-8-2-0-change-ingredient-grades (0.8.2.x)

## Session log

### 2026-05-03 — Agent session

**Tasks completed:**
- Bumped ingredient grade vocabulary to signature/bulk/local (removed very_common/common).
- Updated IMPROVE_CUISINE_DATA.md: grade table, examples, protein tree section.
- Trimmed redundant GUI prose from protein tree section → renamed to "Protein tree — authoring consequences".
- Wrote researched cuisine files for Danish and Icelandic (replacing stubs).
- Fixed missing `<ha-card><div class="card-content">` wrapper around the cuisine region selector block — the entire region/cuisine selector was invisible. All stubs and their regions now render correctly.
- Confirmed cuisine registry is fully dynamic: adding/removing/editing a `www/cuisines/*.md` file and re-running the generator is sufficient; no other file needs editing.
- Bumped version 0.8.2.4 → 0.8.2.5; PANEL_VERSION 426 → 427.

**Known issues / open work:**
- Norwegian, Finnish cuisine files are still stubs.
