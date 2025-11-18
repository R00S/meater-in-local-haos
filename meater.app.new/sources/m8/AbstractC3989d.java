package m8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import m8.AbstractC3991f;
import m8.L;

/* compiled from: AbstractMapBasedMultimap.java */
/* renamed from: m8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3989d<K, V> extends AbstractC3991f<K, V> implements Serializable {

    /* renamed from: F, reason: collision with root package name */
    private transient Map<K, Collection<V>> f45283F;

    /* renamed from: G, reason: collision with root package name */
    private transient int f45284G;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$b */
    class b extends AbstractC3989d<K, V>.AbstractC0611d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.AbstractC3989d.AbstractC0611d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(K k10, V v10) {
            return L.d(k10, v10);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$c */
    private class c extends L.f<K, Collection<V>> {

        /* renamed from: D, reason: collision with root package name */
        final transient Map<K, Collection<V>> f45287D;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: m8.d$c$a */
        class a extends L.c<K, Collection<V>> {
            a() {
            }

            @Override // m8.L.c
            Map<K, Collection<V>> c() {
                return c.this;
            }

            @Override // m8.L.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C3995j.c(c.this.f45287D.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC3989d.this.x(entry.getKey());
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: m8.d$c$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: B, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f45290B;

            /* renamed from: C, reason: collision with root package name */
            Collection<V> f45291C;

            b() {
                this.f45290B = c.this.f45287D.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f45290B.next();
                this.f45291C = next.getValue();
                return c.this.g(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f45290B.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                l8.m.r(this.f45291C != null, "no calls to next() since the last call to remove()");
                this.f45290B.remove();
                AbstractC3989d.q(AbstractC3989d.this, this.f45291C.size());
                this.f45291C.clear();
                this.f45291C = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f45287D = map;
        }

        @Override // m8.L.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) L.j(this.f45287D, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC3989d.this.z(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f45287D == AbstractC3989d.this.f45283F) {
                AbstractC3989d.this.clear();
            } else {
                C3983F.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return L.i(this.f45287D, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f45287D.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionS = AbstractC3989d.this.s();
            collectionS.addAll(collectionRemove);
            AbstractC3989d.q(AbstractC3989d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionS;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f45287D.equals(obj);
        }

        Map.Entry<K, Collection<V>> g(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return L.d(key, AbstractC3989d.this.z(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f45287D.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC3989d.this.j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f45287D.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f45287D.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0611d<T> implements Iterator<T> {

        /* renamed from: B, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f45293B;

        /* renamed from: C, reason: collision with root package name */
        K f45294C = null;

        /* renamed from: D, reason: collision with root package name */
        Collection<V> f45295D = null;

        /* renamed from: E, reason: collision with root package name */
        Iterator<V> f45296E = C3983F.h();

        AbstractC0611d() {
            this.f45293B = AbstractC3989d.this.f45283F.entrySet().iterator();
        }

        abstract T b(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45293B.hasNext() || this.f45296E.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f45296E.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f45293B.next();
                this.f45294C = next.getKey();
                Collection<V> value = next.getValue();
                this.f45295D = value;
                this.f45296E = value.iterator();
            }
            return b(S.a(this.f45294C), this.f45296E.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f45296E.remove();
            Collection<V> collection = this.f45295D;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f45293B.remove();
            }
            AbstractC3989d.o(AbstractC3989d.this);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$e */
    private class e extends L.d<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: m8.d$e$a */
        class a implements Iterator<K> {

            /* renamed from: B, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f45299B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Iterator f45300C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ e f45301D;

            a(e eVar, Iterator it) {
                this.f45300C = it;
                this.f45301D = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f45300C.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f45300C.next();
                this.f45299B = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                l8.m.r(this.f45299B != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f45299B.getValue();
                this.f45300C.remove();
                AbstractC3989d.q(AbstractC3989d.this, value.size());
                value.clear();
                this.f45299B = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3983F.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = c().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractC3989d.q(AbstractC3989d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$f */
    private final class f extends AbstractC3989d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = j().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return g(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return j().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = j().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return g(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = j().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return g(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return j().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = j().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return g(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return j().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.AbstractC3989d.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return new g(j());
        }

        @Override // m8.AbstractC3989d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = j().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return g(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = j().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return g(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return j().lowerKey(k10);
        }

        @Override // m8.AbstractC3989d.i, m8.AbstractC3989d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        Map.Entry<K, Collection<V>> n(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionS = AbstractC3989d.this.s();
            collectionS.addAll(next.getValue());
            it.remove();
            return L.d(next.getKey(), AbstractC3989d.this.y(collectionS));
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return i();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.AbstractC3989d.i
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // m8.AbstractC3989d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        @Override // m8.AbstractC3989d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(j().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(j().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(j().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$g */
    private final class g extends AbstractC3989d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return f().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return f().floorKey(k10);
        }

        @Override // m8.AbstractC3989d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return f().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.AbstractC3989d.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // m8.AbstractC3989d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return f().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C3983F.o(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C3983F.o(descendingIterator());
        }

        @Override // m8.AbstractC3989d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(f().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(f().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(f().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$h */
    private class h extends AbstractC3989d<K, V>.l implements RandomAccess {
        h(K k10, List<V> list, AbstractC3989d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$i */
    private class i extends AbstractC3989d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: F, reason: collision with root package name */
        SortedSet<K> f45305F;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().firstKey();
        }

        SortedSet<K> h() {
            return new j(j());
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(j().headMap(k10));
        }

        @Override // m8.AbstractC3989d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f45305F;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetH = h();
            this.f45305F = sortedSetH;
            return sortedSetH;
        }

        SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.f45287D;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(j().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(j().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$j */
    private class j extends AbstractC3989d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(f().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(f().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(f().tailMap(k10));
        }
    }

    protected AbstractC3989d(Map<K, Collection<V>> map) {
        l8.m.d(map.isEmpty());
        this.f45283F = map;
    }

    static /* synthetic */ int n(AbstractC3989d abstractC3989d) {
        int i10 = abstractC3989d.f45284G;
        abstractC3989d.f45284G = i10 + 1;
        return i10;
    }

    static /* synthetic */ int o(AbstractC3989d abstractC3989d) {
        int i10 = abstractC3989d.f45284G;
        abstractC3989d.f45284G = i10 - 1;
        return i10;
    }

    static /* synthetic */ int p(AbstractC3989d abstractC3989d, int i10) {
        int i11 = abstractC3989d.f45284G + i10;
        abstractC3989d.f45284G = i11;
        return i11;
    }

    static /* synthetic */ int q(AbstractC3989d abstractC3989d, int i10) {
        int i11 = abstractC3989d.f45284G - i10;
        abstractC3989d.f45284G = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> w(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) L.k(this.f45283F, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f45284G -= size;
        }
    }

    final List<V> A(K k10, List<V> list, AbstractC3989d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // m8.AbstractC3991f, m8.M
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // m8.M
    public void clear() {
        Iterator<Collection<V>> it = this.f45283F.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f45283F.clear();
        this.f45284G = 0;
    }

    @Override // m8.AbstractC3991f
    Collection<Map.Entry<K, V>> f() {
        return this instanceof c0 ? new AbstractC3991f.b() : new AbstractC3991f.a();
    }

    @Override // m8.M
    public Collection<V> get(K k10) {
        Collection<V> collectionT = this.f45283F.get(k10);
        if (collectionT == null) {
            collectionT = t(k10);
        }
        return z(k10, collectionT);
    }

    @Override // m8.AbstractC3991f
    Collection<V> h() {
        return new AbstractC3991f.c();
    }

    @Override // m8.AbstractC3991f
    Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // m8.AbstractC3991f
    Iterator<V> k() {
        return new a();
    }

    @Override // m8.M
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f45283F.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f45284G++;
            return true;
        }
        Collection<V> collectionT = t(k10);
        if (!collectionT.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f45284G++;
        this.f45283F.put(k10, collectionT);
        return true;
    }

    abstract Collection<V> s();

    @Override // m8.M
    public int size() {
        return this.f45284G;
    }

    Collection<V> t(K k10) {
        return s();
    }

    final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f45283F;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f45283F) : map instanceof SortedMap ? new i((SortedMap) this.f45283F) : new c(this.f45283F);
    }

    final Set<K> v() {
        Map<K, Collection<V>> map = this.f45283F;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f45283F) : map instanceof SortedMap ? new j((SortedMap) this.f45283F) : new e(this.f45283F);
    }

    @Override // m8.AbstractC3991f, m8.M
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> y(Collection<E> collection);

    abstract Collection<V> z(K k10, Collection<V> collection);

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$k */
    class k extends AbstractCollection<V> {

        /* renamed from: B, reason: collision with root package name */
        final K f45308B;

        /* renamed from: C, reason: collision with root package name */
        Collection<V> f45309C;

        /* renamed from: D, reason: collision with root package name */
        final AbstractC3989d<K, V>.k f45310D;

        /* renamed from: E, reason: collision with root package name */
        final Collection<V> f45311E;

        k(K k10, Collection<V> collection, AbstractC3989d<K, V>.k kVar) {
            this.f45308B = k10;
            this.f45309C = collection;
            this.f45310D = kVar;
            this.f45311E = kVar == null ? null : kVar.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            j();
            boolean zIsEmpty = this.f45309C.isEmpty();
            boolean zAdd = this.f45309C.add(v10);
            if (zAdd) {
                AbstractC3989d.n(AbstractC3989d.this);
                if (zIsEmpty) {
                    c();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f45309C.addAll(collection);
            if (zAddAll) {
                AbstractC3989d.p(AbstractC3989d.this, this.f45309C.size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        void c() {
            AbstractC3989d<K, V>.k kVar = this.f45310D;
            if (kVar != null) {
                kVar.c();
            } else {
                AbstractC3989d.this.f45283F.put(this.f45308B, this.f45309C);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f45309C.clear();
            AbstractC3989d.q(AbstractC3989d.this, size);
            r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            j();
            return this.f45309C.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            j();
            return this.f45309C.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            j();
            return this.f45309C.equals(obj);
        }

        AbstractC3989d<K, V>.k f() {
            return this.f45310D;
        }

        Collection<V> h() {
            return this.f45309C;
        }

        @Override // java.util.Collection
        public int hashCode() {
            j();
            return this.f45309C.hashCode();
        }

        K i() {
            return this.f45308B;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            j();
            return new a();
        }

        void j() {
            Collection<V> collection;
            AbstractC3989d<K, V>.k kVar = this.f45310D;
            if (kVar != null) {
                kVar.j();
                if (this.f45310D.h() != this.f45311E) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f45309C.isEmpty() || (collection = (Collection) AbstractC3989d.this.f45283F.get(this.f45308B)) == null) {
                    return;
                }
                this.f45309C = collection;
            }
        }

        void r() {
            AbstractC3989d<K, V>.k kVar = this.f45310D;
            if (kVar != null) {
                kVar.r();
            } else if (this.f45309C.isEmpty()) {
                AbstractC3989d.this.f45283F.remove(this.f45308B);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            j();
            boolean zRemove = this.f45309C.remove(obj);
            if (zRemove) {
                AbstractC3989d.o(AbstractC3989d.this);
                r();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f45309C.removeAll(collection);
            if (zRemoveAll) {
                AbstractC3989d.p(AbstractC3989d.this, this.f45309C.size() - size);
                r();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            l8.m.l(collection);
            int size = size();
            boolean zRetainAll = this.f45309C.retainAll(collection);
            if (zRetainAll) {
                AbstractC3989d.p(AbstractC3989d.this, this.f45309C.size() - size);
                r();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            j();
            return this.f45309C.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            j();
            return this.f45309C.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: m8.d$k$a */
        class a implements Iterator<V> {

            /* renamed from: B, reason: collision with root package name */
            final Iterator<V> f45313B;

            /* renamed from: C, reason: collision with root package name */
            final Collection<V> f45314C;

            a() {
                Collection<V> collection = k.this.f45309C;
                this.f45314C = collection;
                this.f45313B = AbstractC3989d.w(collection);
            }

            Iterator<V> b() {
                d();
                return this.f45313B;
            }

            void d() {
                k.this.j();
                if (k.this.f45309C != this.f45314C) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                d();
                return this.f45313B.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                d();
                return this.f45313B.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f45313B.remove();
                AbstractC3989d.o(AbstractC3989d.this);
                k.this.r();
            }

            a(Iterator<V> it) {
                this.f45314C = k.this.f45309C;
                this.f45313B = it;
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$l */
    class l extends AbstractC3989d<K, V>.k implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: m8.d$l$a */
        private class a extends AbstractC3989d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> e() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                e().add(v10);
                AbstractC3989d.n(AbstractC3989d.this);
                if (zIsEmpty) {
                    l.this.c();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return e().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return e().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return e().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return e().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                e().set(v10);
            }

            public a(int i10) {
                super(l.this.v().listIterator(i10));
            }
        }

        l(K k10, List<V> list, AbstractC3989d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            j();
            boolean zIsEmpty = h().isEmpty();
            v().add(i10, v10);
            AbstractC3989d.n(AbstractC3989d.this);
            if (zIsEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = v().addAll(i10, collection);
            if (zAddAll) {
                AbstractC3989d.p(AbstractC3989d.this, h().size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            j();
            return v().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            j();
            return v().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            j();
            return v().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            j();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i10) {
            j();
            V vRemove = v().remove(i10);
            AbstractC3989d.o(AbstractC3989d.this);
            r();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            j();
            return v().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            j();
            return AbstractC3989d.this.A(i(), v().subList(i10, i11), f() == null ? this : f());
        }

        List<V> v() {
            return (List) h();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            j();
            return new a(i10);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: m8.d$a */
    class a extends AbstractC3989d<K, V>.AbstractC0611d<V> {
        a() {
            super();
        }

        @Override // m8.AbstractC3989d.AbstractC0611d
        V b(K k10, V v10) {
            return v10;
        }
    }
}
