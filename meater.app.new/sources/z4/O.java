package z4;

import com.apptionlabs.meater_app.data.Config;
import java.util.UUID;

/* compiled from: MEATERBLEUUID.java */
/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f53423a = UUID.fromString(Config.MEATERBLETemperatureServiceUUID);

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f53424b = UUID.fromString(Config.DeviceInformationServiceUUID);

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f53425c = UUID.fromString(Config.MEATERSimulatedDISUUID);

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f53426d = UUID.fromString(Config.MEATERTemperatureBLECharacteristicUUID);

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f53427e = UUID.fromString(Config.MEATERBatteryBLECharacteristicUUID);

    /* renamed from: f, reason: collision with root package name */
    public static final UUID f53428f = UUID.fromString(Config.MEATERTemperatureLogModeBLECharacteristicUUID);

    /* renamed from: g, reason: collision with root package name */
    public static final UUID f53429g = UUID.fromString(Config.MEATERTemperatureLogBLECharactertisticUUID);

    /* renamed from: h, reason: collision with root package name */
    public static final UUID f53430h = UUID.fromString(Config.MEATERCookSetupBLECharacteristicUUID);

    /* renamed from: i, reason: collision with root package name */
    public static final UUID f53431i = UUID.fromString(Config.FirmwareRevisionCharacteristicUUID);

    /* renamed from: j, reason: collision with root package name */
    public static final UUID f53432j = UUID.fromString(Config.BLESoftwareRevisionCharacteristicUUID);

    /* renamed from: k, reason: collision with root package name */
    public static final UUID f53433k = UUID.fromString(Config.SimulatedFirmwareRevisionCharacteristicUUID);

    /* renamed from: l, reason: collision with root package name */
    public static final UUID f53434l = UUID.fromString(Config.V2TemperatureServiceUUID);

    /* renamed from: m, reason: collision with root package name */
    public static final UUID f53435m = UUID.fromString(Config.MEATERBlockServiceUUID);

    /* renamed from: n, reason: collision with root package name */
    public static final UUID f53436n = UUID.fromString(Config.MEATERBlockWiFiMACUUID);

    /* renamed from: o, reason: collision with root package name */
    public static final UUID f53437o = UUID.fromString(Config.MEATERBlockSerialNumberUUID);

    /* renamed from: p, reason: collision with root package name */
    public static final UUID f53438p = UUID.fromString(Config.MEATERBlockAvailableSSIDsUUID);

    /* renamed from: q, reason: collision with root package name */
    public static final UUID f53439q = UUID.fromString("B4663775-9045-479E-B496-D4CA549CFDDA");

    /* renamed from: r, reason: collision with root package name */
    public static final UUID f53440r = UUID.fromString(Config.MEATERBlockChosenWiFiSSIDUUID);

    /* renamed from: s, reason: collision with root package name */
    public static final UUID f53441s = UUID.fromString("E03C6CCC-2AA7-40A4-8A66-C98B599B737A");

    /* renamed from: t, reason: collision with root package name */
    public static final UUID f53442t = UUID.fromString(Config.MEATERBlockKeepAliveUUID);

    /* renamed from: u, reason: collision with root package name */
    public static final UUID f53443u = UUID.fromString("E03C6CCC-2AA7-40A4-8A66-C98B599B737A");

    /* renamed from: v, reason: collision with root package name */
    public static final UUID f53444v = UUID.fromString(Config.MEATERPlusProbeRSSIUUID);

    /* renamed from: w, reason: collision with root package name */
    public static final UUID f53445w = UUID.fromString(Config.MEATERPlusBatteryLevelUUID);

    /* renamed from: x, reason: collision with root package name */
    public static final UUID f53446x = UUID.fromString(Config.MEATERPlusProbeInfoUUID);

    /* renamed from: y, reason: collision with root package name */
    public static final UUID f53447y = UUID.fromString(Config.MEATERPlusV2TemperatureServiceUUID);

    /* renamed from: z, reason: collision with root package name */
    public static final UUID f53448z = UUID.fromString(Config.MEATERPlusSETemperatureServiceUUID);

    /* renamed from: A, reason: collision with root package name */
    public static final UUID f53416A = UUID.fromString(Config.MEATERPlusChipTemperatureUUID);

    /* renamed from: B, reason: collision with root package name */
    public static final UUID f53417B = UUID.fromString(Config.MEATERBlockSecondGenerationServiceUUID);

    /* renamed from: C, reason: collision with root package name */
    public static final UUID f53418C = UUID.fromString(Config.MEATERBlockThirdGenerationOneFirstGenerationProbeServiceUUID);

    /* renamed from: D, reason: collision with root package name */
    public static final UUID f53419D = UUID.fromString(Config.MEATERBlockThirdGenerationOneSecondGenerationProbeServiceUUID);

    /* renamed from: E, reason: collision with root package name */
    public static final UUID f53420E = UUID.fromString(Config.MEATERBlockThirdGenerationTwoFirstGenerationProbesServiceUUID);

    /* renamed from: F, reason: collision with root package name */
    public static final UUID f53421F = UUID.fromString(Config.MEATERBlockThirdGenerationTwoSecondGenerationProbesServiceUUID);

    /* renamed from: G, reason: collision with root package name */
    public static final UUID f53422G = UUID.fromString("B4663775-9045-479E-B496-D4CA549CFDDA");

    static {
        Config.getInstance();
    }

    public static String a(UUID uuid) {
        return uuid.equals(f53427e) ? "Battery" : uuid.equals(f53426d) ? "Temperatures" : uuid.equals(f53428f) ? "TempLogMode" : uuid.equals(f53429g) ? "TempLog" : uuid.equals(f53430h) ? "CookSetup" : (uuid.equals(f53431i) || uuid.equals(f53433k)) ? "Firmware Revision" : uuid.equals(f53436n) ? "Block WiFi MAC Address" : uuid.equals(f53437o) ? "Block Serial Number" : uuid.equals(f53438p) ? "Block Discovered SSIDs" : uuid.equals(f53439q) ? "Block WiFi Scan State" : uuid.equals(f53440r) ? "Block Chosen SSID" : uuid.equals(f53441s) ? "Block WiFi / MEATER+ Probe Connection State" : uuid.equals(f53444v) ? "MEATER+ Probe RSSI" : uuid.equals(f53445w) ? "MEATER+ Battery Level" : uuid.equals(f53446x) ? "MEATER+ Probe Info" : uuid.equals(f53416A) ? "MEATER+ Chip Temperature" : "Unknown";
    }
}
