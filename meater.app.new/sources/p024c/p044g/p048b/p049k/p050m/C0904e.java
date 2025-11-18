package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0893f;
import p024c.p044g.p048b.p049k.C0894g;
import p024c.p044g.p048b.p049k.C0896i;
import p024c.p044g.p048b.p049k.p050m.C0901b;

/* compiled from: DependencyGraph.java */
/* renamed from: c.g.b.k.m.e */
/* loaded from: classes.dex */
public class C0904e {

    /* renamed from: a */
    private C0893f f6099a;

    /* renamed from: d */
    private C0893f f6102d;

    /* renamed from: b */
    private boolean f6100b = true;

    /* renamed from: c */
    private boolean f6101c = true;

    /* renamed from: e */
    private ArrayList<AbstractC0915p> f6103e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C0912m> f6104f = new ArrayList<>();

    /* renamed from: g */
    private C0901b.b f6105g = null;

    /* renamed from: h */
    private C0901b.a f6106h = new C0901b.a();

    /* renamed from: i */
    ArrayList<C0912m> f6107i = new ArrayList<>();

    public C0904e(C0893f c0893f) {
        this.f6099a = c0893f;
        this.f6102d = c0893f;
    }

    /* renamed from: a */
    private void m5814a(C0905f c0905f, int i2, int i3, C0905f c0905f2, ArrayList<C0912m> arrayList, C0912m c0912m) {
        AbstractC0915p abstractC0915p = c0905f.f6111d;
        if (abstractC0915p.f6161c == null) {
            C0893f c0893f = this.f6099a;
            if (abstractC0915p == c0893f.f5978f || abstractC0915p == c0893f.f5980g) {
                return;
            }
            if (c0912m == null) {
                c0912m = new C0912m(abstractC0915p, i3);
                arrayList.add(c0912m);
            }
            abstractC0915p.f6161c = c0912m;
            c0912m.m5850a(abstractC0915p);
            for (InterfaceC0903d interfaceC0903d : abstractC0915p.f6166h.f6118k) {
                if (interfaceC0903d instanceof C0905f) {
                    m5814a((C0905f) interfaceC0903d, i2, 0, c0905f2, arrayList, c0912m);
                }
            }
            for (InterfaceC0903d interfaceC0903d2 : abstractC0915p.f6167i.f6118k) {
                if (interfaceC0903d2 instanceof C0905f) {
                    m5814a((C0905f) interfaceC0903d2, i2, 1, c0905f2, arrayList, c0912m);
                }
            }
            if (i2 == 1 && (abstractC0915p instanceof C0913n)) {
                for (InterfaceC0903d interfaceC0903d3 : ((C0913n) abstractC0915p).f6141k.f6118k) {
                    if (interfaceC0903d3 instanceof C0905f) {
                        m5814a((C0905f) interfaceC0903d3, i2, 2, c0905f2, arrayList, c0912m);
                    }
                }
            }
            for (C0905f c0905f3 : abstractC0915p.f6166h.f6119l) {
                if (c0905f3 == c0905f2) {
                    c0912m.f6135c = true;
                }
                m5814a(c0905f3, i2, 0, c0905f2, arrayList, c0912m);
            }
            for (C0905f c0905f4 : abstractC0915p.f6167i.f6119l) {
                if (c0905f4 == c0905f2) {
                    c0912m.f6135c = true;
                }
                m5814a(c0905f4, i2, 1, c0905f2, arrayList, c0912m);
            }
            if (i2 == 1 && (abstractC0915p instanceof C0913n)) {
                Iterator<C0905f> it = ((C0913n) abstractC0915p).f6141k.f6119l.iterator();
                while (it.hasNext()) {
                    m5814a(it.next(), i2, 2, c0905f2, arrayList, c0912m);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m5815b(C0893f c0893f) {
        int iM5686R;
        C0892e.b bVar;
        int iM5736v;
        C0892e.b bVar2;
        C0892e.b bVar3;
        C0892e.b bVar4;
        Iterator<C0892e> it = c0893f.f6080D0.iterator();
        while (it.hasNext()) {
            C0892e next = it.next();
            C0892e.b[] bVarArr = next.f5962T;
            C0892e.b bVar5 = bVarArr[0];
            C0892e.b bVar6 = bVarArr[1];
            if (next.m5684Q() == 8) {
                next.f5970b = true;
            } else {
                if (next.f6010v < 1.0f && bVar5 == C0892e.b.MATCH_CONSTRAINT) {
                    next.f6000q = 2;
                }
                if (next.f6016y < 1.0f && bVar6 == C0892e.b.MATCH_CONSTRAINT) {
                    next.f6002r = 2;
                }
                if (next.m5732t() > 0.0f) {
                    C0892e.b bVar7 = C0892e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == C0892e.b.WRAP_CONTENT || bVar6 == C0892e.b.FIXED)) {
                        next.f6000q = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == C0892e.b.WRAP_CONTENT || bVar5 == C0892e.b.FIXED)) {
                        next.f6002r = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f6000q == 0) {
                            next.f6000q = 3;
                        }
                        if (next.f6002r == 0) {
                            next.f6002r = 3;
                        }
                    }
                }
                C0892e.b bVar8 = C0892e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f6000q == 1 && (next.f5951I.f5924f == null || next.f5953K.f5924f == null)) {
                    bVar5 = C0892e.b.WRAP_CONTENT;
                }
                C0892e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f6002r == 1 && (next.f5952J.f5924f == null || next.f5954L.f5924f == null)) {
                    bVar6 = C0892e.b.WRAP_CONTENT;
                }
                C0892e.b bVar10 = bVar6;
                C0911l c0911l = next.f5978f;
                c0911l.f6162d = bVar9;
                int i2 = next.f6000q;
                c0911l.f6159a = i2;
                C0913n c0913n = next.f5980g;
                c0913n.f6162d = bVar10;
                int i3 = next.f6002r;
                c0913n.f6159a = i3;
                C0892e.b bVar11 = C0892e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == C0892e.b.FIXED || bVar9 == C0892e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == C0892e.b.FIXED || bVar10 == C0892e.b.WRAP_CONTENT)) {
                    int iM5686R2 = next.m5686R();
                    if (bVar9 == bVar11) {
                        iM5686R = (c0893f.m5686R() - next.f5951I.f5925g) - next.f5953K.f5925g;
                        bVar = C0892e.b.FIXED;
                    } else {
                        iM5686R = iM5686R2;
                        bVar = bVar9;
                    }
                    int iM5736v2 = next.m5736v();
                    if (bVar10 == bVar11) {
                        iM5736v = (c0893f.m5736v() - next.f5952J.f5925g) - next.f5954L.f5925g;
                        bVar2 = C0892e.b.FIXED;
                    } else {
                        iM5736v = iM5736v2;
                        bVar2 = bVar10;
                    }
                    m5818l(next, bVar, iM5686R, bVar2, iM5736v);
                    next.f5978f.f6163e.mo5830d(next.m5686R());
                    next.f5980g.f6163e.mo5830d(next.m5736v());
                    next.f5970b = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = C0892e.b.WRAP_CONTENT) || bVar10 == C0892e.b.FIXED)) {
                        if (i2 == 3) {
                            if (bVar10 == bVar4) {
                                m5818l(next, bVar4, 0, bVar4, 0);
                            }
                            int iM5736v3 = next.m5736v();
                            int i4 = (int) ((iM5736v3 * next.f5966X) + 0.5f);
                            C0892e.b bVar12 = C0892e.b.FIXED;
                            m5818l(next, bVar12, i4, bVar12, iM5736v3);
                            next.f5978f.f6163e.mo5830d(next.m5686R());
                            next.f5980g.f6163e.mo5830d(next.m5736v());
                            next.f5970b = true;
                        } else if (i2 == 1) {
                            m5818l(next, bVar4, 0, bVar10, 0);
                            next.f5978f.f6163e.f6129m = next.m5686R();
                        } else if (i2 == 2) {
                            C0892e.b[] bVarArr2 = c0893f.f5962T;
                            C0892e.b bVar13 = bVarArr2[0];
                            C0892e.b bVar14 = C0892e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                m5818l(next, bVar14, (int) ((next.f6010v * c0893f.m5686R()) + 0.5f), bVar10, next.m5736v());
                                next.f5978f.f6163e.mo5830d(next.m5686R());
                                next.f5980g.f6163e.mo5830d(next.m5736v());
                                next.f5970b = true;
                            }
                        } else {
                            C0891d[] c0891dArr = next.f5959Q;
                            if (c0891dArr[0].f5924f == null || c0891dArr[1].f5924f == null) {
                                m5818l(next, bVar4, 0, bVar10, 0);
                                next.f5978f.f6163e.mo5830d(next.m5686R());
                                next.f5980g.f6163e.mo5830d(next.m5736v());
                                next.f5970b = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = C0892e.b.WRAP_CONTENT) || bVar9 == C0892e.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar9 == bVar3) {
                                m5818l(next, bVar3, 0, bVar3, 0);
                            }
                            int iM5686R3 = next.m5686R();
                            float f2 = next.f5966X;
                            if (next.m5734u() == -1) {
                                f2 = 1.0f / f2;
                            }
                            C0892e.b bVar15 = C0892e.b.FIXED;
                            m5818l(next, bVar15, iM5686R3, bVar15, (int) ((iM5686R3 * f2) + 0.5f));
                            next.f5978f.f6163e.mo5830d(next.m5686R());
                            next.f5980g.f6163e.mo5830d(next.m5736v());
                            next.f5970b = true;
                        } else if (i3 == 1) {
                            m5818l(next, bVar9, 0, bVar3, 0);
                            next.f5980g.f6163e.f6129m = next.m5736v();
                        } else if (i3 == 2) {
                            C0892e.b[] bVarArr3 = c0893f.f5962T;
                            C0892e.b bVar16 = bVarArr3[1];
                            C0892e.b bVar17 = C0892e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                m5818l(next, bVar9, next.m5686R(), bVar17, (int) ((next.f6016y * c0893f.m5736v()) + 0.5f));
                                next.f5978f.f6163e.mo5830d(next.m5686R());
                                next.f5980g.f6163e.mo5830d(next.m5736v());
                                next.f5970b = true;
                            }
                        } else {
                            C0891d[] c0891dArr2 = next.f5959Q;
                            if (c0891dArr2[2].f5924f == null || c0891dArr2[3].f5924f == null) {
                                m5818l(next, bVar3, 0, bVar10, 0);
                                next.f5978f.f6163e.mo5830d(next.m5686R());
                                next.f5980g.f6163e.mo5830d(next.m5736v());
                                next.f5970b = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i2 == 1 || i3 == 1) {
                            C0892e.b bVar18 = C0892e.b.WRAP_CONTENT;
                            m5818l(next, bVar18, 0, bVar18, 0);
                            next.f5978f.f6163e.f6129m = next.m5686R();
                            next.f5980g.f6163e.f6129m = next.m5736v();
                        } else if (i3 == 2 && i2 == 2) {
                            C0892e.b[] bVarArr4 = c0893f.f5962T;
                            C0892e.b bVar19 = bVarArr4[0];
                            C0892e.b bVar20 = C0892e.b.FIXED;
                            if (bVar19 == bVar20 || bVarArr4[0] == bVar20) {
                                if (bVarArr4[1] == bVar20 || bVarArr4[1] == bVar20) {
                                    m5818l(next, bVar20, (int) ((next.f6010v * c0893f.m5686R()) + 0.5f), bVar20, (int) ((next.f6016y * c0893f.m5736v()) + 0.5f));
                                    next.f5978f.f6163e.mo5830d(next.m5686R());
                                    next.f5980g.f6163e.mo5830d(next.m5736v());
                                    next.f5970b = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m5816e(C0893f c0893f, int i2) {
        int size = this.f6107i.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, this.f6107i.get(i3).m5851b(c0893f, i2));
        }
        return (int) jMax;
    }

    /* renamed from: i */
    private void m5817i(AbstractC0915p abstractC0915p, int i2, ArrayList<C0912m> arrayList) {
        for (InterfaceC0903d interfaceC0903d : abstractC0915p.f6166h.f6118k) {
            if (interfaceC0903d instanceof C0905f) {
                m5814a((C0905f) interfaceC0903d, i2, 0, abstractC0915p.f6167i, arrayList, null);
            } else if (interfaceC0903d instanceof AbstractC0915p) {
                m5814a(((AbstractC0915p) interfaceC0903d).f6166h, i2, 0, abstractC0915p.f6167i, arrayList, null);
            }
        }
        for (InterfaceC0903d interfaceC0903d2 : abstractC0915p.f6167i.f6118k) {
            if (interfaceC0903d2 instanceof C0905f) {
                m5814a((C0905f) interfaceC0903d2, i2, 1, abstractC0915p.f6166h, arrayList, null);
            } else if (interfaceC0903d2 instanceof AbstractC0915p) {
                m5814a(((AbstractC0915p) interfaceC0903d2).f6167i, i2, 1, abstractC0915p.f6166h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (InterfaceC0903d interfaceC0903d3 : ((C0913n) abstractC0915p).f6141k.f6118k) {
                if (interfaceC0903d3 instanceof C0905f) {
                    m5814a((C0905f) interfaceC0903d3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m5818l(C0892e c0892e, C0892e.b bVar, int i2, C0892e.b bVar2, int i3) {
        C0901b.a aVar = this.f6106h;
        aVar.f6087d = bVar;
        aVar.f6088e = bVar2;
        aVar.f6089f = i2;
        aVar.f6090g = i3;
        this.f6105g.mo1336b(c0892e, aVar);
        c0892e.m5693U0(this.f6106h.f6091h);
        c0892e.m5737v0(this.f6106h.f6092i);
        c0892e.m5735u0(this.f6106h.f6094k);
        c0892e.m5715k0(this.f6106h.f6093j);
    }

    /* renamed from: c */
    public void m5819c() {
        m5820d(this.f6103e);
        this.f6107i.clear();
        C0912m.f6133a = 0;
        m5817i(this.f6099a.f5978f, 0, this.f6107i);
        m5817i(this.f6099a.f5980g, 1, this.f6107i);
        this.f6100b = false;
    }

    /* renamed from: d */
    public void m5820d(ArrayList<AbstractC0915p> arrayList) {
        arrayList.clear();
        this.f6102d.f5978f.mo5811f();
        this.f6102d.f5980g.mo5811f();
        arrayList.add(this.f6102d.f5978f);
        arrayList.add(this.f6102d.f5980g);
        Iterator<C0892e> it = this.f6102d.f6080D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0892e next = it.next();
            if (next instanceof C0894g) {
                arrayList.add(new C0909j(next));
            } else {
                if (next.m5701Z()) {
                    if (next.f5974d == null) {
                        next.f5974d = new C0902c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5974d);
                } else {
                    arrayList.add(next.f5978f);
                }
                if (next.m5704b0()) {
                    if (next.f5976e == null) {
                        next.f5976e = new C0902c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5976e);
                } else {
                    arrayList.add(next.f5980g);
                }
                if (next instanceof C0896i) {
                    arrayList.add(new C0910k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0915p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo5811f();
        }
        Iterator<AbstractC0915p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0915p next2 = it3.next();
            if (next2.f6160b != this.f6102d) {
                next2.mo5809d();
            }
        }
    }

    /* renamed from: f */
    public boolean m5821f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f6100b || this.f6101c) {
            Iterator<C0892e> it = this.f6099a.f6080D0.iterator();
            while (it.hasNext()) {
                C0892e next = it.next();
                next.m5716l();
                next.f5970b = false;
                next.f5978f.m5847r();
                next.f5980g.m5852q();
            }
            this.f6099a.m5716l();
            C0893f c0893f = this.f6099a;
            c0893f.f5970b = false;
            c0893f.f5978f.m5847r();
            this.f6099a.f5980g.m5852q();
            this.f6101c = false;
        }
        if (m5815b(this.f6102d)) {
            return false;
        }
        this.f6099a.m5695V0(0);
        this.f6099a.m5697W0(0);
        C0892e.b bVarM5730s = this.f6099a.m5730s(0);
        C0892e.b bVarM5730s2 = this.f6099a.m5730s(1);
        if (this.f6100b) {
            m5819c();
        }
        int iM5688S = this.f6099a.m5688S();
        int iM5690T = this.f6099a.m5690T();
        this.f6099a.f5978f.f6166h.mo5830d(iM5688S);
        this.f6099a.f5980g.f6166h.mo5830d(iM5690T);
        m5826m();
        C0892e.b bVar = C0892e.b.WRAP_CONTENT;
        if (bVarM5730s == bVar || bVarM5730s2 == bVar) {
            if (z4) {
                Iterator<AbstractC0915p> it2 = this.f6103e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo5813m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && bVarM5730s == C0892e.b.WRAP_CONTENT) {
                this.f6099a.m5745z0(C0892e.b.FIXED);
                C0893f c0893f2 = this.f6099a;
                c0893f2.m5693U0(m5816e(c0893f2, 0));
                C0893f c0893f3 = this.f6099a;
                c0893f3.f5978f.f6163e.mo5830d(c0893f3.m5686R());
            }
            if (z4 && bVarM5730s2 == C0892e.b.WRAP_CONTENT) {
                this.f6099a.m5685Q0(C0892e.b.FIXED);
                C0893f c0893f4 = this.f6099a;
                c0893f4.m5737v0(m5816e(c0893f4, 1));
                C0893f c0893f5 = this.f6099a;
                c0893f5.f5980g.f6163e.mo5830d(c0893f5.m5736v());
            }
        }
        C0893f c0893f6 = this.f6099a;
        C0892e.b[] bVarArr = c0893f6.f5962T;
        C0892e.b bVar2 = bVarArr[0];
        C0892e.b bVar3 = C0892e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C0892e.b.MATCH_PARENT) {
            int iM5686R = c0893f6.m5686R() + iM5688S;
            this.f6099a.f5978f.f6167i.mo5830d(iM5686R);
            this.f6099a.f5978f.f6163e.mo5830d(iM5686R - iM5688S);
            m5826m();
            C0893f c0893f7 = this.f6099a;
            C0892e.b[] bVarArr2 = c0893f7.f5962T;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C0892e.b.MATCH_PARENT) {
                int iM5736v = c0893f7.m5736v() + iM5690T;
                this.f6099a.f5980g.f6167i.mo5830d(iM5736v);
                this.f6099a.f5980g.f6163e.mo5830d(iM5736v - iM5690T);
            }
            m5826m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<AbstractC0915p> it3 = this.f6103e.iterator();
        while (it3.hasNext()) {
            AbstractC0915p next2 = it3.next();
            if (next2.f6160b != this.f6099a || next2.f6165g) {
                next2.mo5810e();
            }
        }
        Iterator<AbstractC0915p> it4 = this.f6103e.iterator();
        while (it4.hasNext()) {
            AbstractC0915p next3 = it4.next();
            if (z2 || next3.f6160b != this.f6099a) {
                if (!next3.f6166h.f6117j || ((!next3.f6167i.f6117j && !(next3 instanceof C0909j)) || (!next3.f6163e.f6117j && !(next3 instanceof C0902c) && !(next3 instanceof C0909j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f6099a.m5745z0(bVarM5730s);
        this.f6099a.m5685Q0(bVarM5730s2);
        return z3;
    }

    /* renamed from: g */
    public boolean m5822g(boolean z) {
        if (this.f6100b) {
            Iterator<C0892e> it = this.f6099a.f6080D0.iterator();
            while (it.hasNext()) {
                C0892e next = it.next();
                next.m5716l();
                next.f5970b = false;
                C0911l c0911l = next.f5978f;
                c0911l.f6163e.f6117j = false;
                c0911l.f6165g = false;
                c0911l.m5847r();
                C0913n c0913n = next.f5980g;
                c0913n.f6163e.f6117j = false;
                c0913n.f6165g = false;
                c0913n.m5852q();
            }
            this.f6099a.m5716l();
            C0893f c0893f = this.f6099a;
            c0893f.f5970b = false;
            C0911l c0911l2 = c0893f.f5978f;
            c0911l2.f6163e.f6117j = false;
            c0911l2.f6165g = false;
            c0911l2.m5847r();
            C0913n c0913n2 = this.f6099a.f5980g;
            c0913n2.f6163e.f6117j = false;
            c0913n2.f6165g = false;
            c0913n2.m5852q();
            m5819c();
        }
        if (m5815b(this.f6102d)) {
            return false;
        }
        this.f6099a.m5695V0(0);
        this.f6099a.m5697W0(0);
        this.f6099a.f5978f.f6166h.mo5830d(0);
        this.f6099a.f5980g.f6166h.mo5830d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m5823h(boolean z, int i2) {
        boolean z2;
        C0892e.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        C0892e.b bVarM5730s = this.f6099a.m5730s(0);
        C0892e.b bVarM5730s2 = this.f6099a.m5730s(1);
        int iM5688S = this.f6099a.m5688S();
        int iM5690T = this.f6099a.m5690T();
        if (z4 && (bVarM5730s == (bVar = C0892e.b.WRAP_CONTENT) || bVarM5730s2 == bVar)) {
            Iterator<AbstractC0915p> it = this.f6103e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0915p next = it.next();
                if (next.f6164f == i2 && !next.mo5813m()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && bVarM5730s == C0892e.b.WRAP_CONTENT) {
                    this.f6099a.m5745z0(C0892e.b.FIXED);
                    C0893f c0893f = this.f6099a;
                    c0893f.m5693U0(m5816e(c0893f, 0));
                    C0893f c0893f2 = this.f6099a;
                    c0893f2.f5978f.f6163e.mo5830d(c0893f2.m5686R());
                }
            } else if (z4 && bVarM5730s2 == C0892e.b.WRAP_CONTENT) {
                this.f6099a.m5685Q0(C0892e.b.FIXED);
                C0893f c0893f3 = this.f6099a;
                c0893f3.m5737v0(m5816e(c0893f3, 1));
                C0893f c0893f4 = this.f6099a;
                c0893f4.f5980g.f6163e.mo5830d(c0893f4.m5736v());
            }
        }
        if (i2 == 0) {
            C0893f c0893f5 = this.f6099a;
            C0892e.b[] bVarArr = c0893f5.f5962T;
            if (bVarArr[0] == C0892e.b.FIXED || bVarArr[0] == C0892e.b.MATCH_PARENT) {
                int iM5686R = c0893f5.m5686R() + iM5688S;
                this.f6099a.f5978f.f6167i.mo5830d(iM5686R);
                this.f6099a.f5978f.f6163e.mo5830d(iM5686R - iM5688S);
                z2 = true;
            }
            z2 = false;
        } else {
            C0893f c0893f6 = this.f6099a;
            C0892e.b[] bVarArr2 = c0893f6.f5962T;
            if (bVarArr2[1] == C0892e.b.FIXED || bVarArr2[1] == C0892e.b.MATCH_PARENT) {
                int iM5736v = c0893f6.m5736v() + iM5690T;
                this.f6099a.f5980g.f6167i.mo5830d(iM5736v);
                this.f6099a.f5980g.f6163e.mo5830d(iM5736v - iM5690T);
                z2 = true;
            }
            z2 = false;
        }
        m5826m();
        Iterator<AbstractC0915p> it2 = this.f6103e.iterator();
        while (it2.hasNext()) {
            AbstractC0915p next2 = it2.next();
            if (next2.f6164f == i2 && (next2.f6160b != this.f6099a || next2.f6165g)) {
                next2.mo5810e();
            }
        }
        Iterator<AbstractC0915p> it3 = this.f6103e.iterator();
        while (it3.hasNext()) {
            AbstractC0915p next3 = it3.next();
            if (next3.f6164f == i2 && (z2 || next3.f6160b != this.f6099a)) {
                if (!next3.f6166h.f6117j || !next3.f6167i.f6117j || (!(next3 instanceof C0902c) && !next3.f6163e.f6117j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f6099a.m5745z0(bVarM5730s);
        this.f6099a.m5685Q0(bVarM5730s2);
        return z3;
    }

    /* renamed from: j */
    public void m5824j() {
        this.f6100b = true;
    }

    /* renamed from: k */
    public void m5825k() {
        this.f6101c = true;
    }

    /* renamed from: m */
    public void m5826m() {
        C0906g c0906g;
        Iterator<C0892e> it = this.f6099a.f6080D0.iterator();
        while (it.hasNext()) {
            C0892e next = it.next();
            if (!next.f5970b) {
                C0892e.b[] bVarArr = next.f5962T;
                boolean z = false;
                C0892e.b bVar = bVarArr[0];
                C0892e.b bVar2 = bVarArr[1];
                int i2 = next.f6000q;
                int i3 = next.f6002r;
                C0892e.b bVar3 = C0892e.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C0892e.b.MATCH_CONSTRAINT && i2 == 1);
                if (bVar2 == bVar3 || (bVar2 == C0892e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                C0906g c0906g2 = next.f5978f.f6163e;
                boolean z3 = c0906g2.f6117j;
                C0906g c0906g3 = next.f5980g.f6163e;
                boolean z4 = c0906g3.f6117j;
                if (z3 && z4) {
                    C0892e.b bVar4 = C0892e.b.FIXED;
                    m5818l(next, bVar4, c0906g2.f6114g, bVar4, c0906g3.f6114g);
                    next.f5970b = true;
                } else if (z3 && z) {
                    m5818l(next, C0892e.b.FIXED, c0906g2.f6114g, bVar3, c0906g3.f6114g);
                    if (bVar2 == C0892e.b.MATCH_CONSTRAINT) {
                        next.f5980g.f6163e.f6129m = next.m5736v();
                    } else {
                        next.f5980g.f6163e.mo5830d(next.m5736v());
                        next.f5970b = true;
                    }
                } else if (z4 && z2) {
                    m5818l(next, bVar3, c0906g2.f6114g, C0892e.b.FIXED, c0906g3.f6114g);
                    if (bVar == C0892e.b.MATCH_CONSTRAINT) {
                        next.f5978f.f6163e.f6129m = next.m5686R();
                    } else {
                        next.f5978f.f6163e.mo5830d(next.m5686R());
                        next.f5970b = true;
                    }
                }
                if (next.f5970b && (c0906g = next.f5980g.f6142l) != null) {
                    c0906g.mo5830d(next.m5720n());
                }
            }
        }
    }

    /* renamed from: n */
    public void m5827n(C0901b.b bVar) {
        this.f6105g = bVar;
    }
}
