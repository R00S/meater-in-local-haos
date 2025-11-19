package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
class L implements K {
    L() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        J j10 = (J) obj;
        I i11 = (I) obj2;
        int iA = 0;
        if (j10.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : j10.entrySet()) {
            iA += i11.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> J<K, V> j(Object obj, Object obj2) {
        J<K, V> jO = (J) obj;
        J<K, V> j10 = (J) obj2;
        if (!j10.isEmpty()) {
            if (!jO.l()) {
                jO = jO.o();
            }
            jO.n(j10);
        }
        return jO;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object b(Object obj) {
        ((J) obj).m();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public I.a<?, ?> c(Object obj) {
        return ((I) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map<?, ?> d(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object e(Object obj) {
        return J.g().o();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public boolean g(Object obj) {
        return !((J) obj).l();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map<?, ?> h(Object obj) {
        return (J) obj;
    }
}
