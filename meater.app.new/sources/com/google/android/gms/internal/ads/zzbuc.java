package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuc implements zzdti<Set<zzbuz<zzxr>>> {

    /* renamed from: a */
    private final zzbtv f23576a;

    private zzbuc(zzbtv zzbtvVar) {
        this.f23576a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbuc m18367a(zzbtv zzbtvVar) {
        return new zzbuc(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23576a.m18340h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
