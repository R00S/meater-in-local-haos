package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s1 */
/* loaded from: classes2.dex */
final class C7138s1 implements zzbbv<zzajw> {

    /* renamed from: a */
    private final /* synthetic */ zzala f20490a;

    /* renamed from: b */
    private final /* synthetic */ zzakh f20491b;

    C7138s1(zzakh zzakhVar, zzala zzalaVar) {
        this.f20491b = zzakhVar;
        this.f20490a = zzalaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbv
    /* renamed from: a */
    public final /* synthetic */ void mo14740a(zzajw zzajwVar) {
        synchronized (this.f20491b.f22080a) {
            this.f20491b.f22087h = 0;
            if (this.f20491b.f22086g != null && this.f20490a != this.f20491b.f22086g) {
                zzawz.m17082m("New JS engine is loaded, marking previous one as destroyable.");
                this.f20491b.f22086g.m16651i();
            }
            this.f20491b.f22086g = this.f20490a;
        }
    }
}
