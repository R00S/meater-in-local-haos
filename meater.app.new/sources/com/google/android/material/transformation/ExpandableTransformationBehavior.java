package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f30607b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C8081a extends AnimatorListenerAdapter {
        C8081a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f30607b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    protected boolean mo24910H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f30607b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo24912J = mo24912J(view, view2, z, z3);
        this.f30607b = animatorSetMo24912J;
        animatorSetMo24912J.addListener(new C8081a());
        this.f30607b.start();
        if (!z2) {
            this.f30607b.end();
        }
        return true;
    }

    /* renamed from: J */
    protected abstract AnimatorSet mo24912J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
