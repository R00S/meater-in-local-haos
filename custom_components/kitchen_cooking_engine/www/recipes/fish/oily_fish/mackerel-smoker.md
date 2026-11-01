<!-- KCE:CUT_METHOD
type: cut_method
slug: mackerel
method: smoker
name: Mackerel × Smoker
category: fish
meat: oily_fish
cut_type: Oily Fish
-->
# Mackerel × Smoker — Recipe Temperature Research

## Cut profile

Hot-smoking mackerel is one of its finest preparations: the very high fat content (up to
20 g/100 g at season peak) makes the flesh self-baste under low, smoky heat while smoke
compounds dissolve into the rendering surface fat and are carried deep into the muscle. The
two fetched sources show the two dominant home formats — a barbecue's smoking reservoir with
fruit wood (British), and a staged home-smoker schedule that holds the fish at a measured
internal temperature (American/Eastern-European). Both use whole fish or fillets from fresh
mackerel and both treat the result as a well-done, keepable product. The old version of this
leaf carried two "inspired by Swedish tradition" entries with no citable URL and invented
internal figures; those have been removed as source-integrity violations.

## Styckesprofil

Varmrökning av makrill är en av dess finaste beredningar: det mycket höga fettinnehållet gör
köttet självbastande under låg rökvärme medan rökföreningar löser sig i det renderande
ytterfettet. De två hämtade källorna visar de två dominerande hemmaformaten — grillens
rökreservoir med fruktträ (brittiskt) och ett stegvis rökschema med mätt
innertemperatur (amerikanskt/östeuropeiskt). Den tidigare versionen av detta blad innehöll
två "inspirerad av svensk tradition"-poster utan citerbar URL och härledda temperaturer;
dessa har tagits bort som källintegritetsöverträdelser.

## Source recipes

### 1. Hot Smoked Mackerel with Apple Wood — Jamie Oliver / Weber
**Inspired by**: https://www.jamieoliver.com/recipes/mackerel/hot-smoked-mackerel/ (fetched 2026-05-31). Jamie Oliver / Weber collaboration; British barbecue tradition. Barbecue with smoking reservoir, applewood chips.

**Serves**: 2 · **Prep**: 15 min · **Cook**: ~10 min (on the smoker reservoir) · **Rest**: 2 min

**Ingredients**
- 2 × 80 g mackerel fillets, from sustainable sources
- 1 handful of applewood chips (soaked 30 min)
- Coarse sea salt
- 1 lemon (1/2 to season, 1/2 to grill alongside)

**Method**
1. Soak the applewood chips for 30 minutes. Drain.
2. Set up the barbecue with the smoking reservoir on one side and the grill grate on the other. Place the drained woodchips in the smoking reservoir.
3. Preheat the barbecue on **high heat for 15 minutes** (until the reservoir starts smoking), then reduce to **medium-low**.
4. Season the mackerel fillets all over with sea salt.
5. Place the mackerel on the **smoker reservoir** (not over direct heat), skin-side up.
6. Close the lid. Hot-smoke approximately **10 minutes**.
7. Serve with grilled lemon, potatoes, baby beets and horseradish-yoghurt dressing.

**Probe and endpoint**: no probe step in the recipe; its endpoint is visual ("just cooked through"). **no internal temperature stated**.

---

### 2. Homemade Hot Smoked Mackerel — Victor / Taste of Artisan
**Inspired by**: https://tasteofartisan.com/hot-smoked-mackerel/ (fetched 2026-10-24). Victor, Taste of Artisan; the page labels its cuisine "American, Eastern European". Whole mackerel, gutted, heads removed; brined, pellicle-dried, three-stage smoke schedule.

**Serves**: 8 · **Prep**: 20 min listed (+1–2 h brine, 2 h drying) · **Cook**: 4 h listed (schedule says 4–5 h) · **Rest**: not specified (ice-bath chilling described)

