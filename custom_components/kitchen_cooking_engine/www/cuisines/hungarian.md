---
KCE: CUISINE
id: hungarian
name: Hungarian
name_sv: "Ungerskt"
icon: 🇭🇺
region: european
region_name: "European"
region_icon: 🏰
description: "Hungarian cuisine is built around paprika, slow-cooked meats, and sour cream — rich, hearty stews like gulyás and pörkölt define its character, shaped by the traditions of the Great Plain and Central European farming culture."
description_sv: "Ungerskt kök bygger på paprika, långkokt kött och gräddfil — rika, mustiga grytor som gulyás och pörkölt definierar köket, format av Stora Slättens traditioner och centraleuropeisk jordbrukskultur."
research_done: 1
---

## Research notes

Sources used:
- Hungarian Central Statistical Office (KSH) / trademagazin.hu: meat consumption 2023 — poultry 36.3 kg, pork 29.3 kg, beef 3.1 kg per capita
- KSH 2018 (xpatloop.com): dairy — fermented dairy 13–14 L, cheese+curd 7.9 kg, butter 1.2 kg per capita
- World Population Review 2022: milk 172 kg/capita; World Population Review 2022: wheat 119 kg/capita
- KSH / reportlinker: bread 32–35 kg/capita (2013–2023)
- FAOSTAT (helgilibrary.com): potato ~38.6 kg/capita (2021)
- World Grain / oeconomus.hu: wheat ~976,000–1,000,000 ha, corn 771,000 ha, sunflower ~700,000 ha (2023)
- Hungary Today / trademagazin.hu: Kalocsa paprika PDO 8,500+ t/yr, Szeged 1,500+ t/yr; goose foie gras 70%+ of global goose liver exports, classified hungarikum
- Culinary sources: signature dishes (gulyás, pörkölt, paprikás csirke, halászlé, töltött káposzta, lángos, rétes)
- Native-language searches: "Magyarország húsfogyasztás statisztika sertés csirke marha kg/fő"; "suomalainen" searches for pair-search methodology


## Proteins

### Proteins — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Hungarian signature dishes iconic proteins gulyás pörkölt paprikás halászlé töltött káposzta" + "Magyar hagyományos ételek ikonikus fehérjeforrások marha sertés csirke ponty libamáj" -->

- {id: beef, grade: signature, rating: 9, name: "Beef", name_sv: "Nötkött", notes: "Gulyás (goulash) is Hungary's most internationally recognised dish; beef is the canonical protein; pörkölt marhából also iconic"}
- {id: pork, grade: signature, rating: 9, name: "Pork", name_sv: "Fläskkött", notes: "Pörkölt, töltött káposzta, kolbász sausage, disznóvágás (pig slaughter) is a major cultural tradition; Mangalica pork prized"}
- {id: chicken, grade: signature, rating: 8, name: "Chicken", name_sv: "Kyckling", notes: "Paprikás csirke (chicken paprikash) is one of Hungary's most iconic dishes globally"}
- {id: goose_liver, grade: signature, rating: 8, name: "Fattened goose liver (libamáj)", name_sv: "Gåslever (libamáj)", notes: "Hízott libamáj; Hungary is world's #1 goose foie gras producer (70%+ of global goose liver exports); classified hungarikum"}
- {id: carp, grade: signature, rating: 7, name: "Carp (ponty)", name_sv: "Karp (ponty)", notes: "Halászlé (fisherman's soup) is an iconic Hungarian dish; carp is the traditional Christmas Eve fish"}
- {id: kolbasz, grade: signature, rating: 7, name: "Hungarian sausage (kolbász)", name_sv: "Ungersk korv (kolbász)", notes: "Smoked pork sausage; central to disznóvágás tradition; used in lecsó, stuffed cabbage; téliszalámi (winter salami) world-famous"}
- {id: goose, grade: signature, rating: 7, name: "Goose (lúd)", name_sv: "Gås (lúd)", notes: "Roast goose (sült lúd) for Márton-nap (St. Martin's Day feast, 11 Nov); part of Hungary's deep goose-farming culture"}
- {id: catfish, grade: signature, rating: 6, name: "Catfish (harcsa)", name_sv: "Mal (harcsa)", notes: "Used in halászlé alongside carp; native to Tisza and Danube rivers; traditional freshwater fish"}
- {id: lamb, grade: signature, rating: 5, name: "Lamb (bárány)", name_sv: "Lamm (bárány)", notes: "Báránypörkölt used especially for Easter; traditional sheep farming on the Great Plain (Puszta)"}

### Proteins — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Hungary meat consumption per capita statistics 2022 2023 pork chicken beef kg/capita FAO food balance" + "Magyarország húsfogyasztás statisztika sertés csirke marha kg/fő" -->

