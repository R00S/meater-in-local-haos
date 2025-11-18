package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdth<T> implements zzdte<T>, zzdtu<T> {

    /* renamed from: a */
    private static final Object f25984a = new Object();

    /* renamed from: b */
    private volatile zzdtu<T> f25985b;

    /* renamed from: c */
    private volatile Object f25986c = f25984a;

    private zzdth(zzdtu<T> zzdtuVar) {
        this.f25985b = zzdtuVar;
    }

    /* renamed from: a */
    public static <P extends zzdtu<T>, T> zzdtu<T> m19867a(P p) {
        zzdto.m19873a(p);
        return p instanceof zzdth ? p : new zzdth(p);
    }

    /* renamed from: b */
    public static <P extends zzdtu<T>, T> zzdte<T> m19868b(P p) {
        return p instanceof zzdte ? (zzdte) p : new zzdth((zzdtu) zzdto.m19873a(p));
    }

    @Override // com.google.android.gms.internal.ads.zzdte, com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        T t = (T) this.f25986c;
        Object obj = f25984a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f25986c;
                if (t == obj) {
                    t = this.f25985b.get();
                    Object obj2 = this.f25986c;
                    if (((obj2 == obj || (obj2 instanceof zzdtn)) ? false : true) && obj2 != t) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f25986c = t;
                    this.f25985b = null;
                }
            }
        }
        return t;
    }
}
