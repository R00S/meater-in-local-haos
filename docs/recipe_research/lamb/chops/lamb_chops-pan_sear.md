# Lamb Chops × Pan Sear — Recipe Temperature Research

## Cut profile
Lamb chops (loin chops or rib chops) are the most widely cooked lamb cut for home
cooks — smaller than a rack, individually portioned, and cooking in 6-8 minutes total.
The thick fat cap on rib chops renders best when the chop stands fat-cap-down in the
pan first, then lies flat for each face. Target: 57-63°C / 135-145°F for medium-rare
to medium, the universal preference across culinary traditions.

## Source recipes

### 1. J. Kenji López-Alt — Perfect Pan-Seared Lamb Chops (Serious Eats)
- **Source**: seriouseats.com/pan-seared-lamb-loin-chops
- **Method**: Season, stand fat-cap-down 3 min first to render fat, then sear each
  face 2-3 min. Baste with herb butter 30 sec. Rest 5 min.
- **Target**: **130-135°F / 54-57°C** pull; **135-140°F / 57-60°C** after rest
- **Note**: Kenji's fat-cap-first technique is the key to crispy fat and rendered
  exterior without overcooking the loin muscle.

### 2. Gordon Ramsay — Pan-Seared Lamb Cutlets (MasterClass / Kitchen Secrets)
- **Source**: masterclass.com / gordonramsay.com
- **Method**: Season, olive oil, very hot pan, 2-3 min per side, rest 3-5 min.
- **Target**: **135-140°F / 57-60°C** (medium-rare, "still pink and juicy")
- **Note**: Ramsay is explicit: lamb chops MUST be pink — grey lamb chops are
  overcooked and he considers it a cardinal sin.

### 3. Leila Lindholm — Stekta lammkotletter (leila.se)
- **Source**: leila.se/recept
- **Method**: Garlic + thyme butter, hot pan, 2-3 min per side. Rest 5 min.
- **Target**: **58-60°C** at eye of loin (Swedish "rosa" lamb standard)

### 4. Yotam Ottolenghi — Pan-Seared Lamb Chops with Harissa (Plenty More)
- **Source**: Plenty More (Ten Speed Press)
- **Method**: Marinate with harissa, very hot cast iron, 2-3 min per side.
- **Target**: **57-60°C / 135-140°F** — pink interior

### 5. Paul Bocuse — Côtes d'agneau à la poêle (Bocuse in Your Kitchen)
- **Source**: Bocuse in Your Kitchen (Flammarion)
- **Method**: Clarified butter, very hot, 2 min each side. Rest 5 min tented.
- **Target**: **55-57°C** — "rosé vif" (vibrantly pink)

## Temperature consensus

| Tradition | Target internal temp | Notes |
|-----------|---------------------|-------|
| USA / Kenji | 130-135°F / 54-57°C | Pull temp, rest to 57-60°C |
| Gordon Ramsay | 135-140°F / 57-60°C | Medium-rare |
| Sweden / Leila | 58-60°C | "Rosa" |
| France / Bocuse | 55-57°C | "Rosé vif" |

**Consensus: 55-60°C / 131-140°F medium-rare.** Maps to `medium_rare` in lamb doneness.

## What makes this method special
Pan searing lamb chops is one of the fastest premium dinners possible — less than
10 minutes from raw to table for a restaurant-quality result. Butter basting with
garlic and rosemary in the final minute adds an extraordinary flavour layer that
grill or oven cannot replicate. The fat-cap-first technique is the defining technique.

## Data applied to cooking_data.py
- `supported_methods` gains: `pan_sear`, `pan_fry`, `grill`, `oven_roast`, `charcoal_grill`
- `recommended_doneness`: `"medium_rare"` (55-60°C universal consensus)
