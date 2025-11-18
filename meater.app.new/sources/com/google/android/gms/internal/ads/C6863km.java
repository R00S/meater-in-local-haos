package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.km */
/* loaded from: classes2.dex */
final class C6863km implements zzbsn {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f19716a;

    /* renamed from: b */
    private final /* synthetic */ zzcjy f19717b;

    C6863km(zzcoe zzcoeVar, zzbbr zzbbrVar, zzcjy zzcjyVar) {
        this.f19716a = zzbbrVar;
        this.f19717b = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final synchronized void onAdFailedToLoad(int i2) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21855q4)).booleanValue()) {
            i2 = 3;
        }
        zzbbr zzbbrVar = this.f19716a;
        String str = this.f19717b.f24421a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("adapter ");
        sb.append(str);
        sb.append(" failed to load");
        zzbbrVar.m17386c(new zzcmw(sb.toString(), i2));
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final synchronized void onAdLoaded() {
        this.f19716a.m17385a(null);
    }
}
