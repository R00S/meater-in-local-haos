package m8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m8.O;

/* compiled from: AbstractMultimap.java */
/* renamed from: m8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3991f<K, V> implements M<K, V> {

    /* renamed from: B, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f45328B;

    /* renamed from: C, reason: collision with root package name */
    private transient Set<K> f45329C;

    /* renamed from: D, reason: collision with root package name */
    private transient Collection<V> f45330D;

    /* renamed from: E, reason: collision with root package name */
    private transient Map<K, Collection<V>> f45331E;

    /* compiled from: AbstractMultimap.java */
    /* renamed from: m8.f$a */
    class a extends O.b<K, V> {
        a() {
        }

        @Override // m8.O.b
        M<K, V> c() {
            return AbstractC3991f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC3991f.this.i();
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* renamed from: m8.f$b */
    class b extends AbstractC3991f<K, V>.a implements Set<Map.Entry<K, V>> {
        b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return d0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d0.d(this);
        }
    }

    /* compiled from: AbstractMultimap.java */
    /* renamed from: m8.f$c */
    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC3991f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3991f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC3991f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC3991f.this.size();
        }
    }

    AbstractC3991f() {
    }

    @Override // m8.M
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f45328B;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionF = f();
        this.f45328B = collectionF;
        return collectionF;
    }

    @Override // m8.M
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f45331E;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = e();
        this.f45331E = mapE;
        return mapE;
    }

    @Override // m8.M
    public boolean c(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> e();

    public boolean equals(Object obj) {
        return O.a(this, obj);
    }

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    abstract Iterator<Map.Entry<K, V>> i();

    public Set<K> j() {
        Set<K> set = this.f45329C;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f45329C = setG;
        return setG;
    }

    abstract Iterator<V> k();

    @Override // m8.M
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // m8.M
    public Collection<V> values() {
        Collection<V> collection = this.f45330D;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = h();
        this.f45330D = collectionH;
        return collectionH;
    }
}