- {id: chicken, grade: bulk, rating: 9, name: "Chicken", name_sv: "Kyckling", notes: "36.3 kg/capita poultry (2023, KSH/trademagazin.hu); chicken dominates poultry; csirkemell (breast) cited as the favourite cut"}
- {id: pork, grade: bulk, rating: 9, name: "Pork", name_sv: "Fläskkött", notes: "29.3 kg/capita (2023, KSH); second most consumed after poultry; Hungary has 2.8 million pigs"}
- {id: processed_pork, grade: bulk, rating: 8, name: "Pork sausage & cold cuts (felvágott/kolbász)", name_sv: "Charkuteri (felvágott/kolbász)", notes: "Processed pork products consumed daily; felvágott on sandwiches is a staple of Hungarian daily eating"}
- {id: turkey, grade: bulk, rating: 7, name: "Turkey (pulyka)", name_sv: "Kalkon (pulyka)", notes: "Part of the 36.3 kg/capita poultry figure (2023, KSH); significant poultry sector; 33.8 million poultry birds"}
- {id: duck, grade: bulk, rating: 6, name: "Duck (kacsa)", name_sv: "Anka (kacsa)", notes: "Included in poultry statistics; duck legs and breast widely consumed; part of Hungary's strong waterfowl culture"}
- {id: goose, grade: bulk, rating: 6, name: "Goose (lúd)", name_sv: "Gås (lúd)", notes: "Included in poultry statistics; goose meat consumed alongside goose liver production; Hungary major goose producer"}
- {id: beef, grade: bulk, rating: 5, name: "Beef", name_sv: "Nötkött", notes: "3.1 kg/capita (2023, KSH); much lower than pork and poultry; beef consumption has been declining in Hungary"}
- {id: carp, grade: bulk, rating: 5, name: "Carp (ponty)", name_sv: "Karp (ponty)", notes: "Most consumed fish; consumption spikes at Christmas; low overall fish consumption in Hungary"}
- {id: rabbit, grade: bulk, rating: 4, name: "Rabbit (nyúl)", name_sv: "Kanin (nyúl)", notes: "Raised and consumed domestically; part of small livestock tradition in rural Hungary"}

### Proteins — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Mangalica pig Hungarian Grey Cattle iconic local breeds Hungary" + "Hungary carp farming ponty fishponds Alföld pheasant wild boar hunting statistics" -->

- {id: mangalica, grade: local, rating: 9, name: "Mangalica pig (mangalica sertés)", name_sv: "Mangalica-gris (mangalica sertés)", notes: "Indigenous curly-haired pig breed unique to Hungary; classified hungarikum; prized for marbled meat and lard; saved from near extinction in 1990s"}
- {id: goose_hu, grade: local, rating: 9, name: "Hungarian goose (Magyar lúd)", name_sv: "Ungersk gås (Magyar lúd)", notes: "Hungary produces 70%+ of global goose foie gras exports (trademagazin.hu); 788 t of goose foie gras in 2024; 33.8 million poultry birds total"}
- {id: carp, grade: local, rating: 8, name: "Carp (ponty)", name_sv: "Karp (ponty)", notes: "Most farmed freshwater fish in Hungary; large fishponds in the Great Plain (Alföld); central to halászlé tradition"}
- {id: hungarian_grey_cattle, grade: local, rating: 8, name: "Hungarian Grey Cattle (Magyar szürke marha)", name_sv: "Ungersk grå boskap (Magyar szürke marha)", notes: "One of Europe's oldest cattle breeds; national symbol; long lyre-shaped horns; grazed on the Puszta; classified hungarikum; premium beef"}
- {id: catfish, grade: local, rating: 7, name: "Catfish (harcsa)", name_sv: "Mal (harcsa)", notes: "Native to Tisza and Danube rivers; farmed in Hungarian fishponds; used in halászlé and traditional recipes"}
- {id: zander, grade: local, rating: 7, name: "Zander / pike-perch (süllő)", name_sv: "Gös (süllő)", notes: "Native to Tisza and Danube rivers; prized white freshwater fish; often pan-fried or grilled; considered a delicacy"}
- {id: pheasant, grade: local, rating: 6, name: "Pheasant (fácán)", name_sv: "Fasan (fácán)", notes: "Hungary is one of Europe's largest pheasant producers and exporters; significant game farming and hunting tradition"}
- {id: wild_boar, grade: local, rating: 6, name: "Wild boar (vaddisznó)", name_sv: "Vildsvin (vaddisznó)", notes: "Hunted in Hungarian forests; wild boar pörkölt a traditional game dish; Hungary has significant hunting culture"}
- {id: deer, grade: local, rating: 5, name: "Deer / venison (szarvas)", name_sv: "Hjort (szarvas)", notes: "Hunted in forests; venison stew (szarvaspörkölt) is traditional game cuisine; Hungary major game-hunting destination"}


## Vegetables

### Vegetables — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Hungarian signature vegetable dishes lecsó paprika pepper onion hagyma káposzta traditional iconic" + "Magyar hagyományos zöldségételek lecsó töltött káposzta hagymás paprikás" -->

