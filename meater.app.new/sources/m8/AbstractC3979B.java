package m8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import m8.AbstractC4007w;

/* compiled from: ImmutableSet.java */
/* renamed from: m8.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3979B<E> extends AbstractC4007w<E> implements Set<E> {

    /* renamed from: C, reason: collision with root package name */
    private transient AbstractC4009y<E> f45143C;

    /* compiled from: ImmutableSet.java */
    /* renamed from: m8.B$a */
    public static class a<E> extends AbstractC4007w.a<E> {

        /* renamed from: d, reason: collision with root package name */
        Object[] f45144d;

        /* renamed from: e, reason: collision with root package name */
        private int f45145e;

        public a() {
            super(4);
        }

        private void l(E e10) {
            Objects.requireNonNull(this.f45144d);
            int length = this.f45144d.length - 1;
            int iHashCode = e10.hashCode();
            int iB = C4006v.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f45144d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f45145e += iHashCode;
                    super.d(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        @Override // m8.AbstractC4007w.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            l8.m.l(e10);
            if (this.f45144d != null && AbstractC3979B.z(this.f45374b) <= this.f45144d.length) {
                l(e10);
                return this;
            }
            this.f45144d = null;
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            if (this.f45144d != null) {
                for (E e10 : eArr) {
                    a(e10);
                }
            } else {
                super.e(eArr);
            }
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            l8.m.l(iterable);
            if (this.f45144d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public a<E> k(Iterator<? extends E> it) {
            l8.m.l(it);
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public AbstractC3979B<E> m() {
            AbstractC3979B<E> abstractC3979BA;
            int i10 = this.f45374b;
            if (i10 == 0) {
                return AbstractC3979B.I();
            }
            if (i10 == 1) {
                Object obj = this.f45373a[0];
                Objects.requireNonNull(obj);
                return AbstractC3979B.J(obj);
            }
            if (this.f45144d == null || AbstractC3979B.z(i10) != this.f45144d.length) {
                abstractC3979BA = AbstractC3979B.A(this.f45374b, this.f45373a);
                this.f45374b = abstractC3979BA.size();
            } else {
                Object[] objArrCopyOf = AbstractC3979B.Q(this.f45374b, this.f45373a.length) ? Arrays.copyOf(this.f45373a, this.f45374b) : this.f45373a;
                abstractC3979BA = new Y<>(objArrCopyOf, this.f45145e, this.f45144d, r5.length - 1, this.f45374b);
            }
            this.f45375c = true;
            this.f45144d = null;
            return abstractC3979BA;
        }
    }

    AbstractC3979B() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> AbstractC3979B<E> A(int i10, Object... objArr) {
        if (i10 == 0) {
            return I();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return J(obj);
        }
        int iZ = z(i10);
        Object[] objArr2 = new Object[iZ];
        int i11 = iZ - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = T.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = C4006v.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new e0(obj3);
        }
        if (z(i13) < iZ / 2) {
            return A(i13, objArr);
        }
        if (Q(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new Y(objArr, i12, objArr2, i11, i13);
    }

    public static <E> AbstractC3979B<E> B(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? D((Collection) iterable) : E(iterable.iterator());
    }

    public static <E> AbstractC3979B<E> D(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC3979B) && !(collection instanceof SortedSet)) {
            AbstractC3979B<E> abstractC3979B = (AbstractC3979B) collection;
            if (!abstractC3979B.r()) {
                return abstractC3979B;
            }
        }
        Object[] array = collection.toArray();
        return A(array.length, array);
    }

    public static <E> AbstractC3979B<E> E(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return I();
        }
        E next = it.next();
        return !it.hasNext() ? J(next) : new a().a(next).k(it).m();
    }

    public static <E> AbstractC3979B<E> F(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? A(eArr.length, (Object[]) eArr.clone()) : J(eArr[0]) : I();
    }

    public static <E> AbstractC3979B<E> I() {
        return Y.f45264J;
    }

    public static <E> AbstractC3979B<E> J(E e10) {
        return new e0(e10);
    }

    public static <E> AbstractC3979B<E> K(E e10, E e11) {
        return A(2, e10, e11);
    }

    public static <E> AbstractC3979B<E> L(E e10, E e11, E e12) {
        return A(3, e10, e11, e12);
    }

    public static <E> AbstractC3979B<E> M(E e10, E e11, E e12, E e13, E e14) {
        return A(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> AbstractC3979B<E> O(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        l8.m.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return A(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> a<E> y() {
        return new a<>();
    }

    static int z(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            l8.m.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    AbstractC4009y<E> G() {
        return AbstractC4009y.w(toArray());
    }

    boolean H() {
        return false;
    }

    @Override // m8.AbstractC4007w
    public AbstractC4009y<E> c() {
        AbstractC4009y<E> abstractC4009y = this.f45143C;
        if (abstractC4009y != null) {
            return abstractC4009y;
        }
        AbstractC4009y<E> abstractC4009yG = G();
        this.f45143C = abstractC4009yG;
        return abstractC4009yG;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3979B) && H() && ((AbstractC3979B) obj).H() && hashCode() != obj.hashCode()) {
            return false;
        }
        return d0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d0.d(this);
    }

    @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract j0<E> iterator();
}
