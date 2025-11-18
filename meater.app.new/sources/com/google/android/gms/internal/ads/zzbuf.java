package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuf implements zzdti<Set<zzbuz<zzbrw>>> {

    /* renamed from: a */
    private final zzbtv f23579a;

    private zzbuf(zzbtv zzbtvVar) {
        this.f23579a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbuf m18369a(zzbtv zzbtvVar) {
        return new zzbuf(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23579a.m18341i(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
