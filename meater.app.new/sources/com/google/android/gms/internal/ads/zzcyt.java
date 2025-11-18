package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyt implements zzdti<zzawu> {

    /* renamed from: a */
    private final zzcyo f25353a;

    /* renamed from: b */
    private final zzdtu<zzcym> f25354b;

    private zzcyt(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        this.f25353a = zzcyoVar;
        this.f25354b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcyt m19084a(zzcyo zzcyoVar, zzdtu<zzcym> zzdtuVar) {
        return new zzcyt(zzcyoVar, zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzawu) zzdto.m19874b(this.f25354b.get().f25339c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
