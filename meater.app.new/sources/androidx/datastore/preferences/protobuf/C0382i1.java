package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0415u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* renamed from: androidx.datastore.preferences.protobuf.i1 */
/* loaded from: classes.dex */
class C0382i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f2756f;

    /* renamed from: g */
    private List<C0382i1<K, V>.e> f2757g;

    /* renamed from: h */
    private Map<K, V> f2758h;

    /* renamed from: i */
    private boolean f2759i;

    /* renamed from: j */
    private volatile C0382i1<K, V>.g f2760j;

    /* renamed from: k */
    private Map<K, V> f2761k;

    /* renamed from: l */
    private volatile C0382i1<K, V>.c f2762l;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$a */
    static class a<FieldDescriptorType> extends C0382i1<FieldDescriptorType, Object> {
        a(int i2) {
            super(i2, null);
        }

        @Override // androidx.datastore.preferences.protobuf.C0382i1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C0415u.b) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0382i1
        /* renamed from: q */
        public void mo2835q() {
            if (!m2834p()) {
                for (int i2 = 0; i2 < m2831l(); i2++) {
                    Map.Entry<FieldDescriptorType, Object> entryM2830k = m2830k(i2);
                    if (((C0415u.b) entryM2830k.getKey()).mo3302h()) {
                        entryM2830k.setValue(Collections.unmodifiableList((List) entryM2830k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m2833n()) {
                    if (((C0415u.b) entry.getKey()).mo3302h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo2835q();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$c */
    private class c extends C0382i1<K, V>.g {
        private c() {
            super(C0382i1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.C0382i1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C0382i1.this, null);
        }

        /* synthetic */ c(C0382i1 c0382i1, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$d */
    private static class d {

        /* renamed from: a */
        private static final Iterator<Object> f2767a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f2768b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: androidx.datastore.preferences.protobuf.i1$d$a */
        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* renamed from: androidx.datastore.preferences.protobuf.i1$d$b */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f2767a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m2840b() {
            return (Iterable<T>) f2768b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$e */
    private class e implements Map.Entry<K, V>, Comparable<C0382i1<K, V>.e> {

        /* renamed from: f */
        private final K f2769f;

        /* renamed from: g */
        private V f2770g;

        e(C0382i1 c0382i1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: k */
        private boolean m2841k(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m2841k(this.f2769f, entry.getKey()) && m2841k(this.f2770g, entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0382i1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2770g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f2769f;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f2770g;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f2769f;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C0382i1.this.m2824h();
            V v2 = this.f2770g;
            this.f2770g = v;
            return v2;
        }

        public String toString() {
            return this.f2769f + "=" + this.f2770g;
        }

        e(K k2, V v) {
            this.f2769f = k2;
            this.f2770g = v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$g */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C0382i1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0382i1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C0382i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C0382i1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C0382i1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0382i1.this.size();
        }

        /* synthetic */ g(C0382i1 c0382i1, a aVar) {
            this();
        }
    }

    /* synthetic */ C0382i1(int i2, a aVar) {
        this(i2);
    }

    /* renamed from: f */
    private int m2823f(K k2) {
        int size = this.f2757g.size() - 1;
        if (size >= 0) {
            int iCompareTo = k2.compareTo(this.f2757g.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo(this.f2757g.get(i3).getKey());
            if (iCompareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m2824h() {
        if (this.f2759i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m2825j() {
        m2824h();
        if (!this.f2757g.isEmpty() || (this.f2757g instanceof ArrayList)) {
            return;
        }
        this.f2757g = new ArrayList(this.f2756f);
    }

    /* renamed from: o */
    private SortedMap<K, V> m2826o() {
        m2824h();
        if (this.f2758h.isEmpty() && !(this.f2758h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2758h = treeMap;
            this.f2761k = treeMap.descendingMap();
        }
        return (SortedMap) this.f2758h;
    }

    /* renamed from: r */
    static <FieldDescriptorType extends C0415u.b<FieldDescriptorType>> C0382i1<FieldDescriptorType, Object> m2827r(int i2) {
        return new a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public V m2828t(int i2) {
        m2824h();
        V value = this.f2757g.remove(i2).getValue();
        if (!this.f2758h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m2826o().entrySet().iterator();
            this.f2757g.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m2824h();
        if (!this.f2757g.isEmpty()) {
            this.f2757g.clear();
        }
        if (this.f2758h.isEmpty()) {
            return;
        }
        this.f2758h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m2823f(comparable) >= 0 || this.f2758h.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2760j == null) {
            this.f2760j = new g(this, null);
        }
        return this.f2760j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0382i1)) {
            return super.equals(obj);
        }
        C0382i1 c0382i1 = (C0382i1) obj;
        int size = size();
        if (size != c0382i1.size()) {
            return false;
        }
        int iM2831l = m2831l();
        if (iM2831l != c0382i1.m2831l()) {
            return entrySet().equals(c0382i1.entrySet());
        }
        for (int i2 = 0; i2 < iM2831l; i2++) {
            if (!m2830k(i2).equals(c0382i1.m2830k(i2))) {
                return false;
            }
        }
        if (iM2831l != size) {
            return this.f2758h.equals(c0382i1.f2758h);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM2823f = m2823f(comparable);
        return iM2823f >= 0 ? this.f2757g.get(iM2823f).getValue() : this.f2758h.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM2831l = m2831l();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iM2831l; i2++) {
            iHashCode += this.f2757g.get(i2).hashCode();
        }
        return m2832m() > 0 ? iHashCode + this.f2758h.hashCode() : iHashCode;
    }

    /* renamed from: i */
    Set<Map.Entry<K, V>> m2829i() {
        if (this.f2762l == null) {
            this.f2762l = new c(this, null);
        }
        return this.f2762l;
    }

    /* renamed from: k */
    public Map.Entry<K, V> m2830k(int i2) {
        return this.f2757g.get(i2);
    }

    /* renamed from: l */
    public int m2831l() {
        return this.f2757g.size();
    }

    /* renamed from: m */
    public int m2832m() {
        return this.f2758h.size();
    }

    /* renamed from: n */
    public Iterable<Map.Entry<K, V>> m2833n() {
        return this.f2758h.isEmpty() ? d.m2840b() : this.f2758h.entrySet();
    }

    /* renamed from: p */
    public boolean m2834p() {
        return this.f2759i;
    }

    /* renamed from: q */
    public void mo2835q() {
        if (this.f2759i) {
            return;
        }
        this.f2758h = this.f2758h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2758h);
        this.f2761k = this.f2761k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2761k);
        this.f2759i = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m2824h();
        Comparable comparable = (Comparable) obj;
        int iM2823f = m2823f(comparable);
        if (iM2823f >= 0) {
            return m2828t(iM2823f);
        }
        if (this.f2758h.isEmpty()) {
            return null;
        }
        return this.f2758h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k2, V v) {
        m2824h();
        int iM2823f = m2823f(k2);
        if (iM2823f >= 0) {
            return this.f2757g.get(iM2823f).setValue(v);
        }
        m2825j();
        int i2 = -(iM2823f + 1);
        if (i2 >= this.f2756f) {
            return m2826o().put(k2, v);
        }
        int size = this.f2757g.size();
        int i3 = this.f2756f;
        if (size == i3) {
            C0382i1<K, V>.e eVarRemove = this.f2757g.remove(i3 - 1);
            m2826o().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f2757g.add(i2, new e(k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2757g.size() + this.f2758h.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$b */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        private int f2763f;

        /* renamed from: g */
        private Iterator<Map.Entry<K, V>> f2764g;

        private b() {
            this.f2763f = C0382i1.this.f2757g.size();
        }

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> m2837b() {
            if (this.f2764g == null) {
                this.f2764g = C0382i1.this.f2761k.entrySet().iterator();
            }
            return this.f2764g;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (m2837b().hasNext()) {
                return m2837b().next();
            }
            List list = C0382i1.this.f2757g;
            int i2 = this.f2763f - 1;
            this.f2763f = i2;
            return (Map.Entry) list.get(i2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f2763f;
            return (i2 > 0 && i2 <= C0382i1.this.f2757g.size()) || m2837b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(C0382i1 c0382i1, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i1$f */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        private int f2772f;

        /* renamed from: g */
        private boolean f2773g;

        /* renamed from: h */
        private Iterator<Map.Entry<K, V>> f2774h;

        private f() {
            this.f2772f = -1;
        }

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> m2844b() {
            if (this.f2774h == null) {
                this.f2774h = C0382i1.this.f2758h.entrySet().iterator();
            }
            return this.f2774h;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f2773g = true;
            int i2 = this.f2772f + 1;
            this.f2772f = i2;
            return i2 < C0382i1.this.f2757g.size() ? (Map.Entry) C0382i1.this.f2757g.get(this.f2772f) : m2844b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2772f + 1 >= C0382i1.this.f2757g.size()) {
                return !C0382i1.this.f2758h.isEmpty() && m2844b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2773g) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f2773g = false;
            C0382i1.this.m2824h();
            if (this.f2772f >= C0382i1.this.f2757g.size()) {
                m2844b().remove();
                return;
            }
            C0382i1 c0382i1 = C0382i1.this;
            int i2 = this.f2772f;
            this.f2772f = i2 - 1;
            c0382i1.m2828t(i2);
        }

        /* synthetic */ f(C0382i1 c0382i1, a aVar) {
            this();
        }
    }

    private C0382i1(int i2) {
        this.f2756f = i2;
        this.f2757g = Collections.emptyList();
        this.f2758h = Collections.emptyMap();
        this.f2761k = Collections.emptyMap();
    }
}
