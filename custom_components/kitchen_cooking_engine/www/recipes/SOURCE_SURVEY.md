# Recipe Source Survey — Network Accessibility from Copilot Cloud Sandbox

**Purpose:** This document records the results of systematic web_fetch probing of global
recipe websites from the Copilot cloud agent sandbox. Each site was probed directly with
a relevant recipe URL to determine whether real recipe content (ingredients + method steps)
is accessible. This prevents agents wasting time on blocked or misdirecting sites.

**Last updated:** 2026-04-27 (+ 12 new confirmed working sources — coverage for French, Korean, Finnish, Czech, Polish, Lithuanian, Georgian, Moroccan, Levantine, Mexican, Indonesian)
**Agent session:** v0.6.1.x — continue-061-x-experimental-recipes

---

## Background and problem history

Previous agents (pre-v0.6.1.x) attempted to use web_fetch on a wide range of recipe sites
and received unreliable results:

- Many sites returned HTTP 402 / 403 / 404 without the agent registering the failure.
- Some sites connected but returned the wrong recipe (the homepage or a different recipe).
- Some sites connected but returned a user profile/bio page instead of a recipe.
- The agent fabricated recipe content from training-data memory and passed it off as
  fetched content, violating the integrity rules in RECIPE_COLLECTION_TOR.md.

The rule in this project is: **do not write content you cannot cite to a real URL or
a real published book**. Training-data recall of "what a recipe roughly contains" is
not an acceptable source. Use web_fetch to verify you can actually read the content.

---

## Confirmed WORKING sites (real recipe content returned)

Sites where web_fetch returns actual ingredient lists and numbered method steps.
Note: exact URL slugs matter — always use web_search to find a correct URL first,
then verify with web_fetch before citing.

