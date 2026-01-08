# Phase 3 Implementation Plan: Dynamic Frontend & Multi-Appliance UI

**Status:** Planning Complete, Ready for Implementation  
**Version:** 0.3.3.0 (Target)  
**Last Updated:** 2026-01-08

---

## Overview

Phase 3 transforms the Kitchen Cooking Engine frontend to support multiple appliances with feature-based UI visibility and dynamic recipe filtering. This is the most complex phase as it requires restructuring the config flow, updating the panel UI, and maintaining backward compatibility with existing MEATER+ installations.

---

## Architecture Goals

1. **Multi-Appliance Support**: Users can add multiple appliances (MEATER+, Ninja Combi, Oven, etc.)
2. **Feature-Based UI**: Panel shows/hides sections based on available features
3. **Dynamic Recipe Filtering**: Only show recipes user can actually cook
4. **Quality Indicators**: Display match quality (EXCELLENT/GOOD/ACCEPTABLE/POOR)
5. **Backward Compatibility**: Existing MEATER+ configs automatically migrate
6. **Zero Breaking Changes**: All current functionality preserved

---

## Implementation Sub-Phases

### Phase 3.1: Backend Infrastructure ✅ NEXT

**Objective:** Create backend services to support multi-appliance architecture

**Components to Build:**

1. **Appliance Manager Service** (`appliance_manager.py`)
   - Central coordinator for all appliances
   - Registry initialization on startup
   - Config entry lifecycle management
   - Feature aggregation API
   - Event broadcasting (appliance added/removed)

2. **Enhanced API Endpoints** (`api.py`)
   - `GET /api/kitchen_cooking_engine/appliances` - List all appliances
   - `GET /api/kitchen_cooking_engine/available_features` - Aggregated features
   - `GET /api/kitchen_cooking_engine/recipes/compatible` - Filtered recipes
   - `POST /api/kitchen_cooking_engine/recipes/{id}/match` - Recipe match result
   - WebSocket for real-time updates

3. **Panel Data Service** (`panel_data.py`)
   - Data layer for frontend
   - Efficient caching
   - Change detection
   - Incremental updates

4. **Migration Utilities** (`migration.py`)
   - Detect old config format
   - Create appliance entries from legacy config
   - Preserve all settings
   - Migration status tracking

**Files to Create:**
- `appliance_manager.py` (~300 lines)
- `panel_data.py` (~200 lines)
- `migration.py` (~150 lines)

**Files to Modify:**
- `__init__.py` - Initialize manager, register API
- `api.py` - Add new endpoints
- `const.py` - Add new constants

**Success Criteria:**
- ✅ Appliance manager initializes on startup
- ✅ Registry populates with all appliances
- ✅ API endpoints return correct data
- ✅ Legacy configs auto-migrate

---

### Phase 3.2: Config Flow Redesign

**Objective:** Transform config flow to support multiple appliance types

**Current Flow:**
```
User clicks "Add Integration" 
  → Enter MEATER+ sensors
  → Configure notifications/TTS
  → Done
```

**New Flow:**
```
User clicks "Add Integration" (first time)
  → "Add Kitchen Appliance"
  → Select appliance type:
     [ ] MEATER+ Thermometer
     [ ] Ninja Combi SFP700EU  
     [ ] De'Longhi MultiFry FH1394
     [ ] Standard Oven
     [ ] Stovetop (Gas/Electric/Induction)
     [ ] Microwave Oven
     [ ] Custom Appliance
  → Configure selected appliance
  → Done

User clicks "Add Integration" (subsequent times)
  → Same flow, adds another appliance
```

**Per-Appliance Configuration:**

**MEATER+:**
- Temperature sensor (required)
- Ambient sensor (optional)
- Battery sensor (optional)
- Power outlet (optional)
- Start button (optional)
- Notifications, TTS, etc.

**Ninja Combi:**
- Appliance name
- Power outlet (optional)
- Start button (optional)

**Standard Oven:**
- Appliance name
- Has convection (yes/no)
- Has grill (yes/no)
- Power outlet (optional)

