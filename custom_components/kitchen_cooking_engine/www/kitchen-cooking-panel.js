/**
 * Kitchen Cooking Engine Panel
 * 
 * Last Updated: 1 Dec 2025, 19:40 CET
 * Last Change: v0.1.1.1 - Full doneness options for all proteins, Swedish terminology fixes
 *              - Changed "stekstyck" to "helstekt" (roast) and "stek" to "skiva" (steak/chop)
 *              - All proteins now have full doneness range (blodig, medium_rare, medium, 
 *                medium_well, genomstekt, långkokt) - user chooses based on preference
 *              - Added Kalv (veal) as separate category
 *              - Added Tonfisk (tuna) with blodig as default
 *              - Fish can now be served blodig/rare for sushi-grade cuts
 * 
 * NOTE: Temperature values are suggestions based on cooking style, not just safety.
 *       Livsmedelsverket safety info can be shown separately if needed.
 * 
 * A custom panel for the Kitchen Cooking Engine integration.
 */

import {
  LitElement,
  html,
  css,
} from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";

// Data source options
const DATA_SOURCE_INTERNATIONAL = "international";
const DATA_SOURCE_SWEDISH = "swedish";

// Doneness option definitions (International/USDA)
const DONENESS_OPTIONS = {
  rare: { value: "rare", name: "Rare", icon: "🔴", description: "Cool red center", temp_c: 49, temp_f: 120 },
  medium_rare: { value: "medium_rare", name: "Medium Rare", icon: "🟠", description: "Warm red center", temp_c: 54, temp_f: 130 },
  medium: { value: "medium", name: "Medium", icon: "🟡", description: "Warm pink center", temp_c: 60, temp_f: 140 },
  medium_well: { value: "medium_well", name: "Medium Well", icon: "🟤", description: "Slightly pink center", temp_c: 66, temp_f: 150 },
  well_done: { value: "well_done", name: "Well Done", icon: "⚪", description: "No pink, fully cooked", temp_c: 71, temp_f: 160 },
  pulled: { value: "pulled", name: "Pulled", icon: "🍖", description: "Shreddable, collagen broken down", temp_c: 93, temp_f: 200 },
  safe: { value: "safe", name: "Safe (165°F)", icon: "✅", description: "USDA safe, cooked through", temp_c: 74, temp_f: 165 },
  dark_meat_optimal: { value: "dark_meat_optimal", name: "Dark Meat", icon: "🍗", description: "Optimal texture for dark meat", temp_c: 77, temp_f: 170 },
  crispy: { value: "crispy", name: "Crispy", icon: "🥓", description: "Crispy and rendered", temp_c: 90, temp_f: 195 },
  heated_through: { value: "heated_through", name: "Heated Through", icon: "♨️", description: "Warmed through (pre-cooked)", temp_c: 60, temp_f: 140 },
  done: { value: "done", name: "Done", icon: "✓", description: "Cooked through", temp_c: 71, temp_f: 160 },
  tender: { value: "tender", name: "Tender", icon: "🥔", description: "Fork-tender", temp_c: 95, temp_f: 203 },
  crisp_tender: { value: "crisp_tender", name: "Crisp-Tender", icon: "🥦", description: "Slightly firm with bite", temp_c: 85, temp_f: 185 },
  caramelized: { value: "caramelized", name: "Caramelized", icon: "🧅", description: "Golden brown", temp_c: 160, temp_f: 320 },
  charred: { value: "charred", name: "Charred", icon: "🔥", description: "Charred exterior", temp_c: 200, temp_f: 390 },
};

