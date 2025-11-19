package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2073t;
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
/* loaded from: classes.dex */
class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: B, reason: collision with root package name */
    private final int f24961B;

    /* renamed from: C, reason: collision with root package name */
    private List<i0<K, V>.e> f24962C;

    /* renamed from: D, reason: collision with root package name */
    private Map<K, V> f24963D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f24964E;

    /* renamed from: F, reason: collision with root package name */
    private volatile i0<K, V>.g f24965F;

    /* renamed from: G, reason: collision with root package name */
    private Map<K, V> f24966G;

    /* renamed from: H, reason: collision with root package name */
    private volatile i0<K, V>.c f24967H;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    static class a<FieldDescriptorType> extends i0<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // androidx.datastore.preferences.protobuf.i0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C2073t.b) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void s() {
            if (!q()) {
                for (int i10 = 0; i10 < m(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryL = l(i10);
                    if (((C2073t.b) entryL.getKey()).isRepeated()) {
                        entryL.setValue(Collections.unmodifiableList((List) entryL.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                    if (((C2073t.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.s();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class c extends i0<K, V>.g {
        private c() {
            super(i0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(i0.this, null);
        }

        /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f24972a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f24973b = new b();

        /* compiled from: SmallSortedMap.java */
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
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f24972a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f24973b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class e implements Map.Entry<K, V>, Comparable<i0<K, V>.e> {

        /* renamed from: B, reason: collision with root package name */
        private final K f24974B;

        /* renamed from: C, reason: collision with root package name */
        private V f24975C;

        e(i0 i0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean j(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(i0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return j(this.f24974B, entry.getKey()) && j(this.f24975C, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f24975C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f24974B;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f24975C;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f24974B;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            i0.this.i();
            V v11 = this.f24975C;
            this.f24975C = v10;
            return v11;
        }

        public String toString() {
            return this.f24974B + "=" + this.f24975C;
        }

        e(K k10, V v10) {
            this.f24974B = k10;
            this.f24975C = v10;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            i0.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(i0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i0.this.size();
        }

        /* synthetic */ g(i0 i0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ i0(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int h(K r5) {
        /*
            r4 = this;
            java.util.List<androidx.datastore.preferences.protobuf.i0<K, V>$e> r0 = r4.f24962C
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<androidx.datastore.preferences.protobuf.i0<K, V>$e> r2 = r4.f24962C
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.i0$e r2 = (androidx.datastore.preferences.protobuf.i0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<androidx.datastore.preferences.protobuf.i0<K, V>$e> r3 = r4.f24962C
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.i0$e r3 = (androidx.datastore.preferences.protobuf.i0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i0.h(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f24964E) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f24962C.isEmpty() || (this.f24962C instanceof ArrayList)) {
            return;
        }
        this.f24962C = new ArrayList(this.f24961B);
    }

    private SortedMap<K, V> p() {
        i();
        if (this.f24963D.isEmpty() && !(this.f24963D instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24963D = treeMap;
            this.f24966G = treeMap.descendingMap();
        }
        return (SortedMap) this.f24963D;
    }

    static <FieldDescriptorType extends C2073t.b<FieldDescriptorType>> i0<FieldDescriptorType, Object> u(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V x(int i10) {
        i();
        V value = this.f24962C.remove(i10).getValue();
        if (!this.f24963D.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.f24962C.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f24962C.isEmpty()) {
            this.f24962C.clear();
        }
        if (this.f24963D.isEmpty()) {
            return;
        }
        this.f24963D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f24963D.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f24965F == null) {
            this.f24965F = new g(this, null);
        }
        return this.f24965F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != i0Var.m()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (!l(i10).equals(i0Var.l(i10))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f24963D.equals(i0Var.f24963D);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? this.f24962C.get(iH).getValue() : this.f24963D.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iHashCode += this.f24962C.get(i10).hashCode();
        }
        return n() > 0 ? iHashCode + this.f24963D.hashCode() : iHashCode;
    }

    Set<Map.Entry<K, V>> j() {
        if (this.f24967H == null) {
            this.f24967H = new c(this, null);
        }
        return this.f24967H;
    }

    public Map.Entry<K, V> l(int i10) {
        return this.f24962C.get(i10);
    }

    public int m() {
        return this.f24962C.size();
    }

    public int n() {
        return this.f24963D.size();
    }

    public Iterable<Map.Entry<K, V>> o() {
        return this.f24963D.isEmpty() ? d.b() : this.f24963D.entrySet();
    }

    public boolean q() {
        return this.f24964E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return x(iH);
        }
        if (this.f24963D.isEmpty()) {
            return null;
        }
        return this.f24963D.remove(comparable);
    }

    public void s() {
        if (this.f24964E) {
            return;
        }
        this.f24963D = this.f24963D.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24963D);
        this.f24966G = this.f24966G.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24966G);
        this.f24964E = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f24962C.size() + this.f24963D.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        i();
        int iH = h(k10);
        if (iH >= 0) {
            return this.f24962C.get(iH).setValue(v10);
        }
        k();
        int i10 = -(iH + 1);
        if (i10 >= this.f24961B) {
            return p().put(k10, v10);
        }
        int size = this.f24962C.size();
        int i11 = this.f24961B;
        if (size == i11) {
            i0<K, V>.e eVarRemove = this.f24962C.remove(i11 - 1);
            p().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f24962C.add(i10, new e(k10, v10));
        return null;
    }

    /* compiled from: SmallSortedMap.java */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        private int f24968B;

        /* renamed from: C, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f24969C;

        private b() {
            this.f24968B = i0.this.f24962C.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f24969C == null) {
                this.f24969C = i0.this.f24966G.entrySet().iterator();
            }
            return this.f24969C;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = i0.this.f24962C;
            int i10 = this.f24968B - 1;
            this.f24968B = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f24968B;
            return (i10 > 0 && i10 <= i0.this.f24962C.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        private int f24977B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f24978C;

        /* renamed from: D, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f24979D;

        private f() {
            this.f24977B = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f24979D == null) {
                this.f24979D = i0.this.f24963D.entrySet().iterator();
            }
            return this.f24979D;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f24978C = true;
            int i10 = this.f24977B + 1;
            this.f24977B = i10;
            return i10 < i0.this.f24962C.size() ? (Map.Entry) i0.this.f24962C.get(this.f24977B) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24977B + 1 >= i0.this.f24962C.size()) {
                return !i0.this.f24963D.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f24978C) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f24978C = false;
            i0.this.i();
            if (this.f24977B >= i0.this.f24962C.size()) {
                b().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f24977B;
            this.f24977B = i10 - 1;
            i0Var.x(i10);
        }

        /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    private i0(int i10) {
        this.f24961B = i10;
        this.f24962C = Collections.emptyList();
        this.f24963D = Collections.emptyMap();
        this.f24966G = Collections.emptyMap();
    }
}
