package com.google.android.material.navigation;

import C7.f;
import C7.h;
import R7.i;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.f0;
import androidx.core.widget.j;
import g1.C3377a;
import k1.C3784a;
import s1.M;
import s1.X;
import t1.t;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes2.dex */
public abstract class a extends FrameLayout implements k.a {

    /* renamed from: k0, reason: collision with root package name */
    private static final int[] f36806k0 = {R.attr.state_checked};

    /* renamed from: l0, reason: collision with root package name */
    private static final d f36807l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final d f36808m0;

    /* renamed from: B, reason: collision with root package name */
    private boolean f36809B;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f36810C;

    /* renamed from: D, reason: collision with root package name */
    Drawable f36811D;

    /* renamed from: E, reason: collision with root package name */
    private int f36812E;

    /* renamed from: F, reason: collision with root package name */
    private int f36813F;

    /* renamed from: G, reason: collision with root package name */
    private int f36814G;

    /* renamed from: H, reason: collision with root package name */
    private float f36815H;

    /* renamed from: I, reason: collision with root package name */
    private float f36816I;

    /* renamed from: J, reason: collision with root package name */
    private float f36817J;

    /* renamed from: K, reason: collision with root package name */
    private int f36818K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f36819L;

    /* renamed from: M, reason: collision with root package name */
    private final FrameLayout f36820M;

    /* renamed from: N, reason: collision with root package name */
    private final View f36821N;

    /* renamed from: O, reason: collision with root package name */
    private final ImageView f36822O;

    /* renamed from: P, reason: collision with root package name */
    private final ViewGroup f36823P;

    /* renamed from: Q, reason: collision with root package name */
    private final TextView f36824Q;

    /* renamed from: R, reason: collision with root package name */
    private final TextView f36825R;

    /* renamed from: S, reason: collision with root package name */
    private int f36826S;

    /* renamed from: T, reason: collision with root package name */
    private int f36827T;

    /* renamed from: U, reason: collision with root package name */
    private g f36828U;

    /* renamed from: V, reason: collision with root package name */
    private ColorStateList f36829V;

    /* renamed from: W, reason: collision with root package name */
    private Drawable f36830W;

    /* renamed from: a0, reason: collision with root package name */
    private Drawable f36831a0;

    /* renamed from: b0, reason: collision with root package name */
    private ValueAnimator f36832b0;

    /* renamed from: c0, reason: collision with root package name */
    private d f36833c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f36834d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f36835e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f36836f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f36837g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f36838h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f36839i0;

