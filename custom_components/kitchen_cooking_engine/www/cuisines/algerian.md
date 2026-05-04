---
KCE: CUISINE
id: algerian
name: Algerian
name_sv: "Algeriskt"
icon: 🇩🇿
region: african
region_name: "African"
region_icon: 🌍
description: "Algerian cuisine blends Berber, Arab, Ottoman, and French influences, with couscous as the UNESCO-recognised national dish, lamb as the defining protein, and a rich tradition of semolina breads, aromatic ras el hanout spice blends, and the iconic Deglet Nour dates of the Saharan south."
description_sv: "Algerisk mat är en blandning av berbisk, arabisk, osmansk och fransk matkultur, med couscous som UNESCO-erkänd nationalrätt, lamm som det viktigaste proteinet och en rik tradition av semulebröd, aromatiska ras el hanout-kryddblandningar och de ikoniska Deglet Nour-dadlarna från den saharariska södern."
research_done: 1
---

## Research notes

Research completed. All 15 pairs researched individually using web searches (Arabic and English).
Sources: FAO FAOSTAT food balance sheets, USDA Algeria grain reports, Algeria agriculture Wikipedia/FAO data,
Our World in Data meat/dairy supply per capita, International Olive Council statistics, ONIL dairy agency data.


## Proteins

### Proteins — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "most famous Algerian dishes iconic traditional food culture" -->

- {id: lamb, grade: signature, rating: 9, name: "Lamb", name_sv: "Lamm", notes: "THE defining protein of Algerian cuisine; central to couscous (national dish), mechoui (spit-roasted), tajine, chorba, and lham lahlou (festive sweet lamb with prunes and almonds)"}
- {id: chicken, grade: signature, rating: 8, name: "Chicken", name_sv: "Kyckling", notes: "Used in rechta (festive noodle dish), tajine zitoune (with olives), chorba soup, and couscous; one of the most prominent proteins across all regions"}
- {id: chickpeas, grade: signature, rating: 8, name: "Chickpeas", name_sv: "Kikärtor", notes: "Inseparable from couscous and rechta; also in chorba soup; a core protein-legume in Algerian cuisine identity"}
- {id: merguez, grade: signature, rating: 7, name: "Merguez Sausage", name_sv: "Merguezkorv", notes: "Iconic spiced lamb/beef sausage of North Africa; grilled and served with couscous or as street food; emblematic of Algerian street food culture"}
- {id: minced_lamb_beef, grade: signature, rating: 6, name: "Minced lamb", name_sv: "Malet lamm", notes: "also minced beef used in modern preparations; Used in bourek (fried pastry rolls), dolma (stuffed vegetables), and mhadjeb; essential filling ingredient across many traditional preparations"}
- {id: beef, grade: signature, rating: 5, name: "Beef", name_sv: "Nötkött", notes: "Used in chakhchoukha (eastern regional dish with torn flatbread) and dolma; less prominent than lamb but present across many regional dishes"}
- {id: eggs, grade: signature, rating: 4, name: "Eggs", name_sv: "Ägg", notes: "Used in bourek filling and various Algerian pastries and starters; a common protein element in everyday cooking"}
- {id: broad_beans, grade: signature, rating: 3, name: "Broad Beans", name_sv: "Bondbönor", notes: "Fava; Traditional Berber ingredient; used in soups and stews especially in Kabylie and Constantine regions; one of the oldest cultivated legumes in North Africa"}
- {id: sardines_sig, grade: signature, rating: 2, name: "Sardines", name_sv: "Sardiner", notes: "Iconic fish of the Algerian Mediterranean coast; grilled (sardines grillées) are a beloved coastal street food in Algiers, Oran, and Bejaia"}
- {id: lentils_sig, grade: signature, rating: 1, name: "Lentils", name_sv: "Linser", notes: "Used in harira-style soups and traditional Ramadan dishes; an important everyday legume across Algeria"}

### Proteins — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Algeria meat consumption per capita FAO food balance sheet statistics" -->

- {id: broiler_chicken_bulk, grade: bulk, rating: 9, name: "Broiler Chicken", name_sv: "Broilerkyckling", notes: "FAOSTAT/Our World in Data: poultry is the #1 most consumed meat in Algeria; total meat supply ~30–35 kg/capita/year with poultry the predominant share"}
- {id: lamb_mutton_bulk, grade: bulk, rating: 8, name: "Lamb", name_sv: "Lamm", notes: "also mutton; Algeria among Africa's leading sheep producers; Second most consumed meat by volume per FAO food balance data; Algeria is among Africa's leading sheep producers, sheep farming is widespread"}
- {id: eggs_bulk, grade: bulk, rating: 7, name: "Chicken Eggs", name_sv: "Kycklingägg", notes: "Consumed in high volumes daily; poultry and egg production is a major agricultural sector in Algeria; widely used in cooking and eaten at breakfast"}
- {id: beef_bulk, grade: bulk, rating: 6, name: "Beef", name_sv: "Nötkött", notes: "Third most consumed meat by volume per FAO food balance; cattle are raised for both beef and dairy across the Tell Atlas and northern regions"}
- {id: chickpeas_bulk, grade: bulk, rating: 5, name: "Chickpeas", name_sv: "Kikärtor", notes: "Highest-volume legume consumed; essential in couscous, rechta, chorba — consumed multiple times per week across nearly all households"}
- {id: sardines_bulk, grade: bulk, rating: 4, name: "Sardines", name_sv: "Sardiner", notes: "Most consumed fish species in Algeria; cheap, widely available along the Mediterranean coast; also canned and exported"}
- {id: lentils_bulk, grade: bulk, rating: 3, name: "Lentils", name_sv: "Linser", notes: "Second most consumed legume after chickpeas; widely used in soups, stews, and Ramadan dishes; affordable staple protein"}
- {id: goat_meat, grade: bulk, rating: 2, name: "Goat Meat", name_sv: "Getkött", notes: "Significant consumption especially in arid and semi-arid inland areas; Algeria has large goat herds raised primarily for meat and milk"}
- {id: tuna_bulk, grade: bulk, rating: 1, name: "Atlantic Bluefin Tuna", name_sv: "Atlantisk blåfenad tonfisk", notes: "Caught in Algerian Mediterranean waters; consumed fresh along coast and canned; tuna is the most commercially significant large fish in Algerian fisheries"}

