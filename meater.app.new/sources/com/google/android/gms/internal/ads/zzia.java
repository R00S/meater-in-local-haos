package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzia implements zzio {

    /* renamed from: a */
    private final int f26249a;

    /* renamed from: b */
    private final int[] f26250b;

    /* renamed from: c */
    private final long[] f26251c;

    /* renamed from: d */
    private final long[] f26252d;

    /* renamed from: e */
    private final long[] f26253e;

    public zzia(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f26249a = iArr.length;
        this.f26250b = iArr;
        this.f26251c = jArr;
        this.f26252d = jArr2;
        this.f26253e = jArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzio
    /* renamed from: a */
    public final long mo20059a(long j2) {
        return this.f26251c[zzkq.m20155a(this.f26253e, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    /* renamed from: b */
    public final boolean mo20060b() {
        return true;
    }
}
