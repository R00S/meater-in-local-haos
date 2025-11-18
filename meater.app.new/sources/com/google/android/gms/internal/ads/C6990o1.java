package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.o1 */
/* loaded from: classes2.dex */
final class C6990o1 implements zzaho<zzalf> {

    /* renamed from: a */
    private final /* synthetic */ zzala f20120a;

    /* renamed from: b */
    private final /* synthetic */ zzajw f20121b;

    /* renamed from: c */
    private final /* synthetic */ zzakh f20122c;

    C6990o1(zzakh zzakhVar, zzala zzalaVar, zzajw zzajwVar) {
        this.f20122c = zzakhVar;
        this.f20120a = zzalaVar;
        this.f20121b = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzalf zzalfVar, Map map) {
        synchronized (this.f20122c.f22080a) {
            if (this.f20120a.m17388a() != -1 && this.f20120a.m17388a() != 1) {
                this.f20122c.f22087h = 0;
                this.f20122c.f22084e.mo15097a(this.f20121b);
                this.f20120a.m17391e(this.f20121b);
                this.f20122c.f22086g = this.f20120a;
                zzawz.m17082m("Successfully loaded JS Engine.");
            }
        }
    }
}
