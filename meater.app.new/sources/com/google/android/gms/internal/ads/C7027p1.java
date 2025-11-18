package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.p1 */
/* loaded from: classes2.dex */
final class C7027p1 implements zzaho<zzalf> {

    /* renamed from: a */
    private final /* synthetic */ zzdh f20265a;

    /* renamed from: b */
    private final /* synthetic */ zzajw f20266b;

    /* renamed from: c */
    private final /* synthetic */ zzazk f20267c;

    /* renamed from: d */
    private final /* synthetic */ zzakh f20268d;

    C7027p1(zzakh zzakhVar, zzdh zzdhVar, zzajw zzajwVar, zzazk zzazkVar) {
        this.f20268d = zzakhVar;
        this.f20265a = zzdhVar;
        this.f20266b = zzajwVar;
        this.f20267c = zzazkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzalf zzalfVar, Map map) {
        synchronized (this.f20268d.f22080a) {
            zzbad.m17352h("JS Engine is requesting an update");
            if (this.f20268d.f22087h == 0) {
                zzbad.m17352h("Starting reload.");
                this.f20268d.f22087h = 2;
                this.f20268d.m16637c(this.f20265a);
            }
            this.f20266b.mo16628i("/requestReload", (zzaho) this.f20267c.m17280a());
        }
    }
}
