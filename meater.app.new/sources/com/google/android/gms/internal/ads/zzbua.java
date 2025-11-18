package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbua implements zzdti<Set<zzbuz<com.google.android.gms.ads.internal.overlay.zzo>>> {

    /* renamed from: a */
    private final zzbtv f23574a;

    private zzbua(zzbtv zzbtvVar) {
        this.f23574a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbua m18365a(zzbtv zzbtvVar) {
        return new zzbua(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
