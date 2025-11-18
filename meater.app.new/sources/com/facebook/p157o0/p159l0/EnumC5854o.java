package com.facebook.p157o0.p159l0;

import java.util.Arrays;

/* compiled from: AppEventsCAPIManager.kt */
/* renamed from: com.facebook.o0.l0.o */
/* loaded from: classes.dex */
public enum EnumC5854o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");


    /* renamed from: k */
    private final String f15150k;

    EnumC5854o(String str) {
        this.f15150k = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5854o[] valuesCustom() {
        EnumC5854o[] enumC5854oArrValuesCustom = values();
        return (EnumC5854o[]) Arrays.copyOf(enumC5854oArrValuesCustom, enumC5854oArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12369k() {
        return this.f15150k;
    }
}
