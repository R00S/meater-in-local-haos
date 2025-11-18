package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcyq implements zzdti<zzcym> {

    /* renamed from: a */
    private final zzcyo f25346a;

    /* renamed from: b */
    private final zzdtu<zzcyk> f25347b;

    /* renamed from: c */
    private final zzdtu<String> f25348c;

    private zzcyq(zzcyo zzcyoVar, zzdtu<zzcyk> zzdtuVar, zzdtu<String> zzdtuVar2) {
        this.f25346a = zzcyoVar;
        this.f25347b = zzdtuVar;
        this.f25348c = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzcyq m19081a(zzcyo zzcyoVar, zzdtu<zzcyk> zzdtuVar, zzdtu<String> zzdtuVar2) {
        return new zzcyq(zzcyoVar, zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcym) zzdto.m19874b(this.f25347b.get().m19079b(this.f25348c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
