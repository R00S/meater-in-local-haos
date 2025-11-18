package com.facebook.p157o0;

import java.util.Arrays;

/* compiled from: FlushReason.kt */
/* renamed from: com.facebook.o0.d0 */
/* loaded from: classes.dex */
public enum EnumC5819d0 {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5819d0[] valuesCustom() {
        EnumC5819d0[] enumC5819d0ArrValuesCustom = values();
        return (EnumC5819d0[]) Arrays.copyOf(enumC5819d0ArrValuesCustom, enumC5819d0ArrValuesCustom.length);
    }
}
