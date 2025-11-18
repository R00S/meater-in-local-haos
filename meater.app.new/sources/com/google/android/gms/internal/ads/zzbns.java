package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbns implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbnk f23319a;

    /* renamed from: b */
    private final zzdtu<Context> f23320b;

    /* renamed from: c */
    private final zzdtu<zzbai> f23321c;

    /* renamed from: d */
    private final zzdtu<zzcxm> f23322d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f23323e;

    public zzbns(zzbnk zzbnkVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzcxv> zzdtuVar4) {
        this.f23319a = zzbnkVar;
        this.f23320b = zzdtuVar;
        this.f23321c = zzdtuVar2;
        this.f23322d = zzdtuVar3;
        this.f23323e = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzbuz<zzbsr> m17927a(zzbnk zzbnkVar, final Context context, final zzbai zzbaiVar, final zzcxm zzcxmVar, final zzcxv zzcxvVar) {
        return (zzbuz) zzdto.m19874b(new zzbuz(new zzbsr(context, zzbaiVar, zzcxmVar, zzcxvVar) { // from class: com.google.android.gms.internal.ads.ad

            /* renamed from: f */
            private final Context f18154f;

            /* renamed from: g */
            private final zzbai f18155g;

            /* renamed from: h */
            private final zzcxm f18156h;

            /* renamed from: i */
            private final zzcxv f18157i;

            {
                this.f18154f = context;
                this.f18155g = zzbaiVar;
                this.f18156h = zzcxmVar;
                this.f18157i = zzcxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsr
            public final void onAdLoaded() {
                zzk.zzlq().m17240c(this.f18154f, this.f18155g.f22750f, this.f18156h.f25268z.toString(), this.f18157i.f25295f);
            }
        }, zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17927a(this.f23319a, this.f23320b.get(), this.f23321c.get(), this.f23322d.get(), this.f23323e.get());
    }
}