**Stovetop:**
- Appliance name
- Type (Gas/Electric Coil/Electric Smoothtop/Induction)
- Number of burners (2-6)

**Microwave:**
- Appliance name
- Power (watts)
- Has sensor cook (yes/no)
- Has convection (yes/no)

**Custom Appliance:**
- Appliance name
- Select features (multi-select from 49 features)
- For each feature, select implementation:
  - STANDARD / MODIFIED / SPECIAL

**Files to Modify:**
- `config_flow.py` - Complete redesign (~500 lines)
- `strings.json` - New UI strings
- `translations/en.json` - Translation strings

**Success Criteria:**
- ✅ Users can add multiple appliances
- ✅ Each appliance type has appropriate config
- ✅ Custom appliances supported
- ✅ Validation works correctly
- ✅ Old configs trigger migration

---

### Phase 3.3: Frontend Panel Core Updates

**Objective:** Make panel dynamic based on available appliances

**Current Panel Sections:**
1. Current cook session (always visible)
2. Start new cook (always visible)
3. Cook history (always visible)
4. Ninja Combi recipes (always visible)

**New Dynamic Panel Sections:**

**Section: Current Cook**
- Visible if: `temperature_probe` feature available
- Shows: Active cook session with MEATER+
- Unchanged functionality

**Section: Start New Cook**
- Visible if: `temperature_probe` feature available
- Shows: Protein/cut/doneness selection
- Unchanged functionality

**Section: Appliances**
- Always visible
- Shows: List of configured appliances with status
- Allows: View appliance details, manage settings

**Section: Recipes**
- Always visible
- Shows: Only compatible recipes based on matcher
- Quality badges: ⭐️ EXCELLENT, ✅ GOOD, ⚠️ ACCEPTABLE
- Filters: By appliance, by quality, by features
- Recipe details: Shows suggested appliances

**Section: Recipe Builder** (Ninja Combi)
- Visible if: Ninja Combi configured
- Unchanged functionality

**Section: Cook History**
- Always visible
- Unchanged functionality

**UI Components to Add:**

1. **Appliance Cards**
   ```javascript
   <div class="appliance-card">
     <div class="appliance-icon">🌡️</div>
     <div class="appliance-name">MEATER+</div>
     <div class="appliance-status">Connected</div>
     <div class="appliance-features">
       <span class="feature-badge">temperature_probe</span>
       <span class="feature-badge">ambient_temperature</span>
     </div>
   </div>
   ```

2. **Quality Badges**
   ```javascript
   <span class="quality-excellent">⭐️ EXCELLENT</span>
   <span class="quality-good">✅ GOOD</span>
   <span class="quality-acceptable">⚠️ ACCEPTABLE</span>
   <span class="quality-poor">❌ POOR</span>
   ```

3. **Recipe Filters**
   ```javascript
   <select id="appliance-filter">
     <option value="all">All Recipes</option>
     <option value="meater_plus">With MEATER+</option>
     <option value="ninja_combi">With Ninja Combi</option>
   </select>
   
   <select id="quality-filter">
     <option value="all">All Qualities</option>
     <option value="excellent">Excellent Only</option>
     <option value="good_plus">Good or Better</option>
   </select>
   ```

4. **Appliance Selector** (for recipes)
   ```javascript
   <div class="recipe-appliances">
     <div class="suggested">
       Suggested: Ninja Combi
     </div>
     <div class="alternatives">
       Or use: 
       <button class="alt-combo">Standard Oven + MEATER+</button>
       <button class="alt-combo">MultiFry + MEATER+</button>
     </div>
   </div>
   ```

**Files to Modify:**
- `www/kitchen-cooking-panel.js` - Major updates (~1000 lines changed)
- `www/panel-class-template.js` - Update template
- `generate_frontend_data.py` - Include appliance/recipe data

**Success Criteria:**
- ✅ Panel adapts to available appliances
- ✅ Only compatible recipes shown
- ✅ Quality indicators displayed
- ✅ Appliance management UI works
- ✅ Filters function correctly
- ✅ Responsive design maintained

---

