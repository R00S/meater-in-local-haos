package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes2.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f37779c = new b0();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f0<?>> f37781b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f37780a = new H();

    private b0() {
    }

    public static b0 a() {
        return f37779c;
    }

    public f0<?> b(Class<?> cls, f0<?> f0Var) {
        C2915z.b(cls, "messageType");
        C2915z.b(f0Var, "schema");
        return this.f37781b.putIfAbsent(cls, f0Var);
    }

    public <T> f0<T> c(Class<T> cls) {
        C2915z.b(cls, "messageType");
        f0<T> f0Var = (f0) this.f37781b.get(cls);
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarA = this.f37780a.a(cls);
        f0<T> f0Var2 = (f0<T>) b(cls, f0VarA);
        return f0Var2 != null ? f0Var2 : f0VarA;
    }

    public <T> f0<T> d(T t10) {
        return c(t10.getClass());
    }
}
