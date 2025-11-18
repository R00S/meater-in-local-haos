package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwg implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbvz f23633a;

    /* renamed from: b */
    private final zzdtu<zzbxa> f23634b;

    private zzbwg(zzbvz zzbvzVar, zzdtu<zzbxa> zzdtuVar) {
        this.f23633a = zzbvzVar;
        this.f23634b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbwg m18414a(zzbvz zzbvzVar, zzdtu<zzbxa> zzdtuVar) {
        return new zzbwg(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23634b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
