package p024c.p088x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.C0311u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p024c.p041e.C0867a;
import p024c.p041e.C0870d;

/* compiled from: Transition.java */
/* renamed from: c.x.m */
/* loaded from: classes.dex */
public abstract class AbstractC1047m implements Cloneable {

    /* renamed from: f */
    private static final int[] f6871f = {2, 1, 3, 4};

    /* renamed from: g */
    private static final AbstractC1035g f6872g = new a();

    /* renamed from: h */
    private static ThreadLocal<C0867a<Animator, d>> f6873h = new ThreadLocal<>();

    /* renamed from: B */
    private ArrayList<C1054s> f6875B;

    /* renamed from: C */
    private ArrayList<C1054s> f6876C;

    /* renamed from: L */
    AbstractC1051p f6885L;

    /* renamed from: M */
    private e f6886M;

    /* renamed from: N */
    private C0867a<String, String> f6887N;

    /* renamed from: i */
    private String f6889i = getClass().getName();

    /* renamed from: j */
    private long f6890j = -1;

    /* renamed from: k */
    long f6891k = -1;

    /* renamed from: l */
    private TimeInterpolator f6892l = null;

    /* renamed from: m */
    ArrayList<Integer> f6893m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<View> f6894n = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<String> f6895o = null;

    /* renamed from: p */
    private ArrayList<Class<?>> f6896p = null;

    /* renamed from: q */
    private ArrayList<Integer> f6897q = null;

    /* renamed from: r */
    private ArrayList<View> f6898r = null;

    /* renamed from: s */
    private ArrayList<Class<?>> f6899s = null;

    /* renamed from: t */
    private ArrayList<String> f6900t = null;

    /* renamed from: u */
    private ArrayList<Integer> f6901u = null;

    /* renamed from: v */
    private ArrayList<View> f6902v = null;

    /* renamed from: w */
    private ArrayList<Class<?>> f6903w = null;

    /* renamed from: x */
    private C1055t f6904x = new C1055t();

    /* renamed from: y */
    private C1055t f6905y = new C1055t();

    /* renamed from: z */
    C1052q f6906z = null;

    /* renamed from: A */
    private int[] f6874A = f6871f;

    /* renamed from: D */
    private ViewGroup f6877D = null;

    /* renamed from: E */
    boolean f6878E = false;

    /* renamed from: F */
    ArrayList<Animator> f6879F = new ArrayList<>();

    /* renamed from: G */
    private int f6880G = 0;

    /* renamed from: H */
    private boolean f6881H = false;

    /* renamed from: I */
    private boolean f6882I = false;

    /* renamed from: J */
    private ArrayList<f> f6883J = null;

    /* renamed from: K */
    private ArrayList<Animator> f6884K = new ArrayList<>();

    /* renamed from: O */
    private AbstractC1035g f6888O = f6872g;

    /* compiled from: Transition.java */
    /* renamed from: c.x.m$a */
    static class a extends AbstractC1035g {
        a() {
        }

        @Override // p024c.p088x.AbstractC1035g
        /* renamed from: a */
        public Path mo6589a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: c.x.m$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0867a f6907a;

