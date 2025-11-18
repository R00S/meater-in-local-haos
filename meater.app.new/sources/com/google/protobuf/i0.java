package com.google.protobuf;

import com.google.protobuf.C2958s;
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
/* loaded from: classes2.dex */
class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: B, reason: collision with root package name */
    private final int f39273B;

    /* renamed from: C, reason: collision with root package name */
    private List<i0<K, V>.e> f39274C;

    /* renamed from: D, reason: collision with root package name */
    private Map<K, V> f39275D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f39276E;

    /* renamed from: F, reason: collision with root package name */
    private volatile i0<K, V>.g f39277F;

    /* renamed from: G, reason: collision with root package name */
    private Map<K, V> f39278G;

    /* renamed from: H, reason: collision with root package name */
    private volatile i0<K, V>.c f39279H;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    class a<FieldDescriptorType> extends i0<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.i0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.i0
        public void s() {
            if (!q()) {
                for (int i10 = 0; i10 < m(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryL = l(i10);
                    if (((C2958s.b) entryL.getKey()).isRepeated()) {
                        entryL.setValue(Collections.unmodifiableList((List) entryL.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                    if (((C2958s.b) entry.getKey()).isRepeated()) {
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

        @Override // com.google.protobuf.i0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
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
        private static final Iterator<Object> f39284a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f39285b = new b();

        /* compiled from: SmallSortedMap.java */
        class a implements Iterator<Object> {
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
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f39284a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f39285b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class e implements Map.Entry<K, V>, Comparable<i0<K, V>.e> {

        /* renamed from: B, reason: collision with root package name */
        private final K f39286B;

        /* renamed from: C, reason: collision with root package name */
        private V f39287C;

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
            return j(this.f39286B, entry.getKey()) && j(this.f39287C, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f39287C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f39286B;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f39287C;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f39286B;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            i0.this.i();
            V v11 = this.f39287C;
            this.f39287C = v10;
            return v11;
        }

        public String toString() {
            return this.f39286B + "=" + this.f39287C;
        }

        e(K k10, V v10) {
            this.f39286B = k10;
            this.f39287C = v10;
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
            java.util.List<com.google.protobuf.i0<K, V>$e> r0 = r4.f39274C
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<com.google.protobuf.i0<K, V>$e> r2 = r4.f39274C
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.i0$e r2 = (com.google.protobuf.i0.e) r2
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
            java.util.List<com.google.protobuf.i0<K, V>$e> r3 = r4.f39274C
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.i0$e r3 = (com.google.protobuf.i0.e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i0.h(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f39276E) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f39274C.isEmpty() || (this.f39274C instanceof ArrayList)) {
            return;
        }
        this.f39274C = new ArrayList(this.f39273B);
    }

    private SortedMap<K, V> p() {
        i();
        if (this.f39275D.isEmpty() && !(this.f39275D instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f39275D = treeMap;
            this.f39278G = treeMap.descendingMap();
        }
        return (SortedMap) this.f39275D;
    }

    static <FieldDescriptorType extends C2958s.b<FieldDescriptorType>> i0<FieldDescriptorType, Object> u(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V x(int i10) {
        i();
        V value = this.f39274C.remove(i10).getValue();
        if (!this.f39275D.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.f39274C.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f39274C.isEmpty()) {
            this.f39274C.clear();
        }
        if (this.f39275D.isEmpty()) {
            return;
        }
        this.f39275D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f39275D.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f39277F == null) {
            this.f39277F = new g(this, null);
        }
        return this.f39277F;
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
            return this.f39275D.equals(i0Var.f39275D);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? this.f39274C.get(iH).getValue() : this.f39275D.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iHashCode += this.f39274C.get(i10).hashCode();
        }
        return n() > 0 ? iHashCode + this.f39275D.hashCode() : iHashCode;
    }

    Set<Map.Entry<K, V>> j() {
        if (this.f39279H == null) {
            this.f39279H = new c(this, null);
        }
        return this.f39279H;
    }

    public Map.Entry<K, V> l(int i10) {
        return this.f39274C.get(i10);
    }

    public int m() {
        return this.f39274C.size();
    }

    public int n() {
        return this.f39275D.size();
    }

    public Iterable<Map.Entry<K, V>> o() {
        return this.f39275D.isEmpty() ? d.b() : this.f39275D.entrySet();
    }

    public boolean q() {
        return this.f39276E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return x(iH);
        }
        if (this.f39275D.isEmpty()) {
            return null;
        }
        return this.f39275D.remove(comparable);
    }

    public void s() {
        if (this.f39276E) {
            return;
        }
        this.f39275D = this.f39275D.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f39275D);
        this.f39278G = this.f39278G.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f39278G);
        this.f39276E = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f39274C.size() + this.f39275D.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        i();
        int iH = h(k10);
        if (iH >= 0) {
            return this.f39274C.get(iH).setValue(v10);
        }
        k();
        int i10 = -(iH + 1);
        if (i10 >= this.f39273B) {
            return p().put(k10, v10);
        }
        int size = this.f39274C.size();
        int i11 = this.f39273B;
        if (size == i11) {
            i0<K, V>.e eVarRemove = this.f39274C.remove(i11 - 1);
            p().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f39274C.add(i10, new e(k10, v10));
        return null;
    }

    /* compiled from: SmallSortedMap.java */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        private int f39280B;

        /* renamed from: C, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f39281C;

        private b() {
            this.f39280B = i0.this.f39274C.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f39281C == null) {
                this.f39281C = i0.this.f39278G.entrySet().iterator();
            }
            return this.f39281C;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = i0.this.f39274C;
            int i10 = this.f39280B - 1;
            this.f39280B = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f39280B;
            return (i10 > 0 && i10 <= i0.this.f39274C.size()) || b().hasNext();
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
        private int f39289B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f39290C;

        /* renamed from: D, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f39291D;

        private f() {
            this.f39289B = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f39291D == null) {
                this.f39291D = i0.this.f39275D.entrySet().iterator();
            }
            return this.f39291D;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f39290C = true;
            int i10 = this.f39289B + 1;
            this.f39289B = i10;
            return i10 < i0.this.f39274C.size() ? (Map.Entry) i0.this.f39274C.get(this.f39289B) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f39289B + 1 >= i0.this.f39274C.size()) {
                return !i0.this.f39275D.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f39290C) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f39290C = false;
            i0.this.i();
            if (this.f39289B >= i0.this.f39274C.size()) {
                b().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f39289B;
            this.f39289B = i10 - 1;
            i0Var.x(i10);
        }

        /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    private i0(int i10) {
        this.f39273B = i10;
        this.f39274C = Collections.emptyList();
        this.f39275D = Collections.emptyMap();
        this.f39278G = Collections.emptyMap();
    }
}
