package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxd implements zzdti<zzbxc> {

    /* renamed from: a */
    private final zzdtu<zzbrt> f23677a;

    /* renamed from: b */
    private final zzdtu<zzcxm> f23678b;

    private zzbxd(zzdtu<zzbrt> zzdtuVar, zzdtu<zzcxm> zzdtuVar2) {
        this.f23677a = zzdtuVar;
        this.f23678b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbxd m18427a(zzdtu<zzbrt> zzdtuVar, zzdtu<zzcxm> zzdtuVar2) {
        return new zzbxd(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbxc(this.f23677a.get(), this.f23678b.get());
    }
}
