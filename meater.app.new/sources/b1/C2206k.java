package b1;

import a1.C1883a;
import b1.C2201f;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2206k extends p {
    C2206k(a1.e eVar) {
        super(eVar);
    }

    private void q(C2201f c2201f) {
        this.f30080h.f30031k.add(c2201f);
        c2201f.f30032l.add(this.f30080h);
    }

    @Override // b1.p, b1.InterfaceC2199d
    public void a(InterfaceC2199d interfaceC2199d) {
        C1883a c1883a = (C1883a) this.f30074b;
        int iW1 = c1883a.w1();
        Iterator<C2201f> it = this.f30080h.f30032l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f30027g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iW1 == 0 || iW1 == 2) {
            this.f30080h.d(i11 + c1883a.x1());
        } else {
            this.f30080h.d(i10 + c1883a.x1());
        }
    }

    @Override // b1.p
    void d() {
        a1.e eVar = this.f30074b;
        if (eVar instanceof C1883a) {
            this.f30080h.f30022b = true;
            C1883a c1883a = (C1883a) eVar;
            int iW1 = c1883a.w1();
            boolean zV1 = c1883a.v1();
            int i10 = 0;
            if (iW1 == 0) {
                this.f30080h.f30025e = C2201f.a.LEFT;
                while (i10 < c1883a.f19953M0) {
                    a1.e eVar2 = c1883a.f19952L0[i10];
                    if (zV1 || eVar2.V() != 8) {
                        C2201f c2201f = eVar2.f19820e.f30080h;
                        c2201f.f30031k.add(this.f30080h);
                        this.f30080h.f30032l.add(c2201f);
                    }
                    i10++;
                }
                q(this.f30074b.f19820e.f30080h);
                q(this.f30074b.f19820e.f30081i);
                return;
            }
            if (iW1 == 1) {
                this.f30080h.f30025e = C2201f.a.RIGHT;
                while (i10 < c1883a.f19953M0) {
                    a1.e eVar3 = c1883a.f19952L0[i10];
                    if (zV1 || eVar3.V() != 8) {
                        C2201f c2201f2 = eVar3.f19820e.f30081i;
                        c2201f2.f30031k.add(this.f30080h);
                        this.f30080h.f30032l.add(c2201f2);
                    }
                    i10++;
                }
                q(this.f30074b.f19820e.f30080h);
                q(this.f30074b.f19820e.f30081i);
                return;
            }
            if (iW1 == 2) {
                this.f30080h.f30025e = C2201f.a.TOP;
                while (i10 < c1883a.f19953M0) {
                    a1.e eVar4 = c1883a.f19952L0[i10];
                    if (zV1 || eVar4.V() != 8) {
                        C2201f c2201f3 = eVar4.f19822f.f30080h;
                        c2201f3.f30031k.add(this.f30080h);
                        this.f30080h.f30032l.add(c2201f3);
                    }
                    i10++;
                }
                q(this.f30074b.f19822f.f30080h);
                q(this.f30074b.f19822f.f30081i);
                return;
            }
            if (iW1 != 3) {
                return;
            }
            this.f30080h.f30025e = C2201f.a.BOTTOM;
            while (i10 < c1883a.f19953M0) {
                a1.e eVar5 = c1883a.f19952L0[i10];
                if (zV1 || eVar5.V() != 8) {
                    C2201f c2201f4 = eVar5.f19822f.f30081i;
                    c2201f4.f30031k.add(this.f30080h);
                    this.f30080h.f30032l.add(c2201f4);
                }
                i10++;
            }
            q(this.f30074b.f19822f.f30080h);
            q(this.f30074b.f19822f.f30081i);
        }
    }

    @Override // b1.p
    public void e() {
        a1.e eVar = this.f30074b;
        if (eVar instanceof C1883a) {
            int iW1 = ((C1883a) eVar).w1();
            if (iW1 == 0 || iW1 == 1) {
                this.f30074b.n1(this.f30080h.f30027g);
            } else {
                this.f30074b.o1(this.f30080h.f30027g);
            }
        }
    }

    @Override // b1.p
    void f() {
        this.f30075c = null;
        this.f30080h.c();
    }

    @Override // b1.p
    boolean m() {
        return false;
    }
}
