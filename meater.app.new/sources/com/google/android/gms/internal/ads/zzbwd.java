package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbwd implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbvz f23626a;

    /* renamed from: b */
    private final zzdtu<Context> f23627b;

    /* renamed from: c */
    private final zzdtu<zzbai> f23628c;

    /* renamed from: d */
    private final zzdtu<zzcxm> f23629d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f23630e;

    private zzbwd(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzcxv> zzdtuVar4) {
        this.f23626a = zzbvzVar;
        this.f23627b = zzdtuVar;
        this.f23628c = zzdtuVar2;
        this.f23629d = zzdtuVar3;
        this.f23630e = zzdtuVar4;
    }

    /* renamed from: a */
    public static zzbwd m18411a(zzbvz zzbvzVar, zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxm> zzdtuVar3, zzdtu<zzcxv> zzdtuVar4) {
        return new zzbwd(zzbvzVar, zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final Context context = this.f23627b.get();
        final zzbai zzbaiVar = this.f23628c.get();
        final zzcxm zzcxmVar = this.f23629d.get();
        final zzcxv zzcxvVar = this.f23630e.get();
        return (zzbuz) zzdto.m19874b(new zzbuz(new zzbsr(context, zzbaiVar, zzcxmVar, zzcxvVar) { // from class: com.google.android.gms.internal.ads.kf

            /* renamed from: f */
            private final Context f19695f;

            /* renamed from: g */
            private final zzbai f19696g;

            /* renamed from: h */
            private final zzcxm f19697h;

            /* renamed from: i */
            private final zzcxv f19698i;

            {
                this.f19695f = context;
                this.f19696g = zzbaiVar;
                this.f19697h = zzcxmVar;
                this.f19698i = zzcxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsr
            public final void onAdLoaded() {
                zzk.zzlq().m17240c(this.f19695f, this.f19696g.f22750f, this.f19697h.f25268z.toString(), this.f19698i.f25295f);
            }
        }, zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
