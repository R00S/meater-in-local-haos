/**
 * Kitchen Cooking Engine Panel
 * 
 * ╔══════════════════════════════════════════════════════════════════════════════╗
 * ║  ⛔ STOP! BEFORE EDITING THIS FILE, READ THIS:                              ║
 * ╠══════════════════════════════════════════════════════════════════════════════╣
 * ║                                                                              ║
 * ║  This file is AUTO-GENERATED. Do not edit it directly!                      ║
 * ║                                                                              ║
 * ║  TO CHANGE UI/BEHAVIOR:                                                      ║
 * ║    1. Edit www/panel-class-template.js (the source of truth for UI code)    ║
 * ║    2. Run: python3 generate_frontend_data.py                                ║
 * ║    3. This regenerates kitchen-cooking-panel.js with your changes           ║
 * ║                                                                              ║
 * ║  TO CHANGE COOKING DATA:                                                     ║
 * ║    1. Edit cooking_data.py, swedish_cooking_data.py, or ninja_combi_data.py ║
 * ║    2. Run: python3 generate_frontend_data.py                                ║
 * ║                                                                              ║
 * ║  PANEL_VERSION is automatically kept in sync between const.py and this file ║
 * ║                                                                              ║
 * ╚══════════════════════════════════════════════════════════════════════════════╝
 * 
 * AUTO-GENERATED: 16 Jan 2026, 22:53 CET
 * Data generated from cooking_data.py, swedish_cooking_data.py, and ninja_combi_data.py
 * UI class from panel-class-template.js
 * 
 * Temperature values are suggestions based on cooking style, not just safety.
 */

import {
  LitElement,
  html,
  css,
} from "https://unpkg.com/lit-element@2.4.0/lit-element.js?module";



// Data source options
const DATA_SOURCE_INTERNATIONAL = "international";
const DATA_SOURCE_SWEDISH = "swedish";

// AUTO-GENERATED DATA - DO NOT EDIT
// Generated from cooking_data.py, swedish_cooking_data.py, and ninja_combi_data.py
// Last generated: 16 Jan 2026, 22:53 CET

// Doneness option definitions (International/USDA)
const DONENESS_OPTIONS = {
  "rare": {
    "value": "rare",
    "name": "Rare",
    "icon": "🔴",
    "description": "Cool red center",
    "temp_c": 49,
    "temp_f": 120
  },
  "medium_rare": {
    "value": "medium_rare",
    "name": "Medium Rare",
    "icon": "🟠",
    "description": "Warm red center",
    "temp_c": 54,
    "temp_f": 130
  },
  "medium": {
    "value": "medium",
    "name": "Medium",
    "icon": "🟡",
    "description": "Warm pink center",
    "temp_c": 60,
    "temp_f": 140
  },
  "medium_well": {
    "value": "medium_well",
    "name": "Medium Well",
    "icon": "🟤",
    "description": "Slightly pink center",
    "temp_c": 66,
    "temp_f": 150
  },
  "well_done": {
    "value": "well_done",
    "name": "Well Done",
    "icon": "⚪",
    "description": "No pink, fully cooked",
    "temp_c": 71,
    "temp_f": 160
  },
  "pulled": {
    "value": "pulled",
    "name": "Pulled",
    "icon": "🍖",
    "description": "Shreddable, collagen broken down",
    "temp_c": 93,
    "temp_f": 200
  },
  "done": {
    "value": "done",
    "name": "Done",
    "icon": "✓",
    "description": "Cooked through",
    "temp_c": 71,
    "temp_f": 160
  },
  "crispy": {
    "value": "crispy",
    "name": "Crispy",
    "icon": "🥓",
    "description": "Crispy and rendered",
    "temp_c": 90,
    "temp_f": 195
  },
  "heated_through": {
    "value": "heated_through",
    "name": "Heated Through",
    "icon": "♨️",
    "description": "Heated through",
    "temp_c": 60,
    "temp_f": 140
  },
  "safe": {
    "value": "safe",
    "name": "Safe",
    "icon": "✅",
    "description": "Cooked through, safe to eat",
    "temp_c": 74,
    "temp_f": 165
  },
  "dark_meat_optimal": {
    "value": "dark_meat_optimal",
    "name": "Dark Meat Optimal",
    "icon": "🍗",
    "description": "Dark meat optimal texture",
    "temp_c": 77,
    "temp_f": 170
  },
  "tender": {
    "value": "tender",
    "name": "Tender",
    "icon": "🥔",
    "description": "Fully tender, fork-pierces easily",
    "temp_c": 95,
    "temp_f": 203
  },
  "caramelized": {
    "value": "caramelized",
    "name": "Caramelized",
    "icon": "🧅",
    "description": "Golden brown, enhanced sweetness",
    "temp_c": 160,
    "temp_f": 320
  },
  "crisp_tender": {
    "value": "crisp_tender",
    "name": "Crisp Tender",
    "icon": "🥦",
    "description": "Slightly firm with some bite",
    "temp_c": 85,
    "temp_f": 185
  },
  "charred": {
    "value": "charred",
    "name": "Charred",
    "icon": "🔥",
    "description": "Charred exterior with smoky flavor",
    "temp_c": 200,
    "temp_f": 390
  }
};

// Swedish doneness option definitions
const SWEDISH_DONENESS_OPTIONS = {
  "blodig": {
    "value": "blodig",
    "name": "Blodig",
    "icon": "🔴",
    "description": "Blodig - Sval röd kärna",
    "temp_c": 50,
    "temp_f": 122
  },
  "medium_rare": {
    "value": "medium_rare",
    "name": "Medium Rare",
    "icon": "🟠",
    "description": "Medium Rare - Rosa kärna",
    "temp_c": 54,
    "temp_f": 129
  },
  "medium": {
    "value": "medium",
    "name": "Medium",
    "icon": "🟡",
    "description": "Medium - Varm rosa kärna",
    "temp_c": 58,
    "temp_f": 136
  },
  "medium_well": {
    "value": "medium_well",
    "name": "Medium Well",
    "icon": "🟤",
    "description": "Medium Well - Nästan genomstekt",
    "temp_c": 64,
    "temp_f": 147
  },
  "genomstekt": {
    "value": "genomstekt",
    "name": "Genomstekt",
    "icon": "⚪",
    "description": "Genomstekt - Ingen rosa färg",
    "temp_c": 70,
    "temp_f": 158
  },
  "långkokt": {
    "value": "långkokt",
    "name": "Långkokt",
    "icon": "🍖",
    "description": "Långkokt - Strimlningsbart",
    "temp_c": 92,
    "temp_f": 198
  }
};

