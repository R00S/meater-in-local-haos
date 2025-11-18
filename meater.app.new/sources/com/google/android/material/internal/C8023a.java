package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
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
import android.util.Log;
import android.view.View;
import androidx.core.view.C0286d;
import androidx.core.view.C0311u;
import com.google.android.material.internal.C8029g;
import p024c.p052i.p056g.C0937a;
import p024c.p052i.p058i.C0949e;
import p024c.p052i.p059j.C0959i;
import p241e.p254e.p256b.p271c.p273m.C8919a;
import p241e.p254e.p256b.p271c.p285x.C8945a;
import p241e.p254e.p256b.p271c.p285x.C8948d;

/* compiled from: CollapsingTextHelper.java */
/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes2.dex */
public final class C8023a {

    /* renamed from: a */
    private static final boolean f30325a;

    /* renamed from: b */
    private static final Paint f30326b;

    /* renamed from: A */
    private CharSequence f30327A;

    /* renamed from: B */
    private boolean f30328B;

    /* renamed from: C */
    private boolean f30329C;

    /* renamed from: D */
    private Bitmap f30330D;

    /* renamed from: E */
    private Paint f30331E;

    /* renamed from: F */
    private float f30332F;

    /* renamed from: G */
    private float f30333G;

    /* renamed from: H */
    private int[] f30334H;

    /* renamed from: I */
    private boolean f30335I;

    /* renamed from: J */
    private final TextPaint f30336J;

    /* renamed from: K */
    private final TextPaint f30337K;

    /* renamed from: L */
    private TimeInterpolator f30338L;

    /* renamed from: M */
    private TimeInterpolator f30339M;

    /* renamed from: N */
    private float f30340N;

    /* renamed from: O */
    private float f30341O;

    /* renamed from: P */
    private float f30342P;

    /* renamed from: Q */
    private ColorStateList f30343Q;

    /* renamed from: R */
    private float f30344R;

    /* renamed from: S */
    private float f30345S;

    /* renamed from: T */
    private float f30346T;

    /* renamed from: U */
    private ColorStateList f30347U;

    /* renamed from: V */
    private StaticLayout f30348V;

    /* renamed from: W */
    private float f30349W;

    /* renamed from: X */
    private float f30350X;

    /* renamed from: Y */
    private float f30351Y;

    /* renamed from: Z */
    private CharSequence f30352Z;

    /* renamed from: c */
    private final View f30354c;

    /* renamed from: d */
    private boolean f30355d;

    /* renamed from: e */
    private float f30356e;

    /* renamed from: f */
    private final Rect f30357f;

    /* renamed from: g */
    private final Rect f30358g;

    /* renamed from: h */
    private final RectF f30359h;

    /* renamed from: m */
    private ColorStateList f30364m;

    /* renamed from: n */
    private ColorStateList f30365n;

    /* renamed from: o */
    private float f30366o;

    /* renamed from: p */
    private float f30367p;

    /* renamed from: q */
    private float f30368q;

    /* renamed from: r */
    private float f30369r;

    /* renamed from: s */
    private float f30370s;

    /* renamed from: t */
    private float f30371t;

    /* renamed from: u */
    private Typeface f30372u;

    /* renamed from: v */
    private Typeface f30373v;

    /* renamed from: w */
    private Typeface f30374w;

    /* renamed from: x */
    private C8945a f30375x;

    /* renamed from: y */
    private C8945a f30376y;

    /* renamed from: z */
    private CharSequence f30377z;

    /* renamed from: i */
    private int f30360i = 16;

    /* renamed from: j */
    private int f30361j = 16;

    /* renamed from: k */
    private float f30362k = 15.0f;

    /* renamed from: l */
    private float f30363l = 15.0f;

    /* renamed from: a0 */
    private int f30353a0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a */
    class a implements C8945a.a {
        a() {
        }

