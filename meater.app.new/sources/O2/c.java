package O2;

import J2.l;
import X1.L;
import android.util.Pair;
import v2.J;
import v2.K;

/* compiled from: MlltSeeker.java */
/* loaded from: classes.dex */
final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f13121a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f13122b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13123c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f13121a = jArr;
        this.f13122b = jArr2;
        this.f13123c = j10 == -9223372036854775807L ? L.Q0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c b(long j10, l lVar, long j11) {
        int length = lVar.f7263F.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += lVar.f7261D + lVar.f7263F[i12];
            j12 += lVar.f7262E + lVar.f7264G[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        int iH = L.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // O2.g
    public long a(long j10) {
        return L.Q0(((Long) c(j10, this.f13121a, this.f13122b).second).longValue());
    }

    @Override // O2.g
    public long f() {
        return -1L;
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.J
    public J.a k(long j10) {
        Pair<Long, Long> pairC = c(L.u1(L.q(j10, 0L, this.f13123c)), this.f13122b, this.f13121a);
        return new J.a(new K(L.Q0(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue()));
    }

    @Override // O2.g
    public int l() {
        return -2147483647;
    }

    @Override // v2.J
    public long m() {
        return this.f13123c;
    }
}
