package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* loaded from: classes2.dex */
final class RunnableC7682d4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzv f28598f;

    /* renamed from: g */
    private final /* synthetic */ zzgc f28599g;

    RunnableC7682d4(zzgc zzgcVar, zzv zzvVar) {
        this.f28599g = zzgcVar;
        this.f28598f = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28599g.f29304f.m23453e0();
        if (this.f28598f.f29424h.m23494y() == null) {
            this.f28599g.f29304f.m23439Q(this.f28598f);
        } else {
            this.f28599g.f29304f.m23463x(this.f28598f);
        }
    }
}
