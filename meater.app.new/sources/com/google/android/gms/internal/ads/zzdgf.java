package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzdgf implements zzdoe {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);


    /* renamed from: k */
    private static final zzdof<zzdgf> f25540k = new zzdof<zzdgf>() { // from class: com.google.android.gms.internal.ads.rs
    };

    /* renamed from: m */
    private final int f25542m;

    zzdgf(int i2) {
        this.f25542m = i2;
    }

    /* renamed from: g */
    public static zzdgf m19378g(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 != 4) {
            return null;
        }
        return NIST_P521;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        if (this != UNRECOGNIZED) {
            return this.f25542m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
