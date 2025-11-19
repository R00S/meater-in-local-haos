package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes2.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f39221c = new b0();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f0<?>> f39223b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f39222a = new H();

    private b0() {
    }

    public static b0 a() {
        return f39221c;
    }

    public f0<?> b(Class<?> cls, f0<?> f0Var) {
        C2964y.b(cls, "messageType");
        C2964y.b(f0Var, "schema");
        return this.f39223b.putIfAbsent(cls, f0Var);
    }

    public <T> f0<T> c(Class<T> cls) {
        C2964y.b(cls, "messageType");
        f0<T> f0Var = (f0) this.f39223b.get(cls);
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarA = this.f39222a.a(cls);
        f0<T> f0Var2 = (f0<T>) b(cls, f0VarA);
        return f0Var2 != null ? f0Var2 : f0VarA;
    }

    public <T> f0<T> d(T t10) {
        return c(t10.getClass());
    }
}