### Proteins — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Algeria livestock farming fishing industry animals raised produced" -->

- {id: ouled_djellal_sheep, grade: local, rating: 9, name: "Ouled Djellal Sheep", name_sv: "Ouled Djellal-får", notes: "Algeria's most famous sheep breed, native to the Saharan steppe; prized for fine wool and meat; Algeria is among Africa's top sheep producers with millions raised domestically"}
- {id: local_goat, grade: local, rating: 8, name: "Algerian Local Goat", name_sv: "Algerisk lokalt get", notes: "Raised extensively in arid and semi-arid regions; valued for milk, meat, and hides; well-adapted to the harsh plateau and Saharan conditions"}
- {id: dromedary_camel, grade: local, rating: 7, name: "Dromedary Camel", name_sv: "Dromedar", notes: "Raised in Saharan regions for meat and milk; camel meat is traditional in southern Algerian communities; camel milk is consumed locally"}
- {id: local_cattle, grade: local, rating: 6, name: "Algerian Cattle", name_sv: "Algerskt nötkreatur", notes: "Raised in the Tell Atlas and coastal north for beef and milk; domestic cattle herd produces ~2.5 million MT of milk per year (ONIL)"}
- {id: local_chicken, grade: local, rating: 5, name: "Local Broiler Chicken", name_sv: "Lokal broilerkyckling", notes: "Major agricultural sector; Algeria has a large domestic poultry industry supplying both broilers and laying hens; key contributor to meat and egg supply"}
- {id: sardine_local, grade: local, rating: 4, name: "European Pilchard", name_sv: "Europeisk sardin", notes: "Sardine; Sardina pilchardus; dominant pelagic species in Algerian Mediterranean catch; most important fish by volume in national fisheries"}
- {id: mackerel_local, grade: local, rating: 3, name: "Atlantic Mackerel", name_sv: "Makrill", notes: "Second most important pelagic species caught off Algerian coast; widely consumed fresh and smoked in coastal cities"}
- {id: european_anchovy, grade: local, rating: 2, name: "European Anchovy", name_sv: "Europeisk ansjovis", notes: "Engraulis encrasicolus; caught in Algerian Mediterranean waters; used fresh, dried, and salted; important in coastal cuisine"}
- {id: gilthead_sea_bream, grade: local, rating: 1, name: "Gilthead Sea Bream", name_sv: "Havsruda", notes: "Sparus aurata; caught wild and increasingly farmed in aquaculture along Algerian coast; popular fish in northern Algerian markets and restaurants"}


## Produce

### Produce — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "most famous Algerian dishes vegetables fruits iconic traditional cuisine" -->

- {id: deglet_nour_dates, grade: signature, rating: 9, name: "Deglet Nour Dates", name_sv: "Deglet Nour-dadlar", notes: "The iconic Algerian date variety from the Biskra and Oued Souf regions; UNESCO-associated; used at iftar (Ramadan), in lham lahlou (sweet lamb), and eaten as a daily snack; culturally as important as couscous"}
- {id: tomatoes_sig, grade: signature, rating: 8, name: "Tomatoes", name_sv: "Tomater", notes: "Essential in chorba (Ramadan soup), chakhchoukha stew, hmiss and mechouia salads, and as the base of countless Algerian stews; central to modern Algerian cooking identity"}
- {id: onion_sig, grade: signature, rating: 8, name: "Onion", name_sv: "Lök", notes: "Foundational aromatic in virtually every Algerian dish; base of chorba, couscous broth, tajine, and all slow-cooked stews; indispensable in the Algerian kitchen"}
- {id: zucchini, grade: signature, rating: 7, name: "Zucchini", name_sv: "Zucchini", notes: "Courgette; One of the classic vegetables in couscous and dolma (stuffed vegetables); common in festive couscous preparations alongside carrots and chickpeas"}
- {id: bell_pepper, grade: signature, rating: 6, name: "Bell Pepper", name_sv: "Paprika", notes: "Key ingredient in mhadjeb filling, hmiss (grilled pepper-tomato salad), mechouia roasted salad, and dolma stuffed vegetables; represents Algerian flavour profile"}
- {id: carrot_sig, grade: signature, rating: 5, name: "Carrot", name_sv: "Morot", notes: "Standard vegetable in couscous alongside zucchini and turnips; also in chorba; one of the most consumed vegetables per FAO Algeria data"}
- {id: eggplant, grade: signature, rating: 4, name: "Eggplant", name_sv: "Aubergine", notes: "Aubergine; Used in mechouia roasted salad and various tagines; common in Algerian vegetable preparations; part of the broader North African produce palette"}
- {id: prunes, grade: signature, rating: 3, name: "Prunes", name_sv: "Katrinplommon", notes: "Key fruit in lham lahlou (festive sweet-and-savory lamb dish) alongside apricots and almonds; used in festive tagines for Ramadan and Eid"}
- {id: pumpkin, grade: signature, rating: 2, name: "Pumpkin", name_sv: "Pumpa", notes: "also winter squash; traditional in western and southern Algerian couscous; Traditional vegetable in couscous particularly in western and southern Algerian regions; adds sweetness and body to the broth"}
- {id: turnip_sig, grade: signature, rating: 1, name: "Turnip", name_sv: "Rova", notes: "Used in rechta (noodle dish with chicken) and some regional couscous variations; an older traditional vegetable in northern Algerian cooking"}

