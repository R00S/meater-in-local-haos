package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.C9344s0;
import io.sentry.util.C9646q;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryFrameMetricsCollector.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.t */
/* loaded from: classes2.dex */
public final class C9323t implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final C9344s0 f36015f;

    /* renamed from: g */
    private final Set<Window> f36016g;

    /* renamed from: h */
    private final InterfaceC9670w1 f36017h;

    /* renamed from: i */
    private Handler f36018i;

    /* renamed from: j */
    private WeakReference<Window> f36019j;

    /* renamed from: k */
    private final Map<String, b> f36020k;

    /* renamed from: l */
    private boolean f36021l;

    /* renamed from: m */
    private final c f36022m;

    /* renamed from: n */
    private Window.OnFrameMetricsAvailableListener f36023n;

    /* renamed from: o */
    private Choreographer f36024o;

    /* renamed from: p */
    private Field f36025p;

    /* renamed from: q */
    private long f36026q;

    /* renamed from: r */
    private long f36027r;

    /* compiled from: SentryFrameMetricsCollector.java */
    /* renamed from: io.sentry.android.core.internal.util.t$a */
    class a implements c {
        a() {
        }

        @Override // io.sentry.android.core.internal.util.C9323t.c
        /* renamed from: a */
        public /* synthetic */ void mo30320a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            C9324u.m30323a(this, window, onFrameMetricsAvailableListener, handler);
        }

        @Override // io.sentry.android.core.internal.util.C9323t.c
        /* renamed from: b */
        public /* synthetic */ void mo30321b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            C9324u.m30324b(this, window, onFrameMetricsAvailableListener);
        }
    }

    /* compiled from: SentryFrameMetricsCollector.java */
    @ApiStatus.Internal
    /* renamed from: io.sentry.android.core.internal.util.t$b */
    public interface b {
        /* renamed from: a */
        void mo30322a(long j2, long j3, float f2);
    }

    /* compiled from: SentryFrameMetricsCollector.java */
    @ApiStatus.Internal
    /* renamed from: io.sentry.android.core.internal.util.t$c */
    public interface c {
        /* renamed from: a */
        void mo30320a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler);

        /* renamed from: b */
        void mo30321b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener);
    }

    @SuppressLint({"NewApi"})
    public C9323t(Context context, C9680x4 c9680x4, C9344s0 c9344s0) {
        this(context, c9680x4, c9344s0, new a());
    }

    /* renamed from: a */
    private long m30308a(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private long m30309b(FrameMetrics frameMetrics) {
        Field field;
        if (this.f36015f.m30406d() >= 26) {
            return frameMetrics.getMetric(10);
        }
        Choreographer choreographer = this.f36024o;
        if (choreographer == null || (field = this.f36025p) == null) {
            return -1L;
        }
        try {
            Long l = (Long) field.get(choreographer);
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30316e(InterfaceC9670w1 interfaceC9670w1) {
        try {
            this.f36024o = Choreographer.getInstance();
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30317g(C9344s0 c9344s0, Window window, FrameMetrics frameMetrics, int i2) {
        long jNanoTime = System.nanoTime();
        float refreshRate = c9344s0.m30406d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        long jM30308a = m30308a(frameMetrics);
        long jM30309b = m30309b(frameMetrics);
        if (jM30309b < 0) {
            jM30309b = jNanoTime - jM30308a;
        }
        long jMax = Math.max(jM30309b, this.f36027r);
        if (jMax == this.f36026q) {
            return;
        }
        this.f36026q = jMax;
        this.f36027r = jMax + jM30308a;
        Iterator<b> it = this.f36020k.values().iterator();
        while (it.hasNext()) {
            it.next().mo30322a(this.f36027r, jM30308a, refreshRate);
        }
    }

    /* renamed from: h */
    private void m30313h(Window window) {
        WeakReference<Window> weakReference = this.f36019j;
        if (weakReference == null || weakReference.get() != window) {
            this.f36019j = new WeakReference<>(window);
            m30315l();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: k */
    private void m30314k(Window window) {
        if (this.f36016g.contains(window)) {
            if (this.f36015f.m30406d() >= 24) {
                try {
                    this.f36022m.mo30321b(window, this.f36023n);
                } catch (Exception e2) {
                    this.f36017h.mo30213b(EnumC9587s4.ERROR, "Failed to remove frameMetricsAvailableListener", e2);
                }
            }
            this.f36016g.remove(window);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: l */
    private void m30315l() {
        WeakReference<Window> weakReference = this.f36019j;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.f36021l || this.f36016g.contains(window) || this.f36020k.isEmpty() || this.f36015f.m30406d() < 24 || this.f36018i == null) {
            return;
        }
        this.f36016g.add(window);
        this.f36022m.mo30320a(window, this.f36023n, this.f36018i);
    }

    /* renamed from: i */
    public String m30318i(b bVar) {
        if (!this.f36021l) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        this.f36020k.put(string, bVar);
        m30315l();
        return string;
    }

    /* renamed from: j */
    public void m30319j(String str) {
        if (this.f36021l) {
            if (str != null) {
                this.f36020k.remove(str);
            }
            WeakReference<Window> weakReference = this.f36019j;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.f36020k.isEmpty()) {
                return;
            }
            m30314k(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m30313h(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m30314k(activity.getWindow());
        WeakReference<Window> weakReference = this.f36019j;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f36019j = null;
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public C9323t(Context context, C9680x4 c9680x4, C9344s0 c9344s0, c cVar) {
        this(context, c9680x4.getLogger(), c9344s0, cVar);
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public C9323t(Context context, final InterfaceC9670w1 interfaceC9670w1, final C9344s0 c9344s0, c cVar) throws NoSuchFieldException {
        this.f36016g = new CopyOnWriteArraySet();
        this.f36020k = new ConcurrentHashMap();
        this.f36021l = false;
        this.f36026q = 0L;
        this.f36027r = 0L;
        C9646q.m31802c(context, "The context is required");
        this.f36017h = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "Logger is required");
        this.f36015f = (C9344s0) C9646q.m31802c(c9344s0, "BuildInfoProvider is required");
        this.f36022m = (c) C9646q.m31802c(cVar, "WindowFrameMetricsManager is required");
        if ((context instanceof Application) && c9344s0.m30406d() >= 24) {
            this.f36021l = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.f
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f36018i = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35989f.m30316e(interfaceC9670w1);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f36025p = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Unable to get the frame timestamp from the choreographer: ", e2);
            }
            this.f36023n = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.e
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                    this.f35991a.m30317g(c9344s0, window, frameMetrics, i2);
                }
            };
        }
    }
}
