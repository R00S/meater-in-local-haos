package A4;

import C9.h;

/* compiled from: MEATERPlusConnectionState.java */
/* loaded from: classes.dex */
public enum b {
    CONNECTED(0),
    DISCONNECTED(1),
    NOT_PAIRED(2),
    FETCHING_COOK_SETUP(3),
    CLEARING_HISTORY(4),
    MEATERPROBE_BATTERY_SHUTDOWN(7),
    MEATERPROBE_PROBE_IN_CHARGER(8),
    MEATERPROBE_PROBE_UPSIDE_DOWN(9),
    MEATERPROBE_PROBE_NO_PROBE_SLEEP(10),
    MEATERPROBE_PROBE_NO_COOK_SLEEP(11),
    OTA_BUSY(16),
    OTA_CMD_CHECK(17),
    OTA_CMD_START(18),
    OTA_CMD_REBOOT(19),
    OTA_RESP_ADDRESS(20),
    OTA_RESP_REBOOT(21),
    OTA_RESP_CRC_PASS(22),
    OTA_RESP_CRC_FAIL(23),
    OTA_CMD_ADDRESS(24),
    OTA_VALID_RANGE(25);


    /* renamed from: B, reason: collision with root package name */
    private final int f753B;

    b(int i10) {
        this.f753B = i10;
    }

    public static b j(byte b10) {
        switch (b10) {
            case 0:
                return CONNECTED;
            case 1:
                return DISCONNECTED;
            case 2:
                return NOT_PAIRED;
            case 3:
                return FETCHING_COOK_SETUP;
            case 4:
                return CLEARING_HISTORY;
            case 5:
            case 6:
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            default:
                return null;
            case 7:
                return MEATERPROBE_BATTERY_SHUTDOWN;
            case 8:
                return MEATERPROBE_PROBE_IN_CHARGER;
            case 9:
                return MEATERPROBE_PROBE_UPSIDE_DOWN;
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return MEATERPROBE_PROBE_NO_PROBE_SLEEP;
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return MEATERPROBE_PROBE_NO_COOK_SLEEP;
            case 16:
                return OTA_BUSY;
            case 17:
                return OTA_CMD_CHECK;
            case 18:
                return OTA_CMD_START;
            case 19:
                return OTA_CMD_REBOOT;
            case 20:
                return OTA_RESP_ADDRESS;
            case 21:
                return OTA_RESP_REBOOT;
            case 22:
                return OTA_RESP_CRC_PASS;
            case 23:
                return OTA_RESP_CRC_FAIL;
            case 24:
                return OTA_CMD_ADDRESS;
            case 25:
                return OTA_VALID_RANGE;
        }
    }

    public int n() {
        return this.f753B;
    }

    public boolean p() {
        return this == CONNECTED || this == FETCHING_COOK_SETUP || this == CLEARING_HISTORY || this == MEATERPROBE_PROBE_NO_COOK_SLEEP;
    }
}
