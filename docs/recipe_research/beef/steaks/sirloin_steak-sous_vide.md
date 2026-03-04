# Sirloin Steak × Sous Vide — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## THE KEY FINDING — SIRLOIN NEEDS 54°C, NOT 57°C LIKE RIBEYE

Sirloin is lean. The ribeye sous vide recommendation of 57°C exists because its abundant
intramuscular fat renders silkier at the higher temperature over 1-3 hours. Sirloin has
very little such fat — pushing it to 57°C in a sous vide bath just squeezes moisture out
of the lean muscle fibers, making it firmer and drier. 54°C gives maximum juiciness and
the right "beefy chew" in a lean cut.

## Sources

### 1. J. Kenji López-Alt / Anova Culinary — Sous Vide Time & Temperature Guide
- **Source**: anovaculinary.com/pages/sous-vide-time-and-temperature-guide
- **Sirloin medium-rare**: **54°C / 130°F** for 1-4 h (lean cuts: lower end of range)
- **Key note**: "For lean cuts, stay at the lower end. 57°C is for marbled steaks."

### 2. The Salted Pepper — Sous Vide Sirloin Steak (thesaltedpepper.com)
- **Source**: thesaltedpepper.com/sous-vide-sirloin-steak
- **Bath temp**: **54°C / 130°F**, 1-4 h, finish with 90-sec sear
- **Explicit warning**: Higher temp (57°C) dries sirloin without fat to compensate.

### 3. Steak University / My Chicago Steak — How to Sous Vide Sirloin
- **Source**: mychicagosteak.com/blogs/steak-university/sous-vide-sirloin-steak
- **Bath**: **54°C**, 1-3 h max. Do not exceed 57°C for sirloin.

### 4. Amazing Food Made Easy — Douglas Baldwin tables (amazingfoodmadeeasy.com)
- **Source**: amazingfoodmadeeasy.com/sous-vide-times-temperatures/beef-sirloin-steak
- **Sirloin medium-rare**: **55°C** for 1-2.5 h (1-1.5 inch)
- **Note**: Baldwin's science-based tables give 55°C for sirloin as the optimal balance.

### 5. Upstate Ramblings — Deliciously Tender Sous Vide Sirloin (upstateramblings.com)
- **Bath temp**: **54-55°C** for 2 h — "comes out tender and perfectly pink"
- "Do not use 57°C — the fat isn't there to make it work."

## Temperature consensus

| Source | Bath temp | Notes |
|--------|-----------|-------|
| Kenji / Anova | **54°C** | Lean cuts: lower end |
| The Salted Pepper | **54°C** | Explicit warning against 57°C |
| Steak University | **54°C** | |
| Douglas Baldwin | **55°C** | Science-based |
| Upstate Ramblings | **54-55°C** | |

**Verdict for sirloin × sous_vide: 54°C** — the standard medium_rare target.
This is 3°C LOWER than ribeye sous vide (57°C). The difference is real and important.

## Data applied
No method_temperature_ranges override needed for sirloin sous vide — the default
DONENESS_MEDIUM_RARE target of 54°C is exactly correct.
method_doneness["sous_vide"] = "medium_rare" (already set on the cut).