        @Override // p241e.p254e.p256b.p271c.p285x.C8945a.a
        /* renamed from: a */
        public void mo24655a(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            C8023a.this.m24628S(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$b */
    class b implements C8945a.a {
        b() {
        }

        @Override // p241e.p254e.p256b.p271c.p285x.C8945a.a
        /* renamed from: a */
        public void mo24655a(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            C8023a.this.m24635b0(typeface);
        }
    }

    static {
        f30325a = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f30326b = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public C8023a(View view) {
        this.f30354c = view;
        TextPaint textPaint = new TextPaint(129);
        this.f30336J = textPaint;
        this.f30337K = new TextPaint(textPaint);
        this.f30358g = new Rect();
        this.f30357f = new Rect();
        this.f30359h = new RectF();
    }

    /* renamed from: C */
    private void m24591C(TextPaint textPaint) {
        textPaint.setTextSize(this.f30363l);
        textPaint.setTypeface(this.f30372u);
    }

    /* renamed from: D */
    private void m24592D(TextPaint textPaint) {
        textPaint.setTextSize(this.f30362k);
        textPaint.setTypeface(this.f30373v);
    }

    /* renamed from: E */
    private void m24593E(float f2) {
        this.f30359h.left = m24596I(this.f30357f.left, this.f30358g.left, f2, this.f30338L);
        this.f30359h.top = m24596I(this.f30366o, this.f30367p, f2, this.f30338L);
        this.f30359h.right = m24596I(this.f30357f.right, this.f30358g.right, f2, this.f30338L);
        this.f30359h.bottom = m24596I(this.f30357f.bottom, this.f30358g.bottom, f2, this.f30338L);
    }

    /* renamed from: F */
    private static boolean m24594F(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    /* renamed from: G */
    private boolean m24595G() {
        return C0311u.m2162y(this.f30354c) == 1;
    }

    /* renamed from: I */
    private static float m24596I(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return C8919a.m28430a(f2, f3, f4);
    }

    /* renamed from: L */
    private static boolean m24597L(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    /* renamed from: P */
    private void m24598P(float f2) {
        this.f30349W = f2;
        C0311u.m2113Z(this.f30354c);
    }

    /* renamed from: T */
    private boolean m24599T(Typeface typeface) {
        C8945a c8945a = this.f30376y;
        if (c8945a != null) {
            c8945a.m28494c();
        }
        if (this.f30372u == typeface) {
            return false;
        }
        this.f30372u = typeface;
        return true;
    }

    /* renamed from: X */
    private void m24600X(float f2) {
        this.f30350X = f2;
        C0311u.m2113Z(this.f30354c);
    }

    /* renamed from: a */
    private static int m24601a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), (int) ((Color.red(i2) * f3) + (Color.red(i3) * f2)), (int) ((Color.green(i2) * f3) + (Color.green(i3) * f2)), (int) ((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    /* renamed from: b */
    private void m24602b() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        StaticLayout staticLayout;
        float f2 = this.f30333G;
        m24608g(this.f30363l);
        CharSequence charSequence = this.f30327A;
        if (charSequence != null && (staticLayout = this.f30348V) != null) {
            this.f30352Z = TextUtils.ellipsize(charSequence, this.f30336J, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f30352Z;
        float fMeasureText = charSequence2 != null ? this.f30336J.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int iM1932b = C0286d.m1932b(this.f30361j, this.f30328B ? 1 : 0);
        float height = this.f30348V != null ? r5.getHeight() : 0.0f;
        int i2 = iM1932b & 112;
        if (i2 == 48) {
            this.f30367p = this.f30358g.top - this.f30336J.ascent();
        } else if (i2 != 80) {
            float fDescent = (this.f30336J.descent() - this.f30336J.ascent()) / 2.0f;
            this.f30367p = m24613l0() ? this.f30358g.centerY() - fDescent : (fDescent - this.f30336J.descent()) + this.f30358g.centerY();
        } else {
            this.f30367p = this.f30358g.bottom;
        }
        int i3 = iM1932b & 8388615;
        if (i3 == 1) {
            this.f30369r = this.f30358g.centerX() - (fMeasureText / 2.0f);
        } else if (i3 != 5) {
            this.f30369r = this.f30358g.left;
        } else {
            this.f30369r = this.f30358g.right - fMeasureText;
        }
        m24608g(this.f30362k);
        CharSequence charSequence3 = this.f30327A;
        float fMeasureText2 = charSequence3 != null ? this.f30336J.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f30348V;
        if (staticLayout2 != null && this.f30353a0 > 1 && !this.f30328B) {
            fMeasureText2 = staticLayout2.getLineWidth(0);
        }
        StaticLayout staticLayout3 = this.f30348V;
        this.f30351Y = staticLayout3 != null ? staticLayout3.getLineLeft(0) : 0.0f;
        int iM1932b2 = C0286d.m1932b(this.f30360i, this.f30328B ? 1 : 0);
        int i4 = iM1932b2 & 112;
        if (i4 == 48) {
            this.f30366o = this.f30357f.top - this.f30336J.ascent();
        } else if (i4 != 80) {
            this.f30366o = m24613l0() ? this.f30357f.centerY() - (height / 2.0f) : (((this.f30336J.descent() - this.f30336J.ascent()) / 2.0f) - this.f30336J.descent()) + this.f30357f.centerY();
        } else {
            this.f30366o = this.f30357f.bottom - (m24613l0() ? height - this.f30336J.descent() : 0.0f);
        }
        int i5 = iM1932b2 & 8388615;
        if (i5 == 1) {
            this.f30368q = this.f30357f.centerX() - (fMeasureText2 / 2.0f);
        } else if (i5 != 5) {
            this.f30368q = this.f30357f.left;
        } else {
            this.f30368q = this.f30357f.right - fMeasureText2;
        }
        m24609h();
        m24606e0(f2);
    }

    /* renamed from: c0 */
    private boolean m24603c0(Typeface typeface) {
        C8945a c8945a = this.f30375x;
        if (c8945a != null) {
            c8945a.m28494c();
        }
        if (this.f30373v == typeface) {
            return false;
        }
        this.f30373v = typeface;
        return true;
    }

    /* renamed from: d */
    private void m24604d() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        m24607f(this.f30356e);
    }

    /* renamed from: e */
    private boolean m24605e(CharSequence charSequence) {
        return (m24595G() ? C0949e.f6395d : C0949e.f6394c).mo6046a(charSequence, 0, charSequence.length());
    }

    /* renamed from: e0 */
    private void m24606e0(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        m24608g(f2);
        boolean z = f30325a && this.f30332F != 1.0f;
        this.f30329C = z;
        if (z) {
            m24612l();
        }
        C0311u.m2113Z(this.f30354c);
    }

    /* renamed from: f */
    private void m24607f(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        m24593E(f2);
        this.f30370s = m24596I(this.f30368q, this.f30369r, f2, this.f30338L);
        this.f30371t = m24596I(this.f30366o, this.f30367p, f2, this.f30338L);
        m24606e0(m24596I(this.f30362k, this.f30363l, f2, this.f30339M));
        TimeInterpolator timeInterpolator = C8919a.f34371b;
        m24598P(1.0f - m24596I(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        m24600X(m24596I(1.0f, 0.0f, f2, timeInterpolator));
        if (this.f30365n != this.f30364m) {
            this.f30336J.setColor(m24601a(m24617v(), m24650t(), f2));
        } else {
            this.f30336J.setColor(m24650t());
        }
        this.f30336J.setShadowLayer(m24596I(this.f30344R, this.f30340N, f2, null), m24596I(this.f30345S, this.f30341O, f2, null), m24596I(this.f30346T, this.f30342P, f2, null), m24601a(m24616u(this.f30347U), m24616u(this.f30343Q), f2));
        C0311u.m2113Z(this.f30354c);
    }

    /* renamed from: g */
    private void m24608g(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean z;
        float f3;
        boolean z2;
        if (this.f30377z == null) {
            return;
        }
        float fWidth = this.f30358g.width();
        float fWidth2 = this.f30357f.width();
        if (m24594F(f2, this.f30363l)) {
            f3 = this.f30363l;
            this.f30332F = 1.0f;
            Typeface typeface = this.f30374w;
            Typeface typeface2 = this.f30372u;
            if (typeface != typeface2) {
                this.f30374w = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.f30362k;
            Typeface typeface3 = this.f30374w;
            Typeface typeface4 = this.f30373v;
            if (typeface3 != typeface4) {
                this.f30374w = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (m24594F(f2, f4)) {
                this.f30332F = 1.0f;
            } else {
                this.f30332F = f2 / this.f30362k;
            }
            float f5 = this.f30363l / this.f30362k;
            fWidth = fWidth2 * f5 > fWidth ? Math.min(fWidth / f5, fWidth2) : fWidth2;
            f3 = f4;
            z2 = z;
        }
        if (fWidth > 0.0f) {
            z2 = this.f30333G != f3 || this.f30335I || z2;
            this.f30333G = f3;
            this.f30335I = false;
        }
        if (this.f30327A == null || z2) {
            this.f30336J.setTextSize(this.f30333G);
            this.f30336J.setTypeface(this.f30374w);
            this.f30336J.setLinearText(this.f30332F != 1.0f);
            this.f30328B = m24605e(this.f30377z);
            StaticLayout staticLayoutM24610i = m24610i(m24613l0() ? this.f30353a0 : 1, fWidth, this.f30328B);
            this.f30348V = staticLayoutM24610i;
            this.f30327A = staticLayoutM24610i.getText();
        }
    }

    /* renamed from: h */
    private void m24609h() {
        Bitmap bitmap = this.f30330D;
        if (bitmap != null) {
            bitmap.recycle();
            this.f30330D = null;
        }
    }

    /* renamed from: i */
    private StaticLayout m24610i(int i2, float f2, boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        StaticLayout staticLayoutM24670a;
        try {
            staticLayoutM24670a = C8029g.m24669c(this.f30377z, this.f30336J, (int) f2).m24672e(TextUtils.TruncateAt.END).m24674g(z).m24671d(Layout.Alignment.ALIGN_NORMAL).m24673f(false).m24675h(i2).m24670a();
        } catch (C8029g.a e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            staticLayoutM24670a = null;
        }
        return (StaticLayout) C0959i.m6065c(staticLayoutM24670a);
    }

    /* renamed from: k */
    private void m24611k(Canvas canvas, float f2, float f3, float f4, float f5) {
        int alpha = this.f30336J.getAlpha();
        canvas.translate(f2, f4);
        float f6 = alpha;
        this.f30336J.setAlpha((int) (this.f30350X * f6));
        this.f30348V.draw(canvas);
        canvas.translate(f3 - f2, 0.0f);
        this.f30336J.setAlpha((int) (this.f30349W * f6));
        CharSequence charSequence = this.f30352Z;
        float f7 = -f5;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7 / this.f30332F, this.f30336J);
        String strTrim = this.f30352Z.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f30336J.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f30348V.getLineEnd(0), str.length()), 0.0f, f7 / this.f30332F, (Paint) this.f30336J);
    }

    /* renamed from: l */
    private void m24612l() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30330D != null || this.f30357f.isEmpty() || TextUtils.isEmpty(this.f30327A)) {
            return;
        }
        m24607f(0.0f);
        int width = this.f30348V.getWidth();
        int height = this.f30348V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f30330D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f30348V.draw(new Canvas(this.f30330D));
        if (this.f30331E == null) {
            this.f30331E = new Paint(3);
        }
    }

    /* renamed from: l0 */
    private boolean m24613l0() {
        return (this.f30353a0 <= 1 || this.f30328B || this.f30329C) ? false : true;
    }

    /* renamed from: q */
    private float m24614q(int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) - (m24636c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.f30328B ? this.f30358g.left : this.f30358g.right - m24636c() : this.f30328B ? this.f30358g.right - m24636c() : this.f30358g.left;
    }

    /* renamed from: r */
    private float m24615r(RectF rectF, int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) + (m24636c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.f30328B ? rectF.left + m24636c() : this.f30358g.right : this.f30328B ? this.f30358g.right : rectF.left + m24636c();
    }

    /* renamed from: u */
    private int m24616u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f30334H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: v */
    private int m24617v() {
        return m24616u(this.f30364m);
    }

    /* renamed from: A */
    public int m24618A() {
        return this.f30353a0;
    }

    /* renamed from: B */
    public CharSequence m24619B() {
        return this.f30377z;
    }

    /* renamed from: H */
    public final boolean m24620H() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f30365n;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f30364m) != null && colorStateList.isStateful());
    }

    /* renamed from: J */
    void m24621J() {
        this.f30355d = this.f30358g.width() > 0 && this.f30358g.height() > 0 && this.f30357f.width() > 0 && this.f30357f.height() > 0;
    }

    /* renamed from: K */
    public void m24622K() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30354c.getHeight() <= 0 || this.f30354c.getWidth() <= 0) {
            return;
        }
        m24602b();
        m24604d();
    }

