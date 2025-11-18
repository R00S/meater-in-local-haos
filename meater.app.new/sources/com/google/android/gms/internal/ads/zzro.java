package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzro {

    /* renamed from: a */
    public final int f26932a;

    /* renamed from: b */
    private final zzrm[] f26933b;

    /* renamed from: c */
    private int f26934c;

    public zzro(zzrm... zzrmVarArr) {
        this.f26933b = zzrmVarArr;
        this.f26932a = zzrmVarArr.length;
    }

    /* renamed from: a */
    public final zzrm m20448a(int i2) {
        return this.f26933b[i2];
    }

    /* renamed from: b */
    public final zzrm[] m20449b() {
        return (zzrm[]) this.f26933b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzro.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26933b, ((zzro) obj).f26933b);
    }

    public final int hashCode() {
        if (this.f26934c == 0) {
            this.f26934c = Arrays.hashCode(this.f26933b) + 527;
        }
        return this.f26934c;
    }
}
