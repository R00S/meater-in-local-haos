package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import j.C3699a;
import k1.C3784a;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1985g {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f21686a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f21687b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f21688c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21689d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21690e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21691f;

    C1985g(CheckedTextView checkedTextView) {
        this.f21686a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f21686a);
        if (drawableA != null) {
            if (this.f21689d || this.f21690e) {
                Drawable drawableMutate = C3784a.r(drawableA).mutate();
                if (this.f21689d) {
                    C3784a.o(drawableMutate, this.f21687b);
                }
                if (this.f21690e) {
                    C3784a.p(drawableMutate, this.f21688c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f21686a.getDrawableState());
                }
                this.f21686a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f21687b;
    }

    PorterDuff.Mode c() {
        return this.f21688c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        Context context = this.f21686a.getContext();
        int[] iArr = i.j.f42638P0;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f21686a;
        s1.X.l0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, a0VarV.r(), i10, 0);
        try {
            int i11 = i.j.f42648R0;
            if (!a0VarV.s(i11) || (iN2 = a0VarV.n(i11, 0)) == 0) {
                int i12 = i.j.f42643Q0;
                if (a0VarV.s(i12) && (iN = a0VarV.n(i12, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f21686a;
                    checkedTextView2.setCheckMarkDrawable(C3699a.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f21686a;
                    checkedTextView3.setCheckMarkDrawable(C3699a.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i13 = i.j.f42653S0;
            if (a0VarV.s(i13)) {
                androidx.core.widget.c.b(this.f21686a, a0VarV.c(i13));
            }
            int i14 = i.j.f42657T0;
            if (a0VarV.s(i14)) {
                androidx.core.widget.c.c(this.f21686a, I.e(a0VarV.k(i14, -1), null));
            }
        } finally {
            a0VarV.x();
        }
    }

    void e() {
        if (this.f21691f) {
            this.f21691f = false;
        } else {
            this.f21691f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f21687b = colorStateList;
        this.f21689d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f21688c = mode;
        this.f21690e = true;
        a();
    }
}
