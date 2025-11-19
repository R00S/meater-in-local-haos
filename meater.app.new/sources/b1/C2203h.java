package b1;

import a1.C1883a;
import a1.d;
import a1.e;
import b1.C2197b;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Direct.java */
/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2203h {

    /* renamed from: a, reason: collision with root package name */
    private static C2197b.a f30043a = new C2197b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f30044b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f30045c = 0;

    private static boolean a(int i10, a1.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b bVarA = eVar.A();
        e.b bVarT = eVar.T();
        a1.f fVar = eVar.K() != null ? (a1.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = bVarA == bVar5 || eVar.n0() || bVarA == e.b.WRAP_CONTENT || (bVarA == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f19856w == 0 && eVar.f19819d0 == 0.0f && eVar.a0(0)) || (bVarA == bVar2 && eVar.f19856w == 1 && eVar.d0(0, eVar.W()));
        boolean z11 = bVarT == bVar5 || eVar.o0() || bVarT == e.b.WRAP_CONTENT || (bVarT == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f19858x == 0 && eVar.f19819d0 == 0.0f && eVar.a0(1)) || (bVarT == bVar && eVar.f19858x == 1 && eVar.d0(1, eVar.x()));
        if (eVar.f19819d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, a1.e eVar, C2197b.InterfaceC0421b interfaceC0421b, boolean z10) {
        a1.d dVar;
        a1.d dVar2;
        a1.d dVar3;
        a1.d dVar4;
        if (eVar.g0()) {
            return;
        }
        boolean z11 = true;
        f30044b++;
        if (!(eVar instanceof a1.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                a1.f.U1(i11, eVar, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
            }
        }
        a1.d dVarO = eVar.o(d.a.LEFT);
        a1.d dVarO2 = eVar.o(d.a.RIGHT);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<a1.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                a1.d next = it.next();
                a1.e eVar2 = next.f19759d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.m0() && zA) {
                    a1.f.U1(i12, eVar2, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
                }
                boolean z12 = ((next == eVar2.f19800O && (dVar4 = eVar2.f19802Q.f19761f) != null && dVar4.n()) || (next == eVar2.f19802Q && (dVar3 = eVar2.f19800O.f19761f) != null && dVar3.n())) ? z11 : false;
                e.b bVarA = eVar2.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarA != bVar || zA) {
                    if (!eVar2.m0()) {
                        a1.d dVar5 = eVar2.f19800O;
                        if (next == dVar5 && eVar2.f19802Q.f19761f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.G0(iF, eVar2.W() + iF);
                            b(i12, eVar2, interfaceC0421b, z10);
                        } else {
                            a1.d dVar6 = eVar2.f19802Q;
                            if (next == dVar6 && dVar5.f19761f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.G0(iF2 - eVar2.W(), iF2);
                                b(i12, eVar2, interfaceC0421b, z10);
                            } else if (z12 && !eVar2.i0()) {
                                d(i12, interfaceC0421b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.f19776A >= 0 && eVar2.f19862z >= 0 && ((eVar2.V() == 8 || (eVar2.f19856w == 0 && eVar2.v() == 0.0f)) && !eVar2.i0() && !eVar2.l0() && z12 && !eVar2.i0())) {
                    e(i12, eVar, interfaceC0421b, eVar2, z10);
                }
                z11 = true;
            }
        }
        if (eVar instanceof a1.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<a1.d> it2 = dVarO2.d().iterator();
            while (it2.hasNext()) {
                a1.d next2 = it2.next();
                a1.e eVar3 = next2.f19759d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.m0() && zA2) {
                    a1.f.U1(i13, eVar3, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
                }
                boolean z13 = (next2 == eVar3.f19800O && (dVar2 = eVar3.f19802Q.f19761f) != null && dVar2.n()) || (next2 == eVar3.f19802Q && (dVar = eVar3.f19800O.f19761f) != null && dVar.n());
                e.b bVarA2 = eVar3.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarA2 != bVar2 || zA2) {
                    if (!eVar3.m0()) {
                        a1.d dVar7 = eVar3.f19800O;
                        if (next2 == dVar7 && eVar3.f19802Q.f19761f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.G0(iF3, eVar3.W() + iF3);
                            b(i13, eVar3, interfaceC0421b, z10);
                        } else {
                            a1.d dVar8 = eVar3.f19802Q;
                            if (next2 == dVar8 && dVar7.f19761f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.G0(iF4 - eVar3.W(), iF4);
                                b(i13, eVar3, interfaceC0421b, z10);
                            } else if (z13 && !eVar3.i0()) {
                                d(i13, interfaceC0421b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.f19776A >= 0 && eVar3.f19862z >= 0 && (eVar3.V() == 8 || (eVar3.f19856w == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.l0() && z13 && !eVar3.i0()) {
                        e(i13, eVar, interfaceC0421b, eVar3, z10);
                    }
                }
            }
        }
        eVar.q0();
    }

    private static void c(int i10, C1883a c1883a, C2197b.InterfaceC0421b interfaceC0421b, int i11, boolean z10) {
        if (c1883a.u1()) {
            if (i11 == 0) {
                b(i10 + 1, c1883a, interfaceC0421b, z10);
            } else {
                i(i10 + 1, c1883a, interfaceC0421b);
            }
        }
    }

    private static void d(int i10, C2197b.InterfaceC0421b interfaceC0421b, a1.e eVar, boolean z10) {
        float fY = eVar.y();
        int iE = eVar.f19800O.f19761f.e();
        int iE2 = eVar.f19802Q.f19761f.e();
        int iF = eVar.f19800O.f() + iE;
        int iF2 = iE2 - eVar.f19802Q.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iW = eVar.W();
        int i11 = (iE2 - iE) - iW;
        if (iE > iE2) {
            i11 = (iE - iE2) - iW;
        }
        int i12 = ((int) (i11 > 0 ? (fY * i11) + 0.5f : fY * i11)) + iE;
        int i13 = i12 + iW;
        if (iE > iE2) {
            i13 = i12 - iW;
        }
        eVar.G0(i12, i13);
        b(i10 + 1, eVar, interfaceC0421b, z10);
    }

    private static void e(int i10, a1.e eVar, C2197b.InterfaceC0421b interfaceC0421b, a1.e eVar2, boolean z10) {
        float fY = eVar2.y();
        int iE = eVar2.f19800O.f19761f.e() + eVar2.f19800O.f();
        int iE2 = eVar2.f19802Q.f19761f.e() - eVar2.f19802Q.f();
        if (iE2 >= iE) {
            int iW = eVar2.W();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f19856w;
                if (i11 == 2) {
                    iW = (int) (eVar2.y() * 0.5f * (eVar instanceof a1.f ? eVar.W() : eVar.K().W()));
                } else if (i11 == 0) {
                    iW = iE2 - iE;
                }
                iW = Math.max(eVar2.f19862z, iW);
                int i12 = eVar2.f19776A;
                if (i12 > 0) {
                    iW = Math.min(i12, iW);
                }
            }
            int i13 = iE + ((int) ((fY * ((iE2 - iE) - iW)) + 0.5f));
            eVar2.G0(i13, iW + i13);
            b(i10 + 1, eVar2, interfaceC0421b, z10);
        }
    }

    private static void f(int i10, C2197b.InterfaceC0421b interfaceC0421b, a1.e eVar) {
        float fR = eVar.R();
        int iE = eVar.f19801P.f19761f.e();
        int iE2 = eVar.f19803R.f19761f.e();
        int iF = eVar.f19801P.f() + iE;
        int iF2 = iE2 - eVar.f19803R.f();
        if (iE == iE2) {
            fR = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = eVar.x();
        int i11 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i11 = (iE - iE2) - iX;
        }
        int i12 = (int) (i11 > 0 ? (fR * i11) + 0.5f : fR * i11);
        int i13 = iE + i12;
        int i14 = i13 + iX;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iX;
        }
        eVar.J0(i13, i14);
        i(i10 + 1, eVar, interfaceC0421b);
    }

    private static void g(int i10, a1.e eVar, C2197b.InterfaceC0421b interfaceC0421b, a1.e eVar2) {
        float fR = eVar2.R();
        int iE = eVar2.f19801P.f19761f.e() + eVar2.f19801P.f();
        int iE2 = eVar2.f19803R.f19761f.e() - eVar2.f19803R.f();
        if (iE2 >= iE) {
            int iX = eVar2.x();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f19858x;
                if (i11 == 2) {
                    iX = (int) (fR * 0.5f * (eVar instanceof a1.f ? eVar.x() : eVar.K().x()));
                } else if (i11 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(eVar2.f19780C, iX);
                int i12 = eVar2.f19782D;
                if (i12 > 0) {
                    iX = Math.min(i12, iX);
                }
            }
            int i13 = iE + ((int) ((fR * ((iE2 - iE) - iX)) + 0.5f));
            eVar2.J0(i13, iX + i13);
            i(i10 + 1, eVar2, interfaceC0421b);
        }
    }

    public static void h(a1.f fVar, C2197b.InterfaceC0421b interfaceC0421b) {
        e.b bVarA = fVar.A();
        e.b bVarT = fVar.T();
        f30044b = 0;
        f30045c = 0;
        fVar.v0();
        ArrayList<a1.e> arrayListS1 = fVar.s1();
        int size = arrayListS1.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayListS1.get(i10).v0();
        }
        boolean zR1 = fVar.R1();
        if (bVarA == e.b.FIXED) {
            fVar.G0(0, fVar.W());
        } else {
            fVar.H0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            a1.e eVar = arrayListS1.get(i11);
            if (eVar instanceof a1.h) {
                a1.h hVar = (a1.h) eVar;
                if (hVar.t1() == 1) {
                    if (hVar.u1() != -1) {
                        hVar.x1(hVar.u1());
                    } else if (hVar.v1() != -1 && fVar.n0()) {
                        hVar.x1(fVar.W() - hVar.v1());
                    } else if (fVar.n0()) {
                        hVar.x1((int) ((hVar.w1() * fVar.W()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof C1883a) && ((C1883a) eVar).y1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                a1.e eVar2 = arrayListS1.get(i12);
                if (eVar2 instanceof a1.h) {
                    a1.h hVar2 = (a1.h) eVar2;
                    if (hVar2.t1() == 1) {
                        b(0, hVar2, interfaceC0421b, zR1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0421b, zR1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                a1.e eVar3 = arrayListS1.get(i13);
                if (eVar3 instanceof C1883a) {
                    C1883a c1883a = (C1883a) eVar3;
                    if (c1883a.y1() == 0) {
                        c(0, c1883a, interfaceC0421b, 0, zR1);
                    }
                }
            }
        }
        if (bVarT == e.b.FIXED) {
            fVar.J0(0, fVar.x());
        } else {
            fVar.I0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            a1.e eVar4 = arrayListS1.get(i14);
            if (eVar4 instanceof a1.h) {
                a1.h hVar3 = (a1.h) eVar4;
                if (hVar3.t1() == 0) {
                    if (hVar3.u1() != -1) {
                        hVar3.x1(hVar3.u1());
                    } else if (hVar3.v1() != -1 && fVar.o0()) {
                        hVar3.x1(fVar.x() - hVar3.v1());
                    } else if (fVar.o0()) {
                        hVar3.x1((int) ((hVar3.w1() * fVar.x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof C1883a) && ((C1883a) eVar4).y1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                a1.e eVar5 = arrayListS1.get(i15);
                if (eVar5 instanceof a1.h) {
                    a1.h hVar4 = (a1.h) eVar5;
                    if (hVar4.t1() == 0) {
                        i(1, hVar4, interfaceC0421b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0421b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                a1.e eVar6 = arrayListS1.get(i16);
                if (eVar6 instanceof C1883a) {
                    C1883a c1883a2 = (C1883a) eVar6;
                    if (c1883a2.y1() == 1) {
                        c(0, c1883a2, interfaceC0421b, 1, zR1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            a1.e eVar7 = arrayListS1.get(i17);
            if (eVar7.m0() && a(0, eVar7)) {
                a1.f.U1(0, eVar7, interfaceC0421b, f30043a, C2197b.a.f29997k);
                if (!(eVar7 instanceof a1.h)) {
                    b(0, eVar7, interfaceC0421b, zR1);
                    i(0, eVar7, interfaceC0421b);
                } else if (((a1.h) eVar7).t1() == 0) {
                    i(0, eVar7, interfaceC0421b);
                } else {
                    b(0, eVar7, interfaceC0421b, zR1);
                }
            }
        }
    }

    private static void i(int i10, a1.e eVar, C2197b.InterfaceC0421b interfaceC0421b) {
        a1.d dVar;
        a1.d dVar2;
        a1.d dVar3;
        a1.d dVar4;
        if (eVar.p0()) {
            return;
        }
        f30045c++;
        if (!(eVar instanceof a1.f) && eVar.m0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                a1.f.U1(i11, eVar, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
            }
        }
        a1.d dVarO = eVar.o(d.a.TOP);
        a1.d dVarO2 = eVar.o(d.a.BOTTOM);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<a1.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                a1.d next = it.next();
                a1.e eVar2 = next.f19759d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.m0() && zA) {
                    a1.f.U1(i12, eVar2, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
                }
                boolean z10 = (next == eVar2.f19801P && (dVar4 = eVar2.f19803R.f19761f) != null && dVar4.n()) || (next == eVar2.f19803R && (dVar3 = eVar2.f19801P.f19761f) != null && dVar3.n());
                e.b bVarT = eVar2.T();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarT != bVar || zA) {
                    if (!eVar2.m0()) {
                        a1.d dVar5 = eVar2.f19801P;
                        if (next == dVar5 && eVar2.f19803R.f19761f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.J0(iF, eVar2.x() + iF);
                            i(i12, eVar2, interfaceC0421b);
                        } else {
                            a1.d dVar6 = eVar2.f19803R;
                            if (next == dVar6 && dVar5.f19761f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.J0(iF2 - eVar2.x(), iF2);
                                i(i12, eVar2, interfaceC0421b);
                            } else if (z10 && !eVar2.k0()) {
                                f(i12, interfaceC0421b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.T() == bVar && eVar2.f19782D >= 0 && eVar2.f19780C >= 0 && (eVar2.V() == 8 || (eVar2.f19858x == 0 && eVar2.v() == 0.0f))) {
                    if (!eVar2.k0() && !eVar2.l0() && z10 && !eVar2.k0()) {
                        g(i12, eVar, interfaceC0421b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof a1.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<a1.d> it2 = dVarO2.d().iterator();
            while (it2.hasNext()) {
                a1.d next2 = it2.next();
                a1.e eVar3 = next2.f19759d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.m0() && zA2) {
                    a1.f.U1(i13, eVar3, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
                }
                boolean z11 = (next2 == eVar3.f19801P && (dVar2 = eVar3.f19803R.f19761f) != null && dVar2.n()) || (next2 == eVar3.f19803R && (dVar = eVar3.f19801P.f19761f) != null && dVar.n());
                e.b bVarT2 = eVar3.T();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarT2 != bVar2 || zA2) {
                    if (!eVar3.m0()) {
                        a1.d dVar7 = eVar3.f19801P;
                        if (next2 == dVar7 && eVar3.f19803R.f19761f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.J0(iF3, eVar3.x() + iF3);
                            i(i13, eVar3, interfaceC0421b);
                        } else {
                            a1.d dVar8 = eVar3.f19803R;
                            if (next2 == dVar8 && dVar7.f19761f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.J0(iF4 - eVar3.x(), iF4);
                                i(i13, eVar3, interfaceC0421b);
                            } else if (z11 && !eVar3.k0()) {
                                f(i13, interfaceC0421b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.T() == bVar2 && eVar3.f19782D >= 0 && eVar3.f19780C >= 0 && (eVar3.V() == 8 || (eVar3.f19858x == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.l0() && z11 && !eVar3.k0()) {
                        g(i13, eVar, interfaceC0421b, eVar3);
                    }
                }
            }
        }
        a1.d dVarO3 = eVar.o(d.a.BASELINE);
        if (dVarO3.d() != null && dVarO3.n()) {
            int iE3 = dVarO3.e();
            Iterator<a1.d> it3 = dVarO3.d().iterator();
            while (it3.hasNext()) {
                a1.d next3 = it3.next();
                a1.e eVar4 = next3.f19759d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.m0() && zA3) {
                    a1.f.U1(i14, eVar4, interfaceC0421b, new C2197b.a(), C2197b.a.f29997k);
                }
                if (eVar4.T() != e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.m0() && next3 == eVar4.f19804S) {
                        eVar4.F0(next3.f() + iE3);
                        i(i14, eVar4, interfaceC0421b);
                    }
                }
            }
        }
        eVar.r0();
    }
}
