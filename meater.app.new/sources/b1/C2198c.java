package b1;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2198c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f30010k;

    /* renamed from: l, reason: collision with root package name */
    private int f30011l;

    public C2198c(a1.e eVar, int i10) {
        super(eVar);
        this.f30010k = new ArrayList<>();
        this.f30078f = i10;
        q();
    }

    private void q() {
        a1.e eVar;
        a1.e eVar2 = this.f30074b;
        a1.e eVarL = eVar2.L(this.f30078f);
        while (true) {
            a1.e eVar3 = eVarL;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarL = eVar2.L(this.f30078f);
            }
        }
        this.f30074b = eVar;
        this.f30010k.add(eVar.N(this.f30078f));
        a1.e eVarJ = eVar.J(this.f30078f);
        while (eVarJ != null) {
            this.f30010k.add(eVarJ.N(this.f30078f));
            eVarJ = eVarJ.J(this.f30078f);
        }
        Iterator<p> it = this.f30010k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f30078f;
            if (i10 == 0) {
                next.f30074b.f19816c = this;
            } else if (i10 == 1) {
                next.f30074b.f19818d = this;
            }
        }
        if (this.f30078f == 0 && ((a1.f) this.f30074b.K()).R1() && this.f30010k.size() > 1) {
            ArrayList<p> arrayList = this.f30010k;
            this.f30074b = arrayList.get(arrayList.size() - 1).f30074b;
        }
        this.f30011l = this.f30078f == 0 ? this.f30074b.z() : this.f30074b.S();
    }

    private a1.e r() {
        for (int i10 = 0; i10 < this.f30010k.size(); i10++) {
            p pVar = this.f30010k.get(i10);
            if (pVar.f30074b.V() != 8) {
                return pVar.f30074b;
            }
        }
        return null;
    }

    private a1.e s() {
        for (int size = this.f30010k.size() - 1; size >= 0; size--) {
            p pVar = this.f30010k.get(size);
            if (pVar.f30074b.V() != 8) {
                return pVar.f30074b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    @Override // b1.p, b1.InterfaceC2199d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(b1.InterfaceC2199d r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C2198c.a(b1.d):void");
    }

    @Override // b1.p
    void d() {
        Iterator<p> it = this.f30010k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f30010k.size();
        if (size < 1) {
            return;
        }
        a1.e eVar = this.f30010k.get(0).f30074b;
        a1.e eVar2 = this.f30010k.get(size - 1).f30074b;
        if (this.f30078f == 0) {
            a1.d dVar = eVar.f19800O;
            a1.d dVar2 = eVar2.f19802Q;
            C2201f c2201fI = i(dVar, 0);
            int iF = dVar.f();
            a1.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.f19800O.f();
            }
            if (c2201fI != null) {
                b(this.f30080h, c2201fI, iF);
            }
            C2201f c2201fI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            a1.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.f19802Q.f();
            }
            if (c2201fI2 != null) {
                b(this.f30081i, c2201fI2, -iF2);
            }
        } else {
            a1.d dVar3 = eVar.f19801P;
            a1.d dVar4 = eVar2.f19803R;
            C2201f c2201fI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            a1.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.f19801P.f();
            }
            if (c2201fI3 != null) {
                b(this.f30080h, c2201fI3, iF3);
            }
            C2201f c2201fI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            a1.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.f19803R.f();
            }
            if (c2201fI4 != null) {
                b(this.f30081i, c2201fI4, -iF4);
            }
        }
        this.f30080h.f30021a = this;
        this.f30081i.f30021a = this;
    }

    @Override // b1.p
    public void e() {
        for (int i10 = 0; i10 < this.f30010k.size(); i10++) {
            this.f30010k.get(i10).e();
        }
    }

    @Override // b1.p
    void f() {
        this.f30075c = null;
        Iterator<p> it = this.f30010k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // b1.p
    public long j() {
        int size = this.f30010k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f30080h.f30026f + this.f30010k.get(i10).j() + r4.f30081i.f30026f;
        }
        return j10;
    }

    @Override // b1.p
    boolean m() {
        int size = this.f30010k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f30010k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f30078f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f30010k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
