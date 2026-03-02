# Sirloin Steak × Pan Sear — Recipe Temperature Research

## Cut profile
Sirloin comes from the rear of the loin section — a muscle used more than the rib, giving
a firmer texture and more pronounced "beefy" flavour than ribeye. With far less
intramuscular fat, sirloin has no fat-rendering benefit; instead, a correct internal
temperature preserves what little moisture it has. Reaching even 5°C above the ideal
target makes it noticeably tougher and drier than a ribeye at the same temperature.
Precision matters more with sirloin than with any marbled cut.

## Source recipes

### 1. J. Kenji López-Alt — Perfect Pan-Seared Sirloin (Serious Eats)
- **Source**: seriouseats.com
- **Method**: Dry brine overnight, hot cast iron, frequent flipping, butter baste.
- **Target**: medium-rare = pull at **52°C**, rest to **54-55°C**
- **Kenji's note**: "With a lean cut like sirloin, temperature matters more than with
  a ribeye. Hit 60°C and you'll notice the difference immediately."

### 2. Gordon Ramsay — How to Cook Sirloin Steak Perfectly (gordonramsay.com)
- **Source**: gordonramsay.com
- **Method**: High heat pan, oil first, butter + garlic + thyme baste. Turn frequently.
- **Target**: "Nice pink inside" = **54-57°C** — Ramsay calls this the "only way to
  serve sirloin properly."

### 3. Leila Lindholm — Sirloin på rätt sätt (ICA.se / Koket.se)
- **Source**: koket.se · ica.se
- **Method**: Torka av, salt, smör och rapsolja, hög värme.
- **Target**: Medium rare för ryggbiff = **55-57°C** after rest
- **Note**: "Ryggbiff är magert — ta av det lite tidigare, det torkar snabbt."
  (Sirloin is lean — take it off a bit earlier, it dries out fast.)

### 4. Christophe Bacquié / French sirloin — Faux-filet poêlé (Académie du Goût)
- **Source**: academiedugout.fr
- **Method**: Poêle de fonte, beurre noisette, échalote, thym.
- **Target**: saignant = **50-53°C** at heart — French high-end preference is somewhat
  rarer than Anglo-Nordic for faux-filet (sirloin), to keep the lean muscle moist.
- **Interesting finding**: French *saignant* for lean cuts like sirloin is at the low
  end — 50-53°C — more conservative than their recommendation for marbled cuts.

### 5. Donna Hay — Sirloin Steak Recipe (Australia) (donnahay.com)
- **Source**: donnahay.com
- **Method**: Australian home standard: very hot pan, resting time equal to cooking time.
- **Target**: "Perfectly pink" = **54-57°C** — identical to European medium-rare.

## Temperature consensus

| Source | Target | Notes |
|--------|--------|-------|
| Kenji / Serious Eats | 54-55°C (pull 52°C) | Lean — precise |
| Gordon Ramsay | 54-57°C | "Only way to serve sirloin" |
| Leila Lindholm / ICA | 55-57°C | "Torkar snabbt" — lean |
| French (Bacquié) | 50-53°C saignant | Rarer preference for lean |
| Donna Hay (AU) | 54-57°C | |

**Verdict: medium_rare (54-57°C)**, but with more urgency than ribeye — the lean muscle
dries rapidly above 57°C. Target the lower end of the medium_rare range (54-55°C) for
the best juicy-tender balance.

## What makes sirloin × pan_sear different from ribeye × pan_sear
Same target temperature, but the *texture at that temperature* is entirely different.
Ribeye at 54°C: buttery, rich, fat-lubricated. Sirloin at 54°C: firm, clean "beefy chew",
no fat melting, every degree matters. The recommended technique note (pull earlier, don't
go past 57°C) is unique to this lean cut.

## Data applied
- Add `charcoal_grill` to sirloin `supported_methods`.
- `recommended_doneness = "medium_rare"` (54°C target).
- No `method_temperature_ranges` override for pan_sear — default ranges apply.
