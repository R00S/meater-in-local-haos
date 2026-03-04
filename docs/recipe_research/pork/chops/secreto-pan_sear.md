# Secreto (Ibérico) × Pan Sear — Recipe Temperature Research

> ⚠️ **STATUS: NEEDS TO BE RECREATED**
> Source recipes are in summary/bullet-point format — missing **Serves**, **Ingredients**, numbered Method steps, probe insert instruction, bolded **Pull at** temperature, and Final serving temperature. Step 2 of the ToR verification protocol fails

## Cut profile
Secreto is a hidden skirt muscle from the Ibérico pig, just under the shoulder
blade — "secreto" (secret) because it is concealed and often kept by the butcher.
The Ibérico pig's unique diet (acorns = bellotas) gives the secreto fat an
extraordinary nutty, complex flavour similar to Wagyu beef. It is very thin (1-2 cm)
and cooks in 2-3 minutes per side. Because of the superior fat quality, it can be
served at 145-150°F / 63-66°C (slightly pink) — this is the traditional Spanish way.

## Source recipes

### 1. José Pizarro — Secreto Ibérico a la Plancha (José Tapas)
- **Source**: joserestaurant.co.uk
- **Method**: Cast iron plancha, medium-high heat, 2-3 min per side. Rest 3 min.
  No oil needed — the fat renders itself.
- **Target**: **63-65°C / 145-149°F** — "slightly pink inside, sweet pork"

### 2. Sam Hart (Barrafina) — Secreto Ibérico
- **Source**: Barrafina cookbook
- **Method**: Cast iron, medium-high, 2-3 min per side.
- **Target**: **63-66°C** — Spanish pork culinary standard

### 3. Gordon Ramsay — Ibérico Pork (Savoy Grill)
- **Source**: gordonramsay.com / MasterClass
- **Method**: Cast iron, medium-high heat, 2-3 min per side. Baste with butter.
- **Target**: **63-68°C** at thickest

### 4. Leila Lindholm — Iberisk fläsk / Secreto (leila.se)
- **Source**: leila.se/recept
- **Method**: Gjutjärn, medelhög värme, 2-3 min per sida.
- **Target**: **63-68°C**

### 5. Spain Gourmetour — Secreto Ibérico Traditional (spainsgourmetour.com)
- **Source**: spainsgourmetour.com / Ibérico producers association
- **Method**: Plancha or cast iron, no oil, 2-3 min per side.
- **Target**: **145-150°F / 63-66°C** — Spanish tradition accepts slight pink

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| Spain traditional | 63-66°C / 145-150°F | Slight pink accepted |
| UK / Ramsay | 63-68°C | |
| Sweden | 63-68°C | |
| USDA | 145°F / 63°C | Minimum safe |

**Consensus: 145-150°F / 63-66°C.** Maps to `well_done` in pork doneness.

## What makes this method special
Secreto is considered the ultimate expression of Ibérico pork — a cut that barely
exists in any other breed of pig, with fat so flavourful it needs no oil, no sauce,
and minimal seasoning. 2-3 minutes in a screaming hot cast iron pan is all it takes
to produce one of Spain's greatest dishes.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `grill`, `charcoal_grill`
- `recommended_doneness`: `"well_done"` (145-150°F/63-66°C standard)
