package com.facebook.p157o0.p159l0;

import java.util.Arrays;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.n */
/* loaded from: classes.dex */
public enum EnumC5853n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* renamed from: l */
    private final String f15144l;

    EnumC5853n(String str) {
        this.f15144l = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5853n[] valuesCustom() {
        EnumC5853n[] enumC5853nArrValuesCustom = values();
        return (EnumC5853n[]) Arrays.copyOf(enumC5853nArrValuesCustom, enumC5853nArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12367k() {
        return this.f15144l;
    }
}
