package B9;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirstDrawDoneListener.java */
/* loaded from: classes2.dex */
public class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: B, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler f1927B = new Handler(Looper.getMainLooper());

    /* renamed from: C, reason: collision with root package name */
    private final AtomicReference<View> f1928C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f1929D;

    private e(View view, Runnable runnable) {
        this.f1928C = new AtomicReference<>(view);
        this.f1929D = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void c(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new e(view, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f1928C.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: B9.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f1925B.b(andSet);
            }
        });
        this.f1927B.postAtFrontOfQueue(this.f1929D);
    }
}
