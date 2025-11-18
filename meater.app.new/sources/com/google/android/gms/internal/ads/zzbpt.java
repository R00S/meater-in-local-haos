package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpt implements zzdti<String> {

    /* renamed from: a */
    private final zzbpr f23458a;

    private zzbpt(zzbpr zzbprVar) {
        this.f23458a = zzbprVar;
    }

    /* renamed from: a */
    public static zzbpt m18245a(zzbpr zzbprVar) {
        return new zzbpt(zzbprVar);
    }

    /* renamed from: b */
    public static String m18246b(zzbpr zzbprVar) {
        return (String) zzdto.m19874b(zzbprVar.m18242c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18246b(this.f23458a);
    }
}
