"""Translation integrity tests for the custom panel."""

from __future__ import annotations

import json
import importlib.util
import re
import sys
import unittest
from pathlib import Path
from typing import Any


ROOT = Path(__file__).resolve().parents[1]
I18N_DIR = ROOT / "custom_components" / "kitchen_cooking_engine" / "i18n"
PANEL_TEMPLATE = (
    ROOT
    / "custom_components"
    / "kitchen_cooking_engine"
    / "www"
    / "panel-class-template.js"
)
CONST_PATH = ROOT / "custom_components" / "kitchen_cooking_engine" / "const.py"
PLACEHOLDER_RE = re.compile(r"\{[a-zA-Z_][a-zA-Z0-9_]*\}")
TAG_RE = re.compile(r"</?[a-zA-Z][^>]*>")


def flatten(value: dict[str, Any], prefix: str = "") -> dict[str, Any]:
    """Flatten nested translation dictionaries to dotted keys."""
    result: dict[str, Any] = {}
    for key, item in value.items():
        dotted = f"{prefix}.{key}" if prefix else key
        if isinstance(item, dict):
            result.update(flatten(item, dotted))
        else:
            result[dotted] = item
    return result


class TranslationIntegrityTests(unittest.TestCase):
    """Ensure every shipped language can resolve the same panel keys."""

    @classmethod
    def setUpClass(cls) -> None:
        cls.translations = {
            path.stem: json.loads(path.read_text(encoding="utf-8"))
            for path in sorted(I18N_DIR.glob("*.json"))
        }
        cls.flat = {language: flatten(data) for language, data in cls.translations.items()}

    def test_expected_languages_and_metadata(self) -> None:
        self.assertEqual(set(self.translations), {"en", "sv", "da"})
        expected = {
            "en": ("English", "en-GB", 10),
            "sv": ("Svenska", "sv-SE", 20),
            "da": ("Dansk", "da-DK", 30),
        }
        for language, (name, locale, order) in expected.items():
            with self.subTest(language=language):
                meta = self.translations[language]["_meta"]
                self.assertEqual(meta["language"], language)
                self.assertEqual(meta["language_name"], name)
                self.assertEqual(meta["locale"], locale)
                self.assertEqual(meta["order"], order)

    def test_backend_language_registry_matches_dictionaries(self) -> None:
        spec = importlib.util.spec_from_file_location("kce_i18n_const", CONST_PATH)
        assert spec and spec.loader
        module = importlib.util.module_from_spec(spec)
        sys.modules[spec.name] = module
        spec.loader.exec_module(module)

        self.assertEqual(set(module.SUPPORTED_LANGUAGES), set(self.translations))
        self.assertEqual(module.DEFAULT_LANGUAGE, "en")

    def test_key_parity(self) -> None:
        english_keys = set(self.flat["en"])
        for language, values in self.flat.items():
            with self.subTest(language=language):
                self.assertEqual(set(values), english_keys)

    def test_placeholder_and_html_parity(self) -> None:
        for key, english_value in self.flat["en"].items():
            if not isinstance(english_value, str):
                continue
            expected_placeholders = sorted(PLACEHOLDER_RE.findall(english_value))
            expected_tags = sorted(TAG_RE.findall(english_value))
            for language in ("sv", "da"):
                translated = self.flat[language][key]
                if not isinstance(translated, str):
                    self.fail(f"{language}.{key} is not a string")
                with self.subTest(language=language, key=key):
                    self.assertEqual(sorted(PLACEHOLDER_RE.findall(translated)), expected_placeholders)
                    self.assertEqual(sorted(TAG_RE.findall(translated)), expected_tags)

    def test_literal_panel_keys_exist(self) -> None:
        source = PANEL_TEMPLATE.read_text(encoding="utf-8")
        references = {
            key for key in re.findall(r"\._t\(\s*['\"]([^'\"]+)['\"]", source)
            if not key.endswith((".", "_"))
        }
        missing = {
            language: sorted(references - set(values))
            for language, values in self.flat.items()
            if references - set(values)
        }
        self.assertEqual(missing, {})


if __name__ == "__main__":
    unittest.main()
