package p024c.p088x;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0311u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p024c.p041e.C0867a;

/* compiled from: TransitionManager.java */
/* renamed from: c.x.o */
/* loaded from: classes.dex */
public class C1050o {

    /* renamed from: a */
    private static AbstractC1047m f6915a = new C1025b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0867a<ViewGroup, ArrayList<AbstractC1047m>>>> f6916b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f6917c = new ArrayList<>();

    /* compiled from: TransitionManager.java */
    /* renamed from: c.x.o$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        AbstractC1047m f6918f;

        /* renamed from: g */
        ViewGroup f6919g;

        /* compiled from: TransitionManager.java */
        /* renamed from: c.x.o$a$a, reason: collision with other inner class name */
        class C11450a extends C1049n {

            /* renamed from: a */
            final /* synthetic */ C0867a f6920a;

            C11450a(C0867a c0867a) {
                this.f6920a = c0867a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p024c.p088x.AbstractC1047m.f
            /* renamed from: c */
            public void mo6555c(AbstractC1047m abstractC1047m) {
                ((ArrayList) this.f6920a.get(a.this.f6919g)).remove(abstractC1047m);
                abstractC1047m.mo6628T(this);
            }
        }

        a(AbstractC1047m abstractC1047m, ViewGroup viewGroup) {
            this.f6918f = abstractC1047m;
            this.f6919g = viewGroup;
        }

        /* renamed from: a */
        private void m6659a() {
            this.f6919g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6919g.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m6659a();
            if (!C1050o.f6917c.remove(this.f6919g)) {
                return true;
            }
            C0867a<ViewGroup, ArrayList<AbstractC1047m>> c0867aM6656b = C1050o.m6656b();
            ArrayList<AbstractC1047m> arrayList = c0867aM6656b.get(this.f6919g);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c0867aM6656b.put(this.f6919g, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6918f);
            this.f6918f.mo6633b(new C11450a(c0867aM6656b));
            this.f6918f.m6644l(this.f6919g, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1047m) it.next()).mo6630V(this.f6919g);
                }
            }
            this.f6918f.m6627S(this.f6919g);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m6659a();
            C1050o.f6917c.remove(this.f6919g);
            ArrayList<AbstractC1047m> arrayList = C1050o.m6656b().get(this.f6919g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC1047m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo6630V(this.f6919g);
                }
            }
            this.f6918f.m6645m(true);
        }
    }

    /* renamed from: a */
    public static void m6655a(ViewGroup viewGroup, AbstractC1047m abstractC1047m) {
        if (f6917c.contains(viewGroup) || !C0311u.m2102O(viewGroup)) {
            return;
        }
        f6917c.add(viewGroup);
        if (abstractC1047m == null) {
            abstractC1047m = f6915a;
        }
        AbstractC1047m abstractC1047mClone = abstractC1047m.clone();
        m6658d(viewGroup, abstractC1047mClone);
        C1045l.m6605c(viewGroup, null);
        m6657c(viewGroup, abstractC1047mClone);
    }

    /* renamed from: b */
    static C0867a<ViewGroup, ArrayList<AbstractC1047m>> m6656b() {
        C0867a<ViewGroup, ArrayList<AbstractC1047m>> c0867a;
        WeakReference<C0867a<ViewGroup, ArrayList<AbstractC1047m>>> weakReference = f6916b.get();
        if (weakReference != null && (c0867a = weakReference.get()) != null) {
            return c0867a;
        }
        C0867a<ViewGroup, ArrayList<AbstractC1047m>> c0867a2 = new C0867a<>();
        f6916b.set(new WeakReference<>(c0867a2));
        return c0867a2;
    }

    /* renamed from: c */
    private static void m6657c(ViewGroup viewGroup, AbstractC1047m abstractC1047m) {
        if (abstractC1047m == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1047m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    private static void m6658d(ViewGroup viewGroup, AbstractC1047m abstractC1047m) {
        ArrayList<AbstractC1047m> arrayList = m6656b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1047m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6626R(viewGroup);
            }
        }
        if (abstractC1047m != null) {
            abstractC1047m.m6644l(viewGroup, true);
        }
        C1045l c1045lM6604b = C1045l.m6604b(viewGroup);
        if (c1045lM6604b != null) {
            c1045lM6604b.m6606a();
        }
    }
}
