"""Cuisine metadata localization tests."""

from __future__ import annotations

import importlib.util
import json
import re
import sys
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
COMPONENT_DIR = ROOT / "custom_components" / "kitchen_cooking_engine"
CUISINE_DIR = COMPONENT_DIR / "www" / "cuisines"
I18N_DIR = COMPONENT_DIR / "i18n"
PANEL_TEMPLATE = COMPONENT_DIR / "www" / "panel-class-template.js"
GENERATED_PANEL = COMPONENT_DIR / "www" / "kitchen-cooking-panel.js"
REGION_IDS = {
    "african",
    "caribbean_region",
    "east_asian",
    "european",
    "latin_american",
    "middle_east",
    "nordic",
    "north_american",
    "oceanian",
    "south_asian",
    "southeast_asian",
}


def load_module(name: str, path: Path):
    """Load a repository module without importing Home Assistant."""
    spec = importlib.util.spec_from_file_location(name, path)
    assert spec and spec.loader
    module = importlib.util.module_from_spec(spec)
    sys.modules[name] = module
    spec.loader.exec_module(module)
    return module


def parse_generated_constant(source: str, name: str):
    """Parse a JSON-compatible constant from the checked-in panel."""
    declaration = re.search(rf"^const {re.escape(name)} = ", source, re.MULTILINE)
    if declaration is None:
        raise AssertionError(f"Generated panel is missing {name}")
    value, end = json.JSONDecoder().raw_decode(source[declaration.end():])
    if not source[declaration.end() + end:].startswith(";\n"):
        raise AssertionError(f"Generated panel has a malformed {name} declaration")
    return value


class CuisineLocalizationTests(unittest.TestCase):
    """Ensure every cuisine exposes complete Danish metadata."""

    @classmethod
    def setUpClass(cls) -> None:
        cls.generator = load_module(
            "kce_cuisine_generator",
            COMPONENT_DIR / "generate_frontend_data.py",
        )
        cls.frontmatter = {}
        for path in sorted(CUISINE_DIR.glob("*.md")):
            content = path.read_text(encoding="utf-8")
            end = content.find("\n---", 3)
            if not content.startswith("---") or end == -1:
                raise AssertionError(f"Malformed cuisine frontmatter: {path}")
            data = cls.generator.yaml.safe_load(content[4:end])
            cls.frontmatter[path] = data

        (
            cls.ingredients,
            cls.cuisine_to_region,
            cls.regions,
            cls.descriptions,
        ) = cls.generator.build_cuisine_data(str(COMPONENT_DIR))
        cls.generated_panel = GENERATED_PANEL.read_text(encoding="utf-8")

    def test_canonical_cuisine_metadata_has_danish_parity(self) -> None:
        cuisine_ids = set()
        region_ids = set()
        missing = []
        for path, data in self.frontmatter.items():
            cuisine_ids.add(data["id"])
            region_ids.add(data["region"])
            for field in ("name_da", "description_da"):
                value = data.get(field)
                if not isinstance(value, str) or not value.strip():
                    missing.append(f"{path.name}:{field}")

        self.assertEqual(len(cuisine_ids), len(self.frontmatter))
        self.assertEqual(region_ids, REGION_IDS)
        self.assertEqual(missing, [])

    def test_generator_preserves_danish_cuisine_metadata(self) -> None:
        self.assertEqual(len(self.regions), len(REGION_IDS))
        cuisines = [cuisine for region in self.regions for cuisine in region["cuisines"]]
        self.assertEqual(len(cuisines), len(self.frontmatter))

        generated_by_id = {cuisine["id"]: cuisine for cuisine in cuisines}
        for data in self.frontmatter.values():
            cuisine_id = data["id"]
            with self.subTest(cuisine=cuisine_id):
                self.assertEqual(generated_by_id[cuisine_id]["name_da"], data["name_da"])
                self.assertEqual(
                    generated_by_id[cuisine_id]["description_da"],
                    data["description_da"],
                )
                self.assertEqual(
                    self.descriptions[cuisine_id]["description_da"],
                    data["description_da"],
                )

        self.assertEqual(len(self.cuisine_to_region), len(self.frontmatter))
        self.assertEqual(len(self.descriptions), len(self.frontmatter))

    def test_region_i18n_keys_are_complete(self) -> None:
        for path in sorted(I18N_DIR.glob("*.json")):
            translations = json.loads(path.read_text(encoding="utf-8"))
            with self.subTest(language=path.stem):
                self.assertEqual(REGION_IDS - set(translations["cuisines"]), set())

    def test_checked_in_panel_matches_cuisine_sources(self) -> None:
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_CUISINE_INGREDIENTS"),
            self.ingredients,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_CUISINE_TO_REGION"),
            self.cuisine_to_region,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_CUISINE_REGIONS"),
            self.regions,
        )
        self.assertEqual(
            parse_generated_constant(self.generated_panel, "AI_CUISINE_DESCRIPTIONS"),
            self.descriptions,
        )

        template = PANEL_TEMPLATE.read_text(encoding="utf-8")
        expected_fragments = (
            "_localizedRegionName(region)",
            "const key = `cuisines.${region.id}`;",
            "return translated !== key ? translated : this._localizedField(region, 'name');",
            "${this._localizedRegionName(region)}",
        )
        for fragment in expected_fragments:
            self.assertIn(fragment, template)
            self.assertIn(fragment, self.generated_panel)

        for source in (template, self.generated_panel):
            self.assertEqual(source.count("this._localizedField(cuisine, 'name')"), 2)
            self.assertIn("this._localizedField(d, 'description')", source)


if __name__ == "__main__":
    unittest.main()
