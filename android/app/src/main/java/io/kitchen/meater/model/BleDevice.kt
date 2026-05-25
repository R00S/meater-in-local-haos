package io.kitchen.meater.model

/**
 * A discovered or known BLE device.
 *
 * Approach adapted from grgcmz/BLEScanner (MIT, Giorgio Camozzi 2023):
 * RSSI is stored so the scan list can be sorted by signal strength, and
 * isMeaterDevice lets us pin MEATER probes to the top of the list.
 */
data class BleDevice(
    val name: String,
    val address: String,
    /** Signal strength in dBm; -100 when unknown (e.g. loaded from saved probes). */
    val rssi: Int = -100,
    /**
     * True when the device is identified as an Apption Labs / MEATER device by either:
     *   - Name containing "MEATER"
     *   - Hardware OUI in the Apption Labs ranges (B8:1F:5E or 90:21:2E, IEEE-verified)
     */
    val isMeaterDevice: Boolean = false
)
