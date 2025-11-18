package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0409r1;
import java.io.IOException;

/* compiled from: MapEntryLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.j0 */
/* loaded from: classes.dex */
public class C0384j0<K, V> {

    /* renamed from: a */
    private final a<K, V> f2800a;

    /* renamed from: b */
    private final K f2801b;

    /* renamed from: c */
    private final V f2802c;

    /* compiled from: MapEntryLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j0$a */
    static class a<K, V> {

        /* renamed from: a */
        public final C0409r1.b f2803a;

        /* renamed from: b */
        public final K f2804b;

        /* renamed from: c */
        public final C0409r1.b f2805c;

        /* renamed from: d */
        public final V f2806d;

        public a(C0409r1.b bVar, K k2, C0409r1.b bVar2, V v) {
            this.f2803a = bVar;
            this.f2804b = k2;
            this.f2805c = bVar2;
            this.f2806d = v;
        }
    }

    private C0384j0(C0409r1.b bVar, K k2, C0409r1.b bVar2, V v) {
        this.f2800a = new a<>(bVar, k2, bVar2, v);
        this.f2801b = k2;
        this.f2802c = v;
    }

    /* renamed from: b */
    static <K, V> int m2911b(a<K, V> aVar, K k2, V v) {
        return C0415u.m3275d(aVar.f2803a, 1, k2) + C0415u.m3275d(aVar.f2805c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C0384j0<K, V> m2912d(C0409r1.b bVar, K k2, C0409r1.b bVar2, V v) {
        return new C0384j0<>(bVar, k2, bVar2, v);
    }

    /* renamed from: e */
    static <K, V> void m2913e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k2, V v) throws IOException {
        C0415u.m3286z(codedOutputStream, aVar.f2803a, 1, k2);
        C0415u.m3286z(codedOutputStream, aVar.f2805c, 2, v);
    }

    /* renamed from: a */
    public int m2914a(int i2, K k2, V v) {
        return CodedOutputStream.m2432V(i2) + CodedOutputStream.m2413C(m2911b(this.f2800a, k2, v));
    }

    /* renamed from: c */
    a<K, V> m2915c() {
        return this.f2800a;
    }
}
