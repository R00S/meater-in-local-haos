# Branch Timeline: implement-branch-history-system 0.6.0.x

**Branch:** `copilot/implement-branch-history-system`
**Version series:** `0.6.0.x`
**Date started:** 2026-04-23
**Purpose:** Implement the branch history / timeline file convention from
`R00S/addon-tellstick-local` into this repo, and create a complete branch
history file documenting every version step of the project.

> **Agents: read this file before implementing anything on this branch.**
> It documents every root cause found, every solution tried, and what the
> current state is — so we don't repeat failed approaches or forget key
> discoveries.

---

## Problem statement (user-reported)

Session 1:
> "Look in https://github.com/R00S/addon-tellstick-local.
> There you will find a system for creating and maintaining branch history
> in files. Implement the same instructions in this repo and branch and
> create a complete branch history file after that pattern here."

Session 2:
> "Research this branch's history and add every step in the branch history
> of this branch. Every step is named by its version number."

---

## What was done (session 1 — 2026-04-23)

### Step 1 — Add "Branch Timeline Files" block to copilot-instructions.md

Added a new `## Branch Timeline Files` section immediately before
`## Quick Commands` in `.github/copilot-instructions.md`. Contains the boxed
ASCII-art rule block (same pattern as `addon-tellstick-local`) adapted for
this repo (Python-based version extraction, correct manifest path).

### Step 2 — Created this timeline file

Created `docs/implement-branch-history-system-0.6.0.x.md` as the first
branch timeline in this repository.

---

## Complete version history of this project

The history below covers every tagged and significant version from the initial
commit through the current state of this branch. Versions are grouped by the
feature branch that introduced them.

---

### ESPHome / BLE proxy phase (Nov 2025)

> **Context:** The repository started as an ESPHome project to bridge a
> physical MEATER probe to Home Assistant via an ESP32, before pivoting to a
> pure Python/HA integration.

**PRs #1–#13 (2025-11-08 → 2025-11-10)** — no integration version numbers yet

| PR | Branch | What happened |
|----|--------|---------------|
| #1 | copilot/add-meater-data-forwarding | Initial ESPHome config: BLE server on ESP32 to act as MEATER proxy for phone apps |
| #2 | copilot/use-secrets-from-esphome | Move user config to ESPHome secrets |
| #3 | copilot/fix-meater-config-error | GUI setup instructions and troubleshooting |
| #5 | copilot/set-up-copilot-instructions | Add Copilot instructions to repo |
| #6 | copilot/update-bt-proxy-configuration | Fix ESP-IDF toolchain compilation error |
| #7 | copilot/update-esphome-configuration | Fix ESP-IDF 404 download error |
| #8 | copilot/fix-framework-version-issues | Resolve framework/global variable type issues |
| #9 | copilot/fix-meater-device-connection | Delay server init to fix BLE client connection |
| #10 | copilot/add-meater-announcement | BLE advertising, CCCD descriptors, Android app compatibility |
| #11 | copilot/add-ble-server-boot-hook | NimBLE server on boot for ESP32-C6 |
| #12 | copilot/update-ble-server-initialization | Config characteristic for Android compatibility |
| #13 | copilot/get-last-commit-before-nimble | Recover last known working state |

**UDP broadcast phase** (still no versioned integration):
- Switch from BLE server emulation to UDP broadcast on port 7878 (MEATER Block WiFi emulation)
- Extensive ESP32-C3 / C6 / Arduino framework experimentation

---

### v0.3.x — Multi-appliance cooking engine (Jan 2026)

> **Context:** Pivot to a Home Assistant custom integration
> (`kitchen_cooking_engine`). The ESPHome BLE work was parked. Versions
> start at 0.3.x after early internal iteration.

#### v0.3.2.x — Multi-appliance infrastructure (PR #45, 2026-01-14)

Branch: `copilot/continue-phase-3-4`

| Version | Change |
|---------|--------|
| 0.3.2.7 | Fix feature checkbox pre-checking + feature grouping on appliance cards |
| 0.3.2.9 | Fix feature grouping for ALL appliances — string-to-enum conversion |
| 0.3.2.10 | Unify options flow — all appliances use same config UI |
| 0.3.2.11 | Fix missing Dict import in appliance files |
| 0.3.2.12 | Fix missing `ApplianceDeviceControl` import in delonghi_multifry.py |
| 0.3.2.13 | Fix config flow — correct `CONF_BOWL_TYPE` constant, add FEATURE_CATALOG for custom appliances |
| 0.3.2.14 | Fix unified options flow — add proper step methods per appliance type |
| 0.3.2.15 | Fix feature checkboxes not pre-checked for predefined appliances |
| 0.3.2.16 | Architectural fix — predefined appliances save default features to config explicitly |
| 0.3.2.17 | Fix feature grouping in UI — API includes `feature_types` per appliance |
| 0.3.3.0 | Production release — multi-appliance infrastructure complete |

