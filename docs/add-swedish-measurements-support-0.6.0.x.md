# Branch Timeline: add-swedish-measurements-support 0.6.0.x

**Branch:** `copilot/add-swedish-measurements-support`
**Version series:** `0.6.0.x`
**Date started:** 2026-03-16
**Purpose:** Phase 7 of the GUI Redesign — add Swedish measurement system support,
full i18n (`_t()`) coverage across all panel methods, and AI recipe generation that
respects the user's language/unit preferences. A second sub-branch
(`copilot/update-gui-redesign-tor`) was merged in on 2026-03-17 to extend the
Terms of Reference with Phase 8 scope (Ingredient Levels & Cooking Modes).

> **Agents: read this file before implementing anything on this branch.**
> It documents every root cause found, every solution tried, and what the
> current state is — so we don't repeat failed approaches or forget key
> discoveries.

---

## Context — what this branch builds on

| Item | State at branch start |
|------|-----------------------|
| Base branch | `main` at tag `v0.5.5.96-beta.main` |
| Starting version | `0.5.5.96` |
| Panel version | 209+ |
| Previous branch | `copilot/refactor-recipe-navigation-and-layout` (merged as PR #75) |

---

## Version history (this branch)

### v0.5.6.97 — Phase 7 initial implementation (2026-03-16)

**Goal:** Add measurement system selection (metric/imperial/Swedish) and hook up
`_t()` i18n to the panel template so all user-facing strings can be translated.

| Step | Commit summary |
|------|----------------|
| Plan | Initial plan |
| Code | Phase 7: Add `measurements.py`, i18n translation files (`en.json`, `sv.json`), API endpoints, and initial `_t()` integration in panel template |
| Code | Phase 7: Bump version to 0.5.6.97, regenerate panel with measurement systems and translations |
| **Tag `v0.5.6.97`** | Phase 7: Fix code review issues — `abbr_sv` naming, use translation keys, fix SE volume preference order |

**What was added:**
- `measurements.py` — unit catalog for metric, imperial, and Swedish measurements
- `translations/en.json` + `sv.json` — i18n string files
- API endpoint `/api/kitchen_cooking_engine/measurements` serving the unit catalog
- `_t(key)` helper in the panel template wired to the translations
- Measurement preference (metric/imperial/Swedish) persisted in integration config

**Root cause of code-review iteration:** The first cut used `abbr` for both
English and Swedish abbreviations. Code review required a separate `abbr_sv` key.
Also volume preferences were ordered in the wrong priority for Swedish.

---

### v0.5.6.97 → v0.5.6.99 — Full i18n string sweep (2026-03-16)

**Goal:** Replace every hardcoded English string in the panel template with `_t()`
calls so nothing outputs raw English when the user has selected Swedish.

| Step | Commit summary |
|------|----------------|
| Code | Phase 7: AI recipes respect language and measurement preferences — prompts instruct AI in correct language/units, frontend sends preferences, ingredient text conversion as safety net |
| Code | Phase 7: Address code review feedback — deduplicate cooking method translation lookup |
| Code | Add missing i18n translation keys to `en.json` for full coverage |
| Code | Update Swedish translation (`sv.json`) to match English file structure |
| Code | Replace hardcoded English strings with `_t()` translation calls in `_renderAIIngredientSelection()` |
| Code | Replace hardcoded English strings with `_t()` translation calls in AI recipe methods |
| Code | Replace hardcoded English strings with `_t()` translation calls in MEATER methods |
| Code | Replace hardcoded English strings with `_t()` translation calls in Ninja methods |
| Code | Replace hardcoded English strings with `_t()` translation calls in 10 remaining methods |
| **Tag `v0.5.6.99`** | Fix remaining hardcoded strings, regenerate frontend, bump version to 0.5.6.99 |

**Key changes:**
- AI recipe generation prompts now include a language directive (e.g. "Respond in
  Swedish") derived from the user's language preference, preventing Danish/English
  bleed-through.
- Frontend sends `language` and `measurement_system` in every AI recipe request.
- Ingredient text conversion (e.g. "1 cup" → "2.4 dl") applied as a safety net
  even when the AI produces the wrong units.

---

### v0.5.6.99 → v0.6.0.00 — Post-review fixes & version bump (2026-03-17)

**Goal:** Fix a batch of issues flagged in the previous code review and land a
clean 0.6.0.00 release.

| Step | Commit summary |
|------|----------------|
| Code | Add messages section to `en.json` and `sv.json` i18n files |
| Code | Replace hardcoded English strings with `this._t()` i18n calls in panel template (catch-all pass) |
| Code | Fix mixed languages: translate all messages/dialogs, fix AI language directive to prevent Danish output, add Swedish decimal comma, fix Unicode ingredient matching |
| Code | Fix code review feedback: translate hardcoded fallback text, fix battery emoji encoding |
| Code | Add per-step ingredient tagging to AI recipe JSON format |
| **Tag `v0.6.0.00`** | Bump version to 0.6.0.00, add regex flag consistency fix |

**Key fixes in this batch:**
- **Swedish decimal comma** — output numbers like `2,4 dl` when language is Swedish.
- **Unicode ingredient matching** — ingredient names with diacritics (ä, ö, å) were
  not matched against recipe text; fixed with NFC normalisation.
- **Battery emoji encoding** — `🔋` was double-encoded in some locales; fixed.
- **Regex flag consistency** — several regex calls mixed `re.IGNORECASE` and
  inline `(?i)` flags causing duplicated-flag warnings; unified to use the flag
  argument only.
- **Per-step ingredient tagging** — AI recipe JSON now carries a `ingredients`
  array per step so the UI can highlight active ingredients on each step page.

---

### v0.6.0.00 → v0.6.0.01 — Final release fixes (2026-03-17)

**Goal:** Address a final round of code review and ship `v0.6.0.01`.

| Step | Commit summary |
|------|----------------|
| Code | Fix misleading AI retry count: reduce `_MAX_RETRIES` from 7 to 3 |
| **Tag `v0.6.0.01`** | Fix: Version bump 0.6.0.01, ingredient colors, matching fallback, retry persistence, retry button |

**Key fixes:**
- **Ingredient colors** — active vs inactive ingredient colour logic was inverted
  in one render path; fixed.
- **Matching fallback** — if the per-step `ingredients` array is empty, fall back
  to keyword scanning of instruction text (regression from per-step tagging work).
- **Retry persistence** — retry state was reset on panel re-render; persisted to
  `sessionStorage`.
- **Retry button** — visible retry button added to the AI generation error screen.
- **`_MAX_RETRIES` 7 → 3** — seven retries caused a misleading "almost done"
  progress indicator; reduced to 3 which matches user expectations.

---

### Post-v0.6.0.01 — ToR update (PR #78, 2026-03-17)

Branch `copilot/update-gui-redesign-tor` was merged into this branch as PR #78.
No version bump (doc-only).

| Step | Commit summary |
|------|----------------|
| Plan | Initial plan |
| Docs | Add Ingredient Levels & Cooking Modes to ToR and development plan (Phase 8) |
| Docs | Add Open Question #6: Grocy vs self-implementation pros/cons analysis (UNDECIDED) |
| Docs | Fix Grocy analysis per owner feedback: correct install burden (low), terminology (app not add-on), clarify C≠B |
| Docs | Add external integrations research (Grocy, Cooklang, Mealie, KitchenOwl) |
| Docs | Update GUI_REDESIGN_TERMS_OF_REFERENCE.md to v3.6 — resolve Open Question #6 (Option C: self-implement) |
| Merge | Merge pull request #78 from R00S/copilot/update-gui-redesign-tor |

**Decision recorded:** Open Question #6 (Grocy vs self-implementation) resolved as
**Option C — self-implement**. Grocy offers overlap but not the deep HA sensor
integration needed. Self-implementation keeps data in HA and avoids an extra
install dependency.

---

## Known issues / root causes discovered

| # | Issue | Root cause | Fix applied |
|---|-------|-----------|-------------|
| 1 | Danish text in Swedish-language AI recipes | AI prompt lacked explicit language directive | Added `"Respond in Swedish"` to system prompt |
| 2 | `1 cup` showing in Swedish mode | AI did not receive measurement preference | Frontend now sends `measurement_system` in request body |
| 3 | Unicode ingredient names not highlighted | `str.find()` on NFC vs NFD strings | Normalise both sides with `unicodedata.normalize('NFC', ...)` |
| 4 | Ingredient highlight colours inverted | Copy-paste error in conditional class names | Fixed class assignment |
| 5 | Retry loop running 7 times | `_MAX_RETRIES = 7` set too high during debugging | Reduced to 3 |
| 6 | `abbr` used for both languages | First design oversight | Added `abbr_sv` key to all measurement entries |

---

## Current state

| Item | Status |
|------|--------|
| Swedish measurement system | ✅ Implemented (`measurements.py` + API) |
| Full `_t()` i18n coverage | ✅ All user-facing strings translated |
| AI recipes in correct language/units | ✅ Prompts + conversion safety net |
| Per-step ingredient tagging | ✅ AI JSON + frontend highlighting |
| GUI ToR updated to v3.6 | ✅ Phase 8 scope defined, Open Question #6 resolved |
| Branch ready to merge to parent | ✅ No open issues; doc-only child branch pending merge |

---

## Pending / future work

- [ ] Phase 8: Ingredient levels tracking (pantry state)
- [ ] Phase 8: Cooking modes (guided step-by-step vs timer-only vs auto)
- [ ] Evaluate self-implemented ingredient database (decided: Option C — build it)
