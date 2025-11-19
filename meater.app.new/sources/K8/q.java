package K8;

/* compiled from: Dependency.java */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final A<?> f8787a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8788b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8789c;

    private q(Class<?> cls, int i10, int i11) {
        this((A<?>) A.b(cls), i10, i11);
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(A<?> a10) {
        return new q(a10, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q k(A<?> a10) {
        return new q(a10, 1, 0);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q m(A<?> a10) {
        return new q(a10, 1, 1);
    }

    public static q n(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public A<?> c() {
        return this.f8787a;
    }

    public boolean d() {
        return this.f8789c == 2;
    }

    public boolean e() {
        return this.f8789c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f8787a.equals(qVar.f8787a) && this.f8788b == qVar.f8788b && this.f8789c == qVar.f8789c;
    }

    public boolean f() {
        return this.f8788b == 1;
    }

    public boolean g() {
        return this.f8788b == 2;
    }

    public int hashCode() {
        return ((((this.f8787a.hashCode() ^ 1000003) * 1000003) ^ this.f8788b) * 1000003) ^ this.f8789c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f8787a);
        sb2.append(", type=");
        int i10 = this.f8788b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f8789c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(A<?> a10, int i10, int i11) {
        this.f8787a = (A) z.c(a10, "Null dependency anInterface.");
        this.f8788b = i10;
        this.f8789c = i11;
    }
}
