package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbxm implements zzdti<zzbxk> {

    /* renamed from: a */
    private final zzbxk f23700a;

    private zzbxm(zzbxk zzbxkVar) {
        this.f23700a = zzbxkVar;
    }

    /* renamed from: a */
    public static zzbxm m18432a(zzbxk zzbxkVar) {
        return new zzbxm(zzbxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzbxk zzbxkVar = this.f23700a;
        zzbxkVar.getClass();
        return (zzbxk) zzdto.m19874b(zzbxkVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
