package p456rx.p461n.p466e.p468o;

/* compiled from: SpmcArrayQueue.java */
/* renamed from: rx.n.e.o.q */
/* loaded from: classes3.dex */
abstract class AbstractC11389q<E> extends AbstractC11385m<E> {

    /* renamed from: k */
    protected static final long f42970k = C11398z.m40547a(AbstractC11389q.class, "producerIndex");
    private volatile long producerIndex;

    public AbstractC11389q(int i2) {
        super(i2);
    }

    /* renamed from: q */
    protected final long m40539q() {
        return this.producerIndex;
    }

    /* renamed from: r */
    protected final void m40540r(long j2) {
        C11398z.f42976a.putOrderedLong(this, f42970k, j2);
    }
}
