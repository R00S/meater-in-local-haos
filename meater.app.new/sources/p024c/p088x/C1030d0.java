package p024c.p088x;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* renamed from: c.x.d0 */
/* loaded from: classes.dex */
class C1030d0 extends C1040i0 {

    /* renamed from: e */
    private static boolean f6815e = true;

    C1030d0() {
    }

    @Override // p024c.p088x.C1040i0
    /* renamed from: a */
    public void mo6579a(View view) {
    }

    @Override // p024c.p088x.C1040i0
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo6580c(View view) {
        if (f6815e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6815e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p024c.p088x.C1040i0
    /* renamed from: d */
    public void mo6581d(View view) {
    }

    @Override // p024c.p088x.C1040i0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo6582f(View view, float f2) {
        if (f6815e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f6815e = false;
            }
        }
        view.setAlpha(f2);
    }
}
