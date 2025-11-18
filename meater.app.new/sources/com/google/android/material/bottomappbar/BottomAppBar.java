package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C8033k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8901h;
import p241e.p254e.p256b.p271c.p273m.InterfaceC8929k;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0225b {

    /* renamed from: U */
    private static final int f29729U = C8917k.f33990o;

    /* renamed from: V */
    private final int f29730V;

    /* renamed from: W */
    private final C8900g f29731W;

    /* renamed from: a0 */
    private Animator f29732a0;

    /* renamed from: b0 */
    private Animator f29733b0;

    /* renamed from: c0 */
    private int f29734c0;

    /* renamed from: d0 */
    private int f29735d0;

    /* renamed from: e0 */
    private boolean f29736e0;

    /* renamed from: f0 */
    private int f29737f0;

    /* renamed from: g0 */
    private ArrayList<InterfaceC7952f> f29738g0;

    /* renamed from: h0 */
    private boolean f29739h0;

    /* renamed from: i0 */
    private Behavior f29740i0;

    /* renamed from: j0 */
    private int f29741j0;

    /* renamed from: k0 */
    private int f29742k0;

    /* renamed from: l0 */
    private int f29743l0;

    /* renamed from: m0 */
    AnimatorListenerAdapter f29744m0;

    /* renamed from: n0 */
    InterfaceC8929k<FloatingActionButton> f29745n0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7946a();

        /* renamed from: h */
        int f29751h;

        /* renamed from: i */
        boolean f29752i;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        static class C7946a implements Parcelable.ClassLoaderCreator<SavedState> {
            C7946a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f29751h);
            parcel.writeInt(this.f29752i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29751h = parcel.readInt();
            this.f29752i = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C7947a extends AnimatorListenerAdapter {
        C7947a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m23894i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m23895j0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C7948b extends FloatingActionButton.AbstractC8012b {

        /* renamed from: a */
        final /* synthetic */ int f29754a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class a extends FloatingActionButton.AbstractC8012b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC8012b
            /* renamed from: b */
            public void mo23917b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m23894i0();
            }
        }

        C7948b(int i2) {
            this.f29754a = i2;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC8012b
        /* renamed from: a */
        public void mo23916a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m23898n0(this.f29754a));
            floatingActionButton.m24483s(new a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C7949c extends AnimatorListenerAdapter {
        C7949c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m23894i0();
            BottomAppBar.this.f29733b0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m23895j0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C7950d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f29758a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f29759b;

        /* renamed from: c */
        final /* synthetic */ int f29760c;

        /* renamed from: d */
        final /* synthetic */ boolean f29761d;

        C7950d(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f29759b = actionMenuView;
            this.f29760c = i2;
            this.f29761d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29758a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f29758a) {
                return;
            }
            BottomAppBar.this.m23904u0(this.f29759b, this.f29760c, this.f29761d);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C7951e extends AnimatorListenerAdapter {
        C7951e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f29744m0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonM23896k0 = BottomAppBar.this.m23896k0();
            if (floatingActionButtonM23896k0 != null) {
                floatingActionButtonM23896k0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    interface InterfaceC7952f {
        /* renamed from: a */
        void m23918a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m23919b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m23890d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m24474e(this.f29744m0);
        floatingActionButton.m24475f(new C7951e());
        floatingActionButton.m24476g(this.f29745n0);
    }

    /* renamed from: e0 */
    private void m23891e0() {
        Animator animator = this.f29733b0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f29732a0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: g0 */
    private void m23892g0(int i2, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m23896k0(), "translationX", m23898n0(i2));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f29741j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m23898n0(this.f29734c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m23921e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f29743l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f29742k0;
    }

    private C7953a getTopEdgeTreatment() {
        return (C7953a) this.f29731W.m28272D().m28328p();
    }

    /* renamed from: h0 */
    private void m23893h0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m23906m0(actionMenuView, i2, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.addListener(new C7950d(actionMenuView, i2, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m23894i0() {
        ArrayList<InterfaceC7952f> arrayList;
        int i2 = this.f29737f0 - 1;
        this.f29737f0 = i2;
        if (i2 != 0 || (arrayList = this.f29738g0) == null) {
            return;
        }
        Iterator<InterfaceC7952f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m23919b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m23895j0() {
        ArrayList<InterfaceC7952f> arrayList;
        int i2 = this.f29737f0;
        this.f29737f0 = i2 + 1;
        if (i2 != 0 || (arrayList = this.f29738g0) == null) {
            return;
        }
        Iterator<InterfaceC7952f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m23918a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public FloatingActionButton m23896k0() {
        View viewM23897l0 = m23897l0();
        if (viewM23897l0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewM23897l0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public View m23897l0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m1435s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public float m23898n0(int i2) {
        boolean zM24699d = C8033k.m24699d(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.f29730V + (zM24699d ? this.f29743l0 : this.f29742k0))) * (zM24699d ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: o0 */
    private boolean m23899o0() {
        FloatingActionButton floatingActionButtonM23896k0 = m23896k0();
        return floatingActionButtonM23896k0 != null && floatingActionButtonM23896k0.m24482o();
    }

    /* renamed from: p0 */
    private void m23900p0(int i2, boolean z) {
        if (C0311u.m2102O(this)) {
            Animator animator = this.f29733b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m23899o0()) {
                i2 = 0;
                z = false;
            }
            m23893h0(i2, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f29733b0 = animatorSet;
            animatorSet.addListener(new C7949c());
            this.f29733b0.start();
        }
    }

    /* renamed from: q0 */
    private void m23901q0(int i2) {
        if (this.f29734c0 == i2 || !C0311u.m2102O(this)) {
            return;
        }
        Animator animator = this.f29732a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f29735d0 == 1) {
            m23892g0(i2, arrayList);
        } else {
            m23905f0(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f29732a0 = animatorSet;
        animatorSet.addListener(new C7947a());
        this.f29732a0.start();
    }

    /* renamed from: r0 */
    private void m23902r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (m23899o0()) {
                m23904u0(actionMenuView, this.f29734c0, this.f29739h0);
            } else {
                m23904u0(actionMenuView, 0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public void m23903s0() {
        getTopEdgeTreatment().m23929m(getFabTranslationX());
        View viewM23897l0 = m23897l0();
        this.f29731W.m28285Y((this.f29739h0 && m23899o0()) ? 1.0f : 0.0f);
        if (viewM23897l0 != null) {
            viewM23897l0.setTranslationY(getFabTranslationY());
            viewM23897l0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public void m23904u0(ActionMenuView actionMenuView, int i2, boolean z) {
        actionMenuView.setTranslationX(m23906m0(actionMenuView, i2, z));
    }

    /* renamed from: f0 */
    protected void m23905f0(int i2, List<Animator> list) {
        FloatingActionButton floatingActionButtonM23896k0 = m23896k0();
        if (floatingActionButtonM23896k0 == null || floatingActionButtonM23896k0.m24481n()) {
            return;
        }
        m23895j0();
        floatingActionButtonM23896k0.m24479l(new C7948b(i2));
    }

    public ColorStateList getBackgroundTint() {
        return this.f29731W.m28273F();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m23921e();
    }

    public int getFabAlignmentMode() {
        return this.f29734c0;
    }

    public int getFabAnimationMode() {
        return this.f29735d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m23922f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m23923g();
    }

    public boolean getHideOnScroll() {
        return this.f29736e0;
    }

    /* renamed from: m0 */
    protected int m23906m0(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean zM24699d = C8033k.m24699d(this);
        int measuredWidth = zM24699d ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0149e) && (((Toolbar.C0149e) childAt.getLayoutParams()).f264a & 8388615) == 8388611) {
                measuredWidth = zM24699d ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zM24699d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zM24699d ? this.f29742k0 : -this.f29743l0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8901h.m28312f(this, this.f29731W);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws NoSuchFieldException {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            m23891e0();
            m23903s0();
        }
        m23902r0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        this.f29734c0 = savedState.f29751h;
        this.f29739h0 = savedState.f29752i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29751h = this.f29734c0;
        savedState.f29752i = this.f29739h0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0265a.m1818o(this.f29731W, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m23925i(f2);
            this.f29731W.invalidateSelf();
            m23903s0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.f29731W.m28283W(f2);
        getBehavior().m23860G(this, this.f29731W.m28271C() - this.f29731W.m28270B());
    }

    public void setFabAlignmentMode(int i2) {
        m23901q0(i2);
        m23900p0(i2, this.f29739h0);
        this.f29734c0 = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.f29735d0 = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().m23926j(f2);
            this.f29731W.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m23927k(f2);
            this.f29731W.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f29736e0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t0 */
    boolean m23907t0(int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().m23924h()) {
            return false;
        }
        getTopEdgeTreatment().m23928l(f2);
        this.f29731W.invalidateSelf();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0225b
    public Behavior getBehavior() {
        if (this.f29740i0 == null) {
            this.f29740i0 = new Behavior();
        }
        return this.f29740i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f29746e;

        /* renamed from: f */
        private WeakReference<BottomAppBar> f29747f;

        /* renamed from: g */
        private int f29748g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f29749h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class ViewOnLayoutChangeListenerC7945a implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC7945a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f29747f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.m24478j(Behavior.this.f29746e);
                int iHeight = Behavior.this.f29746e.height();
                bottomAppBar.m23907t0(iHeight);
                CoordinatorLayout.C0229f c0229f = (CoordinatorLayout.C0229f) view.getLayoutParams();
                if (Behavior.this.f29748g == 0) {
                    ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C8910d.f33887v) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) c0229f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0229f).rightMargin = bottomAppBar.getRightInset();
                    if (C8033k.m24699d(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) c0229f).leftMargin += bottomAppBar.f29730V;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0229f).rightMargin += bottomAppBar.f29730V;
                    }
                }
            }
        }

        public Behavior() {
            this.f29749h = new ViewOnLayoutChangeListenerC7945a();
            this.f29746e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo1458l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            this.f29747f = new WeakReference<>(bottomAppBar);
            View viewM23897l0 = bottomAppBar.m23897l0();
            if (viewM23897l0 != null && !C0311u.m2102O(viewM23897l0)) {
                CoordinatorLayout.C0229f c0229f = (CoordinatorLayout.C0229f) viewM23897l0.getLayoutParams();
                c0229f.f2006d = 49;
                this.f29748g = ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin;
                if (viewM23897l0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewM23897l0;
                    floatingActionButton.addOnLayoutChangeListener(this.f29749h);
                    bottomAppBar.m23890d0(floatingActionButton);
                }
                bottomAppBar.m23903s0();
            }
            coordinatorLayout.m1422I(bottomAppBar, i2);
            return super.mo1458l(coordinatorLayout, bottomAppBar, i2);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean mo1443A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.mo1443A(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29749h = new ViewOnLayoutChangeListenerC7945a();
            this.f29746e = new Rect();
        }
    }
}