    /* renamed from: M */
    public void m24623M(int i2, int i3, int i4, int i5) {
        if (m24597L(this.f30358g, i2, i3, i4, i5)) {
            return;
        }
        this.f30358g.set(i2, i3, i4, i5);
        this.f30335I = true;
        m24621J();
    }

    /* renamed from: N */
    public void m24624N(Rect rect) {
        m24623M(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: O */
    public void m24625O(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        C8948d c8948d = new C8948d(this.f30354c.getContext(), i2);
        ColorStateList colorStateList = c8948d.f34427b;
        if (colorStateList != null) {
            this.f30365n = colorStateList;
        }
        float f2 = c8948d.f34426a;
        if (f2 != 0.0f) {
            this.f30363l = f2;
        }
        ColorStateList colorStateList2 = c8948d.f34434i;
        if (colorStateList2 != null) {
            this.f30343Q = colorStateList2;
        }
        this.f30341O = c8948d.f34435j;
        this.f30342P = c8948d.f34436k;
        this.f30340N = c8948d.f34437l;
        C8945a c8945a = this.f30376y;
        if (c8945a != null) {
            c8945a.m28494c();
        }
        this.f30376y = new C8945a(new a(), c8948d.m28509e());
        c8948d.m28512h(this.f30354c.getContext(), this.f30376y);
        m24622K();
    }

    /* renamed from: Q */
    public void m24626Q(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30365n != colorStateList) {
            this.f30365n = colorStateList;
            m24622K();
        }
    }

    /* renamed from: R */
    public void m24627R(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30361j != i2) {
            this.f30361j = i2;
            m24622K();
        }
    }

