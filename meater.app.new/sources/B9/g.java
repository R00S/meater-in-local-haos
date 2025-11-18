package B9;

import java.util.NoSuchElementException;

/* compiled from: Optional.java */
/* loaded from: classes2.dex */
public final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f1932a;

    private g() {
        this.f1932a = null;
    }

    public static <T> g<T> a() {
        return new g<>();
    }

    public static <T> g<T> b(T t10) {
        return t10 == null ? a() : e(t10);
    }

    public static <T> g<T> e(T t10) {
        return new g<>(t10);
    }

    public T c() {
        T t10 = this.f1932a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f1932a != null;
    }

    private g(T t10) {
        if (t10 != null) {
            this.f1932a = t10;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
