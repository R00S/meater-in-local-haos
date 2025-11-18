package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzctn implements zzdti<zzctl> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25057a;

    /* renamed from: b */
    private final zzdtu<zzcxk> f25058b;

    private zzctn(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxk> zzdtuVar2) {
        this.f25057a = zzdtuVar;
        this.f25058b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzctn m18976a(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxk> zzdtuVar2) {
        return new zzctn(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzctl(this.f25057a.get(), this.f25058b.get());
    }
}
