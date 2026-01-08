# Ninja Combi Integration - Quick Reference

This is a quick reference for the Ninja Combi SFP700EU integration in the Kitchen Cooking Engine.

## 📖 Documentation

| Document | Description |
|----------|-------------|
| [NINJA_COMBI_GUIDE.md](NINJA_COMBI_GUIDE.md) | **Complete cooking guide** - All 12 modes, tray positions, tips, troubleshooting |
| [examples/README.md](examples/README.md) | How to use the recipe database in code |
| [examples/ninja_combi_simple_demo.py](examples/ninja_combi_simple_demo.py) | Working demo script |

## 🥷 Quick Start

### 1. Standard Modes (Use Existing Recipes)
These work exactly like standalone appliances - use any standard recipe:
- **Convection Oven** - Regular oven cooking
- **Air Fryer** - Crispy without oil
- **Steam** - Healthy steaming
- **Prove** - Bread rising

### 2. Modified Modes (Adapt Recipes)
These need recipe modifications for the Ninja Combi:
- **Sear/Sauté** - High-heat oven searing
- **Grill** - Top-down grilling
- **Rice/Pasta** - Sealed pot cooking
- **Slow Cook** - Low-temp braising

### 3. Combi Modes (Signature Features)
These combine steam with other methods - truly unique:
- **Combi-Crisp** - Steam → Air Fry (moist inside, crispy outside)
- **Combi-Bake** - Steam + Bake (bakery-quality bread)
- **Combi-Roast** - Steam + Roast (juicy roasts)
- **Combi-Meal** - Multi-tray complete meals

## 🌡️ MEATER Integration

**9 of 17 recipes** include temperature probe support:
- Target temperatures specified
- Monitor cooking progress in Home Assistant
- Get notifications when done
- Perfect doneness every time

## 📊 Recipe Database Stats

- **17 recipes** covering all 12 modes
- **11 easy**, **6 medium** difficulty
- **9 recipes** use temperature probe
- **7 recipes** use steam (combi modes)
- Cook times: 8 min to 6 hours
- All include ingredients, instructions, and tips

## 🚀 Example Usage

```python
from custom_components.kitchen_cooking_engine import ninja_combi_helper as nch

# Search recipes
chicken_recipes = nch.search_recipes("chicken")

# Get easy recipes
easy = nch.get_beginner_friendly_recipes()

# Get a specific recipe
recipe = nch.get_ninja_combi_recipe_by_id(1001)
print(nch.print_recipe(recipe))
```

## 📝 Featured Recipes

### Combi-Crisp Chicken Thighs
Steam 12 min → Air Fry 10 min = Juicy with crispy skin

### Combi-Bake Artisan Bread
Steam + Bake 15 min → Bake 20 min = Professional crust

### Combi-Roast Whole Chicken
Steam + Roast 50 min → Roast 10 min = Moist, evenly cooked

### Combi-Meal: Salmon Complete Meal
Steam 20 min → Air Fry 8 min = Protein + sides ready together

## 🎯 Key Principles

1. **Standard modes** = Use any recipe from books/websites
2. **Modified modes** = Follow Ninja Combi recipes
3. **Combi modes** = The secret sauce - steam + something else
4. **Tray positions matter** - Upper/Middle/Lower for different results
5. **Water tank** = Fill when 💧 symbol shows

## 🔍 Finding Information

**Want to know...** | **See...**
--------------------|------------
How a mode works | NINJA_COMBI_GUIDE.md → Mode sections
Recipe for specific food | Search in ninja_combi_data.py (17 recipes)
How to use probe | Any recipe with `use_probe: True`
Tray positioning | NINJA_COMBI_GUIDE.md → Tray Positions
Converting recipes | NINJA_COMBI_GUIDE.md → Recipe Conversion Tips
What mode to use | NINJA_COMBI_GUIDE.md → Mode descriptions
Troubleshooting | NINJA_COMBI_GUIDE.md → Troubleshooting section

## 🛠️ Code Structure

```
custom_components/kitchen_cooking_engine/
├── ninja_combi_data.py       # Recipe database
├── ninja_combi_helper.py     # Helper functions
└── (integration with main cooking engine)

docs/
├── NINJA_COMBI_GUIDE.md      # Complete guide
├── examples/
│   ├── README.md             # Code examples
│   └── ninja_combi_simple_demo.py  # Working demo
```

## ⭐ What Makes Ninja Combi Special

The **combi modes** are what set this oven apart:

| Traditional | Ninja Combi Combi Mode | Result |
|-------------|------------------------|---------|
| Steam → then transfer → Air Fry | Combi-Crisp (automatic) | Perfectly moist AND crispy |
| Bake bread (dry) | Combi-Bake (steam injection) | Professional bakery crust |
| Roast (baste every 20 min) | Combi-Roast (steam + roast) | Never dry, no basting |
| Cook sides separately | Combi-Meal (multi-tray) | Everything ready at once |

## 💡 Pro Tips

1. **Start with standard modes** - Build confidence with familiar cooking
2. **Try Combi-Crisp first** - Most impressive results
3. **Use the probe** - Takes guesswork out of doneness
4. **Don't skip steam** - It's what makes combi modes magical
5. **Experiment with times** - Every oven varies slightly

## 🆘 Common Questions

**Q: Can I use my old recipes?**
A: Yes for standard modes (convection, air fryer, steam, prove). Adapt others.

**Q: Do I need the water tank for everything?**
A: No. Only modes with 💧 symbol need water.

**Q: What if I don't have a MEATER probe?**
A: Recipes work fine without it, but probe gives perfect results.

**Q: Can I cook multiple things at once?**
A: Yes! Use Combi-Meal mode for complete meals.

## 📚 Learn More

Run the demo to see all recipes:
```bash
python3 docs/examples/ninja_combi_simple_demo.py
```

Read the complete guide:
- [docs/NINJA_COMBI_GUIDE.md](NINJA_COMBI_GUIDE.md)

Check recipe code:
- [custom_components/kitchen_cooking_engine/ninja_combi_data.py](../custom_components/kitchen_cooking_engine/ninja_combi_data.py)

---

**The Ninja Combi turns Home Assistant into a smart cooking coach for your multi-function oven.**
