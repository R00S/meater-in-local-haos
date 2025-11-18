package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes2.dex */
final class RunnableC7764m5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f28773f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28774g;

    RunnableC7764m5(zzhc zzhcVar, long j2) {
        this.f28774g = zzhcVar;
        this.f28773f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28774g.mo22840m().f28865r.m23156b(this.f28773f);
        this.f28774g.mo22836h().m23144O().m23148b("Session timeout duration set", Long.valueOf(this.f28773f));
    }
}
