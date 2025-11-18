package kotlin.reflect.p371y.internal.p374j0.p415l.p421y1;

import kotlin.jvm.internal.C9801m;

/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.f0.y.e.j0.l.y1.a */
/* loaded from: classes3.dex */
public final class C10460a<T> {

    /* renamed from: a */
    private final T f40388a;

    /* renamed from: b */
    private final T f40389b;

    public C10460a(T t, T t2) {
        this.f40388a = t;
        this.f40389b = t2;
    }

    /* renamed from: a */
    public final T m37163a() {
        return this.f40388a;
    }

    /* renamed from: b */
    public final T m37164b() {
        return this.f40389b;
    }

    /* renamed from: c */
    public final T m37165c() {
        return this.f40388a;
    }

    /* renamed from: d */
    public final T m37166d() {
        return this.f40389b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10460a)) {
            return false;
        }
        C10460a c10460a = (C10460a) obj;
        return C9801m.m32341a(this.f40388a, c10460a.f40388a) && C9801m.m32341a(this.f40389b, c10460a.f40389b);
    }

    public int hashCode() {
        T t = this.f40388a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f40389b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f40388a + ", upper=" + this.f40389b + ')';
    }
}
