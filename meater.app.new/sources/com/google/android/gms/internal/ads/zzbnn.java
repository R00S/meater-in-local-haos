package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbnn implements zzdti<zzbso> {

    /* renamed from: a */
    private final zzbnk f23312a;

    /* renamed from: b */
    private final zzdtu<Set<zzbuz<zzbsr>>> f23313b;

    public zzbnn(zzbnk zzbnkVar, zzdtu<Set<zzbuz<zzbsr>>> zzdtuVar) {
        this.f23312a = zzbnkVar;
        this.f23313b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbso m17922a(zzbnk zzbnkVar, Set<zzbuz<zzbsr>> set) {
        return (zzbso) zzdto.m19874b(zzbnkVar.mo15597a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17922a(this.f23312a, this.f23313b.get());
    }
}
