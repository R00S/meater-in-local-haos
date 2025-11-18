package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.X;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class g extends u {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f28852s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<RecyclerView.G> f28853h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.G> f28854i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<j> f28855j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<i> f28856k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.G>> f28857l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<j>> f28858m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    ArrayList<ArrayList<i>> f28859n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView.G> f28860o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    ArrayList<RecyclerView.G> f28861p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    ArrayList<RecyclerView.G> f28862q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    ArrayList<RecyclerView.G> f28863r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ArrayList f28864B;

        a(ArrayList arrayList) {
            this.f28864B = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f28864B.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.T(jVar.f28898a, jVar.f28899b, jVar.f28900c, jVar.f28901d, jVar.f28902e);
            }
            this.f28864B.clear();
            g.this.f28858m.remove(this.f28864B);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ArrayList f28866B;

        b(ArrayList arrayList) {
            this.f28866B = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f28866B.iterator();
            while (it.hasNext()) {
                g.this.S((i) it.next());
            }
            this.f28866B.clear();
            g.this.f28859n.remove(this.f28866B);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class c implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ArrayList f28868B;

        c(ArrayList arrayList) {
            this.f28868B = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f28868B.iterator();
            while (it.hasNext()) {
                g.this.R((RecyclerView.G) it.next());
            }
            this.f28868B.clear();
            g.this.f28857l.remove(this.f28868B);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f28870a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f28871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28872c;

        d(RecyclerView.G g10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f28870a = g10;
            this.f28871b = viewPropertyAnimator;
            this.f28872c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28871b.setListener(null);
            this.f28872c.setAlpha(1.0f);
            g.this.G(this.f28870a);
            g.this.f28862q.remove(this.f28870a);
            g.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.H(this.f28870a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f28874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f28875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f28876c;

        e(RecyclerView.G g10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f28874a = g10;
            this.f28875b = view;
            this.f28876c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f28875b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28876c.setListener(null);
            g.this.A(this.f28874a);
            g.this.f28860o.remove(this.f28874a);
            g.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.B(this.f28874a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f28878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28880c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28881d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f28882e;

        f(RecyclerView.G g10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f28878a = g10;
            this.f28879b = i10;
            this.f28880c = view;
            this.f28881d = i11;
            this.f28882e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f28879b != 0) {
                this.f28880c.setTranslationX(0.0f);
            }
            if (this.f28881d != 0) {
                this.f28880c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28882e.setListener(null);
            g.this.E(this.f28878a);
            g.this.f28861p.remove(this.f28878a);
            g.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.F(this.f28878a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    class C0391g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f28884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f28885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28886c;

        C0391g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f28884a = iVar;
            this.f28885b = viewPropertyAnimator;
            this.f28886c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28885b.setListener(null);
            this.f28886c.setAlpha(1.0f);
            this.f28886c.setTranslationX(0.0f);
            this.f28886c.setTranslationY(0.0f);
            g.this.C(this.f28884a.f28892a, true);
            g.this.f28863r.remove(this.f28884a.f28892a);
            g.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f28884a.f28892a, true);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f28888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f28889b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28890c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f28888a = iVar;
            this.f28889b = viewPropertyAnimator;
            this.f28890c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28889b.setListener(null);
            this.f28890c.setAlpha(1.0f);
            this.f28890c.setTranslationX(0.0f);
            this.f28890c.setTranslationY(0.0f);
            g.this.C(this.f28888a.f28893b, false);
            g.this.f28863r.remove(this.f28888a.f28893b);
            g.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f28888a.f28893b, false);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.G f28898a;

        /* renamed from: b, reason: collision with root package name */
        public int f28899b;

        /* renamed from: c, reason: collision with root package name */
        public int f28900c;

        /* renamed from: d, reason: collision with root package name */
        public int f28901d;

        /* renamed from: e, reason: collision with root package name */
        public int f28902e;

        j(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
            this.f28898a = g10;
            this.f28899b = i10;
            this.f28900c = i11;
            this.f28901d = i12;
            this.f28902e = i13;
        }
    }

    private void U(RecyclerView.G g10) {
        View view = g10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f28862q.add(g10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(g10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void X(List<i> list, RecyclerView.G g10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Z(iVar, g10) && iVar.f28892a == null && iVar.f28893b == null) {
                list.remove(iVar);
            }
        }
    }

    private void Y(i iVar) {
        RecyclerView.G g10 = iVar.f28892a;
        if (g10 != null) {
            Z(iVar, g10);
        }
        RecyclerView.G g11 = iVar.f28893b;
        if (g11 != null) {
            Z(iVar, g11);
        }
    }

    private boolean Z(i iVar, RecyclerView.G g10) {
        boolean z10 = false;
        if (iVar.f28893b == g10) {
            iVar.f28893b = null;
        } else {
            if (iVar.f28892a != g10) {
                return false;
            }
            iVar.f28892a = null;
            z10 = true;
        }
        g10.itemView.setAlpha(1.0f);
        g10.itemView.setTranslationX(0.0f);
        g10.itemView.setTranslationY(0.0f);
        C(g10, z10);
        return true;
    }

    private void a0(RecyclerView.G g10) {
        if (f28852s == null) {
            f28852s = new ValueAnimator().getInterpolator();
        }
        g10.itemView.animate().setInterpolator(f28852s);
        j(g10);
    }

    void R(RecyclerView.G g10) {
        View view = g10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f28860o.add(g10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(g10, view, viewPropertyAnimatorAnimate)).start();
    }

    void S(i iVar) {
        RecyclerView.G g10 = iVar.f28892a;
        View view = g10 == null ? null : g10.itemView;
        RecyclerView.G g11 = iVar.f28893b;
        View view2 = g11 != null ? g11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f28863r.add(iVar.f28892a);
            duration.translationX(iVar.f28896e - iVar.f28894c);
            duration.translationY(iVar.f28897f - iVar.f28895d);
            duration.alpha(0.0f).setListener(new C0391g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f28863r.add(iVar.f28893b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void T(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
        View view = g10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f28861p.add(g10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(g10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void V(List<RecyclerView.G> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void W() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(RecyclerView.G g10, List<Object> list) {
        return !list.isEmpty() || super.g(g10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.G g10) {
        View view = g10.itemView;
        view.animate().cancel();
        int size = this.f28855j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f28855j.get(size).f28898a == g10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(g10);
                this.f28855j.remove(size);
            }
        }
        X(this.f28856k, g10);
        if (this.f28853h.remove(g10)) {
            view.setAlpha(1.0f);
            G(g10);
        }
        if (this.f28854i.remove(g10)) {
            view.setAlpha(1.0f);
            A(g10);
        }
        for (int size2 = this.f28859n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f28859n.get(size2);
            X(arrayList, g10);
            if (arrayList.isEmpty()) {
                this.f28859n.remove(size2);
            }
        }
        for (int size3 = this.f28858m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f28858m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f28898a == g10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(g10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f28858m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f28857l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.G> arrayList3 = this.f28857l.get(size5);
            if (arrayList3.remove(g10)) {
                view.setAlpha(1.0f);
                A(g10);
                if (arrayList3.isEmpty()) {
                    this.f28857l.remove(size5);
                }
            }
        }
        this.f28862q.remove(g10);
        this.f28860o.remove(g10);
        this.f28863r.remove(g10);
        this.f28861p.remove(g10);
        W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f28855j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f28855j.get(size);
            View view = jVar.f28898a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f28898a);
            this.f28855j.remove(size);
        }
        for (int size2 = this.f28853h.size() - 1; size2 >= 0; size2--) {
            G(this.f28853h.get(size2));
            this.f28853h.remove(size2);
        }
        int size3 = this.f28854i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.G g10 = this.f28854i.get(size3);
            g10.itemView.setAlpha(1.0f);
            A(g10);
            this.f28854i.remove(size3);
        }
        for (int size4 = this.f28856k.size() - 1; size4 >= 0; size4--) {
            Y(this.f28856k.get(size4));
        }
        this.f28856k.clear();
        if (p()) {
            for (int size5 = this.f28858m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f28858m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f28898a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f28898a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f28858m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f28857l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.G> arrayList2 = this.f28857l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.G g11 = arrayList2.get(size8);
                    g11.itemView.setAlpha(1.0f);
                    A(g11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f28857l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f28859n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f28859n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Y(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f28859n.remove(arrayList3);
                    }
                }
            }
            V(this.f28862q);
            V(this.f28861p);
            V(this.f28860o);
            V(this.f28863r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f28854i.isEmpty() && this.f28856k.isEmpty() && this.f28855j.isEmpty() && this.f28853h.isEmpty() && this.f28861p.isEmpty() && this.f28862q.isEmpty() && this.f28860o.isEmpty() && this.f28863r.isEmpty() && this.f28858m.isEmpty() && this.f28857l.isEmpty() && this.f28859n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean zIsEmpty = this.f28853h.isEmpty();
        boolean zIsEmpty2 = this.f28855j.isEmpty();
        boolean zIsEmpty3 = this.f28856k.isEmpty();
        boolean zIsEmpty4 = this.f28854i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.G> it = this.f28853h.iterator();
        while (it.hasNext()) {
            U(it.next());
        }
        this.f28853h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f28855j);
            this.f28858m.add(arrayList);
            this.f28855j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                X.g0(arrayList.get(0).f28898a.itemView, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f28856k);
            this.f28859n.add(arrayList2);
            this.f28856k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                X.g0(arrayList2.get(0).f28892a.itemView, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.G> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f28854i);
        this.f28857l.add(arrayList3);
        this.f28854i.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            X.g0(arrayList3.get(0).itemView, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.u
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.G g10) {
        a0(g10);
        g10.itemView.setAlpha(0.0f);
        this.f28854i.add(g10);
        return true;
    }

    @Override // androidx.recyclerview.widget.u
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.G g10, RecyclerView.G g11, int i10, int i11, int i12, int i13) {
        if (g10 == g11) {
            return y(g10, i10, i11, i12, i13);
        }
        float translationX = g10.itemView.getTranslationX();
        float translationY = g10.itemView.getTranslationY();
        float alpha = g10.itemView.getAlpha();
        a0(g10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        g10.itemView.setTranslationX(translationX);
        g10.itemView.setTranslationY(translationY);
        g10.itemView.setAlpha(alpha);
        if (g11 != null) {
            a0(g11);
            g11.itemView.setTranslationX(-i14);
            g11.itemView.setTranslationY(-i15);
            g11.itemView.setAlpha(0.0f);
        }
        this.f28856k.add(new i(g10, g11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.u
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
        View view = g10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) g10.itemView.getTranslationY());
        a0(g10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(g10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f28855j.add(new j(g10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.u
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.G g10) {
        a0(g10);
        this.f28853h.add(g10);
        return true;
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.G f28892a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.G f28893b;

        /* renamed from: c, reason: collision with root package name */
        public int f28894c;

        /* renamed from: d, reason: collision with root package name */
        public int f28895d;

        /* renamed from: e, reason: collision with root package name */
        public int f28896e;

        /* renamed from: f, reason: collision with root package name */
        public int f28897f;

        private i(RecyclerView.G g10, RecyclerView.G g11) {
            this.f28892a = g10;
            this.f28893b = g11;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f28892a + ", newHolder=" + this.f28893b + ", fromX=" + this.f28894c + ", fromY=" + this.f28895d + ", toX=" + this.f28896e + ", toY=" + this.f28897f + '}';
        }

        i(RecyclerView.G g10, RecyclerView.G g11, int i10, int i11, int i12, int i13) {
            this(g10, g11);
            this.f28894c = i10;
            this.f28895d = i11;
            this.f28896e = i12;
            this.f28897f = i13;
        }
    }
}
