package m8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m8.AbstractC4007w;

/* compiled from: ImmutableList.java */
/* renamed from: m8.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4009y<E> extends AbstractC4007w<E> implements List<E>, RandomAccess {

    /* renamed from: C, reason: collision with root package name */
    private static final k0<Object> f45378C = new b(W.f45246F, 0);

    /* compiled from: ImmutableList.java */
    /* renamed from: m8.y$a */
    public static final class a<E> extends AbstractC4007w.a<E> {
        public a() {
            this(4);
        }

        @Override // m8.AbstractC4007w.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC4009y<E> k() {
            this.f45375c = true;
            return AbstractC4009y.x(this.f45373a, this.f45374b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: m8.y$b */
    static class b<E> extends AbstractC3986a<E> {

        /* renamed from: D, reason: collision with root package name */
        private final AbstractC4009y<E> f45379D;

        b(AbstractC4009y<E> abstractC4009y, int i10) {
            super(abstractC4009y.size(), i10);
            this.f45379D = abstractC4009y;
        }

        @Override // m8.AbstractC3986a
        protected E b(int i10) {
            return this.f45379D.get(i10);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: m8.y$c */
    private static class c<E> extends AbstractC4009y<E> {

        /* renamed from: D, reason: collision with root package name */
        private final transient AbstractC4009y<E> f45380D;

        c(AbstractC4009y<E> abstractC4009y) {
            this.f45380D = abstractC4009y;
        }

        private int T(int i10) {
            return (size() - 1) - i10;
        }

        private int U(int i10) {
            return size() - i10;
        }

        @Override // m8.AbstractC4009y
        public AbstractC4009y<E> O() {
            return this.f45380D;
        }

        @Override // m8.AbstractC4009y, java.util.List
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public AbstractC4009y<E> subList(int i10, int i11) {
            l8.m.p(i10, i11, size());
            return this.f45380D.subList(U(i11), U(i10)).O();
        }

        @Override // m8.AbstractC4009y, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f45380D.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            l8.m.j(i10, size());
            return this.f45380D.get(T(i10));
        }

        @Override // m8.AbstractC4009y, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f45380D.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return T(iLastIndexOf);
            }
            return -1;
        }

        @Override // m8.AbstractC4009y, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // m8.AbstractC4009y, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f45380D.indexOf(obj);
            if (iIndexOf >= 0) {
                return T(iIndexOf);
            }
            return -1;
        }

        @Override // m8.AbstractC4009y, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // m8.AbstractC4007w
        boolean r() {
            return this.f45380D.r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f45380D.size();
        }

        @Override // m8.AbstractC4009y, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: m8.y$d */
    class d extends AbstractC4009y<E> {

        /* renamed from: D, reason: collision with root package name */
        final transient int f45381D;

        /* renamed from: E, reason: collision with root package name */
        final transient int f45382E;

        d(int i10, int i11) {
            this.f45381D = i10;
            this.f45382E = i11;
        }

        @Override // m8.AbstractC4009y, java.util.List
        /* renamed from: R */
        public AbstractC4009y<E> subList(int i10, int i11) {
            l8.m.p(i10, i11, this.f45382E);
            AbstractC4009y abstractC4009y = AbstractC4009y.this;
            int i12 = this.f45381D;
            return abstractC4009y.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.List
        public E get(int i10) {
            l8.m.j(i10, this.f45382E);
            return AbstractC4009y.this.get(i10 + this.f45381D);
        }

        @Override // m8.AbstractC4007w
        Object[] h() {
            return AbstractC4009y.this.h();
        }

        @Override // m8.AbstractC4007w
        int i() {
            return AbstractC4009y.this.j() + this.f45381D + this.f45382E;
        }

        @Override // m8.AbstractC4009y, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // m8.AbstractC4007w
        int j() {
            return AbstractC4009y.this.j() + this.f45381D;
        }

        @Override // m8.AbstractC4009y, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // m8.AbstractC4007w
        boolean r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f45382E;
        }

        @Override // m8.AbstractC4009y, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    AbstractC4009y() {
    }

    private static <E> AbstractC4009y<E> A(Object... objArr) {
        return w(T.b(objArr));
    }

    public static <E> AbstractC4009y<E> B(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC4007w)) {
            return A(collection.toArray());
        }
        AbstractC4009y<E> abstractC4009yC = ((AbstractC4007w) collection).c();
        return abstractC4009yC.r() ? w(abstractC4009yC.toArray()) : abstractC4009yC;
    }

    public static <E> AbstractC4009y<E> D(E[] eArr) {
        return eArr.length == 0 ? G() : A((Object[]) eArr.clone());
    }

    public static <E> AbstractC4009y<E> G() {
        return (AbstractC4009y<E>) W.f45246F;
    }

    public static <E> AbstractC4009y<E> H(E e10) {
        return A(e10);
    }

    public static <E> AbstractC4009y<E> I(E e10, E e11) {
        return A(e10, e11);
    }

    public static <E> AbstractC4009y<E> J(E e10, E e11, E e12) {
        return A(e10, e11, e12);
    }

    public static <E> AbstractC4009y<E> K(E e10, E e11, E e12, E e13, E e14) {
        return A(e10, e11, e12, e13, e14);
    }

    public static <E> AbstractC4009y<E> L(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return A(e10, e11, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    public static <E> AbstractC4009y<E> M(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        l8.m.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return A(objArr);
    }

    public static <E> AbstractC4009y<E> Q(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        l8.m.l(comparator);
        Object[] objArrK = C3982E.k(iterable);
        T.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return w(objArrK);
    }

    static <E> AbstractC4009y<E> w(Object[] objArr) {
        return x(objArr, objArr.length);
    }

    static <E> AbstractC4009y<E> x(Object[] objArr, int i10) {
        return i10 == 0 ? G() : new W(objArr, i10);
    }

    public static <E> a<E> y() {
        return new a<>();
    }

    public static <E> a<E> z(int i10) {
        C3994i.b(i10, "expectedSize");
        return new a<>(i10);
    }

    @Override // java.util.List
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public k0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public k0<E> listIterator(int i10) {
        l8.m.n(i10, size());
        return isEmpty() ? (k0<E>) f45378C : new b(this, i10);
    }

    public AbstractC4009y<E> O() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: R */
    public AbstractC4009y<E> subList(int i10, int i11) {
        l8.m.p(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? G() : S(i10, i11);
    }

    AbstractC4009y<E> S(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return H.b(this, obj);
    }

    @Override // m8.AbstractC4007w
    int f(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return H.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return H.e(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v */
    public j0<E> iterator() {
        return listIterator();
    }

    @Override // m8.AbstractC4007w
    @Deprecated
    public final AbstractC4009y<E> c() {
        return this;
    }
}
