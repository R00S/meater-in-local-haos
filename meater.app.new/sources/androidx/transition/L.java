package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
class L extends J {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f29427g = true;

    /* compiled from: ViewUtilsApi23.java */
    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    L() {
    }

    @Override // androidx.transition.E
    @SuppressLint({"NewApi"})
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f29427g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f29427g = false;
            }
        }
    }
}
