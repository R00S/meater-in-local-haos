package androidx.core.app;

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
/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
final class C0239c {

    /* renamed from: a */
    protected static final Class<?> f2050a;

    /* renamed from: b */
    protected static final Field f2051b;

    /* renamed from: c */
    protected static final Field f2052c;

    /* renamed from: d */
    protected static final Method f2053d;

    /* renamed from: e */
    protected static final Method f2054e;

    /* renamed from: f */
    protected static final Method f2055f;

    /* renamed from: g */
    private static final Handler f2056g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ d f2057f;

        /* renamed from: g */
        final /* synthetic */ Object f2058g;

        a(d dVar, Object obj) {
            this.f2057f = dVar;
            this.f2058g = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2057f.f2063f = this.f2058g;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f2059f;

        /* renamed from: g */
        final /* synthetic */ d f2060g;

        b(Application application, d dVar) {
            this.f2059f = application;
            this.f2060g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2059f.unregisterActivityLifecycleCallbacks(this.f2060g);
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$c */
    class c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2061f;

        /* renamed from: g */
        final /* synthetic */ Object f2062g;

        c(Object obj, Object obj2) {
            this.f2061f = obj;
            this.f2062g = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0239c.f2053d;
                if (method != null) {
                    method.invoke(this.f2061f, this.f2062g, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0239c.f2054e.invoke(this.f2061f, this.f2062g, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.c$d */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f2063f;

        /* renamed from: g */
        private Activity f2064g;

        /* renamed from: h */
        private final int f2065h;

        /* renamed from: i */
        private boolean f2066i = false;

        /* renamed from: j */
        private boolean f2067j = false;

        /* renamed from: k */
        private boolean f2068k = false;

        d(Activity activity) {
            this.f2064g = activity;
            this.f2065h = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2064g == activity) {
                this.f2064g = null;
                this.f2067j = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2067j || this.f2068k || this.f2066i || !C0239c.m1542h(this.f2063f, this.f2065h, activity)) {
                return;
            }
            this.f2068k = true;
            this.f2063f = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2064g == activity) {
                this.f2066i = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsM1535a = m1535a();
        f2050a = clsM1535a;
        f2051b = m1536b();
        f2052c = m1540f();
        f2053d = m1538d(clsM1535a);
        f2054e = m1537c(clsM1535a);
        f2055f = m1539e(clsM1535a);
    }

    /* renamed from: a */
    private static Class<?> m1535a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m1536b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1537c(Class<?> cls) {
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

    /* renamed from: d */
    private static Method m1538d(Class<?> cls) {
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

    /* renamed from: e */
    private static Method m1539e(Class<?> cls) {
        if (m1541g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m1540f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m1541g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    /* renamed from: h */
    protected static boolean m1542h(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = f2052c.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                f2056g.postAtFrontOfQueue(new c(f2051b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m1543i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m1541g() && f2055f == null) {
            return false;
        }
        if (f2054e == null && f2053d == null) {
            return false;
        }
        try {
            Object obj2 = f2052c.get(activity);
            if (obj2 == null || (obj = f2051b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f2056g;
            handler.post(new a(dVar, obj2));
            try {
                if (m1541g()) {
                    Method method = f2055f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f2056g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
