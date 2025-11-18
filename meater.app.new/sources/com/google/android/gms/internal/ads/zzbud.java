package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbud implements zzdti<Set<zzbuz<zzbro>>> {

    /* renamed from: a */
    private final zzbtv f23577a;

    private zzbud(zzbtv zzbtvVar) {
        this.f23577a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbud m18368a(zzbtv zzbtvVar) {
        return new zzbud(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23577a.m18336d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
