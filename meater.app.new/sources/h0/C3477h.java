package h0;

import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u000b\u001a\u00020\u0006*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u001e\u0010\u000e\u001a\u00020\u0006*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"\u001e\u0010\u0011\u001a\u00020\u0006*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\b¨\u0006\u0012"}, d2 = {"", "x", "y", "Lh0/g;", "a", "(FF)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "c", "isSpecified-k-4lQ0M$annotations", "isSpecified", "d", "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3477h {
    public static final long a(float f10, float f11) {
        return C3476g.e((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        long j11 = (j10 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j11) & (j11 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean c(long j10) {
        return (j10 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j10) {
        return (j10 & 9223372034707292159L) == 9205357640488583168L;
    }
}
