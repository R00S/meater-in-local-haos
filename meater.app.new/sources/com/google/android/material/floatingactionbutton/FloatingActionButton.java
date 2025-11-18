package com.google.android.material.floatingactionbutton;

import C7.e;
import C7.l;
import C7.m;
import D7.h;
import D7.k;
import X7.n;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C1987i;
import androidx.appcompat.widget.C1992n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b8.C2272a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import com.google.android.material.internal.v;
import java.util.List;
import k1.C3784a;
import r1.i;
import s1.X;

/* loaded from: classes2.dex */
public class FloatingActionButton extends v implements P7.a, n, CoordinatorLayout.b {

    /* renamed from: S, reason: collision with root package name */
    private static final int f36540S = l.f2574k;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f36541C;

    /* renamed from: D, reason: collision with root package name */
    private PorterDuff.Mode f36542D;

    /* renamed from: E, reason: collision with root package name */
    private ColorStateList f36543E;

    /* renamed from: F, reason: collision with root package name */
    private PorterDuff.Mode f36544F;

    /* renamed from: G, reason: collision with root package name */
    private ColorStateList f36545G;

    /* renamed from: H, reason: collision with root package name */
    private int f36546H;

    /* renamed from: I, reason: collision with root package name */
    private int f36547I;

    /* renamed from: J, reason: collision with root package name */
    private int f36548J;

    /* renamed from: K, reason: collision with root package name */
    private int f36549K;

    /* renamed from: L, reason: collision with root package name */
    private int f36550L;

    /* renamed from: M, reason: collision with root package name */
    boolean f36551M;

    /* renamed from: N, reason: collision with root package name */
    final Rect f36552N;

    /* renamed from: O, reason: collision with root package name */
    private final Rect f36553O;

    /* renamed from: P, reason: collision with root package name */
    private final C1992n f36554P;

    /* renamed from: Q, reason: collision with root package name */
    private final P7.b f36555Q;

    /* renamed from: R, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.b f36556R;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements b.k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f36560a;

        a(b bVar) {
            this.f36560a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.k
        public void a() {
            this.f36560a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.k
        public void b() {
            this.f36560a.a(FloatingActionButton.this);
        }
    }

    private class c implements W7.b {
        c() {
        }

        @Override // W7.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f36552N.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f36549K, i11 + FloatingActionButton.this.f36549K, i12 + FloatingActionButton.this.f36549K, i13 + FloatingActionButton.this.f36549K);
        }

        @Override // W7.b
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // W7.b
        public boolean d() {
            return FloatingActionButton.this.f36551M;
        }
    }

    class d<T extends FloatingActionButton> implements b.j {
        d(k<T> kVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2337v);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f36556R == null) {
            this.f36556R = h();
        }
        return this.f36556R;
    }

    private com.google.android.material.floatingactionbutton.b h() {
        return new com.google.android.material.floatingactionbutton.c(this, new c());
    }

    private int k(int i10) {
        int i11 = this.f36548J;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(e.f2397j) : resources.getDimensionPixelSize(e.f2395i) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private void l(Rect rect) {
        j(rect);
        int i10 = -this.f36556R.v();
        rect.inset(i10, i10);
    }

    private void q(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f36552N;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f36543E;
        if (colorStateList == null) {
            C3784a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f36544F;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1987i.e(colorForState, mode));
    }

    private b.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // P7.a
    public boolean a() {
        return this.f36555Q.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(k<? extends FloatingActionButton> kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f36541C;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f36542D;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f36548J;
    }

    public int getExpandedComponentIdHint() {
        return this.f36555Q.b();
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f36545G;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f36545G;
    }

    public X7.k getShapeAppearanceModel() {
        return (X7.k) i.g(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f36547I;
    }

    int getSizeDimension() {
        return k(this.f36547I);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f36543E;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f36544F;
    }

    public boolean getUseCompatPadding() {
        return this.f36551M;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!X.R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    void n(b bVar, boolean z10) {
        getImpl().w(u(bVar), z10);
    }

    public boolean o() {
        return getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f36549K = (sizeDimension - this.f36550L) / 2;
        getImpl().f0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f36552N;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Z7.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z7.a aVar = (Z7.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f36555Q.d((Bundle) i.g(aVar.f19601D.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        Z7.a aVar = new Z7.a(parcelableOnSaveInstanceState);
        aVar.f19601D.put("expandableWidgetHelper", this.f36555Q.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f36553O);
            if (!this.f36553O.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().z();
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f36541C != colorStateList) {
            this.f36541C = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f36542D != mode) {
            this.f36542D = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().N(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().U(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f36548J) {
            this.f36548J = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().g0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().O(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f36555Q.f(i10);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().P(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f36543E != null) {
                r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f36554P.i(i10);
        r();
    }

    public void setMaxImageSize(int i10) {
        this.f36550L = i10;
        getImpl().S(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().W(z10);
    }

    @Override // X7.n
    public void setShapeAppearanceModel(X7.k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().Y(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f36548J = 0;
        if (i10 != this.f36547I) {
            this.f36547I = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f36543E != colorStateList) {
            this.f36543E = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f36544F != mode) {
            this.f36544F = mode;
            r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f36551M != z10) {
            this.f36551M = z10;
            getImpl().C();
        }
    }

    @Override // com.google.android.material.internal.v, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    void t(b bVar, boolean z10) {
        getImpl().c0(u(bVar), z10);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: B, reason: collision with root package name */
        private Rect f36557B;

