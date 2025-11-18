package p024c.p052i.p059j;

/* compiled from: Pair.java */
/* renamed from: c.i.j.e */
/* loaded from: classes.dex */
public class C0955e<F, S> {

    /* renamed from: a */
    public final F f6405a;

    /* renamed from: b */
    public final S f6406b;

    public C0955e(F f2, S s) {
        this.f6405a = f2;
        this.f6406b = s;
    }

    /* renamed from: a */
    public static <A, B> C0955e<A, B> m6059a(A a, B b2) {
        return new C0955e<>(a, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0955e)) {
            return false;
        }
        C0955e c0955e = (C0955e) obj;
        return C0954d.m6056a(c0955e.f6405a, this.f6405a) && C0954d.m6056a(c0955e.f6406b, this.f6406b);
    }

    public int hashCode() {
        F f2 = this.f6405a;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f6406b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f6405a + " " + this.f6406b + "}";
    }
}
