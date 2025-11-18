package z4;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: MEATERProbeBLEConnectionState.java */
/* loaded from: classes.dex */
public enum e0 {
    JUST_CONNECTED(0),
    DISCOVERING_SERVICES(1),
    READING_OTA_STATE(2),
    AWAITING_CHILD_PROBE_READY(4),
    AWAITING_INITIAL_TEMPERATURE_READING(8),
    READING_COOK_SETUP(16),
    RESETTING_LOG_THEN_WRITE_COOK_SETUP(32),
    WRITING_COOK_SETUP_THEN_READ_TEMP_LOG(64),
    WRITING_COOK_SETUP(128),
    ASKING_FOR_TEMP_LOG_PAUSE(256),
    READING_TEMPERATURE_LOG(512),
    ASKING_FOR_TEMPERATURE_LOG_RESUME(1024),
    CONNECTED(2048),
    UNPAIRING_CHILD(4096),
    BLE_FAST_CONNECTIONS_INTERVAL(8192);


    /* renamed from: B, reason: collision with root package name */
    private final int f53615B;

    e0(int i10) {
        this.f53615B = i10;
    }

    public static void j(int i10, int i11) {
        if ((i11 & i10) == i10) {
            return;
        }
        U4.b.a("Bad state: %s (expected %s)", n(i10).toString(), s(i11));
    }

    public static e0 n(int i10) {
        if (i10 == 0) {
            return JUST_CONNECTED;
        }
        if (i10 == 1) {
            return DISCOVERING_SERVICES;
        }
        if (i10 == 2) {
            return READING_OTA_STATE;
        }
        switch (i10) {
            case 4:
                return AWAITING_INITIAL_TEMPERATURE_READING;
            case 8:
                return AWAITING_CHILD_PROBE_READY;
            case 16:
                return READING_COOK_SETUP;
            case 32:
                return RESETTING_LOG_THEN_WRITE_COOK_SETUP;
            case 64:
                return WRITING_COOK_SETUP_THEN_READ_TEMP_LOG;
            case 128:
                return WRITING_COOK_SETUP;
            case 256:
                return ASKING_FOR_TEMP_LOG_PAUSE;
            case 512:
                return READING_TEMPERATURE_LOG;
            case 1024:
                return ASKING_FOR_TEMPERATURE_LOG_RESUME;
            case 2048:
                return CONNECTED;
            case 4096:
                return UNPAIRING_CHILD;
            case 8192:
                return BLE_FAST_CONNECTIONS_INTERVAL;
            default:
                return JUST_CONNECTED;
        }
    }

    private static String s(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 14; i11++) {
            int i12 = 1 << i11;
            if ((i10 & i12) != 0) {
                arrayList.add(n(i12).toString());
            }
        }
        return TextUtils.join("||", arrayList);
    }

    public int p() {
        return this.f53615B;
    }
}
