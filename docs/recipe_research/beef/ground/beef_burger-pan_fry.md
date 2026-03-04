# Beef Burger × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pan-fried beef burgers, cooked in a cast iron or stainless skillet, produce the
legendary smash burger crust — a deeply browned, crunchy exterior impossible to
achieve on a grill. The fat from the beef renders into the pan, creating a self-
basting environment. Standard pan temperature: 400-450°F / 200-230°C surface.
Target: 160°F / 71°C for USDA safety (ground beef). For smash burgers (thin patties
smashed on the griddle), the high surface area means 160°F is reached in under 3 minutes.

## Source recipes

### 1. J. Kenji López-Alt — The Smashburger (Serious Eats)
- **Source**: seriouseats.com/the-best-smashburger-recipe
- **Method**: Cast iron maximum heat, smash to 1/4 inch with spatula at 30 sec.
  2 min total per side. Cheese melt with steam.
- **Target**: **160°F / 71°C** — smash burgers cook through instantly due to
  large surface area contact with the screaming-hot pan

### 2. Gordon Ramsay — Pan-Fried Burger (Kitchen)
- **Source**: gordonramsay.com
- **Method**: Hot cast iron, season patty, 3-4 min per side without moving.
- **Target**: **145-150°F / 63-66°C** (Ramsay's pink-centre burger)

### 3. America's Test Kitchen — Pan-Fried Burgers
- **Source**: americastestkitchen.com
- **Method**: Cast iron, medium-high heat, 3-4 min per side, covered last 2 min
  to melt cheese and ensure 160°F.
- **Target**: **160°F / 71°C** (USDA ground beef)

### 4. Leila Lindholm — Stekt hamburgare i gjutjärn (leila.se)
- **Source**: leila.se/recept
- **Method**: Het gjutjärnspanna, 3-4 min per sida.
- **Target**: **70-72°C** (Swedish ground meat standard)

### 5. Heston Blumenthal — Perfect Burger (In Search of Perfection)
- **Source**: In Search of Perfection (Bloomsbury)
- **Method**: Double-grind beef with specific fat ratio, cast iron maximum heat,
  3 min per side. Rest 2 min.
- **Target**: **145°F / 63°C** — Blumenthal uses trusted-source beef medium

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / USDA / ATK | 160°F / 71°C | Ground beef standard |
| Gordon Ramsay | 145-150°F / 63-66°C | Pink centre |
| Sweden | 70-72°C | Standard |
| Heston (fresh ground) | 145°F / 63°C | Trusted source only |

**USDA safety standard: 160°F / 71°C for ground beef.**
Maps to `well_done` in beef doneness.

## What makes this method special
Pan frying is the only method that produces the smash burger's signature lacy,
crispy, deeply caramelised crust. The screaming-hot flat pan surface creates
a level of Maillard browning impossible on a grill's curved grate surface.
Smash burgers have revived the art of the fast-food-style burger in home kitchens.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (160°F/71°C ground beef USDA)
