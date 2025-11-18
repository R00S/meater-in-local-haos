package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbgh extends zzbgl {

    /* renamed from: m */
    private final String f22999m;

    public zzbgh(zzbdf zzbdfVar, String str) {
        super(zzbdfVar);
        this.f22999m = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    /* renamed from: C */
    protected final zzhn mo17650C(String str) {
        zzjp zzjtVar = new zzjt(this.f22970f, this.f22971g);
        return new zzig(Uri.parse(str), ((Boolean) zzyt.m20848e().m16421c(zzacu.f21902y3)).booleanValue() ? new zzbeh(this.f22970f, zzjtVar, new zzbei(this) { // from class: com.google.android.gms.internal.ads.ha

            /* renamed from: a */
            private final zzbgh f19066a;

            {
                this.f19066a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbei
            /* renamed from: a */
            public final void mo15265a(boolean z, long j2) {
                this.f19066a.m17652G(z, j2);
            }
        }) : zzjtVar, "video/webm".equals(this.f22999m) ? new zzjg() : new zziv(), 2, ((Integer) zzyt.m20848e().m16421c(zzacu.f21610D)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    /* renamed from: D */
    protected final int mo17651D() {
        return 0;
    }

    /* renamed from: G */
    final /* synthetic */ void m17652G(final boolean z, final long j2) {
        final zzbdf zzbdfVar = this.f22972h.get();
        if (zzbdfVar != null) {
            zzbbm.f22757a.execute(new Runnable(zzbdfVar, z, j2) { // from class: com.google.android.gms.internal.ads.ia

                /* renamed from: f */
                private final zzbdf f19301f;

                /* renamed from: g */
                private final boolean f19302g;

                /* renamed from: h */
                private final long f19303h;

                {
                    this.f19301f = zzbdfVar;
                    this.f19302g = z;
                    this.f19303h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19301f.mo14890R(this.f19302g, this.f19303h);
                }
            });
        }
    }
}
