# Branch Timeline: remove-classic-meater-path — v0.7.0.x

## Goal
Remove the classic MEATER path (`_currentPath = 'meater'`) and make the experimental path (`meater_experimental`) the only path.

## Scope of Changes

### panel-class-template.js
- [ ] `_routeToAppliancePath`: route MEATER to experimental (not classic)
- [ ] Welcome screen: remove extra experimental card; single card goes to experimental
- [ ] `_getDataCategories()`: always return EXP_TREE (remove classic branch)
- [ ] `_getDonenessOptions()`: always return EXP_DONENESS_OPTIONS (remove classic branch)
- [ ] `_getRecipeIndex/CutProfiles/CutProfilesSv/CutMethodProfiles/RecipeTitles`: remove ternary, always return live set
- [ ] Remove `_navigateToMeaterPath()` function
- [ ] Remove `_renderMeaterPath()` function
- [ ] Switch-case: remove `case 'meater':`
- [ ] `_renderRecentMeaterCooks`: back button → `meater_experimental`
- [ ] Legacy fallback (line ~6747): `'meater'` → `'meater_experimental'`
- [ ] `_renderMeaterExperimental()`: remove "experimental" badge from heading

### generate_frontend_data.py
- [ ] Remove classic recipe index building block (lines 892-906)
- [ ] Remove CLASSIC_* constant generation (lines 1014-1027)

### Cleanup
- [ ] Delete `docs/recipe_research_classic/`
- [ ] Delete `www/recipes_classic/`
- [ ] Run `python3 generate_frontend_data.py`

## Session Log
### 2026-04-28
- Created timeline file
