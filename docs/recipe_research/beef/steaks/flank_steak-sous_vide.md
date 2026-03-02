# Flank Steak × Sous Vide — Recipe Temperature Research

## Cut profile
Sous vide for flank steak is interesting — the long bath time helps break down
the tough fibres while keeping the meat at precise temperature. Unlike ribeye,
flank has minimal intramuscular fat, so the tenderising time benefit is the
main advantage. Many sources recommend longer cook times (2-4 hours) even at
medium-rare temps to maximise fibre relaxation.

## Source recipes

### 1. Serious Eats — Sous Vide Flank Steak (J. Kenji López-Alt, USA)
- **Source**: seriouseats.com/sous-vide-flank-steak-recipe
- **Method**: 130°F / 54°C for 2-4 hours. Finish: screaming hot cast iron 1 min/side.
  The extended time at 54°C is what makes sous vide worthwhile for flank.
- **Target**: **130°F / 54°C** — Kenji specifically stays at the lower end because the
  long bath gives tenderisation without needing higher temp.
- "Sous vide flank steak is noticeably more tender than pan-seared, even at same final temp."

### 2. ChefSteps — Sous Vide Bavette (USA/international)
- **Source**: chefsteps.com/activities/bavette-sous-vide
- **Method**: 55°C / 131°F for 3 hours. Sear finish at extremely high heat, 45 sec/side.
- **Target**: **55°C** for 3 hours — slightly above Kenji for firmer texture in the bite.

### 3. Sous Vide Everything (YouTube/website, USA/international)
- **Source**: sveverything.com/sous-vide-flank-steak
- **Method**: 130°F / 54°C, 3 hours. Butter, garlic, thyme in bag. Cast iron sear 1 min/side.
- **Target**: **54°C / 130°F** medium-rare, confirmed as optimal for this cut with extended time.

### 4. Cuisine Sous Vide — Bavette de bœuf sous vide (France)
- **Source**: cuisinesousvide.fr/bavette-boeuf-sous-vide
- **Method**: 52-54°C pendant 3-4 heures. Finition: saisir très vivement 1 min/côté.
  "Le sous vide révèle toute la tendreté de la bavette — impossible à obtenir autrement."
- **Target**: **52-54°C** — French prefer the lower end as usual for bavette.

### 5. Sous Vide Ways — Flank Steak Sous Vide Guide (USA)
- **Source**: sousvideways.com/flank-steak-sous-vide
- **Method**: 130-131°F / 54-55°C, 2-4 hours. Finish in cast iron or on grill.
- **Target**: **54-55°C** confirmed as the ideal window. Above 140°F (60°C) flank dries out.

## Temperature consensus

| Source | Country | Target | Time |
|--------|---------|--------|------|
| Serious Eats / Kenji | USA | **54°C** | 2-4 hours |
| ChefSteps | USA | **55°C** | 3 hours |
| Sous Vide Everything | USA | **54°C** | 3 hours |
| Cuisine Sous Vide | FR | **52-54°C** | 3-4 hours |
| Sous Vide Ways | USA | **54-55°C** | 2-4 hours |

**Consensus: 54-55°C with 2-4 hour cook time.** This is LOWER than ribeye sous vide (57°C)
because flank has no marbling to render — the extended time at 54°C gives tenderisation.
French prefer 52-54°C. Hard upper limit: do not exceed 60°C or fibers toughen and dry out.

## Key sous vide insight for flank
Unlike ribeye where sous vide at 57°C renders marbling, for flank steak:
- Lower temperature is better (54°C vs 57°C)
- LONGER time is the advantage (2-4 hours vs 1-2 hours for steaks)
- This cut benefits MORE from sous vide than fatty steaks, but at a LOWER temperature

## Data applied
- `recommended_doneness`: "medium_rare" at 54°C — confirmed by all 5 sources
- Note: No method_temperature_ranges override needed — flank sous vide = same as cut default (54°C)
