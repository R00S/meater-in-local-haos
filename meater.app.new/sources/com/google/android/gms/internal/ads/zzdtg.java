package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtg<T> implements zzdti<T> {

    /* renamed from: a */
    private zzdtu<T> f25983a;

    /* renamed from: a */
    public static <T> void m19866a(zzdtu<T> zzdtuVar, zzdtu<T> zzdtuVar2) {
        zzdto.m19873a(zzdtuVar2);
        zzdtg zzdtgVar = (zzdtg) zzdtuVar;
        if (zzdtgVar.f25983a != null) {
            throw new IllegalStateException();
        }
        zzdtgVar.f25983a = zzdtuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        zzdtu<T> zzdtuVar = this.f25983a;
        if (zzdtuVar != null) {
            return zzdtuVar.get();
        }
        throw new IllegalStateException();
    }
}
