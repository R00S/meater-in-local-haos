package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzctf implements zzdti<zzctd> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f25050a;

    private zzctf(zzdtu<zzbbl> zzdtuVar) {
        this.f25050a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzctf m18973a(zzdtu<zzbbl> zzdtuVar) {
        return new zzctf(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzctd(this.f25050a.get());
    }
}
