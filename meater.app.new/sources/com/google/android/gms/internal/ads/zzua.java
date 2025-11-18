package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzua implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: f */
    private static final long f27116f = ((Long) zzyt.m20848e().m16421c(zzacu.f21684P1)).longValue();

    /* renamed from: g */
    private final Context f27117g;

    /* renamed from: h */
    private Application f27118h;

    /* renamed from: i */
    private final WindowManager f27119i;

    /* renamed from: j */
    private final PowerManager f27120j;

    /* renamed from: k */
    private final KeyguardManager f27121k;

    /* renamed from: l */
    @VisibleForTesting
    private BroadcastReceiver f27122l;

    /* renamed from: m */
    private WeakReference<ViewTreeObserver> f27123m;

    /* renamed from: n */
    private WeakReference<View> f27124n;

    /* renamed from: o */
    private e40 f27125o;

    /* renamed from: p */
    private zzazj f27126p = new zzazj(f27116f);

    /* renamed from: q */
    private boolean f27127q = false;

    /* renamed from: r */
    private int f27128r = -1;

    /* renamed from: s */
    private final HashSet<zzue> f27129s = new HashSet<>();

    /* renamed from: t */
    private final DisplayMetrics f27130t;

    /* renamed from: u */
    private final Rect f27131u;

    public zzua(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f27117g = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f27119i = windowManager;
        this.f27120j = (PowerManager) applicationContext.getSystemService("power");
        this.f27121k = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f27118h = (Application) applicationContext;
            this.f27125o = new e40((Application) applicationContext, this);
        }
        this.f27130t = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f27131u = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f27124n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m20600k(view2);
        }
        this.f27124n = new WeakReference<>(view);
        if (view != null) {
            if (zzk.zzli().mo17191b(view)) {
                m20599i(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    private final Rect m20593a(Rect rect) {
        return new Rect(m20597g(rect.left), m20597g(rect.top), m20597g(rect.right), m20597g(rect.bottom));
    }

    /* renamed from: b */
    private final void m20594b(Activity activity, int i2) {
        Window window;
        if (this.f27124n == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.f27124n.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f27128r = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m20596f(int i2) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        if (this.f27129s.size() == 0 || (weakReference = this.f27124n) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z3 = i2 == 1;
        boolean z4 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e2) {
                zzbad.m17347c("Failure getting view location.", e2);
            }
            int i3 = iArr[0];
            rect.left = i3;
            rect.top = iArr[1];
            rect.right = i3 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        List<Rect> listEmptyList = (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21702S1)).booleanValue() || view == null) ? Collections.emptyList() : m20601l(view);
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i4 = this.f27128r;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        boolean z5 = !z4 && zzk.zzlg().m17183r(view, this.f27120j, this.f27121k) && z && z2 && windowVisibility == 0;
        if (z3 && !this.f27126p.m17278a() && z5 == this.f27127q) {
            return;
        }
        if (z5 || this.f27127q || i2 != 1) {
            zzud zzudVar = new zzud(zzk.zzln().mo14609b(), this.f27120j.isScreenOn(), view != null && zzk.zzli().mo17191b(view), view != null ? view.getWindowVisibility() : 8, m20593a(this.f27131u), m20593a(rect), m20593a(rect2), z, m20593a(rect3), z2, m20593a(rect4), this.f27130t.density, z5, listEmptyList);
            Iterator<zzue> it = this.f27129s.iterator();
            while (it.hasNext()) {
                it.next().mo14929r0(zzudVar);
            }
            this.f27127q = z5;
        }
    }

    /* renamed from: g */
    private final int m20597g(int i2) {
        return (int) (i2 / this.f27130t.density);
    }

    /* renamed from: h */
    private final void m20598h() {
        zzk.zzlg();
        zzaxi.f22654a.post(new c40(this));
    }

    /* renamed from: i */
    private final void m20599i(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f27123m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f27122l == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f27122l = new d40(this);
            zzk.zzmb().m17289c(this.f27117g, this.f27122l, intentFilter);
        }
        Application application = this.f27118h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f27125o);
            } catch (Exception e2) {
                zzbad.m17347c("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    /* renamed from: k */
    private final void m20600k(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f27123m;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f27123m = null;
            }
        } catch (Exception e2) {
            zzbad.m17347c("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            zzbad.m17347c("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.f27122l != null) {
            try {
                zzk.zzmb().m17288b(this.f27117g, this.f27122l);
            } catch (IllegalStateException e4) {
                zzbad.m17347c("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                zzk.zzlk().m17052e(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f27122l = null;
        }
        Application application = this.f27118h;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f27125o);
            } catch (Exception e6) {
                zzbad.m17347c("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    /* renamed from: l */
    private final List<Rect> m20601l(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if ((Build.VERSION.SDK_INT >= 16 ? view2.isScrollContainer() : (view2 instanceof ScrollView) || (view2 instanceof ListView)) && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(m20593a(rect));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            zzk.zzlk().m17052e(e2, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public final void m20602d(zzue zzueVar) {
        this.f27129s.add(zzueVar);
        m20596f(3);
    }

    /* renamed from: e */
    public final void m20603e(zzue zzueVar) {
        this.f27129s.remove(zzueVar);
    }

    /* renamed from: j */
    public final void m20604j(long j2) {
        this.f27126p.m17279b(j2);
    }

    /* renamed from: m */
    public final void m20605m() {
        this.f27126p.m17279b(f27116f);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m20594b(activity, 0);
        m20596f(3);
        m20598h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m20596f(3);
        m20598h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m20594b(activity, 4);
        m20596f(3);
        m20598h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m20594b(activity, 0);
        m20596f(3);
        m20598h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m20596f(3);
        m20598h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m20594b(activity, 0);
        m20596f(3);
        m20598h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m20596f(3);
        m20598h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m20596f(2);
        m20598h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m20596f(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f27128r = -1;
        m20599i(view);
        m20596f(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f27128r = -1;
        m20596f(3);
        m20598h();
        m20600k(view);
    }
}
