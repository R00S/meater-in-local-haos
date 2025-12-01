/**
 * Kitchen Cooking Engine Panel
 * 
 * Last Updated: 1 Dec 2025, 14:00 CET
 * Last Change: Created proper custom panel using LitElement
 * 
 * A custom panel for the Kitchen Cooking Engine integration.
 */

const CUTS_DATA = {
  beef: {
    name: "🥩 Beef",
    cuts: [
      { id: 100, name: "Ribeye Steak" },
      { id: 101, name: "Sirloin Steak" },
      { id: 102, name: "Filet Mignon" },
      { id: 103, name: "New York Strip" },
      { id: 104, name: "T-Bone / Porterhouse" },
      { id: 105, name: "Flank Steak" },
      { id: 120, name: "Prime Rib Roast" },
      { id: 130, name: "Chuck Roast" },
      { id: 131, name: "Brisket" },
      { id: 140, name: "Beef Burger" },
    ]
  },
  pork: {
    name: "🐷 Pork",
    cuts: [
      { id: 200, name: "Pork Chop" },
      { id: 201, name: "Pork Tenderloin" },
      { id: 210, name: "Pork Loin Roast" },
      { id: 211, name: "Pork Shoulder" },
      { id: 220, name: "Baby Back Ribs" },
    ]
  },
  poultry: {
    name: "🍗 Poultry",
    cuts: [
      { id: 300, name: "Whole Chicken" },
      { id: 310, name: "Chicken Breast" },
      { id: 320, name: "Chicken Thigh" },
      { id: 330, name: "Whole Turkey" },
      { id: 340, name: "Duck Breast" },
    ]
  },
  fish: {
    name: "🐟 Fish & Seafood",
    cuts: [
      { id: 400, name: "Salmon Fillet" },
      { id: 410, name: "Tuna Steak" },
      { id: 420, name: "Cod Fillet" },
      { id: 430, name: "Shrimp" },
      { id: 431, name: "Lobster Tail" },
    ]
  },
  lamb: {
    name: "🐑 Lamb",
    cuts: [
      { id: 500, name: "Leg of Lamb" },
      { id: 501, name: "Rack of Lamb" },
      { id: 510, name: "Lamb Chops" },
    ]
  }
};

const DONENESS_OPTIONS = [
  { value: "rare", name: "Rare", icon: "🔴" },
  { value: "medium_rare", name: "Medium Rare", icon: "🟠" },
  { value: "medium", name: "Medium", icon: "🟡" },
  { value: "medium_well", name: "Medium Well", icon: "🟤" },
  { value: "well_done", name: "Well Done", icon: "⚪" },
  { value: "pulled", name: "Pulled", icon: "🍖" },
];

const COOKING_METHODS = [
  { value: "oven_roast", name: "Oven Roast" },
  { value: "oven_bake", name: "Oven Bake" },
  { value: "pan_sear", name: "Pan Sear" },
  { value: "pan_fry", name: "Pan Fry" },
  { value: "grill", name: "Grill" },
  { value: "smoker", name: "Smoker" },
  { value: "air_fryer", name: "Air Fryer" },
  { value: "sous_vide", name: "Sous Vide" },
  { value: "slow_cooker", name: "Slow Cooker" },
];

class KitchenCookingPanel extends HTMLElement {
  constructor() {
    super();
    this.attachShadow({ mode: 'open' });
    this._hass = null;
    this._config = null;
    this._selectedCategory = null;
    this._selectedCut = null;
    this._selectedDoneness = "medium_rare";
    this._selectedMethod = "oven_roast";
    this._selectedEntity = null;
  }

  set hass(hass) {
    this._hass = hass;
    this._findCookingEntities();
    this._render();
  }

  setConfig(config) {
    this._config = config;
  }

  _findCookingEntities() {
    if (!this._hass) return;
    
    const entities = Object.keys(this._hass.states)
      .filter(id => id.startsWith('sensor.') && id.includes('cooking_session'));
    
    if (entities.length > 0 && !this._selectedEntity) {
      this._selectedEntity = entities[0];
    }
    
    this._entities = entities;
  }

  _getState() {
    if (!this._selectedEntity || !this._hass) return null;
    return this._hass.states[this._selectedEntity];
  }

  _callService(service, data = {}) {
    this._hass.callService('kitchen_cooking_engine', service, {
      entity_id: this._selectedEntity,
      ...data
    });
  }

