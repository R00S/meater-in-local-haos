package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes2.dex */
final class RunnableC7736j4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzan f28717f;

    /* renamed from: g */
    private final /* synthetic */ zzm f28718g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28719h;

    RunnableC7736j4(zzgc zzgcVar, zzan zzanVar, zzm zzmVar) {
        this.f28719h = zzgcVar;
        this.f28717f = zzanVar;
        this.f28718g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzan zzanVarM23248E3 = this.f28719h.m23248E3(this.f28717f, this.f28718g);
        this.f28719h.f29304f.m23453e0();
        this.f28719h.f29304f.m23458p(zzanVarM23248E3, this.f28718g);
    }
}
