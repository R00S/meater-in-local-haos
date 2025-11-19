package m8;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l8.C3918k;
import l8.InterfaceC3914g;

/* compiled from: Iterators.java */
/* renamed from: m8.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3983F {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* renamed from: m8.F$a */
    class a<T> extends AbstractC3987b<T> {

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Iterator f45155D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ l8.n f45156E;

        a(Iterator it, l8.n nVar) {
            this.f45155D = it;
            this.f45156E = nVar;
        }

        @Override // m8.AbstractC3987b
        protected T b() {
            while (this.f45155D.hasNext()) {
                T t10 = (T) this.f45155D.next();
                if (this.f45156E.apply(t10)) {
                    return t10;
                }
            }
            return d();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* compiled from: Iterators.java */
    /* renamed from: m8.F$b */
    class b<F, T> extends h0<F, T> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC3914g f45157C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Iterator it, InterfaceC3914g interfaceC3914g) {
            super(it);
            this.f45157C = interfaceC3914g;
        }

        @Override // m8.h0
        T b(F f10) {
            return (T) this.f45157C.apply(f10);
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: m8.F$c */
    private static final class c<T> extends AbstractC3986a<T> {

        /* renamed from: E, reason: collision with root package name */
        static final k0<Object> f45158E = new c(new Object[0], 0);

        /* renamed from: D, reason: collision with root package name */
        private final T[] f45159D;

        c(T[] tArr, int i10) {
            super(tArr.length, i10);
            this.f45159D = tArr;
        }

        @Override // m8.AbstractC3986a
        protected T b(int i10) {
            return this.f45159D[i10];
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: m8.F$d */
    private enum d implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C3994i.c(false);
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: m8.F$e */
    private static final class e<T> extends j0<T> {

        /* renamed from: B, reason: collision with root package name */
        private final T f45162B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f45163C;

        e(T t10) {
            this.f45162B = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f45163C;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f45163C) {
                throw new NoSuchElementException();
            }
            this.f45163C = true;
            return this.f45162B;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        l8.m.l(collection);
        l8.m.l(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> boolean b(Iterator<T> it, l8.n<? super T> nVar) {
        return n(it, nVar) != -1;
    }

    static void c(Iterator<?> it) {
        l8.m.l(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C3918k.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> j0<T> f() {
        return g();
    }

    static <T> k0<T> g() {
        return (k0<T>) c.f45158E;
    }

    static <T> Iterator<T> h() {
        return d.INSTANCE;
    }

    public static <T> j0<T> i(Iterator<T> it, l8.n<? super T> nVar) {
        l8.m.l(it);
        l8.m.l(nVar);
        return new a(it, nVar);
    }

    public static <T> T j(Iterator<T> it, l8.n<? super T> nVar) {
        l8.m.l(it);
        l8.m.l(nVar);
        while (it.hasNext()) {
            T next = it.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> T m(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int n(Iterator<T> it, l8.n<? super T> nVar) {
        l8.m.m(nVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static <T> T o(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean p(Iterator<?> it, Collection<?> collection) {
        l8.m.l(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean q(Iterator<T> it, l8.n<? super T> nVar) {
        l8.m.l(nVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> j0<T> r(T t10) {
        return new e(t10);
    }

    public static String s(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <F, T> Iterator<T> t(Iterator<F> it, InterfaceC3914g<? super F, ? extends T> interfaceC3914g) {
        l8.m.l(interfaceC3914g);
        return new b(it, interfaceC3914g);
    }
}
