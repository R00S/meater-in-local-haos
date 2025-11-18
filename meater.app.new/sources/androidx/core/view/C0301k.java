package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* renamed from: androidx.core.view.k */
/* loaded from: classes.dex */
public class C0301k {

    /* renamed from: a */
    private ViewParent f2392a;

    /* renamed from: b */
    private ViewParent f2393b;

    /* renamed from: c */
    private final View f2394c;

    /* renamed from: d */
    private boolean f2395d;

    /* renamed from: e */
    private int[] f2396e;

    public C0301k(View view) {
        this.f2394c = view;
    }

    /* renamed from: h */
    private boolean m2056h(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentM2057i;
        int i7;
        int i8;
        int[] iArr3;
        if (!m2069m() || (viewParentM2057i = m2057i(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2394c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM2058j = m2058j();
            iArrM2058j[0] = 0;
            iArrM2058j[1] = 0;
            iArr3 = iArrM2058j;
        } else {
            iArr3 = iArr2;
        }
        C0314x.m2211d(viewParentM2057i, this.f2394c, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f2394c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m2057i(int i2) {
        if (i2 == 0) {
            return this.f2392a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f2393b;
    }

    /* renamed from: j */
    private int[] m2058j() {
        if (this.f2396e == null) {
            this.f2396e = new int[2];
        }
        return this.f2396e;
    }

    /* renamed from: o */
    private void m2059o(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f2392a = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f2393b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m2060a(float f2, float f3, boolean z) {
        ViewParent viewParentM2057i;
        if (!m2069m() || (viewParentM2057i = m2057i(0)) == null) {
            return false;
        }
        return C0314x.m2208a(viewParentM2057i, this.f2394c, f2, f3, z);
    }

    /* renamed from: b */
    public boolean m2061b(float f2, float f3) {
        ViewParent viewParentM2057i;
        if (!m2069m() || (viewParentM2057i = m2057i(0)) == null) {
            return false;
        }
        return C0314x.m2209b(viewParentM2057i, this.f2394c, f2, f3);
    }

    /* renamed from: c */
    public boolean m2062c(int i2, int i3, int[] iArr, int[] iArr2) {
        return m2063d(i2, i3, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m2063d(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentM2057i;
        int i5;
        int i6;
        if (!m2069m() || (viewParentM2057i = m2057i(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2394c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = m2058j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0314x.m2210c(viewParentM2057i, this.f2394c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f2394c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m2064e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        m2056h(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    /* renamed from: f */
    public boolean m2065f(int i2, int i3, int i4, int i5, int[] iArr) {
        return m2056h(i2, i3, i4, i5, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m2066g(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return m2056h(i2, i3, i4, i5, iArr, i6, null);
    }

    /* renamed from: k */
    public boolean m2067k() {
        return m2068l(0);
    }

    /* renamed from: l */
    public boolean m2068l(int i2) {
        return m2057i(i2) != null;
    }

    /* renamed from: m */
    public boolean m2069m() {
        return this.f2395d;
    }

    /* renamed from: n */
    public void m2070n(boolean z) {
        if (this.f2395d) {
            C0311u.m2089C0(this.f2394c);
        }
        this.f2395d = z;
    }

    /* renamed from: p */
    public boolean m2071p(int i2) {
        return m2072q(i2, 0);
    }

    /* renamed from: q */
    public boolean m2072q(int i2, int i3) {
        if (m2068l(i3)) {
            return true;
        }
        if (!m2069m()) {
            return false;
        }
        View view = this.f2394c;
        for (ViewParent parent = this.f2394c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0314x.m2213f(parent, view, this.f2394c, i2, i3)) {
                m2059o(i3, parent);
                C0314x.m2212e(parent, view, this.f2394c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m2073r() {
        m2074s(0);
    }

    /* renamed from: s */
    public void m2074s(int i2) {
        ViewParent viewParentM2057i = m2057i(i2);
        if (viewParentM2057i != null) {
            C0314x.m2214g(viewParentM2057i, this.f2394c, i2);
            m2059o(i2, null);
        }
    }
}
