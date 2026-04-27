This is a set of instruction for the agent to conduct when the user refers to this file, the agents may never edit this file unless specificly intructed to do that
__________________

## SESSION START — MANDATORY GATE. DO NOT SKIP. DO NOT TOUCH ANY CUT FILE UNTIL ALL FOUR OUTPUTS BELOW ARE WRITTEN TO YOUR BRANCH TIMELINE FILE.

Open your branch timeline file (`docs/<branch-name-without-prefix>-<A.B.C.x>.md`) and add a section headed `## Session start` containing the following four items. Each item must be written **before** you look at a single cut file. You have to do this even if a former agent have already done it in the file.

---

### Output 1 — Culinary group definitions (verbatim from `RECIPE_COLLECTION_TOR.md`)

Open `docs/recipe_research/RECIPE_COLLECTION_TOR.md` and find the "Culinary group coverage" table under section `### Culinary group coverage`. Copy all four rows word-for-word into your timeline file. The correct rows are:

```
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Indian, Indonesian, Filipino) |
| **Culinary Group B** | North American, Western/Southern/Central European, Australasian (e.g. American, British, French, German, Italian, Spanish, Australian, Greek) |
| **Culinary Group C** | African, Caribbean (with African diaspora influence), Arabic, Levant, Persian/Iranian, non-western Pacific Islands (e.g. Nigerian, Ethiopian, Moroccan, Egyptian, Lebanese, Caribbean, Creole, Turkish) |
| **Culinary Group D** | Scandinavian, Baltic, Slavic, Estern europe, Russia, Ukraine, Caucasus region, Kazakstan, Siberia, Sami, Inuit (e.g. Swedish, Norwegian, Danish, Finnish, Icelandic, Russian, Polish, Georgian, Latvian, Lithuanian, Estonian, Sami, Inuit) |
```

Any paraphrase or wrong country detail is instant evidence the file was not read. The timeline entry must be verbatim.

---

### Output 2 — Analysis gate rule (verbatim from `RECIPE_ANALYSIS_TOR.md`)

Open `docs/recipe_research/RECIPE_ANALYSIS_TOR.md` and find the paragraph near the top that starts "Analysis begins only after…". Copy the exact two sentences word-for-word:

> Analysis begins only after the collection phase (4–6 fully saved source recipes per leaf) is complete. Drawing conclusions from a leaf with incomplete source recipes produces invalid data.

The exact threshold number (4–6) must appear in your timeline entry. A wrong number proves the file was not read.

---

### Output 3 — Source integrity rule (verbatim from `SOURCE_SURVEY.md`)

Open `docs/recipe_research/SOURCE_SURVEY.md` and find the bolded project rule near the top. Copy the exact two sentences word-for-word:

> The rule in this project is: **do not write content you cannot cite to a real URL or a real published book**. Training-data recall of "what a recipe roughly contains" is not an acceptable source. Use web_fetch to verify you can actually read the content.

---

### Output 4 — Your understanding of this file (your own words)

Write 2–4 sentences in your own words covering:
- What the primary task is (what you will do to the 50 cut files)
- What "this is not a race" means in practice for how you will behave
- What to do after step 1 is complete

This is the comprehension check. An answer like "improve cut files quickly and then do CHORES" shows the instructions were not absorbed. An answer like "incrementally improve the 50 lowest-scoring cut files by adding real sourced recipes and following the ToR — stopping or abandoning hard files is wrong, small improvements count, full score is not the goal — then do CHORES.md only after all 50 are done" shows the instructions were understood.

---

**Only after all four outputs exist in the timeline file, proceed to the task below.**

---

1. improve the 8 lowest scoring cut files in docs/recipe_research (also create/improve child cut-method to those cut files if needed). Be very careful with the data integrity, no shortcuts, read the SURVEY and ToR files in the recipe dir and follow them, batching jobs and assuming or guessing may hurt the data quality we are trying to improve. Commit between cut files and then continue with the next one without stopping. IMPORTANT: This is not a race to get high scores, just impoving them a bit but not reaching 20 is fine. Not being maticulate in the research corrupts the data and as well as the scoring system itself, in practice destroying our system instead of improving it. It is an incremental task that will be applied to each cut file many times. Seing full score as doneness is wrong, this will just lead to us having to update the scoring system. Do not abandon started attempt because they are hard, time is not a factor here and the hard files are the most important to improve, small improvements are also improvements. Also adhere to the definition of the culinary groups, dont quess. Dont be conserned if the task does seam to or in fact grows, it will. For example, if you find a new cooking method for the cut or even for the whole system, add it, that significantly improves the quality of our data. Another example, finding only recipes from 2-3 culinary groups is not a reasen to abandon it, its still an incremental improvement that enhances the quality of our data. An example of degrading our data, lowering the quality instead of increasing it (which is the goal of this task) is to guess what a cut or method is called in languages or regions instead of looking it up. If cooking method researched is set to 0, it means that the quality of the research is unknown, there may be missing methods for that cut. Dont set it to 1 unless thorough reserch is done.

Going back to this document for quidelines several times during the process is good practice, agents are prone to talk them out of keeping quality at a higher priority than efficiency.

2. When done with 1 (not before) do CHORES.md
