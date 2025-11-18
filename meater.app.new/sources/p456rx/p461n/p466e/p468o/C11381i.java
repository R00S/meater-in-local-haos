package p456rx.p461n.p466e.p468o;

import p456rx.p461n.p466e.p467n.C11367c;

/* compiled from: MpscLinkedQueue.java */
/* renamed from: rx.n.e.o.i */
/* loaded from: classes3.dex */
public final class C11381i<E> extends AbstractC11373a<E> {
    public C11381i() {
        C11367c<E> c11367c = new C11367c<>();
        this.consumerNode = c11367c;
        m40534i(c11367c);
    }

    /* renamed from: i */
    protected C11367c<E> m40534i(C11367c<E> c11367c) {
        C11367c<E> c11367c2;
        do {
            c11367c2 = this.producerNode;
        } while (!C11398z.f42976a.compareAndSwapObject(this, AbstractC11377e.f42963f, c11367c2, c11367c));
        return c11367c2;
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        C11367c<E> c11367c = new C11367c<>(e2);
        m40534i(c11367c).m40482d(c11367c);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        C11367c<E> c11367cM40481c;
        C11367c<E> c11367c = this.consumerNode;
        C11367c<E> c11367cM40481c2 = c11367c.m40481c();
        if (c11367cM40481c2 != null) {
            return c11367cM40481c2.m40480b();
        }
        if (c11367c == m40526c()) {
            return null;
        }
        do {
            c11367cM40481c = c11367c.m40481c();
        } while (c11367cM40481c == null);
        return c11367cM40481c.m40480b();
    }

    @Override // java.util.Queue
    public E poll() {
        C11367c<E> c11367cM40481c;
        C11367c<E> c11367cM40523f = m40523f();
        C11367c<E> c11367cM40481c2 = c11367cM40523f.m40481c();
        if (c11367cM40481c2 != null) {
            E eM40479a = c11367cM40481c2.m40479a();
            m40525h(c11367cM40481c2);
            return eM40479a;
        }
        if (c11367cM40523f == m40526c()) {
            return null;
        }
        do {
            c11367cM40481c = c11367cM40523f.m40481c();
        } while (c11367cM40481c == null);
        E eM40479a2 = c11367cM40481c.m40479a();
        this.consumerNode = c11367cM40481c;
        return eM40479a2;
    }
}
