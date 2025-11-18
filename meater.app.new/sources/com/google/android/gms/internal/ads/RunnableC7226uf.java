package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uf */
/* loaded from: classes2.dex */
final /* synthetic */ class RunnableC7226uf implements Runnable {

    /* renamed from: f */
    private final zzbzb f20630f;

    private RunnableC7226uf(zzbzb zzbzbVar) {
        this.f20630f = zzbzbVar;
    }

    /* renamed from: a */
    static Runnable m15928a(zzbzb zzbzbVar) {
        return new RunnableC7226uf(zzbzbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20630f.mo18459d();
    }
}