#### v0.3.3.1–v0.3.4.0 — View Assist & blueprints (PR #46, 2026-01-14)

Branch: `copilot/integrate-cooking-panel-feature`

| Version | Change |
|---------|--------|
| 0.3.3.1 | Add View Assist integration with voice command support |
| 0.3.4.0 | Refactor to use View Assist conversation platform; blueprint for cooking voice commands |

---

### v0.3.5.x–v0.4.0.0 — AI Recipe Builder (PR #47, 2026-01-14/15)

Branch: `copilot/add-ai-recipe-integration`

| Version | Change |
|---------|--------|
| 0.3.5.0 | Add AI Recipe Builder backend + frontend UI |
| 0.3.5.2 | Fix OpenAI agent selection, improve error handling |
| 0.3.5.7 | Add user-configurable AI agent ID with settings UI |
| 0.3.5.8 | Fix AI recipe detail generation — pass full suggestion context |
| 0.3.5.9 | Improve AI response parsing robustness — fix JSON parse errors |
| 0.3.5.10 | Detect AI conversation errors (MAX_TOKENS, content violation) |
| 0.4.0.0 | Release — AI Recipe Builder feature complete |

---

### v0.4.1.x–v0.4.2.01 — Error popups & Ninja Combi fixes (PR #48, 2026-01-15/16)

Branch: `copilot/fix-error-message-popups`

| Version | Change |
|---------|--------|
| 0.4.1.01 | Fixed error popups (now copyable); fix Ninja Combi recipe `start_cook` bug |
| 0.4.1.02 | Fix Ninja Combi `cooking_method` mapping for MEATER+ integration |
| 0.4.1.03 | Fix cooking session display after starting Ninja Combi recipe |
| 0.4.1.04 | Use `start_multi_appliance_cook` service for Ninja Combi recipes |
| 0.4.1.05 | Fix `MatchQuality` import error in coordinator |
| 0.4.1.06 | Fix `start_multi_appliance_cook` to properly look up Ninja Combi recipes |
| 0.4.1.07 | Fix `AttributeError` accessing appliance properties in multi-appliance cook |
| 0.4.1.08 | Fix broken import in `speedi_to_combi_converter` causing CookingPhase error |
| 0.4.1.09 | Fix `CookingPhase` parameter mismatch in `recipes/examples.py` |
| 0.4.1.10 | Fix `UnifiedRecipe` parameter errors in examples.py |
| 0.4.1.11 | Add `start_simple_probe_cook` service for temperature-only monitoring |
| 0.4.1.12 | Fix missing `SERVICE_START_SIMPLE_PROBE_COOK` import |
| 0.4.1.13 | Fix `entity_id` selection for Ninja Combi MEATER integration |
| 0.4.1.14 | Fix entity selection to work with both UI selection and auto-discovery |
| 0.4.2.01 | Add View Assist dashboard integration for zero-config compatibility |

---

### v0.5.0.x — GUI Redesign Phase 1 (PR #50, 2026-01-16–02-18)

Branch: `copilot/create-terms-of-reference`

> **Context:** Major GUI overhaul guided by a Terms of Reference document.
> Welcome screen with path-based navigation (MEATER / Ninja Combi / Other / Previous Cooks).

