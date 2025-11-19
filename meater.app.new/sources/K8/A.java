package K8;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes2.dex */
public final class A<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f8730a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f8731b;

    /* compiled from: Qualified.java */
    private @interface a {
    }

    public A(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f8730a = cls;
        this.f8731b = cls2;
    }

    public static <T> A<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new A<>(cls, cls2);
    }

    public static <T> A<T> b(Class<T> cls) {
        return new A<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a10 = (A) obj;
        if (this.f8731b.equals(a10.f8731b)) {
            return this.f8730a.equals(a10.f8730a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f8731b.hashCode() * 31) + this.f8730a.hashCode();
    }

    public String toString() {
        if (this.f8730a == a.class) {
            return this.f8731b.getName();
        }
        return "@" + this.f8730a.getName() + " " + this.f8731b.getName();
    }
}
