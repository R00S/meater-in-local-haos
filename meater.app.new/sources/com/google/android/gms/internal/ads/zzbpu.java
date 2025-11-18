package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpu implements zzdti<zzcxu> {

    /* renamed from: a */
    private final zzbpr f23459a;

    private zzbpu(zzbpr zzbprVar) {
        this.f23459a = zzbprVar;
    }

    /* renamed from: a */
    public static zzbpu m18247a(zzbpr zzbprVar) {
        return new zzbpu(zzbprVar);
    }

    /* renamed from: b */
    public static zzcxu m18248b(zzbpr zzbprVar) {
        return (zzcxu) zzdto.m19874b(zzbprVar.m18240a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18248b(this.f23459a);
    }
}
