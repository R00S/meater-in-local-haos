package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes2.dex */
final class RunnableC7727i4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzan f28700f;

    /* renamed from: g */
    private final /* synthetic */ String f28701g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28702h;

    RunnableC7727i4(zzgc zzgcVar, zzan zzanVar, String str) {
        this.f28702h = zzgcVar;
        this.f28700f = zzanVar;
        this.f28701g = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28702h.f29304f.m23453e0();
        this.f28702h.f29304f.m23459q(this.f28700f, this.f28701g);
    }
}
