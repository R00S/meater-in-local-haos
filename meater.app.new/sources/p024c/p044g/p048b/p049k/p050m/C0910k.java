package p024c.p044g.p048b.p049k.p050m;

import java.util.Iterator;
import p024c.p044g.p048b.p049k.C0888a;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.p050m.C0905f;

/* compiled from: HelperReferences.java */
/* renamed from: c.g.b.k.m.k */
/* loaded from: classes.dex */
class C0910k extends AbstractC0915p {
    public C0910k(C0892e c0892e) {
        super(c0892e);
    }

    /* renamed from: q */
    private void m5845q(C0905f c0905f) {
        this.f6166h.f6118k.add(c0905f);
        c0905f.f6119l.add(this.f6166h);
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p, p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    public void mo5808a(InterfaceC0903d interfaceC0903d) {
        C0888a c0888a = (C0888a) this.f6160b;
        int iM5615e1 = c0888a.m5615e1();
        Iterator<C0905f> it = this.f6166h.f6119l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f6114g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (iM5615e1 == 0 || iM5615e1 == 2) {
            this.f6166h.mo5830d(i3 + c0888a.m5617f1());
        } else {
            this.f6166h.mo5830d(i2 + c0888a.m5617f1());
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: d */
    void mo5809d() {
        C0892e c0892e = this.f6160b;
        if (c0892e instanceof C0888a) {
            this.f6166h.f6109b = true;
            C0888a c0888a = (C0888a) c0892e;
            int iM5615e1 = c0888a.m5615e1();
            boolean zM5613d1 = c0888a.m5613d1();
            int i2 = 0;
            if (iM5615e1 == 0) {
                this.f6166h.f6112e = C0905f.a.LEFT;
                while (i2 < c0888a.f6065E0) {
                    C0892e c0892e2 = c0888a.f6064D0[i2];
                    if (zM5613d1 || c0892e2.m5684Q() != 8) {
                        C0905f c0905f = c0892e2.f5978f.f6166h;
                        c0905f.f6118k.add(this.f6166h);
                        this.f6166h.f6119l.add(c0905f);
                    }
                    i2++;
                }
                m5845q(this.f6160b.f5978f.f6166h);
                m5845q(this.f6160b.f5978f.f6167i);
                return;
            }
            if (iM5615e1 == 1) {
                this.f6166h.f6112e = C0905f.a.RIGHT;
                while (i2 < c0888a.f6065E0) {
                    C0892e c0892e3 = c0888a.f6064D0[i2];
                    if (zM5613d1 || c0892e3.m5684Q() != 8) {
                        C0905f c0905f2 = c0892e3.f5978f.f6167i;
                        c0905f2.f6118k.add(this.f6166h);
                        this.f6166h.f6119l.add(c0905f2);
                    }
                    i2++;
                }
                m5845q(this.f6160b.f5978f.f6166h);
                m5845q(this.f6160b.f5978f.f6167i);
                return;
            }
            if (iM5615e1 == 2) {
                this.f6166h.f6112e = C0905f.a.TOP;
                while (i2 < c0888a.f6065E0) {
                    C0892e c0892e4 = c0888a.f6064D0[i2];
                    if (zM5613d1 || c0892e4.m5684Q() != 8) {
                        C0905f c0905f3 = c0892e4.f5980g.f6166h;
                        c0905f3.f6118k.add(this.f6166h);
                        this.f6166h.f6119l.add(c0905f3);
                    }
                    i2++;
                }
                m5845q(this.f6160b.f5980g.f6166h);
                m5845q(this.f6160b.f5980g.f6167i);
                return;
            }
            if (iM5615e1 != 3) {
                return;
            }
            this.f6166h.f6112e = C0905f.a.BOTTOM;
            while (i2 < c0888a.f6065E0) {
                C0892e c0892e5 = c0888a.f6064D0[i2];
                if (zM5613d1 || c0892e5.m5684Q() != 8) {
                    C0905f c0905f4 = c0892e5.f5980g.f6167i;
                    c0905f4.f6118k.add(this.f6166h);
                    this.f6166h.f6119l.add(c0905f4);
                }
                i2++;
            }
            m5845q(this.f6160b.f5980g.f6166h);
            m5845q(this.f6160b.f5980g.f6167i);
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: e */
    public void mo5810e() {
        C0892e c0892e = this.f6160b;
        if (c0892e instanceof C0888a) {
            int iM5615e1 = ((C0888a) c0892e).m5615e1();
            if (iM5615e1 == 0 || iM5615e1 == 1) {
                this.f6160b.m5695V0(this.f6166h.f6114g);
            } else {
                this.f6160b.m5697W0(this.f6166h.f6114g);
            }
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: f */
    void mo5811f() {
        this.f6161c = null;
        this.f6166h.m5829c();
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: m */
    boolean mo5813m() {
        return false;
    }
}
