package com.facebook;

import java.util.Arrays;

/* compiled from: AccessTokenSource.kt */
/* renamed from: com.facebook.w */
/* loaded from: classes.dex */
public enum EnumC5956w {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* renamed from: s */
    private final boolean f15602s;

    EnumC5956w(boolean z) {
        this.f15602s = z;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5956w[] valuesCustom() {
        EnumC5956w[] enumC5956wArrValuesCustom = values();
        return (EnumC5956w[]) Arrays.copyOf(enumC5956wArrValuesCustom, enumC5956wArrValuesCustom.length);
    }

    /* renamed from: k */
    public final boolean m12937k() {
        return this.f15602s;
    }
}
