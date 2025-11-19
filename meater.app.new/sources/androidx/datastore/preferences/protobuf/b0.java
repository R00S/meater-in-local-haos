package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f24899c = new b0();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f0<?>> f24901b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f24900a = new H();

    private b0() {
    }

    public static b0 a() {
        return f24899c;
    }

    public <T> void b(T t10, e0 e0Var, C2069o c2069o) {
        e(t10).h(t10, e0Var, c2069o);
    }

    public f0<?> c(Class<?> cls, f0<?> f0Var) {
        C2079z.b(cls, "messageType");
        C2079z.b(f0Var, "schema");
        return this.f24901b.putIfAbsent(cls, f0Var);
    }

    public <T> f0<T> d(Class<T> cls) {
        C2079z.b(cls, "messageType");
        f0<T> f0Var = (f0) this.f24901b.get(cls);
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarA = this.f24900a.a(cls);
        f0<T> f0Var2 = (f0<T>) c(cls, f0VarA);
        return f0Var2 != null ? f0Var2 : f0VarA;
    }

    public <T> f0<T> e(T t10) {
        return d(t10.getClass());
    }
}
