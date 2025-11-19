package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes2.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private static final Comparator<Comparable> f39067J = new a();

    /* renamed from: B, reason: collision with root package name */
    private final Comparator<? super K> f39068B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f39069C;

    /* renamed from: D, reason: collision with root package name */
    e<K, V> f39070D;

    /* renamed from: E, reason: collision with root package name */
    int f39071E;

    /* renamed from: F, reason: collision with root package name */
    int f39072F;

    /* renamed from: G, reason: collision with root package name */
    final e<K, V> f39073G;

    /* renamed from: H, reason: collision with root package name */
    private g<K, V>.b f39074H;

    /* renamed from: I, reason: collision with root package name */
    private g<K, V>.c f39075I;

    /* compiled from: LinkedTreeMap.java */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.h(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f39071E;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        class a extends g<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f39089G;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f39071E;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: B, reason: collision with root package name */
        e<K, V> f39080B;

        /* renamed from: C, reason: collision with root package name */
        e<K, V> f39081C = null;

        /* renamed from: D, reason: collision with root package name */
        int f39082D;

        d() {
            this.f39080B = g.this.f39073G.f39087E;
            this.f39082D = g.this.f39072F;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.f39080B;
            g gVar = g.this;
            if (eVar == gVar.f39073G) {
                throw new NoSuchElementException();
            }
            if (gVar.f39072F != this.f39082D) {
                throw new ConcurrentModificationException();
            }
            this.f39080B = eVar.f39087E;
            this.f39081C = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f39080B != g.this.f39073G;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f39081C;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.h(eVar, true);
            this.f39081C = null;
            this.f39082D = g.this.f39072F;
        }
    }

    public g() {
        this(f39067J, true);
    }

    private boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void g(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f39085C;
            e<K, V> eVar3 = eVar.f39086D;
            int i10 = eVar2 != null ? eVar2.f39092J : 0;
            int i11 = eVar3 != null ? eVar3.f39092J : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f39085C;
                e<K, V> eVar5 = eVar3.f39086D;
                int i13 = (eVar4 != null ? eVar4.f39092J : 0) - (eVar5 != null ? eVar5.f39092J : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    k(eVar);
                } else {
                    l(eVar3);
                    k(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f39085C;
                e<K, V> eVar7 = eVar2.f39086D;
                int i14 = (eVar6 != null ? eVar6.f39092J : 0) - (eVar7 != null ? eVar7.f39092J : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    l(eVar);
                } else {
                    k(eVar2);
                    l(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f39092J = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f39092J = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f39084B;
        }
    }

    private void j(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f39084B;
        eVar.f39084B = null;
        if (eVar2 != null) {
            eVar2.f39084B = eVar3;
        }
        if (eVar3 == null) {
            this.f39070D = eVar2;
        } else if (eVar3.f39085C == eVar) {
            eVar3.f39085C = eVar2;
        } else {
            eVar3.f39086D = eVar2;
        }
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f39085C;
        e<K, V> eVar3 = eVar.f39086D;
        e<K, V> eVar4 = eVar3.f39085C;
        e<K, V> eVar5 = eVar3.f39086D;
        eVar.f39086D = eVar4;
        if (eVar4 != null) {
            eVar4.f39084B = eVar;
        }
        j(eVar, eVar3);
        eVar3.f39085C = eVar;
        eVar.f39084B = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f39092J : 0, eVar4 != null ? eVar4.f39092J : 0) + 1;
        eVar.f39092J = iMax;
        eVar3.f39092J = Math.max(iMax, eVar5 != null ? eVar5.f39092J : 0) + 1;
    }

    private void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f39085C;
        e<K, V> eVar3 = eVar.f39086D;
        e<K, V> eVar4 = eVar2.f39085C;
        e<K, V> eVar5 = eVar2.f39086D;
        eVar.f39085C = eVar5;
        if (eVar5 != null) {
            eVar5.f39084B = eVar;
        }
        j(eVar, eVar2);
        eVar2.f39086D = eVar;
        eVar.f39084B = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f39092J : 0, eVar5 != null ? eVar5.f39092J : 0) + 1;
        eVar.f39092J = iMax;
        eVar2.f39092J = Math.max(iMax, eVar4 != null ? eVar4.f39092J : 0) + 1;
    }

    e<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f39068B;
        e<K, V> eVar2 = this.f39070D;
        if (eVar2 != null) {
            Comparable comparable = comparator == f39067J ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f39089G) : comparator.compare(k10, eVar2.f39089G);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f39085C : eVar2.f39086D;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f39073G;
        if (eVar2 != null) {
            eVar = new e<>(this.f39069C, eVar2, k10, eVar4, eVar4.f39088F);
            if (iCompareTo < 0) {
                eVar2.f39085C = eVar;
            } else {
                eVar2.f39086D = eVar;
            }
            g(eVar2, true);
        } else {
            if (comparator == f39067J && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f39069C, eVar2, k10, eVar4, eVar4.f39088F);
            this.f39070D = eVar;
        }
        this.f39071E++;
        this.f39072F++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f39091I, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f39070D = null;
        this.f39071E = 0;
        this.f39072F++;
        e<K, V> eVar = this.f39073G;
        eVar.f39088F = eVar;
        eVar.f39087E = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f39074H;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f39074H = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f39091I;
        }
        return null;
    }

    void h(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f39088F;
            eVar2.f39087E = eVar.f39087E;
            eVar.f39087E.f39088F = eVar2;
        }
        e<K, V> eVar3 = eVar.f39085C;
        e<K, V> eVar4 = eVar.f39086D;
        e<K, V> eVar5 = eVar.f39084B;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                j(eVar, eVar3);
                eVar.f39085C = null;
            } else if (eVar4 != null) {
                j(eVar, eVar4);
                eVar.f39086D = null;
            } else {
                j(eVar, null);
            }
            g(eVar5, false);
            this.f39071E--;
            this.f39072F++;
            return;
        }
        e<K, V> eVarB = eVar3.f39092J > eVar4.f39092J ? eVar3.b() : eVar4.a();
        h(eVarB, false);
        e<K, V> eVar6 = eVar.f39085C;
        if (eVar6 != null) {
            i10 = eVar6.f39092J;
            eVarB.f39085C = eVar6;
            eVar6.f39084B = eVarB;
            eVar.f39085C = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f39086D;
        if (eVar7 != null) {
            i11 = eVar7.f39092J;
            eVarB.f39086D = eVar7;
            eVar7.f39084B = eVarB;
            eVar.f39086D = null;
        }
        eVarB.f39092J = Math.max(i10, i11) + 1;
        j(eVar, eVarB);
    }

    e<K, V> i(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            h(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.f39075I;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.f39075I = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f39069C) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k10, true);
        V v11 = eVarB.f39091I;
        eVarB.f39091I = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarI = i(obj);
        if (eVarI != null) {
            return eVarI.f39091I;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f39071E;
    }

    public g(boolean z10) {
        this(f39067J, z10);
    }

    public g(Comparator<? super K> comparator, boolean z10) {
        this.f39071E = 0;
        this.f39072F = 0;
        this.f39068B = comparator == null ? f39067J : comparator;
        this.f39069C = z10;
        this.f39073G = new e<>(z10);
    }

    /* compiled from: LinkedTreeMap.java */
    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: B, reason: collision with root package name */
        e<K, V> f39084B;

        /* renamed from: C, reason: collision with root package name */
        e<K, V> f39085C;

        /* renamed from: D, reason: collision with root package name */
        e<K, V> f39086D;

        /* renamed from: E, reason: collision with root package name */
        e<K, V> f39087E;

        /* renamed from: F, reason: collision with root package name */
        e<K, V> f39088F;

        /* renamed from: G, reason: collision with root package name */
        final K f39089G;

        /* renamed from: H, reason: collision with root package name */
        final boolean f39090H;

        /* renamed from: I, reason: collision with root package name */
        V f39091I;

        /* renamed from: J, reason: collision with root package name */
        int f39092J;

        e(boolean z10) {
            this.f39089G = null;
            this.f39090H = z10;
            this.f39088F = this;
            this.f39087E = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f39085C; eVar2 != null; eVar2 = eVar2.f39085C) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f39086D; eVar2 != null; eVar2 = eVar2.f39086D) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f39089G;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f39091I;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f39089G;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f39091I;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f39089G;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f39091I;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 == null && !this.f39090H) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f39091I;
            this.f39091I = v10;
            return v11;
        }

        public String toString() {
            return this.f39089G + "=" + this.f39091I;
        }

        e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f39084B = eVar;
            this.f39089G = k10;
            this.f39090H = z10;
            this.f39092J = 1;
            this.f39087E = eVar2;
            this.f39088F = eVar3;
            eVar3.f39087E = this;
            eVar2.f39088F = this;
        }
    }
}
