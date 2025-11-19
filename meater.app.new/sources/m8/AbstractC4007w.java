package m8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: ImmutableCollection.java */
/* renamed from: m8.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4007w<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    private static final Object[] f45372B = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* renamed from: m8.w$a */
    static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f45373a;

        /* renamed from: b, reason: collision with root package name */
        int f45374b;

        /* renamed from: c, reason: collision with root package name */
        boolean f45375c;

        a(int i10) {
            C3994i.b(i10, "initialCapacity");
            this.f45373a = new Object[i10];
            this.f45374b = 0;
        }

        private void g(int i10) {
            Object[] objArr = this.f45373a;
            int iC = b.c(objArr.length, this.f45374b + i10);
            if (iC > objArr.length || this.f45375c) {
                this.f45373a = Arrays.copyOf(this.f45373a, iC);
                this.f45375c = false;
            }
        }

        @Override // m8.AbstractC4007w.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof AbstractC4007w) {
                    this.f45374b = ((AbstractC4007w) collection).f(this.f45373a, this.f45374b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e10) {
            l8.m.l(e10);
            g(1);
            Object[] objArr = this.f45373a;
            int i10 = this.f45374b;
            this.f45374b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        final void f(Object[] objArr, int i10) {
            T.c(objArr, i10);
            g(i10);
            System.arraycopy(objArr, 0, this.f45373a, this.f45374b, i10);
            this.f45374b += i10;
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* renamed from: m8.w$b */
    public static abstract class b<E> {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    AbstractC4007w() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public AbstractC4009y<E> c() {
        return isEmpty() ? AbstractC4009y.G() : AbstractC4009y.w(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    int f(Object[] objArr, int i10) {
        j0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    Object[] h() {
        return null;
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    abstract boolean r();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f45372B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v */
    public abstract j0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        l8.m.l(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrH = h();
            if (objArrH != null) {
                return (T[]) V.a(objArrH, j(), i(), tArr);
            }
            tArr = (T[]) T.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
