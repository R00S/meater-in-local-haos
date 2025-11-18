package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2704y0 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile N0 f34720a;

    /* renamed from: b, reason: collision with root package name */
    private volatile P f34721b;

    public final int a() {
        if (this.f34721b != null) {
            return ((N) this.f34721b).f34500D.length;
        }
        if (this.f34720a != null) {
            return this.f34720a.b();
        }
        return 0;
    }

    public final P b() {
        if (this.f34721b != null) {
            return this.f34721b;
        }
        synchronized (this) {
            try {
                if (this.f34721b != null) {
                    return this.f34721b;
                }
                if (this.f34720a == null) {
                    this.f34721b = P.f34503C;
                } else {
                    this.f34721b = this.f34720a.d();
                }
                return this.f34721b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final N0 c(N0 n02) {
        N0 n03 = this.f34720a;
        this.f34721b = null;
        this.f34720a = n02;
        return n03;
    }

    protected final void d(N0 n02) {
        if (this.f34720a != null) {
            return;
        }
        synchronized (this) {
            if (this.f34720a != null) {
                return;
            }
            try {
                this.f34720a = n02;
                this.f34721b = P.f34503C;
            } catch (zzcx unused) {
                this.f34720a = n02;
                this.f34721b = P.f34503C;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2704y0)) {
            return false;
        }
        C2704y0 c2704y0 = (C2704y0) obj;
        N0 n02 = this.f34720a;
        N0 n03 = c2704y0.f34720a;
        if (n02 == null && n03 == null) {
            return b().equals(c2704y0.b());
        }
        if (n02 != null && n03 != null) {
            return n02.equals(n03);
        }
        if (n02 != null) {
            c2704y0.d(n02.n());
            return n02.equals(c2704y0.f34720a);
        }
        d(n03.n());
        return this.f34720a.equals(n03);
    }

    public int hashCode() {
        return 1;
    }
}
