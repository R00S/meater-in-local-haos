package androidx.compose.ui.focus;

import U0.t;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.platform.C2036q;
import h0.C3478i;
import kotlin.Metadata;

/* compiled from: FocusInteropUtils.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/b;", "d", "(I)Landroidx/compose/ui/focus/b;", "c", "(I)Ljava/lang/Integer;", "androidLayoutDirection", "LU0/t;", "e", "(I)LU0/t;", "Landroid/view/View;", "Lh0/i;", "a", "(Landroid/view/View;)Lh0/i;", "direction", "Landroid/graphics/Rect;", "rect", "", "b", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final C3478i a(View view) {
        int[] iArrA = c.INSTANCE.a();
        view.getLocationInWindow(iArrA);
        int i10 = iArrA[0];
        return new C3478i(i10, iArrA[1], i10 + view.getWidth(), iArrA[1] + view.getHeight());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C2036q) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i10) {
        b.Companion companion = b.INSTANCE;
        if (b.l(i10, companion.h())) {
            return 33;
        }
        if (b.l(i10, companion.a())) {
            return 130;
        }
        if (b.l(i10, companion.d())) {
            return 17;
        }
        if (b.l(i10, companion.g())) {
            return 66;
        }
        if (b.l(i10, companion.e())) {
            return 2;
        }
        return b.l(i10, companion.f()) ? 1 : null;
    }

    public static final b d(int i10) {
        if (i10 == 1) {
            return b.i(b.INSTANCE.f());
        }
        if (i10 == 2) {
            return b.i(b.INSTANCE.e());
        }
        if (i10 == 17) {
            return b.i(b.INSTANCE.d());
        }
        if (i10 == 33) {
            return b.i(b.INSTANCE.h());
        }
        if (i10 == 66) {
            return b.i(b.INSTANCE.g());
        }
        if (i10 != 130) {
            return null;
        }
        return b.i(b.INSTANCE.a());
    }

    public static final t e(int i10) {
        if (i10 == 0) {
            return t.Ltr;
        }
        if (i10 != 1) {
            return null;
        }
        return t.Rtl;
    }
}
