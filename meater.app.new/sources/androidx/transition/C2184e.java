package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.AbstractC2190k;
import java.util.ArrayList;
import java.util.List;
import n1.e;

/* compiled from: FragmentTransitionSupport.java */
/* renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2184e extends androidx.fragment.app.F {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.e$a */
    class a extends AbstractC2190k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f29485a;

        a(Rect rect) {
            this.f29485a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.e$c */
    class c extends r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f29490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f29492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f29493d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f29494e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f29495f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f29490a = obj;
            this.f29491b = arrayList;
            this.f29492c = obj2;
            this.f29493d = arrayList2;
            this.f29494e = obj3;
            this.f29495f = arrayList3;
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
            Object obj = this.f29490a;
            if (obj != null) {
                C2184e.this.F(obj, this.f29491b, null);
            }
            Object obj2 = this.f29492c;
            if (obj2 != null) {
                C2184e.this.F(obj2, this.f29493d, null);
            }
            Object obj3 = this.f29494e;
            if (obj3 != null) {
                C2184e.this.F(obj3, this.f29495f, null);
            }
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            abstractC2190k.i0(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0410e extends AbstractC2190k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f29499a;

        C0410e(Rect rect) {
            this.f29499a = rect;
        }
    }

    private static boolean D(AbstractC2190k abstractC2190k) {
        return (androidx.fragment.app.F.l(abstractC2190k.I()) && androidx.fragment.app.F.l(abstractC2190k.J()) && androidx.fragment.app.F.l(abstractC2190k.L())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(Runnable runnable, AbstractC2190k abstractC2190k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC2190k.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.F
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.M().clear();
            vVar.M().addAll(arrayList2);
            F(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.F
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.A0((AbstractC2190k) obj);
        return vVar;
    }

    public void F(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC2190k abstractC2190k = (AbstractC2190k) obj;
        int i10 = 0;
        if (abstractC2190k instanceof v) {
            v vVar = (v) abstractC2190k;
            int iD0 = vVar.D0();
            while (i10 < iD0) {
                F(vVar.C0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(abstractC2190k)) {
            return;
        }
        List<View> listM = abstractC2190k.M();
        if (listM.size() == arrayList.size() && listM.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC2190k.f(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC2190k.j0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.F
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC2190k) obj).f(view);
        }
    }

    @Override // androidx.fragment.app.F
    public void b(Object obj, ArrayList<View> arrayList) {
        AbstractC2190k abstractC2190k = (AbstractC2190k) obj;
        if (abstractC2190k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC2190k instanceof v) {
            v vVar = (v) abstractC2190k;
            int iD0 = vVar.D0();
            while (i10 < iD0) {
                b(vVar.C0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(abstractC2190k) || !androidx.fragment.app.F.l(abstractC2190k.M())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC2190k.f(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.F
    public void c(Object obj) {
        ((u) obj).i();
    }

    @Override // androidx.fragment.app.F
    public void d(Object obj, Runnable runnable) {
        ((u) obj).j(runnable);
    }

    @Override // androidx.fragment.app.F
    public void e(ViewGroup viewGroup, Object obj) {
        s.a(viewGroup, (AbstractC2190k) obj);
    }

    @Override // androidx.fragment.app.F
    public boolean g(Object obj) {
        return obj instanceof AbstractC2190k;
    }

    @Override // androidx.fragment.app.F
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC2190k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.F
    public Object j(ViewGroup viewGroup, Object obj) {
        return s.b(viewGroup, (AbstractC2190k) obj);
    }

    @Override // androidx.fragment.app.F
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.F
    public boolean n(Object obj) {
        boolean zR = ((AbstractC2190k) obj).R();
        if (!zR) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zR;
    }

    @Override // androidx.fragment.app.F
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC2190k abstractC2190kK0 = (AbstractC2190k) obj;
        AbstractC2190k abstractC2190k = (AbstractC2190k) obj2;
        AbstractC2190k abstractC2190k2 = (AbstractC2190k) obj3;
        if (abstractC2190kK0 != null && abstractC2190k != null) {
            abstractC2190kK0 = new v().A0(abstractC2190kK0).A0(abstractC2190k).K0(1);
        } else if (abstractC2190kK0 == null) {
            abstractC2190kK0 = abstractC2190k != null ? abstractC2190k : null;
        }
        if (abstractC2190k2 == null) {
            return abstractC2190kK0;
        }
        v vVar = new v();
        if (abstractC2190kK0 != null) {
            vVar.A0(abstractC2190kK0);
        }
        vVar.A0(abstractC2190k2);
        return vVar;
    }

    @Override // androidx.fragment.app.F
    public Object p(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.A0((AbstractC2190k) obj);
        }
        if (obj2 != null) {
            vVar.A0((AbstractC2190k) obj2);
        }
        if (obj3 != null) {
            vVar.A0((AbstractC2190k) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.F
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC2190k) obj).d(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.F
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC2190k) obj).d(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.F
    public void t(Object obj, float f10) {
        u uVar = (u) obj;
        if (uVar.f()) {
            long jC = (long) (f10 * uVar.c());
            if (jC == 0) {
                jC = 1;
            }
            if (jC == uVar.c()) {
                jC = uVar.c() - 1;
            }
            uVar.e(jC);
        }
    }

    @Override // androidx.fragment.app.F
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC2190k) obj).p0(new C0410e(rect));
        }
    }

    @Override // androidx.fragment.app.F
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC2190k) obj).p0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.F
    public void w(Fragment fragment, Object obj, n1.e eVar, Runnable runnable) {
        x(fragment, obj, eVar, null, runnable);
    }

    @Override // androidx.fragment.app.F
    public void x(Fragment fragment, Object obj, n1.e eVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC2190k abstractC2190k = (AbstractC2190k) obj;
        eVar.b(new e.a() { // from class: androidx.transition.d
            @Override // n1.e.a
            public final void onCancel() {
                C2184e.E(runnable, abstractC2190k, runnable2);
            }
        });
        abstractC2190k.d(new d(runnable2));
    }

    @Override // androidx.fragment.app.F
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        v vVar = (v) obj;
        List<View> listM = vVar.M();
        listM.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.F.f(listM, arrayList.get(i10));
        }
        listM.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.e$b */
    class b implements AbstractC2190k.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29488b;

        b(View view, ArrayList arrayList) {
            this.f29487a = view;
            this.f29488b = arrayList;
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
            abstractC2190k.i0(this);
            abstractC2190k.d(this);
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            abstractC2190k.i0(this);
            this.f29487a.setVisibility(8);
            int size = this.f29488b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f29488b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: androidx.transition.e$d */
    class d implements AbstractC2190k.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f29497a;

        d(Runnable runnable) {
            this.f29497a = runnable;
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            this.f29497a.run();
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void d(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
        }

        @Override // androidx.transition.AbstractC2190k.h
        public void m(AbstractC2190k abstractC2190k) {
        }
    }
}
