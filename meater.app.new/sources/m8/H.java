package m8;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l8.C3918k;
import l8.InterfaceC3914g;

/* compiled from: Lists.java */
/* loaded from: classes2.dex */
public final class H {

    /* compiled from: Lists.java */
    private static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: B, reason: collision with root package name */
        final List<F> f45164B;

        /* renamed from: C, reason: collision with root package name */
        final InterfaceC3914g<? super F, ? extends T> f45165C;

        /* compiled from: Lists.java */
        /* renamed from: m8.H$a$a, reason: collision with other inner class name */
        class C0608a extends i0<F, T> {
            C0608a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // m8.h0
            T b(F f10) {
                return a.this.f45165C.apply(f10);
            }
        }

        a(List<F> list, InterfaceC3914g<? super F, ? extends T> interfaceC3914g) {
            this.f45164B = (List) l8.m.l(list);
            this.f45165C = (InterfaceC3914g) l8.m.l(interfaceC3914g);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f45165C.apply(this.f45164B.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f45164B.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new C0608a(this.f45164B.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f45165C.apply(this.f45164B.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f45164B.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f45164B.size();
        }
    }

    /* compiled from: Lists.java */
    private static class b<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: B, reason: collision with root package name */
        final List<F> f45167B;

        /* renamed from: C, reason: collision with root package name */
        final InterfaceC3914g<? super F, ? extends T> f45168C;

        /* compiled from: Lists.java */
        class a extends i0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // m8.h0
            T b(F f10) {
                return b.this.f45168C.apply(f10);
            }
        }

        b(List<F> list, InterfaceC3914g<? super F, ? extends T> interfaceC3914g) {
            this.f45167B = (List) l8.m.l(list);
            this.f45168C = (InterfaceC3914g) l8.m.l(interfaceC3914g);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f45167B.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f45167B.listIterator(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f45167B.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f45167B.size();
        }
    }

    static int a(int i10) {
        C3994i.b(i10, "arraySize");
        return p8.f.k(i10 + 5 + (i10 / 10));
    }

    static boolean b(List<?> list, Object obj) {
        if (obj == l8.m.l(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C3983F.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!C3918k.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C3918k.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int d(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C3918k.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> h(Iterable<? extends E> iterable) {
        l8.m.l(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : i(iterable.iterator());
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> arrayListG = g();
        C3983F.a(arrayListG, it);
        return arrayListG;
    }

    @SafeVarargs
    public static <E> ArrayList<E> j(E... eArr) {
        l8.m.l(eArr);
        ArrayList<E> arrayList = new ArrayList<>(a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> k(int i10) {
        C3994i.b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    public static <F, T> List<T> l(List<F> list, InterfaceC3914g<? super F, ? extends T> interfaceC3914g) {
        return list instanceof RandomAccess ? new a(list, interfaceC3914g) : new b(list, interfaceC3914g);
    }
}
