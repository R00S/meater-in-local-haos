package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
class H extends E {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f29424d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f29425e = true;

    /* compiled from: ViewUtilsApi21.java */
    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    H() {
    }

    @Override // androidx.transition.E
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f29424d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f29424d = false;
            }
        }
    }

    @Override // androidx.transition.E
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f29425e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f29425e = false;
            }
        }
    }
}
