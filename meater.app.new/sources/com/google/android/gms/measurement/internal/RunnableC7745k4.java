package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* loaded from: classes2.dex */
final class RunnableC7745k4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzkj f28733f;

    /* renamed from: g */
    private final /* synthetic */ zzm f28734g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28735h;

    RunnableC7745k4(zzgc zzgcVar, zzkj zzkjVar, zzm zzmVar) {
        this.f28735h = zzgcVar;
        this.f28733f = zzkjVar;
        this.f28734g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28735h.f29304f.m23453e0();
        if (this.f28733f.m23494y() == null) {
            this.f28735h.f29304f.m23437O(this.f28733f, this.f28734g);
        } else {
            this.f28735h.f29304f.m23461v(this.f28733f, this.f28734g);
        }
    }
}
