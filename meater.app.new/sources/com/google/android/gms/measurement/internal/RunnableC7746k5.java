package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* loaded from: classes2.dex */
final class RunnableC7746k5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f28736f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28737g;

    RunnableC7746k5(zzhc zzhcVar, boolean z) {
        this.f28737g = zzhcVar;
        this.f28736f = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        boolean zM23236p = this.f28737g.f28874a.m23236p();
        boolean zM23235o = this.f28737g.f28874a.m23235o();
        this.f28737g.f28874a.m23234n(this.f28736f);
        if (zM23235o == this.f28736f) {
            this.f28737g.f28874a.mo22836h().m23145P().m23148b("Default data collection state already set to", Boolean.valueOf(this.f28736f));
        }
        if (this.f28737g.f28874a.m23236p() == zM23236p || this.f28737g.f28874a.m23236p() != this.f28737g.f28874a.m23235o()) {
            this.f28737g.f28874a.mo22836h().m23142M().m23149c("Default data collection is different than actual status", Boolean.valueOf(this.f28736f), Boolean.valueOf(zM23236p));
        }
        this.f28737g.m23261l0();
    }
}