| Site | Language | Country | Notes |
|------|----------|---------|-------|
| **bbcgoodfood.com** | English | UK | ✅ Full recipe content. Use `/recipes/{slug}` format. Navigate collection pages to find real slugs: `/recipes/collection/{collection-name}`. **IA retrieval method**: fetch raw HTML via `web_fetch(raw=True)` on `https://web.archive.org/web/20241010111210/https://www.bbcgoodfood.com/recipes/{slug}` — ingredients and method are in the `__POST_CONTENT__` JSON script block, NOT in the markdown-converted content. Use timestamp `20241010111210` or `20240901093429`. |
| **recipetineats.com** | English | AU | ✅ Full recipe content. Title-slug URLs work reliably. e.g. `/lamb-shanks/`. |
| **themediterraneandish.com** | English | US/Mediterranean | ✅ Full recipe content incl. Persian, Moroccan, Greek-influenced recipes. e.g. `/braised-lamb-shanks/`, `/persian-braised-lamb-shanks-mahiche/` |
| **nigella.com** | English | UK | ✅ Full recipe content. e.g. `/recipes/aromatic-lamb-shank-stew`. Check books cited for bibliographic references. |
| **thewoksoflife.com** | English | US (Chinese tradition) | ✅ Full recipe content. Chinese, Cantonese, Shanghainese, Xinjiang traditions. e.g. `/cumin-lamb/` |
| **gourmettraveller.com.au** | English | AU | ✅ Full recipe content with chef attribution. Use web_search to find slugs. |
| **hot-thai-kitchen.com** | English | CA (Thai tradition) | ✅ Full recipe content, Thai cuisine. e.g. `/grilled-pork-jowl/`. Use web_search `site:hot-thai-kitchen.com {dish}` for slugs. |
| **africanbites.com** | English | US (West African / Caribbean) | ✅ Full recipe content. West African, Nigerian, Jamaican, Cameroonian traditions. e.g. `/jamaican-curry-goat/`, `/asun-spicy-roast-goat/`, `/grilled-lamb-chops/`, `/hawaiian-grilled-chicken-thighs/`, `/grilled-chicken-wings/`, `/jamaican-chicken-patties/`. Always search `site:africanbites.com {recipe}` — guessed slugs often 404. Baking powder tip for extra-crispy chicken skin documented on this site. |
| **vahrehvah.com** | English | IN (South Indian) | ✅ Full recipe content. Andhra, Telugu, pan-Indian. e.g. `/spicy-lamb-chops`, `/lamb-fry`, `/mutton-fry-indian-recipe`. Use slug format `/recipe-name` (no trailing slash). |
| **chefkoch.de** | German | DE | ✅ Full recipe content. Use numeric ID URLs: `/rezepte/{ID}/{slug}.html`. Find IDs via web_search `site:chefkoch.de {recipe}`. |
| **ichkoche.at** | German | AT (Austrian) | ✅ Full recipe content in German, Austrian traditions. Use `/{slug}-rezept-{ID}` format (slug first, then `-rezept-{ID}` at end). e.g. `/rezept-fuer-eingelegte-zitronen-rezept-54882`, `/kraeuterbutter-nach-grossmutter-art-rezept-106276`. Find IDs via IA CDX: `https://web.archive.org/cdx/search/cdx?url=www.ichkoche.at/rezept*&output=json&filter=statuscode:200&limit=10`. **⚠️ Previous survey had wrong format `/rezept-{slug}-{ID}` — corrected 2026-04-24.** |
| **madensverden.dk** | Danish | DK | ✅ Full recipe content in Danish. Use `https://madensverden.dk/{slug}/` — **no `www.` prefix**. Danish characters URL-encoded: ø→oe, æ→ae, å→aa. e.g. `/hvidloegsflutes-hjemmelavede-nemme-sproede/`, `/langtidsstegt-oksefilet-ovn/`, `/varm-boennesalat-med-groenne-boenner-tomater-og-hvidloeg/`. Navigate via IA: `https://web.archive.org/web/20170603212251/https://madensverden.dk/` shows recipe links on homepage. Confirmed 2026-04-24 via IA page fetch. |
| **directoalpaladar.com** | Spanish | ES | ✅ Full recipe content in Spanish. e.g. `/recetas-de-carnes-y-aves/jarrete-ternasco-asado-...` |
| **nefisyemektarifleri.com** | Turkish | TR | ✅ Full recipe content in Turkish. e.g. `/kuzu-incik/`, `/levrek-bugulama/`, `/tavuk-gogus-sote/` (chicken breast sauté), `/tavuk-burger/` (chicken burger). Use `/` slug format. ⚠️ Some chicken wing slugs (`/air-fryer-tavuk-kanat/`, `/tavuk-kanat-yemekleri/`) return 404 — always search `site:nefisyemektarifleri.com {tarif}` first. |
| **yemek.com** | Turkish | TR | ✅ Full recipe content in Turkish (second Turkish source). Chef-attributed recipes. e.g. `/tarif/kuzu-pirzola/`. Search `site:yemek.com {yemek}`. |
| **giallozafferano.it** | Italian | IT | ✅ Full recipe content in Italian. Use `ricette.giallozafferano.it/{Capitalized-Slug}.html`. e.g. `/Cinghiale-in-umido.html`. Search `site:giallozafferano.it {ricetta}` to find slugs. |
| **indianhealthyrecipes.com** | English | IN | ✅ Full recipe content. Indian, Kashmiri, South Indian traditions. e.g. `/rogan-josh/`, `/mutton-chops/` |
| **argiro.gr** | Greek | GR | ✅ Full recipe content in Greek. Use `/recipe/{slug}/` format. e.g. `/recipe/arni-kotsi-me-polychroma-karota/`, `/recipe/mpoutakia-kotopoulo-sto-fourno/` (yogurt-crusted oven chicken thighs). Confirmed TV-chef Argiro Barbarigou's recipes. Search `site:argiro.gr recipe {dish}` for slugs. |
| **cookpad.com/jp** | Japanese | JP | ✅ Full recipe content in Japanese. Use `/jp/recipes/{numeric-id}`. Search `site:cookpad.com/jp {食材}` to find IDs. e.g. `/jp/recipes/19032918` (Xinjiang lamb stir-fry). |
| **xiachufang.com** | Chinese (Mandarin) | CN | ✅ Full recipe content in Chinese. Use `/recipe/{numeric-id}/` format. e.g. `/recipe/102228983/` (oven lamb ribs), `/recipe/102126154/` (slow-roasted duck breast). ⚠️ Desktop URL sometimes shows CAPTCHA — use `m.xiachufang.com/recipe/{id}/` (mobile subdomain) which bypasses it. Search result pages are JS-rendered and return only footer; must use direct recipe IDs via web_search. Search `site:xiachufang.com {菜名}` to find IDs. |
| **edimdoma.ru** | Russian | RU | ✅ Full recipe content in Russian. Use `/retsepty/{ID}-{slug}` format. e.g. `/retsepty/13146-shashlyk-iz-baraniny`, `/retsepty/10826-tushenye-utinye-nozhki` (braised waterfowl legs), `/retsepty/40130-gus-zapechennyy-s-yablokami` (roast goose), `/retsepty/85170-nezhneyshaya-utinaya-grudka...` (duck breast). Search `site:edimdoma.ru {рецепт}`. ⚠️ Ingredient lists and method steps are in collapsible JS widgets — main content visible but some structural detail hidden. |
| **teleculinaria.pt** | Portuguese | PT | ✅ Full recipe with ingredients and numbered method steps in Portuguese. Use `/receitas/{category}/` listing pages to find dish names, then `/receitas/{name}/` for individual recipes. e.g. `/receitas/frango/` shows a frango à alhinho recipe with full ingredients + steps. |
| **taste.co.za** | English | ZA | ✅ Full recipe with ingredients, method, and named-author attribution (South African food writers, e.g. Phillippa Cheifitz). Use `/recipes/{slug}/` format. e.g. `/recipes/grilled-chicken-thighs/`. Content includes per-serving nutrition. |
| **196flavors.com** | English (multilingual recipes) | US / Global | ✅ Full recipes from 196 countries — ingredients + numbered method steps. Each recipe documents the national tradition. URL format: `/{country-dish-slug}/`. e.g. `/ethiopia-doro-wat/`, `/thailand-pad-kra-pao/`. Note: recipe section is below a long cultural intro — scroll past first 2000–3000 chars. |
| **coolinarika.com** | Croatian | HR | ✅ Full recipe with numbered preparation steps in Croatian. Use `/recept/{slug}/` format. e.g. `/recept/piletina-na-zaru/`. Includes serving notes ("Savjet") and serving suggestions. No explicit temperatures — doneness described in text. |
| **gustos.ro** | Romanian | RO | ✅ Recipe with ingredient list and preparation paragraph in Romanian. Use `/retete/{dish}-{prep}.html` format. e.g. `/retete/piept-de-pui-la-gratar.html`. Minimal format (no numbered steps) but ingredients and method are clear. |
| **hungryhuy.com** | English | US (Vietnamese tradition) | ✅ Full recipe with ingredients and method. Vietnamese-American recipes with cultural context. URL format: `/{dish-slug}/`. e.g. `/vietnamese-lemongrass-chicken/`. |
| **toriavey.com** | English | US (Israeli / Levantine tradition) | ✅ Full recipe with ingredients, method, and temperature notes (e.g. "165°F for chicken"). Israeli, Middle Eastern, Mediterranean recipes. URL: `/{dish-slug}/`. e.g. `/chicken-shawarma/`, `/joojeh-kabab/`. |
| **valdemarsro.dk** | Danish | DK | ✅ **Via Internet Archive only** — direct fetch shows only author bio (JS-rendered). CDX lookup: `https://web.archive.org/cdx/search/cdx?url=www.valdemarsro.dk/{slug}*&output=text&fl=timestamp,original&limit=5`. Then fetch archived page. Confirmed working: `/kylling-cremet-sennepssauce/` (TS 20241004000438) — full Danish recipe with ingredients + method. |
| **povarenok.ru** | Russian | RU | ✅ Full recipe accessible. Encoding may show garbled Cyrillic on some renderers but content is present. Use `/recipes/show/{ID}/` format. e.g. `/recipes/show/159830/`, `/recipes/show/168647/` (goose breast grill pan), `/recipes/show/97189/` (braised goose slow-cook). Find IDs via web_search `site:povarenok.ru {recipe}`. Complements edimdoma.ru for Russian sources. |
| **lecker.de** | German | DE | ⚠️ Connects but often returns wrong recipe for a given numeric ID. Verify content before citing. |
| **donnahay.com.au** | English | AU | ⚠️ Site accessible but specific recipe pages return listing/grid. Not reliable for direct citation. |
| **sbs.com.au** | English | AU | ⚠️ Homepage accessible; individual recipe slugs often 404. Search before using. |
| **tasteline.com** | Swedish | SE | ⚠️ **NOW UNRELIABLE** — was working in v0.6.1.x but most recipe URLs now return 404. Search before every use; fallback to chefkoch.de + madensverden.dk for Scandinavian recipes. |
| **matprat.no** | Norwegian | NO | ⚠️ **NOW UNRELIABLE** — was working in earlier sessions but most URLs now return 404. Search `site:matprat.no {oppskrift}` to find any currently valid slugs. |
| **koket.se** | Swedish | SE | ✅ Full recipe content. Use short slug format directly under the root: `https://www.koket.se/{slug}` — e.g. `/shortribs-erik-videgards-recept`, `/shortribs-braserade-i-applemust`. Use `web_search site:koket.se {recipe}` first — guessed slugs almost always 404. Previously incorrectly listed as blocked (the URL format was wrong, not the network). |
| **chefsimon.com** | French | FR | ✅ Full recipe content in French. Chef-attributed recipes (Chef Simon and community members). URL format: `/gourmets/{username}/recettes/{slug}`. e.g. `/gourmets/chef-simon/recettes/poulet-roti-la-bonne-cuisson`. Use `web_search site:chefsimon.com {recette}` to find slugs. Confirmed 2026-04-27. **Fills French gap.** |
| **koreanbapsang.com** | English | US (Korean tradition) | ✅ Full recipe content in English covering authentic Korean cuisine. Braised chicken (jjimdak), BBQ, soups, stews. URL format: `/{slug}/` e.g. `/jjimdakdakjjim-korean-style-braised/`, `/slow-cooker-dakjjim-korean-braised/`. Use `web_search site:koreanbapsang.com {dish}` for slugs. Confirmed 2026-04-27. **Fills Korean gap.** |
| **beyondkimchee.com** | English | US (Korean tradition) | ✅ Full recipe content in English. Korean celebration dishes — Galbi Jjim (braised short ribs), fermented foods, Korean-style grills. URL format: `/{slug}/` e.g. `/korean-braised-beef-short-ribs-galbi-jjim/`. Use `web_search site:beyondkimchee.com {dish}` for slugs. Confirmed 2026-04-27. Complements koreanbapsang.com. |
| **soppa365.fi** | Finnish | FI | ✅ Full recipe content in Finnish with ingredient list and numbered steps. URL format: `/reseptit/{category}/{slug}` e.g. `/reseptit/kana-arjen-nopeat/paistettu-broileri-ja-chimichurri`. Always `web_search site:soppa365.fi {resepti}` first — category prefix in URL is required. Confirmed 2026-04-27. **Fills Finnish gap.** |
| **apetitonline.cz** | Czech | CZ | ✅ Full recipe content in Czech with ingredient quantities and numbered steps. Published by Apetit magazine. URL format: `/recept/{slug}` e.g. `/recept/kure-na-paprice`. Use `web_search site:apetitonline.cz {recept}` for slugs. Confirmed 2026-04-27. **Fills Czech gap.** |
| **cookinpolish.com** | English | PL (Polish tradition) | ✅ Full recipe content in English covering traditional Polish cuisine. Pierogi, schabowy (breaded cutlets), bigos, beet salad. URL format: `/{slug}/` e.g. `/breaded-chicken-breast-cutlets/`. Use `web_search site:cookinpolish.com {dish}` for slugs. Confirmed 2026-04-27. **Fills Polish gap.** |
| **receptai.lt** | Lithuanian | LT | ✅ Full recipe content in Lithuanian with ingredient list and method steps. URL format: `/receptas/{slug}-{ID}` e.g. `/receptas/kepta-vistiena-6738`. Use `web_search site:receptai.lt {patiekalas}` to find IDs. Confirmed 2026-04-27. **Fills Baltic (Lithuanian) gap.** |
| **georgianrecipes.net** | English | GE (Georgian tradition) | ✅ Full recipe content in English — traditional Georgian (Caucasus) cuisine. Chikhirtma (Georgian chicken broth), Chicken Tabaka, Satsivi, Abkhazian sauces. URL format: `/{year}/{month}/{day}/{slug}/` e.g. `/2015/07/18/chikhirtma/`, `/2014/04/04/chicken-tabaka/`. Use `web_search site:georgianrecipes.net {dish}` for correct date-slug paths. Confirmed 2026-04-27. **Fills Caucasus (Group D) gap.** |
| **marocmama.com** | English | US (Moroccan tradition) | ✅ Full recipe content in English. Moroccan, North African cuisine — Chicken Tagine, Chermoula, Harissa chicken. URL format: `/{slug}/` e.g. `/moroccan-grilled-chicken-with-chermoula/`, `/chicken-and-olive-tajine/`. Use `web_search site:marocmama.com {dish}` for slugs. Confirmed 2026-04-27. **Fills Moroccan/North African (Group C) gap.** |
| **cheftariq.com** | English | GB (Levantine / Syrian tradition) | ✅ Full recipe content in English. Syrian, Levantine, Middle Eastern cuisine — Shish Tawook, Maqluba, Sumac chicken. URL format: `/recipe/{slug}/` e.g. `/recipe/shish-tawook/`, `/recipe/maqluba/`, `/recipe/rice-stuffed-chicken/`. Use `web_search site:cheftariq.com {dish}` for slugs. Confirmed 2026-04-27. Complements toriavey.com. **Adds Arabic/Levantine coverage.** |
| **pinaenlacocina.com** | English / Spanish | US (Mexican tradition) | ✅ Full recipe content. Traditional Mexican home cooking — Carnitas, enchiladas, tamales. Recipes in English with Spanish dish names. URL format: `/{slug}/` e.g. `/pork-carnitas/`, `/sheet-pan-pork-carnitas/`. Use `web_search site:pinaenlacocina.com {dish}` for slugs. Confirmed 2026-04-27. **Fills Mexican gap.** |
| **cookpad.com/id** | Indonesian | ID | ✅ Full recipe content in Indonesian. ⚠️ URL format is **`/id/resep/{numeric-id}`** — NOT `/id/recipes/{id}` (that returns 404). e.g. `/id/resep/25683421` (Ayam Bakar Solo). Search `site:cookpad.com/id {resep nama}` to find IDs. Note: ingredient list may require fetching full page; method steps appear prominently. Confirmed 2026-04-27. Replaces incorrect `/id/recipes/` format note in matrix. |

