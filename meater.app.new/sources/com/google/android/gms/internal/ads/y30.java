package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class y30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f21096f;

    /* renamed from: g */
    private final /* synthetic */ long f21097g;

    /* renamed from: h */
    private final /* synthetic */ zzto f21098h;

    y30(zzto zztoVar, int i2, long j2) {
        this.f21098h = zztoVar;
        this.f21096f = i2;
        this.f21097g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21098h.f27098b.mo17591b(this.f21096f, this.f21097g);
    }
}
