package a1;

import a1.d;
import a1.e;

/* compiled from: Barrier.java */
/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1883a extends j {

    /* renamed from: N0, reason: collision with root package name */
    private int f19730N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f19731O0 = true;

    /* renamed from: P0, reason: collision with root package name */
    private int f19732P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    boolean f19733Q0 = false;

    public void A1(boolean z10) {
        this.f19731O0 = z10;
    }

    public void B1(int i10) {
        this.f19730N0 = i10;
    }

    public void C1(int i10) {
        this.f19732P0 = i10;
    }

    @Override // a1.e
    public void g(X0.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f19808W;
        dVarArr2[0] = this.f19800O;
        dVarArr2[2] = this.f19801P;
        dVarArr2[1] = this.f19802Q;
        dVarArr2[3] = this.f19803R;
        int i13 = 0;
        while (true) {
            dVarArr = this.f19808W;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f19764i = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f19730N0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        if (!this.f19733Q0) {
            u1();
        }
        if (this.f19733Q0) {
            this.f19733Q0 = false;
            int i15 = this.f19730N0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.f19800O.f19764i, this.f19823f0);
                dVar.f(this.f19802Q.f19764i, this.f19823f0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    dVar.f(this.f19801P.f19764i, this.f19825g0);
                    dVar.f(this.f19803R.f19764i, this.f19825g0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f19953M0; i16++) {
            e eVar = this.f19952L0[i16];
            if ((this.f19731O0 || eVar.h()) && ((((i11 = this.f19730N0) == 0 || i11 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f19800O.f19761f != null && eVar.f19802Q.f19761f != null) || (((i12 = this.f19730N0) == 2 || i12 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f19801P.f19761f != null && eVar.f19803R.f19761f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f19800O.l() || this.f19802Q.l();
        boolean z13 = this.f19801P.l() || this.f19803R.l();
        int i17 = !(!z11 && (((i10 = this.f19730N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f19953M0; i18++) {
            e eVar2 = this.f19952L0[i18];
            if (this.f19731O0 || eVar2.h()) {
                X0.i iVarQ = dVar.q(eVar2.f19808W[this.f19730N0]);
                d[] dVarArr3 = eVar2.f19808W;
                int i19 = this.f19730N0;
                d dVar4 = dVarArr3[i19];
                dVar4.f19764i = iVarQ;
                d dVar5 = dVar4.f19761f;
                int i20 = (dVar5 == null || dVar5.f19759d != this) ? 0 : dVar4.f19762g;
                if (i19 == 0 || i19 == 2) {
                    dVar.i(dVar3.f19764i, iVarQ, this.f19732P0 - i20, z11);
                } else {
                    dVar.g(dVar3.f19764i, iVarQ, this.f19732P0 + i20, z11);
                }
                dVar.e(dVar3.f19764i, iVarQ, this.f19732P0 + i20, i17);
            }
        }
        int i21 = this.f19730N0;
        if (i21 == 0) {
            dVar.e(this.f19802Q.f19764i, this.f19800O.f19764i, 0, 8);
            dVar.e(this.f19800O.f19764i, this.f19813a0.f19802Q.f19764i, 0, 4);
            dVar.e(this.f19800O.f19764i, this.f19813a0.f19800O.f19764i, 0, 0);
            return;
        }
        if (i21 == 1) {
            dVar.e(this.f19800O.f19764i, this.f19802Q.f19764i, 0, 8);
            dVar.e(this.f19800O.f19764i, this.f19813a0.f19800O.f19764i, 0, 4);
            dVar.e(this.f19800O.f19764i, this.f19813a0.f19802Q.f19764i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.f19803R.f19764i, this.f19801P.f19764i, 0, 8);
            dVar.e(this.f19801P.f19764i, this.f19813a0.f19803R.f19764i, 0, 4);
            dVar.e(this.f19801P.f19764i, this.f19813a0.f19801P.f19764i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.f19801P.f19764i, this.f19803R.f19764i, 0, 8);
            dVar.e(this.f19801P.f19764i, this.f19813a0.f19801P.f19764i, 0, 4);
            dVar.e(this.f19801P.f19764i, this.f19813a0.f19803R.f19764i, 0, 0);
        }
    }

    @Override // a1.e
    public boolean h() {
        return true;
    }

    @Override // a1.e
    public boolean n0() {
        return this.f19733Q0;
    }

    @Override // a1.e
    public boolean o0() {
        return this.f19733Q0;
    }

    @Override // a1.e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i10 = 0; i10 < this.f19953M0; i10++) {
            e eVar = this.f19952L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean u1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f19953M0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f19952L0[i13];
            if ((this.f19731O0 || eVar.h()) && ((((i11 = this.f19730N0) == 0 || i11 == 1) && !eVar.n0()) || (((i12 = this.f19730N0) == 2 || i12 == 3) && !eVar.o0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f19953M0; i14++) {
            e eVar2 = this.f19952L0[i14];
            if (this.f19731O0 || eVar2.h()) {
                if (!z11) {
                    int i15 = this.f19730N0;
                    if (i15 == 0) {
                        iMax = eVar2.o(d.a.LEFT).e();
                    } else if (i15 == 1) {
                        iMax = eVar2.o(d.a.RIGHT).e();
                    } else if (i15 == 2) {
                        iMax = eVar2.o(d.a.TOP).e();
                    } else if (i15 == 3) {
                        iMax = eVar2.o(d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i16 = this.f19730N0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, eVar2.o(d.a.LEFT).e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, eVar2.o(d.a.RIGHT).e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, eVar2.o(d.a.TOP).e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, eVar2.o(d.a.BOTTOM).e());
                }
            }
        }
        int i17 = iMax + this.f19732P0;
        int i18 = this.f19730N0;
        if (i18 == 0 || i18 == 1) {
            G0(i17, i17);
        } else {
            J0(i17, i17);
        }
        this.f19733Q0 = true;
        return true;
    }

    public boolean v1() {
        return this.f19731O0;
    }

    public int w1() {
        return this.f19730N0;
    }

    public int x1() {
        return this.f19732P0;
    }

    public int y1() {
        int i10 = this.f19730N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    protected void z1() {
        for (int i10 = 0; i10 < this.f19953M0; i10++) {
            e eVar = this.f19952L0[i10];
            if (this.f19731O0 || eVar.h()) {
                int i11 = this.f19730N0;
                if (i11 == 0 || i11 == 1) {
                    eVar.T0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.T0(1, true);
                }
            }
        }
    }
}
