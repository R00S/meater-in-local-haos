package p024c.p088x;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* renamed from: c.x.h0 */
/* loaded from: classes.dex */
class C1038h0 extends C1036g0 {
    C1038h0() {
    }

    @Override // p024c.p088x.C1030d0, p024c.p088x.C1040i0
    /* renamed from: c */
    public float mo6580c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p024c.p088x.C1034f0, p024c.p088x.C1040i0
    /* renamed from: e */
    public void mo6588e(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // p024c.p088x.C1030d0, p024c.p088x.C1040i0
    /* renamed from: f */
    public void mo6582f(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p024c.p088x.C1036g0, p024c.p088x.C1040i0
    /* renamed from: g */
    public void mo6590g(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // p024c.p088x.C1032e0, p024c.p088x.C1040i0
    /* renamed from: h */
    public void mo6585h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p024c.p088x.C1032e0, p024c.p088x.C1040i0
    /* renamed from: i */
    public void mo6586i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
