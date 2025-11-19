package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.I;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes2.dex */
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

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public Object b(Object obj) {
        ((J) obj).m();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public I.a<?, ?> c(Object obj) {
        ((I) obj).c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public Map<?, ?> d(Object obj) {
        return (J) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public Object e(Object obj) {
        return J.g().o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public boolean g(Object obj) {
        return !((J) obj).l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public Map<?, ?> h(Object obj) {
        return (J) obj;
    }
}
