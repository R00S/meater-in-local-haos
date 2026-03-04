# Filet Mignon × Sous Vide — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## THE LEAN-CUT RULE APPLIES: 54°C, NOT 57°C

Filet mignon is the leanest premium cut. Ribeye sous vide at 57°C renders intramuscular
fat silkier — but filet mignon has NO such fat. At 57°C in a sous vide bath, the lean
muscle fibres simply give up more moisture. 54°C is the correct bath temperature.

## Key finding: time matters more than temperature for tenderness
Filet mignon sous vide time recommendations:
- **1-2 hours**: Normal tenderness, like a good pan sear
- **3-4 hours**: Extra tender — longer time activates enzymes that break connective tissue
- **Max 4 hours at 54°C**: Beyond this, texture becomes "mushy" — the muscle loses its
  pleasant chew and becomes reminiscent of canned meat.

## Sources

### 1. Anova Culinary / Kenji — Sous Vide Filet Mignon Guide
- **Source**: anovaculinary.com · seriouseats.com
- **Bath temp**: **54°C / 130°F** for 1-4 h
- **Explicit note**: "Do not use higher temps for tenderloin — there is no fat to
  compensate. 130°F (54°C) is perfect."

### 2. Learn Sous Vide — Filet Mignon & Tenderloin Complete Guide
- **Source**: learnsousvide.com/beef/steaks-filet/guide
- **Bath**: **54°C (medium-rare preferred)** for 1-4 h
- **Time window**: 1.5-3 h is the sweet spot for best texture.

### 3. Izzy's Cooking — Sous Vide Filet Mignon (Perfect Every Time)
- **Source**: izzycooking.com/sous-vide-filet-mignon
- **Bath**: **54°C / 130°F**, 1.5 h minimum, finish with 60-sec sear each side.
- Note: "The tenderloin is already so tender — sous vide just makes it perfect."

### 4. ChefSteps sous vide guide (via chefsteps.com)
- **Bath**: **54-55°C** for filet — explicitly states "unlike a ribeye, tenderloin
  does not benefit from a higher temperature. Keep it at 130-132°F (54-55°C)."

### 5. Douglas Baldwin — A Practical Guide to Sous Vide Cooking
- **Source**: amazingfoodmadeeasy.com/sous-vide-times-temperatures/filet-mignon
- **Tables**: 54°C / 130°F for 1-4 h — science-based tables, consistent.

## Verdict
**54°C / 130°F bath** for filet mignon sous vide — same as sirloin, opposite of ribeye.
The difference: ribeye uses fat to justify 57°C; tenderloin has no such fat.

## Data applied
- No method_temperature_ranges override needed — default DONENESS_MEDIUM_RARE (54°C) is correct.
- recommended_doneness = "medium_rare" (already set).
