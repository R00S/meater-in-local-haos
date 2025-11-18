package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcfc implements zzdti<zzcfb> {

    /* renamed from: a */
    private final zzdtu<zzcfi> f24207a;

    /* renamed from: b */
    private final zzdtu<zzdae> f24208b;

    private zzcfc(zzdtu<zzcfi> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        this.f24207a = zzdtuVar;
        this.f24208b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfc m18722a(zzdtu<zzcfi> zzdtuVar, zzdtu<zzdae> zzdtuVar2) {
        return new zzcfc(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcfb(this.f24207a.get(), this.f24208b.get());
    }
}
