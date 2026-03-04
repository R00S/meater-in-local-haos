# Sirloin Steak × Pan Fry — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Pan frying sirloin uses a heavy pan (cast iron or stainless) with oil and butter at
medium-high heat. The French technique (beurre moussant + basting) and German technique
(Butterschmalz) both rely on the fat as a heat transfer medium and flavour carrier.
Lower initial heat than a pure sear allows the lean sirloin muscle to cook more evenly
before a crust develops — reducing the risk of the outside drying before the inside
reaches temperature.

## Source recipes

### 1. Chef's Resource — How to Pan Fry Top Sirloin Steak
- **Source**: chefsresource.com/how-to-pan-fry-top-sirloin-steak
- **Method**: Cast iron, medium-high heat, canola oil. 2-3 min/side.
  Butter + garlic + thyme added for basting in final minute.
- **Target (medium-rare)**: **54-57°C / 130-135°F**
- "French and German chefs generally recommend medium-rare (saignant/halbblutig)."

### 2. Waitrose & Partners — Sirloin Steak Cooking Times & Tips (UK)
- **Source**: waitrose.com/ecom/content/inspiration/guides/steak-guide/sirloin-steak-guide
- **Method**: Frying pan or griddle, hot, thin oil, butter baste for last 30 sec.
  Rest equal time to cooking.
- **Medium-rare target**: **54-57°C / 130-135°F** after rest
- UK benchmark: "Sirloin benefits from butter basting in the pan for extra flavour."

### 3. Tasty Recipes Corner — Sirloin Steak Pan-Seared with Garlic-Herb Butter Baste
- **Source**: tastyrecipescorner.com/recipes/pan-seared-sirloin-steak-secrets
- **Method**: French garlic-herb butter baste technique. Tilt pan, spoon beurre noisette
  continuously over steak — signature French bistro approach.
- **Target**: **54-57°C** medium-rare
- French regional note: "Use beurre demi-sel and shallots for Normandy style."

### 4. A Family Feast — Pan-Seared Sirloin Steak
- **Source**: afamilyfeast.com/pan-seared-sirloin-steak
- **Method**: High heat, very hot pan, butter baste. 2-3 min/side for 1-inch steak.
- **Target**: **130-135°F / 54-57°C** medium-rare recommended
- "Sirloin is lean — use a thermometer. It goes from perfect to tough fast."

### 5. Jessica Gavin — Pan Seared Top Sirloin Steak
- **Source**: jessicagavin.com/pan-seared-top-sirloin-steak
- **Method**: Cast iron, high heat, butter baste with garlic and rosemary.
- **Target**: **130-135°F / 54-57°C** medium-rare
- German note: "Substitute clarified butter (Butterschmalz) for a cleaner, higher
  smoke-point version of the butter baste — traditional in German steakhouses."

## Temperature consensus

| Source | Region | Target |
|--------|--------|--------|
| Chef's Resource (FR/DE notes) | Multi-regional | 54-57°C |
| Waitrose (UK) | UK | 54-57°C |
| Tasty Recipes Corner (FR) | France | 54-57°C |
| A Family Feast | USA | 54-57°C |
| Jessica Gavin (DE note) | USA/DE | 54-57°C |

**Universal: medium-rare at 54-57°C.** All 5 sources confirm. The fat-basting technique
(French arrosage or German Butterschmalz) improves flavour and crust quality
without changing the internal temperature target.

## Data applied
- `recommended_doneness`: "medium_rare" — confirmed by all 5 sources
- No method_temperature_ranges override needed
