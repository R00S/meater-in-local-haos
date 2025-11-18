package p456rx.p461n.p466e.p467n;

/* compiled from: MpscLinkedAtomicQueue.java */
/* renamed from: rx.n.e.n.d */
/* loaded from: classes3.dex */
public final class C11368d<E> extends AbstractC11366b<E> {
    public C11368d() {
        C11367c<E> c11367c = new C11367c<>();
        m40477h(c11367c);
        m40478i(c11367c);
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        C11367c<E> c11367c = new C11367c<>(e2);
        m40478i(c11367c).m40482d(c11367c);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        C11367c<E> c11367cM40481c;
        C11367c<E> c11367cM40474c = m40474c();
        C11367c<E> c11367cM40481c2 = c11367cM40474c.m40481c();
        if (c11367cM40481c2 != null) {
            return c11367cM40481c2.m40480b();
        }
        if (c11367cM40474c == m40476g()) {
            return null;
        }
        do {
            c11367cM40481c = c11367cM40474c.m40481c();
        } while (c11367cM40481c == null);
        return c11367cM40481c.m40480b();
    }

    @Override // java.util.Queue
    public E poll() {
        C11367c<E> c11367cM40481c;
        C11367c<E> c11367cM40474c = m40474c();
        C11367c<E> c11367cM40481c2 = c11367cM40474c.m40481c();
        if (c11367cM40481c2 != null) {
            E eM40479a = c11367cM40481c2.m40479a();
            m40477h(c11367cM40481c2);
            return eM40479a;
        }
        if (c11367cM40474c == m40476g()) {
            return null;
        }
        do {
            c11367cM40481c = c11367cM40474c.m40481c();
        } while (c11367cM40481c == null);
        E eM40479a2 = c11367cM40481c.m40479a();
        m40477h(c11367cM40481c);
        return eM40479a2;
    }
}
