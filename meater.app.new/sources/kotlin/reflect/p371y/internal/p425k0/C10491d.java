package kotlin.reflect.p371y.internal.p425k0;

/* compiled from: IntTreePMap.java */
/* renamed from: kotlin.f0.y.e.k0.d */
/* loaded from: classes3.dex */
final class C10491d<V> {

    /* renamed from: a */
    private static final C10491d<Object> f40516a = new C10491d<>(C10490c.f40510a);

    /* renamed from: b */
    private final C10490c<V> f40517b;

    private C10491d(C10490c<V> c10490c) {
        this.f40517b = c10490c;
    }

    /* renamed from: a */
    public static <V> C10491d<V> m37256a() {
        return (C10491d<V>) f40516a;
    }

    /* renamed from: d */
    private C10491d<V> m37257d(C10490c<V> c10490c) {
        return c10490c == this.f40517b ? this : new C10491d<>(c10490c);
    }

    /* renamed from: b */
    public V m37258b(int i2) {
        return this.f40517b.m37254a(i2);
    }

    /* renamed from: c */
    public C10491d<V> m37259c(int i2, V v) {
        return m37257d(this.f40517b.m37255b(i2, v));
    }
}
