package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwh implements zzdti<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>> {

    /* renamed from: a */
    private final zzbvz f23635a;

    /* renamed from: b */
    private final zzdtu<zzbxa> f23636b;

    private zzbwh(zzbvz zzbvzVar, zzdtu<zzbxa> zzdtuVar) {
        this.f23635a = zzbvzVar;
        this.f23636b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbwh m18415a(zzbvz zzbvzVar, zzdtu<zzbxa> zzdtuVar) {
        return new zzbwh(zzbvzVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23636b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
