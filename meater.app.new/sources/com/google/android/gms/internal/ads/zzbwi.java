package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwi implements zzdti<zzbuz<zzahy>> {

    /* renamed from: a */
    private final zzbvz f23637a;

    /* renamed from: b */
    private final zzdtu<zzccz> f23638b;

    public zzbwi(zzbvz zzbvzVar, zzdtu<zzccz> zzdtuVar) {
        this.f23637a = zzbvzVar;
        this.f23638b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbuz) zzdto.m19874b(new zzbuz(this.f23638b.get(), zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
