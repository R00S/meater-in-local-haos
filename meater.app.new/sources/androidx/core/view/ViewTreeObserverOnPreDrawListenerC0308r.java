package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* renamed from: androidx.core.view.r */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0308r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f2399f;

    /* renamed from: g */
    private ViewTreeObserver f2400g;

    /* renamed from: h */
    private final Runnable f2401h;

    private ViewTreeObserverOnPreDrawListenerC0308r(View view, Runnable runnable) {
        this.f2399f = view;
        this.f2400g = view.getViewTreeObserver();
        this.f2401h = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0308r m2080a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0308r viewTreeObserverOnPreDrawListenerC0308r = new ViewTreeObserverOnPreDrawListenerC0308r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0308r);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0308r);
        return viewTreeObserverOnPreDrawListenerC0308r;
    }

    /* renamed from: b */
    public void m2081b() {
        if (this.f2400g.isAlive()) {
            this.f2400g.removeOnPreDrawListener(this);
        } else {
            this.f2399f.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2399f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2081b();
        this.f2401h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2400g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2081b();
    }
}
