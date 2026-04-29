# Getting Started — MEATER Probe Cooking

> **Goal:** Install Kitchen Cooking Engine, add your MEATER+ probe, and complete your first
> temperature-guided cook from protein selection to resting.  
> Time required: ~10 minutes.

---

## What you need

- Home Assistant (2024.1.0 or newer)
- HACS installed
- A MEATER or MEATER+ probe **already paired** with Home Assistant via:
  - The official [MEATER integration](https://www.home-assistant.io/integrations/meater/) (recommended), or
  - A Bluetooth proxy exposing the probe as a `sensor.*` entity

If the probe is not yet in HA, set that up first — KCE reads the probe entity that
the MEATER integration creates.

---

## Step 1 — Install Kitchen Cooking Engine

1. In HACS, go to **Integrations** → **⋮ menu** → **Custom repositories**.
2. Add `https://github.com/R00S/meater-in-local-haos` with category **Integration**.
3. Find **Kitchen Cooking Engine** and click **Download**.
4. Restart Home Assistant.

---

## Step 2 — Add your MEATER probe

1. Go to **Settings → Devices & Services → Add Integration**.
2. Search for **Kitchen Cooking Engine** and select it.
3. Choose **MEATER+ Temperature Probe**.
4. Fill in:
   - **Name** — anything you like, e.g. `Kitchen MEATER`
   - **Entity ID** — the `sensor.*` entity your MEATER integration created
     (find it in **Developer Tools → States**, search for your probe)
5. Click **Submit**.

That's all the configuration you need. The panel appears automatically in the HA sidebar
as **Kitchen Cooking Engine**.

---

## Step 3 — Open the panel

Click **Kitchen Cooking Engine** in the sidebar. The welcome screen shows your MEATER
appliance card.

---

## Step 4 — Start your first cook

1. Tap **🍳 Start MEATER Cooking** on your appliance card.
2. **Select Category** — e.g. *Beef*.
3. **Select Cut Type** — e.g. *Steaks*.
4. **Select Cut** — e.g. *Ribeye Steak* (⭐ marks the recommended pick for this cut type).
5. **Select Doneness** — e.g. *Medium-Rare*.
6. **Choose Cooking Method** — e.g. *Pan Sear*.
7. Review the summary and tap **Start Cook**.

KCE now monitors your probe live. The monitor screen shows:
- Current internal temperature
- Target temperature with a progress bar
- Estimated time remaining (ETA)
- Ambient (air) temperature

---

## Step 5 — Rest and complete

When the probe reaches your target temperature KCE alerts you and starts a rest timer.
Wait for the timer to count down (rest time is pre-set per cut), then tap **Complete Cook**.

The cook is saved to your **Cook History** with all temperatures and timings.

---

## What's next?

| Feature | Where to go |
|---------|------------|
| Cut profiles and recipe links | § 5.9 in [USER_GUIDE.md](USER_GUIDE.md) |
| Safety temperature indicators | § 5.8 in [USER_GUIDE.md](USER_GUIDE.md) |
| Cook history and notes | § 11 in [USER_GUIDE.md](USER_GUIDE.md) |
| Cook without a specific cut (vegetables, fish) | § 5.4 Custom Temperature Cook |
