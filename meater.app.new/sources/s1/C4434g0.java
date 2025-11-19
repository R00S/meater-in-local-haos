package s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: s1.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4434g0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f49141a;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: s1.g0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4436h0 f49142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f49143b;

        a(InterfaceC4436h0 interfaceC4436h0, View view) {
            this.f49142a = interfaceC4436h0;
            this.f49143b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f49142a.a(this.f49143b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f49142a.b(this.f49143b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f49142a.c(this.f49143b);
        }
    }

    C4434g0(View view) {
        this.f49141a = new WeakReference<>(view);
    }

    private void i(View view, InterfaceC4436h0 interfaceC4436h0) {
        if (interfaceC4436h0 != null) {
            view.animate().setListener(new a(interfaceC4436h0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C4434g0 b(float f10) {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f49141a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C4434g0 f(long j10) {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C4434g0 g(Interpolator interpolator) {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C4434g0 h(InterfaceC4436h0 interfaceC4436h0) {
        View view = this.f49141a.get();
        if (view != null) {
            i(view, interfaceC4436h0);
        }
        return this;
    }

    public C4434g0 j(long j10) {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C4434g0 k(final InterfaceC4440j0 interfaceC4440j0) {
        final View view = this.f49141a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC4440j0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: s1.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC4440j0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C4434g0 m(float f10) {
        View view = this.f49141a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
