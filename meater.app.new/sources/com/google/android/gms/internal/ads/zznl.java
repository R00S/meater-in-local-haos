package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zznl implements zznu {

    /* renamed from: a */
    private final int f26641a;

    /* renamed from: b */
    private final int[] f26642b;

    /* renamed from: c */
    private final long[] f26643c;

    /* renamed from: d */
    private final long[] f26644d;

    /* renamed from: e */
    private final long[] f26645e;

    /* renamed from: f */
    private final long f26646f;

    public zznl(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f26642b = iArr;
        this.f26643c = jArr;
        this.f26644d = jArr2;
        this.f26645e = jArr3;
        int length = iArr.length;
        this.f26641a = length;
        if (length > 0) {
            this.f26646f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f26646f = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: a */
    public final long mo20313a(long j2) {
        return this.f26643c[zzsy.m20538b(this.f26645e, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: b */
    public final boolean mo20314b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: f */
    public final long mo20315f() {
        return this.f26646f;
    }
}
