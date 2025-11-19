package m8;

import java.util.Iterator;

/* compiled from: TransformedIterator.java */
/* loaded from: classes2.dex */
abstract class h0<F, T> implements Iterator<T> {

    /* renamed from: B, reason: collision with root package name */
    final Iterator<? extends F> f45337B;

    h0(Iterator<? extends F> it) {
        this.f45337B = (Iterator) l8.m.l(it);
    }

    abstract T b(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45337B.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return b(this.f45337B.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f45337B.remove();
    }
}