- {id: bell_pepper, grade: signature, rating: 9, name: "Bell pepper / Hungarian pepper (zöldpaprika)", name_sv: "Paprika (zöldpaprika)", notes: "Base of lecsó alongside tomato and onion; used fresh in gulyás and stews; Hungarian wax pepper is the classic variety"}
- {id: onion, grade: signature, rating: 9, name: "Onion (hagyma)", name_sv: "Lök (hagyma)", notes: "Base of virtually every Hungarian dish — gulyás, pörkölt, paprikás all start with onion fried in lard or oil; Makó famous for onions"}
- {id: tomato, grade: signature, rating: 8, name: "Tomato (paradicsom)", name_sv: "Tomat (paradicsom)", notes: "Core ingredient in lecsó (alongside bell pepper and onion); used in sauces, summer soups, stuffed vegetable preparations"}
- {id: cabbage, grade: signature, rating: 8, name: "Cabbage (káposzta)", name_sv: "Kål (káposzta)", notes: "Töltött káposzta (stuffed cabbage) is one of Hungary's most iconic dishes; sauerkraut (savanyú káposzta) used as a base; ubiquitous in winter cooking"}
- {id: hot_pepper, grade: signature, rating: 7, name: "Hot pepper (cseresznyepaprika / erős paprika)", name_sv: "Het paprika (cseresznyepaprika)", notes: "Pickled cherry peppers and hot paprika peppers; used as a side and condiment; defines the heat level in lecsó and stews"}
- {id: potato, grade: signature, rating: 7, name: "Potato (burgonya / krumpli)", name_sv: "Potatis (burgonya)", notes: "Paprikás krumpli (paprika potatoes) is a beloved everyday dish; added to gulyás; central to Hungarian peasant cooking"}
- {id: garlic, grade: signature, rating: 7, name: "Garlic (fokhagyma)", name_sv: "Vitlök (fokhagyma)", notes: "Used in pörkölt, sausage marinades, pickles; essential flavouring in most meat-based stews"}
- {id: carrot, grade: signature, rating: 6, name: "Carrot (sárgarépa)", name_sv: "Morot (sárgarépa)", notes: "Used in gulyás, vegetable soups (zöldségleves), and in various stews as a supporting vegetable"}
- {id: mushroom, grade: signature, rating: 5, name: "Mushroom (gomba)", name_sv: "Svamp (gomba)", notes: "Gombapörkölt (mushroom stew in paprika sauce) is a popular vegetarian preparation; foraged varieties used seasonally"}

### Vegetables — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Hungary vegetable consumption per capita statistics potato onion tomato kg annual" + "Magyarország zöldségfogyasztás statisztika burgonya hagyma paradicsom kg/fő" -->

- {id: potato, grade: bulk, rating: 9, name: "Potato (burgonya)", name_sv: "Potatis (burgonya)", notes: "~38.6 kg/capita/yr (FAOSTAT 2021, helgilibrary.com); largest single vegetable by volume; consumed daily in many forms"}
- {id: tomato, grade: bulk, rating: 8, name: "Tomato (paradicsom)", name_sv: "Tomat (paradicsom)", notes: "~13–16 kg/capita/yr (FAOSTAT/academia.edu); includes fresh and processed (paste, canned); major summer consumption"}
- {id: onion, grade: bulk, rating: 8, name: "Onion (hagyma)", name_sv: "Lök (hagyma)", notes: "~8–11 kg/capita/yr (FAOSTAT); used as cooking base in virtually all Hungarian dishes; second most used vegetable"}
- {id: cabbage, grade: bulk, rating: 7, name: "Cabbage (káposzta)", name_sv: "Kål (káposzta)", notes: "Widely consumed fresh and fermented (savanyú káposzta); major winter vegetable; used in töltött káposzta in large quantities"}
- {id: bell_pepper, grade: bulk, rating: 7, name: "Bell pepper (zöldpaprika)", name_sv: "Paprika (zöldpaprika)", notes: "High seasonal consumption; lecsó production consumes large volumes; used fresh in salads and cooked preparations"}
- {id: carrot, grade: bulk, rating: 6, name: "Carrot (sárgarépa)", name_sv: "Morot (sárgarépa)", notes: "Used in soups, stews, and winter cooking; one of the most commonly purchased vegetables year-round"}
- {id: cucumber, grade: bulk, rating: 6, name: "Cucumber (uborka)", name_sv: "Gurka (uborka)", notes: "Consumed fresh and pickled; kovászos uborka (fermented pickles) are a Hungarian staple in summer; high summer consumption"}
- {id: sweet_corn, grade: bulk, rating: 5, name: "Sweet corn (csemegekukorica)", name_sv: "Majs (csemegekukorica)", notes: "Seasonal bulk consumption; Hungary grows corn on 771,000 ha (World Grain 2023); fresh corn widely eaten in summer"}
- {id: beetroot, grade: bulk, rating: 4, name: "Beetroot (cékla)", name_sv: "Rödbeta (cékla)", notes: "Used in salads (cékla saláta) and fermented preparations; consumed throughout the year; traditional side dish"}

### Vegetables — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Hungarian vegetables grown locally agriculture paprika pepper Kalocsa Makó onion sour cherry plum horseradish" + "Magyarország paikallinen kasvituotanto paprika hagyma meggy szilva torma" -->

