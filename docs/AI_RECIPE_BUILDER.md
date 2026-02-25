# AI Recipe Builder Documentation

**Version:** v0.5.1.7  
**Last Updated:** 25 February 2026

## Overview

The AI Recipe Builder generates custom recipes using AI conversation agents (OpenAI, etc.) via Home Assistant's conversation integration. It creates personalized recipes based on:

- Your selected ingredients (30+ common ingredients across 4 categories)
- Your preferred cooking style (11 styles)
- Cuisine preferences (70+ cuisines across 11 world regions, multi-select for fusion)
- Complexity level (1–5: Very Simple → Chef Level)
- Number of portions (1–8)
- Your kitchen equipment (appliances automatically detected)

## Features

### 🤖 AI-Powered Generation
- Generates 4 diverse recipe suggestions per request
- Uses any AI conversation agent via Home Assistant (OpenAI, Extended OpenAI, Nabu Casa, etc.)
- Creates detailed recipes with full instructions, ingredients, and tips
- Cancelable loading dialog with time estimate (10–30 seconds)

### 🥗 Intelligent Ingredient Selection
- **30+ common ingredients** organized by category:
  - **Proteins:** Chicken, beef, pork, fish, tofu, eggs, shrimp, turkey, salmon
  - **Vegetables:** Broccoli, carrots, peppers, tomatoes, onions, garlic, spinach, mushrooms, potatoes, zucchini, corn, green beans
  - **Grains:** Rice, pasta, quinoa, bread, noodles
  - **Dairy:** Cheese, milk, butter, cream, yogurt
- Custom ingredient input for anything not in the list
- Minimum 2 ingredients required

### 🍳 Cooking Style Options
Choose from 11 different cooking styles:
1. **Quick & Easy** — Fast meals with minimal prep (complexity default: 1)
2. **Gourmet** — Restaurant-quality dishes (complexity default: 4)
3. **Healthy** — Nutritious, balanced meals (complexity default: 2)
4. **Comfort Food** — Classic, satisfying dishes (complexity default: 2)
5. **Family Friendly** — Kid-approved recipes (complexity default: 1)
6. **Meal Prep** — Batch cooking for the week (complexity default: 2)
7. **One Pot** — Minimal cleanup recipes (complexity default: 1)
8. **Low Carb** — Keto-friendly options (complexity default: 2)
9. **High Protein** — Protein-focused meals (complexity default: 2)
10. **Vegetarian** — Plant-based recipes (complexity default: 2)
11. **Vegan** — No animal products (complexity default: 2)

### 🌍 World Cuisine Selection
70+ cuisines in 11 collapsible regions (select multiple for fusion):

| Region | Cuisines |
|--------|----------|
| ❄️ Nordic & Scandinavian | Swedish, Danish, Norwegian, Finnish, Icelandic, New Nordic |
| 🥢 East Asian | Japanese, Chinese, Korean, Taiwanese |
| 🌴 Southeast Asian | Thai, Vietnamese, Indonesian, Malaysian, Filipino, Singaporean |
| 🍛 South Asian | Indian, Sri Lankan, Pakistani, Bangladeshi, Nepali |
| 🧆 Middle Eastern | Lebanese, Turkish, Persian/Iranian, Israeli, Syrian, Iraqi, Yemeni, Emirati/Gulf, Palestinian |
| 🏰 European | Italian, French, Spanish, Greek, Portuguese, German, British, Polish, Hungarian, Mediterranean, Balkan, Russian |
| 🦅 North American | American, Cajun/Creole, Tex-Mex, Canadian, Southern US/Soul Food, Hawaiian |
| 💃 Latin American | Mexican, Brazilian, Peruvian, Argentinian, Colombian, Cuban, Venezuelan, Chilean |
| 🏝️ Caribbean | Jamaican, Trinidadian, Haitian, Puerto Rican, Caribbean General |
| 🌍 African | Ethiopian, Moroccan, Nigerian, Ghanaian, Senegalese, South African, Kenyan, Tanzanian, Tunisian, Egyptian, East African, West African |
| 🦘 Oceanian | Australian, Polynesian |

### 📊 Complexity & Portions
- **Complexity slider** (1–5): Controls recipe difficulty, auto-adjusts based on style selection
- **Portions slider** (1–8): Sets number of servings for the generated recipe

### 🍽️ Full Cook Flow
- Step-by-step recipe navigation with elapsed timer
- Overview page with ingredients and recipe description
- Individual step pages with detailed instructions
- Finish page with star ratings (ease + result) and optional notes
- Save completed cook to history with full recipe data

### 🔄 Save & Restart
- Completed AI recipe cooks saved to cook_history.json
- Full recipe data (instructions, ingredients, tips, servings) preserved
- Restartable from Previous Cooks path
- Recipe overview shown on restart for review before cooking

### 🔧 Appliance-Aware
- Automatically detects your configured kitchen appliances
- Passes appliance information to AI for optimization
- Suggests cooking methods compatible with your equipment

## Setup

### Prerequisites

