package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes2.dex */
final class RunnableC7781o4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzv f28808f;

    /* renamed from: g */
    private final /* synthetic */ zzm f28809g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28810h;

    RunnableC7781o4(zzgc zzgcVar, zzv zzvVar, zzm zzmVar) {
        this.f28810h = zzgcVar;
        this.f28808f = zzvVar;
        this.f28809g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28810h.f29304f.m23453e0();
        if (this.f28808f.f29424h.m23494y() == null) {
            this.f28810h.f29304f.m23440R(this.f28808f, this.f28809g);
        } else {
            this.f28810h.f29304f.m23464y(this.f28808f, this.f28809g);
        }
    }
}
