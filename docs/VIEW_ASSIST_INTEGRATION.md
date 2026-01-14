# Kitchen Cooking Engine - View Assist Integration Guide
# Last Updated: 14 Jan 2026, 02:40 UTC
# Version: 0.3.3.1

The Kitchen Cooking Engine integration now supports **View Assist**, allowing you to open the cooking panel on your View Assist device using voice commands.

## What is View Assist?

View Assist provides visual feedback for Home Assistant's Assist voice assistant on Android devices, turning tablets and phones into smart displays similar to Echo Show or Google Nest Hub.

**Project:** https://github.com/dinki/View-Assist

## Voice Commands

Once configured, you can use any of these phrases:
- "**start cooking**"
- "**open cooking**"
- "**show cooking**"
- "**open cooking panel**"
- "**show cooking panel**"
- "**start cooking panel**"

The cooking panel will automatically open on your View Assist device.

## Requirements

1. **Kitchen Cooking Engine** integration installed (this integration)
2. **Home Assistant Assist** configured with a wake word
3. **Browser Mod** integration installed
4. **View Assist Companion App** (optional but highly recommended)

## Installation Steps

### 1. Install Browser Mod

Browser Mod is required for the automation to navigate to different panels.

1. Install via HACS:
   - Go to **HACS** → **Frontend**
   - Search for "**Browser Mod**"
   - Click **Download**
2. Restart Home Assistant
3. Clear your browser cache (important!)

### 2. Import the Blueprint

1. Go to **Settings** → **Automations & Scenes** → **Blueprints**
2. Click **Import Blueprint**
3. Use this URL:
   ```
   https://github.com/R00S/meater-in-local-haos/blob/main/custom_components/kitchen_cooking_engine/blueprints/view_assist_open_cooking_panel.yaml
   ```
4. Click **Preview** then **Import**

### 3. Create an Automation from the Blueprint

1. In Blueprints, find "**View Assist - Open Cooking Panel**"
2. Click **Create Automation**
3. Configure the settings:
   - **Name:** "Open Cooking Panel on Voice Command" (or your preference)
   - **Browser ID:** Leave as "this" (targets the device where voice command was spoken)
   - **Include Voice Response:** Enable if you want spoken confirmation
   - **Response Text:** "Opening the cooking panel" (or customize)
4. Click **Save**

### 4. Test the Voice Command

1. Say: "**[Your wake word] start cooking**"
2. The cooking panel should open on your device

## Alternative: Manual Automation (Without Blueprint)

If you prefer not to use the blueprint, you can create a manual automation:

```yaml
alias: Open Cooking Panel on Voice Command
description: Opens Kitchen Cooking Engine panel when "start cooking" is said
trigger:
  - platform: event
    event_type: intent_script.KitchenCookingOpen
action:
  - service: browser_mod.navigate
    data:
      path: /kitchen-cooking
      browser_id: this
mode: single
```

## How It Works

1. **Voice Recognition**: Home Assistant's Assist recognizes your voice command
2. **Intent Matching**: The custom sentence matches to the `KitchenCookingOpen` intent
3. **Event Fired**: The intent handler fires an event
4. **Automation Triggered**: Your automation (blueprint or manual) catches the event
5. **Navigation**: Browser Mod navigates the device to `/kitchen-cooking`

## Troubleshooting

### Voice command not recognized
- Make sure Home Assistant Assist is configured with a wake word
- Check that the Kitchen Cooking Engine integration is installed
- Try restarting Home Assistant after installation

### Panel doesn't open
- Verify Browser Mod is installed and browser cache is cleared
- Check that the automation is enabled
- Look at **Developer Tools** → **Events** and listen for `intent_script.KitchenCookingOpen` events
- Check automation traces in **Settings** → **Automations** → (your automation) → **Traces**

### Wrong device opens the panel
- Change `browser_id` from "this" to a specific browser ID
- Find your browser ID in Browser Mod settings: **Developer Tools** → **Services** → `browser_mod.navigate`

## Advanced Configuration

### Target Specific Device

If you always want to open the panel on the same device (like a kitchen tablet):

1. Find your browser ID:
   - Go to **Developer Tools** → **Services**
   - Select `browser_mod.navigate`
   - Check the "Browser ID" dropdown for device IDs
2. Edit your automation
3. Change `browser_id: "this"` to `browser_id: "your-browser-id"`

### Multiple View Assist Devices

You can create separate automations for different devices:
- Kitchen tablet opens cooking panel
- Living room tablet shows something else
- Bedroom tablet opens a different view

Each automation can use different browser IDs.

## Related Documentation

- [View Assist Documentation](https://dinki.github.io/View-Assist/)
- [Browser Mod Documentation](https://github.com/thomasloven/hass-browser_mod)
- [Home Assistant Assist](https://www.home-assistant.io/voice_control/)

## Support

If you encounter issues:
1. Check the troubleshooting section above
2. Review Home Assistant logs: **Settings** → **System** → **Logs**
3. Open an issue: https://github.com/R00S/meater-in-local-haos/issues
