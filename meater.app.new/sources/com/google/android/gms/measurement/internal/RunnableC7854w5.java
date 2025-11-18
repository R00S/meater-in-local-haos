package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* loaded from: classes2.dex */
final class RunnableC7854w5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f28974f;

    /* renamed from: g */
    private final /* synthetic */ zzkj f28975g;

    /* renamed from: h */
    private final /* synthetic */ zzm f28976h;

    /* renamed from: i */
    private final /* synthetic */ zzik f28977i;

    RunnableC7854w5(zzik zzikVar, boolean z, zzkj zzkjVar, zzm zzmVar) {
        this.f28977i = zzikVar;
        this.f28974f = z;
        this.f28975g = zzkjVar;
        this.f28976h = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar = this.f28977i.f29339d;
        if (zzelVar == null) {
            this.f28977i.mo22836h().m23137H().m23147a("Discarding data. Failed to set user attribute");
        } else {
            this.f28977i.m23363M(zzelVar, this.f28974f ? null : this.f28975g, this.f28976h);
            this.f28977i.m23350d0();
        }
    }
}
