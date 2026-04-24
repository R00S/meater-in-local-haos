# Chores — branch `copilot/implement-phase-8` (v0.6.1.x)

Last updated: 2026-04-24

---

## ✅ Done this branch

- [x] Phase 8a–8d implementation (ingredient levels, shelf management, cooking modes, post-cook update)
- [x] Version bumped to 0.6.1.x in all 4 required locations (manifest.json, __init__.py ×2, const.py)
- [x] Branch timeline file created: `docs/implement-phase-8-0.6.1.x.md`
- [x] `SOURCE_SURVEY.md` corrected:
  - `ichkoche.at` URL format fixed (`/{slug}-rezept-{ID}`, not `/rezept-{slug}-{ID}`)
  - `madensverden.dk` confirmed no `www.` prefix
  - `bbcgoodfood.com` IA retrieval method documented (raw=True, `__POST_CONTENT__` JSON)
- [x] 3rd source added (real BBC Good Food via Internet Archive) to:
  - `chicken_breast-grill.md` — Cajun chicken (IA 20241010111210)
  - `chicken_burger-grill.md` — Cajun chicken burgers (IA 20240916023446)
  - `chicken_burger-pan_fry.md` — same Cajun chicken burgers (pan-fry variant)
  - `chicken_breast-air_fryer.md`
  - `chicken_thigh-air_fryer.md`
  - `chicken_leg-oven_roast.md`
  - `whole_chicken-oven_roast.md`
  - `whole_duck-oven_roast.md`
  - `duck_breast-pan_sear.md` — One-Pan Duck with Savoy Cabbage (IA 20241110020656)

---

## ❌ Still outstanding (recipe research)

### Poultry — 3rd source still needed (IA slug not found last session)
- [ ] `chicken_breast-pan_sear.md`
- [ ] `chicken_burger-air_fryer.md`
- [ ] `chicken_thigh-grill.md`
- [ ] `chicken_thigh-oven_roast.md`
- [ ] `chicken_wing-air_fryer.md`
- [ ] `ground_chicken-braise.md`
- [ ] `ground_chicken-pan_fry.md`
- [ ] `duck_breast-oven_roast.md` (need duck BREAST oven recipe, not whole duck)
- [ ] All 7 goose files (goose_breast-oven_roast, goose_breast-pan_sear, goose_leg-braise, goose_leg-oven_roast, goose_thigh-braise, goose_thigh-oven_roast, whole_goose-oven_roast)
- [ ] All 7 turkey files (ground_turkey-braise, ground_turkey-pan_fry, turkey_breast-oven_roast, turkey_burger-air_fryer, turkey_burger-grill, turkey_burger-pan_fry, whole_turkey-oven_roast)

### Vegetables — all 79 files need to be recreated from scratch with real IA sources
All 79 vegetable stub files are marked `⚠️ STATUS: NEEDS TO BE RECREATED FROM SCRATCH`.
Priority source order per recipe_log.txt:
1. madensverden.dk, matprat.no, valdemarsro.dk
2. ichkoche.at, chefkoch.de
3. giallozafferano.it, marmiton.org, directoalpaladar.com
4. bbcgoodfood.com, recipetineats.com (fallback)

Correct IA workflow (confirmed working):
1. Start at `https://web.archive.org/web/*/https://www.bbcgoodfood.com/` to see available snapshots
2. Navigate to a recent snapshot (e.g. 20241010111210)
3. Browse or search for recipe slugs within that snapshot
4. Fetch recipe page with `web_fetch(url=IA_URL, raw=True)` — recipe JSON is in `__POST_CONTENT__`
5. Same pattern applies to other sites: check base URL in IA first to confirm snapshot exists

---

## ⚠️ Integrity reminder

**NEVER fabricate recipe sources, ingredient quantities, or chef names.**  
Always navigate real IA snapshots step by step. Document every slug and timestamp used.