### Produce — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Algeria most consumed vegetables per capita statistics food survey" -->

- {id: tomatoes_bulk, grade: bulk, rating: 9, name: "Tomatoes", name_sv: "Tomater", notes: "Most consumed vegetable in Algeria; ~1.3 million tonnes local production (FAO 2018); total vegetable supply ~206 kg/capita/year (worldpopulationreview.com citing FAO); tomatoes are documented as the top consumed vegetable"}
- {id: potatoes_bulk, grade: bulk, rating: 9, name: "Potatoes", name_sv: "Potatis", notes: "Very high volume: ~4.6 million tonnes local production (FAO 2018, world 17th); key starchy vegetable; featured in maakouda (fried potato cakes), tajines, and dolma"}
- {id: onions_bulk, grade: bulk, rating: 8, name: "Onions", name_sv: "Lök", notes: "~1.4 million tonnes production (FAO 2018, world 16th); one of the highest-volume vegetables by consumption; base ingredient across all Algerian cooking"}
- {id: watermelon_bulk, grade: bulk, rating: 7, name: "Watermelon", name_sv: "Vattenmelon", notes: "~2 million tonnes production (FAO 2018, world 6th); hugely consumed in summer months; major local crop especially from Biskra and southern regions"}
- {id: carrots_bulk, grade: bulk, rating: 6, name: "Carrots", name_sv: "Morötter", notes: "~431,000 tonnes production (FAO 2018); widely consumed as a couscous vegetable, in soups, and raw; among top consumed vegetables per FAO Algeria food balance"}
- {id: peppers_bulk, grade: bulk, rating: 5, name: "Bell & Chili Peppers", name_sv: "Paprika och chili", notes: "~651,000 tonnes production (FAO 2018); widely consumed fresh, roasted (hmiss, mechouia), and stuffed (dolma); high-volume vegetable in Algerian markets"}
- {id: oranges_bulk, grade: bulk, rating: 4, name: "Oranges", name_sv: "Apelsiner", notes: "~1.1 million tonnes production (FAO 2018, world 14th); most consumed citrus fruit; widely eaten fresh and as juice, particularly in the north"}
- {id: dates_bulk, grade: bulk, rating: 3, name: "Dates", name_sv: "Dadlar", notes: "~1 million tonnes production (FAO 2018, world 4th); consumed daily especially in southern Algeria and during Ramadan; also exported and processed into syrup"}
- {id: zucchini_bulk, grade: bulk, rating: 2, name: "Zucchini", name_sv: "Zucchini", notes: "Widely consumed as standard couscous vegetable; grown throughout Algeria; consumed at very high frequency in weekly family meals"}
- {id: apricots_bulk, grade: bulk, rating: 1, name: "Apricots", name_sv: "Aprikoser", notes: "~242,000 tonnes production (FAO 2018, world 4th); consumed fresh and dried; used in festive lamb dishes; Algeria is one of the world's top apricot producers"}

### Produce — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Algeria agriculture crops grown vegetables fruits locally produced FAO" -->

- {id: dates_local, grade: local, rating: 9, name: "Deglet Nour Dates", name_sv: "Deglet Nour-dadlar", notes: "Local; World 4th largest producer (~1 million tonnes, FAO 2018); grown in Biskra, Oued Souf, Ghardaïa, and Ziban oases; Deglet Nour is the premium variety; major export commodity"}
- {id: olives_local, grade: local, rating: 9, name: "Olives", name_sv: "Oliver", notes: "World 6th largest olive producer (~860,000 tonnes, FAO 2018); main varieties Chemlal, Sigoise, Rougette grown in Kabylie, Tlemcen, and Chlef; both table olives and oil production"}
- {id: watermelon_local, grade: local, rating: 8, name: "Watermelon", name_sv: "Vattenmelon", notes: "World 6th largest producer (~2 million tonnes, FAO 2018); major growing region is Biskra in the south; desert farming innovation has made Algeria a significant producer"}
- {id: potatoes_local, grade: local, rating: 7, name: "Potatoes", name_sv: "Potatis", notes: "~4.6 million tonnes local production (world 17th, FAO 2018); grown widely in northern plains; a major locally produced starchy crop"}
- {id: artichoke_local, grade: local, rating: 6, name: "Artichoke", name_sv: "Kronärtskocka", notes: "World 5th largest artichoke producer (~124,000 tonnes, FAO 2018); traditional Mediterranean crop grown in northern coastal Algeria; used in local tagines"}
- {id: figs_local, grade: local, rating: 5, name: "Figs", name_sv: "Fikon", notes: "World 4th largest fig producer (FAO 2018); grown in Kabylie, Bejaia, and Tizi Ouzou; eaten fresh and dried; wild fig trees also foraged in mountain areas"}
- {id: apricots_local, grade: local, rating: 4, name: "Apricots", name_sv: "Aprikoser", notes: "World 4th largest apricot producer (~242,000 tonnes, FAO 2018); major production in Blida, Médéa, and Sétif; consumed fresh and dried locally"}
- {id: grapes_local, grade: local, rating: 3, name: "Grapes", name_sv: "Druvor", notes: "~502,000 tonnes production (FAO 2018); grown in northern Algeria (Médéa, Mascara, Tlemcen); table grapes widely consumed; raisin production also significant"}
- {id: tomatoes_local, grade: local, rating: 2, name: "Tomatoes", name_sv: "Tomater", notes: "~1.3 million tonnes local production (FAO 2018, world 18th); grown throughout northern Algeria and increasingly in Biskra and Adrar desert regions"}
- {id: onions_local, grade: local, rating: 1, name: "Onions", name_sv: "Lök", notes: "~1.4 million tonnes local production (FAO 2018, world 16th); grown throughout the northern tell; a major domestically produced vegetable crop"}


