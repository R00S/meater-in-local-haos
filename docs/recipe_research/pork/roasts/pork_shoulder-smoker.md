# Pork Shoulder × Smoker — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Smoked pork shoulder (BBQ pulled pork) is the canonical American barbecue product.
A wood smoker maintains 225-275°F / 107-135°C ambient temperature for 8-16 hours
while white or blue smoke penetrates the meat, forming a smoke ring and building
bark (the exterior crust). The collagen/fat conversion to gelatin happens identically
to oven roasting, but smoke adds an irreplaceable flavour dimension. The "stall" at
155-170°F/68-77°C (evaporative cooling) can be broken by wrapping in butcher paper.

## Source recipes

### 1. Aaron Franklin — Texas Pulled Pork (Franklin Barbecue)
- **Source**: Franklin Barbecue (Ten Speed Press)
- **Method**: Dry rub (salt + pepper), 250°F oak smoker, 8-12 hours. Butcher-paper
  wrap at stall (~165°F). Cook to 200-205°F. Rest 1+ hours in cooler.
- **Target**: **200-205°F / 93-96°C** — probe in multiple locations, all soft
- **Note**: Franklin emphasises resting 1+ hours wrapped in a cooler after pulling
  from smoker; this redistributes juices and brings the exterior in.

### 2. Steve Raichlen — Texas Smoked Pork Shoulder (Planet Barbecue)
- **Source**: Planet Barbecue (Workman) / barbecuebible.com
- **Method**: Mustard-binder dry rub, cherry + hickory smoke, 225°F / 107°C,
  12-14 hours. Pull at 195-200°F.
- **Target**: **195-200°F / 91-93°C**
- **Note**: Raichlen accepts 195°F as "done enough" for most purposes; Franklin
  prefers 200-205°F for championship-level pullability.

### 3. J. Kenji López-Alt — The Science of Smoked Pork (Serious Eats)
- **Source**: seriouseats.com/serious-eats-guide-to-smoking-meat
- **Method**: Dry rub overnight, 225°F smoker, wrap in paper at stall, 200-205°F final.
  Rest 2 hours minimum.
- **Target**: **200-205°F / 93-96°C**
- **Note**: Kenji explains the stall scientifically: evaporation from surface moisture
  holds the internal temp at 155-170°F for 2-4 hours; the wrap breaks the stall.

### 4. Myron Mixon — Championship BBQ Pork Shoulder (Everyday Barbecue)
- **Source**: Everyday Barbecue cookbook (Ballantine Books)
- **Method**: Inject with apple juice, season, cook 275°F / 135°C 8-9 hours.
  Wrap at 165°F in foil with butter/brown sugar. Finish to 200-205°F.
- **Target**: **200-205°F / 93-96°C**
- **Note**: Mixon's competition approach uses 275°F (higher than Franklin's 250°F)
  and foil wrap — faster but produces slightly less bark than paper/naked.

### 5. Pit Boys — Carolina-style Smoked Pork Shoulder (pitboys.com)
- **Source**: pitboys.com / YouTube channel
- **Method**: Apple cider vinegar mop, hickory smoke, 225°F for 14-16 hours.
- **Target**: **195-205°F / 91-96°C**
- **Note**: Carolina style includes a vinegar mop every 2 hours, adding acidity and
  keeping the surface moist to slow the stall.

## Temperature consensus

| Source | Smoker temp | Target internal temp |
|--------|------------|---------------------|
| Aaron Franklin | 250°F | 200-205°F / 93-96°C |
| Steve Raichlen | 225°F | 195-200°F / 91-93°C |
| J. Kenji López-Alt | 225°F | 200-205°F / 93-96°C |
| Myron Mixon | 275°F | 200-205°F / 93-96°C |
| Pit Boys | 225°F | 195-205°F / 91-96°C |

**Consensus: 195-205°F / 91-96°C after 8-16 hours at 225-275°F.**
Maps to `well_done` in pork doneness.

## What makes this method special
Smoking is the only method that adds bark (caramelised exterior crust formed from
the dry rub interacting with smoke and heat) and a smoke ring (pink myoglobin-nitric
oxide layer beneath the surface). No oven method replicates this. The long smoke time
is the entire point — hurrying the process produces inferior flavour and texture.

## Data applied to cooking_data.py
- `recommended_doneness`: `"well_done"` (195-205°F for pulled pork)
