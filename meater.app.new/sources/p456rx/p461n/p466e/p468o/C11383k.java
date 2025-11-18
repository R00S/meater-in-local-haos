package p456rx.p461n.p466e.p468o;

/* compiled from: SpmcArrayQueue.java */
/* renamed from: rx.n.e.o.k */
/* loaded from: classes3.dex */
public final class C11383k<E> extends AbstractC11387o<E> {
    public C11383k(int i2) {
        super(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m40538t() == m40539q();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.f42968j;
        long j2 = this.f42967i;
        long jM40539q = m40539q();
        long jM40527c = m40527c(jM40539q);
        if (m40531i(eArr, jM40527c) != null) {
            if (jM40539q - m40538t() > j2) {
                return false;
            }
            while (m40531i(eArr, jM40527c) != null) {
            }
        }
        m40533o(eArr, jM40527c, e2);
        m40540r(jM40539q + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        E eM40530h;
        long jM40541u = m40541u();
        do {
            long jM40538t = m40538t();
            if (jM40538t >= jM40541u) {
                long jM40539q = m40539q();
                if (jM40538t >= jM40539q) {
                    return null;
                }
                m40542v(jM40539q);
            }
            eM40530h = m40530h(m40527c(jM40538t));
        } while (eM40530h == null);
        return eM40530h;
    }

    @Override // java.util.Queue, p456rx.p461n.p466e.p468o.InterfaceC11380h
    public E poll() {
        long jM40538t;
        long jM40541u = m40541u();
        do {
            jM40538t = m40538t();
            if (jM40538t >= jM40541u) {
                long jM40539q = m40539q();
                if (jM40538t >= jM40539q) {
                    return null;
                }
                m40542v(jM40539q);
            }
        } while (!m40537s(jM40538t, 1 + jM40538t));
        long jM40527c = m40527c(jM40538t);
        E[] eArr = this.f42968j;
        E eM40529g = m40529g(eArr, jM40527c);
        m40532n(eArr, jM40527c, null);
        return eM40529g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jM40538t = m40538t();
        while (true) {
            long jM40539q = m40539q();
            long jM40538t2 = m40538t();
            if (jM40538t == jM40538t2) {
                return (int) (jM40539q - jM40538t2);
            }
            jM40538t = jM40538t2;
        }
    }
}