## Grains & Starches

### Grains & Starches — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Algeria iconic traditional grain starch dishes bread semolina culture" -->

- {id: couscous_semolina, grade: signature, rating: 9, name: "Couscous", name_sv: "Couscous", notes: "Durum Semolina; THE national dish of Algeria; UNESCO Intangible Cultural Heritage (2020); hand-rolled durum wheat semolina granules steamed over meat-vegetable broth; eaten on Fridays and all celebrations; the single most iconic Algerian food"}
- {id: durum_semolina, grade: signature, rating: 8, name: "Durum Wheat Semolina", name_sv: "Durumvetegryn", notes: "The foundational grain ingredient of Algerian cuisine; used in couscous, kesra flatbread, rechta noodles, mhadjeb, chakhchoukha, and baghrir; Algeria grows and imports vast quantities"}
- {id: kesra_bread, grade: signature, rating: 7, name: "Kesra", name_sv: "Kesra", notes: "Traditional round griddle bread made from semolina; served daily with olive oil, stews, and tagines; two varieties: Kesra Matlou (leavened/thicker) and Kesra Rakhsis (unleavened/thinner); culturally essential"}
- {id: rechta_noodles, grade: signature, rating: 6, name: "Rechta Noodles", name_sv: "Rechta-nudlar", notes: "Fine hand-rolled semolina noodles; hallmark of the Algiers region; served in a white chicken and chickpea broth scented with cinnamon; made for celebrations and Eid"}
- {id: rougag_flatbread, grade: signature, rating: 5, name: "Rougag", name_sv: "Rougag", notes: "Crisp thin semolina crepe torn into pieces for chakhchoukha; essential to this eastern Algerian dish from Biskra and Constantine; also called marqa bread"}
- {id: mhadjeb_bread, grade: signature, rating: 4, name: "Mhadjeb", name_sv: "Mhadjeb", notes: "Thin semolina flatbread folded around a spiced tomato-onion-pepper filling; iconic Algerian street food widely sold in cities; deeply embedded in urban food culture"}
- {id: baghrir, grade: signature, rating: 3, name: "Baghrir", name_sv: "Baghrir", notes: "Soft semolina pancakes with a sponge-like surface of tiny holes; eaten for breakfast with honey and butter, or during Ramadan; a beloved traditional preparation"}
- {id: tamina, grade: signature, rating: 2, name: "Tamina", name_sv: "Tamina", notes: "Semolina Dessert; Toasted semolina mixed with honey and butter; traditional celebratory preparation for births, circumcisions, and other joyous occasions; an ancient Berber preparation"}
- {id: khobz_bread, grade: signature, rating: 1, name: "Khobz", name_sv: "Khobz", notes: "Everyday homemade round leavened bread; served at every meal; distinct from French baguette though both are consumed; essential daily staple throughout Algeria"}

### Grains & Starches — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Algeria wheat barley consumption per capita cereal production statistics FAO" -->

- {id: wheat_flour, grade: bulk, rating: 9, name: "Wheat Flour", name_sv: "Vetemjöl", notes: "Highest volume consumed cereal product in Algeria; total wheat consumption 11.35 million MT/year for 2024/25 (USDA report); per capita wheat consumption among highest in North Africa at ~200–250 kg/year; heavily government-subsidized bread"}
- {id: durum_semolina_bulk, grade: bulk, rating: 8, name: "Durum Wheat Semolina", name_sv: "Durumvetegryn", notes: "Second highest cereal volume; consumed as couscous, kesra, rechta, mhadjeb; Algeria processes large volumes of durum semolina domestically from both local and imported durum wheat"}
- {id: potatoes_grain, grade: bulk, rating: 7, name: "Potatoes", name_sv: "Potatis", notes: "~4.6 million tonnes local production (FAO 2018); the dominant starchy vegetable consumed alongside bread; featured in maakouda, tajines, and as a side dish"}
- {id: baguette_bread, grade: bulk, rating: 6, name: "Baguette", name_sv: "Baguette", notes: "A legacy of French colonisation (1830–1962); consumed in enormous quantities daily; Algeria is one of the world's largest baguette consumers per capita; sold from thousands of boulangeries nationwide"}
- {id: rice_bulk, grade: bulk, rating: 5, name: "Rice", name_sv: "Ris", notes: "Consumed in significant volumes; used in dolma (stuffed vegetables), rice pilafs, and as a side dish; predominantly imported; second starchy grain after wheat/semolina in Algerian diets"}
- {id: vermicelli, grade: bulk, rating: 4, name: "Vermicelli Pasta", name_sv: "Vermicelli-pasta", notes: "Used in chorba frik (Ramadan soup) and other soups; widely consumed; Algeria produces and imports pasta; vermicelli in chorba is consumed by virtually every household during Ramadan"}
- {id: barley_bulk, grade: bulk, rating: 3, name: "Barley", name_sv: "Korn", notes: "~1.9 million tonnes production (FAO 2018); primarily used for animal feed but also in traditional Berber soups and breads (khobz echar); locally grown and consumed in rural areas"}
- {id: couscous_product, grade: bulk, rating: 2, name: "Packaged Couscous", name_sv: "Förpackad couscous", notes: "Pre-processed couscous is consumed multiple times per week by the majority of Algerian households; one of the highest-volume processed grain products in the national market"}
- {id: frik, grade: bulk, rating: 1, name: "Frik", name_sv: "Frik", notes: "Green Durum Wheat; Roasted unripe durum wheat; traditional Algerian ingredient especially in chorba frik soup; locally grown and processed; a distinctively Algerian cereal product"}

