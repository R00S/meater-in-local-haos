package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbsl implements zzdti<zzbse> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbrl>>> f23537a;

    private zzbsl(zzdtu<Set<zzbuz<zzbrl>>> zzdtuVar) {
        this.f23537a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbsl m18314a(zzdtu<Set<zzbuz<zzbrl>>> zzdtuVar) {
        return new zzbsl(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbse(this.f23537a.get());
    }
}
