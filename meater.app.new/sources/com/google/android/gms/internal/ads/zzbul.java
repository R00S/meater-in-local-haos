package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbul implements zzdti<Set<zzbuz<zzue>>> {

    /* renamed from: a */
    private final zzbtv f23585a;

    private zzbul(zzbtv zzbtvVar) {
        this.f23585a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbul m18376a(zzbtv zzbtvVar) {
        return new zzbul(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
