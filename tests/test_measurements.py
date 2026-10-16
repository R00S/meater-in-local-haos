"""Regression tests for recipe measurement systems."""

from __future__ import annotations

import importlib.util
import sys
import unittest
from pathlib import Path


MODULE_PATH = (
    Path(__file__).resolve().parents[1]
    / "custom_components"
    / "kitchen_cooking_engine"
    / "measurements.py"
)
SPEC = importlib.util.spec_from_file_location("kce_measurements_tests", MODULE_PATH)
assert SPEC and SPEC.loader
measurements = importlib.util.module_from_spec(SPEC)
sys.modules[SPEC.name] = measurements
SPEC.loader.exec_module(measurements)


class DanishMeasurementTests(unittest.TestCase):
    """Verify the Danish catalog, thresholds, and display conventions."""

    def test_danish_system_catalog(self) -> None:
        system = measurements.MEASUREMENT_SYSTEMS["dk"]

        self.assertEqual(system.temp_unit, "C")
        self.assertFalse(system.show_alt_temp)
        self.assertEqual(
            [unit.id for unit in system.volume_units],
            ["ml", "tsk", "spsk", "cl", "dl", "l"],
        )
        self.assertEqual([unit.id for unit in system.mass_units], ["g", "kg"])

    def test_danish_volume_boundaries(self) -> None:
        cases = (
            (4.9, "ml"),
            (5.0, "tsk"),
            (10.0, "cl"),
            (15.0, "spsk"),
            (50.0, "dl"),
            (999.9, "dl"),
            (1000.0, "l"),
        )

        for value, expected_unit in cases:
            with self.subTest(value=value):
                _, unit = measurements.convert_quantity(value, "ml", "dk")
                self.assertEqual(unit, expected_unit)

    def test_danish_mass_boundaries(self) -> None:
        _, below_kg = measurements.convert_quantity(999.9, "g", "dk")
        value, at_kg = measurements.convert_quantity(1000, "g", "dk")

        self.assertEqual(below_kg, "g")
        self.assertEqual((value, at_kg), (1, "kg"))

    def test_spoon_and_cup_conversion(self) -> None:
        self.assertEqual(
            measurements.convert_quantity(1, "tbsp", "dk"),
            (1, "spsk"),
        )
        self.assertEqual(
            measurements.convert_quantity(1, "tsp", "dk"),
            (1, "tsk"),
        )
        self.assertEqual(
            measurements.convert_quantity(1, "cup", "dk"),
            (2.4, "dl"),
        )

    def test_danish_output_uses_symbols_and_decimal_comma(self) -> None:
        self.assertEqual(
            measurements.format_quantity(1, "cup", "dk", "en"),
            "2,4 dl",
        )
        self.assertEqual(
            measurements.format_quantity(1, "tbsp", "dk", "en"),
            "1 spsk",
        )

    def test_unit_symbols_do_not_follow_ui_language(self) -> None:
        self.assertEqual(
            measurements.format_quantity(1, "tsp", "se", "en"),
            "1 tsk",
        )

    def test_danish_temperature_is_celsius_only(self) -> None:
        self.assertEqual(measurements.convert_temperature(65, "dk"), "65°C")

    def test_frontend_export_contains_danish_metadata(self) -> None:
        exported = measurements.get_measurement_systems_js()["dk"]

        self.assertEqual(exported["name_da"], "🇩🇰 Danske mål")
        self.assertEqual(exported["units"]["spsk"]["symbol"], "spsk")
        self.assertEqual(exported["units"]["tsk"]["symbol"], "tsk")


if __name__ == "__main__":
    unittest.main()
