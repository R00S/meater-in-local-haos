package b1;

/* compiled from: GuidelineReference.java */
/* renamed from: b1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2205j extends p {
    C2205j(a1.e eVar) {
        super(eVar);
        eVar.f19820e.f();
        eVar.f19822f.f();
        this.f30078f = ((a1.h) eVar).t1();
    }

    private void q(C2201f c2201f) {
        this.f30080h.f30031k.add(c2201f);
        c2201f.f30032l.add(this.f30080h);
    }

    @Override // b1.p, b1.InterfaceC2199d
    public void a(InterfaceC2199d interfaceC2199d) {
        C2201f c2201f = this.f30080h;
        if (c2201f.f30023c && !c2201f.f30030j) {
            this.f30080h.d((int) ((c2201f.f30032l.get(0).f30027g * ((a1.h) this.f30074b).w1()) + 0.5f));
        }
    }

    @Override // b1.p
    void d() {
        a1.h hVar = (a1.h) this.f30074b;
        int iU1 = hVar.u1();
        int iV1 = hVar.v1();
        hVar.w1();
        if (hVar.t1() == 1) {
            if (iU1 != -1) {
                this.f30080h.f30032l.add(this.f30074b.f19813a0.f19820e.f30080h);
                this.f30074b.f19813a0.f19820e.f30080h.f30031k.add(this.f30080h);
                this.f30080h.f30026f = iU1;
            } else if (iV1 != -1) {
                this.f30080h.f30032l.add(this.f30074b.f19813a0.f19820e.f30081i);
                this.f30074b.f19813a0.f19820e.f30081i.f30031k.add(this.f30080h);
                this.f30080h.f30026f = -iV1;
            } else {
                C2201f c2201f = this.f30080h;
                c2201f.f30022b = true;
                c2201f.f30032l.add(this.f30074b.f19813a0.f19820e.f30081i);
                this.f30074b.f19813a0.f19820e.f30081i.f30031k.add(this.f30080h);
            }
            q(this.f30074b.f19820e.f30080h);
            q(this.f30074b.f19820e.f30081i);
            return;
        }
        if (iU1 != -1) {
            this.f30080h.f30032l.add(this.f30074b.f19813a0.f19822f.f30080h);
            this.f30074b.f19813a0.f19822f.f30080h.f30031k.add(this.f30080h);
            this.f30080h.f30026f = iU1;
        } else if (iV1 != -1) {
            this.f30080h.f30032l.add(this.f30074b.f19813a0.f19822f.f30081i);
            this.f30074b.f19813a0.f19822f.f30081i.f30031k.add(this.f30080h);
            this.f30080h.f30026f = -iV1;
        } else {
            C2201f c2201f2 = this.f30080h;
            c2201f2.f30022b = true;
            c2201f2.f30032l.add(this.f30074b.f19813a0.f19822f.f30081i);
            this.f30074b.f19813a0.f19822f.f30081i.f30031k.add(this.f30080h);
        }
        q(this.f30074b.f19822f.f30080h);
        q(this.f30074b.f19822f.f30081i);
    }

    @Override // b1.p
    public void e() {
        if (((a1.h) this.f30074b).t1() == 1) {
            this.f30074b.n1(this.f30080h.f30027g);
        } else {
            this.f30074b.o1(this.f30080h.f30027g);
        }
    }

    @Override // b1.p
    void f() {
        this.f30080h.c();
    }

    @Override // b1.p
    boolean m() {
        return false;
    }
}
