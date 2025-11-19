package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
class M extends L {
    M() {
    }

    @Override // androidx.transition.E
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.J, androidx.transition.E
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.E
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.L, androidx.transition.E
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.H, androidx.transition.E
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.H, androidx.transition.E
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
