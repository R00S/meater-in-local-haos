# Kitchen Cooking Engine — User Guide

> **Version:** 0.6.2.07 · Home Assistant 2024.1.0+
>
> This guide covers every feature of the Kitchen Cooking Engine from first installation
> through advanced use. Use the table of contents to jump to the section you need.

---

## Table of Contents

1. [What is Kitchen Cooking Engine?](#1-what-is-kitchen-cooking-engine)
2. [Installation](#2-installation)
3. [Adding Appliances (First-Time Setup)](#3-adding-appliances-first-time-setup)
   - 3.1 [MEATER+ Temperature Probe](#31-meater-temperature-probe)
   - 3.2 [Ninja Combi SFP700EU](#32-ninja-combi-sfp700eu)
   - 3.3 [De'Longhi MultiFry FH1394](#33-delonghi-multifry-fh1394)
   - 3.4 [Standard Oven](#34-standard-oven)
   - 3.5 [Stovetop](#35-stovetop)
   - 3.6 [Microwave Oven](#36-microwave-oven)
   - 3.7 [Custom Appliance](#37-custom-appliance)
4. [The Main Panel](#4-the-main-panel)
   - 4.1 [Welcome Screen](#41-welcome-screen)
   - 4.2 [Settings Cards](#42-settings-cards)
5. [MEATER Probe Cooking](#5-meater-probe-cooking)
   - 5.1 [Starting a Cook](#51-starting-a-cook)
   - 5.2 [Selecting Protein, Cut, and Doneness](#52-selecting-protein-cut-and-doneness)
   - 5.3 [Temperature Data Sources](#53-temperature-data-sources)
   - 5.4 [Custom Temperature Cook](#54-custom-temperature-cook)
   - 5.5 [Monitoring an Active Cook](#55-monitoring-an-active-cook)
   - 5.6 [Resting and Completing a Cook](#56-resting-and-completing-a-cook)
   - 5.7 [Recent MEATER Cooks](#57-recent-meater-cooks)
   - 5.8 [MEATER+ (experimental) — Safety Indicators](#58-meater-experimental--safety-indicators)
   - 5.9 [MEATER+ (experimental) — Cut Profile & Recipe Links](#59-meater-experimental--cut-profile--recipe-links)
   - 5.10 [Contributing Recipe Files](#510-contributing-recipe-files)
6. [Ninja Combi Cooking](#6-ninja-combi-cooking)
   - 6.1 [Built-in Recipes](#61-built-in-recipes)
   - 6.2 [Recipe Builder](#62-recipe-builder)
   - 6.3 [Using the MEATER+ Probe with Ninja Combi](#63-using-the-meater-probe-with-ninja-combi)
   - 6.4 [Recent Ninja Cooks](#64-recent-ninja-cooks)
7. [AI Recipe Builder](#7-ai-recipe-builder)
   - 7.1 [Setting Up an AI Agent](#71-setting-up-an-ai-agent)
   - 7.2 [Selecting Ingredients](#72-selecting-ingredients)
   - 7.3 [Choosing a Cooking Style](#73-choosing-a-cooking-style)
   - 7.4 [Reading AI Recipe Suggestions](#74-reading-ai-recipe-suggestions)
   - 7.5 [Starting an AI Recipe Cook](#75-starting-an-ai-recipe-cook)
8. [Recipe Cook Flow](#8-recipe-cook-flow)
   - 8.1 [Overview Page](#81-overview-page)
   - 8.2 [Adjusting Serving Size](#82-adjusting-serving-size)
   - 8.3 [Step-by-Step Guide](#83-step-by-step-guide)
   - 8.4 [MEATER Probe as a Recipe Subprocess](#84-meater-probe-as-a-recipe-subprocess)
   - 8.5 [Rating a Cook](#85-rating-a-cook)
   - 8.6 [Running Multiple Parallel Cooks](#86-running-multiple-parallel-cooks)
9. [Shelf Management](#9-shelf-management)
   - 9.1 [Enabling Shelf Management](#91-enabling-shelf-management)
   - 9.2 [Adding and Removing Items](#92-adding-and-removing-items)
   - 9.3 [Shelf Locations](#93-shelf-locations)
   - 9.4 [Cooking Modes (A / B / C)](#94-cooking-modes-a--b--c)
   - 9.5 [Post-Cook Shelf Update](#95-post-cook-shelf-update)
10. [Shopping List](#10-shopping-list)
    - 10.1 [Adding Items](#101-adding-items)
    - 10.2 [Checking Off Items](#102-checking-off-items)
    - 10.3 [Exporting to HA Shopping List](#103-exporting-to-ha-shopping-list)
11. [Cook History](#11-cook-history)
    - 11.1 [Viewing Past Cooks](#111-viewing-past-cooks)
    - 11.2 [Restarting a Previous Cook](#112-restarting-a-previous-cook)
    - 11.3 [Editing Notes](#113-editing-notes)
    - 11.4 [Deleting a Cook](#114-deleting-a-cook)
12. [Language and Measurement Settings](#12-language-and-measurement-settings)
13. [Developer Services Reference](#13-developer-services-reference)
14. [Troubleshooting](#14-troubleshooting)

---

## 1. What is Kitchen Cooking Engine?

Kitchen Cooking Engine (KCE) is a Home Assistant custom integration that turns your HA
dashboard into a full kitchen assistant. It combines:

- **Temperature-guided cooking** — connect your MEATER+ wireless probe and get live
  temperature readings, dynamic ETA, resting timers, and mobile notifications, all inside
  Home Assistant.
- **Step-by-step recipe guides** — follow Ninja Combi programmes or AI-generated recipes
  with ingredient-aware step instructions, elapsed timers, and in-cook serving scaling.
- **Ingredient shelf tracking** — know what you have, use AI to cook only from your shelf,
  and keep a shopping list that syncs to the HA native shopping list.
- **Multi-appliance support** — one dashboard tile can manage a MEATER probe, a Ninja Combi,
  a De'Longhi MultiFry, a standard oven, a stovetop, a microwave, or any custom appliance.
- **Cook history** — every session is saved with temperature data, ratings, and notes so you
  can restart, learn, and improve.

KCE runs entirely locally. No cloud account is needed except for optional AI recipe
generation, which uses whichever conversation agent you have configured in Home Assistant
(e.g. OpenAI, Ollama, Google Generative AI).

---

## 2. Installation

### Via HACS (recommended)

1. In HACS, go to **Integrations** → **⋮ menu** → **Custom repositories**.
2. Add `https://github.com/R00S/meater-in-local-haos` with category **Integration**.
3. Find **Kitchen Cooking Engine** in HACS and click **Download**.
4. Restart Home Assistant.

### Manual installation

1. Copy the `custom_components/kitchen_cooking_engine` folder into
   `<config>/custom_components/`.
2. Restart Home Assistant.

### First run

After restarting, go to **Settings → Devices & Services → Add Integration** and search for
**Kitchen Cooking Engine**. Add at least one appliance (see [Section 3](#3-adding-appliances-first-time-setup)).

The panel is automatically registered in the HA sidebar as **Kitchen Cooking Engine**.
The JS resource is also auto-registered as a Lovelace module, so you can embed the panel
in any dashboard view with a single card:

```yaml
type: custom:kitchen-cooking-card
```

No manual resource configuration is required.

---

## 3. Adding Appliances (First-Time Setup)

Each "appliance" in KCE is a configuration entry. You can add the same appliance type
multiple times (e.g., two ovens). Go to **Settings → Devices & Services → Add Integration →
Kitchen Cooking Engine** to add an appliance.

### 3.1 MEATER+ Temperature Probe

Select **MEATER+ Temperature Probe** when you have a MEATER probe paired via Bluetooth
proxy or the MEATER HA integration.

Configuration fields:
| Field | Description |
|-------|-------------|
| **Name** | Display name shown on the welcome screen (e.g. "Backyard MEATER") |
| **Entity ID** | The `sensor.*` entity created by the MEATER integration or by another KCE probe setup |

The probe creates a `sensor.kitchen_cooking_engine_*_cooking_session` entity in HA. KCE
reads `current_temp`, `ambient_temp`, `target_temp_c`, `eta_minutes`, `battery_level`, and
`progress` attributes from this entity during an active cook.

### 3.2 Ninja Combi SFP700EU

Select **Ninja Combi SFP700EU**. No extra configuration is needed. KCE includes a database
of 31 built-in Ninja Combi programmes as well as a recipe builder and AI integration.

### 3.3 De'Longhi MultiFry FH1394

Select **De'Longhi MultiFry FH1394** and enter a display name. The MultiFry uses air-fry
and steam modes; KCE adapts cooking time calculations accordingly.

### 3.4 Standard Oven

Select **Standard Oven**. Optional configuration:
| Field | Description |
|-------|-------------|
| **Has convection** | Enables convection-adjusted time estimates |
| **Has steam injection** | Enables steam-mode recipe compatibility |
| **Has broiler / grill** | Shows grill-mode recipes |

### 3.5 Stovetop

Select **Stovetop** and enter a display name. Supports pan-sear, pan-fry, sauté, braise,
poach, simmer, and boil methods.

### 3.6 Microwave Oven

Select **Microwave Oven**. Optional configuration:
| Field | Description |
|-------|-------------|
| **Has convection** | Enables convection microwave programmes |
| **Has grill** | Enables grill/crisp programmes |

### 3.7 Custom Appliance

Select **Custom Appliance** and enter:
| Field | Description |
|-------|-------------|
| **Name** | Anything you like (e.g. "Instant Pot", "Outdoor Kamado") |
| **Description** | Brief note about the appliance used to tune AI recipes |

Custom appliances support all cooking methods. The AI uses the description to tailor
programme steps and temperatures.

---

## 4. The Main Panel

### 4.1 Welcome Screen

The welcome screen is the home base. From here you can:

- **Select an appliance** — tap any configured appliance card to open its cooking path.
- **See ongoing cooks** — active recipe cooks show live badges. Tap a badge to return to that
  cook's step-by-step guide.
- **Open a cook started on another device** — if someone else started a cook on a different
  browser/tablet, it appears under "Started on another device" and can be adopted.
- **Access Previous Cooks** — full cook history for temperature-based cooks.

### 4.2 Settings Cards

At the bottom of the welcome screen are three persistent settings cards:

| Card | What it controls |
|------|-----------------|
| **🌐 Language** | Switch between English and Swedish. Changes take effect immediately. |
| **🌍 Temperature Data Source** | International (USDA) or Swedish (Livsmedelsverket / Stekguiden.se). |
| **📏 Measurement System** | US (cups, °F), UK (ml, dl, g, °C), or Swedish (krm, tsk, msk, dl, °C). |

---

## 5. MEATER Probe Cooking

Tap your **MEATER+ probe** appliance card to enter the MEATER Cooking path.

### 5.1 Starting a Cook

Two entry points appear:

- **🍳 Start MEATER Cooking** — guided protein-selection flow.
- **📋 Recent MEATER Cooks** — restart or review past cooks.

Tap **Start MEATER Cooking** to begin.

### 5.2 Selecting Protein, Cut, and Doneness

The setup form has five steps:

**1️⃣ Select Category**
| Category | Examples |
|----------|---------|
| Beef | Steak, roast, brisket |
| Pork | Chop, tenderloin, shoulder |
| Poultry | Chicken, turkey, duck |
| Fish | Salmon, tuna, white fish |
| Lamb | Rack, leg, shoulder |
| Game | Venison, wild boar, bison |
| Vegetables | Root veg, green veg, alliums |

There is also **🎯 Custom Temperature Cook** (see [Section 5.4](#54-custom-temperature-cook)).

**2️⃣ Select Cut Type** — broad category, e.g. "Steaks" or "Roasts".

**3️⃣ Select Cut** — specific cut, e.g. "Ribeye". Target temperature ranges are pre-filled
from USDA or Livsmedelsverket data depending on your data source setting.

**4️⃣ Select Doneness**
| Doneness | Typical range (beef steak) |
|----------|---------------------------|
| Rare | 49–54 °C / 120–130 °F |
| Medium-Rare | 55–57 °C / 131–134 °F |
| Medium | 60–63 °C / 140–145 °F |
| Medium-Well | 65–68 °C / 149–155 °F |
| Well-Done | 71+ °C / 160+ °F |
| Pulled | 88–96 °C / 190–205 °F |

⚠️ Doneness values shown for beef steaks as an example. Each cut has its own calibrated
ranges from the selected data source.

**5️⃣ Cooking Method**
| Method | Description |
|--------|-------------|
| Oven Roast | Low-and-slow dry heat |
| Oven Bake | Standard bake (bread, casseroles) |
| Pan Sear | High-heat stovetop |
| Pan Fry | Medium stovetop |
| Grill | Outdoor/indoor grill |
| Charcoal Grill | Charcoal with smoke ⚠️ outdoor only |
| Smoker | Low-and-slow with wood smoke |
| Air Fryer | Circulating hot air |
| Sous Vide | Precision water bath |
| Slow Cooker | 8–12 h moist heat |
| Braise | Covered pot with liquid |
| Steam | Moist direct steam |
| and more... | |

After selecting all five, a **Review and Start** summary appears. Confirm to begin monitoring.

### 5.3 Temperature Data Sources

Switch the data source in the welcome screen settings card:

- **🇺🇸 International (USDA)** — USDA and FDA guidelines, temperatures in °C and °F.
- **🇸🇪 Svenska (Livsmedelsverket)** — Swedish food safety authority recommendations,
  Stekguiden.se, and Gårdssällskapet. Doneness names appear in Swedish.

Both trees are available simultaneously. You can hide the entire Temperature Data Source
selection card during cooking by checking **"Dölj det andra språkets träd" / "Hide other
language tree"** in the Language settings card on the welcome screen. When checked, the
data-source card is hidden from the MEATER cook start screen and the active data source
automatically follows your UI language (Swedish language → Swedish temperature tree;
English language → International tree). Your language choice is remembered across page
reloads and new browsers.

### 5.4 Custom Temperature Cook

Tap **🎯 Custom Temperature Cook** on the category screen to skip protein selection and
enter a target directly:

| Field | Description |
|-------|-------------|
| **Session Name** | Friendly name (e.g. "Duck confit") |
| **Target Temperature** | 30–100 °C |

This creates a lightweight probe session without cut/doneness data. Useful for vegetables,
fish preparations, or any food not in the database.

### 5.5 Monitoring an Active Cook

Once a cook is started:

```
┌─────────────────────────────────────────────────┐
│  🔥 Cooking                       [🏠] [⏹]      │
│                                                  │
│  Ribeye  •  medium-rare                          │
│                                                  │
│   Tip Temp        Target           Ambient       │
│   54 °C           57 °C            185 °C        │
│                                                  │
│  ████████████░░░░░░░░  68%                       │
│  ETA: ~8 min                                     │
│                                                  │
│  🔋 85%                                          │
└─────────────────────────────────────────────────┘
```

- **Tip Temp** — internal meat temperature at the probe tip.
- **Target** — your selected doneness temperature.
- **Ambient** — oven/grill environment temperature.
- **Progress bar** — relative progress toward target.
- **ETA** — dynamically recalculated based on the temperature curve.
- **🏠** — minimise to welcome screen (cook keeps running in the background).
- **⏹** — stop the cook without completing or saving.

**Adjust Temperature on the Fly**

Tap **Adjust Temperature** below the temperature display to change the target mid-cook.
Enter a temperature between 30 °C and 100 °C and tap **Set Target**.

**Notes**

Tap **Add Notes** / **Edit Notes** to record observations, seasoning tweaks, or timings.
Notes are saved with the cook history.

### 5.6 Resting and Completing a Cook

When the probe tip reaches the target temperature the status changes to **Goal Reached 🎉**.

- Tap **⏱️ Start Rest** to enter the resting phase. The timer counts down the recommended
  rest time for the cut. Carryover cooking continues during rest.
- Once rest is complete (or at any time), tap **✅ Complete** to save the session to history
  and return to the welcome screen.

### 5.7 Recent MEATER Cooks

Tap **Recent MEATER Cooks** on the MEATER path to browse past sessions. Each card shows:

- Protein, cut, doneness
- Target, peak, after-rest, and final temperatures
- Cook duration and cooking method
- Your ease and result ratings (if recorded)
- Notes

Tap **🔄 Restart This Cook** to pre-fill the setup form with the same settings and start a
new session. Tap **✏️ Edit Notes** to add or change notes. Tap **🗑️ Delete** to remove the
record.

### 5.8 MEATER+ (experimental) — Safety Indicators

The **🧪🌡️ MEATER+ (experimental)** card appears on the welcome screen alongside your regular
MEATER+ card. It uses the same hardware and the same cook flow as the standard MEATER path,
but adds **colour-coded food-safety indicators** to every doneness option so you can see at a
glance whether a temperature meets official guidelines.

> **Safe to use.** It calls the same `start_cook` and `start_simple_probe_cook` services as
> the standard MEATER path. The active cook display is identical.

#### How it works

The cook flow is identical to the standard MEATER path (§ 5.1 – 5.4):

1. **Select category** — Beef / Pork / Poultry / Fish / Game / Vegetables / Custom
2. **Select meat & cut type** — e.g. Beef → Steaks
3. **Select cut** — e.g. Ribeye Steak
4. **Select doneness** — each option now shows a safety-level dot:

| Dot colour | Meaning |
|------------|---------|
| 🟢 Green (safe) | Meets USDA / Livsmedelsverket minimum safe temperatures |
| 🟠 Orange (caution) | Below the official minimum but widely practised for this cut with proper sourcing |
| 🔴 Red (unsafe) | Not recommended; displayed for informational purposes only |

A legend line — **🟢 safe · 🟠 caution (widely practised) · 🔴 below guidelines** — is shown
directly below the Doneness Level heading so you can read it without hovering over any dot.

5. **Fine-tune temperature** (optional) — same slider as the standard path. When your selected
doneness temperature is below the USDA safe minimum for that cut, a highlighted note appears
automatically:

> ⚠️ **Culinary preferred:** 54°C (130°F)  
> 🛡️ **USDA safe minimum for this cut:** 63°C (145°F)  
> Consuming undercooked meat carries food safety risk.

This note only appears when there is a genuine discrepancy between the culinary pull temp and
the cut's official safe minimum — it is absent for vegetables and for any doneness that already
meets the safe minimum.
6. **Choose cooking method** — only the methods supported by the selected cut are shown (derived from the cut's recipe file). On the standard MEATER path all methods are listed; here only the relevant subset appears.
7. **Start** — same `start_cook` service call

#### Custom Temperature mode

Select **🎯 Custom** in Step 1 to enter any temperature between 30 °C and 100 °C with an
optional session name — identical to the **Custom Temperature Cook** option in the
standard MEATER path (§ 5.4).

#### Differences from the standard MEATER path

| | Standard MEATER path | MEATER+ (experimental) |
|-|----------------------|------------------------|
| Cook flow | Category → meat → cut → doneness | Identical |
| Doneness options | Full list for the cut | Full list for the cut |
| Safety indicators | Not shown | **Shown per doneness option** (🟢 / 🟠 / 🔴) |
| Safety legend | Not shown | **Shown below Doneness Level header** |
| USDA minimum note | Not shown | **Shown in Target Temperature card when below safe temp** |
| Cut profile text | Not shown | **Shown after cut selection** |
| Recipe research links | Not shown | **Shown after cut selection** |
| Temperature data source | International or Swedish | **International (USDA) only** |
| Temperature fine-tuning | Available | Available |
| Cooking method selector | All methods shown | **Only methods declared in the cut file** |
| Custom temperature | Available | Available |
| Active cook screen | Standard | Identical |

---

### 5.9 MEATER+ (experimental) — Cut Profile & Recipe Links

When you select a cut in the **MEATER+ (experimental)** path, a **📖 Cut Profile** card
appears immediately below the cut selector — before you choose a doneness level.

#### What it shows

**Cut Profile text** — a brief description of the cut: where on the animal it comes from,
its connective-tissue and fat content, why the selected cooking method suits it, and what
internal temperature behaviour to expect.

**📄 Cut Overview** — a toggle button that opens the cut's overview research file. After
opening, the file's **description paragraph** is shown, followed by a list of **individual
recipe titles** as clickable buttons. Tapping a recipe title opens just that recipe in a
readable card with ingredients, method steps, and pull-temperature guidance. A **← Back to
recipes** button returns to the list, and **✕ Close** closes the viewer.

**📚 Method Research** — a row of pill-shaped buttons, one per cooking method that has an
associated research file. Tapping a method pill opens that file the same way: description
paragraph first, then individual recipe title buttons, then a single-recipe view on tap.

The research files contain 4–6 source recipes drawn from globally diverse published
cookbooks and food websites, with non-Western sources actively prioritised. Traditions
represented include Thai, Vietnamese, Indian, West African, Nigerian/Caribbean, Egyptian,
Turkish, Greek, Japanese, Chinese, Persian, Middle Eastern, Korean, and Australian
alongside European traditions. Each file lists:
- The cut-method description (from `## Cut profile`)
- Ingredients with quantities
- Step-by-step method
- MEATER probe placement instructions
- Pull temperature guidance

#### Example

After selecting **Lamb Shank** in the Lamb → Roasts category, the Cut Profile card shows
a short description of the shank (collagen content, typical fall-off-the-bone target
85–90 °C) and three method research buttons:

| Button | Opens |
|--------|-------|
| Braise | `lamb_shank-braise.md` — description + 4 individual recipes (Mediterranean, Turkish, German, Danish) |
| Slow Cooker | `lamb_shank-slow_cooker.md` — description + 5 recipes (Turkish, German, Greek, Italian, Danish) |
| Oven Roast | `lamb_shank-oven_roast.md` — description + 4 recipes (Turkish, Greek, Italian, Danish) |

Tapping **Braise** shows the cut-method description and a list of four recipe names. Tapping
any name opens just that recipe, showing ingredients and method steps. The ← Back button
returns to the recipe list; ✕ Close dismisses the viewer entirely.

#### How the cut tree and recipe links are built

The recipe library is split into two forks:

| Fork | Directory | Used by |
|------|-----------|---------|
| **Classic** (frozen) | `docs/recipe_research_classic/` | Standard MEATER path |
| **Experimental** (active) | `docs/recipe_research/` | MEATER+ (experimental) path |

The classic fork is a one-time snapshot that never changes. The experimental fork is where
all new cut files, method research, and stub upgrades happen. When the experimental path is
declared stable the classic fork is deleted and experimental becomes the default.

Each file carries a `<!-- KCE:CUT … -->` or `<!-- KCE:CUT_METHOD … -->` tag that describes
its position in the meat hierarchy, cooking temperatures, and supported methods.

At release time the **create-test-release** GitHub Actions workflow automatically runs
`generate_frontend_data.py`, which scans both forks and bakes `RECIPE_INDEX` /
`CLASSIC_RECIPE_INDEX`, `EXP_TREE`, and `CUT_PROFILES` / `CLASSIC_CUT_PROFILES` into
`kitchen-cooking-panel.js`. This happens on the CI runner — the developer does not need
to run the generator locally before creating a release.

To add a new cut to the experimental path:

1. Create `docs/recipe_research/<category>/<cut>/{slug}.md` with a `<!-- KCE:CUT … -->` tag.
2. Optionally add `{slug}-{method}.md` files for each cooking method.
3. Push the files and trigger a test release — the generator runs automatically.

To add a new cooking method to an **existing** cut (including entirely new methods not yet
known to the system):

1. Add the method slug to the cut's `<!-- KCE:CUT … -->` `methods:` list.
2. Optionally create `{slug}-{method}.md` research file for that method.
3. No changes to `cooking_data.py` or any other file are required.

> **Note:** Only edit files under `docs/recipe_research/` (the experimental fork).
> Never edit `docs/recipe_research_classic/` — it is a frozen snapshot.

---

### 5.10 Contributing Recipe Files

Anyone can contribute cut profiles and recipe research files — no Python knowledge required.
All you need is a text editor and a GitHub account.

#### Suggesting a cut or recipe via a GitHub issue

If you don't want to write the files yourself, open a GitHub issue at
[github.com/R00S/meater-in-local-haos/issues](https://github.com/R00S/meater-in-local-haos/issues)
with the label **recipe-request** and include:

- The protein and cut name (e.g. *Pork — Secreto*)
- Which cooking methods you'd like covered
- Any trusted sources or cookbooks you recommend

A maintainer will pick it up.

#### Writing a cut overview file (`{slug}.md`)

Place the file at:
```
docs/recipe_research/<category>/<animal>/{slug}.md
```

The file must start with a `<!-- KCE:CUT … -->` YAML block. Example for a new cut:

```markdown
<!-- KCE:CUT
type: cut
slug: my_cut_slug
name: My Cut Name
category: beef
meat: beef
cut_type: Steaks
usda_safe_c: 63
usda_safe_f: 145
recommended_doneness: medium_rare
methods:
- pan_sear
- grill
doneness:
- name: medium_rare
  target_c: 57
  target_f: 135
  min_c: 54
  min_f: 130
  max_c: 60
  max_f: 140
  usda_safe: false
  recommended: true
- name: medium
  target_c: 63
  target_f: 145
  min_c: 60
  min_f: 140
  max_c: 68
  max_f: 155
  usda_safe: true
-->
# My Cut Name — Cut Overview

## Cut profile

A short paragraph describing the cut: where on the animal it comes from, fat and
connective-tissue content, flavour characteristics, and the ideal internal temperature
range. Mention the pull temperature and expected rise after resting.

## Research files by cooking method

- [Pan Sear](./my_cut_slug-pan_sear.md)
- [Grill](./my_cut_slug-grill.md)
```

**Required `KCE:CUT` fields**

| Field | Description |
|-------|-------------|
| `slug` | Lowercase, underscores, unique within the category. |
| `name` | Human-readable name shown in the GUI. |
| `category` | One of: `beef`, `pork`, `poultry`, `fish`, `lamb`, `game`, `vegetables`. |
| `meat` | Animal name in lowercase (e.g. `beef`, `salmon`, `chicken`). |
| `cut_type` | Sub-category label shown in the GUI (e.g. `Steaks`, `Roasts`). |
| `usda_safe_c` / `usda_safe_f` | USDA minimum safe temperature (°C and °F). |
| `recommended_doneness` | The `name` value of the preferred doneness level. |
| `methods` | List of cooking method slugs supported by this cut. |
| `doneness` | At least one doneness entry (see below). |

Each `doneness` entry needs: `name`, `target_c`, `target_f`, `min_c`, `min_f`, `max_c`, `max_f`, `usda_safe` (true/false). Add `recommended: true` to exactly one entry.

#### Writing a cooking method research file (`{slug}-{method}.md`)

Place the file at:
```
docs/recipe_research/<category>/<animal>/{slug}-{method}.md
```

The file must start with a `<!-- KCE:CUT_METHOD … -->` YAML block:

```markdown
<!-- KCE:CUT_METHOD
type: cut_method
slug: my_cut_slug
method: pan_sear
name: My Cut Name × Pan Sear
category: beef
meat: beef
cut_type: Steaks
-->
# My Cut Name × Pan Sear — Recipe Temperature Research

## Cut profile

Repeat or adapt the cut description from the overview file. Include the recommended
pull temperature and expected rise after resting.

## Source recipes

### 1. Author / Publication — Recipe title
**Source**: Publication name; URL (fetched YYYY-MM-DD)
**Serves**: 2 · **Prep**: 10 min · **Cook**: 20 min

**Ingredients**
- ...

**Method**
1. ...
2. Insert MEATER probe. Pull at **XX °C (XX °F)**.
3. Rest Y minutes.
*Final resting temperature: XX–XX °C (XX–XX °F).*

---

### 2. ...

## Temperature summary

| Doneness | Pull temp | Final (after rest) |
|----------|-----------|-------------------|
| Medium-rare | 52–54 °C (126–129 °F) | 55–57 °C (131–135 °F) |
```

**Recipe sourcing rules — please read before contributing**

- **Cite real, verifiable sources.** Every recipe entry must include the publication name, a URL, and the date you accessed it (or the book title, author, and page number for print sources).
- **Do not fabricate.** Do not invent recipes, temperatures, or sources. If you cannot find a real source for a method, omit that entry.
- **Diversity is valued.** Aim for 3–5 recipes per file. Prioritise sources from different countries and culinary traditions, not just English-language sites.
- **Temperature data must come from the source.** Record the pull temperature and resting target as stated in the recipe, not what you think is correct.
- **MEATER placement note.** Each recipe should end with a brief note on where to insert the probe in that specific cut.

---

## 6. Ninja Combi Cooking

Tap your **Ninja Combi** appliance card to enter the Ninja Combi path.

### 6.1 Built-in Recipes

Tap **📖 Built-in Recipes** to browse 31 pre-configured Ninja Combi programmes. Each card shows:

- Recipe name and description
- Serving size, prep time, and cook time
- Difficulty level
- Required ingredients (summary)
- Ninja Combi mode, temperature, and time
- Whether steam is enabled
- Optional MEATER+ probe target (see [Section 6.3](#63-using-the-meater-probe-with-ninja-combi))

Tap **🍳 Start Cooking** to enter the step-by-step recipe cook flow (see
[Section 8](#8-recipe-cook-flow)).

You can also tap **🛠️ Modify in Builder** to open the recipe in the Recipe Builder with
pre-filled settings.

Filter by keyword using the search bar at the top.

### 6.2 Recipe Builder

Tap **🔨 Recipe Builder** to create a custom Ninja Combi recipe. Four steps:

**1️⃣ Select Base (Required)**
Choose a starchy base: white rice, brown rice, pasta, quinoa, couscous, etc. The builder
calculates water volume, steam requirements, and timing from this choice.

**2️⃣ Select Protein (Required)**
Choose from chicken, beef, pork, fish, tofu, etc. The builder calculates the Combi mode,
temperature, and cook time from the protein and base combination.

**3️⃣ Add Vegetables (Optional)**
Add up to two vegetable groups. The builder places tender vegetables with the base (gentle
heat) and crispy vegetables with the protein (high heat).

**4️⃣ MEATER+ Probe (Optional)**
Toggle on to add probe temperature monitoring. The probe target is calculated from the
selected protein.

Tap **✨ Build Custom Recipe** to see the calculated parameters:

| Parameter | Description |
|-----------|-------------|
| Temperature | Ninja Combi oven temperature |
| Cook Time | Total programme time |
| Water | Water volume for steam reservoir |
| Mode | Ninja Combi programme mode |
| Probe Target | Internal temperature target (if probe enabled) |

Tap **🚀 Start Recipe** to start the cook.

### 6.3 Using the MEATER+ Probe with Ninja Combi

Any Ninja Combi recipe that includes a probe target shows a **🌡️ Start MEATER+ Probe**
button on relevant recipe steps (see [Section 8.4](#84-meater-probe-as-a-recipe-subprocess)).
This starts a lightweight probe monitoring session as a subprocess of the recipe cook — you
can watch the live tip temperature in the recipe footer without leaving the step guide.

### 6.4 Recent Ninja Cooks

Tap **📋 Recent Cooks** to see previous Ninja Combi recipe sessions. Tap a card to view
details or tap **🔄 Restart** to cook it again.

---

## 7. AI Recipe Builder

Tap your appliance card and then **🤖 Create AI Recipe** (or select the AI Recipe Builder
from the welcome screen) to generate recipes with an AI agent.

### 7.1 Setting Up an AI Agent

KCE generates recipes by calling a Home Assistant conversation agent. Before using the AI
Recipe Builder:

1. Set up a conversation integration in HA (OpenAI, Ollama, Google Generative AI, etc.).
2. In the AI Recipe Builder, tap **⚙️ AI Settings**.
3. Enter your **AI Agent ID** — find it in **Developer Tools → States** by searching for
   entities starting with `conversation.`.
4. Optionally enter a **Backup Agent ID** used when the primary is overloaded.
5. Tap **Save Settings**.

### 7.2 Selecting Ingredients

**Step 1️⃣: Select Ingredients**

The ingredient screen has two sections:

- **Cuisine / Region filter** — optionally choose one or more cuisine regions to narrow
  ingredient suggestions. Selecting multiple regions creates fusion combinations. Over 80
  cuisines are available.
- **Ingredient grid** — tap ingredients to select them (minimum 2 required). Selected
  ingredients appear in the "Selected Ingredients" panel above.
- **Custom ingredient** — type any ingredient in the text field and tap **＋ Add** to add
  it, even if it's not in the list.
- **Compulsory ingredients** — after adding an ingredient, tap its badge to mark it as
  ⭐ Compulsory. The AI is instructed that it *must* use that ingredient. Tap again to
  toggle back to optional. Tap **×** to remove.

Staple ingredients (salt, pepper, oil, etc.) are assumed available and listed below the grid
for reference.

Tap **Next: Choose Cooking Style** when you have at least 2 ingredients selected.

### 7.3 Choosing a Cooking Style

**Step 2️⃣: Choose Cooking Style**

Select a cooking style from the grid (e.g., Quick & Easy, Comfort Food, Healthy, Gourmet).
The style influences recipe complexity, technique, and calorie profile.

Adjust the three sliders:

| Slider | Range | Effect |
|--------|-------|--------|
| 📊 Complexity | 1–5 | 1 = very simple; 5 = chef-level techniques |
| 🍽️ Portions | 1–12 | Number of people; ingredients are pre-scaled accordingly |
| ⏱️ Max Time | No limit – 60 min | Filters out recipes that take too long |

Tap **Generate Recipes 🤖** to submit to the AI.

### 7.4 Reading AI Recipe Suggestions

KCE sends your selection to the AI agent and returns up to three recipe suggestions. Each
card shows:

- Recipe name with a **📖 Classic** or **🤖 Original** badge
- Description
- Cook time, serving size (editable — see [Section 8.2](#82-adjusting-serving-size)), difficulty
- Key ingredients
- A **Start Cooking This Recipe** button

If generation fails (AI busy, timeout, etc.) the panel retries automatically and shows a
live status message. You can cancel at any time.

Tap **🔄 Generate Different Recipes** to try a fresh set with the same settings.

### 7.5 Starting an AI Recipe Cook

Tap **Start Cooking This Recipe** on any suggestion card. KCE fetches the full recipe
detail from the AI (instructions, step-by-step ingredients, tips, total time, probe
target if applicable). A progress dialog shows while this loads (usually 10–30 seconds).

Once loaded, the step-by-step recipe cook flow begins (see [Section 8](#8-recipe-cook-flow)).

---

## 8. Recipe Cook Flow

Any recipe — Ninja built-in, Ninja builder, or AI-generated — uses the same cook flow.

### 8.1 Overview Page

The first page is a read-before-cooking overview:

- Recipe description
- Total time
- Full ingredients list (scaled to serving size if adjusted)
- Numbered step summary with estimated time per step

Navigate with the **→** button (top left) or tap **→** to advance to Step 1.

### 8.2 Adjusting Serving Size

On AI recipe suggestion cards, a **Servings** number input appears. Change it before
tapping "Start Cooking" to scale the ingredient amounts. The scaled recipe is passed
directly into the cook flow so both the overview page and each step use the adjusted
quantities.

Ingredient scaling uses intelligent rounding:

| Amount range | Rounding |
|-------------|---------|
| ≥ 50 | nearest 5 |
| 10 – 49 | nearest integer |
| 2 – 9 | nearest 0.5 |
| < 2 | nearest 0.25 |

Fractions like "1/2" in AI recipe text are parsed before scaling.

### 8.3 Step-by-Step Guide

The step header shows **Step N of M** and an estimated time for the step.

Ingredients are colour-coded on each step:

- 🟢 **Green** — ingredients introduced for the first time in this step.
- ⚫ **Black** — ingredients used in this step that appeared earlier.
- 🔘 **Grey (two columns)** — remaining ingredients not needed in this step.

Below the ingredient lists, the step instruction text and any tip notes are displayed.

Navigate with **←** (previous step) and **→** (next step). Press 🏠 to minimise the cook to
the welcome screen badge — the timer keeps running.

### 8.4 MEATER Probe as a Recipe Subprocess

If an AI recipe (or Ninja built-in recipe) includes a temperature target (`use_probe: true`
and a `target_temp_c`), a probe card appears on each relevant step:

```
┌────────────────────────────────────────────────┐
│  🌡️ Start MEATER Probe                         │
│  Target: 75 °C                                 │
│                              [Start MEATER Probe] │
└────────────────────────────────────────────────┘
```

Tap **Start MEATER Probe** to:

1. KCE finds the first available `cooking_session` entity (MEATER preferred).
2. Calls `kitchen_cooking_engine.start_simple_probe_cook` with the recipe target.
3. A live temperature badge appears in the recipe footer:
   `🌡️ 54 °C   75 °C target  [×]`

The probe session is a **subprocess of the recipe cook** — it is not a separate MEATER
probe cook. Temperature data is saved as part of the recipe cook history.

Tap **×** in the footer to detach the probe display (the probe session continues running
independently).

### 8.5 Rating a Cook

The final page asks for two ratings:

| Rating | Stars | Description |
|--------|-------|-------------|
| 😊 Ease | 1–5 | How easy was this recipe to follow? |
| 😋 Result | 1–5 | How good was the result? |

Both ratings must be filled in before you can save. Add any notes in the text field, then
tap the **✓** save button to store the cook in history and return to the welcome screen.

### 8.6 Running Multiple Parallel Cooks

You can start a second recipe cook while the first is in progress. The welcome screen shows
a badge for each active cook. Tap a badge to switch to that cook's step guide. All cook
timers run simultaneously.

---

## 9. Shelf Management

Shelf Management lets you track what you have at home so the AI can suggest recipes based
on your actual inventory.

### 9.1 Enabling Shelf Management

On the welcome screen, find the **🗄️ Shelf Management** settings card and toggle
**Enable Shelf Management** on. Once enabled, the cooking mode selector appears in the AI
Recipe Builder (see [Section 9.4](#94-cooking-modes-a--b--c)).

### 9.2 Adding and Removing Items

1. From the welcome screen go to an appliance → **AI Recipe Builder** →
   on the welcome card, tap **🗄️ Shelf** (or navigate directly if a shortcut is configured).
2. Tap **＋ Add Item**.
3. Enter an **Item name** (required) and optional **Quantity** (e.g. "500 g", "3 cans").
4. Select a **Location** (see [Section 9.3](#93-shelf-locations)).
5. Tap **Save**.

To remove an item, tap **Remove** next to it.

### 9.3 Shelf Locations

Items are grouped by location for easy scanning:

| Icon | Location |
|------|---------|
| 🧊 | Fridge |
| 🏺 | Larder / Pantry |
| ❄️ | Freezer |
| 🧂 | Spices & Seasonings |

### 9.4 Cooking Modes (A / B / C)

When shelf management is enabled, the AI Recipe Builder shows a cooking mode selector
before generating recipes:

| Mode | Label | Behaviour |
|------|-------|-----------|
| **A** | Ignore Shelf | Generate freely from selected ingredients (shelf not considered) |
| **B** | Cook Now | Use **only** what you currently have on your shelf + selected ingredients; AI avoids requiring anything you don't have |
| **C** | Cook Later | Generate the best recipe; missing ingredients are listed in a **Step 0 — Shopping & Preparation List** prepended to the instructions |

> **Tip:** Mode C is useful for meal planning. You get the recipe you want and an automatic
> shopping list for the missing items.

### 9.5 Post-Cook Shelf Update

After saving a recipe cook (on the rating page), KCE checks whether any recipe ingredients
match items on your shelf and offers a quick update:

1. A checklist of matching items appears. Check the items you used up.
2. Tap **Update Shelf** to remove the checked items from your shelf.
3. Tap **🛒 Add Depleted to Shopping List** to move un-checked items (things you're running
   low on but didn't check off) to the Shopping List and also push them to the HA native
   Shopping List.
4. Tap **Skip** to dismiss without changes.

---

## 10. Shopping List

The Shopping List is KCE's built-in list for tracking ingredients you need to buy.

### 10.1 Adding Items

Items are added automatically in two ways:

- **Mode C recipe generation** — missing ingredients are added as a Step 0 shopping list.
- **Post-cook shelf update** — tapping "Add Depleted to Shopping List" (see
  [Section 9.5](#95-post-cook-shelf-update)).

You can also add items manually via the Shopping List screen's add-item form (accessible
from the Shelf Management screen via **🛒 Shopping List**).

### 10.2 Checking Off Items

Each list item has a checkbox. Tap it to toggle between:

- **Need it** — item not yet purchased.
- **Got it** — item in your basket; item is shown with strikethrough and faded.

Tap **Clear Checked** to remove all checked items in one step.

### 10.3 Exporting to HA Shopping List

Tap **📤 Export to HA Shopping List** (shown when the list has unchecked items) to push
all unchecked items to your Home Assistant native `todo.shopping_list` entity via the
`todo.add_item` service.

- KCE looks for `todo.shopping_list` first; if absent it uses the first `todo.*` entity found.
- A toast shows how many items were pushed.
- If no HA todo entity is found, items remain in the KCE list with a notice.

This lets you share the shopping list with other HA users, view it in the HA mobile app,
or use a HA automation to send it to a messaging platform.

---

## 11. Cook History

### 11.1 Viewing Past Cooks

Tap **Previous Cooks** on the welcome screen to open the cook history. Each card shows:

- Cook type (temperature-based, recipe, Ninja Combi, AI recipe)
- Date and duration
- Protein, cut, doneness (for temperature cooks)
- Recipe name (for recipe cooks)
- Temperature data: target, peak, after-rest, final
- Cooking method
- Ease and result ratings (⭐ 1–5)
- Notes

### 11.2 Restarting a Previous Cook

Tap **🔄 Restart This Cook** to:

- For **temperature cooks** — pre-fill the MEATER setup form with the same protein, cut,
  doneness, and method, then start a new probe session.
- For **recipe cooks** — restart the same recipe cook flow from the overview page.

### 11.3 Editing Notes

Tap **✏️ Edit Notes** on any history card to add or update notes. Changes save immediately.

### 11.4 Deleting a Cook

Tap **🗑️ Delete** and confirm to permanently remove the cook record.

---

## 12. Language and Measurement Settings

All settings are on the welcome screen in the bottom settings cards.

**Language**

| Option | Description |
|--------|-------------|
| 🇬🇧 English | All UI text in English |
| 🇸🇪 Svenska | All UI text in Swedish |

Language changes apply immediately without a page reload.

**Temperature Data Source**

| Option | Standard | Language |
|--------|----------|---------|
| 🇺🇸 International | USDA / FDA / Professional culinary | English doneness names |
| 🇸🇪 Svenska | Livsmedelsverket / Stekguiden.se | Swedish doneness names |

Both data trees are always available. The selected source determines which recommended
temperature ranges are shown as default.

**Measurement System**

| System | Volume | Weight | Temp |
|--------|--------|--------|------|
| 🇺🇸 US | tsp, tbsp, cup, fl oz | oz, lb | °F |
| 🇬🇧 UK | tsp, tbsp, ml, dl, L | g, kg | °C |
| 🇸🇪 Swedish | krm, tsk, msk, cl, dl, L | g, hg, kg | °C |

All ingredient amounts in AI-generated recipes and on-screen displays are automatically
converted to the selected measurement system.

---

## 13. Developer Services Reference

KCE registers the following HA services that can be called from automations, scripts, or
Developer Tools:

### `kitchen_cooking_engine.start_cook`

Start a temperature-monitored cook session.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target cooking session sensor entity |
| `cut_id` | integer | ✅ | Cut ID from `cooking_data.py` |
| `doneness` | string | ✅ | e.g. `medium_rare`, `well_done`, `pulled` |
| `cooking_method` | string | ✅ | e.g. `oven_roast`, `pan_sear`, `grill` |
| `data_source` | string | | `international` (default) or `swedish` |

### `kitchen_cooking_engine.stop_cook`

Stop an active cook session.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target entity |

### `kitchen_cooking_engine.start_rest`

Transition an active cook to the resting phase.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target entity |

### `kitchen_cooking_engine.complete`

Mark a cook as complete and save to history.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target entity |

### `kitchen_cooking_engine.set_notes`

Add or update notes for the active cook.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target entity |
| `notes` | string | ✅ | Note text |

### `kitchen_cooking_engine.set_target`

Adjust the target temperature mid-cook.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target entity |
| `target_temp` | integer | ✅ | New target in °C (30–100) |

### `kitchen_cooking_engine.start_simple_probe_cook`

Start a lightweight probe session (temperature-only, no protein/doneness selection).
Used internally by recipe cook subprocesses; also available for automations.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | string | ✅ | Target cooking session entity |
| `target_temp_c` | integer | ✅ | Target internal temperature in °C |
| `session_name` | string | | Display name (default: "Simple Probe Cook") |

### `kitchen_cooking_engine.start_multi_appliance_cook`

Start a cook session that spans multiple appliance entities simultaneously.

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `entity_id` | list | ✅ | List of entity IDs |
| `cut_id` | integer | ✅ | Cut ID |
| `doneness` | string | ✅ | Doneness level |
| `cooking_method` | string | ✅ | Cooking method |

---

## 14. Troubleshooting

### Panel shows "Reloading Kitchen Cooking Engine…" in a loop

This usually means a JavaScript error crashed the LitElement render. Check the browser
console (F12) for error messages. Common causes:

- Stale cache — hard-reload with Ctrl+Shift+R / Cmd+Shift+R.
- HACS update not fully applied — restart Home Assistant.
- Corrupt `sessionStorage` — open browser DevTools → Application → Storage → Clear site data.

### No appliances shown on the welcome screen

Go to **Settings → Devices & Services** and confirm at least one Kitchen Cooking Engine
entry exists. If not, add one (see [Section 3](#3-adding-appliances-first-time-setup)).

### MEATER probe shows `--` temperature (no reading)

- Take the probe out of its charger — the MEATER probe only transmits when out of the dock.
- Confirm the MEATER Bluetooth proxy is active and the `sensor.*_cooking_session` entity
  exists in HA Developer Tools.
- Ensure a cook has been started — the probe only reports temperature during an active session.

### AI recipe generation fails or hangs

- Confirm your conversation agent is properly configured in HA (test it in Developer Tools
  → Assist).
- Check the AI Agent ID in **AI Settings** — it should start with `conversation.`.
- If the primary agent is overloaded, set a **Backup Agent ID** in settings.
- The AI may rate-limit for heavy usage; the panel retries automatically.

### "No HA Shopping List found" when exporting

KCE requires a `todo.*` entity. Add the native **Shopping List** integration via
**Settings → Devices & Services → Add Integration → Shopping List**.

### Shelf items / shopping list disappeared after restart

Shelf and shopping list data is stored in `<config>/.storage/kitchen_cooking_engine_*.json`.
Check that the HA config directory is writable and not running out of disk space.

### Services not available in automations

Reload the integration: **Settings → Devices & Services → Kitchen Cooking Engine →
⋮ → Reload**. If services still don't appear, restart Home Assistant.

### Measurement conversions look wrong

Ensure the **Measurement System** setting matches your recipe source. US recipes use cups and
°F; Swedish recipes use dl and °C. Changing the system converts all displayed amounts in real time.

---

*Kitchen Cooking Engine is open-source and community-supported. Found a bug or want a feature?
Open an issue at [github.com/R00S/meater-in-local-haos/issues](https://github.com/R00S/meater-in-local-haos/issues).*
