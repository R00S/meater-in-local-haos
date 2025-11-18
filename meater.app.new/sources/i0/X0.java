package i0;

import android.graphics.Rect;
import android.graphics.RectF;
import h0.C3478i;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: RectHelper.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh0/i;", "Landroid/graphics/Rect;", "b", "(Lh0/i;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Lh0/i;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Lh0/i;", "LU0/p;", "a", "(LU0/p;)Landroid/graphics/Rect;", "d", "(Landroid/graphics/Rect;)LU0/p;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 {
    public static final Rect a(U0.p pVar) {
        return new Rect(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
    }

    @InterfaceC4156a
    public static final Rect b(C3478i c3478i) {
        return new Rect((int) c3478i.getLeft(), (int) c3478i.getTop(), (int) c3478i.getRight(), (int) c3478i.getBottom());
    }

    public static final RectF c(C3478i c3478i) {
        return new RectF(c3478i.getLeft(), c3478i.getTop(), c3478i.getRight(), c3478i.getBottom());
    }

    public static final U0.p d(Rect rect) {
        return new U0.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C3478i e(Rect rect) {
        return new C3478i(rect.left, rect.top, rect.right, rect.bottom);
    }
}
