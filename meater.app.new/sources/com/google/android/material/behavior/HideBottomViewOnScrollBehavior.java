package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p241e.p254e.p256b.p271c.p273m.C8919a;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {

    /* renamed from: a */
    private int f29707a;

    /* renamed from: b */
    private int f29708b;

    /* renamed from: c */
    private int f29709c;

    /* renamed from: d */
    private ViewPropertyAnimator f29710d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C7940a extends AnimatorListenerAdapter {
        C7940a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f29710d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f29707a = 0;
        this.f29708b = 2;
        this.f29709c = 0;
    }

    /* renamed from: F */
    private void m23859F(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f29710d = v.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new C7940a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: A */
    public boolean mo1443A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    /* renamed from: G */
    public void m23860G(V v, int i2) {
        this.f29709c = i2;
        if (this.f29708b == 1) {
            v.setTranslationY(this.f29707a + i2);
        }
    }

    /* renamed from: H */
    public void m23861H(V v) {
        if (this.f29708b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f29710d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f29708b = 1;
        m23859F(v, this.f29707a + this.f29709c, 175L, C8919a.f34372c);
    }

    /* renamed from: I */
    public void m23862I(V v) {
        if (this.f29708b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f29710d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f29708b = 2;
        m23859F(v, 0, 225L, C8919a.f34373d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: l */
    public boolean mo1458l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.f29707a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo1458l(coordinatorLayout, v, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: t */
    public void mo1466t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            m23861H(v);
        } else if (i3 < 0) {
            m23862I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29707a = 0;
        this.f29708b = 2;
        this.f29709c = 0;
    }
}
