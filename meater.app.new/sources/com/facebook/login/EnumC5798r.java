package com.facebook.login;

import java.util.Arrays;

/* compiled from: DefaultAudience.kt */
/* renamed from: com.facebook.login.r */
/* loaded from: classes2.dex */
public enum EnumC5798r {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    /* renamed from: k */
    private final String f14825k;

    EnumC5798r(String str) {
        this.f14825k = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5798r[] valuesCustom() {
        EnumC5798r[] enumC5798rArrValuesCustom = values();
        return (EnumC5798r[]) Arrays.copyOf(enumC5798rArrValuesCustom, enumC5798rArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12057k() {
        return this.f14825k;
    }
}
