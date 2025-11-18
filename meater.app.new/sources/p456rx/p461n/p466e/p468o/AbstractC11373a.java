package p456rx.p461n.p466e.p468o;

import java.util.Iterator;
import p456rx.p461n.p466e.p467n.C11367c;

/* compiled from: BaseLinkedQueue.java */
/* renamed from: rx.n.e.o.a */
/* loaded from: classes3.dex */
abstract class AbstractC11373a<E> extends AbstractC11374b<E> {
    AbstractC11373a() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m40524g() == m40526c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C11367c<E> c11367cM40481c;
        C11367c<E> c11367cM40524g = m40524g();
        C11367c<E> c11367cM40526c = m40526c();
        int i2 = 0;
        while (c11367cM40524g != c11367cM40526c && i2 < Integer.MAX_VALUE) {
            do {
                c11367cM40481c = c11367cM40524g.m40481c();
            } while (c11367cM40481c == null);
            i2++;
            c11367cM40524g = c11367cM40481c;
        }
        return i2;
    }
}
