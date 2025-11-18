package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbrv implements zzdti<zzbrt> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbrw>>> f23535a;

    private zzbrv(zzdtu<Set<zzbuz<zzbrw>>> zzdtuVar) {
        this.f23535a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbrv m18302a(zzdtu<Set<zzbuz<zzbrw>>> zzdtuVar) {
        return new zzbrv(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbrt(this.f23535a.get());
    }
}
