package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcoy implements zzdti<zzcow> {

    /* renamed from: a */
    private final zzcow f24842a;

    private zzcoy(zzcow zzcowVar) {
        this.f24842a = zzcowVar;
    }

    /* renamed from: a */
    public static zzcoy m18904a(zzcow zzcowVar) {
        return new zzcoy(zzcowVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzcow zzcowVar = this.f24842a;
        zzcowVar.getClass();
        return (zzcow) zzdto.m19874b(zzcowVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
