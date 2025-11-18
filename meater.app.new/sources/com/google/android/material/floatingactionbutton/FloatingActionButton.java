package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0166h;
import androidx.appcompat.widget.C0174l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.InterfaceC0333n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C8016b;
import com.google.android.material.internal.C8024b;
import com.google.android.material.internal.C8032j;
import com.google.android.material.internal.C8033k;
import com.google.android.material.internal.C8034l;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.p178a.C8079a;
import java.util.List;
import p024c.p052i.p059j.C0959i;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n;
import p241e.p254e.p256b.p271c.p273m.C8926h;
import p241e.p254e.p256b.p271c.p273m.InterfaceC8929k;
import p241e.p254e.p256b.p271c.p282u.C8942b;
import p241e.p254e.p256b.p271c.p282u.InterfaceC8941a;
import p241e.p254e.p256b.p271c.p285x.C8947c;
import p241e.p254e.p256b.p271c.p287z.InterfaceC8954b;

/* loaded from: classes2.dex */
public class FloatingActionButton extends C8034l implements InterfaceC0310t, InterfaceC0333n, InterfaceC8941a, InterfaceC8907n, CoordinatorLayout.InterfaceC0225b {

    /* renamed from: g */
    private static final int f30207g = C8917k.f33986k;

    /* renamed from: h */
    private ColorStateList f30208h;

    /* renamed from: i */
    private PorterDuff.Mode f30209i;

    /* renamed from: j */
    private ColorStateList f30210j;

    /* renamed from: k */
    private PorterDuff.Mode f30211k;

    /* renamed from: l */
    private ColorStateList f30212l;

    /* renamed from: m */
    private int f30213m;

    /* renamed from: n */
    private int f30214n;

    /* renamed from: o */
    private int f30215o;

    /* renamed from: p */
    private int f30216p;

    /* renamed from: q */
    private int f30217q;

    /* renamed from: r */
    boolean f30218r;

    /* renamed from: s */
    final Rect f30219s;

    /* renamed from: t */
    private final Rect f30220t;

    /* renamed from: u */
    private final C0174l f30221u;

    /* renamed from: v */
    private final C8942b f30222v;

