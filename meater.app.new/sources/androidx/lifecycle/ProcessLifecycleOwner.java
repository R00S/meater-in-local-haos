package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.FragmentC0524t;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements InterfaceC0515k {

    /* renamed from: f */
    private static final ProcessLifecycleOwner f3442f = new ProcessLifecycleOwner();

    /* renamed from: k */
    private Handler f3447k;

    /* renamed from: g */
    private int f3443g = 0;

    /* renamed from: h */
    private int f3444h = 0;

    /* renamed from: i */
    private boolean f3445i = true;

    /* renamed from: j */
    private boolean f3446j = true;

    /* renamed from: l */
    private final C0516l f3448l = new C0516l(this);

    /* renamed from: m */
    private Runnable f3449m = new RunnableC0495a();

    /* renamed from: n */
    FragmentC0524t.a f3450n = new C0496b();

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$a */
    class RunnableC0495a implements Runnable {
        RunnableC0495a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.m3834f();
            ProcessLifecycleOwner.this.m3835g();
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$b */
    class C0496b implements FragmentC0524t.a {
        C0496b() {
        }

        @Override // androidx.lifecycle.FragmentC0524t.a
        /* renamed from: a */
        public void mo3836a() {
        }

        @Override // androidx.lifecycle.FragmentC0524t.a
        public void onResume() {
            ProcessLifecycleOwner.this.m3830b();
        }

        @Override // androidx.lifecycle.FragmentC0524t.a
        public void onStart() {
            ProcessLifecycleOwner.this.m3831c();
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$c */
    class C0497c extends C0506d {

        /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$c$a */
        class a extends C0506d {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ProcessLifecycleOwner.this.m3830b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ProcessLifecycleOwner.this.m3831c();
            }
        }

        C0497c() {
        }

        @Override // androidx.lifecycle.C0506d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC0524t.m3895f(activity).m3897h(ProcessLifecycleOwner.this.f3450n);
            }
        }

        @Override // androidx.lifecycle.C0506d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.m3829a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.C0506d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.m3832d();
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* renamed from: h */
    public static InterfaceC0515k m3827h() {
        return f3442f;
    }

    /* renamed from: i */
    static void m3828i(Context context) {
        f3442f.m3833e(context);
    }

    /* renamed from: a */
    void m3829a() {
        int i2 = this.f3444h - 1;
        this.f3444h = i2;
        if (i2 == 0) {
            this.f3447k.postDelayed(this.f3449m, 700L);
        }
    }

    /* renamed from: b */
    void m3830b() {
        int i2 = this.f3444h + 1;
        this.f3444h = i2;
        if (i2 == 1) {
            if (!this.f3445i) {
                this.f3447k.removeCallbacks(this.f3449m);
            } else {
                this.f3448l.m3879h(AbstractC0511g.b.ON_RESUME);
                this.f3445i = false;
            }
        }
    }

    /* renamed from: c */
    void m3831c() {
        int i2 = this.f3443g + 1;
        this.f3443g = i2;
        if (i2 == 1 && this.f3446j) {
            this.f3448l.m3879h(AbstractC0511g.b.ON_START);
            this.f3446j = false;
        }
    }

    /* renamed from: d */
    void m3832d() {
        this.f3443g--;
        m3835g();
    }

    /* renamed from: e */
    void m3833e(Context context) {
        this.f3447k = new Handler();
        this.f3448l.m3879h(AbstractC0511g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0497c());
    }

    /* renamed from: f */
    void m3834f() {
        if (this.f3444h == 0) {
            this.f3445i = true;
            this.f3448l.m3879h(AbstractC0511g.b.ON_PAUSE);
        }
    }

    /* renamed from: g */
    void m3835g() {
        if (this.f3443g == 0 && this.f3445i) {
            this.f3448l.m3879h(AbstractC0511g.b.ON_STOP);
            this.f3446j = true;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0515k
    public AbstractC0511g getLifecycle() {
        return this.f3448l;
    }
}
