package com.google.android.material.chip;

import C7.m;
import D7.h;
import U7.c;
import X7.g;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.o;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import j.C3699a;
import j1.C3718c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k1.C3784a;
import q1.C4260a;

/* compiled from: ChipDrawable.java */
/* loaded from: classes2.dex */
public class a extends g implements Drawable.Callback, o.b {

    /* renamed from: k1, reason: collision with root package name */
    private static final int[] f36300k1 = {R.attr.state_enabled};

    /* renamed from: l1, reason: collision with root package name */
    private static final ShapeDrawable f36301l1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    private float f36302A0;

    /* renamed from: B0, reason: collision with root package name */
    private float f36303B0;

    /* renamed from: C0, reason: collision with root package name */
    private float f36304C0;

    /* renamed from: D0, reason: collision with root package name */
    private float f36305D0;

    /* renamed from: E0, reason: collision with root package name */
    private float f36306E0;

    /* renamed from: F0, reason: collision with root package name */
    private float f36307F0;

    /* renamed from: G0, reason: collision with root package name */
    private float f36308G0;

    /* renamed from: H0, reason: collision with root package name */
    private final Context f36309H0;

    /* renamed from: I0, reason: collision with root package name */
    private final Paint f36310I0;

    /* renamed from: J0, reason: collision with root package name */
    private final Paint f36311J0;

    /* renamed from: K0, reason: collision with root package name */
    private final Paint.FontMetrics f36312K0;

    /* renamed from: L0, reason: collision with root package name */
    private final RectF f36313L0;

    /* renamed from: M0, reason: collision with root package name */
    private final PointF f36314M0;

    /* renamed from: N0, reason: collision with root package name */
    private final Path f36315N0;

    /* renamed from: O0, reason: collision with root package name */
    private final o f36316O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f36317P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f36318Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f36319R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f36320S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f36321T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f36322U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f36323V0;

    /* renamed from: W0, reason: collision with root package name */
    private int f36324W0;

    /* renamed from: X0, reason: collision with root package name */
    private int f36325X0;

    /* renamed from: Y0, reason: collision with root package name */
    private ColorFilter f36326Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private PorterDuffColorFilter f36327Z0;

    /* renamed from: a0, reason: collision with root package name */
    private ColorStateList f36328a0;

    /* renamed from: a1, reason: collision with root package name */
    private ColorStateList f36329a1;

    /* renamed from: b0, reason: collision with root package name */
    private ColorStateList f36330b0;

    /* renamed from: b1, reason: collision with root package name */
    private PorterDuff.Mode f36331b1;

    /* renamed from: c0, reason: collision with root package name */
    private float f36332c0;

    /* renamed from: c1, reason: collision with root package name */
    private int[] f36333c1;

    /* renamed from: d0, reason: collision with root package name */
    private float f36334d0;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f36335d1;

    /* renamed from: e0, reason: collision with root package name */
    private ColorStateList f36336e0;

    /* renamed from: e1, reason: collision with root package name */
    private ColorStateList f36337e1;

    /* renamed from: f0, reason: collision with root package name */
    private float f36338f0;

    /* renamed from: f1, reason: collision with root package name */
    private WeakReference<InterfaceC0464a> f36339f1;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f36340g0;

    /* renamed from: g1, reason: collision with root package name */
    private TextUtils.TruncateAt f36341g1;

    /* renamed from: h0, reason: collision with root package name */
    private CharSequence f36342h0;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f36343h1;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f36344i0;

    /* renamed from: i1, reason: collision with root package name */
    private int f36345i1;

    /* renamed from: j0, reason: collision with root package name */
    private Drawable f36346j0;

    /* renamed from: j1, reason: collision with root package name */
    private boolean f36347j1;

    /* renamed from: k0, reason: collision with root package name */
    private ColorStateList f36348k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f36349l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f36350m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f36351n0;

    /* renamed from: o0, reason: collision with root package name */
    private Drawable f36352o0;

    /* renamed from: p0, reason: collision with root package name */
    private Drawable f36353p0;

    /* renamed from: q0, reason: collision with root package name */
    private ColorStateList f36354q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f36355r0;

    /* renamed from: s0, reason: collision with root package name */
    private CharSequence f36356s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f36357t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f36358u0;

