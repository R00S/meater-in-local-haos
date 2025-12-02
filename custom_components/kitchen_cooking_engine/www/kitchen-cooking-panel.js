/**
 * Kitchen Cooking Engine Panel
 * 
 * AUTO-REGENERATED: 02 Dec 2025, 12:07 CET
 * Data generated from cooking_data.py and swedish_cooking_data.py
 * 
 * NOTE: This file's data section is regenerated at install/update time.
 *       Do not manually edit the data constants - they will be overwritten.
 *       Temperature values are suggestions based on cooking style, not just safety.
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

// AUTO-GENERATED DATA - DO NOT EDIT
// Generated from cooking_data.py and swedish_cooking_data.py
// Last generated: 02 Dec 2025, 12:07 CET

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
      _showHistory: { type: Boolean },
      _cookHistory: { type: Array },
      _cutPreferences: { type: Object },
      _currentNotes: { type: String },
      _showNotes: { type: Boolean },
      _haHistory: { type: Array },
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
    this._visibilityHandler = null;
    this._haHistory = [];
    this._historyFetchInterval = null;
    // Data is generated from backend Python files at install/update time
    // Run generate_frontend_data.py after modifying cooking_data.py or swedish_cooking_data.py
  }

  connectedCallback() {
    super.connectedCallback();
    // Data is embedded in this file - generated from backend at build time
    
    // Load user preferences
    this._loadPreferences();
    
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
    
    // Start fetching history periodically when cooking
    this._historyFetchInterval = setInterval(() => this._fetchHistory(), 10000);
    // Initial fetch
    setTimeout(() => this._fetchHistory(), 1000);
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
    if (this._historyFetchInterval) {
      clearInterval(this._historyFetchInterval);
      this._historyFetchInterval = null;
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

  async _fetchHistory() {
    // Fetch temperature history from Home Assistant's history API
    const state = this._getState();
    if (!state || !this.hass) return;
    
    // Only fetch when actively cooking
    const cookState = state.state;
    if (cookState === 'idle' || cookState === 'complete') {
      this._haHistory = [];
      return;
    }
    
    const attrs = state.attributes;
    const sessionStart = attrs.session_start;
    if (!sessionStart) return;
    
    // Get the temperature sensor entity ID from the cooking session's entity_id
    // The cooking session entity ID contains the temp sensor name
    const entityId = this._selectedEntity;
    if (!entityId) return;
    
    // Extract the base entity name to find the temp sensor
    // Format: sensor.kitchen_cooking_engine_<temp_sensor_name>_cooking_session
    // We need to find the original temp sensor
    const match = entityId.match(/sensor\.kitchen_cooking_engine_(.+)_cooking_session/);
    if (!match) return;
    
    const sensorName = match[1];
    // Common patterns for MEATER probes
    const possibleSensors = [
      `sensor.${sensorName}`,
      `sensor.${sensorName}_tip_temperature`,
      `sensor.${sensorName.replace(/_tip_temperature$/, '')}`,
    ];
    
    // Find the ambient sensor too
    const ambientSensor = attrs.ambient_sensor || null;
    
    try {
      // Fetch history from HA's history API
      const startTime = new Date(sessionStart);
      const endTime = new Date();
      const startIso = startTime.toISOString();
      
      // Build history request - need to find the actual sensor entities
      // Look for entities with state history
      const allEntities = Object.keys(this.hass.states);
      
      // Find likely tip temperature sensor
      let tipSensor = null;
      for (const sensor of possibleSensors) {
        if (allEntities.includes(sensor)) {
          tipSensor = sensor;
          break;
        }
      }
      
      // Fallback - try to find any entity containing the sensor name
      if (!tipSensor) {
        tipSensor = allEntities.find(e => 
          e.includes(sensorName) && 
          e.includes('tip') && 
          e.startsWith('sensor.')
        );
      }
      if (!tipSensor) {
        tipSensor = allEntities.find(e => 
          e.includes(sensorName) && 
          e.startsWith('sensor.') &&
          !e.includes('ambient') &&
          !e.includes('battery') &&
          !e.includes('cooking_session')
        );
      }
      
      // Find ambient sensor
      let ambSensor = ambientSensor;
      if (!ambSensor) {
        ambSensor = allEntities.find(e => 
          e.includes(sensorName.replace(/_tip_temperature$/, '')) && 
          e.includes('ambient') && 
          e.startsWith('sensor.')
        );
      }
      
      if (!tipSensor) {
        // Use internal history as fallback
        return;
      }
      
      // Fetch history for both sensors
      const entities = [tipSensor];
      if (ambSensor) entities.push(ambSensor);
      
      const historyUrl = `history/period/${startIso}?filter_entity_id=${entities.join(',')}&minimal_response&significant_changes_only&no_attributes`;
      
      const response = await this.hass.callApi('GET', historyUrl);
      
      if (!response || !Array.isArray(response) || response.length === 0) {
        return;
      }
      
      // Process the history data
      const tipHistory = response.find(h => h.length > 0 && h[0]?.entity_id === tipSensor) || [];
      const ambHistory = ambSensor ? (response.find(h => h.length > 0 && h[0]?.entity_id === ambSensor) || []) : [];
      
      // Merge into our format: [{tip_temp, ambient_temp, timestamp}, ...]
      const mergedHistory = [];
      
      // Create a map of ambient temps by timestamp (within 30 second windows)
      const ambientMap = new Map();
      for (const point of ambHistory) {
        if (point.state && !isNaN(parseFloat(point.state))) {
          const ts = new Date(point.last_changed).getTime();
          ambientMap.set(Math.floor(ts / 30000), parseFloat(point.state));
        }
      }
      
      // Build merged history from tip temps
      for (const point of tipHistory) {
        if (point.state && !isNaN(parseFloat(point.state))) {
          const ts = new Date(point.last_changed).getTime();
          const tipTemp = parseFloat(point.state);
          // Find matching ambient temp
          const ambKey = Math.floor(ts / 30000);
          const ambTemp = ambientMap.get(ambKey) || ambientMap.get(ambKey - 1) || ambientMap.get(ambKey + 1);
          
          mergedHistory.push({
            tip_temp: tipTemp,
            ambient_temp: ambTemp || null,
            timestamp: point.last_changed
          });
        }
      }
      
      // Sort by timestamp
      mergedHistory.sort((a, b) => new Date(a.timestamp) - new Date(b.timestamp));
      
      this._haHistory = mergedHistory;
      this.requestUpdate();
      
    } catch (e) {
      console.error('Could not fetch history:', e);
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
    }
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
            (entities.length === 0 ? this._renderNoEntities() : 
              (isActive ? this._renderActiveCook(state) : this._renderSetupForm(entities)))}
          
          ${!isActive && entities.length > 0 ? html`
            <div class="history-toggle">
              <button class="history-btn ${this._showHistory ? 'active' : ''}" @click=${this._toggleHistory}>
                📜 ${this._showHistory ? 'Back to Cooking' : 'View Cook History'}
              </button>
            </div>
          ` : ''}
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
    const currentTemp = attrs.current_temp;
    const ambientTemp = attrs.ambient_temp;
    const batteryLevel = attrs.battery_level;
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
          
          <!-- Temperature Graph - use HA history API data if available, fallback to internal -->
          ${(() => {
            const history = this._haHistory && this._haHistory.length > 1 
              ? this._haHistory 
              : (attrs.temp_history && attrs.temp_history.length > 1 ? attrs.temp_history : null);
            return history ? html`
              <div class="temp-graph-container">
                <h4>📈 Temperature Graph</h4>
                ${this._renderTempGraph(history, targetTemp)}
              </div>
            ` : '';
          })()}
          
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

  _renderTempGraph(history, targetTemp) {
    if (!history || history.length < 2) return '';
    
    const width = 300;
    const height = 120;
    const padding = 20;
    
    // Dynamic X-axis scaling based on cook duration
    // Early in cook: show all data points spread across full width
    // As cook progresses: keep graph ~75% filled by adjusting visible window
    // This gives meaningful visual feedback at all stages
    
    let displayHistory;
    if (history.length <= 15) {
      // Early in cook - show all data, spread across full width
      displayHistory = history;
    } else {
      // Later in cook - show a sliding window that keeps graph ~75% utilized
      // Calculate how many samples to show to keep graph looking good
      const targetFillRatio = 0.75;
      const samplesToShow = Math.max(15, Math.floor(history.length / targetFillRatio));
      displayHistory = history.slice(-Math.min(samplesToShow, 60));
    }
    
    // Find min/max temps from displayed history
    const tipTemps = displayHistory.map(h => h.tip_temp).filter(t => t != null);
    const ambientTemps = displayHistory.map(h => h.ambient_temp).filter(t => t != null);
    const allTemps = [...tipTemps, ...ambientTemps];
    if (targetTemp != null) allTemps.push(targetTemp);
    if (allTemps.length === 0) return '';
    
    // Add some padding to temp range for visual clarity
    const dataMinTemp = Math.min(...allTemps);
    const dataMaxTemp = Math.max(...allTemps);
    const tempRange = dataMaxTemp - dataMinTemp;
    const minTemp = dataMinTemp - Math.max(5, tempRange * 0.1);
    const maxTemp = dataMaxTemp + Math.max(5, tempRange * 0.1);
    
    // Handle edge case where all temps are the same
    const effectiveMaxTemp = maxTemp === minTemp ? maxTemp + 10 : maxTemp;
    
    const scaleX = (i) => padding + (i / Math.max(1, displayHistory.length - 1)) * (width - 2 * padding);
    const scaleY = (temp) => height - padding - ((temp - minTemp) / (effectiveMaxTemp - minTemp)) * (height - 2 * padding);
    
    // Build tip temp path
    let tipPath = '';
    displayHistory.forEach((h, i) => {
      if (h.tip_temp != null) {
        const x = scaleX(i);
        const y = scaleY(h.tip_temp);
        tipPath += (tipPath === '' ? `M ${x} ${y}` : ` L ${x} ${y}`);
      }
    });
    
    // Build ambient temp path
    let ambientPath = '';
    displayHistory.forEach((h, i) => {
      if (h.ambient_temp != null) {
        const x = scaleX(i);
        const y = scaleY(h.ambient_temp);
        ambientPath += (ambientPath === '' ? `M ${x} ${y}` : ` L ${x} ${y}`);
      }
    });
    
    const targetY = targetTemp ? scaleY(targetTemp) : null;
    
    return html`
      <svg viewBox="0 0 ${width} ${height}" class="temp-graph">
        <!-- Grid lines -->
        <line x1="${padding}" y1="${scaleY(minTemp)}" x2="${width - padding}" y2="${scaleY(minTemp)}" stroke="#ddd" stroke-width="0.5"/>
        <line x1="${padding}" y1="${scaleY(effectiveMaxTemp)}" x2="${width - padding}" y2="${scaleY(effectiveMaxTemp)}" stroke="#ddd" stroke-width="0.5"/>
        
        <!-- Target line -->
        ${targetY !== null ? html`
          <line x1="${padding}" y1="${targetY}" x2="${width - padding}" y2="${targetY}" stroke="#4caf50" stroke-width="1" stroke-dasharray="4"/>
          <text x="${width - padding + 2}" y="${targetY + 3}" font-size="8" fill="#4caf50">Target</text>
        ` : ''}
        
        <!-- Ambient temp line -->
        ${ambientPath ? html`
          <path d="${ambientPath}" stroke="#03a9f4" stroke-width="2" fill="none"/>
        ` : ''}
        
        <!-- Tip temp line -->
        ${tipPath ? html`
          <path d="${tipPath}" stroke="#ff5722" stroke-width="2" fill="none"/>
        ` : ''}
        
        <!-- Legend -->
        <circle cx="${padding + 5}" cy="${height - 5}" r="3" fill="#ff5722"/>
        <text x="${padding + 12}" y="${height - 2}" font-size="8" fill="var(--primary-text-color)">Tip</text>
        ${ambientPath ? html`
          <circle cx="${padding + 45}" cy="${height - 5}" r="3" fill="#03a9f4"/>
          <text x="${padding + 52}" y="${height - 2}" font-size="8" fill="var(--primary-text-color)">Ambient</text>
        ` : ''}
      </svg>
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
    `;
  }
}

// Force re-registration by using a versioned element name
// This bypasses browser's cached customElements registry
// MUST match the "name" in __init__.py panel config
const PANEL_VERSION = "32";

// Register with versioned name (what HA frontend will look for)
const VERSIONED_NAME = `kitchen-cooking-panel-v${PANEL_VERSION}`;
if (!customElements.get(VERSIONED_NAME)) {
  customElements.define(VERSIONED_NAME, KitchenCookingPanel);
}
