package com.google.android.material.chip;

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
import androidx.core.graphics.drawable.C0265a;
import androidx.core.graphics.drawable.InterfaceC0266b;
import com.google.android.material.internal.C8030h;
import com.google.android.material.internal.C8032j;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import okhttp3.HttpUrl;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p052i.p053e.C0923a;
import p024c.p052i.p058i.C0945a;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p273m.C8926h;
import p241e.p254e.p256b.p271c.p274n.C8930a;
import p241e.p254e.p256b.p271c.p278q.C8937a;
import p241e.p254e.p256b.p271c.p280s.C8939a;
import p241e.p254e.p256b.p271c.p285x.C8947c;
import p241e.p254e.p256b.p271c.p285x.C8948d;
import p241e.p254e.p256b.p271c.p286y.C8952b;

/* compiled from: ChipDrawable.java */
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes2.dex */
public class C7985a extends C8900g implements InterfaceC0266b, Drawable.Callback, C8030h.b {

    /* renamed from: D */
    private static final int[] f30000D = {R.attr.state_enabled};

    /* renamed from: E */
    private static final ShapeDrawable f30001E = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private boolean f30002A0;

    /* renamed from: B0 */
    private int f30003B0;

    /* renamed from: C0 */
    private int f30004C0;

    /* renamed from: D0 */
    private ColorFilter f30005D0;

    /* renamed from: E0 */
    private PorterDuffColorFilter f30006E0;

    /* renamed from: F */
    private ColorStateList f30007F;

    /* renamed from: F0 */
    private ColorStateList f30008F0;

    /* renamed from: G */
    private ColorStateList f30009G;

    /* renamed from: G0 */
    private PorterDuff.Mode f30010G0;

    /* renamed from: H */
    private float f30011H;

    /* renamed from: H0 */
    private int[] f30012H0;

    /* renamed from: I */
    private float f30013I;

    /* renamed from: I0 */
    private boolean f30014I0;

    /* renamed from: J */
    private ColorStateList f30015J;

    /* renamed from: J0 */
    private ColorStateList f30016J0;

    /* renamed from: K */
    private float f30017K;

    /* renamed from: K0 */
    private WeakReference<a> f30018K0;

    /* renamed from: L */
    private ColorStateList f30019L;

    /* renamed from: L0 */
    private TextUtils.TruncateAt f30020L0;

    /* renamed from: M */
    private CharSequence f30021M;

    /* renamed from: M0 */
    private boolean f30022M0;

    /* renamed from: N */
    private boolean f30023N;

    /* renamed from: N0 */
    private int f30024N0;

    /* renamed from: O */
    private Drawable f30025O;

    /* renamed from: O0 */
    private boolean f30026O0;

    /* renamed from: P */
    private ColorStateList f30027P;

    /* renamed from: Q */
    private float f30028Q;

    /* renamed from: R */
    private boolean f30029R;

    /* renamed from: S */
    private boolean f30030S;

    /* renamed from: T */
    private Drawable f30031T;

    /* renamed from: U */
    private Drawable f30032U;

    /* renamed from: V */
    private ColorStateList f30033V;

    /* renamed from: W */
    private float f30034W;

    /* renamed from: X */
    private CharSequence f30035X;

    /* renamed from: Y */
    private boolean f30036Y;

    /* renamed from: Z */
    private boolean f30037Z;

    /* renamed from: a0 */
    private Drawable f30038a0;

    /* renamed from: b0 */
    private ColorStateList f30039b0;

    /* renamed from: c0 */
    private C8926h f30040c0;

    /* renamed from: d0 */
    private C8926h f30041d0;

    /* renamed from: e0 */
    private float f30042e0;

    /* renamed from: f0 */
    private float f30043f0;

    /* renamed from: g0 */
    private float f30044g0;

    /* renamed from: h0 */
    private float f30045h0;

    /* renamed from: i0 */
    private float f30046i0;

    /* renamed from: j0 */
    private float f30047j0;

    /* renamed from: k0 */
    private float f30048k0;

    /* renamed from: l0 */
    private float f30049l0;

    /* renamed from: m0 */
    private final Context f30050m0;

    /* renamed from: n0 */
    private final Paint f30051n0;

    /* renamed from: o0 */
    private final Paint f30052o0;

    /* renamed from: p0 */
    private final Paint.FontMetrics f30053p0;

    /* renamed from: q0 */
    private final RectF f30054q0;

    /* renamed from: r0 */
    private final PointF f30055r0;

    /* renamed from: s0 */
    private final Path f30056s0;

    /* renamed from: t0 */
    private final C8030h f30057t0;

    /* renamed from: u0 */
    private int f30058u0;

    /* renamed from: v0 */
    private int f30059v0;

    /* renamed from: w0 */
    private int f30060w0;

    /* renamed from: x0 */
    private int f30061x0;

    /* renamed from: y0 */
    private int f30062y0;

