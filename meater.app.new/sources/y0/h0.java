package y0;

import h0.C3482m;
import h0.C3483n;
import kotlin.Metadata;

/* compiled from: ScaleFactor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"", "scaleX", "scaleY", "Ly0/g0;", "a", "(FF)J", "Lh0/m;", "scaleFactor", "b", "(JJ)J", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {
    public static final long a(float f10, float f11) {
        return g0.a((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j10, long j11) {
        return C3483n.a(C3482m.i(j10) * g0.b(j11), C3482m.g(j10) * g0.c(j11));
    }
}
