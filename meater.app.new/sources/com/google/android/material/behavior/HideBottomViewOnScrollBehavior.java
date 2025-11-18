package com.google.android.material.behavior;

import C7.c;
import R7.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: K, reason: collision with root package name */
    private static final int f35910K = c.f2282F;

    /* renamed from: L, reason: collision with root package name */
    private static final int f35911L = c.f2285I;

    /* renamed from: M, reason: collision with root package name */
    private static final int f35912M = c.f2292P;

    /* renamed from: B, reason: collision with root package name */
    private final LinkedHashSet<b> f35913B;

    /* renamed from: C, reason: collision with root package name */
    private int f35914C;

    /* renamed from: D, reason: collision with root package name */
    private int f35915D;

    /* renamed from: E, reason: collision with root package name */
    private TimeInterpolator f35916E;

    /* renamed from: F, reason: collision with root package name */
    private TimeInterpolator f35917F;

    /* renamed from: G, reason: collision with root package name */
    private int f35918G;

    /* renamed from: H, reason: collision with root package name */
    private int f35919H;

    /* renamed from: I, reason: collision with root package name */
    private int f35920I;

    /* renamed from: J, reason: collision with root package name */
    private ViewPropertyAnimator f35921J;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f35921J = null;
        }
    }

    public interface b {
        void a(View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f35913B = new LinkedHashSet<>();
        this.f35918G = 0;
        this.f35919H = 2;
        this.f35920I = 0;
    }

    private void J(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f35921J = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void R(V v10, int i10) {
        this.f35919H = i10;
        Iterator<b> it = this.f35913B.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f35919H);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public boolean K() {
        return this.f35919H == 1;
    }

    public boolean L() {
        return this.f35919H == 2;
    }

    public void M(V v10, int i10) {
        this.f35920I = i10;
        if (this.f35919H == 1) {
            v10.setTranslationY(this.f35918G + i10);
        }
    }

    public void N(V v10) {
        O(v10, true);
    }

    public void O(V v10, boolean z10) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f35921J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        R(v10, 1);
        int i10 = this.f35918G + this.f35920I;
        if (z10) {
            J(v10, i10, this.f35915D, this.f35917F);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void P(V v10) {
        Q(v10, true);
    }

    public void Q(V v10, boolean z10) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f35921J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        R(v10, 2);
        if (z10) {
            J(v10, 0, this.f35914C, this.f35916E);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f35918G = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f35914C = i.f(v10.getContext(), f35910K, 225);
        this.f35915D = i.f(v10.getContext(), f35911L, 175);
        Context context = v10.getContext();
        int i11 = f35912M;
        this.f35916E = i.g(context, i11, D7.a.f3489d);
        this.f35917F = i.g(v10.getContext(), i11, D7.a.f3488c);
        return super.p(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            N(v10);
        } else if (i11 < 0) {
            P(v10);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35913B = new LinkedHashSet<>();
        this.f35918G = 0;
        this.f35919H = 2;
        this.f35920I = 0;
    }
}
