package p456rx.p461n.p466e.p468o;

/* compiled from: SpmcArrayQueue.java */
/* renamed from: rx.n.e.o.l */
/* loaded from: classes3.dex */
abstract class AbstractC11384l<E> extends AbstractC11386n<E> {

    /* renamed from: l */
    protected static final long f42969l = C11398z.m40547a(AbstractC11384l.class, "consumerIndex");
    private volatile long consumerIndex;

    public AbstractC11384l(int i2) {
        super(i2);
    }

    /* renamed from: s */
    protected final boolean m40537s(long j2, long j3) {
        return C11398z.f42976a.compareAndSwapLong(this, f42969l, j2, j3);
    }

    /* renamed from: t */
    protected final long m40538t() {
        return this.consumerIndex;
    }
}
