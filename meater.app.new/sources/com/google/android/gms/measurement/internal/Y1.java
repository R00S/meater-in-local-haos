package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class Y1<V> {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f35216g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f35217a;

    /* renamed from: b, reason: collision with root package name */
    private final X1<V> f35218b;

    /* renamed from: c, reason: collision with root package name */
    private final V f35219c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f35220d;

    /* renamed from: e, reason: collision with root package name */
    private volatile V f35221e;

    /* renamed from: f, reason: collision with root package name */
    private volatile V f35222f;

    public final V a(V v10) {
        synchronized (this.f35220d) {
        }
        if (v10 != null) {
            return v10;
        }
        if (W1.f35194a == null) {
            return this.f35219c;
        }
        synchronized (f35216g) {
            try {
                if (C2742f.a()) {
                    return this.f35222f == null ? this.f35219c : this.f35222f;
                }
                try {
                    for (Y1 y12 : K.f34959a) {
                        if (C2742f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V vA = null;
                        try {
                            X1<V> x12 = y12.f35218b;
                            if (x12 != null) {
                                vA = x12.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f35216g) {
                            y12.f35222f = vA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                X1<V> x13 = this.f35218b;
                if (x13 == null) {
                    return this.f35219c;
                }
                try {
                    return x13.a();
                } catch (IllegalStateException unused3) {
                    return this.f35219c;
                } catch (SecurityException unused4) {
                    return this.f35219c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f35217a;
    }

    private Y1(String str, V v10, V v11, X1<V> x12) {
        this.f35220d = new Object();
        this.f35221e = null;
        this.f35222f = null;
        this.f35217a = str;
        this.f35219c = v10;
        this.f35218b = x12;
    }
}
