package com.google.android.material.bottomappbar;

import C7.l;
import R7.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.C3784a;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: U0, reason: collision with root package name */
    private static final int f35941U0 = l.f2582s;

    /* renamed from: V0, reason: collision with root package name */
    private static final int f35942V0 = C7.c.f2282F;

    /* renamed from: W0, reason: collision with root package name */
    private static final int f35943W0 = C7.c.f2292P;

    /* renamed from: A0, reason: collision with root package name */
    private Animator f35944A0;

    /* renamed from: B0, reason: collision with root package name */
    private Animator f35945B0;

    /* renamed from: C0, reason: collision with root package name */
    private int f35946C0;

    /* renamed from: D0, reason: collision with root package name */
    private int f35947D0;

    /* renamed from: E0, reason: collision with root package name */
    private int f35948E0;

    /* renamed from: F0, reason: collision with root package name */
    private final int f35949F0;

    /* renamed from: G0, reason: collision with root package name */
    private int f35950G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f35951H0;

    /* renamed from: I0, reason: collision with root package name */
    private final boolean f35952I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f35953J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f35954K0;

    /* renamed from: L0, reason: collision with root package name */
    private ArrayList<g> f35955L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f35956M0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f35957N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f35958O0;

    /* renamed from: P0, reason: collision with root package name */
    private Behavior f35959P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f35960Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f35961R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f35962S0;

    /* renamed from: T0, reason: collision with root package name */
    AnimatorListenerAdapter f35963T0;

    /* renamed from: y0, reason: collision with root package name */
    private Integer f35964y0;

    /* renamed from: z0, reason: collision with root package name */
    private final X7.g f35965z0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.v0();
            BottomAppBar.this.f35944A0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.w0();
        }
    }

    class b extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35972a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.v0();
            }
        }

        b(int i10) {
            this.f35972a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.A0(this.f35972a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.v0();
            BottomAppBar.this.f35957N0 = false;
            BottomAppBar.this.f35945B0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.w0();
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f35976a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f35977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35978c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f35979d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f35977b = actionMenuView;
            this.f35978c = i10;
            this.f35979d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35976a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f35976a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f35956M0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.G0(bottomAppBar.f35956M0);
            BottomAppBar.this.M0(this.f35977b, this.f35978c, this.f35979d, z10);
        }
    }

    class e implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f35981B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f35982C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f35983D;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f35981B = actionMenuView;
            this.f35982C = i10;
            this.f35983D = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35981B.setTranslationX(BottomAppBar.this.z0(r0, this.f35982C, this.f35983D));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f35963T0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonX0 = BottomAppBar.this.x0();
            if (floatingActionButtonX0 != null) {
                floatingActionButtonX0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class h extends AbstractC5121a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        int f35986D;

        /* renamed from: E, reason: collision with root package name */
        boolean f35987E;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f35986D);
            parcel.writeInt(this.f35987E ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35986D = parcel.readInt();
            this.f35987E = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float A0(int i10) {
        boolean zG = u.g(this);
        if (i10 != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((zG ? this.f35962S0 : this.f35961R0) + ((this.f35950G0 == -1 || y0() == null) ? this.f35949F0 : (r6.getMeasuredWidth() / 2) + this.f35950G0))) * (zG ? -1 : 1);
    }

    private boolean B0() {
        FloatingActionButton floatingActionButtonX0 = x0();
        return floatingActionButtonX0 != null && floatingActionButtonX0.p();
    }

    private void D0(int i10, boolean z10) {
        if (!X.R(this)) {
            this.f35957N0 = false;
            G0(this.f35956M0);
            return;
        }
        Animator animator = this.f35945B0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!B0()) {
            i10 = 0;
            z10 = false;
        }
        u0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f35945B0 = animatorSet;
        animatorSet.addListener(new c());
        this.f35945B0.start();
    }

    private void E0(int i10) {
        if (this.f35946C0 == i10 || !X.R(this)) {
            return;
        }
        Animator animator = this.f35944A0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f35947D0 == 1) {
            t0(i10, arrayList);
        } else {
            s0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(i.g(getContext(), f35943W0, D7.a.f3486a));
        this.f35944A0 = animatorSet;
        animatorSet.addListener(new a());
        this.f35944A0.start();
    }

    private Drawable F0(Drawable drawable) {
        if (drawable == null || this.f35964y0 == null) {
            return drawable;
        }
        Drawable drawableR = C3784a.r(drawable.mutate());
        C3784a.n(drawableR, this.f35964y0.intValue());
        return drawableR;
    }

    private void H0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f35945B0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (B0()) {
            L0(actionMenuView, this.f35946C0, this.f35958O0);
        } else {
            L0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        this.f35965z0.c0((this.f35958O0 && B0() && this.f35948E0 == 1) ? 1.0f : 0.0f);
        View viewY0 = y0();
        if (viewY0 != null) {
            viewY0.setTranslationY(getFabTranslationY());
            viewY0.setTranslationX(getFabTranslationX());
        }
    }

    private void L0(ActionMenuView actionMenuView, int i10, boolean z10) {
        M0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f24690d = 17;
        int i10 = bottomAppBar.f35948E0;
        if (i10 == 1) {
            fVar.f24690d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f24690d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f35960Q0;
    }

    private int getFabAlignmentAnimationDuration() {
        return i.f(getContext(), f35942V0, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return A0(this.f35946C0);
    }

    private float getFabTranslationY() {
        if (this.f35948E0 == 1) {
            return -getTopEdgeTreatment().d();
        }
        return y0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f35962S0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f35961R0;
    }

    private com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f35965z0.E().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f35963T0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void r0() {
        Animator animator = this.f35945B0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f35944A0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void t0(int i10, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(x0(), "translationX", A0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void u0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - z0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        ArrayList<g> arrayList;
        int i10 = this.f35954K0 - 1;
        this.f35954K0 = i10;
        if (i10 != 0 || (arrayList = this.f35955L0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        ArrayList<g> arrayList;
        int i10 = this.f35954K0;
        this.f35954K0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f35955L0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton x0() {
        View viewY0 = y0();
        if (viewY0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewY0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View y0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public void G0(int i10) {
        if (i10 != 0) {
            this.f35956M0 = 0;
            getMenu().clear();
            y(i10);
        }
    }

    public void J0(int i10, int i11) {
        this.f35956M0 = i11;
        this.f35957N0 = true;
        D0(i10, this.f35958O0);
        E0(i10);
        this.f35946C0 = i10;
    }

    boolean K0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().i()) {
            return false;
        }
        getTopEdgeTreatment().o(f10);
        this.f35965z0.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f35965z0.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.f35946C0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f35950G0;
    }

    public int getFabAnchorMode() {
        return this.f35948E0;
    }

    public int getFabAnimationMode() {
        return this.f35947D0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().h();
    }

    public boolean getHideOnScroll() {
        return this.f35953J0;
    }

    public int getMenuAlignmentMode() {
        return this.f35951H0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        X7.h.f(this, this.f35965z0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            r0();
            I0();
            final View viewY0 = y0();
            if (viewY0 != null && X.R(viewY0)) {
                viewY0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewY0.requestLayout();
                    }
                });
            }
        }
        H0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f35946C0 = hVar.f35986D;
        this.f35958O0 = hVar.f35987E;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f35986D = this.f35946C0;
        hVar.f35987E = this.f35958O0;
        return hVar;
    }

    protected void s0(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonX0 = x0();
        if (floatingActionButtonX0 == null || floatingActionButtonX0.o()) {
            return;
        }
        w0();
        floatingActionButtonX0.m(new b(i10));
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C3784a.o(this.f35965z0, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f10);
            this.f35965z0.invalidateSelf();
            I0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f35965z0.a0(f10);
        getBehavior().M(this, this.f35965z0.D() - this.f35965z0.C());
    }

    public void setFabAlignmentMode(int i10) {
        J0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f35950G0 != i10) {
            this.f35950G0 = i10;
            I0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f35948E0 = i10;
        I0();
        View viewY0 = y0();
        if (viewY0 != null) {
            N0(this, viewY0);
            viewY0.requestLayout();
            this.f35965z0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f35947D0 = i10;
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().l(f10);
            this.f35965z0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f10);
            this.f35965z0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f10);
            this.f35965z0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f35953J0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f35951H0 != i10) {
            this.f35951H0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                L0(actionMenuView, this.f35946C0, B0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(F0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f35964y0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    protected int z0(ActionMenuView actionMenuView, int i10, boolean z10) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f35951H0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zG = u.g(this);
        int measuredWidth = zG ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f20638a & 8388615) == 8388611) {
                measuredWidth = zG ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zG ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zG ? this.f35961R0 : -this.f35962S0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C7.e.f2427y);
            if (!zG) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f35959P0 == null) {
            this.f35959P0 = new Behavior();
        }
        return this.f35959P0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: N, reason: collision with root package name */
        private final Rect f35966N;

        /* renamed from: O, reason: collision with root package name */
        private WeakReference<BottomAppBar> f35967O;

        /* renamed from: P, reason: collision with root package name */
        private int f35968P;

        /* renamed from: Q, reason: collision with root package name */
        private final View.OnLayoutChangeListener f35969Q;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f35967O.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f35966N);
                    int iHeight = Behavior.this.f35966N.height();
                    bottomAppBar.K0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f35966N)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f35968P == 0) {
                    if (bottomAppBar.f35948E0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C7.e.f2382b0) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (u.g(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f35949F0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f35949F0;
                    }
                }
                bottomAppBar.I0();
            }
        }

        public Behavior() {
            this.f35969Q = new a();
            this.f35966N = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f35967O = new WeakReference<>(bottomAppBar);
            View viewY0 = bottomAppBar.y0();
            if (viewY0 != null && !X.R(viewY0)) {
                BottomAppBar.N0(bottomAppBar, viewY0);
                this.f35968P = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewY0.getLayoutParams())).bottomMargin;
                if (viewY0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewY0;
                    if (bottomAppBar.f35948E0 == 0 && bottomAppBar.f35952I0) {
                        X.v0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C7.b.f2274b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C7.b.f2273a);
                    }
                    bottomAppBar.q0(floatingActionButton);
                }
                viewY0.addOnLayoutChangeListener(this.f35969Q);
                bottomAppBar.I0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f35969Q = new a();
            this.f35966N = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