### Grains & Starches — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Algeria wheat barley cereal production local crops FAO agriculture" -->

- {id: durum_wheat_local, grade: local, rating: 9, name: "Durum Wheat", name_sv: "Durumvete", notes: "Main locally grown cereal crop; ~3 million MT production forecast 2024/25 (USDA); grown across the High Plateaus and Tell Atlas; the basis of Algeria's semolina and couscous industry"}
- {id: barley_local, grade: local, rating: 8, name: "Barley", name_sv: "Korn", notes: "Second main cereal crop; ~1.2–1.9 million MT local production (USDA/FAO); grown on over 1 million hectares; adapted to dryland farming; used in animal feed and traditional Berber breads"}
- {id: bread_wheat_local, grade: local, rating: 7, name: "Common Wheat", name_sv: "Vanligt vete", notes: "Grown locally alongside durum; significant domestic production though Algeria still imports the majority of bread wheat to meet the ~11 million MT annual consumption demand"}
- {id: potatoes_local_grain, grade: local, rating: 6, name: "Potatoes", name_sv: "Potatis", notes: "~4.6 million tonnes local production (FAO 2018); grown across northern plains; Algeria is world 17th largest producer; a major domestically produced starchy crop"}
- {id: frik_local, grade: local, rating: 5, name: "Frik", name_sv: "Frik", notes: "Uniquely Algerian product made from locally harvested unripe durum wheat that is fire-roasted; grown and processed in the northern cereal belt; a traditional harvest-season product"}
- {id: maize_local, grade: local, rating: 4, name: "Maize", name_sv: "Majs", notes: "Produced locally in smaller quantities; growing in irrigated areas especially in the south; Algeria is expanding corn production as part of the 2020–2024 Agricultural Roadmap to reduce cereal imports"}
- {id: oats_local, grade: local, rating: 3, name: "Oats", name_sv: "Havre", notes: "Produced in smaller quantities in northern Algeria; used primarily as animal feed; traditional use in some regional breads and porridges in Berber-speaking areas"}
- {id: sorghum_local, grade: local, rating: 2, name: "Sorghum", name_sv: "Sorghum", notes: "Grown in southern Algeria and Saharan oasis areas; drought-resistant crop adapted to arid conditions; used in traditional southern Algerian cuisine (aseeda porridge)"}
- {id: sugar_beet_local, grade: local, rating: 1, name: "Sugar Beet", name_sv: "Sockerbeta", notes: "Grown as part of Algeria's strategy to reduce sugar imports; production encouraged under the 2020–2024 Agricultural Roadmap; locally processed into sugar"}


## Dairy, Oils & Sauces

### Dairy, Oils & Sauces — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Algerian cuisine iconic dairy olive oil traditional sauces harissa chermoula" -->

- {id: olive_oil_sig, grade: signature, rating: 9, name: "Olive Oil", name_sv: "Olivolja", notes: "Foundational fat in Algerian cuisine; used for sautéing, salad dressings, drizzling on bread and couscous; particularly prized in Kabylie and northern coastal regions; Algeria is world 6th largest olive producer"}
- {id: harissa, grade: signature, rating: 8, name: "Harissa", name_sv: "Harissa", notes: "Iconic North African spiced chili paste made from dried red chilies, garlic, olive oil, cumin, coriander, and caraway; used as a table condiment, stirred into couscous, and as a marinade; essential to the Algerian flavour identity"}
- {id: smen, grade: signature, rating: 7, name: "Smen", name_sv: "Smen", notes: "Preserved Fermented Butter; Traditional preserved clarified butter aged for months in clay pots; used to finish couscous and other dishes; pungent, nutty flavour; a distinctively Algerian and Berber dairy product"}
- {id: lben, grade: signature, rating: 6, name: "Lben", name_sv: "Lben", notes: "Fermented Buttermilk; Traditional naturally fermented milk drink; served alongside couscous, tagines, and spicy food to cool the palate; deeply rooted in Berber and Arab Algerian food culture; made from cow, goat, or sheep milk"}
- {id: chermoula, grade: signature, rating: 5, name: "Chermoula", name_sv: "Chermoula", notes: "Herb Marinade; Bright green herb-based marinade of parsley, cilantro, garlic, olive oil, lemon, cumin, and paprika; the classic Algerian marinade for fish and grilled meats; widely used along the Mediterranean coast"}
- {id: mechouia_sauce, grade: signature, rating: 4, name: "Mechouia Sauce", name_sv: "Mechouia-sås", notes: "Roasted and pounded tomatoes, peppers, and garlic with olive oil; served as salad-sauce alongside grilled meats and fish; one of the most recognised Algerian condiments"}
- {id: tomato_sauce_sig, grade: signature, rating: 3, name: "Marqa sauce", name_sv: "Marqa-sås", notes: "tomato, onion and spice cooking base used in Algerian stews; Rich tomato, onion, and spice sauce base used in chakhchoukha, dolma, and numerous Algerian stews; called marqa or tfina; the backbone of everyday Algerian home cooking"}
- {id: raib, grade: signature, rating: 2, name: "Raïb", name_sv: "Raïb", notes: "Naturally set fermented milk; slightly tangy and creamy; served as a dessert or refreshment; a traditional Algerian dairy product distinct from industrial yogurt; made from whole cow or goat milk"}
- {id: jben, grade: signature, rating: 1, name: "Jben", name_sv: "Jben", notes: "Fresh White Cheese; Soft fresh cheese made from cow or goat milk; mild flavour; eaten with bread for breakfast or used in pastries; a traditional Algerian dairy product present in all regions"}

