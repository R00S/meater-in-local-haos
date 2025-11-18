package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0273b;
import androidx.core.view.C0311u;
import androidx.core.view.C0313w;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0308r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public abstract class AbstractC0488x {

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.x$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f3402f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f3403g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3404h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f3405i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3406j;

        a(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3402f = i2;
            this.f3403g = arrayList;
            this.f3404h = arrayList2;
            this.f3405i = arrayList3;
            this.f3406j = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f3402f; i2++) {
                C0311u.m2165z0((View) this.f3403g.get(i2), (String) this.f3404h.get(i2));
                C0311u.m2165z0((View) this.f3405i.get(i2), (String) this.f3406j.get(i2));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.x$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3408f;

        /* renamed from: g */
        final /* synthetic */ Map f3409g;

        b(ArrayList arrayList, Map map) {
            this.f3408f = arrayList;
            this.f3409g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3408f.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f3408f.get(i2);
                String strM2094G = C0311u.m2094G(view);
                if (strM2094G != null) {
                    C0311u.m2165z0(view, AbstractC0488x.m3794i(this.f3409g, strM2094G));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.x$c */
    class c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3411f;

        /* renamed from: g */
        final /* synthetic */ Map f3412g;

        c(ArrayList arrayList, Map map) {
            this.f3411f = arrayList;
            this.f3412g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3411f.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f3411f.get(i2);
                C0311u.m2165z0(view, (String) this.f3412g.get(C0311u.m2094G(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m3792d(List<View> list, View view) {
        int size = list.size();
        if (m3793h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!m3793h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m3793h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m3794i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m3795l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo3775A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo3776B(Object obj);

    /* renamed from: a */
    public abstract void mo3777a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3778b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3779c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3780e(Object obj);

    /* renamed from: f */
    void m3796f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
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
                m3796f(arrayList, viewGroup.getChildAt(i2));
            }
        }
    }

    /* renamed from: g */
    public abstract Object mo3781g(Object obj);

    /* renamed from: j */
    void m3797j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strM2094G = C0311u.m2094G(view);
            if (strM2094G != null) {
                map.put(strM2094G, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    m3797j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    /* renamed from: k */
    protected void m3798k(View view, Rect rect) {
        if (C0311u.m2101N(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo3782m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo3783n(Object obj, Object obj2, Object obj3);

    /* renamed from: o */
    ArrayList<String> m3799o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(C0311u.m2094G(view));
            C0311u.m2165z0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo3784p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo3785q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo3786r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: s */
    void m3800s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(viewGroup, new c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo3787t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo3788u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo3789v(Object obj, View view);

    /* renamed from: w */
    public void mo3790w(Fragment fragment, Object obj, C0273b c0273b, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: x */
    void m3801x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(view, new b(arrayList, map));
    }

    /* renamed from: y */
    void m3802y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String strM2094G = C0311u.m2094G(view2);
            arrayList4.add(strM2094G);
            if (strM2094G != null) {
                C0311u.m2165z0(view2, null);
                String str = map.get(strM2094G);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        C0311u.m2165z0(arrayList2.get(i3), strM2094G);
                        break;
                    }
                    i3++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0308r.m2080a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo3791z(Object obj, View view, ArrayList<View> arrayList);
}
