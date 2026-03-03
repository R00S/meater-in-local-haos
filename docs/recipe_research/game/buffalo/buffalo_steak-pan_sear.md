# Buffalo Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Buffalo (water buffalo) is a red meat that sits between beef and bison — slightly
leaner than beef but not as lean as bison, with a richer, slightly more mineral
flavour. The term "buffalo" in culinary contexts refers primarily to water buffalo
(Bubalus bubalis) in Europe and Asia; in North America it is often used interchangeably
with bison (American buffalo). Water buffalo steaks can be served at 130-145°F /
54-63°C (medium-rare to medium), similar to beef. Pan-sear 3-4 minutes per side
in a hot cast iron pan.

## Source recipes

### 1. Italian culinary tradition — Filetto di bufalo (Campania)
- **Source**: Consortio della Mozzarella di Bufala Campana / Italian tradition
- **Method**: Cast iron, high heat, olive oil, 3-4 min per side. Rest 5 min.
- **Target**: **54-60°C / 130-140°F** — "al sangue" to medium-rare

### 2. Tom Parker Bowles — Buffalo Steak (Let's Eat Meat)
- **Source**: Let's Eat Meat (Pavilion)
- **Method**: Treat like lean beef: hot pan, 3-4 min per side.
- **Target**: **130-140°F / 54-60°C** — "medium-rare to medium"

### 3. Hank Shaw — Water Buffalo / Bison equivalence
- **Source**: honest-food.net
- **Method**: High heat, fast sear, 3-4 min per side, rest.
- **Target**: **130-140°F / 54-60°C**

### 4. Leila Lindholm — Buffelfilé (adapted) (leila.se)
- **Source**: leila.se/recept
- **Method**: Het gjutjärn, smör + olja, 3-4 min per sida. Vila 5 min.
- **Target**: **57-60°C** — "rosa"

### 5. Gordon Ramsay — Exotic Red Meat / Buffalo
- **Source**: gordonramsay.com
- **Method**: Cast iron, medium-high heat, 3-4 min per side. Herb butter baste.
- **Target**: **130-140°F / 54-60°C**

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Italy / Mediterranean | 54-60°C | "Al sangue" / medium-rare |
| UK / Parker Bowles | 130-140°F / 54-60°C | Medium-rare to medium |
| Sweden | 57-60°C | "Rosa" |
| USDA (wild game) | 160°F / 71°C | Conservative |

**Culinary consensus: 57-60°C / 135-140°F medium-rare to medium.**
Maps to `medium_rare` in game/beef doneness.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `oven_roast`
- `recommended_doneness`: `"medium_rare"` (54-60°C consensus)
