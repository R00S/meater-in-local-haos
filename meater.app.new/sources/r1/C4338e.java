package r1;

/* compiled from: Pair.java */
/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4338e<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f48339a;

    /* renamed from: b, reason: collision with root package name */
    public final S f48340b;

    public boolean equals(Object obj) {
        if (!(obj instanceof C4338e)) {
            return false;
        }
        C4338e c4338e = (C4338e) obj;
        return C4337d.a(c4338e.f48339a, this.f48339a) && C4337d.a(c4338e.f48340b, this.f48340b);
    }

    public int hashCode() {
        F f10 = this.f48339a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f48340b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f48339a + " " + this.f48340b + "}";
    }
}