1. **Home Assistant 2024.1.0+**
2. **Kitchen Cooking Engine v0.3.5.0+**
3. **OpenAI API Key**

### Step 1: Configure OpenAI Conversation

1. Open Home Assistant
2. Go to **Settings** → **Voice Assistants**
3. Click **Add Assistant**
4. Select **OpenAI Conversation**
5. Enter your OpenAI API key
6. Choose your preferred model:
   - **GPT-4** (Recommended) - Best quality, more expensive
   - **GPT-3.5-turbo** - Good quality, more affordable
7. Save the configuration

### Step 2: Verify Integration

1. Open the Kitchen Cooking Engine panel
2. Click the **🤖 AI Recipe Builder** button
3. If OpenAI is not configured, you'll see a setup message
4. If configured correctly, you'll see the ingredient selection interface

## Usage

### Generating Recipes

1. **Select Cooking Style**
   - Click on your preferred cooking style
   - Only one style can be selected at a time

2. **Choose Ingredients**
   - Browse ingredients by category
   - Click to select/deselect ingredients
   - Select at least one ingredient (more is better!)
   - The counter shows how many ingredients are selected

3. **Generate Recipes**
   - Click **🤖 Generate 4 Recipe Ideas**
   - Wait 10-30 seconds for AI to generate suggestions
   - The AI will create 4 diverse recipe options

4. **Browse Suggestions**
   - Each card shows:
     - Recipe name
     - Brief description
     - Cook time
     - Difficulty level
     - Cuisine type
     - Main ingredients used

5. **View Details**
   - Click on any suggestion card to see full recipe
   - Detailed view includes:
     - Complete ingredient list with measurements
     - Step-by-step cooking instructions
     - Cooking phases with temperatures and times
     - Helpful tips and tricks
     - Temperature probe guidance (if applicable)

6. **Start Over**
   - Click **← Start Over with New Ingredients** to generate new recipes
   - Or click **← Back to Suggestions** to see other suggestions

## API Endpoints

For automation or custom integration:

### Check OpenAI Availability
```http
GET /api/kitchen_cooking_engine/ai_recipes/check
```
**Response:**
```json
{
  "available": true,
  "message": "OpenAI conversation integration is configured and ready"
}
```

### Get Ingredients
```http
GET /api/kitchen_cooking_engine/ai_recipes/ingredients
```
**Response:**
```json
{
  "ingredients": {
    "proteins": [...],
    "vegetables": [...],
    "grains": [...],
    "dairy": [...]
  }
}
```

### Get Cooking Styles
```http
GET /api/kitchen_cooking_engine/ai_recipes/cooking_styles
```
**Response:**
```json
{
  "cooking_styles": [
    {"id": "quick_and_easy", "name": "Quick And Easy"},
    ...
  ]
}
```

### Generate Recipe Suggestions
```http
POST /api/kitchen_cooking_engine/ai_recipes/generate
Content-Type: application/json

{
  "ingredients": ["chicken_breast", "broccoli", "rice"],
  "cooking_style": "quick_and_easy",
  "appliance_ids": ["ninja_combi_1"],
  "servings": 4,
  "max_time_minutes": 60
}
```
**Response:**
```json
{
  "status": "ok",
  "suggestions": [
    {
      "id": "ai_recipe_1",
      "name": "Garlic Ginger Chicken Stir-Fry",
      "description": "Quick and flavorful...",
      "cook_time_minutes": 25,
      "difficulty": "easy",
      "main_ingredients": ["chicken_breast", "broccoli", "rice"],
      "cuisine_type": "asian",
      "required_appliances": ["stovetop"]
    },
    ...
  ],
  "count": 4
}
```

### Get Recipe Detail
```http
POST /api/kitchen_cooking_engine/ai_recipes/detail
Content-Type: application/json

{
  "suggestion_id": "ai_recipe_1",
  "appliance_ids": ["ninja_combi_1"]
}
```
**Response:**
```json
{
  "status": "ok",
  "detail": {
    "suggestion": {...},
    "ingredients": ["2 lbs chicken breast", "2 cups broccoli florets", ...],
    "instructions": ["Heat oil in large skillet...", ...],
    "tips": ["Don't overcook the broccoli", ...],
    "phases": [
      {
        "mode": "stovetop",
        "temperature_c": 177,
        "temperature_f": 350,
        "duration_minutes": 15,
        "description": "Sauté chicken and vegetables"
      }
    ],
    "use_probe": true,
    "target_temp_c": 74,
    "target_temp_f": 165,
    "servings": 4,
    "prep_time_minutes": 10
  }
}
```

## Technical Architecture

### Backend Components

#### ai_recipe_builder.py
- **AIRecipeBuilder class**: Main orchestrator for AI recipe generation
- **OpenAI integration**: Uses Home Assistant's conversation component
- **Recipe parsing**: Converts AI text responses to structured data
- **UnifiedRecipe conversion**: Transforms AI recipes into system format

#### API Views (api.py)
- **AIRecipeCheckView**: Verify OpenAI availability
- **AIRecipeIngredientsView**: Serve ingredient list
- **AIRecipeCookingStylesView**: Serve cooking styles
- **AIRecipeGenerateView**: Handle recipe generation requests
- **AIRecipeDetailView**: Provide detailed recipe information

