package p024c.p088x;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p024c.p088x.AbstractC1047m;

/* compiled from: TransitionSet.java */
/* renamed from: c.x.q */
/* loaded from: classes.dex */
public class C1052q extends AbstractC1047m {

    /* renamed from: R */
    int f6924R;

    /* renamed from: P */
    private ArrayList<AbstractC1047m> f6922P = new ArrayList<>();

    /* renamed from: Q */
    private boolean f6923Q = true;

    /* renamed from: S */
    boolean f6925S = false;

    /* renamed from: T */
    private int f6926T = 0;

    /* compiled from: TransitionSet.java */
    /* renamed from: c.x.q$a */
    class a extends C1049n {

        /* renamed from: a */
        final /* synthetic */ AbstractC1047m f6927a;

        a(AbstractC1047m abstractC1047m) {
            this.f6927a = abstractC1047m;
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            this.f6927a.mo6631Z();
            abstractC1047m.mo6628T(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* renamed from: c.x.q$b */
    static class b extends C1049n {

        /* renamed from: a */
        C1052q f6929a;

        b(C1052q c1052q) {
            this.f6929a = c1052q;
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: a */
        public void mo6584a(AbstractC1047m abstractC1047m) {
            C1052q c1052q = this.f6929a;
            if (c1052q.f6925S) {
                return;
            }
            c1052q.m6641h0();
            this.f6929a.f6925S = true;
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            C1052q c1052q = this.f6929a;
            int i2 = c1052q.f6924R - 1;
            c1052q.f6924R = i2;
            if (i2 == 0) {
                c1052q.f6925S = false;
                c1052q.m6648q();
            }
            abstractC1047m.mo6628T(this);
        }
    }

    /* renamed from: n0 */
    private void m6660n0(AbstractC1047m abstractC1047m) {
        this.f6922P.add(abstractC1047m);
        abstractC1047m.f6906z = this;
    }

    /* renamed from: x0 */
    private void m6661x0() {
        b bVar = new b(this);
        Iterator<AbstractC1047m> it = this.f6922P.iterator();
        while (it.hasNext()) {
            it.next().mo6633b(bVar);
        }
        this.f6924R = this.f6922P.size();
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: R */
    public void mo6626R(View view) {
        super.mo6626R(view);
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6922P.get(i2).mo6626R(view);
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: V */
    public void mo6630V(View view) {
        super.mo6630V(view);
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6922P.get(i2).mo6630V(view);
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: Z */
    protected void mo6631Z() {
        if (this.f6922P.isEmpty()) {
            m6641h0();
            m6648q();
            return;
        }
        m6661x0();
        if (this.f6923Q) {
            Iterator<AbstractC1047m> it = this.f6922P.iterator();
            while (it.hasNext()) {
                it.next().mo6631Z();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f6922P.size(); i2++) {
            this.f6922P.get(i2 - 1).mo6633b(new a(this.f6922P.get(i2)));
        }
        AbstractC1047m abstractC1047m = this.f6922P.get(0);
        if (abstractC1047m != null) {
            abstractC1047m.mo6631Z();
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: b0 */
    public void mo6634b0(AbstractC1047m.e eVar) {
        super.mo6634b0(eVar);
        this.f6926T |= 8;
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6922P.get(i2).mo6634b0(eVar);
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: d0 */
    public void mo6637d0(AbstractC1035g abstractC1035g) {
        super.mo6637d0(abstractC1035g);
        this.f6926T |= 4;
        if (this.f6922P != null) {
            for (int i2 = 0; i2 < this.f6922P.size(); i2++) {
                this.f6922P.get(i2).mo6637d0(abstractC1035g);
            }
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: f0 */
    public void mo6638f0(AbstractC1051p abstractC1051p) {
        super.mo6638f0(abstractC1051p);
        this.f6926T |= 2;
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6922P.get(i2).mo6638f0(abstractC1051p);
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: h */
    public void mo6539h(C1054s c1054s) {
        if (m6625K(c1054s.f6934b)) {
            Iterator<AbstractC1047m> it = this.f6922P.iterator();
            while (it.hasNext()) {
                AbstractC1047m next = it.next();
                if (next.m6625K(c1054s.f6934b)) {
                    next.mo6539h(c1054s);
                    c1054s.f6935c.add(next);
                }
            }
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: j */
    void mo6642j(C1054s c1054s) {
        super.mo6642j(c1054s);
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6922P.get(i2).mo6642j(c1054s);
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: j0 */
    String mo6643j0(String str) {
        String strMo6643j0 = super.mo6643j0(str);
        for (int i2 = 0; i2 < this.f6922P.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo6643j0);
            sb.append("\n");
            sb.append(this.f6922P.get(i2).mo6643j0(str + "  "));
            strMo6643j0 = sb.toString();
        }
        return strMo6643j0;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: k */
    public void mo6540k(C1054s c1054s) {
        if (m6625K(c1054s.f6934b)) {
            Iterator<AbstractC1047m> it = this.f6922P.iterator();
            while (it.hasNext()) {
                AbstractC1047m next = it.next();
                if (next.m6625K(c1054s.f6934b)) {
                    next.mo6540k(c1054s);
                    c1054s.f6935c.add(next);
                }
            }
        }
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6633b(AbstractC1047m.f fVar) {
        return (C1052q) super.mo6633b(fVar);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6636d(View view) {
        for (int i2 = 0; i2 < this.f6922P.size(); i2++) {
            this.f6922P.get(i2).mo6636d(view);
        }
        return (C1052q) super.mo6636d(view);
    }

    /* renamed from: m0 */
    public C1052q m6664m0(AbstractC1047m abstractC1047m) {
        m6660n0(abstractC1047m);
        long j2 = this.f6891k;
        if (j2 >= 0) {
            abstractC1047m.mo6632a0(j2);
        }
        if ((this.f6926T & 1) != 0) {
            abstractC1047m.mo6635c0(m6651t());
        }
        if ((this.f6926T & 2) != 0) {
            abstractC1047m.mo6638f0(m6618A());
        }
        if ((this.f6926T & 4) != 0) {
            abstractC1047m.mo6637d0(m6654w());
        }
        if ((this.f6926T & 8) != 0) {
            abstractC1047m.mo6634b0(m6650s());
        }
        return this;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: n */
    public AbstractC1047m clone() {
        C1052q c1052q = (C1052q) super.clone();
        c1052q.f6922P = new ArrayList<>();
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1052q.m6660n0(this.f6922P.get(i2).clone());
        }
        return c1052q;
    }

    /* renamed from: o0 */
    public AbstractC1047m m6665o0(int i2) {
        if (i2 < 0 || i2 >= this.f6922P.size()) {
            return null;
        }
        return this.f6922P.get(i2);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: p */
    protected void mo6647p(ViewGroup viewGroup, C1055t c1055t, C1055t c1055t2, ArrayList<C1054s> arrayList, ArrayList<C1054s> arrayList2) {
        long jM6619C = m6619C();
        int size = this.f6922P.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1047m abstractC1047m = this.f6922P.get(i2);
            if (jM6619C > 0 && (this.f6923Q || i2 == 0)) {
                long jM6619C2 = abstractC1047m.m6619C();
                if (jM6619C2 > 0) {
                    abstractC1047m.mo6640g0(jM6619C2 + jM6619C);
                } else {
                    abstractC1047m.mo6640g0(jM6619C);
                }
            }
            abstractC1047m.mo6647p(viewGroup, c1055t, c1055t2, arrayList, arrayList2);
        }
    }

    /* renamed from: q0 */
    public int m6666q0() {
        return this.f6922P.size();
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6628T(AbstractC1047m.f fVar) {
        return (C1052q) super.mo6628T(fVar);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6629U(View view) {
        for (int i2 = 0; i2 < this.f6922P.size(); i2++) {
            this.f6922P.get(i2).mo6629U(view);
        }
        return (C1052q) super.mo6629U(view);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6632a0(long j2) {
        ArrayList<AbstractC1047m> arrayList;
        super.mo6632a0(j2);
        if (this.f6891k >= 0 && (arrayList = this.f6922P) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6922P.get(i2).mo6632a0(j2);
            }
        }
        return this;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6635c0(TimeInterpolator timeInterpolator) {
        this.f6926T |= 1;
        ArrayList<AbstractC1047m> arrayList = this.f6922P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6922P.get(i2).mo6635c0(timeInterpolator);
            }
        }
        return (C1052q) super.mo6635c0(timeInterpolator);
    }

    /* renamed from: v0 */
    public C1052q m6671v0(int i2) {
        if (i2 == 0) {
            this.f6923Q = true;
        } else {
            if (i2 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
            }
            this.f6923Q = false;
        }
        return this;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C1052q mo6640g0(long j2) {
        return (C1052q) super.mo6640g0(j2);
    }
}
