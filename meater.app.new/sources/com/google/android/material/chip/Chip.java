package com.google.android.material.chip;

import C7.k;
import C7.l;
import C7.m;
import D7.h;
import U7.d;
import U7.f;
import X7.n;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import b8.C2272a;
import com.google.android.material.chip.a;
import com.google.android.material.internal.j;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import java.util.List;
import s1.X;
import t1.t;
import z1.AbstractC5165a;

/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0464a, n, Checkable {

    /* renamed from: a0, reason: collision with root package name */
    private static final int f36275a0 = l.f2586w;

    /* renamed from: b0, reason: collision with root package name */
    private static final Rect f36276b0 = new Rect();

    /* renamed from: c0, reason: collision with root package name */
    private static final int[] f36277c0 = {R.attr.state_selected};

    /* renamed from: d0, reason: collision with root package name */
    private static final int[] f36278d0 = {R.attr.state_checkable};

    /* renamed from: F, reason: collision with root package name */
    private com.google.android.material.chip.a f36279F;

    /* renamed from: G, reason: collision with root package name */
    private InsetDrawable f36280G;

    /* renamed from: H, reason: collision with root package name */
    private RippleDrawable f36281H;

    /* renamed from: I, reason: collision with root package name */
    private View.OnClickListener f36282I;

    /* renamed from: J, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f36283J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f36284K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f36285L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f36286M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f36287N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f36288O;

    /* renamed from: P, reason: collision with root package name */
    private int f36289P;

    /* renamed from: Q, reason: collision with root package name */
    private int f36290Q;

    /* renamed from: R, reason: collision with root package name */
    private CharSequence f36291R;

    /* renamed from: S, reason: collision with root package name */
    private final c f36292S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f36293T;

    /* renamed from: U, reason: collision with root package name */
    private final Rect f36294U;

    /* renamed from: V, reason: collision with root package name */
    private final RectF f36295V;

    /* renamed from: W, reason: collision with root package name */
    private final f f36296W;

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f36279F != null) {
                Chip.this.f36279F.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends AbstractC5165a {
        c(Chip chip) {
            super(chip);
        }

        @Override // z1.AbstractC5165a
        protected int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // z1.AbstractC5165a
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f36282I != null) {
                list.add(1);
            }
        }

        @Override // z1.AbstractC5165a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // z1.AbstractC5165a
        protected void M(t tVar) {
            tVar.f0(Chip.this.r());
            tVar.i0(Chip.this.isClickable());
            tVar.h0(Chip.this.getAccessibilityClassName());
            tVar.P0(Chip.this.getText());
        }

        @Override // z1.AbstractC5165a
        protected void N(int i10, t tVar) {
            if (i10 != 1) {
                tVar.l0("");
                tVar.d0(Chip.f36276b0);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                tVar.l0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                tVar.l0(Chip.this.getContext().getString(k.f2545n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            tVar.d0(Chip.this.getCloseIconTouchBoundsInt());
            tVar.b(t.a.f49782i);
            tVar.p0(Chip.this.isEnabled());
        }

        @Override // z1.AbstractC5165a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f36287N = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2317h);
    }

    private void A() {
        this.f36281H = new RippleDrawable(V7.b.d(this.f36279F.j1()), getBackgroundDrawable(), null);
        this.f36279F.P2(false);
        X.r0(this, this.f36281H);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f36279F) == null) {
            return;
        }
        int iN0 = (int) (aVar.N0() + this.f36279F.n1() + this.f36279F.u0());
        int iS0 = (int) (this.f36279F.S0() + this.f36279F.o1() + this.f36279F.q0());
        if (this.f36280G != null) {
            Rect rect = new Rect();
            this.f36280G.getPadding(rect);
            iS0 += rect.left;
            iN0 += rect.right;
        }
        X.C0(this, iS0, getPaddingTop(), iN0, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f36296W);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f36295V.setEmpty();
        if (n() && this.f36282I != null) {
            this.f36279F.c1(this.f36295V);
        }
        return this.f36295V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f36294U.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f36294U;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.t2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f36287N) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f36286M) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f36285L) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f36287N) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f36286M) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f36285L) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f36280G && this.f36279F.getCallback() == null) {
            this.f36279F.setCallback(this.f36280G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f36279F;
        return (aVar == null || aVar.V0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = r.i(context, attributeSet, m.f2863b1, i10, f36275a0, new int[0]);
        this.f36288O = typedArrayI.getBoolean(m.f2662H1, false);
        this.f36290Q = (int) Math.ceil(typedArrayI.getDimension(m.f3083v1, (float) Math.ceil(u.c(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f36280G = new InsetDrawable((Drawable) this.f36279F, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f36286M != z10) {
            this.f36286M = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f36285L != z10) {
            this.f36285L = z10;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f36283J;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    private void v() {
        if (this.f36280G != null) {
            this.f36280G = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.t2(null);
        }
    }

    private void y() {
        if (n() && s() && this.f36282I != null) {
            X.n0(this, this.f36292S);
            this.f36293T = true;
        } else {
            X.n0(this, null);
            this.f36293T = false;
        }
    }

    private void z() {
        if (V7.b.f18152a) {
            A();
            return;
        }
        this.f36279F.P2(true);
        X.r0(this, getBackgroundDrawable());
        B();
        m();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0464a
    public void a() {
        l(this.f36290Q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f36293T ? super.dispatchHoverEvent(motionEvent) : this.f36292S.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f36293T) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f36292S.w(keyEvent) || this.f36292S.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f36279F;
        if ((aVar == null || !aVar.t1()) ? false : this.f36279F.p2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f36291R)) {
            return this.f36291R;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof com.google.android.material.chip.b) && ((com.google.android.material.chip.b) parent).f()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f36280G;
        return insetDrawable == null ? this.f36279F : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return Math.max(0.0f, aVar.M0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f36279F;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f36293T && (this.f36292S.A() == 1 || this.f36292S.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public X7.k getShapeAppearanceModel() {
        return this.f36279F.E();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            return aVar.o1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f36290Q = i10;
        if (!w()) {
            if (this.f36280G != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f36279F.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f36279F.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f36280G != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f36280G != null) {
            Rect rect = new Rect();
            this.f36280G.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        X7.h.f(this, this.f36279F);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36277c0);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36278d0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f36293T) {
            this.f36292S.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof com.google.android.material.chip.b) {
            com.google.android.material.chip.b bVar = (com.google.android.material.chip.b) getParent();
            t.Y0(accessibilityNodeInfo).k0(t.f.a(bVar.b(this), 1, bVar.c() ? bVar.d(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f36289P != i10) {
            this.f36289P = i10;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f36285L
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f36285L
            if (r0 == 0) goto L35
            r5.u()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f36279F;
        return aVar != null && aVar.s1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f36279F;
        return aVar != null && aVar.u1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f36291R = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36281H) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36281H) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.B1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar == null) {
            this.f36284K = z10;
        } else if (aVar.s1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.D1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.F1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.J1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.L1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f36279F;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f36279F = aVar;
            aVar.E2(false);
            j(this.f36279F);
            l(this.f36290Q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.N1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.P1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.R1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.Z1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.b2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.g2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.h2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.i2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.k2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.l2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.n2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.a0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f36279F == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.u2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f36288O = z10;
        l(this.f36290Q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.v2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.x2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.z2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f36279F == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f36283J = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f36282I = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.C2(colorStateList);
        }
        if (this.f36279F.q1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.D2(i10);
            if (this.f36279F.q1()) {
                return;
            }
            A();
        }
    }

    @Override // X7.n
    public void setShapeAppearanceModel(X7.k kVar) {
        this.f36279F.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.F2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.Q2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f36279F;
        if (aVar2 != null) {
            aVar2.H2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.I2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.K2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.L2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.M2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.N2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.O2(i10);
        }
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f36282I;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f36293T) {
            this.f36292S.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.f36288O;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36275a0;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f36294U = new Rect();
        this.f36295V = new RectF();
        this.f36296W = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarZ0 = com.google.android.material.chip.a.z0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarZ0);
        aVarZ0.a0(X.u(this));
        TypedArray typedArrayI = r.i(context2, attributeSet, m.f2863b1, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(m.f2712M1);
        typedArrayI.recycle();
        this.f36292S = new c(this);
        y();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f36284K);
        setText(aVarZ0.l1());
        setEllipsize(aVarZ0.f1());
        C();
        if (!this.f36279F.Q2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f36290Q);
        }
        this.f36289P = X.z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: J7.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                this.f7639a.t(compoundButton, z10);
            }
        });
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.s2(z10);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.I1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.W1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.J2(i10);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f36279F;
        if (aVar != null) {
            aVar.J2(i10);
        }
        C();
    }

    class a extends f {
        a() {
        }

        @Override // U7.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f36279F.Q2() ? Chip.this.f36279F.l1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // U7.f
        public void a(int i10) {
        }
    }

    public void setInternalOnCheckedChangeListener(j<Chip> jVar) {
    }
}
