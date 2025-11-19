package d2;

import X1.C1804a;
import X1.L;

/* compiled from: SeekParameters.java */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    public static final I f39676c;

    /* renamed from: d, reason: collision with root package name */
    public static final I f39677d;

    /* renamed from: e, reason: collision with root package name */
    public static final I f39678e;

    /* renamed from: f, reason: collision with root package name */
    public static final I f39679f;

    /* renamed from: g, reason: collision with root package name */
    public static final I f39680g;

    /* renamed from: a, reason: collision with root package name */
    public final long f39681a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39682b;

    static {
        I i10 = new I(0L, 0L);
        f39676c = i10;
        f39677d = new I(Long.MAX_VALUE, Long.MAX_VALUE);
        f39678e = new I(Long.MAX_VALUE, 0L);
        f39679f = new I(0L, Long.MAX_VALUE);
        f39680g = i10;
    }

    public I(long j10, long j11) {
        C1804a.a(j10 >= 0);
        C1804a.a(j11 >= 0);
        this.f39681a = j10;
        this.f39682b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f39681a;
        if (j13 == 0 && this.f39682b == 0) {
            return j10;
        }
        long jO1 = L.o1(j10, j13, Long.MIN_VALUE);
        long jC = L.c(j10, this.f39682b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = jO1 <= j11 && j11 <= jC;
        if (jO1 <= j12 && j12 <= jC) {
            z10 = true;
        }
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : jO1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i10 = (I) obj;
        return this.f39681a == i10.f39681a && this.f39682b == i10.f39682b;
    }

    public int hashCode() {
        return (((int) this.f39681a) * 31) + ((int) this.f39682b);
    }
}
