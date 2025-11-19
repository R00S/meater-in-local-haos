package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2190k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class v extends AbstractC2190k {

    /* renamed from: s0, reason: collision with root package name */
    int f29583s0;

    /* renamed from: q0, reason: collision with root package name */
    ArrayList<AbstractC2190k> f29581q0 = new ArrayList<>();

    /* renamed from: r0, reason: collision with root package name */
    private boolean f29582r0 = true;

    /* renamed from: t0, reason: collision with root package name */
    boolean f29584t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private int f29585u0 = 0;

    /* compiled from: TransitionSet.java */
    class a extends r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2190k f29586a;

        a(AbstractC2190k abstractC2190k) {
            this.f29586a = abstractC2190k;
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            this.f29586a.m0();
            abstractC2190k.i0(this);
        }
    }

    /* compiled from: TransitionSet.java */
    class b extends r {
        b() {
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void k(AbstractC2190k abstractC2190k) {
            v.this.f29581q0.remove(abstractC2190k);
            if (v.this.Q()) {
                return;
            }
            v.this.c0(AbstractC2190k.i.f29570c, false);
            v vVar = v.this;
            vVar.f29539c0 = true;
            vVar.c0(AbstractC2190k.i.f29569b, false);
        }
    }

    /* compiled from: TransitionSet.java */
    static class c extends r {

        /* renamed from: a, reason: collision with root package name */
        v f29589a;

        c(v vVar) {
            this.f29589a = vVar;
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void a(AbstractC2190k abstractC2190k) {
            v vVar = this.f29589a;
            if (vVar.f29584t0) {
                return;
            }
            vVar.w0();
            this.f29589a.f29584t0 = true;
        }

        @Override // androidx.transition.r, androidx.transition.AbstractC2190k.h
        public void h(AbstractC2190k abstractC2190k) {
            v vVar = this.f29589a;
            int i10 = vVar.f29583s0 - 1;
            vVar.f29583s0 = i10;
            if (i10 == 0) {
                vVar.f29584t0 = false;
                vVar.u();
            }
            abstractC2190k.i0(this);
        }
    }

    private void B0(AbstractC2190k abstractC2190k) {
        this.f29581q0.add(abstractC2190k);
        abstractC2190k.f29529S = this;
    }

    private int E0(long j10) {
        for (int i10 = 1; i10 < this.f29581q0.size(); i10++) {
            if (this.f29581q0.get(i10).f29548l0 > j10) {
                return i10 - 1;
            }
        }
        return this.f29581q0.size() - 1;
    }

    private void M0() {
        c cVar = new c(this);
        Iterator<AbstractC2190k> it = this.f29581q0.iterator();
        while (it.hasNext()) {
            it.next().d(cVar);
        }
        this.f29583s0 = this.f29581q0.size();
    }

    public v A0(AbstractC2190k abstractC2190k) {
        B0(abstractC2190k);
        long j10 = this.f29514D;
        if (j10 >= 0) {
            abstractC2190k.o0(j10);
        }
        if ((this.f29585u0 & 1) != 0) {
            abstractC2190k.q0(A());
        }
        if ((this.f29585u0 & 2) != 0) {
            E();
            abstractC2190k.t0(null);
        }
        if ((this.f29585u0 & 4) != 0) {
            abstractC2190k.s0(D());
        }
        if ((this.f29585u0 & 8) != 0) {
            abstractC2190k.p0(w());
        }
        return this;
    }

    public AbstractC2190k C0(int i10) {
        if (i10 < 0 || i10 >= this.f29581q0.size()) {
            return null;
        }
        return this.f29581q0.get(i10);
    }

    public int D0() {
        return this.f29581q0.size();
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public v i0(AbstractC2190k.h hVar) {
        return (v) super.i0(hVar);
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public v j0(View view) {
        for (int i10 = 0; i10 < this.f29581q0.size(); i10++) {
            this.f29581q0.get(i10).j0(view);
        }
        return (v) super.j0(view);
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public v o0(long j10) {
        ArrayList<AbstractC2190k> arrayList;
        super.o0(j10);
        if (this.f29514D >= 0 && (arrayList = this.f29581q0) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f29581q0.get(i10).o0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public v q0(TimeInterpolator timeInterpolator) {
        this.f29585u0 |= 1;
        ArrayList<AbstractC2190k> arrayList = this.f29581q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f29581q0.get(i10).q0(timeInterpolator);
            }
        }
        return (v) super.q0(timeInterpolator);
    }

    public v K0(int i10) {
        if (i10 == 0) {
            this.f29582r0 = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.f29582r0 = false;
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public v u0(long j10) {
        return (v) super.u0(j10);
    }

    @Override // androidx.transition.AbstractC2190k
    boolean Q() {
        for (int i10 = 0; i10 < this.f29581q0.size(); i10++) {
            if (this.f29581q0.get(i10).Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.AbstractC2190k
    public boolean R() {
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f29581q0.get(i10).R()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.AbstractC2190k
    protected void cancel() {
        super.cancel();
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29581q0.get(i10).cancel();
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void d0(View view) {
        super.d0(view);
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29581q0.get(i10).d0(view);
        }
    }

    @Override // androidx.transition.AbstractC2190k
    void g0() {
        this.f29546j0 = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f29581q0.size(); i10++) {
            AbstractC2190k abstractC2190k = this.f29581q0.get(i10);
            abstractC2190k.d(bVar);
            abstractC2190k.g0();
            long jN = abstractC2190k.N();
            if (this.f29582r0) {
                this.f29546j0 = Math.max(this.f29546j0, jN);
            } else {
                long j10 = this.f29546j0;
                abstractC2190k.f29548l0 = j10;
                this.f29546j0 = j10 + jN;
            }
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void k(x xVar) {
        if (T(xVar.f29592b)) {
            Iterator<AbstractC2190k> it = this.f29581q0.iterator();
            while (it.hasNext()) {
                AbstractC2190k next = it.next();
                if (next.T(xVar.f29592b)) {
                    next.k(xVar);
                    xVar.f29593c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void k0(View view) {
        super.k0(view);
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29581q0.get(i10).k0(view);
        }
    }

    @Override // androidx.transition.AbstractC2190k
    void m(x xVar) {
        super.m(xVar);
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29581q0.get(i10).m(xVar);
        }
    }

    @Override // androidx.transition.AbstractC2190k
    protected void m0() {
        if (this.f29581q0.isEmpty()) {
            w0();
            u();
            return;
        }
        M0();
        if (this.f29582r0) {
            Iterator<AbstractC2190k> it = this.f29581q0.iterator();
            while (it.hasNext()) {
                it.next().m0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f29581q0.size(); i10++) {
            this.f29581q0.get(i10 - 1).d(new a(this.f29581q0.get(i10)));
        }
        AbstractC2190k abstractC2190k = this.f29581q0.get(0);
        if (abstractC2190k != null) {
            abstractC2190k.m0();
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void n(x xVar) {
        if (T(xVar.f29592b)) {
            Iterator<AbstractC2190k> it = this.f29581q0.iterator();
            while (it.hasNext()) {
                AbstractC2190k next = it.next();
                if (next.T(xVar.f29592b)) {
                    next.n(xVar);
                    xVar.f29593c.add(next);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.AbstractC2190k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void n0(long r19, long r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r5 = r18.N()
            androidx.transition.v r7 = r0.f29529S
            r8 = 0
            if (r7 == 0) goto L21
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto L20
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L21
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L21
        L20:
            return
        L21:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            if (r7 >= 0) goto L28
            r12 = 1
            goto L29
        L28:
            r12 = r10
        L29:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L31
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L39
        L31:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L40
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L40
        L39:
            r0.f29539c0 = r10
            androidx.transition.k$i r14 = androidx.transition.AbstractC2190k.i.f29568a
            r0.c0(r14, r12)
        L40:
            boolean r14 = r0.f29582r0
            if (r14 == 0) goto L5d
        L44:
            java.util.ArrayList<androidx.transition.k> r7 = r0.f29581q0
            int r7 = r7.size()
            if (r10 >= r7) goto L5a
            java.util.ArrayList<androidx.transition.k> r7 = r0.f29581q0
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.k r7 = (androidx.transition.AbstractC2190k) r7
            r7.n0(r1, r3)
            int r10 = r10 + 1
            goto L44
        L5a:
            r16 = r12
            goto La5
        L5d:
            int r10 = r0.E0(r3)
            if (r7 < 0) goto L88
        L63:
            java.util.ArrayList<androidx.transition.k> r7 = r0.f29581q0
            int r7 = r7.size()
            if (r10 >= r7) goto L5a
            java.util.ArrayList<androidx.transition.k> r7 = r0.f29581q0
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.k r7 = (androidx.transition.AbstractC2190k) r7
            long r14 = r7.f29548l0
            r16 = r12
            long r11 = r1 - r14
            int r17 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r17 >= 0) goto L7e
            goto La5
        L7e:
            long r14 = r3 - r14
            r7.n0(r11, r14)
            int r10 = r10 + 1
            r12 = r16
            goto L63
        L88:
            r16 = r12
        L8a:
            if (r10 < 0) goto La5
            java.util.ArrayList<androidx.transition.k> r7 = r0.f29581q0
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.k r7 = (androidx.transition.AbstractC2190k) r7
            long r11 = r7.f29548l0
            long r14 = r1 - r11
            long r11 = r3 - r11
            r7.n0(r14, r11)
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 < 0) goto La2
            goto La5
        La2:
            int r10 = r10 + (-1)
            goto L8a
        La5:
            androidx.transition.v r7 = r0.f29529S
            if (r7 == 0) goto Lc3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb1
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb7
        Lb1:
            if (r13 >= 0) goto Lc3
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 < 0) goto Lc3
        Lb7:
            if (r1 <= 0) goto Lbc
            r1 = 1
            r0.f29539c0 = r1
        Lbc:
            androidx.transition.k$i r1 = androidx.transition.AbstractC2190k.i.f29569b
            r11 = r16
            r0.c0(r1, r11)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.v.n0(long, long):void");
    }

    @Override // androidx.transition.AbstractC2190k
    public void p0(AbstractC2190k.e eVar) {
        super.p0(eVar);
        this.f29585u0 |= 8;
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29581q0.get(i10).p0(eVar);
        }
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: q */
    public AbstractC2190k clone() {
        v vVar = (v) super.clone();
        vVar.f29581q0 = new ArrayList<>();
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            vVar.B0(this.f29581q0.get(i10).clone());
        }
        return vVar;
    }

    @Override // androidx.transition.AbstractC2190k
    void s(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long jH = H();
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2190k abstractC2190k = this.f29581q0.get(i10);
            if (jH > 0 && (this.f29582r0 || i10 == 0)) {
                long jH2 = abstractC2190k.H();
                if (jH2 > 0) {
                    abstractC2190k.u0(jH2 + jH);
                } else {
                    abstractC2190k.u0(jH);
                }
            }
            abstractC2190k.s(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void s0(AbstractC2186g abstractC2186g) {
        super.s0(abstractC2186g);
        this.f29585u0 |= 4;
        if (this.f29581q0 != null) {
            for (int i10 = 0; i10 < this.f29581q0.size(); i10++) {
                this.f29581q0.get(i10).s0(abstractC2186g);
            }
        }
    }

    @Override // androidx.transition.AbstractC2190k
    public void t0(t tVar) {
        super.t0(tVar);
        this.f29585u0 |= 2;
        int size = this.f29581q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29581q0.get(i10).t0(tVar);
        }
    }

    @Override // androidx.transition.AbstractC2190k
    String x0(String str) {
        String strX0 = super.x0(str);
        for (int i10 = 0; i10 < this.f29581q0.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strX0);
            sb2.append("\n");
            sb2.append(this.f29581q0.get(i10).x0(str + "  "));
            strX0 = sb2.toString();
        }
        return strX0;
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public v d(AbstractC2190k.h hVar) {
        return (v) super.d(hVar);
    }

    @Override // androidx.transition.AbstractC2190k
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public v f(View view) {
        for (int i10 = 0; i10 < this.f29581q0.size(); i10++) {
            this.f29581q0.get(i10).f(view);
        }
        return (v) super.f(view);
    }
}
