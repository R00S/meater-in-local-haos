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
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import androidx.core.widget.C0330k;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0823a;
import p024c.p025a.C0832j;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p025a.p031n.C0840a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: f */
    private static final Property<SwitchCompat, Float> f925f = new C0143a(Float.class, "thumbPos");

    /* renamed from: g */
    private static final int[] f926g = {R.attr.state_checked};

    /* renamed from: A */
    private float f927A;

    /* renamed from: B */
    private float f928B;

    /* renamed from: C */
    private VelocityTracker f929C;

    /* renamed from: D */
    private int f930D;

    /* renamed from: E */
    float f931E;

    /* renamed from: F */
    private int f932F;

    /* renamed from: G */
    private int f933G;

    /* renamed from: H */
    private int f934H;

    /* renamed from: I */
    private int f935I;

    /* renamed from: J */
    private int f936J;

    /* renamed from: K */
    private int f937K;

    /* renamed from: L */
    private int f938L;

    /* renamed from: M */
    private final TextPaint f939M;

    /* renamed from: N */
    private ColorStateList f940N;

    /* renamed from: O */
    private Layout f941O;

    /* renamed from: P */
    private Layout f942P;

    /* renamed from: Q */
    private TransformationMethod f943Q;

    /* renamed from: R */
    ObjectAnimator f944R;

    /* renamed from: S */
    private final C0188s f945S;

    /* renamed from: T */
    private final Rect f946T;

    /* renamed from: h */
    private Drawable f947h;

    /* renamed from: i */
    private ColorStateList f948i;

    /* renamed from: j */
    private PorterDuff.Mode f949j;

    /* renamed from: k */
    private boolean f950k;

    /* renamed from: l */
    private boolean f951l;

    /* renamed from: m */
    private Drawable f952m;

    /* renamed from: n */
    private ColorStateList f953n;

    /* renamed from: o */
    private PorterDuff.Mode f954o;

    /* renamed from: p */
    private boolean f955p;

    /* renamed from: q */
    private boolean f956q;

    /* renamed from: r */
    private int f957r;

    /* renamed from: s */
    private int f958s;

    /* renamed from: t */
    private int f959t;

    /* renamed from: u */
    private boolean f960u;

    /* renamed from: v */
    private CharSequence f961v;

    /* renamed from: w */
    private CharSequence f962w;

    /* renamed from: x */
    private boolean f963x;

    /* renamed from: y */
    private int f964y;

    /* renamed from: z */
    private int f965z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0143a extends Property<SwitchCompat, Float> {
        C0143a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f931E);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5023L);
    }

    /* renamed from: a */
    private void m824a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f925f, z ? 1.0f : 0.0f);
        this.f944R = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f944R.setAutoCancel(true);
        }
        this.f944R.start();
    }

    /* renamed from: b */
    private void m825b() {
        Drawable drawable = this.f947h;
        if (drawable != null) {
            if (this.f950k || this.f951l) {
                Drawable drawableMutate = C0265a.m1821r(drawable).mutate();
                this.f947h = drawableMutate;
                if (this.f950k) {
                    C0265a.m1818o(drawableMutate, this.f948i);
                }
                if (this.f951l) {
                    C0265a.m1819p(this.f947h, this.f949j);
                }
                if (this.f947h.isStateful()) {
                    this.f947h.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    private void m826c() {
        Drawable drawable = this.f952m;
        if (drawable != null) {
            if (this.f955p || this.f956q) {
                Drawable drawableMutate = C0265a.m1821r(drawable).mutate();
                this.f952m = drawableMutate;
                if (this.f955p) {
                    C0265a.m1818o(drawableMutate, this.f953n);
                }
                if (this.f956q) {
                    C0265a.m1819p(this.f952m, this.f954o);
                }
                if (this.f952m.isStateful()) {
                    this.f952m.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    private void m827d() {
        ObjectAnimator objectAnimator = this.f944R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m828e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* renamed from: f */
    private static float m829f(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    /* renamed from: g */
    private boolean m830g(float f2, float f3) {
        if (this.f947h == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f947h.getPadding(this.f946T);
        int i2 = this.f936J;
        int i3 = this.f965z;
        int i4 = i2 - i3;
        int i5 = (this.f935I + thumbOffset) - i3;
        int i6 = this.f934H + i5;
        Rect rect = this.f946T;
        return f2 > ((float) i5) && f2 < ((float) (((i6 + rect.left) + rect.right) + i3)) && f3 > ((float) i4) && f3 < ((float) (this.f938L + i3));
    }

    private boolean getTargetCheckedState() {
        return this.f931E > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0197w0.m1231b(this) ? 1.0f - this.f931E : this.f931E) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f952m;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f946T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f947h;
        Rect rectM1237d = drawable2 != null ? C0200y.m1237d(drawable2) : C0200y.f1327c;
        return ((((this.f932F - this.f934H) - rect.left) - rect.right) - rectM1237d.left) - rectM1237d.right;
    }

    /* renamed from: h */
    private Layout m831h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f943Q;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f939M, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m832k(int i2, int i3) {
        m835j(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i3);
    }

    /* renamed from: l */
    private void m833l(MotionEvent motionEvent) {
        this.f964y = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.f929C.computeCurrentVelocity(1000);
            float xVelocity = this.f929C.getXVelocity();
            if (Math.abs(xVelocity) <= this.f930D) {
                targetCheckedState = getTargetCheckedState();
            } else if (!C0197w0.m1231b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m828e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.f946T;
        int i4 = this.f935I;
        int i5 = this.f936J;
        int i6 = this.f937K;
        int i7 = this.f938L;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f947h;
        Rect rectM1237d = drawable != null ? C0200y.m1237d(drawable) : C0200y.f1327c;
        Drawable drawable2 = this.f952m;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectM1237d != null) {
                int i9 = rectM1237d.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectM1237d.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectM1237d.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectM1237d.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f952m.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f952m.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f947h;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f934H + rect.right;
            this.f947h.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                C0265a.m1815l(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f947h;
        if (drawable != null) {
            C0265a.m1814k(drawable, f2, f3);
        }
        Drawable drawable2 = this.f952m;
        if (drawable2 != null) {
            C0265a.m1814k(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f947h;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f952m;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0197w0.m1231b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f932F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f959t : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0197w0.m1231b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f932F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f959t : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f963x;
    }

    public boolean getSplitTrack() {
        return this.f960u;
    }

    public int getSwitchMinWidth() {
        return this.f958s;
    }

    public int getSwitchPadding() {
        return this.f959t;
    }

    public CharSequence getTextOff() {
        return this.f962w;
    }

    public CharSequence getTextOn() {
        return this.f961v;
    }

    public Drawable getThumbDrawable() {
        return this.f947h;
    }

    public int getThumbTextPadding() {
        return this.f957r;
    }

    public ColorStateList getThumbTintList() {
        return this.f948i;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f949j;
    }

    public Drawable getTrackDrawable() {
        return this.f952m;
    }

    public ColorStateList getTrackTintList() {
        return this.f953n;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f954o;
    }

    /* renamed from: i */
    public void m834i(Context context, int i2) {
        C0185q0 c0185q0M1089t = C0185q0.m1089t(context, i2, C0832j.f5317X2);
        ColorStateList colorStateListM1094c = c0185q0M1089t.m1094c(C0832j.f5337b3);
        if (colorStateListM1094c != null) {
            this.f940N = colorStateListM1094c;
        } else {
            this.f940N = getTextColors();
        }
        int iM1097f = c0185q0M1089t.m1097f(C0832j.f5322Y2, 0);
        if (iM1097f != 0) {
            float f2 = iM1097f;
            if (f2 != this.f939M.getTextSize()) {
                this.f939M.setTextSize(f2);
                requestLayout();
            }
        }
        m832k(c0185q0M1089t.m1102k(C0832j.f5327Z2, -1), c0185q0M1089t.m1102k(C0832j.f5332a3, -1));
        if (c0185q0M1089t.m1092a(C0832j.f5372i3, false)) {
            this.f943Q = new C0840a(getContext());
        } else {
            this.f943Q = null;
        }
        c0185q0M1089t.m1111w();
    }

    /* renamed from: j */
    public void m835j(Typeface typeface, int i2) {
        if (i2 <= 0) {
            this.f939M.setFakeBoldText(false);
            this.f939M.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & i2;
            this.f939M.setFakeBoldText((style & 1) != 0);
            this.f939M.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f947h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f952m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f944R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f944R.end();
        this.f944R = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(iArrOnCreateDrawableState, f926g);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f946T;
        Drawable drawable = this.f952m;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f936J;
        int i3 = this.f938L;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f947h;
        if (drawable != null) {
            if (!this.f960u || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM1237d = C0200y.m1237d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM1237d.left;
                rect.right -= rectM1237d.right;
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
        Layout layout = getTargetCheckedState() ? this.f941O : this.f942P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f940N;
            if (colorStateList != null) {
                this.f939M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f939M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
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
        CharSequence charSequence = isChecked() ? this.f961v : this.f962w;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int i6;
        int paddingTop;
        int height;
        super.onLayout(z, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f947h != null) {
            Rect rect = this.f946T;
            Drawable drawable = this.f952m;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM1237d = C0200y.m1237d(this.f947h);
            iMax = Math.max(0, rectM1237d.left - rect.left);
            iMax2 = Math.max(0, rectM1237d.right - rect.right);
        } else {
            iMax = 0;
        }
        if (C0197w0.m1231b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f932F + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f932F) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i6 = this.f933G;
            paddingTop = paddingTop2 - (i6 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f933G;
                this.f935I = paddingLeft;
                this.f936J = paddingTop;
                this.f938L = height;
                this.f937K = width;
            }
            paddingTop = getPaddingTop();
            i6 = this.f933G;
        }
        height = i6 + paddingTop;
        this.f935I = paddingLeft;
        this.f936J = paddingTop;
        this.f938L = height;
        this.f937K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f963x) {
            if (this.f941O == null) {
                this.f941O = m831h(this.f961v);
            }
            if (this.f942P == null) {
                this.f942P = m831h(this.f962w);
            }
        }
        Rect rect = this.f946T;
        Drawable drawable = this.f947h;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f947h.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f947h.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f934H = Math.max(this.f963x ? Math.max(this.f941O.getWidth(), this.f942P.getWidth()) + (this.f957r * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f952m;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f952m.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f947h;
        if (drawable3 != null) {
            Rect rectM1237d = C0200y.m1237d(drawable3);
            iMax = Math.max(iMax, rectM1237d.left);
            iMax2 = Math.max(iMax2, rectM1237d.right);
        }
        int iMax3 = Math.max(this.f958s, (this.f934H * 2) + iMax + iMax2);
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f932F = iMax3;
        this.f933G = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f961v : this.f962w;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f929C
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f964y
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f927A
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.C0197w0.m1231b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.f931E
            float r0 = r0 + r2
            float r0 = m829f(r0, r4, r3)
            float r2 = r6.f931E
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f927A = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f927A
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f965z
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f928B
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f965z
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f964y = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f927A = r0
            r6.f928B = r3
            return r1
        L8b:
            int r0 = r6.f964y
            if (r0 != r2) goto L96
            r6.m833l(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f964y = r0
            android.view.VelocityTracker r0 = r6.f929C
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.m830g(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f964y = r1
            r6.f927A = r0
            r6.f928B = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null && C0311u.m2102O(this)) {
            m824a(zIsChecked);
        } else {
            m827d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0330k.m2335p(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f963x != z) {
            this.f963x = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f960u = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f958s = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f959t = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f939M.getTypeface() == null || this.f939M.getTypeface().equals(typeface)) && (this.f939M.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f939M.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f962w = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f961v = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f947h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f947h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f2) {
        this.f931E = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(C0833a.m5262d(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f957r = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f948i = colorStateList;
        this.f950k = true;
        m825b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f949j = mode;
        this.f951l = true;
        m825b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f952m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f952m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(C0833a.m5262d(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f953n = colorStateList;
        this.f955p = true;
        m826c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f954o = mode;
        this.f956q = true;
        m826c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f947h || drawable == this.f952m;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i2);
        this.f948i = null;
        this.f949j = null;
        this.f950k = false;
        this.f951l = false;
        this.f953n = null;
        this.f954o = null;
        this.f955p = false;
        this.f956q = false;
        this.f929C = VelocityTracker.obtain();
        this.f946T = new Rect();
        C0175l0.m1068a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f939M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C0832j.f5242I2;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, iArr, i2, 0);
        C0311u.m2127g0(this, context, iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        Drawable drawableM1098g = c0185q0M1091v.m1098g(C0832j.f5257L2);
        this.f947h = drawableM1098g;
        if (drawableM1098g != null) {
            drawableM1098g.setCallback(this);
        }
        Drawable drawableM1098g2 = c0185q0M1091v.m1098g(C0832j.f5302U2);
        this.f952m = drawableM1098g2;
        if (drawableM1098g2 != null) {
            drawableM1098g2.setCallback(this);
        }
        this.f961v = c0185q0M1091v.m1107p(C0832j.f5247J2);
        this.f962w = c0185q0M1091v.m1107p(C0832j.f5252K2);
        this.f963x = c0185q0M1091v.m1092a(C0832j.f5262M2, true);
        this.f957r = c0185q0M1091v.m1097f(C0832j.f5287R2, 0);
        this.f958s = c0185q0M1091v.m1097f(C0832j.f5272O2, 0);
        this.f959t = c0185q0M1091v.m1097f(C0832j.f5277P2, 0);
        this.f960u = c0185q0M1091v.m1092a(C0832j.f5267N2, false);
        ColorStateList colorStateListM1094c = c0185q0M1091v.m1094c(C0832j.f5292S2);
        if (colorStateListM1094c != null) {
            this.f948i = colorStateListM1094c;
            this.f950k = true;
        }
        PorterDuff.Mode modeM1238e = C0200y.m1238e(c0185q0M1091v.m1102k(C0832j.f5297T2, -1), null);
        if (this.f949j != modeM1238e) {
            this.f949j = modeM1238e;
            this.f951l = true;
        }
        if (this.f950k || this.f951l) {
            m825b();
        }
        ColorStateList colorStateListM1094c2 = c0185q0M1091v.m1094c(C0832j.f5307V2);
        if (colorStateListM1094c2 != null) {
            this.f953n = colorStateListM1094c2;
            this.f955p = true;
        }
        PorterDuff.Mode modeM1238e2 = C0200y.m1238e(c0185q0M1091v.m1102k(C0832j.f5312W2, -1), null);
        if (this.f954o != modeM1238e2) {
            this.f954o = modeM1238e2;
            this.f956q = true;
        }
        if (this.f955p || this.f956q) {
            m826c();
        }
        int iM1105n = c0185q0M1091v.m1105n(C0832j.f5282Q2, 0);
        if (iM1105n != 0) {
            m834i(context, iM1105n);
        }
        C0188s c0188s = new C0188s(this);
        this.f945S = c0188s;
        c0188s.m1165m(attributeSet, i2);
        c0185q0M1091v.m1111w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f965z = viewConfiguration.getScaledTouchSlop();
        this.f930D = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
