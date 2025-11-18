package m8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import m8.AbstractC4007w;

/* compiled from: ImmutableMap.java */
/* renamed from: m8.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4010z<K, V> implements Map<K, V>, Serializable {

    /* renamed from: E, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f45384E = new Map.Entry[0];

    /* renamed from: B, reason: collision with root package name */
    private transient AbstractC3979B<Map.Entry<K, V>> f45385B;

    /* renamed from: C, reason: collision with root package name */
    private transient AbstractC3979B<K> f45386C;

    /* renamed from: D, reason: collision with root package name */
    private transient AbstractC4007w<V> f45387D;

    /* compiled from: ImmutableMap.java */
    /* renamed from: m8.z$a */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Comparator<? super V> f45388a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f45389b;

        /* renamed from: c, reason: collision with root package name */
        int f45390c;

        /* renamed from: d, reason: collision with root package name */
        boolean f45391d;

        /* renamed from: e, reason: collision with root package name */
        C0613a f45392e;

        /* compiled from: ImmutableMap.java */
        /* renamed from: m8.z$a$a, reason: collision with other inner class name */
        static final class C0613a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f45393a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f45394b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f45395c;

            C0613a(Object obj, Object obj2, Object obj3) {
                this.f45393a = obj;
                this.f45394b = obj2;
                this.f45395c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f45393a + "=" + this.f45394b + " and " + this.f45393a + "=" + this.f45395c);
            }
        }

        public a() {
            this(4);
        }

        private AbstractC4010z<K, V> b(boolean z10) {
            Object[] objArrF;
            C0613a c0613a;
            C0613a c0613a2;
            if (z10 && (c0613a2 = this.f45392e) != null) {
                throw c0613a2.a();
            }
            int length = this.f45390c;
            if (this.f45388a == null) {
                objArrF = this.f45389b;
            } else {
                if (this.f45391d) {
                    this.f45389b = Arrays.copyOf(this.f45389b, length * 2);
                }
                objArrF = this.f45389b;
                if (!z10) {
                    objArrF = f(objArrF, this.f45390c);
                    if (objArrF.length < this.f45389b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f45388a);
            }
            this.f45391d = true;
            X xN = X.n(length, objArrF, this);
            if (!z10 || (c0613a = this.f45392e) == null) {
                return xN;
            }
            throw c0613a.a();
        }

        private void e(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f45389b;
            if (i11 > objArr.length) {
                this.f45389b = Arrays.copyOf(objArr, AbstractC4007w.b.c(objArr.length, i11));
                this.f45391d = false;
            }
        }

        private Object[] f(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void k(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, U.b(comparator).f(L.m()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public AbstractC4010z<K, V> a() {
            return d();
        }

        public AbstractC4010z<K, V> c() {
            return b(false);
        }

        public AbstractC4010z<K, V> d() {
            return b(true);
        }

        public a<K, V> g(K k10, V v10) {
            e(this.f45390c + 1);
            C3994i.a(k10, v10);
            Object[] objArr = this.f45389b;
            int i10 = this.f45390c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f45390c = i10 + 1;
            return this;
        }

        public a<K, V> h(Map.Entry<? extends K, ? extends V> entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public a<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                e(this.f45390c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            return this;
        }

        public a<K, V> j(Map<? extends K, ? extends V> map) {
            return i(map.entrySet());
        }

        a(int i10) {
            this.f45389b = new Object[i10 * 2];
            this.f45390c = 0;
            this.f45391d = false;
        }
    }

    AbstractC4010z() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> AbstractC4010z<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.a();
    }

    public static <K, V> AbstractC4010z<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC4010z) && !(map instanceof SortedMap)) {
            AbstractC4010z<K, V> abstractC4010z = (AbstractC4010z) map;
            if (!abstractC4010z.j()) {
                return abstractC4010z;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> AbstractC4010z<K, V> l() {
        return (AbstractC4010z<K, V>) X.f45249I;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC3979B<Map.Entry<K, V>> d();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return L.c(this, obj);
    }

    abstract AbstractC3979B<K> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    abstract AbstractC4007w<V> h();

    @Override // java.util.Map
    public int hashCode() {
        return d0.d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC3979B<Map.Entry<K, V>> entrySet() {
        AbstractC3979B<Map.Entry<K, V>> abstractC3979B = this.f45385B;
        if (abstractC3979B != null) {
            return abstractC3979B;
        }
        AbstractC3979B<Map.Entry<K, V>> abstractC3979BD = d();
        this.f45385B = abstractC3979BD;
        return abstractC3979BD;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract boolean j();

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC3979B<K> keySet() {
        AbstractC3979B<K> abstractC3979B = this.f45386C;
        if (abstractC3979B != null) {
            return abstractC3979B;
        }
        AbstractC3979B<K> abstractC3979BG = g();
        this.f45386C = abstractC3979BG;
        return abstractC3979BG;
    }

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC4007w<V> values() {
        AbstractC4007w<V> abstractC4007w = this.f45387D;
        if (abstractC4007w != null) {
            return abstractC4007w;
        }
        AbstractC4007w<V> abstractC4007wH = h();
        this.f45387D = abstractC4007wH;
        return abstractC4007wH;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return L.l(this);
    }
}
