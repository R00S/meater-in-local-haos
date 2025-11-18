package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.C8032j;
import com.google.android.material.theme.p178a.C8079a;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8901h;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC8907n {

    /* renamed from: o */
    private static final int[] f29933o = {R.attr.state_checkable};

    /* renamed from: p */
    private static final int[] f29934p = {R.attr.state_checked};

    /* renamed from: q */
    private static final int[] f29935q = {C8908b.f33804E};

    /* renamed from: r */
    private static final int f29936r = C8917k.f33992q;

    /* renamed from: s */
    private final C7976a f29937s;

    /* renamed from: t */
    private boolean f29938t;

    /* renamed from: u */
    private boolean f29939u;

    /* renamed from: v */
    private boolean f29940v;

    /* renamed from: w */
    private InterfaceC7975a f29941w;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC7975a {
        /* renamed from: a */
        void m24069a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33833w);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f29937s.m24109k().getBounds());
        return rectF;
    }

    /* renamed from: h */
    private void m24065h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f29937s.m24108j();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f29937s.m24110l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f29937s.m24111m();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f29937s.m24112n();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f29937s.m24113o();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f29937s.m24121y().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f29937s.m24121y().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f29937s.m24121y().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f29937s.m24121y().top;
    }

    public float getProgress() {
        return this.f29937s.m24115s();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f29937s.m24114q();
    }

    public ColorStateList getRippleColor() {
        return this.f29937s.m24116t();
    }

    public C8904k getShapeAppearanceModel() {
        return this.f29937s.m24117u();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f29937s.m24118v();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f29937s.m24119w();
    }

    public int getStrokeWidth() {
        return this.f29937s.m24120x();
    }

    /* renamed from: i */
    public boolean m24066i() {
        C7976a c7976a = this.f29937s;
        return c7976a != null && c7976a.m24087B();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29939u;
    }

    /* renamed from: j */
    public boolean m24067j() {
        return this.f29940v;
    }

    /* renamed from: k */
    void m24068k(int i2, int i3, int i4, int i5) {
        super.m1254f(i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8901h.m28312f(this, this.f29937s.m24109k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (m24066i()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f29933o);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f29934p);
        }
        if (m24067j()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f29935q);
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
        accessibilityNodeInfo.setCheckable(m24066i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f29937s.m24089D(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f29938t) {
            if (!this.f29937s.m24086A()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f29937s.m24090E(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        this.f29937s.m24091F(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f29937s.m24105V();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f29937s.m24092G(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f29937s.m24093H(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f29939u != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f29937s.m24094I(drawable);
    }

    public void setCheckedIconResource(int i2) {
        this.f29937s.m24094I(C0833a.m5262d(getContext(), i2));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f29937s.m24095J(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f29937s.m24103T();
    }

    public void setDragged(boolean z) {
        if (this.f29940v != z) {
            this.f29940v = z;
            refreshDrawableState();
            m24065h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f29937s.m24106X();
    }

    public void setOnCheckedChangeListener(InterfaceC7975a interfaceC7975a) {
        this.f29941w = interfaceC7975a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f29937s.m24106X();
        this.f29937s.m24104U();
    }

    public void setProgress(float f2) {
        this.f29937s.m24097L(f2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f29937s.m24096K(f2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f29937s.m24098M(colorStateList);
    }

    public void setRippleColorResource(int i2) {
        this.f29937s.m24098M(C0833a.m5261c(getContext(), i2));
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n
    public void setShapeAppearanceModel(C8904k c8904k) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(c8904k.m28333u(getBoundsAsRectF()));
        }
        this.f29937s.m24099N(c8904k);
    }

    public void setStrokeColor(int i2) {
        this.f29937s.m24100O(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        this.f29937s.m24101P(i2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f29937s.m24106X();
        this.f29937s.m24104U();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m24066i() && isEnabled()) {
            this.f29939u = !this.f29939u;
            refreshDrawableState();
            m24065h();
            InterfaceC7975a interfaceC7975a = this.f29941w;
            if (interfaceC7975a != null) {
                interfaceC7975a.m24069a(this, this.f29939u);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f29936r;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f29939u = false;
        this.f29940v = false;
        this.f29938t = true;
        TypedArray typedArrayM24694h = C8032j.m24694h(getContext(), attributeSet, C8918l.f34248i3, i2, i3, new int[0]);
        C7976a c7976a = new C7976a(this, attributeSet, i2, i3);
        this.f29937s = c7976a;
        c7976a.m24091F(super.getCardBackgroundColor());
        c7976a.m24102Q(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c7976a.m24088C(typedArrayM24694h);
        typedArrayM24694h.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f29937s.m24091F(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f29937s.m24100O(colorStateList);
    }
}
