package A0;

import kotlin.Metadata;

/* compiled from: HitTestResult.kt */
@Aa.b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LA0/q;", "", "", "packedValue", "b", "(J)J", "other", "", "a", "(JJ)I", "", "c", "(J)F", "distance", "", "d", "(J)Z", "isInLayer", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0838q {
    public static final int a(long j10, long j11) {
        boolean zD = d(j10);
        return zD != d(j11) ? zD ? -1 : 1 : (int) Math.signum(c(j10) - c(j11));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean d(long j10) {
        return ((int) (j10 & 4294967295L)) != 0;
    }

    public static long b(long j10) {
        return j10;
    }
}