- {id: kalocsa_pepper, grade: local, rating: 9, name: "Kalocsai paprika pepper", name_sv: "Kalocsai paprika-paprika", notes: "PDO-protected; grown in Kalocsa region (Bács-Kiskun county); 8,500+ t/yr; the sweet aromatic variety used for ground paprika spice"}
- {id: szegedi_pepper, grade: local, rating: 9, name: "Szegedi paprika pepper", name_sv: "Szegedi paprika-paprika", notes: "PDO-protected; grown around Szeged (Csongrád-Csanád county); 1,500+ t/yr; earthier, more pungent profile than Kalocsa"}
- {id: mako_onion, grade: local, rating: 8, name: "Makó onion (Makói hagyma)", name_sv: "Makó-lök (Makói hagyma)", notes: "Town of Makó in southeastern Hungary famous for high-quality onion cultivation for centuries; exported across Central Europe"}
- {id: sour_cherry, grade: local, rating: 7, name: "Sour cherry (meggy)", name_sv: "Surkörsbär (meggy)", notes: "Widely cultivated in Hungary; meggyleves (cold sour cherry soup) is an iconic summer dish; pálinka production, jams"}
- {id: plum, grade: local, rating: 7, name: "Plum (szilva)", name_sv: "Plommon (szilva)", notes: "Widely cultivated; szilvapálinka (plum brandy) is iconic; szilvásgombóc (plum dumplings) is a beloved dessert; lekvár (jam)"}
- {id: horseradish, grade: local, rating: 7, name: "Horseradish (torma)", name_sv: "Pepparrot (torma)", notes: "Grown on Hungarian plains; traditionally served grated with boiled meats (főtt hús); exported; also used in lecsó and stews"}
- {id: cherry_pepper, grade: local, rating: 6, name: "Cherry pepper (cseresznyepaprika)", name_sv: "Körsbärspeppar (cseresznyepaprika)", notes: "Grown and pickled locally; characteristic hot-pickled pepper served as a side with all Hungarian meals"}
- {id: cabbage_hu, grade: local, rating: 6, name: "Cabbage (káposzta)", name_sv: "Kål (káposzta)", notes: "Grown widely across Hungary; both fresh and fermented (savanyú káposzta) a winter preservation staple; regional sauerkraut traditions"}
- {id: apple, grade: local, rating: 5, name: "Apple (alma)", name_sv: "Äpple (alma)", notes: "Major production in Szabolcs-Szatmár-Bereg county; almás rétes (apple strudel) is iconic; Hungary is significant apple producer"}


## Grains & Starches

### Grains & Starches — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Hungarian signature grain starch dishes nokedli tarhonya rétes lángos bread pasta iconic" + "Magyar ikonikus tészta nokedli tarhonya rétes lángos kenyér hagyományos" -->

- {id: nokedli, grade: signature, rating: 9, name: "Egg dumplings (nokedli / galuska)", name_sv: "Äggknyten (nokedli / galuska)", notes: "THE traditional Hungarian side dish; served with paprikás csirke and pörkölt; made by pressing egg-flour dough through a grater into boiling water"}
- {id: retes, grade: signature, rating: 8, name: "Strudel (rétes)", name_sv: "Strudel (rétes)", notes: "Iconic Hungarian pastry; hand-stretched réteslap (strudel dough) filled with túró, apple (almás rétes), poppy seed (mákos rétes), or sour cherry"}
- {id: tarhonya, grade: signature, rating: 8, name: "Dried egg noodle pearls (tarhonya)", name_sv: "Torkade äggpastapärlor (tarhonya)", notes: "Traditional Hungarian dried pasta pearls; sautéed in lard then cooked in broth; served with pörkölt; distinctly Hungarian preparation"}
- {id: langos, grade: signature, rating: 7, name: "Lángos", name_sv: "Lángos", notes: "Deep-fried flatbread; one of Hungary's most iconic street foods; topped with tejföl, cheese, and garlic; Hungarian culinary identity"}
- {id: csipetke, grade: signature, rating: 7, name: "Pinched pasta (csipetke)", name_sv: "Knipen pasta (csipetke)", notes: "Tiny hand-pinched fresh pasta cooked directly in gulyás soup; adds texture; traditional to the dish; regional variations exist"}
- {id: feher_kenyer, grade: signature, rating: 7, name: "White bread (fehérkenyér / kenyér)", name_sv: "Vitt bröd (fehérkenyér)", notes: "Fresh bread is served with every Hungarian meal; kifli (crescent roll) and pogácsa (savoury scone) are equally iconic"}
- {id: rice, grade: signature, rating: 6, name: "Rice (rizs)", name_sv: "Ris (rizs)", notes: "Essential filling in töltött káposzta (stuffed cabbage); used in various soups and as a side dish in Hungarian home cooking"}
- {id: semolina, grade: signature, rating: 5, name: "Semolina (búzadara)", name_sv: "Mannagryn (búzadara)", notes: "Used in daragaluska (semolina dumplings cooked in soups) and in desserts; a common comfort food in Hungarian households"}
- {id: kifli, grade: signature, rating: 6, name: "Crescent roll (kifli)", name_sv: "Giffel (kifli)", notes: "Traditional Hungarian bread roll; eaten for breakfast with butter, jam, or cheese; standard in every Hungarian bakery"}

### Grains & Starches — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Hungary grain cereal wheat consumption statistics bread flour per capita FAO" -->

