package io.kitchen.meater.data

import android.content.Context
import io.kitchen.meater.model.BleDevice
import org.json.JSONArray
import org.json.JSONObject

/**
 * Persists known MEATER blocks across app restarts using SharedPreferences.
 * Each entry stores the device name and MAC address so the user does not need
 * to scan every time.
 */
class ProbeRepository(context: Context) {

    private val prefs = context.getSharedPreferences("meater_known_probes", Context.MODE_PRIVATE)

    fun save(device: BleDevice) {
        val list = loadAll().toMutableList()
        list.removeAll { it.address.equals(device.address, ignoreCase = true) }
        list.add(0, device) // most-recently-used first
        persist(list)
    }

    fun loadAll(): List<BleDevice> {
        val json = prefs.getString("probes", "[]") ?: "[]"
        return try {
            val arr = JSONArray(json)
            (0 until arr.length()).map {
                val obj = arr.getJSONObject(it)
                BleDevice(name = obj.getString("name"), address = obj.getString("address"))
            }
        } catch (_: Exception) {
            emptyList()
        }
    }

    fun delete(address: String) {
        persist(loadAll().filter { !it.address.equals(address, ignoreCase = true) })
    }

    private fun persist(list: List<BleDevice>) {
        val arr = JSONArray()
        list.forEach { device ->
            arr.put(JSONObject().apply {
                put("name", device.name)
                put("address", device.address)
            })
        }
        prefs.edit().putString("probes", arr.toString()).apply()
    }
}
