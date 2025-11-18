package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tc */
/* loaded from: classes2.dex */
final class C7186tc implements zzaho<Object> {

    /* renamed from: a */
    final /* synthetic */ zzbmg f20565a;

    C7186tc(zzbmg zzbmgVar) {
        this.f20565a = zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        if (this.f20565a.m17887h(map)) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21909z4)).booleanValue()) {
                this.f20565a.f23232c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uc

                    /* renamed from: f */
                    private final C7186tc f20628f;

                    {
                        this.f20628f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20628f.f20565a.f23233d.m17898y();
                    }
                });
            } else {
                this.f20565a.f23233d.m17898y();
            }
        }
    }
}
