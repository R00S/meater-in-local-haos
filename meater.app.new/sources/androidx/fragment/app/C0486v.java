package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC0251o;
import androidx.core.os.C0273b;
import androidx.core.view.C0311u;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0308r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p024c.p041e.C0867a;

/* compiled from: FragmentTransition.java */
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
class C0486v {

    /* renamed from: a */
    private static final int[] f3343a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC0488x f3344b;

    /* renamed from: c */
    static final AbstractC0488x f3345c;

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ g f3346f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3347g;

        /* renamed from: h */
        final /* synthetic */ C0273b f3348h;

        a(g gVar, Fragment fragment, C0273b c0273b) {
            this.f3346f = gVar;
            this.f3347g = fragment;
            this.f3348h = c0273b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3346f.mo3522a(this.f3347g, this.f3348h);
        }
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3349f;

        b(ArrayList arrayList) {
            this.f3349f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486v.m3746A(this.f3349f, 4);
        }
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$c */
    class c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ g f3350f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3351g;

        /* renamed from: h */
        final /* synthetic */ C0273b f3352h;

        c(g gVar, Fragment fragment, C0273b c0273b) {
            this.f3350f = gVar;
            this.f3351g = fragment;
            this.f3352h = c0273b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3350f.mo3522a(this.f3351g, this.f3352h);
        }
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$d */
    class d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f3353f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0488x f3354g;

        /* renamed from: h */
        final /* synthetic */ View f3355h;

        /* renamed from: i */
        final /* synthetic */ Fragment f3356i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3357j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3358k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f3359l;

        /* renamed from: m */
        final /* synthetic */ Object f3360m;

