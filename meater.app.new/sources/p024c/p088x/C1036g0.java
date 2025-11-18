package p024c.p088x;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* renamed from: c.x.g0 */
/* loaded from: classes.dex */
class C1036g0 extends C1034f0 {

    /* renamed from: i */
    private static boolean f6833i = true;

    C1036g0() {
    }

    @Override // p024c.p088x.C1040i0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo6590g(View view, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo6590g(view, i2);
        } else if (f6833i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f6833i = false;
            }
        }
    }
}
