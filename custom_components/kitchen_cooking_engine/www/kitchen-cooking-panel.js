/**
 * Kitchen Cooking Engine Panel
 * 
 * Last Updated: 1 Dec 2025, 14:30 CET
 * Last Change: Added all cuts from MEATER app reference (2025) including:
 *              - Beef: Tomahawk, Picanha, offal (liver, tongue, shin)
 *              - Pork: Secreto, Virginia Ham, offal (jowl, cheek, liver, tongue)
 *              - Poultry: Goose, chicken/turkey burgers
 *              - Fish: Haddock, Hake, Trout, Sea Bass/Branzino
 *              - Lamb: Neck filet, cutlet, brisket, rump, shank
 *              - Game: Reindeer, Moose, Ostrich, Mutton, Kangaroo, Goat
 * 
 * NOTE: The cut/category structure mirrors MEATER app's meatCutStructure.
 *       Temperature values are from USDA/FDA public guidelines.
 *       TODO: Verify all cuts against latest MEATER app version and mark
 *             any proprietary data for replacement with verified free info.
 * 
 * A custom panel for the Kitchen Cooking Engine integration.
 */

import {
  LitElement,
  html,
  css,
} from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";

// Doneness option definitions
const DONENESS_OPTIONS = {
  rare: { value: "rare", name: "Rare", icon: "🔴", description: "Cool red center" },
  medium_rare: { value: "medium_rare", name: "Medium Rare", icon: "🟠", description: "Warm red center" },
  medium: { value: "medium", name: "Medium", icon: "🟡", description: "Warm pink center" },
  medium_well: { value: "medium_well", name: "Medium Well", icon: "🟤", description: "Slightly pink center" },
  well_done: { value: "well_done", name: "Well Done", icon: "⚪", description: "No pink, fully cooked" },
  pulled: { value: "pulled", name: "Pulled", icon: "🍖", description: "Shreddable, collagen broken down" },
  safe: { value: "safe", name: "Safe (165°F)", icon: "✅", description: "USDA safe, cooked through" },
  dark_meat_optimal: { value: "dark_meat_optimal", name: "Dark Meat", icon: "🍗", description: "Optimal texture for dark meat" },
  crispy: { value: "crispy", name: "Crispy", icon: "🥓", description: "Crispy and rendered" },
  heated_through: { value: "heated_through", name: "Heated Through", icon: "♨️", description: "Warmed through (pre-cooked)" },
  done: { value: "done", name: "Done", icon: "✓", description: "Cooked through" },
  tender: { value: "tender", name: "Tender", icon: "🥔", description: "Fork-tender" },
  crisp_tender: { value: "crisp_tender", name: "Crisp-Tender", icon: "🥦", description: "Slightly firm with bite" },
  caramelized: { value: "caramelized", name: "Caramelized", icon: "🧅", description: "Golden brown" },
  charred: { value: "charred", name: "Charred", icon: "🔥", description: "Charred exterior" },
};

// Doneness arrays for different cut types
const STEAK_DONENESS = ["rare", "medium_rare", "medium", "medium_well", "well_done"];
const STEAK_DONENESS_NO_WELL = ["rare", "medium_rare", "medium", "medium_well"];
const STEAK_DONENESS_NO_RARE = ["medium_rare", "medium", "medium_well", "well_done"];
const STEAK_DONENESS_MR_TO_M = ["rare", "medium_rare", "medium"];
const BRAISING_DONENESS = ["pulled"];
const PORK_DONENESS = ["medium", "well_done"];
const POULTRY_DONENESS = ["safe"];
const POULTRY_DARK_DONENESS = ["safe", "dark_meat_optimal"];
const DUCK_BREAST_DONENESS = ["medium_rare", "medium", "safe"];
const FISH_DONENESS = ["medium_rare", "medium", "well_done"];
const FISH_RARE_OK = ["rare", "medium_rare", "medium"];
const FISH_WELL_ONLY = ["well_done"];
const VEG_DONENESS = ["tender", "crisp_tender", "caramelized", "charred"];

