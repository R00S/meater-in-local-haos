package l8;

import java.io.Serializable;

/* compiled from: Equivalence.java */
/* renamed from: l8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3912e<T> {

    /* compiled from: Equivalence.java */
    /* renamed from: l8.e$a */
    static final class a extends AbstractC3912e<Object> implements Serializable {

        /* renamed from: B, reason: collision with root package name */
        static final a f44433B = new a();

        a() {
        }

        @Override // l8.AbstractC3912e
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // l8.AbstractC3912e
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: l8.e$b */
    static final class b extends AbstractC3912e<Object> implements Serializable {

        /* renamed from: B, reason: collision with root package name */
        static final b f44434B = new b();

        b() {
        }

        @Override // l8.AbstractC3912e
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // l8.AbstractC3912e
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected AbstractC3912e() {
    }

    public static AbstractC3912e<Object> c() {
        return a.f44433B;
    }

    public static AbstractC3912e<Object> f() {
        return b.f44434B;
    }

    protected abstract boolean a(T t10, T t11);

    protected abstract int b(T t10);

    public final boolean d(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final int e(T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }
}
