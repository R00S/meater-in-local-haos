package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvf implements zzdti<zzbvd> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbvg>>> f23601a;

    private zzbvf(zzdtu<Set<zzbuz<zzbvg>>> zzdtuVar) {
        this.f23601a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbvf m18392a(zzdtu<Set<zzbuz<zzbvg>>> zzdtuVar) {
        return new zzbvf(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbvd(this.f23601a.get());
    }
}
