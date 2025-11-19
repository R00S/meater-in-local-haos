package s1;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f49056a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f49057b;

    /* renamed from: c, reason: collision with root package name */
    private final View f49058c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f49059d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f49060e;

    public D(View view) {
        this.f49058c = view;
    }

    private boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentH;
        int i15;
        int i16;
        int[] iArr3;
        if (!l() || (viewParentH = h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f49058c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        C4430e0.d(viewParentH, this.f49058c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f49058c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent h(int i10) {
        if (i10 == 0) {
            return this.f49056a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f49057b;
    }

    private int[] i() {
        if (this.f49060e == null) {
            this.f49060e = new int[2];
        }
        return this.f49060e;
    }

    private void n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f49056a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f49057b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return C4430e0.a(viewParentH, this.f49058c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return C4430e0.b(viewParentH, this.f49058c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentH;
        int i13;
        int i14;
        if (!l() || (viewParentH = h(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f49058c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C4430e0.c(viewParentH, this.f49058c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f49058c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return g(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i10) {
        return h(i10) != null;
    }

    public boolean l() {
        return this.f49059d;
    }

    public void m(boolean z10) {
        if (this.f49059d) {
            X.M0(this.f49058c);
        }
        this.f49059d = z10;
    }

    public boolean o(int i10) {
        return p(i10, 0);
    }

    public boolean p(int i10, int i11) {
        if (k(i11)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f49058c;
        for (ViewParent parent = this.f49058c.getParent(); parent != null; parent = parent.getParent()) {
            if (C4430e0.f(parent, view, this.f49058c, i10, i11)) {
                n(i11, parent);
                C4430e0.e(parent, view, this.f49058c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i10) {
        ViewParent viewParentH = h(i10);
        if (viewParentH != null) {
            C4430e0.g(viewParentH, this.f49058c, i10);
            n(i10, null);
        }
    }
}
