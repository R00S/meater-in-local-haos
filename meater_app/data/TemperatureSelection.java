package com.apptionlabs.meater_app.data;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* loaded from: /tmp/meat/meat/classes.dex */
public class TemperatureSelection {

    /* renamed from: com.apptionlabs.meater_app.data.TemperatureSelection$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState = new int[DeviceCookState.values().length];
    }

    public static int HighestTemperatureFromSet(Temperature.Temperatures_t temperatures_t) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < temperatures_t.internalSensorCount; i11++) {
            int i12 = temperatures_t.internalTemperatures[i11];
            if (i12 != -1024) {
                i10 = Math.max(i10, i12);
            }
        }
        return i10;
    }

    public static int LowestTemperatureFromSet(Temperature.Temperatures_t temperatures_t) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < temperatures_t.internalSensorCount; i11++) {
            int i12 = temperatures_t.internalTemperatures[i11];
            if (i12 != -1024) {
                i10 = Math.min(i10, i12);
            }
        }
        return i10;
    }

    public static int PreferredTemperatureFromSetWithState(Temperature.Temperatures_t temperatures_t, DeviceCookState deviceCookState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[deviceCookState.ordinal()];
        return LowestTemperatureFromSet(temperatures_t);
    }
}
