package m8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m8.AbstractC4007w;

/* compiled from: ImmutableMultimap.java */
/* renamed from: m8.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3978A<K, V> extends AbstractC3992g<K, V> implements Serializable {

    /* renamed from: F, reason: collision with root package name */
    final transient AbstractC4010z<K, ? extends AbstractC4007w<V>> f45128F;

    /* renamed from: G, reason: collision with root package name */
    final transient int f45129G;

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: m8.A$a */
    class a extends j0<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends AbstractC4007w<V>>> f45130B;

        /* renamed from: C, reason: collision with root package name */
        K f45131C = null;

        /* renamed from: D, reason: collision with root package name */
        Iterator<V> f45132D = C3983F.f();

        a() {
            this.f45130B = AbstractC3978A.this.f45128F.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f45132D.hasNext()) {
                Map.Entry<K, ? extends AbstractC4007w<V>> next = this.f45130B.next();
                this.f45131C = next.getKey();
                this.f45132D = next.getValue().iterator();
            }
            K k10 = this.f45131C;
            Objects.requireNonNull(k10);
            return L.d(k10, this.f45132D.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45132D.hasNext() || this.f45130B.hasNext();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: m8.A$b */
    class b extends j0<V> {

        /* renamed from: B, reason: collision with root package name */
        Iterator<? extends AbstractC4007w<V>> f45134B;

        /* renamed from: C, reason: collision with root package name */
        Iterator<V> f45135C = C3983F.f();

        b() {
            this.f45134B = AbstractC3978A.this.f45128F.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45135C.hasNext() || this.f45134B.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f45135C.hasNext()) {
                this.f45135C = this.f45134B.next().iterator();
            }
            return this.f45135C.next();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: m8.A$c */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Map<K, AbstractC4007w.b<V>> f45137a;

        /* renamed from: b, reason: collision with root package name */
        Comparator<? super K> f45138b;

        /* renamed from: c, reason: collision with root package name */
        Comparator<? super V> f45139c;

        /* renamed from: d, reason: collision with root package name */
        int f45140d = 4;
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: m8.A$d */
    private static class d<K, V> extends AbstractC4007w<Map.Entry<K, V>> {

        /* renamed from: C, reason: collision with root package name */
        final AbstractC3978A<K, V> f45141C;

        d(AbstractC3978A<K, V> abstractC3978A) {
            this.f45141C = abstractC3978A;
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f45141C.c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f45141C.size();
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: v */
        public j0<Map.Entry<K, V>> iterator() {
            return this.f45141C.i();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: m8.A$e */
    private static final class e<K, V> extends AbstractC4007w<V> {

        /* renamed from: C, reason: collision with root package name */
        private final transient AbstractC3978A<K, V> f45142C;

        e(AbstractC3978A<K, V> abstractC3978A) {
            this.f45142C = abstractC3978A;
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f45142C.d(obj);
        }

        @Override // m8.AbstractC4007w
        int f(Object[] objArr, int i10) {
            j0<? extends AbstractC4007w<V>> it = this.f45142C.f45128F.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().f(objArr, i10);
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f45142C.size();
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: v */
        public j0<V> iterator() {
            return this.f45142C.k();
        }
    }

    AbstractC3978A(AbstractC4010z<K, ? extends AbstractC4007w<V>> abstractC4010z, int i10) {
        this.f45128F = abstractC4010z;
        this.f45129G = i10;
    }

    @Override // m8.AbstractC3991f, m8.M
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // m8.M
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // m8.AbstractC3991f
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // m8.AbstractC3991f
    Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // m8.AbstractC3991f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // m8.AbstractC3991f
    Set<K> g() {
        throw new AssertionError("unreachable");
    }

    @Override // m8.AbstractC3991f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // m8.AbstractC3991f, m8.M
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC4010z<K, Collection<V>> b() {
        return this.f45128F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // m8.AbstractC3991f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC4007w<Map.Entry<K, V>> f() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // m8.AbstractC3991f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC4007w<V> h() {
        return new e(this);
    }

    @Override // m8.AbstractC3991f, m8.M
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4007w<Map.Entry<K, V>> a() {
        return (AbstractC4007w) super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // m8.AbstractC3991f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public j0<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // m8.M
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // m8.M
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4007w<V> get(K k10);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // m8.AbstractC3991f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j0<V> k() {
        return new b();
    }

    @Override // m8.AbstractC3991f, m8.M
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // m8.AbstractC3991f, m8.M
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC4007w<V> values() {
        return (AbstractC4007w) super.values();
    }

    @Override // m8.M
    public int size() {
        return this.f45129G;
    }

    @Override // m8.AbstractC3991f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
