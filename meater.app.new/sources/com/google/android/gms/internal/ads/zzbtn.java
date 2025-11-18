package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtn implements zzdti<zzbtl> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbto>>> f23549a;

    private zzbtn(zzdtu<Set<zzbuz<zzbto>>> zzdtuVar) {
        this.f23549a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbtn m18327a(zzdtu<Set<zzbuz<zzbto>>> zzdtuVar) {
        return new zzbtn(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbtl(this.f23549a.get());
    }
}