- {id: wheat_flour, grade: bulk, rating: 9, name: "Wheat / wheat flour (búza / búzaliszt)", name_sv: "Vete / vetemjöl (búza / búzaliszt)", notes: "~119 kg/capita wheat consumption (World Population Review 2022); Hungary grows ~976,000–1,000,000 ha of wheat; base of all bread and pasta"}
- {id: bread, grade: bulk, rating: 9, name: "Bread (kenyér)", name_sv: "Bröd (kenyér)", notes: "32–35 kg/capita/yr (KSH 2013–2023, ksh.hu); consumed at every meal; staple alongside all main dishes; declining slightly but stabilising"}
- {id: pasta_noddles, grade: bulk, rating: 8, name: "Pasta / egg noodles (tészta / nokedli)", name_sv: "Pasta / äggpasta (tészta / nokedli)", notes: "Widely consumed as a side dish; nokedli ubiquitous in households; various pasta shapes used in soups and as sides"}
- {id: bread_rolls, grade: bulk, rating: 7, name: "Bread rolls (zsemle / kifli)", name_sv: "Frukostbröd (zsemle / kifli)", notes: "Consumed daily for breakfast and sandwiches; bought fresh daily from bakeries; integral to Hungarian breakfast culture"}
- {id: rice, grade: bulk, rating: 7, name: "Rice (rizs)", name_sv: "Ris (rizs)", notes: "Used in stuffed cabbage (töltött káposzta), soups, and as a side dish; consumed in significant quantities across all households"}
- {id: corn, grade: bulk, rating: 5, name: "Corn / maize products (kukorica)", name_sv: "Majs (kukorica)", notes: "Hungary grows 771,000 ha of corn (World Grain 2023); consumed as cornmeal porridge, polenta-style preparations, and processed products"}
- {id: semolina_b, grade: bulk, rating: 5, name: "Semolina (búzadara)", name_sv: "Mannagryn (búzadara)", notes: "Used in soups (daragaluska), porridge, and as a coating for fried foods; standard pantry item in Hungarian households"}
- {id: rye_bread, grade: bulk, rating: 5, name: "Rye bread (rozskenyér)", name_sv: "Rågbröd (rozskenyér)", notes: "Consumed as an alternative to white bread; traditional in some regions; rye-wheat mixed loaves common in Hungarian bakeries"}
- {id: barley, grade: bulk, rating: 4, name: "Barley (árpa)", name_sv: "Korn (árpa)", notes: "412,000 ha grown in Hungary (World Grain 2023); used in árpaleves (barley soup) and beer production; moderate direct consumption"}

### Grains & Starches — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Hungary grain crop production locally grown wheat corn sunflower poppy seeds walnut statistics hectares" + "Magyarország gabonatermelés napraforgó mák dió helyi termesztés" -->

- {id: wheat_local, grade: local, rating: 9, name: "Hungarian winter wheat (búza)", name_sv: "Ungerskt vintervete (búza)", notes: "~976,000–1,000,000 ha (World Grain 2023); the Alföld (Great Plain) is Hungary's breadbasket; high-quality milling wheat exported across Europe"}
- {id: sunflower, grade: local, rating: 9, name: "Sunflower (napraforgó)", name_sv: "Solros (napraforgó)", notes: "~700,000 ha (World Grain 2023); Hungary is a major EU sunflower oil producer; napraforgóolaj has replaced lard as the dominant cooking fat in modern Hungarian cooking"}
- {id: corn_local, grade: local, rating: 8, name: "Corn / maize (kukorica)", name_sv: "Majs (kukorica)", notes: "771,000 ha (World Grain 2023); major local crop on the Great Plain; used for human consumption, animal feed, and ethanol production"}
- {id: poppy_seeds, grade: local, rating: 8, name: "Poppy seeds (mák)", name_sv: "Vallmofrön (mák)", notes: "Widely grown in Hungary; essential for mákos rétes (poppy seed strudel) and beigli (Christmas roll); Hungary is one of Europe's top poppy seed producers"}
- {id: walnut, grade: local, rating: 7, name: "Walnut (dió)", name_sv: "Valnöt (dió)", notes: "Widely cultivated; used in diós rétes (walnut strudel), beigli (Christmas walnut roll), and cakes; Hungary has significant walnut orchards"}
- {id: barley_local, grade: local, rating: 7, name: "Barley (árpa)", name_sv: "Korn (árpa)", notes: "412,000 ha grown in Hungary (World Grain 2023); used for brewing, animal feed, and in soups; important rotation crop on Hungarian farmland"}
- {id: rye, grade: local, rating: 6, name: "Rye (rozs)", name_sv: "Råg (rozs)", notes: "Traditional bread grain; grown in Hungary; used for rye and mixed rye-wheat bread; historically important crop on the Alföld"}
- {id: millet, grade: local, rating: 4, name: "Millet (köles)", name_sv: "Hirs (köles)", notes: "Historically important grain in Hungary since the Magyar conquest; used in traditional porridges; still cultivated in small quantities"}
- {id: hemp_seeds, grade: local, rating: 4, name: "Hemp seeds (kendermag)", name_sv: "Hampafrön (kendermag)", notes: "Historically grown in Hungary; used in traditional porridges and regional preparations; some continued cultivation today"}


## Dairy & Eggs

### Dairy & Eggs — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Hungarian signature dairy eggs tejföl túró tojás sajt iconic traditional cuisine" + "Magyar hagyományos tejtermékek tejföl túró trappista tojás ikonikus" -->