    /* renamed from: S */
    public void m24628S(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (m24599T(typeface)) {
            m24622K();
        }
    }

    /* renamed from: U */
    public void m24629U(int i2, int i3, int i4, int i5) {
        if (m24597L(this.f30357f, i2, i3, i4, i5)) {
            return;
        }
        this.f30357f.set(i2, i3, i4, i5);
        this.f30335I = true;
        m24621J();
    }

    /* renamed from: V */
    public void m24630V(Rect rect) {
        m24629U(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: W */
    public void m24631W(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        C8948d c8948d = new C8948d(this.f30354c.getContext(), i2);
        ColorStateList colorStateList = c8948d.f34427b;
        if (colorStateList != null) {
            this.f30364m = colorStateList;
        }
        float f2 = c8948d.f34426a;
        if (f2 != 0.0f) {
            this.f30362k = f2;
        }
        ColorStateList colorStateList2 = c8948d.f34434i;
        if (colorStateList2 != null) {
            this.f30347U = colorStateList2;
        }
        this.f30345S = c8948d.f34435j;
        this.f30346T = c8948d.f34436k;
        this.f30344R = c8948d.f34437l;
        C8945a c8945a = this.f30375x;
        if (c8945a != null) {
            c8945a.m28494c();
        }
        this.f30375x = new C8945a(new b(), c8948d.m28509e());
        c8948d.m28512h(this.f30354c.getContext(), this.f30375x);
        m24622K();
    }

    /* renamed from: Y */
    public void m24632Y(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30364m != colorStateList) {
            this.f30364m = colorStateList;
            m24622K();
        }
    }

    /* renamed from: Z */
    public void m24633Z(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30360i != i2) {
            this.f30360i = i2;
            m24622K();
        }
    }

