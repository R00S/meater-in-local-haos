package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzdgj implements zzdoe {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);


    /* renamed from: k */
    private static final zzdof<zzdgj> f25548k = new zzdof<zzdgj>() { // from class: com.google.android.gms.internal.ads.ts
    };

    /* renamed from: m */
    private final int f25550m;

    zzdgj(int i2) {
        this.f25550m = i2;
    }

    /* renamed from: g */
    public static zzdgj m19381g(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        if (this != UNRECOGNIZED) {
            return this.f25550m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
