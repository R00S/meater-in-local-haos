package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0384j0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.m0 */
/* loaded from: classes.dex */
class C0393m0 implements InterfaceC0390l0 {
    C0393m0() {
    }

    /* renamed from: i */
    private static <K, V> int m3030i(int i2, Object obj, Object obj2) {
        C0387k0 c0387k0 = (C0387k0) obj;
        C0384j0 c0384j0 = (C0384j0) obj2;
        int iM2914a = 0;
        if (c0387k0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c0387k0.entrySet()) {
            iM2914a += c0384j0.m2914a(i2, entry.getKey(), entry.getValue());
        }
        return iM2914a;
    }

    /* renamed from: j */
    private static <K, V> C0387k0<K, V> m3031j(Object obj, Object obj2) {
        C0387k0<K, V> c0387k0M2937n = (C0387k0) obj;
        C0387k0<K, V> c0387k0 = (C0387k0) obj2;
        if (!c0387k0.isEmpty()) {
            if (!c0387k0M2937n.m2934k()) {
                c0387k0M2937n = c0387k0M2937n.m2937n();
            }
            c0387k0M2937n.m2936m(c0387k0);
        }
        return c0387k0M2937n;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: a */
    public Object mo2990a(Object obj, Object obj2) {
        return m3031j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: b */
    public Object mo2991b(Object obj) {
        ((C0387k0) obj).m2935l();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: c */
    public C0384j0.a<?, ?> mo2992c(Object obj) {
        return ((C0384j0) obj).m2915c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: d */
    public Map<?, ?> mo2993d(Object obj) {
        return (C0387k0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: e */
    public Object mo2994e(Object obj) {
        return C0387k0.m2930f().m2937n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: f */
    public int mo2995f(int i2, Object obj, Object obj2) {
        return m3030i(i2, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: g */
    public boolean mo2996g(Object obj) {
        return !((C0387k0) obj).m2934k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0390l0
    /* renamed from: h */
    public Map<?, ?> mo2997h(Object obj) {
        return (C0387k0) obj;
    }
}