  _render() {
    const state = this._getState();
    const isActive = state && state.state !== 'idle';

    this.shadowRoot.innerHTML = `
      <style>
        :host {
          display: block;
          padding: 16px;
          background: var(--primary-background-color);
          min-height: 100vh;
        }
        
        .container {
          max-width: 800px;
          margin: 0 auto;
        }
        
        .header {
          display: flex;
          align-items: center;
          margin-bottom: 24px;
          padding-bottom: 16px;
          border-bottom: 1px solid var(--divider-color);
        }
        
        .header-icon {
          font-size: 32px;
          margin-right: 16px;
        }
        
        .header h1 {
          font-size: 24px;
          font-weight: 500;
          margin: 0;
          color: var(--primary-text-color);
        }
        
        .card {
          background: var(--card-background-color);
          border-radius: 12px;
          box-shadow: var(--ha-card-box-shadow, 0 2px 8px rgba(0,0,0,0.1));
          padding: 24px;
          margin-bottom: 24px;
        }
        
        .card-title {
          font-size: 18px;
          font-weight: 500;
          margin-bottom: 16px;
          color: var(--primary-text-color);
        }
        
        .status-banner {
          padding: 16px;
          border-radius: 8px;
          margin-bottom: 24px;
          text-align: center;
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
        
        .status-banner h2 {
          margin: 0 0 4px 0;
          font-size: 20px;
          text-transform: capitalize;
        }
        
        .status-banner p {
          margin: 0;
          opacity: 0.9;
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
        
        .action-button {
          width: 100%;
          padding: 16px;
          border: none;
          border-radius: 8px;
          font-size: 18px;
          font-weight: 600;
          cursor: pointer;
          transition: all 0.2s;
          margin-top: 16px;
        }
        
        .action-button.primary {
          background: #ff5722;
          color: white;
        }
        
        .action-button.primary:disabled {
          background: var(--divider-color);
          color: var(--secondary-text-color);
          cursor: not-allowed;
        }
        
        .action-button.danger {
          background: #f44336;
          color: white;
        }
        
        .action-button.success {
          background: #4caf50;
          color: white;
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
        
        .temp-display {
          display: flex;
          justify-content: space-between;
          margin-top: 16px;
        }
        
        .temp-current {
          font-size: 32px;
          font-weight: 600;
          color: #ff5722;
        }
        
        .temp-target {
          font-size: 18px;
          color: var(--secondary-text-color);
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
          color: var(--primary-text-color);
        }
        
        .action-buttons {
          display: flex;
          gap: 12px;
        }
        
        .action-buttons button {
          flex: 1;
        }
        
        .entity-selector {
          margin-bottom: 16px;
        }
        
        .no-entities {
          text-align: center;
          padding: 48px;
          color: var(--secondary-text-color);
        }
      </style>
      
      <div class="container">
        <div class="header">
          <span class="header-icon">🍳</span>
          <h1>Kitchen Cooking Engine</h1>
        </div>
        
        ${this._renderContent(state, isActive)}
      </div>
    `;

    this._attachEventListeners();
  }

  _renderContent(state, isActive) {
    if (!this._entities || this._entities.length === 0) {
      return `
        <div class="card">
          <div class="no-entities">
            <p>No cooking session entities found.</p>
            <p>Please configure the Kitchen Cooking Engine integration first.</p>
          </div>
        </div>
      `;
    }

    if (this._entities.length > 1) {
      return `
        <div class="entity-selector">
          <select id="entity-select">
            ${this._entities.map(e => `
              <option value="${e}" ${this._selectedEntity === e ? 'selected' : ''}>
                ${this._hass.states[e]?.attributes?.friendly_name || e}
              </option>
            `).join('')}
          </select>
        </div>
        ${isActive ? this._renderActiveCook(state) : this._renderSetupForm()}
      `;
    }

    return isActive ? this._renderActiveCook(state) : this._renderSetupForm();
  }

  _renderSetupForm() {
    return `
      <div class="status-banner idle">
        <h2>🍳 Ready to Cook</h2>
        <p>Select your protein and preferences below</p>
      </div>
      
      <div class="card">
        <div class="card-title">🥩 Select Protein</div>
        <div class="button-group">
          ${Object.entries(CUTS_DATA).map(([key, cat]) => `
            <button class="category-btn ${this._selectedCategory === key ? 'selected' : ''}" 
                    data-category="${key}">${cat.name}</button>
          `).join('')}
        </div>
        
        ${this._selectedCategory ? `
          <select id="cut-select">
            <option value="">Choose a cut...</option>
            ${CUTS_DATA[this._selectedCategory].cuts.map(cut => `
              <option value="${cut.id}" ${this._selectedCut === cut.id ? 'selected' : ''}>
                ${cut.name}
              </option>
            `).join('')}
          </select>
        ` : ''}
      </div>
      
      ${this._selectedCut ? `
        <div class="card">
          <div class="card-title">🌡️ Doneness Level</div>
          <div class="doneness-grid">
            ${DONENESS_OPTIONS.map(opt => `
              <button class="doneness-btn ${this._selectedDoneness === opt.value ? 'selected' : ''}"
                      data-doneness="${opt.value}">
                <span class="icon">${opt.icon}</span>
                ${opt.name}
              </button>
            `).join('')}
          </div>
        </div>
        
        <div class="card">
          <div class="card-title">🍳 Cooking Method</div>
          <div class="method-grid">
            ${COOKING_METHODS.map(opt => `
              <button class="method-btn ${this._selectedMethod === opt.value ? 'selected' : ''}"
                      data-method="${opt.value}">
                ${opt.name}
              </button>
            `).join('')}
          </div>
        </div>
        
        <button class="action-button primary" id="start-cook">
          🔥 Start Cooking
        </button>
      ` : ''}
    `;
  }

