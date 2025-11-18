package p024c.p088x;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* renamed from: c.x.e0 */
/* loaded from: classes.dex */
class C1032e0 extends C1030d0 {

    /* renamed from: f */
    private static boolean f6830f = true;

    /* renamed from: g */
    private static boolean f6831g = true;

    C1032e0() {
    }

    @Override // p024c.p088x.C1040i0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo6585h(View view, Matrix matrix) {
        if (f6830f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6830f = false;
            }
        }
    }

    @Override // p024c.p088x.C1040i0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo6586i(View view, Matrix matrix) {
        if (f6831g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6831g = false;
            }
        }
    }
}
