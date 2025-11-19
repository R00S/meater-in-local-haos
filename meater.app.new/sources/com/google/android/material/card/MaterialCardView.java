package com.google.android.material.card;

import C7.c;
import C7.l;
import C7.m;
import X7.h;
import X7.k;
import X7.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import b8.C2272a;
import com.google.android.material.internal.r;
import j.C3699a;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, n {

    /* renamed from: O, reason: collision with root package name */
    private static final int[] f36170O = {R.attr.state_checkable};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f36171P = {R.attr.state_checked};

    /* renamed from: Q, reason: collision with root package name */
    private static final int[] f36172Q = {c.f2306b0};

    /* renamed from: R, reason: collision with root package name */
    private static final int f36173R = l.f2584u;

    /* renamed from: K, reason: collision with root package name */
    private final b f36174K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f36175L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f36176M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f36177N;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f2279C);
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f36174K.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f36174K.l().getBounds());
        return rectF;
    }

    public boolean g() {
        b bVar = this.f36174K;
        return bVar != null && bVar.F();
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f36174K.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f36174K.n();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f36174K.o();
    }

    public int getCheckedIconGravity() {
        return this.f36174K.p();
    }

    public int getCheckedIconMargin() {
        return this.f36174K.q();
    }

    public int getCheckedIconSize() {
        return this.f36174K.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f36174K.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f36174K.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f36174K.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f36174K.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f36174K.C().top;
    }

    public float getProgress() {
        return this.f36174K.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f36174K.u();
    }

    public ColorStateList getRippleColor() {
        return this.f36174K.x();
    }

    public k getShapeAppearanceModel() {
        return this.f36174K.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f36174K.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f36174K.A();
    }

    public int getStrokeWidth() {
        return this.f36174K.B();
    }

    public boolean h() {
        return this.f36177N;
    }

    void i(int i10, int i11, int i12, int i13) {
        super.d(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f36176M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36174K.g0();
        h.f(this, this.f36174K.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36170O);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36171P);
        }
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36172Q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f36174K.K(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f36175L) {
            if (!this.f36174K.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f36174K.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f36174K.M(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f36174K.i0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f36174K.N(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f36174K.O(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f36176M != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f36174K.R(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f36174K.p() != i10) {
            this.f36174K.S(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f36174K.T(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f36174K.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f36174K.R(C3699a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f36174K.U(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f36174K.U(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f36174K.V(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f36174K;
        if (bVar != null) {
            bVar.g0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f36177N != z10) {
            this.f36177N = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f36174K.k0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f36174K.k0();
        this.f36174K.h0();
    }

    public void setProgress(float f10) {
        this.f36174K.X(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f36174K.W(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f36174K.Y(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f36174K.Y(C3699a.a(getContext(), i10));
    }

    @Override // X7.n
    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f36174K.Z(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f36174K.b0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f36174K.k0();
        this.f36174K.h0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.f36176M = !this.f36176M;
            refreshDrawableState();
            f();
            this.f36174K.Q(this.f36176M, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36173R;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f36176M = false;
        this.f36177N = false;
        this.f36175L = true;
        TypedArray typedArrayI = r.i(getContext(), attributeSet, m.f2998n4, i10, i11, new int[0]);
        b bVar = new b(this, attributeSet, i10, i11);
        this.f36174K = bVar;
        bVar.M(super.getCardBackgroundColor());
        bVar.c0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.J(typedArrayI);
        typedArrayI.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f36174K.M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f36174K.a0(colorStateList);
        invalidate();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
