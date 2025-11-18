package p456rx.p461n.p466e.p467n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p456rx.p461n.p466e.p468o.C11382j;

/* compiled from: SpscLinkedArrayQueue.java */
/* renamed from: rx.n.e.n.g */
/* loaded from: classes3.dex */
public final class C11371g<T> implements Queue<T> {

    /* renamed from: f */
    static final int f42942f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: g */
    private static final Object f42943g = new Object();

    /* renamed from: h */
    final AtomicLong f42944h;

    /* renamed from: i */
    int f42945i;

    /* renamed from: j */
    long f42946j;

    /* renamed from: k */
    int f42947k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f42948l;

    /* renamed from: m */
    int f42949m;

    /* renamed from: n */
    AtomicReferenceArray<Object> f42950n;

    /* renamed from: o */
    final AtomicLong f42951o;

    public C11371g(int i2) {
        int iM40536b = C11382j.m40536b(i2);
        int i3 = iM40536b - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iM40536b + 1);
        this.f42948l = atomicReferenceArray;
        this.f42947k = i3;
        m40489c(iM40536b);
        this.f42950n = atomicReferenceArray;
        this.f42949m = i3;
        this.f42946j = i3 - 1;
        this.f42944h = new AtomicLong();
        this.f42951o = new AtomicLong();
    }

    /* renamed from: A */
    private boolean m40488A(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        m40502x(atomicReferenceArray, i2, t);
        m40504z(j2 + 1);
        return true;
    }

    /* renamed from: c */
    private void m40489c(int i2) {
        this.f42945i = Math.min(i2 / 4, f42942f);
    }

    /* renamed from: f */
    private static int m40490f(int i2) {
        return i2;
    }

    /* renamed from: g */
    private static int m40491g(long j2, int i2) {
        return m40490f(((int) j2) & i2);
    }

    /* renamed from: h */
    private long m40492h() {
        return this.f42951o.get();
    }

    /* renamed from: i */
    private long m40493i() {
        return this.f42944h.get();
    }

    /* renamed from: n */
    private long m40494n() {
        return this.f42951o.get();
    }

    /* renamed from: o */
    private static <E> Object m40495o(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    /* renamed from: q */
    private AtomicReferenceArray<Object> m40496q(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m40495o(atomicReferenceArray, m40490f(atomicReferenceArray.length() - 1));
    }

    /* renamed from: r */
    private long m40497r() {
        return this.f42944h.get();
    }

    /* renamed from: s */
    private T m40498s(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.f42950n = atomicReferenceArray;
        return (T) m40495o(atomicReferenceArray, m40491g(j2, i2));
    }

    /* renamed from: t */
    private T m40499t(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.f42950n = atomicReferenceArray;
        int iM40491g = m40491g(j2, i2);
        T t = (T) m40495o(atomicReferenceArray, iM40491g);
        if (t == null) {
            return null;
        }
        m40502x(atomicReferenceArray, iM40491g, null);
        m40501w(j2 + 1);
        return t;
    }

    /* renamed from: v */
    private void m40500v(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f42948l = atomicReferenceArray2;
        this.f42946j = (j3 + j2) - 1;
        m40502x(atomicReferenceArray2, i2, t);
        m40503y(atomicReferenceArray, atomicReferenceArray2);
        m40502x(atomicReferenceArray, i2, f42943g);
        m40504z(j2 + 1);
    }

    /* renamed from: w */
    private void m40501w(long j2) {
        this.f42951o.lazySet(j2);
    }

    /* renamed from: x */
    private static void m40502x(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    /* renamed from: y */
    private void m40503y(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m40502x(atomicReferenceArray, m40490f(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: z */
    private void m40504z(long j2) {
        this.f42944h.lazySet(j2);
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
        return m40497r() == m40494n();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42948l;
        long jM40493i = m40493i();
        int i2 = this.f42947k;
        int iM40491g = m40491g(jM40493i, i2);
        if (jM40493i < this.f42946j) {
            return m40488A(atomicReferenceArray, t, jM40493i, iM40491g);
        }
        long j2 = this.f42945i + jM40493i;
        if (m40495o(atomicReferenceArray, m40491g(j2, i2)) == null) {
            this.f42946j = j2 - 1;
            return m40488A(atomicReferenceArray, t, jM40493i, iM40491g);
        }
        if (m40495o(atomicReferenceArray, m40491g(1 + jM40493i, i2)) == null) {
            return m40488A(atomicReferenceArray, t, jM40493i, iM40491g);
        }
        m40500v(atomicReferenceArray, jM40493i, iM40491g, t, i2);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42950n;
        long jM40492h = m40492h();
        int i2 = this.f42949m;
        T t = (T) m40495o(atomicReferenceArray, m40491g(jM40492h, i2));
        return t == f42943g ? m40498s(m40496q(atomicReferenceArray), jM40492h, i2) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42950n;
        long jM40492h = m40492h();
        int i2 = this.f42949m;
        int iM40491g = m40491g(jM40492h, i2);
        T t = (T) m40495o(atomicReferenceArray, iM40491g);
        boolean z = t == f42943g;
        if (t == null || z) {
            if (z) {
                return m40499t(m40496q(atomicReferenceArray), jM40492h, i2);
            }
            return null;
        }
        m40502x(atomicReferenceArray, iM40491g, null);
        m40501w(jM40492h + 1);
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
        long jM40494n = m40494n();
        while (true) {
            long jM40497r = m40497r();
            long jM40494n2 = m40494n();
            if (jM40494n == jM40494n2) {
                return (int) (jM40497r - jM40494n2);
            }
            jM40494n = jM40494n2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: u */
    public boolean m40505u(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f42948l;
        long jM40497r = m40497r();
        int i2 = this.f42947k;
        long j2 = 2 + jM40497r;
        if (m40495o(atomicReferenceArray, m40491g(j2, i2)) == null) {
            int iM40491g = m40491g(jM40497r, i2);
            m40502x(atomicReferenceArray, iM40491g + 1, t2);
            m40502x(atomicReferenceArray, iM40491g, t);
            m40504z(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f42948l = atomicReferenceArray2;
        int iM40491g2 = m40491g(jM40497r, i2);
        m40502x(atomicReferenceArray2, iM40491g2 + 1, t2);
        m40502x(atomicReferenceArray2, iM40491g2, t);
        m40503y(atomicReferenceArray, atomicReferenceArray2);
        m40502x(atomicReferenceArray, iM40491g2, f42943g);
        m40504z(j2);
        return true;
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
