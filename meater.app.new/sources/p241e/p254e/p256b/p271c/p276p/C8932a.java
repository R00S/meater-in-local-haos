package p241e.p254e.p256b.p271c.p276p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p241e.p254e.p256b.p271c.p276p.InterfaceC8935d;

/* compiled from: CircularRevealCompat.java */
/* renamed from: e.e.b.c.p.a */
/* loaded from: classes2.dex */
public final class C8932a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: e.e.b.c.p.a$a */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8935d f34397a;

        a(InterfaceC8935d interfaceC8935d) {
            this.f34397a = interfaceC8935d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34397a.mo28463b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f34397a.mo28462a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m28460a(InterfaceC8935d interfaceC8935d, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC8935d, (Property<InterfaceC8935d, V>) InterfaceC8935d.c.f34402a, (TypeEvaluator) InterfaceC8935d.b.f34400a, (Object[]) new InterfaceC8935d.e[]{new InterfaceC8935d.e(f2, f3, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        InterfaceC8935d.e revealInfo = interfaceC8935d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC8935d, (int) f2, (int) f3, revealInfo.f34406c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m28461b(InterfaceC8935d interfaceC8935d) {
        return new a(interfaceC8935d);
    }
}
