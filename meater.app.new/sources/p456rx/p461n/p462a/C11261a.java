package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BackpressureUtils.java */
/* renamed from: rx.n.a.a */
/* loaded from: classes3.dex */
public final class C11261a {
    /* renamed from: a */
    public static long m40161a(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    /* renamed from: b */
    public static long m40162b(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j3, m40161a(j3, j2)));
        return j3;
    }

    /* renamed from: c */
    public static long m40163c(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                throw new IllegalStateException("More produced than requested: " + j4);
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }

    /* renamed from: d */
    public static boolean m40164d(long j2) {
        if (j2 >= 0) {
            return j2 != 0;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j2);
    }
}
