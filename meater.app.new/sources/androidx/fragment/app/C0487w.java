package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0273b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
class C0487w extends AbstractC0488x {

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.w$a */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3386a;

        a(Rect rect) {
            this.f3386a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3386a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.w$b */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3388a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3389b;

        b(View view, ArrayList arrayList) {
            this.f3388a = view;
            this.f3389b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3388a.setVisibility(8);
            int size = this.f3389b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f3389b.get(i2)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.w$c */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3391a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3392b;

        /* renamed from: c */
        final /* synthetic */ Object f3393c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3394d;

        /* renamed from: e */
        final /* synthetic */ Object f3395e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3396f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3391a = obj;
            this.f3392b = arrayList;
            this.f3393c = obj2;
            this.f3394d = arrayList2;
            this.f3395e = obj3;
            this.f3396f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3391a;
            if (obj != null) {
                C0487w.this.mo3785q(obj, this.f3392b, null);
            }
            Object obj2 = this.f3393c;
            if (obj2 != null) {
                C0487w.this.mo3785q(obj2, this.f3394d, null);
            }
            Object obj3 = this.f3395e;
            if (obj3 != null) {
                C0487w.this.mo3785q(obj3, this.f3396f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.w$d */
    class d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3398a;

        d(Runnable runnable) {
            this.f3398a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3398a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.w$e */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3400a;

        e(Rect rect) {
            this.f3400a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3400a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3400a;
        }
    }

    C0487w() {
    }

    /* renamed from: C */
    private static boolean m3774C(Transition transition) {
        return (AbstractC0488x.m3795l(transition.getTargetIds()) && AbstractC0488x.m3795l(transition.getTargetNames()) && AbstractC0488x.m3795l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: A */
    public void mo3775A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3785q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: B */
    public Object mo3776B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: a */
    public void mo3777a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: b */
    public void mo3778b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo3778b(transitionSet.getTransitionAt(i2), arrayList);
                i2++;
            }
            return;
        }
        if (m3774C(transition) || !AbstractC0488x.m3795l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            transition.addTarget(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: c */
    public void mo3779c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: e */
    public boolean mo3780e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: g */
    public Object mo3781g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: m */
    public Object mo3782m(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: n */
    public Object mo3783n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: p */
    public void mo3784p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: q */
    public void mo3785q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo3785q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (m3774C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i2 < size) {
            transition.addTarget(arrayList2.get(i2));
            i2++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: r */
    public void mo3786r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: t */
    public void mo3787t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: u */
    public void mo3788u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: v */
    public void mo3789v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m3798k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: w */
    public void mo3790w(Fragment fragment, Object obj, C0273b c0273b, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: z */
    public void mo3791z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0488x.m3792d(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        mo3778b(transitionSet, arrayList);
    }
}
