package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2628y5 {

    /* renamed from: c, reason: collision with root package name */
    private static final C2628y5 f34450c = new C2628y5();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, C5<?>> f34452b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final E5 f34451a = new Y4();

    private C2628y5() {
    }

    public static C2628y5 a() {
        return f34450c;
    }

    public final <T> C5<T> b(Class<T> cls) {
        I4.f(cls, "messageType");
        C5<T> c52 = (C5) this.f34452b.get(cls);
        if (c52 != null) {
            return c52;
        }
        C5<T> c5A = this.f34451a.a(cls);
        I4.f(cls, "messageType");
        I4.f(c5A, "schema");
        C5<T> c53 = (C5) this.f34452b.putIfAbsent(cls, c5A);
        return c53 != null ? c53 : c5A;
    }

    public final <T> C5<T> c(T t10) {
        return b(t10.getClass());
    }
}
