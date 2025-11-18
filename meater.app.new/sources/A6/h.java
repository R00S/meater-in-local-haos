package A6;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.t;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes2.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    final Set<Activity> f909a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f910b;

    /* compiled from: FirstFrameWaiter.java */
    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f911B;

        /* compiled from: FirstFrameWaiter.java */
        /* renamed from: A6.h$a$a, reason: collision with other inner class name */
        class RunnableC0017a implements Runnable {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f913B;

            RunnableC0017a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f913B = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.b().h();
                h.this.f910b = true;
                h.b(a.this.f911B, this.f913B);
                h.this.f909a.clear();
            }
        }

        a(View view) {
            this.f911B = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            H6.l.u(new RunnableC0017a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // A6.i
    public void a(Activity activity) {
        if (!this.f910b && this.f909a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
