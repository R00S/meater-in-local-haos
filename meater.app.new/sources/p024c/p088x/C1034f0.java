package p024c.p088x;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* renamed from: c.x.f0 */
/* loaded from: classes.dex */
class C1034f0 extends C1032e0 {

    /* renamed from: h */
    private static boolean f6832h = true;

    C1034f0() {
    }

    @Override // p024c.p088x.C1040i0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo6588e(View view, int i2, int i3, int i4, int i5) {
        if (f6832h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f6832h = false;
            }
        }
    }
}