- {id: tejfol, grade: signature, rating: 9, name: "Sour cream (tejföl)", name_sv: "Gräddfil (tejföl)", notes: "THE essential dairy of Hungarian cuisine; stirred into paprikás csirke, pörkölt, soups, and served as a topping on lángos and other dishes; Hungarian tejföl is notably thick"}
- {id: turo, grade: signature, rating: 8, name: "Curd cheese (túró)", name_sv: "Färskost / kvarg (túró)", notes: "Hungarian-style fresh curd cheese; used in túrós gombóc (curd dumplings), rétes fillings, desserts (túró rudi), and körözött (paprika-spiced spread)"}
- {id: eggs, grade: signature, rating: 8, name: "Eggs (tojás)", name_sv: "Ägg (tojás)", notes: "Essential in nokedli (egg dumplings); used in pastries, strudel fillings, and everyday cooking; tojásos nokedli (egg noodles with butter) is a classic comfort dish"}
- {id: trappista, grade: signature, rating: 7, name: "Trappista cheese (trappista sajt)", name_sv: "Trappisostost (trappista sajt)", notes: "Hungary's most popular semi-hard cheese; mild, versatile; used on sandwiches, in pastries; produced in Hungarian dairies"}
- {id: vaj, grade: signature, rating: 6, name: "Butter (vaj)", name_sv: "Smör (vaj)", notes: "Used in rétes (strudel), pastries (sütemény), and many baked preparations; essential for pogácsa (savoury scone) and Hungarian baking tradition"}
- {id: tejszin, grade: signature, rating: 5, name: "Cream (tejszín)", name_sv: "Grädde (tejszín)", notes: "Used in soups, sauces, and desserts; complements tejföl in some preparations; part of the rich dairy tradition in Hungarian cooking"}
- {id: korozott, grade: signature, rating: 6, name: "Körözött (spiced túró spread)", name_sv: "Körözött (kryddad kvargröra)", notes: "Iconic Hungarian spread made from túró mixed with paprika, butter, caraway, and onion; eaten on bread; standard in Hungarian homes"}
- {id: palp_sajt, grade: signature, rating: 5, name: "Pálpusztai cheese (pálpusztai sajt)", name_sv: "Pálpusztai-ost (pálpusztai sajt)", notes: "Distinctly Hungarian soft stinky cheese with strong aroma; regional specialty; pairs with hearty Hungarian bread and cold cuts"}
- {id: zsir, grade: signature, rating: 7, name: "Lard (zsír / disznózsír)", name_sv: "Ister (zsír / disznózsír)", notes: "Traditional cooking fat; essential in authentic gulyás, pörkölt, and lángos dough; being replaced by sunflower oil but still defines the flavour of traditional Hungarian cooking"}

### Dairy & Eggs — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Hungary dairy consumption per capita milk sour cream tejföl butter cheese statistics kg" -->

- {id: milk, grade: bulk, rating: 9, name: "Milk (tej)", name_sv: "Mjölk (tej)", notes: "~172 kg/capita dairy products total (World Population Review 2022); fluid milk ~55 kg/capita direct consumption (Eurostat 2018); Hungary above world average"}
- {id: tejfol_bulk, grade: bulk, rating: 9, name: "Sour cream (tejföl)", name_sv: "Gräddfil (tejföl)", notes: "Major share of 13–14 L/capita fermented dairy (KSH 2018, xpatloop.com); consumed in very high volumes relative to EU average; used daily in cooking and as a topping"}
- {id: eggs_bulk, grade: bulk, rating: 8, name: "Eggs (tojás)", name_sv: "Ägg (tojás)", notes: "Consumed daily; not tracked in dairy stats but key protein source; Hungary has 33.8 million poultry birds (ITA); eggs consumed at breakfast, in cooking, in pastries"}
- {id: cheese_bulk, grade: bulk, rating: 7, name: "Cheese (sajt)", name_sv: "Ost (sajt)", notes: "7.9 kg/capita (KSH 2018, xpatloop.com); includes hard and semi-hard varieties; trappista sajt is most widely consumed variety"}
- {id: turo_bulk, grade: bulk, rating: 7, name: "Curd cheese / quark (túró)", name_sv: "Kvarg (túró)", notes: "Included in 7.9 kg/capita cheese+curd figure (KSH 2018); consumed fresh in desserts and savoury spreads; túró rudi is a beloved confectionery"}
- {id: yogurt, grade: bulk, rating: 6, name: "Yogurt (joghurt)", name_sv: "Yoghurt (joghurt)", notes: "Part of 13–14 L/capita fermented dairy (KSH 2018); growing consumption; widely available and consumed as a breakfast food"}
- {id: kefir, grade: bulk, rating: 5, name: "Kefir", name_sv: "Kefir", notes: "Fermented milk product; part of 13–14 L/capita fermented dairy (KSH 2018); traditional in Hungarian diet; widely consumed as a drink"}
- {id: tejszin_bulk, grade: bulk, rating: 5, name: "Cream (tejszín)", name_sv: "Grädde (tejszín)", notes: "Used in cooking, soups, and desserts; part of overall dairy consumption; consumed regularly in Hungarian households"}
- {id: butter_bulk, grade: bulk, rating: 5, name: "Butter (vaj)", name_sv: "Smör (vaj)", notes: "1.2 kg/capita (KSH 2018, xpatloop.com); used mainly in baking and pastries; lard (zsír) has traditionally been more common than butter in savoury cooking"}

### Dairy & Eggs — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Hungary local dairy production Hungarian Simmental cattle breeds regional cheese varieties goose duck eggs" + "Magyarország tejtermék helyi termelés Magyar tarka tej pálpusztai trappista lúdtojás" -->

