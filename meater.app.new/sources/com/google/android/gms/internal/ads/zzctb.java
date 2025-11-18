package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzctb implements zzdti<zzcsz> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25046a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f25047b;

    private zzctb(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        this.f25046a = zzdtuVar;
        this.f25047b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzctb m18972a(zzdtu<zzbbl> zzdtuVar, zzdtu<zzcxv> zzdtuVar2) {
        return new zzctb(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcsz(this.f25046a.get(), this.f25047b.get());
    }
}
