package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class x00 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f20889f;

    /* renamed from: g */
    private final /* synthetic */ long f20890g;

    /* renamed from: h */
    private final /* synthetic */ long f20891h;

    /* renamed from: i */
    private final /* synthetic */ zzma f20892i;

    x00(zzma zzmaVar, int i2, long j2, long j3) {
        this.f20892i = zzmaVar;
        this.f20889f = i2;
        this.f20890g = j2;
        this.f20891h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20892i.f26524b.m20228c(this.f20889f, this.f20890g, this.f20891h);
    }
}