- {id: tejfol_local, grade: local, rating: 8, name: "Hungarian sour cream (tejföl)", name_sv: "Ungersk gräddfil (tejföl)", notes: "Made from locally produced milk; Hungarian tejföl is notably thick (20–25% fat), distinct from international sour cream; produced by Hungarian dairies"}
- {id: trappista_local, grade: local, rating: 8, name: "Trappista cheese (trappista sajt)", name_sv: "Trappistost (trappista sajt)", notes: "Hungary's most popular cheese; produced in Hungarian dairies; originally brought by Cistercian monks; now made by domestic producers using local milk"}
- {id: chicken_eggs_local, grade: local, rating: 8, name: "Chicken eggs (tyúktojás)", name_sv: "Hönsägg (tyúktojás)", notes: "From Hungary's large poultry industry (33.8 million birds, ITA); eggs produced locally on a large scale; major agricultural output"}
- {id: palp_local, grade: local, rating: 7, name: "Pálpusztai cheese (pálpusztai sajt)", name_sv: "Pálpusztai-ost (pálpusztai sajt)", notes: "Uniquely Hungarian soft cheese with strong aroma; produced only in Hungary; its pungent character is protected; national culinary identity"}
- {id: goose_eggs, grade: local, rating: 7, name: "Goose eggs (lúdtojás)", name_sv: "Gåsägg (lúdtojás)", notes: "From Hungary's large goose farming industry (world leader in goose liver production); consumed in spring; larger and richer than chicken eggs"}
- {id: mag_tarka, grade: local, rating: 7, name: "Hungarian Simmental cattle milk (Magyar tarka tej)", name_sv: "Ungersk Simmental-mjölk (Magyar tarka tej)", notes: "Magyar tarka (Hungarian Simmental) is the main dairy cattle breed in Hungary; provides the milk base for all Hungarian dairy production"}
- {id: sheep_milk, grade: local, rating: 5, name: "Sheep milk (birka tej)", name_sv: "Fårmjölk (birka tej)", notes: "From Hungarian Racka sheep, a traditional breed of the Puszta; used in regional cheeses and dairy in southeastern Hungary"}
- {id: duck_eggs, grade: local, rating: 5, name: "Duck eggs (kacsatojás)", name_sv: "Andägg (kacsatojás)", notes: "From duck farming; Hungary has significant duck production; consumed in rural areas and farm households; rich flavour"}
- {id: liptoi_turo, grade: local, rating: 6, name: "Liptói túró (fresh curd cheese)", name_sv: "Liptói färskost", notes: "Traditional Hungarian-style fresh curd cheese; base for körözött spread; produced from locally sourced milk; standard in Hungarian cheesemaking"}


## Spices & Seasonings

### Spices & Seasonings — Signature
<!-- Research strategy: Ingredients used in signature dishes and iconic preparations of this cuisine. What defines its identity and flavour? Search signature dishes, traditional recipes, cultural food icons. -->
<!-- Searched: "Hungarian cuisine defining spices paprika caraway dill marjoram iconic flavour profile" + "Magyar konyha jellegzetes fűszerek paprika köménymag kapor majoranna babérlevél" -->

- {id: sweet_paprika, grade: signature, rating: 9, name: "Hungarian sweet paprika (édes nemes fűszerpaprika)", name_sv: "Ungersk söt paprika (édes nemes)", notes: "THE defining spice of Hungarian cuisine; used in gulyás, pörkölt, paprikás csirke, lecsó; PDO-protected varieties from Kalocsa and Szeged; no other cuisine is so identified with a single spice"}
- {id: hot_paprika_sp, grade: signature, rating: 8, name: "Hot paprika (erős paprika / csípős paprika)", name_sv: "Het paprika (erős paprika)", notes: "Spicy companion to sweet paprika; used to add heat to stews; erős pista (hot paprika paste) is a signature condiment on every Hungarian table"}
- {id: caraway, grade: signature, rating: 8, name: "Caraway seed (köménymag)", name_sv: "Kummin (köménymag)", notes: "Used in bread, sauerkraut, soups (köménymagleves), pörkölt variations; the second most defining spice after paprika in the Hungarian flavour profile"}
- {id: dill, grade: signature, rating: 7, name: "Dill (kapor)", name_sv: "Dill (kapor)", notes: "Essential in cucumber pickles (kapros uborka), fish soups, and sour cream sauces; kapros tejföl (dill sour cream) is a classic preparation"}
- {id: marjoram, grade: signature, rating: 7, name: "Marjoram (majoranna)", name_sv: "Mejram (majoranna)", notes: "Used in Hungarian kolbász (sausage), soups, and meat stews; a defining herb in Hungarian charcuterie and sausage-making tradition"}
- {id: bay_leaf, grade: signature, rating: 7, name: "Bay leaf (babérlevél)", name_sv: "Lagerblad (babérlevél)", notes: "Added to all stews, soups, and braises; standard aromatic in gulyás, pörkölt, bean soups; virtually universal in Hungarian home cooking"}
- {id: garlic_sp, grade: signature, rating: 7, name: "Garlic (fokhagyma)", name_sv: "Vitlök (fokhagyma)", notes: "Used as a flavouring base in pörkölt, sausage marinades, and pickled preparations; essential alongside onion in most meat dishes"}
- {id: black_pepper, grade: signature, rating: 6, name: "Black pepper (fekete bors)", name_sv: "Svartpeppar (fekete bors)", notes: "Widely used across all savoury dishes; a standard table seasoning alongside paprika; used in sausages and cured meats"}
- {id: savory, grade: signature, rating: 5, name: "Savory (borsfű / csombor)", name_sv: "Kyndel (borsfű)", notes: "Used in bean dishes (babgulyás, babfőzelék), in sausages and pörkölt; a traditional herb in Hungarian peasant cooking"}

### Spices & Seasonings — Bulk
<!-- Research strategy: What is consumed in the highest volumes statistically. Find official numbers: kg/capita, FAO data, national food surveys. Guesses are not good enough — find a source. -->
<!-- Searched: "Hungary most used seasonings condiments statistics salt pepper paprika sunflower oil everyday cooking consumption" + "Magyarország leggyakrabban használt fűszerek napraforgóolaj zsír ecet só paprika fogyasztás" -->

