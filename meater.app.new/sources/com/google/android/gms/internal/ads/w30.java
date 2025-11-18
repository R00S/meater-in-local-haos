package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class w30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f20827f;

    /* renamed from: g */
    private final /* synthetic */ long f20828g;

    /* renamed from: h */
    private final /* synthetic */ long f20829h;

    /* renamed from: i */
    private final /* synthetic */ zzto f20830i;

    w30(zzto zztoVar, String str, long j2, long j3) {
        this.f20830i = zztoVar;
        this.f20827f = str;
        this.f20828g = j2;
        this.f20829h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20830i.f27098b.mo17596g(this.f20827f, this.f20828g, this.f20829h);
    }
}
