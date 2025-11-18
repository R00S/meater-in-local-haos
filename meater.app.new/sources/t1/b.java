package t1;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: classes.dex */
public final class b {
    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
