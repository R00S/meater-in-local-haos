package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnz implements zzdti<zzbuz<zzbto>> {

    /* renamed from: a */
    private final zzbnk f23338a;

    /* renamed from: b */
    private final zzdtu<zzbtb> f23339b;

    public zzbnz(zzbnk zzbnkVar, zzdtu<zzbtb> zzdtuVar) {
        this.f23338a = zzbnkVar;
        this.f23339b = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzbtb zzbtbVar = this.f23339b.get();
        return (zzbuz) zzdto.m19874b(new zzbuz(new zzbto(zzbtbVar) { // from class: com.google.android.gms.internal.ads.bd

            /* renamed from: f */
            private final zzbtb f18334f;

            {
                this.f18334f = zzbtbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbto
            /* renamed from: u */
            public final void mo14947u() {
                this.f18334f.m18323f0();
            }
        }, zzbbm.f22758b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
