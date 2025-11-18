package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p241e.p254e.p256b.p271c.p273m.C8920b;
import p241e.p254e.p256b.p271c.p273m.C8927i;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C8927i f30628c;

    /* renamed from: d */
    private final C8927i f30629d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C8087a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f30630a;

        /* renamed from: b */
        final /* synthetic */ View f30631b;

        C8087a(boolean z, View view) {
            this.f30630a = z;
            this.f30631b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f30630a) {
                return;
            }
            this.f30631b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f30630a) {
                this.f30631b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f30628c = new C8927i(75L, 150L);
        this.f30629d = new C8927i(0L, 150L);
    }

    /* renamed from: K */
    private void m24935K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        C8927i c8927i = z ? this.f30628c : this.f30629d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c8927i.m28451a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: D */
    public boolean mo1446D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo1446D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo24912J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m24935K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C8920b.m28431a(animatorSet, arrayList);
        animatorSet.addListener(new C8087a(z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: e */
    public boolean mo1451e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30628c = new C8927i(75L, 150L);
        this.f30629d = new C8927i(0L, 150L);
    }
}
