package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import j.C3699a;
import k1.C3784a;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1986h {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f21694a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f21695b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f21696c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21697d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21698e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21699f;

    C1986h(CompoundButton compoundButton) {
        this.f21694a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.d.a(this.f21694a);
        if (drawableA != null) {
            if (this.f21697d || this.f21698e) {
                Drawable drawableMutate = C3784a.r(drawableA).mutate();
                if (this.f21697d) {
                    C3784a.o(drawableMutate, this.f21695b);
                }
                if (this.f21698e) {
                    C3784a.p(drawableMutate, this.f21696c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f21694a.getDrawableState());
                }
                this.f21694a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f21695b;
    }

    PorterDuff.Mode c() {
        return this.f21696c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        Context context = this.f21694a.getContext();
        int[] iArr = i.j.f42661U0;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f21694a;
        s1.X.l0(compoundButton, compoundButton.getContext(), iArr, attributeSet, a0VarV.r(), i10, 0);
        try {
            int i11 = i.j.f42669W0;
            if (!a0VarV.s(i11) || (iN2 = a0VarV.n(i11, 0)) == 0) {
                int i12 = i.j.f42665V0;
                if (a0VarV.s(i12) && (iN = a0VarV.n(i12, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f21694a;
                    compoundButton2.setButtonDrawable(C3699a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f21694a;
                    compoundButton3.setButtonDrawable(C3699a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i13 = i.j.f42673X0;
            if (a0VarV.s(i13)) {
                androidx.core.widget.d.d(this.f21694a, a0VarV.c(i13));
            }
            int i14 = i.j.f42677Y0;
            if (a0VarV.s(i14)) {
                androidx.core.widget.d.e(this.f21694a, I.e(a0VarV.k(i14, -1), null));
            }
        } finally {
            a0VarV.x();
        }
    }

    void e() {
        if (this.f21699f) {
            this.f21699f = false;
        } else {
            this.f21699f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f21695b = colorStateList;
        this.f21697d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f21696c = mode;
        this.f21698e = true;
        a();
    }
}
