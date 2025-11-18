package m8;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l8.C3918k;
import l8.InterfaceC3914g;
import m8.d0;

/* compiled from: Maps.java */
/* loaded from: classes2.dex */
public final class L {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    class a<K, V> extends h0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.h0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public V b(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    private static abstract class b implements InterfaceC3914g<Map.Entry<?, ?>, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f45232B = new a("KEY", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final b f45233C = new C0609b("VALUE", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ b[] f45234D = c();

        /* compiled from: Maps.java */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // l8.InterfaceC3914g
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        /* renamed from: m8.L$b$b, reason: collision with other inner class name */
        enum C0609b extends b {
            C0609b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // l8.InterfaceC3914g
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
        }

        private static /* synthetic */ b[] c() {
            return new b[]{f45232B, f45233C};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f45234D.clone();
        }

        /* synthetic */ b(String str, int i10, K k10) {
            this(str, i10);
        }
    }

    /* compiled from: Maps.java */
    static abstract class c<K, V> extends d0.e<Map.Entry<K, V>> {
        c() {
        }

        abstract Map<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // m8.d0.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) l8.m.l(collection));
            } catch (UnsupportedOperationException unused) {
                return d0.j(this, collection.iterator());
            }
        }

        @Override // m8.d0.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) l8.m.l(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = d0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return c().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    /* compiled from: Maps.java */
    static class d<K, V> extends d0.e<K> {

        /* renamed from: B, reason: collision with root package name */
        final Map<K, V> f45235B;

        d(Map<K, V> map) {
            this.f45235B = (Map) l8.m.l(map);
        }

        Map<K, V> c() {
            return this.f45235B;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    /* compiled from: Maps.java */
    static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: B, reason: collision with root package name */
        final Map<K, V> f45236B;

        e(Map<K, V> map) {
            this.f45236B = (Map) l8.m.l(map);
        }

        final Map<K, V> c() {
            return this.f45236B;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return L.n(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (C3918k.a(obj, entry.getValue())) {
                        c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) l8.m.l(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = d0.f();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return c().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) l8.m.l(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = d0.f();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return c().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    /* compiled from: Maps.java */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: B, reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f45237B;

        /* renamed from: C, reason: collision with root package name */
        private transient Collection<V> f45238C;

        f() {
        }

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f45237B;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f45237B = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f45238C;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f45238C = collectionB;
            return collectionB;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            C3994i.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(i10 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return C3983F.d(n(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new C4008x(k10, v10);
    }

    static <K> InterfaceC3914g<Map.Entry<K, ?>, K> e() {
        return b.f45232B;
    }

    public static <K, V> HashMap<K, V> f() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> g(int i10) {
        return new HashMap<>(a(i10));
    }

    public static <K, V> IdentityHashMap<K, V> h() {
        return new IdentityHashMap<>();
    }

    static boolean i(Map<?, ?> map, Object obj) {
        l8.m.l(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V j(Map<?, V> map, Object obj) {
        l8.m.l(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V k(Map<?, V> map, Object obj) {
        l8.m.l(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String l(Map<?, ?> map) {
        StringBuilder sbB = C3995j.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    static <V> InterfaceC3914g<Map.Entry<?, V>, V> m() {
        return b.f45233C;
    }

    static <K, V> Iterator<V> n(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
