package com.google.protobuf;

import com.google.protobuf.r0;

/* compiled from: MapEntryLite.java */
/* loaded from: classes2.dex */
public class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f39176a;

    /* renamed from: b, reason: collision with root package name */
    private final K f39177b;

    /* renamed from: c, reason: collision with root package name */
    private final V f39178c;

    /* compiled from: MapEntryLite.java */
    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f39179a;

        /* renamed from: b, reason: collision with root package name */
        public final K f39180b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f39181c;

        /* renamed from: d, reason: collision with root package name */
        public final V f39182d;

        public a(r0.b bVar, K k10, r0.b bVar2, V v10) {
            this.f39179a = bVar;
            this.f39180b = k10;
            this.f39181c = bVar2;
            this.f39182d = v10;
        }
    }

    private I(r0.b bVar, K k10, r0.b bVar2, V v10) {
        this.f39176a = new a<>(bVar, k10, bVar2, v10);
        this.f39177b = k10;
        this.f39178c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C2958s.d(aVar.f39179a, 1, k10) + C2958s.d(aVar.f39181c, 2, v10);
    }

    public static <K, V> I<K, V> d(r0.b bVar, K k10, r0.b bVar2, V v10) {
        return new I<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) {
        C2958s.A(codedOutputStream, aVar.f39179a, 1, k10);
        C2958s.A(codedOutputStream, aVar.f39181c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.T(i10) + CodedOutputStream.C(b(this.f39176a, k10, v10));
    }

    a<K, V> c() {
        return this.f39176a;
    }
}
