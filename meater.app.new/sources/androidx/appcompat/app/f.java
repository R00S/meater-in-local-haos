package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import f1.C3312e;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import s.C4392b;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: B, reason: collision with root package name */
    static c f20647B = new c(new d());

    /* renamed from: C, reason: collision with root package name */
    private static int f20648C = -100;

    /* renamed from: D, reason: collision with root package name */
    private static n1.j f20649D = null;

    /* renamed from: E, reason: collision with root package name */
    private static n1.j f20650E = null;

    /* renamed from: F, reason: collision with root package name */
    private static Boolean f20651F = null;

    /* renamed from: G, reason: collision with root package name */
    private static boolean f20652G = false;

    /* renamed from: H, reason: collision with root package name */
    private static final C4392b<WeakReference<f>> f20653H = new C4392b<>();

    /* renamed from: I, reason: collision with root package name */
    private static final Object f20654I = new Object();

    /* renamed from: J, reason: collision with root package name */
    private static final Object f20655J = new Object();

    /* compiled from: AppCompatDelegate.java */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    static class c implements Executor {

        /* renamed from: B, reason: collision with root package name */
        private final Object f20656B = new Object();

        /* renamed from: C, reason: collision with root package name */
        final Queue<Runnable> f20657C = new ArrayDeque();

        /* renamed from: D, reason: collision with root package name */
        final Executor f20658D;

        /* renamed from: E, reason: collision with root package name */
        Runnable f20659E;

        c(Executor executor) {
            this.f20658D = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                d();
            }
        }

        protected void d() {
            synchronized (this.f20656B) {
                try {
                    Runnable runnablePoll = this.f20657C.poll();
                    this.f20659E = runnablePoll;
                    if (runnablePoll != null) {
                        this.f20658D.execute(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f20656B) {
                try {
                    this.f20657C.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20660B.b(runnable);
                        }
                    });
                    if (this.f20659E == null) {
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: AppCompatDelegate.java */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    f() {
    }

    static void G(f fVar) {
        synchronized (f20654I) {
            H(fVar);
        }
    }

    private static void H(f fVar) {
        synchronized (f20654I) {
            try {
                Iterator<WeakReference<f>> it = f20653H.iterator();
                while (it.hasNext()) {
                    f fVar2 = it.next().get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void M(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f20648C != i10) {
            f20648C = i10;
            g();
        }
    }

    static void R(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().e()) {
                    String strB = C3312e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void S(final Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f20652G) {
                    return;
                }
                f20647B.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.x(context);
                    }
                });
                return;
            }
            synchronized (f20655J) {
                try {
                    n1.j jVar = f20649D;
                    if (jVar == null) {
                        if (f20650E == null) {
                            f20650E = n1.j.b(C3312e.b(context));
                        }
                        if (f20650E.e()) {
                        } else {
                            f20649D = f20650E;
                        }
                    } else if (!jVar.equals(f20650E)) {
                        n1.j jVar2 = f20649D;
                        f20650E = jVar2;
                        C3312e.a(context, jVar2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static void d(f fVar) {
        synchronized (f20654I) {
            H(fVar);
            f20653H.add(new WeakReference<>(fVar));
        }
    }

    private static void g() {
        synchronized (f20654I) {
            try {
                Iterator<WeakReference<f>> it = f20653H.iterator();
                while (it.hasNext()) {
                    f fVar = it.next().get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f j(Activity activity, androidx.appcompat.app.d dVar) {
        return new h(activity, dVar);
    }

    public static f k(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new h(dialog, dVar);
    }

    public static n1.j m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objQ = q();
            if (objQ != null) {
                return n1.j.h(b.a(objQ));
            }
        } else {
            n1.j jVar = f20649D;
            if (jVar != null) {
                return jVar;
            }
        }
        return n1.j.d();
    }

    public static int o() {
        return f20648C;
    }

    static Object q() {
        Context contextN;
        Iterator<WeakReference<f>> it = f20653H.iterator();
        while (it.hasNext()) {
            f fVar = it.next().get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static n1.j s() {
        return f20649D;
    }

    static boolean w(Context context) {
        if (f20651F == null) {
            try {
                Bundle bundle = s.a(context).metaData;
                if (bundle != null) {
                    f20651F = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f20651F = Boolean.FALSE;
            }
        }
        return f20651F.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Context context) {
        R(context);
        f20652G = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O(Toolbar toolbar);

    public abstract void Q(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract <T extends View> T l(int i10);

    public Context n() {
        return null;
    }

    public int p() {
        return -100;
    }

    public abstract MenuInflater r();

    public abstract androidx.appcompat.app.a t();

    public abstract void u();

    public abstract void v();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);

    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void P(int i10) {
    }

    @Deprecated
    public void h(Context context) {
    }
}