**Ingredients**
- 4 whole mackerel, gutted, rinsed, heads removed
- **Brine**: 1/2 gallon water at 60F; 1.2 lbs salt (about 2 cups); 1/2 lb brown sugar; 1 Tbsp Cure #1; 3 Tbsp lemon juice; 1/2 Tbsp garlic powder; 1/2 Tbsp onion powder; 1/2 Tbsp white pepper; 1 tsp ground allspice

**Method**
1. Whisk the water and remaining brine ingredients until the salt and sugar dissolve.
2. Put the fish in a suitably sized deep pan, cover with brine, and weigh the fish down so it stays submerged. Brine at room temperature **1–2 hours**.
3. Remove the fish, rinse under cold running water, and dry in a drafty area **2 hours** to develop the pellicle.
4. Smoke in three stages:
   1. **30–60 minutes at 86F (30C)** with light smoke.
   2. Gradually raise to **122F (50C)** and apply heavy smoke for **30–45 minutes**.
   3. Raise to **176F (80C)** with light smoke; let the fish reach an internal temperature of **145F (63C)** and **hold it there for at least 30 minutes**. Continue smoking until the desired colour is achieved.
5. Total smoking is estimated at about 4–5 hours. Serve hot or chill: for chilling, place the fish in a bag in ice water until it reaches **50F (10C)**, then refrigerate (article guidance: 38F / 3C).

**Probe and endpoint**: the recipe's schedule specifies an internal target — **Pull at 63°C** (145F), held at least 30 minutes (the page does not name a probe but the schedule is internal-temperature-driven).
Final serving temperature: **63°C / 145°F** (as stated by the source; the 30-minute hold at 63 °C is a pasteurisation hold, not a rest).

---

## Temperature consensus

| Tradition | Preferred doneness name | Final serving temp |
|-----------|------------------------|--------------------|
| British (Jamie Oliver / Weber, applewood reservoir) | "just cooked through" — visual | Not stated |
| American / Eastern European (Taste of Artisan, staged smoke) | "reach 145F (63C) and hold" | 63 °C / 145 °F |

The observed range across the fetched sources where temperatures are stated is a single value:
**63 °C / 145 °F** — exactly the USDA safe minimum for fish and the cut file's `well_done`
target. The British source is silent and visual. This is the collection's only measured
endpoint for mackerel, and it lands on the safe floor rather than above it: the Taste of
Artisan schedule's goal is pasteurisation-by-hold (30 minutes at 63 °C) plus colour
development, not a higher texture temperature. The divergence within the method is structural
(staged 30 → 50 → 80 °C chamber ramp vs single medium-low reservoir), not in doneness goal.
The `medium` doneness option in the cut file has no support from any smoked-mackerel source.

## What makes this method special

Smoking is the one method that transforms mackerel from a fragile same-day fish into a keeper:
the low staged heat renders fat without squeezing it out, the pellicle formed by drying gives
smoke a surface to bond to, and the fat carries guaiacol-type compounds inward where lean fish
would only taste of surface smoke. The cut's fat content is why mackerel is a classic smoking
fish in the first place. The measured source shows the safety architecture clearly — brine,
dry, ramp, then hold at 63 °C — which no quick-cook method for this cut requires.

## Summary

Hot smoking suits mackerel better than almost any other cut: its fat carries smoke deep into the flesh and the finished fish keeps for days. The one measured source pulls and holds at exactly 145 °F — the safe floor — while the British source trusts visual doneness. It is a strong match and the collection's only temperature-bearing method so far.

> ⚠️ **PARTIAL RESEARCH — NOT CONFORMS TO TOR.** Two fetched recipes (Groups B ×2 — British and American/Eastern-European) with full ingredients and methods; the 4–6-source threshold and full tradition-diversity gate are not met. The two composite "Swedish tradition" entries from the previous version (no citable URL, invented internal figures) were removed on 2026-10-24 as source-integrity violations.
