package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import j1.C3718c;
import s1.C4442k0;

/* compiled from: EdgeToEdgeUtils.java */
/* loaded from: classes2.dex */
public class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = M7.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        C4442k0.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, M7.a.h(num.intValue())));
        e(window, d(iB2, M7.a.h(num2.intValue())));
    }

    @TargetApi(21)
    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return C3718c.k(M7.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return M7.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return M7.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        return M7.a.h(i10) || (i10 == 0 && z10);
    }

    public static void e(Window window, boolean z10) {
        C4442k0.a(window, window.getDecorView()).b(z10);
    }

    public static void f(Window window, boolean z10) {
        C4442k0.a(window, window.getDecorView()).c(z10);
    }
}
