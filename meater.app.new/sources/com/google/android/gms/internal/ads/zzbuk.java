package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbuk implements zzdti<zzbtv> {

    /* renamed from: a */
    private final zzbtv f23584a;

    private zzbuk(zzbtv zzbtvVar) {
        this.f23584a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbuk m18375a(zzbtv zzbtvVar) {
        return new zzbuk(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbtv zzbtvVar = this.f23584a;
        zzbtvVar.getClass();
        return (zzbtv) zzdto.m19874b(zzbtvVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
