package p456rx.p461n.p466e.p468o;

/* compiled from: SpscArrayQueue.java */
/* renamed from: rx.n.e.o.s */
/* loaded from: classes3.dex */
public final class C11391s<E> extends AbstractC11396x<E> {
    public C11391s(int i2) {
        super(i2);
    }

    /* renamed from: q */
    private long m40543q() {
        return C11398z.f42976a.getLongVolatile(this, AbstractC11393u.f42974n);
    }

    /* renamed from: r */
    private long m40544r() {
        return C11398z.f42976a.getLongVolatile(this, AbstractC11397y.f42975m);
    }

    /* renamed from: s */
    private void m40545s(long j2) {
        C11398z.f42976a.putOrderedLong(this, AbstractC11393u.f42974n, j2);
    }

    /* renamed from: t */
    private void m40546t(long j2) {
        C11398z.f42976a.putOrderedLong(this, AbstractC11397y.f42975m, j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m40544r() == m40543q();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("null elements not allowed");
        }
        E[] eArr = this.f42968j;
        long j2 = this.producerIndex;
        long jM40527c = m40527c(j2);
        if (m40531i(eArr, jM40527c) != null) {
            return false;
        }
        m40532n(eArr, jM40527c, e2);
        m40546t(j2 + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return m40530h(m40527c(this.consumerIndex));
    }

    @Override // java.util.Queue, p456rx.p461n.p466e.p468o.InterfaceC11380h
    public E poll() {
        long j2 = this.consumerIndex;
        long jM40527c = m40527c(j2);
        E[] eArr = this.f42968j;
        E eM40531i = m40531i(eArr, jM40527c);
        if (eM40531i == null) {
            return null;
        }
        m40532n(eArr, jM40527c, null);
        m40545s(j2 + 1);
        return eM40531i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jM40543q = m40543q();
        while (true) {
            long jM40544r = m40544r();
            long jM40543q2 = m40543q();
            if (jM40543q == jM40543q2) {
                return (int) (jM40544r - jM40543q2);
            }
            jM40543q = jM40543q2;
        }
    }
}
