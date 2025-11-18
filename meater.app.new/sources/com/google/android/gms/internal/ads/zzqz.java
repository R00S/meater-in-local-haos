package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzqz extends zzlr {

    /* renamed from: b */
    private static final Object f26869b = new Object();

    /* renamed from: c */
    private final long f26870c;

    /* renamed from: d */
    private final long f26871d;

    /* renamed from: e */
    private final long f26872e;

    /* renamed from: f */
    private final long f26873f;

    /* renamed from: g */
    private final boolean f26874g;

    /* renamed from: h */
    private final boolean f26875h;

    public zzqz(long j2, boolean z) {
        this(j2, j2, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    /* renamed from: c */
    public final zzlt mo15897c(int i2, zzlt zzltVar, boolean z) {
        zzsk.m20483g(i2, 0, 1);
        Object obj = z ? f26869b : null;
        return zzltVar.m20219a(obj, obj, 0, this.f26870c, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    /* renamed from: e */
    public final zzlu mo15898e(int i2, zzlu zzluVar, boolean z, long j2) {
        zzsk.m20483g(i2, 0, 1);
        boolean z2 = this.f26874g;
        long j3 = this.f26871d;
        zzluVar.f26503a = null;
        zzluVar.f26504b = -9223372036854775807L;
        zzluVar.f26505c = -9223372036854775807L;
        zzluVar.f26506d = z2;
        zzluVar.f26507e = false;
        zzluVar.f26510h = 0L;
        zzluVar.f26511i = j3;
        zzluVar.f26508f = 0;
        zzluVar.f26509g = 0;
        zzluVar.f26512j = 0L;
        return zzluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    /* renamed from: f */
    public final int mo15899f(Object obj) {
        return f26869b.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    /* renamed from: g */
    public final int mo15900g() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    /* renamed from: h */
    public final int mo15901h() {
        return 1;
    }

    private zzqz(long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.f26870c = j2;
        this.f26871d = j3;
        this.f26872e = 0L;
        this.f26873f = 0L;
        this.f26874g = z;
        this.f26875h = false;
    }
}
