package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* loaded from: classes2.dex */
final class RunnableC7819s6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzkc f28900f;

    /* renamed from: g */
    private final /* synthetic */ Runnable f28901g;

    RunnableC7819s6(zzji zzjiVar, zzkc zzkcVar, Runnable runnable) {
        this.f28900f = zzkcVar;
        this.f28901g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28900f.m23453e0();
        this.f28900f.m23465z(this.f28901g);
        this.f28900f.m23452d0();
    }
}
