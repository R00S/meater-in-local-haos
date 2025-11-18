package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzbw implements zzdoe {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);


    /* renamed from: j */
    private static final zzdof<zzbw> f23622j = new zzdof<zzbw>() { // from class: com.google.android.gms.internal.ads.mf
    };

    /* renamed from: l */
    private final int f23624l;

    zzbw(int i2) {
        this.f23624l = i2;
    }

    /* renamed from: g */
    public static zzdog m18408g() {
        return C7115rf.f20448a;
    }

    /* renamed from: k */
    public static zzbw m18409k(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 != 3) {
            return null;
        }
        return UNENCRYPTED;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        return this.f23624l;
    }
}
