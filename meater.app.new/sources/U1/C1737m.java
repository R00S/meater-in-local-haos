package U1;

import X1.C1804a;

/* compiled from: DeviceInfo.java */
/* renamed from: U1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737m {

    /* renamed from: e, reason: collision with root package name */
    public static final C1737m f17074e = new b(0).e();

    /* renamed from: f, reason: collision with root package name */
    private static final String f17075f = X1.L.B0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f17076g = X1.L.B0(1);

    /* renamed from: h, reason: collision with root package name */
    private static final String f17077h = X1.L.B0(2);

    /* renamed from: i, reason: collision with root package name */
    private static final String f17078i = X1.L.B0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f17079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17081c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17082d;

    /* compiled from: DeviceInfo.java */
    /* renamed from: U1.m$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f17083a;

        /* renamed from: b, reason: collision with root package name */
        private int f17084b;

        /* renamed from: c, reason: collision with root package name */
        private int f17085c;

        /* renamed from: d, reason: collision with root package name */
        private String f17086d;

        public b(int i10) {
            this.f17083a = i10;
        }

        public C1737m e() {
            C1804a.a(this.f17084b <= this.f17085c);
            return new C1737m(this);
        }

        public b f(int i10) {
            this.f17085c = i10;
            return this;
        }

        public b g(int i10) {
            this.f17084b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737m)) {
            return false;
        }
        C1737m c1737m = (C1737m) obj;
        return this.f17079a == c1737m.f17079a && this.f17080b == c1737m.f17080b && this.f17081c == c1737m.f17081c && X1.L.d(this.f17082d, c1737m.f17082d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f17079a) * 31) + this.f17080b) * 31) + this.f17081c) * 31;
        String str = this.f17082d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    private C1737m(b bVar) {
        this.f17079a = bVar.f17083a;
        this.f17080b = bVar.f17084b;
        this.f17081c = bVar.f17085c;
        this.f17082d = bVar.f17086d;
    }
}
