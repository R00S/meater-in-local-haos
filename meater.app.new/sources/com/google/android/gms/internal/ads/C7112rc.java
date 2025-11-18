package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rc */
/* loaded from: classes2.dex */
final class C7112rc implements zzaho<Object> {

    /* renamed from: a */
    final /* synthetic */ zzbmg f20445a;

    C7112rc(zzbmg zzbmgVar) {
        this.f20445a = zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        if (this.f20445a.m17887h(map)) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21909z4)).booleanValue()) {
                this.f20445a.f23232c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sc

                    /* renamed from: f */
                    private final C7112rc f20517f;

                    {
                        this.f20517f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20517f.f20445a.f23233d.m17897q();
                    }
                });
            } else {
                this.f20445a.f23233d.m17897q();
            }
        }
    }
}
