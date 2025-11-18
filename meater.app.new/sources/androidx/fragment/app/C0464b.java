package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0251o;
import androidx.core.os.C0273b;
import androidx.core.view.C0311u;
import androidx.core.view.C0313w;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0308r;
import androidx.fragment.app.AbstractC0463a0;
import androidx.fragment.app.C0469e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;
import p024c.p052i.p059j.C0959i;

/* compiled from: DefaultSpecialEffectsController.java */
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
class C0464b extends AbstractC0463a0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3214a;

        static {
            int[] iArr = new int[AbstractC0463a0.e.c.values().length];
            f3214a = iArr;
            try {
                iArr[AbstractC0463a0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3214a[AbstractC0463a0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3214a[AbstractC0463a0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3214a[AbstractC0463a0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f3215f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0463a0.e f3216g;

        b(List list, AbstractC0463a0.e eVar) {
            this.f3215f = list;
            this.f3216g = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3215f.contains(this.f3216g)) {
                this.f3215f.remove(this.f3216g);
                C0464b.this.m3596s(this.f3216g);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3218a;

        /* renamed from: b */
        final /* synthetic */ View f3219b;

        /* renamed from: c */
        final /* synthetic */ boolean f3220c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0463a0.e f3221d;

        /* renamed from: e */
        final /* synthetic */ k f3222e;

        c(ViewGroup viewGroup, View view, boolean z, AbstractC0463a0.e eVar, k kVar) {
            this.f3218a = viewGroup;
            this.f3219b = view;
            this.f3220c = z;
            this.f3221d = eVar;
            this.f3222e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3218a.endViewTransition(this.f3219b);
            if (this.f3220c) {
                this.f3221d.m3584e().m3593g(this.f3219b);
            }
            this.f3222e.m3601a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$d */
    class d implements C0273b.a {

        /* renamed from: a */
        final /* synthetic */ Animator f3224a;

        d(Animator animator) {
            this.f3224a = animator;
        }

        @Override // androidx.core.os.C0273b.a
        public void onCancel() {
            this.f3224a.end();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3226a;

        /* renamed from: b */
        final /* synthetic */ View f3227b;

        /* renamed from: c */
        final /* synthetic */ k f3228c;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.b$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3226a.endViewTransition(eVar.f3227b);
                e.this.f3228c.m3601a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3226a = viewGroup;
            this.f3227b = view;
            this.f3228c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3226a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$f */
    class f implements C0273b.a {

        /* renamed from: a */
        final /* synthetic */ View f3231a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3232b;

        /* renamed from: c */
        final /* synthetic */ k f3233c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3231a = view;
            this.f3232b = viewGroup;
            this.f3233c = kVar;
        }

        @Override // androidx.core.os.C0273b.a
        public void onCancel() {
            this.f3231a.clearAnimation();
            this.f3232b.endViewTransition(this.f3231a);
            this.f3233c.m3601a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$g */
    class g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC0463a0.e f3235f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0463a0.e f3236g;

        /* renamed from: h */
        final /* synthetic */ boolean f3237h;

        /* renamed from: i */
        final /* synthetic */ C0867a f3238i;

        g(AbstractC0463a0.e eVar, AbstractC0463a0.e eVar2, boolean z, C0867a c0867a) {
            this.f3235f = eVar;
            this.f3236g = eVar2;
            this.f3237h = z;
            this.f3238i = c0867a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486v.m3753f(this.f3235f.m3585f(), this.f3236g.m3585f(), this.f3237h, this.f3238i, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$h */
    class h implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC0488x f3240f;

        /* renamed from: g */
        final /* synthetic */ View f3241g;

        /* renamed from: h */
        final /* synthetic */ Rect f3242h;

        h(AbstractC0488x abstractC0488x, View view, Rect rect) {
            this.f3240f = abstractC0488x;
            this.f3241g = view;
            this.f3242h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3240f.m3798k(this.f3241g, this.f3242h);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$i */
    class i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3244f;

        i(ArrayList arrayList) {
            this.f3244f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486v.m3746A(this.f3244f, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$j */
    class j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ m f3246f;

        j(m mVar) {
            this.f3246f = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3246f.m3601a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$k */
    private static class k extends l {

        /* renamed from: c */
        private boolean f3248c;

        /* renamed from: d */
        private C0469e.d f3249d;

        k(AbstractC0463a0.e eVar, C0273b c0273b) {
            super(eVar, c0273b);
            this.f3248c = false;
        }

        /* renamed from: e */
        C0469e.d m3600e(Context context) {
            if (this.f3248c) {
                return this.f3249d;
            }
            C0469e.d dVarM3622b = C0469e.m3622b(context, m3602b().m3585f(), m3602b().m3584e() == AbstractC0463a0.e.c.VISIBLE);
            this.f3249d = dVarM3622b;
            this.f3248c = true;
            return dVarM3622b;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$l */
    private static class l {

        /* renamed from: a */
        private final AbstractC0463a0.e f3250a;

        /* renamed from: b */
        private final C0273b f3251b;

        l(AbstractC0463a0.e eVar, C0273b c0273b) {
            this.f3250a = eVar;
            this.f3251b = c0273b;
        }

        /* renamed from: a */
        void m3601a() {
            this.f3250a.m3583d(this.f3251b);
        }

        /* renamed from: b */
        AbstractC0463a0.e m3602b() {
            return this.f3250a;
        }

        /* renamed from: c */
        C0273b m3603c() {
            return this.f3251b;
        }

        /* renamed from: d */
        boolean m3604d() {
            AbstractC0463a0.e.c cVar;
            AbstractC0463a0.e.c cVarM3592q = AbstractC0463a0.e.c.m3592q(this.f3250a.m3585f().mView);
            AbstractC0463a0.e.c cVarM3584e = this.f3250a.m3584e();
            return cVarM3592q == cVarM3584e || !(cVarM3592q == (cVar = AbstractC0463a0.e.c.VISIBLE) || cVarM3584e == cVar);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$m */
    private static class m extends l {

        /* renamed from: c */
        private final Object f3252c;

        /* renamed from: d */
        private final boolean f3253d;

        /* renamed from: e */
        private final Object f3254e;

        m(AbstractC0463a0.e eVar, C0273b c0273b, boolean z, boolean z2) {
            super(eVar, c0273b);
            if (eVar.m3584e() == AbstractC0463a0.e.c.VISIBLE) {
                this.f3252c = z ? eVar.m3585f().getReenterTransition() : eVar.m3585f().getEnterTransition();
                this.f3253d = z ? eVar.m3585f().getAllowReturnTransitionOverlap() : eVar.m3585f().getAllowEnterTransitionOverlap();
            } else {
                this.f3252c = z ? eVar.m3585f().getReturnTransition() : eVar.m3585f().getExitTransition();
                this.f3253d = true;
            }
            if (!z2) {
                this.f3254e = null;
            } else if (z) {
                this.f3254e = eVar.m3585f().getSharedElementReturnTransition();
            } else {
                this.f3254e = eVar.m3585f().getSharedElementEnterTransition();
            }
        }

        /* renamed from: f */
        private AbstractC0488x m3605f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0488x abstractC0488x = C0486v.f3344b;
            if (abstractC0488x != null && abstractC0488x.mo3780e(obj)) {
                return abstractC0488x;
            }
            AbstractC0488x abstractC0488x2 = C0486v.f3345c;
            if (abstractC0488x2 != null && abstractC0488x2.mo3780e(obj)) {
                return abstractC0488x2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m3602b().m3585f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC0488x m3606e() {
            AbstractC0488x abstractC0488xM3605f = m3605f(this.f3252c);
            AbstractC0488x abstractC0488xM3605f2 = m3605f(this.f3254e);
            if (abstractC0488xM3605f == null || abstractC0488xM3605f2 == null || abstractC0488xM3605f == abstractC0488xM3605f2) {
                return abstractC0488xM3605f != null ? abstractC0488xM3605f : abstractC0488xM3605f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m3602b().m3585f() + " returned Transition " + this.f3252c + " which uses a different Transition  type than its shared element transition " + this.f3254e);
        }

        /* renamed from: g */
        public Object m3607g() {
            return this.f3254e;
        }

        /* renamed from: h */
        Object m3608h() {
            return this.f3252c;
        }

        /* renamed from: i */
        public boolean m3609i() {
            return this.f3254e != null;
        }

        /* renamed from: j */
        boolean m3610j() {
            return this.f3253d;
        }
    }

    C0464b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m3594w(List<k> list, List<AbstractC0463a0.e> list2, boolean z, Map<AbstractC0463a0.e, Boolean> map) {
        ViewGroup viewGroupM3576m = m3576m();
        Context context = viewGroupM3576m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.m3604d()) {
                kVar.m3601a();
            } else {
                C0469e.d dVarM3600e = kVar.m3600e(context);
                if (dVarM3600e == null) {
                    kVar.m3601a();
                } else {
                    Animator animator = dVarM3600e.f3276b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        AbstractC0463a0.e eVarM3602b = kVar.m3602b();
                        Fragment fragmentM3585f = eVarM3602b.m3585f();
                        if (Boolean.TRUE.equals(map.get(eVarM3602b))) {
                            if (FragmentManager.m3392H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentM3585f + " as this Fragment was involved in a Transition.");
                            }
                            kVar.m3601a();
                        } else {
                            boolean z3 = eVarM3602b.m3584e() == AbstractC0463a0.e.c.GONE;
                            if (z3) {
                                list2.remove(eVarM3602b);
                            }
                            View view = fragmentM3585f.mView;
                            viewGroupM3576m.startViewTransition(view);
                            animator.addListener(new c(viewGroupM3576m, view, z3, eVarM3602b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m3603c().m1837c(new d(animator));
                            z2 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            AbstractC0463a0.e eVarM3602b2 = kVar2.m3602b();
            Fragment fragmentM3585f2 = eVarM3602b2.m3585f();
            if (z) {
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM3585f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.m3601a();
            } else if (z2) {
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM3585f2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.m3601a();
            } else {
                View view2 = fragmentM3585f2.mView;
                Animation animation = (Animation) C0959i.m6065c(((C0469e.d) C0959i.m6065c(kVar2.m3600e(context))).f3275a);
                if (eVarM3602b2.m3584e() != AbstractC0463a0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m3601a();
                } else {
                    viewGroupM3576m.startViewTransition(view2);
                    C0469e.e eVar = new C0469e.e(animation, viewGroupM3576m, view2);
                    eVar.setAnimationListener(new e(viewGroupM3576m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m3603c().m1837c(new f(view2, viewGroupM3576m, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private Map<AbstractC0463a0.e, Boolean> m3595x(List<m> list, boolean z, AbstractC0463a0.e eVar, AbstractC0463a0.e eVar2) {
        Iterator<m> it;
        View view;
        AbstractC0463a0.e eVar3;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC0463a0.e eVar4;
        View view2;
        C0867a c0867a;
        ArrayList<View> arrayList3;
        AbstractC0463a0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        AbstractC0488x abstractC0488x;
        AbstractC0463a0.e eVar6;
        View view3;
        AbstractC0251o enterTransitionCallback;
        AbstractC0251o exitTransitionCallback;
        View view4;
        View view5;
        boolean z2 = z;
        AbstractC0463a0.e eVar7 = eVar;
        AbstractC0463a0.e eVar8 = eVar2;
        HashMap map = new HashMap();
        AbstractC0488x abstractC0488x2 = null;
        for (m mVar : list) {
            if (!mVar.m3604d()) {
                AbstractC0488x abstractC0488xM3606e = mVar.m3606e();
                if (abstractC0488x2 == null) {
                    abstractC0488x2 = abstractC0488xM3606e;
                } else if (abstractC0488xM3606e != null && abstractC0488x2 != abstractC0488xM3606e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m3602b().m3585f() + " returned Transition " + mVar.m3608h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC0488x2 == null) {
            for (m mVar2 : list) {
                map.put(mVar2.m3602b(), Boolean.FALSE);
                mVar2.m3601a();
            }
            return map;
        }
        View view6 = new View(m3576m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C0867a c0867a2 = new C0867a();
        Object obj3 = null;
        View view7 = null;
        boolean z3 = false;
        for (m mVar3 : list) {
            if (!mVar3.m3609i() || eVar7 == null || eVar8 == null) {
                c0867a = c0867a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                abstractC0488x = abstractC0488x2;
                eVar6 = eVar8;
                view3 = view6;
                view7 = view7;
            } else {
                Object objMo3776B = abstractC0488x2.mo3776B(abstractC0488x2.mo3781g(mVar3.m3607g()));
                ArrayList<String> sharedElementSourceNames = eVar2.m3585f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m3585f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.m3585f().getSharedElementTargetNames();
                View view8 = view7;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m3585f().getSharedElementTargetNames();
                if (z2) {
                    enterTransitionCallback = eVar.m3585f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.m3585f().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.m3585f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.m3585f().getEnterTransitionCallback();
                }
                int i3 = 0;
                for (int size = sharedElementSourceNames.size(); i3 < size; size = size) {
                    c0867a2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                }
                C0867a<String, View> c0867a3 = new C0867a<>();
                m3598u(c0867a3, eVar.m3585f().mView);
                c0867a3.m5410p(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    throw null;
                }
                c0867a2.m5410p(c0867a3.keySet());
                C0867a<String, View> c0867a4 = new C0867a<>();
                m3598u(c0867a4, eVar2.m3585f().mView);
                c0867a4.m5410p(sharedElementTargetNames2);
                c0867a4.m5410p(c0867a2.values());
                if (exitTransitionCallback != null) {
                    throw null;
                }
                C0486v.m3771x(c0867a2, c0867a4);
                m3599v(c0867a3, c0867a2.keySet());
                m3599v(c0867a4, c0867a2.values());
                if (c0867a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    eVar5 = eVar;
                    c0867a = c0867a2;
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    abstractC0488x = abstractC0488x2;
                    view7 = view8;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    C0486v.m3753f(eVar2.m3585f(), eVar.m3585f(), z2, c0867a3, true);
                    HashMap map2 = map;
                    View view9 = view6;
                    Rect rect3 = rect2;
                    c0867a = c0867a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC0308r.m2080a(m3576m(), new g(eVar2, eVar, z, c0867a4));
                    Iterator<View> it2 = c0867a3.values().iterator();
                    while (it2.hasNext()) {
                        m3597t(arrayList5, it2.next());
                    }
                    if (sharedElementSourceNames.isEmpty()) {
                        view7 = view8;
                    } else {
                        View view10 = (View) c0867a3.get(sharedElementSourceNames.get(0));
                        abstractC0488x2.mo3789v(objMo3776B, view10);
                        view7 = view10;
                    }
                    Iterator<View> it3 = c0867a4.values().iterator();
                    while (it3.hasNext()) {
                        m3597t(arrayList8, it3.next());
                    }
                    arrayList3 = arrayList8;
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) c0867a4.get(sharedElementTargetNames2.get(0))) == null) {
                        rect = rect3;
                        view4 = view9;
                    } else {
                        rect = rect3;
                        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(m3576m(), new h(abstractC0488x2, view5, rect));
                        view4 = view9;
                        z3 = true;
                    }
                    abstractC0488x2.mo3791z(objMo3776B, view4, arrayList5);
                    arrayList4 = arrayList5;
                    view3 = view4;
                    abstractC0488x = abstractC0488x2;
                    abstractC0488x2.mo3787t(objMo3776B, null, null, null, null, objMo3776B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map = map2;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objMo3776B;
                }
            }
            z2 = z;
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view6 = view3;
            eVar8 = eVar6;
            c0867a2 = c0867a;
            arrayList6 = arrayList3;
            abstractC0488x2 = abstractC0488x;
        }
        View view11 = view7;
        C0867a c0867a5 = c0867a2;
        ArrayList<View> arrayList9 = arrayList6;
        AbstractC0463a0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect4 = rect2;
        AbstractC0488x abstractC0488x3 = abstractC0488x2;
        AbstractC0463a0.e eVar10 = eVar8;
        View view12 = view6;
        ArrayList arrayList11 = new ArrayList();
        Iterator<m> it4 = list.iterator();
        Object objMo3783n = null;
        Object objMo3783n2 = null;
        while (it4.hasNext()) {
            m next = it4.next();
            if (next.m3604d()) {
                map.put(next.m3602b(), Boolean.FALSE);
                next.m3601a();
            } else {
                Object objMo3781g = abstractC0488x3.mo3781g(next.m3608h());
                AbstractC0463a0.e eVarM3602b = next.m3602b();
                boolean z4 = obj3 != null && (eVarM3602b == eVar9 || eVarM3602b == eVar10);
                if (objMo3781g == null) {
                    if (!z4) {
                        map.put(eVarM3602b, Boolean.FALSE);
                        next.m3601a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    it = it4;
                    view = view12;
                    eVar4 = eVar10;
                    view2 = view11;
                } else {
                    it = it4;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj4 = objMo3783n;
                    m3597t(arrayList12, eVarM3602b.m3585f().mView);
                    if (z4) {
                        if (eVarM3602b == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC0488x3.mo3777a(objMo3781g, view12);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view12;
                        eVar3 = eVarM3602b;
                        obj2 = objMo3783n2;
                        eVar4 = eVar10;
                        obj = obj4;
                    } else {
                        abstractC0488x3.mo3778b(objMo3781g, arrayList12);
                        view = view12;
                        eVar3 = eVarM3602b;
                        obj = obj4;
                        arrayList = arrayList10;
                        obj2 = objMo3783n2;
                        arrayList2 = arrayList9;
                        eVar4 = eVar10;
                        abstractC0488x3.mo3787t(objMo3781g, objMo3781g, arrayList12, null, null, null, null);
                        if (eVar3.m3584e() == AbstractC0463a0.e.c.GONE) {
                            abstractC0488x3.mo3786r(objMo3781g, eVar3.m3585f().mView, arrayList12);
                            ViewTreeObserverOnPreDrawListenerC0308r.m2080a(m3576m(), new i(arrayList12));
                        }
                    }
                    if (eVar3.m3584e() == AbstractC0463a0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z3) {
                            abstractC0488x3.mo3788u(objMo3781g, rect4);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        abstractC0488x3.mo3789v(objMo3781g, view2);
                    }
                    map.put(eVar3, Boolean.TRUE);
                    if (next.m3610j()) {
                        objMo3783n2 = abstractC0488x3.mo3783n(obj2, objMo3781g, null);
                        objMo3783n = obj;
                    } else {
                        objMo3783n2 = obj2;
                        objMo3783n = abstractC0488x3.mo3783n(obj, objMo3781g, null);
                    }
                }
                eVar10 = eVar4;
                view11 = view2;
                view12 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                it4 = it;
            }
        }
        ArrayList<View> arrayList13 = arrayList9;
        ArrayList<View> arrayList14 = arrayList10;
        AbstractC0463a0.e eVar11 = eVar10;
        Object objMo3782m = abstractC0488x3.mo3782m(objMo3783n2, objMo3783n, obj3);
        for (m mVar4 : list) {
            if (!mVar4.m3604d()) {
                Object objM3608h = mVar4.m3608h();
                AbstractC0463a0.e eVarM3602b2 = mVar4.m3602b();
                boolean z5 = obj3 != null && (eVarM3602b2 == eVar9 || eVarM3602b2 == eVar11);
                if (objM3608h != null || z5) {
                    abstractC0488x3.mo3790w(mVar4.m3602b().m3585f(), objMo3782m, mVar4.m3603c(), new j(mVar4));
                }
            }
        }
        C0486v.m3746A(arrayList11, 4);
        ArrayList<String> arrayListM3799o = abstractC0488x3.m3799o(arrayList13);
        abstractC0488x3.mo3779c(m3576m(), objMo3782m);
        abstractC0488x3.m3802y(m3576m(), arrayList14, arrayList13, arrayListM3799o, c0867a5);
        C0486v.m3746A(arrayList11, 0);
        abstractC0488x3.mo3775A(obj3, arrayList14, arrayList13);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // androidx.fragment.app.AbstractC0463a0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo3571f(java.util.List<androidx.fragment.app.AbstractC0463a0.e> r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L43
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.a0$e r3 = (androidx.fragment.app.AbstractC0463a0.e) r3
            androidx.fragment.app.Fragment r5 = r3.m3585f()
            android.view.View r5 = r5.mView
            androidx.fragment.app.a0$e$c r5 = androidx.fragment.app.AbstractC0463a0.e.c.m3592q(r5)
            int[] r6 = androidx.fragment.app.C0464b.a.f3214a
            androidx.fragment.app.a0$e$c r7 = r3.m3584e()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            if (r6 == r4) goto L3b
            r4 = 2
            if (r6 == r4) goto L3b
            r4 = 3
            if (r6 == r4) goto L3b
            r4 = 4
            if (r6 == r4) goto L35
            goto L6
        L35:
            androidx.fragment.app.a0$e$c r4 = androidx.fragment.app.AbstractC0463a0.e.c.VISIBLE
            if (r5 == r4) goto L6
            r2 = r3
            goto L6
        L3b:
            androidx.fragment.app.a0$e$c r4 = androidx.fragment.app.AbstractC0463a0.e.c.VISIBLE
            if (r5 != r4) goto L6
            if (r1 != 0) goto L6
            r1 = r3
            goto L6
        L43:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L56:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r11.next()
            androidx.fragment.app.a0$e r6 = (androidx.fragment.app.AbstractC0463a0.e) r6
            androidx.core.os.b r7 = new androidx.core.os.b
            r7.<init>()
            r6.m3589j(r7)
            androidx.fragment.app.b$k r8 = new androidx.fragment.app.b$k
            r8.<init>(r6, r7)
            r0.add(r8)
            androidx.core.os.b r7 = new androidx.core.os.b
            r7.<init>()
            r6.m3589j(r7)
            androidx.fragment.app.b$m r8 = new androidx.fragment.app.b$m
            r9 = 0
            if (r12 == 0) goto L82
            if (r6 != r1) goto L85
            goto L84
        L82:
            if (r6 != r2) goto L85
        L84:
            r9 = 1
        L85:
            r8.<init>(r6, r7, r12, r9)
            r3.add(r8)
            androidx.fragment.app.b$b r7 = new androidx.fragment.app.b$b
            r7.<init>(r5, r6)
            r6.m3581a(r7)
            goto L56
        L94:
            java.util.Map r11 = r10.m3595x(r3, r12, r1, r2)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.m3594w(r0, r5, r12, r11)
            java.util.Iterator r11 = r5.iterator()
        La5:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb5
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.a0$e r12 = (androidx.fragment.app.AbstractC0463a0.e) r12
            r10.m3596s(r12)
            goto La5
        Lb5:
            r5.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0464b.mo3571f(java.util.List, boolean):void");
    }

    /* renamed from: s */
    void m3596s(AbstractC0463a0.e eVar) {
        eVar.m3584e().m3593g(eVar.m3585f().mView);
    }

    /* renamed from: t */
    void m3597t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C0313w.m2207a(viewGroup)) {
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m3597t(arrayList, childAt);
            }
        }
    }

    /* renamed from: u */
    void m3598u(Map<String, View> map, View view) {
        String strM2094G = C0311u.m2094G(view);
        if (strM2094G != null) {
            map.put(strM2094G, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    m3598u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m3599v(C0867a<String, View> c0867a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c0867a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0311u.m2094G(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