        /* renamed from: C, reason: collision with root package name */
        private b f36558C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f36559D;

        public BaseBehavior() {
            this.f36559D = true;
        }

        private static boolean J(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void K(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f36552N;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                X.Y(floatingActionButton, i10);
            }
            if (i11 != 0) {
                X.X(floatingActionButton, i11);
            }
        }

        private boolean N(View view, FloatingActionButton floatingActionButton) {
            return this.f36559D && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f36557B == null) {
                this.f36557B = new Rect();
            }
            Rect rect = this.f36557B;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.f36558C, false);
                return true;
            }
            floatingActionButton.t(this.f36558C, false);
            return true;
        }

        private boolean P(View view, FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.n(this.f36558C, false);
                return true;
            }
            floatingActionButton.t(this.f36558C, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f36552N;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!J(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f24694h == 0) {
                fVar.f24694h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f2653G2);
            this.f36559D = typedArrayObtainStyledAttributes.getBoolean(m.f2663H2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f36540S;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f36552N = new Rect();
        this.f36553O = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = r.i(context2, attributeSet, m.f3029q2, i10, i11, new int[0]);
        this.f36541C = U7.c.a(context2, typedArrayI, m.f3051s2);
        this.f36542D = u.i(typedArrayI.getInt(m.f3062t2, -1), null);
        this.f36545G = U7.c.a(context2, typedArrayI, m.f2623D2);
        this.f36547I = typedArrayI.getInt(m.f3114y2, -1);
        this.f36548J = typedArrayI.getDimensionPixelSize(m.f3104x2, 0);
        this.f36546H = typedArrayI.getDimensionPixelSize(m.f3073u2, 0);
        float dimension = typedArrayI.getDimension(m.f3084v2, 0.0f);
        float dimension2 = typedArrayI.getDimension(m.f2593A2, 0.0f);
        float dimension3 = typedArrayI.getDimension(m.f2613C2, 0.0f);
        this.f36551M = typedArrayI.getBoolean(m.f2643F2, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.f2410p0);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(m.f2603B2, 0));
        h hVarB = h.b(context2, typedArrayI, m.f2633E2);
        h hVarB2 = h.b(context2, typedArrayI, m.f3124z2);
        X7.k kVarM = X7.k.g(context2, attributeSet, i10, i11, X7.k.f18826m).m();
        boolean z10 = typedArrayI.getBoolean(m.f3094w2, false);
        setEnabled(typedArrayI.getBoolean(m.f3040r2, true));
        typedArrayI.recycle();
        C1992n c1992n = new C1992n(this);
        this.f36554P = c1992n;
        c1992n.g(attributeSet, i10);
        this.f36555Q = new P7.b(this);
        getImpl().X(kVarM);
        getImpl().x(this.f36541C, this.f36542D, this.f36545G, this.f36546H);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().Y(hVarB);
        getImpl().P(hVarB2);
        getImpl().O(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f36545G != colorStateList) {
            this.f36545G = colorStateList;
            getImpl().V(this.f36545G);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }
}
