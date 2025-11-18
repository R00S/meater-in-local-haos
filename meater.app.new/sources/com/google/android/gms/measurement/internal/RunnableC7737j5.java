package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j5 */
/* loaded from: classes2.dex */
final class RunnableC7737j5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f28720f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28721g;

    RunnableC7737j5(zzhc zzhcVar, long j2) {
        this.f28721g = zzhcVar;
        this.f28720f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28721g.mo22840m().f28864q.m23156b(this.f28720f);
        this.f28721g.mo22836h().m23144O().m23148b("Minimum session duration set", Long.valueOf(this.f28720f));
    }
}
