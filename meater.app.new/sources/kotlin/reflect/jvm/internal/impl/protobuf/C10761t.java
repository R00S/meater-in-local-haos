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
import kotlin.reflect.jvm.internal.impl.protobuf.C10748g;

/* compiled from: SmallSortedMap.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t */
/* loaded from: classes3.dex */
class C10761t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f41351f;

    /* renamed from: g */
    private List<C10761t<K, V>.c> f41352g;

    /* renamed from: h */
    private Map<K, V> f41353h;

    /* renamed from: i */
    private boolean f41354i;

    /* renamed from: j */
    private volatile C10761t<K, V>.e f41355j;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$a */
    static class a<FieldDescriptorType> extends C10761t<FieldDescriptorType, Object> {
        a(int i2) {
            super(i2, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10761t
        /* renamed from: n */
        public void mo38468n() {
            if (!m38467m()) {
                for (int i2 = 0; i2 < m38465j(); i2++) {
                    Map.Entry<FieldDescriptorType, Object> entryM38464i = m38464i(i2);
                    if (((C10748g.b) entryM38464i.getKey()).mo38378h()) {
                        entryM38464i.setValue(Collections.unmodifiableList((List) entryM38464i.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m38466k()) {
                    if (((C10748g.b) entry.getKey()).mo38378h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo38468n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m38469p((C10748g.b) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b */
    private static class b {

        /* renamed from: a */
        private static final Iterator<Object> f41356a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f41357b = new C11582b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$a */
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
        static class C11582b implements Iterable<Object> {
            C11582b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f41356a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m38471b() {
            return (Iterable<T>) f41357b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$c */
    private class c implements Comparable<C10761t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: f */
        private final K f41358f;

        /* renamed from: g */
        private V f41359g;

        c(C10761t c10761t, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: k */
        private boolean m38472k(Object obj, Object obj2) {
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
            return m38472k(this.f41358f, entry.getKey()) && m38472k(this.f41359g, entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(C10761t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f41359g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f41358f;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f41359g;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f41358f;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C10761t.this.m38459f();
            V v2 = this.f41359g;
            this.f41359g = v;
            return v2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f41358f);
            String strValueOf2 = String.valueOf(this.f41359g);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        c(K k2, V v) {
            this.f41358f = k2;
            this.f41359g = v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$e */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C10761t.this.m38469p(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C10761t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C10761t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(C10761t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C10761t.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C10761t.this.size();
        }

        /* synthetic */ e(C10761t c10761t, a aVar) {
            this();
        }
    }

    /* synthetic */ C10761t(int i2, a aVar) {
        this(i2);
    }

    /* renamed from: e */
    private int m38458e(K k2) {
        int size = this.f41352g.size() - 1;
        if (size >= 0) {
            int iCompareTo = k2.compareTo(this.f41352g.get(size).getKey());
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
            int iCompareTo2 = k2.compareTo(this.f41352g.get(i3).getKey());
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
    /* renamed from: f */
    public void m38459f() {
        if (this.f41354i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    private void m38460h() {
        m38459f();
        if (!this.f41352g.isEmpty() || (this.f41352g instanceof ArrayList)) {
            return;
        }
        this.f41352g = new ArrayList(this.f41351f);
    }

    /* renamed from: l */
    private SortedMap<K, V> m38461l() {
        m38459f();
        if (this.f41353h.isEmpty() && !(this.f41353h instanceof TreeMap)) {
            this.f41353h = new TreeMap();
        }
        return (SortedMap) this.f41353h;
    }

    /* renamed from: o */
    static <FieldDescriptorType extends C10748g.b<FieldDescriptorType>> C10761t<FieldDescriptorType, Object> m38462o(int i2) {
        return new a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public V m38463q(int i2) {
        m38459f();
        V value = this.f41352g.remove(i2).getValue();
        if (!this.f41353h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m38461l().entrySet().iterator();
            this.f41352g.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m38459f();
        if (!this.f41352g.isEmpty()) {
            this.f41352g.clear();
        }
        if (this.f41353h.isEmpty()) {
            return;
        }
        this.f41353h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m38458e(comparable) >= 0 || this.f41353h.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f41355j == null) {
            this.f41355j = new e(this, null);
        }
        return this.f41355j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM38458e = m38458e(comparable);
        return iM38458e >= 0 ? this.f41352g.get(iM38458e).getValue() : this.f41353h.get(comparable);
    }

    /* renamed from: i */
    public Map.Entry<K, V> m38464i(int i2) {
        return this.f41352g.get(i2);
    }

    /* renamed from: j */
    public int m38465j() {
        return this.f41352g.size();
    }

    /* renamed from: k */
    public Iterable<Map.Entry<K, V>> m38466k() {
        return this.f41353h.isEmpty() ? b.m38471b() : this.f41353h.entrySet();
    }

    /* renamed from: m */
    public boolean m38467m() {
        return this.f41354i;
    }

    /* renamed from: n */
    public void mo38468n() {
        if (this.f41354i) {
            return;
        }
        this.f41353h = this.f41353h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f41353h);
        this.f41354i = true;
    }

    /* renamed from: p */
    public V m38469p(K k2, V v) {
        m38459f();
        int iM38458e = m38458e(k2);
        if (iM38458e >= 0) {
            return this.f41352g.get(iM38458e).setValue(v);
        }
        m38460h();
        int i2 = -(iM38458e + 1);
        if (i2 >= this.f41351f) {
            return m38461l().put(k2, v);
        }
        int size = this.f41352g.size();
        int i3 = this.f41351f;
        if (size == i3) {
            C10761t<K, V>.c cVarRemove = this.f41352g.remove(i3 - 1);
            m38461l().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f41352g.add(i2, new c(k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m38459f();
        Comparable comparable = (Comparable) obj;
        int iM38458e = m38458e(comparable);
        if (iM38458e >= 0) {
            return m38463q(iM38458e);
        }
        if (this.f41353h.isEmpty()) {
            return null;
        }
        return this.f41353h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f41352g.size() + this.f41353h.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$d */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        private int f41361f;

        /* renamed from: g */
        private boolean f41362g;

        /* renamed from: h */
        private Iterator<Map.Entry<K, V>> f41363h;

        private d() {
            this.f41361f = -1;
        }

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> m38475b() {
            if (this.f41363h == null) {
                this.f41363h = C10761t.this.f41353h.entrySet().iterator();
            }
            return this.f41363h;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f41362g = true;
            int i2 = this.f41361f + 1;
            this.f41361f = i2;
            return i2 < C10761t.this.f41352g.size() ? (Map.Entry) C10761t.this.f41352g.get(this.f41361f) : m38475b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41361f + 1 < C10761t.this.f41352g.size() || m38475b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f41362g) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f41362g = false;
            C10761t.this.m38459f();
            if (this.f41361f >= C10761t.this.f41352g.size()) {
                m38475b().remove();
                return;
            }
            C10761t c10761t = C10761t.this;
            int i2 = this.f41361f;
            this.f41361f = i2 - 1;
            c10761t.m38463q(i2);
        }

        /* synthetic */ d(C10761t c10761t, a aVar) {
            this();
        }
    }

    private C10761t(int i2) {
        this.f41351f = i2;
        this.f41352g = Collections.emptyList();
        this.f41353h = Collections.emptyMap();
    }
}
