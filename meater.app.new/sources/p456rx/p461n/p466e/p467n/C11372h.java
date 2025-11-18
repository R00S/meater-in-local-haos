package p456rx.p461n.p466e.p467n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p456rx.p461n.p466e.p468o.C11382j;

/* compiled from: SpscUnboundedAtomicArrayQueue.java */
/* renamed from: rx.n.e.n.h */
/* loaded from: classes3.dex */
public final class C11372h<T> implements Queue<T> {

    /* renamed from: f */
    static final int f42952f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: g */
    private static final Object f42953g = new Object();

    /* renamed from: h */
    final AtomicLong f42954h;

    /* renamed from: i */
    int f42955i;

    /* renamed from: j */
    long f42956j;

    /* renamed from: k */
    int f42957k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f42958l;

    /* renamed from: m */
    int f42959m;

    /* renamed from: n */
    AtomicReferenceArray<Object> f42960n;

    /* renamed from: o */
    final AtomicLong f42961o;

    public C11372h(int i2) {
        int iM40536b = C11382j.m40536b(Math.max(8, i2));
        int i3 = iM40536b - 1;
        this.f42954h = new AtomicLong();
        this.f42961o = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iM40536b + 1);
        this.f42958l = atomicReferenceArray;
        this.f42957k = i3;
        m40506c(iM40536b);
        this.f42960n = atomicReferenceArray;
        this.f42959m = i3;
        this.f42956j = i3 - 1;
        m40521y(0L);
    }

    /* renamed from: c */
    private void m40506c(int i2) {
        this.f42955i = Math.min(i2 / 4, f42952f);
    }

    /* renamed from: f */
    private static int m40507f(int i2) {
        return i2;
    }

    /* renamed from: g */
    private static int m40508g(long j2, int i2) {
        return m40507f(((int) j2) & i2);
    }

    /* renamed from: h */
    private long m40509h() {
        return this.f42961o.get();
    }

    /* renamed from: i */
    private long m40510i() {
        return this.f42954h.get();
    }

    /* renamed from: n */
    private long m40511n() {
        return this.f42961o.get();
    }

    /* renamed from: o */
    private static <E> Object m40512o(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    /* renamed from: q */
    private AtomicReferenceArray<Object> m40513q(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m40512o(atomicReferenceArray, m40507f(atomicReferenceArray.length() - 1));
    }

    /* renamed from: r */
    private long m40514r() {
        return this.f42954h.get();
    }

    /* renamed from: s */
    private T m40515s(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.f42960n = atomicReferenceArray;
        return (T) m40512o(atomicReferenceArray, m40508g(j2, i2));
    }

    /* renamed from: t */
    private T m40516t(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.f42960n = atomicReferenceArray;
        int iM40508g = m40508g(j2, i2);
        T t = (T) m40512o(atomicReferenceArray, iM40508g);
        if (t == null) {
            return null;
        }
        m40518v(j2 + 1);
        m40519w(atomicReferenceArray, iM40508g, null);
        return t;
    }

    /* renamed from: u */
    private void m40517u(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f42958l = atomicReferenceArray2;
        this.f42956j = (j3 + j2) - 1;
        m40521y(j2 + 1);
        m40519w(atomicReferenceArray2, i2, t);
        m40520x(atomicReferenceArray, atomicReferenceArray2);
        m40519w(atomicReferenceArray, i2, f42953g);
    }

    /* renamed from: v */
    private void m40518v(long j2) {
        this.f42961o.lazySet(j2);
    }

    /* renamed from: w */
    private static void m40519w(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    /* renamed from: x */
    private void m40520x(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m40519w(atomicReferenceArray, m40507f(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: y */
    private void m40521y(long j2) {
        this.f42954h.lazySet(j2);
    }

    /* renamed from: z */
    private boolean m40522z(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        m40521y(j2 + 1);
        m40519w(atomicReferenceArray, i2, t);
        return true;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m40514r() == m40511n();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42958l;
        long jM40510i = m40510i();
        int i2 = this.f42957k;
        int iM40508g = m40508g(jM40510i, i2);
        if (jM40510i < this.f42956j) {
            return m40522z(atomicReferenceArray, t, jM40510i, iM40508g);
        }
        long j2 = this.f42955i + jM40510i;
        if (m40512o(atomicReferenceArray, m40508g(j2, i2)) == null) {
            this.f42956j = j2 - 1;
            return m40522z(atomicReferenceArray, t, jM40510i, iM40508g);
        }
        if (m40512o(atomicReferenceArray, m40508g(1 + jM40510i, i2)) != null) {
            return m40522z(atomicReferenceArray, t, jM40510i, iM40508g);
        }
        m40517u(atomicReferenceArray, jM40510i, iM40508g, t, i2);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42960n;
        long jM40509h = m40509h();
        int i2 = this.f42959m;
        T t = (T) m40512o(atomicReferenceArray, m40508g(jM40509h, i2));
        return t == f42953g ? m40515s(m40513q(atomicReferenceArray), jM40509h, i2) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42960n;
        long jM40509h = m40509h();
        int i2 = this.f42959m;
        int iM40508g = m40508g(jM40509h, i2);
        T t = (T) m40512o(atomicReferenceArray, iM40508g);
        boolean z = t == f42953g;
        if (t == null || z) {
            if (z) {
                return m40516t(m40513q(atomicReferenceArray), jM40509h, i2);
            }
            return null;
        }
        m40518v(jM40509h + 1);
        m40519w(atomicReferenceArray, iM40508g, null);
        return t;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
        long jM40511n = m40511n();
        while (true) {
            long jM40514r = m40514r();
            long jM40511n2 = m40511n();
            if (jM40511n == jM40511n2) {
                return (int) (jM40514r - jM40511n2);
            }
            jM40511n = jM40511n2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
