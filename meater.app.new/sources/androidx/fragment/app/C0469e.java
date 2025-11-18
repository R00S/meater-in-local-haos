package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.C0273b;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0308r;
import androidx.fragment.app.C0486v;
import p024c.p067m.C0984a;
import p024c.p067m.C0985b;

/* compiled from: FragmentAnim.java */
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
class C0469e {

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$a */
    class a implements C0273b.a {

        /* renamed from: a */
        final /* synthetic */ Fragment f3264a;

        a(Fragment fragment) {
            this.f3264a = fragment;
        }

        @Override // androidx.core.os.C0273b.a
        public void onCancel() {
            if (this.f3264a.getAnimatingAway() != null) {
                View animatingAway = this.f3264a.getAnimatingAway();
                this.f3264a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f3264a.setAnimator(null);
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$b */
    class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3265a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3266b;

        /* renamed from: c */
        final /* synthetic */ C0486v.g f3267c;

        /* renamed from: d */
        final /* synthetic */ C0273b f3268d;

        /* compiled from: FragmentAnim.java */
        /* renamed from: androidx.fragment.app.e$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3266b.getAnimatingAway() != null) {
                    b.this.f3266b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f3267c.mo3522a(bVar.f3266b, bVar.f3268d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, C0486v.g gVar, C0273b c0273b) {
            this.f3265a = viewGroup;
            this.f3266b = fragment;
            this.f3267c = gVar;
            this.f3268d = c0273b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3265a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3270a;

        /* renamed from: b */
        final /* synthetic */ View f3271b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3272c;

        /* renamed from: d */
        final /* synthetic */ C0486v.g f3273d;

        /* renamed from: e */
        final /* synthetic */ C0273b f3274e;

        c(ViewGroup viewGroup, View view, Fragment fragment, C0486v.g gVar, C0273b c0273b) {
            this.f3270a = viewGroup;
            this.f3271b = view;
            this.f3272c = fragment;
            this.f3273d = gVar;
            this.f3274e = c0273b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3270a.endViewTransition(this.f3271b);
            Animator animator2 = this.f3272c.getAnimator();
            this.f3272c.setAnimator(null);
            if (animator2 == null || this.f3270a.indexOfChild(this.f3271b) >= 0) {
                return;
            }
            this.f3273d.mo3522a(this.f3272c, this.f3274e);
        }
    }

    /* renamed from: a */
    static void m3621a(Fragment fragment, d dVar, C0486v.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C0273b c0273b = new C0273b();
        c0273b.m1837c(new a(fragment));
        gVar.mo3523b(fragment, c0273b);
        if (dVar.f3275a != null) {
            e eVar = new e(dVar.f3275a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, c0273b));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3276b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, c0273b));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    static d m3622b(Context context, Fragment fragment, boolean z) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i2 = C0985b.f6508c;
            if (viewGroup.getTag(i2) != null) {
                fragment.mContainer.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (animationOnCreateAnimation != null) {
            return new d(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (animatorOnCreateAnimator != null) {
            return new d(animatorOnCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = m3623c(nextTransition, z);
        }
        if (nextAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m3623c(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? C0984a.f6504e : C0984a.f6505f;
        }
        if (i2 == 4099) {
            return z ? C0984a.f6502c : C0984a.f6503d;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? C0984a.f6500a : C0984a.f6501b;
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$d */
    static class d {

        /* renamed from: a */
        public final Animation f3275a;

        /* renamed from: b */
        public final Animator f3276b;

        d(Animation animation) {
            this.f3275a = animation;
            this.f3276b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f3275a = null;
            this.f3276b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$e */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f3277f;

        /* renamed from: g */
        private final View f3278g;

        /* renamed from: h */
        private boolean f3279h;

        /* renamed from: i */
        private boolean f3280i;

        /* renamed from: j */
        private boolean f3281j;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3281j = true;
            this.f3277f = viewGroup;
            this.f3278g = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f3281j = true;
            if (this.f3279h) {
                return !this.f3280i;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f3279h = true;
                ViewTreeObserverOnPreDrawListenerC0308r.m2080a(this.f3277f, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3279h || !this.f3281j) {
                this.f3277f.endViewTransition(this.f3278g);
                this.f3280i = true;
            } else {
                this.f3281j = false;
                this.f3277f.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f3281j = true;
            if (this.f3279h) {
                return !this.f3280i;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f3279h = true;
                ViewTreeObserverOnPreDrawListenerC0308r.m2080a(this.f3277f, this);
            }
            return true;
        }
    }
}
