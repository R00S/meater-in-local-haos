package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzboj implements zzdti<zzcjv<zzbnf>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f23355a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f23356b;

    /* renamed from: c */
    private final zzdtu<zzckm> f23357c;

    /* renamed from: d */
    private final zzdtu<zzcoc> f23358d;

    public zzboj(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbl> zzdtuVar2, zzdtu<zzckm> zzdtuVar3, zzdtu<zzcoc> zzdtuVar4) {
        this.f23355a = zzdtuVar;
        this.f23356b = zzdtuVar2;
        this.f23357c = zzdtuVar3;
        this.f23358d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (zzcjv) zzdto.m19874b(new zzcoe(this.f23355a.get(), this.f23356b.get(), this.f23358d.get(), this.f23357c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
