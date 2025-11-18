package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.C4391a;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC2190k f29574a = new C2180a();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<C4391a<ViewGroup, ArrayList<AbstractC2190k>>>> f29575b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f29576c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, AbstractC2190k abstractC2190k) {
        if (f29576c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f29576c.add(viewGroup);
        if (abstractC2190k == null) {
            abstractC2190k = f29574a;
        }
        AbstractC2190k abstractC2190kClone = abstractC2190k.clone();
        e(viewGroup, abstractC2190kClone);
        C2189j.c(viewGroup, null);
        d(viewGroup, abstractC2190kClone);
    }

    public static u b(ViewGroup viewGroup, AbstractC2190k abstractC2190k) {
        if (f29576c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC2190k.R()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f29576c.add(viewGroup);
        AbstractC2190k abstractC2190kClone = abstractC2190k.clone();
        v vVar = new v();
        vVar.A0(abstractC2190kClone);
        e(viewGroup, vVar);
        C2189j.c(viewGroup, null);
        d(viewGroup, vVar);
        viewGroup.invalidate();
        return vVar.t();
    }

    static C4391a<ViewGroup, ArrayList<AbstractC2190k>> c() {
        C4391a<ViewGroup, ArrayList<AbstractC2190k>> c4391a;
        WeakReference<C4391a<ViewGroup, ArrayList<AbstractC2190k>>> weakReference = f29575b.get();
        if (weakReference != null && (c4391a = weakReference.get()) != null) {
            return c4391a;
        }
        C4391a<ViewGroup, ArrayList<AbstractC2190k>> c4391a2 = new C4391a<>();
        f29575b.set(new WeakReference<>(c4391a2));
        return c4391a2;
    }

    private static void d(ViewGroup viewGroup, AbstractC2190k abstractC2190k) {
        if (abstractC2190k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC2190k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, AbstractC2190k abstractC2190k) {
        ArrayList<AbstractC2190k> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC2190k> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().d0(viewGroup);
            }
        }
        if (abstractC2190k != null) {
            abstractC2190k.o(viewGroup, true);
        }
        C2189j c2189jB = C2189j.b(viewGroup);
        if (c2189jB != null) {
            c2189jB.a();
        }
    }

    /* compiled from: TransitionManager.java */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name */
        AbstractC2190k f29577B;

        /* renamed from: C, reason: collision with root package name */
        ViewGroup f29578C;

        /* compiled from: TransitionManager.java */
        /* renamed from: androidx.transition.s$a$a, reason: collision with other inner class name */
        class C0411a extends r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4391a f29579a;

            C0411a(C4391a c4391a) {
                this.f29579a = c4391a;
            }

            @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
            public void h(AbstractC2190k abstractC2190k) {
                ((ArrayList) this.f29579a.get(a.this.f29578C)).remove(abstractC2190k);
                abstractC2190k.i0(this);
            }
        }

        a(AbstractC2190k abstractC2190k, ViewGroup viewGroup) {
            this.f29577B = abstractC2190k;
            this.f29578C = viewGroup;
        }

        private void a() {
            this.f29578C.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f29578C.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!s.f29576c.remove(this.f29578C)) {
                return true;
            }
            C4391a<ViewGroup, ArrayList<AbstractC2190k>> c4391aC = s.c();
            ArrayList<AbstractC2190k> arrayList = c4391aC.get(this.f29578C);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c4391aC.put(this.f29578C, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f29577B);
            this.f29577B.d(new C0411a(c4391aC));
            this.f29577B.o(this.f29578C, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC2190k) it.next()).k0(this.f29578C);
                }
            }
            this.f29577B.e0(this.f29578C);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            s.f29576c.remove(this.f29578C);
            ArrayList<AbstractC2190k> arrayList = s.c().get(this.f29578C);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC2190k> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().k0(this.f29578C);
                }
            }
            this.f29577B.p(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
