package h0;

import kotlin.Metadata;

/* compiled from: RoundRect.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a@\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Lh0/k;", "a", "(FFFFFF)Lh0/k;", "Lh0/a;", "cornerRadius", "c", "(FFFFJ)Lh0/k;", "Lh0/i;", "rect", "topLeft", "topRight", "bottomRight", "bottomLeft", "b", "(Lh0/i;JJJJ)Lh0/k;", "d", "(Lh0/k;)Lh0/i;", "boundingRect", "", "e", "(Lh0/k;)Z", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3481l {
    public static final C3480k a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jA = C3471b.a(f14, f15);
        return new C3480k(f10, f11, f12, f13, jA, jA, jA, jA, null);
    }

    public static final C3480k b(C3478i c3478i, long j10, long j11, long j12, long j13) {
        return new C3480k(c3478i.getLeft(), c3478i.getTop(), c3478i.getRight(), c3478i.getBottom(), j10, j11, j12, j13, null);
    }

    public static final C3480k c(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, C3470a.d(j10), C3470a.e(j10));
    }

    public static final C3478i d(C3480k c3480k) {
        return new C3478i(c3480k.getLeft(), c3480k.getTop(), c3480k.getRight(), c3480k.getBottom());
    }

    public static final boolean e(C3480k c3480k) {
        return C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.e(c3480k.getTopLeftCornerRadius()) && C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.d(c3480k.getTopRightCornerRadius()) && C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.e(c3480k.getTopRightCornerRadius()) && C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.d(c3480k.getBottomRightCornerRadius()) && C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.e(c3480k.getBottomRightCornerRadius()) && C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.d(c3480k.getBottomLeftCornerRadius()) && C3470a.d(c3480k.getTopLeftCornerRadius()) == C3470a.e(c3480k.getBottomLeftCornerRadius());
    }
}
