package m8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: RegularImmutableSortedSet.java */
/* loaded from: classes2.dex */
final class Z<E> extends AbstractC3981D<E> {

    /* renamed from: G, reason: collision with root package name */
    static final Z<Comparable> f45270G = new Z<>(AbstractC4009y.G(), U.d());

    /* renamed from: F, reason: collision with root package name */
    final transient AbstractC4009y<E> f45271F;

    Z(AbstractC4009y<E> abstractC4009y, Comparator<? super E> comparator) {
        super(comparator);
        this.f45271F = abstractC4009y;
    }

    private int r0(Object obj) {
        return Collections.binarySearch(this.f45271F, obj, s0());
    }

    @Override // m8.AbstractC3981D
    AbstractC3981D<E> U() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f45149D);
        return isEmpty() ? AbstractC3981D.Z(comparatorReverseOrder) : new Z(this.f45271F.O(), comparatorReverseOrder);
    }

    @Override // m8.AbstractC3981D, java.util.NavigableSet
    /* renamed from: V */
    public j0<E> descendingIterator() {
        return this.f45271F.O().iterator();
    }

    @Override // m8.AbstractC3979B, m8.AbstractC4007w
    public AbstractC4009y<E> c() {
        return this.f45271F;
    }

    @Override // m8.AbstractC3981D
    AbstractC3981D<E> c0(E e10, boolean z10) {
        return m0(0, n0(e10, z10));
    }

    @Override // m8.AbstractC3981D, java.util.NavigableSet
    public E ceiling(E e10) {
        int iQ0 = q0(e10, true);
        if (iQ0 == size()) {
            return null;
        }
        return this.f45271F.get(iQ0);
    }

    @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return r0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof P) {
            collection = ((P) collection).N();
        }
        if (!g0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        j0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iK0 = k0(next2, next);
                if (iK0 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iK0 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iK0 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // m8.AbstractC3979B, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!g0.b(this.f45149D, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            j0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || k0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // m8.AbstractC4007w
    int f(Object[] objArr, int i10) {
        return this.f45271F.f(objArr, i10);
    }

    @Override // m8.AbstractC3981D
    AbstractC3981D<E> f0(E e10, boolean z10, E e11, boolean z11) {
        return j0(e10, z10).c0(e11, z11);
    }

    @Override // m8.AbstractC3981D, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f45271F.get(0);
    }

    @Override // m8.AbstractC3981D, java.util.NavigableSet
    public E floor(E e10) {
        int iN0 = n0(e10, true) - 1;
        if (iN0 == -1) {
            return null;
        }
        return this.f45271F.get(iN0);
    }

    @Override // m8.AbstractC4007w
    Object[] h() {
        return this.f45271F.h();
    }

    @Override // m8.AbstractC3981D, java.util.NavigableSet
    public E higher(E e10) {
        int iQ0 = q0(e10, false);
        if (iQ0 == size()) {
            return null;
        }
        return this.f45271F.get(iQ0);
    }

    @Override // m8.AbstractC4007w
    int i() {
        return this.f45271F.i();
    }

    @Override // m8.AbstractC4007w
    int j() {
        return this.f45271F.j();
    }

    @Override // m8.AbstractC3981D
    AbstractC3981D<E> j0(E e10, boolean z10) {
        return m0(q0(e10, z10), size());
    }

    @Override // m8.AbstractC3981D, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f45271F.get(size() - 1);
    }

    @Override // m8.AbstractC3981D, java.util.NavigableSet
    public E lower(E e10) {
        int iN0 = n0(e10, false) - 1;
        if (iN0 == -1) {
            return null;
        }
        return this.f45271F.get(iN0);
    }

    Z<E> m0(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new Z<>(this.f45271F.subList(i10, i11), this.f45149D) : AbstractC3981D.Z(this.f45149D);
    }

    int n0(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f45271F, l8.m.l(e10), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    int q0(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f45271F, l8.m.l(e10), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // m8.AbstractC4007w
    boolean r() {
        return this.f45271F.r();
    }

    Comparator<Object> s0() {
        return this.f45149D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f45271F.size();
    }

    @Override // m8.AbstractC3981D, m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v */
    public j0<E> iterator() {
        return this.f45271F.iterator();
    }
}
