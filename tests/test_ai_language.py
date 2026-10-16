"""Focused tests for AI recipe language helpers without Home Assistant imports."""

from __future__ import annotations

import ast
import importlib.util
import sys
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
COMPONENT = ROOT / "custom_components" / "kitchen_cooking_engine"
AI_PATH = COMPONENT / "ai_recipe_builder.py"
MEASUREMENTS_PATH = COMPONENT / "measurements.py"


def load_measurements():
    """Load the dependency-free measurement module directly."""
    spec = importlib.util.spec_from_file_location("kce_ai_language_measurements", MEASUREMENTS_PATH)
    assert spec and spec.loader
    module = importlib.util.module_from_spec(spec)
    sys.modules[spec.name] = module
    spec.loader.exec_module(module)
    return module


def load_language_helpers():
    """Compile only static language helpers from AIRecipeBuilder."""
    source = AI_PATH.read_text(encoding="utf-8")
    tree = ast.parse(source)
    original = next(
        node for node in tree.body
        if isinstance(node, ast.ClassDef) and node.name == "AIRecipeBuilder"
    )
    helper_names = {
        "_build_language_directive",
        "_get_example_ingredients",
        "_get_example_instructions",
        "_get_example_tips",
        "_get_example_step_ingredients",
        "_get_example_phase_description",
    }
    helper_nodes = [
        node for node in original.body
        if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)) and node.name in helper_names
    ]
    synthetic = ast.Module(
        body=[
            ast.ClassDef(
                name="AIRecipeBuilder",
                bases=[],
                keywords=[],
                body=helper_nodes,
                decorator_list=[],
            )
        ],
        type_ignores=[],
    )
    ast.fix_missing_locations(synthetic)
    measurements = load_measurements()
    namespace = {
        "MEASUREMENT_SYSTEMS": measurements.MEASUREMENT_SYSTEMS,
        "SUPPORTED_LANGUAGES": ("en", "sv", "da"),
    }
    exec(compile(synthetic, str(AI_PATH), "exec"), namespace)
    return namespace["AIRecipeBuilder"]


class AILanguageTests(unittest.TestCase):
    """Verify Danish prompt instructions and examples."""

    @classmethod
    def setUpClass(cls) -> None:
        cls.builder = load_language_helpers()

    def test_danish_directive_is_explicit_and_uses_danish_units(self) -> None:
        directive = self.builder._build_language_directive("da", "dk")

        self.assertIn("ENTIRE recipe in Danish (dansk)", directive)
        self.assertIn("spsk (15 ml)", directive)
        self.assertNotIn("ENTIRE recipe in English", directive)

    def test_unknown_language_is_rejected(self) -> None:
        with self.assertRaisesRegex(ValueError, "Unsupported recipe language"):
            self.builder._build_language_directive("xx", "dk")

    def test_danish_examples_use_danish_words(self) -> None:
        self.assertIn("kyllingebryst i tern", self.builder._get_example_ingredients("da", "dk"))
        self.assertIn("Trin 1", self.builder._get_example_instructions("da", "dk"))
        self.assertIn("Lad kødet hvile", self.builder._get_example_tips("da"))
        self.assertIn("olivenolie", self.builder._get_example_step_ingredients("da", "dk"))
        self.assertEqual(
            self.builder._get_example_phase_description("da"),
            "Steg kyllingen, til den er gylden",
        )

    def test_conversation_call_forwards_language(self) -> None:
        tree = ast.parse(AI_PATH.read_text(encoding="utf-8"))
        calls = [
            node for node in ast.walk(tree)
            if isinstance(node, ast.Call)
            and isinstance(node.func, ast.Attribute)
            and node.func.attr == "async_converse"
        ]
        self.assertEqual(len(calls), 1)
        language_keyword = next(keyword for keyword in calls[0].keywords if keyword.arg == "language")
        self.assertIsInstance(language_keyword.value, ast.Name)
        self.assertEqual(language_keyword.value.id, "language")


if __name__ == "__main__":
    unittest.main()
