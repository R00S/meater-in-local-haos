package androidx.window.layout.adapter.sidecar;

import E3.k;
import F3.j;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import g1.InterfaceC3378b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import r1.InterfaceC4334a;

/* compiled from: SidecarCompat.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0004\u0013\u0018\u001d0B\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Landroidx/window/layout/adapter/sidecar/a;", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "LI3/a;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;LI3/a;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "Loa/F;", "k", "(Landroid/app/Activity;)V", "m", "Landroidx/window/layout/adapter/sidecar/a$a;", "extensionCallback", "a", "(Landroidx/window/layout/adapter/sidecar/a$a;)V", "LF3/j;", "i", "(Landroid/app/Activity;)LF3/j;", "b", "Landroid/os/IBinder;", "windowToken", "j", "(Landroid/os/IBinder;Landroid/app/Activity;)V", "c", "", "n", "()Z", "Landroidx/window/sidecar/SidecarInterface;", "h", "()Landroidx/window/sidecar/SidecarInterface;", "LI3/a;", "", "Ljava/util/Map;", "windowListenerRegisteredContexts", "Lr1/a;", "Landroid/content/res/Configuration;", "d", "componentCallbackMap", "Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "e", "Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "f", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SidecarCompat implements a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SidecarInterface sidecar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final I3.a sidecarAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<Activity, InterfaceC4334a<Configuration>> componentCallbackMap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private b extensionCallback;

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Loa/F;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            C3862t.g(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.INSTANCE.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    windowLayoutInfo = sidecar.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.extensionCallback;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.sidecarAdapter.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SidecarDeviceState sidecarDeviceState;
            C3862t.g(windowToken, "windowToken");
            C3862t.g(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            I3.a aVar = SidecarCompat.this.sidecarAdapter;
            SidecarInterface sidecar = SidecarCompat.this.getSidecar();
            if (sidecar == null || (sidecarDeviceState = sidecar.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j jVarE = aVar.e(newLayout, sidecarDeviceState);
            b bVar = SidecarCompat.this.extensionCallback;
            if (bVar != null) {
                bVar.a(activity, jVarE);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/sidecar/SidecarInterface;", "b", "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "Landroid/app/Activity;", "activity", "Landroid/os/IBinder;", "a", "(Landroid/app/Activity;)Landroid/os/IBinder;", "LE3/k;", "c", "()LE3/k;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.layout.adapter.sidecar.SidecarCompat$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            C3862t.g(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return k.INSTANCE.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "callbackInterface", "<init>", "(Landroidx/window/layout/adapter/sidecar/a$a;)V", "Landroid/app/Activity;", "activity", "LF3/j;", "newLayout", "Loa/F;", "a", "(Landroid/app/Activity;LF3/j;)V", "b", "(Landroid/app/Activity;)V", "Landroidx/window/layout/adapter/sidecar/a$a;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements a.InterfaceC0416a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a.InterfaceC0416a callbackInterface;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ReentrantLock globalLock;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final WeakHashMap<Activity, j> activityWindowLayoutInfo;

        public b(a.InterfaceC0416a callbackInterface) {
            C3862t.g(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.globalLock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0416a
        public void a(Activity activity, j newLayout) {
            C3862t.g(activity, "activity");
            C3862t.g(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.globalLock;
            reentrantLock.lock();
            try {
                if (C3862t.b(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            C3862t.g(activity, "activity");
            ReentrantLock reentrantLock = this.globalLock;
            reentrantLock.lock();
            try {
                this.activityWindowLayoutInfo.put(activity, null);
                C4153F c4153f = C4153F.f46609a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$c;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "sidecarCompat", "Landroid/app/Activity;", "activity", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;Landroid/app/Activity;)V", "Landroid/view/View;", "view", "Loa/F;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "B", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "C", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final SidecarCompat sidecarCompat;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final WeakReference<Activity> activityWeakReference;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            C3862t.g(sidecarCompat, "sidecarCompat");
            C3862t.g(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C3862t.g(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder iBinderA = SidecarCompat.INSTANCE.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.sidecarCompat.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C3862t.g(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, I3.a sidecarAdapter) {
        C3862t.g(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null && (activity instanceof InterfaceC3378b)) {
            InterfaceC4334a<Configuration> interfaceC4334a = new InterfaceC4334a() { // from class: I3.b
                @Override // r1.InterfaceC4334a
                public final void accept(Object obj) {
                    SidecarCompat.l(this.f6674a, activity, (Configuration) obj);
                }
            };
            this.componentCallbackMap.put(activity, interfaceC4334a);
            ((InterfaceC3378b) activity).j(interfaceC4334a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SidecarCompat this$0, Activity activity, Configuration configuration) {
        C3862t.g(this$0, "this$0");
        C3862t.g(activity, "$activity");
        b bVar = this$0.extensionCallback;
        if (bVar != null) {
            bVar.a(activity, this$0.i(activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(Activity activity) {
        InterfaceC4334a<Configuration> interfaceC4334a = this.componentCallbackMap.get(activity);
        if (interfaceC4334a == null) {
            return;
        }
        if (activity instanceof InterfaceC3378b) {
            ((InterfaceC3378b) activity).u(interfaceC4334a);
        }
        this.componentCallbackMap.remove(activity);
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0416a extensionCallback) {
        C3862t.g(extensionCallback, "extensionCallback");
        this.extensionCallback = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.sidecarAdapter, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        C3862t.g(activity, "activity");
        IBinder iBinderA = INSTANCE.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        C3862t.g(activity, "activity");
        IBinder iBinderA = INSTANCE.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        m(activity);
        b bVar = this.extensionCallback;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z10 = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* renamed from: h, reason: from getter */
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    public final j i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        C3862t.g(activity, "activity");
        IBinder iBinderA = INSTANCE.a(activity);
        if (iBinderA == null) {
            return new j(r.m());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        I3.a aVar = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        C3862t.g(windowToken, "windowToken");
        C3862t.g(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.extensionCallback;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public boolean n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.sidecar;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!C3862t.b(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.sidecar;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.sidecar;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!C3862t.b(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.sidecar;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!C3862t.b(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.sidecar;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!C3862t.b(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            C3862t.f(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                C3862t.e(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (C3862t.b(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(INSTANCE.b(context), new I3.a(null, 1, null));
        C3862t.g(context, "context");
    }
}
