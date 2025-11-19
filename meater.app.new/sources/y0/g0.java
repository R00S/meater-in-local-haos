package y0;

import kotlin.Metadata;
import x0.C5047a;

/* compiled from: ScaleFactor.kt */
@Aa.b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000f"}, d2 = {"Ly0/g0;", "", "", "packedValue", "a", "(J)J", "", "b", "(J)F", "getScaleX$annotations", "()V", "scaleX", "c", "getScaleY$annotations", "scaleY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final long f53038b = h0.a(Float.NaN, Float.NaN);

    public static final float b(long j10) {
        if (!(j10 != f53038b)) {
            C5047a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        if (!(j10 != f53038b)) {
            C5047a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static long a(long j10) {
        return j10;
    }
}
