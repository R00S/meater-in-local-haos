# Ninja Combi Examples

This directory contains example scripts that demonstrate how to use the Ninja Combi recipe database.

## Scripts

### `ninja_combi_simple_demo.py`

A simple demonstration script that shows the recipe database without requiring any external dependencies.

**Usage:**
```bash
cd /path/to/meater-in-local-haos
python3 docs/examples/ninja_combi_simple_demo.py
```

**What it shows:**
- All 17 recipes with descriptions
- Signature combi mode recipes with multi-phase cooking
- Beginner-friendly recipes
- Recipes that use temperature probe
- Statistics about the recipe database
- All 12 cooking modes

### `ninja_combi_example.py`

A more comprehensive example that uses the helper module (requires Home Assistant dependencies).

**Usage:**
```bash
cd /path/to/meater-in-local-haos
# Install dependencies if needed
pip3 install voluptuous
python3 docs/examples/ninja_combi_example.py
```

**What it shows:**
- Recipe search and filtering
- Difficulty-based queries
- Cook time filtering
- Mode-based organization
- Complete recipe formatting

## Using the Recipe Database in Your Code

### Import the module

```python
# Direct import (no dependencies)
from custom_components.kitchen_cooking_engine.ninja_combi_data import (
    get_ninja_combi_recipes,
    get_ninja_combi_recipe_by_id,
    NinjaCombiMode,
)

# Using the helper module (cleaner API)
from custom_components.kitchen_cooking_engine import ninja_combi_helper as nch
```

### Get all recipes

```python
all_recipes = get_ninja_combi_recipes()
for recipe in all_recipes:
    print(f"{recipe.name}: {recipe.description}")
```

### Get recipes by mode

```python
# Get all Combi-Crisp recipes
from ninja_combi_data import NinjaCombiMode, get_ninja_combi_recipes

combi_crisp_recipes = get_ninja_combi_recipes(NinjaCombiMode.COMBI_CRISP)
```

### Search recipes

```python
# Using helper module
chicken_recipes = nch.search_recipes("chicken")
```

### Filter by difficulty

```python
easy_recipes = nch.get_beginner_friendly_recipes()
```

### Get recipes that use probe

```python
probe_recipes = nch.get_probe_recipes()
```

### Get recipe details

```python
recipe = nch.get_ninja_combi_recipe_by_id(1001)
if recipe:
    print(f"Name: {recipe.name}")
    print(f"Mode: {recipe.mode.value}")
    print(f"Cook time: {recipe.cook_time_minutes} minutes")
    print(f"Uses probe: {recipe.use_probe}")
    print(f"Target temp: {recipe.target_temp_c}°C")
    
    print("\nIngredients:")
    for ingredient in recipe.ingredients:
        print(f"  - {ingredient}")
    
    print("\nInstructions:")
    for i, instruction in enumerate(recipe.instructions, 1):
        print(f"  {i}. {instruction}")
```

### Working with phases (multi-phase cooking)

```python
recipe = nch.get_ninja_combi_recipe_by_id(1001)  # Combi-Crisp Chicken
for phase in recipe.phases:
    print(f"Phase: {phase.description}")
    print(f"  Mode: {phase.mode.value}")
    print(f"  Temp: {phase.temperature_c}°C")
    print(f"  Duration: {phase.duration_minutes} minutes")
    print(f"  Steam: {phase.steam_enabled}")
```

### Check mode requirements

```python
mode = NinjaCombiMode.STEAM
needs_water = nch.needs_water_tank(mode)
print(f"Water tank needed: {needs_water}")

mode_info = nch.get_ninja_combi_mode_info(mode)
print(f"Mode: {mode_info.name}")
print(f"Description: {mode_info.description}")
print(f"Temp range: {mode_info.typical_temp_range_c}°C")
```

## Recipe Data Structure

Each recipe includes:
- **id**: Unique identifier
- **name**: Recipe name
- **description**: Brief description
- **mode**: Cooking mode (NinjaCombiMode enum)
- **tray_position**: Where to place food (TrayPosition enum)
- **phases**: List of cooking phases (for multi-phase recipes)
- **use_probe**: Whether to use temperature probe
- **target_temp_c/f**: Target temperature if using probe
- **ingredients**: List of ingredients
- **instructions**: Step-by-step instructions
- **prep_time_minutes**: Preparation time
- **cook_time_minutes**: Cooking time
- **servings**: Number of servings
- **difficulty**: easy, medium, or hard
- **tips**: Helpful tips
- **notes**: Additional notes

## Helper Functions

The `ninja_combi_helper.py` module provides many useful functions:

- `search_recipes(query)` - Search by name, description, or ingredients
- `get_recipes_by_difficulty(difficulty)` - Filter by difficulty level
- `get_recipes_by_cook_time(max_minutes)` - Find quick recipes
- `get_probe_recipes()` - Get recipes that use temperature probe
- `get_quick_recipes(max_total_minutes)` - Fast prep + cook
- `get_beginner_friendly_recipes()` - Easy recipes only
- `get_recipe_summary(recipe)` - Get formatted summary
- `print_recipe(recipe)` - Format recipe for display
- `format_cook_time(minutes)` - Human-readable time format

## Integration with Home Assistant

These recipes are designed to work with the Kitchen Cooking Engine integration in Home Assistant. When using a MEATER probe (or compatible temperature sensor), you can:

1. Browse recipes in the Cooking panel
2. Start a cook with the selected recipe
3. Monitor temperature with the probe
4. Get notifications when target temperature is reached
5. Track cooking history

See the main [NINJA_COMBI_GUIDE.md](../NINJA_COMBI_GUIDE.md) for complete cooking instructions and tips.

## Contributing Recipes

To add new recipes:

1. Edit `custom_components/kitchen_cooking_engine/ninja_combi_data.py`
2. Add your recipe to the `NINJA_COMBI_RECIPES` list
3. Follow the existing recipe format
4. Test with the demo script
5. Submit a pull request

Recipe guidelines:
- Use clear, concise instructions
- Include exact temperatures and times
- Specify tray positions
- Add helpful tips
- Note if probe monitoring is recommended
- Test the recipe in an actual Ninja Combi oven
