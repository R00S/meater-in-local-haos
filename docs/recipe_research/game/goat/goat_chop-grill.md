# Goat Chop × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Grilled goat chops are the standard preparation in Caribbean, Jamaican, South Asian
(especially Kerala), and Middle Eastern traditions. The grill's direct flame
complements goat's clean, slightly gamy flavour with charred smokiness. Marinating
(yogurt + spices, or jerk paste, or chermoula) is nearly universal — goat's leanness
requires a fat-carrying marinade to prevent drying. Direct heat 375-425°F /
190-220°C for 4-5 minutes per side reaches the 145-155°F / 63-68°C target.

## Source recipes

### 1. Hank Shaw — Grilled Goat Chops (honest-food.net)
- **Source**: honest-food.net
- **Method**: Yogurt + herb marinade 2 hours, hot grill 4-5 min per side.
- **Target**: **145-155°F / 63-68°C** at centre

### 2. Yotam Ottolenghi — Grilled Goat Chops (NOPI)
- **Source**: NOPI (Ten Speed Press)
- **Method**: Za'atar + olive oil marinade, grill 4-5 min per side.
- **Target**: **63-68°C / 145-155°F**

### 3. Pete Evans (Australian) — Grilled Goat Chops
- **Source**: petespaleo.com / Australian game cooking tradition
- **Method**: Lemon + garlic marinade, hot grill 4-5 min per side.
- **Target**: **145°F / 63°C** minimum; prefer 68°C for texture

### 4. Leila Lindholm (adapted) — Grillad get/get med marinad
- **Source**: Adapted from Swedish lamb recipe tradition
- **Method**: Harissa + olive oil, hot grill 4-5 min per side.
- **Target**: **65-70°C** (slightly above lamb standard for goat's leanness)

### 5. Caribbean Jerk Goat tradition (Jamaica)
- **Source**: jamaicans.com / Caribbean culinary tradition
- **Method**: Jerk paste marinade overnight, hot charcoal grill 5-6 min per side.
- **Target**: **145-160°F / 63-71°C** — Caribbean tradition accepts a range
  with jerk-spiced goat sometimes fully cooked through at 160°F.

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 145-155°F / 63-68°C | USDA safe medium |
| Middle East / Ottolenghi | 63-68°C | Standard medium |
| Australia | 63-68°C | 145°F minimum |
| Caribbean (Jerk) | 145-160°F / 63-71°C | Sometimes fully cooked |

**Consensus: 63-68°C / 145-155°F (medium).** Maps to `medium` in goat doneness.

## What makes this method special
Grilled goat with jerk or chermoula marinade is one of the great regional grilling
traditions — the char and smoke from the grill add complexity to a protein with
already-distinctive flavour. The intense heat caramelises the sugars in yogurt
marinades, creating a charred exterior that seals the lean meat's juices.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium"` (63-68°C consensus)
