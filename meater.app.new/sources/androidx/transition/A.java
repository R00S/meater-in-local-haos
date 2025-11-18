package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f29417a = true;

    /* compiled from: ViewGroupUtils.java */
    static class a {
        static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z10) {
        if (f29417a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f29417a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z10);
        } else {
            a(viewGroup, z10);
        }
    }
}
