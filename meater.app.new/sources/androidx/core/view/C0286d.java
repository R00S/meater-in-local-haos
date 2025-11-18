package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* compiled from: GravityCompat.java */
/* renamed from: androidx.core.view.d */
/* loaded from: classes.dex */
public final class C0286d {
    /* renamed from: a */
    public static void m1931a(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i2, i3, i4, rect, rect2, i5);
        } else {
            Gravity.apply(i2, i3, i4, rect, rect2);
        }
    }

    /* renamed from: b */
    public static int m1932b(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i2, i3) : i2 & (-8388609);
    }
}
