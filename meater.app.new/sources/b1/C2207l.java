package b1;

import a1.d;
import a1.e;
import b1.C2201f;
import b1.p;

/* compiled from: HorizontalWidgetRun.java */
/* renamed from: b1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2207l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f30046k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* renamed from: b1.l$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30047a;

        static {
            int[] iArr = new int[p.b.values().length];
            f30047a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30047a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30047a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2207l(a1.e eVar) {
        super(eVar);
        this.f30080h.f30025e = C2201f.a.LEFT;
        this.f30081i.f30025e = C2201f.a.RIGHT;
        this.f30078f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // b1.p, b1.InterfaceC2199d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(b1.InterfaceC2199d r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C2207l.a(b1.d):void");
    }

    @Override // b1.p
    void d() {
        a1.e eVarK;
        a1.e eVarK2;
        a1.e eVar = this.f30074b;
        if (eVar.f19812a) {
            this.f30077e.d(eVar.W());
        }
        if (this.f30077e.f30030j) {
            e.b bVar = this.f30076d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarK = this.f30074b.K()) != null && (eVarK.A() == e.b.FIXED || eVarK.A() == bVar2)) {
                b(this.f30080h, eVarK.f19820e.f30080h, this.f30074b.f19800O.f());
                b(this.f30081i, eVarK.f19820e.f30081i, -this.f30074b.f19802Q.f());
                return;
            }
        } else {
            e.b bVarA = this.f30074b.A();
            this.f30076d = bVarA;
            if (bVarA != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (eVarK2 = this.f30074b.K()) != null && (eVarK2.A() == e.b.FIXED || eVarK2.A() == bVar3)) {
                    int iW = (eVarK2.W() - this.f30074b.f19800O.f()) - this.f30074b.f19802Q.f();
                    b(this.f30080h, eVarK2.f19820e.f30080h, this.f30074b.f19800O.f());
                    b(this.f30081i, eVarK2.f19820e.f30081i, -this.f30074b.f19802Q.f());
                    this.f30077e.d(iW);
                    return;
                }
                if (this.f30076d == e.b.FIXED) {
                    this.f30077e.d(this.f30074b.W());
                }
            }
        }
        C2202g c2202g = this.f30077e;
        if (c2202g.f30030j) {
            a1.e eVar2 = this.f30074b;
            if (eVar2.f19812a) {
                a1.d[] dVarArr = eVar2.f19808W;
                a1.d dVar = dVarArr[0];
                a1.d dVar2 = dVar.f19761f;
                if (dVar2 != null && dVarArr[1].f19761f != null) {
                    if (eVar2.i0()) {
                        this.f30080h.f30026f = this.f30074b.f19808W[0].f();
                        this.f30081i.f30026f = -this.f30074b.f19808W[1].f();
                        return;
                    }
                    C2201f c2201fH = h(this.f30074b.f19808W[0]);
                    if (c2201fH != null) {
                        b(this.f30080h, c2201fH, this.f30074b.f19808W[0].f());
                    }
                    C2201f c2201fH2 = h(this.f30074b.f19808W[1]);
                    if (c2201fH2 != null) {
                        b(this.f30081i, c2201fH2, -this.f30074b.f19808W[1].f());
                    }
                    this.f30080h.f30022b = true;
                    this.f30081i.f30022b = true;
                    return;
                }
                if (dVar2 != null) {
                    C2201f c2201fH3 = h(dVar);
                    if (c2201fH3 != null) {
                        b(this.f30080h, c2201fH3, this.f30074b.f19808W[0].f());
                        b(this.f30081i, this.f30080h, this.f30077e.f30027g);
                        return;
                    }
                    return;
                }
                a1.d dVar3 = dVarArr[1];
                if (dVar3.f19761f != null) {
                    C2201f c2201fH4 = h(dVar3);
                    if (c2201fH4 != null) {
                        b(this.f30081i, c2201fH4, -this.f30074b.f19808W[1].f());
                        b(this.f30080h, this.f30081i, -this.f30077e.f30027g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof a1.i) || eVar2.K() == null || this.f30074b.o(d.a.CENTER).f19761f != null) {
                    return;
                }
                b(this.f30080h, this.f30074b.K().f19820e.f30080h, this.f30074b.X());
                b(this.f30081i, this.f30080h, this.f30077e.f30027g);
                return;
            }
        }
        if (this.f30076d == e.b.MATCH_CONSTRAINT) {
            a1.e eVar3 = this.f30074b;
            int i10 = eVar3.f19856w;
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
            } else if (i10 == 3) {
                if (eVar3.f19858x == 3) {
                    this.f30080h.f30021a = this;
                    this.f30081i.f30021a = this;
                    C2209n c2209n = eVar3.f19822f;
                    c2209n.f30080h.f30021a = this;
                    c2209n.f30081i.f30021a = this;
                    c2202g.f30021a = this;
                    if (eVar3.k0()) {
                        this.f30077e.f30032l.add(this.f30074b.f19822f.f30077e);
                        this.f30074b.f19822f.f30077e.f30031k.add(this.f30077e);
                        C2209n c2209n2 = this.f30074b.f19822f;
                        c2209n2.f30077e.f30021a = this;
                        this.f30077e.f30032l.add(c2209n2.f30080h);
                        this.f30077e.f30032l.add(this.f30074b.f19822f.f30081i);
                        this.f30074b.f19822f.f30080h.f30031k.add(this.f30077e);
                        this.f30074b.f19822f.f30081i.f30031k.add(this.f30077e);
                    } else if (this.f30074b.i0()) {
                        this.f30074b.f19822f.f30077e.f30032l.add(this.f30077e);
                        this.f30077e.f30031k.add(this.f30074b.f19822f.f30077e);
                    } else {
                        this.f30074b.f19822f.f30077e.f30032l.add(this.f30077e);
                    }
                } else {
                    C2202g c2202g4 = eVar3.f19822f.f30077e;
                    c2202g.f30032l.add(c2202g4);
                    c2202g4.f30031k.add(this.f30077e);
                    this.f30074b.f19822f.f30080h.f30031k.add(this.f30077e);
                    this.f30074b.f19822f.f30081i.f30031k.add(this.f30077e);
                    C2202g c2202g5 = this.f30077e;
                    c2202g5.f30022b = true;
                    c2202g5.f30031k.add(this.f30080h);
                    this.f30077e.f30031k.add(this.f30081i);
                    this.f30080h.f30032l.add(this.f30077e);
                    this.f30081i.f30032l.add(this.f30077e);
                }
            }
        }
        a1.e eVar4 = this.f30074b;
        a1.d[] dVarArr2 = eVar4.f19808W;
        a1.d dVar4 = dVarArr2[0];
        a1.d dVar5 = dVar4.f19761f;
        if (dVar5 != null && dVarArr2[1].f19761f != null) {
            if (eVar4.i0()) {
                this.f30080h.f30026f = this.f30074b.f19808W[0].f();
                this.f30081i.f30026f = -this.f30074b.f19808W[1].f();
                return;
            }
            C2201f c2201fH5 = h(this.f30074b.f19808W[0]);
            C2201f c2201fH6 = h(this.f30074b.f19808W[1]);
            if (c2201fH5 != null) {
                c2201fH5.b(this);
            }
            if (c2201fH6 != null) {
                c2201fH6.b(this);
            }
            this.f30082j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            C2201f c2201fH7 = h(dVar4);
            if (c2201fH7 != null) {
                b(this.f30080h, c2201fH7, this.f30074b.f19808W[0].f());
                c(this.f30081i, this.f30080h, 1, this.f30077e);
                return;
            }
            return;
        }
        a1.d dVar6 = dVarArr2[1];
        if (dVar6.f19761f != null) {
            C2201f c2201fH8 = h(dVar6);
            if (c2201fH8 != null) {
                b(this.f30081i, c2201fH8, -this.f30074b.f19808W[1].f());
                c(this.f30080h, this.f30081i, -1, this.f30077e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof a1.i) || eVar4.K() == null) {
            return;
        }
        b(this.f30080h, this.f30074b.K().f19820e.f30080h, this.f30074b.X());
        c(this.f30081i, this.f30080h, 1, this.f30077e);
    }

    @Override // b1.p
    public void e() {
        C2201f c2201f = this.f30080h;
        if (c2201f.f30030j) {
            this.f30074b.n1(c2201f.f30027g);
        }
    }

    @Override // b1.p
    void f() {
        this.f30075c = null;
        this.f30080h.c();
        this.f30081i.c();
        this.f30077e.c();
        this.f30079g = false;
    }

    @Override // b1.p
    boolean m() {
        return this.f30076d != e.b.MATCH_CONSTRAINT || this.f30074b.f19856w == 0;
    }

    void r() {
        this.f30079g = false;
        this.f30080h.c();
        this.f30080h.f30030j = false;
        this.f30081i.c();
        this.f30081i.f30030j = false;
        this.f30077e.f30030j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f30074b.t();
    }
}