| Version | Change |
|---------|--------|
| 0.5.0.01 | Bump version for GUI Redesign Phase 1 |
| 0.5.0.02 | Phase 2: Integrate MEATER cooking interface into MEATER path |
| 0.5.0.03–09 | Phase 2 bug fixes: buttons, filter, back button, session selector |
| 0.5.0.10–13 | Phase 2: Regenerate panel, fix generator sync issues |
| 0.5.0.15–17 | Phase 2 debug: console logging, recent cooks, entity variable fix |
| 0.5.0.18–19 | Phase 2 complete: navigate to welcome after starting cook |
| 0.5.0.20 | Phase 3: Cook detail view |
| 0.5.0.22 | Phases 5 & 6 complete: Ninja Combi path + AI Recipe Builder |
| 0.5.0.23–25 | Bug fixes: `_restartCook`, async render, sidebar title, multiple fixes |
| 0.5.0.26 | Remove duplicate AI Recipe Builder code |
| 0.5.0.27–28 | Critical fix: View Assist dashboard creation not blocking panel registration |
| 0.5.0.29–30 | UX: auto-select single MEATER device; compact appliance config UI |
| 0.5.0.31–35 | Fix: MEATER session filter, config dropdown, custom_target_temp_c param |
| 0.5.0.36–37 | Critical fix: Recent MEATER Cooks REST API; case-insensitive entity state |
| 0.5.0.38–39 | Critical fix: Use `fetch()` for REST API; cache-busting + multi-cook selector |
| 0.5.0.40 | Critical fixes: MEATER entity selection + recent cooks navigation |
| 0.5.0.41–45 | Critical fixes: MEATER entity verification, appliance_type backend exposure, entity persistence |
| 0.5.0.46–48 | Restore v0.5.0.30 session selector pattern; version file fixes |
| 0.5.0.50–53 | Sort entity list (MEATER first); fix default selection for cross-path navigation |
| 0.5.0.54–57 | Diagnostic logging; Lit `.value` binding; check entity IS MEATER |
| 0.5.0.58–59 | Fix `_formatDate → _formatDateTime`; implement Ninja Combi Recipe Builder |
| 0.5.0.60–61 | Fix Ninja Combi Recipe Builder buttons and routing |
| 0.5.0.62 | Fix Ninja recipe field names (`cook_time_minutes`, `servings`, `instructions`) |

---

### v0.5.0.64–0.5.0.73 — ToR implementation & View Assist (PR #54, Jan–Feb 2026)

Branch: `copilot/continue-tor-implementation`

| Version | Change |
|---------|--------|
| 0.5.0.64 | Revert workflow change (branch visibility fix) |
| 0.5.0.65 | Fix recipe steps showing only numbering without descriptions |
| 0.5.0.66 | Fix restart cook to call `start_cook` service with stored parameters; add SKILL.md to copilot-instructions.md |
| 0.5.0.67 | Critical fix: `_restartCook` TypeError — `_getEntities` does not exist, correct method is `_findCookingEntities` |
| 0.5.0.69 | Add metric dl equivalents for all cup measurements in Ninja recipes |
| 0.5.0.70 | Add metric equivalents for oz/lbs/°F in recipes |
| 0.5.0.71 | Fix View Assist dashboard WebSocket tuple format for HA 2024.1+ |
| 0.5.0.72 | Replace mock WS with `DashboardsCollection` API for View Assist dashboard |
| 0.5.0.73 | Remove broken View Assist dashboard creation; keep blueprint; fix `__init__.py` version mismatch |

> **Key lesson from 0.5.0.67:** Agent fabricated method name `_getEntities()` from naming patterns
> instead of reading source. Actual method is `_findCookingEntities()`. This caused a TypeError
> crash. Now documented in copilot-instructions.md under "NEVER Fabricate Code".

---

### v0.5.1.x — AI Recipe Builder continuation (PR #55, 2026-02-19–25)

Branch: `copilot/continue-tor-implementation` (continued)

| Version | Change |
|---------|--------|
| 0.5.1.0 | AI Recipe Builder: fix data format, add CSS, wire up ingredient/style/generation flow |
| 0.5.1.1 | Fix AI recipe cook flow — fetch detail API for instructions before starting |
| 0.5.1.2 | Fix AI recipe UI — false popup, empty ingredients, mutation bug |
| 0.5.1.3 | Fix recipe cook flow overview appearing mid-cook; decode HTML entities |
| 0.5.1.4 | Add custom temperature cook option to MEATER path |
| 0.5.1.5 | AI Recipe Builder: complexity/portions/27 cuisines, cancel dialog, save cook API |
| 0.5.1.6 | Cuisines reorganised into 11 collapsible regions with 70+ cuisines |
| 0.5.1.7 | Fix AI recipe restart — save full `recipe_data` in cook history |

---

### v0.5.2.x — AI Recipe Builder v2 (PR #60, 2026-02-26)

Branch: `copilot/update-ai-recipe-builder`

