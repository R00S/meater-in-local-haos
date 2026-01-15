"""
AI Recipe Builder Static Data

This file contains the static data for the AI Recipe Builder that can be
imported during frontend generation without requiring Home Assistant.
"""

# Cooking styles for AI recipe generation
COOKING_STYLES = [
    {"id": "quick_and_easy", "name": "Quick And Easy"},
    {"id": "gourmet", "name": "Gourmet"},
    {"id": "healthy", "name": "Healthy"},
    {"id": "comfort_food", "name": "Comfort Food"},
    {"id": "family_friendly", "name": "Family Friendly"},
    {"id": "meal_prep", "name": "Meal Prep"},
    {"id": "one_pot", "name": "One Pot"},
    {"id": "low_carb", "name": "Low Carb"},
    {"id": "high_protein", "name": "High Protein"},
    {"id": "vegetarian", "name": "Vegetarian"},
    {"id": "vegan", "name": "Vegan"},
]

# Common ingredients grouped by category
COMMON_INGREDIENTS = {
    "proteins": [
        {"id": "chicken_breast", "name": "Chicken Breast", "common": True},
        {"id": "chicken_thigh", "name": "Chicken Thighs", "common": True},
        {"id": "ground_beef", "name": "Ground Beef", "common": True},
        {"id": "steak", "name": "Steak (Beef)", "common": True},
        {"id": "pork_chop", "name": "Pork Chops", "common": True},
        {"id": "salmon", "name": "Salmon", "common": True},
        {"id": "shrimp", "name": "Shrimp", "common": True},
        {"id": "tofu", "name": "Tofu", "common": True},
        {"id": "eggs", "name": "Eggs", "common": True},
    ],
    "vegetables": [
        {"id": "broccoli", "name": "Broccoli", "common": True},
        {"id": "carrots", "name": "Carrots", "common": True},
        {"id": "bell_peppers", "name": "Bell Peppers", "common": True},
        {"id": "onions", "name": "Onions", "common": True},
        {"id": "garlic", "name": "Garlic", "common": True},
        {"id": "tomatoes", "name": "Tomatoes", "common": True},
        {"id": "spinach", "name": "Spinach", "common": True},
        {"id": "potatoes", "name": "Potatoes", "common": True},
        {"id": "sweet_potatoes", "name": "Sweet Potatoes", "common": True},
        {"id": "zucchini", "name": "Zucchini", "common": True},
        {"id": "cauliflower", "name": "Cauliflower", "common": True},
        {"id": "green_beans", "name": "Green Beans", "common": True},
    ],
    "grains": [
        {"id": "rice", "name": "Rice", "common": True},
        {"id": "pasta", "name": "Pasta", "common": True},
        {"id": "quinoa", "name": "Quinoa", "common": True},
        {"id": "bread", "name": "Bread", "common": True},
        {"id": "tortillas", "name": "Tortillas", "common": True},
    ],
    "dairy": [
        {"id": "cheese", "name": "Cheese", "common": True},
        {"id": "milk", "name": "Milk", "common": True},
        {"id": "butter", "name": "Butter", "common": True},
        {"id": "cream", "name": "Cream", "common": True},
        {"id": "yogurt", "name": "Yogurt", "common": True},
    ],
}
