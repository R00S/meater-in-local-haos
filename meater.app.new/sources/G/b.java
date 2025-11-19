package G;

import R0.q;
import kotlin.Metadata;

/* compiled from: LayoutUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"LU0/b;", "constraints", "", "softWrap", "LR0/q;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return U0.b.INSTANCE.b(0, c(j10, z10, i10, f10), 0, U0.b.k(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !q.e(i10, q.INSTANCE.b())) {
            return Ha.g.d(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iL = ((z10 || q.e(i10, q.INSTANCE.b())) && U0.b.h(j10)) ? U0.b.l(j10) : Integer.MAX_VALUE;
        return U0.b.n(j10) == iL ? iL : Ha.g.k(F.i.a(f10), U0.b.n(j10), iL);
    }
}
