package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l3 */
/* loaded from: classes2.dex */
final class C7543l3 {

    /* renamed from: a */
    private static final C7543l3 f27826a = new C7543l3();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, InterfaceC7567p3<?>> f27828c = new ConcurrentHashMap();

    /* renamed from: b */
    private final InterfaceC7585s3 f27827b = new C7602v2();

    private C7543l3() {
    }

    /* renamed from: a */
    public static C7543l3 m21234a() {
        return f27826a;
    }

    /* renamed from: b */
    public final <T> InterfaceC7567p3<T> m21235b(Class<T> cls) {
        zzff.m22291f(cls, "messageType");
        InterfaceC7567p3<T> interfaceC7567p3 = (InterfaceC7567p3) this.f27828c.get(cls);
        if (interfaceC7567p3 != null) {
            return interfaceC7567p3;
        }
        InterfaceC7567p3<T> interfaceC7567p3Mo21403a = this.f27827b.mo21403a(cls);
        zzff.m22291f(cls, "messageType");
        zzff.m22291f(interfaceC7567p3Mo21403a, "schema");
        InterfaceC7567p3<T> interfaceC7567p32 = (InterfaceC7567p3) this.f27828c.putIfAbsent(cls, interfaceC7567p3Mo21403a);
        return interfaceC7567p32 != null ? interfaceC7567p32 : interfaceC7567p3Mo21403a;
    }

    /* renamed from: c */
    public final <T> InterfaceC7567p3<T> m21236c(T t) {
        return m21235b(t.getClass());
    }
}
