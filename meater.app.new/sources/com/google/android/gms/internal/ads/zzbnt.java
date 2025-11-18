package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbnt implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzbnk f23324a;

    /* renamed from: b */
    private final zzdtu<zzbov> f23325b;

    public zzbnt(zzbnk zzbnkVar, zzdtu<zzbov> zzdtuVar) {
        this.f23324a = zzbnkVar;
        this.f23325b = zzdtuVar;
    }

    /* renamed from: a */
    public static Set<zzbuz<zzbsr>> m17928a(zzbnk zzbnkVar, zzbov zzbovVar) {
        return (Set) zzdto.m19874b(Collections.singleton(new zzbuz(zzbovVar, zzbbm.f22758b)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17928a(this.f23324a, this.f23325b.get());
    }
}
