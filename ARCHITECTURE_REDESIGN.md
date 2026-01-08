# Multi-Appliance Architecture Redesign - Implementation Plan

## Executive Summary
Transform Kitchen Cooking Engine from single MEATER+ sensor integration into a comprehensive multi-appliance management system with feature-based recipe visibility and smart appliance combination suggestions.

## Core Design Principles

### 1. Config Entry Per Appliance
- Each appliance (MEATER+, Ninja Combi, De'Longhi MultiFry, Custom) = separate config entry
- Independent configuration and management
- Appliances can be added/removed dynamically
- Similar to OpenAI Conversation's "Add AI Task" pattern

### 2. Feature-Based System (Not Appliance-Based)
- UI visibility driven by **aggregate features** across ALL appliances
- Recipes tagged with required features, not specific appliances
- Multi-appliance recipe support (e.g., oven + probe)
- Smart suggestions for appliance combinations

### 3. User Override with Suggestions
- System suggests optimal appliance combination
- User can override selections
- Preference learning (future enhancement)

## Phase 1: Multi-Config Entry Foundation

### 1.1 Appliance Registry System
**File: `appliances/registry.py`**
```python
class ApplianceRegistry:
    """Central registry for all appliances across config entries."""
    
    def get_all_appliances() -> List[KitchenAppliance]
    def get_appliance_by_id(appliance_id: str) -> KitchenAppliance
    def get_available_features() -> Set[str]
    def find_appliances_with_feature(feature: str) -> List[KitchenAppliance]
```

### 1.2 Feature Catalog
**File: `features/catalog.py`**
```python
FEATURE_CATALOG = {
    # Temperature Monitoring
    "temperature_probe": CookingFeature(...),
    "ambient_temperature": CookingFeature(...),
    
    # Cooking Methods - Standard
    "oven": CookingFeature(type=STANDARD),
    "grill": CookingFeature(type=STANDARD),
    "broil": CookingFeature(type=STANDARD),
    
    # Cooking Methods - Modified  
    "air_fry": CookingFeature(type=MODIFIED),
    "convection": CookingFeature(type=MODIFIED),
    "pressure_cook": CookingFeature(type=MODIFIED),
    
    # Cooking Methods - Special
    "combi_crisp": CookingFeature(type=SPECIAL),
    "sous_vide": CookingFeature(type=SPECIAL),
    ...
}
```

### 1.3 Config Flow Redesign
**File: `config_flow.py`**

**Step 1: Appliance Type Selection**
```
┌─────────────────────────────────────┐
│ Add Kitchen Appliance               │
├─────────────────────────────────────┤
│ ○ MEATER+ Thermometer               │
│ ○ Ninja Combi SFP700EU              │
│ ○ De'Longhi MultiFry FH1394         │
│ ○ Custom Appliance                  │
└─────────────────────────────────────┘
```

**Step 2a: MEATER+ Configuration**
- Temperature sensor (required)
- Ambient sensor (optional)
- Battery sensor (optional)
- Power outlet (optional)
- Start button (optional)
- Notifications, TTS, indicator light

**Step 2b: Ninja Combi Configuration**
- Appliance name
- Power outlet (optional)
- Start button (optional)

**Step 2c: De'Longhi MultiFry Configuration**
- Appliance name  
- Default bowl type (Ceramic J / Non-stick Z)
- Power outlet (optional)
- Start button (optional)

**Step 2d: Custom Appliance Configuration**
- Appliance name
- Multi-select features from catalog
- Power controls

### 1.4 Appliance-Specific Entities
Each appliance config entry creates its own entities:
- **MEATER+**: `sensor.meater_cooking_session`, `sensor.meater_battery`
- **Ninja Combi**: No sensors (recipes only)
- **MultiFry**: No sensors (recipes only)
- **Custom**: Depends on features selected

## Phase 2: Feature-Based Recipe System

### 2.1 Recipe Feature Tags
**File: `recipes/recipe_models.py`**
```python
@dataclass
class Recipe:
    id: int
    name: str
    required_features: Set[str]  # NEW: Feature requirements
    optional_features: Set[str]  # NEW: Optional features
    suggested_appliances: List[str]  # NEW: System suggestions
    ...
```

**Example Recipe Tags:**
```python
# Simple recipe - single appliance
roast_chicken_basic = Recipe(
    name="Roast Chicken",
    required_features={"oven"},
    optional_features={"temperature_probe"},
    suggested_appliances=["ninja_combi"]
)

# Advanced recipe - multiple appliances required
roast_chicken_probe = Recipe(
    name="Perfect Roast Chicken",
    required_features={"oven", "temperature_probe"},
    optional_features=set(),
    suggested_appliances=["ninja_combi", "meater_plus"]
)

# Complex recipe - multiple options
pulled_pork = Recipe(
    name="Pulled Pork",
    required_features={"slow_cook", "temperature_probe"},  
    optional_features=set(),
    suggested_appliances=["multifry", "meater_plus"]  # OR pressure_cooker + meater
)
```

### 2.2 Feature Matcher
**File: `recipes/matcher.py`**
```python
class RecipeMatcher:
    """Matches recipes to available appliances based on features."""
    
    def get_available_recipes(registry: ApplianceRegistry) -> List[Recipe]:
        """Returns recipes that can be cooked with current appliances."""
        available_features = registry.get_available_features()
        return [r for r in ALL_RECIPES if r.required_features.issubset(available_features)]
    
    def suggest_appliance_combination(recipe: Recipe, registry: ApplianceRegistry) -> Dict:
        """Suggests best appliance combination for a recipe."""
        # Smart matching algorithm
        # Returns: {"primary": appliance1, "secondary": appliance2, "confidence": 0.95}
```

### 2.3 Recipe Database Updates
- Tag all 44 existing recipes (31 Ninja Combi + 13 MultiFry)
- Add feature requirements to each recipe
- Add suggested appliance combinations

## Phase 3: Dynamic Frontend Panel

### 3.1 Feature-Based UI Visibility
**File: `www/panel-class-template.js`**

```javascript
class KitchenCookingPanel extends LitElement {
    _availableFeatures = new Set();
    _appliances = [];
    
    async connectedCallback() {
        super.connectedCallback();
        await this._loadAppliances();
        this._updateAvailableFeatures();
    }
    
    _updateAvailableFeatures() {
        // Aggregate features from all appliances
        this._availableFeatures.clear();
        for (const appliance of this._appliances) {
            appliance.features.forEach(f => this._availableFeatures.add(f));
        }
        this.requestUpdate();
    }
    
    _renderMainPanel() {
        return html`
            <!-- Show cook session UI if temperature_probe available -->
            ${this._availableFeatures.has('temperature_probe') ? this._renderCookSessionUI() : ''}
            
            <!-- Show recipe buttons based on available features -->
            ${this._renderRecipeButtons()}
            
            <!-- Show appliance management -->
            ${this._renderApplianceManager()}
        `;
    }
    
    _renderRecipeButtons() {
        const buttons = [];
        
        // Ninja Combi recipes (if combi features available)
        if (this._hasCombiFeatures()) {
            buttons.push(html`<button @click=${() => this._showNinjaCombiRecipes()}>
                🥘 Ninja Combi Recipes
            </button>`);
        }
        
        // MultiFry recipes (if multifry features available)
        if (this._hasMultiFryFeatures()) {
            buttons.push(html`<button @click=${() => this._showMultiFryRecipes()}>
                🍟 MultiFry Recipes
            </button>`);
        }
        
        // Universal recipes (available to all)
        buttons.push(html`<button @click=${() => this._showAllRecipes()}>
            📖 All Available Recipes
        </button>`);
        
        return html`<div class="recipe-buttons">${buttons}</div>`;
    }
}
```

### 3.2 Appliance Management UI
```html
<div class="appliance-manager">
    <h3>Your Kitchen Appliances</h3>
    <div class="appliance-list">
        <!-- List all configured appliances -->
        <div class="appliance-card meater">
            <span class="icon">🌡️</span>
            <span class="name">MEATER+ Probe</span>
            <span class="features">temp_probe, ambient</span>
            <button>Configure</button>
        </div>
        <div class="appliance-card ninja-combi">
            <span class="icon">🥘</span>
            <span class="name">Ninja Combi</span>
            <span class="features">combi_crisp, steam, air_fry, oven</span>
            <button>Configure</button>
        </div>
    </div>
    <button class="add-appliance">+ Add Appliance</button>
</div>
```

### 3.3 Smart Recipe Suggestions
```javascript
_showRecipeDetail(recipe) {
    // Check if user has all required appliances
    const hasAllFeatures = recipe.required_features.every(f => 
        this._availableFeatures.has(f)
    );
    
    if (!hasAllFeatures) {
        return html`
            <div class="recipe-detail">
                <h2>${recipe.name}</h2>
                <div class="warning">
                    ⚠️ This recipe requires appliances you don't have:
                    ${this._getMissingFeatures(recipe)}
                </div>
            </div>
        `;
    }
    
    // Suggest appliance combination
    const suggestion = this._suggestAppliances(recipe);
    
    return html`
        <div class="recipe-detail">
            <h2>${recipe.name}</h2>
            
            <div class="appliance-suggestion">
                <h3>Recommended Setup:</h3>
                <div class="suggested-appliances">
                    ${suggestion.appliances.map(a => html`
                        <div class="appliance-badge">${a.name}</div>
                    `)}
                </div>
                <button @click=${() => this._overrideAppliances(recipe)}>
                    Change Appliances
                </button>
            </div>
            
            <!-- Recipe details, start cook button, etc. -->
        </div>
    `;
}
```

## Phase 4: Multi-Appliance Recipe Execution

### 4.1 Appliance Coordinator
**File: `coordinator.py`**
```python
class ApplianceCookCoordinator:
    """Coordinates cooking across multiple appliances."""
    
    def start_multi_appliance_cook(
        self,
        recipe: Recipe,
        appliances: List[KitchenAppliance],
        options: Dict[str, Any]
    ) -> CookSession:
        """Starts a cook session using multiple appliances."""
        
        # Validate appliances have required features
        # Create cook session with all appliances
        # Setup monitoring and automation
        # Return coordinated session
```

### 4.2 Cook Session Updates
**File: `sensor.py`**
```python
class CookingSessionSensor:
    # NEW: Track multiple appliances in session
    _active_appliances: List[str]  # Appliance IDs involved
    _primary_appliance: str  # Main appliance (e.g., oven)
    _secondary_appliances: List[str]  # Support appliances (e.g., probe)
    
    def start_cook_with_appliances(
        self,
        recipe: Recipe,
        appliance_assignments: Dict[str, str]
    ):
        """Starts cook with specific appliance assignments."""
        # appliance_assignments = {"oven": "ninja_combi_1", "probe": "meater_1"}
```

### 4.3 Automation Triggers
```yaml
# Example automation using multi-appliance cook
automation:
  - alias: "Perfect Roast Chicken"
    trigger:
      - platform: time
        at: "17:00:00"
    action:
      - service: kitchen_cooking_engine.start_multi_appliance_cook
        data:
          recipe_id: 1001  # Roast Chicken with Probe
          appliances:
            oven: sensor.ninja_combi_cooking_session
            probe: sensor.meater_cooking_session
          target_temp_c: 74
```

## Implementation Order

### Week 1: Foundation
1. Create appliance registry system
2. Create feature catalog
3. Update appliance base classes with feature declarations
4. Add feature aggregation logic

### Week 2: Config Flow
1. Redesign config flow for appliance selection
2. Implement MEATER+ config flow
3. Implement Ninja Combi config flow
4. Implement MultiFry config flow
5. Implement Custom appliance config flow

### Week 3: Recipe System
1. Create recipe feature tagging system
2. Tag all existing recipes
3. Implement recipe matcher
4. Create appliance suggestion algorithm

### Week 4: Frontend
1. Update panel to load multiple appliances
2. Implement feature-based UI visibility
3. Add appliance manager UI
4. Implement smart suggestions UI
5. Add appliance override functionality

### Week 5: Multi-Appliance Execution
1. Create appliance coordinator
2. Update cook session for multiple appliances
3. Add automation integration
4. Testing and refinement

## Migration Strategy

### Backward Compatibility
- Existing single config entry → migrated to MEATER+ appliance
- All current features continue working
- No breaking changes for existing users

### Migration Steps
1. On first load after update, detect old config format
2. Create new MEATER+ appliance config entry
3. Copy all settings to new entry
4. Mark old entry for deprecation (still works)
5. Show notification: "Please add your other appliances!"

## Success Metrics
- ✅ Multiple appliances can be added independently
- ✅ UI shows only relevant features based on appliances
- ✅ Recipes filter based on available features
- ✅ Multi-appliance recipes work correctly
- ✅ Smart suggestions provide good recommendations
- ✅ User can override appliance selections
- ✅ Backward compatible with existing installations

## Future Enhancements
- Machine learning for appliance suggestions
- Community recipe sharing
- Appliance capability learning
- Recipe difficulty scoring
- Cooking automation sequences
- Integration with meal planning systems
