package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: androidx.core.view.y */
/* loaded from: classes.dex */
public final class C0315y {

    /* renamed from: a */
    private WeakReference<View> f2429a;

    /* renamed from: b */
    Runnable f2430b = null;

    /* renamed from: c */
    Runnable f2431c = null;

    /* renamed from: d */
    int f2432d = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: androidx.core.view.y$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0316z f2433a;

        /* renamed from: b */
        final /* synthetic */ View f2434b;

        a(InterfaceC0316z interfaceC0316z, View view) {
            this.f2433a = interfaceC0316z;
            this.f2434b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2433a.onAnimationCancel(this.f2434b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2433a.onAnimationEnd(this.f2434b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2433a.onAnimationStart(this.f2434b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: androidx.core.view.y$b */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0283b0 f2436a;

        /* renamed from: b */
        final /* synthetic */ View f2437b;

        b(InterfaceC0283b0 interfaceC0283b0, View view) {
            this.f2436a = interfaceC0283b0;
            this.f2437b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2436a.mo451a(this.f2437b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: androidx.core.view.y$c */
    static class c implements InterfaceC0316z {

        /* renamed from: a */
        C0315y f2439a;

        /* renamed from: b */
        boolean f2440b;

        c(C0315y c0315y) {
            this.f2439a = c0315y;
        }

        @Override // androidx.core.view.InterfaceC0316z
        public void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC0316z interfaceC0316z = tag instanceof InterfaceC0316z ? (InterfaceC0316z) tag : null;
            if (interfaceC0316z != null) {
                interfaceC0316z.onAnimationCancel(view);
            }
        }

        @Override // androidx.core.view.InterfaceC0316z
        @SuppressLint({"WrongConstant"})
        public void onAnimationEnd(View view) {
            int i2 = this.f2439a.f2432d;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.f2439a.f2432d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f2440b) {
                C0315y c0315y = this.f2439a;
                Runnable runnable = c0315y.f2431c;
                if (runnable != null) {
                    c0315y.f2431c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC0316z interfaceC0316z = tag instanceof InterfaceC0316z ? (InterfaceC0316z) tag : null;
                if (interfaceC0316z != null) {
                    interfaceC0316z.onAnimationEnd(view);
                }
                this.f2440b = true;
            }
        }

        @Override // androidx.core.view.InterfaceC0316z
        public void onAnimationStart(View view) {
            this.f2440b = false;
            if (this.f2439a.f2432d > -1) {
                view.setLayerType(2, null);
            }
            C0315y c0315y = this.f2439a;
            Runnable runnable = c0315y.f2430b;
            if (runnable != null) {
                c0315y.f2430b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC0316z interfaceC0316z = tag instanceof InterfaceC0316z ? (InterfaceC0316z) tag : null;
            if (interfaceC0316z != null) {
                interfaceC0316z.onAnimationStart(view);
            }
        }
    }

    C0315y(View view) {
        this.f2429a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m2216g(View view, InterfaceC0316z interfaceC0316z) {
        if (interfaceC0316z != null) {
            view.animate().setListener(new a(interfaceC0316z, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0315y m2217a(float f2) {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    /* renamed from: b */
    public void m2218b() {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m2219c() {
        View view = this.f2429a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C0315y m2220d(long j2) {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    /* renamed from: e */
    public C0315y m2221e(Interpolator interpolator) {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C0315y m2222f(InterfaceC0316z interfaceC0316z) {
        View view = this.f2429a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m2216g(view, interfaceC0316z);
            } else {
                view.setTag(2113929216, interfaceC0316z);
                m2216g(view, new c(this));
            }
        }
        return this;
    }

    /* renamed from: h */
    public C0315y m2223h(long j2) {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    /* renamed from: i */
    public C0315y m2224i(InterfaceC0283b0 interfaceC0283b0) {
        View view = this.f2429a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC0283b0 != null ? new b(interfaceC0283b0, view) : null);
        }
        return this;
    }

    /* renamed from: j */
    public void m2225j() {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C0315y m2226k(float f2) {
        View view = this.f2429a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
