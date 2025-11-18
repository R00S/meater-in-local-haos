package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcby implements zzdti<zzcbw> {

    /* renamed from: a */
    private final zzdtu<zzbyn> f24025a;

    /* renamed from: b */
    private final zzdtu<zzbyt> f24026b;

    private zzcby(zzdtu<zzbyn> zzdtuVar, zzdtu<zzbyt> zzdtuVar2) {
        this.f24025a = zzdtuVar;
        this.f24026b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcby m18653a(zzdtu<zzbyn> zzdtuVar, zzdtu<zzbyt> zzdtuVar2) {
        return new zzcby(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcbw(this.f24025a.get(), this.f24026b.get());
    }
}
