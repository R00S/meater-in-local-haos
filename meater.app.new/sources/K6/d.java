package K6;

import com.google.auto.value.AutoValue;

/* compiled from: Event.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class d<T> {
    public static <T> d<T> f(T t10) {
        return new a(null, t10, f.DEFAULT, null, null);
    }

    public static <T> d<T> g(T t10, g gVar) {
        return new a(null, t10, f.DEFAULT, gVar, null);
    }

    public static <T> d<T> h(T t10) {
        return new a(null, t10, f.HIGHEST, null, null);
    }

    public abstract Integer a();

    public abstract e b();

    public abstract T c();

    public abstract f d();

    public abstract g e();
}
