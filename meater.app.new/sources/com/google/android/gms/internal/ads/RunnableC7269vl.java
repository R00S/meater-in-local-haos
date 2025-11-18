package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vl */
/* loaded from: classes2.dex */
final /* synthetic */ class RunnableC7269vl implements Runnable {

    /* renamed from: f */
    private final zzced f20746f;

    private RunnableC7269vl(zzced zzcedVar) {
        this.f20746f = zzcedVar;
    }

    /* renamed from: a */
    static Runnable m15955a(zzced zzcedVar) {
        return new RunnableC7269vl(zzcedVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20746f.m18697b();
    }
}
