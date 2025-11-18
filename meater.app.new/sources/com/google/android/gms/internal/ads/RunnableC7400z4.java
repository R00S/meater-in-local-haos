package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z4 */
/* loaded from: classes2.dex */
final class RunnableC7400z4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzawv f21364f;

    RunnableC7400z4(zzawv zzawvVar) {
        this.f21364f = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21364f.zzdut = Thread.currentThread();
        this.f21364f.zzto();
    }
}
