package p323h.p324a.p329z.p340f;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p323h.p324a.p329z.p332c.InterfaceC9113e;
import p323h.p324a.p329z.p344j.C9181f;

/* compiled from: SpscLinkedArrayQueue.java */
/* renamed from: h.a.z.f.c */
/* loaded from: classes2.dex */
public final class C9159c<T> implements InterfaceC9113e<T> {

    /* renamed from: f */
    static final int f35168f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: g */
    private static final Object f35169g = new Object();

    /* renamed from: i */
    int f35171i;

    /* renamed from: j */
    long f35172j;

    /* renamed from: k */
    final int f35173k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f35174l;

    /* renamed from: m */
    final int f35175m;

    /* renamed from: n */
    AtomicReferenceArray<Object> f35176n;

    /* renamed from: h */
    final AtomicLong f35170h = new AtomicLong();

    /* renamed from: o */
    final AtomicLong f35177o = new AtomicLong();

    public C9159c(int i2) {
        int iM29401a = C9181f.m29401a(Math.max(8, i2));
        int i3 = iM29401a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iM29401a + 1);
        this.f35174l = atomicReferenceArray;
        this.f35173k = i3;
        m29331a(iM29401a);
        this.f35176n = atomicReferenceArray;
        this.f35175m = i3;
        this.f35172j = i3 - 1;
        m29345p(0L);
    }

    /* renamed from: a */
    private void m29331a(int i2) {
        this.f35171i = Math.min(i2 / 4, f35168f);
    }

    /* renamed from: b */
    private static int m29332b(int i2) {
        return i2;
    }

    /* renamed from: c */
    private static int m29333c(long j2, int i2) {
        return m29332b(((int) j2) & i2);
    }

    /* renamed from: d */
    private long m29334d() {
        return this.f35177o.get();
    }

    /* renamed from: e */
    private long m29335e() {
        return this.f35170h.get();
    }

    /* renamed from: f */
    private long m29336f() {
        return this.f35177o.get();
    }

    /* renamed from: h */
    private static <E> Object m29337h(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    /* renamed from: i */
    private AtomicReferenceArray<Object> m29338i(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        int iM29332b = m29332b(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m29337h(atomicReferenceArray, iM29332b);
        m29343n(atomicReferenceArray, iM29332b, null);
        return atomicReferenceArray2;
    }

    /* renamed from: j */
    private long m29339j() {
        return this.f35170h.get();
    }

    /* renamed from: k */
    private T m29340k(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.f35176n = atomicReferenceArray;
        int iM29333c = m29333c(j2, i2);
        T t = (T) m29337h(atomicReferenceArray, iM29333c);
        if (t != null) {
            m29343n(atomicReferenceArray, iM29333c, null);
            m29342m(j2 + 1);
        }
        return t;
    }

    /* renamed from: l */
    private void m29341l(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f35174l = atomicReferenceArray2;
        this.f35172j = (j3 + j2) - 1;
        m29343n(atomicReferenceArray2, i2, t);
        m29344o(atomicReferenceArray, atomicReferenceArray2);
        m29343n(atomicReferenceArray, i2, f35169g);
        m29345p(j2 + 1);
    }

    /* renamed from: m */
    private void m29342m(long j2) {
        this.f35177o.lazySet(j2);
    }

    /* renamed from: n */
    private static void m29343n(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    /* renamed from: o */
    private void m29344o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m29343n(atomicReferenceArray, m29332b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: p */
    private void m29345p(long j2) {
        this.f35170h.lazySet(j2);
    }

    /* renamed from: q */
    private boolean m29346q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        m29343n(atomicReferenceArray, i2, t);
        m29345p(j2 + 1);
        return true;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public boolean isEmpty() {
        return m29339j() == m29336f();
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f35174l;
        long jM29335e = m29335e();
        int i2 = this.f35173k;
        int iM29333c = m29333c(jM29335e, i2);
        if (jM29335e < this.f35172j) {
            return m29346q(atomicReferenceArray, t, jM29335e, iM29333c);
        }
        long j2 = this.f35171i + jM29335e;
        if (m29337h(atomicReferenceArray, m29333c(j2, i2)) == null) {
            this.f35172j = j2 - 1;
            return m29346q(atomicReferenceArray, t, jM29335e, iM29333c);
        }
        if (m29337h(atomicReferenceArray, m29333c(1 + jM29335e, i2)) == null) {
            return m29346q(atomicReferenceArray, t, jM29335e, iM29333c);
        }
        m29341l(atomicReferenceArray, jM29335e, iM29333c, t, i2);
        return true;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9113e, p323h.p324a.p329z.p332c.InterfaceC9114f
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f35176n;
        long jM29334d = m29334d();
        int i2 = this.f35175m;
        int iM29333c = m29333c(jM29334d, i2);
        T t = (T) m29337h(atomicReferenceArray, iM29333c);
        boolean z = t == f35169g;
        if (t == null || z) {
            if (z) {
                return m29340k(m29338i(atomicReferenceArray, i2 + 1), jM29334d, i2);
            }
            return null;
        }
        m29343n(atomicReferenceArray, iM29333c, null);
        m29342m(jM29334d + 1);
        return t;
    }
}
