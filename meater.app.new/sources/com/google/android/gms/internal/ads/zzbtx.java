package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtx implements zzdti<zzbrm> {

    /* renamed from: a */
    private final zzbtv f23570a;

    /* renamed from: b */
    private final zzdtu<Set<zzbuz<zzbro>>> f23571b;

    private zzbtx(zzbtv zzbtvVar, zzdtu<Set<zzbuz<zzbro>>> zzdtuVar) {
        this.f23570a = zzbtvVar;
        this.f23571b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbtx m18361a(zzbtv zzbtvVar, zzdtu<Set<zzbuz<zzbro>>> zzdtuVar) {
        return new zzbtx(zzbtvVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbrm) zzdto.m19874b(this.f23570a.m18342j(this.f23571b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
