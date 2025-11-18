package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class n20 {

    /* renamed from: a */
    public final int f19975a;

    /* renamed from: b */
    public final long[] f19976b;

    /* renamed from: c */
    public final int[] f19977c;

    /* renamed from: d */
    public final int f19978d;

    /* renamed from: e */
    public final long[] f19979e;

    /* renamed from: f */
    public final int[] f19980f;

    public n20(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2) {
        zzsk.m20477a(iArr.length == jArr2.length);
        zzsk.m20477a(jArr.length == jArr2.length);
        zzsk.m20477a(iArr2.length == jArr2.length);
        this.f19976b = jArr;
        this.f19977c = iArr;
        this.f19978d = i2;
        this.f19979e = jArr2;
        this.f19980f = iArr2;
        this.f19975a = jArr.length;
    }

    /* renamed from: a */
    public final int m15592a(long j2) {
        for (int iM20538b = zzsy.m20538b(this.f19979e, j2, true, false); iM20538b >= 0; iM20538b--) {
            if ((this.f19980f[iM20538b] & 1) != 0) {
                return iM20538b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m15593b(long j2) {
        for (int iM20547k = zzsy.m20547k(this.f19979e, j2, true, false); iM20547k < this.f19979e.length; iM20547k++) {
            if ((this.f19980f[iM20547k] & 1) != 0) {
                return iM20547k;
            }
        }
        return -1;
    }
}