// International meat categories
const MEAT_CATEGORIES = {
  "beef": {
    "id": 1,
    "name": "Beef",
    "icon": "🥩",
    "color": "#8B0000",
    "meats": [
      {
        "id": 10,
        "name": "cow",
        "cutTypes": [
          {
            "id": 100,
            "name": "Steaks",
            "cuts": [
              {
                "id": 100,
                "name": "Ribeye Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 101,
                "name": "Sirloin Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 102,
                "name": "Filet Mignon / Tenderloin Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 103,
                "name": "New York Strip",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 104,
                "name": "T-Bone / Porterhouse",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 105,
                "name": "Flank Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 106,
                "name": "Skirt Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 107,
                "name": "Flat Iron Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 108,
                "name": "Hanger Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 109,
                "name": "Tri-Tip",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 110,
                "name": "Tomahawk Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 111,
                "name": "Picanha",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              }
            ]
          },
          {
            "id": 101,
            "name": "Roasts",
            "cuts": [
              {
                "id": 120,
                "name": "Prime Rib / Standing Rib Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 121,
                "name": "Beef Tenderloin Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 122,
                "name": "Top Round Roast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 123,
                "name": "Sirloin Tip Roast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 124,
                "name": "Roasting Joint",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 125,
                "name": "Round Roast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 126,
                "name": "Rump Roast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 127,
                "name": "Rump",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 128,
                "name": "Chuck",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 129,
                "name": "Sirloin Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              }
            ]
          },
          {
            "id": 102,
            "name": "Braising Cuts",
            "cuts": [
              {
                "id": 130,
                "name": "Chuck Roast / Pot Roast",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 131,
                "name": "Brisket",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 132,
                "name": "Short Ribs",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 133,
                "name": "Beef Shank / Osso Buco",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          },
          {
            "id": 103,
            "name": "Ground",
            "cuts": [
              {
                "id": 140,
                "name": "Beef Burger / Ground Beef Patty",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 142,
                "name": "Meatloaf",
                "doneness": [
                  "done"
                ]
              },
              {
                "id": 141,
                "name": "Burger",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 143,
                "name": "Meatloaf",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 144,
                "name": "Liver",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 146,
                "name": "Tongue",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          },
          {
            "id": 104,
            "name": "Other / Offal",
            "cuts": [
              {
                "id": 145,
                "name": "Beef Liver",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 147,
                "name": "Beef Tongue",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 148,
                "name": "Beef Shin",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 149,
                "name": "Beef Rib",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "pork": {
    "id": 2,
    "name": "Pork",
    "icon": "🐷",
    "color": "#FFB6C1",
    "meats": [
      {
        "id": 20,
        "name": "pig",
        "cutTypes": [
          {
            "id": 200,
            "name": "Chops & Tenderloin",
            "cuts": [
              {
                "id": 200,
                "name": "Pork Chop",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 201,
                "name": "Pork Tenderloin",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 202,
                "name": "Pork Loin Steak",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 203,
                "name": "Pork Shoulder Steak",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 204,
                "name": "Secreto (Ibérico Pork)",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              }
            ]
          },
          {
            "id": 201,
            "name": "Roasts",
            "cuts": [
              {
                "id": 210,
                "name": "Pork Loin Roast",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 211,
                "name": "Pork Shoulder / Boston Butt",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 212,
                "name": "Pork Belly",
                "doneness": [
                  "well_done",
                  "crispy"
                ]
              },
              {
                "id": 214,
                "name": "Pork Leg Roast",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 215,
                "name": "Virginia Ham",
                "doneness": [
                  "heated_through"
                ]
              },
              {
                "id": 213,
                "name": "Ham",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 216,
                "name": "Belly",
                "doneness": [
                  "well_done",
                  "well_done"
                ]
              },
              {
                "id": 217,
                "name": "Baby Back Ribs",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 218,
                "name": "Spare Ribs",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 219,
                "name": "St. Louis Style Ribs",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          },
          {
            "id": 202,
            "name": "Ribs",
            "cuts": [
              {
                "id": 220,
                "name": "Baby Back Ribs",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 221,
                "name": "Spare Ribs",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 222,
                "name": "St. Louis Style Ribs",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          },
          {
            "id": 203,
            "name": "Ham",
            "cuts": [
              {
                "id": 230,
                "name": "Fresh Ham",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 231,
                "name": "Cured Ham (Pre-cooked)",
                "doneness": [
                  "heated_through"
                ]
              }
            ]
          },
          {
            "id": 204,
            "name": "Ground",
            "cuts": [
              {
                "id": 240,
                "name": "Pork Sausage",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 241,
                "name": "Ground Pork",
                "doneness": [
                  "well_done"
                ]
              }
            ]
          },
          {
            "id": 205,
            "name": "Other / Offal",
            "cuts": [
              {
                "id": 245,
                "name": "Pork Jowl / Guanciale",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 246,
                "name": "Pork Cheek",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 247,
                "name": "Pork Liver",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 248,
                "name": "Pork Tongue",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 242,
                "name": "Jowl",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 243,
                "name": "Cheek",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 244,
                "name": "Liver",
                "doneness": [
                  "well_done"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "poultry": {
    "id": 3,
    "name": "Poultry",
    "icon": "🍗",
    "color": "#FFD700",
    "meats": [
      {
        "id": 30,
        "name": "chicken",
        "cutTypes": [
          {
            "id": 300,
            "name": "Whole",
            "cuts": [
              {
                "id": 300,
                "name": "Whole Chicken",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 301,
                "name": "Breast",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 302,
                "name": "Thigh",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 303,
                "name": "Leg",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 304,
                "name": "Ground",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 305,
                "name": "Burger",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 306,
                "name": "Wing",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              }
            ]
          },
          {
            "id": 301,
            "name": "Breast",
            "cuts": [
              {
                "id": 310,
                "name": "Chicken Breast",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 311,
                "name": "Chicken Breast (Bone-in)",
                "doneness": [
                  "safe"
                ]
              }
            ]
          },
          {
            "id": 302,
            "name": "Dark Meat",
            "cuts": [
              {
                "id": 320,
                "name": "Chicken Thigh",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 321,
                "name": "Chicken Leg / Drumstick",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 322,
                "name": "Chicken Wing",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 31,
        "name": "turkey",
        "cutTypes": [
          {
            "id": 310,
            "name": "Turkey",
            "cuts": [
              {
                "id": 330,
                "name": "Whole Turkey",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 331,
                "name": "Turkey Breast",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 332,
                "name": "Turkey Leg",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 333,
                "name": "Turkey Thigh",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 334,
                "name": "Ground",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 335,
                "name": "Burger",
                "doneness": [
                  "safe"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 32,
        "name": "duck",
        "cutTypes": [
          {
            "id": 320,
            "name": "Duck",
            "cuts": [
              {
                "id": 340,
                "name": "Duck Breast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "safe"
                ]
              },
              {
                "id": 341,
                "name": "Whole Duck",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 342,
                "name": "Duck Leg Confit",
                "doneness": [
                  "dark_meat_optimal"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 34,
        "name": "goose",
        "cutTypes": [
          {
            "id": 345,
            "name": "Goose",
            "cuts": [
              {
                "id": 345,
                "name": "Whole Goose",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 346,
                "name": "Goose Breast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "safe"
                ]
              },
              {
                "id": 347,
                "name": "Goose Thigh",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              },
              {
                "id": 348,
                "name": "Goose Leg",
                "doneness": [
                  "safe",
                  "dark_meat_optimal"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 33,
        "name": "ground_poultry",
        "cutTypes": [
          {
            "id": 330,
            "name": "Ground",
            "cuts": [
              {
                "id": 350,
                "name": "Ground Chicken",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 351,
                "name": "Ground Turkey",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 352,
                "name": "Chicken Burger",
                "doneness": [
                  "safe"
                ]
              },
              {
                "id": 353,
                "name": "Turkey Burger",
                "doneness": [
                  "safe"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "fish": {
    "id": 4,
    "name": "Fish",
    "icon": "🐟",
    "color": "#4682B4",
    "meats": [
      {
        "id": 40,
        "name": "salmon",
        "cutTypes": [
          {
            "id": 400,
            "name": "Salmon",
            "cuts": [
              {
                "id": 400,
                "name": "Salmon Fillet",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 401,
                "name": "Salmon Steak",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "well_done"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 41,
        "name": "tuna",
        "cutTypes": [
          {
            "id": 410,
            "name": "Tuna",
            "cuts": [
              {
                "id": 410,
                "name": "Tuna Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 42,
        "name": "white_fish",
        "cutTypes": [
          {
            "id": 420,
            "name": "White Fish",
            "cuts": [
              {
                "id": 420,
                "name": "Cod Fillet",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 421,
                "name": "Halibut Fillet",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 422,
                "name": "Sea Bass",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 423,
                "name": "Swordfish Steak",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 424,
                "name": "Mahi-Mahi",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 425,
                "name": "Haddock Fillet",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 426,
                "name": "Hake Fillet",
                "doneness": [
                  "medium",
                  "well_done"
                ]
              },
              {
                "id": 427,
                "name": "Trout Fillet",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "well_done"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 43,
        "name": "shellfish",
        "cutTypes": [
          {
            "id": 430,
            "name": "Shellfish",
            "cuts": [
              {
                "id": 430,
                "name": "Shrimp",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 431,
                "name": "Lobster Tail",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 432,
                "name": "Scallops",
                "doneness": [
                  "medium_rare",
                  "well_done"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "lamb": {
    "id": 5,
    "name": "Lamb",
    "icon": "🐑",
    "color": "#800020",
    "meats": [
      {
        "id": 50,
        "name": "lamb",
        "cutTypes": [
          {
            "id": 500,
            "name": "Roasts",
            "cuts": [
              {
                "id": 500,
                "name": "Leg of Lamb",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 501,
                "name": "Rack of Lamb",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 502,
                "name": "Lamb Shoulder",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 503,
                "name": "Lamb Loin Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 504,
                "name": "Lamb Brisket",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 505,
                "name": "Lamb Rump",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 506,
                "name": "Lamb Shank",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 507,
                "name": "Lamb Rib",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              }
            ]
          },
          {
            "id": 501,
            "name": "Chops",
            "cuts": [
              {
                "id": 510,
                "name": "Lamb Chops",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 511,
                "name": "Lamb Loin Chops",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 512,
                "name": "Lamb Neck Filet",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 513,
                "name": "Lamb Cutlet",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              }
            ]
          },
          {
            "id": 502,
            "name": "Ground",
            "cuts": [
              {
                "id": 520,
                "name": "Ground Lamb",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 521,
                "name": "Lamb Kofta / Kebab",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 522,
                "name": "Lamb Burger",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 514,
                "name": "Shank",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 515,
                "name": "Rib Rack",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 516,
                "name": "Shoulder",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 517,
                "name": "Crown Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 523,
                "name": "Kofta / Kebab",
                "doneness": [
                  "well_done"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "game": {
    "id": 6,
    "name": "Game",
    "icon": "🦌",
    "color": "#2F4F4F",
    "meats": [
      {
        "id": 60,
        "name": "venison",
        "cutTypes": [
          {
            "id": 600,
            "name": "Venison",
            "cuts": [
              {
                "id": 600,
                "name": "Venison Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 601,
                "name": "Venison Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 602,
                "name": "Venison Loin",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 603,
                "name": "Leg",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 604,
                "name": "Shoulder",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 61,
        "name": "wild_boar",
        "cutTypes": [
          {
            "id": 610,
            "name": "Wild Boar",
            "cuts": [
              {
                "id": 610,
                "name": "Wild Boar Chop",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 611,
                "name": "Wild Boar Shoulder",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 62,
        "name": "bison",
        "cutTypes": [
          {
            "id": 620,
            "name": "Bison",
            "cuts": [
              {
                "id": 620,
                "name": "Bison Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 621,
                "name": "Bison Burger",
                "doneness": [
                  "well_done"
                ]
              },
              {
                "id": 622,
                "name": "Bison Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 63,
        "name": "reindeer",
        "cutTypes": [
          {
            "id": 630,
            "name": "Reindeer",
            "cuts": [
              {
                "id": 630,
                "name": "Reindeer Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 631,
                "name": "Reindeer Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 612,
                "name": "Loin",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 64,
        "name": "moose",
        "cutTypes": [
          {
            "id": 640,
            "name": "Moose",
            "cuts": [
              {
                "id": 640,
                "name": "Moose Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 641,
                "name": "Moose Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 65,
        "name": "buffalo",
        "cutTypes": [
          {
            "id": 650,
            "name": "Buffalo",
            "cuts": [
              {
                "id": 650,
                "name": "Buffalo Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 651,
                "name": "Buffalo Roast",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 632,
                "name": "Burger",
                "doneness": [
                  "well_done"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 66,
        "name": "ostrich",
        "cutTypes": [
          {
            "id": 660,
            "name": "Ostrich",
            "cuts": [
              {
                "id": 660,
                "name": "Ostrich Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 661,
                "name": "Ostrich Fillet",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 67,
        "name": "mutton",
        "cutTypes": [
          {
            "id": 670,
            "name": "Mutton",
            "cuts": [
              {
                "id": 670,
                "name": "Mutton Chop",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 671,
                "name": "Mutton Leg Roast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 672,
                "name": "Mutton Shoulder",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 652,
                "name": "Shoulder",
                "doneness": [
                  "pulled"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 68,
        "name": "kangaroo",
        "cutTypes": [
          {
            "id": 680,
            "name": "Kangaroo",
            "cuts": [
              {
                "id": 680,
                "name": "Kangaroo Steak",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              },
              {
                "id": 681,
                "name": "Kangaroo Fillet",
                "doneness": [
                  "rare",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 69,
        "name": "goat",
        "cutTypes": [
          {
            "id": 690,
            "name": "Goat",
            "cuts": [
              {
                "id": 690,
                "name": "Goat Chop",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 691,
                "name": "Goat Leg Roast",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "well_done"
                ]
              },
              {
                "id": 692,
                "name": "Goat Shoulder",
                "doneness": [
                  "pulled"
                ]
              },
              {
                "id": 682,
                "name": "Leg Roast",
                "doneness": [
                  "well_done"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "vegetables": {
    "id": 7,
    "name": "Vegetables",
    "icon": "🍖",
    "color": "#228B22",
    "meats": [
      {
        "id": 70,
        "name": "root_vegetables",
        "cutTypes": [
          {
            "id": 700,
            "name": "Root Vegetables",
            "cuts": [
              {
                "id": 700,
                "name": "Baked Potato",
                "doneness": [
                  "tender"
                ]
              },
              {
                "id": 701,
                "name": "Roasted Potatoes",
                "doneness": [
                  "caramelized"
                ]
              },
              {
                "id": 702,
                "name": "Roasted Carrots",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 703,
                "name": "Roasted Parsnips",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 704,
                "name": "Roasted Beets",
                "doneness": [
                  "tender"
                ]
              },
              {
                "id": 705,
                "name": "Roasted Sweet Potato",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 71,
        "name": "green_vegetables",
        "cutTypes": [
          {
            "id": 710,
            "name": "Green Vegetables",
            "cuts": [
              {
                "id": 710,
                "name": "Broccoli",
                "doneness": [
                  "crisp_tender",
                  "tender"
                ]
              },
              {
                "id": 711,
                "name": "Brussels Sprouts",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 712,
                "name": "Asparagus",
                "doneness": [
                  "crisp_tender",
                  "tender"
                ]
              },
              {
                "id": 713,
                "name": "Green Beans",
                "doneness": [
                  "crisp_tender",
                  "tender"
                ]
              },
              {
                "id": 714,
                "name": "Spinach",
                "doneness": [
                  "tender"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 72,
        "name": "alliums",
        "cutTypes": [
          {
            "id": 720,
            "name": "Alliums",
            "cuts": [
              {
                "id": 720,
                "name": "Roasted Onion",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 721,
                "name": "Caramelized Onions",
                "doneness": [
                  "caramelized"
                ]
              },
              {
                "id": 722,
                "name": "Roasted Garlic",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 723,
                "name": "Leeks",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 73,
        "name": "squash",
        "cutTypes": [
          {
            "id": 730,
            "name": "Squash",
            "cuts": [
              {
                "id": 730,
                "name": "Zucchini",
                "doneness": [
                  "crisp_tender",
                  "tender"
                ]
              },
              {
                "id": 731,
                "name": "Butternut Squash",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 732,
                "name": "Acorn Squash",
                "doneness": [
                  "tender"
                ]
              },
              {
                "id": 733,
                "name": "Spaghetti Squash",
                "doneness": [
                  "tender"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 74,
        "name": "cruciferous",
        "cutTypes": [
          {
            "id": 740,
            "name": "Cruciferous",
            "cuts": [
              {
                "id": 740,
                "name": "Cauliflower",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              },
              {
                "id": 741,
                "name": "Cabbage",
                "doneness": [
                  "crisp_tender",
                  "tender"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 75,
        "name": "peppers",
        "cutTypes": [
          {
            "id": 750,
            "name": "Peppers",
            "cuts": [
              {
                "id": 750,
                "name": "Bell Peppers",
                "doneness": [
                  "crisp_tender",
                  "charred"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 76,
        "name": "mushrooms",
        "cutTypes": [
          {
            "id": 760,
            "name": "Mushrooms",
            "cuts": [
              {
                "id": 760,
                "name": "Button/Cremini Mushrooms",
                "doneness": [
                  "caramelized"
                ]
              },
              {
                "id": 761,
                "name": "Portobello Mushrooms",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 77,
        "name": "corn",
        "cutTypes": [
          {
            "id": 770,
            "name": "Corn",
            "cuts": [
              {
                "id": 770,
                "name": "Corn on the Cob",
                "doneness": [
                  "tender",
                  "charred"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 78,
        "name": "eggplant",
        "cutTypes": [
          {
            "id": 780,
            "name": "Eggplant",
            "cuts": [
              {
                "id": 780,
                "name": "Eggplant / Aubergine",
                "doneness": [
                  "tender",
                  "charred"
                ]
              }
            ]
          }
        ]
      },
      {
        "id": 79,
        "name": "tomatoes",
        "cutTypes": [
          {
            "id": 790,
            "name": "Tomatoes",
            "cuts": [
              {
                "id": 790,
                "name": "Roasted Tomatoes",
                "doneness": [
                  "tender",
                  "caramelized"
                ]
              }
            ]
          }
        ]
      }
    ]
  }
};

// Swedish meat categories
const SWEDISH_MEAT_CATEGORIES = {
  "nötkött": {
    "id": 2001,
    "name": "Nötkött",
    "icon": "🥩",
    "color": "#8B0000",
    "meats": [
      {
        "id": 2010,
        "name": "nötkreatur",
        "cutTypes": [
          {
            "id": 2100,
            "name": "Skiva",
            "cuts": [
              {
                "id": 2100,
                "name": "Entrecôte",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2101,
                "name": "Ryggbiff",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2102,
                "name": "Oxfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2103,
                "name": "Flankstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 2104,
                "name": "Flat Iron",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2105,
                "name": "Flapsteak (Bavette)",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 2106,
                "name": "Tomahawk",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2107,
                "name": "Picanha",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2108,
                "name": "Njurtapp",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well"
                ]
              },
              {
                "id": 2109,
                "name": "Hanger Steak (Onglet)",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium"
                ]
              }
            ]
          },
          {
            "id": 2101,
            "name": "Helstekt",
            "cuts": [
              {
                "id": 2120,
                "name": "Rostbiff",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2121,
                "name": "Innanlår",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2122,
                "name": "Ytterlår",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2123,
                "name": "Fransyska",
                "doneness": [
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              },
              {
                "id": 2124,
                "name": "Nötrulle",
                "doneness": [
                  "medium",
                  "medium_well",
                  "genomstekt"
                ]
              }
            ]
          },
          {
            "id": 2102,
            "name": "Grytbitar/Långkok",
            "cuts": [
              {
                "id": 2130,
                "name": "Högrev",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2131,
                "name": "Bringa (Brisket)",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2132,
                "name": "Bog",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2133,
                "name": "Oxsvans",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2134,
                "name": "Lägg",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2135,
                "name": "Oxkind",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2136,
                "name": "Märgpipa",
                "doneness": [
                  "långkokt"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "fläsk": {
    "id": 2002,
    "name": "Fläsk",
    "icon": "🐷",
    "color": "#FFB6C1",
    "meats": [
      {
        "id": 2020,
        "name": "gris",
        "cutTypes": [
          {
            "id": 2200,
            "name": "Skiva/Kotlett",
            "cuts": [
              {
                "id": 2200,
                "name": "Fläskkotlett med ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2204,
                "name": "Fläskkotlett utan ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2205,
                "name": "Fläskfiléskiva",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2202,
                "name": "Karrékoteletter",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2203,
                "name": "Secreto (Ibérico)",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          },
          {
            "id": 2201,
            "name": "Helstekt",
            "cuts": [
              {
                "id": 2201,
                "name": "Fläskfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2215,
                "name": "Fläskytterfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2216,
                "name": "Fläskkotlett med ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2217,
                "name": "Fläskkotlett utan ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2210,
                "name": "Fläsksida",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2211,
                "name": "Fläskkarré",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2212,
                "name": "Skinka",
                "doneness": [
                  "medium",
                  "genomstekt"
                ]
              },
              {
                "id": 2213,
                "name": "Julskinka (kokt)",
                "doneness": [
                  "genomstekt"
                ]
              },
              {
                "id": 2214,
                "name": "Fläskbog",
                "doneness": [
                  "långkokt"
                ]
              }
            ]
          },
          {
            "id": 2202,
            "name": "Revben",
            "cuts": [
              {
                "id": 2220,
                "name": "Revbensspjäll",
                "doneness": [
                  "långkokt"
                ]
              },
              {
                "id": 2221,
                "name": "Sidfläsk med revben",
                "doneness": [
                  "långkokt"
                ]
              }
            ]
          }
        ]
      }
    ]
  },
  "fågel": {
    "id": 2003,
    "name": "Fågel",
    "icon": "🍗",
    "color": "#FFD700",
    "meats": [
      {
        "id": 2030,
        "name": "kyckling",
        "cutTypes": [
          {
            "id": 2300,
            "name": "Kyckling",
            "cuts": [
              {
                "id": 2300,
                "name": "Hel kyckling",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2301,
                "name": "Kycklingbröst",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2302,
                "name": "Kycklingleår",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2303,
                "name": "Kycklingvingar",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              }
            ]
          }
        ]
      },
      {
        "id": 2031,
        "name": "kalkon",
        "cutTypes": [
          {
            "id": 2310,
            "name": "Kalkon",
            "cuts": [
              {
                "id": 2310,
                "name": "Hel kalkon",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2311,
                "name": "Kalkonbröst",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              }
            ]
          }
        ]
      },
      {
        "id": 2032,
        "name": "anka",
        "cutTypes": [
          {
            "id": 2320,
            "name": "Anka",
            "cuts": [
              {
                "id": 2320,
                "name": "Ankbröst",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              },
              {
                "id": 2321,
                "name": "Hel anka",
                "doneness": [
                  "medium",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              }
            ]
          }
        ]
      }
    ]
  },
  "fisk": {
    "id": 2004,
    "name": "Fisk",
    "icon": "🐟",
    "color": "#4682B4",
    "meats": [
      {
        "id": 2040,
        "name": "lax",
        "cutTypes": [
          {
            "id": 2400,
            "name": "Lax",
            "cuts": [
              {
                "id": 2400,
                "name": "Laxfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2401,
                "name": "Gravad lax (uppvärmd)",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2402,
                "name": "Hel lax på ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          }
        ]
      },
      {
        "id": 2041,
        "name": "torsk",
        "cutTypes": [
          {
            "id": 2410,
            "name": "Torsk",
            "cuts": [
              {
                "id": 2410,
                "name": "Torskfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2411,
                "name": "Torskrygg",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2412,
                "name": "Hel torsk på ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          }
        ]
      },
      {
        "id": 2042,
        "name": "tonfisk",
        "cutTypes": [
          {
            "id": 2430,
            "name": "Tonfisk",
            "cuts": [
              {
                "id": 2430,
                "name": "Tonfiskskiva",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "blodig"
              }
            ]
          }
        ]
      },
      {
        "id": 2043,
        "name": "övrig_fisk",
        "cutTypes": [
          {
            "id": 2420,
            "name": "Övrig fisk",
            "cuts": [
              {
                "id": 2420,
                "name": "Sikfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2425,
                "name": "Hel sik på ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2421,
                "name": "Rödingfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2426,
                "name": "Hel röding på ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2422,
                "name": "Abborrfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2427,
                "name": "Hel abborre på ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2423,
                "name": "Gösfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2428,
                "name": "Hel gös på ben",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2424,
                "name": "Hälleflundra",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "genomstekt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          }
        ]
      }
    ]
  },
  "kalv": {
    "id": 2007,
    "name": "Kalv",
    "icon": "🐄",
    "color": "#DEB887",
    "meats": [
      {
        "id": 2070,
        "name": "kalv",
        "cutTypes": [
          {
            "id": 2700,
            "name": "Helstekt",
            "cuts": [
              {
                "id": 2700,
                "name": "Kalvstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2701,
                "name": "Kalvfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              },
              {
                "id": 2702,
                "name": "Kalvfransyska",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2703,
                "name": "Kalvrostbiff",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          },
          {
            "id": 2710,
            "name": "Skiva/Kotlett",
            "cuts": [
              {
                "id": 2710,
                "name": "Kalvkotlett",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2711,
                "name": "Kalvschnitzel",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2712,
                "name": "Kalvlever",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          },
          {
            "id": 2720,
            "name": "Långkok",
            "cuts": [
              {
                "id": 2720,
                "name": "Kalvbog",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "långkokt"
              },
              {
                "id": 2721,
                "name": "Kalvlägg",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "långkokt"
              },
              {
                "id": 2722,
                "name": "Kalvbringa",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "långkokt"
              }
            ]
          }
        ]
      }
    ]
  },
  "lamm": {
    "id": 2005,
    "name": "Lamm",
    "icon": "🐑",
    "color": "#800020",
    "meats": [
      {
        "id": 2050,
        "name": "lamm",
        "cutTypes": [
          {
            "id": 2500,
            "name": "Helstekt",
            "cuts": [
              {
                "id": 2500,
                "name": "Lammstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              },
              {
                "id": 2501,
                "name": "Lammrack",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              },
              {
                "id": 2502,
                "name": "Lammbog",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "långkokt"
              },
              {
                "id": 2503,
                "name": "Lammsadel",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              }
            ]
          },
          {
            "id": 2510,
            "name": "Skiva/Kotlett",
            "cuts": [
              {
                "id": 2510,
                "name": "Lammkotletter",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              },
              {
                "id": 2511,
                "name": "Lammhalsfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium_rare"
              }
            ]
          }
        ]
      }
    ]
  },
  "vilt": {
    "id": 2006,
    "name": "Vilt",
    "icon": "🦌",
    "color": "#2F4F4F",
    "meats": [
      {
        "id": 2060,
        "name": "hjort_rådjur",
        "cutTypes": [
          {
            "id": 2600,
            "name": "Hjort/Rådjur",
            "cuts": [
              {
                "id": 2600,
                "name": "Hjortfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2601,
                "name": "Hjortstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2602,
                "name": "Rådjursfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2603,
                "name": "Rådjursstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          }
        ]
      },
      {
        "id": 2061,
        "name": "älg",
        "cutTypes": [
          {
            "id": 2610,
            "name": "Älg",
            "cuts": [
              {
                "id": 2610,
                "name": "Älgfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2611,
                "name": "Älgstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2612,
                "name": "Älgfärsbiff",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              }
            ]
          }
        ]
      },
      {
        "id": 2062,
        "name": "ren",
        "cutTypes": [
          {
            "id": 2620,
            "name": "Ren",
            "cuts": [
              {
                "id": 2620,
                "name": "Renfilé",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              },
              {
                "id": 2621,
                "name": "Renstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "medium"
              }
            ]
          }
        ]
      },
      {
        "id": 2063,
        "name": "vildsvin",
        "cutTypes": [
          {
            "id": 2630,
            "name": "Vildsvin",
            "cuts": [
              {
                "id": 2630,
                "name": "Vildsvinsfil",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "genomstekt"
              },
              {
                "id": 2631,
                "name": "Vildsvinsstek",
                "doneness": [
                  "blodig",
                  "medium_rare",
                  "medium",
                  "medium_well",
                  "genomstekt",
                  "långkokt"
                ],
                "recommended_doneness": "långkokt"
              }
            ]
          }
        ]
      }
    ]
  }
};

// Ninja Combi recipes
const NINJA_COMBI_RECIPES = [
  {
    "id": 1001,
    "name": "Combi-Crisp Chicken Thighs",
    "description": "Juicy chicken with perfectly crispy skin using steam then air fry",
    "mode": "combi_crisp",
    "tray_position": 1,
    "phases": [
      {
        "mode": "steam",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 12,
        "description": "Steam to cook through and keep moist",
        "steam_enabled": true
      },
      {
        "mode": "air_fry",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 10,
        "description": "Air fry to crisp the skin",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "4 chicken thighs with skin",
      "1 tbsp olive oil",
      "1 tsp garlic powder",
      "1 tsp paprika",
      "Salt and pepper to taste"
    ],
    "instructions": [
      "Pat chicken thighs dry with paper towel",
      "Season both sides with spices, salt, and pepper",
      "Brush skin lightly with olive oil",
      "Place skin-side up on crisper tray",
      "Fill water tank",
      "Run Combi-Crisp program",
      "Check internal temperature reaches 74°C (165°F)",
      "Let rest 5 minutes before serving"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 22,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Pat chicken completely dry for crispiest skin",
      "Don't overcrowd the tray - leave space between pieces",
      "For extra crispy skin, increase air fry phase by 2-3 minutes"
    ],
    "notes": "This is the signature Ninja Combi recipe that shows off the appliance's unique capability.",
    "target_temp_c": 74,
    "target_temp_f": 165
  },
  {
    "id": 1002,
    "name": "Combi-Crisp Root Vegetables",
    "description": "Tender inside, caramelized outside root vegetables",
    "mode": "combi_crisp",
    "tray_position": 1,
    "phases": [
      {
        "mode": "steam",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 10,
        "description": "Steam to tenderize",
        "steam_enabled": true
      },
      {
        "mode": "air_fry",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 12,
        "description": "Air fry to caramelize",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "500g mixed root vegetables (carrots, parsnips, potatoes)",
      "2 tbsp olive oil",
      "2 cloves garlic, minced",
      "1 tsp dried thyme",
      "Salt and pepper"
    ],
    "instructions": [
      "Cut vegetables into 2-3 cm chunks (similar sizes)",
      "Toss with olive oil, garlic, thyme, salt, and pepper",
      "Spread in single layer on crisper tray",
      "Fill water tank",
      "Run Combi-Crisp program",
      "Shake tray halfway through air fry phase"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 22,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Cut vegetables to uniform size for even cooking",
      "Don't skip the shake halfway through air fry phase",
      "Add fresh herbs after cooking for bright flavor"
    ],
    "notes": ""
  },
  {
    "id": 1003,
    "name": "Combi-Bake Artisan Bread",
    "description": "Professional crusty bread with steam injection",
    "mode": "combi_bake",
    "tray_position": 2,
    "phases": [
      {
        "mode": "convection",
        "temperature_c": 220,
        "temperature_f": 428,
        "duration_minutes": 15,
        "description": "Steam + bake for oven spring and crust development",
        "steam_enabled": true
      },
      {
        "mode": "convection",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 20,
        "description": "Bake to finish and brown",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "500g bread flour",
      "350ml warm water",
      "10g salt",
      "7g instant yeast",
      "Olive oil for greasing"
    ],
    "instructions": [
      "Mix flour, salt, and yeast",
      "Add water and knead 10 minutes until smooth",
      "Let rise in Prove mode (35°C) for 1 hour until doubled",
      "Shape into loaf and score top",
      "Preheat oven with steam",
      "Place loaf on middle rack",
      "Run Combi-Bake program",
      "Bread should sound hollow when tapped",
      "Cool on wire rack before slicing"
    ],
    "prep_time_minutes": 90,
    "cook_time_minutes": 35,
    "servings": 8,
    "difficulty": "medium",
    "tips": [
      "Don't skip the steam phase - it creates the crispy crust",
      "Score the top just before baking for proper expansion",
      "Bread is done when internal temp reaches 95°C"
    ],
    "notes": "The steam phase mimics professional bread ovens, creating artisan-quality results at home."
  },
  {
    "id": 1004,
    "name": "Combi-Roast Whole Chicken",
    "description": "Moist, evenly cooked chicken with golden skin",
    "mode": "combi_roast",
    "tray_position": 2,
    "phases": [
      {
        "mode": "convection",
        "temperature_c": 160,
        "temperature_f": 320,
        "duration_minutes": 50,
        "description": "Steam + roast for moist, even cooking",
        "steam_enabled": true
      },
      {
        "mode": "convection",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 10,
        "description": "High heat to crisp skin",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "1 whole chicken (1.5-2 kg)",
      "2 tbsp butter, softened",
      "2 cloves garlic, minced",
      "1 lemon, quartered",
      "Fresh herbs (thyme, rosemary)",
      "Salt and pepper"
    ],
    "instructions": [
      "Pat chicken dry inside and out",
      "Mix butter with garlic, salt, and pepper",
      "Rub butter mixture under and over skin",
      "Stuff cavity with lemon and herbs",
      "Truss legs with kitchen string",
      "Place on middle rack with drip tray below",
      "Fill water tank",
      "Run Combi-Roast program",
      "Check thickest part of thigh reaches 74°C (165°F)",
      "Rest 15 minutes before carving"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 60,
    "servings": 4,
    "difficulty": "medium",
    "tips": [
      "Use a meat thermometer to ensure doneness",
      "Don't skip the resting time - juices redistribute",
      "Save drippings from drip tray for gravy"
    ],
    "notes": "The steam phase keeps the breast meat moist while ensuring the dark meat cooks through.",
    "target_temp_c": 74,
    "target_temp_f": 165
  },
  {
    "id": 1005,
    "name": "Combi-Roast Pork Loin",
    "description": "Tender pork loin that stays juicy",
    "mode": "combi_roast",
    "tray_position": 2,
    "phases": [
      {
        "mode": "convection",
        "temperature_c": 160,
        "temperature_f": 320,
        "duration_minutes": 40,
        "description": "Steam + roast to keep moist",
        "steam_enabled": true
      },
      {
        "mode": "convection",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 10,
        "description": "Brown the exterior",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "1 kg pork loin roast",
      "3 cloves garlic, sliced",
      "2 tbsp olive oil",
      "1 tbsp fresh rosemary, chopped",
      "1 tsp fennel seeds",
      "Salt and pepper"
    ],
    "instructions": [
      "Make small cuts in pork and insert garlic slices",
      "Rub with olive oil, rosemary, fennel, salt, and pepper",
      "Let sit 30 minutes at room temperature",
      "Place on middle rack with drip tray below",
      "Fill water tank",
      "Run Combi-Roast program",
      "Check internal temperature reaches 63°C (145°F)",
      "Rest 10 minutes before slicing"
    ],
    "prep_time_minutes": 40,
    "cook_time_minutes": 50,
    "servings": 6,
    "difficulty": "easy",
    "tips": [
      "Don't overcook - pork is safe at 63°C and stays juicy",
      "Slice against the grain for tender pieces",
      "Leftovers make great sandwiches"
    ],
    "notes": "",
    "target_temp_c": 63,
    "target_temp_f": 145
  },
  {
    "id": 1006,
    "name": "Combi-Meal: Salmon with Vegetables and Rice",
    "description": "Complete meal cooked simultaneously on multiple trays",
    "mode": "combi_meal",
    "tray_position": 2,
    "phases": [
      {
        "mode": "steam",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 20,
        "description": "Steam rice and start cooking salmon",
        "steam_enabled": true
      },
      {
        "mode": "air_fry",
        "temperature_c": 180,
        "temperature_f": 356,
        "duration_minutes": 8,
        "description": "Finish salmon and crisp vegetables",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "4 salmon fillets (150g each)",
      "1 cup jasmine rice",
      "1.5 cups water",
      "300g broccoli florets",
      "200g cherry tomatoes",
      "2 tbsp olive oil",
      "Lemon wedges",
      "Salt, pepper, dill"
    ],
    "instructions": [
      "Lower rack: Place rice and water in covered oven-safe pot",
      "Middle rack: Season salmon with salt, pepper, and dill",
      "Upper rack: Toss vegetables with olive oil, salt, and pepper",
      "Fill water tank",
      "Run Combi-Meal program",
      "Check salmon internal temp reaches 54°C (130°F) for medium",
      "Serve with lemon wedges"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 28,
    "servings": 4,
    "difficulty": "medium",
    "tips": [
      "Use a covered pot for rice to trap steam",
      "Don't overcrowd vegetable tray",
      "Salmon can be cooked to 60°C (140°F) if preferred well-done"
    ],
    "notes": "This showcases the Ninja Combi's ability to cook a complete meal at once, saving time and dishes.",
    "target_temp_c": 54,
    "target_temp_f": 130
  },
  {
    "id": 1007,
    "name": "Air Fryer Chicken Wings",
    "description": "Crispy wings without deep frying",
    "mode": "air_fry",
    "tray_position": 1,
    "phases": [
      {
        "mode": "air_fry",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 25,
        "description": "Air fry until crispy",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "1 kg chicken wings",
      "1 tbsp baking powder (for crispy skin)",
      "1 tsp garlic powder",
      "1 tsp paprika",
      "Salt and pepper",
      "Your favorite wing sauce"
    ],
    "instructions": [
      "Pat wings completely dry",
      "Toss with baking powder and spices",
      "Arrange in single layer on crisper tray",
      "Air fry 200°C for 25 minutes",
      "Flip wings halfway through",
      "Toss with sauce after cooking"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 25,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Baking powder helps create extra crispy skin",
      "Don't overcrowd - cook in batches if needed",
      "For extra crispy, add 3-5 minutes to cooking time"
    ],
    "notes": "",
    "target_temp_c": 74,
    "target_temp_f": 165
  },
  {
    "id": 1008,
    "name": "Steam Broccoli and Carrots",
    "description": "Perfectly steamed vegetables that retain nutrients",
    "mode": "steam",
    "tray_position": 2,
    "phases": [
      {
        "mode": "steam",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 12,
        "description": "Steam until tender-crisp",
        "steam_enabled": true
      }
    ],
    "use_probe": false,
    "ingredients": [
      "300g broccoli florets",
      "200g carrots, sliced",
      "1 tbsp butter",
      "Salt and pepper",
      "Lemon juice"
    ],
    "instructions": [
      "Cut broccoli and carrots to similar sizes",
      "Place on steamer tray",
      "Fill water tank",
      "Steam for 12 minutes",
      "Toss with butter, salt, pepper, and lemon juice"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 12,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Don't overcook - vegetables should still have bite",
      "Add fresh herbs after steaming",
      "Can add garlic or ginger to water tank for flavor"
    ],
    "notes": ""
  },
  {
    "id": 1009,
    "name": "Oven-Seared Ribeye Steak",
    "description": "Perfect sear in the oven without stovetop",
    "mode": "sear",
    "tray_position": 1,
    "phases": [
      {
        "mode": "sear",
        "temperature_c": 260,
        "temperature_f": 500,
        "duration_minutes": 8,
        "description": "Sear to develop crust",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "2 ribeye steaks (2.5 cm thick)",
      "2 tbsp vegetable oil (high smoke point)",
      "Coarse salt and black pepper",
      "2 cloves garlic, crushed",
      "Fresh rosemary sprigs",
      "2 tbsp butter"
    ],
    "instructions": [
      "Pat steaks completely dry",
      "Season generously with salt and pepper",
      "Let sit at room temperature for 30 minutes",
      "Preheat oven in Sear mode to 260°C for 5 minutes",
      "Add oil to oven-safe cast iron pan",
      "Place pan on crisper tray in lower position",
      "Sear steaks 3-4 minutes first side",
      "Flip, add butter, garlic, and rosemary",
      "Sear 3-4 minutes second side",
      "Check internal temp reaches 54°C for medium-rare",
      "Rest 5 minutes before serving"
    ],
    "prep_time_minutes": 35,
    "cook_time_minutes": 8,
    "servings": 2,
    "difficulty": "medium",
    "tips": [
      "Cast iron pan works best for even heat",
      "Don't move steaks while searing - let crust develop",
      "Add 1-2 minutes per side for medium (60°C)",
      "Baste with butter in last minute for extra flavor"
    ],
    "notes": "This technique mimics restaurant-style searing but in your oven. Higher heat than stovetop.",
    "target_temp_c": 54,
    "target_temp_f": 130
  },
  {
    "id": 1010,
    "name": "Grilled Vegetable Platter",
    "description": "Charred vegetables with smoky flavor",
    "mode": "grill",
    "tray_position": 3,
    "phases": [
      {
        "mode": "grill",
        "temperature_c": 240,
        "temperature_f": 464,
        "duration_minutes": 15,
        "description": "Grill until charred",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1 zucchini, sliced lengthwise",
      "1 red bell pepper, quartered",
      "1 yellow bell pepper, quartered",
      "1 red onion, cut in thick rounds",
      "200g cherry tomatoes on the vine",
      "3 tbsp olive oil",
      "2 cloves garlic, minced",
      "1 tbsp balsamic vinegar",
      "Salt, pepper, and Italian herbs"
    ],
    "instructions": [
      "Preheat grill mode to 240°C",
      "Mix oil, garlic, vinegar, herbs, salt, and pepper",
      "Brush vegetables with oil mixture",
      "Arrange on grill tray in upper position",
      "Grill 8 minutes",
      "Flip vegetables",
      "Grill 7 more minutes until charred",
      "Serve warm or at room temperature"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 15,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Cut vegetables similar thickness for even cooking",
      "Watch carefully to prevent burning",
      "Char adds flavor but don't overdo it",
      "Great for meal prep - keeps well in fridge"
    ],
    "notes": ""
  },
  {
    "id": 1011,
    "name": "Grilled Lamb Chops",
    "description": "Juicy lamb chops with grill marks",
    "mode": "grill",
    "tray_position": 3,
    "phases": [
      {
        "mode": "grill",
        "temperature_c": 250,
        "temperature_f": 482,
        "duration_minutes": 12,
        "description": "Grill to desired doneness",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "8 lamb chops (2 cm thick)",
      "3 tbsp olive oil",
      "4 cloves garlic, minced",
      "2 tbsp fresh rosemary, chopped",
      "1 tbsp fresh thyme, chopped",
      "Zest of 1 lemon",
      "Salt and pepper"
    ],
    "instructions": [
      "Combine oil, garlic, herbs, lemon zest, salt, and pepper",
      "Marinate lamb chops 2-4 hours (or overnight)",
      "Let come to room temperature 30 minutes before cooking",
      "Preheat grill mode to 250°C",
      "Pat chops dry (leave marinade herbs)",
      "Place on grill tray in upper position",
      "Grill 6 minutes first side",
      "Flip and grill 6 minutes second side",
      "Check internal temp 54°C for medium-rare",
      "Rest 5 minutes before serving"
    ],
    "prep_time_minutes": 150,
    "cook_time_minutes": 12,
    "servings": 4,
    "difficulty": "medium",
    "tips": [
      "Don't skip the marinating time",
      "Lamb is best medium-rare to medium",
      "Use meat thermometer for perfect doneness",
      "Serve with mint sauce or yogurt sauce"
    ],
    "notes": "",
    "target_temp_c": 54,
    "target_temp_f": 130
  },
  {
    "id": 1012,
    "name": "Perfect Japanese Rice",
    "description": "Fluffy rice cooked in sealed pot",
    "mode": "rice_pasta",
    "tray_position": 2,
    "phases": [
      {
        "mode": "rice_pasta",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 25,
        "description": "Cook rice in sealed pot",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "2 cups Japanese short-grain rice",
      "2.5 cups water",
      "1 tsp rice vinegar (optional)",
      "Pinch of salt"
    ],
    "instructions": [
      "Rinse rice 3-4 times until water runs clear",
      "Place rice and water in oven-safe pot with tight-fitting lid",
      "Add vinegar and salt if using",
      "Place covered pot on middle rack",
      "Cook at 100°C for 25 minutes",
      "Let rest covered for 10 minutes (don't open lid!)",
      "Fluff with rice paddle before serving"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 35,
    "servings": 6,
    "difficulty": "easy",
    "tips": [
      "Rinsing removes excess starch for fluffy rice",
      "Don't open lid during cooking - steam escapes",
      "Ratio is 1:1.25 rice to water (different from stovetop)",
      "Works for any short or medium grain rice"
    ],
    "notes": "The sealed pot method in the oven gives perfectly cooked rice every time."
  },
  {
    "id": 1013,
    "name": "One-Pot Pasta Primavera",
    "description": "Pasta cooked with vegetables in one pot",
    "mode": "rice_pasta",
    "tray_position": 2,
    "phases": [
      {
        "mode": "rice_pasta",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 20,
        "description": "Cook pasta and vegetables together",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "300g penne pasta",
      "4 cups vegetable broth",
      "200g cherry tomatoes, halved",
      "1 zucchini, diced",
      "1 red bell pepper, diced",
      "3 cloves garlic, minced",
      "100g frozen peas",
      "2 tbsp olive oil",
      "50g Parmesan cheese, grated",
      "Fresh basil",
      "Salt and pepper"
    ],
    "instructions": [
      "Combine pasta, broth, tomatoes, zucchini, pepper, and garlic in large oven-safe pot",
      "Drizzle with olive oil, season with salt and pepper",
      "Cover tightly with lid or foil",
      "Place on middle rack",
      "Cook at 100°C for 20 minutes",
      "Remove from oven, stir in peas",
      "Let sit covered 2 minutes",
      "Stir in Parmesan and basil",
      "Adjust seasoning and serve"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 22,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Use oven-safe pot with tight lid",
      "Don't peek during cooking",
      "Pasta will absorb liquid and create creamy sauce",
      "Add more broth if needed for saucier result"
    ],
    "notes": ""
  },
  {
    "id": 1014,
    "name": "Slow-Cooked Beef Stew",
    "description": "Tender beef stew with vegetables",
    "mode": "slow_cook",
    "tray_position": 1,
    "phases": [
      {
        "mode": "slow_cook",
        "temperature_c": 90,
        "temperature_f": 194,
        "duration_minutes": 300,
        "description": "Slow cook until tender",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "1 kg beef chuck, cut in 4cm cubes",
      "4 carrots, cut in chunks",
      "3 potatoes, cut in chunks",
      "2 onions, quartered",
      "3 celery stalks, chopped",
      "4 cloves garlic, minced",
      "2 cups beef broth",
      "1 cup red wine",
      "3 tbsp tomato paste",
      "2 bay leaves",
      "Fresh thyme",
      "2 tbsp flour",
      "Salt and pepper"
    ],
    "instructions": [
      "Season beef with salt, pepper, and flour",
      "Brown beef in pan on stovetop (optional but recommended)",
      "Place beef in large Dutch oven or covered pot",
      "Add vegetables, garlic, tomato paste, broth, wine, bay leaves, and thyme",
      "Cover tightly with lid",
      "Place on lower rack",
      "Slow cook at 90°C for 5 hours",
      "Check beef is fork-tender",
      "Remove bay leaves and adjust seasoning",
      "Let rest 10 minutes before serving"
    ],
    "prep_time_minutes": 30,
    "cook_time_minutes": 300,
    "servings": 6,
    "difficulty": "easy",
    "tips": [
      "Browning beef first adds depth of flavor",
      "Cut vegetables in large chunks - they cook for hours",
      "Check at 4 hours if using smaller beef pieces",
      "Stew tastes even better the next day"
    ],
    "notes": "Low oven temperature creates melt-in-your-mouth tender beef.",
    "target_temp_c": 93,
    "target_temp_f": 200
  },
  {
    "id": 1015,
    "name": "Slow-Cooked Pulled Pork",
    "description": "Fall-apart tender pork shoulder",
    "mode": "slow_cook",
    "tray_position": 1,
    "phases": [
      {
        "mode": "slow_cook",
        "temperature_c": 95,
        "temperature_f": 203,
        "duration_minutes": 360,
        "description": "Slow cook until shreddable",
        "steam_enabled": false
      }
    ],
    "use_probe": true,
    "ingredients": [
      "2 kg pork shoulder",
      "2 onions, sliced",
      "1 cup apple cider vinegar",
      "1 cup chicken broth",
      "3 tbsp brown sugar",
      "2 tbsp paprika",
      "1 tbsp garlic powder",
      "1 tbsp onion powder",
      "1 tsp cumin",
      "1 tsp chili powder",
      "Salt and pepper",
      "BBQ sauce for serving"
    ],
    "instructions": [
      "Mix dry spices (paprika, garlic powder, onion powder, cumin, chili, salt, pepper)",
      "Rub spice mix all over pork shoulder",
      "Place onions in bottom of Dutch oven",
      "Place pork on top of onions",
      "Mix vinegar, broth, and brown sugar, pour around pork",
      "Cover tightly with lid",
      "Place on lower rack",
      "Slow cook at 95°C for 6 hours",
      "Pork should be fall-apart tender (93°C internal temp)",
      "Remove from pot, shred with forks",
      "Mix with cooking liquid and BBQ sauce"
    ],
    "prep_time_minutes": 20,
    "cook_time_minutes": 360,
    "servings": 8,
    "difficulty": "easy",
    "tips": [
      "Pork shoulder is the best cut for pulled pork",
      "Don't rush - low and slow is key",
      "Save cooking liquid - it's full of flavor",
      "Great for sandwiches, tacos, or bowls"
    ],
    "notes": "",
    "target_temp_c": 93,
    "target_temp_f": 200
  },
  {
    "id": 1016,
    "name": "Combi-Crisp Roasted Potatoes",
    "description": "Perfectly tender inside with ultra-crispy outside using steam then air fry",
    "mode": "combi_crisp",
    "tray_position": 1,
    "phases": [
      {
        "mode": "steam",
        "temperature_c": 100,
        "temperature_f": 212,
        "duration_minutes": 15,
        "description": "Steam to cook through and fluff up",
        "steam_enabled": true
      },
      {
        "mode": "air_fry",
        "temperature_c": 200,
        "temperature_f": 392,
        "duration_minutes": 20,
        "description": "Air fry for ultra-crispy exterior",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1.5 kg potatoes (Yukon Gold or Russet)",
      "4 tbsp olive oil or duck fat",
      "4 cloves garlic, unpeeled and crushed",
      "4 sprigs fresh rosemary",
      "Coarse sea salt",
      "Black pepper"
    ],
    "instructions": [
      "Peel and cut potatoes into 3-4cm chunks",
      "Toss potatoes with oil, garlic, rosemary, salt, and pepper",
      "Spread in single layer on crisper tray",
      "Place on lower rack",
      "Fill water tank",
      "Run Combi-Crisp program (Steam 15 min → Air Fry 20 min)",
      "Shake tray once during air fry phase for even crisping",
      "Potatoes will be fluffy inside with ultra-crispy exterior"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 35,
    "servings": 6,
    "difficulty": "easy",
    "tips": [
      "No parboiling needed - steam phase handles it perfectly",
      "Combi-Crisp gives better results than traditional roasting",
      "Cut potatoes uniform size for even cooking",
      "Use crisper tray for maximum air circulation",
      "These are crispier than traditional oven-roasted potatoes"
    ],
    "notes": "Combi-Crisp mode makes these significantly better than traditional roasting - the steam phase ensures fluffy interiors while air fry creates unmatched crispiness."
  },
  {
    "id": 1017,
    "name": "Soft Dinner Rolls",
    "description": "Fluffy dinner rolls with perfect rise",
    "mode": "prove",
    "tray_position": 2,
    "phases": [
      {
        "mode": "prove",
        "temperature_c": 35,
        "temperature_f": 95,
        "duration_minutes": 60,
        "description": "First rise",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "500g all-purpose flour",
      "7g instant yeast",
      "50g sugar",
      "10g salt",
      "50g butter, softened",
      "1 egg",
      "250ml warm milk",
      "Egg wash (1 egg + 1 tbsp milk)"
    ],
    "instructions": [
      "Mix flour, yeast, sugar, and salt",
      "Add butter, egg, and warm milk",
      "Knead 8-10 minutes until smooth and elastic",
      "Place dough in greased bowl",
      "Cover with damp towel",
      "Prove in oven at 35°C for 60 minutes (should double)",
      "Punch down and divide into 12 equal pieces",
      "Shape into rolls and place in baking dish",
      "Prove again for 30 minutes (or room temp covered)",
      "Brush with egg wash",
      "Bake in Convection mode at 180°C for 20 minutes",
      "Brush with melted butter while warm"
    ],
    "prep_time_minutes": 30,
    "cook_time_minutes": 110,
    "servings": 12,
    "difficulty": "medium",
    "tips": [
      "Prove mode maintains perfect temperature for yeast",
      "Dough should double in size during first rise",
      "Don't skip the egg wash - it makes them golden",
      "Best served warm from the oven"
    ],
    "notes": "The Prove mode eliminates guesswork for perfect bread rising."
  },
  {
    "id": 1018,
    "name": "Spinach & Cheddar Quiche",
    "description": "Creamy egg custard with spinach and cheese in flaky crust",
    "mode": "combi_bake",
    "tray_position": 2,
    "phases": [
      {
        "mode": "combi_bake",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 25,
        "description": "Steam + bake for perfect custard set",
        "steam_enabled": true
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1 refrigerated pie crust",
      "6 large eggs",
      "1 cup heavy cream",
      "1 cup milk",
      "2 cups fresh spinach, chopped",
      "1.5 cups shredded cheddar cheese",
      "1/2 tsp salt",
      "1/4 tsp black pepper",
      "1/4 tsp nutmeg",
      "1/2 cup water (for steaming)"
    ],
    "instructions": [
      "Pour 1/2 cup water in Combi Cooker Pan for steaming",
      "Place Crisper Plate on top of water",
      "Press refrigerated pie crust into 9-inch pie dish",
      "In a bowl, whisk eggs, cream, milk, salt, pepper, and nutmeg",
      "Add spinach and 1 cup cheddar to egg mixture",
      "Pour mixture into pie crust",
      "Top with remaining 1/2 cup cheddar",
      "Place pie dish on Crisper Plate",
      "Slide pan into Level 1",
      "Select COMBI BAKE, 350°F, 25 minutes",
      "Unit will steam for 20 minutes before baking",
      "When done, eggs should be set with slight jiggle in center",
      "Let cool 10 minutes before slicing"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 25,
    "servings": 8,
    "difficulty": "easy",
    "tips": [
      "Steam phase creates silky, creamy custard",
      "Don't overbake - slight jiggle is perfect",
      "Can substitute any cheese or vegetables",
      "Great for breakfast, brunch, or dinner"
    ],
    "notes": "Combi-Bake creates restaurant-quality quiche with perfect texture."
  },
  {
    "id": 1019,
    "name": "\"Fried\" Rice",
    "description": "Quick fried rice without a wok",
    "mode": "sear",
    "tray_position": 1,
    "phases": [
      {
        "mode": "sear",
        "temperature_c": 232,
        "temperature_f": 450,
        "duration_minutes": 12,
        "description": "Sear/sauté mode for wok-style fried rice",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "2 tbsp vegetable oil",
      "2 cups cooked white rice (day-old preferred)",
      "2 eggs, beaten",
      "1 cup mixed vegetables (peas, carrots, corn)",
      "2 green onions, chopped",
      "3 tbsp soy sauce",
      "1 tbsp sesame oil",
      "1/2 tsp garlic powder",
      "1/2 tsp ginger powder"
    ],
    "instructions": [
      "Slide Combi Cooker Pan into Level 1",
      "With door open, select SEAR/SAUTÉ, set to HI",
      "Preheat for 2 minutes",
      "Remove pan, add oil",
      "Add eggs, scramble, then remove and set aside",
      "Add rice, break up clumps",
      "Cook 5 minutes, stirring occasionally",
      "Add vegetables, cook 3 minutes",
      "Add soy sauce, sesame oil, spices",
      "Add eggs back, stir to combine",
      "Cook 2 more minutes",
      "Garnish with green onions"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 12,
    "servings": 4,
    "difficulty": "easy",
    "tips": [
      "Day-old rice works best (less sticky)",
      "Keep door open when using SEAR/SAUTÉ",
      "Stir frequently for even cooking",
      "Add cooked protein (chicken, shrimp, pork) for complete meal"
    ],
    "notes": "Sear/Sauté mode replicates wok cooking without stovetop."
  },
  {
    "id": 1020,
    "name": "Bacon-Wrapped Pork Chops with Brussels Sprouts & Couscous",
    "description": "Complete one-pan meal with protein, grain, and veggies",
    "mode": "combi_meal",
    "tray_position": 2,
    "phases": [
      {
        "mode": "combi_meal",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 22,
        "description": "Multi-level combi cooking",
        "steam_enabled": true
      }
    ],
    "use_probe": true,
    "ingredients": [
      "# Level 1 (Combi Cooker Pan) - Base",
      "3 cups plain pearled couscous",
      "4 cups water or cooking stock",
      "1/2 tsp kosher salt",
      "2 tbsp olive oil",
      "",
      "# Level 2 (Bake Tray) - Protein",
      "6 boneless pork chops (6-8 oz each)",
      "1 lb smoked bacon",
      "2 tbsp Dijon mustard",
      "2 tbsp honey or maple syrup",
      "1.5 lbs Brussels sprouts, trimmed and halved",
      "1 tbsp olive oil",
      "1 tbsp garlic powder",
      "1 tsp kosher salt",
      "1 tsp black pepper"
    ],
    "instructions": [
      "Add couscous, water/stock, salt, and oil to Combi Cooker Pan",
      "Stir to combine, slide pan into Level 1",
      "Brush pork chops with mustard-honey mixture",
      "Wrap each chop with bacon strips",
      "Place chops on Bake Tray, slide into Level 2",
      "Insert MEATER+ probe into thickest chop",
      "Select COMBI MEALS, 350°F, 22 minutes",
      "Unit will steam for 5 minutes",
      "When 10 minutes remain, toss Brussels sprouts with oil and seasonings",
      "Open door, flip chops, add Brussels sprouts around chops",
      "Close door to continue cooking",
      "When probe reaches 63°C/145°F, remove",
      "Let chops rest 3 minutes",
      "Fluff couscous with fork and serve"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 22,
    "servings": 6,
    "difficulty": "medium",
    "tips": [
      "Use MEATER+ probe for perfect pork doneness",
      "Steam phase cooks couscous perfectly",
      "Don't forget to add liquid to Level 1",
      "Bacon adds flavor and keeps chops moist"
    ],
    "notes": "Complete meal cooked in one appliance - base, protein, and vegetables all done together.",
    "target_temp_c": 63,
    "target_temp_f": 145
  },
  {
    "id": 1021,
    "name": "Beef Roast with Root Vegetables & Red Wine Pan Sauce",
    "description": "Perfect roast with vegetables and rich pan sauce",
    "mode": "combi_crisp",
    "tray_position": 1,
    "phases": [
      {
        "mode": "combi_crisp",
        "temperature_c": 182,
        "temperature_f": 360,
        "duration_minutes": 65,
        "description": "Steam then crisp for perfect roast",
        "steam_enabled": true
      }
    ],
    "use_probe": true,
    "ingredients": [
      "3-5 lb top round roast, patted dry",
      "2 tbsp canola oil, divided",
      "2 medium carrots, cut in 1.5-inch pieces",
      "1 medium onion, quartered",
      "3 small russet potatoes, cut in 1.5-inch pieces",
      "1.75 cups beef stock",
      "1/2 cup red wine",
      "2 sprigs fresh rosemary or thyme",
      "2 tbsp cornstarch + 1/4 cup water",
      "Kosher salt and black pepper"
    ],
    "instructions": [
      "Place beef stock, red wine, herbs, 1 tsp salt, 2 tsp pepper in Combi Cooker Pan",
      "Stir to combine, place Crisper Plate on top",
      "Toss vegetables with 1 tbsp oil, salt, and pepper",
      "Rub remaining oil on roast, season generously",
      "Place roast on Crisper Plate with vegetables around it",
      "Insert MEATER+ probe into center of roast",
      "Slide into Level 1",
      "Select COMBI CRISP, 360°F, 65 minutes",
      "Unit will steam for ~6 minutes before crisping",
      "At 45 minutes, start checking probe temperature",
      "For medium-rare: remove at 54°C/130°F",
      "For medium: remove at 60°C/140°F",
      "Remove roast and vegetables, let rest 10 minutes",
      "For pan sauce: whisk cornstarch-water into drippings",
      "Select SEAR/SAUTÉ at 3, simmer 2 minutes until thickened",
      "Slice roast and serve with vegetables and sauce"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 65,
    "servings": 6,
    "difficulty": "easy",
    "tips": [
      "Use MEATER+ probe to hit perfect doneness",
      "Steam phase tenderizes, crisp phase browns",
      "Let roast rest before slicing for juicy results",
      "Pan sauce uses flavorful drippings"
    ],
    "notes": "Combi-Crisp creates steakhouse-quality roast at home.",
    "target_temp_c": 54,
    "target_temp_f": 130
  },
  {
    "id": 1022,
    "name": "Garlic & Herb Focaccia",
    "description": "Artisan-style focaccia with crispy crust",
    "mode": "combi_crisp",
    "tray_position": 1,
    "phases": [
      {
        "mode": "prove",
        "temperature_c": 35,
        "temperature_f": 95,
        "duration_minutes": 40,
        "description": "Proof dough in humid environment",
        "steam_enabled": true
      },
      {
        "mode": "combi_crisp",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 20,
        "description": "Steam + crisp for perfect crust",
        "steam_enabled": true
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1 cup water (for proofing)",
      "Nonstick cooking spray",
      "1 lb store-bought pizza dough, room temperature",
      "1/4 cup extra virgin olive oil",
      "1 tbsp garlic powder",
      "2 tbsp fresh parsley, chopped",
      "1 tbsp dried thyme",
      "1 tsp kosher salt"
    ],
    "instructions": [
      "Pour 1 cup water in Combi Cooker Pan",
      "Place Crisper Plate on top",
      "Spray 8-inch round pan with cooking spray",
      "Form dough into ball, place in pan",
      "Place pan on Crisper Plate, slide into Level 1",
      "Select PROOF, 95°F, 40 minutes",
      "While proofing, mix oil, garlic, parsley, thyme, and salt",
      "When proofing complete, dimple dough all over with fingers",
      "Select COMBI CRISP, 350°F, 20 minutes",
      "Unit will steam 3-4 minutes",
      "When 5 minutes remain, brush oil mixture on top",
      "When done, remove and serve warm",
      "Keeps fresh 2 days at room temperature or frozen 2 months"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 60,
    "servings": 8,
    "difficulty": "medium",
    "tips": [
      "Prove mode creates perfect rising environment",
      "Dimpling creates classic focaccia appearance",
      "Steam phase makes bread soft inside",
      "Air fry phase creates crispy golden crust"
    ],
    "notes": "Multi-phase cooking produces bakery-quality focaccia."
  },
  {
    "id": 1023,
    "name": "Twice-Baked Loaded Potatoes",
    "description": "Fluffy stuffed potatoes with crispy tops",
    "mode": "combi_crisp",
    "tray_position": 2,
    "phases": [
      {
        "mode": "combi_crisp",
        "temperature_c": 204,
        "temperature_f": 400,
        "duration_minutes": 30,
        "description": "Steam + crisp to cook potatoes",
        "steam_enabled": true
      },
      {
        "mode": "grill",
        "temperature_c": 260,
        "temperature_f": 500,
        "duration_minutes": 10,
        "description": "Broil for golden tops",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1.5 cups water (for steaming)",
      "5 medium/large russet potatoes, poked with fork",
      "1 cup shredded cheddar cheese, divided",
      "1/2 cup whole milk",
      "1/4 cup sour cream",
      "Kosher salt and black pepper",
      "",
      "# Optional Toppings",
      "Shredded cheddar cheese",
      "Pre-cooked diced bacon",
      "Chives",
      "Sour cream"
    ],
    "instructions": [
      "Pour 1.5 cups water in Combi Cooker Pan",
      "Place Crisper Plate on top",
      "Place potatoes on Crisper Plate",
      "Slide pan into Level 1",
      "Select COMBI CRISP, 400°F, 30 minutes",
      "Unit will steam for 10 minutes",
      "When done, transfer potatoes to plate, let cool 5 minutes",
      "Cut 2-3 inch opening on top of each potato",
      "Scoop out insides into bowl (keep skins intact)",
      "Add 1/2 cup cheddar, milk, sour cream, salt, pepper to bowl",
      "Mix until smooth",
      "Fill potato skins with mixture",
      "Return to Crisper Plate on pan",
      "Slide pan into Level 2",
      "Select BROIL, 10 minutes",
      "When done, top with cheese, bacon, sour cream, chives"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 40,
    "servings": 5,
    "difficulty": "medium",
    "tips": [
      "Steam phase cooks potatoes perfectly fluffy",
      "Keep potato skins intact for structure",
      "Broil creates golden, crispy tops",
      "Customize toppings to your preference"
    ],
    "notes": "Two-phase cooking creates steakhouse-quality loaded potatoes."
  },
  {
    "id": 1024,
    "name": "Flakey Chocolate Croissants",
    "description": "Buttery croissants with melted chocolate filling",
    "mode": "combi_bake",
    "tray_position": 2,
    "phases": [
      {
        "mode": "combi_bake",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 12,
        "description": "Steam + bake for flaky pastry",
        "steam_enabled": true
      }
    ],
    "use_probe": false,
    "ingredients": [
      "# Level 1",
      "1/2 cup water (for steaming)",
      "",
      "# Level 2",
      "All-purpose flour (for dusting)",
      "1 large egg",
      "1 tbsp water",
      "1 sheet (8.5 oz) frozen puff pastry, thawed",
      "1 chocolate bar (1.5 oz), broken into pieces"
    ],
    "instructions": [
      "Beat egg with 1 tbsp water, set aside",
      "Pour 1/2 cup water in Combi Cooker Pan, slide into Level 1",
      "On floured surface, cut puff pastry into 6 equal rectangles",
      "Brush each rectangle with egg mixture",
      "Place 2 chocolate pieces in center of each rectangle",
      "Fold dough over chocolate to seal",
      "Place seam-side down on Bake Tray",
      "Brush tops with egg mixture",
      "Slide tray into Level 2",
      "Select COMBI BAKE, 350°F, 12 minutes",
      "Unit will steam for 20 minutes before baking",
      "When done, remove and serve immediately",
      "Store in airtight container up to 3 days"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 12,
    "servings": 6,
    "difficulty": "medium",
    "tips": [
      "Steam phase creates incredibly flaky layers",
      "Seal edges well to keep chocolate inside",
      "Swap chocolate for jam or custard for variety",
      "Best served warm with melted chocolate"
    ],
    "notes": "Combi-Bake produces bakery-quality croissants at home."
  },
  {
    "id": 1025,
    "name": "Apple Tart",
    "description": "Rustic French-style apple tart with caramelized apples",
    "mode": "combi_bake",
    "tray_position": 1,
    "phases": [
      {
        "mode": "combi_bake",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 17,
        "description": "Steam + bake for perfect crust and apples",
        "steam_enabled": true
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1/2 cup water (for steaming)",
      "1 sheet frozen puff pastry, thawed",
      "3 green apples, cut in 1/4-inch slices",
      "1/4 tsp cinnamon",
      "1/2 tsp vanilla extract",
      "1/4 cup granulated sugar",
      "4 tbsp cold butter, cut in 1/2-inch cubes",
      "Whipped cream (optional, for serving)",
      "Vanilla ice cream (optional, for serving)"
    ],
    "instructions": [
      "Pour 1/2 cup water in Combi Cooker Pan",
      "Place Crisper Plate on top",
      "Cut parchment to fit on Crisper Plate",
      "Stretch puff pastry to fit on parchment",
      "Press pastry against edges",
      "Poke entire surface with fork",
      "Toss apples with cinnamon and vanilla",
      "Arrange apple slices in neat overlapping rows on pastry",
      "Sprinkle sugar on top",
      "Dot butter pieces across apples",
      "Slide pan into Level 1",
      "Select COMBI BAKE, 350°F, 17 minutes",
      "Unit will steam for 20 minutes before baking",
      "When done, let cool 10 minutes",
      "Serve with whipped cream or ice cream"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 17,
    "servings": 8,
    "difficulty": "medium",
    "tips": [
      "Overlap apple slices for beautiful presentation",
      "Steam keeps apples tender while pastry crisps",
      "Green apples (Granny Smith) hold shape best",
      "Serve warm for best flavor"
    ],
    "notes": "Combi-Bake creates French patisserie-quality tart."
  },
  {
    "id": 1026,
    "name": "Chocolate Cheesecake",
    "description": "Rich, creamy chocolate cheesecake",
    "mode": "combi_bake",
    "tray_position": 1,
    "phases": [
      {
        "mode": "combi_bake",
        "temperature_c": 191,
        "temperature_f": 375,
        "duration_minutes": 15,
        "description": "Steam + bake for creamy texture",
        "steam_enabled": true
      }
    ],
    "use_probe": false,
    "ingredients": [
      "3/4 cup water (for steaming)",
      "1 prepared chocolate cookie pie crust (in aluminum foil dish)",
      "1 bag (12 oz) semi-sweet chocolate chips",
      "1/2 cup heavy cream",
      "1.5 blocks (12 oz) cream cheese, room temperature",
      "1/2 cup granulated sugar",
      "1 tsp instant espresso powder",
      "1 tsp vanilla extract",
      "2 large eggs",
      "Whipped cream (optional)"
    ],
    "instructions": [
      "Pour 3/4 cup water in Combi Cooker Pan",
      "Place Crisper Plate on top",
      "Place prepared chocolate crust (in foil dish) on plate",
      "In microwave-safe bowl, combine chocolate chips and cream",
      "Microwave 1 minute, stir until smooth, set aside",
      "In large bowl, whisk cream cheese until fluffy (2 minutes)",
      "Whisk in sugar, espresso powder, and vanilla",
      "Whisk in eggs one at a time",
      "Fold in melted chocolate mixture",
      "Pour mixture into pie crust (fill just below rim)",
      "Slide pan into Level 1",
      "Select COMBI BAKE, 375°F, 15 minutes",
      "Unit will steam for 20 minutes before baking",
      "When done, center should have slight jiggle",
      "Let cool in pan 20 minutes",
      "Refrigerate 8 hours or overnight",
      "Serve with whipped cream"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 15,
    "servings": 8,
    "difficulty": "medium",
    "tips": [
      "Room temperature cream cheese is essential",
      "Steam prevents cracking on surface",
      "Slight jiggle means perfect doneness",
      "Must chill overnight for best texture"
    ],
    "notes": "Combi-Bake creates restaurant-quality cheesecake without water bath."
  },
  {
    "id": 1027,
    "name": "Crispy Parmesan Brussels Sprouts",
    "description": "Ultra-crispy Brussels sprouts with Parmesan",
    "mode": "air_fry",
    "tray_position": 1,
    "phases": [
      {
        "mode": "air_fry",
        "temperature_c": 199,
        "temperature_f": 390,
        "duration_minutes": 15,
        "description": "Air fry for crispy exterior",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1 cup grated Parmesan cheese, divided",
      "1.5 lbs Brussels sprouts, trimmed and halved",
      "2 tbsp olive oil",
      "2 tsp garlic powder",
      "1 tbsp balsamic vinegar",
      "Kosher salt",
      "Ground black pepper"
    ],
    "instructions": [
      "Place Crisper Plate in Combi Cooker Pan",
      "Select AIR FRY, 390°F, 20 minutes to preheat",
      "Unit will preheat for 5 minutes",
      "While preheating, toss Brussels sprouts with 1/2 cup Parmesan and all other ingredients",
      "When 15 minutes remain, open door and slide pan into Level 1",
      "When 8 minutes remain, toss Brussels sprouts for 30 seconds",
      "Close door to continue",
      "When done, toss with remaining 1/2 cup Parmesan",
      "Serve warm"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 15,
    "servings": 8,
    "difficulty": "easy",
    "tips": [
      "Halving Brussels sprouts creates more crispy surface",
      "Toss halfway through for even cooking",
      "Fresh Parmesan melts better than pre-grated",
      "Balsamic vinegar adds depth of flavor"
    ],
    "notes": "Air Fry mode makes Brussels sprouts crispy outside, tender inside."
  },
  {
    "id": 1028,
    "name": "Chicken Pot \"Pie\" with Biscuits",
    "description": "Creamy chicken pot pie filling with fluffy biscuit topping",
    "mode": "convection",
    "tray_position": 2,
    "phases": [
      {
        "mode": "sear",
        "temperature_c": 232,
        "temperature_f": 450,
        "duration_minutes": 10,
        "description": "Sauté vegetables and make roux",
        "steam_enabled": false
      },
      {
        "mode": "convection",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 12,
        "description": "Bake filling and biscuits together",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "4 tbsp unsalted butter",
      "1 yellow or white onion, finely chopped",
      "2 cups frozen peas and carrots",
      "2 tbsp dried parsley",
      "1 tsp dried thyme",
      "1 rotisserie chicken (34 oz), cut into bite-size pieces",
      "1/4 cup all-purpose flour",
      "2 cups chicken or veggie stock",
      "3/4 cup half & half",
      "1 can (16.3 oz) refrigerated flaky biscuits",
      "Kosher salt and black pepper"
    ],
    "instructions": [
      "Slide Combi Cooker Pan into Level 1",
      "With door open, select SEAR/SAUTÉ, set to HI",
      "Preheat 3 minutes",
      "Remove pan, add butter and let melt",
      "Add onion, peas, carrots, parsley, thyme",
      "Return to unit, sauté 5 minutes (door open), stirring occasionally",
      "Remove pan, add flour, whisk until combined",
      "Return to unit, cook 1 minute (door open)",
      "Remove pan, whisk in stock and half & half",
      "Return to unit, reduce heat to 3",
      "Simmer until sauce thickens (~3 minutes)",
      "Remove pan, stir in chicken, salt, pepper",
      "Return pan to Level 1, close door",
      "Select BAKE, 350°F, 12 minutes to preheat",
      "Place biscuits on Bake Tray",
      "When preheated, slide tray onto Level 2",
      "Close door and cook",
      "When done, biscuits should be golden brown",
      "Serve chicken filling with biscuits on top"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 22,
    "servings": 8,
    "difficulty": "easy",
    "tips": [
      "Multi-mode cooking: sauté then bake",
      "Rotisserie chicken saves prep time",
      "Sauce should coat back of spoon when ready",
      "Biscuits bake above while filling stays hot below"
    ],
    "notes": "Two-level cooking makes complete pot pie without traditional crust."
  },
  {
    "id": 1029,
    "name": "Classic Mac & Cheese Bake",
    "description": "Ultra-creamy baked mac and cheese with crispy topping",
    "mode": "convection",
    "tray_position": 1,
    "phases": [
      {
        "mode": "convection",
        "temperature_c": 204,
        "temperature_f": 400,
        "duration_minutes": 20,
        "description": "Bake pasta until creamy",
        "steam_enabled": false
      },
      {
        "mode": "grill",
        "temperature_c": 260,
        "temperature_f": 500,
        "duration_minutes": 4,
        "description": "Broil for golden crispy top",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "8 oz American cheese (about 12 slices), broken into pieces",
      "2 cups shredded sharp cheddar cheese",
      "2 cups shredded low moisture mozzarella",
      "3.5 cups whole milk",
      "2 cups water",
      "1 box (16 oz) macaroni elbows",
      "Kosher salt and black pepper",
      "",
      "# Topping",
      "4 tbsp butter, melted",
      "1 cup panko bread crumbs",
      "1 tbsp dried parsley"
    ],
    "instructions": [
      "Add all cheeses, milk, water, pasta, salt, pepper to Combi Cooker Pan",
      "Stir well to combine",
      "Select BAKE, 400°F, 20 minutes to preheat",
      "Unit will preheat 3 minutes",
      "When preheated, slide pan into Level 1",
      "Close door to start cooking",
      "Mix melted butter, panko, and parsley for topping",
      "When baking complete, pull pan out and stir mac & cheese",
      "Sprinkle panko mixture evenly on top",
      "Slide pan back into Level 1",
      "Select BROIL, 4 minutes",
      "When done, let cool 5 minutes before serving"
    ],
    "prep_time_minutes": 5,
    "cook_time_minutes": 24,
    "servings": 10,
    "difficulty": "easy",
    "tips": [
      "Three cheese blend creates ultimate creaminess",
      "Stir before adding topping for even consistency",
      "Broil creates golden crispy crust",
      "Let rest 5 minutes for best texture"
    ],
    "notes": "One-pan baked mac and cheese rivals stovetop version with better texture."
  },
  {
    "id": 1030,
    "name": "Loaded Deep-Dish Pizza",
    "description": "Chicago-style deep-dish pizza with thick crust",
    "mode": "convection",
    "tray_position": 1,
    "phases": [
      {
        "mode": "prove",
        "temperature_c": 35,
        "temperature_f": 95,
        "duration_minutes": 40,
        "description": "Proof dough for airy crust",
        "steam_enabled": true
      },
      {
        "mode": "convection",
        "temperature_c": 204,
        "temperature_f": 400,
        "duration_minutes": 18,
        "description": "Pizza mode for perfect crust",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "1 cup water (for proofing)",
      "Nonstick cooking spray",
      "16 oz store-bought pizza dough, room temperature",
      "All-purpose flour for dusting",
      "Olive oil",
      "1.5 cups shredded mozzarella cheese",
      "1/2 cup pepperoni",
      "1/2 cup green bell pepper, thinly sliced",
      "1/2 cup yellow onion, thinly sliced",
      "1 jar (14 oz) pizza sauce",
      "1/2 cup grated Parmesan cheese"
    ],
    "instructions": [
      "Pour 1 cup water in Combi Cooker Pan",
      "Place Crisper Plate on top",
      "Spray plate with cooking spray",
      "Form dough into ball, place on plate",
      "Slide pan into Level 1",
      "Select PROOF, 95°F, 40 minutes",
      "When proofing done, remove pan",
      "Transfer dough to floured surface",
      "Roll into rectangle 15x8 inches",
      "Discard water, wipe pan clean",
      "Brush pan with olive oil",
      "Transfer dough to pan, press into corners and up sides",
      "Layer: mozzarella, pepperoni, peppers, onions, sauce, Parmesan",
      "Select PIZZA, 400°F, 18 minutes to preheat",
      "Unit will preheat 3 minutes",
      "When preheated, slide pan into Level 1",
      "Close door to cook",
      "When done, let cool in pan before slicing"
    ],
    "prep_time_minutes": 10,
    "cook_time_minutes": 58,
    "servings": 8,
    "difficulty": "medium",
    "tips": [
      "Prove mode creates perfect rise",
      "Press dough up sides of pan for thick crust",
      "Layer cheese first to prevent soggy crust",
      "Let cool slightly for easier slicing"
    ],
    "notes": "Two-phase cooking produces authentic deep-dish pizza at home."
  },
  {
    "id": 1031,
    "name": "Slow-Cooked Bolognese Sauce",
    "description": "Rich, authentic Italian meat sauce",
    "mode": "slow_cook",
    "tray_position": 1,
    "phases": [
      {
        "mode": "sear",
        "temperature_c": 232,
        "temperature_f": 450,
        "duration_minutes": 15,
        "description": "Sauté vegetables and brown meat",
        "steam_enabled": false
      },
      {
        "mode": "slow_cook",
        "temperature_c": 93,
        "temperature_f": 200,
        "duration_minutes": 240,
        "description": "Slow cook for deep flavors",
        "steam_enabled": false
      }
    ],
    "use_probe": false,
    "ingredients": [
      "2 tbsp olive oil",
      "1 yellow or white onion, diced",
      "2 celery stalks, diced",
      "2 whole carrots, peeled and diced",
      "3 garlic cloves, minced",
      "2 tbsp tomato paste",
      "2 lbs ground beef",
      "1 tbsp Italian seasoning",
      "1 cup dry red wine",
      "2 cans (28 oz each) whole peeled tomatoes with liquid",
      "3/4 cup whole milk",
      "Kosher salt and black pepper"
    ],
    "instructions": [
      "Slide Combi Cooker Pan into Level 1",
      "With door open, select SEAR/SAUTÉ, set to HI",
      "Preheat 2 minutes",
      "Remove pan, add oil to coat bottom",
      "Add onion, celery, carrots, garlic",
      "Return to unit, sauté 6 minutes (door open), stirring occasionally",
      "Remove pan, add tomato paste, stir to combine",
      "Return to unit, cook 1 minute",
      "Remove pan, add ground beef, Italian seasoning, salt, pepper",
      "Return to unit, cook until beef browned (~5 minutes)",
      "Remove pan, add red wine",
      "Return to unit, let reduce 3 minutes",
      "Turn off unit, transfer pan to heat-safe surface",
      "Add tomatoes and liquid, break up tomatoes with spoon",
      "Whisk in milk, salt, and pepper",
      "Return pan to Level 1, close door",
      "Select SLOW COOK, set to HI, 4 hours",
      "When done, serve over pasta",
      "Stores in fridge up to 1 week"
    ],
    "prep_time_minutes": 15,
    "cook_time_minutes": 255,
    "servings": 10,
    "difficulty": "medium",
    "tips": [
      "Sautéing vegetables first builds deep flavor",
      "Breaking down tomatoes creates better texture",
      "Milk adds richness and reduces acidity",
      "Slow cooking develops authentic Italian flavor"
    ],
    "notes": "Multi-phase cooking creates restaurant-quality bolognese that slow-simmers for hours."
  }
];

// AI Recipe Builder - Cooking Styles
const AI_COOKING_STYLES = [
  {
    "id": "quick_and_easy",
    "name": "Quick And Easy"
  },
  {
    "id": "gourmet",
    "name": "Gourmet"
  },
  {
    "id": "healthy",
    "name": "Healthy"
  },
  {
    "id": "comfort_food",
    "name": "Comfort Food"
  },
  {
    "id": "family_friendly",
    "name": "Family Friendly"
  },
  {
    "id": "meal_prep",
    "name": "Meal Prep"
  },
  {
    "id": "one_pot",
    "name": "One Pot"
  },
  {
    "id": "low_carb",
    "name": "Low Carb"
  },
  {
    "id": "high_protein",
    "name": "High Protein"
  },
  {
    "id": "vegetarian",
    "name": "Vegetarian"
  },
  {
    "id": "vegan",
    "name": "Vegan"
  }
];

// AI Recipe Builder - Common Ingredients
const AI_INGREDIENTS = {
  "proteins": [
    {
      "id": "chicken_breast",
      "name": "Chicken Breast",
      "common": true
    },
    {
      "id": "chicken_thigh",
      "name": "Chicken Thighs",
      "common": true
    },
    {
      "id": "ground_beef",
      "name": "Ground Beef",
      "common": true
    },
    {
      "id": "steak",
      "name": "Steak (Beef)",
      "common": true
    },
    {
      "id": "pork_chop",
      "name": "Pork Chops",
      "common": true
    },
    {
      "id": "salmon",
      "name": "Salmon",
      "common": true
    },
    {
      "id": "shrimp",
      "name": "Shrimp",
      "common": true
    },
    {
      "id": "tofu",
      "name": "Tofu",
      "common": true
    },
    {
      "id": "eggs",
      "name": "Eggs",
      "common": true
    }
  ],
  "vegetables": [
    {
      "id": "broccoli",
      "name": "Broccoli",
      "common": true
    },
    {
      "id": "carrots",
      "name": "Carrots",
      "common": true
    },
    {
      "id": "bell_peppers",
      "name": "Bell Peppers",
      "common": true
    },
    {
      "id": "onions",
      "name": "Onions",
      "common": true
    },
    {
      "id": "garlic",
      "name": "Garlic",
      "common": true
    },
    {
      "id": "tomatoes",
      "name": "Tomatoes",
      "common": true
    },
    {
      "id": "spinach",
      "name": "Spinach",
      "common": true
    },
    {
      "id": "potatoes",
      "name": "Potatoes",
      "common": true
    },
    {
      "id": "sweet_potatoes",
      "name": "Sweet Potatoes",
      "common": true
    },
    {
      "id": "zucchini",
      "name": "Zucchini",
      "common": true
    },
    {
      "id": "cauliflower",
      "name": "Cauliflower",
      "common": true
    },
    {
      "id": "green_beans",
      "name": "Green Beans",
      "common": true
    }
  ],
  "grains": [
    {
      "id": "rice",
      "name": "Rice",
      "common": true
    },
    {
      "id": "pasta",
      "name": "Pasta",
      "common": true
    },
    {
      "id": "quinoa",
      "name": "Quinoa",
      "common": true
    },
    {
      "id": "bread",
      "name": "Bread",
      "common": true
    },
    {
      "id": "tortillas",
      "name": "Tortillas",
      "common": true
    }
  ],
  "dairy": [
    {
      "id": "cheese",
      "name": "Cheese",
      "common": true
    },
    {
      "id": "milk",
      "name": "Milk",
      "common": true
    },
    {
      "id": "butter",
      "name": "Butter",
      "common": true
    },
    {
      "id": "cream",
      "name": "Cream",
      "common": true
    },
    {
      "id": "yogurt",
      "name": "Yogurt",
      "common": true
    }
  ]
};

// Cooking methods
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
      // Message dialog (replaces non-copyable alert())
      _showMessageDialog: { type: Boolean },
      _messageDialogTitle: { type: String },
      _messageDialogContent: { type: String },
      _messageDialogIsError: { type: Boolean },
      // Phase 1: GUI Redesign - Navigation state
      _currentPath: { type: String },  // 'welcome', 'meater', 'ninja_combi', 'ai_recipe_builder', 'previous_cooks', 'recent_meater'
      _selectedAppliance: { type: Object },  // Selected appliance from welcome screen
      _showMeaterCooking: { type: Boolean },  // Show MEATER cooking form in MEATER path
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
    this._showAISettingsModal = false;
    this._aiAgentId = 'extended_openai_conversation_2';  // Default
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
      this._showMessage('Missing Ingredients', 'Please select at least one ingredient', false);
      return;
    }
    
    if (!this._aiSelectedStyle) {
      this._showMessage('Missing Cooking Style', 'Please select a cooking style', false);
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
        const errorMsg = response.message || 'Unknown error';
        console.error('API error:', errorMsg);
        this._showMessage('Failed to Generate Recipes', `${errorMsg}\n\nPlease check:\n1. OpenAI assistant is configured in Voice Assistants\n2. The assistant is named "OpenAI"\n3. Your OpenAI API key is valid`, true);
      }
    } catch (e) {
      console.error('Failed to generate AI recipes:', e);
      const errorMsg = e.message || e.toString();
      this._showMessage('Failed to Generate Recipes', `${errorMsg}\n\nPlease check:\n1. OpenAI assistant is configured in Voice Assistants\n2. The assistant is named "OpenAI"\n3. Your OpenAI API key is valid\n4. Check Home Assistant logs for more details`, true);
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
        suggestion: suggestion,  // Pass the full suggestion object
        appliance_ids: applianceIds,
      });
      
      if (response.status === 'ok') {
        this._aiRecipeDetail = response.detail;
      } else {
        this._showMessage('Failed to Get Recipe Detail', response.message, true);
      }
    } catch (e) {
      console.error('Failed to get AI recipe detail:', e);
      this._showMessage('Failed to Get Recipe Detail', 'Please try again.', true);
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

  // AI Recipe Builder: Main render function
  _renderAIRecipeBuilder() {
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
        <div class="card-header" style="display: flex; justify-content: space-between; align-items: flex-start;">
          <div>
            <h2>🤖 AI Recipe Builder</h2>
            <p style="margin: 8px 0 0 0; font-size: 0.9em; color: var(--secondary-text-color);">
              Select ingredients and cooking style to generate custom recipes
            </p>
          </div>
          <button
            class="icon-button"
            @click=${this._showAISettings}
            title="AI Settings"
            style="margin-top: 4px;"
          >
            ⚙️
          </button>
        </div>
        <div class="card-content">
          <!-- Show warning if OpenAI might not be configured -->
          ${this._aiOpenAIAvailable === false ? html`
            <div class="warning-message" style="margin-bottom: 16px;">
              <p><strong>⚠️ OpenAI May Not Be Configured</strong></p>
              <p>The AI Recipe Builder requires the OpenAI conversation integration.</p>
              <p>If not configured: <strong>Settings → Voice Assistants → Add Assistant → OpenAI</strong></p>
              <p style="margin-top: 8px;"><em>You can still try - if OpenAI is configured, it will work.</em></p>
            </div>
          ` : ''}
          
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
          ${this._renderContent(entities, isActive, state)}
          
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
  _renderContent(entities, isActive, state) {
    // If there's an active cook, always show it regardless of path
    if (isActive && entities.length > 0) {
      return this._renderActiveCook(state);
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
      
      case 'ai_recipe_builder':
        return this._renderAIRecipeBuilderPath();
      
      case 'previous_cooks':
        return this._renderPreviousCooksPath();
      
      default:
        // Fallback to welcome screen
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

  // ============================================================================
  // PHASE 1: GUI REDESIGN - PATH RENDER METHODS
  // ============================================================================

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
      const entities = this._getEntities();
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
    // Filter history for MEATER probe cooks only
    const meaterCooks = (this._cookHistory || []).filter(cook => {
      // Check if it's a MEATER-only cook (no recipe, just temperature monitoring)
      return cook.appliance_type === 'meater_probe' || 
             (cook.protein && !cook.recipe_name);
    });

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
   * Render Previous Cooks path (uses existing _renderHistory)
   */
  _renderPreviousCooksPath() {
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
    // Phase 2: Show MEATER cooking interface
    this._showMeaterCooking = true;
    this.requestUpdate();
  }

  _showRecentMeaterCooks() {
    // Phase 2: Show filtered MEATER cook history
    this._currentPath = 'recent_meater';
    this.requestUpdate();
  }

  _startNinjaRecipeBuilder() {
    // TODO Phase 5: Integrate existing recipe builder
    this._showMessage('Coming Soon', 'Ninja Recipe Builder will be integrated in Phase 5.', false);
  }

  _showNinjaBuiltInRecipes() {
    // TODO Phase 5: Show built-in recipes
    this._showMessage('Coming Soon', 'Built-in Ninja Combi recipes will be available in Phase 5.', false);
  }

  _startAIWithNinjaCombi() {
    // TODO Phase 6: Pre-select Ninja Combi in AI builder
    this._showMessage('Coming Soon', 'AI Recipe with Ninja Combi will be available in Phase 6.', false);
  }

  _showRecentNinjaCooks() {
    // TODO Phase 3: Implement filtered history
    this._showMessage('Coming Soon', 'Recent Ninja Combi cooks will be implemented in Phase 3.', false);
  }

  _startAIRecipeCreation() {
    // TODO Phase 6: Integrate AI recipe builder
    this._showMessage('Coming Soon', 'AI Recipe creation will be integrated in Phase 6.', false);
  }

  _showRecentApplianceRecipes() {
    // TODO Phase 3: Implement filtered history
    this._showMessage('Coming Soon', 'Recent appliance recipes will be implemented in Phase 3.', false);
  }

  _toggleSecondaryAppliance(applianceId, enabled) {
    // TODO Phase 6: Implement secondary appliance selection
    console.log(`Toggle secondary appliance ${applianceId}: ${enabled}`);
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
      }
    `;
  }
}

// Force re-registration by using a versioned element name
// This bypasses browser's cached customElements registry
// MUST match the "name" in __init__.py panel config
const PANEL_VERSION = "98";

// Register with versioned name (what HA frontend will look for)
const VERSIONED_NAME = `kitchen-cooking-panel-v${PANEL_VERSION}`;
if (!customElements.get(VERSIONED_NAME)) {
  customElements.define(VERSIONED_NAME, KitchenCookingPanel);
}
