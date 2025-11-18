package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzrb {

    /* renamed from: a */
    public static final zzrb f26894a = new zzrb(new zzra[0]);

    /* renamed from: b */
    public final int f26895b;

    /* renamed from: c */
    private final zzra[] f26896c;

    /* renamed from: d */
    private int f26897d;

    public zzrb(zzra... zzraVarArr) {
        this.f26896c = zzraVarArr;
        this.f26895b = zzraVarArr.length;
    }

    /* renamed from: a */
    public final int m20436a(zzra zzraVar) {
        for (int i2 = 0; i2 < this.f26895b; i2++) {
            if (this.f26896c[i2] == zzraVar) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzra m20437b(int i2) {
        return this.f26896c[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrb.class == obj.getClass()) {
            zzrb zzrbVar = (zzrb) obj;
            if (this.f26895b == zzrbVar.f26895b && Arrays.equals(this.f26896c, zzrbVar.f26896c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26897d == 0) {
            this.f26897d = Arrays.hashCode(this.f26896c);
        }
        return this.f26897d;
    }
}
