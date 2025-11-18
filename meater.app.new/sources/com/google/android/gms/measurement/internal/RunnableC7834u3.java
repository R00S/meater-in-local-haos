package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* loaded from: classes2.dex */
final class RunnableC7834u3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzfx f28931f;

    /* renamed from: g */
    private final /* synthetic */ zzet f28932g;

    RunnableC7834u3(zzfn zzfnVar, zzfx zzfxVar, zzet zzetVar) {
        this.f28931f = zzfxVar;
        this.f28932g = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f28931f.m23214E() == null) {
            this.f28932g.m23137H().m23147a("Install Referrer Reporter is null");
            return;
        }
        zzfm zzfmVarM23214E = this.f28931f.m23214E();
        zzfmVarM23214E.f29251a.m23238r();
        zzfmVarM23214E.m23168b(zzfmVarM23214E.f29251a.mo22834f().getPackageName());
    }
}
