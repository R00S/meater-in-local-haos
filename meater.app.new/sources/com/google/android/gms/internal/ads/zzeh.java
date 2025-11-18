package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzeh implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: f */
    private static final Handler f26043f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final Context f26044g;

    /* renamed from: h */
    private Application f26045h;

    /* renamed from: i */
    private final PowerManager f26046i;

    /* renamed from: j */
    private final KeyguardManager f26047j;

    /* renamed from: k */
    private final zzdy f26048k;

    /* renamed from: l */
    private BroadcastReceiver f26049l;

    /* renamed from: m */
    private WeakReference<ViewTreeObserver> f26050m;

    /* renamed from: n */
    private WeakReference<View> f26051n;

    /* renamed from: o */
    private C7166st f26052o;

    /* renamed from: p */
    private byte f26053p = -1;

    /* renamed from: q */
    private int f26054q = -1;

    /* renamed from: r */
    private long f26055r = -3;

    public zzeh(zzdy zzdyVar, View view) {
        this.f26048k = zzdyVar;
        Context context = zzdyVar.f26008b;
        this.f26044g = context;
        this.f26046i = (PowerManager) context.getSystemService("power");
        this.f26047j = (KeyguardManager) context.getSystemService("keyguard");
        if (context instanceof Application) {
            this.f26045h = (Application) context;
            this.f26052o = new C7166st((Application) context, this);
        }
        m19931f(view);
    }

    /* renamed from: a */
    private final void m19924a(Activity activity, int i2) {
        Window window;
        if (this.f26051n == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.f26051n.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f26054q = i2;
    }

    /* renamed from: c */
    private final void m19926c() {
        f26043f.post(new RunnableC7134ry(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19927e() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f26051n
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L15
            r9.f26055r = r2
            r9.f26053p = r1
            return
        L15:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L29
            r4 = r4 | 2
            byte r4 = (byte) r4
        L29:
            android.os.PowerManager r7 = r9.f26046i
            if (r7 == 0) goto L36
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L36
            r4 = r4 | 4
            byte r4 = (byte) r4
        L36:
            com.google.android.gms.internal.ads.zzdy r7 = r9.f26048k
            boolean r7 = r7.m19915y()
            if (r7 != 0) goto L6a
            android.app.KeyguardManager r7 = r9.f26047j
            if (r7 == 0) goto L69
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L69
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzef.m19923g(r0)
            if (r7 == 0) goto L65
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L56
            r7 = 0
            goto L5a
        L56:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L5a:
            if (r7 == 0) goto L65
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L65
            r7 = 1
            goto L66
        L65:
            r7 = 0
        L66:
            if (r7 == 0) goto L69
            goto L6a
        L69:
            r5 = 0
        L6a:
            if (r5 != 0) goto L6f
            r4 = r4 | 8
            byte r4 = (byte) r4
        L6f:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L7d
            r4 = r4 | 16
            byte r4 = (byte) r4
        L7d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L8b
            r4 = r4 | 32
            byte r4 = (byte) r4
        L8b:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f26054q
            if (r5 == r1) goto L94
            r0 = r5
        L94:
            if (r0 == 0) goto L99
            r0 = r4 | 64
            byte r4 = (byte) r0
        L99:
            byte r0 = r9.f26053p
            if (r0 == r4) goto Lab
            r9.f26053p = r4
            if (r4 != 0) goto La6
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto La9
        La6:
            long r0 = (long) r4
            long r0 = r2 - r0
        La9:
            r9.f26055r = r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeh.m19927e():void");
    }

    /* renamed from: g */
    private final void m19928g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f26050m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f26049l == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C7171sy c7171sy = new C7171sy(this);
            this.f26049l = c7171sy;
            this.f26044g.registerReceiver(c7171sy, intentFilter);
        }
        Application application = this.f26045h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f26052o);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    private final void m19929h(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f26050m;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f26050m = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f26049l;
        if (broadcastReceiver != null) {
            try {
                this.f26044g.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f26049l = null;
        }
        Application application = this.f26045h;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f26052o);
            } catch (Exception unused4) {
            }
        }
    }

    /* renamed from: d */
    public final long m19930d() {
        if (this.f26055r <= -2 && this.f26051n.get() == null) {
            this.f26055r = -3L;
        }
        return this.f26055r;
    }

    /* renamed from: f */
    final void m19931f(View view) {
        WeakReference<View> weakReference = this.f26051n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m19929h(view2);
        }
        this.f26051n = new WeakReference<>(view);
        if (view == null) {
            this.f26055r = -3L;
            return;
        }
        if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
            m19928g(view);
        }
        view.addOnAttachStateChangeListener(this);
        this.f26055r = -2L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m19924a(activity, 0);
        m19927e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m19927e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m19924a(activity, 4);
        m19927e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m19924a(activity, 0);
        m19927e();
        m19926c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m19927e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m19924a(activity, 0);
        m19927e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m19927e();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m19927e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m19927e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f26054q = -1;
        m19928g(view);
        m19927e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f26054q = -1;
        m19927e();
        m19926c();
        m19929h(view);
    }
}
