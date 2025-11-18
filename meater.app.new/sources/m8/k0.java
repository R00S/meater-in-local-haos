package m8;

import java.util.ListIterator;

/* compiled from: UnmodifiableListIterator.java */
/* loaded from: classes2.dex */
public abstract class k0<E> extends j0<E> implements ListIterator<E> {
    protected k0() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e10) {
        throw new UnsupportedOperationException();
    }
}
