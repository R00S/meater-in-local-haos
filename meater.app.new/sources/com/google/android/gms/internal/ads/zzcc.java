package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzcc implements zzdoe {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);


    /* renamed from: j */
    private static final zzdof<zzcc> f24034j = new zzdof<zzcc>() { // from class: com.google.android.gms.internal.ads.sh
    };

    /* renamed from: l */
    private final int f24036l;

    zzcc(int i2) {
        this.f24036l = i2;
    }

    /* renamed from: g */
    public static zzdog m18654g() {
        return C6637ei.f18819a;
    }

    /* renamed from: k */
    public static zzcc m18655k(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PROTO;
        }
        if (i2 == 1) {
            return AFMA_SIGNALS;
        }
        if (i2 == 2) {
            return UNITY_SIGNALS;
        }
        if (i2 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        return this.f24036l;
    }
}
