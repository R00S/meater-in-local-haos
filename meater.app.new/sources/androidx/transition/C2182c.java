package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2190k;

/* compiled from: Fade.java */
/* renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2182c extends N {

    /* compiled from: Fade.java */
    /* renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC2190k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f29480a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f29481b = false;

        a(View view) {
            this.f29480a = view;
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) {
            this.f29480a.setTag(C2187h.f29504d, Float.valueOf(this.f29480a.getVisibility() == 0 ? B.b(this.f29480a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) {
            this.f29480a.setTag(C2187h.f29504d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            B.e(this.f29480a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f29480a.hasOverlappingRendering() && this.f29480a.getLayerType() == 0) {
                this.f29481b = true;
                this.f29480a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f29481b) {
                this.f29480a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            B.e(this.f29480a, 1.0f);
            B.a(this.f29480a);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void l(AbstractC2190k abstractC2190k, boolean z10) {
        }
    }

    public C2182c(int i10) {
        E0(i10);
    }

    private Animator F0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        B.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, B.f29419b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        F().d(aVar);
        return objectAnimatorOfFloat;
    }

    private static float H0(x xVar, float f10) {
        Float f11;
        return (xVar == null || (f11 = (Float) xVar.f29591a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.N
    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        B.c(view);
        return F0(view, H0(xVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.N
    public Animator C0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        B.c(view);
        Animator animatorF0 = F0(view, H0(xVar, 1.0f), 0.0f);
        if (animatorF0 == null) {
            B.e(view, H0(xVar2, 1.0f));
        }
        return animatorF0;
    }

    @Override // androidx.transition.AbstractC2190k
    public boolean R() {
        return true;
    }

    @Override // androidx.transition.N, androidx.transition.AbstractC2190k
    public void n(x xVar) {
        super.n(xVar);
        Float fValueOf = (Float) xVar.f29592b.getTag(C2187h.f29504d);
        if (fValueOf == null) {
            fValueOf = xVar.f29592b.getVisibility() == 0 ? Float.valueOf(B.b(xVar.f29592b)) : Float.valueOf(0.0f);
        }
        xVar.f29591a.put("android:fade:transitionAlpha", fValueOf);
    }

    public C2182c() {
    }
}
