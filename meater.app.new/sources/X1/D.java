package X1;

import java.util.Arrays;

/* compiled from: TimedValueQueue.java */
/* loaded from: classes.dex */
public final class D<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f18616a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f18617b;

    /* renamed from: c, reason: collision with root package name */
    private int f18618c;

    /* renamed from: d, reason: collision with root package name */
    private int f18619d;

    public D() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f18618c;
        int i11 = this.f18619d;
        V[] vArr = this.f18617b;
        int length = (i10 + i11) % vArr.length;
        this.f18616a[length] = j10;
        vArr[length] = v10;
        this.f18619d = i11 + 1;
    }

    private void d(long j10) {
        if (this.f18619d > 0) {
            if (j10 <= this.f18616a[((this.f18618c + r0) - 1) % this.f18617b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f18617b.length;
        if (this.f18619d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f18618c;
        int i12 = length - i11;
        System.arraycopy(this.f18616a, i11, jArr, 0, i12);
        System.arraycopy(this.f18617b, this.f18618c, vArr, 0, i12);
        int i13 = this.f18618c;
        if (i13 > 0) {
            System.arraycopy(this.f18616a, 0, jArr, i12, i13);
            System.arraycopy(this.f18617b, 0, vArr, i12, this.f18618c);
        }
        this.f18616a = jArr;
        this.f18617b = vArr;
        this.f18618c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f18619d > 0) {
            long j12 = j10 - this.f18616a[this.f18618c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    private V k() {
        C1804a.g(this.f18619d > 0);
        V[] vArr = this.f18617b;
        int i10 = this.f18618c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f18618c = (i10 + 1) % vArr.length;
        this.f18619d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f18618c = 0;
        this.f18619d = 0;
        Arrays.fill(this.f18617b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f18619d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f18619d;
    }

    public D(int i10) {
        this.f18616a = new long[i10];
        this.f18617b = (V[]) f(i10);
    }
}
