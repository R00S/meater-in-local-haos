package m8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import l8.InterfaceC3914g;

/* compiled from: Iterables.java */
/* renamed from: m8.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3982E {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    /* renamed from: m8.E$a */
    class a<T> extends AbstractC4002q<T> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Iterable f45151C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ l8.n f45152D;

        a(Iterable iterable, l8.n nVar) {
            this.f45151C = iterable;
            this.f45152D = nVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C3983F.i(this.f45151C.iterator(), this.f45152D);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    /* renamed from: m8.E$b */
    class b<T> extends AbstractC4002q<T> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Iterable f45153C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC3914g f45154D;

        b(Iterable iterable, InterfaceC3914g interfaceC3914g) {
            this.f45153C = iterable;
            this.f45154D = interfaceC3914g;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C3983F.t(this.f45153C.iterator(), this.f45154D);
        }
    }

    public static <T> boolean a(Iterable<T> iterable, l8.n<? super T> nVar) {
        return C3983F.b(iterable.iterator(), nVar);
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : H.i(iterable.iterator());
    }

    public static <T> Iterable<T> c(Iterable<T> iterable, l8.n<? super T> nVar) {
        l8.m.l(iterable);
        l8.m.l(nVar);
        return new a(iterable, nVar);
    }

    public static <T> T d(Iterable<? extends T> iterable, T t10) {
        return (T) C3983F.l(iterable.iterator(), t10);
    }

    public static <T> T e(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) C3983F.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) f(list);
    }

    private static <T> T f(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T g(Iterable<T> iterable) {
        return (T) C3983F.m(iterable.iterator());
    }

    public static <T> boolean h(Iterable<T> iterable, l8.n<? super T> nVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (l8.n) l8.m.l(nVar)) : C3983F.q(iterable.iterator(), nVar);
    }

    private static <T> boolean i(List<T> list, l8.n<? super T> nVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!nVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        j(list, nVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, nVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static <T> void j(List<T> list, l8.n<? super T> nVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] k(Iterable<?> iterable) {
        return b(iterable).toArray();
    }

    public static String l(Iterable<?> iterable) {
        return C3983F.s(iterable.iterator());
    }

    public static <F, T> Iterable<T> m(Iterable<F> iterable, InterfaceC3914g<? super F, ? extends T> interfaceC3914g) {
        l8.m.l(iterable);
        l8.m.l(interfaceC3914g);
        return new b(iterable, interfaceC3914g);
    }
}
