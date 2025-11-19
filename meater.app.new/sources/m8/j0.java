package m8;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator.java */
/* loaded from: classes2.dex */
public abstract class j0<E> implements Iterator<E> {
    protected j0() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
