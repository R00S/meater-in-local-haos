package Vb;

import Vb.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: longSaturatedMath.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"", "value", "LVb/a;", "a", "(J)J", "valueNs", "origin", "LVb/d;", "unit", "b", "(JJLVb/d;)J", "value1", "value2", "c", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {
    private static final long a(long j10) {
        return j10 < 0 ? a.INSTANCE.b() : a.INSTANCE.a();
    }

    public static final long b(long j10, long j11, d unit) {
        C3862t.g(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? a.W(a(j11)) : c(j10, j11, unit);
    }

    private static final long c(long j10, long j11, d dVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return c.p(j12, dVar);
        }
        d dVar2 = d.f18245E;
        if (dVar.compareTo(dVar2) >= 0) {
            return a.W(a(j12));
        }
        long jA = e.a(1L, dVar2, dVar);
        long j13 = (j10 / jA) - (j11 / jA);
        long j14 = (j10 % jA) - (j11 % jA);
        a.Companion c0267a = a.INSTANCE;
        return a.S(c.p(j13, dVar2), c.p(j14, dVar));
    }
}