---

## Partially working / wrong-content sites

Sites that connect but return homepage, profile, GDPR gate, or a different recipe.

| Site | Status | Problem |
|------|--------|---------|
| **tasteline.com** | ⚠️ UNRELIABLE (2026-04-24) | Was working in previous sessions; most recipe slugs now return 404. Always search first. |
| **matprat.no** | ⚠️ UNRELIABLE (2026-04-24) | Was working in previous sessions; now returns 404 for most tested URLs. |
| **lecker.de** | ⚠️ WRONG CONTENT | Returns different recipe than URL implies (ID mismatch). Verify every fetch before citing. |
| **nytimes.com/cooking** | ⚠️ WRONG CONTENT | Connects but returns wrong recipe (different dish entirely). Paywall may redirect. Do not use. |
| **food.com** | ⚠️ WRONG CONTENT | Returns user profile/bio, not recipe content. Do not use for recipe citations. |
| **geniuskitchen.com** | ⚠️ WRONG CONTENT | Returns user profile/bio, not recipe content. Do not use. |
| **allerhande.nl** | ⚠️ WRONG CONTENT | Returns Dutch homepage not recipe page. Do not use. |
| **marmiton.org** | ⚠️ GDPR GATE | Returns GDPR consent screen, no recipe content. |
| **750g.com** | ⚠️ WRONG CONTENT | Returns wrong French recipe. |
| **ica.se** | ⚠️ WRONG CONTENT | Connects but returns wrong/unrelated content. |
| **kotikokki.net** | ⚠️ LOGIN WALL | Finnish site returns only a contact/email form. No recipe content. |
| **kwestiasmaku.com** | ⚠️ EMPTY PAGE | Polish site returns only footer/copyright text. No recipe content. |
| **jamilacuisine.ro** | ⚠️ EMPTY PAGE | Romanian site returns only copyright notice. No recipe content. |
| **kiwilimon.com** | ⚠️ EMPTY CONTENT | Returns only "También te puede interesar" (recommendation links). No recipe text. |
| **rasa.my** | ⚠️ WRONG CONTENT | Returns restaurant reviews, not step-by-step recipes. |
| **krua.co** | ⚠️ BLOCKED | HTTP 403. Thai language site, not accessible. |
| **streetkitchen.hu** | ⚠️ JS-RENDERED | Hungarian site (Next.js). Site is 200 but ingredient list is JavaScript-rendered and not accessible via web_fetch. Only blog text returned. Do not use. |
| **nami-nami.ee** | ⚠️ HTML ONLY | Estonian recipe site (server-rendered PHP). Site is 200 but web_fetch markdown conversion fails — raw HTML only returned. Recipe content is in the HTML but impractical to parse. Use receptai.lt (Lithuanian) or book citations instead. |
| **tudogostoso.com.br** | ⚠️ WRONG CONTENT | Brazilian recipe site. Accessible (200) but URL slug text does not reliably match recipe ID content (e.g. ID 12840 with frango-assado slug returned a coxinha recipe). Same wrong-content trap as lecker.de. Do not use without verifying returned content matches expected recipe. |

