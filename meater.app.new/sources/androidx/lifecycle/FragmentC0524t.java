package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0511g;

/* compiled from: ReportFragment.java */
/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public class FragmentC0524t extends Fragment {

    /* renamed from: f */
    private a f3494f;

    /* compiled from: ReportFragment.java */
    /* renamed from: androidx.lifecycle.t$a */
    interface a {
        /* renamed from: a */
        void mo3836a();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.java */
    /* renamed from: androidx.lifecycle.t$b */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
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
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0524t.m3890a(activity, AbstractC0511g.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0524t.m3890a(activity, AbstractC0511g.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0524t.m3890a(activity, AbstractC0511g.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0524t.m3890a(activity, AbstractC0511g.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0524t.m3890a(activity, AbstractC0511g.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0524t.m3890a(activity, AbstractC0511g.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static void m3890a(Activity activity, AbstractC0511g.b bVar) {
        if (activity instanceof InterfaceC0517m) {
            ((InterfaceC0517m) activity).getLifecycle().m3879h(bVar);
        } else if (activity instanceof InterfaceC0515k) {
            AbstractC0511g lifecycle = ((InterfaceC0515k) activity).getLifecycle();
            if (lifecycle instanceof C0516l) {
                ((C0516l) lifecycle).m3879h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m3891b(AbstractC0511g.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m3890a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m3892c(a aVar) {
        if (aVar != null) {
            aVar.mo3836a();
        }
    }

    /* renamed from: d */
    private void m3893d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: e */
    private void m3894e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    static FragmentC0524t m3895f(Activity activity) {
        return (FragmentC0524t) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m3896g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0524t(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: h */
    void m3897h(a aVar) {
        this.f3494f = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3892c(this.f3494f);
        m3891b(AbstractC0511g.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m3891b(AbstractC0511g.b.ON_DESTROY);
        this.f3494f = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m3891b(AbstractC0511g.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m3893d(this.f3494f);
        m3891b(AbstractC0511g.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m3894e(this.f3494f);
        m3891b(AbstractC0511g.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m3891b(AbstractC0511g.b.ON_STOP);
    }
}
