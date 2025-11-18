package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
class C0476l {

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f3293a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f3294b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* renamed from: androidx.fragment.app.l$a */
    private static final class a {

        /* renamed from: a */
        final FragmentManager.AbstractC0455m f3295a;

        /* renamed from: b */
        final boolean f3296b;
    }

    C0476l(FragmentManager fragmentManager) {
        this.f3294b = fragmentManager;
    }

    /* renamed from: a */
    void m3659a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3659a(fragment, bundle, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: b */
    void m3660b(Fragment fragment, boolean z) {
        this.f3294b.m3512w0().m3654f();
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3660b(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: c */
    void m3661c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3661c(fragment, bundle, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: d */
    void m3662d(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3662d(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: e */
    void m3663e(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3663e(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: f */
    void m3664f(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3664f(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: g */
    void m3665g(Fragment fragment, boolean z) {
        this.f3294b.m3512w0().m3654f();
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3665g(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: h */
    void m3666h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3666h(fragment, bundle, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: i */
    void m3667i(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3667i(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: j */
    void m3668j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3668j(fragment, bundle, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: k */
    void m3669k(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3669k(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: l */
    void m3670l(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3670l(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: m */
    void m3671m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3671m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }

    /* renamed from: n */
    void m3672n(Fragment fragment, boolean z) {
        Fragment fragmentM3517z0 = this.f3294b.m3517z0();
        if (fragmentM3517z0 != null) {
            fragmentM3517z0.getParentFragmentManager().m3515y0().m3672n(fragment, true);
        }
        Iterator<a> it = this.f3293a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f3296b) {
                FragmentManager.AbstractC0455m abstractC0455m = next.f3295a;
                throw null;
            }
        }
    }
}
