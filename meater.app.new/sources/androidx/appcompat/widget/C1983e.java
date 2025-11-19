package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper.java */
/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1983e {

    /* renamed from: a, reason: collision with root package name */
    private final View f21654a;

    /* renamed from: d, reason: collision with root package name */
    private Y f21657d;

    /* renamed from: e, reason: collision with root package name */
    private Y f21658e;

    /* renamed from: f, reason: collision with root package name */
    private Y f21659f;

    /* renamed from: c, reason: collision with root package name */
    private int f21656c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C1987i f21655b = C1987i.b();

    C1983e(View view) {
        this.f21654a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f21659f == null) {
            this.f21659f = new Y();
        }
        Y y10 = this.f21659f;
        y10.a();
        ColorStateList colorStateListR = s1.X.r(this.f21654a);
        if (colorStateListR != null) {
            y10.f21600d = true;
            y10.f21597a = colorStateListR;
        }
        PorterDuff.Mode modeS = s1.X.s(this.f21654a);
        if (modeS != null) {
            y10.f21599c = true;
            y10.f21598b = modeS;
        }
        if (!y10.f21600d && !y10.f21599c) {
            return false;
        }
        C1987i.i(drawable, y10, this.f21654a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f21657d != null;
    }

    void b() {
        Drawable background = this.f21654a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            Y y10 = this.f21658e;
            if (y10 != null) {
                C1987i.i(background, y10, this.f21654a.getDrawableState());
                return;
            }
            Y y11 = this.f21657d;
            if (y11 != null) {
                C1987i.i(background, y11, this.f21654a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        Y y10 = this.f21658e;
        if (y10 != null) {
            return y10.f21597a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        Y y10 = this.f21658e;
        if (y10 != null) {
            return y10.f21598b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f21654a.getContext();
        int[] iArr = i.j.f42616K3;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f21654a;
        s1.X.l0(view, view.getContext(), iArr, attributeSet, a0VarV.r(), i10, 0);
        try {
            int i11 = i.j.f42621L3;
            if (a0VarV.s(i11)) {
                this.f21656c = a0VarV.n(i11, -1);
                ColorStateList colorStateListF = this.f21655b.f(this.f21654a.getContext(), this.f21656c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = i.j.f42626M3;
            if (a0VarV.s(i12)) {
                s1.X.s0(this.f21654a, a0VarV.c(i12));
            }
            int i13 = i.j.f42631N3;
            if (a0VarV.s(i13)) {
                s1.X.t0(this.f21654a, I.e(a0VarV.k(i13, -1), null));
            }
            a0VarV.x();
        } catch (Throwable th) {
            a0VarV.x();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f21656c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f21656c = i10;
        C1987i c1987i = this.f21655b;
        h(c1987i != null ? c1987i.f(this.f21654a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f21657d == null) {
                this.f21657d = new Y();
            }
            Y y10 = this.f21657d;
            y10.f21597a = colorStateList;
            y10.f21600d = true;
        } else {
            this.f21657d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f21658e == null) {
            this.f21658e = new Y();
        }
        Y y10 = this.f21658e;
        y10.f21597a = colorStateList;
        y10.f21600d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f21658e == null) {
            this.f21658e = new Y();
        }
        Y y10 = this.f21658e;
        y10.f21598b = mode;
        y10.f21599c = true;
        b();
    }
}
