package f1;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3311d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f41024a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f41025b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f41026c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f41027d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f41028e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f41029f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f41030g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* renamed from: f1.d$a */
    class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C0513d f41031B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f41032C;

        a(C0513d c0513d, Object obj) {
            this.f41031B = c0513d;
            this.f41032C = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41031B.f41037B = this.f41032C;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: f1.d$b */
    class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Application f41033B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C0513d f41034C;

        b(Application application, C0513d c0513d) {
            this.f41033B = application;
            this.f41034C = c0513d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41033B.unregisterActivityLifecycleCallbacks(this.f41034C);
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: f1.d$c */
    class c implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Object f41035B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f41036C;

        c(Object obj, Object obj2) {
            this.f41035B = obj;
            this.f41036C = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C3311d.f41027d;
                if (method != null) {
                    method.invoke(this.f41035B, this.f41036C, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C3311d.f41028e.invoke(this.f41035B, this.f41036C, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> clsA = a();
        f41024a = clsA;
        f41025b = b();
        f41026c = f();
        f41027d = d(clsA);
        f41028e = c(clsA);
        f41029f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f41026c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f41030g.postAtFrontOfQueue(new c(f41025b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f41029f == null) {
            return false;
        }
        if (f41028e == null && f41027d == null) {
            return false;
        }
        try {
            Object obj2 = f41026c.get(activity);
            if (obj2 == null || (obj = f41025b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0513d c0513d = new C0513d(activity);
            application.registerActivityLifecycleCallbacks(c0513d);
            Handler handler = f41030g;
            handler.post(new a(c0513d, obj2));
            try {
                if (g()) {
                    Method method = f41029f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0513d));
                return true;
            } catch (Throwable th) {
                f41030g.post(new b(application, c0513d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: f1.d$d, reason: collision with other inner class name */
    private static final class C0513d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: B, reason: collision with root package name */
        Object f41037B;

        /* renamed from: C, reason: collision with root package name */
        private Activity f41038C;

        /* renamed from: D, reason: collision with root package name */
        private final int f41039D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f41040E = false;

        /* renamed from: F, reason: collision with root package name */
        private boolean f41041F = false;

        /* renamed from: G, reason: collision with root package name */
        private boolean f41042G = false;

        C0513d(Activity activity) {
            this.f41038C = activity;
            this.f41039D = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f41038C == activity) {
                this.f41038C = null;
                this.f41041F = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f41041F || this.f41042G || this.f41040E || !C3311d.h(this.f41037B, this.f41039D, activity)) {
                return;
            }
            this.f41042G = true;
            this.f41037B = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f41038C == activity) {
                this.f41040E = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
