package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
class p {
    private static int a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.q0() : fragment.r0() : z10 ? fragment.a0() : fragment.d0();
    }

    @SuppressLint({"ResourceType"})
    static a b(Context context, Fragment fragment, boolean z10, boolean z11) throws Resources.NotFoundException {
        int iM0 = fragment.m0();
        int iA = a(fragment, z10, z11);
        fragment.j2(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f25488k0;
        if (viewGroup != null) {
            int i10 = I1.b.f6647c;
            if (viewGroup.getTag(i10) != null) {
                fragment.f25488k0.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f25488k0;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationB1 = fragment.b1(iM0, z10, iA);
        if (animationB1 != null) {
            return new a(animationB1);
        }
        Animator animatorC1 = fragment.c1(iM0, z10, iA);
        if (animatorC1 != null) {
            return new a(animatorC1);
        }
        if (iA == 0 && iM0 != 0) {
            iA = d(context, iM0, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (zEquals) {
                        throw e11;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? I1.a.f6643e : I1.a.f6644f;
        }
        if (i10 == 8194) {
            return z10 ? I1.a.f6639a : I1.a.f6640b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? I1.a.f6641c : I1.a.f6642d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* compiled from: FragmentAnim.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f25708a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f25709b;

        a(Animation animation) {
            this.f25708a = animation;
            this.f25709b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f25708a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f25709b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final ViewGroup f25710B;

        /* renamed from: C, reason: collision with root package name */
        private final View f25711C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f25712D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f25713E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f25714F;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f25714F = true;
            this.f25710B = viewGroup;
            this.f25711C = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f25714F = true;
            if (this.f25712D) {
                return !this.f25713E;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f25712D = true;
                s1.L.a(this.f25710B, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25712D || !this.f25714F) {
                this.f25710B.endViewTransition(this.f25711C);
                this.f25713E = true;
            } else {
                this.f25714F = false;
                this.f25710B.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f25714F = true;
            if (this.f25712D) {
                return !this.f25713E;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f25712D = true;
                s1.L.a(this.f25710B, this);
            }
            return true;
        }
    }
}
