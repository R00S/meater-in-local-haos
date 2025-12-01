/**
 * Kitchen Cooking Engine Panel
 * 
 * Last Updated: 1 Dec 2025, 14:16 CET
 * Last Change: Fixed doneness options to only show valid options per cut type
 * 
 * A custom panel for the Kitchen Cooking Engine integration.
 */

import {
  LitElement,
  html,
  css,
} from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";

// Doneness options per cut type (matching cooking_data.py)
const ALL_STEAK_DONENESS = ["rare", "medium_rare", "medium", "medium_well", "well_done"];
const BRAISING_DONENESS = ["pulled"];
const PORK_DONENESS = ["medium", "well_done"];
const POULTRY_DONENESS = ["safe"];
const POULTRY_DARK_DONENESS = ["safe", "dark_meat_optimal"];
const DUCK_DONENESS = ["medium_rare", "medium", "safe"];
const FISH_DONENESS = ["medium_rare", "medium", "well_done"];
const TUNA_DONENESS = ["rare", "medium_rare", "medium"];

const CUTS_DATA = {
  beef: {
    name: "🥩 Beef",
    cuts: [
      { id: 100, name: "Ribeye Steak", doneness: ALL_STEAK_DONENESS },
      { id: 101, name: "Sirloin Steak", doneness: ALL_STEAK_DONENESS },
      { id: 102, name: "Filet Mignon", doneness: ALL_STEAK_DONENESS },
      { id: 103, name: "New York Strip", doneness: ALL_STEAK_DONENESS },
      { id: 104, name: "T-Bone / Porterhouse", doneness: ALL_STEAK_DONENESS },
      { id: 105, name: "Flank Steak", doneness: ["rare", "medium_rare", "medium", "medium_well"] },
      { id: 120, name: "Prime Rib Roast", doneness: ALL_STEAK_DONENESS },
      { id: 130, name: "Chuck Roast", doneness: BRAISING_DONENESS },
      { id: 131, name: "Brisket", doneness: BRAISING_DONENESS },
      { id: 140, name: "Beef Burger", doneness: ["well_done"] },
    ]
  },
  pork: {
    name: "🐷 Pork",
    cuts: [
      { id: 200, name: "Pork Chop", doneness: PORK_DONENESS },
      { id: 201, name: "Pork Tenderloin", doneness: PORK_DONENESS },
      { id: 210, name: "Pork Loin Roast", doneness: PORK_DONENESS },
      { id: 211, name: "Pork Shoulder", doneness: BRAISING_DONENESS },
      { id: 220, name: "Baby Back Ribs", doneness: BRAISING_DONENESS },
    ]
  },
  poultry: {
    name: "🍗 Poultry",
    cuts: [
      { id: 300, name: "Whole Chicken", doneness: POULTRY_DONENESS },
      { id: 310, name: "Chicken Breast", doneness: POULTRY_DONENESS },
      { id: 320, name: "Chicken Thigh", doneness: POULTRY_DARK_DONENESS },
      { id: 330, name: "Whole Turkey", doneness: POULTRY_DONENESS },
      { id: 340, name: "Duck Breast", doneness: DUCK_DONENESS },
    ]
  },
  fish: {
    name: "🐟 Fish & Seafood",
    cuts: [
      { id: 400, name: "Salmon Fillet", doneness: FISH_DONENESS },
      { id: 410, name: "Tuna Steak", doneness: TUNA_DONENESS },
      { id: 420, name: "Cod Fillet", doneness: ["medium", "well_done"] },
      { id: 430, name: "Shrimp", doneness: ["well_done"] },
      { id: 431, name: "Lobster Tail", doneness: ["well_done"] },
    ]
  },
  lamb: {
    name: "🐑 Lamb",
    cuts: [
      { id: 500, name: "Leg of Lamb", doneness: ALL_STEAK_DONENESS },
      { id: 501, name: "Rack of Lamb", doneness: ["rare", "medium_rare", "medium", "medium_well"] },
      { id: 510, name: "Lamb Chops", doneness: ALL_STEAK_DONENESS },
    ]
  }
};

const DONENESS_OPTIONS = {
  rare: { value: "rare", name: "Rare", icon: "🔴" },
  medium_rare: { value: "medium_rare", name: "Medium Rare", icon: "🟠" },
  medium: { value: "medium", name: "Medium", icon: "🟡" },
  medium_well: { value: "medium_well", name: "Medium Well", icon: "🟤" },
  well_done: { value: "well_done", name: "Well Done", icon: "⚪" },
  pulled: { value: "pulled", name: "Pulled", icon: "🍖" },
  safe: { value: "safe", name: "Safe (Cooked)", icon: "✅" },
  dark_meat_optimal: { value: "dark_meat_optimal", name: "Dark Meat", icon: "🍗" },
};

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