        b(C0867a c0867a) {
            this.f6907a = c0867a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6907a.remove(animator);
            AbstractC1047m.this.f6879F.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC1047m.this.f6879F.add(animator);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: c.x.m$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1047m.this.m6648q();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: c.x.m$d */
    private static class d {

        /* renamed from: a */
        View f6910a;

        /* renamed from: b */
        String f6911b;

        /* renamed from: c */
        C1054s f6912c;

        /* renamed from: d */
        InterfaceC1048m0 f6913d;

        /* renamed from: e */
        AbstractC1047m f6914e;

        d(View view, String str, AbstractC1047m abstractC1047m, InterfaceC1048m0 interfaceC1048m0, C1054s c1054s) {
            this.f6910a = view;
            this.f6911b = str;
            this.f6912c = c1054s;
            this.f6913d = interfaceC1048m0;
            this.f6914e = abstractC1047m;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: c.x.m$e */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* renamed from: c.x.m$f */
    public interface f {
        /* renamed from: a */
        void mo6584a(AbstractC1047m abstractC1047m);

        /* renamed from: b */
        void mo6554b(AbstractC1047m abstractC1047m);

        /* renamed from: c */
        void mo6555c(AbstractC1047m abstractC1047m);

        /* renamed from: d */
        void mo6556d(AbstractC1047m abstractC1047m);

        /* renamed from: e */
        void mo6557e(AbstractC1047m abstractC1047m);
    }

    /* renamed from: B */
    private static C0867a<Animator, d> m6607B() {
        C0867a<Animator, d> c0867a = f6873h.get();
        if (c0867a != null) {
            return c0867a;
        }
        C0867a<Animator, d> c0867a2 = new C0867a<>();
        f6873h.set(c0867a2);
        return c0867a2;
    }

    /* renamed from: L */
    private static boolean m6608L(C1054s c1054s, C1054s c1054s2, String str) {
        Object obj = c1054s.f6933a.get(str);
        Object obj2 = c1054s2.f6933a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: M */
    private void m6609M(C0867a<View, C1054s> c0867a, C0867a<View, C1054s> c0867a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewValueAt = sparseArray.valueAt(i2);
            if (viewValueAt != null && m6625K(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && m6625K(view)) {
                C1054s c1054s = c0867a.get(viewValueAt);
                C1054s c1054s2 = c0867a2.get(view);
                if (c1054s != null && c1054s2 != null) {
                    this.f6875B.add(c1054s);
                    this.f6876C.add(c1054s2);
                    c0867a.remove(viewValueAt);
                    c0867a2.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    private void m6610N(C0867a<View, C1054s> c0867a, C0867a<View, C1054s> c0867a2) {
        C1054s c1054sRemove;
        for (int size = c0867a.size() - 1; size >= 0; size--) {
            View viewM5473j = c0867a.m5473j(size);
            if (viewM5473j != null && m6625K(viewM5473j) && (c1054sRemove = c0867a2.remove(viewM5473j)) != null && m6625K(c1054sRemove.f6934b)) {
                this.f6875B.add(c0867a.mo5475l(size));
                this.f6876C.add(c1054sRemove);
            }
        }
    }

    /* renamed from: O */
    private void m6611O(C0867a<View, C1054s> c0867a, C0867a<View, C1054s> c0867a2, C0870d<View> c0870d, C0870d<View> c0870d2) {
        View viewM5438g;
        int iM5445n = c0870d.m5445n();
        for (int i2 = 0; i2 < iM5445n; i2++) {
            View viewM5446o = c0870d.m5446o(i2);
            if (viewM5446o != null && m6625K(viewM5446o) && (viewM5438g = c0870d2.m5438g(c0870d.m5441j(i2))) != null && m6625K(viewM5438g)) {
                C1054s c1054s = c0867a.get(viewM5446o);
                C1054s c1054s2 = c0867a2.get(viewM5438g);
                if (c1054s != null && c1054s2 != null) {
                    this.f6875B.add(c1054s);
                    this.f6876C.add(c1054s2);
                    c0867a.remove(viewM5446o);
                    c0867a2.remove(viewM5438g);
                }
            }
        }
    }

    /* renamed from: P */
    private void m6612P(C0867a<View, C1054s> c0867a, C0867a<View, C1054s> c0867a2, C0867a<String, View> c0867a3, C0867a<String, View> c0867a4) {
        View view;
        int size = c0867a3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewM5477n = c0867a3.m5477n(i2);
            if (viewM5477n != null && m6625K(viewM5477n) && (view = c0867a4.get(c0867a3.m5473j(i2))) != null && m6625K(view)) {
                C1054s c1054s = c0867a.get(viewM5477n);
                C1054s c1054s2 = c0867a2.get(view);
                if (c1054s != null && c1054s2 != null) {
                    this.f6875B.add(c1054s);
                    this.f6876C.add(c1054s2);
                    c0867a.remove(viewM5477n);
                    c0867a2.remove(view);
                }
            }
        }
    }

    /* renamed from: Q */
    private void m6613Q(C1055t c1055t, C1055t c1055t2) {
        C0867a<View, C1054s> c0867a = new C0867a<>(c1055t.f6936a);
        C0867a<View, C1054s> c0867a2 = new C0867a<>(c1055t2.f6936a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f6874A;
            if (i2 >= iArr.length) {
                m6615e(c0867a, c0867a2);
                return;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                m6610N(c0867a, c0867a2);
            } else if (i3 == 2) {
                m6612P(c0867a, c0867a2, c1055t.f6939d, c1055t2.f6939d);
            } else if (i3 == 3) {
                m6609M(c0867a, c0867a2, c1055t.f6937b, c1055t2.f6937b);
            } else if (i3 == 4) {
                m6611O(c0867a, c0867a2, c1055t.f6938c, c1055t2.f6938c);
            }
            i2++;
        }
    }

    /* renamed from: X */
    private void m6614X(Animator animator, C0867a<Animator, d> c0867a) {
        if (animator != null) {
            animator.addListener(new b(c0867a));
            m6639g(animator);
        }
    }

    /* renamed from: e */
    private void m6615e(C0867a<View, C1054s> c0867a, C0867a<View, C1054s> c0867a2) {
        for (int i2 = 0; i2 < c0867a.size(); i2++) {
            C1054s c1054sM5477n = c0867a.m5477n(i2);
            if (m6625K(c1054sM5477n.f6934b)) {
                this.f6875B.add(c1054sM5477n);
                this.f6876C.add(null);
            }
        }
        for (int i3 = 0; i3 < c0867a2.size(); i3++) {
            C1054s c1054sM5477n2 = c0867a2.m5477n(i3);
            if (m6625K(c1054sM5477n2.f6934b)) {
                this.f6876C.add(c1054sM5477n2);
                this.f6875B.add(null);
            }
        }
    }

    /* renamed from: f */
    private static void m6616f(C1055t c1055t, View view, C1054s c1054s) {
        c1055t.f6936a.put(view, c1054s);
        int id = view.getId();
        if (id >= 0) {
            if (c1055t.f6937b.indexOfKey(id) >= 0) {
                c1055t.f6937b.put(id, null);
            } else {
                c1055t.f6937b.put(id, view);
            }
        }
        String strM2094G = C0311u.m2094G(view);
        if (strM2094G != null) {
            if (c1055t.f6939d.containsKey(strM2094G)) {
                c1055t.f6939d.put(strM2094G, null);
            } else {
                c1055t.f6939d.put(strM2094G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1055t.f6938c.m5440i(itemIdAtPosition) < 0) {
                    C0311u.m2151s0(view, true);
                    c1055t.f6938c.m5442k(itemIdAtPosition, view);
                    return;
                }
                View viewM5438g = c1055t.f6938c.m5438g(itemIdAtPosition);
                if (viewM5438g != null) {
                    C0311u.m2151s0(viewM5438g, false);
                    c1055t.f6938c.m5442k(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: i */
    private void m6617i(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f6897q;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f6898r;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f6899s;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f6899s.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C1054s c1054s = new C1054s(view);
                    if (z) {
                        mo6540k(c1054s);
                    } else {
                        mo6539h(c1054s);
                    }
                    c1054s.f6935c.add(this);
                    mo6642j(c1054s);
                    if (z) {
                        m6616f(this.f6904x, view, c1054s);
                    } else {
                        m6616f(this.f6905y, view, c1054s);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f6901u;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f6902v;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f6903w;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.f6903w.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                m6617i(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public AbstractC1051p m6618A() {
        return this.f6885L;
    }

    /* renamed from: C */
    public long m6619C() {
        return this.f6890j;
    }

    /* renamed from: D */
    public List<Integer> m6620D() {
        return this.f6893m;
    }

    /* renamed from: E */
    public List<String> m6621E() {
        return this.f6895o;
    }

    /* renamed from: F */
    public List<Class<?>> m6622F() {
        return this.f6896p;
    }

    /* renamed from: G */
    public List<View> m6623G() {
        return this.f6894n;
    }

    /* renamed from: H */
    public String[] mo6538H() {
        return null;
    }

    /* renamed from: I */
    public C1054s m6624I(View view, boolean z) {
        C1052q c1052q = this.f6906z;
        if (c1052q != null) {
            return c1052q.m6624I(view, z);
        }
        return (z ? this.f6904x : this.f6905y).f6936a.get(view);
    }

    /* renamed from: J */
    public boolean mo6597J(C1054s c1054s, C1054s c1054s2) {
        if (c1054s == null || c1054s2 == null) {
            return false;
        }
        String[] strArrMo6538H = mo6538H();
        if (strArrMo6538H == null) {
            Iterator<String> it = c1054s.f6933a.keySet().iterator();
            while (it.hasNext()) {
                if (m6608L(c1054s, c1054s2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo6538H) {
            if (!m6608L(c1054s, c1054s2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: K */
    boolean m6625K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f6897q;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6898r;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6899s;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f6899s.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6900t != null && C0311u.m2094G(view) != null && this.f6900t.contains(C0311u.m2094G(view))) {
            return false;
        }
        if ((this.f6893m.size() == 0 && this.f6894n.size() == 0 && (((arrayList = this.f6896p) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6895o) == null || arrayList2.isEmpty()))) || this.f6893m.contains(Integer.valueOf(id)) || this.f6894n.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6895o;
        if (arrayList6 != null && arrayList6.contains(C0311u.m2094G(view))) {
            return true;
        }
        if (this.f6896p != null) {
            for (int i3 = 0; i3 < this.f6896p.size(); i3++) {
                if (this.f6896p.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: R */
    public void mo6626R(View view) {
        if (this.f6882I) {
            return;
        }
        C0867a<Animator, d> c0867aM6607B = m6607B();
        int size = c0867aM6607B.size();
        InterfaceC1048m0 interfaceC1048m0M6564d = C1028c0.m6564d(view);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            d dVarM5477n = c0867aM6607B.m5477n(i2);
            if (dVarM5477n.f6910a != null && interfaceC1048m0M6564d.equals(dVarM5477n.f6913d)) {
                C1023a.m6531b(c0867aM6607B.m5473j(i2));
            }
        }
        ArrayList<f> arrayList = this.f6883J;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6883J.clone();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((f) arrayList2.get(i3)).mo6554b(this);
            }
        }
        this.f6881H = true;
    }

    /* renamed from: S */
    void m6627S(ViewGroup viewGroup) {
        d dVar;
        this.f6875B = new ArrayList<>();
        this.f6876C = new ArrayList<>();
        m6613Q(this.f6904x, this.f6905y);
        C0867a<Animator, d> c0867aM6607B = m6607B();
        int size = c0867aM6607B.size();
        InterfaceC1048m0 interfaceC1048m0M6564d = C1028c0.m6564d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animatorM5473j = c0867aM6607B.m5473j(i2);
            if (animatorM5473j != null && (dVar = c0867aM6607B.get(animatorM5473j)) != null && dVar.f6910a != null && interfaceC1048m0M6564d.equals(dVar.f6913d)) {
                C1054s c1054s = dVar.f6912c;
                View view = dVar.f6910a;
                C1054s c1054sM6624I = m6624I(view, true);
                C1054s c1054sM6652u = m6652u(view, true);
                if (c1054sM6624I == null && c1054sM6652u == null) {
                    c1054sM6652u = this.f6905y.f6936a.get(view);
                }
                if (!(c1054sM6624I == null && c1054sM6652u == null) && dVar.f6914e.mo6597J(c1054s, c1054sM6652u)) {
                    if (animatorM5473j.isRunning() || animatorM5473j.isStarted()) {
                        animatorM5473j.cancel();
                    } else {
                        c0867aM6607B.remove(animatorM5473j);
                    }
                }
            }
        }
        mo6647p(viewGroup, this.f6904x, this.f6905y, this.f6875B, this.f6876C);
        mo6631Z();
    }

    /* renamed from: T */
    public AbstractC1047m mo6628T(f fVar) {
        ArrayList<f> arrayList = this.f6883J;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f6883J.size() == 0) {
            this.f6883J = null;
        }
        return this;
    }

    /* renamed from: U */
    public AbstractC1047m mo6629U(View view) {
        this.f6894n.remove(view);
        return this;
    }

    /* renamed from: V */
    public void mo6630V(View view) {
        if (this.f6881H) {
            if (!this.f6882I) {
                C0867a<Animator, d> c0867aM6607B = m6607B();
                int size = c0867aM6607B.size();
                InterfaceC1048m0 interfaceC1048m0M6564d = C1028c0.m6564d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d dVarM5477n = c0867aM6607B.m5477n(i2);
                    if (dVarM5477n.f6910a != null && interfaceC1048m0M6564d.equals(dVarM5477n.f6913d)) {
                        C1023a.m6532c(c0867aM6607B.m5473j(i2));
                    }
                }
                ArrayList<f> arrayList = this.f6883J;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6883J.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).mo6557e(this);
                    }
                }
            }
            this.f6881H = false;
        }
    }

    /* renamed from: Z */
    protected void mo6631Z() {
        m6641h0();
        C0867a<Animator, d> c0867aM6607B = m6607B();
        Iterator<Animator> it = this.f6884K.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c0867aM6607B.containsKey(next)) {
                m6641h0();
                m6614X(next, c0867aM6607B);
            }
        }
        this.f6884K.clear();
        m6648q();
    }

    /* renamed from: a0 */
    public AbstractC1047m mo6632a0(long j2) {
        this.f6891k = j2;
        return this;
    }

    /* renamed from: b */
    public AbstractC1047m mo6633b(f fVar) {
        if (this.f6883J == null) {
            this.f6883J = new ArrayList<>();
        }
        this.f6883J.add(fVar);
        return this;
    }

    /* renamed from: b0 */
    public void mo6634b0(e eVar) {
        this.f6886M = eVar;
    }

    /* renamed from: c0 */
    public AbstractC1047m mo6635c0(TimeInterpolator timeInterpolator) {
        this.f6892l = timeInterpolator;
        return this;
    }

    protected void cancel() {
        for (int size = this.f6879F.size() - 1; size >= 0; size--) {
            this.f6879F.get(size).cancel();
        }
        ArrayList<f> arrayList = this.f6883J;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f6883J.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((f) arrayList2.get(i2)).mo6556d(this);
        }
    }

    /* renamed from: d */
    public AbstractC1047m mo6636d(View view) {
        this.f6894n.add(view);
        return this;
    }

    /* renamed from: d0 */
    public void mo6637d0(AbstractC1035g abstractC1035g) {
        if (abstractC1035g == null) {
            this.f6888O = f6872g;
        } else {
            this.f6888O = abstractC1035g;
        }
    }

    /* renamed from: f0 */
    public void mo6638f0(AbstractC1051p abstractC1051p) {
    }

    /* renamed from: g */
    protected void m6639g(Animator animator) {
        if (animator == null) {
            m6648q();
            return;
        }
        if (m6649r() >= 0) {
            animator.setDuration(m6649r());
        }
        if (m6619C() >= 0) {
            animator.setStartDelay(m6619C() + animator.getStartDelay());
        }
        if (m6651t() != null) {
            animator.setInterpolator(m6651t());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* renamed from: g0 */
    public AbstractC1047m mo6640g0(long j2) {
        this.f6890j = j2;
        return this;
    }

    /* renamed from: h */
    public abstract void mo6539h(C1054s c1054s);

    /* renamed from: h0 */
    protected void m6641h0() {
        if (this.f6880G == 0) {
            ArrayList<f> arrayList = this.f6883J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6883J.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).mo6584a(this);
                }
            }
            this.f6882I = false;
        }
        this.f6880G++;
    }

    /* renamed from: j */
    void mo6642j(C1054s c1054s) {
        if (this.f6885L != null && !c1054s.f6933a.isEmpty()) {
            throw null;
        }
    }

    /* renamed from: j0 */
    String mo6643j0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6891k != -1) {
            str2 = str2 + "dur(" + this.f6891k + ") ";
        }
        if (this.f6890j != -1) {
            str2 = str2 + "dly(" + this.f6890j + ") ";
        }
        if (this.f6892l != null) {
            str2 = str2 + "interp(" + this.f6892l + ") ";
        }
        if (this.f6893m.size() <= 0 && this.f6894n.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6893m.size() > 0) {
            for (int i2 = 0; i2 < this.f6893m.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6893m.get(i2);
            }
        }
        if (this.f6894n.size() > 0) {
            for (int i3 = 0; i3 < this.f6894n.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6894n.get(i3);
            }
        }
        return str3 + ")";
    }

    /* renamed from: k */
    public abstract void mo6540k(C1054s c1054s);

    /* renamed from: l */
    void m6644l(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C0867a<String, String> c0867a;
        m6645m(z);
        if ((this.f6893m.size() > 0 || this.f6894n.size() > 0) && (((arrayList = this.f6895o) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6896p) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f6893m.size(); i2++) {
                View viewFindViewById = viewGroup.findViewById(this.f6893m.get(i2).intValue());
                if (viewFindViewById != null) {
                    C1054s c1054s = new C1054s(viewFindViewById);
                    if (z) {
                        mo6540k(c1054s);
                    } else {
                        mo6539h(c1054s);
                    }
                    c1054s.f6935c.add(this);
                    mo6642j(c1054s);
                    if (z) {
                        m6616f(this.f6904x, viewFindViewById, c1054s);
                    } else {
                        m6616f(this.f6905y, viewFindViewById, c1054s);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f6894n.size(); i3++) {
                View view = this.f6894n.get(i3);
                C1054s c1054s2 = new C1054s(view);
                if (z) {
                    mo6540k(c1054s2);
                } else {
                    mo6539h(c1054s2);
                }
                c1054s2.f6935c.add(this);
                mo6642j(c1054s2);
                if (z) {
                    m6616f(this.f6904x, view, c1054s2);
                } else {
                    m6616f(this.f6905y, view, c1054s2);
                }
            }
        } else {
            m6617i(viewGroup, z);
        }
        if (z || (c0867a = this.f6887N) == null) {
            return;
        }
        int size = c0867a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(this.f6904x.f6939d.remove(this.f6887N.m5473j(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.f6904x.f6939d.put(this.f6887N.m5477n(i5), view2);
            }
        }
    }

    /* renamed from: m */
    void m6645m(boolean z) {
        if (z) {
            this.f6904x.f6936a.clear();
            this.f6904x.f6937b.clear();
            this.f6904x.f6938c.m5436d();
        } else {
            this.f6905y.f6936a.clear();
            this.f6905y.f6937b.clear();
            this.f6905y.f6938c.m5436d();
        }
    }

    @Override // 
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC1047m clone() {
        try {
            AbstractC1047m abstractC1047m = (AbstractC1047m) super.clone();
            abstractC1047m.f6884K = new ArrayList<>();
            abstractC1047m.f6904x = new C1055t();
            abstractC1047m.f6905y = new C1055t();
            abstractC1047m.f6875B = null;
            abstractC1047m.f6876C = null;
            return abstractC1047m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public Animator mo6541o(ViewGroup viewGroup, C1054s c1054s, C1054s c1054s2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo6647p(android.view.ViewGroup r20, p024c.p088x.C1055t r21, p024c.p088x.C1055t r22, java.util.ArrayList<p024c.p088x.C1054s> r23, java.util.ArrayList<p024c.p088x.C1054s> r24) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p088x.AbstractC1047m.mo6647p(android.view.ViewGroup, c.x.t, c.x.t, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: q */
    protected void m6648q() {
        int i2 = this.f6880G - 1;
        this.f6880G = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.f6883J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6883J.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).mo6555c(this);
                }
            }
            for (int i4 = 0; i4 < this.f6904x.f6938c.m5445n(); i4++) {
                View viewM5446o = this.f6904x.f6938c.m5446o(i4);
                if (viewM5446o != null) {
                    C0311u.m2151s0(viewM5446o, false);
                }
            }
            for (int i5 = 0; i5 < this.f6905y.f6938c.m5445n(); i5++) {
                View viewM5446o2 = this.f6905y.f6938c.m5446o(i5);
                if (viewM5446o2 != null) {
                    C0311u.m2151s0(viewM5446o2, false);
                }
            }
            this.f6882I = true;
        }
    }

    /* renamed from: r */
    public long m6649r() {
        return this.f6891k;
    }

    /* renamed from: s */
    public e m6650s() {
        return this.f6886M;
    }

    /* renamed from: t */
    public TimeInterpolator m6651t() {
        return this.f6892l;
    }

    public String toString() {
        return mo6643j0(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.f6876C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.f6875B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p024c.p088x.C1054s m6652u(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            c.x.q r0 = r6.f6906z
            if (r0 == 0) goto L9
            c.x.s r7 = r0.m6652u(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<c.x.s> r0 = r6.f6875B
            goto L10
        Le:
            java.util.ArrayList<c.x.s> r0 = r6.f6876C
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            c.x.s r5 = (p024c.p088x.C1054s) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f6934b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<c.x.s> r7 = r6.f6876C
            goto L37
        L35:
            java.util.ArrayList<c.x.s> r7 = r6.f6875B
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            c.x.s r1 = (p024c.p088x.C1054s) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p088x.AbstractC1047m.m6652u(android.view.View, boolean):c.x.s");
    }

    /* renamed from: v */
    public String m6653v() {
        return this.f6889i;
    }

    /* renamed from: w */
    public AbstractC1035g m6654w() {
        return this.f6888O;
    }
}
