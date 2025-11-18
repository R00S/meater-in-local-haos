package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes2.dex */
final class RunnableC7765m6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzel f28775f;

    /* renamed from: g */
    private final /* synthetic */ zzjc f28776g;

    RunnableC7765m6(zzjc zzjcVar, zzel zzelVar) {
        this.f28776g = zzjcVar;
        this.f28775f = zzelVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28776g) {
            zzjc.m23377c(this.f28776g, false);
            if (!this.f28776g.f29347h.m23370V()) {
                this.f28776g.f29347h.mo22836h().m23145P().m23147a("Connected to service");
                this.f28776g.f29347h.m23362L(this.f28775f);
            }
        }
    }
}
