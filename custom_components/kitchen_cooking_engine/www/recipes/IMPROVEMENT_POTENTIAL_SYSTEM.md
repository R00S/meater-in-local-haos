This is a set of instruction for the agent to conduct when the user refers to this file, the agents may never edit this file unless specificly intructed to do that
__________________

## New improvement potential system
This is a measurement of how much improvement potential there is to cut files. It is not intended as guidelines for how to improve the cut files, but to rate the files after they are created or improved. The higher the number, the higher potential of improvemnt and thus the files to improve first. So if you are an agent about to improve cut files. Just find the one with the highest number, improve it and return to this paragraph file AFTER you are done with the file to find out how to rate it.

Base rating and thresholds:
- Meat: 3455/8
- Fish and Poultry: 3350/4
- Anything else: 3282/2

Source of trush is the directory structure of meater-in-local-haos/custom_components/kitchen_cooking_engine/www/recipes and the cut files and the cut method files.
- Under recipes folder there are categories, they can be animals, groups of animals or groups of other ingredients. I doesnt contain files, the name and position in the tree is the information itself.
- Under the categories are ingredients level, it can be parts (cuts) of an animal or a specific animal or veg if the category it recides within is a group. It contains the cut files and the leafs (cut-method files)
- Cut files are the ones where the improvement potential resides. They contain genral cooking information and prominent recipes of human origin (never ai created) for the cut. <cut name>.md>
- Cut+method leafs are cooking methods for the cut. "<cut name>-<cooking method name>.md". They include specific information on how to cook that file and recipes.

Reductions:
The reductions are the number that will be deducted if the conditions below are fullfilled. For each instance up to the threshold, that number is deducted. For each instance between the threshold and twice the threshold deduct half that number and for each instance above twice the threshold value deduct 1/4 of the Reduction number.

Apply the threshold separately to each reduction type, not across all instances combined. For recipe and culinary-group reductions, assess the cut file itself and each individual cut-method leaf separately; do not pool all leaves into one recipe or culinary-group count.
* For each cut file (not cut-method leafs). There is in the directory every cut fule gets a reduction of 128
* For each finished cut-method leaf for the cut file, that cut file gets a reduction of 96.
* For each discovered and created stub, but not yet finished cut-method file, the cut file gets a reduction of 8.
* For each recipe verified as human-created in the cut file itself, the cut file gets a reduction of 64. An extra bonus of 32 per culinary group (abcd) represented in that cut file, counted once per group.
* For each recipe verified as human-created in each cut-method leaf, the cut file gets a reduction of 32. An extra bonus of 32 per culinary group (abcd) represented in that leaf, counted once per group per leaf. Calculate these reductions separately for each leaf and deduct them from the cut file's rating.
* For verified culinary prefered temps of the cut - 64
* For safe temps - 32
* For description how the meat behaves and fat renders at different temps for the cut - 96. (max once per language)
* For description how the meat behaves and fat renders at different temps for the cut-method leaf - 32. (max once per language)
* For a specific description of the cut-method, and of the traditions that method is common in — 32 for each leaf that carries that description. (max once per leaf per language)
* Prefered temps for each cut-method file for the cut with discussion on why its specific for that method - 32. (max once per language)

### Measurement clarifications

- **Human-verified recipe** means verified as human-created, not AI-created. For existing recipes, trust prior agents' verification. Internet content and sandbox access may have changed; inability to fetch a source today does not invalidate earlier verification. This does not permit inventing new recipes or source details.
- **Finished leaf** means a leaf has most of the parts that make it useful in the GUI and its recipe research has been concluded. Existing collection and analysis gates and user-approved exceptions still apply. This is a measurement classification, not a declaration that no further improvement is possible.
- **User-approved exceptions** remain in force within their approved scope. Their purpose is to let work move on to other recipes when score walls are hit, rather than repeatedly revisiting settled walls. Preserve them; do not reopen or discard them during reassessment. Where their numerical effect under the new system is not defined, document that separately rather than inventing an adjustment or blocking work on other recipes.
- **Base and threshold.** `Meat: 3455/8` means a **base rating of 3455** with a **threshold of 8** for that category, and likewise `3350/4` and `3282/2`. The number after the slash is a threshold, not a divisor.
- **Thresholds are per leaf.** Each reduction type is tiered inside one cut-method leaf at a time, never against a count pooled across the cut's leaves. One leaf's instances do not use up another leaf's allowance.
- **Leaf-scoped description row.** The reduction for a specific description of the cut-method and the traditions that method is common in is assessed per cut-method leaf: every leaf carrying such a description takes it, once per language. It is not a cut-level row and is never counted once for the whole cut.
- **Behaviour rows need temperature reasoning.** The reductions for describing how the meat behaves and how the fat renders at different temperatures — 96 for the cut, 32 for a leaf — require the text to discuss behaviour at more than one temperature, or to state explicitly that no temperature data exists. A general profile paragraph that never reasons about temperature does not earn either row.
- **Languages count separately.** Where a cut file or a leaf carries the same material in more than one language — English, Swedish, or Danish where present — each language takes the reduction separately. One language never covers another.
- **Final reading:** subtract the applicable reductions from the category base, then round the final result to a whole number. Negative readings are allowed; do not clamp them to zero. No reading means the cut is permanently finished.
