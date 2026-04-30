/**
 * Kitchen Cooking Panel - UI Class Template
 * 
 * ╔══════════════════════════════════════════════════════════════════════════════╗
 * ║  THIS FILE IS THE SOURCE OF TRUTH FOR UI CODE ONLY                          ║
 * ╠══════════════════════════════════════════════════════════════════════════════╣
 * ║                                                                              ║
 * ║  ✅ EDIT THIS FILE FOR: UI buttons, graph, layout, behavior                 ║
 * ║  ❌ DO NOT ADD HERE: Cooking data (meats, cuts, temps, doneness)            ║
 * ║                                                                              ║
 * ║  COOKING DATA SOURCE OF TRUTH:                                               ║
 * ║    → cooking_data.py (International)                                         ║
 * ║    → swedish_cooking_data.py (Swedish)                                       ║
 * ║                                                                              ║
 * ║  The generator (generate_frontend_data.py) combines:                         ║
 * ║    1. Header + imports                                                       ║
 * ║    2. Cooking data constants (from Python files)                             ║
 * ║    3. This class code (from this template)                                   ║
 * ║                                                                              ║
 * ║  After editing, run: python3 generate_frontend_data.py                       ║
 * ║                                                                              ║
 * ╚══════════════════════════════════════════════════════════════════════════════╝
 */

// Maps MEATER cooking method slugs to the nearest AI cooking style id.
// Best-effort; any unrecognised slug falls back to 'comfort_food'.
const MEATER_METHOD_TO_AI_STYLE = {
  oven_roast: 'comfort_food', oven_bake: 'comfort_food', slow_roast: 'slow_cook',
  grill: 'barbeque', bbq: 'barbeque', charcoal_grill: 'barbeque',
  pan_fry: 'quick_and_easy', pan_sear: 'quick_and_easy',
  smoke: 'barbeque', slow_cooker: 'slow_cook', braise: 'slow_cook',
  deep_fry: 'quick_and_easy', air_fry: 'quick_and_easy',
};

// Sentinel string used to flag history entries saved for later without cooking.
const SAVED_NOT_YET_COOKED = 'Saved, not yet cooked';

class KitchenCookingPanel extends LitElement {
  static get properties() {
    return {
      hass: {
        type: Object,
        // Always re-render when hass is set.
        //
        // HA reuses the SAME hass object reference and mutates it in place, so
        // oldVal === newVal in every hasChanged call.  Any check based on object
        // identity (connection, states[key]) therefore always returns false and
        // the panel never re-renders after the tab returns from the background —
        // which is the root cause of the persistent blank-screen bug.
        //
        // Returning true unconditionally means a render is queued on every hass
        // assignment (batched by LitElement to at most one per microtask cycle).
        // The performance impact is negligible for a cooking panel.
        hasChanged() { return true; }
      },
      narrow: { type: Boolean },
      route: { type: Object },
      panel: { type: Object },
      _selectedCategory: { type: String },
      _selectedMeat: { type: Number },
      _selectedCutType: { type: Number },
      _selectedCut: { type: Number },
      _selectedDoneness: { type: String },
      _selectedMethod: { type: String },
      _selectedEntity: { type: String },
      _dataSource: { type: String },
      _customTargetTempC: { type: Number },
      _showTempAdjust: { type: Boolean },
      _showHistory: { type: Boolean },
      _cookHistory: { type: Array },
      _cutPreferences: { type: Object },
      _currentNotes: { type: String },
      _showNotes: { type: Boolean },
      _showActiveTempAdjust: { type: Boolean },
      _activeTempAdjustC: { type: Number },
      _showNinjaCombi: { type: Boolean },
      _selectedNinjaRecipe: { type: Number },
      _showRecipeBuilder: { type: Boolean },
      _builderBase: { type: String },
      _builderProtein: { type: String },
      _builderVeggies: { type: Array },
      _builderUseMeater: { type: Boolean },
      // Phase 3.3: Multi-appliance support
      _appliances: { type: Array },
      _availableFeatures: { type: Set },
      _showAppliances: { type: Boolean },
      _showRecipes: { type: Boolean },
      _compatibleRecipes: { type: Array },
      _recipeQualityFilter: { type: String },
      // Phase 3.4: Recipe detail view
      _selectedRecipeDetail: { type: Object },
      // Phase 3.5: Loading and error states
      _isLoadingAppliances: { type: Boolean },
      _isLoadingRecipes: { type: Boolean },
      _errorMessage: { type: String },
      // AI Recipe Builder
      _showAIRecipeBuilder: { type: Boolean },
      // Old AI builder properties removed - Phase 6 uses different state variables
      // Message dialog (replaces non-copyable alert())
      _showMessageDialog: { type: Boolean },
      _messageDialogTitle: { type: String },
      _messageDialogContent: { type: String },
      _messageDialogIsError: { type: Boolean },
      // Phase 1: GUI Redesign - Navigation state
      _currentPath: { type: String },  // 'welcome', 'meater_experimental', 'ninja_combi', 'ai_recipe_builder', 'previous_cooks', 'recent_meater'
      _selectedAppliance: { type: Object },  // Selected appliance from welcome screen
      _showMeaterCooking: { type: Boolean },  // Show MEATER cooking form in MEATER path
      // Phase 5/6: Recipe and AI builder states
      _selectedSecondaryAppliances: { type: Array },  // Selected secondary appliances for AI builder
      _ninjaBuiltInRecipes: { type: Array },  // List of built-in Ninja Combi recipes
      _aiRecipeSuggestions: { type: Array },  // AI-generated recipe suggestions
      _selectedIngredients: { type: Array },  // Selected ingredients for AI recipe
      _selectedCookingStyle: { type: String },  // Selected cooking style for AI recipe
      _showNinjaRecipeList: { type: Boolean },  // Show Ninja built-in recipe list
      _showAIIngredientSelector: { type: Boolean },  // Show AI ingredient selection
      _showAIStyleSelector: { type: Boolean },  // Show AI cooking style selection
      _showAIRecipeSuggestions: { type: Boolean },  // Show AI recipe suggestions
      // Custom temperature profile (MEATER path)
      _customProfileName: { type: String },
      _customProfileTempC: { type: Number },
      // AI Recipe Builder - style page enhancements
      _aiComplexity: { type: Number },
      _aiPortions: { type: Number },
      _aiMaxTime: { type: Number },
      _aiSelectedCuisines: { type: Array },
      _aiExpandedRegions: { type: Array },
      // AI generation cancellation
      _aiGeneratingAbort: { type: Object },
      _messageDialogOnCancel: { type: Object },
      // AI Settings
      _aiAgentId: { type: String },
      _aiBackupAgentId: { type: String },
      _showAISettingsModal: { type: Boolean },
      // AI generation live status
      _aiGenerationStatus: { type: String },
      _aiGenerationElapsed: { type: Number },
      // Feature notes editing in appliance path
      _showFeatureNotesEditor: { type: Boolean },
      // MEATER cook rating state (Issue #65)
      _meaterCookRatingState: { type: Object },
      // Phase 7: Language & Measurement
      _language: { type: String },
      _measurementSystem: { type: String },
      _hideOtherDataSource: { type: Boolean },
      // Phase 8: Ingredient levels, shelf management, cooking modes
      _shelfEnabled: { type: Boolean },
      _cookingMode: { type: String },
      _shelfInventory: { type: Array },
      _showAddShelfItem: { type: Boolean },
      _shelfAddName: { type: String },
      _shelfAddLocation: { type: String },
      _shelfAddQuantity: { type: String },
      _shoppingList: { type: Array },
      _pendingShelfUpdate: { type: Object },
      // AI ingredient picker — "More" expansion and protein drill-down
      _ingredientExpandedCats: { type: Array },   // category codes with "More" expanded
      _ingredientProteinSubcat: { type: String },  // active protein sub-category (e.g. "beef")
      // Experimental recipe viewer (cut profile card)
      _recipeViewerMethod: { type: String },
      _recipeViewerRecipes: { type: Array },
      _recipeViewerLoading: { type: Boolean },
      // Recipe file inline viewer (cut profile card)
      _recipeFileContent: { type: String },
      _recipeFileUrl: { type: String },
      _recipeFileLoading: { type: Boolean },
      // Which method research pill is expanded (shows description + recipe list)
      _selectedResearchMethod: { type: String },
      // Which recipe index is open in the single-recipe view
      _selectedFileRecipe: { type: Number },
      // Full-screen recipe viewer (MEATER path)
      _fullscreenRecipeMode: { type: Boolean },
      _fullscreenRecipeTitle: { type: String },
      _fullscreenRecipeMonitoring: { type: Boolean },
      // Feature: Cooked and Saved Recipes filters
      _hideCooked: { type: Boolean },
      _hideSaved: { type: Boolean },
      // Feature: MEATER AI shortcut weight input
      _meaterAiWeight: { type: String },
      // Flag: AI suggestions reached from MEATER cut shortcut (affects back navigation)
      _meaterAiFromShortcut: { type: Boolean },
      // Target temps captured from MEATER doneness selection at shortcut launch time
      _meaterAiTargetTempC: { type: Number },
      _meaterAiTargetTempF: { type: Number },

    };
  }

  constructor() {
    super();
    this._selectedCategory = null;
    this._selectedMeat = null;
    this._selectedCutType = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    this._selectedMethod = "oven_roast";
    this._selectedEntity = null;
    this._dataSource = DATA_SOURCE_INTERNATIONAL;
    this._customTargetTempC = null;
    this._showTempAdjust = false;
    this._showHistory = false;
    this._cookHistory = [];
    this._cutPreferences = {};
    this._currentNotes = "";
    this._showNotes = false;
    this._showActiveTempAdjust = false;
    this._activeTempAdjustC = null;
    this._showNinjaCombi = false;
    this._selectedNinjaRecipe = null;
    this._showRecipeBuilder = false;
    this._builderBase = null;
    this._builderProtein = null;
    this._builderVeggies = [];
    this._builderUseMeater = true;
    this._visibilityHandler = null;
    this._graphCard = null;
    this._graphCardSessionStart = null; // Track which session the graph was created for
    // Phase 3.3: Multi-appliance support
    this._appliances = [];
    this._availableFeatures = new Set();
    this._showAppliances = false;
    // Phase 5/6: Recipe and AI builder states
    this._selectedSecondaryAppliances = [];
    this._ninjaBuiltInRecipes = [];
    this._aiRecipeSuggestions = [];
    this._selectedIngredients = [];
    this._selectedCookingStyle = null;
    this._showNinjaRecipeList = false;
    this._showAIIngredientSelector = false;
    this._showAIStyleSelector = false;
    this._showAIRecipeSuggestions = false;
    this._showRecipes = false;
    this._compatibleRecipes = [];
    this._recipeQualityFilter = 'acceptable'; // Show acceptable and better by default
    // Phase 3.4: Recipe detail view
    this._selectedRecipeDetail = null;
    // Phase 3.5: Loading and error states
    this._isLoadingAppliances = false;
    this._isLoadingRecipes = false;
    this._errorMessage = null;
    // AI Recipe Builder
    this._showAIRecipeBuilder = false;
    this._aiIngredients = [];
    this._aiCookingStyles = [];
    // Old AI builder state removed - Phase 6 uses different variables
    // Phase 6: AI Recipe Builder state (new implementation)
    this._commonIngredients = [];
    this._cookingStyles = [];
    this._selectedIngredients = [];
    this._selectedCookingStyle = null;
    this._aiRecipeSuggestions = [];
    this._selectedMainAppliance = null;
    this._selectedSecondaryAppliances = [];
    this._showAIIngredientSelector = false;
    // Message dialog
    this._showMessageDialog = false;
    this._messageDialogTitle = '';
    this._messageDialogContent = '';
    this._messageDialogIsError = false;
    // Phase 1: GUI Redesign - Navigation state
    this._currentPath = 'welcome';  // Start at welcome screen
    this._selectedAppliance = null;
    // Phase 2: MEATER cooking mode state
    this._showMeaterCooking = false;
    // Phase 3: Cook detail view state
    this._selectedCookForDetail = null;
    // Phase 4: Recipe Cook Flow state — supports multiple parallel cooks
    this._activeRecipeCooks = []; // Array of all running recipe cook states [{id, recipe, startTime, currentStep, ...}]
    this._recipeCookState = null; // Pointer to the currently VIEWED cook (same object in _activeRecipeCooks), or null
    this._recipeCookTimer = null; // setInterval handle for elapsed time updates (active only when viewing)
    this._serverActiveRecipeCooks = null; // Array of recipe cooks from server (cross-device visibility)
    // Restore active recipe cooks from sessionStorage (survives navigation away and back)
    this._restoreActiveRecipeCooks();
    // Custom temperature profile
    this._customProfileName = '';
    this._customProfileTempC = 70;
    // AI Recipe Builder style enhancements
    this._aiComplexity = 3; // 1-5 scale, 3 = medium
    this._aiPortions = 4; // Default 4 portions
    this._aiMaxTime = 0;  // 0 = no limit; otherwise max minutes (step 15, up to 240)
    this._aiSelectedCuisines = []; // Multi-select cuisine/region list
    this._aiExpandedRegions = []; // Which region dropdowns are open
    this._aiGeneratingAbort = null; // AbortController for cancelling generation
    this._messageDialogOnCancel = null; // Optional cancel callback for dialog
    this._aiAgentId = ''; // AI agent entity ID for recipe generation
    this._aiBackupAgentId = ''; // Backup AI agent (used when primary is overloaded)
    this._showAISettingsModal = false; // Show AI settings modal
    this._aiGenerationStatus = ''; // Live status message during AI generation
    this._aiGenerationElapsed = 0; // Seconds elapsed since generation started
    this._aiGenerationTimer = null; // Interval handle for status ticker
    this._showFeatureNotesEditor = false; // Show feature notes editor in appliance path
    this._meaterCookRatingState = null; // MEATER cook rating state (Issue #65)
    // Phase 7: Language & Measurement system (independent selections)
    this._language = 'en';               // UI language: 'sv' or 'en'
    this._measurementSystem = 'se';      // Measurement: 'se', 'uk', or 'us'
    this._hideOtherDataSource = false;   // Hide inactive data source button
    // Phase 8: Ingredient levels, shelf management, cooking modes
    this._shelfEnabled = false;
    this._cookingMode = 'A';
    this._shelfInventory = [];
    this._showAddShelfItem = false;
    this._shelfAddName = '';
    this._shelfAddLocation = 'larder';
    this._shelfAddQuantity = '';
    this._shoppingList = [];
    this._pendingShelfUpdate = null;
    this._ingredientExpandedCats = [];
    this._ingredientProteinSubcat = null;
    this._recipeViewerMethod = null;
    this._recipeViewerRecipes = [];
    this._recipeViewerLoading = false;
    this._recipeFileContent = null;
    this._recipeFileUrl = null;
    this._recipeFileLoading = false;
    this._selectedResearchMethod = null;
    this._selectedFileRecipe = null;
    this._fullscreenRecipeMode = false;
    this._fullscreenRecipeTitle = null;
    this._fullscreenRecipeMonitoring = false;
    // Cooked and Saved Recipes filter toggles
    this._hideCooked = false;
    this._hideSaved = false;
    // MEATER AI shortcut
    this._meaterAiWeight = '';
    this._meaterAiFromShortcut = false;
    this._meaterAiTargetTempC = null;
    this._meaterAiTargetTempF = null;
    // Run generate_frontend_data.py after modifying cooking_data.py or swedish_cooking_data.py
  }

  connectedCallback() {
    super.connectedCallback();

    // Track our ha-panel-custom parent for the module-level blank-screen recovery.
    // Must be set here (not in the constructor) because parentElement is only
    // available once the element is attached to the DOM.
    _kceHaPanelParent = this.parentElement;

    // Data is embedded in this file - generated from backend at build time
    
    // Ensure _currentPath is always set to a valid value
    if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
      this._currentPath = 'welcome';
    }
    
    // Load user preferences
    this._loadPreferences();
    
    // Phase 7: Load language & measurement preferences
    this._loadLanguagePreference();
    this._loadMeasurementPreference();
    this._loadHideOtherDataSourcePreference();
    
    // Phase 8: Load shelf preference + inventory
    this._loadShelfPreference();
    
    // Load AI settings to determine if AI Recipe Builder should be visible
    this._loadAISettings();
    
    // Phase 3.3: Load appliances and features
    this._loadAppliances();
    this._loadAvailableFeatures();
    
    // Load server-side recipe cook state for cross-device visibility
    this._loadServerActiveRecipeCooks();
    
    // --- In-element visibility handlers ---
    // These handlers cover the case where the element is still in the DOM when
    // the tab returns (tab was hidden for < 5 minutes).  They reload fresh data
    // and force a re-render so the panel is always up-to-date when the user
    // returns.  Navigation state is PRESERVED — we never reset to welcome.
    //
    // Note: for the case where HA destroys and recreates this element (tab hidden
    // > 5 min), see the module-level _kceRecoverPanel mechanism below the class.
    this._visibilityHandler = () => {
      if (document.visibilityState === 'visible') {
        // Preserve whatever screen the user was on — do NOT reset to welcome.
        // The active_cook render path already validates the entity state and
        // self-corrects to welcome if the cook has ended while the tab was away.
        this._meaterCookRatingState = null; // clear any stale rating overlay

        // Reload fresh data from the backend.
        this._loadAppliances();
        this._loadAISettings();
        this._loadServerActiveRecipeCooks();

        // Immediate re-render so stale screens refresh their content.
        this.requestUpdate();

        // Additional re-render after the next paint, in case the browser discarded
        // GPU compositor layers for the background tab (common on mobile).
        requestAnimationFrame(() => {
          this.requestUpdate();
          if (this.shadowRoot) void this.shadowRoot.host.offsetHeight;
        });
      }
    };
    document.addEventListener('visibilitychange', this._visibilityHandler);
    
    // pageshow fires when page is restored from bfcache (back/forward navigation).
    this._pageshowHandler = (event) => {
      if (event.persisted) {
        // Stay on whatever screen was active — the render logic self-corrects stale state.
        this._loadAppliances();
        this.requestUpdate();
        requestAnimationFrame(() => this.requestUpdate());
      }
    };
    window.addEventListener('pageshow', this._pageshowHandler);

    // window focus covers the case where visibilitychange didn't fire (e.g. some
    // mobile browsers, or when switching OS windows rather than browser tabs).
    this._focusHandler = () => {
      // Stay on whatever screen was active — do NOT reset to welcome.
      this.requestUpdate();
    };
    window.addEventListener('focus', this._focusHandler);
    
    // IntersectionObserver handles the case where HA hides/shows the panel via
    // CSS (display:none) rather than removing it from the DOM.  This does NOT
    // fire visibilitychange or focus events.
    if (typeof IntersectionObserver !== 'undefined') {
      this._intersectionObserver = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
          if (entry.isIntersecting) {
            if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
              this._currentPath = 'welcome';
            }
            this.requestUpdate();
          }
        });
      });
      this._intersectionObserver.observe(this);
    }
    
    // Initial render on first connection.
    this.requestUpdate();
  }

  disconnectedCallback() {
    super.disconnectedCallback();
    // Clean up all visibility/event handlers
    if (this._visibilityHandler) {
      document.removeEventListener('visibilitychange', this._visibilityHandler);
      this._visibilityHandler = null;
    }
    if (this._pageshowHandler) {
      window.removeEventListener('pageshow', this._pageshowHandler);
      this._pageshowHandler = null;
    }
    if (this._focusHandler) {
      window.removeEventListener('focus', this._focusHandler);
      this._focusHandler = null;
    }
    if (this._intersectionObserver) {
      this._intersectionObserver.disconnect();
      this._intersectionObserver = null;
    }
  }

  async _loadPreferences() {
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/preferences');
      if (response && response.cut_preferences) {
        this._cutPreferences = response.cut_preferences;
      }
    } catch (e) {
      console.log('Could not load preferences:', e);
    }
  }

  // =========================================================================
  // Phase 7: Translation (i18n) & Measurement system
  // =========================================================================

  /**
   * Translate a key like "meater.ready_to_cook" into the current language.
   * Falls back to English, then to the key itself.
   */
  _t(key) {
    const lang = this._language || 'en';
    const parts = key.split('.');
    // Try requested language
    let node = (typeof I18N_STRINGS !== 'undefined') ? I18N_STRINGS[lang] : undefined;
    for (const p of parts) {
      if (node && typeof node === 'object') node = node[p];
      else { node = undefined; break; }
    }
    if (typeof node === 'string') return node;
    // Fallback to English
    if (lang !== 'en') {
      node = (typeof I18N_STRINGS !== 'undefined') ? I18N_STRINGS['en'] : undefined;
      for (const p of parts) {
        if (node && typeof node === 'object') node = node[p];
        else { node = undefined; break; }
      }
      if (typeof node === 'string') return node;
    }
    return key; // last resort: return the key
  }

  /**
   * Convert a quantity+unit to the user's preferred measurement system.
   * E.g. _convertMeasure(500, 'ml') → "5 dl" (SE) or "2.1 cup" (US).
   */
  _convertMeasure(value, fromUnit) {
    const sysId = this._measurementSystem || 'se';
    const sys = (typeof MEASUREMENT_SYSTEMS !== 'undefined') ? MEASUREMENT_SYSTEMS[sysId] : null;
    if (!sys || !sys.units) return `${value} ${fromUnit}`;

    // Find source unit's base multiplier from any system (they share units)
    let toBase = null;
    let unitType = null;
    for (const msKey of Object.keys(MEASUREMENT_SYSTEMS)) {
      const msUnits = MEASUREMENT_SYSTEMS[msKey].units;
      if (msUnits[fromUnit]) {
        toBase = msUnits[fromUnit].to_base;
        unitType = msUnits[fromUnit].type;
        break;
      }
    }
    if (toBase === null) return `${value} ${fromUnit}`;

    const baseValue = value * toBase;
    const prefs = unitType === 'volume' ? sys.volume_prefs : sys.mass_prefs;

    for (const rule of prefs) {
      const minVal = unitType === 'volume' ? rule.min_ml : rule.min_g;
      const targetUnit = sys.units[rule.unit];
      if (!targetUnit) continue;
      if (baseValue >= minVal) {
        const converted = baseValue / targetUnit.to_base;
        const numStr = converted === Math.floor(converted)
          ? String(Math.floor(converted))
          : converted < 10
            ? converted.toFixed(1).replace(/\.?0+$/, '')
            : String(Math.round(converted));
        const lang = this._language || 'en';
        const abbr = lang === 'sv' ? targetUnit.abbr_sv : targetUnit.abbr_en;
        // Swedish locale uses comma for decimal separator
        const displayNum = lang === 'sv' ? numStr.replace('.', ',') : numStr;
        return `${displayNum} ${abbr}`;
      }
    }
    return `${value} ${fromUnit}`;
  }

  /**
   * Convert a temperature in °C for display in the user's measurement system.
   * SE/UK → "70°C", US → "158°F (70°C)".
   */
  _convertTemp(tempC) {
    const sysId = this._measurementSystem || 'se';
    const sys = (typeof MEASUREMENT_SYSTEMS !== 'undefined') ? MEASUREMENT_SYSTEMS[sysId] : null;
    if (sys && sys.temp_unit === 'F') {
      const f = Math.round(tempC * 9 / 5 + 32);
      return `${f}°F (${Math.round(tempC)}°C)`;
    }
    return `${Math.round(tempC)}°C`;
  }

  /**
   * Convert measurement patterns in a free-text ingredient or instruction string.
   * Parses patterns like "1.5 lb", "1/2 cup", "2 tablespoons", "400°F" and converts
   * them to the user's selected measurement system.
   * Used as a safety-net for AI-generated text that may still contain wrong units.
   */
  _convertIngredientText(text) {
    if (!text || typeof text !== 'string') return text;
    const sysId = this._measurementSystem || 'se';
    if (typeof MEASUREMENT_SYSTEMS === 'undefined') return text;
    const sys = MEASUREMENT_SYSTEMS[sysId];
    if (!sys || !sys.units) return text;

    // Map of text patterns → unit ID in MEASUREMENT_SYSTEMS (source unit)
    const unitPatterns = [
      // Volume — long forms first to avoid partial matches
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:tablespoons?|Tablespoons?|TBSP)\b/g, unit: 'tbsp' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:teaspoons?|Teaspoons?|TSP)\b/g, unit: 'tsp' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:cups?|Cups?)\b/g, unit: 'cup' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:fl\.?\s*oz|fluid\s*ounces?)\b/gi, unit: 'fl_oz' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:tbsp)\b/g, unit: 'tbsp' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:tsp)\b/g, unit: 'tsp' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:pints?|Pints?)\b/g, unit: 'pint' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:quarts?|Quarts?)\b/g, unit: 'quart' },
      // Mass — long forms first
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:pounds?|Pounds?|lbs?)\b/g, unit: 'lb' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:ounces?|Ounces?)\b/g, unit: 'oz' },
      { re: /\b(\d+(?:[.,\/]\d+)?)\s*(?:oz)\b/g, unit: 'oz' },
    ];

    // Parse fraction strings like "1/2" or "1 1/2"
    const parseFrac = (s) => {
      s = s.replace(',', '.');
      if (s.includes('/')) {
        const parts = s.split('/');
        return parseFloat(parts[0]) / parseFloat(parts[1]);
      }
      return parseFloat(s);
    };

    let result = text;

    // Handle compound fractions like "1 1/2 cups" → 1.5 cups
    result = result.replace(/(\d+)\s+(\d+\/\d+)/g, (m, whole, frac) => {
      return String(parseInt(whole) + parseFrac(frac));
    });

    for (const { re, unit } of unitPatterns) {
      result = result.replace(re, (match, numStr) => {
        const value = parseFrac(numStr);
        if (isNaN(value) || value <= 0) return match;
        return this._convertMeasure(value, unit);
      });
    }

    // Temperature conversion: "400°F" or "400 °F" → localized
    if (sys.temp_unit !== 'F') {
      // Convert °F to °C when user wants metric
      result = result.replace(/(\d+)\s*°\s*F\b/g, (match, fStr) => {
        const f = parseInt(fStr);
        const c = Math.round((f - 32) * 5 / 9);
        return `${c}°C`;
      });
      // Remove redundant "(200°C)" after we already converted
      result = result.replace(/\s*\(\d+°C\)/g, '');
    }

    // Swedish locale: convert decimal points to commas in numbers
    // e.g. "0.5 dl" → "0,5 dl", "1.5 hg" → "1,5 hg"
    if ((this._language || 'en') === 'sv') {
      result = result.replace(/(\d)\.(\d)/g, '$1,$2');
    }

    return result;
  }

  async _loadLanguagePreference() {
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/preferences/language');
      if (response && response.language) {
        this._language = response.language;
        if (this._hideOtherDataSource) {
          this._dataSource = (response.language === 'sv') ? DATA_SOURCE_SWEDISH : DATA_SOURCE_INTERNATIONAL;
        }
      }
    } catch (e) {
      console.log('Could not load language preference:', e);
    }
  }

  async _saveLanguagePreference(lang) {
    this._language = lang;
    if (this._hideOtherDataSource) {
      this._dataSource = (lang === 'sv') ? DATA_SOURCE_SWEDISH : DATA_SOURCE_INTERNATIONAL;
    }
    try {
      await this.hass.callApi('POST', 'kitchen_cooking_engine/preferences/language', { language: lang });
    } catch (e) {
      console.error('Could not save language preference:', e);
    }
  }

  async _loadMeasurementPreference() {
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/preferences/measurement_system');
      if (response && response.measurement_system) {
        this._measurementSystem = response.measurement_system;
      }
    } catch (e) {
      console.log('Could not load measurement preference:', e);
    }
  }

  async _saveMeasurementPreference(sys) {
    this._measurementSystem = sys;
    try {
      await this.hass.callApi('POST', 'kitchen_cooking_engine/preferences/measurement_system', { measurement_system: sys });
    } catch (e) {
      console.error('Could not save measurement preference:', e);
    }
  }

  _loadHideOtherDataSourcePreference() {
    try {
      const val = localStorage.getItem('kce_hide_other_data_source');
      if (val !== null) this._hideOtherDataSource = val === 'true';
      const src = localStorage.getItem('kce_data_source');
      if (src === 'swedish' || src === 'international') this._dataSource = src;
    } catch (e) {
      // localStorage unavailable, keep default
    }
  }

  _toggleHideOtherDataSource() {
    this._hideOtherDataSource = !this._hideOtherDataSource;
    if (this._hideOtherDataSource) {
      this._dataSource = (this._language === 'sv') ? DATA_SOURCE_SWEDISH : DATA_SOURCE_INTERNATIONAL;
    }
    try {
      localStorage.setItem('kce_hide_other_data_source', String(this._hideOtherDataSource));
    } catch (e) {
      // localStorage unavailable
    }
  }

  // ---- Phase 8: Shelf preference ----

  async _loadShelfPreference() {
    try {
      const prefs = await this.hass.callApi('GET', 'kitchen_cooking_engine/preferences');
      if (prefs) {
        if (typeof prefs.shelf_enabled === 'boolean') {
          this._shelfEnabled = prefs.shelf_enabled;
        }
        if (prefs.cooking_mode && ['A','B','C'].includes(prefs.cooking_mode)) {
          this._cookingMode = prefs.cooking_mode;
        }
      }
      if (this._shelfEnabled) {
        await this._loadShelfInventory();
      }
    } catch (e) {
      console.log('Could not load shelf preference:', e);
    }
  }

  async _saveShelfEnabled(enabled) {
    this._shelfEnabled = enabled;
    try {
      await this.hass.callApi('PATCH', 'kitchen_cooking_engine/preferences', { shelf_enabled: enabled });
      if (enabled) {
        await this._loadShelfInventory();
      }
    } catch (e) {
      console.error('Could not save shelf_enabled:', e);
    }
    this.requestUpdate();
  }

  async _saveCookingMode(mode) {
    this._cookingMode = mode;
    try {
      await this.hass.callApi('PATCH', 'kitchen_cooking_engine/preferences', { cooking_mode: mode });
    } catch (e) {
      console.error('Could not save cooking_mode:', e);
    }
    this.requestUpdate();
  }

  async _loadShelfInventory() {
    try {
      const resp = await this.hass.callApi('GET', 'kitchen_cooking_engine/shelf');
      this._shelfInventory = resp && resp.items ? resp.items : [];
    } catch (e) {
      console.error('Could not load shelf inventory:', e);
      this._shelfInventory = [];
    }
    this.requestUpdate();
  }

  async _addShelfItem() {
    const name = (this._shelfAddName || '').trim();
    if (!name) return;
    try {
      const resp = await this.hass.callApi('POST', 'kitchen_cooking_engine/shelf', {
        name,
        location: this._shelfAddLocation || 'larder',
        quantity: this._shelfAddQuantity || '',
      });
      if (resp && resp.item) {
        this._shelfInventory = [...this._shelfInventory, resp.item];
      }
      this._shelfAddName = '';
      this._shelfAddQuantity = '';
      this._showAddShelfItem = false;
    } catch (e) {
      console.error('Could not add shelf item:', e);
    }
    this.requestUpdate();
  }

  async _removeShelfItem(id) {
    try {
      await this.hass.callApi('DELETE', `kitchen_cooking_engine/shelf?id=${encodeURIComponent(id)}`);
      this._shelfInventory = this._shelfInventory.filter(i => i.id !== id);
    } catch (e) {
      console.error('Could not remove shelf item:', e);
    }
    this.requestUpdate();
  }

  // ---- Phase 8d: Shopping list ----

  async _loadShoppingList() {
    try {
      const resp = await this.hass.callApi('GET', 'kitchen_cooking_engine/shopping_list');
      this._shoppingList = resp && resp.items ? resp.items : [];
    } catch (e) {
      console.error('Could not load shopping list:', e);
      this._shoppingList = [];
    }
    this.requestUpdate();
  }

  async _toggleShoppingListItem(id) {
    try {
      await this.hass.callApi('PATCH', 'kitchen_cooking_engine/shopping_list', { id });
      this._shoppingList = this._shoppingList.map(i =>
        i.id === id ? { ...i, checked: !i.checked } : i
      );
    } catch (e) {
      console.error('Could not toggle shopping list item:', e);
    }
    this.requestUpdate();
  }

  async _deleteShoppingListItem(id) {
    try {
      await this.hass.callApi('DELETE', `kitchen_cooking_engine/shopping_list?id=${encodeURIComponent(id)}`);
      this._shoppingList = this._shoppingList.filter(i => i.id !== id);
    } catch (e) {
      console.error('Could not delete shopping list item:', e);
    }
    this.requestUpdate();
  }

  async _clearCheckedShoppingItems() {
    const checked = (this._shoppingList || []).filter(i => i.checked);
    for (const item of checked) {
      await this._deleteShoppingListItem(item.id);
    }
  }

  /**
   * Find the first HA todo entity (preferring todo.shopping_list).
   * Returns entity_id string or null if none found.
   */
  _findHATodoEntity() {
    if (!this.hass) return null;
    if (this.hass.states['todo.shopping_list']) return 'todo.shopping_list';
    return Object.keys(this.hass.states).find(id => id.startsWith('todo.')) || null;
  }

  /**
   * Push an array of name strings to the HA todo entity via todo.add_item.
   * Returns the number of items successfully pushed.
   */
  async _pushToHATodo(names) {
    const entityId = this._findHATodoEntity();
    if (!entityId || !names || names.length === 0) return 0;
    let count = 0;
    for (const name of names) {
      try {
        await this.hass.callService('todo', 'add_item', { entity_id: entityId, item: name });
        count++;
      } catch (e) {
        console.warn('KCE: could not push item to HA todo:', name, e);
      }
    }
    return count;
  }

  _navigateToShelfManagement() {
    this._showAddShelfItem = false;
    this._currentPath = 'shelf_management';
    this.requestUpdate();
  }

  _navigateToShoppingList() {
    this._loadShoppingList();
    this._currentPath = 'shopping_list';
    this.requestUpdate();
  }

  async _loadHistory() {
    try {
      // Call REST API endpoint at /api/kitchen_cooking_engine/history
      // Add cache-busting to prevent browser from serving stale data
      const timestamp = new Date().getTime();
      const response = await fetch(`/api/kitchen_cooking_engine/history?_=${timestamp}`, {
        headers: {
          'Authorization': `Bearer ${this.hass.auth.data.access_token}`,
          'Content-Type': 'application/json',
          'Cache-Control': 'no-cache',  // Prevent caching
          'Pragma': 'no-cache'            // IE11 compatibility
        }
      });
      
      if (!response.ok) {
        throw new Error(`HTTP ${response.status}: ${response.statusText}`);
      }
      
      const data = await response.json();
      
      if (data && data.history) {
        this._cookHistory = data.history;
      } else {
        this._cookHistory = [];
      }
    } catch (e) {
      console.error('Could not load history:', e);
      this._cookHistory = [];  // Set to empty array to prevent undefined errors
    }
  }

  // Phase 3.3: Load appliances from new API
  async _loadAppliances() {
    this._isLoadingAppliances = true;
    this._errorMessage = null;
    this.requestUpdate();
    
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/appliances');
      if (response && response.appliances) {
        this._appliances = response.appliances;
      }
    } catch (e) {
      console.error('Could not load appliances:', e);
      this._errorMessage = this._t('messages.load_appliances_failed');
    } finally {
      this._isLoadingAppliances = false;
      this.requestUpdate();
    }
  }

  // Phase 3.3: Load available features
  async _loadAvailableFeatures() {
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/available_features');
      if (response && response.features) {
        this._availableFeatures = new Set(response.features);
        this.requestUpdate();
      }
    } catch (e) {
      console.error('Could not load features:', e);
    }
  }

  // Phase 3.3: Load compatible recipes
  async _loadCompatibleRecipes() {
    this._isLoadingRecipes = true;
    this._errorMessage = null;
    this.requestUpdate();
    
    try {
      const response = await this.hass.callApi('GET', 
        `kitchen_cooking_engine/recipes/compatible?min_quality=${this._recipeQualityFilter}`);
      if (response && response.recipes) {
        this._compatibleRecipes = response.recipes;
      }
    } catch (e) {
      console.error('Could not load recipes:', e);
      this._errorMessage = this._t('messages.load_recipes_failed');
    } finally {
      this._isLoadingRecipes = false;
      this.requestUpdate();
    }
  }

  async _loadAIOpenAIStatus() {
    try {
      const checkResponse = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/check');
      this._aiOpenAIAvailable = checkResponse.available;
      this.requestUpdate();
    } catch (e) {
      console.error('[AI Recipe Builder] Failed to check OpenAI status:', e);
      this._aiOpenAIAvailable = false;
      this.requestUpdate();
    }
  }

  // OLD AI Recipe Builder methods removed - Phase 6 implementation used instead

  // Phase 3.3: Helper to check if a feature is available
  _hasFeature(featureName) {
    return this._availableFeatures.has(featureName);
  }

  _editCookNotes(cook) {
    const newNotes = prompt('Edit notes for this cook:', cook.notes || '');
    if (newNotes !== null) {
      this._updateCookNotes(cook.id, newNotes);
    }
  }

  async _updateCookNotes(cookId, notes) {
    try {
      await this.hass.callApi('PATCH', `kitchen_cooking_engine/history/${cookId}`, { notes });
      await this._loadHistory();
    } catch (e) {
      console.error('Could not update notes:', e);
    }
  }

  async _deleteCook(cookId) {
    if (!confirm('Delete this cook from history?')) return;
    try {
      await this.hass.callApi('DELETE', `kitchen_cooking_engine/history/${cookId}`);
      await this._loadHistory();
    } catch (e) {
      console.error('Could not delete cook:', e);
    }
  }

  _getDataCategories() {
    // The MEATER path is driven by EXP_TREE — built at generation time from
    // the KCE:CUT tagged cut files under docs/recipe_research/.
    // Adding a new cut requires only a new {slug}.md with a KCE:CUT tag;
    // cooking_data.py does not need to be touched.
    return EXP_TREE;
  }

  _getDonenessOptions() {
    return EXP_DONENESS_OPTIONS;
  }

  // ---------------------------------------------------------------------------
  // Recipe library helpers — all paths read the live recipe library.
  // ---------------------------------------------------------------------------

  _getRecipeIndex() {
    return RECIPE_INDEX;
  }

  _getCutProfiles() {
    return CUT_PROFILES;
  }

  _getCutProfilesSv() {
    return CUT_PROFILES_SV;
  }

  _getCutMethodProfiles() {
    return CUT_METHOD_PROFILES;
  }

  _getRecipeTitles() {
    return RECIPE_TITLES_INDEX;
  }

  _findCookingEntities() {
    if (!this.hass) return [];
    
    return Object.keys(this.hass.states)
      .filter(id => id.startsWith('sensor.') && id.includes('cooking_session'));
  }

  _getState() {
    if (!this._selectedEntity || !this.hass) return null;
    return this.hass.states[this._selectedEntity];
  }

  _callService(service, data = {}) {
    return this.hass.callService('kitchen_cooking_engine', service, {
      entity_id: this._selectedEntity,
      ...data
    });
  }

  _setNotes(notes) {
    this._currentNotes = notes;
    this._callService('set_notes', { notes });
  }

  _applyActiveTempAdjust() {
    const temp = parseInt(this._activeTempAdjustC);
    if (isNaN(temp) || temp < 30 || temp > 100) return;
    this._callService('set_target', { target_temp: temp });
    this._showActiveTempAdjust = false;
  }

  _getStateIcon(state) {
    const icons = {
      idle: '🥩',
      cooking: '🔥',
      approaching: '⚠️',
      goal_reached: '✅',
      resting: '⏱️',
      complete: '🍽️'
    };
    return icons[state] || '🍳';
  }

  _getCategory() {
    const categories = this._getDataCategories();
    return this._selectedCategory ? categories[this._selectedCategory] : null;
  }

  _getMeats() {
    const category = this._getCategory();
    return category ? category.meats : [];
  }

  _getMeat() {
    const meats = this._getMeats();
    return meats.find(m => m.id === this._selectedMeat);
  }

  _getCutTypes() {
    const meat = this._getMeat();
    return meat ? meat.cutTypes : [];
  }

  _getCutType() {
    const cutTypes = this._getCutTypes();
    return cutTypes.find(ct => ct.id === this._selectedCutType);
  }

  _getCuts() {
    const cutType = this._getCutType();
    return cutType ? cutType.cuts : [];
  }

  _getSelectedCutData() {
    const cuts = this._getCuts();
    return cuts.find(c => c.id === this._selectedCut);
  }

  _getAvailableDoneness() {
    const cut = this._getSelectedCutData();
    if (!cut) return [];
    
    // If API data with temperature_ranges is available, use that for more detailed info
    if (cut.temperature_ranges && cut.temperature_ranges.length > 0) {
      return cut.temperature_ranges.map(tr => ({
        value: tr.name,
        name: tr.name.replace(/_/g, ' ').replace(/\b\w/g, c => c.toUpperCase()),
        icon: this._getDonenessIcon(tr.name),
        description: tr.description,
        temp_c: tr.target_temp_c,
        temp_f: tr.target_temp_f,
      }));
    }
    
    // Fall back to doneness array with lookup from donenessOptions
    if (!cut.doneness) return [];
    const donenessOptions = this._getDonenessOptions();
    return cut.doneness.map(d => {
      const opt = donenessOptions[d];
      return opt ? { ...opt, value: d } : null;
    }).filter(Boolean);
  }

  _getDonenessIcon(donenessName) {
    const icons = {
      rare: "🔴",
      blodig: "🔴",
      medium_rare: "🟠",
      medium: "🟡",
      medium_well: "🟤",
      well_done: "⚪",
      genomstekt: "⚪",
      pulled: "🍖",
      långkokt: "🍖",
      safe: "✅",
      dark_meat_optimal: "🍗",
      crispy: "🥓",
      heated_through: "♨️",
      done: "✓",
      tender: "🥔",
      crisp_tender: "🥦",
      caramelized: "🧅",
      charred: "🔥",
    };
    return icons[donenessName] || "🍖";
  }

  _getRecommendedDoneness() {
    const cut = this._getSelectedCutData();
    if (!cut) return null;
    // Use explicit recommended_doneness (API format) or recommendedDoneness (JS format)
    if (cut.recommended_doneness) {
      return cut.recommended_doneness;
    }
    if (cut.recommendedDoneness) {
      return cut.recommendedDoneness;
    }
    // Check for is_meater_recommended in temperature_ranges (API format)
    if (cut.temperature_ranges) {
      const recommended = cut.temperature_ranges.find(tr => tr.is_meater_recommended);
      if (recommended) {
        return recommended.name;
      }
    }
    // Fall back to first doneness option
    if (cut.doneness && cut.doneness.length > 0) {
      return cut.doneness[0];
    }
    return null;
  }

  _getTargetTempForDoneness(donenessValue) {
    const cut = this._getSelectedCutData();
    
    // If cut has temperature_ranges (API format), use that for accurate temps
    if (cut && cut.temperature_ranges) {
      const range = cut.temperature_ranges.find(tr => tr.name === donenessValue);
      if (range) {
        return { c: range.target_temp_c, f: range.target_temp_f };
      }
    }
    
    // Fall back to global doneness options
    const donenessOptions = this._getDonenessOptions();
    const option = donenessOptions[donenessValue];
    return option ? { c: option.temp_c, f: option.temp_f } : null;
  }

  _switchDataSource(source) {
    this._dataSource = source;
    try {
      localStorage.setItem('kce_data_source', source);
    } catch (e) {
      // localStorage unavailable
    }
    // Reset all selections when switching data source
    this._selectedCategory = null;
    this._selectedMeat = null;
    this._selectedCutType = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    this._customTargetTempC = null;
    this._showTempAdjust = false;
    // Data source switch handled locally - both datasets are embedded
  }

  _selectCategory(categoryKey) {
    this._selectedCategory = categoryKey;
    this._selectedMeat = null;
    this._selectedCutType = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    this._customTargetTempC = null;
    this._showTempAdjust = false;
    
    // Custom category doesn't have meats — skip auto-select
    if (categoryKey === 'custom') return;
    
    // Auto-select meat if only one
    const categories = this._getDataCategories();
    const meats = categories[categoryKey]?.meats || [];
    if (meats.length === 1) {
      this._selectMeat(meats[0].id);
    }
  }

  _selectMeat(meatId) {
    this._selectedMeat = meatId;
    this._selectedCutType = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    this._customTargetTempC = null;
    this._showTempAdjust = false;
    
    // Auto-select cut type if only one
    const meat = this._getMeats().find(m => m.id === meatId);
    if (meat && meat.cutTypes.length === 1) {
      this._selectCutType(meat.cutTypes[0].id);
    }
  }

  _selectCutType(cutTypeId) {
    this._selectedCutType = cutTypeId;
    this._selectedCut = null;
    this._selectedDoneness = null;
    this._customTargetTempC = null;
    this._showTempAdjust = false;
  }

  _selectCut(cutId) {
    this._selectedCut = cutId;
    this._customTargetTempC = null;
    this._showTempAdjust = false;
    // Clear recipe viewer when cut changes
    this._recipeFileContent = null;
    this._recipeFileUrl = null;
    this._selectedResearchMethod = null;
    this._selectedFileRecipe = null;
    
    // Check if user has a saved preference for this cut
    const savedPref = this._cutPreferences[String(cutId)];
    if (savedPref && savedPref.doneness) {
      this._selectedDoneness = savedPref.doneness;
      if (savedPref.cooking_method) {
        this._selectedMethod = savedPref.cooking_method;
      }
      // Restore fine-tuned temperature if saved
      if (savedPref.custom_temp_c) {
        this._customTargetTempC = savedPref.custom_temp_c;
        this._showTempAdjust = true;  // Show temp adjust section since user had custom temp
      }
      return;
    }
    
    // Auto-select recommended doneness for this cut
    const cut = this._getCuts().find(c => c.id === cutId);
    if (cut) {
      // First try explicit recommended_doneness (API format) or recommendedDoneness (JS format)
      if (cut.recommended_doneness) {
        this._selectedDoneness = cut.recommended_doneness;
      } else if (cut.recommendedDoneness) {
        this._selectedDoneness = cut.recommendedDoneness;
      } else if (cut.doneness && cut.doneness.length > 0) {
        // Fall back to first valid doneness
        this._selectedDoneness = cut.doneness[0];
      } else {
        this._selectedDoneness = null;
      }

      // On experimental path: if the previously selected method is not listed
      // for this cut, reset it so the user picks one from the cut's own list.
      if (this._currentPath === 'meater_experimental' && cut.supported_methods && cut.supported_methods.length > 0) {
        if (!cut.supported_methods.includes(this._selectedMethod)) {
          this._selectedMethod = cut.supported_methods[0];
        }
      }
    } else {
      this._selectedDoneness = null;
    }
  }

  _selectDoneness(donenessValue) {
    this._selectedDoneness = donenessValue;
    // Reset custom temp when changing doneness
    this._customTargetTempC = null;
  }

  _toggleTempAdjust() {
    this._showTempAdjust = !this._showTempAdjust;
    if (!this._showTempAdjust) {
      this._customTargetTempC = null;
    } else {
      // Initialize with current doneness temp
      const temps = this._getTargetTempForDoneness(this._selectedDoneness);
      if (temps) {
        this._customTargetTempC = temps.c;
      }
    }
  }

  _updateCustomTemp(tempC) {
    const parsed = parseInt(tempC, 10);
    // Clamp temperature to valid range (35-100°C)
    this._customTargetTempC = Math.max(35, Math.min(100, parsed));
  }

  _toggleHistory() {
    this._showHistory = !this._showHistory;
    if (this._showHistory) {
      this._loadHistory();
      this._showNinjaCombi = false;
      this._showAppliances = false;
      this._showRecipes = false;
      this._showAIRecipeBuilder = false;
    }
  }

  _toggleNinjaCombi() {
    this._showNinjaCombi = !this._showNinjaCombi;
    if (this._showNinjaCombi) {
      this._showHistory = false;
      this._showAppliances = false;
      this._showRecipes = false;
      this._showAIRecipeBuilder = false;
    }
  }

  _toggleAppliances() {
    this._showAppliances = !this._showAppliances;
    if (this._showAppliances) {
      this._showHistory = false;
      this._loadAppliances();
      this._showNinjaCombi = false;
      this._showRecipes = false;
      this._showAIRecipeBuilder = false;
    }
  }

  _toggleRecipes() {
    this._showRecipes = !this._showRecipes;
    if (this._showRecipes) {
      this._showHistory = false;
      this._showNinjaCombi = false;
      this._showAppliances = false;
      this._showAIRecipeBuilder = false;
      this._loadCompatibleRecipes();
    }
  }

  async _toggleAIRecipeBuilder() {
    this._showAIRecipeBuilder = !this._showAIRecipeBuilder;
    if (this._showAIRecipeBuilder) {
      this._showHistory = false;
      this._showNinjaCombi = false;
      this._showAppliances = false;
      this._showRecipes = false;
      // Load AI data from constants (like Ninja Combi does)
      this._aiCookingStyles = AI_COOKING_STYLES || [];
      this._aiIngredients = AI_INGREDIENTS || {};
      // Still check OpenAI availability via API
      this._loadAIOpenAIStatus();
    }
  }

  async _loadAIOpenAIStatus() {
    try {
      const checkResponse = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/check');
      this._aiOpenAIAvailable = checkResponse.available;
      this.requestUpdate();
    } catch (e) {
      console.error('[AI Recipe Builder] Failed to check OpenAI status:', e);
      this._aiOpenAIAvailable = false;
      this.requestUpdate();
    }
  }

  async _loadAISettings() {
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_settings');
      if (response.status === 'ok' && response.settings?.agent_id) {
        this._aiAgentId = response.settings.agent_id;
        this._aiBackupAgentId = response.settings.backup_agent_id || '';
      }
    } catch (e) {
      console.error('[AI Settings] Failed to load settings on startup:', e);
    }
  }

  async _showAISettings() {
    // Reload current settings before showing modal
    await this._loadAISettings();
    
    this._showAISettingsModal = true;
    this.requestUpdate();
  }

  _closeAISettings() {
    this._showAISettingsModal = false;
    this.requestUpdate();
  }

  async _saveAISettings() {
    try {
      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_settings', {
        agent_id: this._aiAgentId,
        backup_agent_id: this._aiBackupAgentId,
      });
      
      if (response.status === 'ok') {
        const backupNote = this._aiBackupAgentId
          ? `\n\n${this._t('messages.backup_agent_id')} ${this._aiBackupAgentId}\n\n${this._t('messages.backup_agent_hint')}`
          : '';
        this._showMessage(this._t('messages.ai_settings_saved_title'), `✅ ${this._t('messages.ai_settings_saved')}\n\nAgent ID: ${this._aiAgentId}${backupNote}`, false);
        this._closeAISettings();
      } else {
        this._showMessage(this._t('messages.ai_settings_save_failed_title'), `❌ ${response.message}`, true);
      }
    } catch (e) {
      console.error('[AI Settings] Failed to save settings:', e);
      this._showMessage(this._t('messages.ai_settings_save_error_title'), `❌ ${e.message}`, true);
    }
  }

  /**
   * Show a message dialog with selectable/copyable text.
   * Replaces alert() to allow users to select and copy error messages.
   * @param {string} title - Dialog title
   * @param {string} content - Dialog content (can contain newlines)
   * @param {boolean} isError - Whether this is an error message (affects styling)
   */
  _showMessage(title, content, isError = false) {
    this._messageDialogTitle = title;
    this._messageDialogContent = content;
    this._messageDialogIsError = isError;
    this._showMessageDialog = true;
    this.requestUpdate();
  }

  _closeMessageDialog() {
    this._showMessageDialog = false;
    this.requestUpdate();
  }

  // ============================================================================
  // PHASE 1: GUI REDESIGN - NAVIGATION METHODS
  // ============================================================================

  /**
   * Open the User Guide at the specified anchor section.
   * @param {string} anchor - GitHub markdown anchor, e.g. '#41-welcome-screen'
   */
  _openHelp(anchor = '') {
    const base = 'https://github.com/R00S/meater-in-local-haos/blob/main/docs/USER_GUIDE.md';
    window.open(anchor ? `${base}${anchor}` : base, '_blank', 'noopener,noreferrer');
  }

  /**
   * Navigate to welcome screen (appliance selector)
   */
  _navigateToWelcome() {
    this._currentPath = 'welcome';
    this._selectedAppliance = null;
    this._showFeatureNotesEditor = false;
    // Reset old navigation flags for compatibility
    this._showHistory = false;
    this._showNinjaCombi = false;
    this._showAppliances = false;
    this._showRecipes = false;
    this._showAIRecipeBuilder = false;
    // Refresh server data so the welcome screen shows up-to-date ongoing cooks
    this._loadServerActiveRecipeCooks();
    this.requestUpdate();
  }

  /**
   * Navigate to view a specific active cook by entity ID.
   * Used from the "Ongoing Cooks" badge on the welcome screen.
   * @param {string} entityId - The cooking session entity to view
   */
  _navigateToActiveCook(entityId) {
    this._selectedEntity = entityId;
    this._currentPath = 'active_cook';
    this.requestUpdate();
  }

  /**
   * Navigate to MEATER+ path
   * @param {Object} appliance - Selected MEATER appliance
   */
  _navigateToMeaterExperimentalPath(appliance) {
    this._currentPath = 'meater_experimental';
    this._selectedAppliance = appliance;
    this._showMeaterCooking = true;   // skip landing page — go straight to setup form
    this.requestUpdate();
  }

  /**
   * Navigate to Ninja Combi path
   * @param {Object} appliance - Selected Ninja Combi appliance
   */
  _navigateToNinjaCombiPath(appliance) {
    this._currentPath = 'ninja_combi';
    this._selectedAppliance = appliance;
    // Reset old navigation flags
    this._showHistory = false;
    this._showNinjaCombi = false;
    this._showAppliances = false;
    this._showRecipes = false;
    this._showAIRecipeBuilder = false;
    this.requestUpdate();
  }

  /**
   * Navigate to AI Recipe Builder path
   * @param {Object} appliance - Selected appliance (any non-MEATER/Ninja appliance)
   */
  _navigateToAIRecipeBuilderPath(appliance) {
    this._currentPath = 'ai_recipe_builder';
    this._selectedAppliance = appliance;
    // Reset old navigation flags
    this._showHistory = false;
    this._showNinjaCombi = false;
    this._showAppliances = false;
    this._showRecipes = false;
    this._showAIRecipeBuilder = false;
    this.requestUpdate();
  }

  /**
   * Navigate to Previous Cooks path
   */
  _navigateToPreviousCooks() {
    this._currentPath = 'previous_cooks';
    this._selectedAppliance = null;
    this._loadHistory();
    // Reset old navigation flags
    this._showHistory = true;  // Keep this for compatibility with existing render
    this._showNinjaCombi = false;
    this._showAppliances = false;
    this._showRecipes = false;
    this._showAIRecipeBuilder = false;
    this.requestUpdate();
  }

  /**
   * Route to appropriate path based on appliance type
   * @param {Object} appliance - Selected appliance
   */
  _routeToAppliancePath(appliance) {
    // Determine appliance type based on brand/model or features
    const brand = (appliance.brand || '').toLowerCase();
    const model = (appliance.model || '').toLowerCase();
    const name = (appliance.name || '').toLowerCase();
    
    // Check for MEATER probe (cook type 6.1)
    if (brand.includes('meater') || model.includes('meater') || name.includes('meater')) {
      this._navigateToMeaterExperimentalPath(appliance);
      return;
    }
    
    // Check for Ninja Combi (part of cook type 6.2)
    if ((brand.includes('ninja') && model.includes('combi')) || 
        name.includes('ninja combi')) {
      this._navigateToNinjaCombiPath(appliance);
      return;
    }
    
    // All other appliances go to AI Recipe Builder path (cook type 6.2)
    this._navigateToAIRecipeBuilderPath(appliance);
  }

  _renderNinjaCombi() {
    // Check if NINJA_COMBI_RECIPES is available
    if (typeof NINJA_COMBI_RECIPES === 'undefined' || !NINJA_COMBI_RECIPES || NINJA_COMBI_RECIPES.length === 0) {
      return html`
        <div class="status-banner idle">
          <h2>🥘 Ninja Combi Recipes</h2>
          <p>No recipes available</p>
        </div>
        <ha-card>
          <div class="card-content">
            <p class="no-history">Ninja Combi recipes not loaded. Please ensure the integration is up to date.</p>
          </div>
        </ha-card>
      `;
    }

    // Group recipes by mode
    const recipesByMode = {};
    NINJA_COMBI_RECIPES.forEach(recipe => {
      if (!recipesByMode[recipe.mode]) {
        recipesByMode[recipe.mode] = [];
      }
      recipesByMode[recipe.mode].push(recipe);
    });

    const modeIcons = {
      'combi_crisp': '🔥',
      'combi_bake': '🥖',
      'combi_meal': '🍱',
      'combi_roast': '🍖',
      'convection': '🔥',
      'air_fry': '🍟',
      'steam': '💨',
      'prove': '🫓',
      'sear': '🥩',
      'grill': '🍢',
      'rice_pasta': '🍚',
      'slow_cook': '🍲',
    };

    const modeNames = {
      'combi_crisp': 'Combi-Crisp (Steam + Air Fry)',
      'combi_bake': 'Combi-Bake (Steam + Bake)',
      'combi_meal': 'Combi-Meal (Multi-tray)',
      'combi_roast': 'Combi-Roast (Steam + Roast)',
      'convection': 'Convection Oven',
      'air_fry': 'Air Fry',
      'steam': 'Steam',
      'prove': 'Prove/Proof',
      'sear': 'Sear',
      'grill': 'Grill',
      'rice_pasta': 'Rice/Pasta',
      'slow_cook': 'Slow Cook',
    };

    if (this._showRecipeBuilder) {
      return this._renderRecipeBuilder();
    }

    if (this._selectedNinjaRecipe) {
      const recipe = NINJA_COMBI_RECIPES.find(r => r.id === this._selectedNinjaRecipe);
      if (recipe) {
        return this._renderNinjaRecipeDetail(recipe);
      }
    }

    return html`
      <div class="status-banner idle">
        <h2>🥘 Ninja Combi Recipes</h2>
        <p>${NINJA_COMBI_RECIPES.length} recipes for the Ninja Combi SFP700EU</p>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>🛠️ Recipe Builder</h3>
          <p>Build custom meals with automatic parameter adjustment</p>
          <button class="action-btn" @click=${() => { this._selectedNinjaRecipe = null; this._showRecipeBuilder = true; }} style="width: 100%; margin-top: 8px;">
            ✨ Open Recipe Builder
          </button>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>📖 Browse All Recipes</h3>
          <p>View all compatible recipes across all your appliances</p>
          <button class="action-btn" @click=${() => { this._showNinjaCombi = false; this._showRecipes = true; this._loadCompatibleRecipes(); }} style="width: 100%; margin-top: 8px;">
            📖 Go to All Recipes
          </button>
        </div>
      </ha-card>

      ${Object.entries(recipesByMode).map(([mode, recipes]) => html`
        <ha-card>
          <div class="card-content">
            <h3>${modeIcons[mode] || '🍳'} ${modeNames[mode] || mode}</h3>
            <div class="button-group" style="display: flex; flex-direction: column; gap: 8px;">
              ${recipes.map(recipe => html`
                <button 
                  class="category-btn" 
                  style="text-align: left; padding: 12px; justify-content: space-between; display: flex; align-items: center;"
                  @click=${() => {
                    this._selectedNinjaRecipe = recipe.id;
                    this._currentPath = 'ninja_recipe_detail';
                    this.requestUpdate();
                  }}>
                  <span>
                    ${recipe.name}
                    ${recipe.use_probe ? ' 🌡️' : ''}
                  </span>
                  <span style="font-size: 11px; color: var(--secondary-text-color);">
                    ${recipe.cook_time_minutes} min
                  </span>
                </button>
              `)}
            </div>
          </div>
        </ha-card>
      `)}
    `;
  }

  _renderNinjaRecipeDetail(recipe) {
    return html`
      <div class="status-banner idle">
        <h2>🥘 ${recipe.name}</h2>
        <p>${recipe.description}</p>
        <div style="display: flex; gap: 8px; margin-top: 12px; flex-wrap: wrap;">
          <button class="history-btn" @click=${() => {
            this._selectedNinjaRecipe = null;
            this._currentPath = 'ninja_built_in_recipes';
            this.requestUpdate();
          }}>
            ${this._t('nav.back_to_recipes')}
          </button>
          <button class="action-btn" @click=${() => this._openRecipeInBuilder(recipe)}>
            ${this._t('ninja.modify_in_builder')}
          </button>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.recipe_details')}</h3>
          <div style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin: 12px 0;">
            <div>
              <strong>${this._t('ninja.prep_label')}</strong> ${recipe.prep_time_minutes} min
            </div>
            <div>
              <strong>${this._t('ninja.cook_label')}</strong> ${recipe.cook_time_minutes} min
            </div>
            <div>
              <strong>${this._t('ninja.servings_label')}</strong> 
              <input 
                type="number" 
                min="1" 
                max="12" 
                .value=${recipe._adjustedServings || recipe.servings}
                @input=${(e) => this._updateRecipeServings(recipe, parseInt(e.target.value))}
                style="width: 50px; padding: 4px; border: 1px solid var(--divider-color); border-radius: 4px; background: var(--primary-background-color); color: var(--primary-text-color);">
            </div>
            <div>
              <strong>${this._t('ninja.difficulty_label')}</strong> ${recipe.difficulty}
            </div>
          </div>
          ${recipe.use_probe ? html`
            <div style="margin-top: 12px; padding: 12px; background: rgba(76, 175, 80, 0.1); border-left: 3px solid #4caf50; border-radius: 0 4px 4px 0;">
              <strong>${this._t('ninja.meater_probe_label')}</strong> ${this._t('common.target')} ${recipe.target_temp_c}°C (${recipe.target_temp_f}°F)
            </div>
          ` : ''}

          <!-- Start Cooking button (ToR Section 7.1) -->
          <button 
            class="action-btn" 
            @click=${() => this._startRecipeCook(recipe, recipe._adjustedServings || recipe.servings)}
            style="width: 100%; margin-top: 16px; padding: 16px; font-size: 16px; background: linear-gradient(135deg, #4caf50 0%, #2e7d32 100%);">
            ${this._t('ninja.start_cooking_btn')}
          </button>
        </div>
      </ha-card>

      ${recipe.phases && recipe.phases.length > 0 ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('ninja.cooking_phases')}</h3>
            ${recipe.phases.map((phase, idx) => html`
              <div style="margin: 12px 0; padding: 12px; background: var(--primary-background-color); border-radius: 8px;">
                <strong>${this._t('ninja.phase')} ${idx + 1}:</strong> ${phase.description}<br>
                🌡️ ${phase.temperature_c}°C (${phase.temperature_f}°F)<br>
                ⏱️ ${phase.duration_minutes} ${this._t('common.minutes')}<br>
                ${phase.steam_enabled ? this._t('ninja.steam_enabled') : ''}
              </div>
            `)}
          </div>
        </ha-card>
      ` : ''}

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.ingredients_label')}</h3>
          <ul style="margin: 0; padding-left: 20px;">
            ${(recipe._adjustedIngredients || recipe.ingredients).map(ing => html`<li>${ing}</li>`)}
          </ul>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.instructions_label')}</h3>
          <ol style="margin: 0; padding-left: 20px;">
            ${recipe.instructions.map(step => html`<li style="margin-bottom: 8px;">${step}</li>`)}
          </ol>
        </div>
      </ha-card>

      ${recipe.tips && recipe.tips.length > 0 ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('ninja.tips_label')}</h3>
            <ul style="margin: 0; padding-left: 20px;">
              ${recipe.tips.map(tip => html`<li style="margin-bottom: 6px;">${tip}</li>`)}
            </ul>
          </div>
        </ha-card>
      ` : ''}

      ${recipe.notes ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('ninja.notes_label')}</h3>
            <p>${recipe.notes}</p>
          </div>
        </ha-card>
      ` : ''}
    `;
  }

  _renderRecipeBuilder() {
    const bases = {
      'white_rice': { name: 'White Rice', icon: '🍚', water: '4 cups (9.6 dl)', time: 15 },
      'brown_rice': { name: 'Brown Rice', icon: '🍙', water: '4.5 cups (10.8 dl)', time: 18 },
      'rice_pilaf': { name: 'Rice Pilaf', icon: '🍚', water: '3 cups (7.2 dl)', time: 16 },
      'spanish_rice': { name: 'Spanish Rice', icon: '🍛', water: '4 cups (9.6 dl)', time: 15 },
      'wild_rice': { name: 'Wild Rice', icon: '🌾', water: '5 cups (12 dl)', time: 20 },
      'israeli_couscous': { name: 'Israeli Couscous', icon: '⚪', water: '3.5 cups (8.4 dl)', time: 12 },
      'quinoa': { name: 'Quinoa', icon: '🌿', water: '4 cups (9.6 dl)', time: 15 },
      'plain_pasta': { name: 'Plain Pasta', icon: '🍝', water: '5 cups (12 dl)', time: 12 },
      'marinara_pasta': { name: 'Marinara Pasta', icon: '🍝', water: '5 cups (12 dl) + 2 cups (4.8 dl) marinara', time: 14 },
      'alfredo_pasta': { name: 'Alfredo Pasta', icon: '🍝', water: '5 cups (12 dl) + 1.5 cups (3.6 dl) alfredo', time: 14 },
    };

    const proteins = {
      'chicken_breast': { name: 'Chicken Breast (Fresh)', icon: '🐔', temp: '390°F / 199°C', time: 18, probe: '74°C / 165°F' },
      'chicken_breast_frozen': { name: 'Chicken Breast (Frozen)', icon: '🧊🐔', temp: '390°F / 199°C', time: 24, probe: '74°C / 165°F' },
      'chicken_thighs': { name: 'Chicken Thighs', icon: '🍗', temp: '385°F / 196°C', time: 18, probe: '74°C / 165°F' },
      'chicken_drumsticks': { name: 'Chicken Drumsticks', icon: '🍗', temp: '385°F / 196°C', time: 20, probe: '74°C / 165°F' },
      'chicken_wings': { name: 'Chicken Wings', icon: '🍗', temp: '390°F / 199°C', time: 16, probe: '74°C / 165°F' },
      'beef_steak': { name: 'Beef Steak (Medium)', icon: '🥩', temp: '360°F / 182°C', time: 16, probe: '54-57°C / 130-135°F' },
      'beef_ground': { name: 'Ground Beef', icon: '🍖', temp: '375°F / 191°C', time: 14, probe: '71°C / 160°F' },
      'beef_meatballs': { name: 'Beef Meatballs', icon: '🧆', temp: '370°F / 188°C', time: 15, probe: '71°C / 160°F' },
      'beef_strips': { name: 'Beef Strips', icon: '🥩', temp: '380°F / 193°C', time: 12, probe: '63°C / 145°F' },
      'pork_chops': { name: 'Pork Chops', icon: '🥓', temp: '380°F / 193°C', time: 16, probe: '63°C / 145°F' },
      'pork_tenderloin': { name: 'Pork Tenderloin', icon: '🥓', temp: '375°F / 191°C', time: 18, probe: '63°C / 145°F' },
      'pork_sausage': { name: 'Pork Sausage', icon: '🌭', temp: '370°F / 188°C', time: 14, probe: '71°C / 160°F' },
      'salmon': { name: 'Salmon Fillet', icon: '🐟', temp: '360°F / 182°C', time: 14, probe: '54-60°C / 130-140°F' },
      'shrimp': { name: 'Shrimp', icon: '🦐', temp: '350°F / 177°C', time: 10, probe: '63°C / 145°F' },
      'tofu': { name: 'Tofu (Firm)', icon: '🧈', temp: '375°F / 191°C', time: 15, probe: 'N/A' },
      'tempeh': { name: 'Tempeh', icon: '🌱', temp: '375°F / 191°C', time: 14, probe: 'N/A' },
    };

    const veggies = [
      { name: 'Broccoli', icon: '🥦', type: 'crispy' },
      { name: 'Carrots', icon: '🥕', type: 'tender' },
      { name: 'Bell Peppers', icon: '🫑', type: 'crispy' },
      { name: 'Zucchini', icon: '🥒', type: 'tender' },
      { name: 'Asparagus', icon: '🎋', type: 'crispy' },
      { name: 'Green Beans', icon: '🫘', type: 'crispy' },
      { name: 'Brussels Sprouts', icon: '🥬', type: 'crispy' },
      { name: 'Cherry Tomatoes', icon: '🍅', type: 'tender' },
    ];

    const selectedBase = bases[this._builderBase];
    const selectedProtein = proteins[this._builderProtein];

    return html`
      <div class="status-banner idle">
        <h2>${this._t('ninja.builder_heading')}</h2>
        <p>${this._t('ninja.builder_desc')}</p>
        <div style="display: flex; gap: 8px; margin-top: 12px;">
          <button class="history-btn" @click=${() => { this._showRecipeBuilder = false; this._resetBuilder(); }}>
            ${this._t('nav.back_to_ninja_combi')}
          </button>
          <button class="history-btn" @click=${() => { this._currentPath = 'ninja_built_in_recipes'; this.requestUpdate(); }}>
            ${this._t('ninja.all_recipes_btn')}
          </button>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.select_base')}</h3>
          <div class="button-group" style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px; margin-top: 8px;">
            ${Object.entries(bases).map(([key, base]) => html`
              <button 
                class="category-btn ${this._builderBase === key ? 'active' : ''}" 
                @click=${() => { this._builderBase = key; this.requestUpdate(); }}
                style="padding: 12px; text-align: left;">
                <div style="font-size: 20px; margin-bottom: 4px;">${base.icon}</div>
                <div style="font-size: 13px; font-weight: 500;">${base.name}</div>
                <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 2px;">
                  ${base.water} • ${base.time} min
                </div>
              </button>
            `)}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.select_protein_builder')}</h3>
          <div class="button-group" style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px; margin-top: 8px;">
            ${Object.entries(proteins).map(([key, protein]) => html`
              <button 
                class="category-btn ${this._builderProtein === key ? 'active' : ''}" 
                @click=${() => { this._builderProtein = key; this.requestUpdate(); }}
                style="padding: 12px; text-align: left;">
                <div style="font-size: 20px; margin-bottom: 4px;">${protein.icon}</div>
                <div style="font-size: 13px; font-weight: 500;">${protein.name}</div>
                <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 2px;">
                  ${protein.temp} • ${protein.time} min
                </div>
              </button>
            `)}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.add_vegetables')}</h3>
          <p style="font-size: 12px; color: var(--secondary-text-color); margin-bottom: 8px;">
            ${this._t('ninja.veggie_hint')}
          </p>
          <div class="button-group" style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px;">
            ${veggies.map(veggie => {
              const isSelected = this._builderVeggies.includes(veggie.name);
              return html`
                <button 
                  class="category-btn ${isSelected ? 'active' : ''}" 
                  @click=${() => this._toggleVeggie(veggie.name)}
                  style="padding: 12px; text-align: left;">
                  <div style="font-size: 20px; margin-bottom: 4px;">${veggie.icon}</div>
                  <div style="font-size: 13px; font-weight: 500;">${veggie.name}</div>
                  <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 2px;">
                    ${veggie.type === 'tender' ? this._t('ninja.with_base') : this._t('ninja.with_protein')}
                  </div>
                </button>
              `;
            })}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.meater_probe_section')}</h3>
          <label style="display: flex; align-items: center; gap: 8px; cursor: pointer;">
            <input 
              type="checkbox" 
              .checked=${this._builderUseMeater}
              @change=${(e) => { this._builderUseMeater = e.target.checked; this.requestUpdate(); }}
              style="width: 18px; height: 18px; cursor: pointer;">
            <span style="font-size: 14px;">
              🌡️ ${this._t('ninja.use_meater_probe')}
              ${this._builderUseMeater && selectedProtein ? html`
                <div style="font-size: 12px; color: var(--secondary-text-color); margin-top: 4px;">
                  Target: ${selectedProtein.probe}
                </div>
              ` : ''}
            </span>
          </label>
        </div>
      </ha-card>

      ${this._builderBase && this._builderProtein ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('ninja.calculated_params')}</h3>
            <div style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin: 12px 0;">
              <div>
                <strong>${this._t('ninja.temperature_label')}</strong><br>
                ${selectedProtein.temp}
              </div>
              <div>
                <strong>${this._t('ninja.cook_time_label')}</strong><br>
                ${selectedProtein.time} ${this._t('common.minutes')}
              </div>
              <div>
                <strong>${this._t('ninja.water_label')}</strong><br>
                ${selectedBase.water}
              </div>
              <div>
                <strong>${this._t('ninja.mode_label')}</strong><br>
                Combi-Meal
              </div>
            </div>
            ${this._builderUseMeater && selectedProtein.probe !== 'N/A' ? html`
              <div style="margin-top: 12px; padding: 12px; background: rgba(76, 175, 80, 0.1); border-left: 3px solid #4caf50; border-radius: 0 4px 4px 0;">
                <strong>${this._t('ninja.probe_target')}</strong> ${selectedProtein.probe}
              </div>
            ` : ''}
            <button 
              class="action-btn" 
              @click=${() => this._buildRecipe()}
              style="width: 100%; margin-top: 16px; padding: 14px; font-size: 15px; font-weight: 600;">
              ${this._t('ninja.build_recipe_btn')}
            </button>
          </div>
        </ha-card>
      ` : html`
        <ha-card>
          <div class="card-content">
            <p style="text-align: center; color: var(--secondary-text-color); padding: 20px 0;">
              ${this._t('ninja.select_base_protein_hint')}
            </p>
          </div>
        </ha-card>
      `}
    `;
  }

  _startMeaterCook(recipe) {
    // Find a MEATER cooking session entity
    // Look for the selected entity first, then search if not found
    let meaterEntity = this._selectedEntity;
    
    if (!meaterEntity) {
      // Search for any MEATER cooking session entity
      meaterEntity = Object.keys(this.hass.states).find(entity_id => 
        entity_id.includes('kitchen_cooking_engine') && 
        entity_id.includes('cooking_session')
      );
    }

    if (!meaterEntity) {
      this._showMessage(this._t('meater.no_sensor_found'), '⚠️ ' + this._t('meater.sensor_not_connected'), true);
      return;
    }

    // Show confirmation with recipe details
    const confirmMsg = `🚀 Start Cook with MEATER+\n\n` +
      `Recipe: ${recipe.name}\n` +
      `Target: ${recipe.target_temp_c}°C (${recipe.target_temp_f}°F)\n` +
      `Mode: ${recipe.mode}\n` +
      `Cook Time: ${recipe.cook_time_minutes} min\n\n` +
      `This will start a simple probe monitoring session.`;

    if (confirm(confirmMsg)) {
      // Use start_simple_probe_cook service for temperature-only monitoring
      // This creates a lightweight session without requiring cut/doneness info
      const serviceData = {
        entity_id: meaterEntity,
        target_temp_c: recipe.target_temp_c,
        session_name: `Ninja Combi - ${recipe.name}`
      };

      // Call the Home Assistant service to start the simple probe cook
      this.hass.callService('kitchen_cooking_engine', 'start_simple_probe_cook', serviceData)
        .then(async () => {
          // Wait a moment for the service to update the entity state
          await new Promise(resolve => setTimeout(resolve, 500));
          
          // Force a state update check
          this.requestUpdate();
          
          // Show success message
          this._showMessage(this._t('messages.cook_session_started_title'), `✅ ${this._t('messages.cook_session_started')}\n\n${this._t('recipe_cook.recipe_label')}: ${recipe.name}\n\n${this._t('messages.cook_session_started_detail')}`, false);
          
          // Close Ninja Combi view to return to main panel which will show active cook
          this._showNinjaCombi = false;
          this._selectedNinjaRecipe = null;
        })
        .catch(err => {
          this._showMessage(this._t('messages.cook_session_error_title'), `❌ ${err.message}`, true);
        });
    }
  }

  _updateRecipeServings(recipe, newServings) {
    if (isNaN(newServings) || newServings < 1) return;
    
    const originalServings = recipe.servings;
    if (!originalServings || originalServings <= 0) {
      console.warn('KCE: cannot scale recipe — recipe.servings is missing or zero');
      return;
    }
    const multiplier = newServings / originalServings;
    
    // Store adjusted servings
    recipe._adjustedServings = newServings;
    
    // Scale ingredients with intelligent rounding
    const ingredients = recipe.ingredients || [];
    recipe._adjustedIngredients = ingredients.map(ing => {
      return ing.replace(/(\d+(?:[.,\/]\d+)?)\s*([a-zA-ZÅÄÖåäö%]*)/g, (match, numStr, unit) => {
        // Parse simple fractions like "1/2"
        let rawValue;
        if (numStr.includes('/')) {
          const parts = numStr.split('/');
          rawValue = parseFloat(parts[0]) / parseFloat(parts[1]);
        } else {
          rawValue = parseFloat(numStr.replace(',', '.'));
        }
        if (isNaN(rawValue) || rawValue <= 0) return match;
        const scaled = rawValue * multiplier;
        const rounded = this._smartRound(scaled);
        return unit ? `${rounded}\u00a0${unit}` : `${rounded}`;
      });
    });
    
    this.requestUpdate();
  }

  /**
   * Round a scaled ingredient amount to a practical value.
   * - >= 50: round to nearest 5
   * - >= 10: round to nearest integer
   * - >= 2: round to nearest 0.5
   * - < 2:  round to nearest quarter (0.25)
   */
  _smartRound(value) {
    if (value <= 0) return value;
    let result;
    if (value >= 50) {
      result = Math.round(value / 5) * 5;
    } else if (value >= 10) {
      result = Math.round(value);
    } else if (value >= 2) {
      result = Math.round(value * 2) / 2;
    } else {
      result = Math.round(value * 4) / 4;
    }
    // Format: drop unnecessary .0 / .00 but keep meaningful decimals
    const str = result % 1 === 0 ? String(result) : String(parseFloat(result.toFixed(2)));
    return str;
  }

  _openRecipeInBuilder(recipe) {
    // Map recipe to builder settings (best effort mapping)
    // This is a simplified mapping - in production you'd have more sophisticated logic
    
    // Try to detect base from recipe name/ingredients
    const recipeLower = recipe.name.toLowerCase();
    if (recipeLower.includes('rice')) {
      this._builderBase = 'white_rice';
    } else if (recipeLower.includes('pasta')) {
      this._builderBase = 'plain_pasta';
    } else if (recipeLower.includes('quinoa')) {
      this._builderBase = 'quinoa';
    } else if (recipeLower.includes('couscous')) {
      this._builderBase = 'israeli_couscous';
    } else {
      this._builderBase = 'white_rice'; // default
    }
    
    // Try to detect protein
    if (recipeLower.includes('chicken breast')) {
      this._builderProtein = 'chicken_breast';
    } else if (recipeLower.includes('chicken')) {
      this._builderProtein = 'chicken_thighs';
    } else if (recipeLower.includes('salmon')) {
      this._builderProtein = 'salmon';
    } else if (recipeLower.includes('pork')) {
      this._builderProtein = 'pork_chops';
    } else if (recipeLower.includes('beef')) {
      this._builderProtein = 'beef_steak';
    } else if (recipeLower.includes('shrimp')) {
      this._builderProtein = 'shrimp';
    } else {
      this._builderProtein = 'chicken_breast'; // default
    }
    
    // Set MEATER based on recipe
    this._builderUseMeater = recipe.use_probe || false;
    
    // Clear veggies (user can add them in builder)
    this._builderVeggies = [];
    
    // Switch to builder view using path-based routing
    this._selectedNinjaRecipe = null;
    this._showRecipeBuilder = true;
    this._currentPath = 'ninja_recipe_builder';
    this.requestUpdate();
  }

  _formatDateTime(isoString) {
    if (!isoString) return '';
    const date = new Date(isoString);
    return date.toLocaleString();
  }

  // Phase 3.3: Render appliance management view
  _renderAppliances() {
    return html`
      <div class="status-banner idle">
        <h2>${this._t('appliances.title')}</h2>
        <p>${this._appliances.length} ${this._t('appliances.configured')}</p>
      </div>

      ${this._errorMessage ? html`
        <ha-card class="error-card">
          <div class="card-content error-message">
            <p>⚠️ ${this._errorMessage}</p>
            <button class="retry-btn" @click=${() => this._loadAppliances()}>
              🔄 ${this._t('common.retry')}
            </button>
          </div>
        </ha-card>
      ` : ''}

      ${this._isLoadingAppliances ? html`
        <ha-card>
          <div class="card-content loading-state">
            <div class="spinner"></div>
            <p>${this._t('appliances.loading')}</p>
          </div>
        </ha-card>
      ` : this._appliances.length === 0 ? html`
        <ha-card>
          <div class="card-content no-entities">
            <p>${this._t('appliances.no_appliances')}</p>
            <p>${this._t('appliances.setup_step1')}</p>
            <p>${this._t('appliances.setup_step2')}</p>
          </div>
        </ha-card>
      ` : html`
        <div class="appliances-grid">
          ${this._appliances.map((appliance, idx) => html`
            <ha-card class="appliance-card clickable" @click=${() => this._toggleApplianceExpanded(idx)}>
              <div class="card-content">
                <div class="appliance-header">
                  <div class="appliance-icon">${this._getApplianceIcon(appliance.brand || appliance.name)}</div>
                  <div class="appliance-info">
                    <h3>${appliance.name}</h3>
                    ${appliance.brand ? html`<div class="appliance-brand">${appliance.brand} ${appliance.model || ''}</div>` : ''}
                  </div>
                  <div class="appliance-actions">
                    <button 
                      class="settings-icon-btn" 
                      @click=${(e) => { e.stopPropagation(); this._openApplianceConfig(appliance.id); }}
                      title="Configure features">
                      ⚙️
                    </button>
                    <div class="expand-icon">
                      ${appliance._expanded ? '▼' : '▶'}
                    </div>
                  </div>
                </div>
                
                <div class="appliance-features">
                  ${appliance._expanded ? this._renderFeaturesByType(appliance) : html`
                    <h4>${this._t('common.features')} (${appliance.features.length}):</h4>
                    <div class="feature-badges">
                      ${appliance.features.slice(0, 6).map(feature => html`
                        <span class="feature-badge">${this._formatFeatureName(feature)}</span>
                      `)}
                      ${appliance.features.length > 6 ? html`
                        <span class="feature-badge more">+${appliance.features.length - 6} ${this._t('common.more')}</span>
                      ` : ''}
                    </div>
                  `}
                </div>

                ${appliance.recipe_count > 0 ? html`
                  <div class="appliance-recipes">
                    📖 ${appliance.recipe_count} ${this._t('appliances.recipes_available')}
                  </div>
                ` : ''}
              </div>
            </ha-card>
          `)}
        </div>
      `}

      <div class="help-text">
        <p>💡 <strong>Tip:</strong> ${this._t('appliances.tip')}</p>
        <p>${this._t('appliances.tip_detail')}</p>
      </div>
    `;
  }

  // Phase 3.3: Render compatible recipes view
  _renderRecipes() {
    // Phase 3.4: Show recipe detail if selected
    if (this._selectedRecipeDetail) {
      return this._renderRecipeDetail();
    }

    return html`
      <div class="status-banner idle">
        <h2>${this._t('recipes.compatible_title')}</h2>
        <p>${this._compatibleRecipes.length} ${this._t('recipes.you_can_cook')}</p>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>Filter by Quality</h3>
          <div class="button-group">
            <button 
              class="category-btn ${this._recipeQualityFilter === 'excellent' ? 'selected' : ''}" 
              @click=${() => { this._recipeQualityFilter = 'excellent'; this._loadCompatibleRecipes(); }}
              ?disabled=${this._isLoadingRecipes}>
              ⭐ Excellent Only
            </button>
            <button 
              class="category-btn ${this._recipeQualityFilter === 'good' ? 'selected' : ''}" 
              @click=${() => { this._recipeQualityFilter = 'good'; this._loadCompatibleRecipes(); }}
              ?disabled=${this._isLoadingRecipes}>
              ✅ Good or Better
            </button>
            <button 
              class="category-btn ${this._recipeQualityFilter === 'acceptable' ? 'selected' : ''}" 
              @click=${() => { this._recipeQualityFilter = 'acceptable'; this._loadCompatibleRecipes(); }}
              ?disabled=${this._isLoadingRecipes}>
              ⚠️ All Compatible
            </button>
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>🥘 Ninja Combi Recipes</h3>
          <p>View Ninja Combi-specific recipes and use the Recipe Builder</p>
          <button class="action-btn" @click=${() => { this._showRecipes = false; this._showNinjaCombi = true; }} style="width: 100%; margin-top: 8px;">
            🥘 Go to Ninja Combi Recipes
          </button>
        </div>
      </ha-card>

      ${this._errorMessage ? html`
        <ha-card class="error-card">
          <div class="card-content error-message">
            <p>⚠️ ${this._errorMessage}</p>
            <button class="retry-btn" @click=${() => this._loadCompatibleRecipes()}>
              🔄 Retry
            </button>
          </div>
        </ha-card>
      ` : ''}

      ${this._isLoadingRecipes ? html`
        <ha-card>
          <div class="card-content loading-state">
            <div class="spinner"></div>
            <p>${this._t('common.loading')}</p>
          </div>
        </ha-card>
      ` : this._compatibleRecipes.length === 0 ? html`
        <ha-card>
          <div class="card-content no-entities">
            <p>${this._t('ninja.no_recipes')}</p>
            <p>Try adjusting the quality filter or adding more appliances.</p>
          </div>
        </ha-card>
      ` : html`
        <div class="recipes-grid">
          ${this._compatibleRecipes.map(recipeData => {
            const recipe = recipeData.recipe;
            const match = recipeData.match;
            return html`
              <ha-card class="recipe-card clickable" @click=${() => this._showRecipeDetail(recipeData)}>
                <div class="card-content">
                  <div class="recipe-header">
                    <h3>${recipe.name}</h3>
                    <span class="quality-badge quality-${match.quality.toLowerCase()}">
                      ${this._getQualityIcon(match.quality)} ${match.quality}
                    </span>
                  </div>
                  
                  <p class="recipe-description">${recipe.description}</p>
                  
                  <div class="recipe-meta">
                    <div class="recipe-score">
                      Score: ${Math.round(match.score * 100)}%
                      ${match.confidence < 1.0 ? html`<span class="confidence">(${Math.round(match.confidence * 100)}% confidence)</span>` : ''}
                    </div>
                  </div>

                  ${match.suggested_appliances && match.suggested_appliances.length > 0 ? html`
                    <div class="recipe-appliances">
                      <strong>Suggested:</strong>
                      ${match.suggested_appliances.map(appId => {
                        const appliance = this._appliances.find(a => a.id === appId);
                        return appliance ? html`<span class="appliance-chip">${appliance.name}</span>` : '';
                      })}
                    </div>
                  ` : ''}

                  ${match.notes ? html`
                    <div class="recipe-notes">
                      <em>${match.notes}</em>
                    </div>
                  ` : ''}
                  
                  <div class="recipe-features">
                    <strong>Required:</strong>
                    ${recipe.required_features.map(f => html`
                      <span class="feature-chip">${this._formatFeatureName(f)}</span>
                    `)}
                  </div>

                  <div class="recipe-action">
                    <span class="click-hint">Click for details →</span>
                  </div>
                </div>
              </ha-card>
            `;
          })}
        </div>
      `}
    `;
  }

  // Phase 3.4: Render recipe detail view
  _renderRecipeDetail() {
    const recipe = this._selectedRecipeDetail.recipe;
    const match = this._selectedRecipeDetail.match;

    return html`
      <div class="status-banner idle">
        <h2>📖 ${this._t('ninja.recipe_details')}</h2>
        <button class="back-btn" @click=${() => this._selectedRecipeDetail = null}>
          ${this._t('nav.back_to_recipes')}
        </button>
      </div>

      <ha-card class="recipe-detail-card">
        <div class="card-content">
          <div class="recipe-detail-header">
            <h2>${recipe.name}</h2>
            <span class="quality-badge quality-${match.quality.toLowerCase()} large">
              ${this._getQualityIcon(match.quality)} ${match.quality}
            </span>
          </div>

          <p class="recipe-description large">${recipe.description}</p>

          <div class="recipe-detail-meta">
            <div class="meta-item">
              <strong>Match Score:</strong> ${Math.round(match.score * 100)}%
            </div>
            ${match.confidence < 1.0 ? html`
              <div class="meta-item">
                <strong>Confidence:</strong> ${Math.round(match.confidence * 100)}%
              </div>
            ` : ''}
          </div>

          ${match.suggested_appliances && match.suggested_appliances.length > 0 ? html`
            <div class="appliances-section">
              <h3>${this._t('recipes.you_need')}</h3>
              <div class="appliance-list-detail">
                ${match.suggested_appliances.map(appId => {
                  const appliance = this._appliances.find(a => a.id === appId);
                  if (!appliance) return '';
                  return html`
                    <div class="appliance-item">
                      <span class="appliance-icon">${this._getApplianceIcon(appliance.name)}</span>
                      <span class="appliance-name">${appliance.name}</span>
                      <span class="status-check">${this._t('recipes.you_have')}</span>
                    </div>
                  `;
                })}
              </div>
            </div>
          ` : ''}

          ${match.alternative_appliances && match.alternative_appliances.length > 0 ? html`
            <div class="alternatives-section">
              <h3>${this._t('recipes.or_alternatively')}</h3>
              <div class="alternative-combos">
                ${match.alternative_appliances.map((combo, idx) => html`
                  <button class="combo-btn" @click=${() => this._selectApplianceCombo(combo)}>
                    ${combo.map(appId => {
                      const appliance = this._appliances.find(a => a.id === appId);
                      return appliance ? appliance.name : appId;
                    }).join(' + ')}
                  </button>
                `)}
              </div>
            </div>
          ` : ''}

          <div class="features-section">
            <h3>${this._t('recipes.required_features')}</h3>
            <div class="feature-list-detail">
              ${recipe.required_features.map(f => html`
                <div class="feature-item">
                  <span class="feature-icon">✓</span>
                  <span class="feature-name">${this._formatFeatureName(f)}</span>
                </div>
              `)}
            </div>
          </div>

          ${recipe.optional_features && recipe.optional_features.length > 0 ? html`
            <div class="features-section optional">
              <h3>${this._t('recipes.optional_features')}</h3>
              <div class="feature-list-detail">
                ${recipe.optional_features.map(f => html`
                  <div class="feature-item optional">
                    <span class="feature-icon">+</span>
                    <span class="feature-name">${this._formatFeatureName(f)}</span>
                    ${this._hasFeature(f) ? html`<span class="status-badge">${this._t('recipes.available')}</span>` : ''}
                  </div>
                `)}
              </div>
            </div>
          ` : ''}

          ${match.notes ? html`
            <div class="notes-section">
              <h3>${this._t('recipes.notes_label')}</h3>
              <p class="recipe-notes-detail">${match.notes}</p>
            </div>
          ` : ''}

          <div class="recipe-actions">
            <button class="primary-btn" @click=${() => this._startCookFromRecipe(recipe, match)}>
              ${this._t('recipes.start_cooking')}
            </button>
            <button class="secondary-btn" @click=${() => this._selectedRecipeDetail = null}>
              ${this._t('common.cancel')}
            </button>
          </div>
        </div>
      </ha-card>
    `;
  }


  // Phase 3.4: Show recipe detail
  _showRecipeDetail(recipeData) {
    this._selectedRecipeDetail = recipeData;
    this.requestUpdate();
  }

  // Phase 3.4/4: Select alternative appliance combination
  _selectApplianceCombo(combo) {
    this._selectedApplianceCombo = combo;
    this.requestUpdate();
  }

  // Phase 4: Start cooking from recipe
  async _startCookFromRecipe(recipe, match) {
    // Phase 4: Start Recipe Cook Flow
    // Check if recipe has instructions - if so, use new Recipe Cook Flow
    if (recipe.instructions && recipe.instructions.length > 0) {
      // Close the recipe detail view
      this._selectedRecipeDetail = null;
      this._showRecipes = false;
      
      // Ask for serving size adjustment (optional)
      const defaultServingSize = recipe.servings || 4;
      const servingSizeInput = prompt(
        `How many servings?\n\nDefault: ${defaultServingSize}`,
        defaultServingSize
      );
      
      const servingSize = servingSizeInput ? parseInt(servingSizeInput, 10) : defaultServingSize;
      
      // Start the Recipe Cook Flow
      this._startRecipeCook(recipe, servingSize);
      return;
    }
    
    // Legacy flow for recipes without steps (MEATER probe setup)
    // Check if we have a temperature probe appliance
    const probeAppliances = this._appliances.filter(app => 
      app.features && app.features.includes('temperature_probe')
    );
    
    if (probeAppliances.length === 0) {
      this._showMessage(this._t('messages.cook_session_cannot_start_title'), 
        this._t('messages.no_probe_for_recipe') + '\n\n' + this._t('messages.add_probe_instructions'), true);
      return;
    }

    // Find cooking session entities for temperature probes
    const entities = this._findCookingEntities();
    if (entities.length === 0) {
      this._showMessage(this._t('messages.no_cook_entities_title'), 
        this._t('messages.configure_probe_hint'), true);
      return;
    }

    // For now, we'll use recipes to guide cook setup, but actual cooking uses the normal flow
    // Future enhancement: Auto-populate fields based on recipe
    
    // Show a confirmation dialog
    const applianceNames = match.suggested_appliances.map(id => {
      const app = this._appliances.find(a => a.id === id);
      return app ? app.name : id;
    }).join(', ');

    const confirmMsg = `Start cooking session for:\n\n` +
      `Recipe: ${recipe.name}\n` +
      `Appliances: ${applianceNames}\n\n` +
      `You'll be taken to the cooking setup screen where you can configure your cook.`;
    
    if (!confirm(confirmMsg)) {
      return;
    }

    // Close the recipe detail and recipes view
    this._selectedRecipeDetail = null;
    this._showRecipes = false;
    
    // Store recipe info for reference (future: could auto-populate fields)
    this._lastSelectedRecipe = {
      recipe: recipe,
      match: match
    };
    
    this.requestUpdate();
    
    // Show a helpful message about manual setup
    setTimeout(() => {
      this._showMessage(this._t('messages.recipe_loaded_title'), 
        this._t('messages.recipe_loaded_instructions') + '\n\n' +
        this._t('messages.recipe_loaded_tip').replace('{name}', recipe.name).replace('{appliances}', applianceNames), false);
    }, 500);
  }

  // Phase 3.3: Helper methods for appliances and recipes
  _getApplianceIcon(name) {
    const nameLower = (name || '').toLowerCase();
    if (nameLower.includes('meater')) return '🌡️';
    if (nameLower.includes('ninja') || nameLower.includes('combi')) return '🥘';
    if (nameLower.includes('multifry')) return '🍟';
    if (nameLower.includes('oven')) return '🔥';
    if (nameLower.includes('stove') || nameLower.includes('top')) return '🍳';
    if (nameLower.includes('microwave')) return '📡';
    return '🔧';
  }

  _toggleApplianceExpanded(index) {
    // Toggle expanded state for appliance at index
    const appliance = this._appliances[index];
    appliance._expanded = !appliance._expanded;
    // Force re-render
    this.requestUpdate();
  }

  _formatFeatureName(feature) {
    return feature.replace(/_/g, ' ').replace(/\b\w/g, l => l.toUpperCase());
  }

  _renderFeaturesByType(appliance) {
    // Group features by type
    const standard = [];
    const modified = [];
    const special = [];
    
    appliance.features.forEach(feature => {
      const ftype = appliance.feature_types && appliance.feature_types[feature];
      if (ftype === 'standard') {
        standard.push(feature);
      } else if (ftype === 'modified') {
        modified.push(feature);
      } else if (ftype === 'special') {
        special.push(feature);
      } else {
        // Default to standard if no type specified
        standard.push(feature);
      }
    });
    
    const hasNotableFeatures = modified.length > 0 || special.length > 0;
    
    return html`
      ${standard.length > 0 ? html`
        <div class="feature-group">
          <h4>✓ Standard Features (${standard.length})</h4>
          <div class="feature-badges">
            ${standard.map(feature => html`
              <span class="feature-badge standard">${this._formatFeatureName(feature)}</span>
            `)}
          </div>
        </div>
      ` : ''}
      
      ${modified.length > 0 ? html`
        <div class="feature-group">
          <h4>⚡ Modified Features (${modified.length})</h4>
          ${modified.map(feature => {
            const note = (appliance.feature_notes && appliance.feature_notes[feature]) || '';
            return html`
              <div class="feature-note-row">
                <span class="feature-badge modified">${this._formatFeatureName(feature)}</span>
                <input type="text" class="feature-note-input"
                  .value=${note}
                  placeholder="Describe modification (e.g. 'max 230C', 'has turbo')"
                  @change=${(e) => this._onFeatureNoteChanged(appliance, feature, e.target.value)}
                />
              </div>
            `;
          })}
        </div>
      ` : ''}
      
      ${special.length > 0 ? html`
        <div class="feature-group">
          <h4>⭐ Special Features (${special.length})</h4>
          ${special.map(feature => {
            const note = (appliance.feature_notes && appliance.feature_notes[feature]) || '';
            return html`
              <div class="feature-note-row">
                <span class="feature-badge special">${this._formatFeatureName(feature)}</span>
                <input type="text" class="feature-note-input"
                  .value=${note}
                  placeholder="Describe this feature (e.g. 'max size 10x30cm')"
                  @change=${(e) => this._onFeatureNoteChanged(appliance, feature, e.target.value)}
                />
              </div>
            `;
          })}
        </div>
      ` : ''}
      
      ${hasNotableFeatures ? html`
        <button class="save-notes-btn" @click=${(e) => { e.stopPropagation(); this._saveFeatureNotes(appliance); }}>
          💾 Save Notes
        </button>
      ` : ''}
    `;
  }

  _onFeatureNoteChanged(appliance, feature, value) {
    // Store pending note changes on the appliance object
    if (!appliance._pendingNotes) {
      appliance._pendingNotes = {...(appliance.feature_notes || {})};
    }
    const trimmed = value.trim();
    if (trimmed) {
      appliance._pendingNotes[feature] = trimmed;
    } else {
      delete appliance._pendingNotes[feature];
    }
  }

  _toggleFeatureNotesEditor() {
    this._showFeatureNotesEditor = !this._showFeatureNotesEditor;
    this.requestUpdate();
  }

  async _saveFeatureNotes(appliance) {
    const notes = appliance._pendingNotes || appliance.feature_notes || {};
    try {
      const response = await this.hass.callApi(
        'POST',
        `kitchen_cooking_engine/appliances/${appliance.entry_id}/feature_notes`,
        { feature_notes: notes }
      );
      if (response && response.success) {
        appliance.feature_notes = response.feature_notes;
        appliance._pendingNotes = null;
        this._showMessage(this._t('messages.notes_saved_title'), this._t('messages.notes_saved'));
        this.requestUpdate();
      } else {
        this._showMessage(this._t('common.error'), response?.error || this._t('messages.notes_save_failed'), true);
      }
    } catch (e) {
      console.error('Failed to save feature notes:', e);
      this._showMessage(this._t('common.error'), this._t('messages.notes_save_error'), true);
    }
  }

  _openApplianceConfig(applianceId) {
    // Open the config flow for this appliance
    // Find the config entry ID from the appliance ID
    const event = new CustomEvent('hass-more-info', {
      detail: { entityId: null },
      bubbles: true,
      composed: true
    });
    
    // Navigate to the integrations page with the specific integration
    window.history.pushState(null, '', '/config/integrations/integration/kitchen_cooking_engine');
    const navEvent = new CustomEvent('location-changed', {
      bubbles: true,
      composed: true
    });
    window.dispatchEvent(navEvent);
  }

  _getQualityIcon(quality) {
    const qualityLower = quality.toLowerCase();
    if (qualityLower === 'excellent') return '⭐';
    if (qualityLower === 'good') return '✅';
    if (qualityLower === 'acceptable') return '⚠️';
    return '❌';
  }

  render() {
    if (!this.hass) {
      return html`<div class="loading">${this._t('common.loading')}</div>`;
    }

    try {
      return this._renderPanel();
    } catch (err) {
      // Error boundary: if anything in the render tree throws, show a recovery
      // screen instead of leaving the panel blank.  Reset to a clean state so
      // the next render attempt succeeds.  This is the ONLY place that forces
      // a path reset — tab switches never reset navigation any more.
      console.error('KitchenCookingPanel render error — resetting to welcome screen', err);
      if (this._currentPath !== 'ai_recipe_builder') {
        this._currentPath = 'welcome';
      }
      this._meaterCookRatingState = null;
      this._recipeCookState = null;
      // Schedule a fresh render in the next microtask.
      this.requestUpdate();
      return html`
        <div class="loading" style="padding:48px;text-align:center;">
          <p>🔄 Reloading Kitchen Cooking Engine…</p>
        </div>
      `;
    }
  }

  _renderPanel() {
    const entities = this._findCookingEntities();
    
    // Auto-select first entity if not selected or if selected entity no longer exists
    if ((!this._selectedEntity || !entities.includes(this._selectedEntity)) && entities.length > 0) {
      this._selectedEntity = entities[0];
    }

    // Check if SELECTED entity is active
    const state = this._getState();
    const stateValue = state?.state;
    const isValidState = stateValue && stateValue !== 'unavailable' && stateValue !== 'unknown';
    const isActive = isValidState && stateValue !== 'idle' && stateValue !== 'complete';
    
    // Find ALL active cooks (not just selected entity)
    const activeCooks = entities.filter(entityId => {
      const entityState = this.hass.states[entityId];
      const entityStateValue = entityState?.state;
      const entityIsValidState = entityStateValue && entityStateValue !== 'unavailable' && entityStateValue !== 'unknown';
      return entityIsValidState && entityStateValue !== 'idle' && entityStateValue !== 'complete';
    });

    return html`
      <ha-top-app-bar-fixed>
        <ha-menu-button
            slot="navigationIcon"
            .hass=${this.hass}
            .narrow=${this.narrow}
        ></ha-menu-button>
        <div slot="title">🍳 Kitchen Cooking Engine</div>
        
        <div class="content">
          ${this._renderContent(entities, isActive, state, activeCooks)}
          
          <!-- AI Settings Modal -->
          ${this._showAISettingsModal ? html`
            <div class="modal-overlay" @click=${this._closeAISettings}>
              <div class="modal-dialog" @click=${(e) => e.stopPropagation()}>
                <div class="modal-header">
                  <h2>⚙️ ${this._t('messages.ai_settings_title')}</h2>
                  <button class="modal-close" @click=${this._closeAISettings}>✕</button>
                </div>
                <div class="modal-body">
                  <p style="margin-bottom: 16px;">
                    ${this._t('messages.configure_ai_agent')}
                  </p>
                  
                  <label for="ai-agent-id" style="display: block; margin-bottom: 8px; font-weight: 600;">
                    ${this._t('messages.ai_agent_id')}
                  </label>
                  <input
                    id="ai-agent-id"
                    type="text"
                    .value=${this._aiAgentId}
                    @input=${(e) => { this._aiAgentId = e.target.value; }}
                    placeholder="extended_openai_conversation_2"
                    style="width: 100%; padding: 8px; border: 1px solid var(--divider-color); border-radius: 4px; font-family: monospace;"
                  />

                  <label for="ai-backup-agent-id" style="display: block; margin-top: 16px; margin-bottom: 8px; font-weight: 600;">
                    ${this._t('messages.backup_agent_id')} <span style="font-weight: 400; font-size: 0.9em;">${this._t('messages.backup_agent_hint')}</span>
                  </label>
                  <input
                    id="ai-backup-agent-id"
                    type="text"
                    .value=${this._aiBackupAgentId}
                    @input=${(e) => { this._aiBackupAgentId = e.target.value; }}
                    placeholder="conversation.google_generative_ai_conversation"
                    style="width: 100%; padding: 8px; border: 1px solid var(--divider-color); border-radius: 4px; font-family: monospace;"
                  />
                  <p style="margin-top: 6px; font-size: 0.85em; color: var(--secondary-text-color);">
                    If the primary agent returns a 503 / overloaded error (even after retries), the backup agent is tried automatically.
                  </p>
                  
                  <p style="margin-top: 12px; font-size: 0.9em; color: var(--secondary-text-color);">
                    <strong>Common agent IDs:</strong>
                  </p>
                  <ul style="margin: 8px 0; padding-left: 24px; font-size: 0.9em; color: var(--secondary-text-color);">
                    <li><code>extended_openai_conversation_2</code> - Extended OpenAI Conversation</li>
                    <li><code>conversation.openai_conversation</code> - OpenAI Conversation</li>
                    <li><code>conversation.google_generative_ai_conversation</code> - Google Gemini</li>
                    <li><code>conversation.home_assistant_cloud</code> - Nabu Casa Cloud</li>
                  </ul>
                  
                  <p style="margin-top: 12px; font-size: 0.9em; color: var(--secondary-text-color);">
                    ${this._t('messages.find_agent_hint')}
                  </p>
                </div>
                <div class="modal-footer">
                  <button class="secondary-btn" @click=${this._closeAISettings}>
                    ${this._t('common.cancel')}
                  </button>
                  <button class="primary-btn" @click=${this._saveAISettings}>
                    ${this._t('messages.save_settings')}
                  </button>
                </div>
              </div>
            </div>
          ` : ''}
          
          <!-- Message Dialog (replaces alert() for copyable error messages) -->
          ${this._showMessageDialog ? html`
            <div class="modal-overlay" @click=${this._messageDialogOnCancel ? () => {} : this._closeMessageDialog}>
              <div class="modal-dialog" @click=${(e) => e.stopPropagation()}>
                <div class="modal-header">
                  <h2>${this._messageDialogIsError ? '⚠️' : '💬'} ${this._messageDialogTitle}</h2>
                  ${!this._messageDialogOnCancel ? html`
                    <button class="modal-close" @click=${this._closeMessageDialog}>✕</button>
                  ` : ''}
                </div>
                <div class="modal-body">
                  <pre style="white-space: pre-wrap; word-wrap: break-word; font-family: inherit; margin: 0; user-select: text;">${this._messageDialogContent}</pre>
                </div>
                <div class="modal-footer">
                  ${this._messageDialogOnCancel ? html`
                    <button class="secondary-btn" @click=${() => {
                      const cancelFn = this._messageDialogOnCancel;
                      this._messageDialogOnCancel = null;
                      this._showMessageDialog = false;
                      this.requestUpdate();
                      if (cancelFn) cancelFn();
                    }}>
                      ${this._t('common.cancel')}
                    </button>
                  ` : html`
                    <button class="primary-btn" @click=${this._closeMessageDialog}>
                      ${this._t('common.ok')}
                    </button>
                  `}
                </div>
              </div>
            </div>
          ` : ''}
        </div>
      </ha-top-app-bar-fixed>
    `;
  }

  /**
   * Route content rendering based on current path
   */
  _renderContent(entities, isActive, state, activeCooks) {
    // MEATER cook rating screen (Issue #65) - highest priority
    if (this._meaterCookRatingState) {
      return this._renderMeaterCookRating();
    }
    
    // Phase 8d: Post-cook shelf update prompt
    if (this._pendingShelfUpdate) {
      return this._renderPostCookShelfUpdate();
    }

    // Show recipe cook flow when actively viewing one (pointer is set)
    if (this._recipeCookState) {
      return this._renderRecipeCookFlow();
    }

    // Full-screen recipe viewer (MEATER path)
    if (this._fullscreenRecipeMode) {
      return this._renderRecipeFullscreen();
    }

    // If user explicitly navigated to view a specific active cook, show it
    if (this._currentPath === 'active_cook' && this._selectedEntity) {
      const activeState = this.hass.states[this._selectedEntity];
      if (activeState && activeState.state !== 'idle' && activeState.state !== 'complete' &&
          activeState.state !== 'unavailable' && activeState.state !== 'unknown') {
        this._waitingForCookStart = null; // Cook is active — clear waiting flag
        this._waitingCookServiceData = null;
        return this._renderActiveCook(activeState);
      }
      // Cook isn't active yet — show a waiting state while entity is idle.
      // No hard timeout: the user may need a minute+ to prepare the probe.
      // Only give up if entity goes unavailable or user navigates away.
      if (this._waitingForCookStart) {
        const entityState = this.hass.states[this._selectedEntity];
        const entityValue = entityState?.state;
        // If entity is idle/unknown (probe in charger / service hasn't taken effect yet), keep waiting
        if (entityValue === 'idle' || entityValue === 'unknown' || !entityValue) {
          // Build sorted entity list for the session selector (MEATER entities first)
          let waitEntities = this._findCookingEntities();
          waitEntities = waitEntities.sort((a, b) => {
            const aM = a.toLowerCase().includes('meater');
            const bM = b.toLowerCase().includes('meater');
            if (aM && !bM) return -1;
            if (!aM && bM) return 1;
            return 0;
          });

          return html`
            <div style="display:flex;flex-direction:column;align-items:center;justify-content:center;padding:48px 16px;text-align:center;">
              <div class="spinner"></div>
              <p style="margin-top:16px;font-size:1.1em;">${this._t('meater.starting_cook')}</p>
              <p style="color:var(--secondary-text-color);">${this._t('meater.waiting_probe').replace('\n', '<br>')}</p>

              ${waitEntities.length > 1 ? html`
                <ha-card style="margin-top:20px;width:100%;max-width:400px;">
                  <div class="card-content">
                    <h3>${this._t('meater.select_session')}</h3>
                    <select
                      .value=${this._selectedEntity}
                      @change=${(e) => {
                        this._selectedEntity = e.target.value;
                        // Re-fire start_cook on the newly selected entity
                        if (this._waitingCookServiceData) {
                          this._callService('start_cook', this._waitingCookServiceData)
                            .catch(err => {
                              console.error('Failed to start cook on selected entity:', err);
                              this._waitingForCookStart = null;
                              this._waitingCookServiceData = null;
                              this._currentPath = 'welcome';
                              this.requestUpdate();
                              this._showMessage(this._t('common.error'), this._t('messages.start_cook_failed'), true);
                            });
                        }
                        this.requestUpdate();
                      }}
                    >
                      ${waitEntities.map(eid => html`
                        <option value="${eid}" ?selected=${this._selectedEntity === eid}>
                          ${this.hass.states[eid]?.attributes?.friendly_name || eid}
                        </option>
                      `)}
                    </select>
                  </div>
                </ha-card>
              ` : ''}

              <button class="secondary-btn" style="margin-top:24px;" @click=${() => {
                this._waitingForCookStart = null;
                this._waitingCookServiceData = null;
                this._currentPath = 'welcome';
                this.requestUpdate();
              }}>${this._t('nav.back_to_home')}</button>
            </div>
          `;
        }
      }
      // Cook is no longer active and we're not waiting — fall back to welcome
      this._waitingForCookStart = null;
      this._waitingCookServiceData = null;
      this._currentPath = 'welcome';
    }

    // Validate current path - ensure it has a valid value
    if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
      this._currentPath = 'welcome';
    }

    // Otherwise, render based on current path
    switch (this._currentPath) {
      case 'welcome':
        return this._renderWelcomeScreen(activeCooks);

      case 'meater_experimental':
        return this._renderMeaterExperimental();
      
      case 'recent_meater':
        return this._renderRecentMeaterCooks();
      
      case 'ninja_combi':
        return this._renderNinjaCombiPath();
      
      case 'ninja_recipe_builder':
        return this._renderNinjaRecipeBuilderView();
      
      case 'ninja_built_in_recipes':
        return this._renderNinjaBuiltInRecipesView();
      
      case 'ninja_recipe_detail':
        if (this._selectedNinjaRecipe) {
          const recipe = (typeof NINJA_COMBI_RECIPES !== 'undefined' && NINJA_COMBI_RECIPES)
            ? NINJA_COMBI_RECIPES.find(r => r.id === this._selectedNinjaRecipe)
            : null;
          if (recipe) {
            return this._renderNinjaRecipeDetail(recipe);
          }
        }
        this._currentPath = 'ninja_built_in_recipes';
        return this._renderNinjaBuiltInRecipesView();
      
      case 'recent_ninja':
        return this._renderRecentNinjaCooks();
      
      case 'ai_recipe_builder':
        return this._renderAIRecipeBuilderFlow();
      
      case 'recent_appliance':
        return this._renderRecentApplianceRecipes();
      
      case 'previous_cooks':
        return this._renderPreviousCooksPath();
      
      case 'shelf_management':
        return this._renderShelfManagement();

      case 'shopping_list':
        return this._renderShoppingList();
      
      default:
        // Fallback to welcome screen for any unrecognized path
        console.warn('Unrecognized path:', this._currentPath, '- falling back to welcome');
        this._currentPath = 'welcome';
        return this._renderWelcomeScreen(activeCooks);
    }
  }

  _renderNoEntities() {
    return html`
      <ha-card>
        <div class="card-content no-entities">
          <p>${this._t('appliances.no_entities')}</p>
          <p>${this._t('appliances.setup_integration')}</p>
        </div>
      </ha-card>
    `;
  }

  _renderActiveCook(state) {
    const attrs = state.attributes;
    const progress = attrs.progress || 0;
    
    // Multi-appliance temperature reading:
    // If current entity doesn't have temperature, find it from entities with temperature_probe feature
    let currentTemp = attrs.current_temp;
    let ambientTemp = attrs.ambient_temp;
    let batteryLevel = attrs.battery_level;
    
    if ((currentTemp === null || currentTemp === undefined) && this.hass) {
      // Current entity has no temperature - look for temperature probe entity
      const entities = this._findCookingEntities();
      for (const entityId of entities) {
        const entityState = this.hass.states[entityId];
        if (!entityState) continue;
        
        // Check if this entity has temperature_probe feature
        // by looking for current_temp in its attributes
        const entityAttrs = entityState.attributes || {};
        if (entityAttrs.current_temp !== null && entityAttrs.current_temp !== undefined) {
          currentTemp = entityAttrs.current_temp;
          ambientTemp = entityAttrs.ambient_temp;
          batteryLevel = entityAttrs.battery_level;
          break; // Found temperature source
        }
      }
    }
    
    const targetTemp = attrs.target_temp_c;
    const cut = attrs.cut_display || attrs.cut || "Unknown";
    const doneness = (attrs.doneness || "").replace("_", " ");
    const method = (attrs.cooking_method || "").replace(/_/g, " ");
    const eta = attrs.eta_minutes;
    const restTimeRemaining = attrs.rest_time_remaining;
    const cookState = state.state;

    return html`
      <div class="status-banner ${cookState}">
        <div style="display:flex;align-items:center;gap:12px;">
          <button class="secondary-btn" style="padding:6px 12px;font-size:1.1em;flex-shrink:0;" @click=${() => {
            this._currentPath = 'welcome';
            this.requestUpdate();
          }} title="Go to Home screen (cook keeps running)">🏠</button>
          <div>
            <h2 style="margin:0;">${this._getStateIcon(cookState)} ${cookState.replace("_", " ")}</h2>
            <p style="margin:0;">${cut} • ${doneness}</p>
          </div>
        </div>
      </div>
      
      <ha-card>
        <div class="card-content">
          <div class="temp-display">
            <div class="temp-current">
              <div class="value">${currentTemp !== null && currentTemp !== undefined ? currentTemp + '°C' : '--'}</div>
              <div class="label">${this._t('meater.tip_temp')}</div>
            </div>
            <div class="temp-target">
              <div class="value">${targetTemp}°C</div>
              <div class="label">${this._t('common.target')}</div>
            </div>
          </div>
          
          <!-- Adjust target temp on the fly -->
          ${cookState !== 'resting' && cookState !== 'goal_reached' ? html`
            <div style="text-align:center;margin:8px 0 4px;">
              <button
                class="adjust-btn ${this._showActiveTempAdjust ? 'active' : ''}"
                @click=${() => {
                  this._showActiveTempAdjust = !this._showActiveTempAdjust;
                  if (this._showActiveTempAdjust) this._activeTempAdjustC = targetTemp;
                }}>
                ${this._showActiveTempAdjust ? '✓ ' + this._t('meater.done_adjusting') : '⚙️ ' + this._t('meater.adjust_temp')}
              </button>
            </div>
            ${this._showActiveTempAdjust ? html`
              <div class="temp-adjust-section">
                <input
                  type="range"
                  min="30"
                  max="100"
                  step="1"
                  .value="${this._activeTempAdjustC ?? targetTemp}"
                  @input=${(e) => { this._activeTempAdjustC = parseInt(e.target.value); }}
                  class="temp-slider"
                />
                <div class="temp-adjust-controls">
                  <button class="temp-btn" @click=${() => { this._activeTempAdjustC = Math.max(30, (this._activeTempAdjustC ?? targetTemp) - 1); }}>-1°C</button>
                  <input
                    type="number"
                    min="30"
                    max="100"
                    .value="${this._activeTempAdjustC ?? targetTemp}"
                    @change=${(e) => { const v = parseInt(e.target.value); if (v >= 30 && v <= 100) this._activeTempAdjustC = v; }}
                    class="temp-input"
                  />
                  <button class="temp-btn" @click=${() => { this._activeTempAdjustC = Math.min(100, (this._activeTempAdjustC ?? targetTemp) + 1); }}>+1°C</button>
                </div>
                <button class="secondary-btn" style="margin-top:8px;" @click=${() => this._applyActiveTempAdjust()}>
                  ${this._t('meater.set_target_btn')} ${this._activeTempAdjustC ?? targetTemp}°C
                </button>
              </div>
            ` : ''}
          ` : ''}
          
          ${ambientTemp !== null && ambientTemp !== undefined ? html`
            <div class="ambient-temp-display">
              <span class="ambient-label">${this._t('meater.ambient_label')}</span>
              <span class="ambient-value">${ambientTemp}°C</span>
            </div>
          ` : ''}
          
          <!-- Temperature Graph using Lovelace history-graph card -->
          ${this._renderTempGraph(attrs)}
          
          <div class="progress-section">
            <div class="progress-bar-container">
              <div class="progress-bar" style="width: ${Math.min(100, progress)}%"></div>
            </div>
            <div class="progress-info">
              <span>${progress.toFixed(0)}% ${this._t('meater.complete_pct')}</span>
              ${eta !== null && eta !== undefined && cookState !== 'resting' ? html`<span>${this._t('meater.eta_label')} ${eta} ${this._t('common.minutes_short')}</span>` : ''}
              ${cookState === 'resting' && restTimeRemaining !== null && restTimeRemaining !== undefined ? 
                html`<span>${this._t('meater.rest_remaining_label')} ${restTimeRemaining.toFixed(1)} ${this._t('common.minutes_short')}</span>` : ''}
            </div>
          </div>
          
          <div class="cook-info">
            <div class="cook-info-item">
              <div class="label">${this._t('meater.method_label')}</div>
              <div class="value">${method}</div>
            </div>
            <div class="cook-info-item">
              <div class="label">${this._t('meater.rest_time_label')}</div>
              <div class="value">${attrs.rest_time_minutes || '--'} min</div>
            </div>
            ${batteryLevel !== null && batteryLevel !== undefined ? html`
              <div class="cook-info-item">
                <div class="label">${this._t('meater.battery_label')}</div>
                <div class="value battery-${batteryLevel <= 20 ? 'low' : batteryLevel <= 50 ? 'medium' : 'high'}">${batteryLevel}%</div>
              </div>
            ` : ''}
          </div>
          
          <!-- Notes Section -->
          <div class="notes-section">
            <button class="notes-toggle" @click=${() => this._showNotes = !this._showNotes}>
              📝 ${this._showNotes ? this._t('meater.hide_notes') : this._t('meater.add_notes_btn')}
            </button>
            ${this._showNotes ? html`
              <textarea 
                class="notes-input" 
                placeholder="${this._t('meater.notes_placeholder')}"
                .value=${attrs.notes || this._currentNotes}
                @change=${(e) => this._setNotes(e.target.value)}
              ></textarea>
            ` : ''}
          </div>
          
          <div class="action-buttons">
            ${cookState === 'goal_reached' ? html`
              <ha-button unelevated @click=${this._startRest}>${this._t('meater.start_rest_btn')}</ha-button>
            ` : ''}
            ${cookState === 'resting' ? html`
              <ha-button unelevated @click=${this._complete}>${this._t('meater.complete_btn')}</ha-button>
            ` : ''}
            <ha-button outlined @click=${this._stopCook}>${this._t('meater.stop_btn')}</ha-button>
          </div>
        </div>
      </ha-card>
    `;
  }

  _renderTempGraph(attrs) {
    const tipSensor = attrs.tip_sensor;
    const ambientSensor = attrs.ambient_sensor;
    const sessionStart = attrs.session_start;
    const targetTemp = attrs.target_temp_c;
    
    // Always show a graph section (with fallback messages if needed)
    // Build entity list for history URL
    const entities = tipSensor ? [tipSensor] : [];
    if (ambientSensor) entities.push(ambientSensor);
    const entityList = entities.join(',');
    
    // Calculate hours since cook start more precisely
    // We want to show ONLY data from cook start, so we calculate exact hours
    let hoursSinceStart = 1;
    let historyUrl = '/history';
    
    if (sessionStart) {
      const startDate = new Date(sessionStart);
      const now = new Date();
      // Calculate hours with some precision - round up to nearest 0.5 hours minimum
      const hoursDiff = (now - startDate) / (1000 * 60 * 60);
      // Add a small buffer (5 min = 0.083 hours) to ensure we capture the start
      hoursSinceStart = Math.max(0.5, Math.ceil((hoursDiff + 0.1) * 2) / 2);
      historyUrl = `/history?entity_id=${entityList}&start_date=${encodeURIComponent(startDate.toISOString().split('.')[0])}`;
    }
    
    // If no tip sensor configured, show a message
    if (!tipSensor) {
      return html`
        <div class="temp-graph-section" style="margin: 16px 0; padding: 16px; background: var(--primary-background-color); border-radius: 8px;">
          <h4 style="margin: 0 0 8px 0;">📈 Temperature Graph</h4>
          <p style="color: var(--secondary-text-color); margin: 0;">
            Temperature sensor not configured. The graph will appear here once a temperature sensor is set up.
          </p>
        </div>
      `;
    }
    
    // Create the graph entities config
    const graphEntities = [{entity: tipSensor, name: 'Tip Temp'}];
    if (ambientSensor) {
      graphEntities.push({entity: ambientSensor, name: 'Ambient'});
    }
    
    // Create or update the graph card after render
    this.updateComplete.then(async () => {
      const container = this.shadowRoot?.querySelector('#temp-graph-holder');
      if (!container) {
        console.log('Graph container not found');
        return;
      }
      
      // Recreate graph if session changed (new cook started)
      // This ensures we show only data from the current cook
      if (this._graphCard && this._graphCardSessionStart !== sessionStart) {
        console.log('Session changed, recreating graph card');
        this._graphCard = null;
        container.innerHTML = '<div style="text-align: center; padding: 40px; color: var(--secondary-text-color);">Loading graph...</div>';
      }
      
      // Only create card once per session, then just update hass
      if (this._graphCard) {
        this._graphCard.hass = this.hass;
        return;
      }
      
      try {
        // Try to get the card helpers
        if (typeof window.loadCardHelpers === 'function') {
          const helpers = await window.loadCardHelpers();
          if (helpers && helpers.createCardElement) {
            const card = await helpers.createCardElement({
              type: 'history-graph',
              entities: graphEntities,
              hours_to_show: hoursSinceStart,
              refresh_interval: 30,
            });
            card.hass = this.hass;
            this._graphCard = card;
            this._graphCardSessionStart = sessionStart;
            container.innerHTML = '';
            container.appendChild(card);
            console.log('History graph card created successfully, hours_to_show:', hoursSinceStart);
            return;
          }
        }
        // Fallback: show link to history
        container.innerHTML = `
          <div style="text-align: center; padding: 20px; color: var(--secondary-text-color);">
            <p>📊 <a href="${historyUrl}" target="_blank" style="color: var(--primary-color);">View Temperature History</a></p>
            <p style="font-size: 11px;">Tip: ${tipSensor}</p>
            ${ambientSensor ? `<p style="font-size: 11px;">Ambient: ${ambientSensor}</p>` : ''}
          </div>
        `;
      } catch (e) {
        console.error('Error creating history graph card:', e);
        container.innerHTML = `
          <div style="text-align: center; padding: 20px;">
            <a href="${historyUrl}" target="_blank" style="color: var(--primary-color);">
              📈 View Temperature History
            </a>
            <p style="font-size: 10px; color: var(--error-color);">Graph error: ${e.message}</p>
          </div>
        `;
      }
    });
    
    return html`
      <div class="temp-graph-section" style="margin: 16px 0; padding: 12px; background: var(--primary-background-color); border-radius: 8px;">
        <h4 style="margin: 0 0 8px 0; font-size: 14px;">📈 Temperature Graph</h4>
        ${targetTemp ? html`
          <div style="display: flex; align-items: center; gap: 8px; margin-bottom: 8px; padding: 6px 10px; background: rgba(76, 175, 80, 0.1); border-left: 3px solid #4caf50; border-radius: 0 4px 4px 0;">
            <span style="font-size: 12px; color: var(--secondary-text-color);">🎯 Target:</span>
            <span style="font-size: 14px; font-weight: 600; color: #4caf50;">${targetTemp}°C</span>
          </div>
        ` : ''}
        <div id="temp-graph-holder" style="min-height: 150px; background: var(--card-background-color); border-radius: 4px;">
          <div style="text-align: center; padding: 40px; color: var(--secondary-text-color);">
            Loading graph...
          </div>
        </div>
        <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 6px; text-align: center;">
          📍 Showing data from cook start${sessionStart ? ` (${new Date(sessionStart).toLocaleTimeString()})` : ''}
        </div>
        <div style="text-align: center; margin-top: 8px;">
          <a href="${historyUrl}" target="_blank" style="color: var(--primary-color); font-size: 12px;">
            🔗 Open full History view
          </a>
        </div>
      </div>
    `;
  }

  // ============================================================================
  // PHASE 1: GUI REDESIGN - PATH RENDER METHODS
  // ============================================================================

  /**
   * Render multi-cook selector when multiple cooks are active
   */
  _renderMultiCookSelector(activeCooks) {
    return html`
      <div class="welcome-header">
        <h1>🍳 Kitchen Cooking Engine</h1>
        <p class="welcome-subtitle">Multiple Active Cooks</p>
      </div>

      <ha-card>
        <div class="card-content">
          <h2>🔥 Active Cooks (${activeCooks.length})</h2>
          <p class="info-text">Select a cook to view and manage:</p>
          
          <div class="multi-cook-list">
            ${activeCooks.map(entityId => {
              const state = this.hass.states[entityId];
              const name = state.attributes?.friendly_name || entityId;
              const protein = state.attributes?.protein || 'Cook';
              const currentTemp = state.attributes?.current_temp_c;
              const targetTemp = state.attributes?.target_temp_c;
              const cookState = state.state;
              const progress = state.attributes?.progress || 0;
              
              return html`
                <ha-card 
                  class="active-cook-card clickable"
                  @click=${() => {
                    this._selectedEntity = entityId;
                    this.requestUpdate();
                  }}
                >
                  <div class="card-content">
                    <div class="cook-header">
                      <strong>${name}</strong>
                      <span class="cook-state-badge">${cookState}</span>
                    </div>
                    <div class="cook-details">
                      <div class="cook-protein">${protein}</div>
                      ${currentTemp && targetTemp ? html`
                        <div class="cook-temp">
                          🌡️ ${currentTemp}°C / ${targetTemp}°C
                        </div>
                      ` : ''}
                      ${progress > 0 ? html`
                        <div class="cook-progress">
                          <div class="progress-bar">
                            <div class="progress-fill" style="width: ${progress}%"></div>
                          </div>
                          <span>${Math.round(progress)}%</span>
                        </div>
                      ` : ''}
                    </div>
                    <div class="cook-action">
                      <button class="primary-btn">View Cook →</button>
                    </div>
                  </div>
                </ha-card>
              `;
            })}
          </div>
        </div>
      </ha-card>

      ${this._renderWelcomeScreen(activeCooks)}
    `;
  }

  /**
   * Render welcome screen with appliance selector
   */
  _renderWelcomeScreen(activeCooks = []) {
    // Build the ongoing cooks section:
    //  - MEATER probe entities that are actively cooking
    //  - Local recipe cooks (this device, in-memory array)
    //  - Server recipe cooks from other devices (fetched from API)
    const localRecipeCooks = this._activeRecipeCooks || [];
    // Compute IDs of local cooks to avoid showing duplicates from server
    const localCookIds = new Set(localRecipeCooks.map(c => c.id));
    const remoteRecipeCooks = (this._serverActiveRecipeCooks || []).filter(c => !localCookIds.has(c.id));
    const totalOngoingCooks = activeCooks.length + localRecipeCooks.length + remoteRecipeCooks.length;
    const hasOngoingCooks = totalOngoingCooks > 0;

    return html`
      <div class="welcome-header">
        <h1>${this._t('welcome.title')}</h1>
        <p class="welcome-subtitle">${this._t('welcome.select_appliance')}</p>
        <button class="help-btn" @click=${() => this._openHelp('#41-welcome-screen')} title="Open User Guide">?</button>
      </div>

      ${hasOngoingCooks ? html`
        <ha-card class="ongoing-cooks-card">
          <div class="card-content">
            <h3 class="ongoing-cooks-title">🔥 ${this._t('welcome.ongoing_cooks')} (${totalOngoingCooks})</h3>

            ${activeCooks.map(entityId => {
              const st = this.hass.states[entityId];
              const protein = st?.attributes?.protein || '';
              const cut = st?.attributes?.cut_display || st?.attributes?.cut || '';
              const currentTemp = st?.attributes?.current_temp_c;
              const targetTemp = st?.attributes?.target_temp_c;
              const cookState = st?.state || '';
              const progress = st?.attributes?.progress || 0;
              const label = [protein, cut].filter(Boolean).join(' — ') || 'MEATER Cook';

              return html`
                <ha-card class="ongoing-cook-item clickable" @click=${() => this._navigateToActiveCook(entityId)}>
                  <div class="card-content" style="display:flex;align-items:center;gap:12px;padding:12px 16px;">
                    <div style="font-size:28px;flex-shrink:0;">🌡️</div>
                    <div style="flex:1;min-width:0;">
                      <div style="font-weight:600;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">${label}</div>
                      <div style="font-size:0.85em;color:var(--secondary-text-color);">
                        ${currentTemp != null && targetTemp ? html`${currentTemp}°C / ${targetTemp}°C` : cookState}
                      </div>
                    </div>
                    ${progress > 0 ? html`
                      <div style="width:48px;text-align:center;font-weight:600;color:var(--primary-color);">${Math.round(progress)}%</div>
                    ` : ''}
                    <div style="font-size:1.2em;">→</div>
                  </div>
                </ha-card>
              `;
            })}

            ${localRecipeCooks.map(cook => html`
              <ha-card class="ongoing-cook-item clickable" @click=${() => this._viewRecipeCook(cook.id)}>
                <div class="card-content" style="display:flex;align-items:center;gap:12px;padding:12px 16px;">
                  <div style="font-size:28px;flex-shrink:0;">📖</div>
                  <div style="flex:1;min-width:0;">
                    <div style="font-weight:600;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">${cook.recipe?.name || 'Recipe Cook'}</div>
                    <div style="font-size:0.85em;color:var(--secondary-text-color);">
                      ${cook.currentStep < 0 ? 'Overview' : `Step ${cook.currentStep + 1} of ${cook.recipe?.instructions?.length || '?'}`}
                      · ${this._formatElapsedTime(Math.floor((Date.now() - cook.startTime) / 1000))}
                    </div>
                  </div>
                  <div style="font-size:1.2em;">→</div>
                </div>
              </ha-card>
            `)}

            ${remoteRecipeCooks.map(cook => html`
              <ha-card class="ongoing-cook-item clickable" @click=${() => this._adoptServerRecipeCook(cook)}>
                <div class="card-content" style="display:flex;align-items:center;gap:12px;padding:12px 16px;">
                  <div style="font-size:28px;flex-shrink:0;">📖</div>
                  <div style="flex:1;min-width:0;">
                    <div style="font-weight:600;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">${cook.recipe?.name || this._t('welcome.recipe_cook')}</div>
                    <div style="font-size:0.85em;color:var(--secondary-text-color);">
                      ${this._t('welcome.started_on_other_device')}
                      · ${this._formatElapsedTime(Math.floor((Date.now() - cook.startTime) / 1000))}
                    </div>
                  </div>
                  <div style="font-size:1.2em;">→</div>
                </div>
              </ha-card>
            `)}

          </div>
        </ha-card>
      ` : ''}

      ${this._isLoadingAppliances ? html`
        <div class="loading">${this._t('appliances.loading')}</div>
      ` : this._errorMessage ? html`
        <ha-card>
          <div class="card-content error-message">
            <p>⚠️ ${this._errorMessage}</p>
            <button class="primary-btn" @click=${() => this._loadAppliances()}>
              🔄 ${this._t('common.retry')}
            </button>
          </div>
        </ha-card>
      ` : this._appliances.length === 0 ? html`
        <ha-card>
          <div class="card-content no-entities">
            <p>${this._t('appliances.no_appliances')}</p>
            <p>${this._t('appliances.setup_step1')}</p>
            <p>${this._t('appliances.setup_step2')}</p>
          </div>
        </ha-card>
      ` : html`
        <div class="appliance-grid">
          ${this._appliances.flatMap(appliance => {
            const brand = (appliance.brand || '').toLowerCase();
            const model = (appliance.model || '').toLowerCase();
            const name = (appliance.name || '').toLowerCase();
            const isMeater = brand.includes('meater') || model.includes('meater') || name.includes('meater');
            const cards = [html`
              <ha-card class="appliance-card clickable" @click=${() => this._routeToAppliancePath(appliance)}>
                <div class="card-content appliance-card-content">
                  <div class="appliance-icon">
                    ${this._getApplianceIcon(appliance)}
                  </div>
                  <div class="appliance-name">${appliance.name}</div>
                  <div class="appliance-model">${appliance.brand} ${appliance.model}</div>
                </div>
              </ha-card>
            `];
            return cards;
          })}
        </div>

        <ha-card class="previous-cooks-card clickable" @click=${() => this._navigateToPreviousCooks()}>
          <div class="card-content previous-cooks-content">
            <div class="previous-cooks-icon">📋</div>
            <div class="previous-cooks-text">
              <h3>${this._t('meater.previous_cooks')}</h3>
              <p>${this._t('welcome.previous_cooks_description')}</p>
            </div>
          </div>
        </ha-card>

        <ha-card class="previous-cooks-card clickable" @click=${() => this._showAISettings()}>
          <div class="card-content previous-cooks-content">
            <div class="previous-cooks-icon">⚙️</div>
            <div class="previous-cooks-text">
              <h3>${this._t('ai_recipe.settings')}</h3>
              <p>${this._aiAgentId ? `Agent: ${this._aiAgentId}` : this._t('welcome.configure_ai_agent')}</p>
            </div>
          </div>
        </ha-card>

        <!-- Phase 7: Language & Measurement selectors -->
        <ha-card>
          <div class="card-content">
            <h3>${this._t('welcome.language_label')}</h3>
            <div class="button-group">
              <button
                class="category-btn ${this._language === 'sv' ? 'selected' : ''}"
                @click=${() => this._saveLanguagePreference('sv')}>
                🇸🇪 Svenska
              </button>
              <button
                class="category-btn ${this._language === 'en' ? 'selected' : ''}"
                @click=${() => this._saveLanguagePreference('en')}>
                🇬🇧 English
              </button>
            </div>
            <label style="display:flex;align-items:center;gap:8px;margin-top:10px;font-size:0.85em;cursor:pointer;">
              <input type="checkbox"
                .checked=${this._hideOtherDataSource}
                @change=${() => this._toggleHideOtherDataSource()}>
              ${this._t('meater.hide_other_tree')}
            </label>
          </div>
        </ha-card>

        <ha-card>
          <div class="card-content">
            <h3>${this._t('welcome.measurement_system_label')}</h3>
            <div class="button-group">
              <button
                class="category-btn ${this._measurementSystem === 'se' ? 'selected' : ''}"
                @click=${() => this._saveMeasurementPreference('se')}>
                ${typeof MEASUREMENT_SYSTEMS !== 'undefined' && MEASUREMENT_SYSTEMS.se ? (this._language === 'sv' ? MEASUREMENT_SYSTEMS.se.name_sv : MEASUREMENT_SYSTEMS.se.name_en) : '🇸🇪 Swedish'}
              </button>
              <button
                class="category-btn ${this._measurementSystem === 'uk' ? 'selected' : ''}"
                @click=${() => this._saveMeasurementPreference('uk')}>
                ${typeof MEASUREMENT_SYSTEMS !== 'undefined' && MEASUREMENT_SYSTEMS.uk ? (this._language === 'sv' ? MEASUREMENT_SYSTEMS.uk.name_sv : MEASUREMENT_SYSTEMS.uk.name_en) : '🇬🇧 UK Metric'}
              </button>
              <button
                class="category-btn ${this._measurementSystem === 'us' ? 'selected' : ''}"
                @click=${() => this._saveMeasurementPreference('us')}>
                ${typeof MEASUREMENT_SYSTEMS !== 'undefined' && MEASUREMENT_SYSTEMS.us ? (this._language === 'sv' ? MEASUREMENT_SYSTEMS.us.name_sv : MEASUREMENT_SYSTEMS.us.name_en) : '🇺🇸 US Customary'}
              </button>
            </div>
            <p class="source-description" style="margin-top: 8px; font-size: 0.85em;">
              ${this._t('welcome.measurement_' + this._measurementSystem + '_description')}
            </p>
          </div>
        </ha-card>

        <!-- Phase 8b: Shelf Management toggle -->
        <ha-card>
          <div class="card-content">
            <h3>${this._t('shelf.enable_label')}</h3>
            <p class="info-text" style="margin-bottom: 10px;">${this._t('shelf.enable_desc')}</p>
            <div style="display: flex; align-items: center; gap: 12px;">
              <label class="checkbox-label">
                <input
                  type="checkbox"
                  ?checked=${this._shelfEnabled}
                  @change=${(e) => this._saveShelfEnabled(e.target.checked)}
                />
                ${this._shelfEnabled ? '✅ ' + this._t('shelf.enable_label') : this._t('shelf.enable_label')}
              </label>
            </div>
            ${this._shelfEnabled ? html`
              <button class="primary-btn" style="margin-top: 12px;" @click=${() => this._navigateToShelfManagement()}>
                ${this._t('shelf.title')}
              </button>
            ` : ''}
          </div>
        </ha-card>
      `}
    `;
  }

  // ============================================================================
  // PHASE 8b: SHELF MANAGEMENT SCREEN
  // ============================================================================

  _renderShelfManagement() {
    const locations = ['fridge', 'larder', 'freezer', 'spices'];
    const locationKeys = {
      fridge: 'shelf.location_fridge',
      larder: 'shelf.location_larder',
      freezer: 'shelf.location_freezer',
      spices: 'shelf.location_spices',
    };
    const grouped = {};
    for (const loc of locations) grouped[loc] = [];
    for (const item of (this._shelfInventory || [])) {
      const loc = item.location || 'larder';
      if (!grouped[loc]) grouped[loc] = [];
      grouped[loc].push(item);
    }
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => { this._currentPath = 'welcome'; this.requestUpdate(); }}>
          ${this._t('shelf.back')}
        </button>
        <h2>${this._t('shelf.title')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#9-shelf-management')} title="Open User Guide">?</button>
      </div>

      <ha-card>
        <div class="card-content">
          <div style="display: flex; justify-content: space-between; align-items: center; margin-bottom: 12px;">
            <button class="secondary-btn" @click=${() => this._navigateToShoppingList()}>
              ${this._t('shelf.shopping_list_btn')}
            </button>
            <button class="primary-btn" @click=${() => { this._showAddShelfItem = !this._showAddShelfItem; this.requestUpdate(); }}>
              ${this._t('shelf.add_item')}
            </button>
          </div>

          ${this._showAddShelfItem ? html`
            <div style="background: var(--secondary-background-color); padding: 12px; border-radius: 8px; margin-bottom: 16px;">
              <input
                type="text"
                placeholder="${this._t('shelf.item_name_placeholder')}"
                .value=${this._shelfAddName}
                @input=${(e) => { this._shelfAddName = e.target.value; }}
                style="width: 100%; padding: 8px; border: 1px solid var(--divider-color); border-radius: 4px; margin-bottom: 8px; box-sizing: border-box;"
              />
              <select
                .value=${this._shelfAddLocation}
                @change=${(e) => { this._shelfAddLocation = e.target.value; }}
                style="width: 100%; padding: 8px; border: 1px solid var(--divider-color); border-radius: 4px; margin-bottom: 8px; box-sizing: border-box;"
              >
                ${locations.map(loc => html`
                  <option value=${loc} ?selected=${this._shelfAddLocation === loc}>
                    ${this._t(locationKeys[loc])}
                  </option>
                `)}
              </select>
              <input
                type="text"
                placeholder="${this._t('shelf.item_quantity_placeholder')}"
                .value=${this._shelfAddQuantity}
                @input=${(e) => { this._shelfAddQuantity = e.target.value; }}
                style="width: 100%; padding: 8px; border: 1px solid var(--divider-color); border-radius: 4px; margin-bottom: 8px; box-sizing: border-box;"
              />
              <div style="display: flex; gap: 8px;">
                <button class="primary-btn" @click=${() => this._addShelfItem()}>${this._t('shelf.save_item')}</button>
                <button class="secondary-btn" @click=${() => { this._showAddShelfItem = false; this.requestUpdate(); }}>${this._t('shelf.cancel')}</button>
              </div>
            </div>
          ` : ''}

          ${locations.map(loc => {
            const items = grouped[loc] || [];
            return html`
              <div style="margin-bottom: 16px;">
                <h4 style="margin: 0 0 6px 0; color: var(--primary-color);">${this._t(locationKeys[loc])}</h4>
                ${items.length === 0 ? html`
                  <p style="font-size: 0.85em; color: var(--secondary-text-color);">${this._t('shelf.empty')}</p>
                ` : html`
                  <div style="display: flex; flex-direction: column; gap: 4px;">
                    ${items.map(item => html`
                      <div style="display: flex; align-items: center; justify-content: space-between; padding: 6px 8px; background: var(--secondary-background-color); border-radius: 6px;">
                        <div>
                          <span style="font-weight: 500;">${item.name}</span>
                          ${item.quantity ? html`<span style="font-size: 0.85em; color: var(--secondary-text-color); margin-left: 8px;">${item.quantity}</span>` : ''}
                        </div>
                        <button class="secondary-btn" style="padding: 4px 10px; font-size: 0.8em;" @click=${() => this._removeShelfItem(item.id)}>
                          ${this._t('shelf.remove_item')}
                        </button>
                      </div>
                    `)}
                  </div>
                `}
              </div>
            `;
          })}
        </div>
      </ha-card>
    `;
  }

  // ============================================================================
  // PHASE 8d: SHOPPING LIST SCREEN
  // ============================================================================

  _renderShoppingList() {
    const items = this._shoppingList || [];
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => { this._currentPath = 'shelf_management'; this.requestUpdate(); }}>
          ${this._t('shopping_list.back')}
        </button>
        <h2>${this._t('shopping_list.title')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#10-shopping-list')} title="Open User Guide">?</button>
      </div>

      <ha-card>
        <div class="card-content">
          ${items.length === 0 ? html`
            <p style="color: var(--secondary-text-color);">${this._t('shopping_list.empty')}</p>
          ` : html`
            <div style="display: flex; flex-direction: column; gap: 6px; margin-bottom: 16px;">
              ${items.map(item => html`
                <div style="display: flex; align-items: center; gap: 10px; padding: 8px; background: var(--secondary-background-color); border-radius: 6px; ${item.checked ? 'opacity:0.5;text-decoration:line-through;' : ''}">
                  <input
                    type="checkbox"
                    ?checked=${item.checked}
                    @change=${() => this._toggleShoppingListItem(item.id)}
                    style="width: 18px; height: 18px; cursor: pointer; flex-shrink: 0;"
                  />
                  <span style="flex: 1;">${item.name}${item.quantity ? html` <span style="font-size:0.85em;color:var(--secondary-text-color);">${item.quantity}</span>` : ''}</span>
                  <button class="secondary-btn" style="padding: 4px 10px; font-size: 0.8em;" @click=${() => this._deleteShoppingListItem(item.id)}>✕</button>
                </div>
              `)}
            </div>
            ${items.some(i => i.checked) ? html`
              <button class="secondary-btn" @click=${() => this._clearCheckedShoppingItems()}>
                ${this._t('shopping_list.clear_checked')}
              </button>
            ` : ''}
            ${items.some(i => !i.checked) ? html`
              <button class="secondary-btn" style="margin-top: 8px;" @click=${async () => {
                const names = items.filter(i => !i.checked).map(i => i.name);
                const count = await this._pushToHATodo(names);
                if (count > 0) {
                  this._showMessage('✅', this._t('shopping_list.exported_to_ha').replace('{count}', count), false);
                } else {
                  this._showMessage('⚠️', this._t('shopping_list.ha_todo_not_found'), false);
                }
              }}>
                📤 ${this._t('shopping_list.export_to_ha')}
              </button>
            ` : ''}
          `}
        </div>
      </ha-card>
    `;
  }

  // ============================================================================
  // PHASE 8d: POST-COOK SHELF UPDATE PROMPT
  // ============================================================================

  _renderPostCookShelfUpdate() {
    const update = this._pendingShelfUpdate;
    if (!update) return html``;
    const checkboxes = update.checkboxes || [];
    return html`
      <ha-card>
        <div class="card-content">
          <h3>${this._t('post_cook.update_shelf_title')}</h3>
          <p class="info-text">${this._t('post_cook.update_shelf_desc')}</p>

          <div style="display: flex; flex-direction: column; gap: 6px; margin: 12px 0;">
            ${checkboxes.map((cb, idx) => html`
              <label class="checkbox-label">
                <input
                  type="checkbox"
                  ?checked=${cb.checked}
                  @change=${(e) => {
                    this._pendingShelfUpdate = {
                      ...update,
                      checkboxes: checkboxes.map((c, i) => i === idx ? { ...c, checked: e.target.checked } : c),
                    };
                    this.requestUpdate();
                  }}
                />
                ${cb.name}
              </label>
            `)}
          </div>

          <div style="display: flex; gap: 10px; flex-wrap: wrap; margin-top: 12px;">
            <button class="primary-btn" @click=${async () => {
              const checked = checkboxes.filter(c => c.checked);
              for (const item of checked) {
                const normItem = item.name.toLowerCase().replace(/s$/, '');
                const shelfItem = (this._shelfInventory || []).find(s => {
                  const normShelf = s.name.toLowerCase().replace(/s$/, '');
                  return normShelf === normItem
                    || s.name.toLowerCase().includes(item.name.toLowerCase())
                    || item.name.toLowerCase().includes(s.name.toLowerCase());
                });
                if (shelfItem) {
                  await this._removeShelfItem(shelfItem.id);
                }
              }
              this._pendingShelfUpdate = null;
              this._showMessage('✅ ' + this._t('messages.recipe_cook_saved_title'), this._t('messages.recipe_cook_saved') + ' 🎉');
              this.requestUpdate();
            }}>
              ${this._t('post_cook.update_shelf_btn')}
            </button>

            <button class="secondary-btn" @click=${async () => {
              const unchecked = checkboxes.filter(c => !c.checked);
              if (unchecked.length > 0) {
                try {
                  await this.hass.callApi('POST', 'kitchen_cooking_engine/shopping_list', {
                    items: unchecked.map(c => ({ name: c.name })),
                  });
                } catch (e) {
                  console.error('Could not add to shopping list:', e);
                }
                // Also push to HA native todo list (fire-and-forget)
                await this._pushToHATodo(unchecked.map(c => c.name));
              }
              this._pendingShelfUpdate = null;
              this._showMessage('✅ ' + this._t('messages.recipe_cook_saved_title'), this._t('messages.recipe_cook_saved') + ' 🎉');
              this.requestUpdate();
            }}>
              ${this._t('post_cook.add_to_list_btn')}
            </button>

            <button class="secondary-btn" @click=${() => {
              this._pendingShelfUpdate = null;
              this._showMessage('✅ ' + this._t('messages.recipe_cook_saved_title'), this._t('messages.recipe_cook_saved') + ' 🎉');
              this.requestUpdate();
            }}>
              ${this._t('post_cook.skip_btn')}
            </button>
          </div>
        </div>
      </ha-card>
    `;
  }

  // ─── MEATER+ (experimental) path ─────────────────────────────────────────────

  _renderMeaterExperimental() {
    // If in cooking mode, show the setup form
    if (this._showMeaterCooking) {
      let entities = this._findCookingEntities();
      
      // v0.5.0.51: Sort entities by entity ID pattern (more reliable than attributes)
      // Entity IDs like "kitchen_cooking_engine_bt_proxy_meater_tip_temperature_cooking_session"
      // contain "meater" - use this to identify and sort MEATER entities first
      entities = entities.sort((a, b) => {
        const aIsMeater = a.toLowerCase().includes('meater');
        const bIsMeater = b.toLowerCase().includes('meater');
        
        // MEATER entities first, others after
        if (aIsMeater && !bIsMeater) return -1;
        if (!aIsMeater && bIsMeater) return 1;
        return 0;  // Preserve original order for same type
      });
      
      return html`
        <div class="path-header">
          <button class="back-btn" @click=${() => this._navigateToWelcome()}>
            ${this._t('nav.back_to_appliances')}
          </button>
          <h2>🌡️ MEATER+</h2>
          <button class="help-btn" @click=${() => this._openHelp('#51-starting-a-cook')} title="Open User Guide">?</button>
        </div>
        
        ${this._renderExpSetupForm(entities)}
      `;
    }
    
    // Otherwise show the path buttons
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => this._navigateToWelcome()}>
          ${this._t('nav.back_to_appliances')}
        </button>
        <h2>🌡️ MEATER+</h2>
        <button class="help-btn" @click=${() => this._openHelp('#59-meater--cut-profile--recipe-links')} title="Open User Guide">?</button>
      </div>

      <div class="path-buttons">
        <ha-card class="path-card clickable" @click=${() => this._startMeaterCooking()}>
          <div class="card-content path-card-content">
            <div class="path-icon">🌡️</div>
            <h3>${this._t('meater.start_meater_cooking')}</h3>
            <p>${this._t('meater.start_meater_desc')}</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showRecentMeaterCooks()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📋</div>
            <h3>${this._t('meater.recent_meater_cooks')}</h3>
            <p>${this._t('meater.recent_meater_desc')}</p>
          </div>
        </ha-card>
      </div>
    `;
  }

  /**
   * Setup form for the MEATER+ path.
   */
  _renderExpSetupForm(entities) {
    const categories = this._getDataCategories();
    const category = this._getCategory();
    const meats = this._getMeats();
    const cutTypes = this._getCutTypes();
    const cuts = this._getCuts();
    const showMeatSelector = meats.length > 1;
    const showCutTypeSelector = cutTypes.length > 1 || (cutTypes.length === 1 && this._selectedMeat);
    const recommendedDoneness = this._getRecommendedDoneness();
    const donenessTemps = this._selectedDoneness ? this._getTargetTempForDoneness(this._selectedDoneness) : null;
    const displayTemp = this._customTargetTempC || (donenessTemps ? donenessTemps.c : null);
    const displayTempF = this._customTargetTempC ? Math.round(this._customTargetTempC * 9 / 5 + 32) : (donenessTemps ? donenessTemps.f : null);
    const cutData = this._getSelectedCutData();
    const cutUsdaSafeC = cutData && cutData.usda_safe_c ? cutData.usda_safe_c : null;
    const cutUsdaSafeF = cutData && cutData.usda_safe_f ? cutData.usda_safe_f : null;
    // True when the culinary target temp is below the USDA safe minimum for this cut
    const showSafetyWarning = cutUsdaSafeC !== null && displayTemp !== null && displayTemp < cutUsdaSafeC;
    
    // v0.5.0.57: Check if selected entity is specifically a MEATER entity
    // Diagnostic data revealed: entities.includes() returns TRUE for non-MEATER entities
    // because all cooking_session entities are in the list. We need to check if the
    // selected entity IS a MEATER entity, not just if it's in the list.
    if (entities.length > 0) {
      // Check if selected entity contains "meater" in its ID (same pattern as sorting)
      const isMeaterEntity = this._selectedEntity && 
                             this._selectedEntity.toLowerCase().includes('meater');
      
      if (!this._selectedEntity || !isMeaterEntity) {
        this._selectedEntity = entities[0];  // First entity (MEATER after sorting)
      }
    }
    
    return html`
      <div class="status-banner idle">
        <h2>${this._t('meater.ready_to_cook')}</h2>
        <p>${this._t('meater.select_protein')}</p>
      </div>
      
      ${entities.length > 1 ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('meater.select_session')}</h3>
            <select 
              .value=${this._selectedEntity}
              @change=${(e) => this._selectedEntity = e.target.value}
            >
              ${entities.map(e => html`
                <option value="${e}" ?selected=${this._selectedEntity === e}>
                  ${this.hass.states[e]?.attributes?.friendly_name || e}
                </option>
              `)}
            </select>
          </div>
        </ha-card>
      ` : ''}
      
      <!-- Step 1: Select Category -->
      <ha-card>
        <div class="card-content">
          <h3>${this._t('meater.select_category')}</h3>
          <div class="button-group">
            ${Object.entries(categories).map(([key, cat]) => html`
              <button 
                class="category-btn ${this._selectedCategory === key ? 'selected' : ''}" 
                @click=${() => this._selectCategory(key)}>
                ${cat.icon} ${(this._language === 'sv' && cat.name_sv) ? cat.name_sv : cat.name}
              </button>
            `)}
            <button 
              class="category-btn ${this._selectedCategory === 'custom' ? 'selected' : ''}" 
              @click=${() => this._selectCategory('custom')}>
              ${this._t('meater.custom')}
            </button>
          </div>
        </div>
      </ha-card>
      
      <!-- Custom Temperature Cook (no meat/cut/doneness needed) -->
      ${this._selectedCategory === 'custom' ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('meater.custom_temp_cook')}</h3>
            <p>${this._t('meater.custom_temp_description')}</p>
            
            <div style="margin: 16px 0;">
              <label style="display: block; margin-bottom: 8px; font-weight: 500;">${this._t('meater.session_name')} (${this._t('common.optional')})</label>
              <input 
                type="text" 
                placeholder="${this._t('meater.session_name_placeholder')}"
                .value=${this._customProfileName || ''}
                @input=${(e) => { this._customProfileName = e.target.value; }}
                style="width: 100%; padding: 10px; border: 2px solid var(--divider-color); border-radius: 8px; font-size: 14px; background: var(--card-background-color); color: var(--primary-text-color); box-sizing: border-box;"
              />
            </div>
            
            <div style="margin: 16px 0;">
              <label style="display: block; margin-bottom: 8px; font-weight: 500;">${this._t('meater.target_temperature')}</label>
              <div class="temp-display-setup">
                <div class="target-temp">
                  <span class="temp-value">${this._convertTemp(this._customProfileTempC)}</span>
                </div>
              </div>
              <input 
                type="range" 
                min="30" 
                max="100" 
                step="1"
                .value="${this._customProfileTempC}"
                @input=${(e) => { this._customProfileTempC = parseInt(e.target.value); }}
                class="temp-slider"
                style="width: 100%; margin: 12px 0;"
              />
              <div class="temp-adjust-controls">
                <button class="temp-btn" @click=${() => { this._customProfileTempC = Math.max(30, this._customProfileTempC - 1); }}>-1°C</button>
                <input 
                  type="number" 
                  min="30" 
                  max="100" 
                  .value="${this._customProfileTempC}"
                  @change=${(e) => { const v = parseInt(e.target.value); if (v >= 30 && v <= 100) this._customProfileTempC = v; }}
                  class="temp-input"
                />
                <button class="temp-btn" @click=${() => { this._customProfileTempC = Math.min(100, this._customProfileTempC + 1); }}>+1°C</button>
              </div>
            </div>
          </div>
        </ha-card>
        
        <div class="action-container">
          <ha-button unelevated @click=${() => this._startCustomCook()}>
            ${this._t('meater.start_cooking')} ${this._convertTemp(this._customProfileTempC)}
          </ha-button>
        </div>
      ` : ''}
      
      <!-- Step 2: Select Animal/Meat (if multiple) -->
      ${this._selectedCategory && showMeatSelector ? html`
        <ha-card>
          <div class="card-content">
            <h3>2️⃣ ${this._t('meater.select_type')}</h3>
            <div class="button-group">
              ${meats.map(meat => html`
                <button 
                  class="category-btn ${this._selectedMeat === meat.id ? 'selected' : ''}" 
                  @click=${() => this._selectMeat(meat.id)}>
                  ${(this._language === 'sv' && meat.name_sv) ? meat.name_sv : meat.name}
                </button>
              `)}
            </div>
          </div>
        </ha-card>
      ` : ''}
      
      <!-- Step 3: Select Cut Type (Steaks, Roasts, etc.) -->
      ${this._selectedMeat && cutTypes.length > 0 ? html`
        <ha-card>
          <div class="card-content">
            <h3>${showMeatSelector ? '3️⃣' : '2️⃣'} ${this._t('meater.select_cut_type')}</h3>
            <div class="button-group">
              ${cutTypes.map(ct => html`
                <button 
                  class="category-btn ${this._selectedCutType === ct.id ? 'selected' : ''}" 
                  @click=${() => this._selectCutType(ct.id)}>
                  ${(this._language === 'sv' && ct.name_sv) ? ct.name_sv : ct.name}
                </button>
              `)}
            </div>
          </div>
        </ha-card>
      ` : ''}
      
      <!-- Step 4: Select Specific Cut -->
      ${this._selectedCutType && cuts.length > 0 ? html`
        <ha-card>
          <div class="card-content">
            <h3>${showMeatSelector ? '4️⃣' : '3️⃣'} ${this._t('meater.select_cut')}</h3>
            <div class="button-group">
              ${cuts.map(cut => html`
                <button
                  class="category-btn ${this._selectedCut === cut.id ? 'selected' : ''}"
                  @click=${() => this._selectCut(cut.id)}>
                  ${(this._language === 'sv' && cut.name_sv) ? cut.name_sv : (cut.name_long || cut.name)}${(cut.recommended_doneness || cut.recommendedDoneness) ? ' ⭐' : ''}
                </button>
              `)}
            </div>
          </div>
        </ha-card>
      ` : ''}
      
      <!-- Cut Profile + Recipe Links -->
      ${this._selectedCut ? this._renderCutProfileCard() : ''}
      
      <!-- Step 5: Doneness Level -->
      ${this._selectedCut ? html`
        <ha-card>
          <div class="card-content">
            <h3>🌡️ ${this._t('meater.select_doneness')} ${recommendedDoneness ? html`<span class="recommended-hint">(⭐ = ${this._t('meater.recommended')})</span>` : ''}</h3>
            <p style="font-size:0.8em;margin:0 0 10px;color:var(--secondary-text-color);">
              ${this._t('meater.safety_legend')}
            </p>
            <div class="doneness-grid">
              ${this._getAvailableDoneness().map(opt => html`
                <button 
                  class="doneness-btn ${this._selectedDoneness === opt.value ? 'selected' : ''} ${opt.value === recommendedDoneness ? 'recommended' : ''}"
                  @click=${() => this._selectDoneness(opt.value)}
                  title="${opt.description || ''}">
                  <span class="icon">${opt.icon}</span>
                  ${(this._language === 'sv' && opt.name_sv) ? opt.name_sv : opt.name}
                  ${opt.value === recommendedDoneness ? html`<span class="star">⭐</span>` : ''}
                  ${opt.safety_level ? html`<span class="safety-dot ${opt.safety_level}" title="${opt.safety_level === 'safe' ? this._t('meater.safety_dot_safe') : opt.safety_level === 'caution' ? this._t('meater.safety_dot_caution') : this._t('meater.safety_dot_unsafe')}"></span>` : ''}
                  <span class="temp-hint">${opt.temp_c !== null && opt.temp_c !== undefined ? this._convertTemp(opt.temp_c) : ''}</span>
                </button>
              `)}
            </div>
          </div>
        </ha-card>
        
        <!-- Temperature Fine-Tuning -->
        ${this._selectedDoneness ? html`
          <ha-card>
            <div class="card-content">
              <h3>🎯 ${this._t('meater.target_temperature')}</h3>
              <div class="temp-display-setup">
                <div class="target-temp">
                  <span class="temp-value">${displayTemp !== null && displayTemp !== undefined ? this._convertTemp(displayTemp) : '—'}</span>
                </div>
                ${this._customTargetTempC ? html`
                  <span class="custom-indicator">${this._t('meater.custom')}</span>
                ` : ''}
              </div>
              
              ${showSafetyWarning ? html`
                <div style="margin:10px 0;padding:10px 12px;background:rgba(244,67,54,0.08);border-left:3px solid #f44336;border-radius:4px;font-size:0.84em;line-height:1.5;">
                  <div>⚠️ <strong>${this._t('meater.culinary_preferred')}</strong> ${this._convertTemp(displayTemp)}</div>
                  <div>🛡️ <strong>${this._t('meater.usda_safe_minimum')}</strong> ${this._convertTemp(cutUsdaSafeC)}</div>
                  <div style="color:var(--secondary-text-color);margin-top:4px;">${this._t('meater.undercooked_risk')}</div>
                </div>
              ` : ''}
              
              <button 
                class="adjust-btn ${this._showTempAdjust ? 'active' : ''}"
                @click=${() => this._toggleTempAdjust()}>
                ${this._showTempAdjust ? this._t('meater.done_adjusting') : this._t('meater.fine_tune_temp')}
              </button>
              
              ${this._showTempAdjust ? html`
                <div class="temp-adjust-section">
                  <input 
                    type="range" 
                    min="35" 
                    max="100" 
                    step="1"
                    .value="${displayTemp}"
                    @input=${(e) => this._updateCustomTemp(e.target.value)}
                    class="temp-slider"
                  />
                  <div class="temp-adjust-controls">
                    <button class="temp-btn" @click=${() => this._updateCustomTemp(displayTemp - 1)}>-1°C</button>
                    <input 
                      type="number" 
                      min="35" 
                      max="100" 
                      .value="${displayTemp}"
                      @change=${(e) => this._updateCustomTemp(e.target.value)}
                      class="temp-input"
                    />
                    <button class="temp-btn" @click=${() => this._updateCustomTemp(displayTemp + 1)}>+1°C</button>
                  </div>
                  <button 
                    class="reset-btn"
                    @click=${() => { this._customTargetTempC = null; }}>
                    ${this._t('meater.reset_to')} ${donenessTemps ? this._convertTemp(donenessTemps.c) : ''} (${this._selectedDoneness ? this._selectedDoneness.replace('_', ' ') : ''})
                  </button>
                </div>
              ` : ''}
            </div>
          </ha-card>
        ` : ''}
        
        <!-- Step 6: Cooking Method — driven by the cut file's methods: list.
             Display names are derived from the slug so new methods (e.g. curing)
             appear automatically without any other configuration.
             Selecting a method shows its cut description, recipe titles, and an
             inline recipe viewer — all from pre-extracted JS constants, no
             runtime file parsing until the user opens a specific recipe. -->
        <ha-card>
          <div class="card-content">
            <h3>${this._t('meater.select_method')}</h3>
            <div class="method-grid">
              ${(() => {
                const cutData = this._getSelectedCutData();
                const methods = (cutData && cutData.supported_methods && cutData.supported_methods.length > 0)
                  ? cutData.supported_methods
                  : COOKING_METHODS.map(m => m.value);
                return methods.map(methodSlug => {
                  const translated = this._t('cooking_methods.' + methodSlug);
                  const name = (translated && translated !== 'cooking_methods.' + methodSlug)
                    ? translated
                    : methodSlug.split('_').map(w => w.charAt(0).toUpperCase() + w.slice(1)).join(' ');
                  return html`
                    <button
                      class="method-btn ${this._selectedMethod === methodSlug ? 'selected' : ''}"
                      @click=${() => {
                        if (this._selectedMethod !== methodSlug) {
                          this._selectedMethod = methodSlug;
                          this._selectedFileRecipe = null;
                          this._recipeFileContent = null;
                          this._recipeFileUrl = null;
                        }
                      }}>
                      ${name}
                    </button>
                  `;
                });
              })()}
            </div>

            ${/* Inline method description + recipe links for the selected method. */ ''}
            ${this._selectedMethod ? (() => {
              const cutData = this._getSelectedCutData();
              const slug = cutData && (cutData.recipe_slug || cutData.slug);
              if (!slug) return '';
              const methodProfiles = this._getCutMethodProfiles()[slug];
              const descEn  = methodProfiles && methodProfiles[this._selectedMethod];
              const descSv  = methodProfiles && methodProfiles[this._selectedMethod + '_sv'];
              const desc    = (this._language === 'sv' && descSv) ? descSv : descEn;
              const titles = this._getRecipeTitles()[slug] && this._getRecipeTitles()[slug][this._selectedMethod];
              const url    = this._getRecipeIndex()[slug] && this._getRecipeIndex()[slug][this._selectedMethod];
              if (!desc && (!titles || titles.length === 0)) return '';
              const recipeBtnStyle = 'text-align:left;width:100%;cursor:pointer;border:1px solid var(--divider-color);border-radius:8px;padding:8px 12px;background:var(--secondary-background-color);font-size:0.87em;color:var(--primary-text-color);';
              return html`
                <div style="margin-top:14px;border-top:1px solid var(--divider-color);padding-top:12px;">
                  ${desc ? html`
                    <p style="font-size:0.87em;line-height:1.55;color:var(--secondary-text-color);margin:0 0 12px 0;">${desc}</p>
                  ` : ''}
                  ${titles && titles.length > 0 ? html`
                    <div style="display:flex;flex-direction:column;gap:6px;">
                      ${titles.map((title, i) => html`
                        <button @click=${() => this._openRecipeFullscreen(url, i, title)} style="${recipeBtnStyle}">
                          📄 ${title}
                        </button>
                      `)}
                    </div>
                  ` : ''}
                </div>
              `;
            })() : ''}
          </div>
        </ha-card>

        <!-- AI Recipe Suggestions shortcut — shown when AI is configured -->
        ${this._aiAgentId ? html`
          <ha-card>
            <div class="card-content">
              <h3>${this._t('meater.ai_for_cut')}</h3>
              <p style="font-size:0.85em;color:var(--secondary-text-color);margin:0 0 12px 0;">
                ${this._t('meater.ai_for_cut_hint')}
              </p>
              <label style="display:block;font-size:0.87em;font-weight:600;margin-bottom:4px;">
                ${this._t('meater.ai_weight_label')}
              </label>
              <input
                type="text"
                .value=${this._meaterAiWeight}
                @input=${(e) => { this._meaterAiWeight = e.target.value; }}
                placeholder="${this._t('meater.ai_weight_placeholder')}"
                style="width:100%;padding:8px;border:1px solid var(--divider-color);border-radius:6px;background:var(--primary-background-color);color:var(--primary-text-color);font-size:0.9em;box-sizing:border-box;margin-bottom:12px;"
              >
              <button
                class="primary-btn"
                style="width:100%;"
                @click=${() => this._goToAISuggestionsForCut()}
              >
                ${this._t('meater.ai_for_cut')}
              </button>
            </div>
          </ha-card>
        ` : ''}
        
        <!-- Start Button -->
        <div class="action-container">
          <ha-button unelevated @click=${this._startCook} ?disabled=${!this._selectedDoneness}>
            ${this._t('meater.start_cooking')}${this._customTargetTempC ? ` ${this._convertTemp(this._customTargetTempC)}` : ''}
          </ha-button>
        </div>
      ` : ''}
    `;
  }

  /**
   * Render a cut-profile card.
   *
   * Descriptions and recipe titles come from JS constants (CUT_METHOD_PROFILES,
   * RECIPE_TITLES_INDEX) extracted at generator time — no runtime file parsing.
   * A file is only fetched when the user opens a specific recipe, and the recipe
   * block is isolated with a plain split('\n### '), no regex.
   */
  _renderCutProfileCard() {
    const cut = this._getCuts().find(c => c.id === this._selectedCut);
    if (!cut) return html``;
    const slug = cut.recipe_slug || cut.slug;
    if (!slug) return html``;

    const profileEn = this._getCutProfiles()[slug];
    const profileSv = this._getCutProfilesSv()[slug];
    const profile   = (this._language === 'sv' && profileSv) ? profileSv : profileEn;
    const recipes = this._getRecipeIndex()[slug];
    if (!profile && !recipes) return html``;

    const methodEntries = recipes
      ? Object.entries(recipes).filter(([m]) => m !== 'overview')
      : [];

    const btnBase = 'cursor:pointer;border:none;border-radius:14px;';
    const activeStyle  = btnBase + 'font-size:0.78em;padding:4px 11px;background:var(--accent-color,#0088cc);color:#fff;font-weight:700;';
    const methodStyle  = btnBase + 'font-size:0.78em;padding:4px 11px;background:var(--primary-color);color:var(--text-primary-color);opacity:0.92;';
    const closeBtnStyle = 'font-size:0.78em;padding:3px 10px;background:transparent;border:1px solid var(--divider-color);border-radius:10px;cursor:pointer;color:var(--secondary-text-color);';
    const recipeBtnStyle = 'text-align:left;width:100%;cursor:pointer;border:1px solid var(--divider-color);border-radius:8px;padding:8px 12px;background:var(--secondary-background-color);font-size:0.87em;color:var(--primary-text-color);';

    const sel = this._selectedResearchMethod;
    const methodProfiles = this._getCutMethodProfiles()[slug];
    const selDescEn  = sel && methodProfiles && methodProfiles[sel];
    const selDescSv  = sel && methodProfiles && methodProfiles[sel + '_sv'];
    const selDesc    = (this._language === 'sv' && selDescSv) ? selDescSv : selDescEn;
    const selTitles = sel && this._getRecipeTitles()[slug] && this._getRecipeTitles()[slug][sel];
    const selUrl = sel && recipes && recipes[sel];

    const closeResearch = () => {
      this._selectedResearchMethod = null;
      this._selectedFileRecipe = null;
      this._recipeFileContent = null;
      this._recipeFileUrl = null;
      this.requestUpdate();
    };

    return html`
      <ha-card>
        <div class="card-content">
          <h3>${this._t('meater.cut_profile')}</h3>
          ${profile ? html`
            <p style="font-size:0.88em;line-height:1.55;color:var(--secondary-text-color);margin:0 0 12px 0;">
              ${profile}
            </p>
          ` : ''}

          ${methodEntries.length > 0 ? html`
            <div>
              <span style="font-size:0.82em;font-weight:600;color:var(--secondary-text-color);">
                ${this._t('meater.method_research')}
              </span>
              <div style="display:flex;flex-wrap:wrap;gap:6px;margin-top:8px;">
                ${methodEntries.map(([method]) => {
                  const translated = this._t('cooking_methods.' + method);
                  const label = (translated && translated !== 'cooking_methods.' + method)
                    ? translated
                    : method.replace(/_/g, ' ');
                  return html`
                    <button
                      @click=${() => {
                        if (this._selectedResearchMethod === method) {
                          closeResearch();
                        } else {
                          this._selectedResearchMethod = method;
                          this._selectedFileRecipe = null;
                          this._recipeFileContent = null;
                          this._recipeFileUrl = null;
                          this.requestUpdate();
                        }
                      }}
                      style="${sel === method ? activeStyle : methodStyle}">
                      ${label}${sel === method ? ' ▲' : ''}
                    </button>
                  `;
                })}
              </div>
            </div>
          ` : ''}
        </div>
      </ha-card>

      ${sel ? html`
        <ha-card style="margin-top:4px;">
          <div class="card-content">
            <div style="display:flex;align-items:center;justify-content:space-between;margin-bottom:10px;">
              <span style="font-size:0.88em;font-weight:600;color:var(--secondary-text-color);">
                📚 ${(() => { const t = this._t('cooking_methods.' + sel); return (t && t !== 'cooking_methods.' + sel) ? t : sel.replace(/_/g, ' '); })()} — ${this._t('meater.research_label')}
              </span>
              <button @click=${closeResearch} style="${closeBtnStyle}">${this._t('meater.close_research')}</button>
            </div>

            ${selDesc ? html`
              <p style="font-size:0.87em;line-height:1.55;color:var(--secondary-text-color);margin:0 0 12px 0;">
                ${selDesc}
              </p>
            ` : ''}

            ${selTitles && selTitles.length > 0 ? html`
              <div style="display:flex;flex-direction:column;gap:6px;">
                ${selTitles.map((title, i) => html`
                  <button
                    @click=${() => this._openRecipeFullscreen(selUrl, i, title)}
                    style="${recipeBtnStyle}">
                    📄 ${title}
                  </button>
                `)}
              </div>
            ` : ''}
          </div>
        </ha-card>
      ` : ''}
    `;
  }

  /**
   * Fetch a recipe file and cache it. Only called when the user opens a specific
   * recipe. Clicking the same recipe again closes it.
   * recipeIndex is 0-based into RECIPE_TITLES_INDEX[slug][method].
   */
  async _openRecipeFile(url, recipeIndex) {
    if (this._recipeFileUrl === url && this._selectedFileRecipe === recipeIndex) {
      this._selectedFileRecipe = null;
      this.requestUpdate();
      return;
    }
    this._selectedFileRecipe = recipeIndex;
    if (this._recipeFileUrl === url && this._recipeFileContent) {
      this.requestUpdate();
      return;
    }
    this._recipeFileUrl = url;
    this._recipeFileLoading = true;
    this._recipeFileContent = null;
    this.requestUpdate();
    try {
      const resp = await fetch(url);
      if (!resp.ok) throw new Error(`HTTP ${resp.status}`);
      const text = await resp.text();
      // Strip the leading KCE header comment using indexOf only — no regex
      const headerEnd = text.indexOf('-->');
      this._recipeFileContent = headerEnd >= 0 ? text.slice(headerEnd + 3).trimStart() : text;
    } catch (e) {
      this._recipeFileContent = `_Could not load file: ${e.message}_`;
    }
    this._recipeFileLoading = false;
    this.requestUpdate();
  }

  /**
   * Open a recipe in full-screen viewer mode (MEATER path).
   * Fetches the file (reuses cache if already loaded), then switches to fullscreen.
   */
  async _openRecipeFullscreen(url, recipeIndex, title) {
    this._fullscreenRecipeTitle = title || '';
    this._selectedFileRecipe = recipeIndex;
    if (this._recipeFileUrl !== url || !this._recipeFileContent) {
      this._recipeFileUrl = url;
      this._recipeFileLoading = true;
      this._recipeFileContent = null;
      this._fullscreenRecipeMode = true;
      this.requestUpdate();
      try {
        const resp = await fetch(url);
        if (!resp.ok) throw new Error(`HTTP ${resp.status}`);
        const text = await resp.text();
        const headerEnd = text.indexOf('-->');
        this._recipeFileContent = headerEnd >= 0 ? text.slice(headerEnd + 3).trimStart() : text;
      } catch (e) {
        this._recipeFileContent = `_Could not load file: ${e.message}_`;
      }
      this._recipeFileLoading = false;
    } else {
      this._fullscreenRecipeMode = true;
    }
    this.requestUpdate();
  }

  /**
   * Close the full-screen recipe viewer and return to the previous view.
   */
  _closeRecipeFullscreen() {
    this._fullscreenRecipeMode = false;
    this._fullscreenRecipeTitle = null;
    this._fullscreenRecipeMonitoring = false;
    this._selectedFileRecipe = null;
    this.requestUpdate();
  }

  /**
   * Start a MEATER cook while staying in the full-screen recipe view,
   * so the user can read the recipe and watch the cook progress simultaneously.
   */
  _startCookInRecipeFullscreen() {
    const serviceData = {
      cut_id: this._selectedCut,
      doneness: this._selectedDoneness,
      cooking_method: this._selectedMethod,
      data_source: this._dataSource,
    };
    if (this._customTargetTempC) {
      serviceData.custom_target_temp_c = this._customTargetTempC;
    }
    this._callService('start_cook', serviceData);
    this._showMeaterCooking = false;
    this._fullscreenRecipeMonitoring = true;
    this.requestUpdate();
  }

  /**
   * Render the full-screen recipe viewer (MEATER path).
   * Uses the same header style as the AI recipe cook flow.
   * When a cook is active (_fullscreenRecipeMonitoring), shows a compact
   * monitor card below the recipe so the user can read and watch simultaneously.
   */
  _renderRecipeFullscreen() {
    const monitorState = this._fullscreenRecipeMonitoring && this._selectedEntity
      ? this.hass?.states?.[this._selectedEntity]
      : null;
    const isActiveCook = monitorState && monitorState.state !== 'idle'
      && monitorState.state !== 'complete' && monitorState.state !== 'unavailable'
      && monitorState.state !== 'unknown';

    return html`
      <div class="recipe-cook-header">
        <div class="recipe-cook-title" style="display:flex;align-items:center;gap:12px;">
          <div class="recipe-cook-nav-buttons">
            <button class="recipe-nav-btn" @click=${() => this._closeRecipeFullscreen()}
              title="${this._t('meater.back_to_recipes')}">←</button>
            ${isActiveCook ? html`
              <button class="recipe-nav-btn home-btn"
                @click=${() => { this._closeRecipeFullscreen(); this._navigateToActiveCook(this._selectedEntity); }}
                title="${this._t('welcome.active_cook')}">🏠</button>
            ` : ''}
          </div>
          <div>
            <h2>${this._fullscreenRecipeTitle || this._t('meater.recipe_label')}</h2>
            ${isActiveCook ? html`
              <p class="recipe-cook-serving">${this._getStateIcon(monitorState.state)} ${monitorState.state.replace('_', ' ')}</p>
            ` : ''}
          </div>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          ${this._recipeFileLoading ? html`
            <div style="text-align:center;padding:24px;color:var(--secondary-text-color);">⏳ ${this._t('common.loading')}</div>
          ` : html`
            <div class="recipe-md-content"
                 .innerHTML=${this._mdToHtml(this._convertIngredientText(this._getRecipeContent(this._selectedFileRecipe)))}>
            </div>
          `}
        </div>
      </ha-card>

      ${isActiveCook ? this._renderRecipeFullscreenMonitor(monitorState) : html`
        ${this._selectedDoneness ? html`
          <div class="action-container">
            <ha-button unelevated @click=${() => this._startCookInRecipeFullscreen()}>
              ${this._t('meater.start_cooking')}${this._customTargetTempC ? ` ${this._convertTemp(this._customTargetTempC)}` : ''}
            </ha-button>
          </div>
        ` : ''}
      `}
    `;
  }

  /**
   * Compact MEATER cook monitor rendered below the recipe in full-screen mode.
   * Shows live temperature, progress, ETA, and action buttons.
   */
  _renderRecipeFullscreenMonitor(state) {
    const attrs = state.attributes;
    const cookState = state.state;
    const progress = attrs.progress || 0;
    const currentTemp = attrs.current_temp;
    const targetTemp = attrs.target_temp_c;
    const eta = attrs.eta_minutes;
    const restTimeRemaining = attrs.rest_time_remaining;

    return html`
      <ha-card style="margin-top:8px;">
        <div class="card-content">
          <div style="display:flex;align-items:center;justify-content:space-between;margin-bottom:12px;">
            <span style="font-weight:600;font-size:0.95em;">🌡️ ${this._t('meater.active_cook_title') || 'Active Cook'}</span>
            <span style="font-size:0.82em;color:var(--secondary-text-color);">
              ${attrs.cut_display || attrs.cut || ''} ${attrs.doneness ? '· ' + attrs.doneness.replace('_', ' ') : ''}
            </span>
          </div>

          <div class="temp-display" style="margin-bottom:12px;">
            <div class="temp-current">
              <div class="value">${currentTemp !== null && currentTemp !== undefined ? this._convertTemp(currentTemp) : '--'}</div>
              <div class="label">${this._t('meater.tip_temp')}</div>
            </div>
            <div class="temp-target">
              <div class="value">${targetTemp !== null && targetTemp !== undefined ? this._convertTemp(targetTemp) : '--'}</div>
              <div class="label">${this._t('common.target')}</div>
            </div>
          </div>

          <div class="progress-bar-container" style="margin-bottom:6px;">
            <div class="progress-bar" style="width:${Math.min(100, progress)}%"></div>
          </div>
          <div style="display:flex;justify-content:space-between;font-size:0.82em;color:var(--secondary-text-color);margin-bottom:12px;">
            <span>${progress.toFixed(0)}% ${this._t('meater.complete_pct')}</span>
            ${eta !== null && eta !== undefined && cookState !== 'resting' ? html`
              <span>${this._t('meater.eta_label')} ${eta} ${this._t('common.minutes_short')}</span>
            ` : ''}
            ${cookState === 'resting' && restTimeRemaining !== null && restTimeRemaining !== undefined ? html`
              <span>${this._t('meater.rest_remaining_label')} ${restTimeRemaining.toFixed(1)} ${this._t('common.minutes_short')}</span>
            ` : ''}
          </div>

          <div class="action-buttons">
            ${cookState === 'goal_reached' ? html`
              <ha-button unelevated @click=${this._startRest}>${this._t('meater.start_rest_btn')}</ha-button>
            ` : ''}
            ${cookState === 'resting' ? html`
              <ha-button unelevated @click=${this._complete}>${this._t('meater.complete_btn')}</ha-button>
            ` : ''}
            <ha-button outlined @click=${this._stopCook}>${this._t('meater.stop_btn')}</ha-button>
          </div>
        </div>
      </ha-card>
    `;
  }

  /**
   */
  _getRecipeContent(recipeIndex) {
    if (!this._recipeFileContent) return '';
    // parts[0] = everything before the first ###, parts[1..n] = recipe blocks
    const parts = this._recipeFileContent.split('\n### ');
    const block = parts[recipeIndex + 1];
    if (!block) return '';
    // Restore the heading marker removed by split and strip leading/trailing hr lines
    let content = '### ' + block;
    // Remove opening/closing --- separators (simple indexOf, not regex)
    const hrOpen = content.indexOf('\n---\n');
    if (hrOpen === content.indexOf('\n') ) content = content.slice(content.indexOf('\n') + 5);
    const hrClose = content.lastIndexOf('\n---');
    if (hrClose > 0 && hrClose === content.length - 4) content = content.slice(0, hrClose);
    return content.trim();
  }

  /**
   * Convert a markdown string to an HTML string for use with .innerHTML.
   * Handles headings, bold, italic, inline code, links, unordered lists,
   * horizontal rules, and paragraphs. All leaf text is HTML-escaped.
   */
  _mdToHtml(md) {
    if (!md) return '';

    const esc = s => String(s)
      .replace(/&/g, '&amp;').replace(/</g, '&lt;')
      .replace(/>/g, '&gt;').replace(/"/g, '&quot;');

    const inline = raw => {
      const out = [];
      let i = 0;
      while (i < raw.length) {
        if (raw[i] === '`') {
          const end = raw.indexOf('`', i + 1);
          if (end > i) { out.push(`<code>${esc(raw.slice(i + 1, end))}</code>`); i = end + 1; continue; }
        }
        if (raw[i] === '[') {
          const close = raw.indexOf(']', i + 1);
          if (close > i && raw[close + 1] === '(') {
            const urlEnd = raw.indexOf(')', close + 2);
            if (urlEnd > close) {
              out.push(`<a href="${esc(raw.slice(close + 2, urlEnd))}" target="_blank" rel="noopener">${esc(raw.slice(i + 1, close))}</a>`);
              i = urlEnd + 1; continue;
            }
          }
        }
        if (raw.slice(i, i + 2) === '**') {
          const end = raw.indexOf('**', i + 2);
          if (end > i) { out.push(`<strong>${esc(raw.slice(i + 2, end))}</strong>`); i = end + 2; continue; }
        }
        if (raw[i] === '*' && raw[i - 1] !== '*' && raw[i + 1] !== '*') {
          const end = raw.indexOf('*', i + 1);
          if (end > i && raw[end + 1] !== '*') { out.push(`<em>${esc(raw.slice(i + 1, end))}</em>`); i = end + 1; continue; }
        }
        out.push(esc(raw[i]));
        i++;
      }
      return out.join('');
    };

    const parts = [];
    let inList = false, inPara = false;
    const closePara = () => { if (inPara)  { parts.push('</p>');  inPara  = false; } };
    const closeList = () => { if (inList)  { parts.push('</ul>'); inList  = false; } };

    for (const line of md.split('\n')) {
      const t = line.trim();
      if (/^---+$/.test(t)) {
        closePara(); closeList();
        parts.push('<hr style="border:none;border-top:1px solid var(--divider-color);margin:12px 0;">');
        continue;
      }
      const hm = t.match(/^(#{1,4})\s+(.+)$/);
      if (hm) {
        closePara(); closeList();
        const sizes = ['1.3em', '1.1em', '0.95em', '0.88em'];
        parts.push(`<div style="font-size:${sizes[hm[1].length-1]};font-weight:700;margin:12px 0 4px;">${inline(hm[2])}</div>`);
        continue;
      }
      if (/^[-*]\s/.test(t)) {
        closePara();
        if (!inList) { parts.push('<ul style="margin:4px 0 4px 16px;padding:0;">'); inList = true; }
        parts.push(`<li style="margin:2px 0;">${inline(t.slice(2))}</li>`);
        continue;
      }
      if (t === '') { closePara(); closeList(); continue; }
      closeList();
      if (!inPara) {
        parts.push('<p style="margin:0 0 8px 0;font-size:0.87em;line-height:1.55;color:var(--secondary-text-color);">');
        inPara = true;
      } else {
        parts.push('<br>');
      }
      parts.push(inline(t));
    }
    closePara(); closeList();
    return parts.join('');
  }

  // ─── End MEATER+ path ─────────────────────────────────────────────────────


  /**
   * Render Recent MEATER Cooks (filtered history)
   * Shows only meater probe cooks (type 6.1)
   */
  _renderRecentMeaterCooks() {
    // Filter history for MEATER probe cooks only
    const meaterCooks = (this._cookHistory || []).filter(cook => {
      // Check if it's a MEATER-only cook (temperature monitoring)
      const isMetering = 
        // New way: explicit appliance type
        cook.appliance_type === 'meater_probe' || 
        cook.appliance_type === 'meater' ||
        
        // Backwards compatibility: Old cooks without appliance_type
        (cook.protein && cook.target_temp_c) ||
        (cook.meat && cook.target_temp_c) ||
        (cook.doneness && cook.target_temp_c) ||
        (cook.cooking_method && cook.target_temp_c && !cook.recipe_name);
      
      return isMetering;
    });

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._currentPath = 'meater_experimental';
          this.requestUpdate();
        }}>
          ${this._t('nav.back_to_meater_path')}
        </button>
        <h2>📋 ${this._t('meater.recent_meater_cooks')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#57-recent-meater-cooks')} title="Open User Guide">?</button>
      </div>

      ${meaterCooks.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p class="no-history">${this._t('meater.no_previous_cooks')}</p>
            <p class="no-history-hint">${this._t('meater.no_previous_cooks_hint')}</p>
          </div>
        </ha-card>
      ` : html`
        <div class="history-list">
          ${meaterCooks.map(cook => html`
            <ha-card class="history-card">
              <div class="history-card-header">
                <div class="history-title-row">
                  <h3 class="history-title">
                    ${cook.protein || this._t('meater.unknown_protein')}
                    ${cook.cut ? html` - ${cook.cut}` : ''}
                  </h3>
                  <span class="history-date">${this._formatDateTime(cook.start_time)}</span>
                </div>
              </div>
              
              <div class="history-details">
                <span class="history-detail">🥩 ${cook.protein}</span>
                <span class="history-detail">🎯 ${(cook.doneness || '').replace('_', ' ')}</span>
                <span class="history-detail">🍳 ${(cook.cooking_method || '').replace(/_/g, ' ')}</span>
                <span class="history-detail">🌡️ ${cook.target_temp_c}°C ${this._t('meater.target_label')}</span>
                ${cook.peak_temp_c ? html`<span class="history-detail">📈 ${Math.round(cook.peak_temp_c)}°C ${this._t('meater.peak_label')}</span>` : ''}
                ${cook.final_temp_after_rest ? html`<span class="history-detail">✅ ${Math.round(cook.final_temp_after_rest)}°C ${this._t('meater.after_rest_label')}</span>` : 
                  cook.final_temp ? html`<span class="history-detail">✅ ${cook.final_temp}°C ${this._t('meater.final_label')}</span>` : ''}
              </div>
              
              ${cook.notes ? html`
                <div class="history-notes">
                  <strong>📝 Notes:</strong> ${cook.notes}
                </div>
              ` : ''}
              
              <div class="history-actions">
                <button class="history-action-btn restart" @click=${() => this._restartCook(cook)}>
                  ${this._t('meater.restart_cook')}
                </button>
                <button class="history-action-btn edit" @click=${() => this._editCookNotes(cook)}>
                  ${this._t('meater.edit_notes')}
                </button>
                <button class="history-action-btn delete" @click=${() => this._deleteCook(cook.id)}>
                  ${this._t('meater.delete_btn')}
                </button>
              </div>
            </ha-card>
          `)}
        </div>
      `}
    `;
  }

  /**
   * Render Ninja Combi path (part of cook type 6.2)
   */
  _renderNinjaCombiPath() {
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => this._navigateToWelcome()}>
          ${this._t('nav.back_to_appliances')}
        </button>
        <h2>🥘 ${this._selectedAppliance?.name || 'Ninja Combi Cooking'}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#6-ninja-combi-cooking')} title="Open User Guide">?</button>
      </div>
          <div class="card-content path-card-content">
            <div class="path-icon">🎨</div>
            <h3>${this._t('ninja.recipe_builder')}</h3>
            <p>${this._t('ninja.recipe_builder_desc')}</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showNinjaBuiltInRecipes()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📖</div>
            <h3>${this._t('ninja.built_in_recipes')}</h3>
            <p>${this._t('ninja.built_in_recipes_desc')}</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._startAIWithNinjaCombi()}>
          <div class="card-content path-card-content">
            <div class="path-icon">🤖</div>
            <h3>${this._t('ninja.ai_recipe_title')}</h3>
            <p>${this._t('ninja.ai_recipe_desc')}</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showRecentNinjaCooks()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📋</div>
            <h3>${this._t('ninja.recent_cooks')}</h3>
            <p>${this._t('ninja.recent_cooks_desc')}</p>
          </div>
        </ha-card>
      </div>
    `;
  }

  /**
   * Render AI Recipe Builder path (part of cook type 6.2)
   */
  _renderAIRecipeBuilderPath() {
    const appliance = this._selectedAppliance;
    
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          if (this._selectedMainAppliance === 'ninja_combi') {
            this._currentPath = 'ninja_combi';
            this.requestUpdate();
          } else {
            this._navigateToWelcome();
          }
        }}>
          ${this._selectedMainAppliance === 'ninja_combi' ? this._t('nav.back_to_ninja_combi') : this._t('nav.back_to_appliances')}
        </button>
        <div class="path-header-title-row">
          <h2>🤖 AI Recipe Builder</h2>
        </div>
        <button class="help-btn" @click=${() => this._openHelp('#7-ai-recipe-builder')} title="Open User Guide">?</button>
      </div>

      <ha-card>
        <div class="card-content appliance-info">
          <div class="appliance-info-header">
            <h3>${this._t('ai_recipe.main_appliance')} ${appliance?.name}</h3>
            <button class="settings-icon-btn" @click=${() => this._toggleFeatureNotesEditor()} title="Edit Feature Notes">
              📝
            </button>
          </div>
          
          ${this._showFeatureNotesEditor && appliance ? html`
            <div class="feature-notes-editor">
              ${this._renderFeaturesByType(appliance)}
            </div>
          ` : html`
            <p class="appliance-features">
              <strong>${this._t('ai_recipe.features_label')}</strong> ${appliance?.features?.join(', ') || 'N/A'}
            </p>
          `}
          
          ${this._appliances.length > 1 ? html`
            <div class="secondary-appliances">
              <h4>${this._t('ai_recipe.secondary_appliances')}</h4>
              ${this._appliances.filter(a => a.id !== appliance?.id).map(a => html`
                <label class="checkbox-label">
                  <input type="checkbox" checked @change=${(e) => this._toggleSecondaryAppliance(a.id, e.target.checked)} />
                  ${a.name}
                </label>
              `)}
            </div>
          ` : ''}
        </div>
      </ha-card>

      <div class="path-buttons">
        ${this._aiAgentId ? html`
          <ha-card class="path-card clickable" @click=${() => this._startAIRecipeCreation()}>
            <div class="card-content path-card-content">
              <div class="path-icon">🤖</div>
              <h3>${this._t('ai_recipe.create_ai_recipe')}</h3>
              <p>${this._t('ai_recipe.create_desc')}</p>
            </div>
          </ha-card>
        ` : html`
          <ha-card class="path-card clickable" @click=${() => this._showAISettings()}>
            <div class="card-content path-card-content">
              <div class="path-icon">⚙️</div>
              <h3>${this._t('ai_recipe.setup_ai_title')}</h3>
              <p>${this._t('ai_recipe.setup_ai_desc')}</p>
            </div>
          </ha-card>
        `}

        <ha-card class="path-card clickable" @click=${() => this._showRecentApplianceRecipes()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📋</div>
            <h3>${this._t('ai_recipe.recent_recipes_title')} - ${appliance?.name || ''}</h3>
            <p>${this._t('ai_recipe.recent_desc')}</p>
          </div>
        </ha-card>
      </div>
        `;
  }

  /**
   * Phase 5: Render Ninja Recipe Builder view
   * Displays the existing ninja_combi_recipe_builder interface
   */
  _renderNinjaRecipeBuilderView() {
    const bases = {
      'white_rice': { name: 'White Rice', icon: '🍚', water: '4 cups (9.6 dl)', time: 15 },
      'brown_rice': { name: 'Brown Rice', icon: '🍙', water: '4.5 cups (10.8 dl)', time: 18 },
      'rice_pilaf': { name: 'Rice Pilaf', icon: '🍚', water: '3 cups (7.2 dl)', time: 16 },
      'spanish_rice': { name: 'Spanish Rice', icon: '🍛', water: '4 cups (9.6 dl)', time: 15 },
      'wild_rice': { name: 'Wild Rice', icon: '🌾', water: '5 cups (12 dl)', time: 20 },
      'israeli_couscous': { name: 'Israeli Couscous', icon: '⚪', water: '3.5 cups (8.4 dl)', time: 12 },
      'quinoa': { name: 'Quinoa', icon: '🌿', water: '4 cups (9.6 dl)', time: 15 },
      'plain_pasta': { name: 'Plain Pasta', icon: '🍝', water: '5 cups (12 dl)', time: 12 },
      'marinara_pasta': { name: 'Marinara Pasta', icon: '🍝', water: '5 cups (12 dl) + 2 cups (4.8 dl) marinara', time: 14 },
      'alfredo_pasta': { name: 'Alfredo Pasta', icon: '🍝', water: '5 cups (12 dl) + 1.5 cups (3.6 dl) alfredo', time: 14 },
    };

    const proteins = {
      'chicken_breast': { name: 'Chicken Breast (Fresh)', icon: '🐔', temp: '390°F / 199°C', time: 18, probe: '74°C / 165°F' },
      'chicken_breast_frozen': { name: 'Chicken Breast (Frozen)', icon: '🧊🐔', temp: '390°F / 199°C', time: 24, probe: '74°C / 165°F' },
      'chicken_thighs': { name: 'Chicken Thighs', icon: '🍗', temp: '385°F / 196°C', time: 18, probe: '74°C / 165°F' },
      'chicken_drumsticks': { name: 'Chicken Drumsticks', icon: '🍗', temp: '385°F / 196°C', time: 20, probe: '74°C / 165°F' },
      'chicken_wings': { name: 'Chicken Wings', icon: '🍗', temp: '390°F / 199°C', time: 16, probe: '74°C / 165°F' },
      'beef_steak': { name: 'Beef Steak (Medium)', icon: '🥩', temp: '360°F / 182°C', time: 16, probe: '54-57°C / 130-135°F' },
      'beef_ground': { name: 'Ground Beef', icon: '🍖', temp: '375°F / 191°C', time: 14, probe: '71°C / 160°F' },
      'beef_meatballs': { name: 'Beef Meatballs', icon: '🧆', temp: '370°F / 188°C', time: 15, probe: '71°C / 160°F' },
      'beef_strips': { name: 'Beef Strips', icon: '🥩', temp: '380°F / 193°C', time: 12, probe: '63°C / 145°F' },
      'pork_chops': { name: 'Pork Chops', icon: '🥓', temp: '380°F / 193°C', time: 16, probe: '63°C / 145°F' },
      'pork_tenderloin': { name: 'Pork Tenderloin', icon: '🥓', temp: '375°F / 191°C', time: 18, probe: '63°C / 145°F' },
      'pork_sausage': { name: 'Pork Sausage', icon: '🌭', temp: '370°F / 188°C', time: 14, probe: '71°C / 160°F' },
      'salmon': { name: 'Salmon Fillet', icon: '🐟', temp: '360°F / 182°C', time: 14, probe: '54-60°C / 130-140°F' },
      'shrimp': { name: 'Shrimp', icon: '🦐', temp: '350°F / 177°C', time: 10, probe: '63°C / 145°F' },
      'tofu': { name: 'Tofu (Firm)', icon: '🧈', temp: '375°F / 191°C', time: 15, probe: 'N/A' },
      'tempeh': { name: 'Tempeh', icon: '🌱', temp: '375°F / 191°C', time: 14, probe: 'N/A' },
    };

    const veggies = [
      { name: 'Broccoli', icon: '🥦', type: 'crispy' },
      { name: 'Carrots', icon: '🥕', type: 'tender' },
      { name: 'Bell Peppers', icon: '🫑', type: 'crispy' },
      { name: 'Zucchini', icon: '🥒', type: 'tender' },
      { name: 'Asparagus', icon: '🎋', type: 'crispy' },
      { name: 'Green Beans', icon: '🫘', type: 'crispy' },
      { name: 'Brussels Sprouts', icon: '🥬', type: 'crispy' },
      { name: 'Cherry Tomatoes', icon: '🍅', type: 'tender' },
    ];

    const selectedBase = bases[this._builderBase];
    const selectedProtein = proteins[this._builderProtein];

    return html`
      <div class="status-banner idle">
        <h2>${this._t('ninja.builder_heading')}</h2>
        <p>${this._t('ninja.builder_desc')}</p>
        <div style="display: flex; gap: 8px; margin-top: 12px;">
          <button class="history-btn" @click=${() => { this._currentPath = 'ninja_combi'; this._resetBuilder(); }}>
            ${this._t('nav.back_to_ninja_combi')}
          </button>
          <button class="history-btn" @click=${() => { this._currentPath = 'ninja_built_in_recipes'; this.requestUpdate(); }}>
            ${this._t('ninja.all_recipes_btn')}
          </button>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.select_base')}</h3>
          <div class="button-group" style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px; margin-top: 8px;">
            ${Object.entries(bases).map(([key, base]) => html`
              <button 
                class="category-btn ${this._builderBase === key ? 'active' : ''}" 
                @click=${() => { this._builderBase = key; this.requestUpdate(); }}
                style="padding: 12px; text-align: left;">
                <div style="font-size: 20px; margin-bottom: 4px;">${base.icon}</div>
                <div style="font-size: 13px; font-weight: 500;">${base.name}</div>
                <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 2px;">
                  ${base.water} • ${base.time} min
                </div>
              </button>
            `)}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.select_protein_builder')}</h3>
          <div class="button-group" style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px; margin-top: 8px;">
            ${Object.entries(proteins).map(([key, protein]) => html`
              <button 
                class="category-btn ${this._builderProtein === key ? 'active' : ''}" 
                @click=${() => { this._builderProtein = key; this.requestUpdate(); }}
                style="padding: 12px; text-align: left;">
                <div style="font-size: 20px; margin-bottom: 4px;">${protein.icon}</div>
                <div style="font-size: 13px; font-weight: 500;">${protein.name}</div>
                <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 2px;">
                  ${protein.temp} • ${protein.time} min
                </div>
              </button>
            `)}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.add_vegetables')}</h3>
          <p style="font-size: 12px; color: var(--secondary-text-color); margin-bottom: 8px;">
            ${this._t('ninja.veggie_hint')}
          </p>
          <div class="button-group" style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px;">
            ${veggies.map(veggie => {
              const isSelected = this._builderVeggies.includes(veggie.name);
              return html`
                <button 
                  class="category-btn ${isSelected ? 'active' : ''}" 
                  @click=${() => this._toggleVeggie(veggie.name)}
                  style="padding: 12px; text-align: left;">
                  <div style="font-size: 20px; margin-bottom: 4px;">${veggie.icon}</div>
                  <div style="font-size: 13px; font-weight: 500;">${veggie.name}</div>
                  <div style="font-size: 11px; color: var(--secondary-text-color); margin-top: 2px;">
                    ${veggie.type === 'tender' ? this._t('ninja.with_base') : this._t('ninja.with_protein')}
                  </div>
                </button>
              `;
            })}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ninja.meater_probe_section')}</h3>
          <label style="display: flex; align-items: center; gap: 8px; cursor: pointer;">
            <input 
              type="checkbox" 
              .checked=${this._builderUseMeater}
              @change=${(e) => { this._builderUseMeater = e.target.checked; this.requestUpdate(); }}
              style="width: 18px; height: 18px; cursor: pointer;">
            <span style="font-size: 14px;">
              ${this._t('ninja.use_meater_probe')}
              ${this._builderUseMeater && selectedProtein ? html`
                <div style="font-size: 12px; color: var(--secondary-text-color); margin-top: 4px;">
                  Target: ${selectedProtein.probe}
                </div>
              ` : ''}
            </span>
          </label>
        </div>
      </ha-card>

      ${this._builderBase && this._builderProtein ? html`
        <ha-card>
          <div class="card-content">
            <h3>${this._t('ninja.calculated_params')}</h3>
            <div style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin: 12px 0;">
              <div>
                <strong>${this._t('ninja.temperature_label')}</strong><br>
                ${selectedProtein.temp}
              </div>
              <div>
                <strong>${this._t('ninja.cook_time_label')}</strong><br>
                ${selectedProtein.time} ${this._t('common.minutes')}
              </div>
              <div>
                <strong>${this._t('ninja.water_label')}</strong><br>
                ${selectedBase.water}
              </div>
              <div>
                <strong>${this._t('ninja.mode_label')}</strong><br>
                Combi-Meal
              </div>
            </div>
            ${this._builderUseMeater && selectedProtein.probe !== 'N/A' ? html`
              <div style="margin-top: 12px; padding: 12px; background: rgba(76, 175, 80, 0.1); border-left: 3px solid #4caf50; border-radius: 0 4px 4px 0;">
                <strong>${this._t('ninja.probe_target')}</strong> ${selectedProtein.probe}
              </div>
            ` : ''}
            <button 
              class="action-btn" 
              @click=${() => this._buildRecipe()}
              style="width: 100%; margin-top: 16px; padding: 14px; font-size: 15px; font-weight: 600;">
              ${this._t('ninja.build_recipe_btn')}
            </button>
          </div>
        </ha-card>
      ` : html`
        <ha-card>
          <div class="card-content">
            <p style="text-align: center; color: var(--secondary-text-color); padding: 20px 0;">
              ${this._t('ninja.select_base_protein_hint')}
            </p>
          </div>
        </ha-card>
      `}
    `;
  }

  _resetBuilder() {
    this._builderBase = null;
    this._builderProtein = null;
    this._builderVeggies = [];
    this._builderUseMeater = true;
  }

  _toggleVeggie(veggieName) {
    if (this._builderVeggies.includes(veggieName)) {
      this._builderVeggies = this._builderVeggies.filter(v => v !== veggieName);
    } else {
      this._builderVeggies = [...this._builderVeggies, veggieName];
    }
    this.requestUpdate();
  }

  _buildRecipe() {
    // Create a custom recipe from builder selections
    const bases = {
      'white_rice': { name: 'White Rice', water: '4 cups (9.6 dl)', time: 18, icon: '🍚' },
      'brown_rice': { name: 'Brown Rice', water: '4.5 cups (10.8 dl)', time: 22, icon: '🍚' },
      'rice_pilaf': { name: 'Rice Pilaf', water: '3.5 cups (8.4 dl)', time: 16, icon: '🍚' },
      'spanish_rice': { name: 'Spanish Rice', water: '3.5 cups (8.4 dl)', time: 18, icon: '🍚' },
      'wild_rice': { name: 'Wild Rice', water: '5 cups (12 dl)', time: 25, icon: '🍚' },
      'israeli_couscous': { name: 'Israeli Couscous', water: '3 cups (7.2 dl)', time: 12, icon: '🫘' },
      'quinoa': { name: 'Quinoa', water: '3.5 cups (8.4 dl)', time: 15, icon: '🌾' },
      'plain_pasta': { name: 'Plain Pasta', water: '5 cups (12 dl)', time: 14, icon: '🍝' },
      'marinara_pasta': { name: 'Marinara Pasta', water: '4.5 cups (10.8 dl)', time: 16, icon: '🍝' },
      'alfredo_pasta': { name: 'Alfredo Pasta', water: '4.5 cups (10.8 dl)', time: 16, icon: '🍝' },
    };

    const proteins = {
      'chicken_breast': { name: 'Chicken Breast (Fresh)', temp: '390°F (200°C)', time: 18, probe: '74°C (165°F)', icon: '🍗' },
      'chicken_breast_frozen': { name: 'Chicken Breast (Frozen)', temp: '375°F (190°C)', time: 22, probe: '74°C (165°F)', icon: '🍗' },
      'chicken_thighs': { name: 'Chicken Thighs', temp: '390°F (200°C)', time: 16, probe: '74°C (165°F)', icon: '🍗' },
      'chicken_drumsticks': { name: 'Chicken Drumsticks', temp: '390°F (200°C)', time: 20, probe: '74°C (165°F)', icon: '🍗' },
      'chicken_wings': { name: 'Chicken Wings', temp: '400°F (205°C)', time: 15, probe: 'N/A', icon: '🍗' },
      'beef_steak': { name: 'Beef Steak', temp: '400°F (205°C)', time: 12, probe: '54°C (130°F)', icon: '🥩' },
      'beef_ground': { name: 'Ground Beef', temp: '375°F (190°C)', time: 14, probe: '71°C (160°F)', icon: '🥩' },
      'beef_meatballs': { name: 'Beef Meatballs', temp: '375°F (190°C)', time: 16, probe: '71°C (160°F)', icon: '🥩' },
      'beef_strips': { name: 'Beef Strips', temp: '390°F (200°C)', time: 10, probe: 'N/A', icon: '🥩' },
      'pork_chops': { name: 'Pork Chops', temp: '390°F (200°C)', time: 14, probe: '63°C (145°F)', icon: '🥓' },
      'pork_tenderloin': { name: 'Pork Tenderloin', temp: '375°F (190°C)', time: 18, probe: '63°C (145°F)', icon: '🥓' },
      'pork_sausage': { name: 'Pork Sausage', temp: '390°F (200°C)', time: 14, probe: '71°C (160°F)', icon: '🥓' },
      'salmon': { name: 'Salmon Fillet', temp: '360°F (180°C)', time: 12, probe: '54°C (130°F)', icon: '🐟' },
      'shrimp': { name: 'Shrimp', temp: '390°F (200°C)', time: 8, probe: 'N/A', icon: '🍤' },
      'tofu': { name: 'Tofu (Firm)', temp: '390°F (200°C)', time: 14, probe: 'N/A', icon: '🧈' },
      'tempeh': { name: 'Tempeh', temp: '390°F (200°C)', time: 14, probe: 'N/A', icon: '🧈' },
    };

    const selectedBase = bases[this._builderBase];
    const selectedProtein = proteins[this._builderProtein];
    
    const baseName = selectedBase.name;
    const proteinName = selectedProtein.name;
    const veggiesText = this._builderVeggies.length > 0 ? ` with ${this._builderVeggies.join(', ')}` : '';
    const recipeName = `Custom ${proteinName} and ${baseName}${veggiesText}`;
    
    // Create a custom recipe object that can be displayed
    const customRecipe = {
      id: 9000, // Custom recipe ID
      name: recipeName,
      description: 'Custom recipe created with Recipe Builder',
      mode: 'Combi-Meal',
      prep_time_minutes: 10,
      cook_time_minutes: selectedProtein.time,
      servings: 4,
      difficulty: 'Easy',
      use_probe: this._builderUseMeater && selectedProtein.probe !== 'N/A',
      target_temp_c: this._builderUseMeater && selectedProtein.probe !== 'N/A' ? parseInt(selectedProtein.probe) : null,
      target_temp_f: this._builderUseMeater && selectedProtein.probe !== 'N/A' ? parseInt(selectedProtein.probe.match(/\((\d+)/)[1]) : null,
      ingredients: [
        `${baseName} - ${selectedBase.water} water`,
        `${proteinName}`,
        ...this._builderVeggies.map(v => `${v}`)
      ],
      instructions: [
        `Add ${baseName.toLowerCase()} to the bottom of the Ninja Combi`,
        `Add ${selectedBase.water} water or stock`,
        this._builderVeggies.filter(v => ['Carrots', 'Zucchini', 'Cherry Tomatoes'].includes(v)).length > 0 
          ? `Mix tender vegetables (${this._builderVeggies.filter(v => ['Carrots', 'Zucchini', 'Cherry Tomatoes'].includes(v)).join(', ')}) with the ${baseName.toLowerCase()}`
          : null,
        `Season ${proteinName.toLowerCase()} with your favorite seasonings`,
        `Place ${proteinName.toLowerCase()} on the Crisper Tray in the top position`,
        this._builderVeggies.filter(v => !['Carrots', 'Zucchini', 'Cherry Tomatoes'].includes(v)).length > 0
          ? `Add crispy vegetables (${this._builderVeggies.filter(v => !['Carrots', 'Zucchini', 'Cherry Tomatoes'].includes(v)).join(', ')}) to the Crisper Tray with the protein`
          : null,
        `Close lid and flip SmartSwitch to COMBI COOKER position`,
        `Select COMBI-MEAL mode`,
        `Set temperature to ${selectedProtein.temp}`,
        `Set time for ${selectedProtein.time} minutes`,
        this._builderUseMeater && selectedProtein.probe !== 'N/A'
          ? `Insert MEATER+ probe into thickest part of protein (target: ${selectedProtein.probe})`
          : null,
        `Press START`,
        `Enjoy your custom meal!`
      ].filter(Boolean), // Remove null instructions
      phases: [
        {
          description: 'Steam Phase',
          temperature_c: 100,
          temperature_f: 212,
          duration_minutes: Math.floor(selectedProtein.time * 0.4),
          steam_enabled: true
        },
        {
          description: 'Air Fry Phase',
          temperature_c: parseInt(selectedProtein.temp.match(/\((\d+)/)[1]),
          temperature_f: parseInt(selectedProtein.temp),
          duration_minutes: Math.ceil(selectedProtein.time * 0.6),
          steam_enabled: false
        }
      ],
      tips: [
        `This recipe serves ${4} people`,
        `Adjust servings using the input field above`,
        this._builderUseMeater ? `Use MEATER+ probe for precise temperature control` : null,
        `You can modify ingredients anytime by returning to the Recipe Builder`
      ].filter(Boolean),
      notes: []
    };
    
    // Navigate to recipe detail to show the custom recipe
    this._selectedNinjaRecipe = 9000;
    this._currentPath = 'ninja_recipe_detail';
    
    // Add to recipes list so it can be displayed
    if (!NINJA_COMBI_RECIPES.find(r => r.id === 9000)) {
      NINJA_COMBI_RECIPES.push(customRecipe);
    } else {
      const idx = NINJA_COMBI_RECIPES.findIndex(r => r.id === 9000);
      NINJA_COMBI_RECIPES[idx] = customRecipe;
    }
    
    this.requestUpdate();
  }

  /**
   * Phase 5: Render Ninja built-in recipes list
   * Displays pre-configured Ninja Combi recipes
   */
  _renderNinjaBuiltInRecipesView() {
    // Load recipes if not already loaded
    if (this._ninjaBuiltInRecipes.length === 0 && typeof NINJA_COMBI_RECIPES !== 'undefined') {
      this._ninjaBuiltInRecipes = NINJA_COMBI_RECIPES;
    }
    
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showNinjaRecipeList = false;
          this._ninjaBuiltInRecipes = [];
          this._currentPath = 'ninja_combi';
          this.requestUpdate();
        }}>
          ${this._t('nav.back_to_ninja_combi')}
        </button>
        <h2>${this._t('ninja.built_in_heading')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#61-built-in-recipes')} title="Open User Guide">?</button>
      </div>
      ${this._ninjaBuiltInRecipes.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p>${this._t('ninja.no_built_in')}</p>
          </div>
        </ha-card>
      ` : html`
        <div class="recipe-list">
          ${this._ninjaBuiltInRecipes.map(recipe => html`
            <ha-card class="recipe-card clickable" @click=${() => {
              this._selectedNinjaRecipe = recipe.id;
              this._currentPath = 'ninja_recipe_detail';
              this.requestUpdate();
            }}>
              <div class="card-content">
                <h3>${recipe.name}</h3>
                <p class="recipe-description">${recipe.description || ''}</p>
                <div class="recipe-meta">
                  <span>⏱️ ${recipe.cook_time_minutes ? recipe.cook_time_minutes + ' ' + this._t('common.minutes_short') : this._t('common.na')}</span>
                  <span>🍽️ ${this._t('ninja.serves')} ${recipe.servings || '4'}</span>
                </div>
              </div>
            </ha-card>
          `)}
        </div>
      `}
    `;
  }

  /**
   * Phase 5: Render recent Ninja Combi cooks (filtered history)
   */
  _renderRecentNinjaCooks() {
    // Filter history for Ninja Combi cooks
    const ninjaCooks = this._cookHistory.filter(cook => 
      cook.main_appliance === 'ninja_combi' || 
      (cook.appliance_type && cook.appliance_type.toLowerCase().includes('ninja'))
    );

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._currentPath = 'ninja_combi';
          this.requestUpdate();
        }}>
          ${this._t('nav.back_to_ninja_combi')}
        </button>
        <h2>${this._t('ninja.recent_ninja_heading')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#64-recent-ninja-cooks')} title="Open User Guide">?</button>
      </div>

      ${ninjaCooks.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p>${this._t('ninja.no_recent_ninja')}</p>
          </div>
        </ha-card>
      ` : html`
        <div class="history-list">
          ${ninjaCooks.map(cook => this._renderHistoryCard(cook))}
        </div>
      `}
    `;
  }

  /**
   * Phase 6: Render AI Recipe Builder flow
   * Complete AI recipe generation interface with ingredient and style selection
   */
  _renderAIRecipeBuilderFlow() {
    // Step 1: Ingredient Selection
    if (this._showAIIngredientSelector && !this._showAIStyleSelector) {
      return this._renderAIIngredientSelection();
    }

    // Step 2: Cooking Style Selection
    if (this._showAIStyleSelector && !this._showAIRecipeSuggestions) {
      return this._renderAICookingStyleSelection();
    }

    // Step 3: Recipe Suggestions
    if (this._showAIRecipeSuggestions) {
      return this._renderAIRecipeSuggestions();
    }

    // Default: Return to appliance path selection
    return this._renderAIRecipeBuilderPath();
  }

  /**
   * Phase 6: Render AI ingredient selection interface
   */
  _renderAIIngredientSelection() {
    // Data should already be loaded by _startAIRecipeCreation()
    // If not loaded, show loading state
    if (!this._commonIngredients || this._commonIngredients.length === 0) {
      return html`<div class="loading">${this._t('ai_recipe.loading_ingredients')}</div>`;
    }

    // Cuisine/region options for fusion cooking (moved from cooking style page)
    const cuisineRegions = [
      { id: 'nordic', name: this._t('cuisines.nordic'), icon: '❄️', cuisines: [
        { id: 'swedish', name: this._t('cuisines.swedish'), icon: '🇸🇪' },
        { id: 'danish', name: this._t('cuisines.danish'), icon: '🇩🇰' },
        { id: 'norwegian', name: this._t('cuisines.norwegian'), icon: '🇳🇴' },
        { id: 'finnish', name: this._t('cuisines.finnish'), icon: '🇫🇮' },
        { id: 'icelandic', name: this._t('cuisines.icelandic'), icon: '🇮🇸' },
        { id: 'new_nordic', name: this._t('cuisines.new_nordic'), icon: '🌿' },
      ]},
      { id: 'east_asian', name: this._t('cuisines.east_asian'), icon: '🥢', cuisines: [
        { id: 'japanese', name: this._t('cuisines.japanese'), icon: '🇯🇵' },
        { id: 'chinese', name: this._t('cuisines.chinese'), icon: '🇨🇳' },
        { id: 'korean', name: this._t('cuisines.korean'), icon: '🇰🇷' },
        { id: 'taiwanese', name: this._t('cuisines.taiwanese'), icon: '🇹🇼' },
      ]},
      { id: 'southeast_asian', name: this._t('cuisines.southeast_asian'), icon: '🌴', cuisines: [
        { id: 'thai', name: this._t('cuisines.thai'), icon: '🇹🇭' },
        { id: 'vietnamese', name: this._t('cuisines.vietnamese'), icon: '🇻🇳' },
        { id: 'indonesian', name: this._t('cuisines.indonesian'), icon: '🇮🇩' },
        { id: 'malaysian', name: this._t('cuisines.malaysian'), icon: '🇲🇾' },
        { id: 'filipino', name: this._t('cuisines.filipino'), icon: '🇵🇭' },
        { id: 'singaporean', name: this._t('cuisines.singaporean'), icon: '🇸🇬' },
      ]},
      { id: 'south_asian', name: this._t('cuisines.south_asian'), icon: '🍛', cuisines: [
        { id: 'indian', name: this._t('cuisines.indian'), icon: '🇮🇳' },
        { id: 'sri_lankan', name: this._t('cuisines.sri_lankan'), icon: '🇱🇰' },
        { id: 'pakistani', name: this._t('cuisines.pakistani'), icon: '🇵🇰' },
        { id: 'bangladeshi', name: this._t('cuisines.bangladeshi'), icon: '🇧🇩' },
        { id: 'nepali', name: this._t('cuisines.nepali'), icon: '🇳🇵' },
      ]},
      { id: 'middle_east', name: this._t('cuisines.middle_east'), icon: '🧆', cuisines: [
        { id: 'lebanese', name: this._t('cuisines.lebanese'), icon: '🇱🇧' },
        { id: 'turkish', name: this._t('cuisines.turkish'), icon: '🇹🇷' },
        { id: 'persian', name: this._t('cuisines.persian'), icon: '🇮🇷' },
        { id: 'israeli', name: this._t('cuisines.israeli'), icon: '🇮🇱' },
        { id: 'syrian', name: this._t('cuisines.syrian'), icon: '🇸🇾' },
        { id: 'iraqi', name: this._t('cuisines.iraqi'), icon: '🇮🇶' },
        { id: 'yemeni', name: this._t('cuisines.yemeni'), icon: '🇾🇪' },
        { id: 'emirati', name: this._t('cuisines.emirati'), icon: '🇦🇪' },
        { id: 'palestinian', name: this._t('cuisines.palestinian'), icon: '🇵🇸' },
      ]},
      { id: 'european', name: this._t('cuisines.european'), icon: '🏰', cuisines: [
        { id: 'italian', name: this._t('cuisines.italian'), icon: '🇮🇹' },
        { id: 'french', name: this._t('cuisines.french'), icon: '🇫🇷' },
        { id: 'spanish', name: this._t('cuisines.spanish'), icon: '🇪🇸' },
        { id: 'greek', name: this._t('cuisines.greek'), icon: '🇬🇷' },
        { id: 'portuguese', name: this._t('cuisines.portuguese'), icon: '🇵🇹' },
        { id: 'german', name: this._t('cuisines.german'), icon: '🇩🇪' },
        { id: 'british', name: this._t('cuisines.british'), icon: '🇬🇧' },
        { id: 'polish', name: this._t('cuisines.polish'), icon: '🇵🇱' },
        { id: 'hungarian', name: this._t('cuisines.hungarian'), icon: '🇭🇺' },
        { id: 'mediterranean', name: this._t('cuisines.mediterranean'), icon: '🫒' },
        { id: 'balkan', name: this._t('cuisines.balkan'), icon: '🏔️' },
        { id: 'russian', name: this._t('cuisines.russian'), icon: '🇷🇺' },
      ]},
      { id: 'north_american', name: this._t('cuisines.north_american'), icon: '🦅', cuisines: [
        { id: 'american', name: this._t('cuisines.american'), icon: '🇺🇸' },
        { id: 'cajun_creole', name: this._t('cuisines.cajun_creole'), icon: '🦞' },
        { id: 'tex_mex', name: this._t('cuisines.tex_mex'), icon: '🌮' },
        { id: 'canadian', name: this._t('cuisines.canadian'), icon: '🇨🇦' },
        { id: 'southern_us', name: this._t('cuisines.southern_us'), icon: '🍗' },
        { id: 'hawaiian', name: this._t('cuisines.hawaiian'), icon: '🌺' },
      ]},
      { id: 'latin_american', name: this._t('cuisines.latin_american'), icon: '💃', cuisines: [
        { id: 'mexican', name: this._t('cuisines.mexican'), icon: '🇲🇽' },
        { id: 'brazilian', name: this._t('cuisines.brazilian'), icon: '🇧🇷' },
        { id: 'peruvian', name: this._t('cuisines.peruvian'), icon: '🇵🇪' },
        { id: 'argentinian', name: this._t('cuisines.argentinian'), icon: '🇦🇷' },
        { id: 'colombian', name: this._t('cuisines.colombian'), icon: '🇨🇴' },
        { id: 'cuban', name: this._t('cuisines.cuban'), icon: '🇨🇺' },
        { id: 'venezuelan', name: this._t('cuisines.venezuelan'), icon: '🇻🇪' },
        { id: 'chilean', name: this._t('cuisines.chilean'), icon: '🇨🇱' },
      ]},
      { id: 'caribbean_region', name: this._t('cuisines.caribbean_region'), icon: '🏝️', cuisines: [
        { id: 'jamaican', name: this._t('cuisines.jamaican'), icon: '🇯🇲' },
        { id: 'trinidadian', name: this._t('cuisines.trinidadian'), icon: '🇹🇹' },
        { id: 'haitian', name: this._t('cuisines.haitian'), icon: '🇭🇹' },
        { id: 'puerto_rican', name: this._t('cuisines.puerto_rican'), icon: '🇵🇷' },
        { id: 'caribbean', name: this._t('cuisines.caribbean'), icon: '🏝️' },
      ]},
      { id: 'african', name: this._t('cuisines.african'), icon: '🌍', cuisines: [
        { id: 'ethiopian', name: this._t('cuisines.ethiopian'), icon: '🇪🇹' },
        { id: 'moroccan', name: this._t('cuisines.moroccan'), icon: '🇲🇦' },
        { id: 'nigerian', name: this._t('cuisines.nigerian'), icon: '🇳🇬' },
        { id: 'ghanaian', name: this._t('cuisines.ghanaian'), icon: '🇬🇭' },
        { id: 'senegalese', name: this._t('cuisines.senegalese'), icon: '🇸🇳' },
        { id: 'south_african', name: this._t('cuisines.south_african'), icon: '🇿🇦' },
        { id: 'kenyan', name: this._t('cuisines.kenyan'), icon: '🇰🇪' },
        { id: 'tanzanian', name: this._t('cuisines.tanzanian'), icon: '🇹🇿' },
        { id: 'tunisian', name: this._t('cuisines.tunisian'), icon: '🇹🇳' },
        { id: 'egyptian', name: this._t('cuisines.egyptian'), icon: '🇪🇬' },
        { id: 'east_african', name: this._t('cuisines.east_african'), icon: '🌄' },
        { id: 'west_african', name: this._t('cuisines.west_african'), icon: '🥘' },
      ]},
      { id: 'oceanian', name: this._t('cuisines.oceanian'), icon: '🦘', cuisines: [
        { id: 'australian', name: this._t('cuisines.australian'), icon: '🇦🇺' },
        { id: 'polynesian', name: this._t('cuisines.polynesian'), icon: '🌺' },
      ]},
    ];

    // Get cuisine-specific ingredients based on selection
    const displayIngredients = this._getCuisineIngredients(cuisineRegions);

    // _commonIngredients is a flat array of {id, name} objects (flattened from categorized API response)
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showAIIngredientSelector = false;
          this._selectedIngredients = [];
          this._aiSelectedCuisines = [];
          this._aiExpandedRegions = [];
          this._ingredientExpandedCats = [];
          this._ingredientProteinSubcat = null;
          this._currentPath = this._selectedMainAppliance === 'ninja_combi' ? 'ninja_combi' : 'ai_recipe_builder';
          this.requestUpdate();
        }}>
          ${this._t('nav.back')}
        </button>
        <h2>${this._t('ai_recipe.select_ingredients_title')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#72-selecting-ingredients')} title="Open User Guide">?</button>
      </div>
          <p class="info-text" style="margin-bottom: 12px;">${this._t('ai_recipe.cuisine_region_hint')}</p>
          ${(this._aiSelectedCuisines || []).length > 0 ? html`
            <div style="margin-bottom: 12px; display: flex; flex-wrap: wrap; gap: 6px;">
              ${(this._aiSelectedCuisines || []).map(c => {
                const name = c.replace(/_/g, ' ').replace(/\b\w/g, l => l.toUpperCase());
                return html`<span style="background: var(--primary-color); color: white; padding: 4px 10px; border-radius: 12px; font-size: 0.85em; display: inline-flex; align-items: center; gap: 4px;">
                  ${name}
                  <span style="cursor: pointer; margin-left: 2px;" @click=${() => {
                    this._aiSelectedCuisines = (this._aiSelectedCuisines || []).filter(x => x !== c);
                    this.requestUpdate();
                  }}>✕</span>
                </span>`;
              })}
            </div>
          ` : ''}
          ${cuisineRegions.map(region => {
            const isExpanded = (this._aiExpandedRegions || []).includes(region.id);
            const selectedInRegion = region.cuisines.filter(c => (this._aiSelectedCuisines || []).includes(c.id));
            return html`
              <div style="margin-bottom: 4px; border: 1px solid var(--divider-color); border-radius: 8px; overflow: hidden;">
                <div 
                  style="padding: 10px 14px; cursor: pointer; display: flex; align-items: center; justify-content: space-between; background: ${selectedInRegion.length > 0 ? 'var(--primary-color)' : 'var(--card-background-color)'}; color: ${selectedInRegion.length > 0 ? 'white' : 'inherit'};"
                  @click=${() => {
                    const expanded = [...(this._aiExpandedRegions || [])];
                    const idx = expanded.indexOf(region.id);
                    if (idx >= 0) { expanded.splice(idx, 1); } else { expanded.push(region.id); }
                    this._aiExpandedRegions = expanded;
                    this.requestUpdate();
                  }}
                >
                  <span style="font-weight: bold;">${region.icon} ${region.name} ${selectedInRegion.length > 0 ? `(${selectedInRegion.length})` : ''}</span>
                  <span>${isExpanded ? '▼' : '▶'}</span>
                </div>
                ${isExpanded ? html`
                  <div style="padding: 8px; display: flex; flex-wrap: wrap; gap: 6px;">
                    ${region.cuisines.map(cuisine => {
                      const isSelected = (this._aiSelectedCuisines || []).includes(cuisine.id);
                      return html`
                        <button
                          style="padding: 6px 12px; border-radius: 16px; border: 1px solid ${isSelected ? 'var(--primary-color)' : 'var(--divider-color)'}; background: ${isSelected ? 'var(--primary-color)' : 'var(--card-background-color)'}; color: ${isSelected ? 'white' : 'inherit'}; cursor: pointer; font-size: 0.9em; display: inline-flex; align-items: center; gap: 4px;"
                          @click=${() => {
                            const cuisines = [...(this._aiSelectedCuisines || [])];
                            const idx = cuisines.indexOf(cuisine.id);
                            if (idx >= 0) { cuisines.splice(idx, 1); } else { cuisines.push(cuisine.id); }
                            this._aiSelectedCuisines = cuisines;
                            this.requestUpdate();
                          }}
                        >
                          ${cuisine.icon} ${cuisine.name}
                        </button>
                      `;
                    })}
                  </div>
                ` : ''}
              </div>
            `;
          })}
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <p class="info-text">${this._t('ai_recipe.choose_ingredients_label')}</p>
          <p class="info-text" style="font-size: 0.85em; color: var(--secondary-text-color);">
            ${this._t('ai_recipe.staples_available')} ${(this._language === 'sv' && typeof AI_ASSUMED_STAPLES_SV !== 'undefined' ? AI_ASSUMED_STAPLES_SV : (typeof AI_ASSUMED_STAPLES !== 'undefined' ? AI_ASSUMED_STAPLES : [])).join(', ')}
          </p>

          ${this._renderShelfIngredientSuggestions()}
          
          ${this._renderCategorizedIngredients(displayIngredients)}

          <div class="ingredient-custom">
            <input 
              type="text" 
              placeholder="${this._t('ai_recipe.add_custom_placeholder')}" 
              @keypress=${(e) => {
                if (e.key === 'Enter' && e.target.value.trim()) {
                  this._addCustomIngredient(e.target.value.trim());
                  e.target.value = '';
                }
              }}
            />
          </div>

          <div class="selected-ingredients">
            <h4>${this._t('ai_recipe.selected_ingredients_label')} (${this._selectedIngredients.length}):</h4>
            <p style="margin: 0 0 8px 0; font-size: 0.8em; color: var(--secondary-text-color);">${this._t('ai_recipe.selected_ingredients_hint')}</p>
            <div class="ingredient-tags">
              ${this._selectedIngredients.map(ing => html`
                <span
                  class="ingredient-tag ${ing.compulsory ? 'ingredient-tag--compulsory' : ''}"
                  title="${this._t('ai_recipe.compulsory_toggle_hint')}"
                  @click=${(e) => {
                    // Only toggle if click was NOT on the × button (use .closest to handle child nodes)
                    if (!e.target.closest('.ingredient-remove-btn')) {
                      this._toggleIngredientCompulsory(ing.name);
                    }
                  }}
                  style="cursor:pointer;"
                >
                  ${ing.compulsory ? html`<span class="compulsory-star">⭐</span>` : ''}
                  ${this._lookupIngDisplayName(ing.name)}
                  <button
                    class="ingredient-remove-btn"
                    @click=${(e) => { e.stopPropagation(); this._removeIngredient(ing.name); }}
                  >×</button>
                </span>
              `)}
            </div>
          </div>

          ${this._shelfEnabled ? html`
            <div style="margin-top: 16px; padding: 12px; background: var(--secondary-background-color); border-radius: 8px;">
              <h4 style="margin: 0 0 8px 0;">${this._t('cooking_mode.selector_title')}</h4>
              <p style="margin: 0 0 10px 0; font-size: 0.85em; color: var(--secondary-text-color);">${this._t('cooking_mode.selector_hint')}</p>
              ${['A','B','C'].map(mode => html`
                <label style="display: flex; align-items: flex-start; gap: 10px; margin-bottom: 8px; cursor: pointer;">
                  <input
                    type="radio"
                    name="cooking_mode"
                    .value=${mode}
                    ?checked=${this._cookingMode === mode}
                    @change=${() => this._saveCookingMode(mode)}
                    style="margin-top: 3px; flex-shrink: 0;"
                  />
                  <div>
                    <div style="font-weight: 600; font-size: 0.9em;">${this._t('cooking_mode.mode_' + mode.toLowerCase() + '_label')}</div>
                    <div style="font-size: 0.8em; color: var(--secondary-text-color);">${this._t('cooking_mode.mode_' + mode.toLowerCase() + '_desc')}</div>
                  </div>
                </label>
              `)}
            </div>
          ` : ''}

          <button 
            class="primary-btn"
            ?disabled=${this._selectedIngredients.length < 2}
            @click=${() => this._proceedToCookingStyle()}
          >
            ${this._t('ai_recipe.next_cooking_style')}
          </button>
        </div>
      </ha-card>
    `;
  }

  /**
   * Get ingredients based on selected cuisines.
   * Falls back: individual cuisine -> parent region -> default common ingredients.
   * For fusion (multiple cuisines), merges ingredient lists and deduplicates.
   */
  _getCuisineIngredients(cuisineRegions) {
    const selectedCuisines = this._aiSelectedCuisines || [];
    if (selectedCuisines.length === 0) {
      return this._commonIngredients || [];
    }

    const cuisineData = (typeof AI_CUISINE_INGREDIENTS !== 'undefined') ? AI_CUISINE_INGREDIENTS : {};
    const regionMap = (typeof AI_CUISINE_TO_REGION !== 'undefined') ? AI_CUISINE_TO_REGION : {};

    // Collect ingredients from all selected cuisines
    const seenIds = new Set();
    const merged = [];

    for (const cuisineId of selectedCuisines) {
      // Try individual cuisine first, then fall back to region
      let ingredients = cuisineData[cuisineId];
      if (!ingredients) {
        const regionId = regionMap[cuisineId];
        if (regionId) {
          ingredients = cuisineData[regionId];
        }
      }
      if (ingredients && Array.isArray(ingredients)) {
        for (const ing of ingredients) {
          if (!seenIds.has(ing.id)) {
            seenIds.add(ing.id);
            merged.push(ing);
          }
        }
      }
    }

    return merged.length > 0 ? merged : (this._commonIngredients || []);
  }

  /**
   * Render ingredients grouped by category with alphabetic sorting within each group.
   *
   * Features:
   * - Groups by category using AI_CATEGORY_ORDER
   * - Each category has a compact "base" set (common:true) shown by default
   * - A "More (N)" button reveals the full extended set
   * - The Proteins category (cat="p") shows a subcategory drill-down:
   *   tapping a protein group (Beef / Pork / Fish / …) reveals cuts from
   *   AI_PROTEIN_SUBCATS sourced from the recipe files
   * - Falls back to a flat alphabetical grid when no cat info is present
   */
  _renderCategorizedIngredients(ingredients) {
    const categoryLabels = (this._language === 'sv' && typeof AI_CATEGORY_LABELS_SV !== 'undefined')
      ? AI_CATEGORY_LABELS_SV
      : (typeof AI_CATEGORY_LABELS !== 'undefined' ? AI_CATEGORY_LABELS : {});
    const categoryOrder = (typeof AI_CATEGORY_ORDER !== 'undefined') ? AI_CATEGORY_ORDER : [];

    // Check if ingredients have category info
    const hasCats = ingredients.length > 0 && ingredients[0].cat;
    if (!hasCats || categoryOrder.length === 0) {
      // Fall back to flat grid sorted alphabetically by display name
      const sorted = [...ingredients].sort((a, b) => (this._ingDisplayName(a) || '').localeCompare(this._ingDisplayName(b) || ''));
      return html`
        <div class="ingredient-grid">
          ${sorted.map(ingredient => this._renderIngredientCheckbox(ingredient))}
        </div>
      `;
    }

    // Group by category
    const groups = {};
    for (const ing of ingredients) {
      const cat = ing.cat || 's';
      if (!groups[cat]) groups[cat] = [];
      groups[cat].push(ing);
    }

    // Sort each group alphabetically by display name
    for (const cat of Object.keys(groups)) {
      groups[cat].sort((a, b) => (this._ingDisplayName(a) || '').localeCompare(this._ingDisplayName(b) || ''));
    }

    const expandedCats = this._ingredientExpandedCats || [];

    return html`
      ${categoryOrder.filter(cat => groups[cat] && groups[cat].length > 0).map(cat => {
        const allItems = groups[cat];
        // Items with common===true are shown by default; items with common===false are in
        // the extended set shown after "More".  Items with no common field at all get a
        // threshold fallback: first 12 visible, rest behind "More".
        let baseItems = allItems.filter(i => i.common !== false);
        let extItems  = allItems.filter(i => i.common === false);
        if (extItems.length === 0 && baseItems.length > 12) {
          extItems  = baseItems.slice(12);
          baseItems = baseItems.slice(0, 12);
        }
        const isExpanded = expandedCats.includes(cat);
        const visibleItems = isExpanded ? allItems : baseItems;

        // Proteins (cat="p") get a drill-down subcategory selector
        if (cat === 'p') {
          return this._renderProteinCategory(visibleItems, extItems, isExpanded, categoryLabels[cat]);
        }

        return html`
          <div class="ingredient-category">
            <h4 style="margin: 12px 0 6px 0; font-size: 0.95em; color: var(--secondary-text-color);">${categoryLabels[cat] || cat}</h4>
            <div class="ingredient-grid">
              ${visibleItems.map(ingredient => this._renderIngredientCheckbox(ingredient))}
            </div>
            ${extItems.length > 0 ? html`
              <button
                style="margin-top: 6px; padding: 4px 12px; border-radius: 14px; border: 1px solid var(--divider-color); background: transparent; cursor: pointer; font-size: 0.82em; color: var(--secondary-text-color);"
                @click=${() => {
                  const next = isExpanded
                    ? expandedCats.filter(c => c !== cat)
                    : [...expandedCats, cat];
                  this._ingredientExpandedCats = next;
                  this.requestUpdate();
                }}
              >
                ${isExpanded
                  ? this._t('ai_recipe.show_less') || 'Show less'
                  : `${this._t('ai_recipe.more_ingredients') || 'More'} (+${extItems.length})`}
              </button>
            ` : ''}
          </div>
        `;
      })}
    `;
  }

  /**
   * Render the Proteins category with an optional subcategory drill-down.
   * When a subcat (e.g. "beef") is selected, shows specific cuts from AI_PROTEIN_SUBCATS
   * sourced from the recipe files.
   */
  _renderProteinCategory(visibleItems, extItems, isExpanded, categoryLabel) {
    const proteinSubcats = (typeof AI_PROTEIN_SUBCATS !== 'undefined') ? AI_PROTEIN_SUBCATS : {};
    const subcat = this._ingredientProteinSubcat;
    const expandedCats = this._ingredientExpandedCats || [];
    const cat = 'p';
    const subcatLabels = (this._language === 'sv' && typeof AI_PROTEIN_SUBCAT_LABELS_SV !== 'undefined')
      ? AI_PROTEIN_SUBCAT_LABELS_SV
      : (typeof AI_PROTEIN_SUBCAT_LABELS !== 'undefined' ? AI_PROTEIN_SUBCAT_LABELS : {});

    // Category icons for protein sub-groups
    const subcatIcons = {
      beef: '🐄', pork: '🐷', poultry: '🍗', fish: '🐟', lamb: '🐑', game: '🦌',
    };

    return html`
      <div class="ingredient-category">
        <h4 style="margin: 12px 0 6px 0; font-size: 0.95em; color: var(--secondary-text-color);">${categoryLabel || '🥩 Proteins'}</h4>

        ${Object.keys(proteinSubcats).length > 0 ? html`
          <!-- Protein sub-category selector pills -->
          <div style="display: flex; flex-wrap: wrap; gap: 5px; margin-bottom: 8px;">
            ${Object.keys(proteinSubcats).map(sc => html`
              <button
                style="padding: 4px 10px; border-radius: 14px; border: 1px solid ${subcat === sc ? 'var(--primary-color)' : 'var(--divider-color)'}; background: ${subcat === sc ? 'var(--primary-color)' : 'transparent'}; color: ${subcat === sc ? 'white' : 'inherit'}; cursor: pointer; font-size: 0.82em;"
                @click=${() => {
                  this._ingredientProteinSubcat = (subcat === sc) ? null : sc;
                  this.requestUpdate();
                }}
              >${subcatIcons[sc] || '🥩'} ${subcatLabels[sc] || sc}</button>
            `)}
          </div>
        ` : ''}

        ${subcat && proteinSubcats[subcat] ? html`
          <!-- Drill-down: cuts from recipe files for selected sub-category -->
          <div style="padding: 8px; background: var(--secondary-background-color); border-radius: 8px; margin-bottom: 8px;">
            <div style="font-size: 0.82em; color: var(--secondary-text-color); margin-bottom: 6px;">
              ${subcatIcons[subcat] || '🥩'} ${subcatLabels[subcat] || subcat}
              <span style="margin-left: 6px; opacity: 0.7;">(${this._t('ai_recipe.from_recipe_files') || 'from recipe library'})</span>
            </div>
            <div style="display: flex; flex-wrap: wrap; gap: 5px;">
              ${proteinSubcats[subcat].map(cut => {
                const displayName = (this._language === 'sv' && cut.name_sv) ? cut.name_sv : cut.name;
                return html`
                  <button
                    style="padding: 4px 10px; border-radius: 14px; border: 1px solid var(--primary-color); background: transparent; cursor: pointer; font-size: 0.82em; color: var(--primary-text-color);"
                    @click=${() => {
                      this._addCustomIngredient(cut.name);
                      this._ingredientProteinSubcat = null;
                      this.requestUpdate();
                    }}
                  >${displayName}</button>
                `;
              })}
            </div>
          </div>
        ` : html`
          <!-- Default protein list (non-drill-down) -->
          <div class="ingredient-grid">
            ${visibleItems.map(ingredient => this._renderIngredientCheckbox(ingredient))}
          </div>
          ${extItems.length > 0 ? html`
            <button
              style="margin-top: 6px; padding: 4px 12px; border-radius: 14px; border: 1px solid var(--divider-color); background: transparent; cursor: pointer; font-size: 0.82em; color: var(--secondary-text-color);"
              @click=${() => {
                const next = isExpanded
                  ? expandedCats.filter(c => c !== cat)
                  : [...expandedCats, cat];
                this._ingredientExpandedCats = next;
                this.requestUpdate();
              }}
            >
              ${isExpanded
                ? this._t('ai_recipe.show_less') || 'Show less'
                : `${this._t('ai_recipe.more_ingredients') || 'More'} (+${extItems.length})`}
            </button>
          ` : ''}
        `}
      </div>
    `;
  }

  /** Return the display name for an ingredient respecting the active language. */
  _ingDisplayName(ingredient) {
    if (!ingredient || typeof ingredient === 'string') return ingredient || '';
    if (this._language === 'sv') {
      // Check AI_INGREDIENT_NAMES_SV lookup table first
      if (ingredient.id && typeof AI_INGREDIENT_NAMES_SV !== 'undefined') {
        const sv = AI_INGREDIENT_NAMES_SV[ingredient.id];
        if (sv) return sv;
      }
      // Fall back to inline name_sv (e.g. on recipe-file-derived cuts from AI_PROTEIN_SUBCATS)
      if (ingredient.name_sv) return ingredient.name_sv;
    }
    return ingredient.name || '';
  }

  /**
   * Return the translated display name for a chip ingredient stored by English name.
   * Searches AI_INGREDIENTS (dict), AI_COMMON_INGREDIENTS (flat array), and
   * AI_PROTEIN_SUBCATS (cuts from recipe files).  Falls back to the raw name
   * for custom (non-predefined) ingredients.
   */
  _lookupIngDisplayName(name) {
    if (!name) return '';
    const lc = name.toLowerCase();

    // Search categorised dict (AI_INGREDIENTS)
    const ingredients = this._aiIngredients || (typeof AI_INGREDIENTS !== 'undefined' ? AI_INGREDIENTS : {});
    for (const category of Object.values(ingredients)) {
      if (!Array.isArray(category)) continue;
      const found = category.find(i => i && i.name && i.name.toLowerCase() === lc);
      if (found) return this._ingDisplayName(found);
    }

    // Search flat common list (AI_COMMON_INGREDIENTS)
    const commonFlat = typeof AI_COMMON_INGREDIENTS !== 'undefined' ? AI_COMMON_INGREDIENTS : [];
    const foundCommon = commonFlat.find(i => i && i.name && i.name.toLowerCase() === lc);
    if (foundCommon) return this._ingDisplayName(foundCommon);

    // Search protein subcats (recipe-file-derived cuts)
    const proteinSubcats = typeof AI_PROTEIN_SUBCATS !== 'undefined' ? AI_PROTEIN_SUBCATS : {};
    for (const cuts of Object.values(proteinSubcats)) {
      if (!Array.isArray(cuts)) continue;
      const found = cuts.find(i => i && i.name && i.name.toLowerCase() === lc);
      if (found) return this._ingDisplayName(found);
    }

    return name;
  }

  /**
   * Render shelf items as ingredient suggestions when the shelf is enabled.
   * Items are grouped by shelf location and shown as tappable chips above the
   * main ingredient grid.  Tapping a shelf chip adds it as a selected ingredient.
   *
   * Relevant when at least one cuisine is selected AND shelf has items in it,
   * OR when shelf has items and no cuisine is selected (always show).
   */
  _renderShelfIngredientSuggestions() {
    if (!this._shelfEnabled) return '';
    const inventory = this._shelfInventory || [];
    if (inventory.length === 0) return '';

    // Filter out items that are already selected
    const selectedNames = new Set(
      (this._selectedIngredients || [])
        .filter(i => i && i.name)
        .map(i => i.name.toLowerCase())
    );
    const unselected = inventory.filter(item => !selectedNames.has((item.name || '').toLowerCase()));
    if (unselected.length === 0) return '';

    // Location → icon mapping
    const locationIcon = { fridge: '🧊', larder: '🏺', freezer: '❄️', spices: '🌿' };

    return html`
      <div style="margin-bottom: 12px; padding: 10px 12px; background: var(--secondary-background-color); border-radius: 8px; border-left: 3px solid var(--primary-color);">
        <div style="font-size: 0.85em; font-weight: 600; margin-bottom: 6px; color: var(--primary-text-color);">
          🗄️ ${this._t('ai_recipe.from_shelf') || 'From Your Shelf'}
        </div>
        <div style="display: flex; flex-wrap: wrap; gap: 5px;">
          ${unselected.map(item => {
            const icon = locationIcon[item.location] || '🗄️';
            return html`
              <button
                style="padding: 4px 10px; border-radius: 14px; border: 1px solid var(--primary-color); background: transparent; cursor: pointer; font-size: 0.82em; color: var(--primary-text-color); display: inline-flex; align-items: center; gap: 3px;"
                @click=${() => {
                  this._addCustomIngredient(item.name);
                }}
              >${icon} ${item.name}${item.quantity ? html` <span style="opacity:0.65;font-size:0.85em;">(${item.quantity})</span>` : ''}</button>
            `;
          })}
        </div>
      </div>
    `;
  }


  _renderIngredientCheckbox(ingredient) {
    const displayName = this._ingDisplayName(ingredient);
    const valueName = (typeof ingredient === 'string') ? ingredient : (ingredient.name || ingredient);
    return html`
      <label class="ingredient-checkbox">
        <input 
          type="checkbox" 
          ?checked=${!!this._selectedIngredients.find(i => i.name && i.name.toLowerCase() === valueName.toLowerCase())}
          @change=${(e) => this._toggleIngredient(valueName, e.target.checked)}
        />
        ${displayName}
      </label>
    `;
  }

  /**
   * Format a max-time value (minutes) for display.
   * 0 → 'No limit'; multiples of 60 → 'Xh'; remainder → 'Xh Ymin' or 'Ymin'.
   */
  _formatMaxTime(minutes) {
    if (!minutes || minutes <= 0) return this._t('ai_recipe.no_limit');
    const h = Math.floor(minutes / 60);
    const m = minutes % 60;
    if (h === 0) return `${m} min`;
    return m ? `${h}h ${m}min` : `${h}h`;
  }

  /**
   * Phase 6: Render cooking style selection
   */
  _renderAICookingStyleSelection() {
    // Data should already be loaded by _startAIRecipeCreation()
    // If not loaded, show loading state
    if (!this._cookingStyles) {
      return html`<div class="loading">${this._t('ai_recipe.loading_styles')}</div>`;
    }

    // Complexity labels
    const complexityLabels = [this._t('ai_recipe.very_simple'), this._t('ai_recipe.simple'), this._t('ai_recipe.medium'), this._t('ai_recipe.complex_level'), this._t('ai_recipe.chef_level')];

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showAIStyleSelector = false;
          this._showAIIngredientSelector = true;
          this.requestUpdate();
        }}>
          ← ${this._t('nav.back_to_ingredients')}
        </button>
        <h2>${this._t('ai_recipe.choose_style_title')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#73-choosing-a-cooking-style')} title="Open User Guide">?</button>
      </div>
          
          <div class="style-grid">
            ${(this._cookingStyles || []).map(style => html`
              <ha-card 
                class="style-card ${this._selectedCookingStyle === style.id ? 'selected' : ''} clickable"
                @click=${() => {
                  this._selectedCookingStyle = style.id;
                  // Set default complexity based on style
                  if (['quick_and_easy', 'one_pot', 'family_friendly'].includes(style.id)) {
                    this._aiComplexity = 2;
                  } else if (['gourmet', 'baking'].includes(style.id)) {
                    this._aiComplexity = 4;
                  } else {
                    this._aiComplexity = 3;
                  }
                  // Set default max time based on style (0 = no limit)
                  const defaultTimes = {
                    quick_and_easy:  30,
                    comfort_food:    60,
                    family_friendly: 45,
                    healthy:         30,
                    gourmet:          0,  // no limit — elaborate dishes can take as long as needed
                    meal_prep:       120,
                    one_pot:          60,
                    slow_cook:         0,  // no limit — slow cookers run for hours
                    barbeque:          0,  // no limit — BBQ sessions vary widely
                    baking:           90,
                    low_carb:         30,
                    high_protein:     45,
                    vegetarian:       45,
                    vegan:            45,
                  };
                  this._aiMaxTime = defaultTimes[style.id] !== undefined ? defaultTimes[style.id] : 0;
                  this.requestUpdate();
                }}
              >
                <div class="card-content">
                  <div class="style-icon">${style.icon || '🍳'}</div>
                  <h3>${(this._language === 'sv' && style.name_sv) ? style.name_sv : style.name}</h3>
                  <p>${style.description || ''}</p>
                </div>
              </ha-card>
            `)}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>${this._t('ai_recipe.settings_heading')}</h3>

          <div style="margin-bottom: 16px;">
            <label style="display: block; font-weight: bold; margin-bottom: 8px;">
              ${this._t('ai_recipe.complexity_label')} ${complexityLabels[this._aiComplexity - 1] || this._t('ai_recipe.medium')}
            </label>
            <input type="range" min="1" max="5" step="1"
              .value=${String(this._aiComplexity)}
              @input=${(e) => { this._aiComplexity = parseInt(e.target.value); this.requestUpdate(); }}
              style="width: 100%;"
            />
            <div style="display: flex; justify-content: space-between; font-size: 0.8em; color: var(--secondary-text-color);">
              <span>${this._t('ai_recipe.simple')}</span><span>${this._t('ai_recipe.chef_level')}</span>
            </div>
          </div>

          <div style="margin-bottom: 16px;">
            <label style="display: block; font-weight: bold; margin-bottom: 8px;">
              ${this._t('ai_recipe.portions_label')} ${this._aiPortions}
            </label>
            <input type="range" min="1" max="8" step="1"
              .value=${String(this._aiPortions)}
              @input=${(e) => { this._aiPortions = parseInt(e.target.value); this.requestUpdate(); }}
              style="width: 100%;"
            />
            <div style="display: flex; justify-content: space-between; font-size: 0.8em; color: var(--secondary-text-color);">
              <span>1</span><span>2</span><span>3</span><span>4</span><span>5</span><span>6</span><span>7</span><span>8</span>
            </div>
          </div>

          <div style="margin-bottom: 16px;">
            <label style="display: block; font-weight: bold; margin-bottom: 8px;">
              ${this._t('ai_recipe.max_time_label')} ${this._formatMaxTime(this._aiMaxTime)}
            </label>
            <input type="range" min="0" max="240" step="15"
              .value=${String(this._aiMaxTime)}
              @input=${(e) => { this._aiMaxTime = parseInt(e.target.value); this.requestUpdate(); }}
              style="width: 100%;"
            />
            <div style="display: flex; justify-content: space-between; font-size: 0.8em; color: var(--secondary-text-color);">
              <span>${this._t('ai_recipe.no_limit')}</span><span>1h</span><span>2h</span><span>3h</span><span>4h</span>
            </div>
          </div>
        </div>
      </ha-card>

      <div style="padding: 16px;">
        <button 
          class="primary-btn"
          ?disabled=${!this._selectedCookingStyle}
          @click=${() => this._generateAIRecipes()}
        >
          ${this._t('ai_recipe.generate_btn')}
        </button>
      </div>
    `;
  }

  /**
   * Phase 6: Render AI recipe suggestions
   */
  _renderAIRecipeSuggestions() {
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showAIRecipeSuggestions = false;
          this._aiRecipeSuggestions = [];
          if (this._meaterAiFromShortcut) {
            // Came from MEATER cut shortcut — go back to MEATER path
            this._meaterAiFromShortcut = false;
            this._currentPath = 'meater_experimental';
          } else {
            this._showAIStyleSelector = true;
          }
          this.requestUpdate();
        }}>
          ← ${this._meaterAiFromShortcut ? this._t('nav.back_to_cut_selection') : this._t('nav.back_to_cooking_style')}
        </button>
        <h2>${this._t('ai_recipe.suggestions_title')}</h2>
      </div>

      ${this._aiRecipeSuggestions.length === 0 ? html`
        <ha-card>
          <div class="card-content loading-state ai-generation-loading">
            <ha-circular-progress active></ha-circular-progress>
            <p class="ai-status-primary">${this._aiGenerationStatus || this._t('ai_recipe.connecting')}</p>
            ${this._aiGenerationElapsed > 0 ? html`
              <p class="ai-status-elapsed">${this._aiGenerationElapsed}s elapsed</p>
            ` : ''}
            ${this._aiGenerationStatus && (this._aiGenerationStatus.includes('overloaded') || this._aiGenerationStatus.includes('Retrying') || this._aiGenerationStatus.includes('waiting')) ? html`
              <p class="ai-status-hint">${this._t('ai_recipe.ai_busy_hint')}</p>
            ` : ''}
            ${this._aiGenerationStatus && this._aiGenerationStatus.includes('backup') ? html`
              <p class="ai-status-hint">${this._t('ai_recipe.switching_backup')}</p>
            ` : ''}
          </div>
        </ha-card>
      ` : html`
        <div class="recipe-suggestions">
          ${this._aiRecipeSuggestions.map(recipe => {
            // Decode HTML entities in recipe name (AI may return &amp; instead of &)
            const displayName = recipe.name ? (() => { const t = document.createElement('textarea'); t.innerHTML = recipe.name; return t.value; })() : '';
            return html`
            <ha-card class="recipe-suggestion-card">
              <div class="card-content">
                <div style="display: flex; justify-content: space-between; align-items: flex-start; gap: 8px;">
                  <h3 style="margin: 0; flex: 1;">${displayName}</h3>
                  ${recipe.recipe_origin === 'known' ? html`
                    <span style="background: #2e7d32; color: white; padding: 2px 8px; border-radius: 10px; font-size: 0.75em; white-space: nowrap; flex-shrink: 0;">${this._t('ai_recipe.classic_badge')}</span>
                  ` : html`
                    <span style="background: #1565c0; color: white; padding: 2px 8px; border-radius: 10px; font-size: 0.75em; white-space: nowrap; flex-shrink: 0;">${this._t('ai_recipe.original_badge')}</span>
                  `}
                </div>
                <p class="recipe-description">${recipe.description || ''}</p>
                
                <div class="recipe-details">
                  <div class="detail-item">
                    <strong>${this._t('ai_recipe.cook_time_label')}</strong> ${recipe.cook_time_minutes ? recipe.cook_time_minutes + ' ' + this._t('common.minutes_short') : this._t('common.na')}
                  </div>
                  <div class="detail-item">
                    <strong>${this._t('ai_recipe.servings_label')}</strong>
                    <input
                      type="number"
                      min="1"
                      max="12"
                      .value=${recipe._adjustedServings || recipe.servings || this._aiPortions || 4}
                      @input=${(e) => this._updateRecipeServings(recipe, parseInt(e.target.value))}
                      style="width:50px;padding:4px;border:1px solid var(--divider-color);border-radius:4px;background:var(--primary-background-color);color:var(--primary-text-color);">
                  </div>
                  <div class="detail-item">
                    <strong>${this._t('ai_recipe.difficulty_label')}</strong> ${recipe.difficulty || this._t('common.na')}
                  </div>
                </div>

                <div class="recipe-ingredients">
                  <h4>${this._t('ai_recipe.key_ingredients')}</h4>
                  <ul>
                    ${(recipe.main_ingredients || recipe.ingredients || []).map(ing => html`<li>${ing}</li>`)}
                  </ul>
                </div>

                <button 
                  class="primary-btn"
                  @click=${() => this._startCookingFromAIRecipe(recipe)}
                >
                  ${this._t('ai_recipe.start_cooking_recipe')}
                </button>
              </div>
            </ha-card>
          `; })}
        </div>

        <div class="action-buttons">
          <button 
            class="secondary-btn"
            @click=${() => this._generateAIRecipes()}
          >
            ${this._t('ai_recipe.generate_different')}
          </button>
        </div>
      `}
    `;
  }

  /**
   * Phase 6: Render recent recipes for selected appliance (filtered history)
   */
  _renderRecentApplianceRecipes() {
    const applianceId = this._selectedAppliance?.id;
    
    // Filter history for current appliance
    const applianceCooks = this._cookHistory.filter(cook => 
      cook.main_appliance === applianceId || 
      cook.appliance_id === applianceId
    );

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._currentPath = 'ai_recipe_builder';
          this.requestUpdate();
        }}>
          ${this._t('nav.back_to_ai_builder')}
        </button>
        <h2>📋 ${this._t('ai_recipe.recent_recipes_title')} - ${this._selectedAppliance?.name || ''}</h2>
      </div>

      ${applianceCooks.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p>${this._t('ai_recipe.no_history_appliance')}</p>
          </div>
        </ha-card>
      ` : html`
        <div class="history-list">
          ${applianceCooks.map(cook => this._renderHistoryCard(cook))}
        </div>
      `}
    `;
  }

  /**
   * Render a single cook history card for recipe cooks (used in ninja and appliance history lists).
   * Clicking the card opens the detail view; a Restart button re-launches the cook.
   */
  _renderHistoryCard(cook) {
    const displayName = cook.recipe_name || cook.cut_display || cook.cut || this._t('history.cook_details_title');
    const isSaved = cook.comment === SAVED_NOT_YET_COOKED;
    return html`
      <ha-card class="history-card clickable" @click=${() => {
        this._selectedCookForDetail = cook;
        this.requestUpdate();
      }}>
        <div class="card-content">
          <div class="history-header">
            <h3>${displayName}</h3>
            <div style="display:flex;align-items:center;gap:8px;flex-shrink:0;">
              ${isSaved ? html`
                <span style="background:var(--primary-color);color:var(--text-primary-color);padding:2px 8px;border-radius:10px;font-size:0.75em;white-space:nowrap;">
                  ${this._t('history.saved_badge')}
                </span>
              ` : ''}
              <span class="history-date">${this._formatDateTime(cook.completed_at)}</span>
            </div>
          </div>
          <div class="history-details">
            ${cook.appliance_name ? html`<span class="history-detail">🍳 ${cook.appliance_name}</span>` : ''}
            ${cook.serving_size ? html`<span class="history-detail">🍽️ ${cook.serving_size} ${this._t('history.serving_size_label')}</span>` : ''}
            ${cook.duration_seconds ? html`<span class="history-detail">⏱️ ${this._formatDuration(cook.duration_seconds)}</span>` : ''}
            ${cook.ease_rating ? html`<span class="history-detail">👨‍🍳 ${'⭐'.repeat(cook.ease_rating)}</span>` : ''}
          </div>
          ${cook.notes ? html`
            <div class="history-notes">
              <strong>📝</strong> ${cook.notes}
            </div>
          ` : ''}
          <div class="history-actions" @click=${(e) => e.stopPropagation()}>
            <button class="small-btn" @click=${() => this._restartCook(cook)}>
              ${this._t('history.restart_cook')}
            </button>
          </div>
        </div>
      </ha-card>
    `;
  }

  /**
   * Render Previous Cooks path (uses existing _renderHistory)
   */
  _renderPreviousCooksPath() {
    // Phase 3: Show detail view if a cook is selected
    if (this._selectedCookForDetail) {
      return this._renderCookDetailView(this._selectedCookForDetail);
    }

    const toggleBtnBase = 'padding:6px 12px;border-radius:16px;border:1px solid var(--divider-color);cursor:pointer;font-size:0.82em;';
    const activeToggle  = toggleBtnBase + 'background:var(--primary-color);color:var(--text-primary-color);font-weight:600;';
    const inactiveToggle = toggleBtnBase + 'background:transparent;color:var(--secondary-text-color);';
    
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => this._navigateToWelcome()}>
          ${this._t('nav.back_to_appliances')}
        </button>
        <h2>${this._t('history.previous_cooks_title')}</h2>
        <button class="help-btn" @click=${() => this._openHelp('#11-cooked-and-saved-recipes')} title="Open User Guide">?</button>
      </div>

      <!-- Filter toggles -->
      <div style="display:flex;gap:8px;flex-wrap:wrap;margin-bottom:12px;padding:0 4px;">
        <button
          style="${this._hideSaved ? activeToggle : inactiveToggle}"
          @click=${() => { this._hideSaved = !this._hideSaved; this.requestUpdate(); }}>
          ${this._t('history.filter_hide_saved')}
        </button>
        <button
          style="${this._hideCooked ? activeToggle : inactiveToggle}"
          @click=${() => { this._hideCooked = !this._hideCooked; this.requestUpdate(); }}>
          ${this._t('history.filter_hide_cooked')}
        </button>
      </div>

      ${this._renderHistory()}
    `;
  }

  /**
   * Phase 3: Render detailed view of a single cook
   */
  _renderCookDetailView(cook) {
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._selectedCookForDetail = null;
          this.requestUpdate();
        }}>
          ${this._t('nav.back_to_list')}
        </button>
        <h2>${cook.cut_display || cook.cut || cook.recipe_name || this._t('history.cook_details_title')}</h2>
      </div>

      <ha-card>
        <div class="card-content cook-detail">
          <div class="detail-header">
            <h3>${cook.cut_display || cook.cut || cook.recipe_name}</h3>
            <p class="detail-meta">
              ${cook.appliance_name || this._t('history.unknown_appliance')} • 
              ${this._formatDateTime(cook.completed_at)}
            </p>
          </div>

          ${cook.duration ? html`
            <div class="detail-section">
              <strong>${this._t('history.duration_label')}</strong> ${this._formatDuration(cook.duration)}
            </div>
          ` : ''}

          ${cook.protein ? html`
            <div class="detail-section">
              <strong>${this._t('history.protein_label')}</strong> ${cook.protein}
              ${cook.doneness ? html` • <strong>${this._t('history.doneness_colon')}</strong> ${(cook.doneness || '').replace('_', ' ')}` : ''}
            </div>
          ` : ''}

          ${cook.serving_size ? html`
            <div class="detail-section">
              <strong>${this._t('history.serving_size_label')}</strong> ${cook.serving_size}
            </div>
          ` : ''}

          ${cook.target_temp_c || cook.peak_temp_c || cook.final_temp ? html`
            <div class="detail-section">
              <strong>${this._t('history.temp_data_label')}</strong>
              <div class="temp-data">
                ${cook.target_temp_c ? html`<p>${this._t('history.target_label')} ${cook.target_temp_c}°C</p>` : ''}
                ${cook.peak_temp_c ? html`<p>${this._t('history.peak_label')} ${Math.round(cook.peak_temp_c)}°C</p>` : ''}
                ${cook.final_temp_after_rest ? html`<p>${this._t('history.after_rest_label')} ${Math.round(cook.final_temp_after_rest)}°C</p>` : 
                  cook.final_temp ? html`<p>${this._t('history.final_label')} ${cook.final_temp}°C</p>` : ''}
              </div>
            </div>
          ` : ''}

          ${cook.cooking_method ? html`
            <div class="detail-section">
              <strong>${this._t('history.cooking_method_label')}</strong> ${(cook.cooking_method || '').replace(/_/g, ' ')}
            </div>
          ` : ''}

          ${cook.ingredients && cook.ingredients.length > 0 ? html`
            <div class="detail-section">
              <strong>${this._t('history.ingredients_label')}</strong>
              <ul class="ingredients-list">
                ${cook.ingredients.map(ing => html`<li>${ing}</li>`)}
              </ul>
            </div>
          ` : ''}

          ${cook.timeline && cook.timeline.length > 0 ? html`
            <div class="detail-section">
              <strong>${this._t('history.timeline_label')}</strong>
              <div class="timeline">
                ${cook.timeline.map(event => html`
                  <div class="timeline-event">
                    <span class="timeline-time">${this._formatDateTime(event.timestamp)}</span>
                    <span class="timeline-desc">${event.description}</span>
                  </div>
                `)}
              </div>
            </div>
          ` : ''}

          ${cook.ease_rating || cook.result_rating ? html`
            <div class="detail-section">
              <strong>${this._t('history.ratings_label')}</strong>
              ${cook.ease_rating ? html`
                <p>${this._t('history.ease_label')} ${'⭐'.repeat(cook.ease_rating)}${'☆'.repeat(5 - cook.ease_rating)}</p>
              ` : ''}
              ${cook.result_rating ? html`
                <p>${this._t('history.result_label')} ${'⭐'.repeat(cook.result_rating)}${'☆'.repeat(5 - cook.result_rating)}</p>
              ` : ''}
            </div>
          ` : ''}

          ${cook.notes ? html`
            <div class="detail-section">
              <strong>${this._t('history.notes_label')}</strong>
              <p class="cook-notes">${cook.notes}</p>
            </div>
          ` : ''}

          <div class="detail-actions">
            <button class="primary-btn" @click=${() => this._restartCook(cook)}>
              ${this._t('history.restart_cook')}
            </button>
            <button class="small-btn" @click=${() => {
              const notes = prompt(this._t('history.update_notes_prompt'), cook.notes || '');
              if (notes !== null) {
                this._updateCookNotes(cook.id, notes);
                // Update the displayed cook
                cook.notes = notes;
                this.requestUpdate();
              }
            }}>${this._t('history.edit_notes')}</button>
          </div>
        </div>
      </ha-card>
    `;
  }

  /**
   * Helper to format duration in minutes
   */
  _formatDuration(minutes) {
    if (!minutes) return 'N/A';
    if (minutes < 60) return `${Math.round(minutes)} min`;
    const hours = Math.floor(minutes / 60);
    const mins = Math.round(minutes % 60);
    return `${hours}h ${mins}min`;
  }

  // ============================================================================
  // PHASE 4: RECIPE COOK FLOW METHODS
  // ============================================================================

  /**
   * Format elapsed time from seconds to HH:MM:SS or MM:SS
   */
  _formatElapsedTime(seconds) {
    if (!seconds || seconds < 0) return '00:00';
    
    const hours = Math.floor(seconds / 3600);
    const minutes = Math.floor((seconds % 3600) / 60);
    const secs = Math.floor(seconds % 60);
    
    const pad = (num) => String(num).padStart(2, '0');
    
    if (hours > 0) {
      return `${pad(hours)}:${pad(minutes)}:${pad(secs)}`;
    }
    return `${pad(minutes)}:${pad(secs)}`;
  }

  /**
   * Restart a cook from history
   */
  _restartCook(cook) {
    // If it's a recipe cook, restart the recipe
    if (cook.recipe_name && cook.recipe) {
      this._startRecipeCook(cook.recipe, cook.serving_size || 4);
      return;
    }

    // If it has a recipe in recipe_data field (alternative storage)
    if (cook.recipe_data) {
      this._startRecipeCook(cook.recipe_data, cook.serving_size || 4);
      return;
    }

    // If it's a MEATER probe cook with cut_id and doneness, restart with same parameters
    if (cook.cut_id && cook.doneness && cook.cooking_method) {
      // Find a MEATER entity to use
      const entities = this._findCookingEntities();
      const meaterEntity = entities.find(e => e.toLowerCase().includes('meater')) || entities[0];
      if (!meaterEntity) {
        this._showMessage(this._t('common.error'), this._t('messages.no_meater_entity'), true);
        return;
      }

      // Set entity and call start_cook service directly with stored parameters
      this._selectedEntity = meaterEntity;
      const serviceData = {
        cut_id: String(cook.cut_id),
        doneness: cook.doneness,
        cooking_method: cook.cooking_method,
        data_source: cook.data_source || this._dataSource,
      };
      if (cook.custom_target_temp_c) {
        serviceData.custom_target_temp_c = cook.custom_target_temp_c;
      }
      this._callService('start_cook', serviceData)
        .catch(err => {
          console.error('Failed to restart cook:', err);
          this._waitingForCookStart = null;
          this._waitingCookServiceData = null;
          this._currentPath = 'welcome';
          this.requestUpdate();
          this._showMessage(this._t('common.error'), this._t('messages.restart_cook_failed'), true);
        });

      // Navigate to the active cook view so the user sees their cook.
      // The service call is async, so the entity may still be 'idle' briefly.
      // _renderContent's active_cook handler shows a "Starting…" state while waiting.
      this._selectedCookForDetail = null;
      this._currentPath = 'active_cook';
      this._waitingForCookStart = Date.now(); // Flag for brief loading state
      this._waitingCookServiceData = serviceData; // Store so dropdown can re-fire on entity switch
      this.requestUpdate();
      return;
    }

    // Legacy fallback: if cook has target_temp but no cut_id, navigate to meater setup
    if (cook.target_temp_c && cook.protein) {
      this._currentPath = 'meater_experimental';
      this._showMeaterCooking = true;
      this.requestUpdate();
      return;
    }

    // Fallback: show message that this cook type can't be restarted
    this._showMessage(this._t('common.error'), this._t('messages.restart_not_supported'), true);
  }

  /**
   * Start a recipe cook session. Supports multiple parallel cooks.
   */
  _startRecipeCook(recipe, servingSize = null) {
    // Create cook state with unique ID
    // If launched via MEATER AI shortcut, guarantee use_probe + target temp are set
    // so "Start MEATER Probe" always appears. Use the AI's temp if present, fall back
    // to the temp saved from the MEATER doneness selection.
    if (this._meaterAiFromShortcut && this._meaterAiTargetTempC) {
      recipe.use_probe = true;
      if (!recipe.target_temp_c) {
        recipe.target_temp_c = this._meaterAiTargetTempC;
        recipe.target_temp_f = this._meaterAiTargetTempF;
      }
    }

    const cookState = {
      id: 'cook_' + Date.now() + '_' + Math.random().toString(36).slice(2, 6),
      recipe: recipe,
      startTime: Date.now(),
      currentStep: -1, // -1 = overview page, 0+ = step index
      servingSize: servingSize || recipe.servings || 4,
      easeRating: null,
      resultRating: null,
      notes: '',
      meaterSubprocess: null // Will store subprocess info if MEATER is started
    };

    // Add to active cooks array
    this._activeRecipeCooks.push(cookState);

    // Set as the currently viewed cook (same object reference)
    this._recipeCookState = cookState;

    // Start timer for elapsed display
    if (this._recipeCookTimer) clearInterval(this._recipeCookTimer);
    this._recipeCookTimer = setInterval(() => {
      this.requestUpdate();
    }, 1000);

    // Persist to sessionStorage + server (cross-device visibility)
    this._persistActiveRecipeCooks();

    this.requestUpdate();
  }

  /**
   * Stop the currently viewed recipe cook and clean up.
   * Removes it from the active cooks array.
   */
  _stopRecipeCook() {
    // Remove from array
    if (this._recipeCookState) {
      const cookId = this._recipeCookState.id;
      this._activeRecipeCooks = this._activeRecipeCooks.filter(c => c.id !== cookId);
    }

    // Clear pointer and timer
    this._recipeCookState = null;
    if (this._recipeCookTimer) {
      clearInterval(this._recipeCookTimer);
      this._recipeCookTimer = null;
    }

    // Persist the updated array
    this._persistActiveRecipeCooks();
    
    // Navigate back to welcome
    this._navigateToWelcome();
  }

  /**
   * Adopt a specific recipe cook from the server (started on another device).
   * Adds it to the local array and shows it.
   */
  _adoptServerRecipeCook(cook) {
    if (!cook || !cook.recipe || !cook.startTime) return;

    // Ensure it has an ID
    const adopted = { ...cook, id: cook.id || ('cook_' + Date.now() + '_' + Math.random().toString(36).slice(2, 6)) };

    // Add to local array
    this._activeRecipeCooks.push(adopted);

    // View it
    this._recipeCookState = adopted;
    if (this._recipeCookTimer) clearInterval(this._recipeCookTimer);
    this._recipeCookTimer = setInterval(() => this.requestUpdate(), 1000);

    // Persist
    this._persistActiveRecipeCooks();
    this.requestUpdate();
  }

  /**
   * Minimize the current recipe cook: go to welcome while cook keeps running.
   * All active cooks remain in the array and show in the badge.
   */
  _minimizeRecipeCook() {
    this._recipeCookState = null;
    if (this._recipeCookTimer) {
      clearInterval(this._recipeCookTimer);
      this._recipeCookTimer = null;
    }
    this._currentPath = 'welcome';
    this.requestUpdate();
  }

  /**
   * View (maximize) a specific recipe cook from the active cooks array.
   */
  _viewRecipeCook(cookId) {
    const cook = this._activeRecipeCooks.find(c => c.id === cookId);
    if (!cook) return;

    this._recipeCookState = cook; // Same object reference — mutations update the array
    if (this._recipeCookTimer) clearInterval(this._recipeCookTimer);
    this._recipeCookTimer = setInterval(() => this.requestUpdate(), 1000);
    this.requestUpdate();
  }

  /**
   * Persist ALL active recipe cooks to sessionStorage + server.
   * sessionStorage survives HA sidebar navigation (component re-creation).
   * Server sync enables cross-device visibility.
   */
  _persistActiveRecipeCooks() {
    try {
      const json = JSON.stringify(this._activeRecipeCooks);
      sessionStorage.setItem('kce_active_recipe_cooks', json);
      // Also save to server for cross-device visibility (fire-and-forget)
      if (this.hass) {
        this.hass.callApi('POST', 'kitchen_cooking_engine/active_recipe_cook',
          { cooks: this._activeRecipeCooks }
        ).catch(e => {
          console.warn('KCE: failed to sync recipe cooks to server:', e);
        });
      }
    } catch (e) {
      // sessionStorage might be unavailable (private browsing, quota exceeded)
    }
  }

  /**
   * Restore active recipe cooks from sessionStorage.
   * Called in the constructor to recover state after component re-creation.
   * Cooks start minimized — the user sees them in the badge on the welcome screen.
   */
  _restoreActiveRecipeCooks() {
    try {
      const saved = sessionStorage.getItem('kce_active_recipe_cooks');
      if (saved) {
        const arr = JSON.parse(saved);
        if (Array.isArray(arr)) {
          this._activeRecipeCooks = arr.filter(c => c && c.recipe && c.startTime);
        }
      }
    } catch (e) {
      // Corrupted or unavailable - ignore
    }
    // Don't set _recipeCookState — start minimized, show badges on welcome screen
  }

  /**
   * Load active recipe cooks from server (for cross-device visibility).
   * Called during connectedCallback / visibility change.
   */
  async _loadServerActiveRecipeCooks() {
    if (!this.hass) return;
    try {
      const resp = await this.hass.callApi('GET', 'kitchen_cooking_engine/active_recipe_cook');
      const cooks = resp?.cooks || (resp?.state ? [resp.state] : null);
      this._serverActiveRecipeCooks = Array.isArray(cooks) ? cooks.filter(c => c && c.recipe && c.startTime) : null;
      this.requestUpdate();
    } catch (e) {
      // Server might not have the endpoint yet (old version)
      this._serverActiveRecipeCooks = null;
    }
  }

  /**
   * Advance to next recipe step
   */
  _nextRecipeStep() {
    if (!this._recipeCookState) return;

    const recipe = this._recipeCookState.recipe;
    const steps = this._getRecipeSteps(recipe);
    
    // If no steps at all, go from overview (-1) to finish (0)
    // so the user can still rate the cook after following the overview
    if (steps.length === 0) {
      if (this._recipeCookState.currentStep < 0) {
        this._recipeCookState.currentStep = 0; // finish page since steps.length is 0
      }
      this._persistActiveRecipeCooks();
      this.requestUpdate();
      return;
    }
    
    const maxStep = steps.length - 1;
    
    // If we're on the last step, go to finish page
    if (this._recipeCookState.currentStep >= maxStep) {
      this._recipeCookState.currentStep = maxStep + 1; // Finish page
    } else {
      this._recipeCookState.currentStep++;
    }
    
    this._persistActiveRecipeCooks();
    this.requestUpdate();
  }

  /**
   * Go back to previous recipe step
   */
  _previousRecipeStep() {
    if (!this._recipeCookState) return;

    if (this._recipeCookState.currentStep > 0) {
      // Go to previous step
      this._recipeCookState.currentStep--;
    } else if (this._recipeCookState.currentStep === 0) {
      // From first step, go back to overview
      this._recipeCookState.currentStep = -1;
    } else {
      // At overview page — exit the cook flow.
      // If the user came from AI recipe suggestions, go back there instead of welcome.
      if (this._showAIRecipeSuggestions) {
        // Remove from active cooks array and clean up, but don't navigate to welcome.
        if (this._recipeCookState) {
          const cookId = this._recipeCookState.id;
          this._activeRecipeCooks = this._activeRecipeCooks.filter(c => c.id !== cookId);
        }
        this._recipeCookState = null;
        if (this._recipeCookTimer) {
          clearInterval(this._recipeCookTimer);
          this._recipeCookTimer = null;
        }
        this._persistActiveRecipeCooks();
        // Stay in ai_recipe_builder flow — suggestions are still in _aiRecipeSuggestions
        this.requestUpdate();
        return;
      }
      this._stopRecipeCook();
      return; // _stopRecipeCook already clears persisted state
    }
    
    this._persistActiveRecipeCooks();
    this.requestUpdate();
  }

  /**
   * Save completed recipe cook
   */
  async _saveRecipeCook() {
    if (!this._recipeCookState) return;

    const state = this._recipeCookState;
    const recipe = state.recipe;
    const elapsedSeconds = Math.floor((Date.now() - state.startTime) / 1000);

    try {
      // Save recipe cook via REST API (not a service - recipe cooks are saved to cook history)
      await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/save_cook', {
        recipe_id: recipe.id || recipe.name,
        recipe_name: recipe.name,
        serving_size: state.servingSize,
        duration_seconds: elapsedSeconds,
        ease_rating: state.easeRating,
        result_rating: state.resultRating,
        notes: state.notes,
        ingredients: recipe.ingredients || [],
        appliance_id: this._selectedAppliance?.id || null,
        recipe_data: {
          id: recipe.id || recipe.name,
          name: recipe.name,
          description: recipe.description || '',
          instructions: recipe.instructions || [],
          ingredients: recipe.ingredients || [],
          cook_time_minutes: recipe.cook_time_minutes || 0,
          servings: recipe.servings || state.servingSize || 4,
          tips: recipe.tips || [],
          difficulty: recipe.difficulty || 'Medium'
        }
      });

      // Phase 8d: Show shelf update prompt if shelf is enabled
      if (this._shelfEnabled && recipe.ingredients && recipe.ingredients.length > 0) {
        const staples = (typeof AI_ASSUMED_STAPLES !== 'undefined') ? AI_ASSUMED_STAPLES.map(s => s.toLowerCase()) : [];
        const checkboxes = recipe.ingredients.map(ing => {
          const ingLower = ing.toLowerCase().replace(/[^a-z0-9\s]/g, '').trim();
          const isStaple = staples.some(s => {
            // Exact word match to avoid false positives like 'oat' matching 'toast'
            const pattern = new RegExp(`\\b${s.replace(/[.*+?^${}()|[\]\\]/g, '\\$&')}\\b`);
            return pattern.test(ingLower);
          });
          return { name: ing, checked: !isStaple };
        });
        this._pendingShelfUpdate = { checkboxes };
        this._stopRecipeCook();
        this.requestUpdate();
        return;
      }

      // Show success message
      this._showMessage('✅ ' + this._t('messages.recipe_cook_saved_title'), this._t('messages.recipe_cook_saved') + ' 🎉');

      // Stop the cook flow
      this._stopRecipeCook();

    } catch (error) {
      console.error('Error saving recipe cook:', error);
      this._showMessage('❌ ' + this._t('messages.recipe_cook_save_error_title'), `${this._t('messages.recipe_cook_save_error')} ${error.message}`, true);
    }
  }

  /**
   * Save the current recipe for future use without cooking it.
   * Stores to history with comment "Saved, not yet cooked" and no ratings.
   * Then exits the recipe cook flow.
   */
  async _saveRecipeForLater() {
    if (!this._recipeCookState) return;

    const state = this._recipeCookState;
    const recipe = state.recipe;

    // Decode HTML entities in name
    const displayName = recipe.name ? (() => { const t = document.createElement('textarea'); t.innerHTML = recipe.name; return t.value; })() : '';

    try {
      await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/save_cook', {
        recipe_id: recipe.id || recipe.name,
        recipe_name: displayName || recipe.name,
        serving_size: state.servingSize,
        duration_seconds: 0,
        ease_rating: 0,
        result_rating: 0,
        notes: '',
        comment: SAVED_NOT_YET_COOKED,
        ingredients: recipe.ingredients || recipe.main_ingredients || [],
        appliance_id: this._selectedAppliance?.id || null,
        recipe_data: {
          id: recipe.id || recipe.name,
          name: recipe.name,
          description: recipe.description || '',
          instructions: recipe.instructions || [],
          ingredients: recipe.ingredients || recipe.main_ingredients || [],
          cook_time_minutes: recipe.cook_time_minutes || 0,
          servings: recipe.servings || state.servingSize || 4,
          tips: recipe.tips || [],
          difficulty: recipe.difficulty || 'Medium'
        }
      });

      this._showMessage('✅ ' + this._t('messages.recipe_saved_for_later_title'), this._t('messages.recipe_saved_for_later'));
      this._stopRecipeCook();

    } catch (error) {
      console.error('Error saving recipe for later:', error);
      this._showMessage('❌ ' + this._t('messages.recipe_cook_save_error_title'), `${this._t('messages.recipe_cook_save_error')} ${error.message}`, true);
    }
  }

  /**
   * Phase 6: Toggle ingredient selection
   */
  _toggleIngredient(ingredient, enabled) {
    if (enabled) {
      if (!this._selectedIngredients.find(i => i.name && i.name.toLowerCase() === ingredient.toLowerCase())) {
        this._selectedIngredients = [...this._selectedIngredients, { name: ingredient, compulsory: false }];
      }
    } else {
      this._selectedIngredients = this._selectedIngredients.filter(i => !i.name || i.name.toLowerCase() !== ingredient.toLowerCase());
    }
    this.requestUpdate();
  }

  /**
   * Phase 6: Add custom ingredient
   */
  _addCustomIngredient(ingredient) {
    if (ingredient && !this._selectedIngredients.find(i => i.name && i.name.toLowerCase() === ingredient.toLowerCase())) {
      this._selectedIngredients = [...this._selectedIngredients, { name: ingredient, compulsory: false }];
      this.requestUpdate();
    }
  }

  /**
   * Phase 6: Remove ingredient from selection
   */
  _removeIngredient(ingredient) {
    this._selectedIngredients = this._selectedIngredients.filter(i => !i.name || i.name.toLowerCase() !== ingredient.toLowerCase());
    this.requestUpdate();
  }

  /**
   * Phase 8a: Toggle compulsory flag on an ingredient
   */
  _toggleIngredientCompulsory(name) {
    this._selectedIngredients = this._selectedIngredients.map(i =>
      i.name === name ? { ...i, compulsory: !i.compulsory } : i
    );
    this.requestUpdate();
  }

  /**
   * Phase 6: Proceed to cooking style selection
   */
  _proceedToCookingStyle() {
    if (this._selectedIngredients.length < 2) {
      this._showMessage('⚠️ ' + this._t('messages.ingredients_min_title'), this._t('messages.ingredients_min_2'), true);
      return;
    }
    
    this._showAIIngredientSelector = false;
    this._showAIStyleSelector = true;
    this.requestUpdate();
  }

  /**
   * Start polling the backend status endpoint once per second.
   *
   * ``GET /api/kitchen_cooking_engine/ai_recipes/status`` returns the exact
   * message that the backend wrote at its most recent real step — no guessing.
   * Steps emitted by the backend include:
   *   "🤖 Sending request to AI agent (attempt 1/7)..."
   *   "⚠️ AI overloaded — waiting 3s before retry (attempt 1/7 failed)..."
   *   "🔄 Retrying AI agent (attempt 2/7)..."
   *   "⚠️ Primary agent exhausted — switching to backup AI agent..."
   *   "🤖 Trying backup AI agent (attempt 1/7)..."
   *   "✅ Response received — parsing recipes..."
   */
  _startAIStatusPolling() {
    this._stopAIStatusPolling();
    this._aiGenerationElapsed = 0;
    this._aiGenerationStatus = this._t('ai_recipe.connecting');
    const startTime = Date.now();
    this._aiGenerationTimer = setInterval(async () => {
      this._aiGenerationElapsed = Math.floor((Date.now() - startTime) / 1000);
      try {
        const res = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/status');
        if (res && res.message) {
          this._aiGenerationStatus = res.message;
        }
      } catch (err) {
        // Log unexpected errors (e.g. auth failure, endpoint missing) to aid
        // debugging, but don't crash — the display keeps the last known status.
        if (err && err.status_code && err.status_code !== 503 && err.status_code !== 429) {
          console.warn('[AI Status] Polling error:', err);
        }
      }
      this.requestUpdate();
    }, 1000);
  }

  /** Stop the status polling interval. */
  _stopAIStatusPolling() {
    if (this._aiGenerationTimer) {
      clearInterval(this._aiGenerationTimer);
      this._aiGenerationTimer = null;
    }
  }

  // Keep old name as alias so nothing else breaks if called elsewhere.
  _startAIStatusUpdater() { this._startAIStatusPolling(); }
  _stopAIStatusUpdater()  { this._stopAIStatusPolling();  }

  /**
   * Navigate from the MEATER cut/method selection directly to the AI suggestions
   * stage, pre-seeded with the selected cut, cooking method, and optional weight.
   *
   * Two "ingredients" are submitted so the existing ≥2 validation passes:
   *  1. The cut name (+ weight if given) — marked compulsory.
   *  2. The cooking method name — gives the AI useful context, not compulsory.
   */
  async _goToAISuggestionsForCut() {
    const cut = this._getCuts().find(c => c.id === this._selectedCut);
    if (!cut) {
      this._showMessage('⚠️ ' + this._t('messages.incomplete_title'), this._t('messages.incomplete_selection'), true);
      return;
    }

    const cutName = (this._language === 'sv' && cut.name_sv) ? cut.name_sv : (cut.name_long || cut.name);
    const weight  = (this._meaterAiWeight || '').trim();
    const cutLabel = weight ? `${cutName} (${weight})` : cutName;

    // Translate method or fall back to slug-as-words
    const rawMethodTranslation = this._t('cooking_methods.' + (this._selectedMethod || ''));
    const methodLabel = (rawMethodTranslation && !rawMethodTranslation.startsWith('cooking_methods.'))
      ? rawMethodTranslation
      : (this._selectedMethod || '').split('_').map(w => w.charAt(0).toUpperCase() + w.slice(1)).join(' ');

    const cookingStyle = MEATER_METHOD_TO_AI_STYLE[this._selectedMethod] || 'comfort_food';

    // Capture target temperature from MEATER doneness selection so we can inject
    // use_probe into the recipe if the AI omits it.
    const donenessTemps = this._selectedDoneness ? this._getTargetTempForDoneness(this._selectedDoneness) : null;
    this._meaterAiTargetTempC = donenessTemps ? donenessTemps.c : null;
    this._meaterAiTargetTempF = donenessTemps ? donenessTemps.f : null;

    // Pre-seed AI state
    this._selectedIngredients = [
      { name: cutLabel, compulsory: true },
      { name: methodLabel, compulsory: false },
    ];
    this._selectedCookingStyle = cookingStyle;
    this._showAIIngredientSelector = false;
    this._showAIStyleSelector = false;
    this._showAIRecipeSuggestions = true;
    this._aiRecipeSuggestions = [];
    this._meaterAiFromShortcut = true;

    // Navigate to AI builder path (keeps _selectedAppliance set from MEATER path)
    this._currentPath = 'ai_recipe_builder';
    this.requestUpdate();

    // Trigger generation
    await this._generateAIRecipes();
  }

  /**
   * Phase 6: Generate AI recipes based on selections
   */
  async _generateAIRecipes() {
    if (!this._selectedCookingStyle || this._selectedIngredients.length < 2) {
      this._showMessage('⚠️ ' + this._t('messages.incomplete_title'), this._t('messages.incomplete_selection'), true);
      return;
    }

    this._showAIStyleSelector = false;
    this._showAIRecipeSuggestions = true;
    this._aiRecipeSuggestions = []; // Clear previous suggestions
    this._startAIStatusPolling();
    this.requestUpdate();

    try {
      // Get appliance IDs (main + selected secondaries)
      const applianceIds = [this._selectedAppliance.id, ...this._selectedSecondaryAppliances];

      // Phase 8a: extract ingredient names + compulsory list
      const ingredientNames = this._selectedIngredients.map(i => i.name);
      const compulsoryIngredients = this._selectedIngredients.filter(i => i.compulsory).map(i => i.name);

      // Build request with new parameters
      const requestBody = {
        ingredients: ingredientNames,
        cooking_style: this._selectedCookingStyle,
        appliance_ids: applianceIds,
        main_appliance_id: this._selectedAppliance.id,
        servings: this._aiPortions || 4,
        complexity: this._aiComplexity || 3,
        language: this._language || 'en',
        measurement_system: this._measurementSystem || 'us',
        compulsory_ingredients: compulsoryIngredients,
        cooking_mode: this._cookingMode || 'A',
      };

      // Phase 8c: If shelf enabled & mode B or C, include shelf items
      if (this._shelfEnabled && (this._cookingMode === 'B' || this._cookingMode === 'C')) {
        requestBody.shelf_items = (this._shelfInventory || []).map(i => i.name);
      }

      // Add max time if set (0 = no limit)
      if (this._aiMaxTime && this._aiMaxTime > 0) {
        requestBody.max_time_minutes = this._aiMaxTime;
      }

      // Add cuisines if selected
      if (this._aiSelectedCuisines && this._aiSelectedCuisines.length > 0) {
        requestBody.cuisines = this._aiSelectedCuisines;
      }

      // Call AI recipe generation API
      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/generate', requestBody);

      if (response && response.suggestions && response.suggestions.length > 0) {
        this._aiRecipeSuggestions = response.suggestions;
      } else {
        const msg = (response && response.message) ? response.message : 'No recipes generated. Please try different ingredients or styles.';
        this._showMessage('⚠️ ' + this._t('messages.recipe_generation_title'), msg);
        // Go back to style selection so the user isn't stuck on a loading spinner.
        this._showAIRecipeSuggestions = false;
        this._showAIStyleSelector = true;
      }
    } catch (error) {
      console.error('Error generating AI recipes:', error);
      // HA's callApi throws plain objects (not Error instances) on HTTP errors,
      // so error.message may be undefined.  Extract the best available text.
      let errMsg;
      try {
        errMsg = error?.message
          || error?.body?.message
          || error?.body?.detail
          || (error?.status_code ? `HTTP ${error.status_code}` : null)
          || (error && typeof error === 'object' ? JSON.stringify(error) : String(error))
          || 'Unknown error';
      } catch (_) {
        errMsg = String(error) || 'Unknown error';
      }
      this._showMessage('❌ ' + this._t('messages.recipe_generation_error_title'), `${this._t('messages.recipe_generation_error')} ${errMsg}. ${this._t('messages.please_try_again')}`, true);
      // Go back to style selection
      this._showAIRecipeSuggestions = false;
      this._showAIStyleSelector = true;
    } finally {
      this._stopAIStatusPolling();
    }

    this.requestUpdate();
  }

  /**
   * Start the recipe cook timer that updates every second
   */
  _startRecipeCookTimer() {
    if (this._recipeCookTimer) {
      clearInterval(this._recipeCookTimer);
    }
    this._recipeCookTimer = setInterval(() => {
      this.requestUpdate();
    }, 1000);
  }

  /**
   * Phase 6: Start cooking from an AI-generated recipe
   */
  async _startCookingFromAIRecipe(recipe) {
    // Work on a COPY so we don't mutate the suggestion in _aiRecipeSuggestions
    const fullRecipe = Object.assign({}, recipe);
    
    // Decode HTML entities in name (AI may return &amp; instead of &)
    if (fullRecipe.name) {
      const txt = document.createElement('textarea');
      txt.innerHTML = fullRecipe.name;
      fullRecipe.name = txt.value;
    }

    // Track if cancelled
    let cancelled = false;
    
    // Fetch full recipe detail (instructions, ingredients, tips) from backend
    // Poll the backend status endpoint so the user sees live retry progress
    // in the loading dialog (same status messages _call_openai sets).
    const detailStatusTimer = setInterval(async () => {
      try {
        const res = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/status');
        if (res && res.message) {
          this._messageDialogContent = `${this._t('messages.loading_recipe')}\n${res.message}`;
          this.requestUpdate();
        }
      } catch (pollErr) {
        // Log unexpected errors to aid debugging, but don't crash the interval.
        if (pollErr && pollErr.status_code && pollErr.status_code !== 503 && pollErr.status_code !== 429) {
          console.warn('[AI Detail Status] Polling error:', pollErr);
        }
      }
    }, 1000);

    try {
      // Show cancelable loading dialog
      this._messageDialogTitle = '⏳ ' + this._t('messages.loading_recipe_title');
      this._messageDialogContent = this._t('messages.loading_recipe') + '\n' + this._t('messages.loading_recipe_time');
      this._messageDialogIsError = false;
      this._messageDialogOnCancel = () => { cancelled = true; };
      this._showMessageDialog = true;
      this.requestUpdate();

      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/detail', {
        suggestion_id: fullRecipe.id,
        suggestion: {
          id: fullRecipe.id,
          name: fullRecipe.name,
          description: fullRecipe.description,
          cook_time_minutes: fullRecipe.cook_time_minutes,
          difficulty: fullRecipe.difficulty,
          main_ingredients: fullRecipe.main_ingredients || fullRecipe.ingredients || [],
          cuisine_type: fullRecipe.cuisine_type,
          required_appliances: fullRecipe.required_appliances || []
        },
        appliance_ids: this._selectedAppliance ? [this._selectedAppliance.id] : [],
        main_appliance_id: this._selectedAppliance ? this._selectedAppliance.id : null,
        cooking_style: this._selectedCookingStyle || 'quick_and_easy',
        complexity: this._aiComplexity || 3,
        user_ingredients: (this._selectedIngredients || []).map(i => (typeof i === 'string' ? i : i.name)),
        servings: this._aiPortions || 4,
        language: this._language || 'en',
        measurement_system: this._measurementSystem || 'us',
      });

      if (cancelled) return; // User cancelled while waiting

      if (response && response.detail) {
        const detail = response.detail;
        fullRecipe.instructions = detail.instructions || [];
        fullRecipe.step_ingredients = detail.step_ingredients || [];
        fullRecipe.ingredients = detail.ingredients || fullRecipe.main_ingredients || [];
        fullRecipe.tips = detail.tips || [];
        fullRecipe.servings = detail.servings || fullRecipe.servings || 4;
        fullRecipe.prep_time_minutes = detail.prep_time_minutes || 0;
        fullRecipe.phases = detail.phases || [];
        fullRecipe.use_probe = detail.use_probe || false;
        fullRecipe.target_temp_c = detail.target_temp_c;
        fullRecipe.target_temp_f = detail.target_temp_f;
      } else {
        // API returned an error or empty detail — show the error message
        const msg = (response && response.message) ? response.message : this._t('messages.recipe_detail_failed');
        console.error('AI recipe detail error:', msg);
        fullRecipe.ingredients = fullRecipe.main_ingredients || [];
        fullRecipe.instructions = [];
        // Brief non-blocking error notice
        this._messageDialogOnCancel = null;
        this._messageDialogTitle = '⚠️ ' + this._t('messages.partial_recipe_title');
        this._messageDialogContent = `${this._t('messages.partial_recipe_error')}\n${msg}\n${this._t('messages.partial_recipe_fallback')}`;
        this._messageDialogIsError = false;
        this._showMessageDialog = true;
        this.requestUpdate();
        setTimeout(() => { this._showMessageDialog = false; this.requestUpdate(); }, 3000);
      }
    } catch (error) {
      if (cancelled) return; // User cancelled
      console.error('Error fetching recipe detail:', error);
      // Show error but let user continue with overview (main_ingredients available)
      fullRecipe.ingredients = fullRecipe.main_ingredients || [];
      fullRecipe.instructions = [];
      // Brief non-blocking error notice — the overview will show fallback data
      this._messageDialogOnCancel = null;
      this._messageDialogTitle = '⚠️ ' + this._t('messages.partial_recipe_title');
      this._messageDialogContent = this._t('messages.partial_recipe_error') + ' ' + this._t('messages.partial_recipe_fallback');
      this._messageDialogIsError = false;
      this._showMessageDialog = true;
      this.requestUpdate();
      // Auto-dismiss after 3 seconds
      setTimeout(() => { this._showMessageDialog = false; this.requestUpdate(); }, 3000);
    } finally {
      clearInterval(detailStatusTimer);
    }

    // Dismiss the loading dialog
    this._messageDialogOnCancel = null;
    this._showMessageDialog = false;

    // Start recipe cook flow via central method (supports parallel cooks)
    this._startRecipeCook(fullRecipe, fullRecipe._adjustedServings || fullRecipe.servings || 4);
  }

  /**
   * Phase 5: Select a Ninja built-in recipe and start cooking
   */
  _selectNinjaRecipe(recipe) {
    // Start recipe cook flow via central method (supports parallel cooks)
    this._startRecipeCook(recipe, recipe.servings || recipe.serving_size || 4);
  }

  /**
   * Get the recipe steps array, normalizing between recipe.steps (structured) 
   * and recipe.instructions (flat string array from Ninja data)
   */
  _getRecipeSteps(recipe) {
    // If recipe has structured steps, use them directly
    if (recipe.steps && recipe.steps.length > 0) {
      return recipe.steps;
    }
    // If recipe has instructions (flat string array), convert to step objects
    // Attach step_ingredients from the parallel array if available
    if (recipe.instructions && recipe.instructions.length > 0) {
      const si = recipe.step_ingredients || [];
      return recipe.instructions.map((instruction, idx) => ({
        name: `Step ${idx + 1}`,
        instructions: instruction,
        description: instruction,
        ingredients: si[idx] || [],
      }));
    }
    return [];
  }

  /**
   * Render the Recipe Cook Flow interface
   */
  _renderRecipeCookFlow() {
    if (!this._recipeCookState) return html``;

    const state = this._recipeCookState;
    const recipe = state.recipe;
    const steps = this._getRecipeSteps(recipe);
    const elapsedSeconds = Math.floor((Date.now() - state.startTime) / 1000);
    const currentStepIndex = state.currentStep;
    const isOverview = currentStepIndex === -1;
    const isFinishPage = currentStepIndex >= steps.length;
    
    return html`
      <!-- Recipe Cook Header with navigation -->
      <div class="recipe-cook-header">
        <div class="recipe-cook-title" style="display:flex;align-items:center;gap:12px;">
          <div class="recipe-cook-nav-buttons">
            <button class="recipe-nav-btn" @click=${this._previousRecipeStep}
              title="${isOverview ? 'Exit cook' : 'Previous step'}">
              ${isOverview ? '✕' : '←'}
            </button>
            <button class="recipe-nav-btn home-btn" @click=${() => this._minimizeRecipeCook()}
              title="Go to Home screen (cook keeps running)">🏠</button>
            ${isFinishPage ? html`
              <button class="recipe-nav-btn save-btn" @click=${this._saveRecipeCook}
                ?disabled=${!state.easeRating || !state.resultRating}
                title="Save cook">✓</button>
            ` : html`
              <button class="recipe-nav-btn" @click=${this._nextRecipeStep}
                title="${isOverview ? (steps.length > 0 ? 'Start cooking' : 'Finish') : currentStepIndex === steps.length - 1 ? 'Finish' : 'Next step'}">
                ${isOverview ? (steps.length > 0 ? '→' : '✓') : currentStepIndex === steps.length - 1 ? '✓' : '→'}
              </button>
            `}
          </div>
          <div>
            <h2>${recipe.name}</h2>
            <p class="recipe-cook-serving">
              Serves: ${state.servingSize} | Elapsed: ${this._formatElapsedTime(elapsedSeconds)}
            </p>
          </div>
        </div>
        <button class="help-btn recipe-cook-help-btn" @click=${() => this._openHelp('#8-recipe-cook-flow')} title="Open User Guide">?</button>
      </div>

      <ha-card>
        <div class="card-content">
          ${isOverview ? this._renderRecipeCookOverview() : 
            isFinishPage ? this._renderRecipeCookFinish() : 
            this._renderRecipeCookStep(currentStepIndex)}
        </div>
      </ha-card>

      ${this._renderMeaterProbeInfo()}
    `;
  }

  /**
   * Render recipe overview page (step -1)
   */
  _renderRecipeCookOverview() {
    const recipe = this._recipeCookState.recipe;
    const steps = this._getRecipeSteps(recipe);
    const totalTime = recipe.total_time || recipe.cook_time_minutes;
    // Fall back to main_ingredients (from suggestion) if full ingredients list is missing
    const ingredientList = recipe._adjustedIngredients
      || (recipe.ingredients && recipe.ingredients.length > 0 ? recipe.ingredients : (recipe.main_ingredients || []));
    
    return html`
      <div class="recipe-cook-overview">
        <h3>${this._t('recipe_cook.overview_title')}</h3>
        
        ${recipe.description ? html`
          <p class="recipe-description">${recipe.description}</p>
        ` : ''}

        ${totalTime ? html`
          <p><strong>⏱️ ${this._t('recipe_cook.total_time')}:</strong> ${totalTime} ${this._t('common.minutes')}</p>
        ` : ''}

        <div class="recipe-cook-ingredients">
          <h4>${this._t('recipe_cook.ingredients_label')}</h4>
          ${ingredientList.length > 0 ? html`
            <ul>
              ${ingredientList.map(ing => html`
                <li>${this._convertIngredientText(ing)}</li>
              `)}
            </ul>
          ` : html`
            <p style="color: var(--secondary-text-color); font-style: italic;">
              ${this._t('messages.no_ingredients')}
            </p>
          `}
        </div>

        ${steps.length > 0 ? html`
          <div class="recipe-cook-step-overview">
            <h4>📝 ${this._t('recipe_cook.steps_label')} (${steps.length})</h4>
            <ol>
              ${steps.map((step, idx) => html`
                <li>
                  ${this._convertIngredientText(step.instructions || step.description || step.name || `${this._t('common.step')} ${idx + 1}`)}
                  ${step.time ? html` <span class="step-time">(~${step.time} ${this._t('common.minutes_short')})</span>` : ''}
                </li>
              `)}
            </ol>
          </div>
        ` : html`
          <p style="color: var(--secondary-text-color); font-style: italic;">
            ${this._t('messages.no_instructions')}
          </p>
          <button
            class="primary-btn"
            style="margin-top: 12px;"
            @click=${() => this._retryRecipeDetail()}
          >
            🔄 ${this._t('ai_recipe.retry_generation') || 'Retry Recipe Generation'}
          </button>
        `}

        <!-- MEATER probe card on overview — start probe before cooking begins -->
        ${recipe.use_probe && recipe.target_temp_c && !this._recipeCookState.meaterSubprocess ? html`
          <div class="meater-probe-card" style="margin: 16px 0; padding: 12px; background: rgba(76,175,80,0.1); border: 1px solid #4caf50; border-radius: 8px; display: flex; align-items: center; gap: 12px;">
            <div style="flex: 1;">
              <strong>🌡️ ${this._t('recipe_cook.start_meater_btn')}</strong>
              <div style="font-size: 0.85em; color: var(--secondary-text-color); margin-top: 2px;">
                ${this._t('common.target')}: ${recipe.target_temp_c}°C
                ${recipe.target_temp_f ? ` (${recipe.target_temp_f}°F)` : ''}
              </div>
            </div>
            <button class="primary-btn" style="white-space:nowrap;" @click=${() => this._startMeaterSubprocess()}>
              ${this._t('recipe_cook.start_meater_btn')}
            </button>
          </div>
        ` : ''}

        <!-- Save for Later button — saves without cooking, no ratings required -->
        <div style="margin-top: 16px; padding-top: 14px; border-top: 1px solid var(--divider-color);">
          <button
            class="secondary-btn"
            style="width: 100%;"
            title="${this._t('ai_recipe.save_for_later_hint')}"
            @click=${() => this._saveRecipeForLater()}
          >
            ${this._t('ai_recipe.save_for_later')}
          </button>
        </div>
      </div>
    `;
  }

  /**
   * Retry fetching recipe detail (instructions) when generation failed
   */
  async _retryRecipeDetail() {
    if (!this._recipeCookState) return;
    const recipe = this._recipeCookState.recipe;

    // Show loading dialog
    this._messageDialogTitle = '⏳ ' + this._t('messages.loading_recipe_title');
    this._messageDialogContent = this._t('messages.loading_recipe') + '\n' + this._t('messages.loading_recipe_time');
    this._messageDialogIsError = false;
    let cancelled = false;
    this._messageDialogOnCancel = () => { cancelled = true; };
    this._showMessageDialog = true;
    this.requestUpdate();

    // Poll the backend status endpoint for live retry progress
    const detailStatusTimer = setInterval(async () => {
      try {
        const res = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/status');
        if (res && res.message) {
          this._messageDialogContent = `${this._t('messages.loading_recipe')}\n${res.message}`;
          this.requestUpdate();
        }
      } catch (pollErr) {
        if (pollErr && pollErr.status_code && pollErr.status_code !== 503 && pollErr.status_code !== 429) {
          console.warn('[AI Detail Status] Polling error:', pollErr);
        }
      }
    }, 1000);

    try {
      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/detail', {
        suggestion_id: recipe.id,
        suggestion: {
          id: recipe.id,
          name: recipe.name,
          description: recipe.description,
          cook_time_minutes: recipe.cook_time_minutes,
          difficulty: recipe.difficulty,
          main_ingredients: recipe.main_ingredients || recipe.ingredients || [],
          cuisine_type: recipe.cuisine_type,
          required_appliances: recipe.required_appliances || []
        },
        appliance_ids: this._selectedAppliance ? [this._selectedAppliance.id] : [],
        main_appliance_id: this._selectedAppliance ? this._selectedAppliance.id : null,
        cooking_style: this._selectedCookingStyle || 'quick_and_easy',
        complexity: this._aiComplexity || 3,
        user_ingredients: (this._selectedIngredients || []).map(i => (typeof i === 'string' ? i : i.name)),
        servings: this._aiPortions || 4,
        language: this._language || 'en',
        measurement_system: this._measurementSystem || 'us',
      });

      if (cancelled) return;

      if (response && response.detail) {
        const detail = response.detail;
        recipe.instructions = detail.instructions || [];
        recipe.step_ingredients = detail.step_ingredients || [];
        recipe.ingredients = detail.ingredients || recipe.main_ingredients || [];
        recipe.tips = detail.tips || [];
        recipe.servings = detail.servings || recipe.servings || 4;
        recipe.prep_time_minutes = detail.prep_time_minutes || 0;
        recipe.phases = detail.phases || [];
        recipe.use_probe = detail.use_probe || false;
        recipe.target_temp_c = detail.target_temp_c;
        recipe.target_temp_f = detail.target_temp_f;
      } else {
        const msg = (response && response.message) ? response.message : this._t('messages.recipe_detail_failed');
        this._showMessage('⚠️ ' + this._t('messages.partial_recipe_title'), msg, false);
      }
    } catch (error) {
      if (cancelled) return;
      console.error('Error retrying recipe detail:', error);
      this._showMessage('⚠️ ' + this._t('messages.partial_recipe_title'),
        this._t('messages.partial_recipe_error') + ' ' + this._t('messages.partial_recipe_fallback'), false);
    } finally {
      clearInterval(detailStatusTimer);
    }

    this._messageDialogOnCancel = null;
    this._showMessageDialog = false;
    this.requestUpdate();
  }

  /**
   * Render individual recipe step
   */
  _renderRecipeCookStep(stepIndex) {
    const recipe = this._recipeCookState.recipe;
    const steps = this._getRecipeSteps(recipe);
    const step = steps[stepIndex];
    
    if (!step) {
      return html`<p>${this._t('messages.step_not_found')}</p>`;
    }

    // Get ingredients mentioned in this step (if available)
    const stepIngredients = step.ingredients || [];

    // Strip "Step X:" / "Steg X:" prefix from description text
    let instructionText = step.instructions || step.description || this._t('messages.no_instructions');
    instructionText = instructionText.replace(/^(?:Step|Steg)\s+\d+\s*:\s*/i, '');
    // Convert any remaining US measurements in the instruction text
    instructionText = this._convertIngredientText(instructionText);

    // Build sorted ingredient list: new-active (green), repeat-active (black), inactive (2 columns)
    // Use scaled ingredients if a serving adjustment was applied, otherwise fall back to originals.
    const allIngredients = (recipe._adjustedIngredients || recipe.ingredients || []);
    const newActiveIngs = [];
    const repeatActiveIngs = [];
    const inactiveIngs = [];
    const measureWords = new Set(['cups','cup','tbsp','tsp','ounce','ounces','pound','pounds','gram','grams','tablespoon','tablespoons','teaspoon','teaspoons','inch','lbs','chopped','diced','minced','sliced','finely','freshly','large','small','medium','optional','about','into','with','from','each','piece','pieces','water','drain','rinse','heat','place','minutes','adjust','taste','whole','clean','back','that','this','then','also','well','over','used','half','more','approx','skin','make',
      /* Swedish measurement/stopwords */ 'krm','tsk','msk','dl','cl','hg','kg','hackad','tärnad','skivad','finhackad','stor','liten','valfritt','ungefär','stycken','vatten','minuter','smak','hela','efter']);
    const escapeRegex = (s) => s.replace(/[.*+?^${}()|[\]\\]/g, '\\$&');
    // Unicode-aware word boundary: \b doesn't work with ä,ö,å,é etc.
    // Use lookbehind/lookahead for non-letter/digit or string boundary.
    const uWordBoundary = (w) => `(?<![\\p{L}\\p{N}])${escapeRegex(w)}(?![\\p{L}\\p{N}])`;
    const extractKeywords = (text) => text.split(/[\s,()]+/).filter(w =>
      w.length > 3 && !measureWords.has(w) && !/^\d/.test(w)
    );

    // Helper: check if ingredient is mentioned in a step's instruction text
    const isIngredientInStep = (ingLower, stepObj) => {
      const si = stepObj.ingredients || [];
      const txt = (stepObj.instructions || stepObj.description || '').toLowerCase();
      // Method 1: per-step ingredient list (primary — from AI JSON step_ingredients)
      if (si.length > 0) {
        return si.some(s => {
          const sLower = s.toLowerCase();
          // Direct match or substring containment (step_ingredients may be
          // short names like "chicken" while the full ingredient is "400 g chicken breast, diced")
          if (ingLower === sLower || ingLower.includes(sLower) || sLower.includes(ingLower)) return true;
          // Keyword fallback within Method 1
          const kw = extractKeywords(sLower);
          return kw.some(w => new RegExp(uWordBoundary(w), 'iu').test(ingLower));
        });
        // Do NOT fall through to Method 2 when step_ingredients are available
      }
      // Method 2: scan instruction text (fallback — only when step_ingredients is empty/missing)
      const kw = extractKeywords(ingLower);
      return kw.some(w => new RegExp(uWordBoundary(w), 'iu').test(txt));
    };

    // Determine which ingredients were active in any previous step
    const prevActiveSet = new Set();
    for (let i = 0; i < stepIndex; i++) {
      allIngredients.forEach(ing => {
        if (isIngredientInStep(ing.toLowerCase(), steps[i])) {
          prevActiveSet.add(ing);
        }
      });
    }

    const instructionLower = instructionText.toLowerCase();

    // Helper: find earliest position of ingredient keyword in instruction text
    const ingredientPosition = (ingLower) => {
      const kw = extractKeywords(ingLower);
      let earliest = instructionLower.length;
      kw.forEach(w => {
        const match = instructionLower.match(new RegExp(uWordBoundary(w), 'iu'));
        if (match && match.index < earliest) earliest = match.index;
      });
      return earliest;
    };
    
    if (allIngredients.length > 0) {
      allIngredients.forEach(ing => {
        const ingLower = ing.toLowerCase();
        const isActive = isIngredientInStep(ingLower, step);

        if (isActive) {
          if (prevActiveSet.has(ing)) {
            repeatActiveIngs.push(ing);
          } else {
            newActiveIngs.push(ing);
          }
        } else {
          inactiveIngs.push(ing);
        }
      });
    }

    // Sort active ingredients by order of appearance in instruction text
    const sortByAppearance = (a, b) => ingredientPosition(a.toLowerCase()) - ingredientPosition(b.toLowerCase());
    const newActiveSet = new Set(newActiveIngs);
    const allActiveIngs = [...newActiveIngs, ...repeatActiveIngs].sort(sortByAppearance);
    
    return html`
      <div class="recipe-cook-step-detail">
        <div class="step-header">
          <h3>${this._t('common.step')} ${stepIndex + 1} ${this._t('common.of')} ${steps.length}</h3>
          ${step.time ? html`<p class="step-time">⏱️ ~${step.time} ${this._t('common.minutes')}</p>` : ''}
        </div>

        <div class="step-instructions">
          <p>${instructionText}</p>
        </div>

        ${step.temperature ? html`
          <div class="step-temp">
            <strong>${this._t('recipe_cook.temperature_label')}</strong> ${step.temperature}
          </div>
        ` : ''}

        ${step.notes ? html`
          <div class="step-notes">
            <strong>${this._t('recipe_cook.tip_label')}</strong> ${step.notes}
          </div>
        ` : ''}

        <!-- MEATER probe subprocess button — shown when recipe uses probe and subprocess not yet started -->
        ${recipe.use_probe && recipe.target_temp_c && !this._recipeCookState.meaterSubprocess ? html`
          <div class="meater-probe-card" style="margin: 12px 0; padding: 12px; background: rgba(76,175,80,0.1); border: 1px solid #4caf50; border-radius: 8px; display: flex; align-items: center; gap: 12px;">
            <div style="flex: 1;">
              <strong>🌡️ ${this._t('recipe_cook.start_meater_btn')}</strong>
              <div style="font-size: 0.85em; color: var(--secondary-text-color); margin-top: 2px;">
                ${this._t('common.target')}: ${recipe.target_temp_c}°C
                ${recipe.target_temp_f ? ` (${recipe.target_temp_f}°F)` : ''}
              </div>
            </div>
            <button class="primary-btn" style="white-space:nowrap;" @click=${() => this._startMeaterSubprocess()}>
              ${this._t('recipe_cook.start_meater_btn')}
            </button>
          </div>
        ` : ''}

        <!-- Ingredients: active sorted by appearance in grey box, inactive in 2-col below -->
        ${allIngredients.length > 0 ? html`
          <div class="recipe-cook-ingredients">
            <h5>${this._t('recipe_cook.ingredients_label')}</h5>
            ${allActiveIngs.length > 0 ? html`
              <ul class="ingredients-active">
                ${allActiveIngs.map(ing => html`
                  <li class="active-ingredient ${newActiveSet.has(ing) ? 'new-ingredient' : 'repeat-ingredient'}">${ing}</li>
                `)}
              </ul>
            ` : ''}
            ${inactiveIngs.length > 0 ? html`
              <ul class="ingredients-inactive">
                ${inactiveIngs.map(ing => html`
                  <li>${ing}</li>
                `)}
              </ul>
            ` : ''}
          </div>
        ` : ''}
      </div>
    `;
  }

  /**
   * Render recipe cook finish page with ratings
   */
  _renderRecipeCookFinish() {
    const state = this._recipeCookState;
    
    return html`
      <div class="recipe-cook-finish">
        <h3>${this._t('rating.cook_complete')}</h3>
        <p>${this._t('rating.how_did_it_go')}</p>

        <div class="recipe-cook-rating">
          <h4>${this._t('rating.ease_title')}</h4>
          <p class="rating-description">${this._t('rating.ease_recipe_desc')}</p>
          <div class="star-selector">
            ${[1, 2, 3, 4, 5].map(rating => html`
              <button 
                class="star-btn ${state.easeRating >= rating ? 'active' : ''}"
                @click=${() => {
                  this._recipeCookState.easeRating = rating;
                  this.requestUpdate();
                }}
              >
                ${state.easeRating >= rating ? '⭐' : '☆'}
              </button>
            `)}
          </div>
        </div>

        <div class="recipe-cook-rating">
          <h4>${this._t('rating.result_title')}</h4>
          <p class="rating-description">${this._t('rating.result_recipe_desc')}</p>
          <div class="star-selector">
            ${[1, 2, 3, 4, 5].map(rating => html`
              <button 
                class="star-btn ${state.resultRating >= rating ? 'active' : ''}"
                @click=${() => {
                  this._recipeCookState.resultRating = rating;
                  this.requestUpdate();
                }}
              >
                ${state.resultRating >= rating ? '⭐' : '☆'}
              </button>
            `)}
          </div>
        </div>

        <div class="recipe-cook-notes">
          <h4>${this._t('rating.notes_title')}</h4>
          <textarea
            placeholder="${this._t('rating.notes_placeholder')}"
            .value=${state.notes || ''}
            @input=${(e) => {
              this._recipeCookState.notes = e.target.value;
            }}
            rows="4"
          ></textarea>
        </div>

        ${!state.easeRating || !state.resultRating ? html`
          <p class="rating-required">${this._t('rating.both_required')}</p>
        ` : ''}
      </div>
    `;
  }

  /**
   * Start MEATER probe as a subprocess within the current recipe cook.
   * Calls start_simple_probe_cook and stores entity reference in meaterSubprocess.
   */
  async _startMeaterSubprocess() {
    const state = this._recipeCookState;
    if (!state) return;
    const recipe = state.recipe;
    const targetTempC = recipe.target_temp_c;
    if (!targetTempC) return;

    // Find a MEATER cooking session entity
    const entities = this._findCookingEntities();
    const meaterEntity = entities.find(e => e.toLowerCase().includes('meater')) || entities[0];
    if (!meaterEntity) {
      this._showMessage(this._t('meater.no_sensor_found'), '⚠️ ' + this._t('meater.sensor_not_connected'), true);
      return;
    }

    try {
      await this.hass.callService('kitchen_cooking_engine', 'start_simple_probe_cook', {
        entity_id: meaterEntity,
        target_temp_c: targetTempC,
        session_name: recipe.name || 'Recipe Probe',
      });
      state.meaterSubprocess = { entityId: meaterEntity, targetTempC };
      this._persistActiveRecipeCooks();
      this.requestUpdate();
    } catch (e) {
      this._showMessage('❌ ' + this._t('messages.cook_session_error_title'), e.message || String(e), true);
    }
  }

  /**
   * Detach the MEATER subprocess from the recipe cook (probe session keeps running).
   */
  _stopMeaterSubprocess() {
    const state = this._recipeCookState;
    if (!state) return;
    state.meaterSubprocess = null;
    this._persistActiveRecipeCooks();
    this.requestUpdate();
  }

  /**
   * Render MEATER probe info in footer middle section — shows live temp when subprocess active.
   */
  _renderMeaterProbeInfo() {
    const sub = this._recipeCookState?.meaterSubprocess;
    if (!sub) return html``;

    const entityState = this.hass?.states?.[sub.entityId];
    const currentTemp = entityState?.attributes?.current_temp;
    const tempDisplay = (currentTemp !== null && currentTemp !== undefined) ? `${currentTemp}°C` : '--';

    return html`
      <div class="meater-probe-info">
        <span class="probe-temp">🌡️ ${tempDisplay}</span>
        <span class="probe-status">${sub.targetTempC}°C ${this._t('common.target')}</span>
        <button class="secondary-btn" style="padding:4px 10px;font-size:0.8em;" @click=${() => this._stopMeaterSubprocess()} title="${this._t('recipe_cook.meater_detach_hint')}">✕</button>
      </div>
    `;
  }

  // ============================================================================
  // PHASE 1: HELPER METHODS
  // ============================================================================

  /**
   * Get icon for appliance
   */
  _getApplianceIcon(appliance) {
    const brand = (appliance.brand || '').toLowerCase();
    const model = (appliance.model || '').toLowerCase();
    const name = (appliance.name || '').toLowerCase();
    
    if (brand.includes('meater') || model.includes('meater') || name.includes('meater')) {
      return '🌡️';
    }
    if (brand.includes('ninja')) {
      if (model.includes('combi')) return '🥘';
      return '🍳';
    }
    if (name.includes('oven')) return '🔥';
    if (name.includes('grill')) return '🍢';
    if (name.includes('fryer')) return '🍟';
    return '🍳';
  }

  // ============================================================================
  // PHASE 1: PLACEHOLDER ACTION METHODS (TO BE IMPLEMENTED IN FUTURE PHASES)
  // ============================================================================

  _startMeaterCooking() {
    // Phase 2: Show MEATER cooking interface (v0.5.0.30 pattern restored)
    this._showMeaterCooking = true;
    this.requestUpdate();
  }

  async _showRecentMeaterCooks() {
    // Phase 2: Show filtered MEATER cook history
    // MUST await history load before rendering!
    try {
      await this._loadHistory();
      this._currentPath = 'recent_meater';
      this.requestUpdate();
    } catch (error) {
      console.error('Failed to show recent MEATER cooks:', error);
      this._showMessage(this._t('common.error'), this._t('messages.load_history_failed') + '\n\n' + this._t('messages.load_history_check'), true);
    }
  }

  /**
   * Phase 5: Start Ninja Combi Recipe Builder
   * Opens the existing ninja_combi_recipe_builder functionality
   */
  _startNinjaRecipeBuilder() {
    this._showRecipeBuilder = true;
    this._currentPath = 'ninja_recipe_builder';
    this.requestUpdate();
  }

  /**
   * Phase 5: Show Ninja Combi built-in recipes
   * Loads and displays pre-configured Ninja Combi recipes
   */
  _showNinjaBuiltInRecipes() {
    // Use embedded NINJA_COMBI_RECIPES data
    if (typeof NINJA_COMBI_RECIPES !== 'undefined' && NINJA_COMBI_RECIPES && NINJA_COMBI_RECIPES.length > 0) {
      this._ninjaBuiltInRecipes = NINJA_COMBI_RECIPES;
      this._showNinjaRecipeList = true;
      this._currentPath = 'ninja_built_in_recipes';
      this.requestUpdate();
    } else {
      this._showMessage(this._t('common.error'), this._t('messages.no_ninja_recipes'), true);
      this._currentPath = 'ninja_combi';
      this.requestUpdate();
    }
  }

  /**
   * Phase 6: Launch AI Recipe Builder with Ninja Combi pre-selected
   * Pre-selects Ninja Combi as main appliance and opens AI builder
   */
  async _startAIWithNinjaCombi() {
    // Load data FIRST (same pattern as _startAIRecipeCreation)
    try {
      // Load ingredients if not already loaded
      if (!this._commonIngredients || this._commonIngredients.length === 0) {
        if (typeof AI_COMMON_INGREDIENTS !== 'undefined' && AI_COMMON_INGREDIENTS.length > 0) {
          this._commonIngredients = AI_COMMON_INGREDIENTS;
        } else {
          const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/ingredients');
          const rawIngredients = response.ingredients || {};
          this._commonIngredients = Array.isArray(rawIngredients)
            ? rawIngredients
            : Object.values(rawIngredients).flat();
        }
      }
      
      // Load cooking styles if not already loaded
      if (!this._cookingStyles || this._cookingStyles.length === 0) {
        const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/cooking_styles');
        this._cookingStyles = response.cooking_styles || [];
      }
    } catch (e) {
      console.error('Error loading AI recipe data:', e);
      this._commonIngredients = this._commonIngredients || [];
      this._cookingStyles = this._cookingStyles || [];
    }
    
    // Pre-select Ninja Combi and navigate to the AI builder appliance screen
    // (same screen as other appliances — shows secondary appliances with deselectable checkboxes)
    this._selectedMainAppliance = 'ninja_combi';
    this._currentPath = 'ai_recipe_builder';
    this._showAIIngredientSelector = false;
    this._showAIStyleSelector = false;
    this._showAIRecipeSuggestions = false;
    this._selectedIngredients = [];
    this._selectedCookingStyle = null;
    this._aiRecipeSuggestions = [];
    this.requestUpdate();
  }

  /**
   * Phase 5: Show recent Ninja Combi cooks (filtered history)
   * Displays cook history filtered for Ninja Combi recipes
   */
  _showRecentNinjaCooks() {
    this._currentPath = 'recent_ninja';
    this._loadHistory();
    this.requestUpdate();
  }

  /**
   * Phase 6: Start AI Recipe Creation
   * Opens ingredient selection for AI recipe generation
   */
  async _startAIRecipeCreation() {
    this._currentPath = 'ai_recipe_builder';
    this._selectedIngredients = [];

    // Auto-inject the selected appliance as the first ingredient so the AI
    // always targets the right appliance.  This mirrors what the user proved
    // works: typing "use Ninja Combi programs" as a manual ingredient makes
    // the AI generate correct recipes.  It shows as a normal removable chip —
    // click × to remove it for fully generic recipes.
    const applianceName = this._selectedAppliance?.name;
    if (applianceName) {
      this._selectedIngredients = [{ name: `use ${applianceName} programs`, compulsory: false }];
    }

    this._selectedCookingStyle = null;
    this._aiRecipeSuggestions = [];
    // Reset ingredient picker state
    this._ingredientExpandedCats = [];
    this._ingredientProteinSubcat = null;
    
    // Load data before showing UI to avoid "[object Promise]" display
    try {
      // Use the generated AI_COMMON_INGREDIENTS constant (has cat + common fields).
      // Fall back to API only if the constant is not available (older generated file).
      if (!this._commonIngredients || this._commonIngredients.length === 0) {
        if (typeof AI_COMMON_INGREDIENTS !== 'undefined' && AI_COMMON_INGREDIENTS.length > 0) {
          this._commonIngredients = AI_COMMON_INGREDIENTS;
        } else {
          const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/ingredients');
          const rawIngredients = response.ingredients || {};
          this._commonIngredients = Array.isArray(rawIngredients)
            ? rawIngredients
            : Object.values(rawIngredients).flat();
        }
      }
      
      // Load cooking styles if not already loaded
      if (!this._cookingStyles || this._cookingStyles.length === 0) {
        const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/cooking_styles');
        this._cookingStyles = response.cooking_styles || [];
      }
    } catch (e) {
      console.error('Error loading AI recipe data:', e);
      this._commonIngredients = this._commonIngredients || [];
      this._cookingStyles = this._cookingStyles || [];
    }
    
    // NOW show the UI with data already loaded
    this._showAIIngredientSelector = true;
    this.requestUpdate();
  }

  /**
   * Phase 6: Show recent recipes for selected appliance
   * Displays cook history filtered for current appliance
   */
  _showRecentApplianceRecipes() {
    this._currentPath = 'recent_appliance';
    this._loadHistory();
    this.requestUpdate();
  }

  /**
   * Phase 6: Toggle secondary appliance selection
   * @param {string} applianceId - ID of appliance to toggle
   * @param {boolean} enabled - Whether appliance is enabled
   */
  _toggleSecondaryAppliance(applianceId, enabled) {
    if (enabled) {
      if (!this._selectedSecondaryAppliances.includes(applianceId)) {
        this._selectedSecondaryAppliances = [...this._selectedSecondaryAppliances, applianceId];
      }
    } else {
      this._selectedSecondaryAppliances = this._selectedSecondaryAppliances.filter(id => id !== applianceId);
    }
    this.requestUpdate();
  }

  _renderHistory() {
    if (this._cookHistory.length === 0) {
      return html`
        <ha-card>
          <div class="card-content">
            <p class="no-history">${this._t('history.no_cooks_message')}</p>
          </div>
        </ha-card>
      `;
    }

    // Filter based on toggle state
    // A "saved" entry has comment === 'Saved, not yet cooked'
    const filtered = this._cookHistory.filter(cook => {
      const isSaved = cook.comment === SAVED_NOT_YET_COOKED;
      if (this._hideSaved && isSaved) return false;
      if (this._hideCooked && !isSaved) return false;
      return true;
    });

    if (filtered.length === 0) {
      return html`
        <ha-card>
          <div class="card-content">
            <p class="no-history">${this._t('history.no_saved_visible')}</p>
          </div>
        </ha-card>
      `;
    }

    return html`${filtered.map(cook => this._renderHistoryCard(cook))}`;
  }

  _startCook() {
    const serviceData = {
      cut_id: this._selectedCut,
      doneness: this._selectedDoneness,
      cooking_method: this._selectedMethod,
      data_source: this._dataSource,
    };
    
    // Include custom target temperature if set
    if (this._customTargetTempC) {
      serviceData.custom_target_temp_c = this._customTargetTempC;
    }
    
    this._callService('start_cook', serviceData);
    
    // Navigate back to welcome screen so the active cook will be shown
    this._showMeaterCooking = false;
    this._currentPath = 'welcome';
    this.requestUpdate();
  }

  _startCustomCook() {
    const tempC = parseInt(this._customProfileTempC);
    if (isNaN(tempC) || tempC < 30 || tempC > 100) {
      this._showMessage(this._t('messages.invalid_temp_title'), this._t('messages.invalid_temp'), true);
      return;
    }
    
    const sessionName = this._customProfileName?.trim() || 'Custom Cook';
    
    // Uses start_simple_probe_cook service (schema: entity_id, target_temp_c 30-100, session_name)
    // _callService automatically includes this._selectedEntity as entity_id
    this._callService('start_simple_probe_cook', {
      target_temp_c: tempC,
      session_name: sessionName,
    });
    
    // Navigate back to welcome screen so the active cook will be shown
    this._showMeaterCooking = false;
    this._currentPath = 'welcome';
    this.requestUpdate();
  }

  _stopCook() {
    if (confirm('Are you sure you want to stop this cook?')) {
      this._callService('stop_cook');
    }
  }

  _startRest() {
    this._callService('start_rest');
  }

  _complete() {
    // Show rating screen before completing (Issue #65)
    const state = this._getState();
    const attrs = state?.attributes || {};
    this._meaterCookRatingState = {
      entityId: this._selectedEntity,
      cut: attrs.cut_display || attrs.cut || 'Unknown',
      protein: attrs.protein || '',
      doneness: attrs.doneness || '',
      notes: attrs.notes || this._currentNotes || '',
      easeRating: 0,
      resultRating: 0,
    };
    this.requestUpdate();
  }

  /**
   * Render MEATER cook rating screen (Issue #65)
   */
  _renderMeaterCookRating() {
    const state = this._meaterCookRatingState;
    if (!state) return html``;

    return html`
      <ha-card>
        <div class="card-content">
          <div class="recipe-cook-finish">
            <h3>${this._t('rating.cook_complete')}</h3>
            <p>${state.cut} ${state.doneness ? '• ' + state.doneness.replace('_', ' ') : ''}</p>
            <p>${this._t('rating.how_did_it_go')}</p>

            <div class="recipe-cook-rating">
              <h4>${this._t('rating.ease_title')}</h4>
              <p class="rating-description">${this._t('rating.ease_cook_desc')}</p>
              <div class="star-selector">
                ${[1, 2, 3, 4, 5].map(rating => html`
                  <button 
                    class="star-btn ${state.easeRating >= rating ? 'active' : ''}"
                    @click=${() => {
                      this._meaterCookRatingState = { ...this._meaterCookRatingState, easeRating: rating };
                    }}
                  >
                    ${state.easeRating >= rating ? '⭐' : '☆'}
                  </button>
                `)}
              </div>
            </div>

            <div class="recipe-cook-rating">
              <h4>${this._t('rating.result_title')}</h4>
              <p class="rating-description">${this._t('rating.result_cook_desc')}</p>
              <div class="star-selector">
                ${[1, 2, 3, 4, 5].map(rating => html`
                  <button 
                    class="star-btn ${state.resultRating >= rating ? 'active' : ''}"
                    @click=${() => {
                      this._meaterCookRatingState = { ...this._meaterCookRatingState, resultRating: rating };
                    }}
                  >
                    ${state.resultRating >= rating ? '⭐' : '☆'}
                  </button>
                `)}
              </div>
            </div>

            <div class="recipe-cook-notes">
              <h4>${this._t('rating.notes_title')}</h4>
              <textarea
                placeholder="${this._t('rating.notes_placeholder')}"
                .value=${state.notes || ''}
                @input=${(e) => {
                  this._meaterCookRatingState = { ...this._meaterCookRatingState, notes: e.target.value };
                }}
                rows="4"
              ></textarea>
            </div>

            ${!state.easeRating || !state.resultRating ? html`
              <p class="rating-required">${this._t('rating.both_required')}</p>
            ` : ''}

            <div class="action-buttons" style="margin-top: 16px;">
              <ha-button 
                unelevated 
                ?disabled=${!state.easeRating || !state.resultRating}
                @click=${() => this._saveMeaterCookRating()}
              >
                ${this._t('rating.save_complete')}
              </ha-button>
              <ha-button outlined @click=${() => this._skipMeaterCookRating()}>
                ${this._t('rating.skip')}
              </ha-button>
            </div>
          </div>
        </div>
      </ha-card>
    `;
  }

  /**
   * Save MEATER cook rating and complete session (Issue #65)
   */
  async _saveMeaterCookRating() {
    const state = this._meaterCookRatingState;
    if (!state) return;

    try {
      // Ensure selected entity is correct for service calls
      if (state.entityId) {
        this._selectedEntity = state.entityId;
      }
      
      // Set notes if user provided any
      if (state.notes) {
        await this._callService('set_notes', { notes: state.notes });
      }

      // Complete the session (saves cook to history)
      await this._callService('complete_session');

      // Update the saved cook with ratings using retry logic
      // The cook save is async so we retry a few times
      const updateRatings = async (retries = 3, delay = 1000) => {
        for (let i = 0; i < retries; i++) {
          await new Promise(resolve => setTimeout(resolve, delay));
          try {
            const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/history');
            if (response && response.history && response.history.length > 0) {
              const lastCook = response.history[0];
              if (lastCook.id) {
                await this.hass.callApi('PATCH', `kitchen_cooking_engine/history/${lastCook.id}`, {
                  ease_rating: state.easeRating,
                  result_rating: state.resultRating,
                  notes: state.notes || lastCook.notes || '',
                });
                return; // Success
              }
            }
          } catch (e) {
            if (i === retries - 1) console.error('Error updating cook ratings:', e);
          }
          delay *= 2; // Exponential backoff
        }
      };
      updateRatings();

      this._meaterCookRatingState = null;
      this.requestUpdate();
    } catch (error) {
      console.error('Error completing cook with rating:', error);
      this._showMessage('❌ ' + this._t('messages.cook_complete_error_title'), `${this._t('messages.cook_complete_error')} ${error.message}`, true);
    }
  }

  /**
   * Skip rating and just complete the session (Issue #65)
   */
  async _skipMeaterCookRating() {
    const state = this._meaterCookRatingState;
    
    // Ensure selected entity is correct for service calls
    if (state && state.entityId) {
      this._selectedEntity = state.entityId;
    }
    
    // Set notes if any were provided (await to ensure notes are saved before completing)
    if (state && state.notes) {
      await this._callService('set_notes', { notes: state.notes });
    }
    
    this._callService('complete_session');
    this._meaterCookRatingState = null;
    this.requestUpdate();
  }

  // ── Lovelace card interface ─────────────────────────────────────────────────
  // These two methods make KitchenCookingPanel a valid Lovelace custom card
  // so it can be used as:  type: custom:kitchen-cooking-card

  setConfig(config) {
    // No configuration keys required; accept anything.
    this._config = config || {};
  }

  getCardSize() {
    // Height hint for the Lovelace layout engine (1 unit ≈ 50 px).
    return 10;
  }
  // ────────────────────────────────────────────────────────────────────────────

  static get styles() {
    return css`
      :host {
        display: block;
        width: 100%;
        overflow-x: hidden;
      }

      .content {
        padding: 16px;
        max-width: 800px;
        width: 100%;
        margin: 0 auto;
        box-sizing: border-box;
      }

      .loading {
        text-align: center;
        padding: 48px;
        color: var(--secondary-text-color);
      }

      ha-card {
        margin-bottom: 16px;
        max-width: 100%;
        box-sizing: border-box;
        overflow: hidden;
      }

      .card-content {
        padding: 16px;
      }

      .card-content h3 {
        margin: 0 0 16px 0;
        font-size: 16px;
        font-weight: 500;
      }

      .no-entities {
        text-align: center;
        color: var(--secondary-text-color);
      }

      .status-banner {
        padding: 16px;
        border-radius: 8px;
        margin-bottom: 16px;
        text-align: center;
      }

      .status-banner h2 {
        margin: 0 0 4px 0;
        font-size: 20px;
        text-transform: capitalize;
      }

      .status-banner p {
        margin: 0;
        opacity: 0.9;
      }

      .status-banner.idle {
        background: var(--divider-color);
        color: var(--secondary-text-color);
      }

      .status-banner.cooking {
        background: #ff5722;
        color: white;
      }

      .status-banner.approaching {
        background: #ff9800;
        color: white;
      }

      .status-banner.goal_reached {
        background: #4caf50;
        color: white;
      }

      .status-banner.resting {
        background: #03a9f4;
        color: white;
      }

      .button-group {
        display: flex;
        flex-wrap: wrap;
        gap: 8px;
        margin-bottom: 16px;
      }

      .category-btn {
        padding: 10px 20px;
        border: 2px solid var(--divider-color);
        border-radius: 24px;
        background: transparent;
        cursor: pointer;
        font-size: 14px;
        transition: all 0.2s;
        color: var(--primary-text-color);
      }

      .category-btn:hover {
        border-color: var(--primary-color);
        color: var(--primary-color);
      }

      .category-btn.selected {
        background: var(--primary-color);
        border-color: var(--primary-color);
        color: white;
      }

      .category-btn.active {
        background: var(--primary-color);
        border-color: var(--primary-color);
        color: white;
        font-weight: 600;
      }

      select {
        width: 100%;
        padding: 12px;
        border: 2px solid var(--divider-color);
        border-radius: 8px;
        font-size: 16px;
        background: var(--card-background-color);
        color: var(--primary-text-color);
        cursor: pointer;
      }

      .doneness-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(100px, 1fr));
        gap: 12px;
      }

      .doneness-btn {
        padding: 12px;
        border: 2px solid var(--divider-color);
        border-radius: 12px;
        background: var(--card-background-color);
        cursor: pointer;
        text-align: center;
        transition: all 0.2s;
        color: var(--primary-text-color);
      }

      .doneness-btn:hover {
        border-color: var(--primary-color);
      }

      .doneness-btn.selected {
        background: var(--primary-color);
        border-color: var(--primary-color);
        color: white;
      }

      .doneness-btn .icon {
        font-size: 20px;
        display: block;
        margin-bottom: 4px;
      }

      .method-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(100px, 1fr));
        gap: 8px;
      }

      .method-btn {
        padding: 10px 8px;
        border: 2px solid var(--divider-color);
        border-radius: 8px;
        background: var(--card-background-color);
        cursor: pointer;
        text-align: center;
        font-size: 13px;
        transition: all 0.2s;
        color: var(--primary-text-color);
      }

      .method-btn:hover {
        border-color: var(--primary-color);
      }

      .method-btn.selected {
        background: var(--primary-color);
        border-color: var(--primary-color);
        color: white;
      }

      .action-container {
        text-align: center;
        margin-top: 16px;
      }

      .temp-display {
        display: flex;
        justify-content: space-between;
        margin-bottom: 16px;
      }

      .temp-current .value {
        font-size: 32px;
        font-weight: 600;
        color: #ff5722;
      }

      .temp-target .value {
        font-size: 18px;
        text-align: right;
      }

      .temp-current .label,
      .temp-target .label {
        font-size: 14px;
        color: var(--secondary-text-color);
      }

      .temp-target .label {
        text-align: right;
      }

      .progress-section {
        margin: 16px 0;
      }

      .progress-bar-container {
        height: 12px;
        background: var(--divider-color);
        border-radius: 6px;
        overflow: hidden;
      }

      .progress-bar {
        height: 100%;
        background: var(--primary-color);
        transition: width 0.5s;
      }

      .progress-info {
        display: flex;
        justify-content: space-between;
        margin-top: 8px;
        font-size: 14px;
      }

      .cook-info {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 16px;
        margin-top: 16px;
      }

      .cook-info-item {
        text-align: center;
        padding: 12px;
        background: var(--primary-background-color);
        border-radius: 8px;
      }

      .cook-info-item .label {
        font-size: 12px;
        color: var(--secondary-text-color);
      }

      .cook-info-item .value {
        font-size: 16px;
        font-weight: 500;
      }

      .action-buttons {
        display: flex;
        gap: 12px;
        margin-top: 16px;
        justify-content: center;
      }

      /* Data source selector styles */
      .source-description {
        font-size: 12px;
        color: var(--secondary-text-color);
        margin-top: 8px;
        font-style: italic;
      }

      /* Recommended doneness styles */
      .recommended-hint {
        font-size: 12px;
        color: var(--secondary-text-color);
        font-weight: normal;
      }

      .doneness-btn.recommended {
        border-color: #ffd700;
      }

      /* Safety indicator dot on doneness buttons (experimental MEATER path) */
      .safety-dot {
        display: inline-block;
        width: 10px;
        height: 10px;
        border-radius: 50%;
        margin-left: 5px;
        vertical-align: middle;
        flex-shrink: 0;
      }
      .safety-dot.safe    { background-color: #4caf50; }
      .safety-dot.caution { background-color: #ff9800; }
      .safety-dot.unsafe  { background-color: #f44336; }

      .doneness-btn .star {
        font-size: 10px;
        margin-left: 4px;
      }

      .doneness-btn .temp-hint {
        display: block;
        font-size: 11px;
        color: var(--secondary-text-color);
        margin-top: 4px;
      }

      .doneness-btn.selected .temp-hint {
        color: rgba(255, 255, 255, 0.8);
      }

      /* Temperature fine-tuning styles */
      .temp-display-setup {
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 12px;
        margin-bottom: 16px;
      }

      .target-temp {
        text-align: center;
      }

      .temp-value {
        font-size: 36px;
        font-weight: bold;
        color: var(--primary-color);
      }

      .temp-fahrenheit {
        font-size: 18px;
        color: var(--secondary-text-color);
        margin-left: 8px;
      }

      .custom-indicator {
        background: #ff9800;
        color: white;
        padding: 4px 8px;
        border-radius: 4px;
        font-size: 12px;
        font-weight: bold;
      }

      .adjust-btn {
        display: block;
        width: 100%;
        padding: 12px;
        border: 2px dashed var(--divider-color);
        border-radius: 8px;
        background: transparent;
        cursor: pointer;
        color: var(--primary-text-color);
        font-size: 14px;
        transition: all 0.2s;
      }

      .adjust-btn:hover {
        border-color: var(--primary-color);
        color: var(--primary-color);
      }

      .adjust-btn.active {
        border-style: solid;
        border-color: var(--primary-color);
        background: var(--primary-color);
        color: white;
      }

      .temp-adjust-section {
        margin-top: 16px;
        padding: 16px;
        background: var(--primary-background-color);
        border-radius: 8px;
      }

      .temp-slider {
        width: 100%;
        height: 8px;
        -webkit-appearance: none;
        appearance: none;
        background: var(--divider-color);
        border-radius: 4px;
        outline: none;
        margin-bottom: 16px;
      }

      .temp-slider::-webkit-slider-thumb {
        -webkit-appearance: none;
        appearance: none;
        width: 24px;
        height: 24px;
        background: var(--primary-color);
        border-radius: 50%;
        cursor: pointer;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
      }

      .temp-slider::-moz-range-thumb {
        width: 24px;
        height: 24px;
        background: var(--primary-color);
        border-radius: 50%;
        cursor: pointer;
        border: none;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
      }

      .temp-adjust-controls {
        display: flex;
        justify-content: center;
        align-items: center;
        gap: 12px;
        margin-bottom: 12px;
      }

      .temp-btn {
        padding: 8px 16px;
        border: 1px solid var(--divider-color);
        border-radius: 4px;
        background: var(--card-background-color);
        cursor: pointer;
        color: var(--primary-text-color);
        font-size: 14px;
        transition: all 0.2s;
      }

      .temp-btn:hover {
        border-color: var(--primary-color);
        color: var(--primary-color);
      }

      .temp-input {
        width: 80px;
        padding: 8px;
        border: 2px solid var(--divider-color);
        border-radius: 4px;
        font-size: 18px;
        text-align: center;
        background: var(--card-background-color);
        color: var(--primary-text-color);
      }

      .reset-btn {
        display: block;
        width: 100%;
        padding: 8px;
        border: none;
        border-radius: 4px;
        background: transparent;
        cursor: pointer;
        color: var(--secondary-text-color);
        font-size: 12px;
        text-decoration: underline;
      }

      .reset-btn:hover {
        color: var(--primary-color);
      }

      /* Ambient temperature and battery display styles */
      .ambient-temp-display {
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 8px;
        padding: 8px 16px;
        background: var(--primary-background-color);
        border-radius: 8px;
        margin-top: 12px;
      }

      .ambient-label {
        color: var(--secondary-text-color);
        font-size: 14px;
      }

      .ambient-value {
        font-size: 16px;
        font-weight: 500;
        color: var(--primary-text-color);
      }

      /* Battery level indicator styles */
      .battery-low {
        color: #f44336 !important;
      }

      .battery-medium {
        color: #ff9800 !important;
      }

      .battery-high {
        color: #4caf50 !important;
      }

      /* Loading state */
      .loading {
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 64px 16px;
        color: var(--secondary-text-color);
        font-size: 16px;
      }

      /* History styles */
      .history-toggle {
        text-align: center;
        margin-top: 16px;
      }

      .history-btn {
        padding: 12px 24px;
        border: 2px solid var(--divider-color);
        border-radius: 8px;
        background: transparent;
        cursor: pointer;
        font-size: 14px;
        color: var(--primary-text-color);
        transition: all 0.2s;
      }

      .history-btn:hover {
        border-color: var(--primary-color);
        color: var(--primary-color);
      }

      .history-btn.active {
        background: var(--primary-color);
        border-color: var(--primary-color);
        color: white;
      }

      .history-card {
        margin-bottom: 12px;
      }

      .history-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 8px;
      }

      .history-header h3 {
        margin: 0;
        font-size: 16px;
      }

      .history-date {
        font-size: 12px;
        color: var(--secondary-text-color);
      }

      .history-details {
        display: flex;
        flex-wrap: wrap;
        gap: 12px;
        margin-bottom: 8px;
      }

      .history-detail {
        font-size: 12px;
        background: var(--primary-background-color);
        padding: 4px 8px;
        border-radius: 4px;
      }

      .history-notes {
        font-size: 13px;
        padding: 8px;
        background: var(--primary-background-color);
        border-radius: 4px;
        margin-bottom: 8px;
      }

      .history-actions {
        display: flex;
        gap: 8px;
      }

      .small-btn {
        padding: 6px 12px;
        border: 1px solid var(--divider-color);
        border-radius: 4px;
        background: transparent;
        cursor: pointer;
        font-size: 12px;
        color: var(--primary-text-color);
      }

      .small-btn:hover {
        border-color: var(--primary-color);
      }

      .small-btn.danger:hover {
        border-color: #f44336;
        color: #f44336;
      }

      .no-history {
        text-align: center;
        color: var(--secondary-text-color);
        padding: 24px;
      }

      /* Notes section */
      .notes-section {
        margin-top: 16px;
      }

      .notes-toggle {
        width: 100%;
        padding: 10px;
        border: 1px dashed var(--divider-color);
        border-radius: 8px;
        background: transparent;
        cursor: pointer;
        color: var(--primary-text-color);
        font-size: 14px;
      }

      .notes-toggle:hover {
        border-color: var(--primary-color);
      }

      .notes-input {
        width: 100%;
        min-height: 80px;
        margin-top: 8px;
        padding: 12px;
        border: 1px solid var(--divider-color);
        border-radius: 8px;
        font-size: 14px;
        resize: vertical;
        background: var(--card-background-color);
        color: var(--primary-text-color);
        font-family: inherit;
      }

      /* Temperature graph */
      .temp-graph-container {
        margin: 16px 0;
        padding: 12px;
        background: var(--primary-background-color);
        border-radius: 8px;
      }

      .temp-graph-container h4 {
        margin: 0 0 8px 0;
        font-size: 14px;
      }

      .temp-graph {
        width: 100%;
        max-height: 120px;
      }

      /* Phase 3.3: Appliances and Recipes Styles */
      .appliances-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
        gap: 16px;
        margin-bottom: 16px;
      }

      .appliance-card .card-content {
        padding: 16px;
      }

      .appliance-card.clickable {
        cursor: pointer;
        transition: transform 0.2s, box-shadow 0.2s;
      }

      .appliance-card.clickable:hover {
        transform: translateY(-2px);
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
      }

      .appliance-header {
        display: flex;
        align-items: center;
        gap: 12px;
        margin-bottom: 16px;
        position: relative;
      }

      .appliance-actions {
        display: flex;
        align-items: center;
        gap: 8px;
        margin-left: auto;
      }

      .settings-icon-btn {
        background: transparent;
        border: none;
        cursor: pointer;
        font-size: 18px;
        padding: 4px;
        opacity: 0.7;
        transition: opacity 0.2s, transform 0.2s;
      }

      .settings-icon-btn:hover {
        opacity: 1;
        transform: scale(1.1);
      }

      .expand-icon {
        font-size: 14px;
        color: var(--secondary-text-color);
        transition: transform 0.2s;
      }

      .appliance-icon {
        font-size: 32px;
      }

      .appliance-info h3 {
        margin: 0;
        font-size: 18px;
        font-weight: 500;
      }

      .appliance-brand {
        color: var(--secondary-text-color);
        font-size: 12px;
        margin-top: 4px;
      }

      .appliance-features h4 {
        margin: 12px 0 8px 0;
        font-size: 14px;
        font-weight: 500;
        color: var(--secondary-text-color);
      }

      .feature-group {
        margin-bottom: 16px;
      }

      .feature-group h4 {
        margin: 12px 0 8px 0;
        font-size: 13px;
        font-weight: 600;
        color: var(--primary-text-color);
      }

      .feature-badges {
        display: flex;
        flex-wrap: wrap;
        gap: 6px;
      }

      .feature-badge {
        display: inline-block;
        padding: 4px 8px;
        background: var(--divider-color);
        border-radius: 12px;
        font-size: 11px;
        color: var(--primary-text-color);
      }

      .feature-badge.standard {
        background: #4caf50;
        color: white;
      }

      .feature-badge.modified {
        background: #ff9800;
        color: white;
      }

      .feature-badge.special {
        background: #9c27b0;
        color: white;
      }

      .feature-badge.more {
        background: var(--primary-color);
        color: white;
      }

      .feature-note-row {
        display: flex;
        align-items: center;
        gap: 8px;
        margin-bottom: 6px;
      }

      .feature-note-row .feature-badge {
        flex-shrink: 0;
      }

      .feature-note-input {
        flex: 1;
        padding: 4px 8px;
        border: 1px solid var(--divider-color);
        border-radius: 4px;
        font-size: 12px;
        background: var(--card-background-color, #fff);
        color: var(--primary-text-color);
      }

      .feature-note-input:focus {
        border-color: var(--primary-color);
        outline: none;
      }

      .save-notes-btn {
        margin-top: 8px;
        padding: 6px 16px;
        background: var(--primary-color);
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 12px;
        cursor: pointer;
      }

      .save-notes-btn:hover {
        opacity: 0.9;
      }

      .appliance-recipes {
        margin-top: 12px;
        padding-top: 12px;
        border-top: 1px solid var(--divider-color);
        font-size: 13px;
        color: var(--secondary-text-color);
      }

      .recipes-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
        gap: 16px;
        margin-bottom: 16px;
      }

      .recipe-card .card-content {
        padding: 16px;
      }

      .recipe-header {
        display: flex;
        justify-content: space-between;
        align-items: flex-start;
        margin-bottom: 12px;
        gap: 8px;
      }

      .recipe-header h3 {
        margin: 0;
        font-size: 16px;
        font-weight: 500;
        flex: 1;
      }

      .quality-badge {
        padding: 4px 8px;
        border-radius: 12px;
        font-size: 11px;
        font-weight: 500;
        white-space: nowrap;
      }

      .quality-badge.quality-excellent {
        background: #4caf50;
        color: white;
      }

      .quality-badge.quality-good {
        background: #8bc34a;
        color: white;
      }

      .quality-badge.quality-acceptable {
        background: #ff9800;
        color: white;
      }

      .quality-badge.quality-poor {
        background: #f44336;
        color: white;
      }

      .recipe-description {
        margin: 0 0 12px 0;
        font-size: 13px;
        color: var(--secondary-text-color);
        line-height: 1.4;
      }

      .recipe-meta {
        margin-bottom: 12px;
        font-size: 12px;
        color: var(--secondary-text-color);
      }

      .recipe-score {
        display: flex;
        align-items: center;
        gap: 4px;
      }

      .confidence {
        font-style: italic;
      }

      .recipe-appliances {
        margin-bottom: 12px;
        font-size: 13px;
      }

      .appliance-chip {
        display: inline-block;
        padding: 4px 8px;
        margin: 2px;
        background: var(--primary-color);
        color: white;
        border-radius: 12px;
        font-size: 11px;
      }

      .recipe-notes {
        margin-bottom: 12px;
        padding: 8px;
        background: var(--divider-color);
        border-radius: 4px;
        font-size: 12px;
        color: var(--secondary-text-color);
      }

      .recipe-features {
        font-size: 12px;
        color: var(--secondary-text-color);
      }

      .feature-chip {
        display: inline-block;
        padding: 3px 6px;
        margin: 2px;
        background: var(--divider-color);
        border-radius: 10px;
        font-size: 10px;
      }

      .help-text {
        padding: 16px;
        margin: 16px 0;
        background: var(--divider-color);
        border-radius: 8px;
        font-size: 13px;
        color: var(--secondary-text-color);
      }

      .help-text p {
        margin: 8px 0;
      }

      .help-text p:first-child {
        margin-top: 0;
      }

      .help-text p:last-child {
        margin-bottom: 0;
      }

      /* Phase 3.4: Recipe Detail View Styles */
      .recipe-card.clickable {
        cursor: pointer;
        transition: transform 0.2s, box-shadow 0.2s;
      }

      .recipe-card.clickable:hover {
        transform: translateY(-2px);
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
      }

      .recipe-action {
        margin-top: 12px;
        text-align: right;
      }

      .click-hint {
        font-size: 12px;
        color: var(--primary-color);
        font-weight: 500;
      }

      .back-btn {
        padding: 8px 16px;
        background: var(--primary-color);
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 14px;
        margin-left: 16px;
      }

      .back-btn:hover {
        opacity: 0.9;
      }

      .recipe-detail-card {
        margin-bottom: 16px;
      }

      .recipe-detail-header {
        display: flex;
        justify-content: space-between;
        align-items: flex-start;
        margin-bottom: 16px;
        gap: 16px;
      }

      .recipe-detail-header h2 {
        margin: 0;
        font-size: 24px;
        font-weight: 500;
        flex: 1;
      }

      .quality-badge.large {
        font-size: 13px;
        padding: 6px 12px;
      }

      .recipe-description.large {
        font-size: 15px;
        line-height: 1.5;
        margin: 0 0 20px 0;
        color: var(--primary-text-color);
      }

      .recipe-detail-meta {
        display: flex;
        gap: 24px;
        margin-bottom: 24px;
        padding: 12px;
        background: var(--divider-color);
        border-radius: 4px;
      }

      .meta-item {
        font-size: 14px;
      }

      .meta-item strong {
        margin-right: 4px;
      }

      .appliances-section,
      .alternatives-section,
      .features-section,
      .notes-section {
        margin-bottom: 24px;
      }

      .appliances-section h3,
      .alternatives-section h3,
      .features-section h3,
      .notes-section h3 {
        margin: 0 0 12px 0;
        font-size: 16px;
        font-weight: 500;
      }

      .appliance-list-detail {
        display: flex;
        flex-direction: column;
        gap: 8px;
      }

      .appliance-item {
        display: flex;
        align-items: center;
        gap: 12px;
        padding: 12px;
        background: var(--divider-color);
        border-radius: 4px;
      }

      .appliance-item .appliance-icon {
        font-size: 24px;
      }

      .appliance-item .appliance-name {
        flex: 1;
        font-weight: 500;
      }

      .status-check {
        color: #4caf50;
        font-size: 13px;
        font-weight: 500;
      }

      .alternative-combos {
        display: flex;
        flex-wrap: wrap;
        gap: 8px;
      }

      .combo-btn {
        padding: 8px 16px;
        background: var(--primary-color);
        color: white;
        border: none;
        border-radius: 20px;
        cursor: pointer;
        font-size: 13px;
        transition: opacity 0.2s;
      }

      .combo-btn:hover {
        opacity: 0.85;
      }

      .feature-list-detail {
        display: flex;
        flex-direction: column;
        gap: 8px;
      }

      .feature-item {
        display: flex;
        align-items: center;
        gap: 8px;
        padding: 8px;
        background: var(--divider-color);
        border-radius: 4px;
      }

      .feature-item.optional {
        opacity: 0.7;
      }

      .feature-icon {
        width: 20px;
        text-align: center;
        font-weight: bold;
        color: #4caf50;
      }

      .feature-item.optional .feature-icon {
        color: var(--secondary-text-color);
      }

      .feature-name {
        flex: 1;
        font-size: 14px;
      }

      .status-badge {
        padding: 2px 8px;
        background: #4caf50;
        color: white;
        border-radius: 10px;
        font-size: 11px;
      }

      .recipe-notes-detail {
        padding: 12px;
        background: var(--divider-color);
        border-radius: 4px;
        margin: 0;
        font-size: 14px;
        line-height: 1.5;
        font-style: italic;
      }

      .recipe-actions {
        display: flex;
        gap: 12px;
        margin-top: 24px;
        padding-top: 24px;
        border-top: 1px solid var(--divider-color);
      }

      .primary-btn {
        flex: 1;
        padding: 12px 24px;
        background: #4caf50;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
        font-weight: 500;
        transition: opacity 0.2s;
      }

      .primary-btn:hover {
        opacity: 0.9;
      }

      .secondary-btn {
        padding: 12px 24px;
        background: var(--divider-color);
        color: var(--primary-text-color);
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
        transition: opacity 0.2s;
      }

      .secondary-btn:hover {
        opacity: 0.8;
      }

      /* Phase 3.5: Loading and Error States */
      .loading-state {
        text-align: center;
        padding: 32px 16px;
      }

      .spinner {
        border: 4px solid var(--divider-color);
        border-top: 4px solid var(--primary-color);
        border-radius: 50%;
        width: 40px;
        height: 40px;
        animation: spin 1s linear infinite;
        margin: 0 auto 16px auto;
      }

      @keyframes spin {
        0% { transform: rotate(0deg); }
        100% { transform: rotate(360deg); }
      }

      .loading-state p {
        margin: 0;
        color: var(--secondary-text-color);
        font-size: 14px;
      }

      .ai-generation-loading {
        padding: 40px 24px;
      }

      .ai-status-primary {
        font-size: 16px !important;
        font-weight: 600;
        color: var(--primary-text-color) !important;
        margin: 0 0 6px 0 !important;
        transition: opacity 0.3s ease;
      }

      .ai-status-elapsed {
        font-size: 12px !important;
        color: var(--disabled-text-color, #9e9e9e) !important;
        margin: 0 0 10px 0 !important;
        font-variant-numeric: tabular-nums;
      }

      .ai-status-hint {
        margin: 8px auto 0 auto !important;
        max-width: 320px;
        font-size: 12px !important;
        color: var(--secondary-text-color) !important;
        background: var(--secondary-background-color, rgba(0,0,0,0.05));
        border-radius: 6px;
        padding: 8px 12px;
        line-height: 1.4;
      }

      .error-card {
        background: #ffebee;
        border-left: 4px solid #f44336;
      }

      .error-message {
        text-align: center;
        color: #c62828;
      }

      .error-message p {
        margin: 0 0 12px 0;
        font-weight: 500;
      }

      .retry-btn {
        padding: 8px 16px;
        background: #f44336;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 14px;
        transition: opacity 0.2s;
      }

      .retry-btn:hover {
        opacity: 0.9;
      }

      button:disabled {
        opacity: 0.5;
        cursor: not-allowed;
      }

      /* AI Recipe Builder Styles */
      .ai-section {
        margin-bottom: 32px;
      }

      .ai-section h3 {
        margin: 0 0 16px 0;
        font-size: 18px;
        font-weight: 600;
        color: var(--primary-text-color);
      }

      .ai-section h4 {
        margin: 16px 0 8px 0;
        font-size: 14px;
        font-weight: 500;
        color: var(--secondary-text-color);
        text-transform: uppercase;
        letter-spacing: 0.5px;
      }

      .cooking-styles-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(180px, 1fr));
        gap: 12px;
        margin-top: 12px;
      }

      .cooking-style-btn {
        padding: 16px;
        border: 2px solid var(--divider-color);
        border-radius: 8px;
        background: var(--card-background-color);
        color: var(--primary-text-color);
        font-size: 14px;
        cursor: pointer;
        transition: all 0.2s;
      }

      .cooking-style-btn:hover {
        border-color: var(--primary-color);
        background: var(--primary-color);
        color: white;
      }

      .cooking-style-btn.selected {
        border-color: var(--primary-color);
        background: var(--primary-color);
        color: white;
        font-weight: 600;
      }

      .ingredient-category {
        margin-bottom: 24px;
      }

      .ingredients-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(140px, 1fr));
        gap: 8px;
        margin-top: 8px;
      }

      .ingredient-btn {
        padding: 12px;
        border: 1px solid var(--divider-color);
        border-radius: 6px;
        background: var(--card-background-color);
        color: var(--primary-text-color);
        font-size: 13px;
        cursor: pointer;
        transition: all 0.2s;
        text-align: center;
      }

      .ingredient-btn:hover {
        border-color: var(--accent-color);
        background: var(--accent-color);
        color: white;
      }

      .ingredient-btn.selected {
        border-color: var(--accent-color);
        background: var(--accent-color);
        color: white;
        font-weight: 600;
      }

      .appliances-info {
        display: flex;
        flex-wrap: wrap;
        gap: 8px;
      }

      .appliance-tag {
        display: inline-block;
        padding: 6px 12px;
        background: var(--primary-color);
        color: white;
        border-radius: 16px;
        font-size: 12px;
        font-weight: 500;
      }

      .ai-actions {
        margin-top: 24px;
        display: flex;
        gap: 12px;
        flex-wrap: wrap;
      }

      .ai-actions button {
        flex: 1;
        min-width: 200px;
      }

      .primary-btn.large {
        padding: 16px 24px;
        font-size: 16px;
        font-weight: 600;
      }

      .ai-suggestions-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
        gap: 16px;
        margin-bottom: 24px;
      }

      .ai-suggestion-card {
        border: 2px solid var(--divider-color);
        border-radius: 12px;
        padding: 20px;
        cursor: pointer;
        transition: all 0.3s;
        background: var(--card-background-color);
      }

      .ai-suggestion-card:hover {
        border-color: var(--primary-color);
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        transform: translateY(-2px);
      }

      .ai-suggestion-card h3 {
        margin: 0 0 12px 0;
        font-size: 18px;
        font-weight: 600;
        color: var(--primary-text-color);
      }

      .suggestion-description {
        margin: 0 0 12px 0;
        color: var(--secondary-text-color);
        font-size: 14px;
        line-height: 1.5;
      }

      .suggestion-meta {
        display: flex;
        flex-wrap: wrap;
        gap: 12px;
        margin-bottom: 12px;
        font-size: 13px;
        color: var(--secondary-text-color);
      }

      .suggestion-ingredients {
        display: flex;
        flex-wrap: wrap;
        gap: 6px;
        margin-bottom: 16px;
      }

      .ingredient-tag {
        display: inline-flex;
        align-items: center;
        padding: 4px 10px;
        background: var(--secondary-background-color);
        border: 1px solid transparent;
        color: var(--secondary-text-color);
        border-radius: 12px;
        font-size: 13px;
        user-select: none;
        transition: background 0.15s, border-color 0.15s;
      }

      .ingredient-tag:hover {
        background: var(--divider-color);
      }

      .view-recipe-btn {
        width: 100%;
        padding: 10px;
        background: var(--primary-color);
        color: white;
        border: none;
        border-radius: 6px;
        font-size: 14px;
        font-weight: 600;
        cursor: pointer;
        transition: opacity 0.2s;
      }

      .view-recipe-btn:hover {
        opacity: 0.9;
      }

      .recipe-overview {
        margin-bottom: 24px;
      }

      .recipe-meta {
        display: flex;
        flex-wrap: wrap;
        gap: 16px;
        margin-top: 12px;
        padding: 12px;
        background: var(--secondary-background-color);
        border-radius: 8px;
        font-size: 14px;
      }

      .probe-info {
        padding: 16px;
        background: #e3f2fd;
        border-left: 4px solid #2196f3;
        border-radius: 4px;
        margin-bottom: 24px;
      }

      .probe-info p {
        margin: 0 0 4px 0;
      }

      .recipe-section {
        margin-bottom: 32px;
      }

      .recipe-section h3 {
        margin: 0 0 16px 0;
        font-size: 18px;
        font-weight: 600;
        color: var(--primary-text-color);
      }

      .ingredients-list,
      .instructions-list,
      .tips-list {
        margin: 0;
        padding-left: 24px;
      }

      .ingredients-list li,
      .instructions-list li,
      .tips-list li {
        margin-bottom: 8px;
        line-height: 1.6;
      }

      .cooking-phase {
        padding: 12px;
        background: var(--secondary-background-color);
        border-radius: 6px;
        margin-bottom: 8px;
        font-size: 14px;
      }

      .cooking-phase strong {
        display: block;
        margin-bottom: 4px;
        color: var(--primary-text-color);
      }

      .cooking-phase span {
        color: var(--secondary-text-color);
      }

      .warning-message {
        padding: 24px;
        background: #fff3cd;
        border-left: 4px solid #ffc107;
        border-radius: 4px;
        text-align: center;
      }

      .warning-message p {
        margin: 0 0 12px 0;
      }

      .warning-message p:last-child {
        margin-bottom: 0;
      }

      .loading-spinner {
        text-align: center;
        padding: 48px 24px;
      }

      .loading-spinner p {
        margin: 0 0 12px 0;
        font-size: 16px;
      }

      .loading-spinner p:first-child {
        font-size: 20px;
        font-weight: 600;
      }

      /* Modal styles */
      .modal-overlay {
        position: fixed;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        background: rgba(0, 0, 0, 0.5);
        display: flex;
        align-items: center;
        justify-content: center;
        z-index: 9999;
        padding: 20px;
      }

      .modal-dialog {
        background: var(--card-background-color);
        border-radius: 12px;
        max-width: 600px;
        width: 100%;
        max-height: 90vh;
        overflow-y: auto;
        box-shadow: 0 8px 32px rgba(0, 0, 0, 0.2);
      }

      .modal-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 20px 24px;
        border-bottom: 1px solid var(--divider-color);
      }

      .modal-header h2 {
        margin: 0;
        font-size: 20px;
        font-weight: 600;
      }

      .modal-close {
        background: none;
        border: none;
        font-size: 24px;
        cursor: pointer;
        padding: 0;
        width: 32px;
        height: 32px;
        display: flex;
        align-items: center;
        justify-content: center;
        border-radius: 4px;
        color: var(--secondary-text-color);
      }

      .modal-close:hover {
        background: var(--secondary-background-color);
        color: var(--primary-text-color);
      }

      .modal-body {
        padding: 24px;
      }

      .modal-footer {
        display: flex;
        justify-content: flex-end;
        gap: 12px;
        padding: 16px 24px;
        border-top: 1px solid var(--divider-color);
      }

      .icon-button {
        background: none;
        border: none;
        font-size: 20px;
        cursor: pointer;
        padding: 8px;
        border-radius: 4px;
        transition: background 0.2s;
      }

      .icon-button:hover {
        background: var(--secondary-background-color);
      }

      /* ========================================================================
         PHASE 1: GUI REDESIGN STYLES
         ======================================================================== */

      /* Welcome Screen */
      .welcome-header {
        text-align: center;
        margin-bottom: 32px;
        position: relative;
      }

      .welcome-header h1 {
        font-size: 32px;
        margin: 0 0 8px 0;
        color: var(--primary-text-color);
        overflow-wrap: break-word;
        word-break: break-word;
      }

      .welcome-subtitle {
        font-size: 18px;
        color: var(--secondary-text-color);
        margin: 0;
      }

      /* Appliance Grid */
      .appliance-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(min(200px, 100%), 1fr));
        gap: 16px;
        margin-bottom: 24px;
      }

      .appliance-card {
        transition: transform 0.2s, box-shadow 0.2s;
      }

      .appliance-card:hover {
        transform: translateY(-4px);
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
      }

      .appliance-card-content {
        text-align: center;
        padding: 24px 16px !important;
      }

      .appliance-icon {
        font-size: 48px;
        margin-bottom: 12px;
      }

      .appliance-name {
        font-size: 18px;
        font-weight: 600;
        margin-bottom: 4px;
        color: var(--primary-text-color);
        overflow-wrap: break-word;
        word-break: break-word;
      }

      .appliance-model {
        font-size: 14px;
        color: var(--secondary-text-color);
        overflow-wrap: break-word;
        word-break: break-word;
      }

      /* Previous Cooks Card */
      .previous-cooks-card {
        transition: transform 0.2s, box-shadow 0.2s;
      }

      .previous-cooks-card:hover {
        transform: translateY(-4px);
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
      }

      /* Ongoing Cooks badge on welcome screen */
      .ongoing-cooks-card {
        margin-bottom: 16px;
        border: 2px solid var(--primary-color);
        border-radius: 12px;
        animation: ongoing-pulse 2s ease-in-out infinite;
      }

      @keyframes ongoing-pulse {
        0%, 100% { border-color: var(--primary-color); }
        50% { border-color: var(--warning-color, #ff9800); }
      }

      .ongoing-cooks-title {
        margin: 0 0 12px 0;
        font-size: 1.1em;
        color: var(--primary-text-color);
      }

      .ongoing-cook-item {
        margin-bottom: 8px;
        transition: transform 0.15s, box-shadow 0.15s;
      }

      .ongoing-cook-item:hover {
        transform: translateY(-2px);
        box-shadow: 0 2px 6px rgba(0, 0, 0, 0.15);
      }

      .previous-cooks-content {
        display: flex;
        align-items: center;
        gap: 20px;
        padding: 24px !important;
      }

      .previous-cooks-icon {
        font-size: 48px;
        flex-shrink: 0;
      }

      .previous-cooks-text {
        min-width: 0;
        overflow-wrap: break-word;
        word-break: break-word;
      }

      .previous-cooks-text h3 {
        margin: 0 0 8px 0;
        font-size: 20px;
        color: var(--primary-text-color);
      }

      .previous-cooks-text p {
        margin: 0;
        color: var(--secondary-text-color);
      }

      /* Path Header */
      .path-header {
        margin-bottom: 24px;
        position: relative;
      }

      .path-header-title-row {
        display: flex;
        align-items: center;
        gap: 8px;
      }

      .path-header h2 {
        font-size: 24px;
        margin: 16px 0 0 0;
        color: var(--primary-text-color);
      }

      .back-btn {
        background: none;
        border: none;
        color: var(--primary-color);
        cursor: pointer;
        font-size: 14px;
        padding: 8px 0;
        display: inline-flex;
        align-items: center;
        gap: 4px;
        transition: opacity 0.2s;
      }

      .back-btn:hover {
        opacity: 0.8;
      }

      .help-btn {
        position: absolute;
        top: 0;
        right: 0;
        background: none;
        border: 1px solid var(--divider-color, #ddd);
        border-radius: 50%;
        width: 28px;
        height: 28px;
        display: inline-flex;
        align-items: center;
        justify-content: center;
        cursor: pointer;
        color: var(--secondary-text-color);
        font-size: 13px;
        font-weight: 700;
        line-height: 1;
        transition: background 0.15s, color 0.15s, border-color 0.15s;
        flex-shrink: 0;
      }

      .help-btn:hover {
        background: var(--primary-color);
        color: white;
        border-color: var(--primary-color);
      }

      /* Path Buttons */
      .path-buttons {
        display: flex;
        flex-direction: column;
        gap: 16px;
      }

      .path-card {
        transition: transform 0.2s, box-shadow 0.2s;
      }

      .path-card:hover {
        transform: translateY(-2px);
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
      }

      .path-card-content {
        display: flex;
        align-items: center;
        gap: 20px;
        padding: 20px !important;
      }

      .path-icon {
        font-size: 40px;
        flex-shrink: 0;
      }

      .path-card-content h3 {
        margin: 0 0 8px 0;
        font-size: 18px;
        color: var(--primary-text-color);
      }

      .path-card-content p {
        margin: 0;
        color: var(--secondary-text-color);
        font-size: 14px;
      }

      /* Appliance Info */
      .appliance-info h3 {
        margin: 0 0 12px 0;
        font-size: 20px;
      }

      .appliance-features {
        margin: 0 0 16px 0;
        color: var(--secondary-text-color);
      }

      .secondary-appliances {
        margin-top: 16px;
        padding-top: 16px;
        border-top: 1px solid var(--divider-color);
      }

      .secondary-appliances h4 {
        margin: 0 0 12px 0;
        font-size: 16px;
      }

      .checkbox-label {
        display: block;
        margin-bottom: 8px;
        cursor: pointer;
      }

      .checkbox-label input[type="checkbox"] {
        margin-right: 8px;
      }

      /* Error Message */
      .error-message {
        text-align: center;
        padding: 24px;
      }

      .error-message p {
        margin-bottom: 16px;
        color: var(--error-color);
      }

      /* Clickable Cards */
      .clickable {
        cursor: pointer;
      }

      /* ========================================
         PHASE 4: RECIPE COOK FLOW STYLES
         ======================================== */

      /* Recipe Cook Header */
      .recipe-cook-header {
        background: var(--primary-color);
        color: white;
        padding: 20px;
        border-radius: 8px;
        margin-bottom: 16px;
        position: relative;
      }

      .recipe-cook-help-btn {
        border-color: rgba(255,255,255,0.5);
        color: rgba(255,255,255,0.85);
      }

      .recipe-cook-help-btn:hover {
        background: rgba(255,255,255,0.25);
        color: white;
        border-color: white;
      }

      .recipe-cook-header h2 {
        margin: 0 0 8px 0;
        font-size: 24px;
      }

      .recipe-cook-nav-buttons {
        display: flex;
        flex-direction: column;
        gap: 6px;
        flex-shrink: 0;
      }

      .recipe-nav-btn {
        width: 44px;
        height: 44px;
        border-radius: 8px;
        border: 2px solid rgba(255,255,255,0.4);
        background: rgba(255,255,255,0.15);
        color: white;
        font-size: 1.2em;
        cursor: pointer;
        display: flex;
        align-items: center;
        justify-content: center;
        transition: background 0.2s;
      }

      .recipe-nav-btn:hover {
        background: rgba(255,255,255,0.3);
      }

      .recipe-nav-btn:disabled {
        opacity: 0.4;
        cursor: not-allowed;
      }

      .recipe-nav-btn.home-btn {
        font-size: 1.3em;
      }

      .recipe-nav-btn.save-btn {
        background: rgba(76, 175, 80, 0.6);
        border-color: rgba(76, 175, 80, 0.8);
      }

      .recipe-cook-serving {
        margin: 0;
        opacity: 0.9;
        font-size: 14px;
      }

      /* Recipe Cook Overview */
      .recipe-cook-overview {
        padding: 8px 0;
      }

      .recipe-cook-overview h3 {
        margin: 0 0 16px 0;
        font-size: 20px;
        color: var(--primary-text-color);
      }

      .recipe-description {
        margin: 0 0 16px 0;
        color: var(--secondary-text-color);
        line-height: 1.5;
      }

      .recipe-cook-ingredients {
        margin: 16px 0;
      }

      .recipe-cook-ingredients h4,
      .recipe-cook-ingredients h5 {
        margin: 0 0 12px 0;
        font-size: 16px;
        color: var(--primary-text-color);
      }

      .recipe-cook-ingredients ul {
        list-style: none;
        padding: 0;
        margin: 0;
      }

      .recipe-cook-ingredients li {
        padding: 8px 12px;
        margin-bottom: 6px;
        border-radius: 6px;
        transition: all 0.2s;
      }

      .recipe-cook-ingredients li.active-ingredient.new-ingredient {
        color: var(--primary-text-color);
        font-weight: 700;
      }

      .recipe-cook-ingredients li.active-ingredient.repeat-ingredient {
        color: #4caf50;
        font-weight: 700;
      }

      /* Active ingredients list (single column, grey box on top) */
      .ingredients-active {
        list-style: none;
        padding: 8px;
        margin: 0 0 12px 0;
        background: var(--divider-color);
        border-radius: 6px;
      }

      /* Inactive ingredients list (two-column grid below) */
      .ingredients-inactive {
        list-style: none;
        padding: 0;
        margin: 0;
        display: grid;
        grid-template-columns: 1fr 1fr;
        gap: 4px 12px;
      }

      .ingredients-inactive li {
        padding: 6px 8px;
        font-size: 0.9em;
        opacity: 0.75;
        background: transparent;
      }

      /* Recipe Step Overview */
      .recipe-cook-step-overview {
        margin: 16px 0;
      }

      .recipe-cook-step-overview h4 {
        margin: 0 0 12px 0;
        font-size: 16px;
        color: var(--primary-text-color);
      }

      .recipe-cook-step-overview ol {
        padding-left: 24px;
        margin: 0;
      }

      .recipe-cook-step-overview li {
        padding: 8px 0;
        color: var(--primary-text-color);
      }

      .step-time {
        color: var(--secondary-text-color);
        font-size: 0.9em;
      }

      /* Recipe Step Detail */
      .recipe-cook-step-detail {
        padding: 8px 0;
      }

      .step-header {
        margin-bottom: 20px;
        padding-bottom: 16px;
        border-bottom: 2px solid var(--divider-color);
      }

      .step-header h3 {
        margin: 0 0 8px 0;
        font-size: 14px;
        color: var(--secondary-text-color);
        text-transform: uppercase;
        letter-spacing: 0.5px;
      }

      .step-header h4 {
        margin: 0 0 8px 0;
        font-size: 22px;
        color: var(--primary-text-color);
      }

      .step-header .step-time {
        margin: 0;
        font-size: 14px;
      }

      .step-instructions {
        margin: 20px 0;
        padding: 16px;
        background: var(--card-background-color);
        border-radius: 4px;
      }

      .step-instructions p {
        margin: 0;
        line-height: 1.6;
        font-size: 16px;
        color: var(--primary-text-color);
      }

      .step-ingredients {
        margin: 16px 0;
        padding: 12px;
        background: var(--divider-color);
        border-radius: 6px;
      }

      .step-ingredients h5 {
        margin: 0 0 8px 0;
        font-size: 14px;
        color: var(--primary-text-color);
      }

      .step-ingredients ul {
        list-style: none;
        padding: 0;
        margin: 0;
      }

      .step-ingredients li {
        padding: 4px 0;
        color: var(--primary-text-color);
      }

      .step-temp,
      .step-notes {
        margin: 12px 0;
        padding: 12px;
        background: var(--divider-color);
        border-radius: 6px;
        font-size: 14px;
      }

      /* Recipe Cook Finish Page */
      .recipe-cook-finish {
        padding: 8px 0;
      }

      .recipe-cook-finish h3 {
        margin: 0 0 8px 0;
        font-size: 24px;
        color: var(--primary-text-color);
        text-align: center;
      }

      .recipe-cook-finish > p {
        margin: 0 0 24px 0;
        text-align: center;
        color: var(--secondary-text-color);
      }

      /* Recipe Cook Rating */
      .recipe-cook-rating {
        margin: 24px 0;
        padding: 20px;
        background: var(--divider-color);
        border-radius: 8px;
      }

      .recipe-cook-rating h4 {
        margin: 0 0 8px 0;
        font-size: 18px;
        color: var(--primary-text-color);
      }

      .rating-description {
        margin: 0 0 12px 0;
        font-size: 14px;
        color: var(--secondary-text-color);
      }

      .star-selector {
        display: flex;
        gap: 8px;
        justify-content: center;
      }

      .star-btn {
        background: none;
        border: none;
        font-size: 32px;
        cursor: pointer;
        padding: 4px;
        transition: transform 0.2s;
        color: var(--secondary-text-color);
      }

      .star-btn:hover {
        transform: scale(1.1);
      }

      .star-btn.active {
        color: #ffc107;
      }

      /* Recipe Cook Notes */
      .recipe-cook-notes {
        margin: 24px 0;
      }

      .recipe-cook-notes h4 {
        margin: 0 0 12px 0;
        font-size: 16px;
        color: var(--primary-text-color);
      }

      .recipe-cook-notes textarea {
        width: 100%;
        padding: 12px;
        border: 2px solid var(--divider-color);
        border-radius: 8px;
        font-size: 14px;
        font-family: inherit;
        background: var(--card-background-color);
        color: var(--primary-text-color);
        resize: vertical;
        box-sizing: border-box;
      }

      .recipe-cook-notes textarea:focus {
        outline: none;
        border-color: var(--primary-color);
      }

      .rating-required {
        margin: 16px 0 0 0;
        padding: 12px;
        background: var(--error-color);
        color: white;
        border-radius: 6px;
        text-align: center;
        font-size: 14px;
      }

      /* Recipe Cook Footer (kept for backward compatibility) */
      .recipe-cook-footer {
        display: none;
      }

      .meater-probe-info {
        display: flex;
        flex-direction: column;
        align-items: center;
        gap: 4px;
      }

      .probe-temp {
        font-size: 18px;
        font-weight: 600;
        color: var(--primary-text-color);
      }

      .probe-status {
        font-size: 12px;
        color: var(--secondary-text-color);
      }

      /* Mobile Responsive */
      @media (max-width: 600px) {
        .appliance-grid {
          grid-template-columns: 1fr;
        }

        .welcome-header h1 {
          font-size: 24px;
        }

        .welcome-subtitle {
          font-size: 16px;
        }

        .path-card-content {
          flex-direction: column;
          text-align: center;
        }

        .previous-cooks-content {
          flex-direction: column;
          text-align: center;
        }

        /* Recipe Cook Flow Mobile */
        .ingredients-inactive {
          grid-template-columns: 1fr;
        }

        .star-selector {
          flex-wrap: wrap;
        }

        .star-btn {
          font-size: 28px;
        }
      }
      /* ========================================
         PHASE 6: AI RECIPE BUILDER STYLES
         ======================================== */

      .info-text {
        color: var(--secondary-text-color);
        margin-bottom: 16px;
        font-size: 14px;
      }

      .ingredient-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(160px, 1fr));
        gap: 8px;
        margin-bottom: 20px;
      }

      .ingredient-checkbox {
        display: flex;
        align-items: center;
        gap: 8px;
        padding: 8px 12px;
        background: var(--secondary-background-color);
        border-radius: 8px;
        cursor: pointer;
        font-size: 14px;
        transition: background 0.2s;
      }

      .ingredient-checkbox:hover {
        background: var(--primary-color);
        color: white;
      }

      .ingredient-checkbox input[type="checkbox"] {
        width: 16px;
        height: 16px;
        cursor: pointer;
      }

      .ingredient-custom {
        margin-bottom: 20px;
      }

      .ingredient-custom input {
        width: 100%;
        padding: 10px 14px;
        border: 1px solid var(--divider-color);
        border-radius: 8px;
        background: var(--secondary-background-color);
        color: var(--primary-text-color);
        font-size: 14px;
        box-sizing: border-box;
      }

      .ingredient-tags {
        display: flex;
        flex-wrap: wrap;
        gap: 8px;
        margin-bottom: 16px;
      }

      .ingredient-tag button {
        background: none;
        border: none;
        color: inherit;
        cursor: pointer;
        font-size: 14px;
        padding: 0 2px;
        margin-left: 4px;
      }

      .ingredient-tag--compulsory {
        background: rgba(var(--rgb-primary-color, 3, 169, 244), 0.15);
        border: 1px solid var(--primary-color);
        color: var(--primary-text-color);
      }

      .ingredient-tag .compulsory-star {
        font-size: 11px;
        margin-right: 3px;
      }

      .ingredient-remove-btn {
        background: none;
        border: none;
        color: inherit;
        cursor: pointer;
        font-size: 14px;
        padding: 0 2px;
        margin-left: 4px;
      }

      .selected-ingredients {
        margin-bottom: 20px;
      }

      .style-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
        gap: 12px;
        margin-bottom: 20px;
      }

      .style-card {
        border: 2px solid transparent;
        transition: border-color 0.2s, transform 0.1s;
      }

      .style-card:hover {
        transform: translateY(-2px);
      }

      .style-card.selected {
        border-color: var(--primary-color);
        background: rgba(var(--rgb-primary-color), 0.05);
      }

      .style-icon {
        font-size: 32px;
        margin-bottom: 8px;
      }

      .recipe-suggestions {
        display: flex;
        flex-direction: column;
        gap: 16px;
      }

      .recipe-suggestion-card {
        border-left: 4px solid var(--primary-color);
      }

      .recipe-description {
        color: var(--secondary-text-color);
        margin-bottom: 12px;
        font-size: 14px;
      }

      .recipe-details {
        display: flex;
        flex-wrap: wrap;
        gap: 16px;
        margin-bottom: 16px;
        padding: 12px;
        background: var(--secondary-background-color);
        border-radius: 8px;
      }

      .detail-item {
        font-size: 14px;
      }

      .recipe-ingredients ul {
        columns: 2;
        padding-left: 20px;
        margin: 8px 0 16px 0;
      }

      .recipe-ingredients li {
        margin-bottom: 4px;
        font-size: 14px;
      }

      .action-buttons {
        display: flex;
        gap: 12px;
        margin-top: 16px;
        justify-content: center;
      }

      .secondary-btn {
        padding: 10px 20px;
        background: var(--secondary-background-color);
        color: var(--primary-text-color);
        border: 1px solid var(--divider-color);
        border-radius: 8px;
        font-size: 14px;
        cursor: pointer;
        transition: background 0.2s;
      }

      .secondary-btn:hover {
        background: var(--divider-color);
      }

      .appliance-info {
        margin-bottom: 8px;
      }

      .appliance-info-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
      }

      .feature-notes-editor {
        margin-top: 8px;
        padding-top: 8px;
        border-top: 1px solid var(--divider-color);
      }

      .appliance-features {
        color: var(--secondary-text-color);
        font-size: 14px;
      }

      .secondary-appliances {
        margin-top: 12px;
        padding-top: 12px;
        border-top: 1px solid var(--divider-color);
      }

      .checkbox-label {
        display: flex;
        align-items: center;
        gap: 8px;
        padding: 6px 0;
        cursor: pointer;
        font-size: 14px;
      }

      .checkbox-label input[type="checkbox"] {
        width: 16px;
        height: 16px;
        cursor: pointer;
      }

      @media (max-width: 600px) {
        .ingredient-grid {
          grid-template-columns: repeat(auto-fill, minmax(140px, 1fr));
        }
        .style-grid {
          grid-template-columns: 1fr;
        }
        .recipe-ingredients ul {
          columns: 1;
        }
      }
    `;
  }
}

// Register under a single stable name.
// Cache-busting is handled by the ?v=PANEL_VERSION query string on the URL,
// not by a versioned element name.  Registering the same class under two
// different names triggers "this constructor has already been used with this
// registry" in HA's @webcomponents/scoped-custom-element-registry polyfill.
const PANEL_VERSION = "117";

if (!customElements.get('kitchen-cooking-card')) {
  customElements.define('kitchen-cooking-card', KitchenCookingPanel);
}

// ─── Module-level blank-screen recovery ───────────────────────────────────────
// Root cause (identified from HA's partial-panel-resolver.ts + ha-panel-custom.ts):
//
//   HA's "suspendWhenHidden" feature: after the browser tab is hidden for 5
//   minutes, partial-panel-resolver REMOVES ha-panel-custom from the DOM.
//   ha-panel-custom.disconnectedCallback() then calls _cleanupPanel() which
//   destroys our kitchen-cooking-card child and clears its _setProperties ref.
//
//   When the user returns, partial-panel-resolver re-appends the same
//   ha-panel-custom element (connectedCallback fires).
//
//   • Newer HA (2024.x+): connectedCallback has a guard that detects the missing
//     child and calls _createPanel() → our element is asynchronously recreated.
//   • Older HA: connectedCallback does NOT have this guard → ha-panel-custom is
//     back in the DOM but permanently empty → persistent blank screen.
//
//   The in-element visibilitychange / focus handlers wired in connectedCallback()
//   are REMOVED during disconnectedCallback(), so they cannot help here: our
//   element has already been destroyed before the user returns to the tab.
//
// Fix:
//   A module-level recovery function that is never garbage-collected as long as
//   the module is loaded.  When the tab becomes visible we check whether
//   ha-panel-custom is alive but empty, and if so call
//   haPanel.requestUpdate('panel', null).  This makes ha-panel-custom.update()
//   see changedProps.has('panel') with oldValue=null ≠ actual panel, causing it
//   to call _createPanel() which recreates our element.
//
// Safe on all HA versions:
//   • New HA: our element is already present within ~50 ms of connectedCallback;
//     the 500 ms delay means the check finds it → no action taken.
//   • Old HA: element absent after 500 ms → recovery fires once → blank resolved.
// ─────────────────────────────────────────────────────────────────────────────

// _kceHaPanelParent is updated by connectedCallback() each time an instance
// attaches, so it always points to the most recent ha-panel-custom parent.
let _kceHaPanelParent = null;

function _kceRecoverPanel() {
  const haPanel = _kceHaPanelParent;
  if (!haPanel || !haPanel.isConnected) return;
  if (haPanel.querySelector('kitchen-cooking-card')) return; // already present
  // ha-panel-custom is connected but missing our element — trigger _createPanel().
  if (typeof haPanel.requestUpdate === 'function') {
    haPanel.requestUpdate('panel', null);
  }
}

// visibilitychange: main trigger for "tab returns after 5-min suspension".
document.addEventListener('visibilitychange', () => {
  if (document.visibilityState === 'visible') {
    // 500 ms lets HA's own connectedCallback / _createPanel async chain run first;
    // recovery only fires when that chain was absent (older HA).
    setTimeout(_kceRecoverPanel, 500);
  }
});

// window focus: belt-and-suspenders for mobile browsers / OS window switching
// where visibilitychange may not fire reliably when the app comes to foreground.
window.addEventListener('focus', () => setTimeout(_kceRecoverPanel, 500));

// ─── End module-level blank-screen recovery ───────────────────────────────────
