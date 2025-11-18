package androidx.transition;

import F1.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.transition.AbstractC2190k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.InterfaceC4334a;
import s.C4391a;
import s.C4411v;
import s1.X;

/* compiled from: Transition.java */
/* renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2190k implements Cloneable {

    /* renamed from: m0, reason: collision with root package name */
    private static final Animator[] f29508m0 = new Animator[0];

    /* renamed from: n0, reason: collision with root package name */
    private static final int[] f29509n0 = {2, 1, 3, 4};

    /* renamed from: o0, reason: collision with root package name */
    private static final AbstractC2186g f29510o0 = new a();

    /* renamed from: p0, reason: collision with root package name */
    private static ThreadLocal<C4391a<Animator, d>> f29511p0 = new ThreadLocal<>();

    /* renamed from: U, reason: collision with root package name */
    private ArrayList<x> f29531U;

    /* renamed from: V, reason: collision with root package name */
    private ArrayList<x> f29532V;

    /* renamed from: W, reason: collision with root package name */
    private h[] f29533W;

    /* renamed from: g0, reason: collision with root package name */
    private e f29543g0;

    /* renamed from: h0, reason: collision with root package name */
    private C4391a<String, String> f29544h0;

    /* renamed from: j0, reason: collision with root package name */
    long f29546j0;

    /* renamed from: k0, reason: collision with root package name */
    g f29547k0;

    /* renamed from: l0, reason: collision with root package name */
    long f29548l0;

    /* renamed from: B, reason: collision with root package name */
    private String f29512B = getClass().getName();

    /* renamed from: C, reason: collision with root package name */
    private long f29513C = -1;

    /* renamed from: D, reason: collision with root package name */
    long f29514D = -1;

    /* renamed from: E, reason: collision with root package name */
    private TimeInterpolator f29515E = null;

    /* renamed from: F, reason: collision with root package name */
    ArrayList<Integer> f29516F = new ArrayList<>();

    /* renamed from: G, reason: collision with root package name */
    ArrayList<View> f29517G = new ArrayList<>();

    /* renamed from: H, reason: collision with root package name */
    private ArrayList<String> f29518H = null;

    /* renamed from: I, reason: collision with root package name */
    private ArrayList<Class<?>> f29519I = null;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList<Integer> f29520J = null;

    /* renamed from: K, reason: collision with root package name */
    private ArrayList<View> f29521K = null;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList<Class<?>> f29522L = null;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList<String> f29523M = null;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList<Integer> f29524N = null;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList<View> f29525O = null;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList<Class<?>> f29526P = null;

    /* renamed from: Q, reason: collision with root package name */
    private y f29527Q = new y();

    /* renamed from: R, reason: collision with root package name */
    private y f29528R = new y();

    /* renamed from: S, reason: collision with root package name */
    v f29529S = null;

    /* renamed from: T, reason: collision with root package name */
    private int[] f29530T = f29509n0;

    /* renamed from: X, reason: collision with root package name */
    boolean f29534X = false;

    /* renamed from: Y, reason: collision with root package name */
    ArrayList<Animator> f29535Y = new ArrayList<>();

    /* renamed from: Z, reason: collision with root package name */
    private Animator[] f29536Z = f29508m0;

    /* renamed from: a0, reason: collision with root package name */
    int f29537a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f29538b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    boolean f29539c0 = false;

    /* renamed from: d0, reason: collision with root package name */
    private AbstractC2190k f29540d0 = null;

    /* renamed from: e0, reason: collision with root package name */
    private ArrayList<h> f29541e0 = null;

    /* renamed from: f0, reason: collision with root package name */
    ArrayList<Animator> f29542f0 = new ArrayList<>();

    /* renamed from: i0, reason: collision with root package name */
    private AbstractC2186g f29545i0 = f29510o0;

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$a */
    class a extends AbstractC2186g {
        a() {
        }

        @Override // androidx.transition.AbstractC2186g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4391a f29549a;

        b(C4391a c4391a) {
            this.f29549a = c4391a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29549a.remove(animator);
            AbstractC2190k.this.f29535Y.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC2190k.this.f29535Y.add(animator);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2190k.this.u();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f29552a;

        /* renamed from: b, reason: collision with root package name */
        String f29553b;

        /* renamed from: c, reason: collision with root package name */
        x f29554c;

        /* renamed from: d, reason: collision with root package name */
        WindowId f29555d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC2190k f29556e;

        /* renamed from: f, reason: collision with root package name */
        Animator f29557f;

        d(View view, String str, AbstractC2190k abstractC2190k, WindowId windowId, x xVar, Animator animator) {
            this.f29552a = view;
            this.f29553b = str;
            this.f29554c = xVar;
            this.f29555d = windowId;
            this.f29556e = abstractC2190k;
            this.f29557f = animator;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$e */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$f */
    private static class f {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$g */
    class g extends r implements u, b.r {

        /* renamed from: d, reason: collision with root package name */
        private boolean f29561d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f29562e;

        /* renamed from: f, reason: collision with root package name */
        private F1.e f29563f;

        /* renamed from: i, reason: collision with root package name */
        private Runnable f29566i;

        /* renamed from: a, reason: collision with root package name */
        private long f29558a = -1;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<InterfaceC4334a<u>> f29559b = null;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<InterfaceC4334a<u>> f29560c = null;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC4334a<u>[] f29564g = null;

        /* renamed from: h, reason: collision with root package name */
        private final z f29565h = new z();

        g() {
        }

        private void o() {
            ArrayList<InterfaceC4334a<u>> arrayList = this.f29560c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f29560c.size();
            if (this.f29564g == null) {
                this.f29564g = new InterfaceC4334a[size];
            }
            InterfaceC4334a<u>[] interfaceC4334aArr = (InterfaceC4334a[]) this.f29560c.toArray(this.f29564g);
            this.f29564g = null;
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC4334aArr[i10].accept(this);
                interfaceC4334aArr[i10] = null;
            }
            this.f29564g = interfaceC4334aArr;
        }

        private void p() {
            if (this.f29563f != null) {
                return;
            }
            this.f29565h.a(AnimationUtils.currentAnimationTimeMillis(), this.f29558a);
            this.f29563f = new F1.e(new F1.d());
            F1.f fVar = new F1.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f29563f.w(fVar);
            this.f29563f.m(this.f29558a);
            this.f29563f.c(this);
            this.f29563f.n(this.f29565h.b());
            this.f29563f.i(c() + 1);
            this.f29563f.j(-1.0f);
            this.f29563f.k(4.0f);
            this.f29563f.b(new b.q() { // from class: androidx.transition.l
                @Override // F1.b.q
                public final void a(F1.b bVar, boolean z10, float f10, float f11) {
                    this.f29573a.r(bVar, z10, f10, f11);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(F1.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                return;
            }
            if (f10 >= 1.0f) {
                AbstractC2190k.this.c0(i.f29569b, false);
                return;
            }
            long jC = c();
            AbstractC2190k abstractC2190kC0 = ((v) AbstractC2190k.this).C0(0);
            AbstractC2190k abstractC2190k = abstractC2190kC0.f29540d0;
            abstractC2190kC0.f29540d0 = null;
            AbstractC2190k.this.n0(-1L, this.f29558a);
            AbstractC2190k.this.n0(jC, -1L);
            this.f29558a = jC;
            Runnable runnable = this.f29566i;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC2190k.this.f29542f0.clear();
            if (abstractC2190k != null) {
                abstractC2190k.c0(i.f29569b, true);
            }
        }

        @Override // F1.b.r
        public void b(F1.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(c() + 1, Math.round(f10)));
            AbstractC2190k.this.n0(jMax, this.f29558a);
            this.f29558a = jMax;
            o();
        }

        @Override // androidx.transition.u
        public long c() {
            return AbstractC2190k.this.N();
        }

        @Override // androidx.transition.u
        public void e(long j10) {
            if (this.f29563f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f29558a || !f()) {
                return;
            }
            if (!this.f29562e) {
                if (j10 != 0 || this.f29558a <= 0) {
                    long jC = c();
                    if (j10 == jC && this.f29558a < jC) {
                        j10 = 1 + jC;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f29558a;
                if (j10 != j11) {
                    AbstractC2190k.this.n0(j10, j11);
                    this.f29558a = j10;
                }
            }
            o();
            this.f29565h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // androidx.transition.u
        public boolean f() {
            return this.f29561d;
        }

        @Override // androidx.transition.u
        public void i() {
            p();
            this.f29563f.s(c() + 1);
        }

        @Override // androidx.transition.u
        public void j(Runnable runnable) {
            this.f29566i = runnable;
            p();
            this.f29563f.s(0.0f);
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
            this.f29562e = true;
        }

        void q() {
            long j10 = c() == 0 ? 1L : 0L;
            AbstractC2190k.this.n0(j10, this.f29558a);
            this.f29558a = j10;
        }

        public void s() {
            this.f29561d = true;
            ArrayList<InterfaceC4334a<u>> arrayList = this.f29559b;
            if (arrayList != null) {
                this.f29559b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            o();
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$h */
    public interface h {
        void a(AbstractC2190k abstractC2190k);

        void d(AbstractC2190k abstractC2190k);

        default void g(AbstractC2190k abstractC2190k, boolean z10) {
            h(abstractC2190k);
        }

        void h(AbstractC2190k abstractC2190k);

        void k(AbstractC2190k abstractC2190k);

        default void l(AbstractC2190k abstractC2190k, boolean z10) {
            a(abstractC2190k);
        }

        void m(AbstractC2190k abstractC2190k);
    }

    /* compiled from: Transition.java */
    /* renamed from: androidx.transition.k$i */
    interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f29568a = new i() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC2190k.i
            public final void a(AbstractC2190k.h hVar, AbstractC2190k abstractC2190k, boolean z10) {
                hVar.l(abstractC2190k, z10);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final i f29569b = new i() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC2190k.i
            public final void a(AbstractC2190k.h hVar, AbstractC2190k abstractC2190k, boolean z10) {
                hVar.g(abstractC2190k, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final i f29570c = new i() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC2190k.i
            public final void a(AbstractC2190k.h hVar, AbstractC2190k abstractC2190k, boolean z10) {
                hVar.k(abstractC2190k);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final i f29571d = new i() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC2190k.i
            public final void a(AbstractC2190k.h hVar, AbstractC2190k abstractC2190k, boolean z10) {
                hVar.d(abstractC2190k);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final i f29572e = new i() { // from class: androidx.transition.q
            @Override // androidx.transition.AbstractC2190k.i
            public final void a(AbstractC2190k.h hVar, AbstractC2190k abstractC2190k, boolean z10) {
                hVar.m(abstractC2190k);
            }
        };

        void a(h hVar, AbstractC2190k abstractC2190k, boolean z10);
    }

    private static C4391a<Animator, d> G() {
        C4391a<Animator, d> c4391a = f29511p0.get();
        if (c4391a != null) {
            return c4391a;
        }
        C4391a<Animator, d> c4391a2 = new C4391a<>();
        f29511p0.set(c4391a2);
        return c4391a2;
    }

    private static boolean U(x xVar, x xVar2, String str) {
        Object obj = xVar.f29591a.get(str);
        Object obj2 = xVar2.f29591a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void V(C4391a<View, x> c4391a, C4391a<View, x> c4391a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && T(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && T(view)) {
                x xVar = c4391a.get(viewValueAt);
                x xVar2 = c4391a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f29531U.add(xVar);
                    this.f29532V.add(xVar2);
                    c4391a.remove(viewValueAt);
                    c4391a2.remove(view);
                }
            }
        }
    }

    private void W(C4391a<View, x> c4391a, C4391a<View, x> c4391a2) {
        x xVarRemove;
        for (int size = c4391a.getSize() - 1; size >= 0; size--) {
            View viewH = c4391a.h(size);
            if (viewH != null && T(viewH) && (xVarRemove = c4391a2.remove(viewH)) != null && T(xVarRemove.f29592b)) {
                this.f29531U.add(c4391a.j(size));
                this.f29532V.add(xVarRemove);
            }
        }
    }

    private void X(C4391a<View, x> c4391a, C4391a<View, x> c4391a2, C4411v<View> c4411v, C4411v<View> c4411v2) {
        View viewF;
        int iN = c4411v.n();
        for (int i10 = 0; i10 < iN; i10++) {
            View viewO = c4411v.o(i10);
            if (viewO != null && T(viewO) && (viewF = c4411v2.f(c4411v.i(i10))) != null && T(viewF)) {
                x xVar = c4391a.get(viewO);
                x xVar2 = c4391a2.get(viewF);
                if (xVar != null && xVar2 != null) {
                    this.f29531U.add(xVar);
                    this.f29532V.add(xVar2);
                    c4391a.remove(viewO);
                    c4391a2.remove(viewF);
                }
            }
        }
    }

    private void Y(C4391a<View, x> c4391a, C4391a<View, x> c4391a2, C4391a<String, View> c4391a3, C4391a<String, View> c4391a4) {
        View view;
        int size = c4391a3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            View viewL = c4391a3.l(i10);
            if (viewL != null && T(viewL) && (view = c4391a4.get(c4391a3.h(i10))) != null && T(view)) {
                x xVar = c4391a.get(viewL);
                x xVar2 = c4391a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f29531U.add(xVar);
                    this.f29532V.add(xVar2);
                    c4391a.remove(viewL);
                    c4391a2.remove(view);
                }
            }
        }
    }

    private void Z(y yVar, y yVar2) {
        C4391a<View, x> c4391a = new C4391a<>(yVar.f29594a);
        C4391a<View, x> c4391a2 = new C4391a<>(yVar2.f29594a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f29530T;
            if (i10 >= iArr.length) {
                g(c4391a, c4391a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                W(c4391a, c4391a2);
            } else if (i11 == 2) {
                Y(c4391a, c4391a2, yVar.f29597d, yVar2.f29597d);
            } else if (i11 == 3) {
                V(c4391a, c4391a2, yVar.f29595b, yVar2.f29595b);
            } else if (i11 == 4) {
                X(c4391a, c4391a2, yVar.f29596c, yVar2.f29596c);
            }
            i10++;
        }
    }

    private void b0(AbstractC2190k abstractC2190k, i iVar, boolean z10) {
        AbstractC2190k abstractC2190k2 = this.f29540d0;
        if (abstractC2190k2 != null) {
            abstractC2190k2.b0(abstractC2190k, iVar, z10);
        }
        ArrayList<h> arrayList = this.f29541e0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f29541e0.size();
        h[] hVarArr = this.f29533W;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f29533W = null;
        h[] hVarArr2 = (h[]) this.f29541e0.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.a(hVarArr2[i10], abstractC2190k, z10);
            hVarArr2[i10] = null;
        }
        this.f29533W = hVarArr2;
    }

    private void g(C4391a<View, x> c4391a, C4391a<View, x> c4391a2) {
        for (int i10 = 0; i10 < c4391a.getSize(); i10++) {
            x xVarL = c4391a.l(i10);
            if (T(xVarL.f29592b)) {
                this.f29531U.add(xVarL);
                this.f29532V.add(null);
            }
        }
        for (int i11 = 0; i11 < c4391a2.getSize(); i11++) {
            x xVarL2 = c4391a2.l(i11);
            if (T(xVarL2.f29592b)) {
                this.f29532V.add(xVarL2);
                this.f29531U.add(null);
            }
        }
    }

    private static void h(y yVar, View view, x xVar) {
        yVar.f29594a.put(view, xVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (yVar.f29595b.indexOfKey(id2) >= 0) {
                yVar.f29595b.put(id2, null);
            } else {
                yVar.f29595b.put(id2, view);
            }
        }
        String strH = X.H(view);
        if (strH != null) {
            if (yVar.f29597d.containsKey(strH)) {
                yVar.f29597d.put(strH, null);
            } else {
                yVar.f29597d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f29596c.g(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.f29596c.k(itemIdAtPosition, view);
                    return;
                }
                View viewF = yVar.f29596c.f(itemIdAtPosition);
                if (viewF != null) {
                    viewF.setHasTransientState(false);
                    yVar.f29596c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    private void l(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f29520J;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f29521K;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f29522L;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f29522L.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z10) {
                        n(xVar);
                    } else {
                        k(xVar);
                    }
                    xVar.f29593c.add(this);
                    m(xVar);
                    if (z10) {
                        h(this.f29527Q, view, xVar);
                    } else {
                        h(this.f29528R, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f29524N;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f29525O;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f29526P;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f29526P.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                l(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private void l0(Animator animator, C4391a<Animator, d> c4391a) {
        if (animator != null) {
            animator.addListener(new b(c4391a));
            i(animator);
        }
    }

    public TimeInterpolator A() {
        return this.f29515E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f29532V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f29531U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.transition.x B(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.v r0 = r5.f29529S
            if (r0 == 0) goto L9
            androidx.transition.x r6 = r0.B(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<androidx.transition.x> r0 = r5.f29531U
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.x> r0 = r5.f29532V
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.x r4 = (androidx.transition.x) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f29592b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<androidx.transition.x> r6 = r5.f29532V
            goto L36
        L34:
            java.util.ArrayList<androidx.transition.x> r6 = r5.f29531U
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            androidx.transition.x r1 = (androidx.transition.x) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC2190k.B(android.view.View, boolean):androidx.transition.x");
    }

    public String C() {
        return this.f29512B;
    }

    public AbstractC2186g D() {
        return this.f29545i0;
    }

    public t E() {
        return null;
    }

    public final AbstractC2190k F() {
        v vVar = this.f29529S;
        return vVar != null ? vVar.F() : this;
    }

    public long H() {
        return this.f29513C;
    }

    public List<Integer> I() {
        return this.f29516F;
    }

    public List<String> J() {
        return this.f29518H;
    }

    public List<Class<?>> L() {
        return this.f29519I;
    }

    public List<View> M() {
        return this.f29517G;
    }

    final long N() {
        return this.f29546j0;
    }

    public String[] O() {
        return null;
    }

    public x P(View view, boolean z10) {
        v vVar = this.f29529S;
        if (vVar != null) {
            return vVar.P(view, z10);
        }
        return (z10 ? this.f29527Q : this.f29528R).f29594a.get(view);
    }

    boolean Q() {
        return !this.f29535Y.isEmpty();
    }

    public boolean R() {
        return false;
    }

    public boolean S(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] strArrO = O();
        if (strArrO == null) {
            Iterator<String> it = xVar.f29591a.keySet().iterator();
            while (it.hasNext()) {
                if (U(xVar, xVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrO) {
            if (!U(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean T(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f29520J;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f29521K;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f29522L;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f29522L.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f29523M != null && X.H(view) != null && this.f29523M.contains(X.H(view))) {
            return false;
        }
        if ((this.f29516F.size() == 0 && this.f29517G.size() == 0 && (((arrayList = this.f29519I) == null || arrayList.isEmpty()) && ((arrayList2 = this.f29518H) == null || arrayList2.isEmpty()))) || this.f29516F.contains(Integer.valueOf(id2)) || this.f29517G.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f29518H;
        if (arrayList6 != null && arrayList6.contains(X.H(view))) {
            return true;
        }
        if (this.f29519I != null) {
            for (int i11 = 0; i11 < this.f29519I.size(); i11++) {
                if (this.f29519I.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void c0(i iVar, boolean z10) {
        b0(this, iVar, z10);
    }

    protected void cancel() {
        int size = this.f29535Y.size();
        Animator[] animatorArr = (Animator[]) this.f29535Y.toArray(this.f29536Z);
        this.f29536Z = f29508m0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f29536Z = animatorArr;
        c0(i.f29570c, false);
    }

    public AbstractC2190k d(h hVar) {
        if (this.f29541e0 == null) {
            this.f29541e0 = new ArrayList<>();
        }
        this.f29541e0.add(hVar);
        return this;
    }

    public void d0(View view) {
        if (this.f29539c0) {
            return;
        }
        int size = this.f29535Y.size();
        Animator[] animatorArr = (Animator[]) this.f29535Y.toArray(this.f29536Z);
        this.f29536Z = f29508m0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f29536Z = animatorArr;
        c0(i.f29571d, false);
        this.f29538b0 = true;
    }

    void e0(ViewGroup viewGroup) {
        d dVar;
        this.f29531U = new ArrayList<>();
        this.f29532V = new ArrayList<>();
        Z(this.f29527Q, this.f29528R);
        C4391a<Animator, d> c4391aG = G();
        int size = c4391aG.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorH = c4391aG.h(i10);
            if (animatorH != null && (dVar = c4391aG.get(animatorH)) != null && dVar.f29552a != null && windowId.equals(dVar.f29555d)) {
                x xVar = dVar.f29554c;
                View view = dVar.f29552a;
                x xVarP = P(view, true);
                x xVarB = B(view, true);
                if (xVarP == null && xVarB == null) {
                    xVarB = this.f29528R.f29594a.get(view);
                }
                if ((xVarP != null || xVarB != null) && dVar.f29556e.S(xVar, xVarB)) {
                    AbstractC2190k abstractC2190k = dVar.f29556e;
                    if (abstractC2190k.F().f29547k0 != null) {
                        animatorH.cancel();
                        abstractC2190k.f29535Y.remove(animatorH);
                        c4391aG.remove(animatorH);
                        if (abstractC2190k.f29535Y.size() == 0) {
                            abstractC2190k.c0(i.f29570c, false);
                            if (!abstractC2190k.f29539c0) {
                                abstractC2190k.f29539c0 = true;
                                abstractC2190k.c0(i.f29569b, false);
                            }
                        }
                    } else if (animatorH.isRunning() || animatorH.isStarted()) {
                        animatorH.cancel();
                    } else {
                        c4391aG.remove(animatorH);
                    }
                }
            }
        }
        s(viewGroup, this.f29527Q, this.f29528R, this.f29531U, this.f29532V);
        if (this.f29547k0 == null) {
            m0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            g0();
            this.f29547k0.q();
            this.f29547k0.s();
        }
    }

    public AbstractC2190k f(View view) {
        this.f29517G.add(view);
        return this;
    }

    void g0() {
        C4391a<Animator, d> c4391aG = G();
        this.f29546j0 = 0L;
        for (int i10 = 0; i10 < this.f29542f0.size(); i10++) {
            Animator animator = this.f29542f0.get(i10);
            d dVar = c4391aG.get(animator);
            if (animator != null && dVar != null) {
                if (v() >= 0) {
                    dVar.f29557f.setDuration(v());
                }
                if (H() >= 0) {
                    dVar.f29557f.setStartDelay(H() + dVar.f29557f.getStartDelay());
                }
                if (A() != null) {
                    dVar.f29557f.setInterpolator(A());
                }
                this.f29535Y.add(animator);
                this.f29546j0 = Math.max(this.f29546j0, f.a(animator));
            }
        }
        this.f29542f0.clear();
    }

    protected void i(Animator animator) {
        if (animator == null) {
            u();
            return;
        }
        if (v() >= 0) {
            animator.setDuration(v());
        }
        if (H() >= 0) {
            animator.setStartDelay(H() + animator.getStartDelay());
        }
        if (A() != null) {
            animator.setInterpolator(A());
        }
        animator.addListener(new c());
        animator.start();
    }

    public AbstractC2190k i0(h hVar) {
        AbstractC2190k abstractC2190k;
        ArrayList<h> arrayList = this.f29541e0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(hVar) && (abstractC2190k = this.f29540d0) != null) {
            abstractC2190k.i0(hVar);
        }
        if (this.f29541e0.size() == 0) {
            this.f29541e0 = null;
        }
        return this;
    }

    public AbstractC2190k j0(View view) {
        this.f29517G.remove(view);
        return this;
    }

    public abstract void k(x xVar);

    public void k0(View view) {
        if (this.f29538b0) {
            if (!this.f29539c0) {
                int size = this.f29535Y.size();
                Animator[] animatorArr = (Animator[]) this.f29535Y.toArray(this.f29536Z);
                this.f29536Z = f29508m0;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f29536Z = animatorArr;
                c0(i.f29572e, false);
            }
            this.f29538b0 = false;
        }
    }

    protected void m0() {
        w0();
        C4391a<Animator, d> c4391aG = G();
        Iterator<Animator> it = this.f29542f0.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c4391aG.containsKey(next)) {
                w0();
                l0(next, c4391aG);
            }
        }
        this.f29542f0.clear();
        u();
    }

    public abstract void n(x xVar);

    void n0(long j10, long j11) {
        long jN = N();
        int i10 = 0;
        boolean z10 = j10 < j11;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if ((i11 < 0 && j10 >= 0) || (j11 > jN && j10 <= jN)) {
            this.f29539c0 = false;
            c0(i.f29568a, z10);
        }
        Animator[] animatorArr = (Animator[]) this.f29535Y.toArray(this.f29536Z);
        this.f29536Z = f29508m0;
        for (int size = this.f29535Y.size(); i10 < size; size = size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j10), f.a(animator)));
            i10++;
            i11 = i11;
        }
        int i12 = i11;
        this.f29536Z = animatorArr;
        if ((j10 <= jN || j11 > jN) && (j10 >= 0 || i12 < 0)) {
            return;
        }
        if (j10 > jN) {
            this.f29539c0 = true;
        }
        c0(i.f29569b, z10);
    }

    void o(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C4391a<String, String> c4391a;
        p(z10);
        if ((this.f29516F.size() > 0 || this.f29517G.size() > 0) && (((arrayList = this.f29518H) == null || arrayList.isEmpty()) && ((arrayList2 = this.f29519I) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f29516F.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f29516F.get(i10).intValue());
                if (viewFindViewById != null) {
                    x xVar = new x(viewFindViewById);
                    if (z10) {
                        n(xVar);
                    } else {
                        k(xVar);
                    }
                    xVar.f29593c.add(this);
                    m(xVar);
                    if (z10) {
                        h(this.f29527Q, viewFindViewById, xVar);
                    } else {
                        h(this.f29528R, viewFindViewById, xVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f29517G.size(); i11++) {
                View view = this.f29517G.get(i11);
                x xVar2 = new x(view);
                if (z10) {
                    n(xVar2);
                } else {
                    k(xVar2);
                }
                xVar2.f29593c.add(this);
                m(xVar2);
                if (z10) {
                    h(this.f29527Q, view, xVar2);
                } else {
                    h(this.f29528R, view, xVar2);
                }
            }
        } else {
            l(viewGroup, z10);
        }
        if (z10 || (c4391a = this.f29544h0) == null) {
            return;
        }
        int size = c4391a.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f29527Q.f29597d.remove(this.f29544h0.h(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f29527Q.f29597d.put(this.f29544h0.l(i13), view2);
            }
        }
    }

    public AbstractC2190k o0(long j10) {
        this.f29514D = j10;
        return this;
    }

    void p(boolean z10) {
        if (z10) {
            this.f29527Q.f29594a.clear();
            this.f29527Q.f29595b.clear();
            this.f29527Q.f29596c.b();
        } else {
            this.f29528R.f29594a.clear();
            this.f29528R.f29595b.clear();
            this.f29528R.f29596c.b();
        }
    }

    public void p0(e eVar) {
        this.f29543g0 = eVar;
    }

    @Override // 
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC2190k clone() {
        try {
            AbstractC2190k abstractC2190k = (AbstractC2190k) super.clone();
            abstractC2190k.f29542f0 = new ArrayList<>();
            abstractC2190k.f29527Q = new y();
            abstractC2190k.f29528R = new y();
            abstractC2190k.f29531U = null;
            abstractC2190k.f29532V = null;
            abstractC2190k.f29547k0 = null;
            abstractC2190k.f29540d0 = this;
            abstractC2190k.f29541e0 = null;
            return abstractC2190k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public AbstractC2190k q0(TimeInterpolator timeInterpolator) {
        this.f29515E = timeInterpolator;
        return this;
    }

    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void s(android.view.ViewGroup r19, androidx.transition.y r20, androidx.transition.y r21, java.util.ArrayList<androidx.transition.x> r22, java.util.ArrayList<androidx.transition.x> r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC2190k.s(android.view.ViewGroup, androidx.transition.y, androidx.transition.y, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void s0(AbstractC2186g abstractC2186g) {
        if (abstractC2186g == null) {
            this.f29545i0 = f29510o0;
        } else {
            this.f29545i0 = abstractC2186g;
        }
    }

    u t() {
        g gVar = new g();
        this.f29547k0 = gVar;
        d(gVar);
        return this.f29547k0;
    }

    public String toString() {
        return x0("");
    }

    protected void u() {
        int i10 = this.f29537a0 - 1;
        this.f29537a0 = i10;
        if (i10 == 0) {
            c0(i.f29569b, false);
            for (int i11 = 0; i11 < this.f29527Q.f29596c.n(); i11++) {
                View viewO = this.f29527Q.f29596c.o(i11);
                if (viewO != null) {
                    viewO.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f29528R.f29596c.n(); i12++) {
                View viewO2 = this.f29528R.f29596c.o(i12);
                if (viewO2 != null) {
                    viewO2.setHasTransientState(false);
                }
            }
            this.f29539c0 = true;
        }
    }

    public AbstractC2190k u0(long j10) {
        this.f29513C = j10;
        return this;
    }

    public long v() {
        return this.f29514D;
    }

    public e w() {
        return this.f29543g0;
    }

    protected void w0() {
        if (this.f29537a0 == 0) {
            c0(i.f29568a, false);
            this.f29539c0 = false;
        }
        this.f29537a0++;
    }

    String x0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f29514D != -1) {
            sb2.append("dur(");
            sb2.append(this.f29514D);
            sb2.append(") ");
        }
        if (this.f29513C != -1) {
            sb2.append("dly(");
            sb2.append(this.f29513C);
            sb2.append(") ");
        }
        if (this.f29515E != null) {
            sb2.append("interp(");
            sb2.append(this.f29515E);
            sb2.append(") ");
        }
        if (this.f29516F.size() > 0 || this.f29517G.size() > 0) {
            sb2.append("tgts(");
            if (this.f29516F.size() > 0) {
                for (int i10 = 0; i10 < this.f29516F.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f29516F.get(i10));
                }
            }
            if (this.f29517G.size() > 0) {
                for (int i11 = 0; i11 < this.f29517G.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f29517G.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    void m(x xVar) {
    }

    public void t0(t tVar) {
    }
}
