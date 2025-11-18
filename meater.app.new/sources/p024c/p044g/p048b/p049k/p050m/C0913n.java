package p024c.p044g.p048b.p049k.p050m;

import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.InterfaceC0895h;
import p024c.p044g.p048b.p049k.p050m.AbstractC0915p;
import p024c.p044g.p048b.p049k.p050m.C0905f;

/* compiled from: VerticalWidgetRun.java */
/* renamed from: c.g.b.k.m.n */
/* loaded from: classes.dex */
public class C0913n extends AbstractC0915p {

    /* renamed from: k */
    public C0905f f6141k;

    /* renamed from: l */
    C0906g f6142l;

    /* compiled from: VerticalWidgetRun.java */
    /* renamed from: c.g.b.k.m.n$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6143a;

        static {
            int[] iArr = new int[AbstractC0915p.b.values().length];
            f6143a = iArr;
            try {
                iArr[AbstractC0915p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6143a[AbstractC0915p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6143a[AbstractC0915p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0913n(C0892e c0892e) {
        super(c0892e);
        C0905f c0905f = new C0905f(this);
        this.f6141k = c0905f;
        this.f6142l = null;
        this.f6166h.f6112e = C0905f.a.TOP;
        this.f6167i.f6112e = C0905f.a.BOTTOM;
        c0905f.f6112e = C0905f.a.BASELINE;
        this.f6164f = 1;
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p, p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    public void mo5808a(InterfaceC0903d interfaceC0903d) {
        float f2;
        float fM5732t;
        float fM5732t2;
        int i2;
        int i3 = a.f6143a[this.f6168j.ordinal()];
        if (i3 == 1) {
            m5872p(interfaceC0903d);
        } else if (i3 == 2) {
            m5871o(interfaceC0903d);
        } else if (i3 == 3) {
            C0892e c0892e = this.f6160b;
            m5870n(interfaceC0903d, c0892e.f5952J, c0892e.f5954L, 1);
            return;
        }
        C0906g c0906g = this.f6163e;
        if (c0906g.f6110c && !c0906g.f6117j && this.f6162d == C0892e.b.MATCH_CONSTRAINT) {
            C0892e c0892e2 = this.f6160b;
            int i4 = c0892e2.f6002r;
            if (i4 == 2) {
                C0892e c0892eM5668I = c0892e2.m5668I();
                if (c0892eM5668I != null) {
                    if (c0892eM5668I.f5980g.f6163e.f6117j) {
                        this.f6163e.mo5830d((int) ((r7.f6114g * this.f6160b.f6016y) + 0.5f));
                    }
                }
            } else if (i4 == 3 && c0892e2.f5978f.f6163e.f6117j) {
                int iM5734u = c0892e2.m5734u();
                if (iM5734u == -1) {
                    C0892e c0892e3 = this.f6160b;
                    f2 = c0892e3.f5978f.f6163e.f6114g;
                    fM5732t = c0892e3.m5732t();
                } else if (iM5734u == 0) {
                    fM5732t2 = r7.f5978f.f6163e.f6114g * this.f6160b.m5732t();
                    i2 = (int) (fM5732t2 + 0.5f);
                    this.f6163e.mo5830d(i2);
                } else if (iM5734u != 1) {
                    i2 = 0;
                    this.f6163e.mo5830d(i2);
                } else {
                    C0892e c0892e4 = this.f6160b;
                    f2 = c0892e4.f5978f.f6163e.f6114g;
                    fM5732t = c0892e4.m5732t();
                }
                fM5732t2 = f2 / fM5732t;
                i2 = (int) (fM5732t2 + 0.5f);
                this.f6163e.mo5830d(i2);
            }
        }
        C0905f c0905f = this.f6166h;
        if (c0905f.f6110c) {
            C0905f c0905f2 = this.f6167i;
            if (c0905f2.f6110c) {
                if (c0905f.f6117j && c0905f2.f6117j && this.f6163e.f6117j) {
                    return;
                }
                if (!this.f6163e.f6117j && this.f6162d == C0892e.b.MATCH_CONSTRAINT) {
                    C0892e c0892e5 = this.f6160b;
                    if (c0892e5.f6000q == 0 && !c0892e5.m5704b0()) {
                        C0905f c0905f3 = this.f6166h.f6119l.get(0);
                        C0905f c0905f4 = this.f6167i.f6119l.get(0);
                        int i5 = c0905f3.f6114g;
                        C0905f c0905f5 = this.f6166h;
                        int i6 = i5 + c0905f5.f6113f;
                        int i7 = c0905f4.f6114g + this.f6167i.f6113f;
                        c0905f5.mo5830d(i6);
                        this.f6167i.mo5830d(i7);
                        this.f6163e.mo5830d(i7 - i6);
                        return;
                    }
                }
                if (!this.f6163e.f6117j && this.f6162d == C0892e.b.MATCH_CONSTRAINT && this.f6159a == 1 && this.f6166h.f6119l.size() > 0 && this.f6167i.f6119l.size() > 0) {
                    C0905f c0905f6 = this.f6166h.f6119l.get(0);
                    int i8 = (this.f6167i.f6119l.get(0).f6114g + this.f6167i.f6113f) - (c0905f6.f6114g + this.f6166h.f6113f);
                    C0906g c0906g2 = this.f6163e;
                    int i9 = c0906g2.f6129m;
                    if (i8 < i9) {
                        c0906g2.mo5830d(i8);
                    } else {
                        c0906g2.mo5830d(i9);
                    }
                }
                if (this.f6163e.f6117j && this.f6166h.f6119l.size() > 0 && this.f6167i.f6119l.size() > 0) {
                    C0905f c0905f7 = this.f6166h.f6119l.get(0);
                    C0905f c0905f8 = this.f6167i.f6119l.get(0);
                    int i10 = c0905f7.f6114g + this.f6166h.f6113f;
                    int i11 = c0905f8.f6114g + this.f6167i.f6113f;
                    float fM5676M = this.f6160b.m5676M();
                    if (c0905f7 == c0905f8) {
                        i10 = c0905f7.f6114g;
                        i11 = c0905f8.f6114g;
                        fM5676M = 0.5f;
                    }
                    this.f6166h.mo5830d((int) (i10 + 0.5f + (((i11 - i10) - this.f6163e.f6114g) * fM5676M)));
                    this.f6167i.mo5830d(this.f6166h.f6114g + this.f6163e.f6114g);
                }
            }
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: d */
    void mo5809d() {
        C0892e c0892eM5668I;
        C0892e c0892eM5668I2;
        C0892e c0892e = this.f6160b;
        if (c0892e.f5970b) {
            this.f6163e.mo5830d(c0892e.m5736v());
        }
        if (!this.f6163e.f6117j) {
            this.f6162d = this.f6160b.m5680O();
            if (this.f6160b.m5692U()) {
                this.f6142l = new C0900a(this);
            }
            C0892e.b bVar = this.f6162d;
            if (bVar != C0892e.b.MATCH_CONSTRAINT) {
                if (bVar == C0892e.b.MATCH_PARENT && (c0892eM5668I2 = this.f6160b.m5668I()) != null && c0892eM5668I2.m5680O() == C0892e.b.FIXED) {
                    int iM5736v = (c0892eM5668I2.m5736v() - this.f6160b.f5952J.m5634e()) - this.f6160b.f5954L.m5634e();
                    m5864b(this.f6166h, c0892eM5668I2.f5980g.f6166h, this.f6160b.f5952J.m5634e());
                    m5864b(this.f6167i, c0892eM5668I2.f5980g.f6167i, -this.f6160b.f5954L.m5634e());
                    this.f6163e.mo5830d(iM5736v);
                    return;
                }
                if (this.f6162d == C0892e.b.FIXED) {
                    this.f6163e.mo5830d(this.f6160b.m5736v());
                }
            }
        } else if (this.f6162d == C0892e.b.MATCH_PARENT && (c0892eM5668I = this.f6160b.m5668I()) != null && c0892eM5668I.m5680O() == C0892e.b.FIXED) {
            m5864b(this.f6166h, c0892eM5668I.f5980g.f6166h, this.f6160b.f5952J.m5634e());
            m5864b(this.f6167i, c0892eM5668I.f5980g.f6167i, -this.f6160b.f5954L.m5634e());
            return;
        }
        C0906g c0906g = this.f6163e;
        boolean z = c0906g.f6117j;
        if (z) {
            C0892e c0892e2 = this.f6160b;
            if (c0892e2.f5970b) {
                C0891d[] c0891dArr = c0892e2.f5959Q;
                if (c0891dArr[2].f5924f != null && c0891dArr[3].f5924f != null) {
                    if (c0892e2.m5704b0()) {
                        this.f6166h.f6113f = this.f6160b.f5959Q[2].m5634e();
                        this.f6167i.f6113f = -this.f6160b.f5959Q[3].m5634e();
                    } else {
                        C0905f c0905fM5867h = m5867h(this.f6160b.f5959Q[2]);
                        if (c0905fM5867h != null) {
                            m5864b(this.f6166h, c0905fM5867h, this.f6160b.f5959Q[2].m5634e());
                        }
                        C0905f c0905fM5867h2 = m5867h(this.f6160b.f5959Q[3]);
                        if (c0905fM5867h2 != null) {
                            m5864b(this.f6167i, c0905fM5867h2, -this.f6160b.f5959Q[3].m5634e());
                        }
                        this.f6166h.f6109b = true;
                        this.f6167i.f6109b = true;
                    }
                    if (this.f6160b.m5692U()) {
                        m5864b(this.f6141k, this.f6166h, this.f6160b.m5720n());
                        return;
                    }
                    return;
                }
                if (c0891dArr[2].f5924f != null) {
                    C0905f c0905fM5867h3 = m5867h(c0891dArr[2]);
                    if (c0905fM5867h3 != null) {
                        m5864b(this.f6166h, c0905fM5867h3, this.f6160b.f5959Q[2].m5634e());
                        m5864b(this.f6167i, this.f6166h, this.f6163e.f6114g);
                        if (this.f6160b.m5692U()) {
                            m5864b(this.f6141k, this.f6166h, this.f6160b.m5720n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (c0891dArr[3].f5924f != null) {
                    C0905f c0905fM5867h4 = m5867h(c0891dArr[3]);
                    if (c0905fM5867h4 != null) {
                        m5864b(this.f6167i, c0905fM5867h4, -this.f6160b.f5959Q[3].m5634e());
                        m5864b(this.f6166h, this.f6167i, -this.f6163e.f6114g);
                    }
                    if (this.f6160b.m5692U()) {
                        m5864b(this.f6141k, this.f6166h, this.f6160b.m5720n());
                        return;
                    }
                    return;
                }
                if (c0891dArr[4].f5924f != null) {
                    C0905f c0905fM5867h5 = m5867h(c0891dArr[4]);
                    if (c0905fM5867h5 != null) {
                        m5864b(this.f6141k, c0905fM5867h5, 0);
                        m5864b(this.f6166h, this.f6141k, -this.f6160b.m5720n());
                        m5864b(this.f6167i, this.f6166h, this.f6163e.f6114g);
                        return;
                    }
                    return;
                }
                if ((c0892e2 instanceof InterfaceC0895h) || c0892e2.m5668I() == null || this.f6160b.mo5718m(C0891d.b.CENTER).f5924f != null) {
                    return;
                }
                m5864b(this.f6166h, this.f6160b.m5668I().f5980g.f6166h, this.f6160b.m5690T());
                m5864b(this.f6167i, this.f6166h, this.f6163e.f6114g);
                if (this.f6160b.m5692U()) {
                    m5864b(this.f6141k, this.f6166h, this.f6160b.m5720n());
                    return;
                }
                return;
            }
        }
        if (z || this.f6162d != C0892e.b.MATCH_CONSTRAINT) {
            c0906g.m5828b(this);
        } else {
            C0892e c0892e3 = this.f6160b;
            int i2 = c0892e3.f6002r;
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
            } else if (i2 == 3 && !c0892e3.m5704b0()) {
                C0892e c0892e4 = this.f6160b;
                if (c0892e4.f6000q != 3) {
                    C0906g c0906g4 = c0892e4.f5978f.f6163e;
                    this.f6163e.f6119l.add(c0906g4);
                    c0906g4.f6118k.add(this.f6163e);
                    C0906g c0906g5 = this.f6163e;
                    c0906g5.f6109b = true;
                    c0906g5.f6118k.add(this.f6166h);
                    this.f6163e.f6118k.add(this.f6167i);
                }
            }
        }
        C0892e c0892e5 = this.f6160b;
        C0891d[] c0891dArr2 = c0892e5.f5959Q;
        if (c0891dArr2[2].f5924f != null && c0891dArr2[3].f5924f != null) {
            if (c0892e5.m5704b0()) {
                this.f6166h.f6113f = this.f6160b.f5959Q[2].m5634e();
                this.f6167i.f6113f = -this.f6160b.f5959Q[3].m5634e();
            } else {
                C0905f c0905fM5867h6 = m5867h(this.f6160b.f5959Q[2]);
                C0905f c0905fM5867h7 = m5867h(this.f6160b.f5959Q[3]);
                c0905fM5867h6.m5828b(this);
                c0905fM5867h7.m5828b(this);
                this.f6168j = AbstractC0915p.b.CENTER;
            }
            if (this.f6160b.m5692U()) {
                m5865c(this.f6141k, this.f6166h, 1, this.f6142l);
            }
        } else if (c0891dArr2[2].f5924f != null) {
            C0905f c0905fM5867h8 = m5867h(c0891dArr2[2]);
            if (c0905fM5867h8 != null) {
                m5864b(this.f6166h, c0905fM5867h8, this.f6160b.f5959Q[2].m5634e());
                m5865c(this.f6167i, this.f6166h, 1, this.f6163e);
                if (this.f6160b.m5692U()) {
                    m5865c(this.f6141k, this.f6166h, 1, this.f6142l);
                }
                C0892e.b bVar2 = this.f6162d;
                C0892e.b bVar3 = C0892e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f6160b.m5732t() > 0.0f) {
                    C0911l c0911l = this.f6160b.f5978f;
                    if (c0911l.f6162d == bVar3) {
                        c0911l.f6163e.f6118k.add(this.f6163e);
                        this.f6163e.f6119l.add(this.f6160b.f5978f.f6163e);
                        this.f6163e.f6108a = this;
                    }
                }
            }
        } else if (c0891dArr2[3].f5924f != null) {
            C0905f c0905fM5867h9 = m5867h(c0891dArr2[3]);
            if (c0905fM5867h9 != null) {
                m5864b(this.f6167i, c0905fM5867h9, -this.f6160b.f5959Q[3].m5634e());
                m5865c(this.f6166h, this.f6167i, -1, this.f6163e);
                if (this.f6160b.m5692U()) {
                    m5865c(this.f6141k, this.f6166h, 1, this.f6142l);
                }
            }
        } else if (c0891dArr2[4].f5924f != null) {
            C0905f c0905fM5867h10 = m5867h(c0891dArr2[4]);
            if (c0905fM5867h10 != null) {
                m5864b(this.f6141k, c0905fM5867h10, 0);
                m5865c(this.f6166h, this.f6141k, -1, this.f6142l);
                m5865c(this.f6167i, this.f6166h, 1, this.f6163e);
            }
        } else if (!(c0892e5 instanceof InterfaceC0895h) && c0892e5.m5668I() != null) {
            m5864b(this.f6166h, this.f6160b.m5668I().f5980g.f6166h, this.f6160b.m5690T());
            m5865c(this.f6167i, this.f6166h, 1, this.f6163e);
            if (this.f6160b.m5692U()) {
                m5865c(this.f6141k, this.f6166h, 1, this.f6142l);
            }
            C0892e.b bVar4 = this.f6162d;
            C0892e.b bVar5 = C0892e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f6160b.m5732t() > 0.0f) {
                C0911l c0911l2 = this.f6160b.f5978f;
                if (c0911l2.f6162d == bVar5) {
                    c0911l2.f6163e.f6118k.add(this.f6163e);
                    this.f6163e.f6119l.add(this.f6160b.f5978f.f6163e);
                    this.f6163e.f6108a = this;
                }
            }
        }
        if (this.f6163e.f6119l.size() == 0) {
            this.f6163e.f6110c = true;
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: e */
    public void mo5810e() {
        C0905f c0905f = this.f6166h;
        if (c0905f.f6117j) {
            this.f6160b.m5697W0(c0905f.f6114g);
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: f */
    void mo5811f() {
        this.f6161c = null;
        this.f6166h.m5829c();
        this.f6167i.m5829c();
        this.f6141k.m5829c();
        this.f6163e.m5829c();
        this.f6165g = false;
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: m */
    boolean mo5813m() {
        return this.f6162d != C0892e.b.MATCH_CONSTRAINT || this.f6160b.f6002r == 0;
    }

    /* renamed from: q */
    void m5852q() {
        this.f6165g = false;
        this.f6166h.m5829c();
        this.f6166h.f6117j = false;
        this.f6167i.m5829c();
        this.f6167i.f6117j = false;
        this.f6141k.m5829c();
        this.f6141k.f6117j = false;
        this.f6163e.f6117j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f6160b.m5728r();
    }
}
