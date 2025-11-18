package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxn implements zzdti<zzbzc> {

    /* renamed from: a */
    private final zzbxk f23701a;

    private zzbxn(zzbxk zzbxkVar) {
        this.f23701a = zzbxkVar;
    }

    /* renamed from: a */
    public static zzbxn m18433a(zzbxk zzbxkVar) {
        return new zzbxn(zzbxkVar);
    }

    /* renamed from: b */
    public static zzbzc m18434b(zzbxk zzbxkVar) {
        return (zzbzc) zzdto.m19874b(zzbxkVar.m18430a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18434b(this.f23701a);
    }
}
