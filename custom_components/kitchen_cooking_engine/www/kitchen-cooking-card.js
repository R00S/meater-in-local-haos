/**
 * Kitchen Cooking Engine Card
 * 
 * Last Updated: 1 Dec 2025, 13:09 CET
 * Last Change: Initial Lovelace card for setting up and monitoring cooks
 * 
 * A custom Lovelace card for the Kitchen Cooking Engine integration.
 * Allows users to start, monitor, and control cooking sessions.
 */

const CUTS_DATA = {
  beef: {
    name: "Beef",
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
    name: "Pork",
    cuts: [
      { id: 200, name: "Pork Chop" },
      { id: 201, name: "Pork Tenderloin" },
      { id: 210, name: "Pork Loin Roast" },
      { id: 211, name: "Pork Shoulder" },
      { id: 220, name: "Baby Back Ribs" },
    ]
  },
  poultry: {
    name: "Poultry",
    cuts: [
      { id: 300, name: "Whole Chicken" },
      { id: 310, name: "Chicken Breast" },
      { id: 320, name: "Chicken Thigh" },
      { id: 330, name: "Whole Turkey" },
      { id: 340, name: "Duck Breast" },
    ]
  },
  fish: {
    name: "Fish & Seafood",
    cuts: [
      { id: 400, name: "Salmon Fillet" },
      { id: 410, name: "Tuna Steak" },
      { id: 420, name: "Cod Fillet" },
      { id: 430, name: "Shrimp" },
      { id: 431, name: "Lobster Tail" },
    ]
  },
  lamb: {
    name: "Lamb",
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
  { value: "pulled", name: "Pulled/Braised", icon: "🍖" },
];

const COOKING_METHODS = [
  { value: "oven_roast", name: "Oven Roast", icon: "mdi:stove" },
  { value: "oven_bake", name: "Oven Bake", icon: "mdi:stove" },
  { value: "pan_sear", name: "Pan Sear", icon: "mdi:pot-steam" },
  { value: "pan_fry", name: "Pan Fry", icon: "mdi:pot-steam" },
  { value: "grill", name: "Grill", icon: "mdi:grill" },
  { value: "smoker", name: "Smoker", icon: "mdi:smoke" },
  { value: "air_fryer", name: "Air Fryer", icon: "mdi:fan" },
  { value: "sous_vide", name: "Sous Vide", icon: "mdi:water-thermometer" },
  { value: "slow_cooker", name: "Slow Cooker", icon: "mdi:pot" },
];

const STATE_ICONS = {
  idle: "mdi:food-steak",
  cooking: "mdi:fire",
  approaching: "mdi:thermometer-alert",
  goal_reached: "mdi:check-circle",
  resting: "mdi:timer-sand",
  complete: "mdi:silverware-fork-knife",
};

const STATE_COLORS = {
  idle: "#9e9e9e",
  cooking: "#ff5722",
  approaching: "#ff9800",
  goal_reached: "#4caf50",
  resting: "#2196f3",
  complete: "#8bc34a",
};

class KitchenCookingCard extends HTMLElement {
  constructor() {
    super();
    this.attachShadow({ mode: 'open' });
    this._config = {};
    this._hass = null;
    this._selectedCategory = null;
    this._selectedCut = null;
    this._selectedDoneness = "medium_rare";
    this._selectedMethod = "oven_roast";
  }

  setConfig(config) {
    if (!config.entity) {
      throw new Error("Please define an entity");
    }
    this._config = config;
    this.render();
  }

  set hass(hass) {
    this._hass = hass;
    this.render();
  }

  render() {
    if (!this._hass || !this._config) return;

    const entityId = this._config.entity;
    const stateObj = this._hass.states[entityId];
    
    if (!stateObj) {
      this.shadowRoot.innerHTML = `
        <ha-card header="Kitchen Cooking Engine">
          <div class="card-content">
            <p>Entity not found: ${entityId}</p>
          </div>
        </ha-card>
      `;
      return;
    }

    const state = stateObj.state;
    const attrs = stateObj.attributes;
    const isActive = state !== "idle";

    this.shadowRoot.innerHTML = `
      <style>
        :host {
          --primary-color: var(--primary-color, #03a9f4);
          --text-primary-color: var(--primary-text-color, #212121);
          --divider-color: var(--divider-color, #e0e0e0);
        }
        ha-card {
          padding: 16px;
        }
        .header {
          display: flex;
          align-items: center;
          margin-bottom: 16px;
        }
        .header ha-icon {
          margin-right: 8px;
          color: ${STATE_COLORS[state] || STATE_COLORS.idle};
        }
        .header .title {
          font-size: 1.2em;
          font-weight: 500;
        }
        .status-bar {
          background: ${STATE_COLORS[state] || STATE_COLORS.idle};
          color: white;
          padding: 12px;
          border-radius: 8px;
          margin-bottom: 16px;
          text-align: center;
        }
        .status-bar .state {
          font-size: 1.1em;
          font-weight: 500;
          text-transform: capitalize;
        }
        .status-bar .details {
          font-size: 0.9em;
          margin-top: 4px;
          opacity: 0.9;
        }
        .progress-container {
          margin: 16px 0;
        }
        .progress-bar {
          height: 8px;
          background: var(--divider-color);
          border-radius: 4px;
          overflow: hidden;
        }
        .progress-fill {
          height: 100%;
          background: ${STATE_COLORS[state] || STATE_COLORS.idle};
          transition: width 0.3s ease;
        }
        .temps {
          display: flex;
          justify-content: space-between;
          margin-top: 8px;
          font-size: 0.9em;
        }
        .temp-current {
          font-weight: 500;
        }
        .temp-target {
          opacity: 0.7;
        }
        .section {
          margin-bottom: 16px;
        }
        .section-title {
          font-weight: 500;
          margin-bottom: 8px;
          color: var(--text-primary-color);
        }
        .category-buttons {
          display: flex;
          flex-wrap: wrap;
          gap: 8px;
          margin-bottom: 12px;
        }
        .category-btn {
          padding: 8px 16px;
          border: 1px solid var(--divider-color);
          border-radius: 20px;
          background: transparent;
          cursor: pointer;
          font-size: 0.9em;
          transition: all 0.2s;
        }
        .category-btn:hover {
          background: var(--primary-color);
          color: white;
          border-color: var(--primary-color);
        }
        .category-btn.selected {
          background: var(--primary-color);
          color: white;
          border-color: var(--primary-color);
        }
        select {
          width: 100%;
          padding: 10px;
          border: 1px solid var(--divider-color);
          border-radius: 8px;
          font-size: 1em;
          background: var(--card-background-color, white);
          color: var(--text-primary-color);
        }
        .option-grid {
          display: grid;
          grid-template-columns: repeat(3, 1fr);
          gap: 8px;
        }
        .option-btn {
          padding: 10px 8px;
          border: 1px solid var(--divider-color);
          border-radius: 8px;
          background: transparent;
          cursor: pointer;
          font-size: 0.85em;
          text-align: center;
          transition: all 0.2s;
        }
        .option-btn:hover {
          border-color: var(--primary-color);
        }
        .option-btn.selected {
          background: var(--primary-color);
          color: white;
          border-color: var(--primary-color);
        }
        .option-btn .icon {
          display: block;
          font-size: 1.2em;
          margin-bottom: 4px;
        }
        .action-buttons {
          display: flex;
          gap: 8px;
          margin-top: 16px;
        }
        .action-btn {
          flex: 1;
          padding: 12px;
          border: none;
          border-radius: 8px;
          font-size: 1em;
          font-weight: 500;
          cursor: pointer;
          transition: all 0.2s;
        }
        .action-btn.primary {
          background: var(--primary-color);
          color: white;
        }
        .action-btn.primary:hover {
          opacity: 0.9;
        }
        .action-btn.secondary {
          background: var(--divider-color);
          color: var(--text-primary-color);
        }
        .action-btn.danger {
          background: #f44336;
          color: white;
        }
        .action-btn:disabled {
          opacity: 0.5;
          cursor: not-allowed;
        }
        .active-cook {
          background: var(--card-background-color, #fafafa);
          border-radius: 8px;
          padding: 16px;
          margin-bottom: 16px;
        }
        .cook-info {
          display: grid;
          grid-template-columns: 1fr 1fr;
          gap: 8px;
          font-size: 0.9em;
        }
        .cook-info-item {
          display: flex;
          flex-direction: column;
        }
        .cook-info-label {
          opacity: 0.7;
          font-size: 0.85em;
        }
        .cook-info-value {
          font-weight: 500;
        }
      </style>
      
      <ha-card>
        <div class="header">
          <ha-icon icon="${STATE_ICONS[state] || STATE_ICONS.idle}"></ha-icon>
          <span class="title">${this._config.title || "Kitchen Cooking Engine"}</span>
        </div>
        
        ${isActive ? this._renderActiveCook(state, attrs) : this._renderSetup()}
      </ha-card>
    `;

    this._attachEventListeners();
  }

  _renderActiveCook(state, attrs) {
    const progress = attrs.progress || 0;
    const currentTemp = attrs.current_temp;
    const targetTemp = attrs.target_temp_c;
    const cut = attrs.cut_display || attrs.cut || "Unknown";
    const doneness = attrs.doneness || "Unknown";
    const method = attrs.cooking_method || "Unknown";
    const eta = attrs.eta_minutes;

    return `
      <div class="status-bar">
        <div class="state">${state.replace("_", " ")}</div>
        <div class="details">
          ${cut} • ${doneness.replace("_", " ")}
        </div>
      </div>
      
      <div class="active-cook">
        <div class="cook-info">
          <div class="cook-info-item">
            <span class="cook-info-label">Current</span>
            <span class="cook-info-value">${currentTemp !== null ? currentTemp + "°C" : "--"}</span>
          </div>
          <div class="cook-info-item">
            <span class="cook-info-label">Target</span>
            <span class="cook-info-value">${targetTemp}°C</span>
          </div>
          <div class="cook-info-item">
            <span class="cook-info-label">Method</span>
            <span class="cook-info-value">${method.replace("_", " ")}</span>
          </div>
          <div class="cook-info-item">
            <span class="cook-info-label">ETA</span>
            <span class="cook-info-value">${eta !== null ? eta + " min" : "--"}</span>
          </div>
        </div>
      </div>
      
      <div class="progress-container">
        <div class="progress-bar">
          <div class="progress-fill" style="width: ${progress}%"></div>
        </div>
        <div class="temps">
          <span class="temp-current">${progress.toFixed(0)}% complete</span>
        </div>
      </div>
      
      <div class="action-buttons">
        ${state === "goal_reached" ? `
          <button class="action-btn primary" id="start-rest">Start Rest</button>
        ` : state === "resting" ? `
          <button class="action-btn primary" id="complete">Complete</button>
        ` : ""}
        <button class="action-btn danger" id="stop-cook">Stop Cook</button>
      </div>
    `;
  }

  _renderSetup() {
    return `
      <div class="section">
        <div class="section-title">Select Protein</div>
        <div class="category-buttons">
          ${Object.entries(CUTS_DATA).map(([key, cat]) => `
            <button class="category-btn ${this._selectedCategory === key ? 'selected' : ''}" 
                    data-category="${key}">${cat.name}</button>
          `).join('')}
        </div>
        
        ${this._selectedCategory ? `
          <select id="cut-select">
            <option value="">Select a cut...</option>
            ${CUTS_DATA[this._selectedCategory].cuts.map(cut => `
              <option value="${cut.id}" ${this._selectedCut === cut.id ? 'selected' : ''}>
                ${cut.name}
              </option>
            `).join('')}
          </select>
        ` : ''}
      </div>
      
      ${this._selectedCut ? `
        <div class="section">
          <div class="section-title">Doneness</div>
          <div class="option-grid">
            ${DONENESS_OPTIONS.map(opt => `
              <button class="option-btn ${this._selectedDoneness === opt.value ? 'selected' : ''}"
                      data-doneness="${opt.value}">
                <span class="icon">${opt.icon}</span>
                ${opt.name}
              </button>
            `).join('')}
          </div>
        </div>
        
        <div class="section">
          <div class="section-title">Cooking Method</div>
          <div class="option-grid">
            ${COOKING_METHODS.map(opt => `
              <button class="option-btn ${this._selectedMethod === opt.value ? 'selected' : ''}"
                      data-method="${opt.value}">
                ${opt.name}
              </button>
            `).join('')}
          </div>
        </div>
        
        <div class="action-buttons">
          <button class="action-btn primary" id="start-cook" 
                  ${!this._selectedCut ? 'disabled' : ''}>
            🔥 Start Cooking
          </button>
        </div>
      ` : ''}
    `;
  }

  _attachEventListeners() {
    // Category buttons
    this.shadowRoot.querySelectorAll('.category-btn').forEach(btn => {
      btn.addEventListener('click', (e) => {
        this._selectedCategory = e.target.dataset.category;
        this._selectedCut = null;
        this.render();
      });
    });

    // Cut select
    const cutSelect = this.shadowRoot.getElementById('cut-select');
    if (cutSelect) {
      cutSelect.addEventListener('change', (e) => {
        this._selectedCut = parseInt(e.target.value) || null;
        this.render();
      });
    }

    // Doneness buttons
    this.shadowRoot.querySelectorAll('[data-doneness]').forEach(btn => {
      btn.addEventListener('click', (e) => {
        this._selectedDoneness = e.target.closest('[data-doneness]').dataset.doneness;
        this.render();
      });
    });

    // Method buttons
    this.shadowRoot.querySelectorAll('[data-method]').forEach(btn => {
      btn.addEventListener('click', (e) => {
        this._selectedMethod = e.target.closest('[data-method]').dataset.method;
        this.render();
      });
    });

    // Start cook button
    const startBtn = this.shadowRoot.getElementById('start-cook');
    if (startBtn) {
      startBtn.addEventListener('click', () => this._startCook());
    }

    // Stop cook button
    const stopBtn = this.shadowRoot.getElementById('stop-cook');
    if (stopBtn) {
      stopBtn.addEventListener('click', () => this._stopCook());
    }

    // Start rest button
    const restBtn = this.shadowRoot.getElementById('start-rest');
    if (restBtn) {
      restBtn.addEventListener('click', () => this._startRest());
    }

    // Complete button
    const completeBtn = this.shadowRoot.getElementById('complete');
    if (completeBtn) {
      completeBtn.addEventListener('click', () => this._completeCook());
    }
  }

  _startCook() {
    if (!this._selectedCut) return;
    
    this._hass.callService('kitchen_cooking_engine', 'start_cook', {
      entity_id: this._config.entity,
      cut_id: this._selectedCut,
      doneness: this._selectedDoneness,
      cooking_method: this._selectedMethod,
    });
  }

  _stopCook() {
    this._hass.callService('kitchen_cooking_engine', 'stop_cook', {
      entity_id: this._config.entity,
    });
  }

  _startRest() {
    this._hass.callService('kitchen_cooking_engine', 'start_rest', {
      entity_id: this._config.entity,
    });
  }

  _completeCook() {
    this._hass.callService('kitchen_cooking_engine', 'complete_session', {
      entity_id: this._config.entity,
    });
  }

  getCardSize() {
    return 4;
  }

  static getConfigElement() {
    return document.createElement('kitchen-cooking-card-editor');
  }

  static getStubConfig() {
    return { entity: '' };
  }
}

// Card Editor
class KitchenCookingCardEditor extends HTMLElement {
  constructor() {
    super();
    this._config = {};
  }

  setConfig(config) {
    this._config = config;
    this.render();
  }

  set hass(hass) {
    this._hass = hass;
    this.render();
  }

  render() {
    if (!this._hass) return;

    const entities = Object.keys(this._hass.states)
      .filter(e => e.startsWith('sensor.') && 
        this._hass.states[e].attributes.integration === 'kitchen_cooking_engine');

    this.innerHTML = `
      <div style="padding: 16px;">
        <label style="display: block; margin-bottom: 8px; font-weight: 500;">
          Cooking Session Entity
        </label>
        <select id="entity" style="width: 100%; padding: 8px; border-radius: 4px; border: 1px solid #ccc;">
          <option value="">Select entity...</option>
          ${entities.map(e => `
            <option value="${e}" ${this._config.entity === e ? 'selected' : ''}>
              ${this._hass.states[e].attributes.friendly_name || e}
            </option>
          `).join('')}
        </select>
        
        <label style="display: block; margin: 16px 0 8px; font-weight: 500;">
          Card Title (optional)
        </label>
        <input type="text" id="title" 
               value="${this._config.title || ''}"
               placeholder="Kitchen Cooking Engine"
               style="width: 100%; padding: 8px; border-radius: 4px; border: 1px solid #ccc;">
      </div>
    `;

    this.querySelector('#entity').addEventListener('change', (e) => {
      this._config = { ...this._config, entity: e.target.value };
      this._fireEvent();
    });

    this.querySelector('#title').addEventListener('input', (e) => {
      this._config = { ...this._config, title: e.target.value };
      this._fireEvent();
    });
  }

  _fireEvent() {
    const event = new CustomEvent('config-changed', {
      detail: { config: this._config },
      bubbles: true,
      composed: true,
    });
    this.dispatchEvent(event);
  }
}

// Register the card
customElements.define('kitchen-cooking-card', KitchenCookingCard);
customElements.define('kitchen-cooking-card-editor', KitchenCookingCardEditor);

// Register with Home Assistant
window.customCards = window.customCards || [];
window.customCards.push({
  type: 'kitchen-cooking-card',
  name: 'Kitchen Cooking Card',
  description: 'Control your cooking sessions with the Kitchen Cooking Engine',
  preview: true,
});

console.info(
  '%c KITCHEN-COOKING-CARD %c v1.0.0 ',
  'color: white; background: #ff5722; font-weight: bold;',
  'color: #ff5722; background: white; font-weight: bold;'
);
