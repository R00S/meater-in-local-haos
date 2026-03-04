# Leg of Lamb × Grill — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Butterflied leg of lamb is the most practical way to grill lamb — boned and opened
flat, it grills to 130-145°F / 54-63°C (medium-rare to medium) in 15-25 minutes
over direct medium-high heat. A bone-in leg of lamb can also be "spit-roasted" on
a rotisserie grill for 1.5-2 hours. The butterflied flat technique is the most common.
The uneven thickness of a butterflied leg means different sections cook to different
levels — some prefer medium-rare, some medium — which actually suits a table of people.

## Source recipes

### 1. J. Kenji López-Alt — Butterflied Leg of Lamb on the Grill (Serious Eats)
- **Source**: seriouseats.com/the-food-lab-grilled-butterflied-leg-of-lamb
- **Method**: Butterfly, marinade overnight, two-zone grill, indirect 15 min then
  direct to get crust, total to 130-135°F / 54-57°C. Rest 10 min.
- **Target**: **130-135°F / 54-57°C** at thickest

### 2. Yotam Ottolenghi — Grilled Butterflied Lamb Leg (Jerusalem)
- **Source**: Jerusalem (Ten Speed Press)
- **Method**: Za'atar + yogurt marinade, 12 hours. Grill medium-high 15-20 min
  per side.
- **Target**: **130-145°F / 54-63°C** — different parts at different doneness

### 3. Gordon Ramsay — Butterflied Leg of Lamb on the Grill
- **Source**: gordonramsay.com
- **Method**: Marinate, medium-high direct grill, 12-15 min per side.
- **Target**: **57-63°C** — "medium, pink throughout"

### 4. Leila Lindholm — Grillad lammfiol (leila.se)
- **Source**: leila.se/recept
- **Method**: Marinera, grill medium-high värme, 15-20 min per sida.
- **Target**: **57-60°C** at thickest

### 5. Jamie Oliver — Butterflied Leg of Lamb (BBQ)
- **Source**: jamieoliver.com / Jamie's BBQ
- **Method**: Marinate in olive oil + rosemary + garlic, grill 20 min per side.
- **Target**: **63-68°C** — medium (Jamie prefers slightly more cooked)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji | 130-135°F / 54-57°C | Medium-rare canonical |
| UK / Ramsay / Ottolenghi | 57-63°C | Medium |
| Sweden | 57-60°C | "Rosa" |
| UK / Jamie | 63-68°C | Medium |

**Consensus: 57-63°C / 135-145°F medium.** Maps to `medium` in lamb doneness.

## Data applied to cooking_data.py
- `recommended_doneness`: `"medium_rare"` (57°C culinary consensus)
