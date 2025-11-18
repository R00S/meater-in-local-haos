package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbug implements zzdti<Set<zzbuz<zzbrl>>> {

    /* renamed from: a */
    private final zzbtv f23580a;

    private zzbug(zzbtv zzbtvVar) {
        this.f23580a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbug m18370a(zzbtv zzbtvVar) {
        return new zzbug(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23580a.m18334b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
