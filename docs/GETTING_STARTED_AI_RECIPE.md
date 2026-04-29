# Getting Started — AI Recipe Builder

> **Goal:** Install Kitchen Cooking Engine, add an appliance (custom or pre-configured),
> connect an AI agent, and generate your first AI recipe.  
> Time required: ~15 minutes.

---

## What you need

- Home Assistant (2024.1.0 or newer)
- HACS installed
- A conversation integration already set up in HA — one of:
  - **OpenAI** (`conversation.openai_*`)
  - **Ollama** (`conversation.ollama_*`)
  - **Google Generative AI** (`conversation.google_generative_ai_*`)
  - Any other HA conversation agent

If you have not set up a conversation integration yet, do that first.  
Then come back here.

---

## Step 1 — Install Kitchen Cooking Engine

1. In HACS, go to **Integrations** → **⋮ menu** → **Custom repositories**.
2. Add `https://github.com/R00S/meater-in-local-haos` with category **Integration**.
3. Find **Kitchen Cooking Engine** and click **Download**.
4. Restart Home Assistant.

---

## Step 2 — Add an appliance

Go to **Settings → Devices & Services → Add Integration → Kitchen Cooking Engine**.

Choose the appliance you cook on:

| I have… | Choose |
|---------|--------|
| A Ninja Combi SFP700EU | **Ninja Combi SFP700EU** — no extra fields needed |
| A standard oven | **Standard Oven** — optionally tick convection/grill |
| A stovetop / hob | **Stovetop** |
| Anything else (Instant Pot, air fryer, BBQ, etc.) | **Custom Appliance** |

**If you chose Custom Appliance**, fill in:
- **Name** — e.g. `Instant Pot 6qt` or `Kamado Joe`
- **Description** — one line about the appliance (e.g. `Electric pressure cooker, 6 litre`).
  The AI uses this to tailor programme steps and temperatures.

Click **Submit**. The panel appears in the HA sidebar as **Kitchen Cooking Engine**.

---

## Step 3 — Find your AI Agent ID

1. Go to **Developer Tools → States**.
2. In the filter box, type `conversation.`.
3. You will see entities like `conversation.openai_chatgpt` or `conversation.ollama_llama3`.
4. Copy the full entity ID of the agent you want to use.

---

## Step 4 — Configure AI settings in KCE

1. Open the **Kitchen Cooking Engine** panel from the sidebar.
2. Tap your appliance card (e.g. the Ninja Combi card or your custom appliance card).
3. Tap **🤖 Create AI Recipe**.
4. Tap **⚙️ AI Settings**.
5. Paste your Agent ID into the **AI Agent ID** field.
6. *(Optional)* Add a **Backup Agent ID** for failover.
7. Tap **Save Settings**.

---

## Step 5 — Generate your first recipe

1. Tap **🤖 Create AI Recipe** again (or it may return to the ingredient screen directly).

2. **Select Ingredients**
   - Pick at least 2 ingredients from the grid by tapping them.
   - Optionally filter by cuisine / region first.
   - Tap any ingredient badge to mark it ⭐ Compulsory (the AI must use it).

3. Tap **Next: Choose Cooking Style**.

4. **Choose Cooking Style**
   - Pick a style (e.g. *Quick & Easy* or *Comfort Food*).
   - Adjust the sliders:
     - **Complexity** — start at 2 for a straightforward result.
     - **Portions** — set to your household size.
     - **Max Time** — leave unrestricted for your first try.

5. Tap **Generate Recipes 🤖**.

KCE sends your selections to the AI and shows up to three recipe cards (usually within
10–30 seconds).

---

## Step 6 — Start cooking

1. Read the recipe cards. Each shows name, description, cook time, and key ingredients.
2. Tap **Start Cooking This Recipe** on the one you want.
3. KCE fetches the full step-by-step recipe from the AI.
4. Follow the on-screen steps. The panel guides you through each stage, including timers.

Your completed cook is saved to **Cook History**.

---

## What's next?

| Feature | Where to go |
|---------|------------|
| Full AI builder options | § 7 in [USER_GUIDE.md](USER_GUIDE.md) |
| Step-by-step cook flow details | § 8 in [USER_GUIDE.md](USER_GUIDE.md) |
| Adding a MEATER probe as a cook subprocess | § 8.4 in [USER_GUIDE.md](USER_GUIDE.md) |
| Ninja Combi built-in programmes | § 6.1 in [USER_GUIDE.md](USER_GUIDE.md) |
| Cook history and rating | § 11 in [USER_GUIDE.md](USER_GUIDE.md) |
