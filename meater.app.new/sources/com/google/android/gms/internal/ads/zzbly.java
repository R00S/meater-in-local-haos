package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbly implements zzdti<zzblx> {

    /* renamed from: a */
    private final zzdtu<zzcxk> f23206a;

    private zzbly(zzdtu<zzcxk> zzdtuVar) {
        this.f23206a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbly m17876a(zzdtu<zzcxk> zzdtuVar) {
        return new zzbly(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzblx(this.f23206a.get());
    }
}