/**
 * MEAT_CATEGORIES - Hierarchical meat/protein data structure
 * 
 * Structure: Category → Meats/Animals → Cut Types → Cuts
 * This mirrors the MEATER app's meatCutStructure package structure.
 * 
 * NOTE: The organizational structure and cut names are based on MEATER app.
 *       All temperature values come from USDA/FDA public safety guidelines.
 *       Cut IDs match cooking_data.py for backend compatibility.
 */
const MEAT_CATEGORIES = {
  beef: {
    id: 1,
    name: "Beef",
    icon: "🥩",
    color: "#8B0000",
    meats: [
      {
        id: 10,
        name: "Cow",
        cutTypes: [
          {
            id: 100,
            name: "Steaks",
            cuts: [
              { id: 100, name: "Ribeye Steak", doneness: STEAK_DONENESS },
              { id: 101, name: "Sirloin Steak", doneness: STEAK_DONENESS },
              { id: 102, name: "Filet Mignon / Tenderloin", doneness: STEAK_DONENESS },
              { id: 103, name: "New York Strip", doneness: STEAK_DONENESS },
              { id: 104, name: "T-Bone / Porterhouse", doneness: STEAK_DONENESS },
              { id: 105, name: "Flank Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 106, name: "Skirt Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 107, name: "Flat Iron Steak", doneness: STEAK_DONENESS },
              { id: 108, name: "Hanger Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 109, name: "Tri-Tip", doneness: STEAK_DONENESS },
              { id: 110, name: "Tomahawk Steak", doneness: STEAK_DONENESS },
              { id: 111, name: "Picanha", doneness: STEAK_DONENESS },
            ]
          },
          {
            id: 101,
            name: "Roasts",
            cuts: [
              { id: 120, name: "Prime Rib / Standing Rib Roast", doneness: STEAK_DONENESS },
              { id: 121, name: "Beef Tenderloin Roast", doneness: STEAK_DONENESS_NO_WELL },
              { id: 122, name: "Top Round Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 123, name: "Sirloin Tip Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 124, name: "Roasting Joint", doneness: STEAK_DONENESS },
              { id: 125, name: "Round Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 126, name: "Rump Roast", doneness: STEAK_DONENESS_NO_RARE },
            ]
          },
          {
            id: 102,
            name: "Braising Cuts",
            cuts: [
              { id: 130, name: "Chuck Roast / Pot Roast", doneness: BRAISING_DONENESS },
              { id: 131, name: "Brisket", doneness: BRAISING_DONENESS },
              { id: 132, name: "Short Ribs", doneness: BRAISING_DONENESS },
              { id: 133, name: "Beef Shank / Osso Buco", doneness: BRAISING_DONENESS },
            ]
          },
          {
            id: 103,
            name: "Ground",
            cuts: [
              { id: 140, name: "Beef Burger / Patty", doneness: ["well_done"] },
              { id: 142, name: "Meatloaf", doneness: ["done"] },
            ]
          },
          {
            id: 104,
            name: "Other / Offal",
            cuts: [
              { id: 145, name: "Beef Liver", doneness: ["medium", "well_done"] },
              { id: 147, name: "Beef Tongue", doneness: BRAISING_DONENESS },
              { id: 148, name: "Beef Shin", doneness: BRAISING_DONENESS },
              { id: 149, name: "Beef Rib", doneness: BRAISING_DONENESS },
            ]
          }
        ]
      }
    ]
  },
  pork: {
    id: 2,
    name: "Pork",
    icon: "🐷",
    color: "#FFB6C1",
    meats: [
      {
        id: 20,
        name: "Pig",
        cutTypes: [
          {
            id: 200,
            name: "Steaks & Chops",
            cuts: [
              { id: 200, name: "Pork Chop", doneness: PORK_DONENESS },
              { id: 201, name: "Pork Tenderloin", doneness: PORK_DONENESS },
              { id: 202, name: "Pork Loin Steak", doneness: PORK_DONENESS },
              { id: 203, name: "Pork Shoulder Steak", doneness: PORK_DONENESS },
              { id: 204, name: "Secreto (Ibérico)", doneness: PORK_DONENESS },
            ]
          },
          {
            id: 201,
            name: "Roasts",
            cuts: [
              { id: 210, name: "Pork Loin Roast", doneness: PORK_DONENESS },
              { id: 211, name: "Pork Shoulder / Boston Butt", doneness: BRAISING_DONENESS },
              { id: 212, name: "Pork Belly", doneness: ["well_done", "crispy"] },
              { id: 214, name: "Pork Leg Roast", doneness: PORK_DONENESS },
              { id: 215, name: "Virginia Ham", doneness: ["heated_through"] },
            ]
          },
          {
            id: 202,
            name: "Ribs",
            cuts: [
              { id: 220, name: "Baby Back Ribs", doneness: BRAISING_DONENESS },
              { id: 221, name: "Spare Ribs", doneness: BRAISING_DONENESS },
              { id: 222, name: "St. Louis Style Ribs", doneness: BRAISING_DONENESS },
            ]
          },
          {
            id: 203,
            name: "Ham",
            cuts: [
              { id: 230, name: "Fresh Ham", doneness: PORK_DONENESS },
              { id: 231, name: "Cured Ham (Pre-cooked)", doneness: ["heated_through"] },
            ]
          },
          {
            id: 204,
            name: "Ground",
            cuts: [
              { id: 240, name: "Pork Sausage", doneness: ["well_done"] },
              { id: 241, name: "Ground Pork", doneness: ["well_done"] },
            ]
          },
          {
            id: 205,
            name: "Other / Offal",
            cuts: [
              { id: 245, name: "Pork Jowl / Guanciale", doneness: BRAISING_DONENESS },
              { id: 246, name: "Pork Cheek", doneness: BRAISING_DONENESS },
              { id: 247, name: "Pork Liver", doneness: ["well_done"] },
              { id: 248, name: "Pork Tongue", doneness: BRAISING_DONENESS },
            ]
          }
        ]
      }
    ]
  },
  poultry: {
    id: 3,
    name: "Poultry",
    icon: "🍗",
    color: "#FFD700",
    meats: [
      {
        id: 30,
        name: "Chicken",
        cutTypes: [
          {
            id: 300,
            name: "Whole",
            cuts: [
              { id: 300, name: "Whole Chicken", doneness: POULTRY_DONENESS },
            ]
          },
          {
            id: 301,
            name: "Breast",
            cuts: [
              { id: 310, name: "Chicken Breast", doneness: POULTRY_DONENESS },
              { id: 311, name: "Chicken Breast (Bone-in)", doneness: POULTRY_DONENESS },
            ]
          },
          {
            id: 302,
            name: "Dark Meat",
            cuts: [
              { id: 320, name: "Chicken Thigh", doneness: POULTRY_DARK_DONENESS },
              { id: 321, name: "Chicken Leg / Drumstick", doneness: POULTRY_DARK_DONENESS },
              { id: 322, name: "Chicken Wing", doneness: POULTRY_DARK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 31,
        name: "Turkey",
        cutTypes: [
          {
            id: 310,
            name: "Turkey",
            cuts: [
              { id: 330, name: "Whole Turkey", doneness: POULTRY_DONENESS },
              { id: 331, name: "Turkey Breast", doneness: POULTRY_DONENESS },
              { id: 332, name: "Turkey Leg", doneness: POULTRY_DARK_DONENESS },
              { id: 333, name: "Turkey Thigh", doneness: POULTRY_DARK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 32,
        name: "Duck",
        cutTypes: [
          {
            id: 320,
            name: "Duck",
            cuts: [
              { id: 340, name: "Duck Breast", doneness: DUCK_BREAST_DONENESS },
              { id: 341, name: "Whole Duck", doneness: POULTRY_DONENESS },
              { id: 342, name: "Duck Leg Confit", doneness: ["dark_meat_optimal"] },
            ]
          }
        ]
      },
      {
        id: 34,
        name: "Goose",
        cutTypes: [
          {
            id: 345,
            name: "Goose",
            cuts: [
              { id: 345, name: "Whole Goose", doneness: POULTRY_DONENESS },
              { id: 346, name: "Goose Breast", doneness: DUCK_BREAST_DONENESS },
              { id: 347, name: "Goose Thigh", doneness: POULTRY_DARK_DONENESS },
              { id: 348, name: "Goose Leg", doneness: POULTRY_DARK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 33,
        name: "Ground Poultry",
        cutTypes: [
          {
            id: 330,
            name: "Ground",
            cuts: [
              { id: 350, name: "Ground Chicken", doneness: POULTRY_DONENESS },
              { id: 351, name: "Ground Turkey", doneness: POULTRY_DONENESS },
              { id: 352, name: "Chicken Burger", doneness: POULTRY_DONENESS },
              { id: 353, name: "Turkey Burger", doneness: POULTRY_DONENESS },
            ]
          }
        ]
      }
    ]
  },
  fish: {
    id: 4,
    name: "Fish & Seafood",
    icon: "🐟",
    color: "#4682B4",
    meats: [
      {
        id: 40,
        name: "Salmon",
        cutTypes: [
          {
            id: 400,
            name: "Salmon",
            cuts: [
              { id: 400, name: "Salmon Fillet", doneness: FISH_DONENESS },
              { id: 401, name: "Salmon Steak", doneness: FISH_DONENESS },
            ]
          }
        ]
      },
      {
        id: 41,
        name: "Tuna",
        cutTypes: [
          {
            id: 410,
            name: "Tuna",
            cuts: [
              { id: 410, name: "Tuna Steak", doneness: FISH_RARE_OK },
            ]
          }
        ]
      },
      {
        id: 42,
        name: "White Fish",
        cutTypes: [
          {
            id: 420,
            name: "White Fish",
            cuts: [
              { id: 420, name: "Cod Fillet", doneness: ["medium", "well_done"] },
              { id: 421, name: "Halibut Fillet", doneness: ["medium", "well_done"] },
              { id: 422, name: "Sea Bass / Branzino", doneness: ["medium", "well_done"] },
              { id: 423, name: "Swordfish Steak", doneness: ["medium", "well_done"] },
              { id: 424, name: "Mahi-Mahi", doneness: ["medium", "well_done"] },
              { id: 425, name: "Haddock Fillet", doneness: ["medium", "well_done"] },
              { id: 426, name: "Hake Fillet", doneness: ["medium", "well_done"] },
              { id: 427, name: "Trout Fillet", doneness: FISH_DONENESS },
            ]
          }
        ]
      },
      {
        id: 43,
        name: "Shellfish",
        cutTypes: [
          {
            id: 430,
            name: "Shellfish",
            cuts: [
              { id: 430, name: "Shrimp", doneness: FISH_WELL_ONLY },
              { id: 431, name: "Lobster Tail", doneness: FISH_WELL_ONLY },
              { id: 432, name: "Scallops", doneness: ["medium_rare", "well_done"] },
            ]
          }
        ]
      }
    ]
  },
  lamb: {
    id: 5,
    name: "Lamb",
    icon: "🐑",
    color: "#800020",
    meats: [
      {
        id: 50,
        name: "Lamb",
        cutTypes: [
          {
            id: 500,
            name: "Roasts",
            cuts: [
              { id: 500, name: "Leg of Lamb", doneness: STEAK_DONENESS },
              { id: 501, name: "Rack of Lamb", doneness: STEAK_DONENESS_NO_WELL },
              { id: 502, name: "Lamb Shoulder", doneness: BRAISING_DONENESS },
              { id: 503, name: "Lamb Loin Roast", doneness: STEAK_DONENESS_NO_WELL },
              { id: 504, name: "Lamb Brisket", doneness: BRAISING_DONENESS },
              { id: 505, name: "Lamb Rump", doneness: STEAK_DONENESS },
              { id: 506, name: "Lamb Shank", doneness: BRAISING_DONENESS },
              { id: 507, name: "Lamb Rib", doneness: STEAK_DONENESS_NO_WELL },
            ]
          },
          {
            id: 501,
            name: "Chops",
            cuts: [
              { id: 510, name: "Lamb Chops", doneness: STEAK_DONENESS },
              { id: 511, name: "Lamb Loin Chops", doneness: STEAK_DONENESS_NO_WELL },
              { id: 512, name: "Lamb Neck Filet", doneness: STEAK_DONENESS_NO_WELL },
              { id: 513, name: "Lamb Cutlet", doneness: STEAK_DONENESS_NO_WELL },
            ]
          },
          {
            id: 502,
            name: "Ground",
            cuts: [
              { id: 520, name: "Ground Lamb", doneness: ["well_done"] },
              { id: 521, name: "Lamb Kofta / Kebab", doneness: ["well_done"] },
              { id: 522, name: "Lamb Burger", doneness: ["well_done"] },
            ]
          }
        ]
      }
    ]
  },
  game: {
    id: 6,
    name: "Game / Other",
    icon: "🦌",
    color: "#2F4F4F",
    meats: [
      {
        id: 60,
        name: "Venison",
        cutTypes: [
          {
            id: 600,
            name: "Venison",
            cuts: [
              { id: 600, name: "Venison Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 601, name: "Venison Roast", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 602, name: "Venison Loin", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 61,
        name: "Wild Boar",
        cutTypes: [
          {
            id: 610,
            name: "Wild Boar",
            cuts: [
              { id: 610, name: "Wild Boar Chop", doneness: ["well_done"] },
              { id: 611, name: "Wild Boar Shoulder", doneness: BRAISING_DONENESS },
            ]
          }
        ]
      },
      {
        id: 62,
        name: "Bison / Buffalo",
        cutTypes: [
          {
            id: 620,
            name: "Bison",
            cuts: [
              { id: 620, name: "Bison Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 621, name: "Bison Burger", doneness: ["well_done"] },
              { id: 622, name: "Bison Roast", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 63,
        name: "Reindeer",
        cutTypes: [
          {
            id: 630,
            name: "Reindeer",
            cuts: [
              { id: 630, name: "Reindeer Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 631, name: "Reindeer Roast", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 64,
        name: "Moose",
        cutTypes: [
          {
            id: 640,
            name: "Moose",
            cuts: [
              { id: 640, name: "Moose Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 641, name: "Moose Roast", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 66,
        name: "Ostrich",
        cutTypes: [
          {
            id: 660,
            name: "Ostrich",
            cuts: [
              { id: 660, name: "Ostrich Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 661, name: "Ostrich Fillet", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 67,
        name: "Mutton",
        cutTypes: [
          {
            id: 670,
            name: "Mutton",
            cuts: [
              { id: 670, name: "Mutton Chop", doneness: STEAK_DONENESS },
              { id: 671, name: "Mutton Leg Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 672, name: "Mutton Shoulder", doneness: BRAISING_DONENESS },
            ]
          }
        ]
      },
      {
        id: 68,
        name: "Kangaroo",
        cutTypes: [
          {
            id: 680,
            name: "Kangaroo",
            cuts: [
              { id: 680, name: "Kangaroo Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 681, name: "Kangaroo Fillet", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 69,
        name: "Goat",
        cutTypes: [
          {
            id: 690,
            name: "Goat",
            cuts: [
              { id: 690, name: "Goat Chop", doneness: STEAK_DONENESS_NO_RARE },
              { id: 691, name: "Goat Leg Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 692, name: "Goat Shoulder", doneness: BRAISING_DONENESS },
            ]
          }
        ]
      }
    ]
  },
  vegetables: {
    id: 7,
    name: "Vegetables",
    icon: "🥔",
    color: "#228B22",
    meats: [
      {
        id: 70,
        name: "Root Vegetables",
        cutTypes: [
          {
            id: 700,
            name: "Potatoes & Roots",
            cuts: [
              { id: 700, name: "Baked Potato", doneness: ["tender"] },
              { id: 701, name: "Roasted Potatoes", doneness: ["caramelized"] },
              { id: 702, name: "Roasted Carrots", doneness: ["tender", "caramelized"] },
              { id: 705, name: "Roasted Sweet Potato", doneness: ["tender", "caramelized"] },
            ]
          }
        ]
      },
      {
        id: 71,
        name: "Green Vegetables",
        cutTypes: [
          {
            id: 710,
            name: "Greens",
            cuts: [
              { id: 710, name: "Broccoli", doneness: ["crisp_tender", "tender"] },
              { id: 711, name: "Brussels Sprouts", doneness: ["tender", "caramelized"] },
              { id: 712, name: "Asparagus", doneness: ["crisp_tender", "tender"] },
            ]
          }
        ]
      },
      {
        id: 72,
        name: "Alliums",
        cutTypes: [
          {
            id: 720,
            name: "Onions & Garlic",
            cuts: [
              { id: 720, name: "Roasted Onion", doneness: ["tender", "caramelized"] },
              { id: 721, name: "Caramelized Onions", doneness: ["caramelized"] },
              { id: 722, name: "Roasted Garlic", doneness: ["tender", "caramelized"] },
            ]
          }
        ]
      }
    ]
  }
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
      _selectedMeat: { type: Number },
      _selectedCutType: { type: Number },
      _selectedCut: { type: Number },
      _selectedDoneness: { type: String },
      _selectedMethod: { type: String },
      _selectedEntity: { type: String },
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

  _getCategory() {
    return this._selectedCategory ? MEAT_CATEGORIES[this._selectedCategory] : null;
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
    if (!cut || !cut.doneness) return [];
    return cut.doneness.map(d => DONENESS_OPTIONS[d]).filter(Boolean);
  }

  _selectCategory(categoryKey) {
    this._selectedCategory = categoryKey;
    this._selectedMeat = null;
    this._selectedCutType = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    
    // Auto-select meat if only one
    const meats = MEAT_CATEGORIES[categoryKey]?.meats || [];
    if (meats.length === 1) {
      this._selectMeat(meats[0].id);
    }
  }

  _selectMeat(meatId) {
    this._selectedMeat = meatId;
    this._selectedCutType = null;
    this._selectedCut = null;
    this._selectedDoneness = null;
    
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
  }

  _selectCut(cutId) {
    this._selectedCut = cutId;
    // Auto-select first valid doneness for this cut
    const cut = this._getCuts().find(c => c.id === cutId);
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
    const category = this._getCategory();
    const meats = this._getMeats();
    const cutTypes = this._getCutTypes();
    const cuts = this._getCuts();
    const showMeatSelector = meats.length > 1;
    const showCutTypeSelector = cutTypes.length > 1 || (cutTypes.length === 1 && this._selectedMeat);
    
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
      
      <!-- Step 1: Select Category -->
      <ha-card>
        <div class="card-content">
          <h3>1️⃣ Select Category</h3>
          <div class="button-group">
            ${Object.entries(MEAT_CATEGORIES).map(([key, cat]) => html`
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
                  ${cut.name}
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
            <h3>🌡️ Doneness Level</h3>
            <div class="doneness-grid">
              ${this._getAvailableDoneness().map(opt => html`
                <button 
                  class="doneness-btn ${this._selectedDoneness === opt.value ? 'selected' : ''}"
                  @click=${() => this._selectedDoneness = opt.value}
                  title="${opt.description || ''}">
                  <span class="icon">${opt.icon}</span>
                  ${opt.name}
                </button>
              `)}
            </div>
          </div>
        </ha-card>
        
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
