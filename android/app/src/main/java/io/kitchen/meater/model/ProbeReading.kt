package io.kitchen.meater.model

data class ProbeReading(
    val deviceAddress: String,
    val deviceName: String,
    val tipCelsius: Float? = null,
    val ambientCelsius: Float? = null,
    val batteryPercent: Int? = null
)