        d(Object obj, AbstractC0488x abstractC0488x, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3353f = obj;
            this.f3354g = abstractC0488x;
            this.f3355h = view;
            this.f3356i = fragment;
            this.f3357j = arrayList;
            this.f3358k = arrayList2;
            this.f3359l = arrayList3;
            this.f3360m = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3353f;
            if (obj != null) {
                this.f3354g.mo3784p(obj, this.f3355h);
                this.f3358k.addAll(C0486v.m3758k(this.f3354g, this.f3353f, this.f3356i, this.f3357j, this.f3355h));
            }
            if (this.f3359l != null) {
                if (this.f3360m != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3355h);
                    this.f3354g.mo3785q(this.f3360m, this.f3359l, arrayList);
                }
                this.f3359l.clear();
                this.f3359l.add(this.f3355h);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$e */
    class e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f3361f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3362g;

        /* renamed from: h */
        final /* synthetic */ boolean f3363h;

        /* renamed from: i */
        final /* synthetic */ C0867a f3364i;

        /* renamed from: j */
        final /* synthetic */ View f3365j;

        /* renamed from: k */
        final /* synthetic */ AbstractC0488x f3366k;

        /* renamed from: l */
        final /* synthetic */ Rect f3367l;

        e(Fragment fragment, Fragment fragment2, boolean z, C0867a c0867a, View view, AbstractC0488x abstractC0488x, Rect rect) {
            this.f3361f = fragment;
            this.f3362g = fragment2;
            this.f3363h = z;
            this.f3364i = c0867a;
            this.f3365j = view;
            this.f3366k = abstractC0488x;
            this.f3367l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0486v.m3753f(this.f3361f, this.f3362g, this.f3363h, this.f3364i, false);
            View view = this.f3365j;
            if (view != null) {
                this.f3366k.m3798k(view, this.f3367l);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$f */
    class f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC0488x f3368f;

        /* renamed from: g */
        final /* synthetic */ C0867a f3369g;

        /* renamed from: h */
        final /* synthetic */ Object f3370h;

        /* renamed from: i */
        final /* synthetic */ h f3371i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3372j;

        /* renamed from: k */
        final /* synthetic */ View f3373k;

        /* renamed from: l */
        final /* synthetic */ Fragment f3374l;

        /* renamed from: m */
        final /* synthetic */ Fragment f3375m;

        /* renamed from: n */
        final /* synthetic */ boolean f3376n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f3377o;

        /* renamed from: p */
        final /* synthetic */ Object f3378p;

        /* renamed from: q */
        final /* synthetic */ Rect f3379q;

        f(AbstractC0488x abstractC0488x, C0867a c0867a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3368f = abstractC0488x;
            this.f3369g = c0867a;
            this.f3370h = obj;
            this.f3371i = hVar;
            this.f3372j = arrayList;
            this.f3373k = view;
            this.f3374l = fragment;
            this.f3375m = fragment2;
            this.f3376n = z;
            this.f3377o = arrayList2;
            this.f3378p = obj2;
            this.f3379q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0867a<String, View> c0867aM3755h = C0486v.m3755h(this.f3368f, this.f3369g, this.f3370h, this.f3371i);
            if (c0867aM3755h != null) {
                this.f3372j.addAll(c0867aM3755h.values());
                this.f3372j.add(this.f3373k);
            }
            C0486v.m3753f(this.f3374l, this.f3375m, this.f3376n, c0867aM3755h, false);
            Object obj = this.f3370h;
            if (obj != null) {
                this.f3368f.mo3775A(obj, this.f3377o, this.f3372j);
                View viewM3766s = C0486v.m3766s(c0867aM3755h, this.f3371i, this.f3378p, this.f3376n);
                if (viewM3766s != null) {
                    this.f3368f.m3798k(viewM3766s, this.f3379q);
                }
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$g */
    interface g {
        /* renamed from: a */
        void mo3522a(Fragment fragment, C0273b c0273b);

        /* renamed from: b */
        void mo3523b(Fragment fragment, C0273b c0273b);
    }

    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.v$h */
    static class h {

        /* renamed from: a */
        public Fragment f3380a;

        /* renamed from: b */
        public boolean f3381b;

        /* renamed from: c */
        public C0462a f3382c;

        /* renamed from: d */
        public Fragment f3383d;

        /* renamed from: e */
        public boolean f3384e;

        /* renamed from: f */
        public C0462a f3385f;

        h() {
        }
    }

    static {
        f3344b = Build.VERSION.SDK_INT >= 21 ? new C0487w() : null;
        f3345c = m3770w();
    }

    /* renamed from: A */
    static void m3746A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    /* renamed from: B */
    static void m3747B(Context context, AbstractC0470f abstractC0470f, ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            C0462a c0462a = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                m3752e(c0462a, sparseArray, z);
            } else {
                m3750c(c0462a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                C0867a<String, String> c0867aM3751d = m3751d(iKeyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (abstractC0470f.mo3384d() && (viewGroup = (ViewGroup) abstractC0470f.mo3383c(iKeyAt)) != null) {
                    if (z) {
                        m3762o(viewGroup, hVar, view, c0867aM3751d, gVar);
                    } else {
                        m3761n(viewGroup, hVar, view, c0867aM3751d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3748a(ArrayList<View> arrayList, C0867a<String, View> c0867a, Collection<String> collection) {
        for (int size = c0867a.size() - 1; size >= 0; size--) {
            View viewM5477n = c0867a.m5477n(size);
            if (collection.contains(C0311u.m2094G(viewM5477n))) {
                arrayList.add(viewM5477n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m3749b(androidx.fragment.app.C0462a r8, androidx.fragment.app.AbstractC0485u.a r9, android.util.SparseArray<androidx.fragment.app.C0486v.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0486v.m3749b(androidx.fragment.app.a, androidx.fragment.app.u$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m3750c(C0462a c0462a, SparseArray<h> sparseArray, boolean z) {
        int size = c0462a.f3318c.size();
        for (int i2 = 0; i2 < size; i2++) {
            m3749b(c0462a, c0462a.f3318c.get(i2), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C0867a<String, String> m3751d(int i2, ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0867a<String, String> c0867a = new C0867a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            C0462a c0462a = arrayList.get(i5);
            if (c0462a.m3542C(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = c0462a.f3331p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = c0462a.f3331p;
                        arrayList4 = c0462a.f3332q;
                    } else {
                        ArrayList<String> arrayList6 = c0462a.f3331p;
                        arrayList3 = c0462a.f3332q;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = c0867a.remove(str2);
                        if (strRemove != null) {
                            c0867a.put(str, strRemove);
                        } else {
                            c0867a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0867a;
    }

    /* renamed from: e */
    public static void m3752e(C0462a c0462a, SparseArray<h> sparseArray, boolean z) {
        if (c0462a.f3182t.m3501q0().mo3384d()) {
            for (int size = c0462a.f3318c.size() - 1; size >= 0; size--) {
                m3749b(c0462a, c0462a.f3318c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m3753f(Fragment fragment, Fragment fragment2, boolean z, C0867a<String, View> c0867a, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0867a == null ? 0 : c0867a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(c0867a.m5473j(i2));
                arrayList.add(c0867a.m5477n(i2));
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: g */
    private static boolean m3754g(AbstractC0488x abstractC0488x, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!abstractC0488x.mo3780e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C0867a<String, View> m3755h(AbstractC0488x abstractC0488x, C0867a<String, String> c0867a, Object obj, h hVar) {
        AbstractC0251o enterTransitionCallback;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3380a;
        View view = fragment.getView();
        if (c0867a.isEmpty() || obj == null || view == null) {
            c0867a.clear();
            return null;
        }
        C0867a<String, View> c0867a2 = new C0867a<>();
        abstractC0488x.m3797j(c0867a2, view);
        C0462a c0462a = hVar.f3382c;
        if (hVar.f3381b) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0462a.f3331p;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0462a.f3332q;
        }
        if (arrayList != null) {
            c0867a2.m5410p(arrayList);
            c0867a2.m5410p(c0867a.values());
        }
        if (enterTransitionCallback != null) {
            throw null;
        }
        m3771x(c0867a, c0867a2);
        return c0867a2;
    }

    /* renamed from: i */
    private static C0867a<String, View> m3756i(AbstractC0488x abstractC0488x, C0867a<String, String> c0867a, Object obj, h hVar) {
        AbstractC0251o exitTransitionCallback;
        ArrayList<String> arrayList;
        if (c0867a.isEmpty() || obj == null) {
            c0867a.clear();
            return null;
        }
        Fragment fragment = hVar.f3383d;
        C0867a<String, View> c0867a2 = new C0867a<>();
        abstractC0488x.m3797j(c0867a2, fragment.requireView());
        C0462a c0462a = hVar.f3385f;
        if (hVar.f3384e) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0462a.f3332q;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0462a.f3331p;
        }
        if (arrayList != null) {
            c0867a2.m5410p(arrayList);
        }
        if (exitTransitionCallback != null) {
            throw null;
        }
        c0867a.m5410p(c0867a2.keySet());
        return c0867a2;
    }

    /* renamed from: j */
    private static AbstractC0488x m3757j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0488x abstractC0488x = f3344b;
        if (abstractC0488x != null && m3754g(abstractC0488x, arrayList)) {
            return abstractC0488x;
        }
        AbstractC0488x abstractC0488x2 = f3345c;
        if (abstractC0488x2 != null && m3754g(abstractC0488x2, arrayList)) {
            return abstractC0488x2;
        }
        if (abstractC0488x == null && abstractC0488x2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m3758k(AbstractC0488x abstractC0488x, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            abstractC0488x.m3796f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0488x.mo3778b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m3759l(AbstractC0488x abstractC0488x, ViewGroup viewGroup, View view, C0867a<String, String> c0867a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objM3767t;
        C0867a<String, String> c0867a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f3380a;
        Fragment fragment2 = hVar.f3383d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f3381b;
        if (c0867a.isEmpty()) {
            c0867a2 = c0867a;
            objM3767t = null;
        } else {
            objM3767t = m3767t(abstractC0488x, fragment, fragment2, z);
            c0867a2 = c0867a;
        }
        C0867a<String, View> c0867aM3756i = m3756i(abstractC0488x, c0867a2, objM3767t, hVar);
        if (c0867a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(c0867aM3756i.values());
            obj3 = objM3767t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m3753f(fragment, fragment2, z, c0867aM3756i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0488x.mo3791z(obj3, view, arrayList);
            m3773z(abstractC0488x, obj3, obj2, c0867aM3756i, hVar.f3384e, hVar.f3385f);
            if (obj != null) {
                abstractC0488x.mo3788u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(viewGroup, new f(abstractC0488x, c0867a, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m3760m(AbstractC0488x abstractC0488x, ViewGroup viewGroup, View view, C0867a<String, String> c0867a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3380a;
        Fragment fragment2 = hVar.f3383d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f3381b;
        Object objM3767t = c0867a.isEmpty() ? null : m3767t(abstractC0488x, fragment, fragment2, z);
        C0867a<String, View> c0867aM3756i = m3756i(abstractC0488x, c0867a, objM3767t, hVar);
        C0867a<String, View> c0867aM3755h = m3755h(abstractC0488x, c0867a, objM3767t, hVar);
        if (c0867a.isEmpty()) {
            if (c0867aM3756i != null) {
                c0867aM3756i.clear();
            }
            if (c0867aM3755h != null) {
                c0867aM3755h.clear();
            }
            obj3 = null;
        } else {
            m3748a(arrayList, c0867aM3756i, c0867a.keySet());
            m3748a(arrayList2, c0867aM3755h, c0867a.values());
            obj3 = objM3767t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m3753f(fragment, fragment2, z, c0867aM3756i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0488x.mo3791z(obj3, view, arrayList);
            m3773z(abstractC0488x, obj3, obj2, c0867aM3756i, hVar.f3384e, hVar.f3385f);
            Rect rect2 = new Rect();
            View viewM3766s = m3766s(c0867aM3755h, hVar, obj, z);
            if (viewM3766s != null) {
                abstractC0488x.mo3788u(obj, rect2);
            }
            rect = rect2;
            view2 = viewM3766s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(viewGroup, new e(fragment, fragment2, z, c0867aM3755h, view2, abstractC0488x, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m3761n(ViewGroup viewGroup, h hVar, View view, C0867a<String, String> c0867a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3380a;
        Fragment fragment2 = hVar.f3383d;
        AbstractC0488x abstractC0488xM3757j = m3757j(fragment2, fragment);
        if (abstractC0488xM3757j == null) {
            return;
        }
        boolean z = hVar.f3381b;
        boolean z2 = hVar.f3384e;
        Object objM3764q = m3764q(abstractC0488xM3757j, fragment, z);
        Object objM3765r = m3765r(abstractC0488xM3757j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM3759l = m3759l(abstractC0488xM3757j, viewGroup, view, c0867a, hVar, arrayList, arrayList2, objM3764q, objM3765r);
        if (objM3764q == null && objM3759l == null) {
            obj = objM3765r;
            if (obj == null) {
                return;
            }
        } else {
            obj = objM3765r;
        }
        ArrayList<View> arrayListM3758k = m3758k(abstractC0488xM3757j, obj, fragment2, arrayList, view);
        if (arrayListM3758k == null || arrayListM3758k.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        abstractC0488xM3757j.mo3777a(objM3764q, view);
        Object objM3768u = m3768u(abstractC0488xM3757j, objM3764q, obj2, objM3759l, fragment, hVar.f3381b);
        if (fragment2 != null && arrayListM3758k != null && (arrayListM3758k.size() > 0 || arrayList.size() > 0)) {
            C0273b c0273b = new C0273b();
            gVar.mo3523b(fragment2, c0273b);
            abstractC0488xM3757j.mo3790w(fragment2, objM3768u, c0273b, new c(gVar, fragment2, c0273b));
        }
        if (objM3768u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            abstractC0488xM3757j.mo3787t(objM3768u, objM3764q, arrayList3, obj2, arrayListM3758k, objM3759l, arrayList2);
            m3772y(abstractC0488xM3757j, viewGroup, fragment, view, arrayList2, objM3764q, arrayList3, obj2, arrayListM3758k);
            abstractC0488xM3757j.m3801x(viewGroup, arrayList2, c0867a);
            abstractC0488xM3757j.mo3779c(viewGroup, objM3768u);
            abstractC0488xM3757j.m3800s(viewGroup, arrayList2, c0867a);
        }
    }

    /* renamed from: o */
    private static void m3762o(ViewGroup viewGroup, h hVar, View view, C0867a<String, String> c0867a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3380a;
        Fragment fragment2 = hVar.f3383d;
        AbstractC0488x abstractC0488xM3757j = m3757j(fragment2, fragment);
        if (abstractC0488xM3757j == null) {
            return;
        }
        boolean z = hVar.f3381b;
        boolean z2 = hVar.f3384e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM3764q = m3764q(abstractC0488xM3757j, fragment, z);
        Object objM3765r = m3765r(abstractC0488xM3757j, fragment2, z2);
        Object objM3760m = m3760m(abstractC0488xM3757j, viewGroup, view, c0867a, hVar, arrayList2, arrayList, objM3764q, objM3765r);
        if (objM3764q == null && objM3760m == null) {
            obj = objM3765r;
            if (obj == null) {
                return;
            }
        } else {
            obj = objM3765r;
        }
        ArrayList<View> arrayListM3758k = m3758k(abstractC0488xM3757j, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListM3758k2 = m3758k(abstractC0488xM3757j, objM3764q, fragment, arrayList, view);
        m3746A(arrayListM3758k2, 4);
        Object objM3768u = m3768u(abstractC0488xM3757j, objM3764q, obj, objM3760m, fragment, z);
        if (fragment2 != null && arrayListM3758k != null && (arrayListM3758k.size() > 0 || arrayList2.size() > 0)) {
            C0273b c0273b = new C0273b();
            gVar.mo3523b(fragment2, c0273b);
            abstractC0488xM3757j.mo3790w(fragment2, objM3768u, c0273b, new a(gVar, fragment2, c0273b));
        }
        if (objM3768u != null) {
            m3769v(abstractC0488xM3757j, obj, fragment2, arrayListM3758k);
            ArrayList<String> arrayListM3799o = abstractC0488xM3757j.m3799o(arrayList);
            abstractC0488xM3757j.mo3787t(objM3768u, objM3764q, arrayListM3758k2, obj, arrayListM3758k, objM3760m, arrayList);
            abstractC0488xM3757j.mo3779c(viewGroup, objM3768u);
            abstractC0488xM3757j.m3802y(viewGroup, arrayList2, arrayList, arrayListM3799o, c0867a);
            m3746A(arrayListM3758k2, 0);
            abstractC0488xM3757j.mo3775A(objM3760m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static h m3763p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m3764q(AbstractC0488x abstractC0488x, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return abstractC0488x.mo3781g(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* renamed from: r */
    private static Object m3765r(AbstractC0488x abstractC0488x, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return abstractC0488x.mo3781g(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* renamed from: s */
    static View m3766s(C0867a<String, View> c0867a, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0462a c0462a = hVar.f3382c;
        if (obj == null || c0867a == null || (arrayList = c0462a.f3331p) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0867a.get(z ? c0462a.f3331p.get(0) : c0462a.f3332q.get(0));
    }

    /* renamed from: t */
    private static Object m3767t(AbstractC0488x abstractC0488x, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return abstractC0488x.mo3776B(abstractC0488x.mo3781g(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* renamed from: u */
    private static Object m3768u(AbstractC0488x abstractC0488x, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? abstractC0488x.mo3783n(obj2, obj, obj3) : abstractC0488x.mo3782m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m3769v(AbstractC0488x abstractC0488x, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            abstractC0488x.mo3786r(obj, fragment.getView(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0308r.m2080a(fragment.mContainer, new b(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC0488x m3770w() {
        try {
            return (AbstractC0488x) Class.forName("c.x.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    static void m3771x(C0867a<String, String> c0867a, C0867a<String, View> c0867a2) {
        for (int size = c0867a.size() - 1; size >= 0; size--) {
            if (!c0867a2.containsKey(c0867a.m5477n(size))) {
                c0867a.mo5475l(size);
            }
        }
    }

    /* renamed from: y */
    private static void m3772y(AbstractC0488x abstractC0488x, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(viewGroup, new d(obj, abstractC0488x, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m3773z(AbstractC0488x abstractC0488x, Object obj, Object obj2, C0867a<String, View> c0867a, boolean z, C0462a c0462a) {
        ArrayList<String> arrayList = c0462a.f3331p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0867a.get(z ? c0462a.f3332q.get(0) : c0462a.f3331p.get(0));
        abstractC0488x.mo3789v(obj, view);
        if (obj2 != null) {
            abstractC0488x.mo3789v(obj2, view);
        }
    }
}
