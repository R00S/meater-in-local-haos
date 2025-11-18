package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzbxv implements zzdti<zzcyb<zzccj>> {

    /* renamed from: a */
    private final zzdtu<zzccj> f23709a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f23710b;

    public zzbxv(zzdtu<zzccj> zzdtuVar, zzdtu<zzbbl> zzdtuVar2) {
        this.f23709a = zzdtuVar;
        this.f23710b = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzdtu<zzccj> zzdtuVar = this.f23709a;
        return (zzcyb) zzdto.m19874b(new zzcyb(new Callable(zzdtuVar) { // from class: com.google.android.gms.internal.ads.of

            /* renamed from: f */
            private final zzdtu f20188f;

            {
                this.f20188f = zzdtuVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzccj zzccjVar = (zzccj) this.f20188f.get();
                zzccjVar.m18668g();
                return zzccjVar;
            }
        }, this.f23710b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
