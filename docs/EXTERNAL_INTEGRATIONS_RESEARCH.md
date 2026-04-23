# External Integrations Research

**Created:** 2026-03-17 11:58:31  
**Author:** Project Owner + Copilot  
**Context:** Research conducted during Phase 8 planning to determine how Kitchen Cooking Engine should interface with the broader HA food/cooking ecosystem.

---

## 1. Executive Summary

After evaluating Grocy, Cooklang, Mealie, KitchenOwl, and the HA native ecosystem, the decision is:

> **Option C (Hybrid): Build a self-implemented shelf (Phase 8a), then add optional thin bridges to external systems (Phase 8b+).**

The most impactful integration is **HA's native `todo.add_item`** (350,000 active installs), not Grocy (~2,000–4,000). Grocy, Mealie, and KitchenOwl are valuable read-only bridge targets for users who already run them, but none should be a dependency.

---

## 2. HA Ecosystem Popularity Data

Data from [analytics.home-assistant.io](https://analytics.home-assistant.io) (opt-in, ~483,000 users):

| System | Type | HA Installs (est.) | Open Source | License | API | Relevance |
|--------|------|-------------------|-------------|---------|-----|-----------|
| **HA Shopping List / Todo** | Shopping list | **~350,000** | Yes (core) | Apache 2.0 | `todo.add_item` | ✅ **Critical** — output target for shopping lists |
| **Grocy** | Household ERP / inventory | **~2,000–4,000** | Yes | MIT | REST API | ⚠️ Read-only stock bridge |
| **Mealie** | Recipe manager + meal planner | **~2,000** (HACS) | Yes | MIT | REST API | ⚠️ Recipe ingredient import |
| **KitchenOwl** | Shopping + recipes + inventory | **Growing** (newer) | Yes | AGPL-3.0 | REST API | 🔍 Watch — rising star |
| **Tandoor Recipes** | Recipe manager | **~1,000–2,000** | Yes | AGPL-3.0 | REST API | 🔍 Watch — AGPL complicates code reuse |
| **Bring!** | Shopping list app | Unknown | No | Proprietary | Partial | ❌ Closed ecosystem |
| **Paprika** | Recipe manager | Unknown | No | Proprietary | No | ❌ No API |

### Key Insight

The HA Shopping List (`todo` integration) has **~100x more users** than any food-specific system. This is where "Add missing ingredients" output should go.

---

## 3. Grocy Analysis

### 3.1 What Grocy Offers

Grocy is a self-hosted "ERP beyond your fridge" — a full household inventory management system.

**Useful API endpoints for us:**

| Endpoint | Returns | Usefulness |
|----------|---------|------------|
| `GET /api/stock` | All products in stock: name, amount, best-before, location | ✅ **The gold mine** — one call gives a flat "what the user has" list |
| `GET /api/objects/products` | Product master data | ⚠️ For name resolution if needed |
| `GET /api/stock/locations` | Storage locations | ❌ Over-detailed for our needs |
| `GET /api/objects/shopping_list` | Grocy's own shopping list | ❌ We prefer HA's `todo.add_item` |

**Not useful to us:**
- Barcode scanning / Barcode Buddy — Grocy's input pipeline, not our concern
- Receipt scanning — Still a feature request ([grocy/grocy#2831](https://github.com/grocy/grocy/issues/2831)), not shipped
- Meal planning / recipes — Overlaps with our AI Recipe Builder
- Expiry tracking — Interesting but adds data model complexity for marginal UX gain

### 3.2 Grocy Mobile App

The Grocy mobile app (primarily [Grocy Android](https://github.com/patzly/grocy-android)) is **not directly relevant to us**, but **indirectly valuable**: users who already scan groceries with the mobile app keep their `GET /api/stock` data up-to-date automatically. Our read bridge benefits from their discipline without us doing any work.

### 3.3 License

| Component | License |
|-----------|---------|
| Grocy (main app) — `grocy/grocy` | MIT |
| Grocy HA add-on — `hassio-addons/addon-grocy` | MIT |

MIT is fully compatible with any license we choose. However, for the read-only bridge we'd only make HTTP API calls — **no license implications at all** for API consumption.

### 3.4 How Integration Paths Affect Existing HA+Grocy Users

| Option | Experience for Grocy users | Experience for non-Grocy users |
|--------|---------------------------|-------------------------------|
| **A (Self only)** | ⚠️ Must duplicate inventory effort | ✅ Works immediately |
| **B (Grocy backend)** | ✅ Seamless | ❌ Must install + populate Grocy first |
| **C (Hybrid)** | ✅ "Import from Grocy" rewards existing investment | ✅ Works immediately standalone |

**Decision: Option C.** It's the only path that respects Grocy users' work without punishing non-Grocy users.

---

## 4. Cooklang Analysis

### 4.1 What Cooklang Is

Cooklang is a lightweight plain-text markup language for recipes. Ingredients, cookware, and timers are tagged inline:

```
Season @chicken breast{500g} with @salt{1 tsp}.
Roast in #oven for ~{25m}.
```

### 4.2 Comparison with Our JSON Recipe Format

| Feature | Cooklang | Our JSON Format | Winner |
|---------|----------|-----------------|--------|
| **Structured ingredient parsing** | ✅ `@item{qty unit}` → name, amount, unit as separate fields | ❌ Free-text strings: "500g chicken breast" | **Cooklang** |
| **Ingredients per step** | ✅ Automatic — inline in step text | ✅ `step_ingredients` parallel array | **Cooklang** (inherent) |
| **Cookware tracking** | ✅ `#oven`, `#mixing bowl` | ❌ Not tracked | **Cooklang** |
| **Timers** | ✅ `~{25m}` — parseable | ❌ Embedded in prose | **Cooklang** |
| **Cooking phases** | ❌ No concept | ✅ `phases[]` with mode, temp_c/f, duration | **Our format** |
| **Temperature probe** | ❌ No concept | ✅ `use_probe`, `target_temp_c/f` | **Our format** |
| **Appliance awareness** | ❌ `#oven` is just a string tag | ✅ Phases tied to `air_fry`, `steam`, `combi` etc. | **Our format** |
| **Dual temperature units** | ❌ Single text | ✅ Always both `temperature_c` + `temperature_f` | **Our format** |
| **Human readability** | ✅ Excellent — reads like a recipe card | ⚠️ JSON — readable by devs | **Cooklang** |
| **Machine parseability** | ⚠️ Needs Cooklang parser | ✅ Standard JSON | **Our format** |
| **i18n / language** | ❌ Written in one language | ✅ AI generates in user's preferred language | **Our format** |
| **Difficulty / metadata** | ⚠️ Freeform `>>` comments | ✅ Structured fields | **Our format** |

### 4.3 Verdict: Do Not Adopt Cooklang

**Our format is purpose-built for appliance-aware, probe-aware, AI-generated cooking.** Cooklang cannot express cooking phases, probe targets, appliance modes, or dual temperature units — our core differentiators.

### 4.4 What to Steal from Cooklang

**Structured ingredient parsing.** Currently our ingredients are free-text strings (`"500g chicken breast"`). For Phase 8 shelf matching, structured data is valuable:

```json
"ingredients": ["500g chicken breast", "2 cups broccoli"],
"ingredients_parsed": [
  {"name": "chicken breast", "amount": 500, "unit": "g"},
  {"name": "broccoli", "amount": 2, "unit": "cups"}
]
```

This solves the shelf-matching problem (matching `"chicken"` on the shelf to `"500g chicken breast"` in a recipe) without adopting Cooklang's format. The AI can return both representations, or we can parse server-side.

### 4.5 Future Import/Export (Low Priority)

| Direction | Transfers cleanly | Lost in translation |
|-----------|-------------------|---------------------|
| **Cooklang → Our JSON** | Ingredients (structured!), instructions, timers → phase durations | No phases, no probe, no appliance modes |
| **Our JSON → Cooklang** | Ingredients as `@name{qty}`, instructions, tips as `>>` | Phases, probe targets, dual temps, difficulty, cuisine |

---

## 5. Mealie Analysis

### 5.1 What Mealie Offers

Mealie is a self-hosted recipe manager and meal planner with ~2,000 HA installations. Modern UI, active development.

**Useful for us:**
- `GET /api/recipes` — Returns recipe with structured ingredients (name, quantity, unit)
- Could enable "Import from Mealie" — pull saved recipes as starting points
- Users who already have recipe collections in Mealie could benefit

**Not useful:**
- Meal planning features — overlaps with our AI Recipe Builder
- Shopping list — we prefer HA's native `todo.add_item`

### 5.2 Integration Path

A thin read bridge could offer "Import recipe ingredients from Mealie" — if a user has a Mealie recipe for "Chicken Tikka Masala", we could pre-populate their ingredient selection in our AI builder. This is a **low priority** nice-to-have.

**License:** MIT — fully compatible.

---

## 6. KitchenOwl Analysis

### 6.1 What KitchenOwl Offers

KitchenOwl is a newer open-source platform combining recipes, inventory management, and shopping lists. Growing rapidly in the HA community.

**Useful for us:**
- Similar to Grocy: has inventory tracking, so a stock read bridge would work
- Similar to Mealie: has recipes, so ingredient import is possible
- API pattern similar to Grocy's

**Watch factors:**
- Growing fast — may become more popular than Grocy for kitchen-specific use
- **AGPL-3.0 license** — cannot incorporate code, but API calls are fine

### 6.2 Integration Path

Same pattern as Grocy: optional read-only bridge to pull current stock. Defer until KitchenOwl's user base grows enough to justify the effort.

---

## 7. Integration Priority Matrix

### Tier 1 — Build For (Phase 8)

| System | Integration | Effort | Reach |
|--------|-------------|--------|-------|
| **HA Shopping List / Todo** | `todo.add_item` service call for "Add missing ingredients" | Trivial (one service call) | ~350,000 users |

### Tier 2 — Read Bridges (Phase 8b or later)

| System | Integration | Effort | Reach |
|--------|-------------|--------|-------|
| **Grocy** | `GET /api/stock` → flatten to shelf as "Available" items | Low (one API call + settings UI for URL/key) | ~2,000–4,000 users |
| **Mealie** | `GET /api/recipes` → import recipe ingredients | Low (one API call) | ~2,000 users |

### Tier 3 — Future / Watch

| System | Integration | Effort | Reach |
|--------|-------------|--------|-------|
| **KitchenOwl** | Stock read bridge (same pattern as Grocy) | Low | Growing |
| **Tandoor** | Recipe import (similar to Mealie) | Low | ~1,000–2,000 (AGPL license — API only) |
| **Cooklang import** | Parse `.cook` files into our recipe format | Medium (needs parser) | Niche |

---

## 8. Architectural Decision: Structured Ingredients

Based on Cooklang analysis, we should add structured ingredient parsing to our recipe format for Phase 8 shelf matching:

**Current format:**
```json
"ingredients": ["500g chicken breast", "2 tbsp olive oil"]
```

**Proposed addition:**
```json
"ingredients": ["500g chicken breast", "2 tbsp olive oil"],
"ingredients_parsed": [
  {"name": "chicken breast", "amount": 500, "unit": "g"},
  {"name": "olive oil", "amount": 2, "unit": "tbsp"}
]
```

**Implementation options:**
1. Ask AI to return both formats in the detail prompt
2. Parse free-text strings server-side in `ai_recipe_builder.py`
3. Both (AI returns parsed, server validates/corrects)

**Decision:** Defer to Phase 8 implementation. Option 1 (AI returns both) is simplest.

---

## 9. Impact on ToR

Based on this research:

1. **Open Question #6 → RESOLVED:** Option C (Hybrid) selected
2. **Phase 8 scope updated:**
   - 8a: Self-implemented shelf (unchanged)
   - 8b: Add HA `todo.add_item` for shopping list export (**Tier 1 — critical**)
   - 8b+: Optional Grocy read bridge, optional Mealie recipe import (**Tier 2 — nice-to-have**)
3. **Out of Scope updated:** Removed "Full inventory management integration" from out-of-scope since Option C's thin bridges are now in scope
4. **Structured ingredients:** Added as Phase 8 consideration for shelf matching

---

## 10. References

- [Home Assistant Analytics — Integrations](https://analytics.home-assistant.io/integrations/)
- [Home Assistant Analytics — Add-ons](https://analytics.home-assistant.io/apps/)
- [Grocy REST API](https://grocy.info/)
- [Grocy HA Add-on](https://github.com/hassio-addons/addon-grocy) — MIT License
- [Grocy Custom Integration](https://github.com/custom-components/grocy)
- [Cooklang Specification](https://cooklang.org/docs/spec/)
- [Mealie Documentation](https://docs.mealie.io/)
- [KitchenOwl GitHub](https://github.com/TomBursch/kitchenowl) — AGPL-3.0
- [Tandoor Recipes](https://github.com/TandoorRecipes/recipes) — AGPL-3.0
- [Grocy AI Receipt Scanning Feature Request](https://github.com/grocy/grocy/issues/2831)
- [Mealie-to-Grocy sync](https://github.com/mschnklhn/mealie2grocy)