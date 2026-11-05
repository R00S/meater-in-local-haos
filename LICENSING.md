# Licensing

Kitchen Cooking Engine contains two different kinds of material. They are **not**
licensed the same way, and neither one implies anything about the other.

## 1. Code — BSD-3-Clause

All source code in this repository — the Home Assistant integration, the panel
JavaScript and its template, the generators and scripts, the Android app, the
tests and the build configuration — is released under the **BSD 3-Clause
License** (SPDX: `BSD-3-Clause`). The license text is in [LICENSE](LICENSE).

Copyright (c) 2026 R00S.

In practice anyone may use, modify and redistribute the code, including
commercially, provided they keep the copyright notice, this list of conditions
and the disclaimer, and do not use R00S's name or this project's name to endorse
a fork without written permission.

The license imposes no source-disclosure obligation, and it covers **code only**.
It grants nothing over the culinary research described below, which is a separate
body of work under its own terms.

## 2. Culinary research data — NOT GPL, all rights reserved

This covers the culinary research in this repository:

- `custom_components/kitchen_cooking_engine/www/recipes/**` — cut profiles,
  cut-method leaves, and the research and methodology documents
  (also reachable as `docs/recipe_research/`)
- `custom_components/kitchen_cooking_engine/www/cuisines/**` — regional cuisine
  profiles, produce grades, and ingredient and tradition notes
  (also reachable as `docs/cuisines/`)
- any generated file that embeds that research, such as the recipe and cuisine
  blocks inside `www/kitchen-cooking-panel.js` and the Android assets built from it

**What it is.** A human-created collection of culinary research: cut knowledge,
cooking-method temperature targets, regional cuisine profiles, ingredient and
tradition notes, and the methodology that describes how it was assembled. It was
gathered from human-written culinary sources at a time when human-written and
AI-generated material could still be told apart on the internet. Preserving that
human-created character is the point of keeping it separate.

**Ownership.** The collection is owned by R00S.

**License status.** No license is granted for it. It is **not covered by the
code license (BSD-3-Clause)**, and it is **not GPL**. It is not open source, not
public domain, and not offered under any Creative Commons or similar terms.

**Until further notice it may not be:**

- licensed, sublicensed, or sold
- copied or taken out of this repository or out of this project's context
- redistributed or published as a separate collection, dataset, or extract
- modified
- used to build a derivative collection

Its presence in this repository, in the published panel bundle, or in any
download is not a grant of permission. Permission has to be requested from R00S
in writing.

## 3. Forks for development or preservation

Forking this repository to help with development, or to preserve a copy of the
project, is fine. Two conditions come with that:

- the fork keeps the dual-licensing statement clear in its README (code versus
  culinary research, as described above), so nobody downstream mistakes the
  research for BSD-licensed or open-source material
- the culinary research is not taken out of the context of this Home Assistant
  integration — it stays part of the KCE integration in the fork, and is not
  reused for another product, dataset, or collection

A fork under these conditions does not need separate written permission. Anything
beyond them falls under section 2 and needs permission from R00S.

## 4. Recipes and traditions this research refers to

The recipes these files link to, cite, or are inspired by belong to their
authors. The dishes, methods, and food traditions belong to the cultures and
communities they come from.

Citations, links, and "inspired by" notes in the research are attribution and
evidence of research. They are not a claim of ownership by this project, and
they are not a license grant. A referenced recipe stays under its own author's
terms.

## 5. Questions

Open an issue on the repository or contact [@R00S](https://github.com/R00S).
