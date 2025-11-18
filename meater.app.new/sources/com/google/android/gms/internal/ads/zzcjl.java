package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcjl implements zzdti<zzcjk> {

    /* renamed from: a */
    private final zzdtu<zzcji> f24401a;

    private zzcjl(zzdtu<zzcji> zzdtuVar) {
        this.f24401a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcjl m18829a(zzdtu<zzcji> zzdtuVar) {
        return new zzcjl(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcjk(this.f24401a.get());
    }
}
