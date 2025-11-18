package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbjx implements zzdti<zzbai> {

    /* renamed from: a */
    private final zzbjn f23125a;

    public zzbjx(zzbjn zzbjnVar) {
        this.f23125a = zzbjnVar;
    }

    /* renamed from: a */
    public static zzbai m17800a(zzbjn zzbjnVar) {
        return (zzbai) zzdto.m19874b(zzbjnVar.m17792c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17800a(this.f23125a);
    }
}
