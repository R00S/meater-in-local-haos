package B9;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PreDrawListener.java */
/* loaded from: classes2.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: B, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler f1933B = new Handler(Looper.getMainLooper());

    /* renamed from: C, reason: collision with root package name */
    private final AtomicReference<View> f1934C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f1935D;

    /* renamed from: E, reason: collision with root package name */
    private final Runnable f1936E;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f1934C = new AtomicReference<>(view);
        this.f1935D = runnable;
        this.f1936E = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f1934C.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f1933B.post(this.f1935D);
        this.f1933B.postAtFrontOfQueue(this.f1936E);
        return true;
    }
}
