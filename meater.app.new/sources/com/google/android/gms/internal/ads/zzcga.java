package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcga implements zzdti<zzcfz> {

    /* renamed from: a */
    private final zzdtu<zzcfn> f24260a;

    /* renamed from: b */
    private final zzdtu<zzbjm> f24261b;

    private zzcga(zzdtu<zzcfn> zzdtuVar, zzdtu<zzbjm> zzdtuVar2) {
        this.f24260a = zzdtuVar;
        this.f24261b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcga m18758a(zzdtu<zzcfn> zzdtuVar, zzdtu<zzbjm> zzdtuVar2) {
        return new zzcga(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfz(this.f24260a.get(), this.f24261b.get());
    }
}