  _renderActiveCook(state) {
    const attrs = state.attributes;
    const progress = attrs.progress || 0;
    const currentTemp = attrs.current_temp;
    const targetTemp = attrs.target_temp_c;
    const cut = attrs.cut_display || attrs.cut || "Unknown";
    const doneness = (attrs.doneness || "").replace("_", " ");
    const method = (attrs.cooking_method || "").replace(/_/g, " ");
    const eta = attrs.eta_minutes;
    const cookState = state.state;

    return `
      <div class="status-banner ${cookState}">
        <h2>${this._getStateIcon(cookState)} ${cookState.replace("_", " ")}</h2>
        <p>${cut} • ${doneness}</p>
      </div>
      
      <div class="card">
        <div class="temp-display">
          <div>
            <div class="temp-current">${currentTemp !== null && currentTemp !== undefined ? currentTemp + '°C' : '--'}</div>
            <div style="color: var(--secondary-text-color);">Current</div>
          </div>
          <div style="text-align: right;">
            <div class="temp-target">${targetTemp}°C</div>
            <div style="color: var(--secondary-text-color);">Target</div>
          </div>
        </div>
        
        <div class="progress-section">
          <div class="progress-bar-container">
            <div class="progress-bar" style="width: ${Math.min(100, progress)}%"></div>
          </div>
          <div style="display: flex; justify-content: space-between; margin-top: 8px; font-size: 14px;">
            <span>${progress.toFixed(0)}% complete</span>
            ${eta !== null && eta !== undefined ? `<span>ETA: ${eta} min</span>` : ''}
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
        </div>
        
        <div class="action-buttons" style="margin-top: 16px;">
          ${cookState === 'goal_reached' ? `
            <button class="action-button success" id="start-rest">⏱️ Start Rest</button>
          ` : ''}
          ${cookState === 'resting' ? `
            <button class="action-button success" id="complete">✅ Complete</button>
          ` : ''}
          <button class="action-button danger" id="stop-cook">⏹️ Stop</button>
        </div>
      </div>
    `;
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

  _attachEventListeners() {
    // Entity selector
    const entitySelect = this.shadowRoot.getElementById('entity-select');
    if (entitySelect) {
      entitySelect.addEventListener('change', (e) => {
        this._selectedEntity = e.target.value;
        this._render();
      });
    }

    // Category buttons
    this.shadowRoot.querySelectorAll('[data-category]').forEach(btn => {
      btn.addEventListener('click', (e) => {
        this._selectedCategory = e.target.dataset.category;
        this._selectedCut = null;
        this._render();
      });
    });

    // Cut selector
    const cutSelect = this.shadowRoot.getElementById('cut-select');
    if (cutSelect) {
      cutSelect.addEventListener('change', (e) => {
        this._selectedCut = parseInt(e.target.value) || null;
        this._render();
      });
    }

    // Doneness buttons
    this.shadowRoot.querySelectorAll('[data-doneness]').forEach(btn => {
      btn.addEventListener('click', (e) => {
        this._selectedDoneness = e.target.closest('[data-doneness]').dataset.doneness;
        this._render();
      });
    });

    // Method buttons
    this.shadowRoot.querySelectorAll('[data-method]').forEach(btn => {
      btn.addEventListener('click', (e) => {
        this._selectedMethod = e.target.closest('[data-method]').dataset.method;
        this._render();
      });
    });

    // Start cook
    const startBtn = this.shadowRoot.getElementById('start-cook');
    if (startBtn) {
      startBtn.addEventListener('click', () => {
        this._callService('start_cook', {
          cut_id: this._selectedCut,
          doneness: this._selectedDoneness,
          cooking_method: this._selectedMethod
        });
      });
    }

    // Stop cook
    const stopBtn = this.shadowRoot.getElementById('stop-cook');
    if (stopBtn) {
      stopBtn.addEventListener('click', () => {
        if (confirm('Are you sure you want to stop this cook?')) {
          this._callService('stop_cook');
        }
      });
    }

    // Start rest
    const restBtn = this.shadowRoot.getElementById('start-rest');
    if (restBtn) {
      restBtn.addEventListener('click', () => {
        this._callService('start_rest');
      });
    }

    // Complete
    const completeBtn = this.shadowRoot.getElementById('complete');
    if (completeBtn) {
      completeBtn.addEventListener('click', () => {
        this._callService('complete_session');
      });
    }
  }
}

customElements.define('kitchen-cooking-panel', KitchenCookingPanel);
