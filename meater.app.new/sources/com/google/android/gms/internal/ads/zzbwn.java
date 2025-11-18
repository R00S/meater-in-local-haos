package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbwn implements zzdti<zzbuz<zzbto>> {

    /* renamed from: a */
    private final zzbvz f23646a;

    /* renamed from: b */
    private final zzdtu<Executor> f23647b;

    private zzbwn(zzbvz zzbvzVar, zzdtu<Executor> zzdtuVar) {
        this.f23646a = zzbvzVar;
        this.f23647b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbwn m18420a(zzbvz zzbvzVar, zzdtu<Executor> zzdtuVar) {
        return new zzbwn(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzbvz zzbvzVar = this.f23646a;
        return (zzbuz) zzdto.m19874b(new zzbuz(new zzbto(zzbvzVar) { // from class: com.google.android.gms.internal.ads.lf

            /* renamed from: f */
            private final zzbvz f19838f;

            {
                this.f19838f = zzbvzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbto
            /* renamed from: u */
            public final void mo14947u() {
                this.f19838f.m18407e();
            }
        }, this.f23647b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