    /* renamed from: z0 */
    private int f30063z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* renamed from: a */
        void mo24145a();
    }

    private C7985a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f30013I = -1.0f;
        this.f30051n0 = new Paint(1);
        this.f30053p0 = new Paint.FontMetrics();
        this.f30054q0 = new RectF();
        this.f30055r0 = new PointF();
        this.f30056s0 = new Path();
        this.f30004C0 = 255;
        this.f30010G0 = PorterDuff.Mode.SRC_IN;
        this.f30018K0 = new WeakReference<>(null);
        m28278N(context);
        this.f30050m0 = context;
        C8030h c8030h = new C8030h(this);
        this.f30057t0 = c8030h;
        this.f30021M = HttpUrl.FRAGMENT_ENCODE_SET;
        c8030h.m24680e().density = context.getResources().getDisplayMetrics().density;
        this.f30052o0 = null;
        int[] iArr = f30000D;
        setState(iArr);
        m24277k2(iArr);
        this.f30022M0 = true;
        if (C8952b.f34450a) {
            f30001E.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m24169A0(Canvas canvas, Rect rect) {
        if (this.f30017K <= 0.0f || this.f30026O0) {
            return;
        }
        this.f30051n0.setColor(this.f30061x0);
        this.f30051n0.setStyle(Paint.Style.STROKE);
        if (!this.f30026O0) {
            this.f30051n0.setColorFilter(m24182k1());
        }
        RectF rectF = this.f30054q0;
        float f2 = rect.left;
        float f3 = this.f30017K;
        rectF.set(f2 + (f3 / 2.0f), rect.top + (f3 / 2.0f), rect.right - (f3 / 2.0f), rect.bottom - (f3 / 2.0f));
        float f4 = this.f30013I - (this.f30017K / 2.0f);
        canvas.drawRoundRect(this.f30054q0, f4, f4, this.f30051n0);
    }

    /* renamed from: B0 */
    private void m24170B0(Canvas canvas, Rect rect) {
        if (this.f30026O0) {
            return;
        }
        this.f30051n0.setColor(this.f30058u0);
        this.f30051n0.setStyle(Paint.Style.FILL);
        this.f30054q0.set(rect);
        canvas.drawRoundRect(this.f30054q0, m24222J0(), m24222J0(), this.f30051n0);
    }

    /* renamed from: C0 */
    private void m24171C0(Canvas canvas, Rect rect) {
        if (m24177N2()) {
            m24187p0(rect, this.f30054q0);
            RectF rectF = this.f30054q0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.f30031T.setBounds(0, 0, (int) this.f30054q0.width(), (int) this.f30054q0.height());
            if (C8952b.f34450a) {
                this.f30032U.setBounds(this.f30031T.getBounds());
                this.f30032U.jumpToCurrentState();
                this.f30032U.draw(canvas);
            } else {
                this.f30031T.draw(canvas);
            }
            canvas.translate(-f2, -f3);
        }
    }

    /* renamed from: D0 */
    private void m24172D0(Canvas canvas, Rect rect) {
        this.f30051n0.setColor(this.f30062y0);
        this.f30051n0.setStyle(Paint.Style.FILL);
        this.f30054q0.set(rect);
        if (!this.f30026O0) {
            canvas.drawRoundRect(this.f30054q0, m24222J0(), m24222J0(), this.f30051n0);
        } else {
            m28294h(new RectF(rect), this.f30056s0);
            super.m28296p(canvas, this.f30051n0, this.f30056s0, m28299u());
        }
    }

    /* renamed from: E0 */
    private void m24173E0(Canvas canvas, Rect rect) {
        Paint paint = this.f30052o0;
        if (paint != null) {
            paint.setColor(C0923a.m5887o(-16777216, 127));
            canvas.drawRect(rect, this.f30052o0);
            if (m24176M2() || m24175L2()) {
                m24184m0(rect, this.f30054q0);
                canvas.drawRect(this.f30054q0, this.f30052o0);
            }
            if (this.f30021M != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f30052o0);
            }
            if (m24177N2()) {
                m24187p0(rect, this.f30054q0);
                canvas.drawRect(this.f30054q0, this.f30052o0);
            }
            this.f30052o0.setColor(C0923a.m5887o(-65536, 127));
            m24186o0(rect, this.f30054q0);
            canvas.drawRect(this.f30054q0, this.f30052o0);
            this.f30052o0.setColor(C0923a.m5887o(-16711936, 127));
            m24188q0(rect, this.f30054q0);
            canvas.drawRect(this.f30054q0, this.f30052o0);
        }
    }

    /* renamed from: F0 */
    private void m24174F0(Canvas canvas, Rect rect) {
        if (this.f30021M != null) {
            Paint.Align alignM24293u0 = m24293u0(rect, this.f30055r0);
            m24191s0(rect, this.f30054q0);
            if (this.f30057t0.m24679d() != null) {
                this.f30057t0.m24680e().drawableState = getState();
                this.f30057t0.m24685j(this.f30050m0);
            }
            this.f30057t0.m24680e().setTextAlign(alignM24293u0);
            int iSave = 0;
            boolean z = Math.round(this.f30057t0.m24681f(m24269g1().toString())) > Math.round(this.f30054q0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f30054q0);
            }
            CharSequence charSequenceEllipsize = this.f30021M;
            if (z && this.f30020L0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f30057t0.m24680e(), this.f30054q0.width(), this.f30020L0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f30055r0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f30057t0.m24680e());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m24175L2() {
        return this.f30037Z && this.f30038a0 != null && this.f30002A0;
    }

    /* renamed from: M2 */
    private boolean m24176M2() {
        return this.f30023N && this.f30025O != null;
    }

    /* renamed from: N2 */
    private boolean m24177N2() {
        return this.f30030S && this.f30031T != null;
    }

    /* renamed from: O2 */
    private void m24178O2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: P2 */
    private void m24179P2() {
        this.f30016J0 = this.f30014I0 ? C8952b.m28522d(this.f30019L) : null;
    }

    @TargetApi(21)
    /* renamed from: Q2 */
    private void m24180Q2() {
        this.f30032U = new RippleDrawable(C8952b.m28522d(m24265e1()), this.f30031T, f30001E);
    }

    /* renamed from: a2 */
    private void m24181a2(ColorStateList colorStateList) {
        if (this.f30007F != colorStateList) {
            this.f30007F = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: k1 */
    private ColorFilter m24182k1() {
        ColorFilter colorFilter = this.f30005D0;
        return colorFilter != null ? colorFilter : this.f30006E0;
    }

    /* renamed from: l0 */
    private void m24183l0(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0265a.m1816m(drawable, C0265a.m1809f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f30031T) {
            if (drawable.isStateful()) {
                drawable.setState(m24252X0());
            }
            C0265a.m1818o(drawable, this.f30033V);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f30025O;
        if (drawable == drawable2 && this.f30029R) {
            C0265a.m1818o(drawable2, this.f30027P);
        }
    }

    /* renamed from: m0 */
    private void m24184m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m24176M2() || m24175L2()) {
            float f2 = this.f30042e0 + this.f30043f0;
            if (C0265a.m1809f(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + this.f30028Q;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - this.f30028Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.f30028Q;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    /* renamed from: m1 */
    private static boolean m24185m1(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    private void m24186o0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m24177N2()) {
            float f2 = this.f30049l0 + this.f30048k0 + this.f30034W + this.f30047j0 + this.f30046i0;
            if (C0265a.m1809f(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    /* renamed from: p0 */
    private void m24187p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m24177N2()) {
            float f2 = this.f30049l0 + this.f30048k0;
            if (C0265a.m1809f(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.f30034W;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.f30034W;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.f30034W;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    /* renamed from: q0 */
    private void m24188q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m24177N2()) {
            float f2 = this.f30049l0 + this.f30048k0 + this.f30034W + this.f30047j0 + this.f30046i0;
            if (C0265a.m1809f(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: q1 */
    private static boolean m24189q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: r1 */
    private static boolean m24190r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: s0 */
    private void m24191s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f30021M != null) {
            float fM24281n0 = this.f30042e0 + m24281n0() + this.f30045h0;
            float fM24289r0 = this.f30049l0 + m24289r0() + this.f30046i0;
            if (C0265a.m1809f(this) == 0) {
                rectF.left = rect.left + fM24281n0;
                rectF.right = rect.right - fM24289r0;
            } else {
                rectF.left = rect.left + fM24289r0;
                rectF.right = rect.right - fM24281n0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: s1 */
    private static boolean m24192s1(C8948d c8948d) {
        ColorStateList colorStateList;
        return (c8948d == null || (colorStateList = c8948d.f34427b) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: t0 */
    private float m24193t0() {
        this.f30057t0.m24680e().getFontMetrics(this.f30053p0);
        Paint.FontMetrics fontMetrics = this.f30053p0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: t1 */
    private void m24194t1(AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        TypedArray typedArrayM24694h = C8032j.m24694h(this.f30050m0, attributeSet, C8918l.f34238h0, i2, i3, new int[0]);
        this.f30026O0 = typedArrayM24694h.hasValue(C8918l.f34127S0);
        m24181a2(C8947c.m28499a(this.f30050m0, typedArrayM24694h, C8918l.f34036F0));
        m24209E1(C8947c.m28499a(this.f30050m0, typedArrayM24694h, C8918l.f34315s0));
        m24243S1(typedArrayM24694h.getDimension(C8918l.f34001A0, 0.0f));
        int i4 = C8918l.f34322t0;
        if (typedArrayM24694h.hasValue(i4)) {
            m24214G1(typedArrayM24694h.getDimension(i4, 0.0f));
        }
        m24251W1(C8947c.m28499a(this.f30050m0, typedArrayM24694h, C8918l.f34022D0));
        m24255Y1(typedArrayM24694h.getDimension(C8918l.f34029E0, 0.0f));
        m24300x2(C8947c.m28499a(this.f30050m0, typedArrayM24694h, C8918l.f34120R0));
        m24206C2(typedArrayM24694h.getText(C8918l.f34273m0));
        m24208D2(C8947c.m28504f(this.f30050m0, typedArrayM24694h, C8918l.f34245i0));
        int i5 = typedArrayM24694h.getInt(C8918l.f34259k0, 0);
        if (i5 == 1) {
            m24287p2(TextUtils.TruncateAt.START);
        } else if (i5 == 2) {
            m24287p2(TextUtils.TruncateAt.MIDDLE);
        } else if (i5 == 3) {
            m24287p2(TextUtils.TruncateAt.END);
        }
        m24241R1(typedArrayM24694h.getBoolean(C8918l.f34364z0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m24241R1(typedArrayM24694h.getBoolean(C8918l.f34343w0, false));
        }
        m24226K1(C8947c.m28502d(this.f30050m0, typedArrayM24694h, C8918l.f34336v0));
        int i6 = C8918l.f34357y0;
        if (typedArrayM24694h.hasValue(i6)) {
            m24235O1(C8947c.m28499a(this.f30050m0, typedArrayM24694h, i6));
        }
        m24231M1(typedArrayM24694h.getDimension(C8918l.f34350x0, 0.0f));
        m24283n2(typedArrayM24694h.getBoolean(C8918l.f34085M0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m24283n2(typedArrayM24694h.getBoolean(C8918l.f34050H0, false));
        }
        m24260b2(C8947c.m28502d(this.f30050m0, typedArrayM24694h, C8918l.f34043G0));
        m24279l2(C8947c.m28499a(this.f30050m0, typedArrayM24694h, C8918l.f34078L0));
        m24270g2(typedArrayM24694h.getDimension(C8918l.f34064J0, 0.0f));
        m24297w1(typedArrayM24694h.getBoolean(C8918l.f34280n0, false));
        m24207D1(typedArrayM24694h.getBoolean(C8918l.f34308r0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m24207D1(typedArrayM24694h.getBoolean(C8918l.f34294p0, false));
        }
        m24301y1(C8947c.m28502d(this.f30050m0, typedArrayM24694h, C8918l.f34287o0));
        int i7 = C8918l.f34301q0;
        if (typedArrayM24694h.hasValue(i7)) {
            m24201A1(C8947c.m28499a(this.f30050m0, typedArrayM24694h, i7));
        }
        m24202A2(C8926h.m28441b(this.f30050m0, typedArrayM24694h, C8918l.f34134T0));
        m24288q2(C8926h.m28441b(this.f30050m0, typedArrayM24694h, C8918l.f34099O0));
        m24247U1(typedArrayM24694h.getDimension(C8918l.f34015C0, 0.0f));
        m24295u2(typedArrayM24694h.getDimension(C8918l.f34113Q0, 0.0f));
        m24291s2(typedArrayM24694h.getDimension(C8918l.f34106P0, 0.0f));
        m24218H2(typedArrayM24694h.getDimension(C8918l.f34148V0, 0.0f));
        m24212F2(typedArrayM24694h.getDimension(C8918l.f34141U0, 0.0f));
        m24274i2(typedArrayM24694h.getDimension(C8918l.f34071K0, 0.0f));
        m24264d2(typedArrayM24694h.getDimension(C8918l.f34057I0, 0.0f));
        m24220I1(typedArrayM24694h.getDimension(C8918l.f34329u0, 0.0f));
        m24298w2(typedArrayM24694h.getDimensionPixelSize(C8918l.f34266l0, Integer.MAX_VALUE));
        typedArrayM24694h.recycle();
    }

    /* renamed from: v0 */
    private boolean m24195v0() {
        return this.f30037Z && this.f30038a0 != null && this.f30036Y;
    }

    /* renamed from: v1 */
    private boolean m24196v1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f30007F;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, this.f30058u0) : 0;
        boolean state = true;
        if (this.f30058u0 != colorForState) {
            this.f30058u0 = colorForState;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f30009G;
        int colorForState2 = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f30059v0) : 0;
        if (this.f30059v0 != colorForState2) {
            this.f30059v0 = colorForState2;
            zOnStateChange = true;
        }
        int iM28474e = C8937a.m28474e(colorForState, colorForState2);
        if ((this.f30060w0 != iM28474e) | (m28301x() == null)) {
            this.f30060w0 = iM28474e;
            m28284X(ColorStateList.valueOf(iM28474e));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f30015J;
        int colorForState3 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f30061x0) : 0;
        if (this.f30061x0 != colorForState3) {
            this.f30061x0 = colorForState3;
            zOnStateChange = true;
        }
        int colorForState4 = (this.f30016J0 == null || !C8952b.m28523e(iArr)) ? 0 : this.f30016J0.getColorForState(iArr, this.f30062y0);
        if (this.f30062y0 != colorForState4) {
            this.f30062y0 = colorForState4;
            if (this.f30014I0) {
                zOnStateChange = true;
            }
        }
        int colorForState5 = (this.f30057t0.m24679d() == null || this.f30057t0.m24679d().f34427b == null) ? 0 : this.f30057t0.m24679d().f34427b.getColorForState(iArr, this.f30063z0);
        if (this.f30063z0 != colorForState5) {
            this.f30063z0 = colorForState5;
            zOnStateChange = true;
        }
        boolean z2 = m24185m1(getState(), R.attr.state_checked) && this.f30036Y;
        if (this.f30002A0 == z2 || this.f30038a0 == null) {
            z = false;
        } else {
            float fM24281n0 = m24281n0();
            this.f30002A0 = z2;
            if (fM24281n0 != m24281n0()) {
                zOnStateChange = true;
                z = true;
            } else {
                zOnStateChange = true;
                z = false;
            }
        }
        ColorStateList colorStateList4 = this.f30008F0;
        int colorForState6 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f30003B0) : 0;
        if (this.f30003B0 != colorForState6) {
            this.f30003B0 = colorForState6;
            this.f30006E0 = C8939a.m28477a(this, this.f30008F0, this.f30010G0);
        } else {
            state = zOnStateChange;
        }
        if (m24190r1(this.f30025O)) {
            state |= this.f30025O.setState(iArr);
        }
        if (m24190r1(this.f30038a0)) {
            state |= this.f30038a0.setState(iArr);
        }
        if (m24190r1(this.f30031T)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f30031T.setState(iArr3);
        }
        if (C8952b.f34450a && m24190r1(this.f30032U)) {
            state |= this.f30032U.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            m24294u1();
        }
        return state;
    }

    /* renamed from: w0 */
    public static C7985a m24197w0(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = new C7985a(context, attributeSet, i2, i3);
        c7985a.m24194t1(attributeSet, i2, i3);
        return c7985a;
    }

    /* renamed from: x0 */
    private void m24198x0(Canvas canvas, Rect rect) {
        if (m24175L2()) {
            m24184m0(rect, this.f30054q0);
            RectF rectF = this.f30054q0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.f30038a0.setBounds(0, 0, (int) this.f30054q0.width(), (int) this.f30054q0.height());
            this.f30038a0.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    /* renamed from: y0 */
    private void m24199y0(Canvas canvas, Rect rect) {
        if (this.f30026O0) {
            return;
        }
        this.f30051n0.setColor(this.f30059v0);
        this.f30051n0.setStyle(Paint.Style.FILL);
        this.f30051n0.setColorFilter(m24182k1());
        this.f30054q0.set(rect);
        canvas.drawRoundRect(this.f30054q0, m24222J0(), m24222J0(), this.f30051n0);
    }

    /* renamed from: z0 */
    private void m24200z0(Canvas canvas, Rect rect) {
        if (m24176M2()) {
            m24184m0(rect, this.f30054q0);
            RectF rectF = this.f30054q0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.f30025O.setBounds(0, 0, (int) this.f30054q0.width(), (int) this.f30054q0.height());
            this.f30025O.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    /* renamed from: A1 */
    public void m24201A1(ColorStateList colorStateList) {
        if (this.f30039b0 != colorStateList) {
            this.f30039b0 = colorStateList;
            if (m24195v0()) {
                C0265a.m1818o(this.f30038a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: A2 */
    public void m24202A2(C8926h c8926h) {
        this.f30040c0 = c8926h;
    }

    /* renamed from: B1 */
    public void m24203B1(int i2) {
        m24201A1(C0833a.m5261c(this.f30050m0, i2));
    }

    /* renamed from: B2 */
    public void m24204B2(int i2) {
        m24202A2(C8926h.m28442c(this.f30050m0, i2));
    }

    /* renamed from: C1 */
    public void m24205C1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m24207D1(this.f30050m0.getResources().getBoolean(i2));
    }

    /* renamed from: C2 */
    public void m24206C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (TextUtils.equals(this.f30021M, charSequence)) {
            return;
        }
        this.f30021M = charSequence;
        this.f30057t0.m24684i(true);
        invalidateSelf();
        m24294u1();
    }

    /* renamed from: D1 */
    public void m24207D1(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f30037Z != z) {
            boolean zM24175L2 = m24175L2();
            this.f30037Z = z;
            boolean zM24175L22 = m24175L2();
            if (zM24175L2 != zM24175L22) {
                if (zM24175L22) {
                    m24183l0(this.f30038a0);
                } else {
                    m24178O2(this.f30038a0);
                }
                invalidateSelf();
                m24294u1();
            }
        }
    }

    /* renamed from: D2 */
    public void m24208D2(C8948d c8948d) {
        this.f30057t0.m24683h(c8948d, this.f30050m0);
    }

    /* renamed from: E1 */
    public void m24209E1(ColorStateList colorStateList) {
        if (this.f30009G != colorStateList) {
            this.f30009G = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: E2 */
    public void m24210E2(int i2) {
        m24208D2(new C8948d(this.f30050m0, i2));
    }

    /* renamed from: F1 */
    public void m24211F1(int i2) {
        m24209E1(C0833a.m5261c(this.f30050m0, i2));
    }

    /* renamed from: F2 */
    public void m24212F2(float f2) {
        if (this.f30046i0 != f2) {
            this.f30046i0 = f2;
            invalidateSelf();
            m24294u1();
        }
    }

    /* renamed from: G0 */
    public Drawable m24213G0() {
        return this.f30038a0;
    }

    @Deprecated
    /* renamed from: G1 */
    public void m24214G1(float f2) {
        if (this.f30013I != f2) {
            this.f30013I = f2;
            setShapeAppearanceModel(m28272D().m28335w(f2));
        }
    }

    /* renamed from: G2 */
    public void m24215G2(int i2) {
        m24212F2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: H0 */
    public ColorStateList m24216H0() {
        return this.f30039b0;
    }

    @Deprecated
    /* renamed from: H1 */
    public void m24217H1(int i2) {
        m24214G1(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: H2 */
    public void m24218H2(float f2) {
        if (this.f30045h0 != f2) {
            this.f30045h0 = f2;
            invalidateSelf();
            m24294u1();
        }
    }

    /* renamed from: I0 */
    public ColorStateList m24219I0() {
        return this.f30009G;
    }

    /* renamed from: I1 */
    public void m24220I1(float f2) {
        if (this.f30049l0 != f2) {
            this.f30049l0 = f2;
            invalidateSelf();
            m24294u1();
        }
    }

    /* renamed from: I2 */
    public void m24221I2(int i2) {
        m24218H2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: J0 */
    public float m24222J0() {
        return this.f30026O0 ? m28274G() : this.f30013I;
    }

    /* renamed from: J1 */
    public void m24223J1(int i2) {
        m24220I1(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: J2 */
    public void m24224J2(boolean z) {
        if (this.f30014I0 != z) {
            this.f30014I0 = z;
            m24179P2();
            onStateChange(getState());
        }
    }

    /* renamed from: K0 */
    public float m24225K0() {
        return this.f30049l0;
    }

    /* renamed from: K1 */
    public void m24226K1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableM24228L0 = m24228L0();
        if (drawableM24228L0 != drawable) {
            float fM24281n0 = m24281n0();
            this.f30025O = drawable != null ? C0265a.m1821r(drawable).mutate() : null;
            float fM24281n02 = m24281n0();
            m24178O2(drawableM24228L0);
            if (m24176M2()) {
                m24183l0(this.f30025O);
            }
            invalidateSelf();
            if (fM24281n0 != fM24281n02) {
                m24294u1();
            }
        }
    }

    /* renamed from: K2 */
    boolean m24227K2() {
        return this.f30022M0;
    }

    /* renamed from: L0 */
    public Drawable m24228L0() {
        Drawable drawable = this.f30025O;
        if (drawable != null) {
            return C0265a.m1820q(drawable);
        }
        return null;
    }

    /* renamed from: L1 */
    public void m24229L1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m24226K1(C0833a.m5262d(this.f30050m0, i2));
    }

    /* renamed from: M0 */
    public float m24230M0() {
        return this.f30028Q;
    }

    /* renamed from: M1 */
    public void m24231M1(float f2) {
        if (this.f30028Q != f2) {
            float fM24281n0 = m24281n0();
            this.f30028Q = f2;
            float fM24281n02 = m24281n0();
            invalidateSelf();
            if (fM24281n0 != fM24281n02) {
                m24294u1();
            }
        }
    }

    /* renamed from: N0 */
    public ColorStateList m24232N0() {
        return this.f30027P;
    }

    /* renamed from: N1 */
    public void m24233N1(int i2) {
        m24231M1(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: O0 */
    public float m24234O0() {
        return this.f30011H;
    }

    /* renamed from: O1 */
    public void m24235O1(ColorStateList colorStateList) {
        this.f30029R = true;
        if (this.f30027P != colorStateList) {
            this.f30027P = colorStateList;
            if (m24176M2()) {
                C0265a.m1818o(this.f30025O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P0 */
    public float m24236P0() {
        return this.f30042e0;
    }

    /* renamed from: P1 */
    public void m24237P1(int i2) {
        m24235O1(C0833a.m5261c(this.f30050m0, i2));
    }

    /* renamed from: Q0 */
    public ColorStateList m24238Q0() {
        return this.f30015J;
    }

    /* renamed from: Q1 */
    public void m24239Q1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m24241R1(this.f30050m0.getResources().getBoolean(i2));
    }

    /* renamed from: R0 */
    public float m24240R0() {
        return this.f30017K;
    }

    /* renamed from: R1 */
    public void m24241R1(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f30023N != z) {
            boolean zM24176M2 = m24176M2();
            this.f30023N = z;
            boolean zM24176M22 = m24176M2();
            if (zM24176M2 != zM24176M22) {
                if (zM24176M22) {
                    m24183l0(this.f30025O);
                } else {
                    m24178O2(this.f30025O);
                }
                invalidateSelf();
                m24294u1();
            }
        }
    }

    /* renamed from: S0 */
    public Drawable m24242S0() {
        Drawable drawable = this.f30031T;
        if (drawable != null) {
            return C0265a.m1820q(drawable);
        }
        return null;
    }

    /* renamed from: S1 */
    public void m24243S1(float f2) {
        if (this.f30011H != f2) {
            this.f30011H = f2;
            invalidateSelf();
            m24294u1();
        }
    }

    /* renamed from: T0 */
    public CharSequence m24244T0() {
        return this.f30035X;
    }

    /* renamed from: T1 */
    public void m24245T1(int i2) {
        m24243S1(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: U0 */
    public float m24246U0() {
        return this.f30048k0;
    }

    /* renamed from: U1 */
    public void m24247U1(float f2) {
        if (this.f30042e0 != f2) {
            this.f30042e0 = f2;
            invalidateSelf();
            m24294u1();
        }
    }

    /* renamed from: V0 */
    public float m24248V0() {
        return this.f30034W;
    }

    /* renamed from: V1 */
    public void m24249V1(int i2) {
        m24247U1(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: W0 */
    public float m24250W0() {
        return this.f30047j0;
    }

    /* renamed from: W1 */
    public void m24251W1(ColorStateList colorStateList) {
        if (this.f30015J != colorStateList) {
            this.f30015J = colorStateList;
            if (this.f30026O0) {
                m28293g0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X0 */
    public int[] m24252X0() {
        return this.f30012H0;
    }

    /* renamed from: X1 */
    public void m24253X1(int i2) {
        m24251W1(C0833a.m5261c(this.f30050m0, i2));
    }

    /* renamed from: Y0 */
    public ColorStateList m24254Y0() {
        return this.f30033V;
    }

    /* renamed from: Y1 */
    public void m24255Y1(float f2) {
        if (this.f30017K != f2) {
            this.f30017K = f2;
            this.f30051n0.setStrokeWidth(f2);
            if (this.f30026O0) {
                super.m28295h0(f2);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Z0 */
    public void m24256Z0(RectF rectF) {
        m24188q0(getBounds(), rectF);
    }

    /* renamed from: Z1 */
    public void m24257Z1(int i2) {
        m24255Y1(this.f30050m0.getResources().getDimension(i2));
    }

    @Override // com.google.android.material.internal.C8030h.b
    /* renamed from: a */
    public void mo23817a() {
        m24294u1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public TextUtils.TruncateAt m24258a1() {
        return this.f30020L0;
    }

    /* renamed from: b1 */
    public C8926h m24259b1() {
        return this.f30041d0;
    }

    /* renamed from: b2 */
    public void m24260b2(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableM24242S0 = m24242S0();
        if (drawableM24242S0 != drawable) {
            float fM24289r0 = m24289r0();
            this.f30031T = drawable != null ? C0265a.m1821r(drawable).mutate() : null;
            if (C8952b.f34450a) {
                m24180Q2();
            }
            float fM24289r02 = m24289r0();
            m24178O2(drawableM24242S0);
            if (m24177N2()) {
                m24183l0(this.f30031T);
            }
            invalidateSelf();
            if (fM24289r0 != fM24289r02) {
                m24294u1();
            }
        }
    }

    /* renamed from: c1 */
    public float m24261c1() {
        return this.f30044g0;
    }

    /* renamed from: c2 */
    public void m24262c2(CharSequence charSequence) {
        if (this.f30035X != charSequence) {
            this.f30035X = C0945a.m6011c().m6016h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: d1 */
    public float m24263d1() {
        return this.f30043f0;
    }

    /* renamed from: d2 */
    public void m24264d2(float f2) {
        if (this.f30048k0 != f2) {
            this.f30048k0 = f2;
            invalidateSelf();
            if (m24177N2()) {
                m24294u1();
            }
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i2 = this.f30004C0;
        int iM28459a = i2 < 255 ? C8930a.m28459a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        m24170B0(canvas, bounds);
        m24199y0(canvas, bounds);
        if (this.f30026O0) {
            super.draw(canvas);
        }
        m24169A0(canvas, bounds);
        m24172D0(canvas, bounds);
        m24200z0(canvas, bounds);
        m24198x0(canvas, bounds);
        if (this.f30022M0) {
            m24174F0(canvas, bounds);
        }
        m24171C0(canvas, bounds);
        m24173E0(canvas, bounds);
        if (this.f30004C0 < 255) {
            canvas.restoreToCount(iM28459a);
        }
    }

    /* renamed from: e1 */
    public ColorStateList m24265e1() {
        return this.f30019L;
    }

    /* renamed from: e2 */
    public void m24266e2(int i2) {
        m24264d2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: f1 */
    public C8926h m24267f1() {
        return this.f30040c0;
    }

    /* renamed from: f2 */
    public void m24268f2(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m24260b2(C0833a.m5262d(this.f30050m0, i2));
    }

    /* renamed from: g1 */
    public CharSequence m24269g1() {
        return this.f30021M;
    }

    /* renamed from: g2 */
    public void m24270g2(float f2) {
        if (this.f30034W != f2) {
            this.f30034W = f2;
            invalidateSelf();
            if (m24177N2()) {
                m24294u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f30004C0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f30005D0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f30011H;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f30042e0 + m24281n0() + this.f30045h0 + this.f30057t0.m24681f(m24269g1().toString()) + this.f30046i0 + m24289r0() + this.f30049l0), this.f30024N0);
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f30026O0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f30013I);
        } else {
            outline.setRoundRect(bounds, this.f30013I);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public C8948d m24271h1() {
        return this.f30057t0.m24679d();
    }

    /* renamed from: h2 */
    public void m24272h2(int i2) {
        m24270g2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: i1 */
    public float m24273i1() {
        return this.f30046i0;
    }

    /* renamed from: i2 */
    public void m24274i2(float f2) {
        if (this.f30047j0 != f2) {
            this.f30047j0 = f2;
            invalidateSelf();
            if (m24177N2()) {
                m24294u1();
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

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return m24189q1(this.f30007F) || m24189q1(this.f30009G) || m24189q1(this.f30015J) || (this.f30014I0 && m24189q1(this.f30016J0)) || m24192s1(this.f30057t0.m24679d()) || m24195v0() || m24190r1(this.f30025O) || m24190r1(this.f30038a0) || m24189q1(this.f30008F0);
    }

    /* renamed from: j1 */
    public float m24275j1() {
        return this.f30045h0;
    }

    /* renamed from: j2 */
    public void m24276j2(int i2) {
        m24274i2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: k2 */
    public boolean m24277k2(int[] iArr) {
        if (Arrays.equals(this.f30012H0, iArr)) {
            return false;
        }
        this.f30012H0 = iArr;
        if (m24177N2()) {
            return m24196v1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: l1 */
    public boolean m24278l1() {
        return this.f30014I0;
    }

    /* renamed from: l2 */
    public void m24279l2(ColorStateList colorStateList) {
        if (this.f30033V != colorStateList) {
            this.f30033V = colorStateList;
            if (m24177N2()) {
                C0265a.m1818o(this.f30031T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: m2 */
    public void m24280m2(int i2) {
        m24279l2(C0833a.m5261c(this.f30050m0, i2));
    }

    /* renamed from: n0 */
    float m24281n0() {
        if (m24176M2() || m24175L2()) {
            return this.f30043f0 + this.f30028Q + this.f30044g0;
        }
        return 0.0f;
    }

    /* renamed from: n1 */
    public boolean m24282n1() {
        return this.f30036Y;
    }

    /* renamed from: n2 */
    public void m24283n2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f30030S != z) {
            boolean zM24177N2 = m24177N2();
            this.f30030S = z;
            boolean zM24177N22 = m24177N2();
            if (zM24177N2 != zM24177N22) {
                if (zM24177N22) {
                    m24183l0(this.f30031T);
                } else {
                    m24178O2(this.f30031T);
                }
                invalidateSelf();
                m24294u1();
            }
        }
    }

    /* renamed from: o1 */
    public boolean m24284o1() {
        return m24190r1(this.f30031T);
    }

    /* renamed from: o2 */
    public void m24285o2(a aVar) {
        this.f30018K0 = new WeakReference<>(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (m24176M2()) {
            zOnLayoutDirectionChanged |= C0265a.m1816m(this.f30025O, i2);
        }
        if (m24175L2()) {
            zOnLayoutDirectionChanged |= C0265a.m1816m(this.f30038a0, i2);
        }
        if (m24177N2()) {
            zOnLayoutDirectionChanged |= C0265a.m1816m(this.f30031T, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (m24176M2()) {
            zOnLevelChange |= this.f30025O.setLevel(i2);
        }
        if (m24175L2()) {
            zOnLevelChange |= this.f30038a0.setLevel(i2);
        }
        if (m24177N2()) {
            zOnLevelChange |= this.f30031T.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable, com.google.android.material.internal.C8030h.b
    public boolean onStateChange(int[] iArr) {
        if (this.f30026O0) {
            super.onStateChange(iArr);
        }
        return m24196v1(iArr, m24252X0());
    }

    /* renamed from: p1 */
    public boolean m24286p1() {
        return this.f30030S;
    }

    /* renamed from: p2 */
    public void m24287p2(TextUtils.TruncateAt truncateAt) {
        this.f30020L0 = truncateAt;
    }

    /* renamed from: q2 */
    public void m24288q2(C8926h c8926h) {
        this.f30041d0 = c8926h;
    }

    /* renamed from: r0 */
    float m24289r0() {
        if (m24177N2()) {
            return this.f30047j0 + this.f30034W + this.f30048k0;
        }
        return 0.0f;
    }

    /* renamed from: r2 */
    public void m24290r2(int i2) {
        m24288q2(C8926h.m28442c(this.f30050m0, i2));
    }

    /* renamed from: s2 */
    public void m24291s2(float f2) {
        if (this.f30044g0 != f2) {
            float fM24281n0 = m24281n0();
            this.f30044g0 = f2;
            float fM24281n02 = m24281n0();
            invalidateSelf();
            if (fM24281n0 != fM24281n02) {
                m24294u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f30004C0 != i2) {
            this.f30004C0 = i2;
            invalidateSelf();
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f30005D0 != colorFilter) {
            this.f30005D0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f30008F0 != colorStateList) {
            this.f30008F0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.C8900g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f30010G0 != mode) {
            this.f30010G0 = mode;
            this.f30006E0 = C8939a.m28477a(this, this.f30008F0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m24176M2()) {
            visible |= this.f30025O.setVisible(z, z2);
        }
        if (m24175L2()) {
            visible |= this.f30038a0.setVisible(z, z2);
        }
        if (m24177N2()) {
            visible |= this.f30031T.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void m24292t2(int i2) {
        m24291s2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: u0 */
    Paint.Align m24293u0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f30021M != null) {
            float fM24281n0 = this.f30042e0 + m24281n0() + this.f30045h0;
            if (C0265a.m1809f(this) == 0) {
                pointF.x = rect.left + fM24281n0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fM24281n0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m24193t0();
        }
        return align;
    }

    /* renamed from: u1 */
    protected void m24294u1() {
        a aVar = this.f30018K0.get();
        if (aVar != null) {
            aVar.mo24145a();
        }
    }

    /* renamed from: u2 */
    public void m24295u2(float f2) {
        if (this.f30043f0 != f2) {
            float fM24281n0 = m24281n0();
            this.f30043f0 = f2;
            float fM24281n02 = m24281n0();
            invalidateSelf();
            if (fM24281n0 != fM24281n02) {
                m24294u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v2 */
    public void m24296v2(int i2) {
        m24295u2(this.f30050m0.getResources().getDimension(i2));
    }

    /* renamed from: w1 */
    public void m24297w1(boolean z) {
        if (this.f30036Y != z) {
            this.f30036Y = z;
            float fM24281n0 = m24281n0();
            if (!z && this.f30002A0) {
                this.f30002A0 = false;
            }
            float fM24281n02 = m24281n0();
            invalidateSelf();
            if (fM24281n0 != fM24281n02) {
                m24294u1();
            }
        }
    }

    /* renamed from: w2 */
    public void m24298w2(int i2) {
        this.f30024N0 = i2;
    }

    /* renamed from: x1 */
    public void m24299x1(int i2) {
        m24297w1(this.f30050m0.getResources().getBoolean(i2));
    }

    /* renamed from: x2 */
    public void m24300x2(ColorStateList colorStateList) {
        if (this.f30019L != colorStateList) {
            this.f30019L = colorStateList;
            m24179P2();
            onStateChange(getState());
        }
    }

    /* renamed from: y1 */
    public void m24301y1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f30038a0 != drawable) {
            float fM24281n0 = m24281n0();
            this.f30038a0 = drawable;
            float fM24281n02 = m24281n0();
            m24178O2(this.f30038a0);
            m24183l0(this.f30038a0);
            invalidateSelf();
            if (fM24281n0 != fM24281n02) {
                m24294u1();
            }
        }
    }

    /* renamed from: y2 */
    public void m24302y2(int i2) {
        m24300x2(C0833a.m5261c(this.f30050m0, i2));
    }

    /* renamed from: z1 */
    public void m24303z1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m24301y1(C0833a.m5262d(this.f30050m0, i2));
    }

    /* renamed from: z2 */
    void m24304z2(boolean z) {
        this.f30022M0 = z;
    }
}
