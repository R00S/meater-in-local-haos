package com.google.gson.p215t;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* renamed from: com.google.gson.t.h */
/* loaded from: classes2.dex */
public final class C8595h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f */
    private static final Comparator<Comparable> f32543f = new a();

    /* renamed from: g */
    Comparator<? super K> f32544g;

    /* renamed from: h */
    e<K, V> f32545h;

    /* renamed from: i */
    int f32546i;

    /* renamed from: j */
    int f32547j;

    /* renamed from: k */
    final e<K, V> f32548k;

    /* renamed from: l */
    private C8595h<K, V>.b f32549l;

    /* renamed from: m */
    private C8595h<K, V>.c f32550m;

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.t.h$a */
    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.t.h$b */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: com.google.gson.t.h$b$a */
        class a extends C8595h<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m27102b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C8595h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C8595h.this.m27096c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarM27096c;
            if (!(obj instanceof Map.Entry) || (eVarM27096c = C8595h.this.m27096c((Map.Entry) obj)) == null) {
                return false;
            }
            C8595h.this.m27098f(eVarM27096c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8595h.this.f32546i;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.t.h$c */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: com.google.gson.t.h$c$a */
        class a extends C8595h<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m27102b().f32564k;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C8595h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C8595h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C8595h.this.m27099h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8595h.this.f32546i;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.t.h$d */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: f */
        e<K, V> f32555f;

        /* renamed from: g */
        e<K, V> f32556g = null;

        /* renamed from: h */
        int f32557h;

        d() {
            this.f32555f = C8595h.this.f32548k.f32562i;
            this.f32557h = C8595h.this.f32547j;
        }

        /* renamed from: b */
        final e<K, V> m27102b() {
            e<K, V> eVar = this.f32555f;
            C8595h c8595h = C8595h.this;
            if (eVar == c8595h.f32548k) {
                throw new NoSuchElementException();
            }
            if (c8595h.f32547j != this.f32557h) {
                throw new ConcurrentModificationException();
            }
            this.f32555f = eVar.f32562i;
            this.f32556g = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f32555f != C8595h.this.f32548k;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f32556g;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C8595h.this.m27098f(eVar, true);
            this.f32556g = null;
            this.f32557h = C8595h.this.f32547j;
        }
    }

    public C8595h() {
        this(f32543f);
    }

    /* renamed from: a */
    private boolean m27090a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m27091e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f32560g;
            e<K, V> eVar3 = eVar.f32561h;
            int i2 = eVar2 != null ? eVar2.f32566m : 0;
            int i3 = eVar3 != null ? eVar3.f32566m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f32560g;
                e<K, V> eVar5 = eVar3.f32561h;
                int i5 = (eVar4 != null ? eVar4.f32566m : 0) - (eVar5 != null ? eVar5.f32566m : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    m27093j(eVar);
                } else {
                    m27094k(eVar3);
                    m27093j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f32560g;
                e<K, V> eVar7 = eVar2.f32561h;
                int i6 = (eVar6 != null ? eVar6.f32566m : 0) - (eVar7 != null ? eVar7.f32566m : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    m27094k(eVar);
                } else {
                    m27093j(eVar2);
                    m27094k(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f32566m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f32566m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f32559f;
        }
    }

    /* renamed from: i */
    private void m27092i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f32559f;
        eVar.f32559f = null;
        if (eVar2 != null) {
            eVar2.f32559f = eVar3;
        }
        if (eVar3 == null) {
            this.f32545h = eVar2;
        } else if (eVar3.f32560g == eVar) {
            eVar3.f32560g = eVar2;
        } else {
            eVar3.f32561h = eVar2;
        }
    }

    /* renamed from: j */
    private void m27093j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f32560g;
        e<K, V> eVar3 = eVar.f32561h;
        e<K, V> eVar4 = eVar3.f32560g;
        e<K, V> eVar5 = eVar3.f32561h;
        eVar.f32561h = eVar4;
        if (eVar4 != null) {
            eVar4.f32559f = eVar;
        }
        m27092i(eVar, eVar3);
        eVar3.f32560g = eVar;
        eVar.f32559f = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f32566m : 0, eVar4 != null ? eVar4.f32566m : 0) + 1;
        eVar.f32566m = iMax;
        eVar3.f32566m = Math.max(iMax, eVar5 != null ? eVar5.f32566m : 0) + 1;
    }

    /* renamed from: k */
    private void m27094k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f32560g;
        e<K, V> eVar3 = eVar.f32561h;
        e<K, V> eVar4 = eVar2.f32560g;
        e<K, V> eVar5 = eVar2.f32561h;
        eVar.f32560g = eVar5;
        if (eVar5 != null) {
            eVar5.f32559f = eVar;
        }
        m27092i(eVar, eVar2);
        eVar2.f32561h = eVar;
        eVar.f32559f = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f32566m : 0, eVar5 != null ? eVar5.f32566m : 0) + 1;
        eVar.f32566m = iMax;
        eVar2.f32566m = Math.max(iMax, eVar4 != null ? eVar4.f32566m : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: b */
    e<K, V> m27095b(K k2, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f32544g;
        e<K, V> eVar2 = this.f32545h;
        if (eVar2 != null) {
            Comparable comparable = comparator == f32543f ? (Comparable) k2 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f32564k) : comparator.compare(k2, eVar2.f32564k);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f32560g : eVar2.f32561h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f32548k;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f32563j);
            if (iCompareTo < 0) {
                eVar2.f32560g = eVar;
            } else {
                eVar2.f32561h = eVar;
            }
            m27091e(eVar2, true);
        } else {
            if (comparator == f32543f && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f32563j);
            this.f32545h = eVar;
        }
        this.f32546i++;
        this.f32547j++;
        return eVar;
    }

    /* renamed from: c */
    e<K, V> m27096c(Map.Entry<?, ?> entry) {
        e<K, V> eVarM27097d = m27097d(entry.getKey());
        if (eVarM27097d != null && m27090a(eVarM27097d.f32565l, entry.getValue())) {
            return eVarM27097d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f32545h = null;
        this.f32546i = 0;
        this.f32547j++;
        e<K, V> eVar = this.f32548k;
        eVar.f32563j = eVar;
        eVar.f32562i = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m27097d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    e<K, V> m27097d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m27095b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C8595h<K, V>.b bVar = this.f32549l;
        if (bVar != null) {
            return bVar;
        }
        C8595h<K, V>.b bVar2 = new b();
        this.f32549l = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    void m27098f(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f32563j;
            eVar2.f32562i = eVar.f32562i;
            eVar.f32562i.f32563j = eVar2;
        }
        e<K, V> eVar3 = eVar.f32560g;
        e<K, V> eVar4 = eVar.f32561h;
        e<K, V> eVar5 = eVar.f32559f;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m27092i(eVar, eVar3);
                eVar.f32560g = null;
            } else if (eVar4 != null) {
                m27092i(eVar, eVar4);
                eVar.f32561h = null;
            } else {
                m27092i(eVar, null);
            }
            m27091e(eVar5, false);
            this.f32546i--;
            this.f32547j++;
            return;
        }
        e<K, V> eVarM27104b = eVar3.f32566m > eVar4.f32566m ? eVar3.m27104b() : eVar4.m27103a();
        m27098f(eVarM27104b, false);
        e<K, V> eVar6 = eVar.f32560g;
        if (eVar6 != null) {
            i2 = eVar6.f32566m;
            eVarM27104b.f32560g = eVar6;
            eVar6.f32559f = eVarM27104b;
            eVar.f32560g = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f32561h;
        if (eVar7 != null) {
            i3 = eVar7.f32566m;
            eVarM27104b.f32561h = eVar7;
            eVar7.f32559f = eVarM27104b;
            eVar.f32561h = null;
        }
        eVarM27104b.f32566m = Math.max(i2, i3) + 1;
        m27092i(eVar, eVarM27104b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarM27097d = m27097d(obj);
        if (eVarM27097d != null) {
            return eVarM27097d.f32565l;
        }
        return null;
    }

    /* renamed from: h */
    e<K, V> m27099h(Object obj) {
        e<K, V> eVarM27097d = m27097d(obj);
        if (eVarM27097d != null) {
            m27098f(eVarM27097d, true);
        }
        return eVarM27097d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C8595h<K, V>.c cVar = this.f32550m;
        if (cVar != null) {
            return cVar;
        }
        C8595h<K, V>.c cVar2 = new c();
        this.f32550m = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarM27095b = m27095b(k2, true);
        V v2 = eVarM27095b.f32565l;
        eVarM27095b.f32565l = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarM27099h = m27099h(obj);
        if (eVarM27099h != null) {
            return eVarM27099h.f32565l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f32546i;
    }

    public C8595h(Comparator<? super K> comparator) {
        this.f32546i = 0;
        this.f32547j = 0;
        this.f32548k = new e<>();
        this.f32544g = comparator == null ? f32543f : comparator;
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: com.google.gson.t.h$e */
    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        e<K, V> f32559f;

        /* renamed from: g */
        e<K, V> f32560g;

        /* renamed from: h */
        e<K, V> f32561h;

        /* renamed from: i */
        e<K, V> f32562i;

        /* renamed from: j */
        e<K, V> f32563j;

        /* renamed from: k */
        final K f32564k;

        /* renamed from: l */
        V f32565l;

        /* renamed from: m */
        int f32566m;

        e() {
            this.f32564k = null;
            this.f32563j = this;
            this.f32562i = this;
        }

        /* renamed from: a */
        public e<K, V> m27103a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f32560g; eVar2 != null; eVar2 = eVar2.f32560g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public e<K, V> m27104b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f32561h; eVar2 != null; eVar2 = eVar2.f32561h) {
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
            K k2 = this.f32564k;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f32565l;
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
            return this.f32564k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f32565l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f32564k;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f32565l;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f32565l;
            this.f32565l = v;
            return v2;
        }

        public String toString() {
            return this.f32564k + "=" + this.f32565l;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f32559f = eVar;
            this.f32564k = k2;
            this.f32566m = 1;
            this.f32562i = eVar2;
            this.f32563j = eVar3;
            eVar3.f32562i = this;
            eVar2.f32563j = this;
        }
    }
}
