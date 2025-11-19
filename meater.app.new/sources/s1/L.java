package s1;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: B, reason: collision with root package name */
    private final View f49063B;

    /* renamed from: C, reason: collision with root package name */
    private ViewTreeObserver f49064C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f49065D;

    private L(View view, Runnable runnable) {
        this.f49063B = view;
        this.f49064C = view.getViewTreeObserver();
        this.f49065D = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        L l10 = new L(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(l10);
        view.addOnAttachStateChangeListener(l10);
        return l10;
    }

    public void b() {
        if (this.f49064C.isAlive()) {
            this.f49064C.removeOnPreDrawListener(this);
        } else {
            this.f49063B.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f49063B.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f49065D.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f49064C = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
