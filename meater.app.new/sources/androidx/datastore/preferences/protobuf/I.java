package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f24857a;

    /* renamed from: b, reason: collision with root package name */
    private final K f24858b;

    /* renamed from: c, reason: collision with root package name */
    private final V f24859c;

    /* compiled from: MapEntryLite.java */
    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f24860a;

        /* renamed from: b, reason: collision with root package name */
        public final K f24861b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f24862c;

        /* renamed from: d, reason: collision with root package name */
        public final V f24863d;

        public a(r0.b bVar, K k10, r0.b bVar2, V v10) {
            this.f24860a = bVar;
            this.f24861b = k10;
            this.f24862c = bVar2;
            this.f24863d = v10;
        }
    }

    private I(r0.b bVar, K k10, r0.b bVar2, V v10) {
        this.f24857a = new a<>(bVar, k10, bVar2, v10);
        this.f24858b = k10;
        this.f24859c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C2073t.d(aVar.f24860a, 1, k10) + C2073t.d(aVar.f24862c, 2, v10);
    }

    public static <K, V> I<K, V> d(r0.b bVar, K k10, r0.b bVar2, V v10) {
        return new I<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) {
        C2073t.z(codedOutputStream, aVar.f24860a, 1, k10);
        C2073t.z(codedOutputStream, aVar.f24862c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.V(i10) + CodedOutputStream.C(b(this.f24857a, k10, v10));
    }

    a<K, V> c() {
        return this.f24857a;
    }
}
