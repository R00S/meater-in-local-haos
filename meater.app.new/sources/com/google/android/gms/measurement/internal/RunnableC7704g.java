package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes2.dex */
final class RunnableC7704g implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ InterfaceC7817s4 f28641f;

    /* renamed from: g */
    private final /* synthetic */ AbstractC7695f f28642g;

    RunnableC7704g(AbstractC7695f abstractC7695f, InterfaceC7817s4 interfaceC7817s4) {
        this.f28642g = abstractC7695f;
        this.f28641f = interfaceC7817s4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28641f.mo22832G();
        if (zzw.m23556a()) {
            this.f28641f.mo22835g().m23201z(this);
            return;
        }
        boolean zM22775d = this.f28642g.m22775d();
        AbstractC7695f.m22772a(this.f28642g, 0L);
        if (zM22775d) {
            this.f28642g.mo22703b();
        }
    }
}