    /* renamed from: a0 */
    public void m24634a0(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f30362k != f2) {
            this.f30362k = f2;
            m24622K();
        }
    }

    /* renamed from: b0 */
    public void m24635b0(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (m24603c0(typeface)) {
            m24622K();
        }
    }

    /* renamed from: c */
    public float m24636c() {
        if (this.f30377z == null) {
            return 0.0f;
        }
        m24591C(this.f30337K);
        TextPaint textPaint = this.f30337K;
        CharSequence charSequence = this.f30377z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d0 */
    public void m24637d0(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        float fM5965a = C0937a.m5965a(f2, 0.0f, 1.0f);
        if (fM5965a != this.f30356e) {
            this.f30356e = fM5965a;
            m24604d();
        }
    }

    /* renamed from: f0 */
    public void m24638f0(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (i2 != this.f30353a0) {
            this.f30353a0 = i2;
            m24609h();
            m24622K();
        }
    }

    /* renamed from: g0 */
    public void m24639g0(TimeInterpolator timeInterpolator) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.f30338L = timeInterpolator;
        m24622K();
    }

    /* renamed from: h0 */
    public final boolean m24640h0(int[] iArr) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.f30334H = iArr;
        if (!m24620H()) {
            return false;
        }
        m24622K();
        return true;
    }

    /* renamed from: i0 */
    public void m24641i0(CharSequence charSequence) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (charSequence == null || !TextUtils.equals(this.f30377z, charSequence)) {
            this.f30377z = charSequence;
            this.f30327A = null;
            m24609h();
            m24622K();
        }
    }

    /* renamed from: j */
    public void m24642j(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f30327A == null || !this.f30355d) {
            return;
        }
        float lineLeft = (this.f30370s + this.f30348V.getLineLeft(0)) - (this.f30351Y * 2.0f);
        this.f30336J.setTextSize(this.f30333G);
        float f2 = this.f30370s;
        float f3 = this.f30371t;
        boolean z = this.f30329C && this.f30330D != null;
        float lineAscent = this.f30348V.getLineAscent(0);
        float f4 = this.f30332F;
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.f30330D, f2, f3 + lineAscent, this.f30331E);
            canvas.restoreToCount(iSave);
            return;
        }
        if (m24613l0()) {
            m24611k(canvas, lineLeft, f2, f3, lineAscent);
        } else {
            canvas.translate(f2, f3 + lineAscent);
            this.f30348V.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* renamed from: j0 */
    public void m24643j0(TimeInterpolator timeInterpolator) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.f30339M = timeInterpolator;
        m24622K();
    }

    /* renamed from: k0 */
    public void m24644k0(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean zM24599T = m24599T(typeface);
        boolean zM24603c0 = m24603c0(typeface);
        if (zM24599T || zM24603c0) {
            m24622K();
        }
    }

    /* renamed from: m */
    public void m24645m(RectF rectF, int i2, int i3) {
        this.f30328B = m24605e(this.f30377z);
        rectF.left = m24614q(i2, i3);
        rectF.top = this.f30358g.top;
        rectF.right = m24615r(rectF, i2, i3);
        rectF.bottom = this.f30358g.top + m24648p();
    }

    /* renamed from: n */
    public ColorStateList m24646n() {
        return this.f30365n;
    }

    /* renamed from: o */
    public int m24647o() {
        return this.f30361j;
    }

    /* renamed from: p */
    public float m24648p() {
        m24591C(this.f30337K);
        return -this.f30337K.ascent();
    }

    /* renamed from: s */
    public Typeface m24649s() {
        Typeface typeface = this.f30372u;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: t */
    public int m24650t() {
        return m24616u(this.f30365n);
    }

    /* renamed from: w */
    public int m24651w() {
        return this.f30360i;
    }

    /* renamed from: x */
    public float m24652x() {
        m24592D(this.f30337K);
        return -this.f30337K.ascent();
    }

    /* renamed from: y */
    public Typeface m24653y() {
        Typeface typeface = this.f30373v;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: z */
    public float m24654z() {
        return this.f30356e;
    }
}
