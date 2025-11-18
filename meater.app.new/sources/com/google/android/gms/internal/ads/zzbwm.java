package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbwm implements zzdti<Set<zzbuz<zzbuu>>> {

    /* renamed from: a */
    private final zzdtu<zzbxe> f23645a;

    private zzbwm(zzdtu<zzbxe> zzdtuVar) {
        this.f23645a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbwm m18419a(zzdtu<zzbxe> zzdtuVar) {
        return new zzbwm(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.singleton(zzbuz.m18387a(this.f23645a.get(), zzbbm.f22758b)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
