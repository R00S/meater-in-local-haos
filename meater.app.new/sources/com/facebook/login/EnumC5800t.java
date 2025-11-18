package com.facebook.login;

import java.util.Arrays;

/* compiled from: LoginBehavior.kt */
/* renamed from: com.facebook.login.t */
/* loaded from: classes2.dex */
public enum EnumC5800t {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);


    /* renamed from: m */
    private final boolean f14833m;

    /* renamed from: n */
    private final boolean f14834n;

    /* renamed from: o */
    private final boolean f14835o;

    /* renamed from: p */
    private final boolean f14836p;

    /* renamed from: q */
    private final boolean f14837q;

    /* renamed from: r */
    private final boolean f14838r;

    /* renamed from: s */
    private final boolean f14839s;

    EnumC5800t(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f14833m = z;
        this.f14834n = z2;
        this.f14835o = z3;
        this.f14836p = z4;
        this.f14837q = z5;
        this.f14838r = z6;
        this.f14839s = z7;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5800t[] valuesCustom() {
        EnumC5800t[] enumC5800tArrValuesCustom = values();
        return (EnumC5800t[]) Arrays.copyOf(enumC5800tArrValuesCustom, enumC5800tArrValuesCustom.length);
    }

    /* renamed from: k */
    public final boolean m12059k() {
        return this.f14837q;
    }

    /* renamed from: q */
    public final boolean m12060q() {
        return this.f14836p;
    }

    /* renamed from: u */
    public final boolean m12061u() {
        return this.f14833m;
    }

    /* renamed from: v */
    public final boolean m12062v() {
        return this.f14839s;
    }

    /* renamed from: x */
    public final boolean m12063x() {
        return this.f14834n;
    }

    /* renamed from: y */
    public final boolean m12064y() {
        return this.f14835o;
    }
}
