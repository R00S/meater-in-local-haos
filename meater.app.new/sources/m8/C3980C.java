package m8;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import l8.C3916i;
import m8.AbstractC3978A;
import m8.AbstractC3979B;
import m8.AbstractC4007w;
import m8.AbstractC4010z;

/* compiled from: ImmutableSetMultimap.java */
/* renamed from: m8.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3980C<K, V> extends AbstractC3978A<K, V> implements c0<K, V> {

    /* renamed from: H, reason: collision with root package name */
    private final transient AbstractC3979B<V> f45146H;

    /* renamed from: I, reason: collision with root package name */
    private transient AbstractC3979B<Map.Entry<K, V>> f45147I;

    /* compiled from: ImmutableSetMultimap.java */
    /* renamed from: m8.C$a */
    public static final class a<K, V> extends AbstractC3978A.c<K, V> {
        public C3980C<K, V> a() {
            Map<K, AbstractC4007w.b<V>> map = this.f45137a;
            if (map == null) {
                return C3980C.x();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator<? super K> comparator = this.f45138b;
            if (comparator != null) {
                collectionEntrySet = U.b(comparator).e().c(collectionEntrySet);
            }
            return C3980C.v(collectionEntrySet, this.f45139c);
        }
    }

    /* compiled from: ImmutableSetMultimap.java */
    /* renamed from: m8.C$b */
    private static final class b<K, V> extends AbstractC3979B<Map.Entry<K, V>> {

        /* renamed from: D, reason: collision with root package name */
        private final transient C3980C<K, V> f45148D;

        b(C3980C<K, V> c3980c) {
            this.f45148D = c3980c;
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f45148D.c(entry.getKey(), entry.getValue());
        }

        @Override // m8.AbstractC4007w
        boolean r() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f45148D.size();
        }

        @Override // m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: v */
        public j0<Map.Entry<K, V>> iterator() {
            return this.f45148D.i();
        }
    }

    C3980C(AbstractC4010z<K, AbstractC3979B<V>> abstractC4010z, int i10, Comparator<? super V> comparator) {
        super(abstractC4010z, i10);
        this.f45146H = t(comparator);
    }

    private static <V> AbstractC3979B<V> t(Comparator<? super V> comparator) {
        return comparator == null ? AbstractC3979B.I() : AbstractC3981D.Z(comparator);
    }

    static <K, V> C3980C<K, V> v(Collection<? extends Map.Entry<K, AbstractC4007w.b<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return x();
        }
        AbstractC4010z.a aVar = new AbstractC4010z.a(collection.size());
        int size = 0;
        for (Map.Entry<K, AbstractC4007w.b<V>> entry : collection) {
            K key = entry.getKey();
            AbstractC3979B abstractC3979BY = y(comparator, ((AbstractC3979B.a) entry.getValue()).m());
            if (!abstractC3979BY.isEmpty()) {
                aVar.g(key, abstractC3979BY);
                size += abstractC3979BY.size();
            }
        }
        return new C3980C<>(aVar.d(), size, comparator);
    }

    public static <K, V> C3980C<K, V> x() {
        return C4001p.f45369J;
    }

    private static <V> AbstractC3979B<V> y(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? AbstractC3979B.D(collection) : AbstractC3981D.T(comparator, collection);
    }

    @Override // m8.AbstractC3978A
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC3979B<Map.Entry<K, V>> a() {
        AbstractC3979B<Map.Entry<K, V>> abstractC3979B = this.f45147I;
        if (abstractC3979B != null) {
            return abstractC3979B;
        }
        b bVar = new b(this);
        this.f45147I = bVar;
        return bVar;
    }

    @Override // m8.AbstractC3978A
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC3979B<V> get(K k10) {
        return (AbstractC3979B) C3916i.a((AbstractC3979B) this.f45128F.get(k10), this.f45146H);
    }
}
