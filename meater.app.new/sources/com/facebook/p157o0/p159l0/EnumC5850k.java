package com.facebook.p157o0.p159l0;

import java.util.Arrays;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.k */
/* loaded from: classes.dex */
public enum EnumC5850k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");


    /* renamed from: k */
    private final String f15098k;

    EnumC5850k(String str) {
        this.f15098k = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5850k[] valuesCustom() {
        EnumC5850k[] enumC5850kArrValuesCustom = values();
        return (EnumC5850k[]) Arrays.copyOf(enumC5850kArrValuesCustom, enumC5850kArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12360k() {
        return this.f15098k;
    }
}