    /* renamed from: w */
    private C8016b f30223w;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo1448b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo1448b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo1454h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo1454h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo1458l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            return super.mo1458l(coordinatorLayout, floatingActionButton, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo1453g(CoordinatorLayout.C0229f c0229f) {
            super.mo1453g(c0229f);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C8011a implements C8016b.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC8012b f30227a;

        C8011a(AbstractC8012b abstractC8012b) {
            this.f30227a = abstractC8012b;
        }

        @Override // com.google.android.material.floatingactionbutton.C8016b.j
        /* renamed from: a */
        public void mo24493a() {
            this.f30227a.mo23917b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C8016b.j
        /* renamed from: b */
        public void mo24494b() {
            this.f30227a.mo23916a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class AbstractC8012b {
        /* renamed from: a */
        public void mo23916a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo23917b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C8013c implements InterfaceC8954b {
        C8013c() {
        }

        @Override // p241e.p254e.p256b.p271c.p287z.InterfaceC8954b
        /* renamed from: a */
        public void mo24495a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.f30219s.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.f30216p, i3 + FloatingActionButton.this.f30216p, i4 + FloatingActionButton.this.f30216p, i5 + FloatingActionButton.this.f30216p);
        }

        @Override // p241e.p254e.p256b.p271c.p287z.InterfaceC8954b
        /* renamed from: b */
        public void mo24496b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p241e.p254e.p256b.p271c.p287z.InterfaceC8954b
        /* renamed from: c */
        public boolean mo24497c() {
            return FloatingActionButton.this.f30218r;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C8014d<T extends FloatingActionButton> implements C8016b.i {

        /* renamed from: a */
        private final InterfaceC8929k<T> f30230a;

        C8014d(InterfaceC8929k<T> interfaceC8929k) {
            this.f30230a = interfaceC8929k;
        }

        @Override // com.google.android.material.floatingactionbutton.C8016b.i
        /* renamed from: a */
        public void mo24498a() {
            this.f30230a.m28458b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C8016b.i
        /* renamed from: b */
        public void mo24499b() {
            this.f30230a.m28457a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C8014d) && ((C8014d) obj).f30230a.equals(this.f30230a);
        }

        public int hashCode() {
            return this.f30230a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33829s);
    }

    private C8016b getImpl() {
        if (this.f30223w == null) {
            this.f30223w = m24467h();
        }
        return this.f30223w;
    }

    /* renamed from: h */
    private C8016b m24467h() {
        return Build.VERSION.SDK_INT >= 21 ? new C8017c(this, new C8013c()) : new C8016b(this, new C8013c());
    }

    /* renamed from: k */
    private int m24468k(int i2) {
        int i3 = this.f30215o;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        return i2 != -1 ? i2 != 1 ? resources.getDimensionPixelSize(C8910d.f33877l) : resources.getDimensionPixelSize(C8910d.f33876k) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m24468k(1) : m24468k(0);
    }

    /* renamed from: p */
    private void m24469p(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.f30219s;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m24470q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f30210j;
        if (colorStateList == null) {
            C0265a.m1806c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f30211k;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0166h.m1009e(colorForState, mode));
    }

    /* renamed from: r */
    private static int m24471r(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C8016b.j m24472u(AbstractC8012b abstractC8012b) {
        if (abstractC8012b == null) {
            return null;
        }
        return new C8011a(abstractC8012b);
    }

    @Override // p241e.p254e.p256b.p271c.p282u.InterfaceC8941a
    /* renamed from: a */
    public boolean mo24473a() {
        return this.f30222v.m28485c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo24521E(getDrawableState());
    }

    /* renamed from: e */
    public void m24474e(Animator.AnimatorListener animatorListener) {
        getImpl().m24545d(animatorListener);
    }

    /* renamed from: f */
    public void m24475f(Animator.AnimatorListener animatorListener) {
        getImpl().m24547e(animatorListener);
    }

    /* renamed from: g */
    public void m24476g(InterfaceC8929k<? extends FloatingActionButton> interfaceC8929k) {
        getImpl().m24549f(new C8014d(interfaceC8929k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f30208h;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f30209i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0225b
    public CoordinatorLayout.AbstractC0226c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo24554n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m24557q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m24559t();
    }

    public Drawable getContentBackground() {
        return getImpl().m24553k();
    }

    public int getCustomSize() {
        return this.f30215o;
    }

    public int getExpandedComponentIdHint() {
        return this.f30222v.m28484b();
    }

    public C8926h getHideMotionSpec() {
        return getImpl().m24556p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f30212l;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f30212l;
    }

    public C8904k getShapeAppearanceModel() {
        return (C8904k) C0959i.m6065c(getImpl().m24560u());
    }

    public C8926h getShowMotionSpec() {
        return getImpl().m24561v();
    }

    public int getSize() {
        return this.f30214n;
    }

    int getSizeDimension() {
        return m24468k(this.f30214n);
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public ColorStateList getSupportImageTintList() {
        return this.f30210j;
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f30211k;
    }

    public boolean getUseCompatPadding() {
        return this.f30218r;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m24477i(Rect rect) {
        if (!C0311u.m2102O(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m24469p(rect);
        return true;
    }

    /* renamed from: j */
    public void m24478j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m24469p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo24517A();
    }

    /* renamed from: l */
    public void m24479l(AbstractC8012b abstractC8012b) {
        m24480m(abstractC8012b, true);
    }

    /* renamed from: m */
    void m24480m(AbstractC8012b abstractC8012b, boolean z) {
        getImpl().m24562w(m24472u(abstractC8012b), z);
    }

    /* renamed from: n */
    public boolean m24481n() {
        return getImpl().m24564y();
    }

    /* renamed from: o */
    public boolean m24482o() {
        return getImpl().m24565z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m24518B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m24520D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.f30216p = (sizeDimension - this.f30217q) / 2;
        getImpl().m24550f0();
        int iMin = Math.min(m24471r(sizeDimension, i2), m24471r(sizeDimension, i3));
        Rect rect = this.f30219s;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m2342a());
        this.f30222v.m28486d((Bundle) C0959i.m6065c(extendableSavedState.f30504h.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f30504h.put("expandableWidgetHelper", this.f30222v.m28487e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m24477i(this.f30220t) && !this.f30220t.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public void m24483s(AbstractC8012b abstractC8012b) {
        m24484t(abstractC8012b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f30208h != colorStateList) {
            this.f30208h = colorStateList;
            getImpl().m24528L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f30209i != mode) {
            this.f30209i = mode;
            getImpl().m24529M(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().m24530N(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().m24533Q(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().m24537U(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.f30215o) {
            this.f30215o = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().m24551g0(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m24555o()) {
            getImpl().m24531O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.f30222v.m28488f(i2);
    }

    public void setHideMotionSpec(C8926h c8926h) {
        getImpl().m24532P(c8926h);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(C8926h.m28442c(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m24548e0();
            if (this.f30210j != null) {
                m24470q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f30221u.m1065g(i2);
        m24470q();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().m24525I();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().m24525I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m24539W(z);
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n
    public void setShapeAppearanceModel(C8904k c8904k) {
        getImpl().m24540X(c8904k);
    }

    public void setShowMotionSpec(C8926h c8926h) {
        getImpl().m24541Y(c8926h);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(C8926h.m28442c(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f30215o = 0;
        if (i2 != this.f30214n) {
            this.f30214n = i2;
            requestLayout();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f30210j != colorStateList) {
            this.f30210j = colorStateList;
            m24470q();
        }
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f30211k != mode) {
            this.f30211k = mode;
            m24470q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().m24526J();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().m24526J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().m24526J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f30218r != z) {
            this.f30218r = z;
            getImpl().mo24519C();
        }
    }

    @Override // com.google.android.material.internal.C8034l, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    /* renamed from: t */
    void m24484t(AbstractC8012b abstractC8012b, boolean z) {
        getImpl().m24544c0(m24472u(abstractC8012b), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0226c<T> {

        /* renamed from: a */
        private Rect f30224a;

        /* renamed from: b */
        private AbstractC8012b f30225b;

        /* renamed from: c */
        private boolean f30226c;

        public BaseBehavior() {
            this.f30226c = true;
        }

        /* renamed from: F */
        private static boolean m24485F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0229f) {
                return ((CoordinatorLayout.C0229f) layoutParams).m1481f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m24486G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f30219s;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0229f c0229f = (CoordinatorLayout.C0229f) floatingActionButton.getLayoutParams();
            int i2 = 0;
            int i3 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0229f).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0229f).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C0311u.m2108U(floatingActionButton, i2);
            }
            if (i3 != 0) {
                C0311u.m2107T(floatingActionButton, i3);
            }
        }

        /* renamed from: J */
        private boolean m24487J(View view, FloatingActionButton floatingActionButton) {
            return this.f30226c && ((CoordinatorLayout.C0229f) floatingActionButton.getLayoutParams()).m1480e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m24488K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m24487J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f30224a == null) {
                this.f30224a = new Rect();
            }
            Rect rect = this.f30224a;
            C8024b.m24656a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m24480m(this.f30225b, false);
                return true;
            }
            floatingActionButton.m24484t(this.f30225b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m24489L(View view, FloatingActionButton floatingActionButton) {
            if (!m24487J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0229f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m24480m(this.f30225b, false);
                return true;
            }
            floatingActionButton.m24484t(this.f30225b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean mo1448b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f30219s;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean mo1454h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m24488K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m24485F(view)) {
                return false;
            }
            m24489L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo1458l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            List<View> listM1434r = coordinatorLayout.m1434r(floatingActionButton);
            int size = listM1434r.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listM1434r.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (m24485F(view) && m24489L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m24488K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1422I(floatingActionButton, i2);
            m24486G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: g */
        public void mo1453g(CoordinatorLayout.C0229f c0229f) {
            if (c0229f.f2010h == 0) {
                c0229f.f2010h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34170Y1);
            this.f30226c = typedArrayObtainStyledAttributes.getBoolean(C8918l.f34177Z1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int i3 = f30207g;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f30219s = new Rect();
        this.f30220t = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM24694h = C8032j.m24694h(context2, attributeSet, C8918l.f34058I1, i2, i3, new int[0]);
        this.f30208h = C8947c.m28499a(context2, typedArrayM24694h, C8918l.f34072K1);
        this.f30209i = C8033k.m24700e(typedArrayM24694h.getInt(C8918l.f34079L1, -1), null);
        this.f30212l = C8947c.m28499a(context2, typedArrayM24694h, C8918l.f34149V1);
        this.f30214n = typedArrayM24694h.getInt(C8918l.f34114Q1, -1);
        this.f30215o = typedArrayM24694h.getDimensionPixelSize(C8918l.f34107P1, 0);
        this.f30213m = typedArrayM24694h.getDimensionPixelSize(C8918l.f34086M1, 0);
        float dimension = typedArrayM24694h.getDimension(C8918l.f34093N1, 0.0f);
        float dimension2 = typedArrayM24694h.getDimension(C8918l.f34128S1, 0.0f);
        float dimension3 = typedArrayM24694h.getDimension(C8918l.f34142U1, 0.0f);
        this.f30218r = typedArrayM24694h.getBoolean(C8918l.f34163X1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C8910d.f33859M);
        this.f30217q = typedArrayM24694h.getDimensionPixelSize(C8918l.f34135T1, 0);
        C8926h c8926hM28441b = C8926h.m28441b(context2, typedArrayM24694h, C8918l.f34156W1);
        C8926h c8926hM28441b2 = C8926h.m28441b(context2, typedArrayM24694h, C8918l.f34121R1);
        C8904k c8904kM28355m = C8904k.m28319g(context2, attributeSet, i2, i3, C8904k.f33733a).m28355m();
        boolean z = typedArrayM24694h.getBoolean(C8918l.f34100O1, false);
        setEnabled(typedArrayM24694h.getBoolean(C8918l.f34065J1, true));
        typedArrayM24694h.recycle();
        C0174l c0174l = new C0174l(this);
        this.f30221u = c0174l;
        c0174l.m1064f(attributeSet, i2);
        this.f30222v = new C8942b(this);
        getImpl().m24540X(c8904kM28355m);
        getImpl().mo24563x(this.f30208h, this.f30209i, this.f30212l, this.f30213m);
        getImpl().m24536T(dimensionPixelSize);
        getImpl().m24530N(dimension);
        getImpl().m24533Q(dimension2);
        getImpl().m24537U(dimension3);
        getImpl().m24535S(this.f30217q);
        getImpl().m24541Y(c8926hM28441b);
        getImpl().m24532P(c8926hM28441b2);
        getImpl().m24531O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f30212l != colorStateList) {
            this.f30212l = colorStateList;
            getImpl().mo24538V(this.f30212l);
        }
    }
}