### Dairy, Oils & Sauces — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Algeria dairy consumption statistics milk olive oil per capita FAO food balance" -->

- {id: pasteurized_milk, grade: bulk, rating: 9, name: "Pasteurized Milk", name_sv: "Pastöriserad mjölk", notes: "Highest volume dairy product in Algeria; ~147 kg milk equivalent per capita per year (ONIL/FAOSTAT 2023); most sold milk is reconstituted from imported powder; second most consumed staple after cereals; heavily government-subsidized"}
- {id: vegetable_oil_bulk, grade: bulk, rating: 8, name: "Refined Vegetable Oil", name_sv: "Raffinerad vegetabilisk olja", notes: "Sunflower/Soybean; Highest-volume cooking fat consumed; sunflower and blended vegetable oils dominate home cooking in Algeria; widely used due to lower cost than olive oil; imported in large quantities"}
- {id: butter_bulk, grade: bulk, rating: 7, name: "Butter", name_sv: "Smör", notes: "Widely consumed for baking, cooking, and spreading on bread (especially baguette); significant consumption; Algeria imports substantial amounts of butter; used daily in most households"}
- {id: lben_bulk, grade: bulk, rating: 6, name: "Lben", name_sv: "Lben", notes: "Fermented Buttermilk; Second most consumed dairy product after fresh milk; dairy sector data confirms lben is consumed daily by a large proportion of the Algerian population as a traditional drink and accompaniment to meals"}
- {id: processed_cheese, grade: bulk, rating: 5, name: "Processed Cheese", name_sv: "Processad ost", notes: "La Vache qui rit style; Iconic imported processed cheese triangles are extremely popular in Algeria; consumed at breakfast especially by children; one of the most recognised packaged dairy products in the country; very high volume consumption"}
- {id: tomato_paste_bulk, grade: bulk, rating: 4, name: "Tomato Paste", name_sv: "Tomatpuré", notes: "Double Concentrate; Consumed in very high volumes as base for stews, sauces, and chorba; industrially produced and imported; a near-daily pantry item in Algerian homes; central to modern Algerian cooking"}
- {id: harissa_bulk, grade: bulk, rating: 3, name: "Harissa Paste", name_sv: "Harissa", notes: "Widely sold and consumed as a condiment; jarred harissa is a standard purchase in Algerian supermarkets and markets; consumed with couscous, merguez, sandwiches, and as a table sauce"}
- {id: raib_bulk, grade: bulk, rating: 2, name: "Raïb", name_sv: "Raïb", notes: "Fermented Milk; Widely consumed traditional dairy product; second most popular traditional dairy after lben; sold in local dairies and supermarkets; consumed as a refreshment and dessert"}
- {id: olive_oil_bulk, grade: bulk, rating: 1, name: "Olive Oil", name_sv: "Olivolja", notes: "Consumed at <2 kg/capita/year (International Olive Council 2025); lower per capita than Morocco or Southern Europe but still present in all Algerian kitchens, primarily for salads, traditional dishes, and drizzling"}

### Dairy, Oils & Sauces — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Algeria local dairy production olive oil production traditional fermented foods" -->

