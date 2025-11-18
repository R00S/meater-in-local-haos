package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcha implements zzdti<zzbbh<Bundle>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24306a;

    /* renamed from: b */
    private final zzdtu<zzcvb<Bundle>> f24307b;

    private zzcha(zzdtu<zzczt> zzdtuVar, zzdtu<zzcvb<Bundle>> zzdtuVar2) {
        this.f24306a = zzdtuVar;
        this.f24307b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcha m18782a(zzdtu<zzczt> zzdtuVar, zzdtu<zzcvb<Bundle>> zzdtuVar2) {
        return new zzcha(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbbh) zzdto.m19874b(this.f24306a.get().m19100g(zzczs.SIGNALS).m19105c(this.f24307b.get().m18998b(new Bundle())).m19112f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
