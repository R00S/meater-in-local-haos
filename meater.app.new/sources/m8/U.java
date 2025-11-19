package m8;

import java.util.Comparator;
import java.util.Map;
import l8.InterfaceC3914g;

/* compiled from: Ordering.java */
/* loaded from: classes2.dex */
public abstract class U<T> implements Comparator<T> {
    protected U() {
    }

    public static <T> U<T> b(Comparator<T> comparator) {
        return comparator instanceof U ? (U) comparator : new C3998m(comparator);
    }

    public static <C extends Comparable> U<C> d() {
        return Q.f45245B;
    }

    public <U extends T> U<U> a(Comparator<? super U> comparator) {
        return new C4000o(this, (Comparator) l8.m.l(comparator));
    }

    public <E extends T> AbstractC4009y<E> c(Iterable<E> iterable) {
        return AbstractC4009y.Q(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    <T2 extends T> U<Map.Entry<T2, ?>> e() {
        return (U<Map.Entry<T2, ?>>) f(L.e());
    }

    public <F> U<F> f(InterfaceC3914g<F, ? extends T> interfaceC3914g) {
        return new C3993h(interfaceC3914g, this);
    }

    public <S extends T> U<S> g() {
        return new b0(this);
    }
}
