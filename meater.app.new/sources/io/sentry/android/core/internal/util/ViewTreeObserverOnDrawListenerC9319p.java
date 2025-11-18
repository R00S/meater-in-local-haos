package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.C9344s0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirstDrawDoneListener.java */
@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: io.sentry.android.core.internal.util.p */
/* loaded from: classes2.dex */
public class ViewTreeObserverOnDrawListenerC9319p implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    private final Handler f36004a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final AtomicReference<View> f36005b;

    /* renamed from: c */
    private final Runnable f36006c;

    /* compiled from: FirstDrawDoneListener.java */
    /* renamed from: io.sentry.android.core.internal.util.p$a */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(ViewTreeObserverOnDrawListenerC9319p.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private ViewTreeObserverOnDrawListenerC9319p(View view, Runnable runnable) {
        this.f36005b = new AtomicReference<>(view);
        this.f36006c = runnable;
    }

    /* renamed from: a */
    private static boolean m30293a(View view, C9344s0 c9344s0) {
        return view.getViewTreeObserver().isAlive() && m30294b(view, c9344s0);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static boolean m30294b(View view, C9344s0 c9344s0) {
        return c9344s0.m30406d() >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30297d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m30296e(View view, Runnable runnable, C9344s0 c9344s0) {
        ViewTreeObserverOnDrawListenerC9319p viewTreeObserverOnDrawListenerC9319p = new ViewTreeObserverOnDrawListenerC9319p(view, runnable);
        if (c9344s0.m30406d() >= 26 || m30293a(view, c9344s0)) {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC9319p);
        } else {
            view.addOnAttachStateChangeListener(viewTreeObserverOnDrawListenerC9319p.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f36005b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f35981f.m30297d(andSet);
            }
        });
        this.f36004a.postAtFrontOfQueue(this.f36006c);
    }
}
