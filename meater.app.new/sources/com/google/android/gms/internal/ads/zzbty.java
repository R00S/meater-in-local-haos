package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbty implements zzdti<Set<zzbuz<zzbrx>>> {

    /* renamed from: a */
    private final zzbtv f23572a;

    private zzbty(zzbtv zzbtvVar) {
        this.f23572a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbty m18362a(zzbtv zzbtvVar) {
        return new zzbty(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
