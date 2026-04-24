# Branch Timeline: continue-061-x-experimental-recipes — v0.6.1.x

Branch: `copilot/continue-061-x-experimental-recipes`
Version series: `0.6.1.x`
Continued from: `copilot/implement-phase-8` (same version series)
Started: 2026-04-24

---

## Goal

Complete all remaining recipe leaf stubs under `docs/recipe_research/`. The previous
branch (`implement-phase-8`) accumulated a large backlog of unfilled or partially-filled
leaves. This branch finishes them.

---

## Remaining work at branch start

### Poultry — missing 3rd source (13 files)

- `poultry/chicken/chicken_breast-pan_sear.md`
- `poultry/chicken/chicken_burger-air_fryer.md`
- `poultry/chicken/chicken_thigh-grill.md`
- `poultry/chicken/chicken_thigh-oven_roast.md`
- `poultry/chicken/chicken_wing-air_fryer.md`
- `poultry/chicken/ground_chicken-braise.md`
- `poultry/chicken/ground_chicken-pan_fry.md`
- `poultry/duck/duck_breast-oven_roast.md`
- `poultry/goose/goose_breast-oven_roast.md`
- `poultry/goose/goose_breast-pan_sear.md`
- `poultry/goose/goose_leg-braise.md`
- `poultry/goose/goose_leg-oven_roast.md`
- `poultry/goose/goose_thigh-braise.md`

### Vegetables — empty stubs (79 files)

All files under `docs/recipe_research/vegetables/` except the 5 already completed:
- `alliums/` (9 files)
- `corn/` (4 files remaining)
- `cruciferous/` (7 files)
- `eggplant/` (4 files)
- `green_vegetables/` (15 files)
- `mushrooms/` (7 files)
- `peppers/` (4 files)
- `root_vegetables/` (13 files)
- `squash/` (9 files)
- `tomatoes/` (2 files)

---

## Progress

### 2026-04-24 — Branch timeline file created

---


### 2026-04-24 — All vegetable recipe stubs completed (v0.6.1.14)

All 79 vegetable stub files have been filled with full recipe research content.
Each file contains 4 source recipes from globally diverse published cookbooks
(non-Western sources prioritised), with cut profiles, pull temperatures,
MEATER probe placement instructions, and a tree-position table.

**Completed by category:**

| Category | Files filled |
|----------|-------------|
| alliums/ | 9 (caramelized_onions ×2, leeks ×3, roasted_garlic ×1, roasted_onion ×3) |
| corn/ | 4 (air_fryer, boil, grill, oven_roast; steam was pre-filled) |
| cruciferous/ | 7 (cabbage braise/grill/saute; cauliflower air_fryer/oven_roast/steam/whole_roast) |
| eggplant/ | 4 (air_fryer, grill, oven_roast, saute; pan_fry was pre-filled) |
| green_vegetables/ | 18 (asparagus ×4, broccoli ×4, brussels_sprouts ×4, green_beans ×4, spinach ×2) |
| mushrooms/ | 8 (button ×4, portobello ×4; grill pre-filled) |
| peppers/ | 4 (bell_peppers: air_fryer, grill, oven_roast, saute) |
| root_vegetables/ | 13 (baked_potato ×2, roasted_beets ×1, roasted_carrots ×3, roasted_parsnips ×2, roasted_potatoes ×2, roasted_sweet_potato ×3) |
| squash/ | 11 (acorn_squash ×2, butternut_squash ×3, spaghetti_squash ×2, zucchini ×4) |
| tomatoes/ | 2 (roasted_tomatoes: air_fryer, oven_roast) |

**Version bumped:** 0.6.1.13 → 0.6.1.14

---

## 2026-04-25 — 12 missing meat recipe research files created

All 12 previously missing recipe research files were created, completing the pork/roasts,
lamb/roasts, poultry/chicken, poultry/turkey, and game/mutton collections.

**Files created:**

| File | Sources | Traditions covered |
|------|---------|-------------------|
| pork/roasts/pork_leg-braise.md | 4 | German, Chinese, Italian, Danish |
| pork/roasts/pork_leg-slow_cooker.md | 4 | German, Chinese, Danish, Italian |
| pork/roasts/pork_leg-oven_roast.md | 4 | German, Italian, Austrian, Danish |
| lamb/roasts/lamb_shank-slow_cooker.md | 5 | Turkish, German, Greek, Italian, Danish |
| lamb/roasts/lamb_shank-oven_roast.md | 4 | Turkish, Greek, Italian, Danish |
| lamb/roasts/lamb_neck-braise.md | 4 | Turkish, Italian, German, Danish |
| lamb/roasts/lamb_neck-slow_cooker.md | 4 | Turkish, German, Italian, Greek |
| lamb/roasts/lamb_neck-oven_roast.md | 4 | Turkish, Greek, Italian, German |
| poultry/chicken/ground_chicken-grill.md | 4 | Turkish, Israeli/Levantine, Jamaican, South African |
| poultry/turkey/ground_turkey-grill.md | 4 | Turkish, Israeli/Levantine, German, South African |
| game/mutton/mutton_shoulder-braise.md | 4 | Indian, Turkish, Italian, German |
| game/mutton/mutton_shoulder-slow_cooker.md | 4 | Indian, Turkish, German, Greek |

**Sources fetched and used:**
- nefisyemektarifleri.com — Turkish lamb shank, neck, shoulder, chicken köfte, turkey köfte
- chefkoch.de — German pork hock (braise, crockpot, oven), lamb neck, lamb shanks slow cooker, turkey burger
- thewoksoflife.com — Chinese red-braised Ti Pang (pork shank)
- giallozafferano.it — Italian stinco (pork shank oven/braise), agnello al forno, spalla d'agnello
- blog.giallozafferano.it — Italian collo di agnello stufato nel coccio (clay-pot lamb neck)
- madensverden.dk — Danish pork hank, lamb shank red wine, svineskank ovnbagt
- valdemarsro.dk — Danish braised pork neck
- ichkoche.at — Austrian crispy roasted Schweinsstelze
- argiro.gr — Greek lamb shank gastra, Greek lamb tray-bake
- toriavey.com — Israeli/Levantine Mediterranean turkey/chicken burgers (165°F explicit)
- africanbites.com — Jamaican chicken patties
- taste.co.za — South African chicken patties with preserved lemon
- indianhealthyrecipes.com — Indian Mutton Korma

**Temperature benchmarks established:**
- Pork hock (braise/slow cooker): 75–80 °C sliceable; 85–90 °C pull-apart
- Pork hock (oven roast): 75–85 °C (Giallo Zafferano explicitly stated)
- Lamb/mutton shank and neck: 85–90 °C fall-off-the-bone
- Mutton shoulder: 88–95 °C (older animal, denser tissue)
- Ground poultry (grill): 74 °C / 165 °F USDA minimum (Tori Avey explicitly stated)

