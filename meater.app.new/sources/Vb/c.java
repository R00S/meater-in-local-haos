package Vb;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"", "LVb/d;", "unit", "LVb/a;", "o", "(ILVb/d;)J", "", "p", "(JLVb/d;)J", "nanos", "n", "(J)J", "millis", "m", "normalNanos", "k", "normalMillis", "i", "normalValue", "unitDiscriminator", "h", "(JI)J", "l", "j", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(long j10, int i10) {
        return a.v((j10 << 1) + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10) {
        return a.v((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? i(Ha.g.l(j10, -4611686018427387903L, 4611686018427387903L)) : k(m(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return a.v(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? i(n(j10)) : k(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return j10 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 / 1000000;
    }

    public static final long o(int i10, d unit) {
        C3862t.g(unit, "unit");
        return unit.compareTo(d.f18246F) <= 0 ? k(e.b(i10, unit, d.f18243C)) : p(i10, unit);
    }

    public static final long p(long j10, d unit) {
        C3862t.g(unit, "unit");
        d dVar = d.f18243C;
        long jB = e.b(4611686018426999999L, dVar, unit);
        return ((-jB) > j10 || j10 > jB) ? i(Ha.g.l(e.a(j10, unit, d.f18245E), -4611686018427387903L, 4611686018427387903L)) : k(e.b(j10, unit, dVar));
    }
}
