package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbwr implements zzdti<zzbwq> {

    /* renamed from: a */
    private final zzdtu<zzbsv> f23651a;

    /* renamed from: b */
    private final zzdtu<zzbuv> f23652b;

    private zzbwr(zzdtu<zzbsv> zzdtuVar, zzdtu<zzbuv> zzdtuVar2) {
        this.f23651a = zzdtuVar;
        this.f23652b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzbwr m18423a(zzdtu<zzbsv> zzdtuVar, zzdtu<zzbuv> zzdtuVar2) {
        return new zzbwr(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbwq(this.f23651a.get(), this.f23652b.get());
    }
}
