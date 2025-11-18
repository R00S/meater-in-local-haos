package Nb;

import kotlin.jvm.internal.C3862t;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes3.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f12589a;

    /* renamed from: b, reason: collision with root package name */
    private final T f12590b;

    public a(T t10, T t11) {
        this.f12589a = t10;
        this.f12590b = t11;
    }

    public final T a() {
        return this.f12589a;
    }

    public final T b() {
        return this.f12590b;
    }

    public final T c() {
        return this.f12589a;
    }

    public final T d() {
        return this.f12590b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C3862t.b(this.f12589a, aVar.f12589a) && C3862t.b(this.f12590b, aVar.f12590b);
    }

    public int hashCode() {
        T t10 = this.f12589a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f12590b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f12589a + ", upper=" + this.f12590b + ')';
    }
}
