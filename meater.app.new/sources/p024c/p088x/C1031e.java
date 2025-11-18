package p024c.p088x;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0488x;
import java.util.ArrayList;
import java.util.List;
import p024c.p088x.AbstractC1047m;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* renamed from: c.x.e */
/* loaded from: classes.dex */
public class C1031e extends AbstractC0488x {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c.x.e$a */
    class a extends AbstractC1047m.e {

        /* renamed from: a */
        final /* synthetic */ Rect f6816a;

        a(Rect rect) {
            this.f6816a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c.x.e$b */
    class b implements AbstractC1047m.f {

        /* renamed from: a */
        final /* synthetic */ View f6818a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6819b;

        b(View view, ArrayList arrayList) {
            this.f6818a = view;
            this.f6819b = arrayList;
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: a */
        public void mo6584a(AbstractC1047m abstractC1047m) {
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: b */
        public void mo6554b(AbstractC1047m abstractC1047m) {
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            abstractC1047m.mo6628T(this);
            this.f6818a.setVisibility(8);
            int size = this.f6819b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f6819b.get(i2)).setVisibility(0);
            }
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: d */
        public void mo6556d(AbstractC1047m abstractC1047m) {
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: e */
        public void mo6557e(AbstractC1047m abstractC1047m) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c.x.e$c */
    class c extends C1049n {

        /* renamed from: a */
        final /* synthetic */ Object f6821a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6822b;

        /* renamed from: c */
        final /* synthetic */ Object f6823c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f6824d;

        /* renamed from: e */
        final /* synthetic */ Object f6825e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f6826f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6821a = obj;
            this.f6822b = arrayList;
            this.f6823c = obj2;
            this.f6824d = arrayList2;
            this.f6825e = obj3;
            this.f6826f = arrayList3;
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: a */
        public void mo6584a(AbstractC1047m abstractC1047m) {
            Object obj = this.f6821a;
            if (obj != null) {
                C1031e.this.mo3785q(obj, this.f6822b, null);
            }
            Object obj2 = this.f6823c;
            if (obj2 != null) {
                C1031e.this.mo3785q(obj2, this.f6824d, null);
            }
            Object obj3 = this.f6825e;
            if (obj3 != null) {
                C1031e.this.mo3785q(obj3, this.f6826f, null);
            }
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            abstractC1047m.mo6628T(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c.x.e$d */
    class d extends AbstractC1047m.e {

        /* renamed from: a */
        final /* synthetic */ Rect f6828a;

        d(Rect rect) {
            this.f6828a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m6583C(AbstractC1047m abstractC1047m) {
        return (AbstractC0488x.m3795l(abstractC1047m.m6620D()) && AbstractC0488x.m3795l(abstractC1047m.m6621E()) && AbstractC0488x.m3795l(abstractC1047m.m6622F())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: A */
    public void mo3775A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1052q c1052q = (C1052q) obj;
        if (c1052q != null) {
            c1052q.m6623G().clear();
            c1052q.m6623G().addAll(arrayList2);
            mo3785q(c1052q, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: B */
    public Object mo3776B(Object obj) {
        if (obj == null) {
            return null;
        }
        C1052q c1052q = new C1052q();
        c1052q.m6664m0((AbstractC1047m) obj);
        return c1052q;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: a */
    public void mo3777a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1047m) obj).mo6636d(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: b */
    public void mo3778b(Object obj, ArrayList<View> arrayList) {
        AbstractC1047m abstractC1047m = (AbstractC1047m) obj;
        if (abstractC1047m == null) {
            return;
        }
        int i2 = 0;
        if (abstractC1047m instanceof C1052q) {
            C1052q c1052q = (C1052q) abstractC1047m;
            int iM6666q0 = c1052q.m6666q0();
            while (i2 < iM6666q0) {
                mo3778b(c1052q.m6665o0(i2), arrayList);
                i2++;
            }
            return;
        }
        if (m6583C(abstractC1047m) || !AbstractC0488x.m3795l(abstractC1047m.m6623G())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            abstractC1047m.mo6636d(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: c */
    public void mo3779c(ViewGroup viewGroup, Object obj) {
        C1050o.m6655a(viewGroup, (AbstractC1047m) obj);
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: e */
    public boolean mo3780e(Object obj) {
        return obj instanceof AbstractC1047m;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: g */
    public Object mo3781g(Object obj) {
        if (obj != null) {
            return ((AbstractC1047m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: m */
    public Object mo3782m(Object obj, Object obj2, Object obj3) {
        AbstractC1047m abstractC1047mM6671v0 = (AbstractC1047m) obj;
        AbstractC1047m abstractC1047m = (AbstractC1047m) obj2;
        AbstractC1047m abstractC1047m2 = (AbstractC1047m) obj3;
        if (abstractC1047mM6671v0 != null && abstractC1047m != null) {
            abstractC1047mM6671v0 = new C1052q().m6664m0(abstractC1047mM6671v0).m6664m0(abstractC1047m).m6671v0(1);
        } else if (abstractC1047mM6671v0 == null) {
            abstractC1047mM6671v0 = abstractC1047m != null ? abstractC1047m : null;
        }
        if (abstractC1047m2 == null) {
            return abstractC1047mM6671v0;
        }
        C1052q c1052q = new C1052q();
        if (abstractC1047mM6671v0 != null) {
            c1052q.m6664m0(abstractC1047mM6671v0);
        }
        c1052q.m6664m0(abstractC1047m2);
        return c1052q;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: n */
    public Object mo3783n(Object obj, Object obj2, Object obj3) {
        C1052q c1052q = new C1052q();
        if (obj != null) {
            c1052q.m6664m0((AbstractC1047m) obj);
        }
        if (obj2 != null) {
            c1052q.m6664m0((AbstractC1047m) obj2);
        }
        if (obj3 != null) {
            c1052q.m6664m0((AbstractC1047m) obj3);
        }
        return c1052q;
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: p */
    public void mo3784p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1047m) obj).mo6629U(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: q */
    public void mo3785q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1047m abstractC1047m = (AbstractC1047m) obj;
        int i2 = 0;
        if (abstractC1047m instanceof C1052q) {
            C1052q c1052q = (C1052q) abstractC1047m;
            int iM6666q0 = c1052q.m6666q0();
            while (i2 < iM6666q0) {
                mo3785q(c1052q.m6665o0(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (m6583C(abstractC1047m)) {
            return;
        }
        List<View> listM6623G = abstractC1047m.m6623G();
        if (listM6623G.size() == arrayList.size() && listM6623G.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                abstractC1047m.mo6636d(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1047m.mo6629U(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: r */
    public void mo3786r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC1047m) obj).mo6633b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: t */
    public void mo3787t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC1047m) obj).mo6633b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: u */
    public void mo3788u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1047m) obj).mo6634b0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: v */
    public void mo3789v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m3798k(view, rect);
            ((AbstractC1047m) obj).mo6634b0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0488x
    /* renamed from: z */
    public void mo3791z(Object obj, View view, ArrayList<View> arrayList) {
        C1052q c1052q = (C1052q) obj;
        List<View> listM6623G = c1052q.m6623G();
        listM6623G.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0488x.m3792d(listM6623G, arrayList.get(i2));
        }
        listM6623G.add(view);
        arrayList.add(view);
        mo3778b(c1052q, arrayList);
    }
}
