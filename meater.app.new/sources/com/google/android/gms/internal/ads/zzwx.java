package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzwx implements zzdoe {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* renamed from: i */
    private static final zzdof<zzwx> f27338i = new zzdof<zzwx>() { // from class: com.google.android.gms.internal.ads.m50
    };

    /* renamed from: k */
    private final int f27340k;

    zzwx(int i2) {
        this.f27340k = i2;
    }

    /* renamed from: g */
    public static zzdog m20810g() {
        return n50.f19990a;
    }

    /* renamed from: k */
    public static zzwx m20811k(int i2) {
        if (i2 == 0) {
            return ENUM_FALSE;
        }
        if (i2 == 1) {
            return ENUM_TRUE;
        }
        if (i2 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        return this.f27340k;
    }
}
