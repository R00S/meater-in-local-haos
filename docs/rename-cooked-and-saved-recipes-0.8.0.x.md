# Branch Timeline: rename-cooked-and-saved-recipes (v0.8.0.x)

## Goal

1. **Save recipe without cooking** — After AI recipe generation, add a "Save for later" button that stores the recipe in cook history with `comment = "Saved, not yet cooked"`.
2. **Rename "Previous Cooks"** — Rename to "Cooked and Saved recipes" everywhere (badge, screen title, navigation, i18n strings, documentation, user guide). Add two toggle buttons to hide saved-only or cooked-only entries.
3. **AI shortcut from MEATER cut selection** — When an end leaf (cut or cut-method) is selected in the MEATER path and AI is configured, show a weight input box and a button to jump to the AI suggestion stage (4 suggested recipes) pre-seeded with that cut and weight.

## Session Log

### 2026-04-29 — v0.8.0.0 — Initial version bump

- Bumped version to 0.8.0.0 in all 4 required locations.
- Timeline file created.

## Status

- [ ] Feature 1: Save recipe without cooking (AI path)
- [ ] Feature 2: Rename Previous Cooks → Cooked and Saved + toggle filters
- [ ] Feature 3: AI shortcut from MEATER cut selection (weight + jump to suggestions)
- [ ] Documentation / user guide updates
- [ ] Version bump & release
