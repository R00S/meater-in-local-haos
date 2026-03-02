# Ribeye Steak × Air Fryer — Recipe Temperature Research

## Cut profile
An air fryer circulates very hot air (190-220°C) rapidly around the steak, producing a
Maillard crust on all exposed surfaces simultaneously — rather than only the bottom contact
surface in a pan. The result is a uniformly browned exterior with far less smoke than
cast iron and no basting. The main trade-off versus pan sear: the crust is thinner and
lacks the butter/herb-infused depth of a basted pan sear; versus reverse sear: the short
cook time means a slightly more pronounced temperature gradient inside.

## Source recipes

### 1. Always Use Butter — Air Fryer Rib-Eye Steak (alwaysusebutter.com)
- **Source**: alwaysusebutter.com/air-fryer-rib-eye-steak
- **Method**: 200°C air fryer; butter compound patted on top after cooking.
  Flip halfway.
- **Target medium-rare**: 130-135°F / **54-57°C** after 8-10 min total
- **Rest**: 5 min minimum; temp rises 2-3°C during rest.

### 2. Typhur — Ribeye i airfryern (Swedish review / Typhur.com)
- **Source**: explore.typhur.com/sv/air-fryer-ribeye
- **Method**: Swedish-market review; 200°C, flip once, use meat thermometer.
- **Innertemp medium rare**: **55-57°C** (pull at ~52-53°C and rest)
- **Note**: "Luftfritösen ger ett jämnt, saftigt resultat" — air fryer gives even,
  juicy result. Slightly less crust depth than stekpanna (frying pan).

### 3. RecipeTeacher — Best Damn Air Fryer Ribeye (recipeteacher.com)
- **Source**: recipeteacher.com/best-damn-air-fryer-ribeye-steak
- **Method**: 400°F / 200°C; brown sugar in rub for enhanced Maillard.
- **Target medium-rare**: 130-135°F / **54-57°C** internal
- **Key finding**: Brown sugar in the rub compensates for the lighter crust formation
  compared to cast iron — creates better colour in the air fryer environment.

### 4. Air Fryer Lab — Perfect Ribeye (theairfryerlab.com)
- **Source**: theairfryerlab.com/blog/perfect-ribeye-in-your-air-fryer
- **Method**: Two-stage: 190°C first 4 min, 200°C last 3 min (Ninja Foodi / Philips).
- **Target**: pull at 125°F / **52°C** for medium-rare; rest to 130-135°F / 54-57°C.
- **Crust finding**: Starting lower then cranking up gives better crust without the
  outer centimetre overcooking — approximates the reverse sear principle.

### 5. Urban Cowgirl Life — Steak in the Air Fryer (urbancowgirllife.com)
- **Source**: urbancowgirllife.com/steak-in-the-air-fryer-temperatures-time-chart
- **Method**: Comprehensive Ninja/Philips chart. 400°F / 200°C.
- **Medium-rare target**: **130-135°F / 54-57°C**
- **Texture note**: "Air fryer steak is consistently juicy because the rapid air seals
  surface moisture quickly — comparable to high-heat pan sear but less pronounced crust."

## Temperature consensus

| Source | Target | Notes |
|--------|--------|-------|
| Always Use Butter | 54-57°C | After rest |
| Typhur (Swedish) | 55-57°C | Final serving temp |
| RecipeTeacher | 54-57°C | |
| Air Fryer Lab | 54-57°C | Pull 52°C, rest |
| Urban Cowgirl Life | 54-57°C | |

**Unanimous: medium-rare (54-57°C).** Same final internal temperature as pan sear and
grill — the method difference is surface character, cook time, and convenience, not the
target doneness.

## What makes air fryer distinct
Rapid 360° hot-air circulation creates a uniform all-over Maillard crust without smoke.
No butter basting means the "steakhouse" aromatic depth is absent, but the even heating
often produces very consistent results for home cooks. Internal temperature targets are
identical to other dry-heat methods — the MEATER probe reads the same 54-57°C regardless.

## Data applied
- No `method_temperature_ranges` override needed — default ranges apply.
- `method_doneness["air_fryer"]` = not needed (same as `recommended_doneness`).
