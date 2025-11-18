package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzdgu implements zzdoe {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: k */
    private static final zzdof<zzdgu> f25565k = new zzdof<zzdgu>() { // from class: com.google.android.gms.internal.ads.zs
    };

    /* renamed from: m */
    private final int f25567m;

    zzdgu(int i2) {
        this.f25567m = i2;
    }

    /* renamed from: g */
    public static zzdgu m19423g(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    /* renamed from: i */
    public final int mo17879i() {
        if (this != UNRECOGNIZED) {
            return this.f25567m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
