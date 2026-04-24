# Recipe Source Survey — Network Accessibility from Copilot Cloud Sandbox

**Purpose:** This document records the results of systematic web_fetch probing of global
recipe websites from the Copilot cloud agent sandbox. Each site was probed directly with
a relevant recipe URL to determine whether real recipe content (ingredients + method steps)
is accessible. This prevents agents wasting time on blocked or misdirecting sites.

**Last updated:** 2026-04-24 (+ Internet Archive re-test of all ⚠️/❌ sites)
**Agent session:** v0.6.1.x — implement-phase-8

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
| **africanbites.com** | English | US (West African / Caribbean) | ✅ Full recipe content. West African, Nigerian, Jamaican, Cameroonian traditions. e.g. `/jamaican-curry-goat/`, `/asun-spicy-roast-goat/`, `/grilled-lamb-chops/`. Always search `site:africanbites.com {recipe}` — guessed slugs often 404. |
| **vahrehvah.com** | English | IN (South Indian) | ✅ Full recipe content. Andhra, Telugu, pan-Indian. e.g. `/spicy-lamb-chops`, `/lamb-fry`, `/mutton-fry-indian-recipe`. Use slug format `/recipe-name` (no trailing slash). |
| **chefkoch.de** | German | DE | ✅ Full recipe content. Use numeric ID URLs: `/rezepte/{ID}/{slug}.html`. Find IDs via web_search `site:chefkoch.de {recipe}`. |
| **ichkoche.at** | German | AT (Austrian) | ✅ Full recipe content in German, Austrian traditions. Use `/{slug}-rezept-{ID}` format (slug first, then `-rezept-{ID}` at end). e.g. `/rezept-fuer-eingelegte-zitronen-rezept-54882`, `/kraeuterbutter-nach-grossmutter-art-rezept-106276`. Find IDs via IA CDX: `https://web.archive.org/cdx/search/cdx?url=www.ichkoche.at/rezept*&output=json&filter=statuscode:200&limit=10`. **⚠️ Previous survey had wrong format `/rezept-{slug}-{ID}` — corrected 2026-04-24.** |
| **madensverden.dk** | Danish | DK | ✅ Full recipe content in Danish. Use `https://madensverden.dk/{slug}/` — **no `www.` prefix**. Danish characters URL-encoded: ø→oe, æ→ae, å→aa. e.g. `/hvidloegsflutes-hjemmelavede-nemme-sproede/`, `/langtidsstegt-oksefilet-ovn/`, `/varm-boennesalat-med-groenne-boenner-tomater-og-hvidloeg/`. Navigate via IA: `https://web.archive.org/web/20170603212251/https://madensverden.dk/` shows recipe links on homepage. Confirmed 2026-04-24 via IA page fetch. |
| **directoalpaladar.com** | Spanish | ES | ✅ Full recipe content in Spanish. e.g. `/recetas-de-carnes-y-aves/jarrete-ternasco-asado-...` |
| **nefisyemektarifleri.com** | Turkish | TR | ✅ Full recipe content in Turkish. e.g. `/kuzu-incik/`, `/levrek-bugulama/`. Use `/` slug format. |
| **yemek.com** | Turkish | TR | ✅ Full recipe content in Turkish (second Turkish source). Chef-attributed recipes. e.g. `/tarif/kuzu-pirzola/`. Search `site:yemek.com {yemek}`. |
| **giallozafferano.it** | Italian | IT | ✅ Full recipe content in Italian. Use `ricette.giallozafferano.it/{Capitalized-Slug}.html`. e.g. `/Cinghiale-in-umido.html`. Search `site:giallozafferano.it {ricetta}` to find slugs. |
| **indianhealthyrecipes.com** | English | IN | ✅ Full recipe content. Indian, Kashmiri, South Indian traditions. e.g. `/rogan-josh/`, `/mutton-chops/` |
| **argiro.gr** | Greek | GR | ✅ Full recipe content in Greek. Use `/recipe/{slug}/` format. e.g. `/recipe/arni-kotsi-me-polychroma-karota/` |
| **cookpad.com/jp** | Japanese | JP | ✅ Full recipe content in Japanese. Use `/jp/recipes/{numeric-id}`. Search `site:cookpad.com/jp {食材}` to find IDs. e.g. `/jp/recipes/19032918` (Xinjiang lamb stir-fry). |
| **xiachufang.com** | Chinese (Mandarin) | CN | ✅ Full recipe content in Chinese. Use `/recipe/{numeric-id}/` format. e.g. `/recipe/102228983/` (oven lamb ribs). Search `site:xiachufang.com {菜名}` to find IDs. |
| **edimdoma.ru** | Russian | RU | ✅ Full recipe content in Russian. Use `/retsepty/{ID}-{slug}` format. e.g. `/retsepty/13146-shashlyk-iz-baraniny`. Search `site:edimdoma.ru {рецепт}`. |
| **cookpad.com/id** | Indonesian (Bahasa) | ID | ✅ Full recipe content in Indonesian. Use `/id/resep/{numeric-id}` format. e.g. `/id/resep/24806655` (gulai kambing). Search `site:cookpad.com/id {masakan}`. |
| **lecker.de** | German | DE | ⚠️ Connects but often returns wrong recipe for a given numeric ID. Verify content before citing. |
| **donnahay.com.au** | English | AU | ⚠️ Site accessible but specific recipe pages return listing/grid. Not reliable for direct citation. |
| **sbs.com.au** | English | AU | ⚠️ Homepage accessible; individual recipe slugs often 404. Search before using. |
| **tasteline.com** | Swedish | SE | ⚠️ **NOW UNRELIABLE** — was working in v0.6.1.x but most recipe URLs now return 404. Search before every use; fallback to chefkoch.de + madensverden.dk for Scandinavian recipes. |
| **matprat.no** | Norwegian | NO | ⚠️ **NOW UNRELIABLE** — was working in earlier sessions but most URLs now return 404. Search `site:matprat.no {oppskrift}` to find any currently valid slugs. |

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
| koket.se | ❌ NOT FOUND | HTTP 404 (Swedish TV kitchen) |
| coop.se | ❌ NOT FOUND | HTTP 404 |
| arla.se | ❌ NOT FOUND | HTTP 404 |
| icakuriren.se | ❌ NOT FOUND | HTTP 404 |
| mathem.se | ❌ NOT FOUND | HTTP 404 |
| epicurious.com | ❌ NOT FOUND | HTTP 404 |
| delish.com | ❌ NOT FOUND | HTTP 404 |
| tasteofhome.com | ❌ NOT FOUND | HTTP 404 |
| bonappetit.com | ❌ NOT FOUND | HTTP 404 |
| jamieoliver.com | ❌ NOT FOUND | HTTP 404 |
| africanbites.com (guessed slugs) | ⚠️ NOTE | Many slug guesses return 404. Always search `site:africanbites.com {dish}` first. |
| nigella.com (404 test) | ✅ NOTE | Some slug variants return 404; search first |
| cybercook.com.br | ❌ DEAD | Site permanently closed |
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
| British / English | bbcgoodfood.com, nigella.com |
| American | themediterraneandish.com, thewoksoflife.com |
| Australian | recipetineats.com, gourmettraveller.com.au |
| Mediterranean (Greek, Turkish, Moroccan, Persian) | themediterraneandish.com, argiro.gr, nefisyemektarifleri.com |
| Italian | ricette.giallozafferano.it |
| Spanish | directoalpaladar.com |
| German | chefkoch.de (verify fetched content!) |
| Austrian | ichkoche.at |
| Swedish | tasteline.com ⚠️ (unreliable) — fallback: madensverden.dk or chefkoch.de |
| Norwegian | matprat.no ⚠️ (unreliable) — fallback: madensverden.dk |
| Danish | madensverden.dk |
| Thai | hot-thai-kitchen.com (search for exact slug first) |
| Chinese | xiachufang.com, thewoksoflife.com |
| Japanese | cookpad.com/jp |
| Indonesian | cookpad.com/id |
| Indian / South Asian | indianhealthyrecipes.com, vahrehvah.com, bbcgoodfood.com (Indian recipes) |
| Turkish | nefisyemektarifleri.com, yemek.com |
| Greek | argiro.gr |
| West African / Nigerian | africanbites.com (search for exact slug first) |
| Caribbean | africanbites.com (Jamaican curry goat, etc.) |
| Russian | edimdoma.ru |
| French | web_search for marmiton.org or 750g.com (GDPR gated — may need alternate) |
| Polish | kwestiasmaku.com — ❌ not usable from sandbox |
| Finnish | kotikokki.net — ❌ login wall |
| Korean | maangchi.com — ❌ blocked; no usable Korean source found |
| Brazilian / Portuguese | cybercook.com.br — ❌ dead; use web_search |
| South African | food24.com — ❌ blocked |
| Latin American (Mexican, Ecuadorian) | laylita.com ❌ (returns image), kiwilimon.com ❌ (empty); fallback: directoalpaladar.com or themediterraneandish.com |

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

