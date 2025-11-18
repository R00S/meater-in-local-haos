package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.gw */
/* loaded from: classes2.dex */
final class C6725gw {

    /* renamed from: a */
    private static final C6725gw f18995a = new C6725gw();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, InterfaceC6910lw<?>> f18997c = new ConcurrentHashMap();

    /* renamed from: b */
    private final InterfaceC6947mw f18996b = new C7057pv();

    private C6725gw() {
    }

    /* renamed from: b */
    public static C6725gw m15176b() {
        return f18995a;
    }

    /* renamed from: a */
    public final <T> InterfaceC6910lw<T> m15177a(T t) {
        return m15178c(t.getClass());
    }

    /* renamed from: c */
    public final <T> InterfaceC6910lw<T> m15178c(Class<T> cls) {
        zzdod.m19743d(cls, "messageType");
        InterfaceC6910lw<T> interfaceC6910lw = (InterfaceC6910lw) this.f18997c.get(cls);
        if (interfaceC6910lw != null) {
            return interfaceC6910lw;
        }
        InterfaceC6910lw<T> interfaceC6910lwMo15574a = this.f18996b.mo15574a(cls);
        zzdod.m19743d(cls, "messageType");
        zzdod.m19743d(interfaceC6910lwMo15574a, "schema");
        InterfaceC6910lw<T> interfaceC6910lw2 = (InterfaceC6910lw) this.f18997c.putIfAbsent(cls, interfaceC6910lwMo15574a);
        return interfaceC6910lw2 != null ? interfaceC6910lw2 : interfaceC6910lwMo15574a;
    }
}
