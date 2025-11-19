package nd;

import java.util.Objects;
import oc.C4178B;
import oc.C4180D;
import oc.E;
import oc.EnumC4177A;

/* compiled from: Response.java */
/* loaded from: classes3.dex */
public final class s<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C4180D f46022a;

    /* renamed from: b, reason: collision with root package name */
    private final T f46023b;

    /* renamed from: c, reason: collision with root package name */
    private final E f46024c;

    private s(C4180D c4180d, T t10, E e10) {
        this.f46022a = c4180d;
        this.f46023b = t10;
        this.f46024c = e10;
    }

    public static <T> s<T> c(E e10, C4180D c4180d) {
        Objects.requireNonNull(e10, "body == null");
        Objects.requireNonNull(c4180d, "rawResponse == null");
        if (c4180d.f1()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new s<>(c4180d, null, e10);
    }

    public static <T> s<T> h(T t10) {
        return i(t10, new C4180D.a().g(200).m("OK").p(EnumC4177A.HTTP_1_1).r(new C4178B.a().i("http://localhost/").b()).c());
    }

    public static <T> s<T> i(T t10, C4180D c4180d) {
        Objects.requireNonNull(c4180d, "rawResponse == null");
        if (c4180d.f1()) {
            return new s<>(c4180d, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f46023b;
    }

    public int b() {
        return this.f46022a.getCode();
    }

    public E d() {
        return this.f46024c;
    }

    public oc.u e() {
        return this.f46022a.getHeaders();
    }

    public boolean f() {
        return this.f46022a.f1();
    }

    public String g() {
        return this.f46022a.getMessage();
    }

    public String toString() {
        return this.f46022a.toString();
    }
}
