package p024c.p044g.p048b.p049k.p050m;

import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.InterfaceC0895h;
import p024c.p044g.p048b.p049k.p050m.AbstractC0915p;
import p024c.p044g.p048b.p049k.p050m.C0905f;

/* compiled from: HorizontalWidgetRun.java */
/* renamed from: c.g.b.k.m.l */
/* loaded from: classes.dex */
public class C0911l extends AbstractC0915p {

    /* renamed from: k */
    private static int[] f6131k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* renamed from: c.g.b.k.m.l$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6132a;

        static {
            int[] iArr = new int[AbstractC0915p.b.values().length];
            f6132a = iArr;
            try {
                iArr[AbstractC0915p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6132a[AbstractC0915p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6132a[AbstractC0915p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0911l(C0892e c0892e) {
        super(c0892e);
        this.f6166h.f6112e = C0905f.a.LEFT;
        this.f6167i.f6112e = C0905f.a.RIGHT;
        this.f6164f = 0;
    }

    /* renamed from: q */
    private void m5846q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7 && i8 <= i8) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else {
            if (i7 > i7 || i10 > i8) {
                return;
            }
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p, p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5808a(p024c.p044g.p048b.p049k.p050m.InterfaceC0903d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.p050m.C0911l.mo5808a(c.g.b.k.m.d):void");
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: d */
    void mo5809d() {
        C0892e c0892eM5668I;
        C0892e c0892eM5668I2;
        C0892e c0892e = this.f6160b;
        if (c0892e.f5970b) {
            this.f6163e.mo5830d(c0892e.m5686R());
        }
        if (this.f6163e.f6117j) {
            C0892e.b bVar = this.f6162d;
            C0892e.b bVar2 = C0892e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((c0892eM5668I = this.f6160b.m5668I()) != null && c0892eM5668I.m5742y() == C0892e.b.FIXED) || c0892eM5668I.m5742y() == bVar2)) {
                m5864b(this.f6166h, c0892eM5668I.f5978f.f6166h, this.f6160b.f5951I.m5634e());
                m5864b(this.f6167i, c0892eM5668I.f5978f.f6167i, -this.f6160b.f5953K.m5634e());
                return;
            }
        } else {
            C0892e.b bVarM5742y = this.f6160b.m5742y();
            this.f6162d = bVarM5742y;
            if (bVarM5742y != C0892e.b.MATCH_CONSTRAINT) {
                C0892e.b bVar3 = C0892e.b.MATCH_PARENT;
                if (bVarM5742y == bVar3 && (((c0892eM5668I2 = this.f6160b.m5668I()) != null && c0892eM5668I2.m5742y() == C0892e.b.FIXED) || c0892eM5668I2.m5742y() == bVar3)) {
                    int iM5686R = (c0892eM5668I2.m5686R() - this.f6160b.f5951I.m5634e()) - this.f6160b.f5953K.m5634e();
                    m5864b(this.f6166h, c0892eM5668I2.f5978f.f6166h, this.f6160b.f5951I.m5634e());
                    m5864b(this.f6167i, c0892eM5668I2.f5978f.f6167i, -this.f6160b.f5953K.m5634e());
                    this.f6163e.mo5830d(iM5686R);
                    return;
                }
                if (this.f6162d == C0892e.b.FIXED) {
                    this.f6163e.mo5830d(this.f6160b.m5686R());
                }
            }
        }
        C0906g c0906g = this.f6163e;
        if (c0906g.f6117j) {
            C0892e c0892e2 = this.f6160b;
            if (c0892e2.f5970b) {
                C0891d[] c0891dArr = c0892e2.f5959Q;
                if (c0891dArr[0].f5924f != null && c0891dArr[1].f5924f != null) {
                    if (c0892e2.m5701Z()) {
                        this.f6166h.f6113f = this.f6160b.f5959Q[0].m5634e();
                        this.f6167i.f6113f = -this.f6160b.f5959Q[1].m5634e();
                        return;
                    }
                    C0905f c0905fM5867h = m5867h(this.f6160b.f5959Q[0]);
                    if (c0905fM5867h != null) {
                        m5864b(this.f6166h, c0905fM5867h, this.f6160b.f5959Q[0].m5634e());
                    }
                    C0905f c0905fM5867h2 = m5867h(this.f6160b.f5959Q[1]);
                    if (c0905fM5867h2 != null) {
                        m5864b(this.f6167i, c0905fM5867h2, -this.f6160b.f5959Q[1].m5634e());
                    }
                    this.f6166h.f6109b = true;
                    this.f6167i.f6109b = true;
                    return;
                }
                if (c0891dArr[0].f5924f != null) {
                    C0905f c0905fM5867h3 = m5867h(c0891dArr[0]);
                    if (c0905fM5867h3 != null) {
                        m5864b(this.f6166h, c0905fM5867h3, this.f6160b.f5959Q[0].m5634e());
                        m5864b(this.f6167i, this.f6166h, this.f6163e.f6114g);
                        return;
                    }
                    return;
                }
                if (c0891dArr[1].f5924f != null) {
                    C0905f c0905fM5867h4 = m5867h(c0891dArr[1]);
                    if (c0905fM5867h4 != null) {
                        m5864b(this.f6167i, c0905fM5867h4, -this.f6160b.f5959Q[1].m5634e());
                        m5864b(this.f6166h, this.f6167i, -this.f6163e.f6114g);
                        return;
                    }
                    return;
                }
                if ((c0892e2 instanceof InterfaceC0895h) || c0892e2.m5668I() == null || this.f6160b.mo5718m(C0891d.b.CENTER).f5924f != null) {
                    return;
                }
                m5864b(this.f6166h, this.f6160b.m5668I().f5978f.f6166h, this.f6160b.m5688S());
                m5864b(this.f6167i, this.f6166h, this.f6163e.f6114g);
                return;
            }
        }
        if (this.f6162d == C0892e.b.MATCH_CONSTRAINT) {
            C0892e c0892e3 = this.f6160b;
            int i2 = c0892e3.f6000q;
            if (i2 == 2) {
                C0892e c0892eM5668I3 = c0892e3.m5668I();
                if (c0892eM5668I3 != null) {
                    C0906g c0906g2 = c0892eM5668I3.f5980g.f6163e;
                    this.f6163e.f6119l.add(c0906g2);
                    c0906g2.f6118k.add(this.f6163e);
                    C0906g c0906g3 = this.f6163e;
                    c0906g3.f6109b = true;
                    c0906g3.f6118k.add(this.f6166h);
                    this.f6163e.f6118k.add(this.f6167i);
                }
            } else if (i2 == 3) {
                if (c0892e3.f6002r == 3) {
                    this.f6166h.f6108a = this;
                    this.f6167i.f6108a = this;
                    C0913n c0913n = c0892e3.f5980g;
                    c0913n.f6166h.f6108a = this;
                    c0913n.f6167i.f6108a = this;
                    c0906g.f6108a = this;
                    if (c0892e3.m5704b0()) {
                        this.f6163e.f6119l.add(this.f6160b.f5980g.f6163e);
                        this.f6160b.f5980g.f6163e.f6118k.add(this.f6163e);
                        C0913n c0913n2 = this.f6160b.f5980g;
                        c0913n2.f6163e.f6108a = this;
                        this.f6163e.f6119l.add(c0913n2.f6166h);
                        this.f6163e.f6119l.add(this.f6160b.f5980g.f6167i);
                        this.f6160b.f5980g.f6166h.f6118k.add(this.f6163e);
                        this.f6160b.f5980g.f6167i.f6118k.add(this.f6163e);
                    } else if (this.f6160b.m5701Z()) {
                        this.f6160b.f5980g.f6163e.f6119l.add(this.f6163e);
                        this.f6163e.f6118k.add(this.f6160b.f5980g.f6163e);
                    } else {
                        this.f6160b.f5980g.f6163e.f6119l.add(this.f6163e);
                    }
                } else {
                    C0906g c0906g4 = c0892e3.f5980g.f6163e;
                    c0906g.f6119l.add(c0906g4);
                    c0906g4.f6118k.add(this.f6163e);
                    this.f6160b.f5980g.f6166h.f6118k.add(this.f6163e);
                    this.f6160b.f5980g.f6167i.f6118k.add(this.f6163e);
                    C0906g c0906g5 = this.f6163e;
                    c0906g5.f6109b = true;
                    c0906g5.f6118k.add(this.f6166h);
                    this.f6163e.f6118k.add(this.f6167i);
                    this.f6166h.f6119l.add(this.f6163e);
                    this.f6167i.f6119l.add(this.f6163e);
                }
            }
        }
        C0892e c0892e4 = this.f6160b;
        C0891d[] c0891dArr2 = c0892e4.f5959Q;
        if (c0891dArr2[0].f5924f != null && c0891dArr2[1].f5924f != null) {
            if (c0892e4.m5701Z()) {
                this.f6166h.f6113f = this.f6160b.f5959Q[0].m5634e();
                this.f6167i.f6113f = -this.f6160b.f5959Q[1].m5634e();
                return;
            }
            C0905f c0905fM5867h5 = m5867h(this.f6160b.f5959Q[0]);
            C0905f c0905fM5867h6 = m5867h(this.f6160b.f5959Q[1]);
            c0905fM5867h5.m5828b(this);
            c0905fM5867h6.m5828b(this);
            this.f6168j = AbstractC0915p.b.CENTER;
            return;
        }
        if (c0891dArr2[0].f5924f != null) {
            C0905f c0905fM5867h7 = m5867h(c0891dArr2[0]);
            if (c0905fM5867h7 != null) {
                m5864b(this.f6166h, c0905fM5867h7, this.f6160b.f5959Q[0].m5634e());
                m5865c(this.f6167i, this.f6166h, 1, this.f6163e);
                return;
            }
            return;
        }
        if (c0891dArr2[1].f5924f != null) {
            C0905f c0905fM5867h8 = m5867h(c0891dArr2[1]);
            if (c0905fM5867h8 != null) {
                m5864b(this.f6167i, c0905fM5867h8, -this.f6160b.f5959Q[1].m5634e());
                m5865c(this.f6166h, this.f6167i, -1, this.f6163e);
                return;
            }
            return;
        }
        if ((c0892e4 instanceof InterfaceC0895h) || c0892e4.m5668I() == null) {
            return;
        }
        m5864b(this.f6166h, this.f6160b.m5668I().f5978f.f6166h, this.f6160b.m5688S());
        m5865c(this.f6167i, this.f6166h, 1, this.f6163e);
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: e */
    public void mo5810e() {
        C0905f c0905f = this.f6166h;
        if (c0905f.f6117j) {
            this.f6160b.m5695V0(c0905f.f6114g);
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: f */
    void mo5811f() {
        this.f6161c = null;
        this.f6166h.m5829c();
        this.f6167i.m5829c();
        this.f6163e.m5829c();
        this.f6165g = false;
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: m */
    boolean mo5813m() {
        return this.f6162d != C0892e.b.MATCH_CONSTRAINT || this.f6160b.f6000q == 0;
    }

    /* renamed from: r */
    void m5847r() {
        this.f6165g = false;
        this.f6166h.m5829c();
        this.f6166h.f6117j = false;
        this.f6167i.m5829c();
        this.f6167i.f6117j = false;
        this.f6163e.f6117j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f6160b.m5728r();
    }
}
