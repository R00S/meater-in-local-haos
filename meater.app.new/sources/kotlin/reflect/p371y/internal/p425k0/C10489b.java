package kotlin.reflect.p371y.internal.p425k0;

/* compiled from: HashPMap.java */
/* renamed from: kotlin.f0.y.e.k0.b */
/* loaded from: classes3.dex */
public final class C10489b<K, V> {

    /* renamed from: a */
    private static final C10489b<Object, Object> f40507a = new C10489b<>(C10491d.m37256a(), 0);

    /* renamed from: b */
    private final C10491d<C10488a<C10492e<K, V>>> f40508b;

    /* renamed from: c */
    private final int f40509c;

    private C10489b(C10491d<C10488a<C10492e<K, V>>> c10491d, int i2) {
        this.f40508b = c10491d;
        this.f40509c = i2;
    }

    /* renamed from: a */
    private static /* synthetic */ void m37245a(int i2) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i2 != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    /* renamed from: b */
    public static <K, V> C10489b<K, V> m37246b() {
        C10489b<K, V> c10489b = (C10489b<K, V>) f40507a;
        if (c10489b == null) {
            m37245a(0);
        }
        return c10489b;
    }

    /* renamed from: d */
    private C10488a<C10492e<K, V>> m37247d(int i2) {
        C10488a<C10492e<K, V>> c10488aM37258b = this.f40508b.m37258b(i2);
        return c10488aM37258b == null ? C10488a.m37239f() : c10488aM37258b;
    }

    /* renamed from: e */
    private static <K, V> int m37248e(C10488a<C10492e<K, V>> c10488a, Object obj) {
        int i2 = 0;
        while (c10488a != null && c10488a.size() > 0) {
            if (c10488a.f40503g.f40518f.equals(obj)) {
                return i2;
            }
            c10488a = c10488a.f40504h;
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public V m37249c(Object obj) {
        for (C10488a c10488aM37247d = m37247d(obj.hashCode()); c10488aM37247d != null && c10488aM37247d.size() > 0; c10488aM37247d = c10488aM37247d.f40504h) {
            C10492e c10492e = (C10492e) c10488aM37247d.f40503g;
            if (c10492e.f40518f.equals(obj)) {
                return c10492e.f40519g;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C10489b<K, V> m37250f(K k2, V v) {
        C10488a<C10492e<K, V>> c10488aM37247d = m37247d(k2.hashCode());
        int size = c10488aM37247d.size();
        int iM37248e = m37248e(c10488aM37247d, k2);
        if (iM37248e != -1) {
            c10488aM37247d = c10488aM37247d.m37243h(iM37248e);
        }
        C10488a<C10492e<K, V>> c10488aM37244n = c10488aM37247d.m37244n(new C10492e<>(k2, v));
        return new C10489b<>(this.f40508b.m37259c(k2.hashCode(), c10488aM37244n), (this.f40509c - size) + c10488aM37244n.size());
    }
}