    /* renamed from: j0, reason: collision with root package name */
    private E7.a f36840j0;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0471a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0471a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (a.this.f36822O.getVisibility() == 0) {
                a aVar = a.this;
                aVar.w(aVar.f36822O);
            }
        }
    }

    /* compiled from: NavigationBarItemView.java */
    class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f36842B;

        b(int i10) {
            this.f36842B = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.x(this.f36842B);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f36844a;

        c(float f10) {
            this.f36844a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f36844a);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    private static class d {
        private d() {
        }

        protected float a(float f10, float f11) {
            return D7.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10, float f11) {
            return D7.a.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10, float f11) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10, f11));
            view.setScaleY(c(f10, f11));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ d(ViewOnLayoutChangeListenerC0471a viewOnLayoutChangeListenerC0471a) {
            this();
        }
    }

    /* compiled from: NavigationBarItemView.java */
    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.a.d
        protected float c(float f10, float f11) {
            return b(f10, f11);
        }

        /* synthetic */ e(ViewOnLayoutChangeListenerC0471a viewOnLayoutChangeListenerC0471a) {
            this();
        }
    }

    static {
        ViewOnLayoutChangeListenerC0471a viewOnLayoutChangeListenerC0471a = null;
        f36807l0 = new d(viewOnLayoutChangeListenerC0471a);
        f36808m0 = new e(viewOnLayoutChangeListenerC0471a);
    }

    public a(Context context) {
        super(context);
        this.f36809B = false;
        this.f36826S = -1;
        this.f36827T = 0;
        this.f36833c0 = f36807l0;
        this.f36834d0 = 0.0f;
        this.f36835e0 = false;
        this.f36836f0 = 0;
        this.f36837g0 = 0;
        this.f36838h0 = false;
        this.f36839i0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f36820M = (FrameLayout) findViewById(C7.g.f2455L);
        this.f36821N = findViewById(C7.g.f2454K);
        ImageView imageView = (ImageView) findViewById(C7.g.f2456M);
        this.f36822O = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C7.g.f2457N);
        this.f36823P = viewGroup;
        TextView textView = (TextView) findViewById(C7.g.f2459P);
        this.f36824Q = textView;
        TextView textView2 = (TextView) findViewById(C7.g.f2458O);
        this.f36825R = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f36812E = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f36813F = viewGroup.getPaddingBottom();
        this.f36814G = getResources().getDimensionPixelSize(C7.e.f2357E);
        X.x0(textView, 2);
        X.x0(textView2, 2);
        setFocusable(true);
        g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0471a());
        }
    }

    private void g(float f10, float f11) {
        this.f36815H = f10 - f11;
        this.f36816I = (f11 * 1.0f) / f10;
        this.f36817J = (f10 * 1.0f) / f11;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f36820M;
        return frameLayout != null ? frameLayout : this.f36822O;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        E7.a aVar = this.f36840j0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f36840j0.l();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f36822O.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private static Drawable i(ColorStateList colorStateList) {
        return new RippleDrawable(V7.b.a(colorStateList), null, null);
    }

    private FrameLayout j(View view) {
        ImageView imageView = this.f36822O;
        if (view == imageView && E7.c.f4070a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean k() {
        return this.f36840j0 != null;
    }

    private boolean l() {
        return this.f36838h0 && this.f36818K == 2;
    }

    private void m(float f10) {
        if (!this.f36835e0 || !this.f36809B || !X.Q(this)) {
            q(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f36832b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36832b0 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36834d0, f10);
        this.f36832b0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f10));
        this.f36832b0.setInterpolator(i.g(getContext(), C7.c.f2292P, D7.a.f3487b));
        this.f36832b0.setDuration(i.f(getContext(), C7.c.f2282F, getResources().getInteger(h.f2501b)));
        this.f36832b0.start();
    }

    private void n() {
        g gVar = this.f36828U;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void o() {
        Drawable drawableI = this.f36811D;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f36810C != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f36835e0 && getActiveIndicatorDrawable() != null && this.f36820M != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(V7.b.d(this.f36810C), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableI == null) {
                drawableI = i(this.f36810C);
            }
        }
        FrameLayout frameLayout = this.f36820M;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f36820M.setForeground(rippleDrawable);
        }
        X.r0(this, drawableI);
        setDefaultFocusHighlightEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(float f10, float f11) {
        View view = this.f36821N;
        if (view != null) {
            this.f36833c0.d(f10, f11, view);
        }
        this.f36834d0 = f10;
    }

    private static void r(TextView textView, int i10) throws Resources.NotFoundException {
        j.q(textView, i10);
        int i11 = U7.c.i(textView.getContext(), i10, 0);
        if (i11 != 0) {
            textView.setTextSize(0, i11);
        }
    }

    private static void s(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private static void t(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private void u(View view) {
        if (k() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            E7.c.a(this.f36840j0, view, j(view));
        }
    }

    private void v(View view) {
        if (k()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                E7.c.d(this.f36840j0, view);
            }
            this.f36840j0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (k()) {
            E7.c.e(this.f36840j0, view, j(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i10) {
        if (this.f36821N == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.f36836f0, i10 - (this.f36839i0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36821N.getLayoutParams();
        layoutParams.height = l() ? iMin : this.f36837g0;
        layoutParams.width = iMin;
        this.f36821N.setLayoutParams(layoutParams);
    }

    private void y() {
        if (l()) {
            this.f36833c0 = f36808m0;
        } else {
            this.f36833c0 = f36807l0;
        }
    }

    private static void z(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f36820M;
        if (frameLayout != null && this.f36835e0) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f36828U = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        f0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f36809B = true;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f36821N;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public E7.a getBadge() {
        return this.f36840j0;
    }

    protected int getItemBackgroundResId() {
        return f.f2442l;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f36828U;
    }

    protected int getItemDefaultMarginResId() {
        return C7.e.f2416s0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f36826S;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36823P.getLayoutParams();
        return getSuggestedIconHeight() + (this.f36823P.getVisibility() == 0 ? this.f36814G : 0) + layoutParams.topMargin + this.f36823P.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36823P.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f36823P.getMeasuredWidth() + layoutParams.rightMargin);
    }

    void h() {
        p();
        this.f36828U = null;
        this.f36834d0 = 0.0f;
        this.f36809B = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f36828U;
        if (gVar != null && gVar.isCheckable() && this.f36828U.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36806k0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        E7.a aVar = this.f36840j0;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f36828U.getTitle();
            if (!TextUtils.isEmpty(this.f36828U.getContentDescription())) {
                title = this.f36828U.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f36840j0.i()));
        }
        t tVarY0 = t.Y0(accessibilityNodeInfo);
        tVarY0.k0(t.f.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            tVarY0.i0(false);
            tVarY0.Z(t.a.f49782i);
        }
        tVarY0.I0(getResources().getString(C7.k.f2539h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    void p() {
        v(this.f36822O);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f36821N;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        o();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f36835e0 = z10;
        o();
        View view = this.f36821N;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f36837g0 = i10;
        x(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f36814G != i10) {
            this.f36814G = i10;
            n();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f36839i0 = i10;
        x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f36838h0 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f36836f0 = i10;
        x(getWidth());
    }

    void setBadge(E7.a aVar) {
        if (this.f36840j0 == aVar) {
            return;
        }
        if (k() && this.f36822O != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            v(this.f36822O);
        }
        this.f36840j0 = aVar;
        ImageView imageView = this.f36822O;
        if (imageView != null) {
            u(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        this.f36825R.setPivotX(r0.getWidth() / 2);
        this.f36825R.setPivotY(r0.getBaseline());
        this.f36824Q.setPivotX(r0.getWidth() / 2);
        this.f36824Q.setPivotY(r0.getBaseline());
        m(z10 ? 1.0f : 0.0f);
        int i10 = this.f36818K;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    t(getIconOrContainer(), this.f36812E, 49);
                    z(this.f36823P, this.f36813F);
                    this.f36825R.setVisibility(0);
                } else {
                    t(getIconOrContainer(), this.f36812E, 17);
                    z(this.f36823P, 0);
                    this.f36825R.setVisibility(4);
                }
                this.f36824Q.setVisibility(4);
            } else if (i10 == 1) {
                z(this.f36823P, this.f36813F);
                if (z10) {
                    t(getIconOrContainer(), (int) (this.f36812E + this.f36815H), 49);
                    s(this.f36825R, 1.0f, 1.0f, 0);
                    TextView textView = this.f36824Q;
                    float f10 = this.f36816I;
                    s(textView, f10, f10, 4);
                } else {
                    t(getIconOrContainer(), this.f36812E, 49);
                    TextView textView2 = this.f36825R;
                    float f11 = this.f36817J;
                    s(textView2, f11, f11, 4);
                    s(this.f36824Q, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                t(getIconOrContainer(), this.f36812E, 17);
                this.f36825R.setVisibility(8);
                this.f36824Q.setVisibility(8);
            }
        } else if (this.f36819L) {
            if (z10) {
                t(getIconOrContainer(), this.f36812E, 49);
                z(this.f36823P, this.f36813F);
                this.f36825R.setVisibility(0);
            } else {
                t(getIconOrContainer(), this.f36812E, 17);
                z(this.f36823P, 0);
                this.f36825R.setVisibility(4);
            }
            this.f36824Q.setVisibility(4);
        } else {
            z(this.f36823P, this.f36813F);
            if (z10) {
                t(getIconOrContainer(), (int) (this.f36812E + this.f36815H), 49);
                s(this.f36825R, 1.0f, 1.0f, 0);
                TextView textView3 = this.f36824Q;
                float f12 = this.f36816I;
                s(textView3, f12, f12, 4);
            } else {
                t(getIconOrContainer(), this.f36812E, 49);
                TextView textView4 = this.f36825R;
                float f13 = this.f36817J;
                s(textView4, f13, f13, 4);
                s(this.f36824Q, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f36824Q.setEnabled(z10);
        this.f36825R.setEnabled(z10);
        this.f36822O.setEnabled(z10);
        if (z10) {
            X.D0(this, M.b(getContext(), 1002));
        } else {
            X.D0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f36830W) {
            return;
        }
        this.f36830W = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C3784a.r(drawable).mutate();
            this.f36831a0 = drawable;
            ColorStateList colorStateList = this.f36829V;
            if (colorStateList != null) {
                C3784a.o(drawable, colorStateList);
            }
        }
        this.f36822O.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36822O.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f36822O.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f36829V = colorStateList;
        if (this.f36828U == null || (drawable = this.f36831a0) == null) {
            return;
        }
        C3784a.o(drawable, colorStateList);
        this.f36831a0.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : C3377a.e(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f36813F != i10) {
            this.f36813F = i10;
            n();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f36812E != i10) {
            this.f36812E = i10;
            n();
        }
    }

    public void setItemPosition(int i10) {
        this.f36826S = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f36810C = colorStateList;
        o();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f36818K != i10) {
            this.f36818K = i10;
            y();
            x(getWidth());
            n();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f36819L != z10) {
            this.f36819L = z10;
            n();
        }
    }

    public void setTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f36827T = i10;
        r(this.f36825R, i10);
        g(this.f36824Q.getTextSize(), this.f36825R.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) throws Resources.NotFoundException {
        setTextAppearanceActive(this.f36827T);
        TextView textView = this.f36825R;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        r(this.f36824Q, i10);
        g(this.f36824Q.getTextSize(), this.f36825R.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f36824Q.setTextColor(colorStateList);
            this.f36825R.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f36824Q.setText(charSequence);
        this.f36825R.setText(charSequence);
        g gVar = this.f36828U;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.f36828U;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f36828U.getTooltipText();
        }
        f0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f36811D = drawable;
        o();
    }
}
