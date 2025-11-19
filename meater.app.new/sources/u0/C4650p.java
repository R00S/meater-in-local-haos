package u0;

import h0.C3476g;
import h0.C3482m;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a$\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lu0/z;", "", "a", "(Lu0/z;)Z", "b", "c", "d", "j", "Lh0/g;", "g", "(Lu0/z;)J", "h", "ignoreConsumed", "i", "(Lu0/z;Z)J", "LU0/r;", "size", "e", "(Lu0/z;J)Z", "Lh0/m;", "extendedTouchPadding", "f", "(Lu0/z;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4650p {
    public static final boolean a(PointerInputChange c4660z) {
        return (c4660z.p() || c4660z.getPreviousPressed() || !c4660z.getPressed()) ? false : true;
    }

    public static final boolean b(PointerInputChange c4660z) {
        return !c4660z.getPreviousPressed() && c4660z.getPressed();
    }

    public static final boolean c(PointerInputChange c4660z) {
        return (c4660z.p() || !c4660z.getPreviousPressed() || c4660z.getPressed()) ? false : true;
    }

    public static final boolean d(PointerInputChange c4660z) {
        return c4660z.getPreviousPressed() && !c4660z.getPressed();
    }

    @InterfaceC4156a
    public static final boolean e(PointerInputChange c4660z, long j10) {
        long jH = c4660z.getPosition();
        float fM = C3476g.m(jH);
        float fN = C3476g.n(jH);
        return fM < 0.0f || fM > ((float) U0.r.g(j10)) || fN < 0.0f || fN > ((float) U0.r.f(j10));
    }

    public static final boolean f(PointerInputChange c4660z, long j10, long j11) {
        if (!C4627M.g(c4660z.getType(), C4627M.INSTANCE.d())) {
            return e(c4660z, j10);
        }
        long jH = c4660z.getPosition();
        float fM = C3476g.m(jH);
        float fN = C3476g.n(jH);
        return fM < (-C3482m.i(j11)) || fM > ((float) U0.r.g(j10)) + C3482m.i(j11) || fN < (-C3482m.g(j11)) || fN > ((float) U0.r.f(j10)) + C3482m.g(j11);
    }

    public static final long g(PointerInputChange c4660z) {
        return i(c4660z, false);
    }

    public static final long h(PointerInputChange c4660z) {
        return i(c4660z, true);
    }

    private static final long i(PointerInputChange c4660z, boolean z10) {
        long jQ = C3476g.q(c4660z.getPosition(), c4660z.getPreviousPosition());
        return (z10 || !c4660z.p()) ? jQ : C3476g.INSTANCE.c();
    }

    public static final boolean j(PointerInputChange c4660z) {
        return !C3476g.j(i(c4660z, true), C3476g.INSTANCE.c());
    }
}
