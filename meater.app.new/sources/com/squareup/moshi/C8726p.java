package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedHashTreeMap.java */
/* renamed from: com.squareup.moshi.p */
/* loaded from: classes2.dex */
final class C8726p<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f */
    private static final Comparator<Comparable> f33152f = new a();

    /* renamed from: g */
    final Comparator<? super K> f33153g;

    /* renamed from: h */
    g<K, V>[] f33154h;

    /* renamed from: i */
    final g<K, V> f33155i;

    /* renamed from: j */
    int f33156j;

    /* renamed from: k */
    int f33157k;

    /* renamed from: l */
    int f33158l;

    /* renamed from: m */
    private C8726p<K, V>.d f33159m;

    /* renamed from: n */
    private C8726p<K, V>.e f33160n;

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$a */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$b */
    static final class b<K, V> {

        /* renamed from: a */
        private g<K, V> f33161a;

        /* renamed from: b */
        private int f33162b;

        /* renamed from: c */
        private int f33163c;

        /* renamed from: d */
        private int f33164d;

        b() {
        }

        /* renamed from: a */
        void m27796a(g<K, V> gVar) {
            gVar.f33176h = null;
            gVar.f33174f = null;
            gVar.f33175g = null;
            gVar.f33182n = 1;
            int i2 = this.f33162b;
            if (i2 > 0) {
                int i3 = this.f33164d;
                if ((i3 & 1) == 0) {
                    this.f33164d = i3 + 1;
                    this.f33162b = i2 - 1;
                    this.f33163c++;
                }
            }
            gVar.f33174f = this.f33161a;
            this.f33161a = gVar;
            int i4 = this.f33164d + 1;
            this.f33164d = i4;
            int i5 = this.f33162b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f33164d = i4 + 1;
                this.f33162b = i5 - 1;
                this.f33163c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f33164d & i7) != i7) {
                    return;
                }
                int i8 = this.f33163c;
                if (i8 == 0) {
                    g<K, V> gVar2 = this.f33161a;
                    g<K, V> gVar3 = gVar2.f33174f;
                    g<K, V> gVar4 = gVar3.f33174f;
                    gVar3.f33174f = gVar4.f33174f;
                    this.f33161a = gVar3;
                    gVar3.f33175g = gVar4;
                    gVar3.f33176h = gVar2;
                    gVar3.f33182n = gVar2.f33182n + 1;
                    gVar4.f33174f = gVar3;
                    gVar2.f33174f = gVar3;
                } else if (i8 == 1) {
                    g<K, V> gVar5 = this.f33161a;
                    g<K, V> gVar6 = gVar5.f33174f;
                    this.f33161a = gVar6;
                    gVar6.f33176h = gVar5;
                    gVar6.f33182n = gVar5.f33182n + 1;
                    gVar5.f33174f = gVar6;
                    this.f33163c = 0;
                } else if (i8 == 2) {
                    this.f33163c = 0;
                }
                i6 *= 2;
            }
        }

        /* renamed from: b */
        void m27797b(int i2) {
            this.f33162b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.f33164d = 0;
            this.f33163c = 0;
            this.f33161a = null;
        }

        /* renamed from: c */
        g<K, V> m27798c() {
            g<K, V> gVar = this.f33161a;
            if (gVar.f33174f == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$c */
    static class c<K, V> {

        /* renamed from: a */
        private g<K, V> f33165a;

        c() {
        }

        /* renamed from: a */
        public g<K, V> m27799a() {
            g<K, V> gVar = this.f33165a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f33174f;
            gVar.f33174f = null;
            g<K, V> gVar3 = gVar.f33176h;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f33165a = gVar4;
                    return gVar;
                }
                gVar2.f33174f = gVar4;
                gVar3 = gVar2.f33175g;
            }
        }

        /* renamed from: b */
        void m27800b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f33174f = gVar2;
                gVar2 = gVar;
                gVar = gVar.f33175g;
            }
            this.f33165a = gVar2;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$d */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedHashTreeMap.java */
        /* renamed from: com.squareup.moshi.p$d$a */
        class a extends C8726p<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m27802b();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C8726p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C8726p.this.m27791e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarM27791e;
            if (!(obj instanceof Map.Entry) || (gVarM27791e = C8726p.this.m27791e((Map.Entry) obj)) == null) {
                return false;
            }
            C8726p.this.m27793i(gVarM27791e, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8726p.this.f33156j;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$e */
    final class e extends AbstractSet<K> {

        /* compiled from: LinkedHashTreeMap.java */
        /* renamed from: com.squareup.moshi.p$e$a */
        class a extends C8726p<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m27802b().f33179k;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C8726p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C8726p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C8726p.this.m27794j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8726p.this.f33156j;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$f */
    abstract class f<T> implements Iterator<T> {

        /* renamed from: f */
        g<K, V> f33170f;

        /* renamed from: g */
        g<K, V> f33171g = null;

        /* renamed from: h */
        int f33172h;

        f() {
            this.f33170f = C8726p.this.f33155i.f33177i;
            this.f33172h = C8726p.this.f33157k;
        }

        /* renamed from: b */
        final g<K, V> m27802b() {
            g<K, V> gVar = this.f33170f;
            C8726p c8726p = C8726p.this;
            if (gVar == c8726p.f33155i) {
                throw new NoSuchElementException();
            }
            if (c8726p.f33157k != this.f33172h) {
                throw new ConcurrentModificationException();
            }
            this.f33170f = gVar.f33177i;
            this.f33171g = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f33170f != C8726p.this.f33155i;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f33171g;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            C8726p.this.m27793i(gVar, true);
            this.f33171g = null;
            this.f33172h = C8726p.this.f33157k;
        }
    }

    C8726p() {
        this(null);
    }

    /* renamed from: a */
    private void m27782a() {
        g<K, V>[] gVarArrM27783b = m27783b(this.f33154h);
        this.f33154h = gVarArrM27783b;
        this.f33158l = (gVarArrM27783b.length / 2) + (gVarArrM27783b.length / 4);
    }

    /* renamed from: b */
    static <K, V> g<K, V>[] m27783b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i2 = 0; i2 < length; i2++) {
            g<K, V> gVar = gVarArr[i2];
            if (gVar != null) {
                cVar.m27800b(gVar);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    g<K, V> gVarM27799a = cVar.m27799a();
                    if (gVarM27799a == null) {
                        break;
                    }
                    if ((gVarM27799a.f33180l & length) == 0) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
                bVar.m27797b(i3);
                bVar2.m27797b(i4);
                cVar.m27800b(gVar);
                while (true) {
                    g<K, V> gVarM27799a2 = cVar.m27799a();
                    if (gVarM27799a2 == null) {
                        break;
                    }
                    if ((gVarM27799a2.f33180l & length) == 0) {
                        bVar.m27796a(gVarM27799a2);
                    } else {
                        bVar2.m27796a(gVarM27799a2);
                    }
                }
                gVarArr2[i2] = i3 > 0 ? bVar.m27798c() : null;
                gVarArr2[i2 + length] = i4 > 0 ? bVar2.m27798c() : null;
            }
        }
        return gVarArr2;
    }

    /* renamed from: c */
    private boolean m27784c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: h */
    private void m27785h(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f33175g;
            g<K, V> gVar3 = gVar.f33176h;
            int i2 = gVar2 != null ? gVar2.f33182n : 0;
            int i3 = gVar3 != null ? gVar3.f33182n : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                g<K, V> gVar4 = gVar3.f33175g;
                g<K, V> gVar5 = gVar3.f33176h;
                int i5 = (gVar4 != null ? gVar4.f33182n : 0) - (gVar5 != null ? gVar5.f33182n : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    m27788m(gVar3);
                }
                m27787l(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                g<K, V> gVar6 = gVar2.f33175g;
                g<K, V> gVar7 = gVar2.f33176h;
                int i6 = (gVar6 != null ? gVar6.f33182n : 0) - (gVar7 != null ? gVar7.f33182n : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    m27787l(gVar2);
                }
                m27788m(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f33182n = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f33182n = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f33174f;
        }
    }

    /* renamed from: k */
    private void m27786k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f33174f;
        gVar.f33174f = null;
        if (gVar2 != null) {
            gVar2.f33174f = gVar3;
        }
        if (gVar3 == null) {
            int i2 = gVar.f33180l;
            this.f33154h[i2 & (r0.length - 1)] = gVar2;
        } else if (gVar3.f33175g == gVar) {
            gVar3.f33175g = gVar2;
        } else {
            gVar3.f33176h = gVar2;
        }
    }

    /* renamed from: l */
    private void m27787l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f33175g;
        g<K, V> gVar3 = gVar.f33176h;
        g<K, V> gVar4 = gVar3.f33175g;
        g<K, V> gVar5 = gVar3.f33176h;
        gVar.f33176h = gVar4;
        if (gVar4 != null) {
            gVar4.f33174f = gVar;
        }
        m27786k(gVar, gVar3);
        gVar3.f33175g = gVar;
        gVar.f33174f = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f33182n : 0, gVar4 != null ? gVar4.f33182n : 0) + 1;
        gVar.f33182n = iMax;
        gVar3.f33182n = Math.max(iMax, gVar5 != null ? gVar5.f33182n : 0) + 1;
    }

    /* renamed from: m */
    private void m27788m(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f33175g;
        g<K, V> gVar3 = gVar.f33176h;
        g<K, V> gVar4 = gVar2.f33175g;
        g<K, V> gVar5 = gVar2.f33176h;
        gVar.f33175g = gVar5;
        if (gVar5 != null) {
            gVar5.f33174f = gVar;
        }
        m27786k(gVar, gVar2);
        gVar2.f33176h = gVar;
        gVar.f33174f = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f33182n : 0, gVar5 != null ? gVar5.f33182n : 0) + 1;
        gVar.f33182n = iMax;
        gVar2.f33182n = Math.max(iMax, gVar4 != null ? gVar4.f33182n : 0) + 1;
    }

    /* renamed from: n */
    private static int m27789n(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f33154h, (Object) null);
        this.f33156j = 0;
        this.f33157k++;
        g<K, V> gVar = this.f33155i;
        g<K, V> gVar2 = gVar.f33177i;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f33177i;
            gVar2.f33178j = null;
            gVar2.f33177i = null;
            gVar2 = gVar3;
        }
        gVar.f33178j = gVar;
        gVar.f33177i = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m27792f(obj) != null;
    }

    /* renamed from: d */
    g<K, V> m27790d(K k2, boolean z) {
        g<K, V> gVar;
        int i2;
        g<K, V> gVar2;
        Comparator<? super K> comparator = this.f33153g;
        g<K, V>[] gVarArr = this.f33154h;
        int iM27789n = m27789n(k2.hashCode());
        int length = (gVarArr.length - 1) & iM27789n;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f33152f ? (Comparable) k2 : null;
            while (true) {
                int iCompareTo = comparable != null ? comparable.compareTo(gVar3.f33179k) : comparator.compare(k2, gVar3.f33179k);
                if (iCompareTo == 0) {
                    return gVar3;
                }
                g<K, V> gVar4 = iCompareTo < 0 ? gVar3.f33175g : gVar3.f33176h;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i2 = iCompareTo;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        g<K, V> gVar5 = this.f33155i;
        if (gVar != null) {
            gVar2 = new g<>(gVar, k2, iM27789n, gVar5, gVar5.f33178j);
            if (i2 < 0) {
                gVar.f33175g = gVar2;
            } else {
                gVar.f33176h = gVar2;
            }
            m27785h(gVar, true);
        } else {
            if (comparator == f33152f && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            gVar2 = new g<>(gVar, k2, iM27789n, gVar5, gVar5.f33178j);
            gVarArr[length] = gVar2;
        }
        int i3 = this.f33156j;
        this.f33156j = i3 + 1;
        if (i3 > this.f33158l) {
            m27782a();
        }
        this.f33157k++;
        return gVar2;
    }

    /* renamed from: e */
    g<K, V> m27791e(Map.Entry<?, ?> entry) {
        g<K, V> gVarM27792f = m27792f(entry.getKey());
        if (gVarM27792f != null && m27784c(gVarM27792f.f33181m, entry.getValue())) {
            return gVarM27792f;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C8726p<K, V>.d dVar = this.f33159m;
        if (dVar != null) {
            return dVar;
        }
        C8726p<K, V>.d dVar2 = new d();
        this.f33159m = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    g<K, V> m27792f(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m27790d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarM27792f = m27792f(obj);
        if (gVarM27792f != null) {
            return gVarM27792f.f33181m;
        }
        return null;
    }

    /* renamed from: i */
    void m27793i(g<K, V> gVar, boolean z) {
        int i2;
        if (z) {
            g<K, V> gVar2 = gVar.f33178j;
            gVar2.f33177i = gVar.f33177i;
            gVar.f33177i.f33178j = gVar2;
            gVar.f33178j = null;
            gVar.f33177i = null;
        }
        g<K, V> gVar3 = gVar.f33175g;
        g<K, V> gVar4 = gVar.f33176h;
        g<K, V> gVar5 = gVar.f33174f;
        int i3 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m27786k(gVar, gVar3);
                gVar.f33175g = null;
            } else if (gVar4 != null) {
                m27786k(gVar, gVar4);
                gVar.f33176h = null;
            } else {
                m27786k(gVar, null);
            }
            m27785h(gVar5, false);
            this.f33156j--;
            this.f33157k++;
            return;
        }
        g<K, V> gVarM27804b = gVar3.f33182n > gVar4.f33182n ? gVar3.m27804b() : gVar4.m27803a();
        m27793i(gVarM27804b, false);
        g<K, V> gVar6 = gVar.f33175g;
        if (gVar6 != null) {
            i2 = gVar6.f33182n;
            gVarM27804b.f33175g = gVar6;
            gVar6.f33174f = gVarM27804b;
            gVar.f33175g = null;
        } else {
            i2 = 0;
        }
        g<K, V> gVar7 = gVar.f33176h;
        if (gVar7 != null) {
            i3 = gVar7.f33182n;
            gVarM27804b.f33176h = gVar7;
            gVar7.f33174f = gVarM27804b;
            gVar.f33176h = null;
        }
        gVarM27804b.f33182n = Math.max(i2, i3) + 1;
        m27786k(gVar, gVarM27804b);
    }

    /* renamed from: j */
    g<K, V> m27794j(Object obj) {
        g<K, V> gVarM27792f = m27792f(obj);
        if (gVarM27792f != null) {
            m27793i(gVarM27792f, true);
        }
        return gVarM27792f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C8726p<K, V>.e eVar = this.f33160n;
        if (eVar != null) {
            return eVar;
        }
        C8726p<K, V>.e eVar2 = new e();
        this.f33160n = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarM27790d = m27790d(k2, true);
        V v2 = gVarM27790d.f33181m;
        gVarM27790d.f33181m = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarM27794j = m27794j(obj);
        if (gVarM27794j != null) {
            return gVarM27794j.f33181m;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f33156j;
    }

    C8726p(Comparator<? super K> comparator) {
        this.f33156j = 0;
        this.f33157k = 0;
        this.f33153g = comparator == null ? f33152f : comparator;
        this.f33155i = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f33154h = gVarArr;
        this.f33158l = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.p$g */
    static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        g<K, V> f33174f;

        /* renamed from: g */
        g<K, V> f33175g;

        /* renamed from: h */
        g<K, V> f33176h;

        /* renamed from: i */
        g<K, V> f33177i;

        /* renamed from: j */
        g<K, V> f33178j;

        /* renamed from: k */
        final K f33179k;

        /* renamed from: l */
        final int f33180l;

        /* renamed from: m */
        V f33181m;

        /* renamed from: n */
        int f33182n;

        g() {
            this.f33179k = null;
            this.f33180l = -1;
            this.f33178j = this;
            this.f33177i = this;
        }

        /* renamed from: a */
        public g<K, V> m27803a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f33175g; gVar2 != null; gVar2 = gVar2.f33175g) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public g<K, V> m27804b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f33176h; gVar2 != null; gVar2 = gVar2.f33176h) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f33179k;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f33181m;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f33179k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f33181m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f33179k;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f33181m;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f33181m;
            this.f33181m = v;
            return v2;
        }

        public String toString() {
            return this.f33179k + "=" + this.f33181m;
        }

        g(g<K, V> gVar, K k2, int i2, g<K, V> gVar2, g<K, V> gVar3) {
            this.f33174f = gVar;
            this.f33179k = k2;
            this.f33180l = i2;
            this.f33182n = 1;
            this.f33177i = gVar2;
            this.f33178j = gVar3;
            gVar3.f33177i = this;
            gVar2.f33178j = this;
        }
    }
}
