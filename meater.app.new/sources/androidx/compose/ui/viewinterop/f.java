package androidx.compose.ui.viewinterop;

import A0.C0832k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import b0.i;
import h0.C3478i;
import kotlin.Metadata;

/* compiled from: FocusGroupNode.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lb0/i;", "e", "(Lb0/i;)Lb0/i;", "Lb0/i$c;", "Landroid/view/View;", "g", "(Lb0/i$c;)Landroid/view/View;", "other", "", "d", "(Landroid/view/View;Landroid/view/View;)Z", "Lg0/i;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "f", "(Lg0/i;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final b0.i e(b0.i iVar) {
        return androidx.compose.ui.focus.e.a(androidx.compose.ui.focus.e.a(iVar.e(FocusGroupPropertiesElement.f23512b)).e(FocusTargetPropertiesElement.f23513b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(g0.i iVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C3478i c3478iH = iVar.h();
        if (c3478iH == null) {
            return null;
        }
        return new Rect((((int) c3478iH.getLeft()) + iArr[0]) - iArr2[0], (((int) c3478iH.getTop()) + iArr[1]) - iArr2[1], (((int) c3478iH.getRight()) + iArr[0]) - iArr2[0], (((int) c3478iH.getBottom()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(i.c cVar) {
        View viewR = C0832k.k(cVar.getNode()).R();
        if (viewR != null) {
            return viewR;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