---

## Confirmed BLOCKED / DEAD sites

| Site | Status | Code |
|------|--------|------|
| simplyrecipes.com | ❌ BLOCKED | HTTP 402 |
| allrecipes.com | ❌ BLOCKED | HTTP 402 |
| marthastewart.com | ❌ BLOCKED | HTTP 402 |
| foodandwine.com | ❌ BLOCKED | HTTP 402 |
| thespruceeats.com | ❌ BLOCKED | HTTP 402 |
| food52.com | ❌ BLOCKED | HTTP 429 (rate limit) |
| maangchi.com | ❌ BLOCKED | HTTP 403 (Korean) |
| mexicoinmykitchen.com | ❌ BLOCKED | HTTP 403 |
| greatcurryrecipes.net | ❌ BLOCKED | HTTP 403 |
| food24.com | ❌ BLOCKED | HTTP 403 (South African) |
| taste.com.au | ❌ BLOCKED | HTTP 403 |
| 196flavors.com | ❌ BLOCKED | HTTP 522 (connection timeout) |
| coop.se | ❌ NOT FOUND | HTTP 404 |
| arla.se | ❌ NOT FOUND | HTTP 404 |
| icakuriren.se | ❌ NOT FOUND | HTTP 404 |
| mathem.se | ❌ NOT FOUND | HTTP 404 |
| epicurious.com | ❌ NOT FOUND | HTTP 404 |
| delish.com | ❌ NOT FOUND | HTTP 404 |
| tasteofhome.com | ❌ NOT FOUND | HTTP 404 |
| bonappetit.com | ❌ NOT FOUND | HTTP 404 |
| jamieoliver.com | ❌ NOT FOUND | HTTP 404 |
| **196flavors.com** | ✅ DIRECT ACCESS (corrected) | Was incorrectly listed as HTTP 522. Direct fetch confirmed working 2026-04-24. |
| kawaling-pinoy.com | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| rasamalaysia.com | ❌ WRONG FORMAT | Returns PDF binary, not HTML |
| panlasangpinoy.com | ❌ WRONG FORMAT | Returns JPEG image binary, not HTML |
| cuisine-actuelle.fr | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| tudo-gostoso.com.br | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| sabores.club | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| sofreh.com | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| wasfety.com | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Arabic recipe site) |
| borioli.ru | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| godmat.no | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Norwegian) |
| kokkentips.dk | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Danish) |
| kuharica.hr | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Croatian) |
| gasztroangyal.hu | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Hungarian) |
| receptneked.hu | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Hungarian) |
| hungryforgoodies.com | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| mat.se | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Swedish) |
| varecha.pravda.sk | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Slovak) |
| kuchynalidky.sk | ❌ TIMEOUT | TypeError: fetch failed — network blocked (Slovak) |
| allrecipes.co.id | ❌ TIMEOUT | TypeError: fetch failed — network blocked |
| mexicoenmicocina.com | ❌ BLOCKED | HTTP 403 |
| yummy.ph | ❌ BLOCKED | HTTP 403 (Filipino recipe site) |
| akispetretzikis.com | ❌ BLOCKED | HTTP 403 (Greek chef site) |
| allrecipes.co.kr | ❌ BLOCKED | TypeError: fetch failed (Korean) |
| przepisy.pl | ❌ BLOCKED | HTTP 403 (Polish) |
| tasteofbeirut.com | ❌ COOKIE WALL | Returns only cookie-consent screen, no recipe content |
| cybercook.com.br | ❌ DEAD | Site permanently closed (Brazilian) |
| toprecepti.com | ❌ DEAD | Domain for sale |
| receptek.hu | ❌ DEAD | Domain for sale (Hungarian) |
| nosalty.hu | ❌ NOT FOUND | HTTP 404 for all tested recipe slugs (Hungarian) |
| recepty.cz | ❌ NOT FOUND | HTTP 404 for all tested slugs (Czech) |
| vareni.cz | ❌ SERVER ERROR | HTTP 500 (Czech) |
| ptitchef.com | ❌ NOT FOUND | HTTP 404 (French) |
| runawayrice.com | ❌ NOT FOUND | HTTP 404 (Vietnamese-American) |
| kannammacooks.com | ❌ NOT FOUND | HTTP 404 (Indian) |
| kuchnia-domowa.pl | ❌ NOT FOUND | HTTP 404 (Polish) |
| arla.se | ❌ NOT FOUND | HTTP 404 for recipe URLs (Swedish dairy brand) |
| opskrifter.dk | ❌ NOT FOUND | HTTP 404 (Danish) |
| gotujmy.pl | ❌ NOT FOUND | HTTP 404 (Polish) |
| polki.pl | ❌ NOT FOUND | HTTP 404 (Polish women's magazine) |
| haemuk.com | ❌ NOT FOUND | HTTP 404 (Korean) |
| larecetadelaabuela.com | ❌ NOT FOUND | HTTP 404 (Spanish) |
| recetasargentinas.net | ❌ NOT FOUND | HTTP 404 (Argentine) |
| lavanguardia.com | ❌ NOT FOUND | HTTP 404 for recipe URLs (Spanish newspaper) |
| jow.fr | ❌ NOT FOUND | HTTP 404 (French meal-kit) |
| 196flavors.com/mexico-pollo-asado/ | ⚠️ NOTE | This specific URL returns 404 but other 196flavors.com URLs work. Use site search. |
| chef-in.co.il | ❌ NOT FOUND | HTTP 404 (Hebrew/Israeli) |
| cookpad.com/sa | ❌ NOT FOUND | HTTP 404 (Arabic Saudi) |
| cookpad.com/tr | ❌ NOT FOUND | HTTP 404 (Turkish) |
| vegrecipesofindia.com | ❌ NOT FOUND | HTTP 404 for tested slugs |
| mindmegette.hu | ❌ NOT FOUND | HTTP 404 for tested slugs (Hungarian) |
| aniagotuje.pl | ❌ NOT FOUND | HTTP 404 (Polish) |
| retete-culinare.ro | ❌ NOT FOUND | HTTP 404 (Romanian; use gustos.ro instead) |
| likecook.ru | ❌ NOT FOUND | HTTP 404 (Russian) |
| ricardocuisine.com | ❌ NOT FOUND | HTTP 404 (French-Canadian) |
| panelinha.com.br | ❌ NOT FOUND | HTTP 404 (Brazilian) |
| clorofila.com.br | ❌ NOT FOUND | HTTP 404 (Brazilian) |
| recetasgratis.net | ❌ WRONG CONTENT | Returns completely different recipe for given URL (confirmed 2026-04-24) |
| cuisineaz.com | ❌ WRONG CONTENT | Returns wrong recipe — ID mismatch (French site) |
| kurzy.cz | ❌ NOT A RECIPE SITE | Czech finance/business info site |
| kulinarne.pl | ❌ NOT A RECIPE SITE | Domain-registrar page, not recipes |
| sidechef.com | ⚠️ LISTING ONLY | Returns category listing, no individual recipe content at base URLs |
| nzlamb.co.nz | ❌ TIMEOUT | DNS/network unreachable |
| nhk.or.jp | ❌ TIMEOUT | DNS/network unreachable |
| kogebogen.dk | ❌ TIMEOUT | DNS/network unreachable |
| jamiemagazine.nl | ❌ TIMEOUT | DNS/network unreachable |
| persianavegankitchen.com | ❌ TIMEOUT | DNS/network unreachable |
| tudo-gostoso.com.br | ❌ TIMEOUT | DNS/network unreachable |
| receitas.com.br | ❌ TIMEOUT | DNS/network unreachable |
| recepten.nl | ❌ TIMEOUT | DNS/network unreachable |
| hot-thai-kitchen.com (guessed slugs) | ⚠️ NOTE | Many guessed slug paths return 404. Always search `site:hot-thai-kitchen.com {dish}` first. |
| chinasichuanfood.com | ❌ NOT FOUND | HTTP 404 for all tested recipe URLs |
| laylita.com | ❌ WRONG FORMAT | Returns JPEG image, not HTML recipe page |
| recetasgratis.net | ❌ WRONG CONTENT | Returns category listing page, not individual recipe |
| 10000recipe.com | ❌ JS ERROR | Korean site returns null JS error |
| caribbeanpot.com | ❌ NOT FOUND | HTTP 404 for all tested recipe URLs |
| yummly.com | ❌ BLOCKED | HTTP 403 |

---

## Recommended source matrix by cuisine / language

Use this matrix to select culturally diverse sources for each leaf file.

| Tradition | Best source(s) |
|-----------|---------------|
| British / English | bbcgoodfood.com (via IA), nigella.com |
| American / General English | themediterraneandish.com, thewoksoflife.com, recipetineats.com |
| Australian | recipetineats.com, gourmettraveller.com.au |
| Portuguese | teleculinaria.pt |
| Spanish | directoalpaladar.com |
| Italian | ricette.giallozafferano.it |
| French | **chefsimon.com** ✅ (confirmed 2026-04-27) — marmiton.org ⚠️ (GDPR gate — no usable content) |
| German | chefkoch.de |
| Austrian | ichkoche.at |
| Danish | madensverden.dk (direct, no www), valdemarsro.dk (via IA) |
| Norwegian | matprat.no ⚠️ (unreliable) — fallback: madensverden.dk |
| Swedish | koket.se ✅ (confirmed), tasteline.com ⚠️ (unreliable) |
| Croatian / Balkan | coolinarika.com |
| Romanian | gustos.ro |
| Greek | argiro.gr |
| Turkish | nefisyemektarifleri.com, yemek.com |
| Russian | edimdoma.ru, povarenok.ru |
| Israeli / Levantine / Middle Eastern | toriavey.com, **cheftariq.com** ✅ (Syrian/Levantine, confirmed 2026-04-27) |
| Moroccan / North African | **marocmama.com** ✅ (confirmed 2026-04-27) |
| Vietnamese | hungryhuy.com |
| Thai | hot-thai-kitchen.com (search for exact slug first) |
| Chinese | xiachufang.com, thewoksoflife.com |
| Japanese | cookpad.com/jp |
| Indonesian | **cookpad.com/id** — use `/id/resep/{ID}` format (NOT `/id/recipes/`) |
| Indian / South Asian | indianhealthyrecipes.com, vahrehvah.com |
| West African / Nigerian | africanbites.com (search for exact slug first) |
| Caribbean | africanbites.com (Jamaican recipes) |
| South African | taste.co.za |
| Global / Multi-country | 196flavors.com (recipes from 196 countries) |
| Korean | **koreanbapsang.com** ✅, **beyondkimchee.com** ✅ (both confirmed 2026-04-27) — maangchi.com ❌ (blocked) |
| Brazilian / Portuguese-BR | cybercook.com.br ❌ (dead); tudogostoso.com.br ⚠️ (wrong-content ID mismatch); no fully reliable BR source confirmed |
| Mexican / Latin American | **pinaenlacocina.com** ✅ (confirmed 2026-04-27); mexicoenmicocina.com ❌ (403) |
| Polish | **cookinpolish.com** ✅ (English-language Polish cuisine, confirmed 2026-04-27) — kwestiasmaku.com ⚠️ (empty page) |
| Finnish | **soppa365.fi** ✅ (Finnish, confirmed 2026-04-27) — kotikokki.net ⚠️ (login wall) |
| Czech | **apetitonline.cz** ✅ (Czech, confirmed 2026-04-27) — vareni.cz ❌ (500); recepty.cz ❌ (404) |
| Hungarian | streetkitchen.hu ⚠️ (JS-rendered, ingredients inaccessible); nosalty.hu ❌ (404); no confirmed Hungarian source |
| Lithuanian (Baltic) | **receptai.lt** ✅ (Lithuanian, confirmed 2026-04-27) |
| Latvian / Estonian (Baltic) | nami-nami.ee ⚠️ (HTML only, markdown fails); no confirmed Latvian source |
| Georgian (Caucasus) | **georgianrecipes.net** ✅ (English, confirmed 2026-04-27) |

---

## Protocol for using working sources

### Finding a correct URL
1. Run `web_search` with `site:{domain} {recipe-name}` to find the actual URL slug.
2. Confirm the slug in the search result annotations/citations.
3. Use `web_fetch` on the discovered URL to retrieve actual content.
4. If content matches the expected recipe, cite it. If content is wrong, try another URL.

### Chefkoch.de URL discovery
```
web_search: site:chefkoch.de lammhaxen geschmort rezept
→ finds: https://www.chefkoch.de/rezepte/566811155129665/Geschmorte-Lammhaxen.html
→ web_fetch that URL → confirmed recipe content
```

### Tasteline.com URL discovery
```
web_search: site:tasteline.com havsabborre recept
→ finds: https://www.tasteline.com/recept/hel-saltbakad-havsabborre-med-pepparrot-och-rakor/
→ web_fetch that URL → confirmed recipe content (or 404 if recipe removed)
```

### Matprat.no URL discovery
```
web_search: site:matprat.no lammeskank oppskrift
→ finds multiple:
  https://www.matprat.no/oppskrifter/gjester/lammeskanker-med-ovnsbakte-gronnsaker/
  https://www.matprat.no/oppskrifter/gjester/olbraiserte-lammeskanker/
  https://www.matprat.no/oppskrifter/gjester/guinnessbraiserte-lammeskanker/
→ web_fetch each to get actual content
```

### Nigella.com URL format
```
https://www.nigella.com/recipes/{slug}
e.g. https://www.nigella.com/recipes/aromatic-lamb-shank-stew
     https://www.nigella.com/recipes/wide-noodles-with-lamb-shank-in-aromatic-broth
```

### Cookpad Japan URL format
```
Search: https://cookpad.com/jp/search/{URL-encoded-Japanese-term}
Recipe: https://cookpad.com/jp/recipes/{numeric-id}
e.g. https://cookpad.com/jp/recipes/25090374 (lamb shank with cider and shallots)
```

### Argiro.gr URL format
```
https://www.argiro.gr/recipe/{slug}/
e.g. https://www.argiro.gr/recipe/arni-kotsi-me-polychroma-karota/
```

### ChefSimon.com URL format (French)
```
https://chefsimon.com/gourmets/{username}/recettes/{slug}
e.g. https://chefsimon.com/gourmets/chef-simon/recettes/poulet-roti-la-bonne-cuisson
Search: web_search site:chefsimon.com {recette} to find username + slug pairs
```

### Koreanbapsang.com URL format
```
https://www.koreanbapsang.com/{slug}/
e.g. https://www.koreanbapsang.com/jjimdakdakjjim-korean-style-braised/
Search: web_search site:koreanbapsang.com {Korean dish}
```

### Soppa365.fi URL format (Finnish)
```
https://www.soppa365.fi/reseptit/{category}/{slug}
e.g. https://www.soppa365.fi/reseptit/kana-arjen-nopeat/paistettu-broileri-ja-chimichurri
⚠️ Category prefix is required — guessed slugs under /reseptit/ without category return 404
Search: web_search site:soppa365.fi {reseptinimi} to find category + slug
```

### Apetitonline.cz URL format (Czech)
```
https://www.apetitonline.cz/recept/{slug}
e.g. https://www.apetitonline.cz/recept/kure-na-paprice
Search: web_search site:apetitonline.cz {název receptu}
```

### Receptai.lt URL format (Lithuanian)
```
https://www.receptai.lt/receptas/{slug}-{numeric-id}
e.g. https://www.receptai.lt/receptas/kepta-vistiena-6738
⚠️ ID is required at end of slug — slug alone returns 404
Search: web_search site:receptai.lt {patiekalas}
```

### Georgianrecipes.net URL format (Georgian / Caucasus)
```
https://georgianrecipes.net/{year}/{month}/{day}/{slug}/
e.g. https://georgianrecipes.net/2015/07/18/chikhirtma/
     https://georgianrecipes.net/2014/04/04/chicken-tabaka/
⚠️ Date path is required — no shorthand slug format available
Search: web_search site:georgianrecipes.net {Georgian dish}
```

### Cookpad Indonesia URL format
```
https://cookpad.com/id/resep/{numeric-id}
e.g. https://cookpad.com/id/resep/25683421
⚠️ IMPORTANT: Indonesian cookpad uses /id/resep/ — NOT /id/recipes/ (that returns 404!)
Contrast with Japanese: /jp/recipes/{id} (uses English "recipes")
Search: web_search site:cookpad.com/id {nama resep}
```

---

## Notes for future agents

1. **Outbound network access IS available in this sandbox (confirmed 2026-04-26).**
   web_fetch and curl both work. en.wikipedia.org, koket.se, themediterraneandish.com,
   recipetineats.com, and many others return real content. What blocks fetching is
   site-level decisions (paywall: 402, bot-block: 403, wrong slug: 404) — not the
   sandbox network itself. Always probe a URL before concluding it is inaccessible.

2. **web_search returns AI-synthesized text.** The text from web_search is NOT
   the same as fetched recipe content and CANNOT be used as a recipe source.
   web_search is only useful for discovering correct URL slugs. Always follow
   up with web_fetch to get actual content.

3. **Wrong-content redirects are a trap.** lecker.de, nytimes.com, food.com,
   and geniuskitchen.com all return a response with HTTP 200 but the content
   is not the requested recipe. Always scan the returned content for key
   recipe elements (ingredient quantities, numbered steps) before citing.

4. **Test new sources before using them.** If a source is not in this survey,
   always probe it with a test URL before building a leaf file around it.

5. **Book citations are always valid.** Classic cookbook references (Nigella Bites 2001,
   The Food Lab 2015, Le Guide Culinaire 1903, etc.) do not require web_fetch.
   Cite the author, book title, publisher, and year. Book citations are immune
   to network blocking and are the gold standard for provenance.

---

## Internet Archive (Wayback Machine) re-test — 2026-04-24

All ⚠️ and ❌ sites were re-tested via the Wayback Machine CDX API and direct page
fetches after it was discovered that `web.archive.org` is reachable from this sandbox.

### How the re-test was conducted

1. **CDX lookup** (prefix wildcard required):
   `https://web.archive.org/cdx/search/cdx?url=DOMAIN/PATH*&output=text&fl=timestamp,original&limit=2`
2. **Page fetch** using the exact 14-digit timestamp returned by CDX:
   `https://web.archive.org/web/YYYYMMDDHHMMSS/https://ORIGINAL_URL`
   — Abbreviated timestamps (8-digit) always return `TypeError: fetch failed`.
   — URLs with `:80` port in CDX output generally fail on fetch; only plain https:// URLs succeed.

### CDX lookup results — one representative recipe URL tested per domain

| Domain | CDX result | Page fetch | Verdict |
|--------|------------|------------|---------|
| **geniuskitchen.com** | ✅ 20171006 found | ✅ Real recipe content (directions + rating) — asparagus at 400°F | **✅ IA WORKS — usable** |
| **valdemarsro.dk** | ✅ 20241004000438 found (https://) | ✅ Full Danish recipe content returned | **✅ IA WORKS** — use CDX `url=www.valdemarsro.dk/{slug}*` then fetch archived URL. Corrects previous "INCONCLUSIVE" result. |
| **epicurious.com** | ✅ 20110424 found (`http://…:80`) | ❌ TypeError (port-80) | **⚠️ INCONCLUSIVE** — old archive, port-80 fetch fails |
| **food.com** | ✅ 20100721 found (`http://…:80`) | ❌ TypeError (port-80) | **⚠️ INCONCLUSIVE** — old archive (2010), port-80 fetch fails |
| **foodandwine.com** | ✅ 20161002 found (`http://…:80`) | ❌ TypeError (port-80) | **⚠️ INCONCLUSIVE** — archive exists, port-80 fetch fails |
| **10000recipe.com** | ✅ 20170115 found (index only) | not tested | **❌ NOT USEFUL** — only index page archived |
| **arla.se** | ✅ 20011005 found (2001) | not tested | **❌ NOT USEFUL** — archive from 2001, site completely different |
| **tasteline.com** | ❌ no CDX results for recipe URLs | — | **❌ NO USABLE ARCHIVE** |
| **matprat.no** | ❌ no CDX results for modern recipe URLs (only 2007–2008 old ASP format) | — | **❌ NO USABLE ARCHIVE** |
| **marmiton.org** | ❌ no CDX results for modern recipe URLs (only 2009 old ASP format) | — | **❌ NO USABLE ARCHIVE** |
| **lecker.de** | ❌ CDX timeout | — | **❌ NOT TESTABLE** |
| **simplyrecipes.com** | ❌ CDX timeout / no results for recipe paths | — | **❌ NO USABLE ARCHIVE** |
| **allrecipes.com** | ❌ CDX timeout | — | **❌ NOT TESTABLE** |
| **marthastewart.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **foodandwine.com** | ✅ archive found but port-80 | — | see above |
| **thespruceeats.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **food52.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **maangchi.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **mexicoinmykitchen.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **greatcurryrecipes.net** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **food24.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **taste.com.au** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **196flavors.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **koket.se** | N/A | — | **✅ DIRECT ACCESS WORKS** — no archive needed; use web_search for slugs then web_fetch directly |
| **coop.se** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **arla.se** | ✅ 2001 only | — | **❌ NOT USEFUL** (too old) |
| **icakuriren.se** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **mathem.se** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **epicurious.com** | ✅ 2011 only | — | see above |
| **delish.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **tasteofhome.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **bonappetit.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **jamieoliver.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **cybercook.com.br** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **nzlamb.co.nz** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **nhk.or.jp** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **kogebogen.dk** | ❌ CDX timeout | — | **❌ NOT TESTABLE** |
| **jamiemagazine.nl** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **persianavegankitchen.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **tudo-gostoso.com.br** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **receitas.com.br** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **recepten.nl** | ❌ no CDX results for recipe paths | — | **❌ NO USABLE ARCHIVE** |
| **chinasichuanfood.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **laylita.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **recetasgratis.net** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **10000recipe.com** | ✅ index only | — | **❌ NOT USEFUL** |
| **caribbeanpot.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **yummly.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **750g.com** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **allerhande.nl** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **nytimes.com/cooking** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
| **geniuskitchen.com** | ✅ 20171006 works | ✅ real recipe content | **✅ IA WORKS — add to confirmed** |

### Summary: new IA-accessible sources

Only **geniuskitchen.com** was confirmed fully working via Internet Archive (real recipe content returned, including directions and temperatures). **valdemarsro.dk** was re-confirmed working via IA in 2026-04-24 global survey (see below). All other ⚠️/❌ sites either have no usable archive, only very old archives in incompatible URL formats, or have archives that return TypeError on fetch due to the `:80` port in the archived URL.

**geniuskitchen.com via IA**: Use CDX pattern `www.geniuskitchen.com/recipe/{slug}*` to find
timestamp, then fetch `https://web.archive.org/web/{TIMESTAMP}/http://www.geniuskitchen.com:80/recipe/{slug}`.
Note: content is minimal (directions only, no ingredient list shown in 2017 snapshot). Use as a
supplementary source only.

---

## Revision history

| Date | Agent session | Changes |
|------|--------------|---------|
| 2026-04-26 | v0.6.2.x | Network retest: confirmed outbound DNS and web_fetch work. koket.se moved to confirmed-working. Note 1 rewritten. RECIPE_COLLECTION_TOR.md method-status table updated. |
| 2026-04-24 | v0.6.1.x | Initial survey — 50+ sites probed, 17 confirmed working |
| 2026-04-24 | v0.6.1.x | Internet Archive re-test of all 46 ⚠️/❌ sites; geniuskitchen.com confirmed usable via IA; all others remain blocked or have no usable archive |
| 2026-04-24 | v0.6.1.x (continue-061-x) | Global diversity survey — 60+ additional sites probed across Portuguese, South African, Croatian, Romanian, Vietnamese, Israeli, Hungarian, Czech, Polish, Norwegian, Swedish, Danish, Filipino, Malaysian, Korean, Brazilian, Argentine, Mexican, French, Russian, Arabic, Thai, Indonesian traditions. 8 new confirmed working sites added. 50+ new blocked/dead sites documented. Recommended source matrix expanded. valdemarsro.dk confirmed via IA. |
