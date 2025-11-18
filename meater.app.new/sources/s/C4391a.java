package s;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import t.C4532a;

/* compiled from: ArrayMap.java */
/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4391a<K, V> extends X<K, V> implements Map<K, V> {

    /* renamed from: E, reason: collision with root package name */
    C4391a<K, V>.C0685a f48680E;

    /* renamed from: F, reason: collision with root package name */
    C4391a<K, V>.c f48681F;

    /* renamed from: G, reason: collision with root package name */
    C4391a<K, V>.e f48682G;

    /* compiled from: ArrayMap.java */
    /* renamed from: s.a$a, reason: collision with other inner class name */
    final class C0685a extends AbstractSet<Map.Entry<K, V>> {
        C0685a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4391a.this.getSize();
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: s.a$b */
    final class b extends AbstractC4400j<K> {
        b() {
            super(C4391a.this.getSize());
        }

        @Override // s.AbstractC4400j
        protected K b(int i10) {
            return C4391a.this.h(i10);
        }

        @Override // s.AbstractC4400j
        protected void d(int i10) {
            C4391a.this.j(i10);
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: s.a$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: B, reason: collision with root package name */
        int f48686B;

        /* renamed from: C, reason: collision with root package name */
        int f48687C = -1;

        /* renamed from: D, reason: collision with root package name */
        boolean f48688D;

        d() {
            this.f48686B = C4391a.this.getSize() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f48687C++;
            this.f48688D = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f48688D) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C4532a.c(entry.getKey(), C4391a.this.h(this.f48687C)) && C4532a.c(entry.getValue(), C4391a.this.l(this.f48687C));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f48688D) {
                return C4391a.this.h(this.f48687C);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f48688D) {
                return C4391a.this.l(this.f48687C);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48687C < this.f48686B;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f48688D) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kH = C4391a.this.h(this.f48687C);
            V vL = C4391a.this.l(this.f48687C);
            return (kH == null ? 0 : kH.hashCode()) ^ (vL != null ? vL.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f48688D) {
                throw new IllegalStateException();
            }
            C4391a.this.j(this.f48687C);
            this.f48687C--;
            this.f48686B--;
            this.f48688D = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f48688D) {
                return C4391a.this.k(this.f48687C, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: s.a$f */
    final class f extends AbstractC4400j<V> {
        f() {
            super(C4391a.this.getSize());
        }

        @Override // s.AbstractC4400j
        protected V b(int i10) {
            return C4391a.this.l(i10);
        }

        @Override // s.AbstractC4400j
        protected void d(int i10) {
            C4391a.this.j(i10);
        }
    }

    public C4391a() {
    }

    static <T> boolean n(Set<T> set, Object obj) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s.X, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s.X, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C4391a<K, V>.C0685a c0685a = this.f48680E;
        if (c0685a != null) {
            return c0685a;
        }
        C4391a<K, V>.C0685a c0685a2 = new C0685a();
        this.f48680E = c0685a2;
        return c0685a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s.X, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        C4391a<K, V>.c cVar = this.f48681F;
        if (cVar != null) {
            return cVar;
        }
        C4391a<K, V>.c cVar2 = new c();
        this.f48681F = cVar2;
        return cVar2;
    }

    public boolean m(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean o(Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    public boolean p(Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(h(size2))) {
                j(size2);
            }
        }
        return size != getSize();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s.X, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        C4391a<K, V>.e eVar = this.f48682G;
        if (eVar != null) {
            return eVar;
        }
        C4391a<K, V>.e eVar2 = new e();
        this.f48682G = eVar2;
        return eVar2;
    }

    public C4391a(int i10) {
        super(i10);
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: s.a$c */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C4391a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C4391a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C4391a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C4391a.n(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C4391a.this.getSize() - 1; size >= 0; size--) {
                K kH = C4391a.this.h(size);
                iHashCode += kH == null ? 0 : kH.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C4391a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iD = C4391a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            C4391a.this.j(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return C4391a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return C4391a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C4391a.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C4391a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C4391a.this.h(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C4391a.this.h(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: s.a$e */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C4391a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C4391a.this.a(obj) >= 0;
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
            return C4391a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = C4391a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C4391a.this.j(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int size = C4391a.this.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C4391a.this.l(i10))) {
                    C4391a.this.j(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int size = C4391a.this.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C4391a.this.l(i10))) {
                    C4391a.this.j(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C4391a.this.getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C4391a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C4391a.this.l(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C4391a.this.l(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public C4391a(X x10) {
        super(x10);
    }
}
