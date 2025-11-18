package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbju implements zzdti<zzblp> {

    /* renamed from: a */
    private final zzbjn f23121a;

    /* renamed from: b */
    private final zzdtu<zzbjm> f23122b;

    public zzbju(zzbjn zzbjnVar, zzdtu<zzbjm> zzdtuVar) {
        this.f23121a = zzbjnVar;
        this.f23122b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzblp) zzdto.m19874b(this.f23122b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