---

## Notes for future agents

1. **The sandbox network is NOT the same as a public browser.** Many sites that
   appear accessible from a normal browser are blocked in this environment.

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
| **valdemarsro.dk** | ✅ 20180103 found (`http://…:80`) | ❌ TypeError (port-80 format fails on fetch) | **⚠️ INCONCLUSIVE** — archive exists but unreachable; try `https://` snapshot URLs |
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
| **koket.se** | ❌ no CDX results | — | **❌ NO USABLE ARCHIVE** |
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

Only **geniuskitchen.com** was confirmed fully working via Internet Archive (real recipe content returned, including directions and temperatures). All other ⚠️/❌ sites either have no usable archive, only very old archives in incompatible URL formats, or have archives that return TypeError on fetch due to the `:80` port in the archived URL.

**geniuskitchen.com via IA**: Use CDX pattern `www.geniuskitchen.com/recipe/{slug}*` to find
timestamp, then fetch `https://web.archive.org/web/{TIMESTAMP}/http://www.geniuskitchen.com:80/recipe/{slug}`.
Note: content is minimal (directions only, no ingredient list shown in 2017 snapshot). Use as a
supplementary source only.

---

## Revision history

| Date | Agent session | Changes |
|------|--------------|---------|
| 2026-04-24 | v0.6.1.x | Initial survey — 50+ sites probed, 17 confirmed working |
| 2026-04-24 | v0.6.1.x | Internet Archive re-test of all 46 ⚠️/❌ sites; geniuskitchen.com confirmed usable via IA; all others remain blocked or have no usable archive |
