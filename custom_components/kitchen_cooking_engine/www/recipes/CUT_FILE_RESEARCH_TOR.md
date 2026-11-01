This is a set of instruction for the agent to conduct when the user refers to this file, the agents may never edit this file unless specificly intructed to do that
__________________

## SESSION START — MANDATORY GATE. DO NOT SKIP. DO NOT TOUCH ANY CUT FILE UNTIL ALL FOUR OUTPUTS BELOW ARE WRITTEN TO YOUR BRANCH TIMELINE FILE.

Open your branch timeline file (`docs/<branch-name-without-prefix>-<A.B.C.x>.md`) and add a section headed `## Session start` containing the following four items. Each item must be written **before** you look at a single cut file. You have to do this even if a former agent have already done it in the file.

---

### Output 1 — Culinary group definitions (verbatim from `RECIPE_COLLECTION_TOR.md`)

Open `docs/recipe_research/RECIPE_COLLECTION_TOR.md` and find the "Culinary group coverage" table under section `### Culinary group coverage`. Copy all four rows word-for-word into your timeline file. The correct rows are:

```
|-----------|---------|
| **Culinary Group A** | South Asian, Southeast Asian, East Asian, Mongolian (e.g. Japanese, Chinese, Korean, Thai, Vietnamese, Bengali, Ceylon, Indian, Indonesian, Filipino) |
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

This is the comprehension check. An answer like "improve cut files very thoroughly, using lots of time and tokens, with the goal of quality, not speed" is a correct framing. An answer that mentions speed, efficiency, or doing things quickly shows the instructions were not absorbed — the goal is quality, and using many tokens and a lot of time is expected and correct. An answer like "use real sourced research to thoroughly improve the 8 cut files with the most improvement potential — for each cut file I must actively research cooking methods across culinary traditions and create/improve child cut-method files (four being the floor, not the goal), this will take significant time and that is intentional, stopping or abandoning hard files is wrong, small improvements count, and no number means the work is finished — then do CHORES.md only after all 8 are done" shows the instructions were understood.

---

**Only after all four outputs exist in the timeline file, proceed to the task below.**

---

1. improve the 8 cut files with the most improvement potential in docs/recipe_research, using the highest numbers under the new system in `IMPROVEMENT_POTENTIAL_SYSTEM.md`. Old 0–20 readings are not comparable with new readings: assess the cut files under the new system before ordering the queue, and do not mix scales. The reading selects the file; it never shapes the work. Pick the file from its current number, do the work under the research instructions (`RECIPE_COLLECTION_TOR.md`, `RECIPE_ANALYSIS_TOR.md`, `SOURCE_SURVEY.md`, `HOW_I_INFLATE_CUT_FILES_AND_WHY.md`), and only when that file's work is done open `IMPROVEMENT_POTENTIAL_SYSTEM.md` and rate it. For each cut file, creating and improving its child cut-method files is a **core, mandatory part of the task — not optional, not "if needed"**. The following sub-steps are required for every cut file you work on:

   **a. Research cooking methods for the cut.** Do not assume the `methods:` list in the frontmatter is complete. Actively research what cooking methods are used for this cut across culinary traditions. Use web_fetch and real sources. Only set `cooking_methods_researched: 1` after you have done thorough research — if it is `0`, that means this research has not been done yet and it is your job to do it. Read `RECIPE_COLLECTION_TOR.md` section on method discovery: every serious research session should discover methods not yet listed. The same holds one level up: when research shows the animal or vegetable has a cut the tree does not contain, that cut gets its own cut file and its own leaves (`RECIPE_COLLECTION_TOR.md`, Step 2b). **A cut that is missing from the tree is potential the project has not even counted yet.**

   **b. Create or improve cut-method files.** Every confirmed method — the ones already in the frontmatter and every one your research discovers — is owed a matching `{cut_name}-{method}.md` file. **Four cut-method files is rock bottom, not a target.** Four leaves on a cut that declares four methods has cleared the minimum the system accepts and finished nothing; a cut with several culinary traditions behind it often supports five, six or eight methods, and each of those is a leaf owed. When research turns up a method the frontmatter does not list, register it (step c) and write its leaf in the same pass — that is the most valuable thing this task produces, because it is the only way the tree learns what cooks actually do. **A discovered method is valuable information:** register it and write its leaf regardless of how the reading is computed. A method you confirmed and left out of `methods:` is a false statement about the cut. What to research, create and write comes from the research instructions and the traps — `RECIPE_ANALYSIS_TOR.md` and `RECIPE_COLLECTION_TOR.md` — and from nothing else; the improvement-potential system plays no part in these decisions. Follow those files fully for the structure and content of each method file.

   **c. Update the cut file's `methods:` list** to reflect all confirmed methods after your research.

   Be very careful with the data integrity, no shortcuts, read the SURVEY and ToR files in the recipe dir and follow them, batching jobs and assuming or guessing may hurt the data quality we are trying to improve. Commit between cut files and then continue with the next one without stopping. IMPORTANT: This is not a race to change the number; improving the data a bit is fine. Not being maticulate in the research corrupts the data and as well as the improvement-potential system itself, in practice destroying our system instead of improving it. It is an incremental task that will be applied to each cut file many times. Seeing any number as doneness is wrong; the measurement is an indicator, not an end to the work. Do not abandon started attempt because they are hard, time is not a factor here and the hard files are the most important to improve, small improvements are also improvements. Also adhere to the definition of the culinary groups, dont quess. Dont be conserned if the task does seam to or in fact grows, it will. For example, if you find a new cooking method for the cut or even for the whole system, add it, that significantly improves the quality of our data. Another example, finding only recipes from 2-3 culinary groups is not a reasen to abandon it, its still an incremental improvement that enhances the quality of our data. An example of degrading our data, lowering the quality instead of increasing it (which is the goal of this task) is to guess what a cut or method is called in languages or regions instead of looking it up. If cooking method researched is set to 0, it means that the quality of the research is unknown, there may be missing methods for that cut. Dont set it to 1 unless thorough reserch is done.

Going back to this document for quidelines several times during the process is good practice, agents are prone to talk them out of keeping quality at a higher priority than efficiency.

2. When done with 1 (not before) do CHORES.md
