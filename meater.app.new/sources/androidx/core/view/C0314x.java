package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewParentCompat.java */
/* renamed from: androidx.core.view.x */
/* loaded from: classes.dex */
public final class C0314x {
    /* renamed from: a */
    public static boolean m2208a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0304n) {
                return ((InterfaceC0304n) viewParent).onNestedFling(view, f2, f3, z);
            }
            return false;
        }
        try {
            return viewParent.onNestedFling(view, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m2209b(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0304n) {
                return ((InterfaceC0304n) viewParent).onNestedPreFling(view, f2, f3);
            }
            return false;
        }
        try {
            return viewParent.onNestedPreFling(view, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: c */
    public static void m2210c(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof InterfaceC0302l) {
            ((InterfaceC0302l) viewParent).mo698o(view, i2, i3, iArr, i4);
            return;
        }
        if (i4 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0304n) {
                    ((InterfaceC0304n) viewParent).onNestedPreScroll(view, i2, i3, iArr);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedPreScroll(view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    /* renamed from: d */
    public static void m2211d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (viewParent instanceof InterfaceC0303m) {
            ((InterfaceC0303m) viewParent).mo693j(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent instanceof InterfaceC0302l) {
            ((InterfaceC0302l) viewParent).mo694k(view, i2, i3, i4, i5, i6);
            return;
        }
        if (i6 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0304n) {
                    ((InterfaceC0304n) viewParent).onNestedScroll(view, i2, i3, i4, i5);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScroll(view, i2, i3, i4, i5);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    /* renamed from: e */
    public static void m2212e(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof InterfaceC0302l) {
            ((InterfaceC0302l) viewParent).mo696m(view, view2, i2, i3);
            return;
        }
        if (i3 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0304n) {
                    ((InterfaceC0304n) viewParent).onNestedScrollAccepted(view, view2, i2);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScrollAccepted(view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    /* renamed from: f */
    public static boolean m2213f(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof InterfaceC0302l) {
            return ((InterfaceC0302l) viewParent).mo695l(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0304n) {
                return ((InterfaceC0304n) viewParent).onStartNestedScroll(view, view2, i2);
            }
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    /* renamed from: g */
    public static void m2214g(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof InterfaceC0302l) {
            ((InterfaceC0302l) viewParent).mo697n(view, i2);
            return;
        }
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0304n) {
                    ((InterfaceC0304n) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m2215h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
