package R7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import d.C2998b;

/* compiled from: MaterialBottomContainerBackHelper.java */
/* loaded from: classes2.dex */
public class f extends R7.a<View> {

    /* renamed from: g, reason: collision with root package name */
    private final float f15074g;

    /* renamed from: h, reason: collision with root package name */
    private final float f15075h;

    /* compiled from: MaterialBottomContainerBackHelper.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f15062b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f15074g = resources.getDimension(C7.e.f2411q);
        this.f15075h = resources.getDimension(C7.e.f2413r);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f15062b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f15062b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f15062b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new M1.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f15065e);
        animatorG.start();
    }

    public void h(C2998b c2998b, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f15062b, (Property<V, Float>) View.TRANSLATION_Y, this.f15062b.getHeight() * this.f15062b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new M1.b());
        objectAnimatorOfFloat.setDuration(D7.a.c(this.f15063c, this.f15064d, c2998b.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(C2998b c2998b, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(D7.a.c(this.f15063c, this.f15064d, c2998b.getProgress()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(C2998b c2998b) {
        super.d(c2998b);
    }

    public void k(float f10) {
        float fA = a(f10);
        float width = this.f15062b.getWidth();
        float height = this.f15062b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f15074g / width;
        float f12 = this.f15075h / height;
        float fA2 = 1.0f - D7.a.a(0.0f, f11, fA);
        float fA3 = 1.0f - D7.a.a(0.0f, f12, fA);
        this.f15062b.setScaleX(fA2);
        this.f15062b.setPivotY(height);
        this.f15062b.setScaleY(fA3);
        V v10 = this.f15062b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA3 != 0.0f ? fA2 / fA3 : 1.0f);
            }
        }
    }

    public void l(C2998b c2998b) {
        if (super.e(c2998b) == null) {
            return;
        }
        k(c2998b.getProgress());
    }
}