// Swedish doneness option definitions
const SWEDISH_DONENESS_OPTIONS = {
  blodig: { value: "blodig", name: "Blodig", icon: "🔴", description: "Sval röd kärna", temp_c: 50, temp_f: 122 },
  medium_rare: { value: "medium_rare", name: "Medium Rare", icon: "🟠", description: "Rosa kärna", temp_c: 54, temp_f: 129 },
  medium: { value: "medium", name: "Medium", icon: "🟡", description: "Varm rosa kärna", temp_c: 58, temp_f: 136 },
  medium_well: { value: "medium_well", name: "Medium Well", icon: "🟤", description: "Nästan genomstekt", temp_c: 64, temp_f: 147 },
  genomstekt: { value: "genomstekt", name: "Genomstekt", icon: "⚪", description: "Ingen rosa färg", temp_c: 70, temp_f: 158 },
  långkokt: { value: "långkokt", name: "Långkokt", icon: "🍖", description: "Strimlningsbart", temp_c: 92, temp_f: 198 },
  safe: { value: "safe", name: "Säker (72°C)", icon: "✅", description: "Genomstekt, säker att äta", temp_c: 72, temp_f: 162 },
  dark_meat_optimal: { value: "dark_meat_optimal", name: "Mörkt kött", icon: "🍗", description: "Optimal textur för mörkt kött", temp_c: 77, temp_f: 170 },
  crispy: { value: "crispy", name: "Krispig", icon: "🥓", description: "Krispigt och utstekt", temp_c: 90, temp_f: 195 },
  heated_through: { value: "heated_through", name: "Uppvärmd", icon: "♨️", description: "Genomvärmd (förkokt)", temp_c: 60, temp_f: 140 },
  well_done: { value: "well_done", name: "Genomstekt", icon: "⚪", description: "Ingen rosa färg", temp_c: 70, temp_f: 158 },
  done: { value: "done", name: "Färdig", icon: "✓", description: "Genomstekt", temp_c: 71, temp_f: 160 },
  tender: { value: "tender", name: "Mjuk", icon: "🥔", description: "Mjuk och mör", temp_c: 95, temp_f: 203 },
  pulled: { value: "pulled", name: "Långkokt", icon: "🍖", description: "Strimlningsbart", temp_c: 92, temp_f: 198 },
  rare: { value: "rare", name: "Blodig", icon: "🔴", description: "Sval röd kärna", temp_c: 50, temp_f: 122 },
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
 * Structure mirrors the EXACT MEATER app Guided Cook flow (2025):
 * - Beef/Pork/Lamb: Category → Group (Steak/Roast/Other) → Cuts
 * - Poultry: Category → Species (Chicken/Duck/Goose/Turkey) → Cuts
 * - Fish: Category → Fish Type → Fillet/Other
 * - Other/Game: Category → Animal Type → Steak/Roast/Other
 * 
 * Source: https://support.meater.com/hc/en-us/articles/36774867052827-Cooking-with-the-MEATER-App
 * Last verified: 2025-05-28
 * 
 * NOTE: Cut names and structure from MEATER app public documentation.
 *       All temperature values come from USDA/FDA public safety guidelines.
 *       Cut IDs match cooking_data.py for backend compatibility.
 * 
 * Additional sources consulted (for completeness):
 * - Hank's True BBQ Meat Cuts and Cooking Temps
 * - FoodFireFriends Smoking Times and Temperatures Chart
 * - Cookery Hut Meat Cooking Times and Temperatures Chart
 * - GourmetFoodStore Meat & Poultry Cooking Temperatures
 * - Swedish sources: Stekguiden.se, Gårdssällskapet, Scan Köttguiden, ICA, Köket.se
 */
const MEAT_CATEGORIES = {
  beef: {
    id: 1,
    name: "Beef",
    icon: "🥩",
    color: "#8B0000",
    // MEATER app flow: Beef → Steak/Roast/Other → Cut
    meats: [
      {
        id: 10,
        name: "Steak",  // Group name as shown in MEATER app
        cutTypes: [
          {
            id: 100,
            name: "Steak Cuts",
            cuts: [
              { id: 100, name: "Sirloin", doneness: STEAK_DONENESS },
              { id: 101, name: "Rib Eye", doneness: STEAK_DONENESS },
              { id: 102, name: "Flank", doneness: STEAK_DONENESS_NO_WELL },
              { id: 103, name: "T-Bone", doneness: STEAK_DONENESS },
              { id: 104, name: "Tomahawk", doneness: STEAK_DONENESS },
              { id: 105, name: "Filet Mignon", doneness: STEAK_DONENESS },
              { id: 106, name: "Picanha", doneness: STEAK_DONENESS },
              { id: 107, name: "New York Strip", doneness: STEAK_DONENESS },
              { id: 108, name: "Skirt Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 109, name: "Flat Iron Steak", doneness: STEAK_DONENESS },
              { id: 110, name: "Hanger Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 111, name: "Porterhouse", doneness: STEAK_DONENESS },
              { id: 199, name: "Other", doneness: STEAK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 11,
        name: "Roast",  // Group name as shown in MEATER app
        cutTypes: [
          {
            id: 110,
            name: "Roast Cuts",
            cuts: [
              { id: 120, name: "Roasting Joint", doneness: STEAK_DONENESS },
              { id: 121, name: "Tenderloin", doneness: STEAK_DONENESS_NO_WELL },
              { id: 122, name: "Brisket", doneness: BRAISING_DONENESS },
              { id: 123, name: "Prime Rib", doneness: STEAK_DONENESS },
              { id: 124, name: "Round", doneness: STEAK_DONENESS_NO_RARE },
              { id: 125, name: "Tri-Tip", doneness: STEAK_DONENESS },
              { id: 126, name: "Shank", doneness: BRAISING_DONENESS },
              { id: 127, name: "Rump", doneness: STEAK_DONENESS_NO_RARE },
              { id: 128, name: "Chuck", doneness: BRAISING_DONENESS },
              { id: 129, name: "Sirloin Roast", doneness: STEAK_DONENESS },
              { id: 130, name: "Top Round Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 199, name: "Other", doneness: STEAK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 12,
        name: "Other",  // Group name as shown in MEATER app
        cutTypes: [
          {
            id: 120,
            name: "Other Cuts",
            cuts: [
              { id: 140, name: "Ground", doneness: ["well_done"] },
              { id: 141, name: "Burger", doneness: ["well_done"] },
              { id: 142, name: "Rib", doneness: BRAISING_DONENESS },
              { id: 143, name: "Meatloaf", doneness: ["done"] },
              { id: 144, name: "Liver", doneness: ["medium", "well_done"] },
              { id: 145, name: "Shin", doneness: BRAISING_DONENESS },
              { id: 146, name: "Tongue", doneness: BRAISING_DONENESS },
              { id: 147, name: "Short Ribs", doneness: BRAISING_DONENESS },
              { id: 148, name: "Oxtail", doneness: BRAISING_DONENESS },
              { id: 149, name: "Cheek", doneness: BRAISING_DONENESS },
              { id: 199, name: "Other", doneness: STEAK_DONENESS },
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
    // MEATER app flow: Pork → Steak/Roast/Other → Cut
    meats: [
      {
        id: 20,
        name: "Steak",
        cutTypes: [
          {
            id: 200,
            name: "Steak Cuts",
            cuts: [
              { id: 200, name: "Chop", doneness: PORK_DONENESS },
              { id: 201, name: "Loin", doneness: PORK_DONENESS },
              { id: 202, name: "Tenderloin", doneness: PORK_DONENESS },
              { id: 203, name: "Shoulder", doneness: PORK_DONENESS },
              { id: 204, name: "Secreto", doneness: PORK_DONENESS },
              { id: 299, name: "Other", doneness: PORK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 21,
        name: "Roast",
        cutTypes: [
          {
            id: 210,
            name: "Roast Cuts",
            cuts: [
              { id: 210, name: "Butt", doneness: BRAISING_DONENESS },
              { id: 211, name: "Shoulder", doneness: BRAISING_DONENESS },
              { id: 212, name: "Leg", doneness: PORK_DONENESS },
              { id: 213, name: "Ham", doneness: PORK_DONENESS },
              { id: 214, name: "Loin", doneness: PORK_DONENESS },
              { id: 215, name: "Virginia Ham", doneness: ["heated_through"] },
              { id: 216, name: "Belly", doneness: ["well_done", "crispy"] },
              { id: 217, name: "Baby Back Ribs", doneness: BRAISING_DONENESS },
              { id: 218, name: "Spare Ribs", doneness: BRAISING_DONENESS },
              { id: 219, name: "St. Louis Style Ribs", doneness: BRAISING_DONENESS },
              { id: 220, name: "Country Style Ribs", doneness: BRAISING_DONENESS },
              { id: 299, name: "Other", doneness: PORK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 22,
        name: "Other",
        cutTypes: [
          {
            id: 220,
            name: "Other Cuts",
            cuts: [
              { id: 240, name: "Ground", doneness: ["well_done"] },
              { id: 241, name: "Tongue", doneness: BRAISING_DONENESS },
              { id: 242, name: "Jowl", doneness: BRAISING_DONENESS },
              { id: 243, name: "Cheek", doneness: BRAISING_DONENESS },
              { id: 244, name: "Liver", doneness: ["well_done"] },
              { id: 245, name: "Rib", doneness: BRAISING_DONENESS },
              { id: 246, name: "Sausage", doneness: ["well_done"] },
              { id: 299, name: "Other", doneness: PORK_DONENESS },
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
    // MEATER app flow: Poultry → Chicken/Duck/Goose/Turkey → Cut
    meats: [
      {
        id: 30,
        name: "Chicken",
        cutTypes: [
          {
            id: 300,
            name: "Chicken Cuts",
            cuts: [
              { id: 300, name: "Whole", doneness: POULTRY_DONENESS },
              { id: 301, name: "Breast", doneness: POULTRY_DONENESS },
              { id: 302, name: "Thigh", doneness: POULTRY_DARK_DONENESS },
              { id: 303, name: "Leg", doneness: POULTRY_DARK_DONENESS },
              { id: 304, name: "Ground", doneness: POULTRY_DONENESS },
              { id: 305, name: "Burger", doneness: POULTRY_DONENESS },
              { id: 306, name: "Wing", doneness: POULTRY_DARK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 31,
        name: "Duck",
        cutTypes: [
          {
            id: 310,
            name: "Duck Cuts",
            cuts: [
              { id: 340, name: "Whole", doneness: POULTRY_DONENESS },
              { id: 341, name: "Breast", doneness: DUCK_BREAST_DONENESS },
              { id: 342, name: "Leg", doneness: ["dark_meat_optimal"] },
            ]
          }
        ]
      },
      {
        id: 32,
        name: "Goose",
        cutTypes: [
          {
            id: 320,
            name: "Goose Cuts",
            cuts: [
              { id: 345, name: "Whole", doneness: POULTRY_DONENESS },
              { id: 346, name: "Breast", doneness: DUCK_BREAST_DONENESS },
              { id: 347, name: "Thigh", doneness: POULTRY_DARK_DONENESS },
              { id: 348, name: "Leg", doneness: POULTRY_DARK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 33,
        name: "Turkey",
        cutTypes: [
          {
            id: 330,
            name: "Turkey Cuts",
            cuts: [
              { id: 330, name: "Whole", doneness: POULTRY_DONENESS },
              { id: 331, name: "Breast", doneness: POULTRY_DONENESS },
              { id: 332, name: "Thigh", doneness: POULTRY_DARK_DONENESS },
              { id: 333, name: "Leg", doneness: POULTRY_DARK_DONENESS },
              { id: 334, name: "Ground", doneness: POULTRY_DONENESS },
              { id: 335, name: "Burger", doneness: POULTRY_DONENESS },
            ]
          }
        ]
      }
    ]
  },
  fish: {
    id: 4,
    name: "Fish",
    icon: "🐟",
    color: "#4682B4",
    // MEATER app flow: Fish → Fish Type → Fillet/Other
    meats: [
      {
        id: 40,
        name: "Salmon",
        cutTypes: [
          {
            id: 400,
            name: "Salmon Cuts",
            cuts: [
              { id: 400, name: "Fillet (Wild)", doneness: FISH_DONENESS },
              { id: 401, name: "Fillet (Farmed)", doneness: FISH_DONENESS },
              { id: 402, name: "Steak", doneness: FISH_DONENESS },
              { id: 499, name: "Other", doneness: FISH_DONENESS },
            ]
          }
        ]
      },
      {
        id: 41,
        name: "Cod",
        cutTypes: [
          {
            id: 410,
            name: "Cod Cuts",
            cuts: [
              { id: 410, name: "Fillet", doneness: ["medium", "well_done"] },
              { id: 419, name: "Other", doneness: ["medium", "well_done"] },
            ]
          }
        ]
      },
      {
        id: 42,
        name: "Halibut",
        cutTypes: [
          {
            id: 420,
            name: "Halibut Cuts",
            cuts: [
              { id: 420, name: "Fillet", doneness: ["medium", "well_done"] },
              { id: 421, name: "Steak", doneness: ["medium", "well_done"] },
              { id: 429, name: "Other", doneness: ["medium", "well_done"] },
            ]
          }
        ]
      },
      {
        id: 43,
        name: "Haddock",
        cutTypes: [
          {
            id: 430,
            name: "Haddock Cuts",
            cuts: [
              { id: 430, name: "Fillet", doneness: ["medium", "well_done"] },
              { id: 439, name: "Other", doneness: ["medium", "well_done"] },
            ]
          }
        ]
      },
      {
        id: 44,
        name: "Hake",
        cutTypes: [
          {
            id: 440,
            name: "Hake Cuts",
            cuts: [
              { id: 440, name: "Fillet", doneness: ["medium", "well_done"] },
              { id: 449, name: "Other", doneness: ["medium", "well_done"] },
            ]
          }
        ]
      },
      {
        id: 45,
        name: "Tuna",
        cutTypes: [
          {
            id: 450,
            name: "Tuna Cuts",
            cuts: [
              { id: 450, name: "Steak", doneness: FISH_RARE_OK },
              { id: 451, name: "Fillet", doneness: FISH_RARE_OK },
              { id: 459, name: "Other", doneness: FISH_RARE_OK },
            ]
          }
        ]
      },
      {
        id: 46,
        name: "Lobster",
        cutTypes: [
          {
            id: 460,
            name: "Lobster Cuts",
            cuts: [
              { id: 460, name: "Tail", doneness: FISH_WELL_ONLY },
              { id: 461, name: "Whole", doneness: FISH_WELL_ONLY },
              { id: 462, name: "Claw", doneness: FISH_WELL_ONLY },
            ]
          }
        ]
      },
      {
        id: 47,
        name: "Swordfish",
        cutTypes: [
          {
            id: 470,
            name: "Swordfish Cuts",
            cuts: [
              { id: 470, name: "Steak", doneness: ["medium", "well_done"] },
              { id: 479, name: "Other", doneness: ["medium", "well_done"] },
            ]
          }
        ]
      },
      {
        id: 48,
        name: "Trout",
        cutTypes: [
          {
            id: 480,
            name: "Trout Cuts",
            cuts: [
              { id: 480, name: "Fillet", doneness: FISH_DONENESS },
              { id: 481, name: "Whole", doneness: FISH_DONENESS },
              { id: 489, name: "Other", doneness: FISH_DONENESS },
            ]
          }
        ]
      },
      {
        id: 49,
        name: "Sea Bass / Branzino",
        cutTypes: [
          {
            id: 490,
            name: "Sea Bass Cuts",
            cuts: [
              { id: 490, name: "Fillet", doneness: ["medium", "well_done"] },
              { id: 491, name: "Whole", doneness: ["medium", "well_done"] },
              { id: 499, name: "Other", doneness: ["medium", "well_done"] },
            ]
          }
        ]
      },
      {
        id: 50,
        name: "Other Fish",
        cutTypes: [
          {
            id: 500,
            name: "Other Fish Cuts",
            cuts: [
              { id: 500, name: "Mahi-Mahi Fillet", doneness: ["medium", "well_done"] },
              { id: 501, name: "Tilapia Fillet", doneness: ["medium", "well_done"] },
              { id: 502, name: "Snapper Fillet", doneness: ["medium", "well_done"] },
              { id: 503, name: "Grouper Fillet", doneness: ["medium", "well_done"] },
              { id: 504, name: "Flounder Fillet", doneness: ["medium", "well_done"] },
              { id: 505, name: "Sole Fillet", doneness: ["medium", "well_done"] },
              { id: 506, name: "Catfish Fillet", doneness: ["well_done"] },
              { id: 507, name: "Perch Fillet", doneness: ["medium", "well_done"] },
              { id: 508, name: "Walleye Fillet", doneness: ["medium", "well_done"] },
              { id: 509, name: "Arctic Char Fillet", doneness: FISH_DONENESS },
              { id: 510, name: "Mackerel Fillet", doneness: FISH_DONENESS },
              { id: 511, name: "Sardines", doneness: FISH_DONENESS },
              { id: 599, name: "Other", doneness: FISH_DONENESS },
            ]
          }
        ]
      },
      {
        id: 51,
        name: "Shellfish",
        cutTypes: [
          {
            id: 510,
            name: "Shellfish",
            cuts: [
              { id: 550, name: "Shrimp / Prawns", doneness: FISH_WELL_ONLY },
              { id: 551, name: "Scallops", doneness: ["medium_rare", "well_done"] },
              { id: 552, name: "Crab", doneness: FISH_WELL_ONLY },
              { id: 553, name: "Mussels", doneness: FISH_WELL_ONLY },
              { id: 554, name: "Clams", doneness: FISH_WELL_ONLY },
              { id: 555, name: "Oysters", doneness: FISH_WELL_ONLY },
              { id: 556, name: "Calamari / Squid", doneness: FISH_WELL_ONLY },
              { id: 557, name: "Octopus", doneness: ["well_done", "tender"] },
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
    // MEATER app flow: Lamb → Steak/Roast/Other → Cut
    meats: [
      {
        id: 50,
        name: "Steak",
        cutTypes: [
          {
            id: 500,
            name: "Steak Cuts",
            cuts: [
              { id: 500, name: "Chop", doneness: STEAK_DONENESS },
              { id: 501, name: "Neck Filet", doneness: STEAK_DONENESS_NO_WELL },
              { id: 502, name: "Cutlet", doneness: STEAK_DONENESS_NO_WELL },
              { id: 503, name: "Loin Chop", doneness: STEAK_DONENESS_NO_WELL },
              { id: 599, name: "Other", doneness: STEAK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 51,
        name: "Roast",
        cutTypes: [
          {
            id: 510,
            name: "Roast Cuts",
            cuts: [
              { id: 510, name: "Loin", doneness: STEAK_DONENESS_NO_WELL },
              { id: 511, name: "Brisket", doneness: BRAISING_DONENESS },
              { id: 512, name: "Leg", doneness: STEAK_DONENESS },
              { id: 513, name: "Rump", doneness: STEAK_DONENESS },
              { id: 514, name: "Shank", doneness: BRAISING_DONENESS },
              { id: 515, name: "Rib Rack", doneness: STEAK_DONENESS_NO_WELL },
              { id: 516, name: "Shoulder", doneness: BRAISING_DONENESS },
              { id: 517, name: "Crown Roast", doneness: STEAK_DONENESS_NO_WELL },
              { id: 599, name: "Other", doneness: STEAK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 52,
        name: "Other",
        cutTypes: [
          {
            id: 520,
            name: "Other Cuts",
            cuts: [
              { id: 520, name: "Ground", doneness: ["well_done"] },
              { id: 521, name: "Burger", doneness: ["well_done"] },
              { id: 522, name: "Rib", doneness: STEAK_DONENESS_NO_WELL },
              { id: 523, name: "Kofta / Kebab", doneness: ["well_done"] },
              { id: 599, name: "Other", doneness: STEAK_DONENESS },
            ]
          }
        ]
      }
    ]
  },
  other: {
    id: 6,
    name: "Other",
    icon: "🦌",
    color: "#2F4F4F",
    // MEATER app flow: Other → Animal Type → Steak/Roast/Other
    meats: [
      {
        id: 60,
        name: "Venison",
        cutTypes: [
          {
            id: 600,
            name: "Venison Cuts",
            cuts: [
              { id: 600, name: "Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 601, name: "Roast", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 602, name: "Loin", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 603, name: "Leg", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 604, name: "Shoulder", doneness: BRAISING_DONENESS },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_NO_WELL },
            ]
          }
        ]
      },
      {
        id: 61,
        name: "Reindeer",
        cutTypes: [
          {
            id: 610,
            name: "Reindeer Cuts",
            cuts: [
              { id: 610, name: "Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 611, name: "Roast", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 612, name: "Loin", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_NO_WELL },
            ]
          }
        ]
      },
      {
        id: 62,
        name: "Moose",
        cutTypes: [
          {
            id: 620,
            name: "Moose Cuts",
            cuts: [
              { id: 620, name: "Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 621, name: "Roast", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 622, name: "Loin", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_NO_WELL },
            ]
          }
        ]
      },
      {
        id: 63,
        name: "Buffalo",
        cutTypes: [
          {
            id: 630,
            name: "Buffalo Cuts",
            cuts: [
              { id: 630, name: "Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 631, name: "Roast", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 632, name: "Burger", doneness: ["well_done"] },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_NO_WELL },
            ]
          }
        ]
      },
      {
        id: 64,
        name: "Ostrich",
        cutTypes: [
          {
            id: 640,
            name: "Ostrich Cuts",
            cuts: [
              { id: 640, name: "Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 641, name: "Fillet", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 65,
        name: "Mutton",
        cutTypes: [
          {
            id: 650,
            name: "Mutton Cuts",
            cuts: [
              { id: 650, name: "Chop", doneness: STEAK_DONENESS },
              { id: 651, name: "Leg Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 652, name: "Shoulder", doneness: BRAISING_DONENESS },
              { id: 699, name: "Other", doneness: STEAK_DONENESS },
            ]
          }
        ]
      },
      {
        id: 66,
        name: "Kangaroo",
        cutTypes: [
          {
            id: 660,
            name: "Kangaroo Cuts",
            cuts: [
              { id: 660, name: "Steak", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 661, name: "Fillet", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      },
      {
        id: 67,
        name: "Goat",
        cutTypes: [
          {
            id: 670,
            name: "Goat Cuts",
            cuts: [
              { id: 670, name: "Chop", doneness: STEAK_DONENESS_NO_RARE },
              { id: 671, name: "Leg Roast", doneness: STEAK_DONENESS_NO_RARE },
              { id: 672, name: "Shoulder", doneness: BRAISING_DONENESS },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_NO_RARE },
            ]
          }
        ]
      },
      {
        id: 68,
        name: "Wild Boar",
        cutTypes: [
          {
            id: 680,
            name: "Wild Boar Cuts",
            cuts: [
              { id: 680, name: "Chop", doneness: ["well_done"] },
              { id: 681, name: "Shoulder", doneness: BRAISING_DONENESS },
              { id: 682, name: "Leg Roast", doneness: ["well_done"] },
              { id: 699, name: "Other", doneness: ["well_done"] },
            ]
          }
        ]
      },
      {
        id: 69,
        name: "Other Game",
        cutTypes: [
          {
            id: 690,
            name: "Other Game Cuts",
            cuts: [
              { id: 690, name: "Steak", doneness: STEAK_DONENESS_NO_WELL },
              { id: 691, name: "Roast", doneness: STEAK_DONENESS_MR_TO_M },
              { id: 699, name: "Other", doneness: STEAK_DONENESS_MR_TO_M },
            ]
          }
        ]
      }
    ]
  }
};

// Swedish doneness arrays - based on cooking style, not safety guidelines
// Full range available for all cuts - user chooses based on preference
const SWEDISH_FULL_DONENESS = ["blodig", "medium_rare", "medium", "medium_well", "genomstekt", "långkokt"];
const SWEDISH_FISH_FULL = ["blodig", "medium_rare", "medium", "genomstekt"];
const SWEDISH_POULTRY_FULL = ["medium", "genomstekt", "långkokt"];

/**
 * SWEDISH_MEAT_CATEGORIES - Swedish meat/protein data structure
 * 
 * Temperature recommendations based on cooking style, not just safety.
 * All cuts have full doneness range - users choose based on preference.
 * Livsmedelsverket safety info can be shown separately in the UI if needed.
 * 
 * Note: For raw/rare preparations (e.g., tuna tataki, beef tartare),
 * use sushi-grade or properly sourced ingredients.
 * 
 * Terminology:
 * - "Skiva" = steak/chop style cuts
 * - "Helstekt" = roast style cuts
 * - "Långkokt" = braised/pulled style
 */
const SWEDISH_MEAT_CATEGORIES = {
  notkott: {
    id: 2001,
    name: "Nötkött",
    icon: "🥩",
    color: "#8B0000",
    meats: [
      {
        id: 2010,
        name: "Skiva",
        cutTypes: [
          {
            id: 2100,
            name: "Biff & Skiva",
            cuts: [
              { id: 2100, name: "Entrecôte", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2101, name: "Ryggbiff", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2102, name: "Oxfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2103, name: "Flankstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2104, name: "Flat Iron", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2105, name: "Flapsteak (Bavette)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2106, name: "Tomahawk", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2107, name: "Picanha", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2108, name: "Njurtapp", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2109, name: "Hanger Steak (Onglet)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
            ]
          }
        ]
      },
      {
        id: 2011,
        name: "Helstekt",
        cutTypes: [
          {
            id: 2120,
            name: "Helstekt",
            cuts: [
              { id: 2120, name: "Rostbiff", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2121, name: "Innanlår", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2122, name: "Ytterlår", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2123, name: "Fransyska", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2124, name: "Nötrulle", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2012,
        name: "Grytbitar/Långkok",
        cutTypes: [
          {
            id: 2130,
            name: "Långkokt",
            cuts: [
              { id: 2130, name: "Högrev", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2131, name: "Bringa (Brisket)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2132, name: "Bog", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2133, name: "Oxsvans", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2134, name: "Lägg", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2135, name: "Oxkind", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2136, name: "Märgpipa", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
            ]
          }
        ]
      }
    ]
  },
  flask: {
    id: 2002,
    name: "Fläsk",
    icon: "🐷",
    color: "#FFB6C1",
    meats: [
      {
        id: 2020,
        name: "Skiva/Kotlett",
        cutTypes: [
          {
            id: 2200,
            name: "Skiva & Kotlett",
            cuts: [
              { id: 2200, name: "Fläskkotlett med ben", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2204, name: "Fläskkotlett utan ben", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2201, name: "Fläskfilé (hel)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2205, name: "Fläskfilé (skiva)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2202, name: "Karrékoteletter", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2203, name: "Secreto (Ibérico)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2021,
        name: "Helstekt",
        cutTypes: [
          {
            id: 2210,
            name: "Helstekt",
            cuts: [
              { id: 2210, name: "Fläsksida", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "genomstekt" },
              { id: 2211, name: "Fläskkarré", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2212, name: "Skinka", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2213, name: "Julskinka (kokt)", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "genomstekt" },
              { id: 2214, name: "Fläskbog", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
            ]
          }
        ]
      },
      {
        id: 2022,
        name: "Revben",
        cutTypes: [
          {
            id: 2220,
            name: "Revben",
            cuts: [
              { id: 2220, name: "Revbensspjäll", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2221, name: "Sidfläsk med revben", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
            ]
          }
        ]
      }
    ]
  },
  fagel: {
    id: 2003,
    name: "Fågel",
    icon: "🍗",
    color: "#FFD700",
    meats: [
      {
        id: 2030,
        name: "Kyckling",
        cutTypes: [
          {
            id: 2300,
            name: "Kyckling",
            cuts: [
              { id: 2300, name: "Hel kyckling", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
              { id: 2301, name: "Kycklingbröst", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
              { id: 2302, name: "Kycklingleår", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
              { id: 2303, name: "Kycklingvingar", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
            ]
          }
        ]
      },
      {
        id: 2031,
        name: "Kalkon",
        cutTypes: [
          {
            id: 2310,
            name: "Kalkon",
            cuts: [
              { id: 2310, name: "Hel kalkon", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
              { id: 2311, name: "Kalkonbröst", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
            ]
          }
        ]
      },
      {
        id: 2032,
        name: "Anka",
        cutTypes: [
          {
            id: 2320,
            name: "Anka",
            cuts: [
              { id: 2320, name: "Ankbröst", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2321, name: "Hel anka", doneness: SWEDISH_POULTRY_FULL, recommendedDoneness: "genomstekt" },
            ]
          }
        ]
      }
    ]
  },
  fisk: {
    id: 2004,
    name: "Fisk",
    icon: "🐟",
    color: "#4682B4",
    meats: [
      {
        id: 2040,
        name: "Lax",
        cutTypes: [
          {
            id: 2400,
            name: "Lax",
            cuts: [
              { id: 2400, name: "Laxfilé", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2401, name: "Gravad lax (uppvärmd)", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2402, name: "Hel lax på ben", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2041,
        name: "Torsk",
        cutTypes: [
          {
            id: 2410,
            name: "Torsk",
            cuts: [
              { id: 2410, name: "Torskfilé", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2411, name: "Torskrygg", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2412, name: "Hel torsk på ben", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2042,
        name: "Tonfisk",
        cutTypes: [
          {
            id: 2430,
            name: "Tonfisk",
            cuts: [
              { id: 2430, name: "Tonfiskskiva", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "blodig" },
            ]
          }
        ]
      },
      {
        id: 2043,
        name: "Övrig fisk",
        cutTypes: [
          {
            id: 2420,
            name: "Övrig fisk",
            cuts: [
              { id: 2420, name: "Sikfilé", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2425, name: "Hel sik på ben", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2421, name: "Rödingfilé", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2426, name: "Hel röding på ben", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2422, name: "Abborrfilé", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "genomstekt" },
              { id: 2427, name: "Hel abborre på ben", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "genomstekt" },
              { id: 2423, name: "Gösfilé", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2428, name: "Hel gös på ben", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
              { id: 2424, name: "Hälleflundra", doneness: SWEDISH_FISH_FULL, recommendedDoneness: "medium" },
            ]
          }
        ]
      }
    ]
  },
  kalv: {
    id: 2007,
    name: "Kalv",
    icon: "🐄",
    color: "#DEB887",
    meats: [
      {
        id: 2070,
        name: "Helstekt",
        cutTypes: [
          {
            id: 2700,
            name: "Helstekt",
            cuts: [
              { id: 2700, name: "Kalvstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2701, name: "Kalvfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2702, name: "Kalvfransyska", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2703, name: "Kalvrostbiff", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2071,
        name: "Skiva/Kotlett",
        cutTypes: [
          {
            id: 2710,
            name: "Skiva & Kotlett",
            cuts: [
              { id: 2710, name: "Kalvkotlett", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2711, name: "Kalvschnitzel", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "genomstekt" },
              { id: 2712, name: "Kalvlever", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2072,
        name: "Långkok",
        cutTypes: [
          {
            id: 2720,
            name: "Långkokt",
            cuts: [
              { id: 2720, name: "Kalvbog", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2721, name: "Kalvlägg", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2722, name: "Kalvbringa", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
            ]
          }
        ]
      }
    ]
  },
  lamm: {
    id: 2005,
    name: "Lamm",
    icon: "🐑",
    color: "#800020",
    meats: [
      {
        id: 2050,
        name: "Helstekt",
        cutTypes: [
          {
            id: 2500,
            name: "Helstekt",
            cuts: [
              { id: 2500, name: "Lammstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2501, name: "Lammrack", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2502, name: "Lammbog", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
              { id: 2503, name: "Lammsadel", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
            ]
          }
        ]
      },
      {
        id: 2051,
        name: "Skiva/Kotlett",
        cutTypes: [
          {
            id: 2510,
            name: "Skiva & Kotlett",
            cuts: [
              { id: 2510, name: "Lammkotletter", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
              { id: 2511, name: "Lammhalsfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium_rare" },
            ]
          }
        ]
      }
    ]
  },
  vilt: {
    id: 2006,
    name: "Vilt",
    icon: "🦌",
    color: "#2F4F4F",
    meats: [
      {
        id: 2060,
        name: "Hjort/Rådjur",
        cutTypes: [
          {
            id: 2600,
            name: "Hjort & Rådjur",
            cuts: [
              { id: 2600, name: "Hjortfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2601, name: "Hjortstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2602, name: "Rådjursfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2603, name: "Rådjursstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2061,
        name: "Älg",
        cutTypes: [
          {
            id: 2610,
            name: "Älg",
            cuts: [
              { id: 2610, name: "Älgfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2611, name: "Älgstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2612, name: "Älgfärsbiff", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "genomstekt" },
            ]
          }
        ]
      },
      {
        id: 2062,
        name: "Ren",
        cutTypes: [
          {
            id: 2620,
            name: "Ren",
            cuts: [
              { id: 2620, name: "Renfilé", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
              { id: 2621, name: "Renstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "medium" },
            ]
          }
        ]
      },
      {
        id: 2063,
        name: "Vildsvin",
        cutTypes: [
          {
            id: 2630,
            name: "Vildsvin",
            cuts: [
              { id: 2630, name: "Vildsvinsfil", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "genomstekt" },
              { id: 2631, name: "Vildsvinsstek", doneness: SWEDISH_FULL_DONENESS, recommendedDoneness: "långkokt" },
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
      _dataSource: { type: String },
      _customTargetTempC: { type: Number },
      _showTempAdjust: { type: Boolean },
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
  }

  _getDataCategories() {
    return this._dataSource === DATA_SOURCE_SWEDISH ? SWEDISH_MEAT_CATEGORIES : MEAT_CATEGORIES;
  }

  _getDonenessOptions() {
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
    if (!cut || !cut.doneness) return [];
    const donenessOptions = this._getDonenessOptions();
    return cut.doneness.map(d => donenessOptions[d]).filter(Boolean);
  }

  _getRecommendedDoneness() {
    const cut = this._getSelectedCutData();
    if (!cut) return null;
    // Use explicit recommendedDoneness if set
    if (cut.recommendedDoneness) {
      return cut.recommendedDoneness;
    }
    // Fall back to first doneness option
    if (cut.doneness && cut.doneness.length > 0) {
      return cut.doneness[0];
    }
    return null;
  }

  _getTargetTempForDoneness(donenessValue) {
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
    
    // Auto-select recommended doneness for this cut
    const cut = this._getCuts().find(c => c.id === cutId);
    if (cut) {
      // First try explicit recommendedDoneness
      if (cut.recommendedDoneness) {
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
                  ${cut.name}${cut.recommendedDoneness ? ' ⭐' : ''}
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
    `;
  }
}

// Force re-registration by using a versioned element name
// This bypasses browser's cached customElements registry
// MUST match the "name" in __init__.py panel config
const PANEL_VERSION = "18";

// Register with versioned name (what HA frontend will look for)
const VERSIONED_NAME = `kitchen-cooking-panel-v${PANEL_VERSION}`;
if (!customElements.get(VERSIONED_NAME)) {
  customElements.define(VERSIONED_NAME, KitchenCookingPanel);
}
