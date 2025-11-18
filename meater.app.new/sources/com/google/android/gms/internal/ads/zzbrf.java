package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

/* loaded from: classes2.dex */
public final class zzbrf implements zzdti<zzbqy.zza> {

    /* renamed from: a */
    private final zzbqy f23526a;

    private zzbrf(zzbqy zzbqyVar) {
        this.f23526a = zzbqyVar;
    }

    /* renamed from: a */
    public static zzbrf m18297a(zzbqy zzbqyVar) {
        return new zzbrf(zzbqyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzbqy.zza) zzdto.m19874b(this.f23526a.m18277a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
