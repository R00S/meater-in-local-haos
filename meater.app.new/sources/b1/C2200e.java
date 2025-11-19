package b1;

import a1.e;
import b1.C2197b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2200e {

    /* renamed from: a, reason: collision with root package name */
    private a1.f f30012a;

    /* renamed from: d, reason: collision with root package name */
    private a1.f f30015d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30013b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30014c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f30016e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<C2208m> f30017f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private C2197b.InterfaceC0421b f30018g = null;

    /* renamed from: h, reason: collision with root package name */
    private C2197b.a f30019h = new C2197b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<C2208m> f30020i = new ArrayList<>();

    public C2200e(a1.f fVar) {
        this.f30012a = fVar;
        this.f30015d = fVar;
    }

    private void a(C2201f c2201f, int i10, int i11, C2201f c2201f2, ArrayList<C2208m> arrayList, C2208m c2208m) {
        p pVar = c2201f.f30024d;
        if (pVar.f30075c == null) {
            a1.f fVar = this.f30012a;
            if (pVar == fVar.f19820e || pVar == fVar.f19822f) {
                return;
            }
            if (c2208m == null) {
                c2208m = new C2208m(pVar, i11);
                arrayList.add(c2208m);
            }
            pVar.f30075c = c2208m;
            c2208m.a(pVar);
            for (InterfaceC2199d interfaceC2199d : pVar.f30080h.f30031k) {
                if (interfaceC2199d instanceof C2201f) {
                    a((C2201f) interfaceC2199d, i10, 0, c2201f2, arrayList, c2208m);
                }
            }
            for (InterfaceC2199d interfaceC2199d2 : pVar.f30081i.f30031k) {
                if (interfaceC2199d2 instanceof C2201f) {
                    a((C2201f) interfaceC2199d2, i10, 1, c2201f2, arrayList, c2208m);
                }
            }
            if (i10 == 1 && (pVar instanceof C2209n)) {
                for (InterfaceC2199d interfaceC2199d3 : ((C2209n) pVar).f30056k.f30031k) {
                    if (interfaceC2199d3 instanceof C2201f) {
                        a((C2201f) interfaceC2199d3, i10, 2, c2201f2, arrayList, c2208m);
                    }
                }
            }
            for (C2201f c2201f3 : pVar.f30080h.f30032l) {
                if (c2201f3 == c2201f2) {
                    c2208m.f30050b = true;
                }
                a(c2201f3, i10, 0, c2201f2, arrayList, c2208m);
            }
            for (C2201f c2201f4 : pVar.f30081i.f30032l) {
                if (c2201f4 == c2201f2) {
                    c2208m.f30050b = true;
                }
                a(c2201f4, i10, 1, c2201f2, arrayList, c2208m);
            }
            if (i10 == 1 && (pVar instanceof C2209n)) {
                Iterator<C2201f> it = ((C2209n) pVar).f30056k.f30032l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i10, 2, c2201f2, arrayList, c2208m);
                }
            }
        }
    }

    private boolean b(a1.f fVar) {
        int iW;
        e.b bVar;
        int iX;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<a1.e> it = fVar.f19968L0.iterator();
        while (it.hasNext()) {
            a1.e next = it.next();
            e.b[] bVarArr = next.f19811Z;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.V() == 8) {
                next.f19812a = true;
            } else {
                if (next.f19778B < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f19856w = 2;
                }
                if (next.f19784E < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f19858x = 2;
                }
                if (next.v() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f19856w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f19858x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f19856w == 0) {
                            next.f19856w = 3;
                        }
                        if (next.f19858x == 0) {
                            next.f19858x = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f19856w == 1 && (next.f19800O.f19761f == null || next.f19802Q.f19761f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f19858x == 1 && (next.f19801P.f19761f == null || next.f19803R.f19761f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                C2207l c2207l = next.f19820e;
                c2207l.f30076d = bVar9;
                int i10 = next.f19856w;
                c2207l.f30073a = i10;
                C2209n c2209n = next.f19822f;
                c2209n.f30076d = bVar10;
                int i11 = next.f19858x;
                c2209n.f30073a = i11;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int iW2 = next.W();
                    if (bVar9 == bVar11) {
                        iW = (fVar.W() - next.f19800O.f19762g) - next.f19802Q.f19762g;
                        bVar = e.b.FIXED;
                    } else {
                        iW = iW2;
                        bVar = bVar9;
                    }
                    int iX2 = next.x();
                    if (bVar10 == bVar11) {
                        iX = (fVar.x() - next.f19801P.f19762g) - next.f19803R.f19762g;
                        bVar2 = e.b.FIXED;
                    } else {
                        iX = iX2;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, iW, bVar2, iX);
                    next.f19820e.f30077e.d(next.W());
                    next.f19822f.f30077e.d(next.x());
                    next.f19812a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i10 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int iX3 = next.x();
                            int i12 = (int) ((iX3 * next.f19819d0) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, i12, bVar12, iX3);
                            next.f19820e.f30077e.d(next.W());
                            next.f19822f.f30077e.d(next.x());
                            next.f19812a = true;
                        } else if (i10 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f19820e.f30077e.f30042m = next.W();
                        } else if (i10 == 2) {
                            e.b bVar13 = fVar.f19811Z[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                l(next, bVar14, (int) ((next.f19778B * fVar.W()) + 0.5f), bVar10, next.x());
                                next.f19820e.f30077e.d(next.W());
                                next.f19822f.f30077e.d(next.x());
                                next.f19812a = true;
                            }
                        } else {
                            a1.d[] dVarArr = next.f19808W;
                            if (dVarArr[0].f19761f == null || dVarArr[1].f19761f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f19820e.f30077e.d(next.W());
                                next.f19822f.f30077e.d(next.x());
                                next.f19812a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i11 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int iW3 = next.W();
                            float f10 = next.f19819d0;
                            if (next.w() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, iW3, bVar15, (int) ((iW3 * f10) + 0.5f));
                            next.f19820e.f30077e.d(next.W());
                            next.f19822f.f30077e.d(next.x());
                            next.f19812a = true;
                        } else if (i11 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f19822f.f30077e.f30042m = next.x();
                        } else if (i11 == 2) {
                            e.b bVar16 = fVar.f19811Z[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                l(next, bVar9, next.W(), bVar17, (int) ((next.f19784E * fVar.x()) + 0.5f));
                                next.f19820e.f30077e.d(next.W());
                                next.f19822f.f30077e.d(next.x());
                                next.f19812a = true;
                            }
                        } else {
                            a1.d[] dVarArr2 = next.f19808W;
                            if (dVarArr2[2].f19761f == null || dVarArr2[3].f19761f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f19820e.f30077e.d(next.W());
                                next.f19822f.f30077e.d(next.x());
                                next.f19812a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i10 == 1 || i11 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f19820e.f30077e.f30042m = next.W();
                            next.f19822f.f30077e.f30042m = next.x();
                        } else if (i11 == 2 && i10 == 2) {
                            e.b[] bVarArr2 = fVar.f19811Z;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                l(next, bVar20, (int) ((next.f19778B * fVar.W()) + 0.5f), bVar20, (int) ((next.f19784E * fVar.x()) + 0.5f));
                                next.f19820e.f30077e.d(next.W());
                                next.f19822f.f30077e.d(next.x());
                                next.f19812a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(a1.f fVar, int i10) {
        int size = this.f30020i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f30020i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList<C2208m> arrayList) {
        for (InterfaceC2199d interfaceC2199d : pVar.f30080h.f30031k) {
            if (interfaceC2199d instanceof C2201f) {
                a((C2201f) interfaceC2199d, i10, 0, pVar.f30081i, arrayList, null);
            } else if (interfaceC2199d instanceof p) {
                a(((p) interfaceC2199d).f30080h, i10, 0, pVar.f30081i, arrayList, null);
            }
        }
        for (InterfaceC2199d interfaceC2199d2 : pVar.f30081i.f30031k) {
            if (interfaceC2199d2 instanceof C2201f) {
                a((C2201f) interfaceC2199d2, i10, 1, pVar.f30080h, arrayList, null);
            } else if (interfaceC2199d2 instanceof p) {
                a(((p) interfaceC2199d2).f30081i, i10, 1, pVar.f30080h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (InterfaceC2199d interfaceC2199d3 : ((C2209n) pVar).f30056k.f30031k) {
                if (interfaceC2199d3 instanceof C2201f) {
                    a((C2201f) interfaceC2199d3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(a1.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        C2197b.a aVar = this.f30019h;
        aVar.f30000a = bVar;
        aVar.f30001b = bVar2;
        aVar.f30002c = i10;
        aVar.f30003d = i11;
        this.f30018g.b(eVar, aVar);
        eVar.l1(this.f30019h.f30004e);
        eVar.M0(this.f30019h.f30005f);
        eVar.L0(this.f30019h.f30007h);
        eVar.B0(this.f30019h.f30006g);
    }

    public void c() {
        d(this.f30016e);
        this.f30020i.clear();
        C2208m.f30048h = 0;
        i(this.f30012a.f19820e, 0, this.f30020i);
        i(this.f30012a.f19822f, 1, this.f30020i);
        this.f30013b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f30015d.f19820e.f();
        this.f30015d.f19822f.f();
        arrayList.add(this.f30015d.f19820e);
        arrayList.add(this.f30015d.f19822f);
        Iterator<a1.e> it = this.f30015d.f19968L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            a1.e next = it.next();
            if (next instanceof a1.h) {
                arrayList.add(new C2205j(next));
            } else {
                if (next.i0()) {
                    if (next.f19816c == null) {
                        next.f19816c = new C2198c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f19816c);
                } else {
                    arrayList.add(next.f19820e);
                }
                if (next.k0()) {
                    if (next.f19818d == null) {
                        next.f19818d = new C2198c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f19818d);
                } else {
                    arrayList.add(next.f19822f);
                }
                if (next instanceof a1.j) {
                    arrayList.add(new C2206k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f30074b != this.f30015d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f30013b || this.f30014c) {
            Iterator<a1.e> it = this.f30012a.f19968L0.iterator();
            while (it.hasNext()) {
                a1.e next = it.next();
                next.n();
                next.f19812a = false;
                next.f19820e.r();
                next.f19822f.q();
            }
            this.f30012a.n();
            a1.f fVar = this.f30012a;
            fVar.f19812a = false;
            fVar.f19820e.r();
            this.f30012a.f19822f.q();
            this.f30014c = false;
        }
        if (b(this.f30015d)) {
            return false;
        }
        this.f30012a.n1(0);
        this.f30012a.o1(0);
        e.b bVarU = this.f30012a.u(0);
        e.b bVarU2 = this.f30012a.u(1);
        if (this.f30013b) {
            c();
        }
        int iX = this.f30012a.X();
        int iY = this.f30012a.Y();
        this.f30012a.f19820e.f30080h.d(iX);
        this.f30012a.f19822f.f30080h.d(iY);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z10) {
                Iterator<p> it2 = this.f30016e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarU == e.b.WRAP_CONTENT) {
                this.f30012a.Q0(e.b.FIXED);
                a1.f fVar2 = this.f30012a;
                fVar2.l1(e(fVar2, 0));
                a1.f fVar3 = this.f30012a;
                fVar3.f19820e.f30077e.d(fVar3.W());
            }
            if (z10 && bVarU2 == e.b.WRAP_CONTENT) {
                this.f30012a.h1(e.b.FIXED);
                a1.f fVar4 = this.f30012a;
                fVar4.M0(e(fVar4, 1));
                a1.f fVar5 = this.f30012a;
                fVar5.f19822f.f30077e.d(fVar5.x());
            }
        }
        a1.f fVar6 = this.f30012a;
        e.b bVar2 = fVar6.f19811Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iW = fVar6.W() + iX;
            this.f30012a.f19820e.f30081i.d(iW);
            this.f30012a.f19820e.f30077e.d(iW - iX);
            m();
            a1.f fVar7 = this.f30012a;
            e.b bVar4 = fVar7.f19811Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iX2 = fVar7.x() + iY;
                this.f30012a.f19822f.f30081i.d(iX2);
                this.f30012a.f19822f.f30077e.d(iX2 - iY);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f30016e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f30074b != this.f30012a || next2.f30079g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f30016e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it4.next();
            if (z11 || next3.f30074b != this.f30012a) {
                if (!next3.f30080h.f30030j || ((!next3.f30081i.f30030j && !(next3 instanceof C2205j)) || (!next3.f30077e.f30030j && !(next3 instanceof C2198c) && !(next3 instanceof C2205j)))) {
                    break;
                }
            }
        }
        this.f30012a.Q0(bVarU);
        this.f30012a.h1(bVarU2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f30013b) {
            Iterator<a1.e> it = this.f30012a.f19968L0.iterator();
            while (it.hasNext()) {
                a1.e next = it.next();
                next.n();
                next.f19812a = false;
                C2207l c2207l = next.f19820e;
                c2207l.f30077e.f30030j = false;
                c2207l.f30079g = false;
                c2207l.r();
                C2209n c2209n = next.f19822f;
                c2209n.f30077e.f30030j = false;
                c2209n.f30079g = false;
                c2209n.q();
            }
            this.f30012a.n();
            a1.f fVar = this.f30012a;
            fVar.f19812a = false;
            C2207l c2207l2 = fVar.f19820e;
            c2207l2.f30077e.f30030j = false;
            c2207l2.f30079g = false;
            c2207l2.r();
            C2209n c2209n2 = this.f30012a.f19822f;
            c2209n2.f30077e.f30030j = false;
            c2209n2.f30079g = false;
            c2209n2.q();
            c();
        }
        if (b(this.f30015d)) {
            return false;
        }
        this.f30012a.n1(0);
        this.f30012a.o1(0);
        this.f30012a.f19820e.f30080h.d(0);
        this.f30012a.f19822f.f30080h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarU = this.f30012a.u(0);
        e.b bVarU2 = this.f30012a.u(1);
        int iX = this.f30012a.X();
        int iY = this.f30012a.Y();
        if (z10 && (bVarU == (bVar = e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            Iterator<p> it = this.f30016e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f30078f == i10 && !next.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarU == e.b.WRAP_CONTENT) {
                    this.f30012a.Q0(e.b.FIXED);
                    a1.f fVar = this.f30012a;
                    fVar.l1(e(fVar, 0));
                    a1.f fVar2 = this.f30012a;
                    fVar2.f19820e.f30077e.d(fVar2.W());
                }
            } else if (z10 && bVarU2 == e.b.WRAP_CONTENT) {
                this.f30012a.h1(e.b.FIXED);
                a1.f fVar3 = this.f30012a;
                fVar3.M0(e(fVar3, 1));
                a1.f fVar4 = this.f30012a;
                fVar4.f19822f.f30077e.d(fVar4.x());
            }
        }
        if (i10 == 0) {
            a1.f fVar5 = this.f30012a;
            e.b bVar2 = fVar5.f19811Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iW = fVar5.W() + iX;
                this.f30012a.f19820e.f30081i.d(iW);
                this.f30012a.f19820e.f30077e.d(iW - iX);
                z11 = true;
            }
            z11 = false;
        } else {
            a1.f fVar6 = this.f30012a;
            e.b bVar3 = fVar6.f19811Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iX2 = fVar6.x() + iY;
                this.f30012a.f19822f.f30081i.d(iX2);
                this.f30012a.f19822f.f30077e.d(iX2 - iY);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<p> it2 = this.f30016e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f30078f == i10 && (next2.f30074b != this.f30012a || next2.f30079g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f30016e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f30078f == i10 && (z11 || next3.f30074b != this.f30012a)) {
                if (!next3.f30080h.f30030j || !next3.f30081i.f30030j || (!(next3 instanceof C2198c) && !next3.f30077e.f30030j)) {
                    break;
                }
            }
        }
        this.f30012a.Q0(bVarU);
        this.f30012a.h1(bVarU2);
        return z12;
    }

    public void j() {
        this.f30013b = true;
    }

    public void k() {
        this.f30014c = true;
    }

    public void m() {
        C2202g c2202g;
        Iterator<a1.e> it = this.f30012a.f19968L0.iterator();
        while (it.hasNext()) {
            a1.e next = it.next();
            if (!next.f19812a) {
                e.b[] bVarArr = next.f19811Z;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f19856w;
                int i11 = next.f19858x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                C2202g c2202g2 = next.f19820e.f30077e;
                boolean z12 = c2202g2.f30030j;
                C2202g c2202g3 = next.f19822f.f30077e;
                boolean z13 = c2202g3.f30030j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, c2202g2.f30027g, bVar4, c2202g3.f30027g);
                    next.f19812a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, c2202g2.f30027g, bVar3, c2202g3.f30027g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f19822f.f30077e.f30042m = next.x();
                    } else {
                        next.f19822f.f30077e.d(next.x());
                        next.f19812a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, c2202g2.f30027g, e.b.FIXED, c2202g3.f30027g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f19820e.f30077e.f30042m = next.W();
                    } else {
                        next.f19820e.f30077e.d(next.W());
                        next.f19812a = true;
                    }
                }
                if (next.f19812a && (c2202g = next.f19822f.f30057l) != null) {
                    c2202g.d(next.p());
                }
            }
        }
    }

    public void n(C2197b.InterfaceC0421b interfaceC0421b) {
        this.f30018g = interfaceC0421b;
    }
}
