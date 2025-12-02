# Kitchen Cooking Engine - TODO for v0.1.2.0

Last Updated: 2 Dec 2025, 11:00 CET
Prepared by: Copilot agent for handover to next agent

## Current State (v0.1.1.14)
- Swedish and International cooking data with 185+ cuts
- Frontend data auto-generated from backend at install/update
- Temperature fine-tuning with slider (35-100°C)
- Recommended doneness per cut with ⭐ indicator
- Data source selector (International/Swedish)
- Basic cook start/stop functionality working

---

## HIGH PRIORITY - Core Functionality

### 1. Sensor Integration
- **Integrate ambient temperature sensor** - Currently only tip temp is used
- **Battery level display** - Show remaining battery from MEATER probe
- **Multi-probe support** - Handle multiple MEATER probes simultaneously

### 2. Notifications & Alerts
- Alert when **approaching target temp** (configurable threshold)
- Alert when **target is reached**
- Alert for **updated expected cooking time** changes
- Alert for **5 minutes remaining**
- Alert for **time to rest**
- Alert for **rest finished**

### 3. Time-to-Target Estimation
- Calculate estimated time based on temperature rise rate
- Algorithm should consider:
  - Current tip temperature
  - Ambient temperature
  - Cut type and size
  - Historical rise rate
- Display remaining time in UI

### 4. Rest Time Recommendations
- Carryover cooking estimation after removing from heat
- Suggest resting time based on cut type and size
- Track temperature during rest phase

### 5. External API for Starting Cooks
**NEW FEATURE**: A way to start cooks by future components or 3rd party integrations
- Required (non-optional) arguments:
  - `entity_id` - The cooking session sensor
  - `cut_id` - The cut to cook
  - `doneness` - Target doneness level
  - `cooking_method` - How it will be cooked
- Optional arguments (mirror what GUI provides):
  - `data_source` - international/swedish
  - `custom_target_temp_c` - Fine-tuned temperature
  - Additional metadata as needed
- Document the service schema for developers

---

## MEDIUM PRIORITY - UI/UX Improvements

### 1. Active Cook Monitoring Panel
- Show current tip temperature
- Show current ambient temperature
- Show target temperature
- Progress bar to target
- Time estimate display (dynamic)
- Battery level indicator

### 2. Cook History
- Log completed cooks with:
  - Timestamps (start, target reached, rest start, complete)
  - Temperatures recorded
  - Duration
  - Cut and doneness used
- Display history in UI

### 3. Multiple Simultaneous Cooks
- Support monitoring more than one probe/item at once
- UI to switch between active cooks or show all

### 4. Temperature Graph
- Visual chart showing temp over time during cook
- Mark key events (target reached, rest started, etc.)

### 5. Cooking Notes
- Save notes per cook (what worked, adjustments made)
- View notes in cook history

---

## LOW PRIORITY - Nice to Have

### 1. Dark/Light Theme
- Follow Home Assistant theme settings

### 2. Custom Cuts
- Allow users to add their own cuts with custom temps

### 3. Favorite Cuts
- Mark frequently used cuts as favorites for quick access

### 4. Cook Profiles/Presets
- Save complete cook configurations for reuse

### 5. Temperature Unit Preference
- °C/°F toggle saved in user settings

### 6. Sous Vide Mode
- Add sous vide times/temps for cuts that support it

---

## DATA IMPROVEMENTS

### Swedish Data Enhancements
- **Review Swedish temperature data** - Currently based on general sources
- **More cut-specific temps** from:
  - Stekguiden.se
  - Gårdssällskapet
  - Scan Köttguiden
- **Add more Swedish cuts** - Cross-reference with Scan Köttguiden for missing styckdetaljer
- **Cooking method suggestions** - Recommend ugn/stekpanna/grill per cut

### Livsmedelsverket Safety Info
- Optional display of official Swedish food safety temps
- Show alongside cooking-style temps (not as default)

---

## INTEGRATION FEATURES

### MEATER Probe Integration
- Connect to MEATER BLE proxy data (tip, ambient, battery)
- Handle connection state changes

### Automation Triggers
- Fire Home Assistant events when cook stages change:
  - `approaching` - Near target temp
  - `reached` - Target temp hit
  - `resting` - Rest phase started
  - `done` - Cook complete

### Voice Assistant Support
- Use Home Assistant's integrated voice assistant system
- Support local voice microphone (future)
- NOT connecting to Google directly - stay within HA app
- Example: "What's my steak temperature?"

---

## TECHNICAL DEBT

### Unit Tests
- Add test coverage for:
  - `cooking_data.py`
  - `swedish_cooking_data.py`
  - Services (start_cook, stop_cook, etc.)

### Error Handling
- Better error messages for edge cases
- Recovery procedures when things go wrong

### Logging Levels
- Configurable debug logging for troubleshooting

### Documentation
- README update with full feature documentation
- *Note: Extensive documentation is a long-term priority once we approach feature freeze and release*
- Update as last job before each release

---

## NOTES FOR NEXT AGENT

### File Structure
```
custom_components/kitchen_cooking_engine/
├── __init__.py          # Main integration, services, panel registration
├── sensor.py            # CookingSessionSensor entity
├── config_flow.py       # Configuration UI
├── const.py             # Constants (auto-updated PANEL_VERSION)
├── cooking_data.py      # International/USDA cooking data (185 cuts)
├── swedish_cooking_data.py  # Swedish cooking data (89 cuts)
├── generate_frontend_data.py  # Generates JS from Python at install
├── api.py               # HTTP API endpoints
├── services.yaml        # Service definitions
├── manifest.json        # Integration manifest
└── www/
    └── kitchen-cooking-panel.js  # Frontend panel (auto-generated data)
```

### Key Implementation Details
1. **Frontend data is auto-generated** from backend Python files at install/update time
2. **PANEL_VERSION** is synced between const.py and JS by the generator
3. **Services** are registered in `_async_register_services()` in __init__.py
4. **Entity references** are stored in `hass.data[DOMAIN][entry_id]["entities"]`

### Current Services
- `start_cook` - Start a cooking session
- `stop_cook` - Stop the current cooking session
- `start_rest` - Begin rest phase
- `complete_session` - Mark cook as complete

### Testing
- No automated tests exist yet
- Manual testing in Home Assistant required
- User R00S tests on real hardware with MEATER probe

---

## VERSION HISTORY (v0.1.1.x)
- v0.1.1.0: Initial Swedish data, temperature fine-tuning
- v0.1.1.1-9: Various fixes and data merging
- v0.1.1.10: Frontend data generated from backend
- v0.1.1.11: Auto-regenerate at install/update
- v0.1.1.12: CET timestamps in generated data
- v0.1.1.13: Module reload for PANEL_VERSION sync
- v0.1.1.14: Fix PANEL_VERSION reference in logging
