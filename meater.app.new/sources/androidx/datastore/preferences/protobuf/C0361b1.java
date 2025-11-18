package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* renamed from: androidx.datastore.preferences.protobuf.b1 */
/* loaded from: classes.dex */
final class C0361b1 {

    /* renamed from: a */
    private static final C0361b1 f2696a = new C0361b1();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, InterfaceC0373f1<?>> f2698c = new ConcurrentHashMap();

    /* renamed from: b */
    private final InterfaceC0376g1 f2697b = new C0381i0();

    private C0361b1() {
    }

    /* renamed from: a */
    public static C0361b1 m2578a() {
        return f2696a;
    }

    /* renamed from: b */
    public <T> void m2579b(T t, InterfaceC0370e1 interfaceC0370e1, C0401p c0401p) throws IOException {
        m2582e(t).mo2696e(t, interfaceC0370e1, c0401p);
    }

    /* renamed from: c */
    public InterfaceC0373f1<?> m2580c(Class<?> cls, InterfaceC0373f1<?> interfaceC0373f1) {
        C0357a0.m2557b(cls, "messageType");
        C0357a0.m2557b(interfaceC0373f1, "schema");
        return this.f2698c.putIfAbsent(cls, interfaceC0373f1);
    }

    /* renamed from: d */
    public <T> InterfaceC0373f1<T> m2581d(Class<T> cls) {
        C0357a0.m2557b(cls, "messageType");
        InterfaceC0373f1<T> interfaceC0373f1 = (InterfaceC0373f1) this.f2698c.get(cls);
        if (interfaceC0373f1 != null) {
            return interfaceC0373f1;
        }
        InterfaceC0373f1<T> interfaceC0373f1Mo2709a = this.f2697b.mo2709a(cls);
        InterfaceC0373f1<T> interfaceC0373f12 = (InterfaceC0373f1<T>) m2580c(cls, interfaceC0373f1Mo2709a);
        return interfaceC0373f12 != null ? interfaceC0373f12 : interfaceC0373f1Mo2709a;
    }

    /* renamed from: e */
    public <T> InterfaceC0373f1<T> m2582e(T t) {
        return m2581d(t.getClass());
    }
}
