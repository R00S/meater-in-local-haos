package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzvi {

    /* renamed from: a */
    final long f27209a;

    /* renamed from: b */
    final String f27210b;

    /* renamed from: c */
    final int f27211c;

    zzvi(long j2, String str, int i2) {
        this.f27209a = j2;
        this.f27210b = str;
        this.f27211c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzvi)) {
            zzvi zzviVar = (zzvi) obj;
            if (zzviVar.f27209a == this.f27209a && zzviVar.f27211c == this.f27211c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f27209a;
    }
}
