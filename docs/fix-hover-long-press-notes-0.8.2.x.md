# Branch: fix-hover-long-press-notes (v0.8.2.x)

## Goal
Add hover/long-press tooltip for ingredients in the AI recipe builder ingredient selector.
When a user hovers (mouse) or long-presses (touch) on an ingredient chip, the `notes` field
from the cuisine `.md` file is shown as a tooltip bubble.

## Discoveries
- `generate_frontend_data.py` parses `notes:` from cuisine `.md` files but does NOT include
  it in the generated `AI_CUISINE_INGREDIENTS` entries — the `notes` field is silently dropped.
- `_renderIngredientCheckbox` renders a plain `<label class="ingredient-checkbox">` with no
  tooltip support.
- The ingredient grid uses CSS `display: grid`; each cell is filled by the `<label>` element.
- Touch long-press tooltip requires a reactive LitElement property (`_ingredientTooltipId`)
  and a `touchstart`/`touchend` timer-based handler.

## Plan
1. [x] Create this timeline file
2. [x] Fix generator: include `notes` in ingredient entries
3. [x] Fix JS template: add tooltip wrapper, CSS, touch handlers
4. [x] Run generator to regenerate kitchen-cooking-panel.js
5. [x] Update version numbers (0.8.2.20 → 0.8.2.21)

## Session Log
### 2026-05-05 (session 1)
- Agent started: exploring codebase, created timeline.
- Fixed `generate_frontend_data.py`: notes field was parsed but silently dropped; now included.
- Added `_ingredientTooltipId` reactive property + `_ingTouchStart`/`_ingTouchEnd` touch handlers.
- Modified `_renderIngredientCheckbox`: wraps in `.ing-tip-wrap` with `.ing-tip-text` when notes present.
- CSS: hover shows tooltip via `:hover` selector; touch via `.tip-active` class (set after 600ms longpress).
- Generator: 13247 ingredients, 13280 notes entries in generated JS. PANEL_VERSION bumped.
- Version bumped to 0.8.2.21.

### 2026-05-05 (session 2) — Cuisine conformance audit
- Audited the last 8 cuisine files updated (hawaiian, haitian, greek, german, georgian, french, finnish) against IMPROVE_CUISINE_DATA.md.
- **hawaiian.md**: fixed Trap 11 (description-as-name_sv), Trap 12b (region-prefix names like "Hawaiian sea salt"), Trap 2 (bundle entries), cross-grade duplicates across proteins/grains/dairy/spices.
- **haitian.md**: fixed Trap 12b (region-prefix names), cross-grade duplication in grains (millet sig+local, pigeon peas local+bulk).
- **greek.md**: fixed Trap 11 (name_sv "calamari"/"wild greens" were description-style), Trap 2 (ladolemono was a dressing bundle).
- **german.md**: fixed Trap 11/12a throughout, Trap 2 (wild game, rabbit/hare, cod/pollock, sour cream as bundles).
- **georgian.md**: fixed Trap 11 on 25+ items, Trap 12a on 5 Grains-Local items, cross-grade dupes (Zanduri wheat, guda, walnut oil, imeretian saffron, blue fenugreek). Replaced dupes with verified distinct items.
- **french.md**: fixed Trap 11 on 7 items, Trap 12a on 5 Local items, Trap 2 (Brie/Camembert combined entry). Replaced oats with barley in Grains-Local.
- **finnish.md**: fixed Trap 11 on 3 items (Cep, sliced cheese, nettle).
- **IMPROVE_CUISINE_DATA.md**: added Trap 14 (cross-grade duplication — same ingredient ID appears in multiple grades), Trap 15 (disguised cross-grade duplication — same concept with different IDs), root-cause analysis of common agent failures and a pre-commit conformance checklist.
- Version bumped to 0.8.2.22, PANEL_VERSION 511 → 512.
- User guide updated: version header + tooltip feature documented in section 7.2.
