# Trout Fillet × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Trout (rainbow, brown, sea trout) is a fatty freshwater fish in the same family as
salmon — and cooked the same way. Skin-on fillet, skin-side down in a hot pan for
4-5 minutes, then flipped briefly. The fat content of trout (especially sea trout)
means it can be served at 120-130°F / 49-54°C (medium) like salmon. Rainbow trout
is milder and slightly leaner; brown trout and sea trout are richer and more flavourful.

## Source recipes

### 1. Hank Shaw — Pan-Fried Trout (honest-food.net)
- **Source**: honest-food.net/pan-fried-trout
- **Method**: Skin-on, butter + oil, medium-high heat, 4-5 min skin-side, 1-2 min
  flesh-side. Brown butter finish.
- **Target**: **125-130°F / 52-54°C** at thickest (Hank targets medium for trout)

### 2. Gordon Ramsay — Pan-Fried Trout Amandine (Kitchen Secrets)
- **Source**: gordonramsay.com
- **Method**: Hot pan, butter + oil, skin-side 4 min, flip 2 min, brown butter + almonds.
- **Target**: **130-140°F / 54-60°C** — "just set, flakes at gentle pressure"

### 3. Leila Lindholm — Stekt regnbågsforell (leila.se)
- **Source**: leila.se/recept
- **Method**: Smör + olja, 4-5 min per sida.
- **Target**: **52-57°C** (Swedish trout standard — same as salmon)

### 4. Magnus Nilsson — Stekt öring (Fäviken / Nordic Cookbook)
- **Source**: The Nordic Cookbook (Phaidon)
- **Method**: Brown butter, wild trout, 3-4 min per side.
- **Target**: **52-55°C** — Nordic wild trout standard

### 5. Jamie Oliver — Trout in a Frying Pan (Jamie's Comfort Food)
- **Source**: jamieoliver.com
- **Method**: Butter, medium-high heat, 3-4 min per side.
- **Target**: **140-145°F / 60-63°C** — "flakes easily from skin"

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Hank Shaw | 125-130°F / 52-54°C | Medium (salmon-style) |
| Gordon Ramsay / Jamie | 130-145°F / 54-63°C | Medium to well-done |
| Sweden / Nordic | 52-57°C | Salmon-equivalent |

**Consensus: 52-57°C / 125-135°F.** Maps to `medium` for culinary standard,
`well_done` per USDA.

## What makes this method special
Pan-fried trout in brown butter is a classic of French (truite meunière) and
Nordic cooking — the noisette butter transforms the delicate fish's mild flavour
with rich, hazelnut aromatics. The skin crisps beautifully on a skin-on fillet,
contrasting with the soft, flaky interior.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `oven_bake`, `grill`
- `recommended_doneness`: `"medium"` (52-57°C culinary consensus — fatty fish like salmon)
