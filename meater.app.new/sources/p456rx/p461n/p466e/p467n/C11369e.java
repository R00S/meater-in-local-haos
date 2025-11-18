package p456rx.p461n.p466e.p467n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscAtomicArrayQueue.java */
/* renamed from: rx.n.e.n.e */
/* loaded from: classes3.dex */
public final class C11369e<E> extends AbstractC11365a<E> {

    /* renamed from: h */
    private static final Integer f42933h = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: i */
    final AtomicLong f42934i;

    /* renamed from: j */
    long f42935j;

    /* renamed from: k */
    final AtomicLong f42936k;

    /* renamed from: l */
    final int f42937l;

    public C11369e(int i2) {
        super(i2);
        this.f42934i = new AtomicLong();
        this.f42936k = new AtomicLong();
        this.f42937l = Math.min(i2 / 4, f42933h.intValue());
    }

    /* renamed from: n */
    private long m40484n() {
        return this.f42936k.get();
    }

    /* renamed from: o */
    private long m40485o() {
        return this.f42934i.get();
    }

    /* renamed from: q */
    private void m40486q(long j2) {
        this.f42936k.lazySet(j2);
    }

    /* renamed from: r */
    private void m40487r(long j2) {
        this.f42934i.lazySet(j2);
    }

    @Override // p456rx.p461n.p466e.p467n.AbstractC11365a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return m40485o() == m40484n();
    }

    @Override // p456rx.p461n.p466e.p467n.AbstractC11365a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.f42928f;
        int i2 = this.f42929g;
        long j2 = this.f42934i.get();
        int iM40470f = m40470f(j2, i2);
        if (j2 >= this.f42935j) {
            long j3 = this.f42937l + j2;
            if (m40472h(atomicReferenceArray, m40470f(j3, i2)) == null) {
                this.f42935j = j3;
            } else if (m40472h(atomicReferenceArray, iM40470f) != null) {
                return false;
            }
        }
        m40473i(atomicReferenceArray, iM40470f, e2);
        m40487r(j2 + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return m40471g(m40469c(this.f42936k.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j2 = this.f42936k.get();
        int iM40469c = m40469c(j2);
        AtomicReferenceArray<E> atomicReferenceArray = this.f42928f;
        E eM40472h = m40472h(atomicReferenceArray, iM40469c);
        if (eM40472h == null) {
            return null;
        }
        m40473i(atomicReferenceArray, iM40469c, null);
        m40486q(j2 + 1);
        return eM40472h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jM40484n = m40484n();
        while (true) {
            long jM40485o = m40485o();
            long jM40484n2 = m40484n();
            if (jM40484n == jM40484n2) {
                return (int) (jM40485o - jM40484n2);
            }
            jM40484n = jM40484n2;
        }
    }
}
