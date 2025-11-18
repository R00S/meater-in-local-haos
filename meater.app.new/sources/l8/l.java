package l8;

import java.io.Serializable;

/* compiled from: Optional.java */
/* loaded from: classes2.dex */
public abstract class l<T> implements Serializable {
    l() {
    }

    public static <T> l<T> a() {
        return C3908a.f();
    }

    public static <T> l<T> d(T t10) {
        return new p(m.l(t10));
    }

    public abstract T b();

    public abstract boolean c();

    public abstract T e(T t10);
}
