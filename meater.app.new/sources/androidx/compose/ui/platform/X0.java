package androidx.compose.ui.platform;

import h0.C3470a;
import h0.C3478i;
import h0.C3480k;
import i0.C3561Y;
import i0.N0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShapeContainingUtil.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Li0/N0;", "outline", "", "x", "y", "Li0/R0;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(Li0/N0;FFLi0/R0;Li0/R0;)Z", "Lh0/i;", "rect", "e", "(Lh0/i;FF)Z", "Li0/N0$c;", "touchPointPath", "opPath", "f", "(Li0/N0$c;FFLi0/R0;Li0/R0;)Z", "Lh0/k;", "a", "(Lh0/k;)Z", "Lh0/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", "d", "(Li0/R0;FFLi0/R0;Li0/R0;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 {
    private static final boolean a(C3480k c3480k) {
        return C3470a.d(c3480k.getTopLeftCornerRadius()) + C3470a.d(c3480k.getTopRightCornerRadius()) <= c3480k.j() && C3470a.d(c3480k.getBottomLeftCornerRadius()) + C3470a.d(c3480k.getBottomRightCornerRadius()) <= c3480k.j() && C3470a.e(c3480k.getTopLeftCornerRadius()) + C3470a.e(c3480k.getBottomLeftCornerRadius()) <= c3480k.d() && C3470a.e(c3480k.getTopRightCornerRadius()) + C3470a.e(c3480k.getBottomRightCornerRadius()) <= c3480k.d();
    }

    public static final boolean b(i0.N0 n02, float f10, float f11, i0.R0 r02, i0.R0 r03) {
        if (n02 instanceof N0.b) {
            return e(((N0.b) n02).b(), f10, f11);
        }
        if (n02 instanceof N0.c) {
            return f((N0.c) n02, f10, f11, r02, r03);
        }
        if (n02 instanceof N0.a) {
            return d(((N0.a) n02).getPath(), f10, f11, r02, r03);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(i0.N0 n02, float f10, float f11, i0.R0 r02, i0.R0 r03, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            r02 = null;
        }
        if ((i10 & 16) != 0) {
            r03 = null;
        }
        return b(n02, f10, f11, r02, r03);
    }

    private static final boolean d(i0.R0 r02, float f10, float f11, i0.R0 r03, i0.R0 r04) {
        C3478i c3478i = new C3478i(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (r03 == null) {
            r03 = C3561Y.a();
        }
        i0.R0.v(r03, c3478i, null, 2, null);
        if (r04 == null) {
            r04 = C3561Y.a();
        }
        r04.o(r02, r03, i0.V0.INSTANCE.b());
        boolean zIsEmpty = r04.isEmpty();
        r04.b();
        r03.b();
        return !zIsEmpty;
    }

    private static final boolean e(C3478i c3478i, float f10, float f11) {
        return c3478i.getLeft() <= f10 && f10 < c3478i.getRight() && c3478i.getTop() <= f11 && f11 < c3478i.getBottom();
    }

    private static final boolean f(N0.c cVar, float f10, float f11, i0.R0 r02, i0.R0 r03) {
        C3480k roundRect = cVar.getRoundRect();
        if (f10 < roundRect.getLeft() || f10 >= roundRect.getRight() || f11 < roundRect.getTop() || f11 >= roundRect.getBottom()) {
            return false;
        }
        if (!a(roundRect)) {
            i0.R0 r0A = r03 == null ? C3561Y.a() : r03;
            i0.R0.c(r0A, roundRect, null, 2, null);
            return d(r0A, f10, f11, r02, r03);
        }
        float fD = C3470a.d(roundRect.getTopLeftCornerRadius()) + roundRect.getLeft();
        float fE = C3470a.e(roundRect.getTopLeftCornerRadius()) + roundRect.getTop();
        float right = roundRect.getRight() - C3470a.d(roundRect.getTopRightCornerRadius());
        float fE2 = C3470a.e(roundRect.getTopRightCornerRadius()) + roundRect.getTop();
        float right2 = roundRect.getRight() - C3470a.d(roundRect.getBottomRightCornerRadius());
        float bottom = roundRect.getBottom() - C3470a.e(roundRect.getBottomRightCornerRadius());
        float bottom2 = roundRect.getBottom() - C3470a.e(roundRect.getBottomLeftCornerRadius());
        float fD2 = C3470a.d(roundRect.getBottomLeftCornerRadius()) + roundRect.getLeft();
        if (f10 < fD && f11 < fE) {
            return g(f10, f11, roundRect.getTopLeftCornerRadius(), fD, fE);
        }
        if (f10 < fD2 && f11 > bottom2) {
            return g(f10, f11, roundRect.getBottomLeftCornerRadius(), fD2, bottom2);
        }
        if (f10 > right && f11 < fE2) {
            return g(f10, f11, roundRect.getTopRightCornerRadius(), right, fE2);
        }
        if (f10 <= right2 || f11 <= bottom) {
            return true;
        }
        return g(f10, f11, roundRect.getBottomRightCornerRadius(), right2, bottom);
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fD = C3470a.d(j10);
        float fE = C3470a.e(j10);
        return ((f14 * f14) / (fD * fD)) + ((f15 * f15) / (fE * fE)) <= 1.0f;
    }
}