### Phase 3.4: Recipe Integration

**Objective:** Connect recipe matcher to frontend for smart filtering

**Data Flow:**
```
Panel Loads
  → Fetch available features from API
  → Load all recipes
  → For each recipe:
    - Call matcher API
    - Get match result (quality, confidence, suggestions)
    - Store results
  → Filter recipes by quality threshold
  → Display with quality badges
```

**Recipe Display Updates:**

**Recipe List:**
```javascript
{
  id: 5010,
  name: "Perfect Roast Chicken",
  quality: "EXCELLENT",
  qualityScore: 1.0,
  confidence: 1.0,
  suggested: ["Standard Oven", "MEATER+"],
  alternatives: [["Ninja Combi"]],
  canCook: true
}
```

**Recipe Detail View:**
```html
<div class="recipe-detail">
  <h2>Perfect Roast Chicken</h2>
  
  <div class="recipe-quality">
    <span class="badge excellent">⭐️ EXCELLENT MATCH</span>
    <span class="confidence">100% Confidence</span>
  </div>
  
  <div class="recipe-appliances">
    <h3>You'll need:</h3>
    <div class="appliance-list">
      <div class="appliance">✅ Standard Oven (you have this)</div>
      <div class="appliance">✅ MEATER+ (you have this)</div>
    </div>
    
    <h3>Or alternatively:</h3>
    <div class="alternative-combos">
      <button class="combo-btn">Use Ninja Combi instead</button>
    </div>
  </div>
  
  <button class="start-cook-btn">🚀 Start Cooking</button>
</div>
```

**Missing Appliances View:**
```html
<div class="recipe-detail incompatible">
  <h2>Pressure Cooker Beans</h2>
  
  <div class="recipe-quality">
    <span class="badge incompatible">❌ CANNOT COOK</span>
  </div>
  
  <div class="missing-features">
    <h3>You're missing:</h3>
    <div class="missing-list">
      <div class="missing">⚠️ pressure_cook feature</div>
    </div>
    
    <h3>Suggested appliances to add:</h3>
    <div class="suggestions">
      <button class="add-appliance-btn">➕ Add Instant Pot</button>
      <button class="add-appliance-btn">➕ Add Pressure Cooker</button>
    </div>
  </div>
</div>
```

**Files to Modify:**
- `www/kitchen-cooking-panel.js` - Recipe display logic
- `panel_data.py` - Recipe matching integration

**Success Criteria:**
- ✅ Recipes show match quality
- ✅ Suggested appliances displayed
- ✅ Alternative combinations work
- ✅ Missing appliance suggestions shown
- ✅ One-click appliance selection
- ✅ Smooth user experience

---

### Phase 3.5: Testing & Polish

**Objective:** Ensure quality, fix bugs, refine UX

**Testing Scenarios:**

1. **Fresh Install**
   - Add first appliance (MEATER+)
   - Add second appliance (Ninja Combi)
   - Verify panel shows both
   - Verify recipes filtered correctly

2. **Migration from v0.2**
   - Start with existing MEATER+ config
   - Upgrade to v0.3
   - Verify auto-migration
   - Verify no data loss
   - Verify all features work

3. **Multi-Appliance Cooking**
   - Select recipe requiring oven + probe
   - Verify suggested appliances
   - Start cook
   - Verify both appliances coordinated

4. **Custom Appliance**
   - Create custom appliance
   - Select features
   - Verify recipes match correctly
   - Verify quality scoring works

5. **Appliance Removal**
   - Remove an appliance
   - Verify panel updates
   - Verify recipes re-filtered
   - Verify no errors

6. **Edge Cases**
   - No appliances configured
   - Only non-probe appliances
   - Conflicting appliance features
   - Network errors during API calls

**UI/UX Refinements:**
- Loading states
- Error messages
- Empty states ("No appliances configured yet")
- Tooltips and help text
- Responsive design (mobile, tablet, desktop)
- Accessibility (ARIA labels, keyboard navigation)
- Performance optimization

**Documentation:**
- Update README with multi-appliance setup
- Create migration guide
- Update HACS info
- Create demo videos/screenshots

