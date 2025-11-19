package l8;

/* compiled from: Absent.java */
/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3908a<T> extends l<T> {

    /* renamed from: B, reason: collision with root package name */
    static final C3908a<Object> f44422B = new C3908a<>();

    private C3908a() {
    }

    static <T> l<T> f() {
        return f44422B;
    }

    @Override // l8.l
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // l8.l
    public boolean c() {
        return false;
    }

    @Override // l8.l
    public T e(T t10) {
        return (T) m.m(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
