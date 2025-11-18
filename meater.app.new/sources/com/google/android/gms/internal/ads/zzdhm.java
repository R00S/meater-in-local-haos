package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzdhm implements zzdoe {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: l */
    private static final zzdof<zzdhm> f25580l = new zzdof<zzdhm>() { // from class: com.google.android.gms.internal.ads.it
    };

    /* renamed from: n */
    private final int f25582n;

    zzdhm(int i2) {
        this.f25582n = i2;
    }

    /* renamed from: g */
    public static zzdhm m19521g(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        if (this != UNRECOGNIZED) {
            return this.f25582n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
