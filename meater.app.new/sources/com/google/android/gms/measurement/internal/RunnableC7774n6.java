package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n6 */
/* loaded from: classes2.dex */
final class RunnableC7774n6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzel f28799f;

    /* renamed from: g */
    private final /* synthetic */ zzjc f28800g;

    RunnableC7774n6(zzjc zzjcVar, zzel zzelVar) {
        this.f28800g = zzjcVar;
        this.f28799f = zzelVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28800g) {
            zzjc.m23377c(this.f28800g, false);
            if (!this.f28800g.f29347h.m23370V()) {
                this.f28800g.f29347h.mo22836h().m23144O().m23147a("Connected to remote service");
                this.f28800g.f29347h.m23362L(this.f28799f);
            }
        }
    }
}
