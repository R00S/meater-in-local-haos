package B4;

/* compiled from: MEATERBlockBLE.java */
/* loaded from: classes.dex */
public class l {

    /* compiled from: MEATERBlockBLE.java */
    public interface a {
        int getValue();
    }

    /* compiled from: MEATERBlockBLE.java */
    public enum b {
        eWifiScanStatusBlockNotScanning((byte) 0),
        eWifiScanStatusMobileCmdStartScan((byte) 1),
        eWifiScanStatusBlockNotInWifiSetupScreen((byte) 2),
        eWifiScanStatusMobileCmdHello((byte) 3),
        eWifiScanStatusMobileNotInWifiSetup((byte) 4),
        eWifiScanStatusMobileCmdHelloCelsius((byte) 10),
        eWifiScanStatusMobileCmdHelloFahrenheit((byte) 11),
        eMobileAppCommandSelectWiFiMode((byte) -112),
        eMobileAppCommandSetWiFiModeAP((byte) -111),
        eMobileAppCommandStartOTA((byte) -109),
        eMobileAppCommandClearSettings((byte) -96),
        eMobileAppCommandResetPairing((byte) -95),
        eMobileAppCommandResetToFactorySw((byte) -94),
        eMobileAppCommandBlockReboot((byte) 19);


        /* renamed from: B, reason: collision with root package name */
        private final byte f1573B;

        b(byte b10) {
            this.f1573B = b10;
        }

        public byte j() {
            return this.f1573B;
        }
    }

    /* compiled from: MEATERBlockBLE.java */
    public enum c {
        MEATERBlockResetTypeStandard,
        MEATERBlockResetTypeUnpairProbes,
        MEATERBlockResetTypeRecoveryMode,
        MEATERBlockResetTypeReboot
    }

    /* compiled from: MEATERBlockBLE.java */
    public enum d implements a {
        eBlockStatusCloudUnknown(0),
        eBlockStatusCloudDisabled(1),
        eBlockStatusCloudDisconnected(2),
        eBlockStatusCloudConnecting(3),
        eBlockStatusCloudPinging(4),
        eBlockStatusCloudConnected(5),
        eBlockStatusWifiCount(6);


        /* renamed from: B, reason: collision with root package name */
        private final int f1587B;

        d(int i10) {
            this.f1587B = i10;
        }

        public static String j(d dVar) {
            if (dVar == null) {
                return "Invalid";
            }
            switch (dVar) {
            }
            return "Invalid";
        }

        @Override // B4.l.a
        public int getValue() {
            return this.f1587B;
        }
    }

    /* compiled from: MEATERBlockBLE.java */
    public enum e implements a {
        eBlockStatusModeLegacy0(0),
        eBlockStatusModeLegacy1(1),
        eBlockStatusModeLegacy2(2),
        eBlockStatusModeLegacy3(3),
        eBlockStatusModeLegacy4(4),
        eBlockStatusModeBooting(5),
        eBlockStatusModeSelecting(6),
        eBlockStatusModeStandalone(7),
        eBlockStatusModeConfiguring(8),
        eBlockStatusModeWifiClient(9),
        eBlockStatusModeWifiAp(10),
        eBlockStatusModeWifiApOtaSvc(11),
        eBlockStatusModeProbePairing(12),
        eBlockStatusModeBattEmpty(13),
        eBlockStatusModeBattEmptyUsb(14),
        eBlockStatusModeWifiClientOta(15),
        eBlockStatusModeCount(16);


        /* renamed from: B, reason: collision with root package name */
        private final int f1606B;

        e(int i10) {
            this.f1606B = i10;
        }

        public static String j(e eVar) {
            if (eVar == null) {
                return "Invalid";
            }
            switch (eVar.ordinal()) {
            }
            return "Invalid";
        }

        @Override // B4.l.a
        public int getValue() {
            return this.f1606B;
        }
    }

    /* compiled from: MEATERBlockBLE.java */
    public enum f implements a {
        eBlockStatusWifiUnknown(0),
        eBlockStatusWifiDisconnected(1),
        eBlockStatusWifiConnecting(2),
        eBlockStatusWifiConnected(3),
        eBlockStatusWifiSubscribed(4),
        eBlockStatusWifiCount(5);


        /* renamed from: B, reason: collision with root package name */
        private final int f1614B;

        f(int i10) {
            this.f1614B = i10;
        }

        public static String j(f fVar) {
            if (fVar == null) {
                return "Invalid";
            }
            int iOrdinal = fVar.ordinal();
            return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? "Invalid" : "Count?" : "Subscribed" : "Connected" : "Connecting" : "Disconnected" : "Unknown";
        }

        @Override // B4.l.a
        public int getValue() {
            return this.f1614B;
        }
    }

    public static boolean a(e eVar) {
        switch (eVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 15:
            case 16:
            default:
                return false;
            case 8:
            case 9:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                return true;
        }
    }
}
