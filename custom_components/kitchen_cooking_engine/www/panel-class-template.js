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
      _aiIngredients: { type: Array },
      _aiCookingStyles: { type: Array },
      _aiSelectedIngredients: { type: Set },
      _aiSelectedStyle: { type: String },
      _aiSuggestions: { type: Array },
      _aiSelectedSuggestion: { type: Object },
      _aiRecipeDetail: { type: Object },
      _isLoadingAISuggestions: { type: Boolean },
      _isLoadingAIDetail: { type: Boolean },
      _aiOpenAIAvailable: { type: Boolean },
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
    this._aiSelectedIngredients = new Set();
    this._aiSelectedStyle = null;
    this._aiSuggestions = [];
    this._aiSelectedSuggestion = null;
    this._aiRecipeDetail = null;
    this._isLoadingAISuggestions = false;
    this._isLoadingAIDetail = false;
    this._aiOpenAIAvailable = null;
    // Data is generated from backend Python files at install/update time
    // Run generate_frontend_data.py after modifying cooking_data.py or swedish_cooking_data.py
  }

  connectedCallback() {
    super.connectedCallback();
    // Data is embedded in this file - generated from backend at build time
    
    // Load user preferences
    this._loadPreferences();
    
    // Phase 3.3: Load appliances and features
    this._loadAppliances();
    this._loadAvailableFeatures();
    
    // Fix for white screen when returning to browser tab
    // Force re-render when tab becomes visible again
    this._visibilityHandler = () => {
      if (document.visibilityState === 'visible') {
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
      const response = await this.hass.callApi('GET', 'kitchen_cooking_engine/history');
      if (response && response.history) {
        this._cookHistory = response.history;
      }
    } catch (e) {
      console.log('Could not load history:', e);
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

  // AI Recipe Builder: Load data
  async _loadAIRecipeBuilderData() {
    try {
      // Check if OpenAI is available
      const checkResponse = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/check');
      this._aiOpenAIAvailable = checkResponse.available;
      
      // Load ingredients
      const ingredientsResponse = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/ingredients');
      this._aiIngredients = ingredientsResponse.ingredients;
      
      // Load cooking styles
      const stylesResponse = await this.hass.callApi('GET', 'kitchen_cooking_engine/ai_recipes/cooking_styles');
      this._aiCookingStyles = stylesResponse.cooking_styles;
      
      this.requestUpdate();
    } catch (e) {
      console.error('Failed to load AI recipe builder data:', e);
      this._errorMessage = 'Failed to load AI recipe builder. Please try again.';
    }
  }

  // AI Recipe Builder: Toggle ingredient selection
  _toggleIngredient(ingredientId) {
    if (this._aiSelectedIngredients.has(ingredientId)) {
      this._aiSelectedIngredients.delete(ingredientId);
    } else {
      this._aiSelectedIngredients.add(ingredientId);
    }
    this.requestUpdate();
  }

  // AI Recipe Builder: Generate recipe suggestions
  async _generateAIRecipes() {
    if (this._aiSelectedIngredients.size === 0) {
      alert('Please select at least one ingredient');
      return;
    }
    
    if (!this._aiSelectedStyle) {
      alert('Please select a cooking style');
      return;
    }
    
    this._isLoadingAISuggestions = true;
    this._aiSuggestions = [];
    this._aiSelectedSuggestion = null;
    this._aiRecipeDetail = null;
    this.requestUpdate();
    
    try {
      // Get appliance IDs if available
      const applianceIds = this._appliances.map(a => a.id);
      
      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/generate', {
        ingredients: Array.from(this._aiSelectedIngredients),
        cooking_style: this._aiSelectedStyle,
        appliance_ids: applianceIds,
        servings: 4,
      });
      
      if (response.status === 'ok') {
        this._aiSuggestions = response.suggestions;
      } else {
        alert('Failed to generate recipes: ' + response.message);
      }
    } catch (e) {
      console.error('Failed to generate AI recipes:', e);
      alert('Failed to generate recipes. Please check your OpenAI configuration.');
    } finally {
      this._isLoadingAISuggestions = false;
      this.requestUpdate();
    }
  }

  // AI Recipe Builder: Get recipe detail
  async _getAIRecipeDetail(suggestion) {
    this._isLoadingAIDetail = true;
    this._aiSelectedSuggestion = suggestion;
    this._aiRecipeDetail = null;
    this.requestUpdate();
    
    try {
      const applianceIds = this._appliances.map(a => a.id);
      
      const response = await this.hass.callApi('POST', 'kitchen_cooking_engine/ai_recipes/detail', {
        suggestion_id: suggestion.id,
        appliance_ids: applianceIds,
      });
      
      if (response.status === 'ok') {
        this._aiRecipeDetail = response.detail;
      } else {
        alert('Failed to get recipe detail: ' + response.message);
      }
    } catch (e) {
      console.error('Failed to get AI recipe detail:', e);
      alert('Failed to get recipe detail. Please try again.');
    } finally {
      this._isLoadingAIDetail = false;
      this.requestUpdate();
    }
  }

  // AI Recipe Builder: Back to suggestions
  _backToAISuggestions() {
    this._aiSelectedSuggestion = null;
    this._aiRecipeDetail = null;
    this.requestUpdate();
  }

  // AI Recipe Builder: Reset and start over
  _resetAIRecipeBuilder() {
    this._aiSelectedIngredients.clear();
    this._aiSelectedStyle = null;
    this._aiSuggestions = [];
    this._aiSelectedSuggestion = null;
    this._aiRecipeDetail = null;
    this.requestUpdate();
  }

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
    this.hass.callService('kitchen_cooking_engine', service, {
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
      await this._loadAIRecipeBuilderData();
    }
  }

  _selectNinjaRecipe(recipeId) {
    this._selectedNinjaRecipe = recipeId;
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
    // Find a MEATER sensor entity
    const meaterEntity = Object.keys(this.hass.states).find(entity_id => 
      entity_id.includes('meater') && 
      entity_id.includes('sensor') && 
      entity_id.includes('cook')
    );

    if (!meaterEntity) {
      alert('⚠️ No MEATER sensor found.\n\nPlease ensure your MEATER device is connected to Home Assistant.');
      return;
    }

    // Prepare the service call data
    const serviceData = {
      entity_id: meaterEntity,
      meat_type: recipe.name,
      target_temp_c: recipe.target_temp_c,
      target_temp_f: recipe.target_temp_f,
      cooking_method: recipe.mode,
      notes: `Ninja Combi: ${recipe.name}\n${recipe.description}`
    };

    // Show confirmation with recipe details
    const confirmMsg = `🚀 Start Cook with MEATER+\n\n` +
      `Recipe: ${recipe.name}\n` +
      `Target: ${recipe.target_temp_c}°C (${recipe.target_temp_f}°F)\n` +
      `Mode: ${recipe.mode}\n` +
      `Cook Time: ${recipe.cook_time_minutes} min\n\n` +
      `This will start a cooking session with your MEATER probe.`;

    if (confirm(confirmMsg)) {
      // Call the Home Assistant service to start the cook
      this.hass.callService('kitchen_cooking_engine', 'start_cook', serviceData)
        .then(() => {
          alert('✅ Cooking session started!\n\nMonitor your cook in the main panel.');
          // Return to main view
          this._showNinjaCombi = false;
          this._selectedNinjaRecipe = null;
        })
        .catch(err => {
          alert(`❌ Error starting cook:\n\n${err.message}`);
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

  // AI Recipe Builder: Main render function
  _renderAIRecipeBuilder() {
    // Check if OpenAI is not available
    if (this._aiOpenAIAvailable === false) {
      return html`
        <ha-card>
          <div class="card-header">
            <h2>🤖 AI Recipe Builder</h2>
          </div>
          <div class="card-content">
            <div class="warning-message">
              <p><strong>⚠️ OpenAI Not Configured</strong></p>
              <p>The AI Recipe Builder requires the OpenAI conversation integration to be set up.</p>
              <p>Please configure it in: <strong>Settings → Voice Assistants → Add Assistant → OpenAI</strong></p>
            </div>
          </div>
        </ha-card>
      `;
    }

    // Show recipe detail if selected
    if (this._aiRecipeDetail) {
      return this._renderAIRecipeDetail();
    }

    // Show suggestions if generated
    if (this._aiSuggestions.length > 0) {
      return this._renderAISuggestions();
    }

    // Show ingredient/style selection
    return this._renderAIIngredientSelection();
  }

  _renderAIIngredientSelection() {
    return html`
      <ha-card>
        <div class="card-header">
          <h2>🤖 AI Recipe Builder</h2>
          <p style="margin: 8px 0 0 0; font-size: 0.9em; color: var(--secondary-text-color);">
            Select ingredients and cooking style to generate custom recipes
          </p>
        </div>
        <div class="card-content">
          ${this._isLoadingAISuggestions ? html`
            <div class="loading-spinner">
              <p>🤖 Generating recipes with AI...</p>
              <p style="font-size: 0.9em; color: var(--secondary-text-color);">This may take a few moments</p>
            </div>
          ` : html`
            <!-- Cooking Style Selection -->
            <div class="ai-section">
              <h3>1. Choose Your Cooking Style</h3>
              <div class="cooking-styles-grid">
                ${this._aiCookingStyles.map(style => html`
                  <button
                    class="cooking-style-btn ${this._aiSelectedStyle === style.id ? 'selected' : ''}"
                    @click=${() => { this._aiSelectedStyle = style.id; this.requestUpdate(); }}
                  >
                    ${style.name}
                  </button>
                `)}
              </div>
            </div>

            <!-- Ingredient Selection -->
            <div class="ai-section">
              <h3>2. Select Ingredients (${this._aiSelectedIngredients.size} selected)</h3>
              ${Object.entries(this._aiIngredients || {}).map(([category, ingredients]) => html`
                <div class="ingredient-category">
                  <h4>${category.replace('_', ' ').toUpperCase()}</h4>
                  <div class="ingredients-grid">
                    ${ingredients.map(ing => html`
                      <button
                        class="ingredient-btn ${this._aiSelectedIngredients.has(ing.id) ? 'selected' : ''}"
                        @click=${() => this._toggleIngredient(ing.id)}
                      >
                        ${ing.name}
                      </button>
                    `)}
                  </div>
                </div>
              `)}
            </div>

            <!-- Available Appliances Info -->
            ${this._appliances.length > 0 ? html`
              <div class="ai-section">
                <h3>📍 Your Kitchen Equipment</h3>
                <div class="appliances-info">
                  ${this._appliances.map(a => html`
                    <span class="appliance-tag">${a.brand} ${a.model}</span>
                  `)}
                </div>
                <p style="font-size: 0.85em; color: var(--secondary-text-color); margin-top: 8px;">
                  AI will generate recipes optimized for your equipment
                </p>
              </div>
            ` : ''}

            <!-- Generate Button -->
            <div class="ai-actions">
              <button
                class="primary-btn large"
                @click=${this._generateAIRecipes}
                ?disabled=${this._aiSelectedIngredients.size === 0 || !this._aiSelectedStyle}
              >
                🤖 Generate 4 Recipe Ideas
              </button>
              ${this._aiSelectedIngredients.size > 0 || this._aiSelectedStyle ? html`
                <button
                  class="secondary-btn"
                  @click=${this._resetAIRecipeBuilder}
                >
                  Reset Selection
                </button>
              ` : ''}
            </div>
          `}
        </div>
      </ha-card>
    `;
  }

  _renderAISuggestions() {
    return html`
      <ha-card>
        <div class="card-header">
          <h2>🤖 AI Recipe Suggestions</h2>
          <p style="margin: 8px 0 0 0; font-size: 0.9em; color: var(--secondary-text-color);">
            Select a recipe to see full details and instructions
          </p>
        </div>
        <div class="card-content">
          <div class="ai-suggestions-grid">
            ${this._aiSuggestions.map(suggestion => html`
              <div class="ai-suggestion-card" @click=${() => this._getAIRecipeDetail(suggestion)}>
                <h3>${suggestion.name}</h3>
                <p class="suggestion-description">${suggestion.description}</p>
                <div class="suggestion-meta">
                  <span>⏱️ ${suggestion.cook_time_minutes} min</span>
                  <span>📊 ${suggestion.difficulty}</span>
                  ${suggestion.cuisine_type ? html`<span>🌍 ${suggestion.cuisine_type}</span>` : ''}
                </div>
                <div class="suggestion-ingredients">
                  ${suggestion.main_ingredients.map(ing => html`
                    <span class="ingredient-tag">${ing}</span>
                  `)}
                </div>
                <button class="view-recipe-btn">View Full Recipe →</button>
              </div>
            `)}
          </div>
          
          <div class="ai-actions">
            <button class="secondary-btn" @click=${this._resetAIRecipeBuilder}>
              ← Start Over with New Ingredients
            </button>
          </div>
        </div>
      </ha-card>
    `;
  }

  _renderAIRecipeDetail() {
    const detail = this._aiRecipeDetail;
    const suggestion = detail.suggestion;

    return html`
      <ha-card>
        <div class="card-header">
          <h2>${suggestion.name}</h2>
          <p style="margin: 8px 0 0 0; font-size: 0.9em; color: var(--secondary-text-color);">
            AI-Generated Recipe
          </p>
        </div>
        <div class="card-content">
          ${this._isLoadingAIDetail ? html`
            <div class="loading-spinner">
              <p>🤖 Generating detailed recipe...</p>
            </div>
          ` : html`
            <!-- Recipe Overview -->
            <div class="recipe-overview">
              <p><strong>${suggestion.description}</strong></p>
              <div class="recipe-meta">
                <span>⏱️ Total: ${suggestion.cook_time_minutes + detail.prep_time_minutes} min</span>
                <span>👨‍🍳 Prep: ${detail.prep_time_minutes} min</span>
                <span>🔥 Cook: ${suggestion.cook_time_minutes} min</span>
                <span>🍽️ Serves: ${detail.servings}</span>
                <span>📊 ${suggestion.difficulty}</span>
              </div>
            </div>

            ${detail.use_probe ? html`
              <div class="probe-info">
                <p><strong>🌡️ Temperature Probe Recommended</strong></p>
                <p>Target: ${detail.target_temp_c}°C / ${detail.target_temp_f}°F</p>
              </div>
            ` : ''}

            <!-- Ingredients -->
            <div class="recipe-section">
              <h3>📝 Ingredients</h3>
              <ul class="ingredients-list">
                ${detail.ingredients.map(ing => html`<li>${ing}</li>`)}
              </ul>
            </div>

            <!-- Cooking Phases (if available) -->
            ${detail.phases.length > 0 ? html`
              <div class="recipe-section">
                <h3>🔥 Cooking Program</h3>
                ${detail.phases.map((phase, idx) => html`
                  <div class="cooking-phase">
                    <strong>Phase ${idx + 1}:</strong> ${phase.description}
                    <br>
                    <span>${phase.temperature_c}°C (${phase.temperature_f}°F) for ${phase.duration_minutes} minutes</span>
                  </div>
                `)}
              </div>
            ` : ''}

            <!-- Instructions -->
            <div class="recipe-section">
              <h3>👨‍🍳 Instructions</h3>
              <ol class="instructions-list">
                ${detail.instructions.map(inst => html`<li>${inst}</li>`)}
              </ol>
            </div>

            <!-- Tips -->
            ${detail.tips.length > 0 ? html`
              <div class="recipe-section">
                <h3>💡 Tips</h3>
                <ul class="tips-list">
                  ${detail.tips.map(tip => html`<li>${tip}</li>`)}
                </ul>
              </div>
            ` : ''}

            <!-- Actions -->
            <div class="ai-actions">
              <button class="secondary-btn" @click=${this._backToAISuggestions}>
                ← Back to Suggestions
              </button>
              <button class="primary-btn" @click=${this._resetAIRecipeBuilder}>
                🔄 Generate New Recipes
              </button>
            </div>
          `}
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
    // Check if we have a temperature probe appliance
    const probeAppliances = this._appliances.filter(app => 
      app.features && app.features.includes('temperature_probe')
    );
    
    if (probeAppliances.length === 0) {
      alert(`Cannot start cooking session!\n\n` +
        `This recipe requires temperature monitoring, but no MEATER+ probe is configured.\n\n` +
        `Please add a MEATER+ appliance in:\n` +
        `Settings → Devices & Services → Add Integration → Kitchen Cooking Engine`);
      return;
    }

    // Find cooking session entities for temperature probes
    const entities = this._findCookingEntities();
    if (entities.length === 0) {
      alert(`No cooking session entities available.\n\nPlease ensure your MEATER+ probe is configured properly.`);
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
      alert(`Recipe loaded!\n\n` +
        `Now configure your cook on the setup screen:\n` +
        `- Select protein and cut\n` +
        `- Choose doneness level\n` +
        `- Select cooking method\n` +
        `- Start your cook\n\n` +
        `Tip: The recipe "${recipe.name}" works best with ${applianceNames}.`);
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

    const state = this._getState();
    // Only consider as active if state exists, is not unavailable/unknown, and is in an active cooking state
    const stateValue = state?.state;
    const isValidState = stateValue && stateValue !== 'unavailable' && stateValue !== 'unknown';
    const isActive = isValidState && stateValue !== 'idle' && stateValue !== 'complete';

    return html`
      <ha-top-app-bar-fixed>
        <ha-menu-button
            slot="navigationIcon"
            .hass=${this.hass}
            .narrow=${this.narrow}
        ></ha-menu-button>
        <div slot="title">🍳 Kitchen Cooking Engine</div>
        
        <div class="content">
          ${this._showHistory ? this._renderHistory() :
            this._showNinjaCombi ? this._renderNinjaCombi() :
            this._showAppliances ? this._renderAppliances() :
            this._showRecipes ? this._renderRecipes() :
            this._showAIRecipeBuilder ? this._renderAIRecipeBuilder() :
            (entities.length === 0 ? this._renderNoEntities() : 
              (isActive ? this._renderActiveCook(state) : this._renderSetupForm(entities)))}
          
          ${!isActive && entities.length > 0 ? html`
            <div class="history-toggle">
              <button class="history-btn ${this._showHistory ? 'active' : ''}" @click=${this._toggleHistory}>
                📜 ${this._showHistory ? 'Back to Cooking' : 'Cook History'}
              </button>
              <button class="history-btn ${this._showNinjaCombi ? 'active' : ''}" @click=${this._toggleNinjaCombi}>
                🥘 ${this._showNinjaCombi ? 'Back to Cooking' : 'Ninja Combi'}
              </button>
              <button class="history-btn ${this._showAppliances ? 'active' : ''}" @click=${this._toggleAppliances}>
                🔧 ${this._showAppliances ? 'Back to Cooking' : 'Appliances'}
              </button>
            </div>
          ` : ''}
          
          <!-- AI Recipe Builder and Appliances - Always visible -->
          ${entities.length === 0 ? html`
            <div class="history-toggle">
              <button class="history-btn ${this._showAppliances ? 'active' : ''}" @click=${this._toggleAppliances}>
                🔧 ${this._showAppliances ? 'Back to Cooking' : 'Appliances'}
              </button>
              <button class="history-btn ${this._showAIRecipeBuilder ? 'active' : ''}" @click=${this._toggleAIRecipeBuilder}>
                🤖 ${this._showAIRecipeBuilder ? 'Back to Cooking' : 'AI Recipe Builder'}
              </button>
            </div>
          ` : html`
            <div class="history-toggle" style="margin-top: 8px;">
              <button class="history-btn ${this._showAIRecipeBuilder ? 'active' : ''}" @click=${this._toggleAIRecipeBuilder}>
                🤖 ${this._showAIRecipeBuilder ? 'Back to Cooking' : 'AI Recipe Builder'}
              </button>
            </div>
          `}
        </div>
      </ha-top-app-bar-fixed>
    `;
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
    
    return html`
      <div class="status-banner idle">
        <h2>🍳 Ready to Cook</h2>
        <p>Select your protein and preferences below</p>
      </div>
      
      ${entities.length > 1 ? html`
        <ha-card>
          <div class="card-content">
            <h3>Select Session</h3>
            <select @change=${(e) => this._selectedEntity = e.target.value}>
              ${entities.map(e => html`
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
          <ha-card class="history-card">
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
              <div class="history-actions">
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
    `;
  }
}

// Force re-registration by using a versioned element name
// This bypasses browser's cached customElements registry
// MUST match the "name" in __init__.py panel config
const PANEL_VERSION = "44";

// Register with versioned name (what HA frontend will look for)
const VERSIONED_NAME = `kitchen-cooking-panel-v${PANEL_VERSION}`;
if (!customElements.get(VERSIONED_NAME)) {
  customElements.define(VERSIONED_NAME, KitchenCookingPanel);
}
