package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes3.dex */
class t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: B, reason: collision with root package name */
    private final int f44113B;

    /* renamed from: C, reason: collision with root package name */
    private List<t<K, V>.c> f44114C;

    /* renamed from: D, reason: collision with root package name */
    private Map<K, V> f44115D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f44116E;

    /* renamed from: F, reason: collision with root package name */
    private volatile t<K, V>.e f44117F;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    static class a<FieldDescriptorType> extends t<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t
        public void o() {
            if (!n()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryJ = j(i10);
                    if (((g.b) entryJ.getKey()).isRepeated()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : l()) {
                    if (((g.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.q((g.b) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f44118a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f44119b = new C0584b();

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
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b, reason: collision with other inner class name */
        static class C0584b implements Iterable<Object> {
            C0584b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f44118a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f44119b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class c implements Comparable<t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: B, reason: collision with root package name */
        private final K f44120B;

        /* renamed from: C, reason: collision with root package name */
        private V f44121C;

        c(t tVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean j(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
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
            return j(this.f44120B, entry.getKey()) && j(this.f44121C, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f44121C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f44120B;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f44121C;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f44120B;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            t.this.h();
            V v11 = this.f44121C;
            this.f44121C = v10;
            return v11;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f44120B);
            String strValueOf2 = String.valueOf(this.f44121C);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        c(K k10, V v10) {
            this.f44120B = k10;
            this.f44121C = v10;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            t.this.q(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            t.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.size();
        }

        /* synthetic */ e(t tVar, a aVar) {
            this();
        }
    }

    /* synthetic */ t(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int g(K r5) {
        /*
            r4 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.t<K, V>$c> r0 = r4.f44114C
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.t<K, V>$c> r2 = r4.f44114C
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.t$c r2 = (kotlin.reflect.jvm.internal.impl.protobuf.t.c) r2
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
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.t<K, V>$c> r3 = r4.f44114C
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.t$c r3 = (kotlin.reflect.jvm.internal.impl.protobuf.t.c) r3
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.t.g(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f44116E) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        h();
        if (!this.f44114C.isEmpty() || (this.f44114C instanceof ArrayList)) {
            return;
        }
        this.f44114C = new ArrayList(this.f44113B);
    }

    private SortedMap<K, V> m() {
        h();
        if (this.f44115D.isEmpty() && !(this.f44115D instanceof TreeMap)) {
            this.f44115D = new TreeMap();
        }
        return (SortedMap) this.f44115D;
    }

    static <FieldDescriptorType extends g.b<FieldDescriptorType>> t<FieldDescriptorType, Object> p(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i10) {
        h();
        V value = this.f44114C.remove(i10).getValue();
        if (!this.f44115D.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m().entrySet().iterator();
            this.f44114C.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f44114C.isEmpty()) {
            this.f44114C.clear();
        }
        if (this.f44115D.isEmpty()) {
            return;
        }
        this.f44115D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f44115D.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f44117F == null) {
            this.f44117F = new e(this, null);
        }
        return this.f44117F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? this.f44114C.get(iG).getValue() : this.f44115D.get(comparable);
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f44114C.get(i10);
    }

    public int k() {
        return this.f44114C.size();
    }

    public Iterable<Map.Entry<K, V>> l() {
        return this.f44115D.isEmpty() ? b.b() : this.f44115D.entrySet();
    }

    public boolean n() {
        return this.f44116E;
    }

    public void o() {
        if (this.f44116E) {
            return;
        }
        this.f44115D = this.f44115D.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f44115D);
        this.f44116E = true;
    }

    public V q(K k10, V v10) {
        h();
        int iG = g(k10);
        if (iG >= 0) {
            return this.f44114C.get(iG).setValue(v10);
        }
        i();
        int i10 = -(iG + 1);
        if (i10 >= this.f44113B) {
            return m().put(k10, v10);
        }
        int size = this.f44114C.size();
        int i11 = this.f44113B;
        if (size == i11) {
            t<K, V>.c cVarRemove = this.f44114C.remove(i11 - 1);
            m().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f44114C.add(i10, new c(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return s(iG);
        }
        if (this.f44115D.isEmpty()) {
            return null;
        }
        return this.f44115D.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f44114C.size() + this.f44115D.size();
    }

    /* compiled from: SmallSortedMap.java */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        private int f44123B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f44124C;

        /* renamed from: D, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f44125D;

        private d() {
            this.f44123B = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f44125D == null) {
                this.f44125D = t.this.f44115D.entrySet().iterator();
            }
            return this.f44125D;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f44124C = true;
            int i10 = this.f44123B + 1;
            this.f44123B = i10;
            return i10 < t.this.f44114C.size() ? (Map.Entry) t.this.f44114C.get(this.f44123B) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44123B + 1 < t.this.f44114C.size() || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f44124C) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f44124C = false;
            t.this.h();
            if (this.f44123B >= t.this.f44114C.size()) {
                b().remove();
                return;
            }
            t tVar = t.this;
            int i10 = this.f44123B;
            this.f44123B = i10 - 1;
            tVar.s(i10);
        }

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }
    }

    private t(int i10) {
        this.f44113B = i10;
        this.f44114C = Collections.emptyList();
        this.f44115D = Collections.emptyMap();
    }
}
