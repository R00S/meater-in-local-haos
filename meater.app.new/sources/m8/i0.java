package m8;

import java.util.ListIterator;

/* compiled from: TransformedListIterator.java */
/* loaded from: classes2.dex */
abstract class i0<F, T> extends h0<F, T> implements ListIterator<T> {
    i0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> d() {
        return (ListIterator) this.f45337B;
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return d().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return d().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return b(d().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return d().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        throw new UnsupportedOperationException();
    }
}
