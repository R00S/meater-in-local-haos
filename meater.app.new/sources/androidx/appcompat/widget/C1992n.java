package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import j.C3699a;

/* compiled from: AppCompatImageHelper.java */
/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1992n {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f21719a;

    /* renamed from: b, reason: collision with root package name */
    private Y f21720b;

    /* renamed from: c, reason: collision with root package name */
    private Y f21721c;

    /* renamed from: d, reason: collision with root package name */
    private Y f21722d;

    /* renamed from: e, reason: collision with root package name */
    private int f21723e = 0;

    public C1992n(ImageView imageView) {
        this.f21719a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f21722d == null) {
            this.f21722d = new Y();
        }
        Y y10 = this.f21722d;
        y10.a();
        ColorStateList colorStateListA = androidx.core.widget.f.a(this.f21719a);
        if (colorStateListA != null) {
            y10.f21600d = true;
            y10.f21597a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.f.b(this.f21719a);
        if (modeB != null) {
            y10.f21599c = true;
            y10.f21598b = modeB;
        }
        if (!y10.f21600d && !y10.f21599c) {
            return false;
        }
        C1987i.i(drawable, y10, this.f21719a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f21720b != null;
    }

    void b() {
        if (this.f21719a.getDrawable() != null) {
            this.f21719a.getDrawable().setLevel(this.f21723e);
        }
    }

    void c() {
        Drawable drawable = this.f21719a.getDrawable();
        if (drawable != null) {
            I.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            Y y10 = this.f21721c;
            if (y10 != null) {
                C1987i.i(drawable, y10, this.f21719a.getDrawableState());
                return;
            }
            Y y11 = this.f21720b;
            if (y11 != null) {
                C1987i.i(drawable, y11, this.f21719a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        Y y10 = this.f21721c;
        if (y10 != null) {
            return y10.f21597a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        Y y10 = this.f21721c;
        if (y10 != null) {
            return y10.f21598b;
        }
        return null;
    }

    boolean f() {
        return !(this.f21719a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f21719a.getContext();
        int[] iArr = i.j.f42637P;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f21719a;
        s1.X.l0(imageView, imageView.getContext(), iArr, attributeSet, a0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f21719a.getDrawable();
            if (drawable == null && (iN = a0VarV.n(i.j.f42642Q, -1)) != -1 && (drawable = C3699a.b(this.f21719a.getContext(), iN)) != null) {
                this.f21719a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                I.b(drawable);
            }
            int i11 = i.j.f42647R;
            if (a0VarV.s(i11)) {
                androidx.core.widget.f.c(this.f21719a, a0VarV.c(i11));
            }
            int i12 = i.j.f42652S;
            if (a0VarV.s(i12)) {
                androidx.core.widget.f.d(this.f21719a, I.e(a0VarV.k(i12, -1), null));
            }
            a0VarV.x();
        } catch (Throwable th) {
            a0VarV.x();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f21723e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = C3699a.b(this.f21719a.getContext(), i10);
            if (drawableB != null) {
                I.b(drawableB);
            }
            this.f21719a.setImageDrawable(drawableB);
        } else {
            this.f21719a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f21721c == null) {
            this.f21721c = new Y();
        }
        Y y10 = this.f21721c;
        y10.f21597a = colorStateList;
        y10.f21600d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f21721c == null) {
            this.f21721c = new Y();
        }
        Y y10 = this.f21721c;
        y10.f21598b = mode;
        y10.f21599c = true;
        c();
    }
}
