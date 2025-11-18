package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat.java */
/* renamed from: androidx.core.view.g */
/* loaded from: classes.dex */
public final class C0297g {
    /* renamed from: a */
    public static int m2044a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m2045b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    /* renamed from: c */
    public static void m2046c(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i2);
        } else {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
