package p456rx.p461n.p466e.p467n;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p456rx.p461n.p466e.p468o.C11382j;

/* compiled from: AtomicReferenceArrayQueue.java */
/* renamed from: rx.n.e.n.a */
/* loaded from: classes3.dex */
abstract class AbstractC11365a<E> extends AbstractQueue<E> {

    /* renamed from: f */
    protected final AtomicReferenceArray<E> f42928f;

    /* renamed from: g */
    protected final int f42929g;

    public AbstractC11365a(int i2) {
        int iM40536b = C11382j.m40536b(i2);
        this.f42929g = iM40536b - 1;
        this.f42928f = new AtomicReferenceArray<>(iM40536b);
    }

    /* renamed from: c */
    protected final int m40469c(long j2) {
        return this.f42929g & ((int) j2);
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
    protected final int m40470f(long j2, int i2) {
        return ((int) j2) & i2;
    }

    /* renamed from: g */
    protected final E m40471g(int i2) {
        return m40472h(this.f42928f, i2);
    }

    /* renamed from: h */
    protected final E m40472h(AtomicReferenceArray<E> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    /* renamed from: i */
    protected final void m40473i(AtomicReferenceArray<E> atomicReferenceArray, int i2, E e2) {
        atomicReferenceArray.lazySet(i2, e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
