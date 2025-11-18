package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzbm implements zzdoe {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);


    /* renamed from: k */
    private static final zzdof<zzbm> f23213k = new zzdof<zzbm>() { // from class: com.google.android.gms.internal.ads.xc
    };

    /* renamed from: m */
    private final int f23215m;

    zzbm(int i2) {
        this.f23215m = i2;
    }

    /* renamed from: g */
    public static zzdog m17877g() {
        return C6558cd.f18446a;
    }

    /* renamed from: k */
    public static zzbm m17878k(int i2) {
        if (i2 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i2 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i2 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i2 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i2 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        return this.f23215m;
    }
}
