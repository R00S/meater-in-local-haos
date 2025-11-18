package p456rx.p461n.p466e.p467n;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BaseLinkedAtomicQueue.java */
/* renamed from: rx.n.e.n.b */
/* loaded from: classes3.dex */
abstract class AbstractC11366b<E> extends AbstractQueue<E> {

    /* renamed from: f */
    private final AtomicReference<C11367c<E>> f42930f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<C11367c<E>> f42931g = new AtomicReference<>();

    /* renamed from: c */
    protected final C11367c<E> m40474c() {
        return this.f42931g.get();
    }

    /* renamed from: f */
    protected final C11367c<E> m40475f() {
        return this.f42931g.get();
    }

    /* renamed from: g */
    protected final C11367c<E> m40476g() {
        return this.f42930f.get();
    }

    /* renamed from: h */
    protected final void m40477h(C11367c<E> c11367c) {
        this.f42931g.lazySet(c11367c);
    }

    /* renamed from: i */
    protected final C11367c<E> m40478i(C11367c<E> c11367c) {
        return this.f42930f.getAndSet(c11367c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return m40475f() == m40476g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C11367c<E> c11367cM40481c;
        C11367c<E> c11367cM40475f = m40475f();
        C11367c<E> c11367cM40476g = m40476g();
        int i2 = 0;
        while (c11367cM40475f != c11367cM40476g && i2 < Integer.MAX_VALUE) {
            do {
                c11367cM40481c = c11367cM40475f.m40481c();
            } while (c11367cM40481c == null);
            i2++;
            c11367cM40475f = c11367cM40481c;
        }
        return i2;
    }
}
