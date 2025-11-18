package p456rx.p461n.p466e.p468o;

import java.util.Iterator;

/* compiled from: ConcurrentCircularArrayQueue.java */
/* renamed from: rx.n.e.o.f */
/* loaded from: classes3.dex */
public abstract class AbstractC11378f<E> extends AbstractC11379g<E> {

    /* renamed from: f */
    protected static final int f42964f;

    /* renamed from: g */
    private static final long f42965g;

    /* renamed from: h */
    private static final int f42966h;

    /* renamed from: i */
    protected final long f42967i;

    /* renamed from: j */
    protected final E[] f42968j;

    static {
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        f42964f = iIntValue;
        int iArrayIndexScale = C11398z.f42976a.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            f42966h = iIntValue + 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            f42966h = iIntValue + 3;
        }
        f42965g = r2.arrayBaseOffset(Object[].class) + (32 << (f42966h - iIntValue));
    }

    public AbstractC11378f(int i2) {
        int iM40536b = C11382j.m40536b(i2);
        this.f42967i = iM40536b - 1;
        this.f42968j = (E[]) new Object[(iM40536b << f42964f) + 64];
    }

    /* renamed from: c */
    protected final long m40527c(long j2) {
        return m40528f(j2, this.f42967i);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: f */
    protected final long m40528f(long j2, long j3) {
        return f42965g + ((j2 & j3) << f42966h);
    }

    /* renamed from: g */
    protected final E m40529g(E[] eArr, long j2) {
        return (E) C11398z.f42976a.getObject(eArr, j2);
    }

    /* renamed from: h */
    protected final E m40530h(long j2) {
        return m40531i(this.f42968j, j2);
    }

    /* renamed from: i */
    protected final E m40531i(E[] eArr, long j2) {
        return (E) C11398z.f42976a.getObjectVolatile(eArr, j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    protected final void m40532n(E[] eArr, long j2, E e2) {
        C11398z.f42976a.putOrderedObject(eArr, j2, e2);
    }

    /* renamed from: o */
    protected final void m40533o(E[] eArr, long j2, E e2) {
        C11398z.f42976a.putObject(eArr, j2, e2);
    }
}
