package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtt<T> implements zzdtu<T> {

    /* renamed from: a */
    private static final Object f25998a = new Object();

    /* renamed from: b */
    private volatile zzdtu<T> f25999b;

    /* renamed from: c */
    private volatile Object f26000c = f25998a;

    private zzdtt(zzdtu<T> zzdtuVar) {
        this.f25999b = zzdtuVar;
    }

    /* renamed from: a */
    public static <P extends zzdtu<T>, T> zzdtu<T> m19884a(P p) {
        return ((p instanceof zzdtt) || (p instanceof zzdth)) ? p : new zzdtt((zzdtu) zzdto.m19873a(p));
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        T t = (T) this.f26000c;
        if (t != f25998a) {
            return t;
        }
        zzdtu<T> zzdtuVar = this.f25999b;
        if (zzdtuVar == null) {
            return (T) this.f26000c;
        }
        T t2 = zzdtuVar.get();
        this.f26000c = t2;
        this.f25999b = null;
        return t2;
    }
}
