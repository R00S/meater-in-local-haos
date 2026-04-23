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

### Post-v0.6.0.01 — A/B/C comparison rebuilt (2026-04-23)

Follow-up doc work (no code, no version bump) merging info from PR #81
(`copilot/implement-branch-history-system`) and the now-present
`EXTERNAL_INTEGRATIONS_RESEARCH.md` into the ToR comparison.

| Step | Commit summary |
|------|----------------|
| Docs | ToR v3.7: rebuild A/B/C comparison with merged research data |

**What changed (ToR v3.7):**
- Added HA ecosystem context table with real install counts from
  `analytics.home-assistant.io`: HA Shopping List ~350,000 users, Grocy
  ~2,000–4,000, Mealie ~2,000, KitchenOwl growing.
- Widened Option B to cover Mealie and KitchenOwl as named alternatives (not
  just Grocy); added **fragmentation** as a con — three incompatible APIs.
- Added Tier 1/2/3 bridge architecture table to Option C (Tier 1 = HA
  `todo.add_item`, 350k users, trivial; Tier 2 = Grocy + Mealie read bridges,
  optional; Tier 3 = KitchenOwl watch).
- Updated Decision Factors matrix with research-backed data.
- **Decision is unchanged — Option C confirmed by project owner on 2026-03-17.**

### v0.6.0.03 — Fix Swedish ingredient translation (Chiliflingor) (2026-04-23)

| Step | Commit summary |
|------|----------------|
| Fix  | `ai_recipe_data.py`: correct `red_pepper_flakes` → `"Chiliflingor"` (was `"Röda pepparflingor"`) + add 7 missing Swedish ingredient entries (`horseradish`, `balsamic`, `beans`, `ciabatta`, `flat_bread`, `flour_tortillas`, `taco_shells`) |
| Gen  | Regenerate `kitchen-cooking-panel.js` (PANEL_VERSION 253→254) |
| Ver  | Bump to v0.6.0.03 |

**Root cause:** `red_pepper_flakes` was translated literally as "red pepper flakes" — but
in Swedish cooking the ingredient is always called *Chiliflingor* (chili flakes). Seven
other ingredient IDs were entirely absent from `INGREDIENT_NAMES_SV`, causing raw English
keys to appear in the Swedish UI.

---

### v0.6.0.04 — Add hide-other-language-tree checkbox in Temperaturdata (2026-04-23)

| Step | Commit summary |
|------|----------------|
| i18n | `i18n/en.json` + `sv.json`: add `meater.hide_other_tree` key |
| Code | `panel-class-template.js`: new `_hideOtherDataSource` reactive property (Boolean) |
| Code | `panel-class-template.js`: `_loadHideOtherDataSourcePreference()` reads from `localStorage` (`kce_hide_other_data_source`); `_toggleHideOtherDataSource()` writes it |
| Code | `panel-class-template.js`: Data Source Selector card renders each button conditionally — when checkbox is checked, only the active source button is shown; checkbox appears below description text |
| Code | `connectedCallback`: call `_loadHideOtherDataSourcePreference()` on startup |
| Gen  | Regenerate `kitchen-cooking-panel.js` (PANEL_VERSION 254→255) |
| Ver  | Bump to v0.6.0.04 |

**Behaviour:** Unchecked (default) — both Internationell and Svenska buttons visible,
no change from before. Checked — only the currently selected source button renders,
hiding the other to reduce clutter for users committed to one temperature tree.
Preference is persisted to `localStorage` and survives page reloads.

---



| Step | Commit summary |
|------|----------------|
| Plan | Identify four classes of untranslated English text visible in Swedish mode |
| Fix  | `ai_recipe_data.py`: add `name_sv` to all `COOKING_STYLES`, `ASSUMED_STAPLES_SV`, `CATEGORY_LABELS_SV`, `INGREDIENT_NAMES_SV` (id→Swedish for every ingredient) |
| Fix  | `generate_frontend_data.py`: inject `AI_ASSUMED_STAPLES_SV`, `AI_CATEGORY_LABELS_SV`, `AI_INGREDIENT_NAMES_SV` |
| Fix  | `panel-class-template.js`: new `_ingDisplayName()` helper; `_renderIngredientCheckbox`, `_renderCategorizedIngredients`, staples line, cooking-style card all use Swedish strings when `_language === 'sv'` |
| Gen  | Regenerate `kitchen-cooking-panel.js` (PANEL_VERSION 251→252) |
| Ver  | Bump to v0.6.0.02 |

**Root cause:** `_renderIngredientCheckbox` rendered `ingredient.name` (always English) directly without any language lookup. `AI_ASSUMED_STAPLES`, `AI_CATEGORY_LABELS`, and `COOKING_STYLES.name` had no Swedish equivalents.

**Design:** English `ingredient.name` is still used as the value stored in `_selectedIngredients` and sent to the AI prompt (so the AI receives stable English terms). The new `_ingDisplayName()` helper is display-only.

---



| # | Issue | Root cause | Fix applied |
|---|-------|-----------|-------------|
| 1 | Danish text in Swedish-language AI recipes | AI prompt lacked explicit language directive | Added `"Respond in Swedish"` to system prompt |
| 2 | `1 cup` showing in Swedish mode | AI did not receive measurement preference | Frontend now sends `measurement_system` in request body |
| 3 | Unicode ingredient names not highlighted | `str.find()` on NFC vs NFD strings | Normalise both sides with `unicodedata.normalize('NFC', ...)` |
| 4 | Ingredient highlight colours inverted | Copy-paste error in conditional class names | Fixed class assignment |
| 5 | Retry loop running 7 times | `_MAX_RETRIES = 7` set too high during debugging | Reduced to 3 |
| 7 | Ingredient names / staples / categories / cooking styles shown in English in Swedish mode | No Swedish equivalents existed; `ingredient.name` used directly for display | Added `INGREDIENT_NAMES_SV`, `ASSUMED_STAPLES_SV`, `CATEGORY_LABELS_SV`, `name_sv` on cooking styles; `_ingDisplayName()` helper in template |

---

## Current state

| Item | Status |
|------|--------|
| Swedish measurement system | ✅ Implemented (`measurements.py` + API) |
| Full `_t()` i18n coverage | ✅ All user-facing strings translated |
| AI recipe wizard: ingredient names | ✅ Swedish via `INGREDIENT_NAMES_SV` + `_ingDisplayName()` (v0.6.0.02) |
| AI recipe wizard: staples, categories, cooking styles | ✅ Swedish via `ASSUMED_STAPLES_SV`, `CATEGORY_LABELS_SV`, `name_sv` (v0.6.0.02) |
| AI recipes in correct language/units | ✅ Prompts + conversion safety net |
| Per-step ingredient tagging | ✅ AI JSON + frontend highlighting |
| Chiliflingor / Swedish ingredient names | ✅ Corrected + 7 missing entries added (v0.6.0.03) |
| Hide-other-language-tree checkbox | ✅ Temperaturdata card, localStorage-persisted (v0.6.0.04) |
| GUI ToR updated to v3.7 | ✅ Phase 8 scope defined, Open Question #6 resolved, A/B/C rebuilt with research data |
| Branch ready to merge to parent | ✅ No open issues; doc-only child branch pending merge |

---

## Pending / future work

- [ ] Phase 8: Ingredient levels tracking (pantry state)
- [ ] Phase 8: Cooking modes (guided step-by-step vs timer-only vs auto)
- [ ] Evaluate self-implemented ingredient database (decided: Option C — build it)
