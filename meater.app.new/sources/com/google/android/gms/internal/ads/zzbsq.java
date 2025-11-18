package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbsq implements zzdti<zzbso> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbsr>>> f23538a;

    private zzbsq(zzdtu<Set<zzbuz<zzbsr>>> zzdtuVar) {
        this.f23538a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbsq m18316a(zzdtu<Set<zzbuz<zzbsr>>> zzdtuVar) {
        return new zzbsq(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbso(this.f23538a.get());
    }
}
