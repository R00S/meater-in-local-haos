package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbub implements zzdti<Set<zzbuz<zzbto>>> {

    /* renamed from: a */
    private final zzbtv f23575a;

    private zzbub(zzbtv zzbtvVar) {
        this.f23575a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbub m18366a(zzbtv zzbtvVar) {
        return new zzbub(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
