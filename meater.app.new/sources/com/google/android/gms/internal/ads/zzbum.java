package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbum implements zzdti<Set<zzbuz<zzbvg>>> {

    /* renamed from: a */
    private final zzbtv f23586a;

    private zzbum(zzbtv zzbtvVar) {
        this.f23586a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbum m18377a(zzbtv zzbtvVar) {
        return new zzbum(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
