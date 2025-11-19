package Q3;

import r1.C4338e;

/* compiled from: MutablePair.java */
/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: a, reason: collision with root package name */
    T f14321a;

    /* renamed from: b, reason: collision with root package name */
    T f14322b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t10, T t11) {
        this.f14321a = t10;
        this.f14322b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4338e)) {
            return false;
        }
        C4338e c4338e = (C4338e) obj;
        return a(c4338e.f48339a, this.f14321a) && a(c4338e.f48340b, this.f14322b);
    }

    public int hashCode() {
        T t10 = this.f14321a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f14322b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f14321a + " " + this.f14322b + "}";
    }
}
