package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzbz implements zzdoe {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);


    /* renamed from: j */
    private static final zzdof<zzbz> f23845j = new zzdof<zzbz>() { // from class: com.google.android.gms.internal.ads.jg
    };

    /* renamed from: l */
    private final int f23847l;

    zzbz(int i2) {
        this.f23847l = i2;
    }

    /* renamed from: g */
    public static zzdog m18560g() {
        return C7153sg.f20522a;
    }

    /* renamed from: k */
    public static zzbz m18561k(int i2) {
        if (i2 == 0) {
            return ENUM_FALSE;
        }
        if (i2 == 1) {
            return ENUM_TRUE;
        }
        if (i2 == 2) {
            return ENUM_FAILURE;
        }
        if (i2 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        return this.f23847l;
    }
}
