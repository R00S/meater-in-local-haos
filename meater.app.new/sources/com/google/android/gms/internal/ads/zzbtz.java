package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtz implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzbtv f23573a;

    private zzbtz(zzbtv zzbtvVar) {
        this.f23573a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbtz m18363a(zzbtv zzbtvVar) {
        return new zzbtz(zzbtvVar);
    }

    /* renamed from: b */
    public static Set<zzbuz<zzbsr>> m18364b(zzbtv zzbtvVar) {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18364b(this.f23573a);
    }
}
