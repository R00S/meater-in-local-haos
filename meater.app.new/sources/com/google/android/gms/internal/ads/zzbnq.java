package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnq implements zzdti<zzbpb> {

    /* renamed from: a */
    private final zzbnk f23316a;

    public zzbnq(zzbnk zzbnkVar) {
        this.f23316a = zzbnkVar;
    }

    /* renamed from: a */
    public static zzbpb m17925a(zzbnk zzbnkVar) {
        return (zzbpb) zzdto.m19874b(zzbnkVar.m17920d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17925a(this.f23316a);
    }
}
