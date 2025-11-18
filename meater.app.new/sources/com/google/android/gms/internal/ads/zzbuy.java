package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuy implements zzdti<zzbuv> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbuu>>> f23592a;

    private zzbuy(zzdtu<Set<zzbuz<zzbuu>>> zzdtuVar) {
        this.f23592a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbuy m18386a(zzdtu<Set<zzbuz<zzbuu>>> zzdtuVar) {
        return new zzbuy(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbuv(this.f23592a.get());
    }
}