**Files to Create:**
- `MIGRATION_GUIDE.md`
- `tests/` - Unit and integration tests

**Success Criteria:**
- ✅ All test scenarios pass
- ✅ No regressions in existing features
- ✅ Performance acceptable (<2s to load panel)
- ✅ UI polished and intuitive
- ✅ Documentation complete

---

## Technical Specifications

### Appliance Manager Service

```python
class ApplianceManager:
    """Central coordinator for all kitchen appliances."""
    
    def __init__(self, hass: HomeAssistant):
        self.hass = hass
        self.registry = ApplianceRegistry()
        self._initialized = False
    
    async def async_initialize(self):
        """Initialize manager and load all appliances."""
        # Load all config entries with domain
        entries = self.hass.config_entries.async_entries(DOMAIN)
        
        for entry in entries:
            await self.async_register_from_entry(entry)
        
        self._initialized = True
        _LOGGER.info(f"Appliance Manager initialized with {len(self.registry.get_all_appliances())} appliances")
    
    async def async_register_from_entry(self, entry: ConfigEntry):
        """Register appliance from config entry."""
        appliance_type = entry.data.get("appliance_type", "meater_plus")
        
        # Create appliance instance
        if appliance_type == "meater_plus":
            appliance = await self._create_meater_plus(entry)
        elif appliance_type == "ninja_combi":
            appliance = await self._create_ninja_combi(entry)
        # ... other types
        
        # Register in registry
        self.registry.register_appliance(entry.entry_id, appliance)
        
        # Fire event
        self.hass.bus.async_fire(f"{DOMAIN}_appliance_added", {
            "entry_id": entry.entry_id,
            "appliance_type": appliance_type
        })
    
    def get_available_features(self) -> Set[str]:
        """Get all available features across appliances."""
        return self.registry.get_available_features()
    
    def get_appliances_for_recipe(self, recipe: UnifiedRecipe) -> RecipeMatchResult:
        """Match recipe against available appliances."""
        matcher = RecipeMatcher(self.registry)
        return matcher.match_recipe(recipe)
```

### API Endpoints

```python
@callback
def async_register_api(hass: HomeAssistant):
    """Register API endpoints."""
    
    @callback
    async def get_appliances(request):
        """Get all configured appliances."""
        manager = hass.data[DOMAIN]["manager"]
        appliances = []
        
        for app_id, appliance in manager.registry.get_all_appliances():
            appliances.append({
                "id": app_id,
                "type": appliance.__class__.__name__,
                "name": appliance.name,
                "features": list(appliance.get_features()),
                "status": "connected" # or actual status
            })
        
        return web.json_response(appliances)
    
    @callback
    async def get_available_features(request):
        """Get aggregated features."""
        manager = hass.data[DOMAIN]["manager"]
        features = manager.get_available_features()
        
        return web.json_response({"features": list(features)})
    
    @callback
    async def get_compatible_recipes(request):
        """Get recipes user can cook."""
        manager = hass.data[DOMAIN]["manager"]
        matcher = RecipeMatcher(manager.registry)
        
        # Load all recipes
        all_recipes = load_all_recipes()
        
        # Filter compatible
        compatible = matcher.filter_recipes(
            all_recipes,
            min_quality=ImplementationQuality.ACCEPTABLE
        )
        
        # Add match results
        recipes_with_results = []
        for recipe in compatible:
            result = matcher.match_recipe(recipe)
            recipes_with_results.append({
                "recipe": recipe.to_dict(),
                "match": {
                    "quality": result.quality.name,
                    "score": result.quality_score,
                    "confidence": result.confidence,
                    "suggested": result.suggested_appliances,
                    "alternatives": result.alternative_appliances
                }
            })
        
        return web.json_response(recipes_with_results)
    
    # Register routes
    hass.http.register_view(AppliancesView)
    hass.http.register_view(FeaturesView)
    hass.http.register_view(RecipesView)
```

### Migration Utility

