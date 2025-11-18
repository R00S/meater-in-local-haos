package com.google.android.material.internal;

import U7.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import m1.C3946a;
import s1.C4456s;
import s1.X;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f36673t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f36674u0 = null;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f36675A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f36676B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f36677C;

    /* renamed from: D, reason: collision with root package name */
    private U7.a f36678D;

    /* renamed from: E, reason: collision with root package name */
    private U7.a f36679E;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f36681G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f36682H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f36683I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f36685K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f36686L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f36687M;

    /* renamed from: N, reason: collision with root package name */
    private float f36688N;

    /* renamed from: O, reason: collision with root package name */
    private float f36689O;

    /* renamed from: P, reason: collision with root package name */
    private float f36690P;

    /* renamed from: Q, reason: collision with root package name */
    private float f36691Q;

    /* renamed from: R, reason: collision with root package name */
    private float f36692R;

    /* renamed from: S, reason: collision with root package name */
    private int f36693S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f36694T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f36695U;

    /* renamed from: V, reason: collision with root package name */
    private final TextPaint f36696V;

    /* renamed from: W, reason: collision with root package name */
    private final TextPaint f36697W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f36698X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f36699Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f36700Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f36701a;

    /* renamed from: a0, reason: collision with root package name */
    private float f36702a0;

    /* renamed from: b, reason: collision with root package name */
    private float f36703b;

    /* renamed from: b0, reason: collision with root package name */
    private float f36704b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36705c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f36706c0;

    /* renamed from: d, reason: collision with root package name */
    private float f36707d;

    /* renamed from: d0, reason: collision with root package name */
    private float f36708d0;

    /* renamed from: e, reason: collision with root package name */
    private float f36709e;

    /* renamed from: e0, reason: collision with root package name */
    private float f36710e0;

    /* renamed from: f, reason: collision with root package name */
    private int f36711f;

    /* renamed from: f0, reason: collision with root package name */
    private float f36712f0;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f36713g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f36714g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f36715h;

    /* renamed from: h0, reason: collision with root package name */
    private float f36716h0;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f36717i;

    /* renamed from: i0, reason: collision with root package name */
    private float f36718i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f36720j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f36722k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f36724l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f36726m0;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f36727n;

    /* renamed from: n0, reason: collision with root package name */
    private float f36728n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f36729o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f36730o0;

    /* renamed from: p, reason: collision with root package name */
    private int f36731p;

    /* renamed from: q, reason: collision with root package name */
    private float f36733q;

    /* renamed from: r, reason: collision with root package name */
    private float f36735r;

    /* renamed from: s, reason: collision with root package name */
    private float f36737s;

    /* renamed from: t, reason: collision with root package name */
    private float f36739t;

    /* renamed from: u, reason: collision with root package name */
    private float f36740u;

    /* renamed from: v, reason: collision with root package name */
    private float f36741v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f36742w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f36743x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f36744y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f36745z;

    /* renamed from: j, reason: collision with root package name */
    private int f36719j = 16;

    /* renamed from: k, reason: collision with root package name */
    private int f36721k = 16;

    /* renamed from: l, reason: collision with root package name */
    private float f36723l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f36725m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f36680F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    private boolean f36684J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f36732p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f36734q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f36736r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f36738s0 = m.f36770n;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0470a implements a.InterfaceC0260a {
        C0470a() {
        }

        @Override // U7.a.InterfaceC0260a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f36701a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f36696V = textPaint;
        this.f36697W = new TextPaint(textPaint);
        this.f36715h = new Rect();
        this.f36713g = new Rect();
        this.f36717i = new RectF();
        this.f36709e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f36723l);
        textPaint.setTypeface(this.f36745z);
        textPaint.setLetterSpacing(this.f36718i0);
    }

    private void B(float f10) {
        if (this.f36705c) {
            this.f36717i.set(f10 < this.f36709e ? this.f36713g : this.f36715h);
            return;
        }
        this.f36717i.left = G(this.f36713g.left, this.f36715h.left, f10, this.f36698X);
        this.f36717i.top = G(this.f36733q, this.f36735r, f10, this.f36698X);
        this.f36717i.right = G(this.f36713g.right, this.f36715h.right, f10, this.f36698X);
        this.f36717i.bottom = G(this.f36713g.bottom, this.f36715h.bottom, f10, this.f36698X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return X.z(this.f36701a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? q1.s.f47794d : q1.s.f47793c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return D7.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f36726m0 = f10;
        X.e0(this.f36701a);
    }

    private boolean U(Typeface typeface) {
        U7.a aVar = this.f36679E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f36744y == typeface) {
            return false;
        }
        this.f36744y = typeface;
        Typeface typefaceB = U7.h.b(this.f36701a.getContext().getResources().getConfiguration(), typeface);
        this.f36743x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f36744y;
        }
        this.f36742w = typefaceB;
        return true;
    }

    private void Y(float f10) {
        this.f36728n0 = f10;
        X.e0(this.f36701a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f36682H;
        if (charSequence != null && (staticLayout = this.f36722k0) != null) {
            this.f36730o0 = TextUtils.ellipsize(charSequence, this.f36696V, staticLayout.getWidth(), this.f36680F);
        }
        CharSequence charSequence2 = this.f36730o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.f36724l0 = I(this.f36696V, charSequence2);
        } else {
            this.f36724l0 = 0.0f;
        }
        int iB = C4456s.b(this.f36721k, this.f36683I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f36735r = this.f36715h.top;
        } else if (i10 != 80) {
            this.f36735r = this.f36715h.centerY() - ((this.f36696V.descent() - this.f36696V.ascent()) / 2.0f);
        } else {
            this.f36735r = this.f36715h.bottom + this.f36696V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f36739t = this.f36715h.centerX() - (this.f36724l0 / 2.0f);
        } else if (i11 != 5) {
            this.f36739t = this.f36715h.left;
        } else {
            this.f36739t = this.f36715h.right - this.f36724l0;
        }
        i(0.0f, z10);
        float height = this.f36722k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f36722k0;
        if (staticLayout2 == null || this.f36732p0 <= 1) {
            CharSequence charSequence3 = this.f36682H;
            if (charSequence3 != null) {
                fI = I(this.f36696V, charSequence3);
            }
        } else {
            fI = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f36722k0;
        this.f36731p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = C4456s.b(this.f36719j, this.f36683I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f36733q = this.f36713g.top;
        } else if (i12 != 80) {
            this.f36733q = this.f36713g.centerY() - (height / 2.0f);
        } else {
            this.f36733q = (this.f36713g.bottom - height) + this.f36696V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f36737s = this.f36713g.centerX() - (fI / 2.0f);
        } else if (i13 != 5) {
            this.f36737s = this.f36713g.left;
        } else {
            this.f36737s = this.f36713g.right - fI;
        }
        j();
        d0(this.f36703b);
    }

    private boolean b0(Typeface typeface) {
        U7.a aVar = this.f36678D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f36676B == typeface) {
            return false;
        }
        this.f36676B = typeface;
        Typeface typefaceB = U7.h.b(this.f36701a.getContext().getResources().getConfiguration(), typeface);
        this.f36675A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f36676B;
        }
        this.f36745z = typefaceB;
        return true;
    }

    private void c() {
        g(this.f36703b);
    }

    private float d(float f10) {
        float f11 = this.f36709e;
        return f10 <= f11 ? D7.a.b(1.0f, 0.0f, this.f36707d, f11, f10) : D7.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private void d0(float f10) {
        h(f10);
        boolean z10 = f36673t0 && this.f36688N != 1.0f;
        this.f36685K = z10;
        if (z10) {
            n();
        }
        X.e0(this.f36701a);
    }

    private float e() {
        float f10 = this.f36707d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f36684J ? F(charSequence, zD) : zD;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f36705c) {
            this.f36740u = G(this.f36737s, this.f36739t, f10, this.f36698X);
            this.f36741v = G(this.f36733q, this.f36735r, f10, this.f36698X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f36709e) {
            this.f36740u = this.f36737s;
            this.f36741v = this.f36733q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f36740u = this.f36739t;
            this.f36741v = this.f36735r - Math.max(0, this.f36711f);
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = D7.a.f3487b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f36729o != this.f36727n) {
            this.f36696V.setColor(a(v(), t(), f11));
        } else {
            this.f36696V.setColor(t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f36716h0;
        float f13 = this.f36718i0;
        if (f12 != f13) {
            this.f36696V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f36696V.setLetterSpacing(f12);
        }
        this.f36690P = G(this.f36708d0, this.f36700Z, f10, null);
        this.f36691Q = G(this.f36710e0, this.f36702a0, f10, null);
        this.f36692R = G(this.f36712f0, this.f36704b0, f10, null);
        int iA = a(u(this.f36714g0), u(this.f36706c0), f10);
        this.f36693S = iA;
        this.f36696V.setShadowLayer(this.f36690P, this.f36691Q, this.f36692R, iA);
        if (this.f36705c) {
            this.f36696V.setAlpha((int) (d(f10) * this.f36696V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.f36696V;
                textPaint.setShadowLayer(this.f36690P, this.f36691Q, this.f36692R, M7.a.a(this.f36693S, textPaint.getAlpha()));
            }
        }
        X.e0(this.f36701a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f36681G == null) {
            return;
        }
        float fWidth = this.f36715h.width();
        float fWidth2 = this.f36713g.width();
        if (C(f10, 1.0f)) {
            f11 = this.f36725m;
            f12 = this.f36716h0;
            this.f36688N = 1.0f;
            typeface = this.f36742w;
        } else {
            float f13 = this.f36723l;
            float f14 = this.f36718i0;
            Typeface typeface2 = this.f36745z;
            if (C(f10, 0.0f)) {
                this.f36688N = 1.0f;
            } else {
                this.f36688N = G(this.f36723l, this.f36725m, f10, this.f36699Y) / this.f36723l;
            }
            float f15 = this.f36725m / this.f36723l;
            fWidth = (z10 || this.f36705c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z11 = this.f36689O != f11;
            boolean z12 = this.f36720j0 != f12;
            boolean z13 = this.f36677C != typeface;
            StaticLayout staticLayout = this.f36722k0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f36695U;
            this.f36689O = f11;
            this.f36720j0 = f12;
            this.f36677C = typeface;
            this.f36695U = false;
            this.f36696V.setLinearText(this.f36688N != 1.0f);
            z = z14;
        }
        if (this.f36682H == null || z) {
            this.f36696V.setTextSize(this.f36689O);
            this.f36696V.setTypeface(this.f36677C);
            this.f36696V.setLetterSpacing(this.f36720j0);
            this.f36683I = f(this.f36681G);
            StaticLayout staticLayoutK = k(j0() ? this.f36732p0 : 1, fWidth, this.f36683I);
            this.f36722k0 = staticLayoutK;
            this.f36682H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f36686L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36686L = null;
        }
    }

    private boolean j0() {
        return this.f36732p0 > 1 && (!this.f36683I || this.f36705c) && !this.f36685K;
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) r1.i.g(m.b(this.f36681G, this.f36696V, (int) f10).d(this.f36680F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f36734q0, this.f36736r0).e(this.f36738s0).j(null).a());
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f36696V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f36705c) {
            this.f36696V.setAlpha((int) (this.f36728n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f36696V;
                textPaint.setShadowLayer(this.f36690P, this.f36691Q, this.f36692R, M7.a.a(this.f36693S, textPaint.getAlpha()));
            }
            this.f36722k0.draw(canvas);
        }
        if (!this.f36705c) {
            this.f36696V.setAlpha((int) (this.f36726m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f36696V;
            textPaint2.setShadowLayer(this.f36690P, this.f36691Q, this.f36692R, M7.a.a(this.f36693S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f36722k0.getLineBaseline(0);
        CharSequence charSequence = this.f36730o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f36696V);
        if (i10 >= 31) {
            this.f36696V.setShadowLayer(this.f36690P, this.f36691Q, this.f36692R, this.f36693S);
        }
        if (this.f36705c) {
            return;
        }
        String strTrim = this.f36730o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f36696V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f36722k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f36696V);
    }

    private void n() {
        if (this.f36686L != null || this.f36713g.isEmpty() || TextUtils.isEmpty(this.f36682H)) {
            return;
        }
        g(0.0f);
        int width = this.f36722k0.getWidth();
        int height = this.f36722k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f36686L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f36722k0.draw(new Canvas(this.f36686L));
        if (this.f36687M == null) {
            this.f36687M = new Paint(3);
        }
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f36724l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f36683I ? this.f36715h.left : this.f36715h.right - this.f36724l0 : this.f36683I ? this.f36715h.right - this.f36724l0 : this.f36715h.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f36724l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f36683I ? rectF.left + this.f36724l0 : this.f36715h.right : this.f36683I ? this.f36715h.right : rectF.left + this.f36724l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f36694T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f36727n);
    }

    private Layout.Alignment y() {
        int iB = C4456s.b(this.f36719j, this.f36683I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f36683I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f36683I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f36725m);
        textPaint.setTypeface(this.f36742w);
        textPaint.setLetterSpacing(this.f36716h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f36729o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f36727n) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f36744y;
            if (typeface != null) {
                this.f36743x = U7.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f36676B;
            if (typeface2 != null) {
                this.f36675A = U7.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f36743x;
            if (typeface3 == null) {
                typeface3 = this.f36744y;
            }
            this.f36742w = typeface3;
            Typeface typeface4 = this.f36675A;
            if (typeface4 == null) {
                typeface4 = this.f36676B;
            }
            this.f36745z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z10) {
        if ((this.f36701a.getHeight() <= 0 || this.f36701a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f36729o == colorStateList && this.f36727n == colorStateList) {
            return;
        }
        this.f36729o = colorStateList;
        this.f36727n = colorStateList;
        J();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (L(this.f36715h, i10, i11, i12, i13)) {
            return;
        }
        this.f36715h.set(i10, i11, i12, i13);
        this.f36695U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        U7.d dVar = new U7.d(this.f36701a.getContext(), i10);
        if (dVar.i() != null) {
            this.f36729o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f36725m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f17647c;
        if (colorStateList != null) {
            this.f36706c0 = colorStateList;
        }
        this.f36702a0 = dVar.f17652h;
        this.f36704b0 = dVar.f17653i;
        this.f36700Z = dVar.f17654j;
        this.f36716h0 = dVar.f17656l;
        U7.a aVar = this.f36679E;
        if (aVar != null) {
            aVar.c();
        }
        this.f36679E = new U7.a(new C0470a(), dVar.e());
        dVar.g(this.f36701a.getContext(), this.f36679E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f36729o != colorStateList) {
            this.f36729o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f36721k != i10) {
            this.f36721k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (L(this.f36713g, i10, i11, i12, i13)) {
            return;
        }
        this.f36713g.set(i10, i11, i12, i13);
        this.f36695U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f36718i0 != f10) {
            this.f36718i0 = f10;
            J();
        }
    }

    public void Z(int i10) {
        if (this.f36719j != i10) {
            this.f36719j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f36723l != f10) {
            this.f36723l = f10;
            J();
        }
    }

    public void c0(float f10) {
        float fA = C3946a.a(f10, 0.0f, 1.0f);
        if (fA != this.f36703b) {
            this.f36703b = fA;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f36698X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f36694T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f36681G, charSequence)) {
            this.f36681G = charSequence;
            this.f36682H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f36699Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f36682H == null || this.f36717i.width() <= 0.0f || this.f36717i.height() <= 0.0f) {
            return;
        }
        this.f36696V.setTextSize(this.f36689O);
        float f10 = this.f36740u;
        float f11 = this.f36741v;
        boolean z10 = this.f36685K && this.f36686L != null;
        float f12 = this.f36688N;
        if (f12 != 1.0f && !this.f36705c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.f36686L, f10, f11, this.f36687M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f36705c && this.f36703b <= this.f36709e)) {
            canvas.translate(f10, f11);
            this.f36722k0.draw(canvas);
        } else {
            m(canvas, this.f36740u - this.f36722k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f36683I = f(this.f36681G);
        rectF.left = Math.max(r(i10, i11), this.f36715h.left);
        rectF.top = this.f36715h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f36715h.right);
        rectF.bottom = this.f36715h.top + q();
    }

    public ColorStateList p() {
        return this.f36729o;
    }

    public float q() {
        z(this.f36697W);
        return -this.f36697W.ascent();
    }

    public int t() {
        return u(this.f36729o);
    }

    public float w() {
        A(this.f36697W);
        return -this.f36697W.ascent();
    }

    public float x() {
        return this.f36703b;
    }
}