- {id: kabyle_olive_oil, grade: local, rating: 9, name: "Kabyle Olive Oil", name_sv: "Kabylisk olivolja", notes: "Chemlal Variety; Produced from the Chemlal olive variety native to Kabylie (Bejaia, Tizi Ouzou, Bouira); pressed by traditional stone mills (maasra); Algeria produces ~860,000 tonnes olives/year (world 6th); Kabyle oil is the most prized regional variety"}
- {id: lben_local, grade: local, rating: 8, name: "Lben", name_sv: "Lben", notes: "Locally Made Fermented Buttermilk; Made locally from milk of Algerian cattle, goats, and sheep; a traditional product of every rural dairy household; fermented naturally without industrial starters; made since Berber antiquity"}
- {id: smen_local, grade: local, rating: 7, name: "Smen", name_sv: "Smen", notes: "Local Preserved Butter; Made in rural households by clarifying and salt-preserving butter from local milk; aged in clay or ceramic pots; production is domestic/artisanal; a uniquely Algerian/Berber preserved fat with an ancient tradition"}
- {id: raib_local, grade: local, rating: 6, name: "Raïb", name_sv: "Raïb", notes: "Locally Set Fermented Milk; Traditionally made in rural areas by leaving fresh milk to ferment naturally at room temperature; each region has its own method; produced from local Algerian cow, goat, or sheep milk"}
- {id: jben_local, grade: local, rating: 5, name: "Jben", name_sv: "Jben", notes: "Locally Made Fresh Cheese; Produced artisanally across Algeria from fresh local cow and goat milk; each region makes its own variant; a traditional farmhouse cheese sold in local markets (souks)"}
- {id: camel_milk, grade: local, rating: 4, name: "Camel Milk", name_sv: "Kamelmjölk", notes: "Produced from local dromedary herds in Saharan and pre-Saharan regions (Tamanrasset, Adrar, Bechar); consumed fresh and fermented locally; valued for nutritional and medicinal properties in southern Algerian communities"}
- {id: goat_milk_local, grade: local, rating: 3, name: "Goat Milk", name_sv: "Getmjölk", notes: "Produced from Algeria's substantial local goat herds; used to make lben, jben, and raïb in rural areas; particularly important in Kabylie, the Aurès mountains, and the High Plateau regions"}
- {id: sheep_milk_local, grade: local, rating: 2, name: "Sheep Milk", name_sv: "Fårmjölk", notes: "Produced from Algeria's large sheep herds (Algeria is among Africa's top sheep producers); used in traditional dairy products in pastoral communities; less common than cow or goat milk but present in rural areas"}
- {id: date_syrup_local, grade: local, rating: 1, name: "Date Syrup", name_sv: "Dadelsyrup", notes: "Robb El Tmar; Locally produced from pressed Deglet Nour and Ghars dates in southern Algeria; used as a sweetener in traditional cooking and pastries; a local alternative to honey and refined sugar in Saharan communities"}


## Spices, Nuts & Seasonings

### Spices, Nuts & Seasonings — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Algerian cuisine famous spices traditional seasoning ras el hanout identity" -->

- {id: ras_el_hanout, grade: signature, rating: 9, name: "Ras el Hanout", name_sv: "Ras el hanout", notes: "THE iconic Algerian/North African spice blend; name means 'head of the shop' in Arabic; contains 10–30+ spices including cumin, coriander, cinnamon, cardamom, cloves, nutmeg, paprika, black pepper, rose petals; each family has their own formula; used in tagines, couscous, grilled meats, and soups"}
- {id: cumin_sig, grade: signature, rating: 8, name: "Cumin", name_sv: "Spiskummin", notes: "The most used individual spice in Algerian cooking; present in ras el hanout, harissa, chermoula, and standalone in grilled meat rubs; fundamental to the Algerian flavour profile; used in virtually every savoury dish"}
- {id: coriander_seed, grade: signature, rating: 7, name: "Coriander Seed", name_sv: "Korianderfrö", notes: "Key component in ras el hanout, harissa, and chermoula; used ground in stews, tagines, and spice rubs; together with cumin forms the aromatic backbone of Algerian cooking"}
- {id: cinnamon_sig, grade: signature, rating: 6, name: "Cinnamon", name_sv: "Kanel", notes: "Used in both sweet and savory preparations; adds warmth to rechta (white chicken sauce), lham lahlou (sweet lamb), and desserts like makroud and tamina; a key element in the Algerian Ottoman culinary heritage"}
- {id: paprika_sig, grade: signature, rating: 5, name: "Paprika", name_sv: "Paprikapulver", notes: "Provides the red colour and mild sweet-spicy flavour in many Algerian sauces, harissa, chermoula, and marinades; widely used; essential in the visual identity of Algerian dishes"}
- {id: almonds_sig, grade: signature, rating: 4, name: "Almonds", name_sv: "Mandlar", notes: "Iconic in Algerian pastries and festive dishes; toasted almonds garnish lham lahlou (sweet lamb) and couscous desserts; used in makroud (date pastry) and numerous Ramadan sweets; Kabylie is famous for almond cultivation"}
- {id: caraway, grade: signature, rating: 3, name: "Caraway", name_sv: "Kummin", notes: "Karwiya; Traditional Algerian spice used in harissa, some regional tagines, and bread flavouring; one of the classic North African spices that distinguishes Algerian cuisine from other Maghreb countries"}
- {id: orange_blossom_water, grade: signature, rating: 2, name: "Orange Blossom Water", name_sv: "Apelsinblomvatten", notes: "Used to flavour pastries, desserts, and traditional mint tea; added to makroud and other Ramadan sweets; a fragrant flavoring that is distinctively North African; produced from local orange blossoms"}
- {id: dried_figs_sig, grade: signature, rating: 1, name: "Dried Figs", name_sv: "Torkade fikon", notes: "Used in traditional Berber sweets and some savory dishes; dried at home from local fig harvests; Algeria is world 4th largest fig producer; eaten as a snack and used in festive preparations"}

### Spices, Nuts & Seasonings — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Algeria most consumed spices nuts seasonings statistics food survey" -->

