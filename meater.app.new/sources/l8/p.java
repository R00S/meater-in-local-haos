package l8;

/* compiled from: Present.java */
/* loaded from: classes2.dex */
final class p<T> extends l<T> {

    /* renamed from: B, reason: collision with root package name */
    private final T f44454B;

    p(T t10) {
        this.f44454B = t10;
    }

    @Override // l8.l
    public T b() {
        return this.f44454B;
    }

    @Override // l8.l
    public boolean c() {
        return true;
    }

    @Override // l8.l
    public T e(T t10) {
        m.m(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f44454B;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f44454B.equals(((p) obj).f44454B);
        }
        return false;
    }

    public int hashCode() {
        return this.f44454B.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f44454B + ")";
    }
}
