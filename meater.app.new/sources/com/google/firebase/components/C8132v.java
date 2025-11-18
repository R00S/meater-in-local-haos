package com.google.firebase.components;

/* compiled from: Dependency.java */
/* renamed from: com.google.firebase.components.v */
/* loaded from: classes2.dex */
public final class C8132v {

    /* renamed from: a */
    private final C8111b0<?> f30737a;

    /* renamed from: b */
    private final int f30738b;

    /* renamed from: c */
    private final int f30739c;

    private C8132v(Class<?> cls, int i2, int i3) {
        this((C8111b0<?>) C8111b0.m24972b(cls), i2, i3);
    }

    /* renamed from: a */
    public static C8132v m25055a(Class<?> cls) {
        return new C8132v(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m25056b(int i2) {
        if (i2 == 0) {
            return "direct";
        }
        if (i2 == 1) {
            return "provider";
        }
        if (i2 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i2);
    }

    @Deprecated
    /* renamed from: h */
    public static C8132v m25057h(Class<?> cls) {
        return new C8132v(cls, 0, 0);
    }

    /* renamed from: i */
    public static C8132v m25058i(Class<?> cls) {
        return new C8132v(cls, 0, 1);
    }

    /* renamed from: j */
    public static C8132v m25059j(C8111b0<?> c8111b0) {
        return new C8132v(c8111b0, 1, 0);
    }

    /* renamed from: k */
    public static C8132v m25060k(Class<?> cls) {
        return new C8132v(cls, 1, 0);
    }

    /* renamed from: l */
    public static C8132v m25061l(C8111b0<?> c8111b0) {
        return new C8132v(c8111b0, 1, 1);
    }

    /* renamed from: m */
    public static C8132v m25062m(Class<?> cls) {
        return new C8132v(cls, 1, 1);
    }

    /* renamed from: n */
    public static C8132v m25063n(Class<?> cls) {
        return new C8132v(cls, 2, 0);
    }

    /* renamed from: c */
    public C8111b0<?> m25064c() {
        return this.f30737a;
    }

    /* renamed from: d */
    public boolean m25065d() {
        return this.f30739c == 2;
    }

    /* renamed from: e */
    public boolean m25066e() {
        return this.f30739c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8132v)) {
            return false;
        }
        C8132v c8132v = (C8132v) obj;
        return this.f30737a.equals(c8132v.f30737a) && this.f30738b == c8132v.f30738b && this.f30739c == c8132v.f30739c;
    }

    /* renamed from: f */
    public boolean m25067f() {
        return this.f30738b == 1;
    }

    /* renamed from: g */
    public boolean m25068g() {
        return this.f30738b == 2;
    }

    public int hashCode() {
        return ((((this.f30737a.hashCode() ^ 1000003) * 1000003) ^ this.f30738b) * 1000003) ^ this.f30739c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f30737a);
        sb.append(", type=");
        int i2 = this.f30738b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m25056b(this.f30739c));
        sb.append("}");
        return sb.toString();
    }

    private C8132v(C8111b0<?> c8111b0, int i2, int i3) {
        this.f30737a = (C8111b0) C8109a0.m24969c(c8111b0, "Null dependency anInterface.");
        this.f30738b = i2;
        this.f30739c = i3;
    }
}