- {id: salt_bulk, grade: bulk, rating: 9, name: "Salt", name_sv: "Salt", notes: "Highest volume seasoning by weight; iodized salt coverage in Algerian households reported at >80% (2012 survey); used in all cooking; Algeria produces salt from Mediterranean salt flats and Saharan salt lakes"}
- {id: cumin_bulk, grade: bulk, rating: 8, name: "Cumin", name_sv: "Spiskummin", notes: "Most widely used individual spice by volume in Algeria per market analyses (Algeria Sauces and Spices Industry report); sold loose and packaged; present in virtually every household kitchen"}
- {id: black_pepper_bulk, grade: bulk, rating: 7, name: "Black Pepper", name_sv: "Svartpeppar", notes: "Second most widely used spice by volume; used across all cooking; imported but consumed in large quantities; standard table condiment alongside salt in all Algerian kitchens"}
- {id: paprika_bulk, grade: bulk, rating: 6, name: "Paprika", name_sv: "Paprikapulver", notes: "Powdered; High-volume spice in Algerian kitchens; used in harissa, stews, sauces, and marinades; sold in bulk at every market; consumed in large quantities relative to other spices"}
- {id: coriander_bulk, grade: bulk, rating: 5, name: "Coriander Seed", name_sv: "Malt korianderfrö", notes: "Ground; Among the top-selling spices in Algerian markets; used in tagines, couscous spice mixes, and ras el hanout blends; widely consumed daily across Algeria"}
- {id: peanuts_bulk, grade: bulk, rating: 4, name: "Peanuts", name_sv: "Jordnötter", notes: "Most widely consumed nut in Algeria per market research (Algeria Nuts Market Reports); sold roasted and as peanut butter; widely eaten as snacks, in nut mixes; lower cost than tree nuts drives high volume"}
- {id: almonds_bulk, grade: bulk, rating: 3, name: "Almonds", name_sv: "Mandlar", notes: "Most traditional and culturally significant nut consumed in significant volumes; used in pastries, festive dishes, and as snacks; Algeria grows almonds domestically especially in Kabylie (Bejaia region)"}
- {id: bay_leaf_bulk, grade: bulk, rating: 2, name: "Bay Leaf", name_sv: "Lagerblad", notes: "Widely used in slow-cooked stews, tagines, and soups; sold dried in all Algerian markets; consumed daily as a flavouring; bay laurel grows wild in northern Algeria and is also cultivated"}
- {id: cinnamon_bulk, grade: bulk, rating: 1, name: "Cinnamon", name_sv: "Kanel", notes: "Ground; Consumed in significant volumes in both sweet and savoury dishes; used in rechta, festive lamb, couscous spice mix, and all traditional pastries; imported but consumed across all households"}

### Spices, Nuts & Seasonings — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Algeria local spices herbs nuts grown produced native plants Kabylie" -->

- {id: kabyle_almonds, grade: local, rating: 9, name: "Kabyle Almonds", name_sv: "Kabyliska mandlar", notes: "Kabylie (Bejaia, Tizi Ouzou, Bouira) is famous for almond cultivation; locally harvested almonds are eaten raw, roasted, and used in traditional pastries; distinct local varieties grown in mountain terraces; a major agricultural product of the Kabyle mountains"}
- {id: walnuts_local, grade: local, rating: 8, name: "Walnuts", name_sv: "Valnötter", notes: "Grown in the Atlas mountain regions (Kabylie, Aurès, Medea); harvested locally and used in traditional Berber sweets, desserts, and for cold-pressed walnut oil; an important mountain-region nut"}
- {id: wild_thyme, grade: local, rating: 7, name: "Wild Thyme", name_sv: "Vild timjan", notes: "Zaatar; Thymus vulgaris; grows wild and is cultivated in Kabyle mountains and the Atlas; foraged and dried for cooking, herbal teas, and medicinal use; a foundational wild herb of Algerian Berber cuisine"}
- {id: rosemary_local, grade: local, rating: 6, name: "Rosemary", name_sv: "Rosmarin", notes: "Rosmarinus officinalis; abundant wild plant in Kabylie and northern mountain areas; used to flavour roasted meats, tagines, and herbal infusions; widely foraged from the wild and also cultivated in home gardens"}
- {id: bay_laurel_local, grade: local, rating: 5, name: "Bay Laurel", name_sv: "Lagerblad", notes: "Bay Leaf; Laurus nobilis; grows wild in northern Algerian forests and coastal mountains; locally harvested and dried; used in stews, tagines, and marinades; one of the most important locally sourced aromatics"}
- {id: mint_local, grade: local, rating: 4, name: "Spearmint", name_sv: "Grönmynta", notes: "Mentha spicata; cultivated in home gardens throughout Algeria; essential in Algerian mint tea and used fresh as a garnish; widely grown domestically rather than imported"}
- {id: capers_local, grade: local, rating: 3, name: "Wild Capers", name_sv: "Vilda kapris", notes: "Capparis spinosa; grows wild on rocky slopes throughout northern Algeria; buds are hand-picked and pickled; used in local salads and fish preparations; a traditional foraged ingredient of the Mediterranean Algerian coast"}
- {id: carob_local, grade: local, rating: 2, name: "Carob", name_sv: "Johannesbröd", notes: "Ceratonia siliqua; wild carob trees grow in northern Algeria and Kabylie; pods are collected and used as a sweet snack, in syrups, and as a traditional chocolate substitute; also used in traditional Berber remedies"}
- {id: fennel_local, grade: local, rating: 1, name: "Wild Fennel", name_sv: "Vild fänkål", notes: "Foeniculum vulgare; grows wild throughout coastal and northern Algeria; fronds and seeds used in fish dishes, bread, and herbal teas; foraged from the wild; a traditional aromatic plant of Algerian Mediterranean cooking"}

