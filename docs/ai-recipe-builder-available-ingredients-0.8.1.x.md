# Branch Timeline: ai-recipe-builder-available-ingredients (v0.8.1.x)

## Goal

Improve the AI Recipe Builder ingredient selector:

- **A**: Expand the selectable ingredient pool (partly based on recipe files)
- **B**: When a cuisine is selected, ingredient set also partly based on recipe files
- **C**: Same base size as now but each category has a "More" button to reveal extended set
- **D**: Second-level drill-down for proteins (meat/fish → subcategories of cuts)
- **E**: If shelf is activated, shelf items pop up in ingredient picker

## Implementation Plan

1. `ai_recipe_data.py` — expand COMMON_INGREDIENTS with `common: True/False` flags, add spices section
2. `generate_frontend_data.py` — extract protein subcats from `exp_tree` → `AI_PROTEIN_SUBCATS` JS constant
3. `panel-class-template.js` — "More" button per category, protein subcategory drill-down, shelf integration
4. Regenerate frontend
5. Bump version 0.8.1.0 → 0.8.1.1

## Sessions

### Session 1 (2026-04-30)

Starting implementation.

## Discoveries

- COMMON_INGREDIENTS currently: 9 proteins + 12 vegetables + 5 grains + 5 dairy = 31 items (no spices)
- CUISINE_INGREDIENTS: 41 cuisines/regions × ~28 items each
- INGREDIENT_CATEGORIES maps ~200+ IDs to categories (p/v/g/d/s)
- `exp_tree` built from KCE:CUT recipe files: 164 cut files across beef/pork/poultry/fish/lamb/game/vegetables
- Shelf items: `{ id, name, location (fridge|larder|freezer|spices), quantity }`
- Recipe method files have ingredients in prose (not structured) — only KCE:CUT overview files have structured frontmatter
- The `common: True` field exists on COMMON_INGREDIENTS items but is NOT currently used in UI rendering
