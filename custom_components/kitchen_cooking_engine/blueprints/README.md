# Kitchen Cooking Engine Blueprints
# Last Updated: 14 Jan 2026, 03:11 UTC
# Version: 0.3.4.0

This directory contains automation blueprints for the Kitchen Cooking Engine integration.

## Available Blueprints

### View Assist - Open Cooking Panel

**File:** `view_assist_open_cooking_panel.yaml`

Opens the Kitchen Cooking Engine panel on a View Assist device when voice commands like "start cooking" are detected.

This blueprint follows the standard View Assist pattern using the conversation platform and `view_assist.navigate` service.

**Import URL:**
```
https://github.com/R00S/meater-in-local-haos/blob/main/custom_components/kitchen_cooking_engine/blueprints/view_assist_open_cooking_panel.yaml
```

**Documentation:** [View Assist Integration Guide](../../docs/VIEW_ASSIST_INTEGRATION.md)

## How to Use

1. Go to **Settings** → **Automations & Scenes** → **Blueprints** in Home Assistant
2. Click **Import Blueprint**
3. Paste the Import URL above
4. Click **Preview** then **Import**
5. Create an automation from the blueprint

## Requirements

- Kitchen Cooking Engine integration installed
- View Assist Companion App installed on your device
- View Assist integration configured in Home Assistant
- Home Assistant Assist configured with wake word

## Note

This implementation uses the **conversation platform** (not custom sentences or intent handlers) which is the standard approach for View Assist automations.
