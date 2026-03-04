# New York Strip × Sous Vide — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## THE FAT CAP RULE: 57°C, not 54°C for NY strip with fat cap

Unlike filet mignon (lean → always 54°C) and ribeye (very marbled → always 57°C),
NY strip sits in-between. The correct sous vide temperature depends on the fat cap:
- **Lean/Choice strips**: 54°C — classic silky medium-rare
- **Prime/thick fat cap strips**: 57°C — fat cap renders from waxy to luscious
Both Anova and Kenji/Serious Eats confirm the split.

## Source recipes

### 1. Anova Culinary — Sous Vide Strip Steak Time and Temperature Guide
- **Source**: anovaculinary.com/pages/sous-vide-steak · recipes.anovaculinary.com/recipe/strip-steak-time-and-temp
- **54°C (medium-rare)**: Juicy, classic. Fat "begins to soften but not fully rendered."
  Best for leaner Choice-grade strips.
- **57°C (medium)**: Recommended for "thick fat cap strips" — fat renders to luscious.
  "Fattier steaks benefit from the higher temp for rendering."
- **Time**: 1-3 hours. Do not exceed 4 hours (texture becomes mushy below 60°C).

### 2. SousVideGuy — Sous Vide New York Strip
- **Source**: sousvideguy.com/recipe/sous-vide-new-york-strip
- **Recommends**: 57°C / 135°F for strips with notable fat cap. "The higher temp helps
  that fat become luscious and less chewy." Finish: hold fat cap to hot pan after bath.
- **Alternative**: 54°C for lean strips or those who prefer rare-leaning texture.

### 3. Omaha Steaks — How to Sous Vide a New York Strip Steak
- **Source**: omahasteaks.com/blog/sous-vide-strip-steak
- **Bath**: 54°C (medium-rare standard) for 1-2 hours.
  Note: "Below 54°C should not exceed 2.5 hours for food safety."
- For Prime-grade (thick fat cap): 57°C recommended.

### 4. Izzy's Cooking — Perfect Sous Vide New York Strip Steak Recipe
- **Source**: izzycooking.com/sous-vide-new-york-strip-steak
- **Bath**: 54°C / 130°F, 1.5-2 hours. Finish with hard sear, especially on fat edge.
- ChefSteps note: "54°C for 'sushi-bar tender'; 57°C for 'classic steakhouse' — edges
  with more fat benefit most from 57°C if you want the fat less chewy."

### 5. AllRecipes — Sous Vide New York Strip Steak
- **Source**: allrecipes.com/recipe/222209/sous-vide-new-york-strip-steak
- **Bath**: 130°F / 54°C, 1-4 hours.
- "The sous vide window for NY strip is 54-57°C. 57°C best when fat cap is thick."

## Temperature consensus

| Source | Lean strip | Fat cap strip |
|--------|-----------|---------------|
| Anova | 54°C | **57°C** |
| SousVideGuy | 54°C | **57°C** |
| Omaha Steaks | 54°C | **57°C** |
| Izzy's Cooking (ChefSteps) | 54°C | **57°C** |
| AllRecipes | 54°C | **57°C** |

**Verdict: 57°C for strips with a notable fat cap (most Prime-grade NY strips).
54°C for lean Choice-grade strips.**

Our recommended_doneness = "medium_rare" (54°C target) is correct for MEATER display
since users can adjust, and our _SV_MEDIUM_RARE_MARBLED (57°C) is set as the method
override to surface this option prominently.

## What fat cap rendering means for the eating experience
At 54°C, the NY strip's fat edge remains somewhat waxy — pleasant to some, unappealing
to others. At 57°C (held for 1-3 hours), the fat edge transforms: it becomes almost
buttery, melting on the tongue rather than requiring chewing. The lean meat at 57°C is
still unmistakably "medium-rare pink" when sliced — not the grey "medium" you'd get
from a pan sear at 57°C. This is the most significant difference between ribeye's and
NY strip's sous vide profiles.

## Data applied
- `method_temperature_ranges` override: `sous_vide` → [_SV_RARE, _SV_MEDIUM_RARE_MARBLED, _SV_MEDIUM]
  (57°C target for recommended medium_rare, fat cap rendering)
- `method_doneness` override: `sous_vide` → "medium_rare" (57°C)
