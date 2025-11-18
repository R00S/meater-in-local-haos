package p024c.p041e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* renamed from: c.e.f */
/* loaded from: classes.dex */
abstract class AbstractC0872f<K, V> {

    /* renamed from: a */
    AbstractC0872f<K, V>.b f5737a;

    /* renamed from: b */
    AbstractC0872f<K, V>.c f5738b;

    /* renamed from: c */
    AbstractC0872f<K, V>.e f5739c;

    /* compiled from: MapCollections.java */
    /* renamed from: c.e.f$a */
    final class a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f5740f;

        /* renamed from: g */
        int f5741g;

        /* renamed from: h */
        int f5742h;

        /* renamed from: i */
        boolean f5743i = false;

        a(int i2) {
            this.f5740f = i2;
            this.f5741g = AbstractC0872f.this.mo5414d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5742h < this.f5741g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0872f.this.mo5412b(this.f5742h, this.f5740f);
            this.f5742h++;
            this.f5743i = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f5743i) {
                throw new IllegalStateException();
            }
            int i2 = this.f5742h - 1;
            this.f5742h = i2;
            this.f5741g--;
            this.f5743i = false;
            AbstractC0872f.this.mo5418h(i2);
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: c.e.f$b */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo5414d = AbstractC0872f.this.mo5414d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0872f.this.mo5417g(entry.getKey(), entry.getValue());
            }
            return iMo5414d != AbstractC0872f.this.mo5414d();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0872f.this.mo5411a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo5415e = AbstractC0872f.this.mo5415e(entry.getKey());
            if (iMo5415e < 0) {
                return false;
            }
            return C0869c.m5430c(AbstractC0872f.this.mo5412b(iMo5415e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0872f.m5455k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo5414d = AbstractC0872f.this.mo5414d() - 1; iMo5414d >= 0; iMo5414d--) {
                Object objMo5412b = AbstractC0872f.this.mo5412b(iMo5414d, 0);
                Object objMo5412b2 = AbstractC0872f.this.mo5412b(iMo5414d, 1);
                iHashCode += (objMo5412b == null ? 0 : objMo5412b.hashCode()) ^ (objMo5412b2 == null ? 0 : objMo5412b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0872f.this.mo5414d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0872f.this.mo5414d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: c.e.f$c */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0872f.this.mo5411a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0872f.this.mo5415e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0872f.m5454j(AbstractC0872f.this.mo5413c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0872f.m5455k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo5414d = AbstractC0872f.this.mo5414d() - 1; iMo5414d >= 0; iMo5414d--) {
                Object objMo5412b = AbstractC0872f.this.mo5412b(iMo5414d, 0);
                iHashCode += objMo5412b == null ? 0 : objMo5412b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0872f.this.mo5414d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo5415e = AbstractC0872f.this.mo5415e(obj);
            if (iMo5415e < 0) {
                return false;
            }
            AbstractC0872f.this.mo5418h(iMo5415e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0872f.m5456o(AbstractC0872f.this.mo5413c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0872f.m5457p(AbstractC0872f.this.mo5413c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0872f.this.mo5414d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0872f.this.m5461q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0872f.this.m5462r(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: c.e.f$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f5747f;

        /* renamed from: h */
        boolean f5749h = false;

        /* renamed from: g */
        int f5748g = -1;

        d() {
            this.f5747f = AbstractC0872f.this.mo5414d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f5748g++;
            this.f5749h = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f5749h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0869c.m5430c(entry.getKey(), AbstractC0872f.this.mo5412b(this.f5748g, 0)) && C0869c.m5430c(entry.getValue(), AbstractC0872f.this.mo5412b(this.f5748g, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f5749h) {
                return (K) AbstractC0872f.this.mo5412b(this.f5748g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f5749h) {
                return (V) AbstractC0872f.this.mo5412b(this.f5748g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5748g < this.f5747f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f5749h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo5412b = AbstractC0872f.this.mo5412b(this.f5748g, 0);
            Object objMo5412b2 = AbstractC0872f.this.mo5412b(this.f5748g, 1);
            return (objMo5412b == null ? 0 : objMo5412b.hashCode()) ^ (objMo5412b2 != null ? objMo5412b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f5749h) {
                throw new IllegalStateException();
            }
            AbstractC0872f.this.mo5418h(this.f5748g);
            this.f5748g--;
            this.f5747f--;
            this.f5749h = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f5749h) {
                return (V) AbstractC0872f.this.mo5419i(this.f5748g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: c.e.f$e */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0872f.this.mo5411a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0872f.this.mo5416f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0872f.this.mo5414d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo5416f = AbstractC0872f.this.mo5416f(obj);
            if (iMo5416f < 0) {
                return false;
            }
            AbstractC0872f.this.mo5418h(iMo5416f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo5414d = AbstractC0872f.this.mo5414d();
            int i2 = 0;
            boolean z = false;
            while (i2 < iMo5414d) {
                if (collection.contains(AbstractC0872f.this.mo5412b(i2, 1))) {
                    AbstractC0872f.this.mo5418h(i2);
                    i2--;
                    iMo5414d--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo5414d = AbstractC0872f.this.mo5414d();
            int i2 = 0;
            boolean z = false;
            while (i2 < iMo5414d) {
                if (!collection.contains(AbstractC0872f.this.mo5412b(i2, 1))) {
                    AbstractC0872f.this.mo5418h(i2);
                    i2--;
                    iMo5414d--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0872f.this.mo5414d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0872f.this.m5461q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0872f.this.m5462r(tArr, 1);
        }
    }

    AbstractC0872f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m5454j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m5455k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m5456o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m5457p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo5411a();

    /* renamed from: b */
    protected abstract Object mo5412b(int i2, int i3);

    /* renamed from: c */
    protected abstract Map<K, V> mo5413c();

    /* renamed from: d */
    protected abstract int mo5414d();

    /* renamed from: e */
    protected abstract int mo5415e(Object obj);

    /* renamed from: f */
    protected abstract int mo5416f(Object obj);

    /* renamed from: g */
    protected abstract void mo5417g(K k2, V v);

    /* renamed from: h */
    protected abstract void mo5418h(int i2);

    /* renamed from: i */
    protected abstract V mo5419i(int i2, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m5458l() {
        if (this.f5737a == null) {
            this.f5737a = new b();
        }
        return this.f5737a;
    }

    /* renamed from: m */
    public Set<K> m5459m() {
        if (this.f5738b == null) {
            this.f5738b = new c();
        }
        return this.f5738b;
    }

    /* renamed from: n */
    public Collection<V> m5460n() {
        if (this.f5739c == null) {
            this.f5739c = new e();
        }
        return this.f5739c;
    }

    /* renamed from: q */
    public Object[] m5461q(int i2) {
        int iMo5414d = mo5414d();
        Object[] objArr = new Object[iMo5414d];
        for (int i3 = 0; i3 < iMo5414d; i3++) {
            objArr[i3] = mo5412b(i3, i2);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] m5462r(T[] tArr, int i2) {
        int iMo5414d = mo5414d();
        if (tArr.length < iMo5414d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo5414d));
        }
        for (int i3 = 0; i3 < iMo5414d; i3++) {
            tArr[i3] = mo5412b(i3, i2);
        }
        if (tArr.length > iMo5414d) {
            tArr[iMo5414d] = null;
        }
        return tArr;
    }
}
