package com.facebook.p157o0.p169u0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.p157o0.p160m0.p161n.C5872d;
import com.facebook.p157o0.p165q0.C5902g;
import com.facebook.p157o0.p169u0.ViewOnClickListenerC5940j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: ViewObserver.kt */
/* renamed from: com.facebook.o0.u0.i */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5939i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f */
    public static final a f15517f = new a(null);

    /* renamed from: g */
    private static final Map<Integer, ViewTreeObserverOnGlobalLayoutListenerC5939i> f15518g = new HashMap();

    /* renamed from: h */
    private final WeakReference<Activity> f15519h;

    /* renamed from: i */
    private final Handler f15520i;

    /* renamed from: j */
    private final AtomicBoolean f15521j;

    /* compiled from: ViewObserver.kt */
    /* renamed from: com.facebook.o0.u0.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final void m12817a(Activity activity) {
            C9801m.m32346f(activity, "activity");
            int iHashCode = activity.hashCode();
            Map map = ViewTreeObserverOnGlobalLayoutListenerC5939i.f15518g;
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object viewTreeObserverOnGlobalLayoutListenerC5939i = map.get(numValueOf);
            if (viewTreeObserverOnGlobalLayoutListenerC5939i == null) {
                viewTreeObserverOnGlobalLayoutListenerC5939i = new ViewTreeObserverOnGlobalLayoutListenerC5939i(activity, null);
                map.put(numValueOf, viewTreeObserverOnGlobalLayoutListenerC5939i);
            }
            ((ViewTreeObserverOnGlobalLayoutListenerC5939i) viewTreeObserverOnGlobalLayoutListenerC5939i).m12815g();
        }

        /* renamed from: b */
        public final void m12818b(Activity activity) {
            C9801m.m32346f(activity, "activity");
            ViewTreeObserverOnGlobalLayoutListenerC5939i viewTreeObserverOnGlobalLayoutListenerC5939i = (ViewTreeObserverOnGlobalLayoutListenerC5939i) ViewTreeObserverOnGlobalLayoutListenerC5939i.f15518g.remove(Integer.valueOf(activity.hashCode()));
            if (viewTreeObserverOnGlobalLayoutListenerC5939i == null) {
                return;
            }
            viewTreeObserverOnGlobalLayoutListenerC5939i.m12816h();
        }
    }

    private ViewTreeObserverOnGlobalLayoutListenerC5939i(Activity activity) {
        this.f15519h = new WeakReference<>(activity);
        this.f15520i = new Handler(Looper.getMainLooper());
        this.f15521j = new AtomicBoolean(false);
    }

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5939i(Activity activity, C9789g c9789g) {
        this(activity);
    }

    /* renamed from: e */
    private final void m12813e() {
        Runnable runnable = new Runnable() { // from class: com.facebook.o0.u0.b
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnGlobalLayoutListenerC5939i.m12814f(this.f15494f);
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f15520i.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12814f(ViewTreeObserverOnGlobalLayoutListenerC5939i viewTreeObserverOnGlobalLayoutListenerC5939i) {
        C9801m.m32346f(viewTreeObserverOnGlobalLayoutListenerC5939i, "this$0");
        try {
            C5902g c5902g = C5902g.f15370a;
            View viewM12628e = C5902g.m12628e(viewTreeObserverOnGlobalLayoutListenerC5939i.f15519h.get());
            Activity activity = viewTreeObserverOnGlobalLayoutListenerC5939i.f15519h.get();
            if (viewM12628e != null && activity != null) {
                C5937g c5937g = C5937g.f15511a;
                for (View view : C5937g.m12796a(viewM12628e)) {
                    C5872d c5872d = C5872d.f15253a;
                    if (!C5872d.m12463g(view)) {
                        C5937g c5937g2 = C5937g.f15511a;
                        String strM12799d = C5937g.m12799d(view);
                        if ((strM12799d.length() > 0) && strM12799d.length() <= 300) {
                            ViewOnClickListenerC5940j.a aVar = ViewOnClickListenerC5940j.f15522f;
                            String localClassName = activity.getLocalClassName();
                            C9801m.m32345e(localClassName, "activity.localClassName");
                            aVar.m12831c(view, viewM12628e, localClassName);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m12815g() {
        if (this.f15521j.getAndSet(true)) {
            return;
        }
        C5902g c5902g = C5902g.f15370a;
        View viewM12628e = C5902g.m12628e(this.f15519h.get());
        if (viewM12628e == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewM12628e.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
            m12813e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m12816h() {
        if (this.f15521j.getAndSet(false)) {
            C5902g c5902g = C5902g.f15370a;
            View viewM12628e = C5902g.m12628e(this.f15519h.get());
            if (viewM12628e == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewM12628e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m12813e();
    }
}