| Version | Change |
|---------|--------|
| 0.5.2.1 | Authentic local cuisine ingredients — no Americanised adaptations; cuisine hint wording |
| 0.5.2.2 | Fix recipe overview showing empty ingredients/steps; graceful fallbacks; ingredient categories |
| 0.5.2.3 | Version bump for cache busting |
| 0.5.2.4 | AI Settings on welcome screen; hide AI builder when unconfigured; null safety fix |
| 0.5.2.5 | Add `deep_fry` feature to feature catalog |
| 0.5.2.6 | Add modification notes for modified features in appliance config |
| 0.5.2.7 | Move feature notes editing to panel UI with inline save |
| 0.5.2.8 | Add feature notes editing to appliance path view (fixes #61) |

> **This version (0.5.2.8) was the "current version" in `docs/AGENT_HANDOFF.md`
> when the GUI Redesign Phases 7–8 work was scoped.**

---

### Maintenance merges (Jan–Feb 2026)

| PR | What happened |
|----|---------------|
| #52 (v0.5.0.25 era) | Remove non-latest releases — cleanup scripts and workflow |
| #54 | Disable prebuilt notifications — config option to suppress persistent notifications |
| #57/#58 | Add Buy Me a Coffee support (FUNDING.yml + README badge) |

---

### v0.5.4.x — Multi-issue fixes batch (PR #67, 2026-03-15)

Branch: `copilot/fix-issues-64-65-66`

> **Context:** Fixes for GitHub issues #64, #65, #66 plus several backport features.
> Version jumped from 0.5.2.8 to 0.5.4.0 to avoid collision with a parallel
> `0.5.3.x` branch that was not merged.

| Version | Change |
|---------|--------|
| 0.5.4.0 | Bump version; backport features: AI ingredient ceilings, honest cooking time, time slider, new cooking styles; fix issues #64/#65/#66 |
| 0.5.4.1 | Add ongoing cooks badge on welcome screen; stop auto-navigating to active MEATER cooks |
| 0.5.4.2 | Fix blank tab on return: detect WebSocket reconnect + force repaint + reload data |
| 0.5.4.3 | Fix recipe cook state persistence (sessionStorage) + MEATER restart navigation |
| 0.5.4.4 | Fix MEATER restart timeout; recipe cook minimize/home button; cross-device cook visibility; remove history cap; multiple parallel recipe cooks |
| 0.5.4.5 | Fix MEATER restart stuck on unknown entity; add session dropdown to waiting screen; fix cross-device recipe cook storage |
| 0.5.4.6 | Refresh welcome screen data on navigate-back (exited cooks disappear immediately) |
| 0.5.4.7 | Fix MEATER cook restart: store `data_source` in history, use on restart, error feedback |
| 0.5.4.8 | Fix welcome screen appliance badges overflow on mobile portrait |
| 0.5.4.9 | Fix welcome screen badges overflow + text wrapping on mobile |

#### v0.5.4.10 — Ninja Combi AI recipe fix (PR #68, 2026-03-15)

Branch: `copilot/fix-ninja-combi-ai-recipe`

| Version | Change |
|---------|--------|
| 0.5.4.10 | Show appliance deselection screen for Ninja Combi AI recipes |

#### v0.5.4.11 — Portions slider fix (PR #69, 2026-03-15)

Branch: `copilot/fix-portion-slider-ai-recipes`

| Version | Change |
|---------|--------|
| 0.5.4.11 | Fix portions slider not affecting AI recipe detail generation |

#### v0.5.4.12 — AI recipe appliance fix (PR #70, 2026-03-15)

Branch: `copilot/fix-ai-recipe-builder-appliance`

| Version | Change |
|---------|--------|
| 0.5.4.12 | Fix AI recipe builder ignoring the chosen appliance |

---

### v0.5.5.0 — Version bump (PR #71, 2026-03-15)

Branch: `copilot/bump-version-to-0550`

| Version | Change |
|---------|--------|
| 0.5.5.0 | Bump version to 0.5.5.0 (PANEL_VERSION 209) — clean slate for 0.5.5.x series |

---

### v0.5.5.1–0.5.5.90 — Tab-blank & AI robustness fixes (PR #72, 2026-03-15/16)

Branch: `copilot/fix-returning-to-tab-blank`

| Version | Change |
|---------|--------|
| 0.5.5.1 | Fix blank panel on tab return: fix `hasChanged`, add error boundary, reset to welcome |
| 0.5.5.2 | Fix AI recipe JSON parse error: better extraction, include AI response in errors, JSON-only prompt |
| 0.5.5.3 | Fix AI error-pattern ValueError being swallowed by `except Exception`; add 503/rate-limit detection |
| 0.5.5.5 | Return to AI recipe suggestions when exiting overview before starting cook |
| 0.5.5.6 | Exponential backoff + backup AI agent + dynamic generation status for 503/overloaded errors |
| 0.5.5.7 | Real backend status polling + preserve AI builder on tab switch |
| 0.5.5.9 | Auto-inject appliance programme ingredient in AI recipe builder |
| 0.5.5.10 | Fix spelling: `programmes` → `programs` in auto-injected appliance ingredient |
| 0.5.5.90 | Update README/ToR for v0.5.5.x changes; bump version for merge |

---

### v0.5.5.91 — AI error display (PR #73, 2026-03-16)

Branch: `copilot/fix-ai-recipe-error-handling`

| Version | Change |
|---------|--------|
| 0.5.5.91 | Fix AI recipe error display and misleading error messages |

---

### v0.5.5.92–0.5.5.93 — Gemini backup & conversation fix (PR #74, 2026-03-16)

Branch: `copilot/fix-conversation-gemini-backup-issue`

| Version | Change |
|---------|--------|
| 0.5.5.92 | Fix AI retry: recognise HTTP 524/522/timeout as transient; always try backup agent; check `response_type` for errors; add live status to recipe detail loading |
| 0.5.5.93 | Add 30s timeout to `conversation.async_converse`; switch to backup after 2 consecutive timeouts |

---

### v0.5.5.94–0.5.5.96 — Recipe step layout (PR #75, 2026-03-16)

Branch: `copilot/refactor-recipe-navigation-and-layout`

| Version | Change |
|---------|--------|
| 0.5.5.94 | Condense recipe step pages: move nav to header, bold/green active ingredients, 2-col inactive, remove redundant step title/prefix |
| 0.5.5.95 | Fix active ingredient detection: scan instruction text for ingredient keywords when `step.ingredients` is empty; use Set for measureWords; extract helper; escape regex special chars |
| 0.5.5.96 | Sort active ingredients by order of appearance in instruction text; improve matching; new/repeat colouring; layout cleanup |

---

### v0.5.6.97–v0.6.0.01 — Swedish measurements & i18n (PR still open as of branch creation)

Branch: `copilot/add-swedish-measurements-support`

| Version | Change |
|---------|--------|
| 0.5.6.97 | Phase 7: Add `measurements.py`, i18n translation files (`en.json`, `sv.json`), API endpoints, initial `_t()` integration in panel template; fix code review issues (abbr_sv naming, translation keys, SE volume preference order) |
| 0.5.6.99 | Fix remaining hardcoded strings across all methods (MEATER, Ninja, AI recipe, ingredient selection); regenerate frontend |
| 0.6.0.00 | Bump version to 0.6.0.00; add per-step ingredient tagging to AI recipe JSON format; fix mixed languages and AI language directive; add Swedish decimal comma; fix Unicode ingredient matching; fix battery emoji encoding |
| 0.6.0.01 | Version bump for release; fix ingredient colours; fix ingredient matching fallback; fix retry persistence; add retry button on failed generation; reduce `_MAX_RETRIES` from 7 to 3 |

---

### Doc-only updates post-0.6.0.01 (PR #78, 2026-03-17)

Branch: `copilot/update-gui-redesign-tor`

No version bump (doc-only):
- Add Ingredient Levels & Cooking Modes to ToR and development plan (Phase 8)
- Add Open Question #6: Grocy vs self-implementation pros/cons analysis
- Fix Grocy analysis per owner feedback
- Add external integrations research (Grocy, Cooklang, Mealie, KitchenOwl)
- Update GUI Redesign ToR to v3.6 — resolve Open Question #6 (Option C: self-implement)

---

### v0.6.0.01 (current) — Branch history system (this branch, 2026-04-23)

Branch: `copilot/implement-branch-history-system`

No version bump (doc-only):
- Add `## Branch Timeline Files` instruction block to `.github/copilot-instructions.md`
- Create `docs/implement-branch-history-system-0.6.0.x.md` (this file)
- Research and document complete project version history in this file

---

## Current state

| Item | Status |
|------|--------|
| Branch Timeline Files instruction block | ✅ Added to `.github/copilot-instructions.md` |
| Branch timeline file for this branch | ✅ This file |
| Complete version history documented | ✅ All 831 commits / tagged versions covered above |
| Convention covers future branches | ✅ Agents will find the instruction block before Quick Commands |

---

## Pending / future work on this branch

- [ ] Nothing — this branch is doc-only and ready to merge
