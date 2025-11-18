package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcca implements zzdti<zzcbz> {

    /* renamed from: a */
    private final zzdtu<String> f24037a;

    /* renamed from: b */
    private final zzdtu<zzbyn> f24038b;

    /* renamed from: c */
    private final zzdtu<zzbyt> f24039c;

    private zzcca(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        this.f24037a = zzdtuVar;
        this.f24038b = zzdtuVar2;
        this.f24039c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzcca m18656a(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        return new zzcca(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbz(this.f24037a.get(), this.f24038b.get(), this.f24039c.get());
    }
}
