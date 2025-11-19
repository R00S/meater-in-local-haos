package m8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: ImmutableSortedSet.java */
/* renamed from: m8.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3981D<E> extends AbstractC3979B<E> implements NavigableSet<E>, f0<E> {

    /* renamed from: D, reason: collision with root package name */
    final transient Comparator<? super E> f45149D;

    /* renamed from: E, reason: collision with root package name */
    transient AbstractC3981D<E> f45150E;

    AbstractC3981D(Comparator<? super E> comparator) {
        this.f45149D = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> AbstractC3981D<E> R(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return Z(comparator);
        }
        T.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            A.B b10 = (Object) eArr[i12];
            if (comparator.compare(b10, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = b10;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new Z(AbstractC4009y.x(eArr, i11), comparator);
    }

    public static <E> AbstractC3981D<E> S(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        l8.m.l(comparator);
        if (g0.b(comparator, iterable) && (iterable instanceof AbstractC3981D)) {
            AbstractC3981D<E> abstractC3981D = (AbstractC3981D) iterable;
            if (!abstractC3981D.r()) {
                return abstractC3981D;
            }
        }
        Object[] objArrK = C3982E.k(iterable);
        return R(comparator, objArrK.length, objArrK);
    }

    public static <E> AbstractC3981D<E> T(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return S(comparator, collection);
    }

    static <E> Z<E> Z(Comparator<? super E> comparator) {
        return U.d().equals(comparator) ? (Z<E>) Z.f45270G : new Z<>(AbstractC4009y.G(), comparator);
    }

    static int l0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract AbstractC3981D<E> U();

    @Override // java.util.NavigableSet
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public abstract j0<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> descendingSet() {
        AbstractC3981D<E> abstractC3981D = this.f45150E;
        if (abstractC3981D != null) {
            return abstractC3981D;
        }
        AbstractC3981D<E> abstractC3981DU = U();
        this.f45150E = abstractC3981DU;
        abstractC3981DU.f45150E = this;
        return abstractC3981DU;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> headSet(E e10, boolean z10) {
        return c0(l8.m.l(e10), z10);
    }

    abstract AbstractC3981D<E> c0(E e10, boolean z10);

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        return (E) C3982E.d(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, m8.f0
    public Comparator<? super E> comparator() {
        return this.f45149D;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        l8.m.l(e10);
        l8.m.l(e11);
        l8.m.d(this.f45149D.compare(e10, e11) <= 0);
        return f0(e10, z10, e11, z11);
    }

    abstract AbstractC3981D<E> f0(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return (E) C3983F.l(headSet(e10, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public AbstractC3981D<E> tailSet(E e10, boolean z10) {
        return j0(l8.m.l(e10), z10);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return (E) C3982E.d(tailSet(e10, false), null);
    }

    abstract AbstractC3981D<E> j0(E e10, boolean z10);

    int k0(Object obj, Object obj2) {
        return l0(this.f45149D, obj, obj2);
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        return (E) C3983F.l(headSet(e10, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v */
    public abstract j0<E> iterator();
}
