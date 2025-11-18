package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import j.C3699a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import k1.C3784a;
import m.C3943a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: w0, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f21437w0 = new a(Float.class, "thumbPos");

    /* renamed from: x0, reason: collision with root package name */
    private static final int[] f21438x0 = {R.attr.state_checked};

    /* renamed from: B, reason: collision with root package name */
    private Drawable f21439B;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f21440C;

    /* renamed from: D, reason: collision with root package name */
    private PorterDuff.Mode f21441D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21442E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21443F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f21444G;

    /* renamed from: H, reason: collision with root package name */
    private ColorStateList f21445H;

    /* renamed from: I, reason: collision with root package name */
    private PorterDuff.Mode f21446I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f21447J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21448K;

    /* renamed from: L, reason: collision with root package name */
    private int f21449L;

    /* renamed from: M, reason: collision with root package name */
    private int f21450M;

    /* renamed from: N, reason: collision with root package name */
    private int f21451N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21452O;

    /* renamed from: P, reason: collision with root package name */
    private CharSequence f21453P;

    /* renamed from: Q, reason: collision with root package name */
    private CharSequence f21454Q;

    /* renamed from: R, reason: collision with root package name */
    private CharSequence f21455R;

    /* renamed from: S, reason: collision with root package name */
    private CharSequence f21456S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21457T;

    /* renamed from: U, reason: collision with root package name */
    private int f21458U;

    /* renamed from: V, reason: collision with root package name */
    private int f21459V;

    /* renamed from: W, reason: collision with root package name */
    private float f21460W;

    /* renamed from: a0, reason: collision with root package name */
    private float f21461a0;

    /* renamed from: b0, reason: collision with root package name */
    private VelocityTracker f21462b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f21463c0;

    /* renamed from: d0, reason: collision with root package name */
    float f21464d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f21465e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f21466f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f21467g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f21468h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f21469i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f21470j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f21471k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f21472l0;

    /* renamed from: m0, reason: collision with root package name */
    private final TextPaint f21473m0;

    /* renamed from: n0, reason: collision with root package name */
    private ColorStateList f21474n0;

    /* renamed from: o0, reason: collision with root package name */
    private Layout f21475o0;

    /* renamed from: p0, reason: collision with root package name */
    private Layout f21476p0;

    /* renamed from: q0, reason: collision with root package name */
    private TransformationMethod f21477q0;

    /* renamed from: r0, reason: collision with root package name */
    ObjectAnimator f21478r0;

    /* renamed from: s0, reason: collision with root package name */
    private final C2001x f21479s0;

    /* renamed from: t0, reason: collision with root package name */
    private C1989k f21480t0;

    /* renamed from: u0, reason: collision with root package name */
    private b f21481u0;

    /* renamed from: v0, reason: collision with root package name */
    private final Rect f21482v0;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f21464d0);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends f.AbstractC0355f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f21483a;

        b(SwitchCompat switchCompat) {
            this.f21483a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.AbstractC0355f
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.f21483a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0355f
        public void b() {
            SwitchCompat switchCompat = this.f21483a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42390M);
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f21437w0, z10 ? 1.0f : 0.0f);
        this.f21478r0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f21478r0.setAutoCancel(true);
        this.f21478r0.start();
    }

    private void b() {
        Drawable drawable = this.f21439B;
        if (drawable != null) {
            if (this.f21442E || this.f21443F) {
                Drawable drawableMutate = C3784a.r(drawable).mutate();
                this.f21439B = drawableMutate;
                if (this.f21442E) {
                    C3784a.o(drawableMutate, this.f21440C);
                }
                if (this.f21443F) {
                    C3784a.p(this.f21439B, this.f21441D);
                }
                if (this.f21439B.isStateful()) {
                    this.f21439B.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f21444G;
        if (drawable != null) {
            if (this.f21447J || this.f21448K) {
                Drawable drawableMutate = C3784a.r(drawable).mutate();
                this.f21444G = drawableMutate;
                if (this.f21447J) {
                    C3784a.o(drawableMutate, this.f21445H);
                }
                if (this.f21448K) {
                    C3784a.p(this.f21444G, this.f21446I);
                }
                if (this.f21444G.isStateful()) {
                    this.f21444G.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f21478r0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f21477q0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private C1989k getEmojiTextViewHelper() {
        if (this.f21480t0 == null) {
            this.f21480t0 = new C1989k(this);
        }
        return this.f21480t0;
    }

    private boolean getTargetCheckedState() {
        return this.f21464d0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((h0.b(this) ? 1.0f - this.f21464d0 : this.f21464d0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f21444G;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f21482v0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f21439B;
        Rect rectD = drawable2 != null ? I.d(drawable2) : I.f21243c;
        return ((((this.f21465e0 - this.f21467g0) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f21439B == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f21439B.getPadding(this.f21482v0);
        int i10 = this.f21469i0;
        int i11 = this.f21459V;
        int i12 = i10 - i11;
        int i13 = (this.f21468h0 + thumbOffset) - i11;
        int i14 = this.f21467g0 + i13;
        Rect rect = this.f21482v0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f21471k0 + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f21473m0, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f21455R;
            if (string == null) {
                string = getResources().getString(i.h.f42546b);
            }
            s1.X.G0(this, string);
        }
    }

    private void l() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f21453P;
            if (string == null) {
                string = getResources().getString(i.h.f42547c);
            }
            s1.X.G0(this, string);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.f21481u0 == null && this.f21480t0.b() && androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
            int iE = fVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.f21481u0 = bVar;
                fVarC.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) throws Resources.NotFoundException {
        this.f21458U = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f21462b0.computeCurrentVelocity(1000);
            float xVelocity = this.f21462b0.getXVelocity();
            if (Math.abs(xVelocity) <= this.f21463c0) {
                targetCheckedState = getTargetCheckedState();
            } else if (!h0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f21455R = charSequence;
        this.f21456S = g(charSequence);
        this.f21476p0 = null;
        if (this.f21457T) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f21453P = charSequence;
        this.f21454Q = g(charSequence);
        this.f21475o0 = null;
        if (this.f21457T) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f21482v0;
        int i12 = this.f21468h0;
        int i13 = this.f21469i0;
        int i14 = this.f21470j0;
        int i15 = this.f21471k0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f21439B;
        Rect rectD = drawable != null ? I.d(drawable) : I.f21243c;
        Drawable drawable2 = this.f21444G;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f21444G.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f21444G.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f21439B;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f21467g0 + rect.right;
            this.f21439B.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C3784a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f21439B;
        if (drawable != null) {
            C3784a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f21444G;
        if (drawable2 != null) {
            C3784a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f21439B;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f21444G;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!h0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f21465e0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f21451N : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (h0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f21465e0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f21451N : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f21457T;
    }

    public boolean getSplitTrack() {
        return this.f21452O;
    }

    public int getSwitchMinWidth() {
        return this.f21450M;
    }

    public int getSwitchPadding() {
        return this.f21451N;
    }

    public CharSequence getTextOff() {
        return this.f21455R;
    }

    public CharSequence getTextOn() {
        return this.f21453P;
    }

    public Drawable getThumbDrawable() {
        return this.f21439B;
    }

    protected final float getThumbPosition() {
        return this.f21464d0;
    }

    public int getThumbTextPadding() {
        return this.f21449L;
    }

    public ColorStateList getThumbTintList() {
        return this.f21440C;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f21441D;
    }

    public Drawable getTrackDrawable() {
        return this.f21444G;
    }

    public ColorStateList getTrackTintList() {
        return this.f21445H;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f21446I;
    }

    void j() {
        setTextOnInternal(this.f21453P);
        setTextOffInternal(this.f21455R);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21439B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f21444G;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f21478r0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f21478r0.end();
        this.f21478r0 = null;
    }

    public void m(Context context, int i10) {
        a0 a0VarT = a0.t(context, i10, i.j.f42655S2);
        ColorStateList colorStateListC = a0VarT.c(i.j.f42671W2);
        if (colorStateListC != null) {
            this.f21474n0 = colorStateListC;
        } else {
            this.f21474n0 = getTextColors();
        }
        int iF = a0VarT.f(i.j.f42659T2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f21473m0.getTextSize()) {
                this.f21473m0.setTextSize(f10);
                requestLayout();
            }
        }
        o(a0VarT.k(i.j.f42663U2, -1), a0VarT.k(i.j.f42667V2, -1));
        if (a0VarT.a(i.j.f42693b3, false)) {
            this.f21477q0 = new C3943a(getContext());
        } else {
            this.f21477q0 = null;
        }
        setTextOnInternal(this.f21453P);
        setTextOffInternal(this.f21455R);
        a0VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f21473m0.setFakeBoldText(false);
            this.f21473m0.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f21473m0.setFakeBoldText((i11 & 1) != 0);
            this.f21473m0.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f21438x0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f21482v0;
        Drawable drawable = this.f21444G;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f21469i0;
        int i11 = this.f21471k0;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f21439B;
        if (drawable != null) {
            if (!this.f21452O || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = I.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f21475o0 : this.f21476p0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f21474n0;
            if (colorStateList != null) {
                this.f21473m0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f21473m0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f21453P : this.f21455R;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f21439B != null) {
            Rect rect = this.f21482v0;
            Drawable drawable = this.f21444G;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = I.d(this.f21439B);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (h0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f21465e0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f21465e0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.f21466f0;
            paddingTop = paddingTop2 - (i14 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f21466f0;
                this.f21468h0 = paddingLeft;
                this.f21469i0 = paddingTop;
                this.f21471k0 = height;
                this.f21470j0 = width;
            }
            paddingTop = getPaddingTop();
            i14 = this.f21466f0;
        }
        height = i14 + paddingTop;
        this.f21468h0 = paddingLeft;
        this.f21469i0 = paddingTop;
        this.f21471k0 = height;
        this.f21470j0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f21457T) {
            if (this.f21475o0 == null) {
                this.f21475o0 = i(this.f21454Q);
            }
            if (this.f21476p0 == null) {
                this.f21476p0 = i(this.f21456S);
            }
        }
        Rect rect = this.f21482v0;
        Drawable drawable = this.f21439B;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f21439B.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f21439B.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f21467g0 = Math.max(this.f21457T ? Math.max(this.f21475o0.getWidth(), this.f21476p0.getWidth()) + (this.f21449L * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f21444G;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f21444G.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f21439B;
        if (drawable3 != null) {
            Rect rectD = I.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f21472l0 ? Math.max(this.f21450M, (this.f21467g0 * 2) + iMax + iMax2) : this.f21450M;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f21465e0 = iMax3;
        this.f21466f0 = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f21453P : this.f21455R;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f21462b0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f21458U
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f21460W
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.h0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f21464d0
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f21464d0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f21460W = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f21460W
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f21459V
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f21461a0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f21459V
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f21458U = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f21460W = r0
            r6.f21461a0 = r3
            return r1
        L89:
            int r0 = r6.f21458U
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f21458U = r0
            android.view.VelocityTracker r0 = r6.f21462b0
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f21458U = r1
            r6.f21460W = r0
            r6.f21461a0 = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) throws Resources.NotFoundException {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f21453P);
        setTextOffInternal(this.f21455R);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f21472l0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f21457T != z10) {
            this.f21457T = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f21452O = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f21450M = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f21451N = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f21473m0.getTypeface() == null || this.f21473m0.getTypeface().equals(typeface)) && (this.f21473m0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f21473m0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f21439B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21439B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f21464d0 = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C3699a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f21449L = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f21440C = colorStateList;
        this.f21442E = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f21441D = mode;
        this.f21443F = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f21444G;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21444G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C3699a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f21445H = colorStateList;
        this.f21447J = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f21446I = mode;
        this.f21448K = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21439B || drawable == this.f21444G;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f21440C = null;
        this.f21441D = null;
        this.f21442E = false;
        this.f21443F = false;
        this.f21445H = null;
        this.f21446I = null;
        this.f21447J = false;
        this.f21448K = false;
        this.f21462b0 = VelocityTracker.obtain();
        this.f21472l0 = true;
        this.f21482v0 = new Rect();
        V.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f21473m0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = i.j.f42580D2;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        s1.X.l0(this, context, iArr, attributeSet, a0VarV.r(), i10, 0);
        Drawable drawableG = a0VarV.g(i.j.f42595G2);
        this.f21439B = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = a0VarV.g(i.j.f42640P2);
        this.f21444G = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(a0VarV.p(i.j.f42585E2));
        setTextOffInternal(a0VarV.p(i.j.f42590F2));
        this.f21457T = a0VarV.a(i.j.f42600H2, true);
        this.f21449L = a0VarV.f(i.j.f42625M2, 0);
        this.f21450M = a0VarV.f(i.j.f42610J2, 0);
        this.f21451N = a0VarV.f(i.j.f42615K2, 0);
        this.f21452O = a0VarV.a(i.j.f42605I2, false);
        ColorStateList colorStateListC = a0VarV.c(i.j.f42630N2);
        if (colorStateListC != null) {
            this.f21440C = colorStateListC;
            this.f21442E = true;
        }
        PorterDuff.Mode modeE = I.e(a0VarV.k(i.j.f42635O2, -1), null);
        if (this.f21441D != modeE) {
            this.f21441D = modeE;
            this.f21443F = true;
        }
        if (this.f21442E || this.f21443F) {
            b();
        }
        ColorStateList colorStateListC2 = a0VarV.c(i.j.f42645Q2);
        if (colorStateListC2 != null) {
            this.f21445H = colorStateListC2;
            this.f21447J = true;
        }
        PorterDuff.Mode modeE2 = I.e(a0VarV.k(i.j.f42650R2, -1), null);
        if (this.f21446I != modeE2) {
            this.f21446I = modeE2;
            this.f21448K = true;
        }
        if (this.f21447J || this.f21448K) {
            c();
        }
        int iN = a0VarV.n(i.j.f42620L2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C2001x c2001x = new C2001x(this);
        this.f21479s0 = c2001x;
        c2001x.m(attributeSet, i10);
        a0VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21459V = viewConfiguration.getScaledTouchSlop();
        this.f21463c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
