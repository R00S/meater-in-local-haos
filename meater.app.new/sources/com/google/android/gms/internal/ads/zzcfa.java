package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcfa implements zzdti<zzcex> {

    /* renamed from: a */
    private final zzdtu<zzwj> f24202a;

    /* renamed from: b */
    private final zzdtu<Map<zzczs, zzcez>> f24203b;

    private zzcfa(zzdtu<zzwj> zzdtuVar, zzdtu<Map<zzczs, zzcez>> zzdtuVar2) {
        this.f24202a = zzdtuVar;
        this.f24203b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcfa m18720a(zzdtu<zzwj> zzdtuVar, zzdtu<Map<zzczs, zzcez>> zzdtuVar2) {
        return new zzcfa(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcex(this.f24202a.get(), this.f24203b.get());
    }
}