```python
async def async_migrate_legacy_config(hass: HomeAssistant, entry: ConfigEntry):
    """Migrate old MEATER+ config to new multi-appliance format."""
    
    # Check if already migrated
    if "appliance_type" in entry.data:
        return True
    
    _LOGGER.info(f"Migrating legacy config entry {entry.entry_id}")
    
    # Create new data with appliance type
    new_data = {**entry.data, "appliance_type": "meater_plus"}
    
    # Update config entry
    hass.config_entries.async_update_entry(entry, data=new_data)
    
    # Show notification to user
    hass.components.persistent_notification.async_create(
        f"Kitchen Cooking Engine has been upgraded to support multiple appliances. "
        f"Your MEATER+ configuration has been automatically migrated. "
        f"You can now add more appliances from the Integrations page.",
        title="Kitchen Cooking Engine Upgraded",
        notification_id=f"kce_migration_{entry.entry_id}"
    )
    
    return True
```

---

## Migration Strategy

### Backward Compatibility Approach

**Version Detection:**
```python
def detect_config_version(entry: ConfigEntry) -> str:
    """Detect config entry version."""
    if "appliance_type" in entry.data:
        return "v0.3+"  # New multi-appliance format
    else:
        return "v0.2"   # Legacy MEATER+ format
```

**Auto-Migration on Load:**
```python
async def async_setup_entry(hass: HomeAssistant, entry: ConfigEntry):
    """Set up from config entry."""
    
    # Detect version
    version = detect_config_version(entry)
    
    # Migrate if needed
    if version == "v0.2":
        await async_migrate_legacy_config(hass, entry)
    
    # Continue with normal setup
    ...
```

**User Communication:**
- Persistent notification on migration
- Link to migration guide
- No action required from user
- All data preserved

---

## Risk Mitigation

### Potential Issues & Solutions

**Issue:** Migration fails  
**Mitigation:** 
- Extensive testing before release
- Backup entry data before migration
- Rollback capability
- Detailed error logging

**Issue:** Performance degradation with many appliances  
**Mitigation:**
- Efficient caching in panel data service
- Lazy loading of recipe matches
- Pagination for large recipe lists
- WebSocket for incremental updates

**Issue:** UI complexity overwhelming users  
**Mitigation:**
- Progressive disclosure (hide advanced features)
- Good defaults for common setups
- Onboarding wizard for first-time users
- Contextual help and tooltips

**Issue:** Feature conflicts between appliances  
**Mitigation:**
- Clear conflict resolution rules
- User override capability
- Warn user of potential issues
- Allow disabling features per appliance

---

## Success Metrics

**Phase 3 Complete When:**

1. ✅ Users can add multiple appliances via config flow
2. ✅ Each appliance has appropriate configuration options
3. ✅ Registry tracks all appliances correctly
4. ✅ Panel shows/hides sections based on features
5. ✅ Recipes filtered by compatibility automatically
6. ✅ Quality indicators displayed correctly
7. ✅ Appliance suggestions work properly
8. ✅ Alternative combinations selectable
9. ✅ Missing appliances suggestions shown
10. ✅ Existing MEATER+ configs migrate automatically
11. ✅ All current functionality preserved
12. ✅ No breaking changes
13. ✅ Performance acceptable (<2s panel load)
14. ✅ UI intuitive and polished
15. ✅ Documentation complete

---

## Timeline Estimate

**Phase 3.1:** Backend Infrastructure - 2-3 days  
**Phase 3.2:** Config Flow Redesign - 2-3 days  
**Phase 3.3:** Frontend Panel Core - 3-4 days  
**Phase 3.4:** Recipe Integration - 2-3 days  
**Phase 3.5:** Testing & Polish - 2-3 days  

**Total:** 11-16 days of focused development

---

## Next Steps

1. Review and approve this plan
2. Begin Phase 3.1 implementation
3. Incremental commits after each sub-phase
4. Test thoroughly before moving to next sub-phase
5. Get user feedback on UI/UX
6. Iterate and refine

---

**Status:** Ready to begin Phase 3.1 implementation  
**Approved by:** Pending review  
**Start Date:** TBD
