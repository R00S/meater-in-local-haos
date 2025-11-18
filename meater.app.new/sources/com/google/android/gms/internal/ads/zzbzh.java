package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbzh implements zzdti<zzbyt> {

    /* renamed from: a */
    private final zzbzf f23869a;

    private zzbzh(zzbzf zzbzfVar) {
        this.f23869a = zzbzfVar;
    }

    /* renamed from: a */
    public static zzbzh m18580a(zzbzf zzbzfVar) {
        return new zzbzh(zzbzfVar);
    }

    /* renamed from: b */
    public static zzbyt m18581b(zzbzf zzbzfVar) {
        return (zzbyt) zzdto.m19874b(zzbzfVar.m18578a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18581b(this.f23869a);
    }
}
