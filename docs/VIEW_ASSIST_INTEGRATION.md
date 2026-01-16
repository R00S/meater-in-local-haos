# Kitchen Cooking Engine - View Assist Integration Guide
# Last Updated: 14 Jan 2026, 03:11 UTC
# Version: 0.3.4.0

The Kitchen Cooking Engine integration now supports **View Assist**, allowing you to open the cooking panel on your View Assist device using voice commands.

## What is View Assist?

View Assist provides visual feedback for Home Assistant's Assist voice assistant on Android devices, turning tablets and phones into smart displays similar to Echo Show or Google Nest Hub.

The **View Assist Companion App** handles navigation natively using the conversation platform - simple and straightforward!

**Project:** https://github.com/dinki/View-Assist

## Voice Commands

Once configured, you can use any of these phrases:
- "**start cooking**"
- "**open cooking**"
- "**show cooking panel**"

The cooking panel will automatically open on your View Assist device.

## Requirements

1. **Kitchen Cooking Engine** integration installed (this integration)
2. **Home Assistant Assist** configured with a wake word
3. **View Assist Companion App** installed on your Android device
4. **View Assist Integration** installed in Home Assistant

## Installation Steps

### 1. Install View Assist Integration

1. Open HACS → Integrations
2. Search for "**View Assist**"
3. Install the View Assist integration
4. Restart Home Assistant

### 2. Install View Assist Companion App

1. Download the View Assist Companion App on your Android device
2. Install and open the app
3. Connect to your Home Assistant instance
4. Configure the device in the app

**App Repository:** https://github.com/msp1974/ViewAssist_Companion_App

### 3. Import the Blueprint

1. Go to **Settings** → **Automations & Scenes** → **Blueprints**
2. Click **Import Blueprint**
3. Use this URL:
   ```
   https://github.com/R00S/meater-in-local-haos/blob/main/custom_components/kitchen_cooking_engine/blueprints/view_assist_open_cooking_panel.yaml
   ```
4. Click **Preview** then **Import**

### 4. Create an Automation from the Blueprint

1. In Blueprints, find "**View Assist - Open Cooking Panel**"
2. Click **Create Automation**
3. Configure the settings:
   - **Name:** "Open Cooking Panel on Voice Command" (or your preference)
   - **Command Text 1:** "start cooking" (default)
   - **Command Text 2:** "open cooking" (optional alternative)
   - **Command Text 3:** "show cooking panel" (optional alternative)
   - **Dashboard Path:** "/cooking-va/main" (default - View Assist dashboard)
   - **Response Text:** "Opening the cooking panel" (or customize)
4. Click **Save**

### 5. Test the Voice Command

1. Say: "**[Your wake word] start cooking**"
2. The cooking panel should open on your View Assist device

## How It Works

1. **Voice Recognition**: Home Assistant's Assist recognizes your voice command
2. **Conversation Platform**: The blueprint uses `platform: conversation` to catch the command
3. **View Assist Navigation**: Uses `view_assist.navigate` service to open the panel
4. **Response**: Speaks "Opening the cooking panel" and updates View Assist state

This follows the standard View Assist pattern - simple, clean, and reliable!

## Dashboard Architecture

The Kitchen Cooking Engine automatically creates a View Assist-compatible dashboard during installation:

- **Main Panel:** `/kitchen-cooking` - Sidebar panel for normal Home Assistant use
- **View Assist Dashboard:** `/cooking-va` - Hidden dashboard with iframe embedding the main panel
  - Path: `/cooking-va/main`
  - Not shown in sidebar (View Assist only)
  - Single source of truth - iframe displays the full panel
  - Zero code duplication - all changes to main panel automatically apply

The View Assist dashboard is created automatically when you install the integration via HACS.
No manual configuration required.

## Alternative: Manual Automation (Without Blueprint)

If you prefer not to use the blueprint, you can create a manual automation:

```yaml
alias: Open Cooking Panel on Voice Command
description: Opens Kitchen Cooking Engine panel when "start cooking" is said
trigger:
  - platform: conversation
    command:
      - "start cooking"
      - "open cooking"
      - "show cooking panel"
condition: []
action:
  - variables:
      target_satellite_device: "{{ view_assist_entity(trigger.device_id) }}"
      response: "Opening the cooking panel"
  - action: view_assist.navigate
    data:
      device: "{{ target_satellite_device }}"
      path: "/cooking-va/main"
  - set_conversation_response: "{{ response }}"
  - action: view_assist.set_state
    target:
      entity_id: "{{ target_satellite_device }}"
    data:
      last_said: "{{ response }}"
mode: single
```

## Troubleshooting

### Voice command not recognized
- Make sure Home Assistant Assist is configured with a wake word
- Check that the View Assist integration is installed
- Verify the automation is enabled
- Try restarting Home Assistant after installation

### Panel doesn't open
- Verify View Assist Companion App is installed and connected
- Check that the View Assist integration is installed in Home Assistant
- Check that the automation is enabled
- Look at **Developer Tools** → **Events** and listen for conversation events
- Check automation traces in **Settings** → **Automations** → (your automation) → **Traces**

### Wrong device responds
- Make sure you're speaking to the correct View Assist device
- The automation automatically targets the device where the command was spoken
- Verify the View Assist Companion App is properly configured on each device

## Advanced Configuration

### Customize Voice Commands

You can add more phrases by editing the blueprint inputs:
- "open the cooking panel"
- "show me cooking"
- "let's cook"
- Any phrase you prefer!

Just add them to Command Text 1, 2, or 3 in the blueprint configuration.

### Multiple View Assist Devices

You can have multiple View Assist devices, each responding to voice commands independently:
- Kitchen tablet opens cooking panel when you say "start cooking" in the kitchen
- Each device responds to commands spoken directly to it
- No need for device-specific configurations

The blueprint automatically targets the device where the voice command was spoken using View Assist's native device tracking.

## Related Documentation

- [View Assist Documentation](https://dinki.github.io/View-Assist/)
- [View Assist Companion App](https://github.com/msp1974/ViewAssist_Companion_App)
- [Home Assistant Assist](https://www.home-assistant.io/voice_control/)

## Support

If you encounter issues:
1. Check the troubleshooting section above
2. Review Home Assistant logs: **Settings** → **System** → **Logs**
3. Open an issue: https://github.com/R00S/meater-in-local-haos/issues
