package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbnw implements zzdti<Set<zzbuz<zzue>>> {

    /* renamed from: a */
    private final zzbnk f23330a;

    /* renamed from: b */
    private final zzdtu<zzbov> f23331b;

    public zzbnw(zzbnk zzbnkVar, zzdtu<zzbov> zzdtuVar) {
        this.f23330a = zzbnkVar;
        this.f23331b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.singleton(new zzbuz(this.f23331b.get(), zzbbm.f22758b)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