class KitchenCookingPanel extends LitElement {
  static get properties() {
    return {
      hass: { type: Object },
      narrow: { type: Boolean },
      route: { type: Object },
      panel: { type: Object },
      _selectedCategory: { type: String },
      _selectedCut: { type: Number },
      _selectedDoneness: { type: String },
      _selectedMethod: { type: String },
      _selectedEntity: { type: String },
    };
  }

  constructor() {
    super();
    this._selectedCategory = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    this._selectedMethod = "oven_roast";
    this._selectedEntity = null;
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

  _getSelectedCutData() {
    if (!this._selectedCategory || !this._selectedCut) return null;
    const category = CUTS_DATA[this._selectedCategory];
    if (!category) return null;
    return category.cuts.find(c => c.id === this._selectedCut);
  }

  _getAvailableDoneness() {
    const cut = this._getSelectedCutData();
    if (!cut || !cut.doneness) return [];
    return cut.doneness.map(d => DONENESS_OPTIONS[d]).filter(Boolean);
  }

  _selectCut(cutId) {
    this._selectedCut = cutId;
    // Auto-select first valid doneness for this cut
    const cut = CUTS_DATA[this._selectedCategory]?.cuts.find(c => c.id === cutId);
    if (cut && cut.doneness && cut.doneness.length > 0) {
      this._selectedDoneness = cut.doneness[0];
    } else {
      this._selectedDoneness = null;
    }
  }

  render() {
    if (!this.hass) {
      return html`<div class="loading">Loading...</div>`;
    }

    const entities = this._findCookingEntities();
    
    // Auto-select first entity if not selected
    if (!this._selectedEntity && entities.length > 0) {
      this._selectedEntity = entities[0];
    }

    const state = this._getState();
    const isActive = state && state.state !== 'idle';

    return html`
      <ha-top-app-bar-fixed>
        <ha-menu-button
            slot="navigationIcon"
            .hass=${this.hass}
            .narrow=${this.narrow}
        ></ha-menu-button>
        <div slot="title">🍳 Kitchen Cooking Engine</div>
        
        <div class="content">
          ${entities.length === 0 ? this._renderNoEntities() : 
            (isActive ? this._renderActiveCook(state) : this._renderSetupForm(entities))}
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
      
      <ha-card>
        <div class="card-content">
          <h3>🥩 Select Protein</h3>
          <div class="button-group">
            ${Object.entries(CUTS_DATA).map(([key, cat]) => html`
              <button 
                class="category-btn ${this._selectedCategory === key ? 'selected' : ''}" 
                @click=${() => { this._selectedCategory = key; this._selectedCut = null; this._selectedDoneness = null; }}>
                ${cat.name}
              </button>
            `)}
          </div>
          
          ${this._selectedCategory ? html`
            <select @change=${(e) => this._selectCut(parseInt(e.target.value) || null)}>
              <option value="">Choose a cut...</option>
              ${CUTS_DATA[this._selectedCategory].cuts.map(cut => html`
                <option value="${cut.id}" ?selected=${this._selectedCut === cut.id}>
                  ${cut.name}
                </option>
              `)}
            </select>
          ` : ''}
        </div>
      </ha-card>
      
      ${this._selectedCut ? html`
        <ha-card>
          <div class="card-content">
            <h3>🌡️ Doneness Level</h3>
            <div class="doneness-grid">
              ${this._getAvailableDoneness().map(opt => html`
                <button 
                  class="doneness-btn ${this._selectedDoneness === opt.value ? 'selected' : ''}"
                  @click=${() => this._selectedDoneness = opt.value}>
                  <span class="icon">${opt.icon}</span>
                  ${opt.name}
                </button>
              `)}
            </div>
          </div>
        </ha-card>
        
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
        
        <div class="action-container">
          <ha-button unelevated @click=${this._startCook} ?disabled=${!this._selectedDoneness}>
            🔥 Start Cooking
          </ha-button>
        </div>
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
              <div class="label">Current</div>
            </div>
            <div class="temp-target">
              <div class="value">${targetTemp}°C</div>
              <div class="label">Target</div>
            </div>
          </div>
          
          <div class="progress-section">
            <div class="progress-bar-container">
              <div class="progress-bar" style="width: ${Math.min(100, progress)}%"></div>
            </div>
            <div class="progress-info">
              <span>${progress.toFixed(0)}% complete</span>
              ${eta !== null && eta !== undefined ? html`<span>ETA: ${eta} min</span>` : ''}
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

  _startCook() {
    this._callService('start_cook', {
      cut_id: this._selectedCut,
      doneness: this._selectedDoneness,
      cooking_method: this._selectedMethod
    });
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
    `;
  }
}

if (!customElements.get("kitchen-cooking-panel")) {
  customElements.define("kitchen-cooking-panel", KitchenCookingPanel);
}
