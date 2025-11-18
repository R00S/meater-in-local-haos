package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0273b;
import androidx.core.view.C0311u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p024c.p067m.C0985b;

/* compiled from: SpecialEffectsController.java */
/* renamed from: androidx.fragment.app.a0 */
/* loaded from: classes.dex */
abstract class AbstractC0463a0 {

    /* renamed from: a */
    private final ViewGroup f3185a;

    /* renamed from: b */
    final ArrayList<e> f3186b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<e> f3187c = new ArrayList<>();

    /* renamed from: d */
    boolean f3188d = false;

    /* renamed from: e */
    boolean f3189e = false;

    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.a0$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ d f3190f;

        a(d dVar) {
            this.f3190f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0463a0.this.f3186b.contains(this.f3190f)) {
                this.f3190f.m3584e().m3593g(this.f3190f.m3585f().mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.a0$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ d f3192f;

        b(d dVar) {
            this.f3192f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0463a0.this.f3186b.remove(this.f3192f);
            AbstractC0463a0.this.f3187c.remove(this.f3192f);
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.a0$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f3194a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3195b;

        static {
            int[] iArr = new int[e.b.values().length];
            f3195b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3195b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3195b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f3194a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3194a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3194a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3194a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.a0$d */
    private static class d extends e {

        /* renamed from: h */
        private final C0482r f3196h;

        d(e.c cVar, e.b bVar, C0482r c0482r, C0273b c0273b) {
            super(cVar, bVar, c0482r.m3699k(), c0273b);
            this.f3196h = c0482r;
        }

        @Override // androidx.fragment.app.AbstractC0463a0.e
        /* renamed from: c */
        public void mo3579c() {
            super.mo3579c();
            this.f3196h.m3700m();
        }

        @Override // androidx.fragment.app.AbstractC0463a0.e
        /* renamed from: l */
        void mo3580l() {
            Fragment fragmentM3699k = this.f3196h.m3699k();
            View viewFindFocus = fragmentM3699k.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentM3699k.setFocusedView(viewFindFocus);
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentM3699k);
                }
            }
            if (m3586g() == e.b.ADDING) {
                View viewRequireView = m3585f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f3196h.m3690b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentM3699k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.a0$e */
    static class e {

        /* renamed from: a */
        private c f3197a;

        /* renamed from: b */
        private b f3198b;

        /* renamed from: c */
        private final Fragment f3199c;

        /* renamed from: d */
        private final List<Runnable> f3200d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0273b> f3201e = new HashSet<>();

        /* renamed from: f */
        private boolean f3202f = false;

        /* renamed from: g */
        private boolean f3203g = false;

        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.a0$e$a */
        class a implements C0273b.a {
            a() {
            }

            @Override // androidx.core.os.C0273b.a
            public void onCancel() {
                e.this.m3582b();
            }
        }

        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.a0$e$b */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.a0$e$c */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: k */
            static c m3591k(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            /* renamed from: q */
            static c m3592q(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m3591k(view.getVisibility());
            }

            /* renamed from: g */
            void m3593g(View view) {
                int i2 = c.f3194a[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m3392H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (FragmentManager.m3392H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i2 == 3) {
                    if (FragmentManager.m3392H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i2 != 4) {
                    return;
                }
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, C0273b c0273b) {
            this.f3197a = cVar;
            this.f3198b = bVar;
            this.f3199c = fragment;
            c0273b.m1837c(new a());
        }

        /* renamed from: a */
        final void m3581a(Runnable runnable) {
            this.f3200d.add(runnable);
        }

        /* renamed from: b */
        final void m3582b() {
            if (m3587h()) {
                return;
            }
            this.f3202f = true;
            if (this.f3201e.isEmpty()) {
                mo3579c();
                return;
            }
            Iterator it = new ArrayList(this.f3201e).iterator();
            while (it.hasNext()) {
                ((C0273b) it.next()).m1835a();
            }
        }

        /* renamed from: c */
        public void mo3579c() {
            if (this.f3203g) {
                return;
            }
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3203g = true;
            Iterator<Runnable> it = this.f3200d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: d */
        public final void m3583d(C0273b c0273b) {
            if (this.f3201e.remove(c0273b) && this.f3201e.isEmpty()) {
                mo3579c();
            }
        }

        /* renamed from: e */
        public c m3584e() {
            return this.f3197a;
        }

        /* renamed from: f */
        public final Fragment m3585f() {
            return this.f3199c;
        }

        /* renamed from: g */
        b m3586g() {
            return this.f3198b;
        }

        /* renamed from: h */
        final boolean m3587h() {
            return this.f3202f;
        }

        /* renamed from: i */
        final boolean m3588i() {
            return this.f3203g;
        }

        /* renamed from: j */
        public final void m3589j(C0273b c0273b) {
            mo3580l();
            this.f3201e.add(c0273b);
        }

        /* renamed from: k */
        final void m3590k(c cVar, b bVar) {
            int i2 = c.f3195b[bVar.ordinal()];
            if (i2 == 1) {
                if (this.f3197a == c.REMOVED) {
                    if (FragmentManager.m3392H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3199c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3198b + " to ADDING.");
                    }
                    this.f3197a = c.VISIBLE;
                    this.f3198b = b.ADDING;
                    return;
                }
                return;
            }
            if (i2 == 2) {
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3199c + " mFinalState = " + this.f3197a + " -> REMOVED. mLifecycleImpact  = " + this.f3198b + " to REMOVING.");
                }
                this.f3197a = c.REMOVED;
                this.f3198b = b.REMOVING;
                return;
            }
            if (i2 == 3 && this.f3197a != c.REMOVED) {
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3199c + " mFinalState = " + this.f3197a + " -> " + cVar + ". ");
                }
                this.f3197a = cVar;
            }
        }

        /* renamed from: l */
        void mo3580l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3197a + "} {mLifecycleImpact = " + this.f3198b + "} {mFragment = " + this.f3199c + "}";
        }
    }

    AbstractC0463a0(ViewGroup viewGroup) {
        this.f3185a = viewGroup;
    }

    /* renamed from: a */
    private void m3561a(e.c cVar, e.b bVar, C0482r c0482r) {
        synchronized (this.f3186b) {
            C0273b c0273b = new C0273b();
            e eVarM3562h = m3562h(c0482r.m3699k());
            if (eVarM3562h != null) {
                eVarM3562h.m3590k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0482r, c0273b);
            this.f3186b.add(dVar);
            dVar.m3581a(new a(dVar));
            dVar.m3581a(new b(dVar));
        }
    }

    /* renamed from: h */
    private e m3562h(Fragment fragment) {
        Iterator<e> it = this.f3186b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m3585f().equals(fragment) && !next.m3587h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private e m3563i(Fragment fragment) {
        Iterator<e> it = this.f3187c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m3585f().equals(fragment) && !next.m3587h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    static AbstractC0463a0 m3564n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m3565o(viewGroup, fragmentManager.m3430B0());
    }

    /* renamed from: o */
    static AbstractC0463a0 m3565o(ViewGroup viewGroup, InterfaceC0465b0 interfaceC0465b0) {
        int i2 = C0985b.f6507b;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof AbstractC0463a0) {
            return (AbstractC0463a0) tag;
        }
        AbstractC0463a0 abstractC0463a0Mo3525a = interfaceC0465b0.mo3525a(viewGroup);
        viewGroup.setTag(i2, abstractC0463a0Mo3525a);
        return abstractC0463a0Mo3525a;
    }

    /* renamed from: q */
    private void m3566q() {
        Iterator<e> it = this.f3186b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m3586g() == e.b.ADDING) {
                next.m3590k(e.c.m3591k(next.m3585f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* renamed from: b */
    void m3567b(e.c cVar, C0482r c0482r) {
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0482r.m3699k());
        }
        m3561a(cVar, e.b.ADDING, c0482r);
    }

    /* renamed from: c */
    void m3568c(C0482r c0482r) {
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0482r.m3699k());
        }
        m3561a(e.c.GONE, e.b.NONE, c0482r);
    }

    /* renamed from: d */
    void m3569d(C0482r c0482r) {
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0482r.m3699k());
        }
        m3561a(e.c.REMOVED, e.b.REMOVING, c0482r);
    }

    /* renamed from: e */
    void m3570e(C0482r c0482r) {
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0482r.m3699k());
        }
        m3561a(e.c.VISIBLE, e.b.NONE, c0482r);
    }

    /* renamed from: f */
    abstract void mo3571f(List<e> list, boolean z);

    /* renamed from: g */
    void m3572g() {
        if (this.f3189e) {
            return;
        }
        if (!C0311u.m2101N(this.f3185a)) {
            m3573j();
            this.f3188d = false;
            return;
        }
        synchronized (this.f3186b) {
            if (!this.f3186b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3187c);
                this.f3187c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.m3392H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m3582b();
                    if (!eVar.m3588i()) {
                        this.f3187c.add(eVar);
                    }
                }
                m3566q();
                ArrayList arrayList2 = new ArrayList(this.f3186b);
                this.f3186b.clear();
                this.f3187c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo3580l();
                }
                mo3571f(arrayList2, this.f3188d);
                this.f3188d = false;
            }
        }
    }

    /* renamed from: j */
    void m3573j() {
        String str;
        String str2;
        boolean zM2101N = C0311u.m2101N(this.f3185a);
        synchronized (this.f3186b) {
            m3566q();
            Iterator<e> it = this.f3186b.iterator();
            while (it.hasNext()) {
                it.next().mo3580l();
            }
            Iterator it2 = new ArrayList(this.f3187c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.m3392H0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (zM2101N) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str2 = "Container " + this.f3185a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.m3582b();
            }
            Iterator it3 = new ArrayList(this.f3186b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.m3392H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (zM2101N) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str = "Container " + this.f3185a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.m3582b();
            }
        }
    }

    /* renamed from: k */
    void m3574k() {
        if (this.f3189e) {
            this.f3189e = false;
            m3572g();
        }
    }

    /* renamed from: l */
    e.b m3575l(C0482r c0482r) {
        e eVarM3562h = m3562h(c0482r.m3699k());
        if (eVarM3562h != null) {
            return eVarM3562h.m3586g();
        }
        e eVarM3563i = m3563i(c0482r.m3699k());
        if (eVarM3563i != null) {
            return eVarM3563i.m3586g();
        }
        return null;
    }

    /* renamed from: m */
    public ViewGroup m3576m() {
        return this.f3185a;
    }

    /* renamed from: p */
    void m3577p() {
        synchronized (this.f3186b) {
            m3566q();
            this.f3189e = false;
            int size = this.f3186b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3186b.get(size);
                e.c cVarM3592q = e.c.m3592q(eVar.m3585f().mView);
                e.c cVarM3584e = eVar.m3584e();
                e.c cVar = e.c.VISIBLE;
                if (cVarM3584e == cVar && cVarM3592q != cVar) {
                    this.f3189e = eVar.m3585f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: r */
    void m3578r(boolean z) {
        this.f3188d = z;
    }
}
