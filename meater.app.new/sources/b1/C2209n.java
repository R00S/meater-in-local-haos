package b1;

import a1.d;
import a1.e;
import b1.C2201f;
import b1.p;

/* compiled from: VerticalWidgetRun.java */
/* renamed from: b1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2209n extends p {

    /* renamed from: k, reason: collision with root package name */
    public C2201f f30056k;

    /* renamed from: l, reason: collision with root package name */
    C2202g f30057l;

    /* compiled from: VerticalWidgetRun.java */
    /* renamed from: b1.n$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30058a;

        static {
            int[] iArr = new int[p.b.values().length];
            f30058a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30058a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30058a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2209n(a1.e eVar) {
        super(eVar);
        C2201f c2201f = new C2201f(this);
        this.f30056k = c2201f;
        this.f30057l = null;
        this.f30080h.f30025e = C2201f.a.TOP;
        this.f30081i.f30025e = C2201f.a.BOTTOM;
        c2201f.f30025e = C2201f.a.BASELINE;
        this.f30078f = 1;
    }

    @Override // b1.p, b1.InterfaceC2199d
    public void a(InterfaceC2199d interfaceC2199d) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f30058a[this.f30082j.ordinal()];
        if (i11 == 1) {
            p(interfaceC2199d);
        } else if (i11 == 2) {
            o(interfaceC2199d);
        } else if (i11 == 3) {
            a1.e eVar = this.f30074b;
            n(interfaceC2199d, eVar.f19801P, eVar.f19803R, 1);
            return;
        }
        C2202g c2202g = this.f30077e;
        if (c2202g.f30023c && !c2202g.f30030j && this.f30076d == e.b.MATCH_CONSTRAINT) {
            a1.e eVar2 = this.f30074b;
            int i12 = eVar2.f19858x;
            if (i12 == 2) {
                a1.e eVarK = eVar2.K();
                if (eVarK != null) {
                    if (eVarK.f19822f.f30077e.f30030j) {
                        this.f30077e.d((int) ((r7.f30027g * this.f30074b.f19784E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f19820e.f30077e.f30030j) {
                int iW = eVar2.w();
                if (iW == -1) {
                    a1.e eVar3 = this.f30074b;
                    f10 = eVar3.f19820e.f30077e.f30027g;
                    fV = eVar3.v();
                } else if (iW == 0) {
                    fV2 = r7.f19820e.f30077e.f30027g * this.f30074b.v();
                    i10 = (int) (fV2 + 0.5f);
                    this.f30077e.d(i10);
                } else if (iW != 1) {
                    i10 = 0;
                    this.f30077e.d(i10);
                } else {
                    a1.e eVar4 = this.f30074b;
                    f10 = eVar4.f19820e.f30077e.f30027g;
                    fV = eVar4.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f30077e.d(i10);
            }
        }
        C2201f c2201f = this.f30080h;
        if (c2201f.f30023c) {
            C2201f c2201f2 = this.f30081i;
            if (c2201f2.f30023c) {
                if (c2201f.f30030j && c2201f2.f30030j && this.f30077e.f30030j) {
                    return;
                }
                if (!this.f30077e.f30030j && this.f30076d == e.b.MATCH_CONSTRAINT) {
                    a1.e eVar5 = this.f30074b;
                    if (eVar5.f19856w == 0 && !eVar5.k0()) {
                        C2201f c2201f3 = this.f30080h.f30032l.get(0);
                        C2201f c2201f4 = this.f30081i.f30032l.get(0);
                        int i13 = c2201f3.f30027g;
                        C2201f c2201f5 = this.f30080h;
                        int i14 = i13 + c2201f5.f30026f;
                        int i15 = c2201f4.f30027g + this.f30081i.f30026f;
                        c2201f5.d(i14);
                        this.f30081i.d(i15);
                        this.f30077e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f30077e.f30030j && this.f30076d == e.b.MATCH_CONSTRAINT && this.f30073a == 1 && this.f30080h.f30032l.size() > 0 && this.f30081i.f30032l.size() > 0) {
                    C2201f c2201f6 = this.f30080h.f30032l.get(0);
                    int i16 = (this.f30081i.f30032l.get(0).f30027g + this.f30081i.f30026f) - (c2201f6.f30027g + this.f30080h.f30026f);
                    C2202g c2202g2 = this.f30077e;
                    int i17 = c2202g2.f30042m;
                    if (i16 < i17) {
                        c2202g2.d(i16);
                    } else {
                        c2202g2.d(i17);
                    }
                }
                if (this.f30077e.f30030j && this.f30080h.f30032l.size() > 0 && this.f30081i.f30032l.size() > 0) {
                    C2201f c2201f7 = this.f30080h.f30032l.get(0);
                    C2201f c2201f8 = this.f30081i.f30032l.get(0);
                    int i18 = c2201f7.f30027g + this.f30080h.f30026f;
                    int i19 = c2201f8.f30027g + this.f30081i.f30026f;
                    float fR = this.f30074b.R();
                    if (c2201f7 == c2201f8) {
                        i18 = c2201f7.f30027g;
                        i19 = c2201f8.f30027g;
                        fR = 0.5f;
                    }
                    this.f30080h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f30077e.f30027g) * fR)));
                    this.f30081i.d(this.f30080h.f30027g + this.f30077e.f30027g);
                }
            }
        }
    }

    @Override // b1.p
    void d() {
        a1.e eVarK;
        a1.e eVarK2;
        a1.e eVar = this.f30074b;
        if (eVar.f19812a) {
            this.f30077e.d(eVar.x());
        }
        if (!this.f30077e.f30030j) {
            this.f30076d = this.f30074b.T();
            if (this.f30074b.Z()) {
                this.f30057l = new C2196a(this);
            }
            e.b bVar = this.f30076d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarK2 = this.f30074b.K()) != null && eVarK2.T() == e.b.FIXED) {
                    int iX = (eVarK2.x() - this.f30074b.f19801P.f()) - this.f30074b.f19803R.f();
                    b(this.f30080h, eVarK2.f19822f.f30080h, this.f30074b.f19801P.f());
                    b(this.f30081i, eVarK2.f19822f.f30081i, -this.f30074b.f19803R.f());
                    this.f30077e.d(iX);
                    return;
                }
                if (this.f30076d == e.b.FIXED) {
                    this.f30077e.d(this.f30074b.x());
                }
            }
        } else if (this.f30076d == e.b.MATCH_PARENT && (eVarK = this.f30074b.K()) != null && eVarK.T() == e.b.FIXED) {
            b(this.f30080h, eVarK.f19822f.f30080h, this.f30074b.f19801P.f());
            b(this.f30081i, eVarK.f19822f.f30081i, -this.f30074b.f19803R.f());
            return;
        }
        C2202g c2202g = this.f30077e;
        boolean z10 = c2202g.f30030j;
        if (z10) {
            a1.e eVar2 = this.f30074b;
            if (eVar2.f19812a) {
                a1.d[] dVarArr = eVar2.f19808W;
                a1.d dVar = dVarArr[2];
                a1.d dVar2 = dVar.f19761f;
                if (dVar2 != null && dVarArr[3].f19761f != null) {
                    if (eVar2.k0()) {
                        this.f30080h.f30026f = this.f30074b.f19808W[2].f();
                        this.f30081i.f30026f = -this.f30074b.f19808W[3].f();
                    } else {
                        C2201f c2201fH = h(this.f30074b.f19808W[2]);
                        if (c2201fH != null) {
                            b(this.f30080h, c2201fH, this.f30074b.f19808W[2].f());
                        }
                        C2201f c2201fH2 = h(this.f30074b.f19808W[3]);
                        if (c2201fH2 != null) {
                            b(this.f30081i, c2201fH2, -this.f30074b.f19808W[3].f());
                        }
                        this.f30080h.f30022b = true;
                        this.f30081i.f30022b = true;
                    }
                    if (this.f30074b.Z()) {
                        b(this.f30056k, this.f30080h, this.f30074b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    C2201f c2201fH3 = h(dVar);
                    if (c2201fH3 != null) {
                        b(this.f30080h, c2201fH3, this.f30074b.f19808W[2].f());
                        b(this.f30081i, this.f30080h, this.f30077e.f30027g);
                        if (this.f30074b.Z()) {
                            b(this.f30056k, this.f30080h, this.f30074b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                a1.d dVar3 = dVarArr[3];
                if (dVar3.f19761f != null) {
                    C2201f c2201fH4 = h(dVar3);
                    if (c2201fH4 != null) {
                        b(this.f30081i, c2201fH4, -this.f30074b.f19808W[3].f());
                        b(this.f30080h, this.f30081i, -this.f30077e.f30027g);
                    }
                    if (this.f30074b.Z()) {
                        b(this.f30056k, this.f30080h, this.f30074b.p());
                        return;
                    }
                    return;
                }
                a1.d dVar4 = dVarArr[4];
                if (dVar4.f19761f != null) {
                    C2201f c2201fH5 = h(dVar4);
                    if (c2201fH5 != null) {
                        b(this.f30056k, c2201fH5, 0);
                        b(this.f30080h, this.f30056k, -this.f30074b.p());
                        b(this.f30081i, this.f30080h, this.f30077e.f30027g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof a1.i) || eVar2.K() == null || this.f30074b.o(d.a.CENTER).f19761f != null) {
                    return;
                }
                b(this.f30080h, this.f30074b.K().f19822f.f30080h, this.f30074b.Y());
                b(this.f30081i, this.f30080h, this.f30077e.f30027g);
                if (this.f30074b.Z()) {
                    b(this.f30056k, this.f30080h, this.f30074b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f30076d != e.b.MATCH_CONSTRAINT) {
            c2202g.b(this);
        } else {
            a1.e eVar3 = this.f30074b;
            int i10 = eVar3.f19858x;
            if (i10 == 2) {
                a1.e eVarK3 = eVar3.K();
                if (eVarK3 != null) {
                    C2202g c2202g2 = eVarK3.f19822f.f30077e;
                    this.f30077e.f30032l.add(c2202g2);
                    c2202g2.f30031k.add(this.f30077e);
                    C2202g c2202g3 = this.f30077e;
                    c2202g3.f30022b = true;
                    c2202g3.f30031k.add(this.f30080h);
                    this.f30077e.f30031k.add(this.f30081i);
                }
            } else if (i10 == 3 && !eVar3.k0()) {
                a1.e eVar4 = this.f30074b;
                if (eVar4.f19856w != 3) {
                    C2202g c2202g4 = eVar4.f19820e.f30077e;
                    this.f30077e.f30032l.add(c2202g4);
                    c2202g4.f30031k.add(this.f30077e);
                    C2202g c2202g5 = this.f30077e;
                    c2202g5.f30022b = true;
                    c2202g5.f30031k.add(this.f30080h);
                    this.f30077e.f30031k.add(this.f30081i);
                }
            }
        }
        a1.e eVar5 = this.f30074b;
        a1.d[] dVarArr2 = eVar5.f19808W;
        a1.d dVar5 = dVarArr2[2];
        a1.d dVar6 = dVar5.f19761f;
        if (dVar6 != null && dVarArr2[3].f19761f != null) {
            if (eVar5.k0()) {
                this.f30080h.f30026f = this.f30074b.f19808W[2].f();
                this.f30081i.f30026f = -this.f30074b.f19808W[3].f();
            } else {
                C2201f c2201fH6 = h(this.f30074b.f19808W[2]);
                C2201f c2201fH7 = h(this.f30074b.f19808W[3]);
                if (c2201fH6 != null) {
                    c2201fH6.b(this);
                }
                if (c2201fH7 != null) {
                    c2201fH7.b(this);
                }
                this.f30082j = p.b.CENTER;
            }
            if (this.f30074b.Z()) {
                c(this.f30056k, this.f30080h, 1, this.f30057l);
            }
        } else if (dVar6 != null) {
            C2201f c2201fH8 = h(dVar5);
            if (c2201fH8 != null) {
                b(this.f30080h, c2201fH8, this.f30074b.f19808W[2].f());
                c(this.f30081i, this.f30080h, 1, this.f30077e);
                if (this.f30074b.Z()) {
                    c(this.f30056k, this.f30080h, 1, this.f30057l);
                }
                e.b bVar2 = this.f30076d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f30074b.v() > 0.0f) {
                    C2207l c2207l = this.f30074b.f19820e;
                    if (c2207l.f30076d == bVar3) {
                        c2207l.f30077e.f30031k.add(this.f30077e);
                        this.f30077e.f30032l.add(this.f30074b.f19820e.f30077e);
                        this.f30077e.f30021a = this;
                    }
                }
            }
        } else {
            a1.d dVar7 = dVarArr2[3];
            if (dVar7.f19761f != null) {
                C2201f c2201fH9 = h(dVar7);
                if (c2201fH9 != null) {
                    b(this.f30081i, c2201fH9, -this.f30074b.f19808W[3].f());
                    c(this.f30080h, this.f30081i, -1, this.f30077e);
                    if (this.f30074b.Z()) {
                        c(this.f30056k, this.f30080h, 1, this.f30057l);
                    }
                }
            } else {
                a1.d dVar8 = dVarArr2[4];
                if (dVar8.f19761f != null) {
                    C2201f c2201fH10 = h(dVar8);
                    if (c2201fH10 != null) {
                        b(this.f30056k, c2201fH10, 0);
                        c(this.f30080h, this.f30056k, -1, this.f30057l);
                        c(this.f30081i, this.f30080h, 1, this.f30077e);
                    }
                } else if (!(eVar5 instanceof a1.i) && eVar5.K() != null) {
                    b(this.f30080h, this.f30074b.K().f19822f.f30080h, this.f30074b.Y());
                    c(this.f30081i, this.f30080h, 1, this.f30077e);
                    if (this.f30074b.Z()) {
                        c(this.f30056k, this.f30080h, 1, this.f30057l);
                    }
                    e.b bVar4 = this.f30076d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f30074b.v() > 0.0f) {
                        C2207l c2207l2 = this.f30074b.f19820e;
                        if (c2207l2.f30076d == bVar5) {
                            c2207l2.f30077e.f30031k.add(this.f30077e);
                            this.f30077e.f30032l.add(this.f30074b.f19820e.f30077e);
                            this.f30077e.f30021a = this;
                        }
                    }
                }
            }
        }
        if (this.f30077e.f30032l.size() == 0) {
            this.f30077e.f30023c = true;
        }
    }

    @Override // b1.p
    public void e() {
        C2201f c2201f = this.f30080h;
        if (c2201f.f30030j) {
            this.f30074b.o1(c2201f.f30027g);
        }
    }

    @Override // b1.p
    void f() {
        this.f30075c = null;
        this.f30080h.c();
        this.f30081i.c();
        this.f30056k.c();
        this.f30077e.c();
        this.f30079g = false;
    }

    @Override // b1.p
    boolean m() {
        return this.f30076d != e.b.MATCH_CONSTRAINT || this.f30074b.f19858x == 0;
    }

    void q() {
        this.f30079g = false;
        this.f30080h.c();
        this.f30080h.f30030j = false;
        this.f30081i.c();
        this.f30081i.f30030j = false;
        this.f30056k.c();
        this.f30056k.f30030j = false;
        this.f30077e.f30030j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f30074b.t();
    }
}