- {id: salt, grade: bulk, rating: 9, name: "Salt (só)", name_sv: "Salt (só)", notes: "Most consumed seasoning by volume everywhere; essential in all preserving (pickles, sauerkraut, sausages) and everyday cooking"}
- {id: sunflower_oil, grade: bulk, rating: 9, name: "Sunflower oil (napraforgóolaj)", name_sv: "Solrosolja (napraforgóolaj)", notes: "Dominant cooking fat in modern Hungary; has largely replaced lard (zsír) in everyday frying and cooking; Hungary grows ~700,000 ha of sunflower"}
- {id: paprika_bulk, grade: bulk, rating: 9, name: "Ground paprika (fűszerpaprika)", name_sv: "Malen paprika (fűszerpaprika)", notes: "Hungary's per capita paprika consumption is among the highest in the world; used daily in virtually all savoury cooking; both sweet and hot varieties consumed in bulk"}
- {id: black_pepper_bulk, grade: bulk, rating: 8, name: "Black pepper (fekete bors)", name_sv: "Svartpeppar (fekete bors)", notes: "Standard table seasoning alongside salt; used in all meat dishes, sausages, soups; very high per capita consumption"}
- {id: garlic_bulk, grade: bulk, rating: 8, name: "Garlic (fokhagyma)", name_sv: "Vitlök (fokhagyma)", notes: "Used daily as a base flavouring; consumed in very large quantities in Hungarian households; important in sausage and meat preparations"}
- {id: lard, grade: bulk, rating: 7, name: "Lard (zsír / disznózsír)", name_sv: "Ister (zsír)", notes: "Traditional frying and cooking fat; still widely used in authentic cooking and by older generations; being replaced by sunflower oil in modern households"}
- {id: vinegar, grade: bulk, rating: 7, name: "Vinegar (ecet)", name_sv: "Vinäger (ecet)", notes: "Used heavily for pickling cucumbers, peppers, and cabbage (savanyú káposzta); Hungarian pickling tradition uses large volumes of vinegar seasonally"}
- {id: bay_leaf_bulk, grade: bulk, rating: 7, name: "Bay leaf (babérlevél)", name_sv: "Lagerblad (babérlevél)", notes: "Added to virtually all soups and stews; consumed in large quantities as a standard aromatic in Hungarian home cooking"}
- {id: sugar, grade: bulk, rating: 6, name: "Sugar (cukor)", name_sv: "Socker (cukor)", notes: "Used in pickling brine, baking (rétes, beigli, sütemény), and preserves (lekvár, jam); integral to Hungarian baking and preservation culture"}

### Spices & Seasonings — Local
<!-- Research strategy: What is produced, grown, farmed, fished, hunted, or foraged in this cuisine's home region. The origin story, not the consumption volume. -->
<!-- Searched: "Hungary locally grown herbs seasonings paprika Kalocsa Szeged horseradish dill caraway production PDO" + "Magyarország paikallinen fűszertermesztés paprika torma kapor köménymag majoranna" -->

- {id: kalocsa_paprika, grade: local, rating: 9, name: "Kalocsai paprika (PDO)", name_sv: "Kalocsai paprika (PDO)", notes: "PDO-protected ground paprika spice from Kalocsa region; 8,500+ t/yr; sweet aromatic profile; regulation dating to 1934; Hungary Today / trademagazin.hu"}
- {id: szegedi_paprika, grade: local, rating: 9, name: "Szegedi paprika (PDO)", name_sv: "Szegedi paprika (PDO)", notes: "PDO-protected ground paprika spice from Szeged region; 1,500+ t/yr; earthier, more pungent profile; both PDOs are internationally recognised"}
- {id: horseradish_local, grade: local, rating: 8, name: "Horseradish (torma)", name_sv: "Pepparrot (torma)", notes: "Grown on the Hungarian Great Plain; used grated with boiled meats and in cold dishes; Hungary exports horseradish across Central Europe"}
- {id: dill_local, grade: local, rating: 7, name: "Dill (kapor)", name_sv: "Dill (kapor)", notes: "Grown widely in Hungarian gardens and farms; used in large quantities for pickling cucumbers (kapros uborka) and as a herb in sauces"}
- {id: caraway_local, grade: local, rating: 7, name: "Caraway (köménymag)", name_sv: "Kummin (köménymag)", notes: "Grown locally in Hungary; used in bread, sauerkraut, soups; Hungary is among EU caraway producers; integral to Hungarian cooking identity"}
- {id: marjoram_local, grade: local, rating: 6, name: "Marjoram (majoranna)", name_sv: "Mejram (majoranna)", notes: "Grown in Hungarian herb gardens and farms; essential in kolbász (sausage) production and in soups; cultivated commercially for the food industry"}
- {id: mustard_local, grade: local, rating: 6, name: "Hungarian mustard (magyar mustár)", name_sv: "Ungersk senap (magyar mustár)", notes: "Produced from locally grown mustard seeds; consumed as a condiment with sausages, cold meats, and sandwiches; a standard in Hungarian households"}
- {id: savory_local, grade: local, rating: 5, name: "Savory (borsfű / csombor)", name_sv: "Kyndel (borsfű)", notes: "Grown in Hungarian gardens; used in bean soups, stews, and sausage production; a traditional herb in Hungarian peasant cooking"}
- {id: tarragon, grade: local, rating: 5, name: "Tarragon (tárkony)", name_sv: "Dragon (tárkony)", notes: "Grown locally in Hungary; used in soups, sauces, and with fish and poultry; tárkonyos csirkeleves (tarragon chicken soup) is a traditional dish"}

