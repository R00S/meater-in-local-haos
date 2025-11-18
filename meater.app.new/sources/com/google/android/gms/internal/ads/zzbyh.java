package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbyh implements zzdti<zzccj> {

    /* renamed from: a */
    private final zzbyc f23766a;

    public zzbyh(zzbyc zzbycVar) {
        this.f23766a = zzbycVar;
    }

    /* renamed from: a */
    public static zzccj m18475a(zzbyc zzbycVar) {
        return (zzccj) zzdto.m19874b(zzbycVar.m18474b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m18475a(this.f23766a);
    }
}
