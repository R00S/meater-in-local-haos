package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbre implements zzdti<zzcxv> {

    /* renamed from: a */
    private final zzbqy f23525a;

    private zzbre(zzbqy zzbqyVar) {
        this.f23525a = zzbqyVar;
    }

    /* renamed from: a */
    public static zzbre m18295a(zzbqy zzbqyVar) {
        return new zzbre(zzbqyVar);
    }

    /* renamed from: b */
    public static zzcxv m18296b(zzbqy zzbqyVar) {
        return (zzcxv) zzdto.m19874b(zzbqyVar.m18278b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18296b(this.f23525a);
    }
}
