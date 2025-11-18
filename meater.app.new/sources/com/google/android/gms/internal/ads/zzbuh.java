package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuh implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzbtv f23581a;

    private zzbuh(zzbtv zzbtvVar) {
        this.f23581a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbuh m18371a(zzbtv zzbtvVar) {
        return new zzbuh(zzbtvVar);
    }

    /* renamed from: b */
    public static Set<zzbuz<zzbsr>> m18372b(zzbtv zzbtvVar) {
        return (Set) zzdto.m19874b(zzbtvVar.m18335c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18372b(this.f23581a);
    }
}
