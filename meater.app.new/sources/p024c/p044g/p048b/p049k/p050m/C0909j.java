package p024c.p044g.p048b.p049k.p050m;

import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0894g;

/* compiled from: GuidelineReference.java */
/* renamed from: c.g.b.k.m.j */
/* loaded from: classes.dex */
class C0909j extends AbstractC0915p {
    public C0909j(C0892e c0892e) {
        super(c0892e);
        c0892e.f5978f.mo5811f();
        c0892e.f5980g.mo5811f();
        this.f6164f = ((C0894g) c0892e).m5778b1();
    }

    /* renamed from: q */
    private void m5844q(C0905f c0905f) {
        this.f6166h.f6118k.add(c0905f);
        c0905f.f6119l.add(this.f6166h);
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p, p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    public void mo5808a(InterfaceC0903d interfaceC0903d) {
        C0905f c0905f = this.f6166h;
        if (c0905f.f6110c && !c0905f.f6117j) {
            this.f6166h.mo5830d((int) ((c0905f.f6119l.get(0).f6114g * ((C0894g) this.f6160b).m5781e1()) + 0.5f));
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: d */
    void mo5809d() {
        C0894g c0894g = (C0894g) this.f6160b;
        int iM5779c1 = c0894g.m5779c1();
        int iM5780d1 = c0894g.m5780d1();
        c0894g.m5781e1();
        if (c0894g.m5778b1() == 1) {
            if (iM5779c1 != -1) {
                this.f6166h.f6119l.add(this.f6160b.f5963U.f5978f.f6166h);
                this.f6160b.f5963U.f5978f.f6166h.f6118k.add(this.f6166h);
                this.f6166h.f6113f = iM5779c1;
            } else if (iM5780d1 != -1) {
                this.f6166h.f6119l.add(this.f6160b.f5963U.f5978f.f6167i);
                this.f6160b.f5963U.f5978f.f6167i.f6118k.add(this.f6166h);
                this.f6166h.f6113f = -iM5780d1;
            } else {
                C0905f c0905f = this.f6166h;
                c0905f.f6109b = true;
                c0905f.f6119l.add(this.f6160b.f5963U.f5978f.f6167i);
                this.f6160b.f5963U.f5978f.f6167i.f6118k.add(this.f6166h);
            }
            m5844q(this.f6160b.f5978f.f6166h);
            m5844q(this.f6160b.f5978f.f6167i);
            return;
        }
        if (iM5779c1 != -1) {
            this.f6166h.f6119l.add(this.f6160b.f5963U.f5980g.f6166h);
            this.f6160b.f5963U.f5980g.f6166h.f6118k.add(this.f6166h);
            this.f6166h.f6113f = iM5779c1;
        } else if (iM5780d1 != -1) {
            this.f6166h.f6119l.add(this.f6160b.f5963U.f5980g.f6167i);
            this.f6160b.f5963U.f5980g.f6167i.f6118k.add(this.f6166h);
            this.f6166h.f6113f = -iM5780d1;
        } else {
            C0905f c0905f2 = this.f6166h;
            c0905f2.f6109b = true;
            c0905f2.f6119l.add(this.f6160b.f5963U.f5980g.f6167i);
            this.f6160b.f5963U.f5980g.f6167i.f6118k.add(this.f6166h);
        }
        m5844q(this.f6160b.f5980g.f6166h);
        m5844q(this.f6160b.f5980g.f6167i);
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: e */
    public void mo5810e() {
        if (((C0894g) this.f6160b).m5778b1() == 1) {
            this.f6160b.m5695V0(this.f6166h.f6114g);
        } else {
            this.f6160b.m5697W0(this.f6166h.f6114g);
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: f */
    void mo5811f() {
        this.f6166h.m5829c();
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: m */
    boolean mo5813m() {
        return false;
    }
}
