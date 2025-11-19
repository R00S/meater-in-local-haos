package X1;

/* compiled from: Size.java */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    public static final A f18608c = new A(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final A f18609d = new A(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f18610a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18611b;

    public A(int i10, int i11) {
        C1804a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f18610a = i10;
        this.f18611b = i11;
    }

    public int a() {
        return this.f18611b;
    }

    public int b() {
        return this.f18610a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f18610a == a10.f18610a && this.f18611b == a10.f18611b;
    }

    public int hashCode() {
        int i10 = this.f18611b;
        int i11 = this.f18610a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f18610a + "x" + this.f18611b;
    }
}
