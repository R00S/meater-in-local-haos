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

class KitchenCookingPanel extends LitElement {
  static get properties() {
    return {
      hass: { 
        type: Object,
        hasChanged(newVal, oldVal) {
          // Force re-render when ANY cooking session entity state changes
          // This is needed because HA updates hass.states but hass object reference stays the same
          if (!oldVal || !newVal) return true;
          
          // Check if any cooking session entity changed
          // We check ALL session entities because:
          // 1. User might switch between appliances
          // 2. Temperature updates need to trigger re-render regardless of which entity is selected
          for (const key in newVal.states) {
            if (key.includes('kitchen_cooking_engine') && key.includes('session')) {
              const oldState = oldVal.states[key];
              const newState = newVal.states[key];
              
              // State object reference changes when entity updates
              if (oldState !== newState) {
                return true;
              }
              
              // Defensive: also check if attributes object changed
              if (oldState && newState && oldState.attributes !== newState.attributes) {
                return true;
              }
            }
          }
          return false;
        }
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
      _currentPath: { type: String },  // 'welcome', 'meater', 'ninja_combi', 'ai_recipe_builder', 'previous_cooks', 'recent_meater'
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
    // Phase 4: Recipe Cook Flow state
    this._recipeCookState = null; // {recipe, startTime, currentStep, servingSize, easeRating, resultRating, notes, meaterSubprocess}
    this._recipeCookTimer = null; // setInterval handle for elapsed time updates
    // Data is generated from backend Python files at install/update time
    // Run generate_frontend_data.py after modifying cooking_data.py or swedish_cooking_data.py
  }

  connectedCallback() {
    super.connectedCallback();
    // Data is embedded in this file - generated from backend at build time
    
    // Ensure _currentPath is always set to a valid value
    if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
      this._currentPath = 'welcome';
    }
    
    // Load user preferences
    this._loadPreferences();
    
    // Phase 3.3: Load appliances and features
    this._loadAppliances();
    this._loadAvailableFeatures();
    
    // Fix for white screen when returning to browser tab
    // Force re-render when tab becomes visible again
    this._visibilityHandler = () => {
      if (document.visibilityState === 'visible') {
        // Validate and restore state
        if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
          this._currentPath = 'welcome';
        }
        // Force multiple re-renders to ensure UI is properly updated
        this.requestUpdate();
        // Also trigger after a short delay for any async state
        setTimeout(() => this.requestUpdate(), 100);
        setTimeout(() => this.requestUpdate(), 500);
      }
    };
    document.addEventListener('visibilitychange', this._visibilityHandler);
    
    // Also handle focus event for additional reliability
    this._focusHandler = () => {
      // Validate state on focus
      if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
        this._currentPath = 'welcome';
      }
      this.requestUpdate();
    };
    window.addEventListener('focus', this._focusHandler);
  }

  disconnectedCallback() {
    super.disconnectedCallback();
    // Clean up visibility handler
    if (this._visibilityHandler) {
      document.removeEventListener('visibilitychange', this._visibilityHandler);
      this._visibilityHandler = null;
    }
    if (this._focusHandler) {
      window.removeEventListener('focus', this._focusHandler);
      this._focusHandler = null;
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
      console.log('DEBUG: History loaded successfully. Count:', data.history?.length || 0);
      
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
      this._errorMessage = 'Failed to load appliances. Please check your connection.';
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
      this._errorMessage = 'Failed to load recipes. Please check your connection.';
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
    // Return generated data based on selected source
    return this._dataSource === DATA_SOURCE_SWEDISH ? SWEDISH_MEAT_CATEGORIES : MEAT_CATEGORIES;
  }

  _getDonenessOptions() {
    // Return generated data based on selected source
    return this._dataSource === DATA_SOURCE_SWEDISH ? SWEDISH_DONENESS_OPTIONS : DONENESS_OPTIONS;
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

  async _showAISettings() {
    // Load current settings
    try {
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_settings');
      if (response.status === 'ok') {
        this._aiAgentId = response.settings.agent_id;
      }
    } catch (e) {
      console.error('[AI Settings] Failed to load settings:', e);
    }
    
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
        agent_id: this._aiAgentId
      });
      
      if (response.status === 'ok') {
        // Show success message
        this._showMessage('AI Settings Saved', `✅ Settings saved successfully!\n\nAgent ID: ${this._aiAgentId}\n\nYour AI Recipe Builder will now use this agent.`, false);
        this._closeAISettings();
      } else {
        this._showMessage('Failed to Save Settings', `❌ ${response.message}`, true);
      }
    } catch (e) {
      console.error('[AI Settings] Failed to save settings:', e);
      this._showMessage('Error Saving Settings', `❌ ${e.message}`, true);
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
   * Navigate to welcome screen (appliance selector)
   */
  _navigateToWelcome() {
    this._currentPath = 'welcome';
    this._selectedAppliance = null;
    // Reset old navigation flags for compatibility
    this._showHistory = false;
    this._showNinjaCombi = false;
    this._showAppliances = false;
    this._showRecipes = false;
    this._showAIRecipeBuilder = false;
    this.requestUpdate();
  }

  /**
   * Navigate to MEATER path
   * @param {Object} appliance - Selected MEATER appliance
   */
  _navigateToMeaterPath(appliance) {
    this._currentPath = 'meater';
    this._selectedAppliance = appliance;
    // Don't show cooking form immediately - show path buttons first
    this._showMeaterCooking = false;
    // Reset old navigation flags
    this._showHistory = false;
    this._showNinjaCombi = false;
    this._showAppliances = false;
    this._showRecipes = false;
    this._showAIRecipeBuilder = false;
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
      this._navigateToMeaterPath(appliance);
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
                  @click=${() => this._selectNinjaRecipe(recipe.id)}>
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
          <button class="history-btn" @click=${() => this._selectedNinjaRecipe = null}>
            ← Back to Ninja Combi
          </button>
          <button class="action-btn" @click=${() => this._openRecipeInBuilder(recipe)}>
            🛠️ Modify in Builder
          </button>
          <button class="history-btn" @click=${() => { this._selectedNinjaRecipe = null; this._showNinjaCombi = false; this._showRecipes = true; this._loadCompatibleRecipes(); }}>
            📖 All Recipes
          </button>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>📋 Recipe Details</h3>
          <div style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin: 12px 0;">
            <div>
              <strong>⏱️ Prep:</strong> ${recipe.prep_time_minutes} min
            </div>
            <div>
              <strong>🔥 Cook:</strong> ${recipe.cook_time_minutes} min
            </div>
            <div>
              <strong>🍽️ Servings:</strong> 
              <input 
                type="number" 
                min="1" 
                max="12" 
                .value=${recipe._adjustedServings || recipe.servings}
                @input=${(e) => this._updateRecipeServings(recipe, parseInt(e.target.value))}
                style="width: 50px; padding: 4px; border: 1px solid var(--divider-color); border-radius: 4px; background: var(--primary-background-color); color: var(--primary-text-color);">
            </div>
            <div>
              <strong>📊 Difficulty:</strong> ${recipe.difficulty}
            </div>
          </div>
          ${recipe.use_probe ? html`
            <div style="margin-top: 12px; padding: 12px; background: rgba(76, 175, 80, 0.1); border-left: 3px solid #4caf50; border-radius: 0 4px 4px 0;">
              <strong>🌡️ MEATER+ Probe:</strong> Target ${recipe.target_temp_c}°C (${recipe.target_temp_f}°F)
              <button 
                class="action-btn" 
                @click=${() => this._startMeaterCook(recipe)}
                style="width: 100%; margin-top: 12px; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);">
                🚀 Start Cook with MEATER+
              </button>
            </div>
          ` : ''}
        </div>
      </ha-card>

      ${recipe.phases && recipe.phases.length > 0 ? html`
        <ha-card>
          <div class="card-content">
            <h3>🔄 Cooking Phases</h3>
            ${recipe.phases.map((phase, idx) => html`
              <div style="margin: 12px 0; padding: 12px; background: var(--primary-background-color); border-radius: 8px;">
                <strong>Phase ${idx + 1}:</strong> ${phase.description}<br>
                🌡️ ${phase.temperature_c}°C (${phase.temperature_f}°F)<br>
                ⏱️ ${phase.duration_minutes} minutes<br>
                ${phase.steam_enabled ? '💨 Steam enabled' : ''}
              </div>
            `)}
          </div>
        </ha-card>
      ` : ''}

      <ha-card>
        <div class="card-content">
          <h3>🛒 Ingredients</h3>
          <ul style="margin: 0; padding-left: 20px;">
            ${(recipe._adjustedIngredients || recipe.ingredients).map(ing => html`<li>${ing}</li>`)}
          </ul>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>👨‍🍳 Instructions</h3>
          <ol style="margin: 0; padding-left: 20px;">
            ${recipe.instructions.map(step => html`<li style="margin-bottom: 8px;">${step}</li>`)}
          </ol>
        </div>
      </ha-card>

      ${recipe.tips && recipe.tips.length > 0 ? html`
        <ha-card>
          <div class="card-content">
            <h3>💡 Tips</h3>
            <ul style="margin: 0; padding-left: 20px;">
              ${recipe.tips.map(tip => html`<li style="margin-bottom: 6px;">${tip}</li>`)}
            </ul>
          </div>
        </ha-card>
      ` : ''}

      ${recipe.notes ? html`
        <ha-card>
          <div class="card-content">
            <h3>📝 Notes</h3>
            <p>${recipe.notes}</p>
          </div>
        </ha-card>
      ` : ''}
    `;
  }

  _renderRecipeBuilder() {
    const bases = {
      'white_rice': { name: 'White Rice', icon: '🍚', water: '4 cups', time: 15 },
      'brown_rice': { name: 'Brown Rice', icon: '🍙', water: '4.5 cups', time: 18 },
      'rice_pilaf': { name: 'Rice Pilaf', icon: '🍚', water: '3 cups', time: 16 },
      'spanish_rice': { name: 'Spanish Rice', icon: '🍛', water: '4 cups', time: 15 },
      'wild_rice': { name: 'Wild Rice', icon: '🌾', water: '5 cups', time: 20 },
      'israeli_couscous': { name: 'Israeli Couscous', icon: '⚪', water: '3.5 cups', time: 12 },
      'quinoa': { name: 'Quinoa', icon: '🌿', water: '4 cups', time: 15 },
      'plain_pasta': { name: 'Plain Pasta', icon: '🍝', water: '5 cups', time: 12 },
      'marinara_pasta': { name: 'Marinara Pasta', icon: '🍝', water: '5 cups + 2 cups marinara', time: 14 },
      'alfredo_pasta': { name: 'Alfredo Pasta', icon: '🍝', water: '5 cups + 1.5 cups alfredo', time: 14 },
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
        <h2>🛠️ Recipe Builder</h2>
        <p>Build custom Combi-Meal recipes with automatic parameter adjustment</p>
        <div style="display: flex; gap: 8px; margin-top: 12px;">
          <button class="history-btn" @click=${() => { this._showRecipeBuilder = false; this._resetBuilder(); }}>
            ← Back to Ninja Combi
          </button>
          <button class="history-btn" @click=${() => { this._showRecipeBuilder = false; this._showNinjaCombi = false; this._showRecipes = true; this._loadCompatibleRecipes(); }}>
            📖 All Recipes
          </button>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          <h3>1️⃣ Select Base (Required)</h3>
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
          <h3>2️⃣ Select Protein (Required)</h3>
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
          <h3>3️⃣ Add Vegetables (Optional)</h3>
          <p style="font-size: 12px; color: var(--secondary-text-color); margin-bottom: 8px;">
            💡 Tender veggies cook with base, crispy veggies cook with protein
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
                    ${veggie.type === 'tender' ? '🥘 With base' : '🔥 With protein'}
                  </div>
                </button>
              `;
            })}
          </div>
        </div>
      </ha-card>

      <ha-card>
        <div class="card-content">
          <h3>4️⃣ MEATER+ Probe</h3>
          <label style="display: flex; align-items: center; gap: 8px; cursor: pointer;">
            <input 
              type="checkbox" 
              .checked=${this._builderUseMeater}
              @change=${(e) => { this._builderUseMeater = e.target.checked; this.requestUpdate(); }}
              style="width: 18px; height: 18px; cursor: pointer;">
            <span style="font-size: 14px;">
              🌡️ Use MEATER+ probe for temperature monitoring
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
            <h3>📊 Calculated Parameters</h3>
            <div style="display: grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin: 12px 0;">
              <div>
                <strong>🌡️ Temperature:</strong><br>
                ${selectedProtein.temp}
              </div>
              <div>
                <strong>⏱️ Cook Time:</strong><br>
                ${selectedProtein.time} minutes
              </div>
              <div>
                <strong>💧 Water:</strong><br>
                ${selectedBase.water}
              </div>
              <div>
                <strong>🍴 Mode:</strong><br>
                Combi-Meal
              </div>
            </div>
            ${this._builderUseMeater && selectedProtein.probe !== 'N/A' ? html`
              <div style="margin-top: 12px; padding: 12px; background: rgba(76, 175, 80, 0.1); border-left: 3px solid #4caf50; border-radius: 0 4px 4px 0;">
                <strong>🌡️ Probe Target:</strong> ${selectedProtein.probe}
              </div>
            ` : ''}
            <button 
              class="action-btn" 
              @click=${() => this._buildRecipe()}
              style="width: 100%; margin-top: 16px; padding: 14px; font-size: 15px; font-weight: 600;">
              ✨ Build Custom Recipe
            </button>
          </div>
        </ha-card>
      ` : html`
        <ha-card>
          <div class="card-content">
            <p style="text-align: center; color: var(--secondary-text-color); padding: 20px 0;">
              👆 Select a base and protein to see calculated parameters
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
      'white_rice': { name: 'White Rice', water: '4 cups', time: 18, icon: '🍚' },
      'brown_rice': { name: 'Brown Rice', water: '4.5 cups', time: 22, icon: '🍚' },
      'rice_pilaf': { name: 'Rice Pilaf', water: '3.5 cups', time: 16, icon: '🍚' },
      'spanish_rice': { name: 'Spanish Rice', water: '3.5 cups', time: 18, icon: '🍚' },
      'wild_rice': { name: 'Wild Rice', water: '5 cups', time: 25, icon: '🍚' },
      'israeli_couscous': { name: 'Israeli Couscous', water: '3 cups', time: 12, icon: '🫘' },
      'quinoa': { name: 'Quinoa', water: '3.5 cups', time: 15, icon: '🌾' },
      'plain_pasta': { name: 'Plain Pasta', water: '5 cups', time: 14, icon: '🍝' },
      'marinara_pasta': { name: 'Marinara Pasta', water: '4.5 cups', time: 16, icon: '🍝' },
      'alfredo_pasta': { name: 'Alfredo Pasta', water: '4.5 cups', time: 16, icon: '🍝' },
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
    
    // Show the built recipe
    this._selectedNinjaRecipe = customRecipe.id;
    this._showRecipeBuilder = false;
    
    // Temporarily add to recipes list so it can be displayed
    // In production, this would be saved to backend
    if (!NINJA_COMBI_RECIPES.find(r => r.id === 9000)) {
      NINJA_COMBI_RECIPES.push(customRecipe);
    } else {
      // Update existing custom recipe
      const idx = NINJA_COMBI_RECIPES.findIndex(r => r.id === 9000);
      NINJA_COMBI_RECIPES[idx] = customRecipe;
    }
    
    this.requestUpdate();
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
      this._showMessage('No MEATER Sensor Found', '⚠️ Please ensure your MEATER device is connected and the Kitchen Cooking Engine integration is set up.', true);
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
          this._showMessage('Cooking Session Started', `✅ Session started successfully!\n\nRecipe: ${recipe.name}\n\nThe cooking session is now active.`, false);
          
          // Close Ninja Combi view to return to main panel which will show active cook
          this._showNinjaCombi = false;
          this._selectedNinjaRecipe = null;
        })
        .catch(err => {
          this._showMessage('Error Starting Cook', `❌ ${err.message}`, true);
        });
    }
  }

  _updateRecipeServings(recipe, newServings) {
    if (isNaN(newServings) || newServings < 1) return;
    
    const originalServings = recipe.servings;
    const multiplier = newServings / originalServings;
    
    // Store adjusted servings
    recipe._adjustedServings = newServings;
    
    // Scale ingredients
    recipe._adjustedIngredients = recipe.ingredients.map(ing => {
      // Try to find numbers in the ingredient string and scale them
      return ing.replace(/(\d+(?:\.\d+)?)\s*([a-zA-Z]*)/g, (match, num, unit) => {
        const scaledNum = (parseFloat(num) * multiplier).toFixed(1).replace(/\.0$/, '');
        return `${scaledNum} ${unit}`;
      });
    });
    
    this.requestUpdate();
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
    
    // Switch to builder view
    this._selectedNinjaRecipe = null;
    this._showRecipeBuilder = true;
    this.requestUpdate();
  }

  _formatDateTime(isoString) {
    if (!isoString) return '';
    const date = new Date(isoString);
    return date.toLocaleString();
  }

  _formatDuration(startIso, endIso) {
    if (!startIso) return '';
    const start = new Date(startIso);
    const end = endIso ? new Date(endIso) : new Date();
    const mins = Math.round((end - start) / 60000);
    if (mins < 60) return `${mins} min`;
    const hours = Math.floor(mins / 60);
    const remainMins = mins % 60;
    return `${hours}h ${remainMins}m`;
  }

  // Phase 3.3: Render appliance management view
  _renderAppliances() {
    return html`
      <div class="status-banner idle">
        <h2>🔧 Kitchen Appliances</h2>
        <p>${this._appliances.length} appliance${this._appliances.length !== 1 ? 's' : ''} configured</p>
      </div>

      ${this._errorMessage ? html`
        <ha-card class="error-card">
          <div class="card-content error-message">
            <p>⚠️ ${this._errorMessage}</p>
            <button class="retry-btn" @click=${() => this._loadAppliances()}>
              🔄 Retry
            </button>
          </div>
        </ha-card>
      ` : ''}

      ${this._isLoadingAppliances ? html`
        <ha-card>
          <div class="card-content loading-state">
            <div class="spinner"></div>
            <p>Loading appliances...</p>
          </div>
        </ha-card>
      ` : this._appliances.length === 0 ? html`
        <ha-card>
          <div class="card-content no-entities">
            <p>No appliances configured yet.</p>
            <p>Go to <strong>Settings</strong> → <strong>Devices & Services</strong> → <strong>Add Integration</strong></p>
            <p>Search for <strong>Kitchen Cooking Engine</strong> and add your appliances.</p>
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
                    <h4>Features (${appliance.features.length}):</h4>
                    <div class="feature-badges">
                      ${appliance.features.slice(0, 6).map(feature => html`
                        <span class="feature-badge">${this._formatFeatureName(feature)}</span>
                      `)}
                      ${appliance.features.length > 6 ? html`
                        <span class="feature-badge more">+${appliance.features.length - 6} more</span>
                      ` : ''}
                    </div>
                  `}
                </div>

                ${appliance.recipe_count > 0 ? html`
                  <div class="appliance-recipes">
                    📖 ${appliance.recipe_count} recipe${appliance.recipe_count !== 1 ? 's' : ''} available
                  </div>
                ` : ''}
              </div>
            </ha-card>
          `)}
        </div>
      `}

      <div class="help-text">
        <p>💡 <strong>Tip:</strong> Add more appliances to unlock more recipes!</p>
        <p>Each appliance brings its own features and compatible recipes.</p>
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
        <h2>📖 Compatible Recipes</h2>
        <p>${this._compatibleRecipes.length} recipe${this._compatibleRecipes.length !== 1 ? 's' : ''} you can cook</p>
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
            <p>Loading recipes...</p>
          </div>
        </ha-card>
      ` : this._compatibleRecipes.length === 0 ? html`
        <ha-card>
          <div class="card-content no-entities">
            <p>No compatible recipes found with current filter.</p>
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
        <h2>📖 Recipe Details</h2>
        <button class="back-btn" @click=${() => this._selectedRecipeDetail = null}>
          ← Back to Recipes
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
              <h3>✅ You'll Need:</h3>
              <div class="appliance-list-detail">
                ${match.suggested_appliances.map(appId => {
                  const appliance = this._appliances.find(a => a.id === appId);
                  if (!appliance) return '';
                  return html`
                    <div class="appliance-item">
                      <span class="appliance-icon">${this._getApplianceIcon(appliance.name)}</span>
                      <span class="appliance-name">${appliance.name}</span>
                      <span class="status-check">✅ You have this</span>
                    </div>
                  `;
                })}
              </div>
            </div>
          ` : ''}

          ${match.alternative_appliances && match.alternative_appliances.length > 0 ? html`
            <div class="alternatives-section">
              <h3>🔄 Or Alternatively:</h3>
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
            <h3>🔧 Required Features:</h3>
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
              <h3>💡 Optional Features:</h3>
              <div class="feature-list-detail">
                ${recipe.optional_features.map(f => html`
                  <div class="feature-item optional">
                    <span class="feature-icon">+</span>
                    <span class="feature-name">${this._formatFeatureName(f)}</span>
                    ${this._hasFeature(f) ? html`<span class="status-badge">Available</span>` : ''}
                  </div>
                `)}
              </div>
            </div>
          ` : ''}

          ${match.notes ? html`
            <div class="notes-section">
              <h3>📝 Notes:</h3>
              <p class="recipe-notes-detail">${match.notes}</p>
            </div>
          ` : ''}

          <div class="recipe-actions">
            <button class="primary-btn" @click=${() => this._startCookFromRecipe(recipe, match)}>
              🚀 Start Cooking
            </button>
            <button class="secondary-btn" @click=${() => this._selectedRecipeDetail = null}>
              Cancel
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
    // Check if recipe has steps - if so, use new Recipe Cook Flow
    if (recipe.steps && recipe.steps.length > 0) {
      // Close the recipe detail view
      this._selectedRecipeDetail = null;
      this._showRecipes = false;
      
      // Ask for serving size adjustment (optional)
      const defaultServingSize = recipe.serving_size || 4;
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
      this._showMessage('Cannot Start Cooking Session', 
        `This recipe requires temperature monitoring, but no MEATER+ probe is configured.\n\n` +
        `Please add a MEATER+ appliance in:\n` +
        `Settings → Devices & Services → Add Integration → Kitchen Cooking Engine`, true);
      return;
    }

    // Find cooking session entities for temperature probes
    const entities = this._findCookingEntities();
    if (entities.length === 0) {
      this._showMessage('No Cooking Session Entities', 
        `Please ensure your MEATER+ probe is configured properly.`, true);
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
      this._showMessage('Recipe Loaded', 
        `Now configure your cook on the setup screen:\n` +
        `- Select protein and cut\n` +
        `- Choose doneness level\n` +
        `- Select cooking method\n` +
        `- Start your cook\n\n` +
        `Tip: The recipe "${recipe.name}" works best with ${applianceNames}.`, false);
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
          <div class="feature-badges">
            ${modified.map(feature => html`
              <span class="feature-badge modified">${this._formatFeatureName(feature)}</span>
            `)}
          </div>
        </div>
      ` : ''}
      
      ${special.length > 0 ? html`
        <div class="feature-group">
          <h4>⭐ Special Features (${special.length})</h4>
          <div class="feature-badges">
            ${special.map(feature => html`
              <span class="feature-badge special">${this._formatFeatureName(feature)}</span>
            `)}
          </div>
        </div>
      ` : ''}
    `;
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
      return html`<div class="loading">Loading Home Assistant connection...</div>`;
    }

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
                  <h2>⚙️ AI Recipe Builder Settings</h2>
                  <button class="modal-close" @click=${this._closeAISettings}>✕</button>
                </div>
                <div class="modal-body">
                  <p style="margin-bottom: 16px;">
                    Configure which AI conversation agent to use for recipe generation.
                  </p>
                  
                  <label for="ai-agent-id" style="display: block; margin-bottom: 8px; font-weight: 600;">
                    AI Agent ID:
                  </label>
                  <input
                    id="ai-agent-id"
                    type="text"
                    .value=${this._aiAgentId}
                    @input=${(e) => { this._aiAgentId = e.target.value; }}
                    placeholder="extended_openai_conversation_2"
                    style="width: 100%; padding: 8px; border: 1px solid var(--divider-color); border-radius: 4px; font-family: monospace;"
                  />
                  
                  <p style="margin-top: 12px; font-size: 0.9em; color: var(--secondary-text-color);">
                    <strong>Common agent IDs:</strong>
                  </p>
                  <ul style="margin: 8px 0; padding-left: 24px; font-size: 0.9em; color: var(--secondary-text-color);">
                    <li><code>extended_openai_conversation_2</code> - Extended OpenAI Conversation</li>
                    <li><code>conversation.openai_conversation</code> - OpenAI Conversation</li>
                    <li><code>conversation.home_assistant_cloud</code> - Nabu Casa Cloud</li>
                  </ul>
                  
                  <p style="margin-top: 12px; font-size: 0.9em; color: var(--secondary-text-color);">
                    Find your agent ID in <strong>Developer Tools → States</strong> - look for entities starting with "conversation."
                  </p>
                </div>
                <div class="modal-footer">
                  <button class="secondary-btn" @click=${this._closeAISettings}>
                    Cancel
                  </button>
                  <button class="primary-btn" @click=${this._saveAISettings}>
                    Save Settings
                  </button>
                </div>
              </div>
            </div>
          ` : ''}
          
          <!-- Message Dialog (replaces alert() for copyable error messages) -->
          ${this._showMessageDialog ? html`
            <div class="modal-overlay" @click=${this._closeMessageDialog}>
              <div class="modal-dialog" @click=${(e) => e.stopPropagation()}>
                <div class="modal-header">
                  <h2>${this._messageDialogIsError ? '⚠️' : '💬'} ${this._messageDialogTitle}</h2>
                  <button class="modal-close" @click=${this._closeMessageDialog}>✕</button>
                </div>
                <div class="modal-body">
                  <pre style="white-space: pre-wrap; word-wrap: break-word; font-family: inherit; margin: 0; user-select: text;">${this._messageDialogContent}</pre>
                </div>
                <div class="modal-footer">
                  <button class="primary-btn" @click=${this._closeMessageDialog}>
                    OK
                  </button>
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
    // Phase 4: If in recipe cook flow, always show it (highest priority)
    if (this._recipeCookState) {
      return this._renderRecipeCookFlow();
    }

    // Find ACTUAL active entity (not relying on this._selectedEntity)
    // This ensures graph and attributes always come from the right entity
    const activeEntity = activeCooks.length > 0 ? activeCooks[0] : null;
    
    // If there's an active cook AND we're on welcome/default, show it
    if (activeEntity && 
        (this._currentPath === 'welcome' || !this._currentPath || this._currentPath === '')) {
      const activeState = this.hass.states[activeEntity];
      // Keep selected entity in sync with active entity for service calls
      if (this._selectedEntity !== activeEntity) {
        console.log('Syncing selected entity to active entity:', activeEntity);
        this._selectedEntity = activeEntity;
      }
      return this._renderActiveCook(activeState);
    }
    
    // If multiple active cooks but none selected, show selector on welcome screen
    if (activeCooks.length > 1 && this._currentPath === 'welcome') {
      return this._renderMultiCookSelector(activeCooks);
    }

    // Validate current path - ensure it has a valid value
    if (!this._currentPath || this._currentPath === '' || this._currentPath === 'undefined') {
      this._currentPath = 'welcome';
    }

    // Otherwise, render based on current path
    switch (this._currentPath) {
      case 'welcome':
        return this._renderWelcomeScreen();
      
      case 'meater':
        return this._renderMeaterPath();
      
      case 'recent_meater':
        return this._renderRecentMeaterCooks();
      
      case 'ninja_combi':
        return this._renderNinjaCombiPath();
      
      case 'ninja_recipe_builder':
        return this._renderNinjaRecipeBuilderView();
      
      case 'ninja_built_in_recipes':
        return this._renderNinjaBuiltInRecipesView();
      
      case 'recent_ninja':
        return this._renderRecentNinjaCooks();
      
      case 'ai_recipe_builder':
        return this._renderAIRecipeBuilderFlow();
      
      case 'recent_appliance':
        return this._renderRecentApplianceRecipes();
      
      case 'previous_cooks':
        return this._renderPreviousCooksPath();
      
      default:
        // Fallback to welcome screen for any unrecognized path
        console.warn('Unrecognized path:', this._currentPath, '- falling back to welcome');
        this._currentPath = 'welcome';
        return this._renderWelcomeScreen();
    }
  }

  _renderNoEntities() {
    return html`
      <ha-card>
        <div class="card-content no-entities">
          <p>No cooking session entities found.</p>
          <p>Please configure the Kitchen Cooking Engine integration first.</p>
        </div>
      </ha-card>
    `;
  }

  _renderSetupForm(entities) {
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
    
    // Filter to only MEATER-type entities for session selection
    const meaterEntities = entities.filter(e => {
      const applianceType = this.hass.states[e]?.attributes?.appliance_type;
      return applianceType === 'meater' || applianceType === 'meater_probe';
    });
    
    // Default to first MEATER entity if none selected (v0.5.0.30 + default selection)
    // Only set default if no selection exists - don't override user's choice
    if (meaterEntities.length > 0 && !this._selectedEntity) {
      this._selectedEntity = meaterEntities[0];
    }
    
    return html`
      <div class="status-banner idle">
        <h2>🍳 Ready to Cook</h2>
        <p>Select your protein and preferences below</p>
      </div>
      
      ${meaterEntities.length > 1 ? html`
        <ha-card>
          <div class="card-content">
            <h3>Select Session</h3>
            <select @change=${(e) => this._selectedEntity = e.target.value}>
              ${meaterEntities.map(e => html`
                <option value="${e}" ?selected=${this._selectedEntity === e}>
                  ${this.hass.states[e]?.attributes?.friendly_name || e}
                </option>
              `)}
            </select>
          </div>
        </ha-card>
      ` : ''}
      
      <!-- Data Source Selector -->
      <ha-card>
        <div class="card-content">
          <h3>🌍 Temperature Data Source</h3>
          <div class="button-group">
            <button 
              class="category-btn ${this._dataSource === DATA_SOURCE_INTERNATIONAL ? 'selected' : ''}" 
              @click=${() => this._switchDataSource(DATA_SOURCE_INTERNATIONAL)}>
              🇺🇸 International (USDA)
            </button>
            <button 
              class="category-btn ${this._dataSource === DATA_SOURCE_SWEDISH ? 'selected' : ''}" 
              @click=${() => this._switchDataSource(DATA_SOURCE_SWEDISH)}>
              🇸🇪 Svenska (Livsmedelsverket)
            </button>
          </div>
          <p class="source-description">
            ${this._dataSource === DATA_SOURCE_SWEDISH 
              ? 'Använder svenska temperaturrekommendationer från Livsmedelsverket, Stekguiden.se och Gårdssällskapet.'
              : 'Using international temperature guidelines from USDA, FDA and professional culinary sources.'}
          </p>
        </div>
      </ha-card>
      
      <!-- Step 1: Select Category -->
      <ha-card>
        <div class="card-content">
          <h3>1️⃣ Select Category</h3>
          <div class="button-group">
            ${Object.entries(categories).map(([key, cat]) => html`
              <button 
                class="category-btn ${this._selectedCategory === key ? 'selected' : ''}" 
                @click=${() => this._selectCategory(key)}>
                ${cat.icon} ${cat.name}
              </button>
            `)}
          </div>
        </div>
      </ha-card>
      
      <!-- Step 2: Select Animal/Meat (if multiple) -->
      ${this._selectedCategory && showMeatSelector ? html`
        <ha-card>
          <div class="card-content">
            <h3>2️⃣ Select Type</h3>
            <div class="button-group">
              ${meats.map(meat => html`
                <button 
                  class="category-btn ${this._selectedMeat === meat.id ? 'selected' : ''}" 
                  @click=${() => this._selectMeat(meat.id)}>
                  ${meat.name}
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
            <h3>${showMeatSelector ? '3️⃣' : '2️⃣'} Select Cut Type</h3>
            <div class="button-group">
              ${cutTypes.map(ct => html`
                <button 
                  class="category-btn ${this._selectedCutType === ct.id ? 'selected' : ''}" 
                  @click=${() => this._selectCutType(ct.id)}>
                  ${ct.name}
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
            <h3>${showMeatSelector ? '4️⃣' : '3️⃣'} Select Cut</h3>
            <select @change=${(e) => this._selectCut(parseInt(e.target.value) || null)}>
              <option value="">Choose a cut...</option>
              ${cuts.map(cut => html`
                <option value="${cut.id}" ?selected=${this._selectedCut === cut.id}>
                  ${cut.name_long || cut.name}${(cut.recommended_doneness || cut.recommendedDoneness) ? ' ⭐' : ''}
                </option>
              `)}
            </select>
          </div>
        </ha-card>
      ` : ''}
      
      <!-- Step 5: Doneness Level -->
      ${this._selectedCut ? html`
        <ha-card>
          <div class="card-content">
            <h3>🌡️ Doneness Level ${recommendedDoneness ? html`<span class="recommended-hint">(⭐ = recommended)</span>` : ''}</h3>
            <div class="doneness-grid">
              ${this._getAvailableDoneness().map(opt => html`
                <button 
                  class="doneness-btn ${this._selectedDoneness === opt.value ? 'selected' : ''} ${opt.value === recommendedDoneness ? 'recommended' : ''}"
                  @click=${() => this._selectDoneness(opt.value)}
                  title="${opt.description || ''}">
                  <span class="icon">${opt.icon}</span>
                  ${opt.name}
                  ${opt.value === recommendedDoneness ? html`<span class="star">⭐</span>` : ''}
                  <span class="temp-hint">${opt.temp_c}°C</span>
                </button>
              `)}
            </div>
          </div>
        </ha-card>
        
        <!-- Temperature Fine-Tuning -->
        ${this._selectedDoneness ? html`
          <ha-card>
            <div class="card-content">
              <h3>🎯 Target Temperature</h3>
              <div class="temp-display-setup">
                <div class="target-temp">
                  <span class="temp-value">${displayTemp}°C</span>
                  <span class="temp-fahrenheit">(${displayTempF}°F)</span>
                </div>
                ${this._customTargetTempC ? html`
                  <span class="custom-indicator">Custom</span>
                ` : ''}
              </div>
              
              <button 
                class="adjust-btn ${this._showTempAdjust ? 'active' : ''}"
                @click=${() => this._toggleTempAdjust()}>
                ${this._showTempAdjust ? '✓ Done Adjusting' : '⚙️ Fine-tune Temperature'}
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
                    Reset to ${donenessTemps?.c}°C (${this._selectedDoneness ? this._selectedDoneness.replace('_', ' ') : ''})
                  </button>
                </div>
              ` : ''}
            </div>
          </ha-card>
        ` : ''}
        
        <!-- Step 6: Cooking Method -->
        <ha-card>
          <div class="card-content">
            <h3>🍳 Cooking Method</h3>
            <div class="method-grid">
              ${COOKING_METHODS.map(opt => html`
                <button 
                  class="method-btn ${this._selectedMethod === opt.value ? 'selected' : ''}"
                  @click=${() => this._selectedMethod = opt.value}>
                  ${opt.name}
                </button>
              `)}
            </div>
          </div>
        </ha-card>
        
        <!-- Start Button -->
        <div class="action-container">
          <ha-button unelevated @click=${this._startCook} ?disabled=${!this._selectedDoneness}>
            🔥 Start Cooking${this._customTargetTempC ? ` at ${this._customTargetTempC}°C` : ''}
          </ha-button>
        </div>
      ` : ''}
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
        <h2>${this._getStateIcon(cookState)} ${cookState.replace("_", " ")}</h2>
        <p>${cut} • ${doneness}</p>
      </div>
      
      <ha-card>
        <div class="card-content">
          <div class="temp-display">
            <div class="temp-current">
              <div class="value">${currentTemp !== null && currentTemp !== undefined ? currentTemp + '°C' : '--'}</div>
              <div class="label">Tip Temp</div>
            </div>
            <div class="temp-target">
              <div class="value">${targetTemp}°C</div>
              <div class="label">Target</div>
            </div>
          </div>
          
          ${ambientTemp !== null && ambientTemp !== undefined ? html`
            <div class="ambient-temp-display">
              <span class="ambient-label">🌡️ Ambient:</span>
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
              <span>${progress.toFixed(0)}% complete</span>
              ${eta !== null && eta !== undefined && cookState !== 'resting' ? html`<span>ETA: ${eta} min</span>` : ''}
              ${cookState === 'resting' && restTimeRemaining !== null && restTimeRemaining !== undefined ? 
                html`<span>Rest remaining: ${restTimeRemaining.toFixed(1)} min</span>` : ''}
            </div>
          </div>
          
          <div class="cook-info">
            <div class="cook-info-item">
              <div class="label">Method</div>
              <div class="value">${method}</div>
            </div>
            <div class="cook-info-item">
              <div class="label">Rest Time</div>
              <div class="value">${attrs.rest_time_minutes || '--'} min</div>
            </div>
            ${batteryLevel !== null && batteryLevel !== undefined ? html`
              <div class="cook-info-item">
                <div class="label">🔋 Battery</div>
                <div class="value battery-${batteryLevel <= 20 ? 'low' : batteryLevel <= 50 ? 'medium' : 'high'}">${batteryLevel}%</div>
              </div>
            ` : ''}
          </div>
          
          <!-- Notes Section -->
          <div class="notes-section">
            <button class="notes-toggle" @click=${() => this._showNotes = !this._showNotes}>
              📝 ${this._showNotes ? 'Hide Notes' : 'Add Notes'}
            </button>
            ${this._showNotes ? html`
              <textarea 
                class="notes-input" 
                placeholder="Add notes about this cook (adjustments, observations, etc.)"
                .value=${attrs.notes || this._currentNotes}
                @change=${(e) => this._setNotes(e.target.value)}
              ></textarea>
            ` : ''}
          </div>
          
          <div class="action-buttons">
            ${cookState === 'goal_reached' ? html`
              <ha-button unelevated @click=${this._startRest}>⏱️ Start Rest</ha-button>
            ` : ''}
            ${cookState === 'resting' ? html`
              <ha-button unelevated @click=${this._complete}>✅ Complete</ha-button>
            ` : ''}
            <ha-button outlined @click=${this._stopCook}>⏹️ Stop</ha-button>
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

      ${this._renderWelcomeScreen()}
    `;
  }

  /**
   * Render welcome screen with appliance selector
   */
  _renderWelcomeScreen() {
    return html`
      <div class="welcome-header">
        <h1>🍳 Kitchen Cooking Engine</h1>
        <p class="welcome-subtitle">Select Your Appliance</p>
      </div>

      ${this._isLoadingAppliances ? html`
        <div class="loading">Loading appliances...</div>
      ` : this._errorMessage ? html`
        <ha-card>
          <div class="card-content error-message">
            <p>⚠️ ${this._errorMessage}</p>
            <button class="primary-btn" @click=${() => this._loadAppliances()}>
              🔄 Retry
            </button>
          </div>
        </ha-card>
      ` : this._appliances.length === 0 ? html`
        <ha-card>
          <div class="card-content no-entities">
            <p>No appliances configured.</p>
            <p>Please add appliances in the Kitchen Cooking Engine integration settings.</p>
          </div>
        </ha-card>
      ` : html`
        <div class="appliance-grid">
          ${this._appliances.map(appliance => html`
            <ha-card class="appliance-card clickable" @click=${() => this._routeToAppliancePath(appliance)}>
              <div class="card-content appliance-card-content">
                <div class="appliance-icon">
                  ${this._getApplianceIcon(appliance)}
                </div>
                <div class="appliance-name">${appliance.name}</div>
                <div class="appliance-model">${appliance.brand} ${appliance.model}</div>
              </div>
            </ha-card>
          `)}
        </div>

        <ha-card class="previous-cooks-card clickable" @click=${() => this._navigateToPreviousCooks()}>
          <div class="card-content previous-cooks-content">
            <div class="previous-cooks-icon">📋</div>
            <div class="previous-cooks-text">
              <h3>Previous Cooks</h3>
              <p>View and restart your past cooking sessions</p>
            </div>
          </div>
        </ha-card>
      `}
    `;
  }

  /**
   * Render MEATER path (cook type 6.1)
   */
  _renderMeaterPath() {
    // If in cooking mode, show the setup form
    if (this._showMeaterCooking) {
      const entities = this._findCookingEntities();
      return html`
        <div class="path-header">
          <button class="back-btn" @click=${() => { 
            this._showMeaterCooking = false;
            this.requestUpdate();
          }}>
            ← Back to MEATER Path
          </button>
          <h2>🌡️ ${this._selectedAppliance?.name || 'MEATER Probe Cooking'}</h2>
        </div>
        
        ${this._renderSetupForm(entities)}
      `;
    }
    
    // Otherwise show the path buttons
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => this._navigateToWelcome()}>
          ← Back to Appliances
        </button>
        <h2>🌡️ ${this._selectedAppliance?.name || 'MEATER Probe Cooking'}</h2>
      </div>

      <div class="path-buttons">
        <ha-card class="path-card clickable" @click=${() => this._startMeaterCooking()}>
          <div class="card-content path-card-content">
            <div class="path-icon">🌡️</div>
            <h3>Start MEATER Cooking</h3>
            <p>Select protein, set target, monitor temperature</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showRecentMeaterCooks()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📋</div>
            <h3>Recent MEATER Cooks</h3>
            <p>View and restart previous temperature-based cooks</p>
          </div>
        </ha-card>
      </div>
    `;
  }

  /**
   * Render Recent MEATER Cooks (filtered history)
   * Shows only meater probe cooks (type 6.1)
   */
  _renderRecentMeaterCooks() {
    // Debug: Log all cook history to see the actual data structure
    console.log('DEBUG: Total cook history entries:', this._cookHistory?.length || 0);
    if (this._cookHistory && this._cookHistory.length > 0) {
      console.log('DEBUG: First cook entry keys:', Object.keys(this._cookHistory[0]));
      console.log('DEBUG: First cook entry FULL DATA:', this._cookHistory[0]);
      // Log every cook to find MEATER-specific fields
      console.log('DEBUG: Analyzing ALL cook entries for MEATER fields...');
      this._cookHistory.forEach((cook, index) => {
        console.log(`DEBUG: Cook #${index}:`, {
          appliance_type: cook.appliance_type,
          protein: cook.protein,
          meat: cook.meat,
          doneness: cook.doneness,
          cooking_method: cook.cooking_method,
          recipe_name: cook.recipe_name,
          target_temp_c: cook.target_temp_c,
          checks: {
            has_appliance_meater: cook.appliance_type === 'meater' || cook.appliance_type === 'meater_probe',
            has_protein_temp: !!(cook.protein && cook.target_temp_c),
            has_meat_temp: !!(cook.meat && cook.target_temp_c),
            has_doneness_temp: !!(cook.doneness && cook.target_temp_c),
            has_method_temp_no_recipe: !!(cook.cooking_method && cook.target_temp_c && !cook.recipe_name)
          }
        });
      });
    }
    
    // Filter history for MEATER probe cooks only
    const meaterCooks = (this._cookHistory || []).filter(cook => {
      // Check if it's a MEATER-only cook (temperature monitoring)
      // Include cooks that have protein/meat data and target temperature
      // Exclude cooks that are primarily recipe-based
      const isMetering = 
        // New way: explicit appliance type
        cook.appliance_type === 'meater_probe' || 
        cook.appliance_type === 'meater' ||
        
        // Backwards compatibility: Old cooks without appliance_type
        // These cooks have MEATER-specific fields:
        (cook.protein && cook.target_temp_c) ||
        (cook.meat && cook.target_temp_c) ||
        (cook.doneness && cook.target_temp_c) ||
        (cook.cooking_method && cook.target_temp_c && !cook.recipe_name);
      
      // Debug log result for EACH cook
      console.log(`DEBUG: Cook filter - isMetering=${isMetering}:`, {
        appliance_type: cook.appliance_type,
        protein: cook.protein,
        target_temp_c: cook.target_temp_c,
        recipe_name: cook.recipe_name
      });
      
      return isMetering;
    });
    
    console.log('DEBUG: Filtered MEATER cooks:', meaterCooks.length);

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._currentPath = 'meater';
          this.requestUpdate();
        }}>
          ← Back to MEATER Path
        </button>
        <h2>📋 Recent MEATER Cooks</h2>
      </div>

      ${meaterCooks.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p class="no-history">No previous MEATER cooks found.</p>
            <p class="no-history-hint">Temperature-based cooks you complete will appear here for easy restart.</p>
          </div>
        </ha-card>
      ` : html`
        <div class="history-list">
          ${meaterCooks.map(cook => html`
            <ha-card class="history-card">
              <div class="history-card-header">
                <div class="history-title-row">
                  <h3 class="history-title">
                    ${cook.protein || 'Unknown Protein'}
                    ${cook.cut ? html` - ${cook.cut}` : ''}
                  </h3>
                  <span class="history-date">${this._formatDate(cook.start_time)}</span>
                </div>
              </div>
              
              <div class="history-details">
                <span class="history-detail">🥩 ${cook.protein}</span>
                <span class="history-detail">🎯 ${(cook.doneness || '').replace('_', ' ')}</span>
                <span class="history-detail">🍳 ${(cook.cooking_method || '').replace(/_/g, ' ')}</span>
                <span class="history-detail">🌡️ ${cook.target_temp_c}°C target</span>
                ${cook.peak_temp_c ? html`<span class="history-detail">📈 ${Math.round(cook.peak_temp_c)}°C peak</span>` : ''}
                ${cook.final_temp_after_rest ? html`<span class="history-detail">✅ ${Math.round(cook.final_temp_after_rest)}°C after rest</span>` : 
                  cook.final_temp ? html`<span class="history-detail">✅ ${cook.final_temp}°C final</span>` : ''}
              </div>
              
              ${cook.notes ? html`
                <div class="history-notes">
                  <strong>📝 Notes:</strong> ${cook.notes}
                </div>
              ` : ''}
              
              <div class="history-actions">
                <button class="history-action-btn restart" @click=${() => this._restartCook(cook)}>
                  🔄 Restart This Cook
                </button>
                <button class="history-action-btn edit" @click=${() => this._editCookNotes(cook)}>
                  ✏️ Edit Notes
                </button>
                <button class="history-action-btn delete" @click=${() => this._deleteCook(cook.id)}>
                  🗑️ Delete
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
          ← Back to Appliances
        </button>
        <h2>🥘 ${this._selectedAppliance?.name || 'Ninja Combi Cooking'}</h2>
      </div>

      <div class="path-buttons">
        <ha-card class="path-card clickable" @click=${() => this._startNinjaRecipeBuilder()}>
          <div class="card-content path-card-content">
            <div class="path-icon">🎨</div>
            <h3>Recipe Builder</h3>
            <p>Create custom recipes with Ninja Combi modes</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showNinjaBuiltInRecipes()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📖</div>
            <h3>Built-in Recipes</h3>
            <p>Browse pre-configured Ninja Combi recipes</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._startAIWithNinjaCombi()}>
          <div class="card-content path-card-content">
            <div class="path-icon">🤖</div>
            <h3>AI Recipe with Ninja Combi</h3>
            <p>Generate AI recipes using your Ninja Combi</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showRecentNinjaCooks()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📋</div>
            <h3>Recent Ninja Combi Cooks</h3>
            <p>View and restart previous Ninja Combi recipes</p>
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
        <button class="back-btn" @click=${() => this._navigateToWelcome()}>
          ← Back to Appliances
        </button>
        <h2>🤖 AI Recipe Builder</h2>
      </div>

      <ha-card>
        <div class="card-content appliance-info">
          <h3>Main Appliance: ${appliance?.name}</h3>
          <p class="appliance-features">
            <strong>Features:</strong> ${appliance?.features?.join(', ') || 'N/A'}
          </p>
          
          ${this._appliances.length > 1 ? html`
            <div class="secondary-appliances">
              <h4>Secondary Appliances Available:</h4>
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
        <ha-card class="path-card clickable" @click=${() => this._startAIRecipeCreation()}>
          <div class="card-content path-card-content">
            <div class="path-icon">🤖</div>
            <h3>Create AI Recipe</h3>
            <p>Generate custom recipes using your appliances and ingredients</p>
          </div>
        </ha-card>

        <ha-card class="path-card clickable" @click=${() => this._showRecentApplianceRecipes()}>
          <div class="card-content path-card-content">
            <div class="path-icon">📋</div>
            <h3>Recent ${appliance?.name} Recipes</h3>
            <p>View and restart previous AI recipes for this appliance</p>
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
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showRecipeBuilder = false;
          this._currentPath = 'ninja_combi';
          this.requestUpdate();
        }}>
          ← Back to Ninja Combi
        </button>
        <h2>🎨 Ninja Combi Recipe Builder</h2>
      </div>

      <ha-card>
        <div class="card-content">
          <p class="info-text">Create custom recipes using Ninja Combi cooking modes and features.</p>
          <p>Recipe builder interface coming soon. For now, use the Ninja Combi built-in recipes.</p>
          <button class="primary-btn" @click=${() => {
            this._currentPath = 'ninja_built_in_recipes';
            this._showNinjaBuiltInRecipes();
          }}>
            📖 View Built-in Recipes
          </button>
        </div>
      </ha-card>
    `;
  }

  /**
   * Phase 5: Render Ninja built-in recipes list
   * Displays pre-configured Ninja Combi recipes
   */
  _renderNinjaBuiltInRecipesView() {
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showNinjaRecipeList = false;
          this._ninjaBuiltInRecipes = [];
          this._currentPath = 'ninja_combi';
          this.requestUpdate();
        }}>
          ← Back to Ninja Combi
        </button>
        <h2>📖 Built-in Ninja Combi Recipes</h2>
      </div>

      ${this._ninjaBuiltInRecipes.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p>No built-in recipes available. Check back later!</p>
          </div>
        </ha-card>
      ` : html`
        <div class="recipe-list">
          ${this._ninjaBuiltInRecipes.map(recipe => html`
            <ha-card class="recipe-card clickable" @click=${() => this._selectNinjaRecipe(recipe)}>
              <div class="card-content">
                <h3>${recipe.name}</h3>
                <p class="recipe-description">${recipe.description || ''}</p>
                <div class="recipe-meta">
                  <span>⏱️ ${recipe.cook_time || 'N/A'}</span>
                  <span>🍽️ Serves ${recipe.serving_size || '4'}</span>
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
          ← Back to Ninja Combi
        </button>
        <h2>📋 Recent Ninja Combi Cooks</h2>
      </div>

      ${ninjaCooks.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p>No Ninja Combi cooking history yet. Start your first Ninja Combi cook!</p>
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
    if (!this._commonIngredients) {
      return html`<div class="loading">Loading ingredients...</div>`;
    }

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showAIIngredientSelector = false;
          this._selectedIngredients = [];
          this._currentPath = this._selectedAppliance?.type === 'ninja_combi' ? 'ninja_combi' : 'ai_recipe_builder';
          this.requestUpdate();
        }}>
          ← Back
        </button>
        <h2>🥘 Select Ingredients</h2>
      </div>

      <ha-card>
        <div class="card-content">
          <p class="info-text">Choose ingredients you have available (select at least 2):</p>
          
          <div class="ingredient-grid">
            ${(this._commonIngredients || []).map(ingredient => html`
              <label class="ingredient-checkbox">
                <input 
                  type="checkbox" 
                  ?checked=${this._selectedIngredients.includes(ingredient)}
                  @change=${(e) => this._toggleIngredient(ingredient, e.target.checked)}
                />
                ${ingredient}
              </label>
            `)}
          </div>

          <div class="ingredient-custom">
            <input 
              type="text" 
              placeholder="Add custom ingredient..." 
              @keypress=${(e) => {
                if (e.key === 'Enter' && e.target.value.trim()) {
                  this._addCustomIngredient(e.target.value.trim());
                  e.target.value = '';
                }
              }}
            />
          </div>

          <div class="selected-ingredients">
            <h4>Selected Ingredients (${this._selectedIngredients.length}):</h4>
            <div class="ingredient-tags">
              ${this._selectedIngredients.map(ing => html`
                <span class="ingredient-tag">
                  ${ing}
                  <button @click=${() => this._removeIngredient(ing)}>×</button>
                </span>
              `)}
            </div>
          </div>

          <button 
            class="primary-btn"
            ?disabled=${this._selectedIngredients.length < 2}
            @click=${() => this._proceedToCookingStyle()}
          >
            Next: Choose Cooking Style
          </button>
        </div>
      </ha-card>
    `;
  }

  /**
   * Phase 6: Render cooking style selection
   */
  _renderAICookingStyleSelection() {
    // Data should already be loaded by _startAIRecipeCreation()
    // If not loaded, show loading state
    if (!this._cookingStyles) {
      return html`<div class="loading">Loading cooking styles...</div>`;
    }

    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => {
          this._showAIStyleSelector = false;
          this._showAIIngredientSelector = true;
          this.requestUpdate();
        }}>
          ← Back to Ingredients
        </button>
        <h2>🍳 Choose Cooking Style</h2>
      </div>

      <ha-card>
        <div class="card-content">
          <p class="info-text">Select your preferred cooking style:</p>
          
          <div class="style-grid">
            ${(this._cookingStyles || []).map(style => html`
              <ha-card 
                class="style-card ${this._selectedCookingStyle === style.id ? 'selected' : ''} clickable"
                @click=${() => {
                  this._selectedCookingStyle = style.id;
                  this.requestUpdate();
                }}
              >
                <div class="card-content">
                  <div class="style-icon">${style.icon || '🍳'}</div>
                  <h3>${style.name}</h3>
                  <p>${style.description || ''}</p>
                </div>
              </ha-card>
            `)}
          </div>

          <button 
            class="primary-btn"
            ?disabled=${!this._selectedCookingStyle}
            @click=${() => this._generateAIRecipes()}
          >
            Generate Recipes 🤖
          </button>
        </div>
      </ha-card>
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
          this._showAIStyleSelector = true;
          this._aiRecipeSuggestions = [];
          this.requestUpdate();
        }}>
          ← Back to Cooking Style
        </button>
        <h2>🤖 AI Recipe Suggestions</h2>
      </div>

      ${this._aiRecipeSuggestions.length === 0 ? html`
        <ha-card>
          <div class="card-content loading-state">
            <ha-circular-progress active></ha-circular-progress>
            <p>Generating recipes with AI...</p>
          </div>
        </ha-card>
      ` : html`
        <div class="recipe-suggestions">
          ${this._aiRecipeSuggestions.map(recipe => html`
            <ha-card class="recipe-suggestion-card">
              <div class="card-content">
                <h3>${recipe.name}</h3>
                <p class="recipe-description">${recipe.description || ''}</p>
                
                <div class="recipe-details">
                  <div class="detail-item">
                    <strong>⏱️ Prep Time:</strong> ${recipe.prep_time || 'N/A'}
                  </div>
                  <div class="detail-item">
                    <strong>🍳 Cook Time:</strong> ${recipe.cook_time || 'N/A'}
                  </div>
                  <div class="detail-item">
                    <strong>🍽️ Servings:</strong> ${recipe.serving_size || '4'}
                  </div>
                </div>

                <div class="recipe-ingredients">
                  <h4>Ingredients:</h4>
                  <ul>
                    ${(recipe.ingredients || []).map(ing => html`<li>${ing}</li>`)}
                  </ul>
                </div>

                <button 
                  class="primary-btn"
                  @click=${() => this._startCookingFromAIRecipe(recipe)}
                >
                  Start Cooking This Recipe
                </button>
              </div>
            </ha-card>
          `)}
        </div>

        <div class="action-buttons">
          <button 
            class="secondary-btn"
            @click=${() => this._generateAIRecipes()}
          >
            🔄 Generate Different Recipes
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
          ← Back to AI Recipe Builder
        </button>
        <h2>📋 Recent ${this._selectedAppliance?.name || 'Appliance'} Recipes</h2>
      </div>

      ${applianceCooks.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p>No cooking history for this appliance yet. Create your first AI recipe!</p>
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
   * Render Previous Cooks path (uses existing _renderHistory)
   */
  _renderPreviousCooksPath() {
    // Phase 3: Show detail view if a cook is selected
    if (this._selectedCookForDetail) {
      return this._renderCookDetailView(this._selectedCookForDetail);
    }
    
    return html`
      <div class="path-header">
        <button class="back-btn" @click=${() => this._navigateToWelcome()}>
          ← Back to Appliances
        </button>
        <h2>📋 Previous Cooks</h2>
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
          ← Back to List
        </button>
        <h2>${cook.cut_display || cook.cut || cook.recipe_name || 'Cook Details'}</h2>
      </div>

      <ha-card>
        <div class="card-content cook-detail">
          <div class="detail-header">
            <h3>${cook.cut_display || cook.cut || cook.recipe_name}</h3>
            <p class="detail-meta">
              ${cook.appliance_name || 'Unknown Appliance'} • 
              ${this._formatDateTime(cook.completed_at)}
            </p>
          </div>

          ${cook.duration ? html`
            <div class="detail-section">
              <strong>⏱️ Duration:</strong> ${this._formatDuration(cook.duration)}
            </div>
          ` : ''}

          ${cook.protein ? html`
            <div class="detail-section">
              <strong>🥩 Protein:</strong> ${cook.protein}
              ${cook.doneness ? html` • <strong>Doneness:</strong> ${(cook.doneness || '').replace('_', ' ')}` : ''}
            </div>
          ` : ''}

          ${cook.target_temp_c || cook.peak_temp_c || cook.final_temp ? html`
            <div class="detail-section">
              <strong>🌡️ Temperature Data:</strong>
              <div class="temp-data">
                ${cook.target_temp_c ? html`<p>Target: ${cook.target_temp_c}°C</p>` : ''}
                ${cook.peak_temp_c ? html`<p>Peak: ${Math.round(cook.peak_temp_c)}°C</p>` : ''}
                ${cook.final_temp_after_rest ? html`<p>After Rest: ${Math.round(cook.final_temp_after_rest)}°C</p>` : 
                  cook.final_temp ? html`<p>Final: ${cook.final_temp}°C</p>` : ''}
              </div>
            </div>
          ` : ''}

          ${cook.cooking_method ? html`
            <div class="detail-section">
              <strong>🍳 Cooking Method:</strong> ${(cook.cooking_method || '').replace(/_/g, ' ')}
            </div>
          ` : ''}

          ${cook.ingredients && cook.ingredients.length > 0 ? html`
            <div class="detail-section">
              <strong>📝 Ingredients:</strong>
              <ul class="ingredients-list">
                ${cook.ingredients.map(ing => html`<li>${ing}</li>`)}
              </ul>
            </div>
          ` : ''}

          ${cook.timeline && cook.timeline.length > 0 ? html`
            <div class="detail-section">
              <strong>📅 Cook Timeline:</strong>
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
              <strong>⭐ Ratings:</strong>
              ${cook.ease_rating ? html`
                <p>Ease: ${'⭐'.repeat(cook.ease_rating)}${'☆'.repeat(5 - cook.ease_rating)}</p>
              ` : ''}
              ${cook.result_rating ? html`
                <p>Result: ${'⭐'.repeat(cook.result_rating)}${'☆'.repeat(5 - cook.result_rating)}</p>
              ` : ''}
            </div>
          ` : ''}

          ${cook.notes ? html`
            <div class="detail-section">
              <strong>📝 Notes:</strong>
              <p class="cook-notes">${cook.notes}</p>
            </div>
          ` : ''}

          <div class="detail-actions">
            <button class="primary-btn" @click=${() => this._restartCook(cook)}>
              🔄 Restart This Cook
            </button>
            <button class="small-btn" @click=${() => {
              const notes = prompt('Update notes:', cook.notes || '');
              if (notes !== null) {
                this._updateCookNotes(cook.id, notes);
                // Update the displayed cook
                cook.notes = notes;
                this.requestUpdate();
              }
            }}>✏️ Edit Notes</button>
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

    // If it's a MEATER probe cook with temperature data
    if (cook.target_temp_c && cook.protein) {
      // Navigate to MEATER cooking path with pre-filled data
      this._currentPath = 'meater';
      this._showMeaterCooking = true;
      this.requestUpdate();
      return;
    }

    // Fallback: show message that this cook type can't be restarted
    alert('This cook type cannot be automatically restarted. Please set up a new cook manually.');
  }

  /**
   * Start a recipe cook session
   */
  _startRecipeCook(recipe, servingSize = null) {
    // Clear any existing timer
    if (this._recipeCookTimer) {
      clearInterval(this._recipeCookTimer);
    }

    // Initialize cook state
    this._recipeCookState = {
      recipe: recipe,
      startTime: Date.now(),
      currentStep: -1, // -1 = overview page, 0+ = step index
      servingSize: servingSize || recipe.serving_size || 4,
      easeRating: null,
      resultRating: null,
      notes: '',
      meaterSubprocess: null // Will store subprocess info if MEATER is started
    };

    // Start timer that updates every second
    this._recipeCookTimer = setInterval(() => {
      this.requestUpdate();
    }, 1000);

    this.requestUpdate();
  }

  /**
   * Stop the recipe cook and clean up
   */
  _stopRecipeCook() {
    // Clear timer
    if (this._recipeCookTimer) {
      clearInterval(this._recipeCookTimer);
      this._recipeCookTimer = null;
    }

    // Clear state
    this._recipeCookState = null;
    
    // Navigate back to welcome
    this._navigateToWelcome();
  }

  /**
   * Advance to next recipe step
   */
  _nextRecipeStep() {
    if (!this._recipeCookState) return;

    const recipe = this._recipeCookState.recipe;
    const maxStep = recipe.steps ? recipe.steps.length - 1 : 0;
    
    // If we're on the last step, go to finish page
    if (this._recipeCookState.currentStep >= maxStep) {
      this._recipeCookState.currentStep = maxStep + 1; // Finish page
    } else {
      this._recipeCookState.currentStep++;
    }
    
    this.requestUpdate();
  }

  /**
   * Go back to previous recipe step
   */
  _previousRecipeStep() {
    if (!this._recipeCookState) return;

    if (this._recipeCookState.currentStep > -1) {
      this._recipeCookState.currentStep--;
    } else {
      // If at overview, exit cook flow
      this._stopRecipeCook();
    }
    
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
      // Call the save_recipe_cook service
      await this.hass.callService('kitchen_cooking_engine', 'save_recipe_cook', {
        recipe_id: recipe.id || recipe.name,
        recipe_name: recipe.name,
        serving_size: state.servingSize,
        duration_seconds: elapsedSeconds,
        ease_rating: state.easeRating,
        result_rating: state.resultRating,
        notes: state.notes,
        ingredients: recipe.ingredients || [],
        appliance_id: this._selectedAppliance?.id || null
      });

      // Show success message
      this._showMessage('Recipe cook saved successfully! 🎉');

      // Stop the cook flow
      this._stopRecipeCook();

    } catch (error) {
      console.error('Error saving recipe cook:', error);
      this._showMessage(`Error saving recipe cook: ${error.message}`, true);
    }
  }

  /**
   * Phase 6: Toggle ingredient selection
   */
  _toggleIngredient(ingredient, enabled) {
    if (enabled) {
      if (!this._selectedIngredients.includes(ingredient)) {
        this._selectedIngredients = [...this._selectedIngredients, ingredient];
      }
    } else {
      this._selectedIngredients = this._selectedIngredients.filter(i => i !== ingredient);
    }
    this.requestUpdate();
  }

  /**
   * Phase 6: Add custom ingredient
   */
  _addCustomIngredient(ingredient) {
    if (ingredient && !this._selectedIngredients.includes(ingredient)) {
      this._selectedIngredients = [...this._selectedIngredients, ingredient];
      this.requestUpdate();
    }
  }

  /**
   * Phase 6: Remove ingredient from selection
   */
  _removeIngredient(ingredient) {
    this._selectedIngredients = this._selectedIngredients.filter(i => i !== ingredient);
    this.requestUpdate();
  }

  /**
   * Phase 6: Proceed to cooking style selection
   */
  _proceedToCookingStyle() {
    if (this._selectedIngredients.length < 2) {
      this._showMessage('Please select at least 2 ingredients', true);
      return;
    }
    
    this._showAIIngredientSelector = false;
    this._showAIStyleSelector = true;
    this.requestUpdate();
  }

  /**
   * Phase 6: Generate AI recipes based on selections
   */
  async _generateAIRecipes() {
    if (!this._selectedCookingStyle || this._selectedIngredients.length < 2) {
      this._showMessage('Please complete ingredient and style selection', true);
      return;
    }

    this._showAIStyleSelector = false;
    this._showAIRecipeSuggestions = true;
    this._aiRecipeSuggestions = []; // Clear previous suggestions
    this.requestUpdate();

    try {
      // Get appliance IDs (main + selected secondaries)
      const applianceIds = [this._selectedAppliance.id, ...this._selectedSecondaryAppliances];

      // Call AI recipe generation API
      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/generate', {
        ingredients: this._selectedIngredients,
        cooking_style: this._selectedCookingStyle,
        appliance_ids: applianceIds,
        main_appliance_id: this._selectedAppliance.id
      });

      if (response && response.suggestions) {
        this._aiRecipeSuggestions = response.suggestions;
      } else {
        this._showMessage('No recipes generated. Please try different ingredients or styles.', false);
      }
    } catch (error) {
      console.error('Error generating AI recipes:', error);
      this._showMessage('Error generating recipes. Please try again.', true);
      // Go back to style selection
      this._showAIRecipeSuggestions = false;
      this._showAIStyleSelector = true;
    }

    this.requestUpdate();
  }

  /**
   * Phase 6: Start cooking from an AI-generated recipe
   */
  _startCookingFromAIRecipe(recipe) {
    console.log('Starting cook from AI recipe:', recipe);
    
    // Start recipe cook flow (Phase 4)
    this._recipeCookState = {
      recipe: recipe,
      startTime: Date.now(),
      currentStep: -1, // Start with overview
      servingSize: recipe.serving_size || 4,
      easeRating: 0,
      resultRating: 0,
      notes: '',
      meaterSubprocess: null
    };

    // Start the timer
    this._startRecipeCookTimer();
    
    this.requestUpdate();
  }

  /**
   * Phase 5: Select a Ninja built-in recipe and start cooking
   */
  _selectNinjaRecipe(recipe) {
    console.log('Selected Ninja recipe:', recipe);
    
    // Start recipe cook flow (Phase 4)
    this._recipeCookState = {
      recipe: recipe,
      startTime: Date.now(),
      currentStep: -1, // Start with overview
      servingSize: recipe.serving_size || 4,
      easeRating: 0,
      resultRating: 0,
      notes: '',
      meaterSubprocess: null
    };

    // Start the timer
    this._startRecipeCookTimer();
    
    this.requestUpdate();
  }

  /**
   * Render the Recipe Cook Flow interface
   */
  _renderRecipeCookFlow() {
    if (!this._recipeCookState) return html``;

    const state = this._recipeCookState;
    const recipe = state.recipe;
    const elapsedSeconds = Math.floor((Date.now() - state.startTime) / 1000);
    const currentStepIndex = state.currentStep;
    const isOverview = currentStepIndex === -1;
    const isFinishPage = currentStepIndex >= (recipe.steps ? recipe.steps.length : 0);
    
    return html`
      <!-- Recipe Cook Header -->
      <div class="recipe-cook-header">
        <div class="recipe-cook-title">
          <h2>${recipe.name}</h2>
          <p class="recipe-cook-serving">
            Serves: ${state.servingSize} | Elapsed: ${this._formatElapsedTime(elapsedSeconds)}
          </p>
        </div>
      </div>

      <ha-card>
        <div class="card-content">
          ${isOverview ? this._renderRecipeCookOverview() : 
            isFinishPage ? this._renderRecipeCookFinish() : 
            this._renderRecipeCookStep(currentStepIndex)}
        </div>
      </ha-card>

      <!-- Recipe Cook Footer -->
      <div class="recipe-cook-footer">
        <div class="footer-left">
          <button class="secondary-btn" @click=${this._previousRecipeStep}>
            ${isOverview ? '✕ Exit' : '← Back'}
          </button>
        </div>
        <div class="footer-middle">
          ${this._renderMeaterProbeInfo()}
        </div>
        <div class="footer-right">
          ${isFinishPage ? html`
            <button class="primary-btn" @click=${this._saveRecipeCook}
              ?disabled=${!state.easeRating || !state.resultRating}>
              ✓ Save Cook
            </button>
          ` : html`
            <button class="primary-btn" @click=${this._nextRecipeStep}>
              ${isOverview ? 'Start →' : currentStepIndex === recipe.steps.length - 1 ? 'Finish' : 'Next →'}
            </button>
          `}
        </div>
      </div>
    `;
  }

  /**
   * Render recipe overview page (step -1)
   */
  _renderRecipeCookOverview() {
    const recipe = this._recipeCookState.recipe;
    
    return html`
      <div class="recipe-cook-overview">
        <h3>📋 Recipe Overview</h3>
        
        ${recipe.description ? html`
          <p class="recipe-description">${recipe.description}</p>
        ` : ''}

        ${recipe.total_time ? html`
          <p><strong>⏱️ Total Time:</strong> ${recipe.total_time} minutes</p>
        ` : ''}

        <div class="recipe-cook-ingredients">
          <h4>🛒 Ingredients</h4>
          <ul>
            ${(recipe.ingredients || []).map(ing => html`
              <li>${ing}</li>
            `)}
          </ul>
        </div>

        ${recipe.steps && recipe.steps.length > 0 ? html`
          <div class="recipe-cook-step-overview">
            <h4>📝 Steps (${recipe.steps.length})</h4>
            <ol>
              ${recipe.steps.map((step, idx) => html`
                <li>
                  ${step.name || `Step ${idx + 1}`}
                  ${step.time ? html` <span class="step-time">(~${step.time} min)</span>` : ''}
                </li>
              `)}
            </ol>
          </div>
        ` : ''}
      </div>
    `;
  }

  /**
   * Render individual recipe step
   */
  _renderRecipeCookStep(stepIndex) {
    const recipe = this._recipeCookState.recipe;
    const step = recipe.steps[stepIndex];
    
    if (!step) {
      return html`<p>Step not found</p>`;
    }

    // Get ingredients mentioned in this step (if available)
    const stepIngredients = step.ingredients || [];
    
    return html`
      <div class="recipe-cook-step-detail">
        <div class="step-header">
          <h3>Step ${stepIndex + 1} of ${recipe.steps.length}</h3>
          <h4>${step.name || `Step ${stepIndex + 1}`}</h4>
          ${step.time ? html`<p class="step-time">⏱️ ~${step.time} minutes</p>` : ''}
        </div>

        <div class="step-instructions">
          <p>${step.instructions || step.description || 'No instructions available.'}</p>
        </div>

        ${stepIngredients.length > 0 ? html`
          <div class="step-ingredients">
            <h5>Ingredients for this step:</h5>
            <ul>
              ${stepIngredients.map(ing => html`<li>${ing}</li>`)}
            </ul>
          </div>
        ` : ''}

        ${step.temperature ? html`
          <div class="step-temp">
            <strong>🌡️ Temperature:</strong> ${step.temperature}
          </div>
        ` : ''}

        ${step.notes ? html`
          <div class="step-notes">
            <strong>💡 Tip:</strong> ${step.notes}
          </div>
        ` : ''}

        <!-- Show all ingredients with current step's ingredients highlighted -->
        ${recipe.ingredients && recipe.ingredients.length > 0 ? html`
          <div class="recipe-cook-ingredients">
            <h5>📋 All Ingredients</h5>
            <ul>
              ${recipe.ingredients.map(ing => {
                // Improved matching: check if step ingredient words appear in full ingredient
                // This reduces false positives like 'chicken breast' matching 'chicken stock'
                const ingLower = ing.toLowerCase();
                const isActive = stepIngredients.some(si => {
                  const siLower = si.toLowerCase();
                  // Extract key words (ignore common measurements and prepositions)
                  const keyWords = siLower.split(/[\s,]+/).filter(w => 
                    w.length > 3 && !['cups', 'tbsp', 'tsp', 'ounce', 'pound', 'gram'].includes(w)
                  );
                  // Match if any key word is found as a whole word in ingredient
                  return keyWords.some(word => {
                    const regex = new RegExp(`\\b${word}\\b`, 'i');
                    return regex.test(ingLower);
                  }) || ingLower === siLower; // Exact match fallback
                });
                return html`
                  <li class="${isActive ? 'active-ingredient' : ''}">${ing}</li>
                `;
              })}
            </ul>
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
        <h3>🎉 Cook Complete!</h3>
        <p>How did it go? Please rate your experience:</p>

        <div class="recipe-cook-rating">
          <h4>😊 Ease of Cooking</h4>
          <p class="rating-description">How easy was this recipe to follow?</p>
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
          <h4>😋 Result Quality</h4>
          <p class="rating-description">How did the final dish turn out?</p>
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
          <h4>📝 Notes (Optional)</h4>
          <textarea
            placeholder="Any notes, modifications, or thoughts about this cook..."
            .value=${state.notes || ''}
            @input=${(e) => {
              this._recipeCookState.notes = e.target.value;
            }}
            rows="4"
          ></textarea>
        </div>

        ${!state.easeRating || !state.resultRating ? html`
          <p class="rating-required">⚠️ Please provide both ratings to save this cook</p>
        ` : ''}
      </div>
    `;
  }

  /**
   * Render MEATER probe info in footer middle section
   */
  _renderMeaterProbeInfo() {
    // TODO: Integrate with MEATER subprocess if active
    // For now, just show placeholder
    if (this._recipeCookState?.meaterSubprocess) {
      return html`
        <div class="meater-probe-info">
          <span class="probe-temp">🌡️ 45°C</span>
          <span class="probe-status">Cooking</span>
        </div>
      `;
    }
    return html``;
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
      alert('Failed to load MEATER cook history.\n\nPlease check:\n1. Integration is running\n2. Home Assistant logs for errors\n3. Browser console for details');
    }
  }

  /**
   * Phase 5: Start Ninja Combi Recipe Builder
   * Opens the existing ninja_combi_recipe_builder functionality
   */
  _startNinjaRecipeBuilder() {
    console.log('Starting Ninja Recipe Builder...');
    this._showRecipeBuilder = true;
    this._currentPath = 'ninja_recipe_builder';
    this.requestUpdate();
  }

  /**
   * Phase 5: Show Ninja Combi built-in recipes
   * Loads and displays pre-configured Ninja Combi recipes
   */
  _showNinjaBuiltInRecipes() {
    console.log('Loading Ninja built-in recipes...');
    
    // Use embedded NINJA_COMBI_RECIPES data
    if (typeof NINJA_COMBI_RECIPES !== 'undefined' && NINJA_COMBI_RECIPES && NINJA_COMBI_RECIPES.length > 0) {
      this._ninjaBuiltInRecipes = NINJA_COMBI_RECIPES;
      this._showNinjaRecipeList = true;
      this._currentPath = 'ninja_built_in_recipes';
      this.requestUpdate();
    } else {
      alert('No Ninja Combi recipes available. Please ensure the integration is up to date.');
      this._currentPath = 'ninja_combi';
      this.requestUpdate();
    }
  }

  /**
   * Phase 6: Launch AI Recipe Builder with Ninja Combi pre-selected
   * Pre-selects Ninja Combi as main appliance and opens AI builder
   */
  async _startAIWithNinjaCombi() {
    console.log('Starting AI Recipe Builder with Ninja Combi...');
    
    // Load data FIRST (same pattern as _startAIRecipeCreation)
    try {
      // Load ingredients if not already loaded
      if (!this._commonIngredients) {
        const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/ingredients');
        this._commonIngredients = response.ingredients || [];
      }
      
      // Load cooking styles if not already loaded
      if (!this._cookingStyles) {
        const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/cooking_styles');
        this._cookingStyles = response.cooking_styles || [];
      }
    } catch (e) {
      console.error('Error loading AI recipe data:', e);
      this._commonIngredients = this._commonIngredients || [];
      this._cookingStyles = this._cookingStyles || [];
    }
    
    // Pre-select Ninja Combi and launch AI builder with data loaded
    this._selectedMainAppliance = 'ninja_combi';
    this._currentPath = 'ai_recipe_builder';
    this._showAIIngredientSelector = true;
    this._selectedIngredients = [];
    this._selectedCookingStyle = null;
    this.requestUpdate();
  }

  /**
   * Phase 5: Show recent Ninja Combi cooks (filtered history)
   * Displays cook history filtered for Ninja Combi recipes
   */
  _showRecentNinjaCooks() {
    console.log('Showing recent Ninja Combi cooks...');
    this._currentPath = 'recent_ninja';
    this._loadHistory();
    this.requestUpdate();
  }

  /**
   * Phase 6: Start AI Recipe Creation
   * Opens ingredient selection for AI recipe generation
   */
  async _startAIRecipeCreation() {
    console.log('Starting AI Recipe Creation...');
    this._currentPath = 'ai_recipe_builder';
    this._selectedIngredients = [];
    this._selectedCookingStyle = null;
    this._aiRecipeSuggestions = [];
    
    // Load data before showing UI to avoid "[object Promise]" display
    try {
      // Load ingredients if not already loaded
      if (!this._commonIngredients) {
        const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/ingredients');
        this._commonIngredients = response.ingredients || [];
      }
      
      // Load cooking styles if not already loaded
      if (!this._cookingStyles) {
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
    console.log('Showing recent appliance recipes...');
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
    console.log(`Toggle secondary appliance ${applianceId}: ${enabled}`);
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
    return html`
      <div class="status-banner idle">
        <h2>📜 Cook History</h2>
        <p>Your past cooking sessions</p>
      </div>
      
      ${this._cookHistory.length === 0 ? html`
        <ha-card>
          <div class="card-content">
            <p class="no-history">No cooks recorded yet. Complete a cooking session to see it here!</p>
          </div>
        </ha-card>
      ` : html`
        ${this._cookHistory.map(cook => html`
          <ha-card class="history-card clickable" @click=${() => {
            this._selectedCookForDetail = cook;
            this.requestUpdate();
          }}>
            <div class="card-content">
              <div class="history-header">
                <h3>${cook.cut_display || cook.cut}</h3>
                <span class="history-date">${this._formatDateTime(cook.completed_at)}</span>
              </div>
              <div class="history-details">
                <span class="history-detail">🥩 ${cook.protein}</span>
                <span class="history-detail">🎯 ${(cook.doneness || '').replace('_', ' ')}</span>
                <span class="history-detail">🍳 ${(cook.cooking_method || '').replace(/_/g, ' ')}</span>
                <span class="history-detail">🌡️ ${cook.target_temp_c}°C target</span>
                ${cook.peak_temp_c ? html`<span class="history-detail">📈 ${Math.round(cook.peak_temp_c)}°C peak</span>` : ''}
                ${cook.final_temp_after_rest ? html`<span class="history-detail">✅ ${Math.round(cook.final_temp_after_rest)}°C after rest</span>` : 
                  cook.final_temp ? html`<span class="history-detail">✅ ${cook.final_temp}°C final</span>` : ''}
              </div>
              ${cook.notes ? html`
                <div class="history-notes">
                  <strong>📝 Notes:</strong> ${cook.notes}
                </div>
              ` : ''}
              <div class="history-actions" @click=${(e) => e.stopPropagation()}>
                <button class="small-btn" @click=${() => {
                  const notes = prompt('Update notes:', cook.notes || '');
                  if (notes !== null) this._updateCookNotes(cook.id, notes);
                }}>✏️ Edit Notes</button>
                <button class="small-btn danger" @click=${() => this._deleteCook(cook.id)}>🗑️ Delete</button>
              </div>
            </div>
          </ha-card>
        `)}
      `}
    `;
  }

  async _startCook() {
    try {
      // v0.5.0.30 pattern restored: Trust the entity selection from the form
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
      
      console.log('Starting cook with entity:', this._selectedEntity);
      console.log('Service data:', serviceData);
      
      // Wait for service call to complete before navigating
      await this._callService('start_cook', serviceData);
      
      // Small delay to ensure entity state propagates to frontend
      await new Promise(resolve => setTimeout(resolve, 300));
      
      // Check if cook actually started by verifying entity state
      const entity = this.hass.states[this._selectedEntity];
      const entityState = entity?.state?.toLowerCase();
      
      if (entityState === 'cooking' || entityState === 'approaching') {
        // Success! Close the MEATER setup UI and navigate
        this._showMeaterCooking = false;
        this._currentPath = 'welcome';
        this.requestUpdate();
      } else {
        // Cook didn't start - show error to user
        console.error('Cook failed to start. Entity state:', entity.state);
        alert(`Failed to start cook. Entity state is "${entity.state}" instead of "cooking".\n\nPlease check:\n1. All fields are filled\n2. Valid meat/cut selection\n3. Home Assistant logs for errors`);
      }
    } catch (error) {
      console.error('Error starting cook:', error);
      alert(`Failed to start cook: ${error.message || 'Unknown error'}\n\nCheck browser console and Home Assistant logs for details.`);
    }
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
    this._callService('complete_session');
  }

  static get styles() {
    return css`
      :host {
        display: block;
      }

      .content {
        padding: 16px;
        max-width: 800px;
        margin: 0 auto;
      }

      .loading {
        text-align: center;
        padding: 48px;
        color: var(--secondary-text-color);
      }

      ha-card {
        margin-bottom: 16px;
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
        display: inline-block;
        padding: 4px 10px;
        background: var(--secondary-background-color);
        color: var(--secondary-text-color);
        border-radius: 12px;
        font-size: 11px;
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
      }

      .welcome-header h1 {
        font-size: 32px;
        margin: 0 0 8px 0;
        color: var(--primary-text-color);
      }

      .welcome-subtitle {
        font-size: 18px;
        color: var(--secondary-text-color);
        margin: 0;
      }

      /* Appliance Grid */
      .appliance-grid {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
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
      }

      .appliance-model {
        font-size: 14px;
        color: var(--secondary-text-color);
      }

      /* Previous Cooks Card */
      .previous-cooks-card {
        transition: transform 0.2s, box-shadow 0.2s;
      }

      .previous-cooks-card:hover {
        transform: translateY(-4px);
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
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
      }

      .recipe-cook-header h2 {
        margin: 0 0 8px 0;
        font-size: 24px;
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
        background: var(--divider-color);
        border-radius: 6px;
        transition: all 0.2s;
      }

      .recipe-cook-ingredients li.active-ingredient {
        background: var(--primary-color);
        color: white;
        font-weight: 600;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
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
        border-left: 4px solid var(--primary-color);
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

      /* Recipe Cook Footer */
      .recipe-cook-footer {
        display: flex;
        align-items: center;
        justify-content: space-between;
        gap: 16px;
        margin-top: 16px;
        padding: 16px;
        background: var(--card-background-color);
        border-radius: 8px;
        border: 1px solid var(--divider-color);
      }

      .footer-left,
      .footer-right {
        flex: 1;
      }

      .footer-middle {
        flex: 1;
        text-align: center;
      }

      .footer-right {
        text-align: right;
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
        .recipe-cook-footer {
          flex-direction: column;
          gap: 12px;
        }

        .footer-left,
        .footer-middle,
        .footer-right {
          width: 100%;
          text-align: center;
        }

        .footer-right {
          text-align: center;
        }

        .star-selector {
          flex-wrap: wrap;
        }

        .star-btn {
          font-size: 28px;
        }
      }
    `;
  }
}

// Force re-registration by using a versioned element name
// This bypasses browser's cached customElements registry
// MUST match the "name" in __init__.py panel config
const PANEL_VERSION = "117";

// Register with versioned name (what HA frontend will look for)
const VERSIONED_NAME = `kitchen-cooking-panel-v${PANEL_VERSION}`;
if (!customElements.get(VERSIONED_NAME)) {
  customElements.define(VERSIONED_NAME, KitchenCookingPanel);
}