    /* renamed from: v0, reason: collision with root package name */
    private Drawable f36359v0;

    /* renamed from: w0, reason: collision with root package name */
    private ColorStateList f36360w0;

    /* renamed from: x0, reason: collision with root package name */
    private h f36361x0;

    /* renamed from: y0, reason: collision with root package name */
    private h f36362y0;

    /* renamed from: z0, reason: collision with root package name */
    private float f36363z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0464a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f36334d0 = -1.0f;
        this.f36310I0 = new Paint(1);
        this.f36312K0 = new Paint.FontMetrics();
        this.f36313L0 = new RectF();
        this.f36314M0 = new PointF();
        this.f36315N0 = new Path();
        this.f36325X0 = 255;
        this.f36331b1 = PorterDuff.Mode.SRC_IN;
        this.f36339f1 = new WeakReference<>(null);
        Q(context);
        this.f36309H0 = context;
        o oVar = new o(this);
        this.f36316O0 = oVar;
        this.f36342h0 = "";
        oVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f36311J0 = null;
        int[] iArr = f36300k1;
        setState(iArr);
        p2(iArr);
        this.f36343h1 = true;
        if (V7.b.f18152a) {
            f36301l1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (R2()) {
            p0(rect, this.f36313L0);
            RectF rectF = this.f36313L0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f36359v0.setBounds(0, 0, (int) this.f36313L0.width(), (int) this.f36313L0.height());
            this.f36359v0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean A1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f36328a0;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f36317P0) : 0);
        boolean state = true;
        if (this.f36317P0 != iL) {
            this.f36317P0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f36330b0;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f36318Q0) : 0);
        if (this.f36318Q0 != iL2) {
            this.f36318Q0 = iL2;
            zOnStateChange = true;
        }
        int i10 = M7.a.i(iL, iL2);
        if ((this.f36319R0 != i10) | (x() == null)) {
            this.f36319R0 = i10;
            b0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f36336e0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f36320S0) : 0;
        if (this.f36320S0 != colorForState) {
            this.f36320S0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f36337e1 == null || !V7.b.e(iArr)) ? 0 : this.f36337e1.getColorForState(iArr, this.f36321T0);
        if (this.f36321T0 != colorForState2) {
            this.f36321T0 = colorForState2;
            if (this.f36335d1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f36316O0.e() == null || this.f36316O0.e().i() == null) ? 0 : this.f36316O0.e().i().getColorForState(iArr, this.f36322U0);
        if (this.f36322U0 != colorForState3) {
            this.f36322U0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = r1(getState(), R.attr.state_checked) && this.f36357t0;
        if (this.f36323V0 == z11 || this.f36359v0 == null) {
            z10 = false;
        } else {
            float fQ0 = q0();
            this.f36323V0 = z11;
            if (fQ0 != q0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f36329a1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f36324W0) : 0;
        if (this.f36324W0 != colorForState4) {
            this.f36324W0 = colorForState4;
            this.f36327Z0 = d.l(this, this.f36329a1, this.f36331b1);
        } else {
            state = zOnStateChange;
        }
        if (x1(this.f36346j0)) {
            state |= this.f36346j0.setState(iArr);
        }
        if (x1(this.f36359v0)) {
            state |= this.f36359v0.setState(iArr);
        }
        if (x1(this.f36352o0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f36352o0.setState(iArr3);
        }
        if (V7.b.f18152a && x1(this.f36353p0)) {
            state |= this.f36353p0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            z1();
        }
        return state;
    }

    private void B0(Canvas canvas, Rect rect) {
        if (this.f36347j1) {
            return;
        }
        this.f36310I0.setColor(this.f36318Q0);
        this.f36310I0.setStyle(Paint.Style.FILL);
        this.f36310I0.setColorFilter(p1());
        this.f36313L0.set(rect);
        canvas.drawRoundRect(this.f36313L0, M0(), M0(), this.f36310I0);
    }

    private void C0(Canvas canvas, Rect rect) {
        if (S2()) {
            p0(rect, this.f36313L0);
            RectF rectF = this.f36313L0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f36346j0.setBounds(0, 0, (int) this.f36313L0.width(), (int) this.f36313L0.height());
            this.f36346j0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.f36338f0 <= 0.0f || this.f36347j1) {
            return;
        }
        this.f36310I0.setColor(this.f36320S0);
        this.f36310I0.setStyle(Paint.Style.STROKE);
        if (!this.f36347j1) {
            this.f36310I0.setColorFilter(p1());
        }
        RectF rectF = this.f36313L0;
        float f10 = rect.left;
        float f11 = this.f36338f0;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f36334d0 - (this.f36338f0 / 2.0f);
        canvas.drawRoundRect(this.f36313L0, f12, f12, this.f36310I0);
    }

    private void E0(Canvas canvas, Rect rect) {
        if (this.f36347j1) {
            return;
        }
        this.f36310I0.setColor(this.f36317P0);
        this.f36310I0.setStyle(Paint.Style.FILL);
        this.f36313L0.set(rect);
        canvas.drawRoundRect(this.f36313L0, M0(), M0(), this.f36310I0);
    }

    private void F0(Canvas canvas, Rect rect) {
        if (T2()) {
            s0(rect, this.f36313L0);
            RectF rectF = this.f36313L0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f36352o0.setBounds(0, 0, (int) this.f36313L0.width(), (int) this.f36313L0.height());
            if (V7.b.f18152a) {
                this.f36353p0.setBounds(this.f36352o0.getBounds());
                this.f36353p0.jumpToCurrentState();
                this.f36353p0.draw(canvas);
            } else {
                this.f36352o0.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        this.f36310I0.setColor(this.f36321T0);
        this.f36310I0.setStyle(Paint.Style.FILL);
        this.f36313L0.set(rect);
        if (!this.f36347j1) {
            canvas.drawRoundRect(this.f36313L0, M0(), M0(), this.f36310I0);
        } else {
            h(new RectF(rect), this.f36315N0);
            super.q(canvas, this.f36310I0, this.f36315N0, u());
        }
    }

    private void H0(Canvas canvas, Rect rect) {
        Paint paint = this.f36311J0;
        if (paint != null) {
            paint.setColor(C3718c.k(-16777216, 127));
            canvas.drawRect(rect, this.f36311J0);
            if (S2() || R2()) {
                p0(rect, this.f36313L0);
                canvas.drawRect(this.f36313L0, this.f36311J0);
            }
            if (this.f36342h0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f36311J0);
            }
            if (T2()) {
                s0(rect, this.f36313L0);
                canvas.drawRect(this.f36313L0, this.f36311J0);
            }
            this.f36311J0.setColor(C3718c.k(-65536, 127));
            r0(rect, this.f36313L0);
            canvas.drawRect(this.f36313L0, this.f36311J0);
            this.f36311J0.setColor(C3718c.k(-16711936, 127));
            t0(rect, this.f36313L0);
            canvas.drawRect(this.f36313L0, this.f36311J0);
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.f36342h0 != null) {
            Paint.Align alignX0 = x0(rect, this.f36314M0);
            v0(rect, this.f36313L0);
            if (this.f36316O0.e() != null) {
                this.f36316O0.g().drawableState = getState();
                this.f36316O0.n(this.f36309H0);
            }
            this.f36316O0.g().setTextAlign(alignX0);
            int iSave = 0;
            boolean z10 = Math.round(this.f36316O0.h(l1().toString())) > Math.round(this.f36313L0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f36313L0);
            }
            CharSequence charSequenceEllipsize = this.f36342h0;
            if (z10 && this.f36341g1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f36316O0.g(), this.f36313L0.width(), this.f36341g1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f36314M0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f36316O0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean R2() {
        return this.f36358u0 && this.f36359v0 != null && this.f36323V0;
    }

    private boolean S2() {
        return this.f36344i0 && this.f36346j0 != null;
    }

    private boolean T2() {
        return this.f36351n0 && this.f36352o0 != null;
    }

    private void U2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void V2() {
        this.f36337e1 = this.f36335d1 ? V7.b.d(this.f36340g0) : null;
    }

    @TargetApi(21)
    private void W2() {
        this.f36353p0 = new RippleDrawable(V7.b.d(j1()), this.f36352o0, f36301l1);
    }

    private float d1() {
        Drawable drawable = this.f36323V0 ? this.f36359v0 : this.f36346j0;
        float fCeil = this.f36349l0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(u.c(this.f36309H0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float e1() {
        Drawable drawable = this.f36323V0 ? this.f36359v0 : this.f36346j0;
        float f10 = this.f36349l0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void f2(ColorStateList colorStateList) {
        if (this.f36328a0 != colorStateList) {
            this.f36328a0 = colorStateList;
            onStateChange(getState());
        }
    }

    private void o0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C3784a.m(drawable, C3784a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f36352o0) {
            if (drawable.isStateful()) {
                drawable.setState(a1());
            }
            C3784a.o(drawable, this.f36354q0);
            return;
        }
        Drawable drawable2 = this.f36346j0;
        if (drawable == drawable2 && this.f36350m0) {
            C3784a.o(drawable2, this.f36348k0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2() || R2()) {
            float f10 = this.f36363z0 + this.f36302A0;
            float fE1 = e1();
            if (C3784a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fE1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fE1;
            }
            float fD1 = d1();
            float fExactCenterY = rect.exactCenterY() - (fD1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fD1;
        }
    }

    private ColorFilter p1() {
        ColorFilter colorFilter = this.f36326Y0;
        return colorFilter != null ? colorFilter : this.f36327Z0;
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (T2()) {
            float f10 = this.f36308G0 + this.f36307F0 + this.f36355r0 + this.f36306E0 + this.f36305D0;
            if (C3784a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean r1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f10 = this.f36308G0 + this.f36307F0;
            if (C3784a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f36355r0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f36355r0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f36355r0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T2()) {
            float f10 = this.f36308G0 + this.f36307F0 + this.f36355r0 + this.f36306E0 + this.f36305D0;
            if (C3784a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f36342h0 != null) {
            float fQ0 = this.f36363z0 + q0() + this.f36304C0;
            float fU0 = this.f36308G0 + u0() + this.f36305D0;
            if (C3784a.f(this) == 0) {
                rectF.left = rect.left + fQ0;
                rectF.right = rect.right - fU0;
            } else {
                rectF.left = rect.left + fU0;
                rectF.right = rect.right - fQ0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean v1(U7.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float w0() {
        this.f36316O0.g().getFontMetrics(this.f36312K0);
        Paint.FontMetrics fontMetrics = this.f36312K0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean w1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean x1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean y0() {
        return this.f36358u0 && this.f36359v0 != null && this.f36357t0;
    }

    private void y1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = r.i(this.f36309H0, attributeSet, m.f2863b1, i10, i11, new int[0]);
        this.f36347j1 = typedArrayI.hasValue(m.f2712M1);
        f2(c.a(this.f36309H0, typedArrayI, m.f3123z1));
        J1(c.a(this.f36309H0, typedArrayI, m.f2984m1));
        X1(typedArrayI.getDimension(m.f3072u1, 0.0f));
        int i12 = m.f2995n1;
        if (typedArrayI.hasValue(i12)) {
            L1(typedArrayI.getDimension(i12, 0.0f));
        }
        b2(c.a(this.f36309H0, typedArrayI, m.f3103x1));
        d2(typedArrayI.getDimension(m.f3113y1, 0.0f));
        C2(c.a(this.f36309H0, typedArrayI, m.f2702L1));
        H2(typedArrayI.getText(m.f2918g1));
        U7.d dVarH = c.h(this.f36309H0, typedArrayI, m.f2874c1);
        dVarH.l(typedArrayI.getDimension(m.f2885d1, dVarH.j()));
        I2(dVarH);
        int i13 = typedArrayI.getInt(m.f2896e1, 0);
        if (i13 == 1) {
            u2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            u2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            u2(TextUtils.TruncateAt.END);
        }
        W1(typedArrayI.getBoolean(m.f3061t1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            W1(typedArrayI.getBoolean(m.f3028q1, false));
        }
        P1(c.e(this.f36309H0, typedArrayI, m.f3017p1));
        int i14 = m.f3050s1;
        if (typedArrayI.hasValue(i14)) {
            T1(c.a(this.f36309H0, typedArrayI, i14));
        }
        R1(typedArrayI.getDimension(m.f3039r1, -1.0f));
        s2(typedArrayI.getBoolean(m.f2652G1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            s2(typedArrayI.getBoolean(m.f2602B1, false));
        }
        g2(c.e(this.f36309H0, typedArrayI, m.f2592A1));
        q2(c.a(this.f36309H0, typedArrayI, m.f2642F1));
        l2(typedArrayI.getDimension(m.f2622D1, 0.0f));
        B1(typedArrayI.getBoolean(m.f2929h1, false));
        I1(typedArrayI.getBoolean(m.f2973l1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            I1(typedArrayI.getBoolean(m.f2951j1, false));
        }
        D1(c.e(this.f36309H0, typedArrayI, m.f2940i1));
        int i15 = m.f2962k1;
        if (typedArrayI.hasValue(i15)) {
            F1(c.a(this.f36309H0, typedArrayI, i15));
        }
        F2(h.b(this.f36309H0, typedArrayI, m.f2722N1));
        v2(h.b(this.f36309H0, typedArrayI, m.f2672I1));
        Z1(typedArrayI.getDimension(m.f3093w1, 0.0f));
        z2(typedArrayI.getDimension(m.f2692K1, 0.0f));
        x2(typedArrayI.getDimension(m.f2682J1, 0.0f));
        N2(typedArrayI.getDimension(m.f2742P1, 0.0f));
        K2(typedArrayI.getDimension(m.f2732O1, 0.0f));
        n2(typedArrayI.getDimension(m.f2632E1, 0.0f));
        i2(typedArrayI.getDimension(m.f2612C1, 0.0f));
        N1(typedArrayI.getDimension(m.f3006o1, 0.0f));
        B2(typedArrayI.getDimensionPixelSize(m.f2907f1, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public static a z0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.y1(attributeSet, i10, i11);
        return aVar;
    }

    public void A2(int i10) {
        z2(this.f36309H0.getResources().getDimension(i10));
    }

    public void B1(boolean z10) {
        if (this.f36357t0 != z10) {
            this.f36357t0 = z10;
            float fQ0 = q0();
            if (!z10 && this.f36323V0) {
                this.f36323V0 = false;
            }
            float fQ02 = q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                z1();
            }
        }
    }

    public void B2(int i10) {
        this.f36345i1 = i10;
    }

    public void C1(int i10) {
        B1(this.f36309H0.getResources().getBoolean(i10));
    }

    public void C2(ColorStateList colorStateList) {
        if (this.f36340g0 != colorStateList) {
            this.f36340g0 = colorStateList;
            V2();
            onStateChange(getState());
        }
    }

    public void D1(Drawable drawable) {
        if (this.f36359v0 != drawable) {
            float fQ0 = q0();
            this.f36359v0 = drawable;
            float fQ02 = q0();
            U2(this.f36359v0);
            o0(this.f36359v0);
            invalidateSelf();
            if (fQ0 != fQ02) {
                z1();
            }
        }
    }

    public void D2(int i10) {
        C2(C3699a.a(this.f36309H0, i10));
    }

    public void E1(int i10) {
        D1(C3699a.b(this.f36309H0, i10));
    }

    void E2(boolean z10) {
        this.f36343h1 = z10;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.f36360w0 != colorStateList) {
            this.f36360w0 = colorStateList;
            if (y0()) {
                C3784a.o(this.f36359v0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void F2(h hVar) {
        this.f36361x0 = hVar;
    }

    public void G1(int i10) {
        F1(C3699a.a(this.f36309H0, i10));
    }

    public void G2(int i10) {
        F2(h.c(this.f36309H0, i10));
    }

    public void H1(int i10) {
        I1(this.f36309H0.getResources().getBoolean(i10));
    }

    public void H2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f36342h0, charSequence)) {
            return;
        }
        this.f36342h0 = charSequence;
        this.f36316O0.m(true);
        invalidateSelf();
        z1();
    }

    public void I1(boolean z10) {
        if (this.f36358u0 != z10) {
            boolean zR2 = R2();
            this.f36358u0 = z10;
            boolean zR22 = R2();
            if (zR2 != zR22) {
                if (zR22) {
                    o0(this.f36359v0);
                } else {
                    U2(this.f36359v0);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public void I2(U7.d dVar) {
        this.f36316O0.k(dVar, this.f36309H0);
    }

    public Drawable J0() {
        return this.f36359v0;
    }

    public void J1(ColorStateList colorStateList) {
        if (this.f36330b0 != colorStateList) {
            this.f36330b0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void J2(int i10) {
        I2(new U7.d(this.f36309H0, i10));
    }

    public ColorStateList K0() {
        return this.f36360w0;
    }

    public void K1(int i10) {
        J1(C3699a.a(this.f36309H0, i10));
    }

    public void K2(float f10) {
        if (this.f36305D0 != f10) {
            this.f36305D0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public ColorStateList L0() {
        return this.f36330b0;
    }

    @Deprecated
    public void L1(float f10) {
        if (this.f36334d0 != f10) {
            this.f36334d0 = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void L2(int i10) {
        K2(this.f36309H0.getResources().getDimension(i10));
    }

    public float M0() {
        return this.f36347j1 ? J() : this.f36334d0;
    }

    @Deprecated
    public void M1(int i10) {
        L1(this.f36309H0.getResources().getDimension(i10));
    }

    public void M2(float f10) {
        U7.d dVarM1 = m1();
        if (dVarM1 != null) {
            dVarM1.l(f10);
            this.f36316O0.g().setTextSize(f10);
            a();
        }
    }

    public float N0() {
        return this.f36308G0;
    }

    public void N1(float f10) {
        if (this.f36308G0 != f10) {
            this.f36308G0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public void N2(float f10) {
        if (this.f36304C0 != f10) {
            this.f36304C0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public Drawable O0() {
        Drawable drawable = this.f36346j0;
        if (drawable != null) {
            return C3784a.q(drawable);
        }
        return null;
    }

    public void O1(int i10) {
        N1(this.f36309H0.getResources().getDimension(i10));
    }

    public void O2(int i10) {
        N2(this.f36309H0.getResources().getDimension(i10));
    }

    public float P0() {
        return this.f36349l0;
    }

    public void P1(Drawable drawable) {
        Drawable drawableO0 = O0();
        if (drawableO0 != drawable) {
            float fQ0 = q0();
            this.f36346j0 = drawable != null ? C3784a.r(drawable).mutate() : null;
            float fQ02 = q0();
            U2(drawableO0);
            if (S2()) {
                o0(this.f36346j0);
            }
            invalidateSelf();
            if (fQ0 != fQ02) {
                z1();
            }
        }
    }

    public void P2(boolean z10) {
        if (this.f36335d1 != z10) {
            this.f36335d1 = z10;
            V2();
            onStateChange(getState());
        }
    }

    public ColorStateList Q0() {
        return this.f36348k0;
    }

    public void Q1(int i10) {
        P1(C3699a.b(this.f36309H0, i10));
    }

    boolean Q2() {
        return this.f36343h1;
    }

    public float R0() {
        return this.f36332c0;
    }

    public void R1(float f10) {
        if (this.f36349l0 != f10) {
            float fQ0 = q0();
            this.f36349l0 = f10;
            float fQ02 = q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                z1();
            }
        }
    }

    public float S0() {
        return this.f36363z0;
    }

    public void S1(int i10) {
        R1(this.f36309H0.getResources().getDimension(i10));
    }

    public ColorStateList T0() {
        return this.f36336e0;
    }

    public void T1(ColorStateList colorStateList) {
        this.f36350m0 = true;
        if (this.f36348k0 != colorStateList) {
            this.f36348k0 = colorStateList;
            if (S2()) {
                C3784a.o(this.f36346j0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float U0() {
        return this.f36338f0;
    }

    public void U1(int i10) {
        T1(C3699a.a(this.f36309H0, i10));
    }

    public Drawable V0() {
        Drawable drawable = this.f36352o0;
        if (drawable != null) {
            return C3784a.q(drawable);
        }
        return null;
    }

    public void V1(int i10) {
        W1(this.f36309H0.getResources().getBoolean(i10));
    }

    public CharSequence W0() {
        return this.f36356s0;
    }

    public void W1(boolean z10) {
        if (this.f36344i0 != z10) {
            boolean zS2 = S2();
            this.f36344i0 = z10;
            boolean zS22 = S2();
            if (zS2 != zS22) {
                if (zS22) {
                    o0(this.f36346j0);
                } else {
                    U2(this.f36346j0);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public float X0() {
        return this.f36307F0;
    }

    public void X1(float f10) {
        if (this.f36332c0 != f10) {
            this.f36332c0 = f10;
            invalidateSelf();
            z1();
        }
    }

    public float Y0() {
        return this.f36355r0;
    }

    public void Y1(int i10) {
        X1(this.f36309H0.getResources().getDimension(i10));
    }

    public float Z0() {
        return this.f36306E0;
    }

    public void Z1(float f10) {
        if (this.f36363z0 != f10) {
            this.f36363z0 = f10;
            invalidateSelf();
            z1();
        }
    }

    @Override // com.google.android.material.internal.o.b
    public void a() {
        z1();
        invalidateSelf();
    }

    public int[] a1() {
        return this.f36333c1;
    }

    public void a2(int i10) {
        Z1(this.f36309H0.getResources().getDimension(i10));
    }

    public ColorStateList b1() {
        return this.f36354q0;
    }

    public void b2(ColorStateList colorStateList) {
        if (this.f36336e0 != colorStateList) {
            this.f36336e0 = colorStateList;
            if (this.f36347j1) {
                j0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void c1(RectF rectF) {
        t0(getBounds(), rectF);
    }

    public void c2(int i10) {
        b2(C3699a.a(this.f36309H0, i10));
    }

    public void d2(float f10) {
        if (this.f36338f0 != f10) {
            this.f36338f0 = f10;
            this.f36310I0.setStrokeWidth(f10);
            if (this.f36347j1) {
                super.k0(f10);
            }
            invalidateSelf();
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f36325X0;
        int iA = i10 < 255 ? G7.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        E0(canvas, bounds);
        B0(canvas, bounds);
        if (this.f36347j1) {
            super.draw(canvas);
        }
        D0(canvas, bounds);
        G0(canvas, bounds);
        C0(canvas, bounds);
        A0(canvas, bounds);
        if (this.f36343h1) {
            I0(canvas, bounds);
        }
        F0(canvas, bounds);
        H0(canvas, bounds);
        if (this.f36325X0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public void e2(int i10) {
        d2(this.f36309H0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt f1() {
        return this.f36341g1;
    }

    public h g1() {
        return this.f36362y0;
    }

    public void g2(Drawable drawable) {
        Drawable drawableV0 = V0();
        if (drawableV0 != drawable) {
            float fU0 = u0();
            this.f36352o0 = drawable != null ? C3784a.r(drawable).mutate() : null;
            if (V7.b.f18152a) {
                W2();
            }
            float fU02 = u0();
            U2(drawableV0);
            if (T2()) {
                o0(this.f36352o0);
            }
            invalidateSelf();
            if (fU0 != fU02) {
                z1();
            }
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f36325X0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f36326Y0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f36332c0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f36363z0 + q0() + this.f36304C0 + this.f36316O0.h(l1().toString()) + this.f36305D0 + u0() + this.f36308G0), this.f36345i1);
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f36347j1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f36334d0);
        } else {
            outline.setRoundRect(bounds, this.f36334d0);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.f36303B0;
    }

    public void h2(CharSequence charSequence) {
        if (this.f36356s0 != charSequence) {
            this.f36356s0 = C4260a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float i1() {
        return this.f36302A0;
    }

    public void i2(float f10) {
        if (this.f36307F0 != f10) {
            this.f36307F0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return w1(this.f36328a0) || w1(this.f36330b0) || w1(this.f36336e0) || (this.f36335d1 && w1(this.f36337e1)) || v1(this.f36316O0.e()) || y0() || x1(this.f36346j0) || x1(this.f36359v0) || w1(this.f36329a1);
    }

    public ColorStateList j1() {
        return this.f36340g0;
    }

    public void j2(int i10) {
        i2(this.f36309H0.getResources().getDimension(i10));
    }

    public h k1() {
        return this.f36361x0;
    }

    public void k2(int i10) {
        g2(C3699a.b(this.f36309H0, i10));
    }

    public CharSequence l1() {
        return this.f36342h0;
    }

    public void l2(float f10) {
        if (this.f36355r0 != f10) {
            this.f36355r0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public U7.d m1() {
        return this.f36316O0.e();
    }

    public void m2(int i10) {
        l2(this.f36309H0.getResources().getDimension(i10));
    }

    public float n1() {
        return this.f36305D0;
    }

    public void n2(float f10) {
        if (this.f36306E0 != f10) {
            this.f36306E0 = f10;
            invalidateSelf();
            if (T2()) {
                z1();
            }
        }
    }

    public float o1() {
        return this.f36304C0;
    }

    public void o2(int i10) {
        n2(this.f36309H0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S2()) {
            zOnLayoutDirectionChanged |= C3784a.m(this.f36346j0, i10);
        }
        if (R2()) {
            zOnLayoutDirectionChanged |= C3784a.m(this.f36359v0, i10);
        }
        if (T2()) {
            zOnLayoutDirectionChanged |= C3784a.m(this.f36352o0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (S2()) {
            zOnLevelChange |= this.f36346j0.setLevel(i10);
        }
        if (R2()) {
            zOnLevelChange |= this.f36359v0.setLevel(i10);
        }
        if (T2()) {
            zOnLevelChange |= this.f36352o0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f36347j1) {
            super.onStateChange(iArr);
        }
        return A1(iArr, a1());
    }

    public boolean p2(int[] iArr) {
        if (Arrays.equals(this.f36333c1, iArr)) {
            return false;
        }
        this.f36333c1 = iArr;
        if (T2()) {
            return A1(getState(), iArr);
        }
        return false;
    }

    float q0() {
        if (S2() || R2()) {
            return this.f36302A0 + e1() + this.f36303B0;
        }
        return 0.0f;
    }

    public boolean q1() {
        return this.f36335d1;
    }

    public void q2(ColorStateList colorStateList) {
        if (this.f36354q0 != colorStateList) {
            this.f36354q0 = colorStateList;
            if (T2()) {
                C3784a.o(this.f36352o0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r2(int i10) {
        q2(C3699a.a(this.f36309H0, i10));
    }

    public boolean s1() {
        return this.f36357t0;
    }

    public void s2(boolean z10) {
        if (this.f36351n0 != z10) {
            boolean zT2 = T2();
            this.f36351n0 = z10;
            boolean zT22 = T2();
            if (zT2 != zT22) {
                if (zT22) {
                    o0(this.f36352o0);
                } else {
                    U2(this.f36352o0);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f36325X0 != i10) {
            this.f36325X0 = i10;
            invalidateSelf();
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f36326Y0 != colorFilter) {
            this.f36326Y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f36329a1 != colorStateList) {
            this.f36329a1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X7.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f36331b1 != mode) {
            this.f36331b1 = mode;
            this.f36327Z0 = d.l(this, this.f36329a1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (S2()) {
            visible |= this.f36346j0.setVisible(z10, z11);
        }
        if (R2()) {
            visible |= this.f36359v0.setVisible(z10, z11);
        }
        if (T2()) {
            visible |= this.f36352o0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean t1() {
        return x1(this.f36352o0);
    }

    public void t2(InterfaceC0464a interfaceC0464a) {
        this.f36339f1 = new WeakReference<>(interfaceC0464a);
    }

    float u0() {
        if (T2()) {
            return this.f36306E0 + this.f36355r0 + this.f36307F0;
        }
        return 0.0f;
    }

    public boolean u1() {
        return this.f36351n0;
    }

    public void u2(TextUtils.TruncateAt truncateAt) {
        this.f36341g1 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(h hVar) {
        this.f36362y0 = hVar;
    }

    public void w2(int i10) {
        v2(h.c(this.f36309H0, i10));
    }

    Paint.Align x0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f36342h0 != null) {
            float fQ0 = this.f36363z0 + q0() + this.f36304C0;
            if (C3784a.f(this) == 0) {
                pointF.x = rect.left + fQ0;
            } else {
                pointF.x = rect.right - fQ0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - w0();
        }
        return align;
    }

    public void x2(float f10) {
        if (this.f36303B0 != f10) {
            float fQ0 = q0();
            this.f36303B0 = f10;
            float fQ02 = q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                z1();
            }
        }
    }

    public void y2(int i10) {
        x2(this.f36309H0.getResources().getDimension(i10));
    }

    protected void z1() {
        InterfaceC0464a interfaceC0464a = this.f36339f1.get();
        if (interfaceC0464a != null) {
            interfaceC0464a.a();
        }
    }

    public void z2(float f10) {
        if (this.f36302A0 != f10) {
            float fQ0 = q0();
            this.f36302A0 = f10;
            float fQ02 = q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                z1();
            }
        }
    }
}
