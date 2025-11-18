package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbnr implements zzdti<zzbnf> {

    /* renamed from: a */
    private final zzbnk f23317a;

    /* renamed from: b */
    private final zzdtu<C7371yc> f23318b;

    public zzbnr(zzbnk zzbnkVar, zzdtu<C7371yc> zzdtuVar) {
        this.f23317a = zzbnkVar;
        this.f23318b = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbnf m17926a(zzbnk zzbnkVar, Object obj) {
        return (zzbnf) zzdto.m19874b((C7371yc) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17926a(this.f23317a, this.f23318b.get());
    }
}