### Frontend Components

#### UI Components (panel-class-template.js)
- **_renderAIRecipeBuilder()**: Main container with state routing
- **_renderAIIngredientSelection()**: Ingredient and style selection interface
- **_renderAISuggestions()**: 4-card suggestion grid
- **_renderAIRecipeDetail()**: Full recipe details with instructions

#### State Management
- **_aiIngredients**: Available ingredients by category
- **_aiCookingStyles**: Available cooking style options
- **_aiSelectedIngredients**: Set of selected ingredient IDs
- **_aiSelectedStyle**: Currently selected cooking style
- **_aiSuggestions**: Generated recipe suggestions
- **_aiRecipeDetail**: Detailed recipe information
- **_aiOpenAIAvailable**: OpenAI configuration status

## Prompt Engineering

The AI Recipe Builder uses carefully crafted prompts to ensure high-quality recipe generation:

### Suggestion Prompt Structure
```
You are a professional chef creating recipes for a home kitchen.

Available ingredients: [user selections]
Cooking style: [selected style]
Servings: [count]
Dietary restrictions: [if any]
Maximum cooking time: [if specified]

Available kitchen equipment:
[List of configured appliances with brands/models]

Available cooking features:
[List of available features across all appliances]

Please suggest 4 quite different recipes...
[Specific formatting instructions for JSON response]
```

### Detail Prompt Structure
```
Please provide the complete, detailed recipe for [recipe name].

Include:
1. Full ingredient list with measurements
2. Step-by-step instructions
3. Cooking phases with temperatures and times
4. Helpful tips and tricks
5. Temperature probe usage if applicable

[Specific formatting instructions for JSON response]
```

## Fallback Behavior

When OpenAI is not available or configured:

1. **Frontend**: Shows configuration instructions with link to settings
2. **Backend**: Returns basic fallback recipes:
   - Simple bake/roast option
   - Stir-fry option
   - Air-fry option
   - Slow-cook option

## Cost Considerations

### OpenAI API Costs
- **GPT-4**: ~$0.03-0.06 per request (depends on response length)
- **GPT-3.5-turbo**: ~$0.002-0.004 per request

### Cost Optimization Tips
1. Use GPT-3.5-turbo for everyday recipe generation
2. Reserve GPT-4 for complex or gourmet recipes
3. Cache frequently generated recipes (future enhancement)
4. Set up usage alerts in OpenAI dashboard

## Troubleshooting

### "OpenAI Not Configured" Message
**Solution:** Follow the setup instructions to configure OpenAI conversation integration.

### Recipes Taking Too Long to Generate
**Possible causes:**
- OpenAI API rate limiting
- Network connectivity issues
- Complex prompt requiring more processing time

**Solutions:**
- Wait and try again
- Reduce number of selected ingredients
- Check Home Assistant logs for errors

### Low-Quality Recipe Suggestions
**Solutions:**
- Switch to GPT-4 model for better results
- Be more specific with ingredient selections
- Try different cooking styles
- Ensure your prompt is reaching OpenAI (check conversation integration logs)

### Recipes Not Matching Available Appliances
**Possible causes:**
- Appliances not properly configured
- AI not interpreting appliance features correctly

**Solutions:**
- Verify appliance configuration in Appliances tab
- Check that appliance features are properly set
- Report issue for prompt improvement

## Future Enhancements

Planned features for future releases:

- [x] **Start Cooking from AI Recipe**: Direct integration with cooking sessions (v0.5.1.1)
- [x] **Servings Adjustment**: Scale recipes up or down via portions slider (v0.5.1.5)
- [x] **Recipe History**: Browse previously generated AI recipes in Previous Cooks (v0.5.1.7)
- [ ] **Save to Favorites**: Bookmark AI-generated recipes
- [ ] **Recipe Sharing**: Export and share recipes with other users
- [ ] **Dietary Filters**: Vegetarian, vegan, gluten-free, keto, etc. (cooking styles partially cover this)
- [ ] **Time Constraints**: "I have 30 minutes to cook"
- [ ] **Recipe Refinement**: "Make it spicier" or "Use less oil"
- [ ] **Multi-Course Meals**: Generate appetizer + main + dessert
- [ ] **Ingredient Substitutions**: Suggest alternatives for missing ingredients
- [ ] **Multilingual**: Swedish and English translations (Phase 7)
- [ ] **Measurement conversion**: Convert ingredient quantities between measurement systems (Phase 7)

## Support

For issues, questions, or feature requests:
- **GitHub Issues**: https://github.com/R00S/meater-in-local-haos/issues
- **HACS Forum**: Community support and discussions
- **Home Assistant Community**: Post in the Kitchen Cooking Engine thread

## Credits

- **Integration**: Kitchen Cooking Engine v0.3.5.0
- **AI Provider**: OpenAI (GPT-3.5-turbo, GPT-4)
- **Platform**: Home Assistant
- **License**: MIT (check repository for details)
