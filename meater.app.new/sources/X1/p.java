package X1;

import java.util.NoSuchElementException;

/* compiled from: LongArrayQueue.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private int f18685a;

    /* renamed from: b, reason: collision with root package name */
    private int f18686b;

    /* renamed from: c, reason: collision with root package name */
    private int f18687c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f18688d;

    /* renamed from: e, reason: collision with root package name */
    private int f18689e;

    public p() {
        this(16);
    }

    public void a() {
        this.f18685a = 0;
        this.f18686b = -1;
        this.f18687c = 0;
    }

    public long b() {
        if (this.f18687c != 0) {
            return this.f18688d[this.f18685a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        return this.f18687c == 0;
    }

    public long d() {
        int i10 = this.f18687c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f18688d;
        int i11 = this.f18685a;
        long j10 = jArr[i11];
        this.f18685a = this.f18689e & (i11 + 1);
        this.f18687c = i10 - 1;
        return j10;
    }

    public p(int i10) {
        C1804a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f18685a = 0;
        this.f18686b = -1;
        this.f18687c = 0;
        long[] jArr = new long[i10];
        this.f18688d = jArr;
        this.f18689e = jArr.length - 1;
    }
}
