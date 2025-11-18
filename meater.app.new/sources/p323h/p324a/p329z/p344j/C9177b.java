package p323h.p324a.p329z.p344j;

import java.util.concurrent.atomic.AtomicLong;
import p323h.p324a.p325a0.C9063a;

/* compiled from: BackpressureHelper.java */
/* renamed from: h.a.z.j.b */
/* loaded from: classes2.dex */
public final class C9177b {
    /* renamed from: a */
    public static long m29386a(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, m29387b(j3, j2)));
        return j3;
    }

    /* renamed from: b */
    public static long m29387b(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    /* renamed from: c */
    public static long m29388c(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                C9063a.m29147o(new IllegalStateException("More produced than requested: " + j4));
                j4 = 0L;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }
}
