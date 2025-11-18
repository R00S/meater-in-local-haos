package a1;

import a1.e;
import java.util.ArrayList;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: x1, reason: collision with root package name */
    private e[] f19923x1;

    /* renamed from: a1, reason: collision with root package name */
    private int f19900a1 = -1;

    /* renamed from: b1, reason: collision with root package name */
    private int f19901b1 = -1;

    /* renamed from: c1, reason: collision with root package name */
    private int f19902c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private int f19903d1 = -1;

    /* renamed from: e1, reason: collision with root package name */
    private int f19904e1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    private int f19905f1 = -1;

    /* renamed from: g1, reason: collision with root package name */
    private float f19906g1 = 0.5f;

    /* renamed from: h1, reason: collision with root package name */
    private float f19907h1 = 0.5f;

    /* renamed from: i1, reason: collision with root package name */
    private float f19908i1 = 0.5f;

    /* renamed from: j1, reason: collision with root package name */
    private float f19909j1 = 0.5f;

    /* renamed from: k1, reason: collision with root package name */
    private float f19910k1 = 0.5f;

    /* renamed from: l1, reason: collision with root package name */
    private float f19911l1 = 0.5f;

    /* renamed from: m1, reason: collision with root package name */
    private int f19912m1 = 0;

    /* renamed from: n1, reason: collision with root package name */
    private int f19913n1 = 0;

    /* renamed from: o1, reason: collision with root package name */
    private int f19914o1 = 2;

    /* renamed from: p1, reason: collision with root package name */
    private int f19915p1 = 2;

    /* renamed from: q1, reason: collision with root package name */
    private int f19916q1 = 0;

    /* renamed from: r1, reason: collision with root package name */
    private int f19917r1 = -1;

    /* renamed from: s1, reason: collision with root package name */
    private int f19918s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    private ArrayList<a> f19919t1 = new ArrayList<>();

    /* renamed from: u1, reason: collision with root package name */
    private e[] f19920u1 = null;

    /* renamed from: v1, reason: collision with root package name */
    private e[] f19921v1 = null;

    /* renamed from: w1, reason: collision with root package name */
    private int[] f19922w1 = null;

    /* renamed from: y1, reason: collision with root package name */
    private int f19924y1 = 0;

    /* compiled from: Flow.java */
    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f19925a;

        /* renamed from: d, reason: collision with root package name */
        private d f19928d;

        /* renamed from: e, reason: collision with root package name */
        private d f19929e;

        /* renamed from: f, reason: collision with root package name */
        private d f19930f;

        /* renamed from: g, reason: collision with root package name */
        private d f19931g;

        /* renamed from: h, reason: collision with root package name */
        private int f19932h;

        /* renamed from: i, reason: collision with root package name */
        private int f19933i;

        /* renamed from: j, reason: collision with root package name */
        private int f19934j;

        /* renamed from: k, reason: collision with root package name */
        private int f19935k;

        /* renamed from: q, reason: collision with root package name */
        private int f19941q;

        /* renamed from: b, reason: collision with root package name */
        private e f19926b = null;

        /* renamed from: c, reason: collision with root package name */
        int f19927c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f19936l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f19937m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f19938n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f19939o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f19940p = 0;

        a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f19932h = 0;
            this.f19933i = 0;
            this.f19934j = 0;
            this.f19935k = 0;
            this.f19941q = 0;
            this.f19925a = i10;
            this.f19928d = dVar;
            this.f19929e = dVar2;
            this.f19930f = dVar3;
            this.f19931g = dVar4;
            this.f19932h = g.this.A1();
            this.f19933i = g.this.C1();
            this.f19934j = g.this.B1();
            this.f19935k = g.this.z1();
            this.f19941q = i11;
        }

        private void h() {
            this.f19936l = 0;
            this.f19937m = 0;
            this.f19926b = null;
            this.f19927c = 0;
            int i10 = this.f19939o;
            for (int i11 = 0; i11 < i10 && this.f19938n + i11 < g.this.f19924y1; i11++) {
                e eVar = g.this.f19923x1[this.f19938n + i11];
                if (this.f19925a == 0) {
                    int iW = eVar.W();
                    int i12 = g.this.f19912m1;
                    if (eVar.V() == 8) {
                        i12 = 0;
                    }
                    this.f19936l += iW + i12;
                    int iL2 = g.this.l2(eVar, this.f19941q);
                    if (this.f19926b == null || this.f19927c < iL2) {
                        this.f19926b = eVar;
                        this.f19927c = iL2;
                        this.f19937m = iL2;
                    }
                } else {
                    int iM2 = g.this.m2(eVar, this.f19941q);
                    int iL22 = g.this.l2(eVar, this.f19941q);
                    int i13 = g.this.f19913n1;
                    if (eVar.V() == 8) {
                        i13 = 0;
                    }
                    this.f19937m += iL22 + i13;
                    if (this.f19926b == null || this.f19927c < iM2) {
                        this.f19926b = eVar;
                        this.f19927c = iM2;
                        this.f19936l = iM2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f19925a == 0) {
                int iM2 = g.this.m2(eVar, this.f19941q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f19940p++;
                    iM2 = 0;
                }
                this.f19936l += iM2 + (eVar.V() != 8 ? g.this.f19912m1 : 0);
                int iL2 = g.this.l2(eVar, this.f19941q);
                if (this.f19926b == null || this.f19927c < iL2) {
                    this.f19926b = eVar;
                    this.f19927c = iL2;
                    this.f19937m = iL2;
                }
            } else {
                int iM22 = g.this.m2(eVar, this.f19941q);
                int iL22 = g.this.l2(eVar, this.f19941q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f19940p++;
                    iL22 = 0;
                }
                this.f19937m += iL22 + (eVar.V() != 8 ? g.this.f19913n1 : 0);
                if (this.f19926b == null || this.f19927c < iM22) {
                    this.f19926b = eVar;
                    this.f19927c = iM22;
                    this.f19936l = iM22;
                }
            }
            this.f19939o++;
        }

        public void c() {
            this.f19927c = 0;
            this.f19926b = null;
            this.f19936l = 0;
            this.f19937m = 0;
            this.f19938n = 0;
            this.f19939o = 0;
            this.f19940p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            char c10;
            float f10;
            float f11;
            int i11 = this.f19939o;
            for (int i12 = 0; i12 < i11 && this.f19938n + i12 < g.this.f19924y1; i12++) {
                e eVar2 = g.this.f19923x1[this.f19938n + i12];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i11 == 0 || this.f19926b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z10 ? (i11 - 1) - i15 : i15;
                if (this.f19938n + i16 >= g.this.f19924y1) {
                    break;
                }
                e eVar3 = g.this.f19923x1[this.f19938n + i16];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            e eVar4 = null;
            if (this.f19925a != 0) {
                e eVar5 = this.f19926b;
                eVar5.O0(g.this.f19900a1);
                int i17 = this.f19932h;
                if (i10 > 0) {
                    i17 += g.this.f19912m1;
                }
                if (z10) {
                    eVar5.f19802Q.a(this.f19930f, i17);
                    if (z11) {
                        eVar5.f19800O.a(this.f19928d, this.f19934j);
                    }
                    if (i10 > 0) {
                        this.f19930f.f19759d.f19800O.a(eVar5.f19802Q, 0);
                    }
                } else {
                    eVar5.f19800O.a(this.f19928d, i17);
                    if (z11) {
                        eVar5.f19802Q.a(this.f19930f, this.f19934j);
                    }
                    if (i10 > 0) {
                        this.f19928d.f19759d.f19802Q.a(eVar5.f19800O, 0);
                    }
                }
                for (int i18 = 0; i18 < i11 && this.f19938n + i18 < g.this.f19924y1; i18++) {
                    e eVar6 = g.this.f19923x1[this.f19938n + i18];
                    if (eVar6 != null) {
                        if (i18 == 0) {
                            eVar6.k(eVar6.f19801P, this.f19929e, this.f19933i);
                            int i19 = g.this.f19901b1;
                            float f12 = g.this.f19907h1;
                            if (this.f19938n == 0 && g.this.f19903d1 != -1) {
                                i19 = g.this.f19903d1;
                                f12 = g.this.f19909j1;
                            } else if (z11 && g.this.f19905f1 != -1) {
                                i19 = g.this.f19905f1;
                                f12 = g.this.f19911l1;
                            }
                            eVar6.f1(i19);
                            eVar6.e1(f12);
                        }
                        if (i18 == i11 - 1) {
                            eVar6.k(eVar6.f19803R, this.f19931g, this.f19935k);
                        }
                        if (eVar4 != null) {
                            eVar6.f19801P.a(eVar4.f19803R, g.this.f19913n1);
                            if (i18 == i13) {
                                eVar6.f19801P.u(this.f19933i);
                            }
                            eVar4.f19803R.a(eVar6.f19801P, 0);
                            if (i18 == i14 + 1) {
                                eVar4.f19803R.u(this.f19935k);
                            }
                        }
                        if (eVar6 == eVar5) {
                            eVar4 = eVar6;
                        } else if (z10) {
                            int i20 = g.this.f19914o1;
                            if (i20 == 0) {
                                eVar6.f19802Q.a(eVar5.f19802Q, 0);
                            } else if (i20 == 1) {
                                eVar6.f19800O.a(eVar5.f19800O, 0);
                            } else if (i20 == 2) {
                                eVar6.f19800O.a(eVar5.f19800O, 0);
                                eVar6.f19802Q.a(eVar5.f19802Q, 0);
                            }
                            eVar4 = eVar6;
                        } else {
                            int i21 = g.this.f19914o1;
                            if (i21 == 0) {
                                eVar6.f19800O.a(eVar5.f19800O, 0);
                            } else if (i21 == 1) {
                                eVar6.f19802Q.a(eVar5.f19802Q, 0);
                            } else if (i21 == 2) {
                                if (z12) {
                                    eVar6.f19800O.a(this.f19928d, this.f19932h);
                                    eVar6.f19802Q.a(this.f19930f, this.f19934j);
                                } else {
                                    eVar6.f19800O.a(eVar5.f19800O, 0);
                                    eVar6.f19802Q.a(eVar5.f19802Q, 0);
                                }
                            }
                            eVar4 = eVar6;
                        }
                    }
                }
                return;
            }
            e eVar7 = this.f19926b;
            eVar7.f1(g.this.f19901b1);
            int i22 = this.f19933i;
            if (i10 > 0) {
                i22 += g.this.f19913n1;
            }
            eVar7.f19801P.a(this.f19929e, i22);
            if (z11) {
                eVar7.f19803R.a(this.f19931g, this.f19935k);
            }
            if (i10 > 0) {
                this.f19929e.f19759d.f19803R.a(eVar7.f19801P, 0);
            }
            char c11 = 3;
            if (g.this.f19915p1 != 3 || eVar7.Z()) {
                eVar = eVar7;
            } else {
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = z10 ? (i11 - 1) - i23 : i23;
                    if (this.f19938n + i24 >= g.this.f19924y1) {
                        break;
                    }
                    eVar = g.this.f19923x1[this.f19938n + i24];
                    if (eVar.Z()) {
                        break;
                    }
                }
                eVar = eVar7;
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = z10 ? (i11 - 1) - i25 : i25;
                if (this.f19938n + i26 >= g.this.f19924y1) {
                    return;
                }
                e eVar8 = g.this.f19923x1[this.f19938n + i26];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i25 == 0) {
                        eVar8.k(eVar8.f19800O, this.f19928d, this.f19932h);
                    }
                    if (i26 == 0) {
                        int i27 = g.this.f19900a1;
                        float f13 = g.this.f19906g1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f19938n != 0 || g.this.f19902c1 == -1) {
                            if (z11 && g.this.f19904e1 != -1) {
                                i27 = g.this.f19904e1;
                                if (z10) {
                                    f11 = g.this.f19910k1;
                                    f10 = 1.0f - f11;
                                    f13 = f10;
                                } else {
                                    f10 = g.this.f19910k1;
                                    f13 = f10;
                                }
                            }
                            eVar8.O0(i27);
                            eVar8.N0(f13);
                        } else {
                            i27 = g.this.f19902c1;
                            if (z10) {
                                f11 = g.this.f19908i1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                                eVar8.O0(i27);
                                eVar8.N0(f13);
                            } else {
                                f10 = g.this.f19908i1;
                                f13 = f10;
                                eVar8.O0(i27);
                                eVar8.N0(f13);
                            }
                        }
                    }
                    if (i25 == i11 - 1) {
                        eVar8.k(eVar8.f19802Q, this.f19930f, this.f19934j);
                    }
                    if (eVar4 != null) {
                        eVar8.f19800O.a(eVar4.f19802Q, g.this.f19912m1);
                        if (i25 == i13) {
                            eVar8.f19800O.u(this.f19932h);
                        }
                        eVar4.f19802Q.a(eVar8.f19800O, 0);
                        if (i25 == i14 + 1) {
                            eVar4.f19802Q.u(this.f19934j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f19915p1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.f19804S.a(eVar.f19804S, 0);
                        } else {
                            int i28 = g.this.f19915p1;
                            if (i28 == 0) {
                                eVar8.f19801P.a(eVar7.f19801P, 0);
                            } else if (i28 == 1) {
                                eVar8.f19803R.a(eVar7.f19803R, 0);
                            } else if (z12) {
                                eVar8.f19801P.a(this.f19929e, this.f19933i);
                                eVar8.f19803R.a(this.f19931g, this.f19935k);
                            } else {
                                eVar8.f19801P.a(eVar7.f19801P, 0);
                                eVar8.f19803R.a(eVar7.f19803R, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i25++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f19925a == 1 ? this.f19937m - g.this.f19913n1 : this.f19937m;
        }

        public int f() {
            return this.f19925a == 0 ? this.f19936l - g.this.f19912m1 : this.f19936l;
        }

        public void g(int i10) {
            int i11 = this.f19940p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f19939o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f19938n + i14 < g.this.f19924y1; i14++) {
                e eVar = g.this.f19923x1[this.f19938n + i14];
                if (this.f19925a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f19856w == 0) {
                        g.this.E1(eVar, e.b.FIXED, i13, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f19858x == 0) {
                    g.this.E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i13);
                }
            }
            h();
        }

        public void i(int i10) {
            this.f19938n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f19925a = i10;
            this.f19928d = dVar;
            this.f19929e = dVar2;
            this.f19930f = dVar3;
            this.f19931g = dVar4;
            this.f19932h = i11;
            this.f19933i = i12;
            this.f19934j = i13;
            this.f19935k = i14;
            this.f19941q = i15;
        }
    }

    private void k2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f19922w1 == null || this.f19921v1 == null || this.f19920u1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f19924y1; i11++) {
            this.f19923x1[i11].u0();
        }
        int[] iArr = this.f19922w1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f19906g1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f19906g1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.f19921v1[i10];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i14 == 0) {
                    eVar3.k(eVar3.f19800O, this.f19800O, A1());
                    eVar3.O0(this.f19900a1);
                    eVar3.N0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.k(eVar3.f19802Q, this.f19802Q, B1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.f19800O, eVar2.f19802Q, this.f19912m1);
                    eVar2.k(eVar2.f19802Q, eVar3.f19800O, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.f19920u1[i15];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i15 == 0) {
                    eVar4.k(eVar4.f19801P, this.f19801P, C1());
                    eVar4.f1(this.f19901b1);
                    eVar4.e1(this.f19907h1);
                }
                if (i15 == i13 - 1) {
                    eVar4.k(eVar4.f19803R, this.f19803R, z1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.f19801P, eVar2.f19803R, this.f19913n1);
                    eVar2.k(eVar2.f19803R, eVar4.f19801P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f19918s1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.f19923x1;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.V() != 8) {
                    e eVar5 = this.f19921v1[i16];
                    e eVar6 = this.f19920u1[i17];
                    if (eVar != eVar5) {
                        eVar.k(eVar.f19800O, eVar5.f19800O, 0);
                        eVar.k(eVar.f19802Q, eVar5.f19802Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.f19801P, eVar6.f19801P, 0);
                        eVar.k(eVar.f19803R, eVar6.f19803R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f19858x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f19784E * i10);
                if (i12 != eVar.x()) {
                    eVar.Z0(true);
                    E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.x();
            }
            if (i11 == 3) {
                return (int) ((eVar.W() * eVar.f19819d0) + 0.5f);
            }
        }
        return eVar.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f19856w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f19778B * i10);
                if (i12 != eVar.W()) {
                    eVar.Z0(true);
                    E1(eVar, e.b.FIXED, i12, eVar.T(), eVar.x());
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.W();
            }
            if (i11 == 3) {
                return (int) ((eVar.x() * eVar.f19819d0) + 0.5f);
            }
        }
        return eVar.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n2(a1.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g.n2(a1.e[], int, int, int, int[]):void");
    }

    private void o2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        d dVar;
        int iB1;
        d dVar2;
        int iZ1;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f19919t1.clear();
        a aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
        this.f19919t1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iM2 = m2(eVar, i12);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i12 || (this.f19912m1 + i17) + iM2 > i12) && aVar.f19926b != null;
                if (!z10 && i18 > 0 && (i16 = this.f19917r1) > 0 && i18 % i16 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
                    aVar.i(i18);
                    this.f19919t1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f19912m1 + iM2;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iM2;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iL2 = l2(eVar2, i12);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i12 || (this.f19913n1 + i20) + iL2 > i12) && aVar.f19926b != null;
                if (!z11 && i21 > 0 && (i14 = this.f19917r1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
                    aVar.i(i21);
                    this.f19919t1.add(aVar);
                } else {
                    if (i21 > 0) {
                        i20 += this.f19913n1 + iL2;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i13 = i22;
                }
                i20 = iL2;
                aVar.b(eVar2);
                i21++;
                i13 = i22;
            }
        }
        int size = this.f19919t1.size();
        d dVar3 = this.f19800O;
        d dVar4 = this.f19801P;
        d dVar5 = this.f19802Q;
        d dVar6 = this.f19803R;
        int iA1 = A1();
        int iC1 = C1();
        int iB12 = B1();
        int iZ12 = z1();
        e.b bVarA = A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || T() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = this.f19919t1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i24 = iC1;
        int i25 = iB12;
        int iE = 0;
        int iF = 0;
        int i26 = 0;
        int i27 = iA1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i28 = iZ12;
        while (i26 < size) {
            a aVar3 = this.f19919t1.get(i26);
            if (i11 == 0) {
                if (i26 < size - 1) {
                    dVar2 = this.f19919t1.get(i26 + 1).f19926b.f19801P;
                    iZ1 = 0;
                } else {
                    dVar2 = this.f19803R;
                    iZ1 = z1();
                }
                d dVar9 = aVar3.f19926b.f19803R;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i29 = iE;
                d dVar12 = dVar7;
                int i30 = iF;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i15 = i26;
                aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i27, i24, i25, iZ1, i12);
                int iMax = Math.max(i30, aVar3.f());
                iE = i29 + aVar3.e();
                if (i15 > 0) {
                    iE += this.f19913n1;
                }
                dVar8 = dVar11;
                iF = iMax;
                i24 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i31 = iZ1;
                dVar6 = dVar2;
                i28 = i31;
            } else {
                d dVar15 = dVar8;
                int i32 = iE;
                int i33 = iF;
                i15 = i26;
                if (i15 < size - 1) {
                    dVar = this.f19919t1.get(i15 + 1).f19926b.f19800O;
                    iB1 = 0;
                } else {
                    dVar = this.f19802Q;
                    iB1 = B1();
                }
                d dVar16 = aVar3.f19926b.f19802Q;
                aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i27, i24, iB1, i28, i12);
                iF = i33 + aVar3.f();
                int iMax2 = Math.max(i32, aVar3.e());
                if (i15 > 0) {
                    iF += this.f19912m1;
                }
                iE = iMax2;
                i27 = 0;
                i25 = iB1;
                dVar8 = dVar16;
            }
            i26 = i15 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void p2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        d dVar;
        int iB1;
        d dVar2;
        int iZ1;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f19919t1.clear();
        a aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
        this.f19919t1.add(aVar);
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int iM2 = m2(eVar, i12);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z10 = (i18 == i12 || (this.f19912m1 + i18) + iM2 > i12) && aVar.f19926b != null;
                if (!z10 && i19 > 0 && (i16 = this.f19917r1) > 0 && i17 > i16) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
                    aVar.i(i19);
                    this.f19919t1.add(aVar);
                    i18 = iM2;
                    i17 = 1;
                } else {
                    i18 = i19 > 0 ? i18 + this.f19912m1 + iM2 : iM2;
                }
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int iL2 = l2(eVar2, i12);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z11 = (i22 == i12 || (this.f19913n1 + i22) + iL2 > i12) && aVar.f19926b != null;
                if (!z11 && i23 > 0 && (i14 = this.f19917r1) > 0 && i21 > i14) {
                    z11 = true;
                }
                if (z11) {
                    aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
                    aVar.i(i23);
                    this.f19919t1.add(aVar);
                    i22 = iL2;
                    i21 = 1;
                } else {
                    i22 = i23 > 0 ? i22 + this.f19913n1 + iL2 : iL2;
                }
                aVar.b(eVar2);
                i23++;
                i13 = i24;
            }
        }
        int size = this.f19919t1.size();
        d dVar3 = this.f19800O;
        d dVar4 = this.f19801P;
        d dVar5 = this.f19802Q;
        d dVar6 = this.f19803R;
        int iA1 = A1();
        int iC1 = C1();
        int iB12 = B1();
        int iZ12 = z1();
        e.b bVarA = A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || T() == bVar;
        if (i13 > 0 && z12) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = this.f19919t1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i26 = iC1;
        int i27 = iB12;
        int iE = 0;
        int iF = 0;
        int i28 = 0;
        int i29 = iA1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i30 = iZ12;
        while (i28 < size) {
            a aVar3 = this.f19919t1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar2 = this.f19919t1.get(i28 + 1).f19926b.f19801P;
                    iZ1 = 0;
                } else {
                    dVar2 = this.f19803R;
                    iZ1 = z1();
                }
                d dVar9 = aVar3.f19926b.f19803R;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i31 = iE;
                d dVar12 = dVar7;
                int i32 = iF;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i15 = i28;
                aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i29, i26, i27, iZ1, i12);
                int iMax = Math.max(i32, aVar3.f());
                iE = i31 + aVar3.e();
                if (i15 > 0) {
                    iE += this.f19913n1;
                }
                dVar8 = dVar11;
                iF = iMax;
                i26 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i33 = iZ1;
                dVar6 = dVar2;
                i30 = i33;
            } else {
                d dVar15 = dVar8;
                int i34 = iE;
                int i35 = iF;
                i15 = i28;
                if (i15 < size - 1) {
                    dVar = this.f19919t1.get(i15 + 1).f19926b.f19800O;
                    iB1 = 0;
                } else {
                    dVar = this.f19802Q;
                    iB1 = B1();
                }
                d dVar16 = aVar3.f19926b.f19802Q;
                aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i29, i26, iB1, i30, i12);
                iF = i35 + aVar3.f();
                int iMax2 = Math.max(i34, aVar3.e());
                if (i15 > 0) {
                    iF += this.f19912m1;
                }
                iE = iMax2;
                i29 = 0;
                i27 = iB1;
                dVar8 = dVar16;
            }
            i28 = i15 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void q2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f19919t1.size() == 0) {
            aVar = new a(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, i12);
            this.f19919t1.add(aVar);
        } else {
            a aVar2 = this.f19919t1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i11, this.f19800O, this.f19801P, this.f19802Q, this.f19803R, A1(), C1(), B1(), z1(), i12);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i10) {
        this.f19904e1 = i10;
    }

    public void B2(float f10) {
        this.f19911l1 = f10;
    }

    public void C2(int i10) {
        this.f19905f1 = i10;
    }

    @Override // a1.l
    public void D1(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int[] iArr;
        boolean z10;
        if (this.f19953M0 > 0 && !F1()) {
            I1(0, 0);
            H1(false);
            return;
        }
        int iA1 = A1();
        int iB1 = B1();
        int iC1 = C1();
        int iZ1 = z1();
        int[] iArr2 = new int[2];
        int i16 = (i11 - iA1) - iB1;
        int i17 = this.f19918s1;
        if (i17 == 1) {
            i16 = (i13 - iC1) - iZ1;
        }
        int i18 = i16;
        if (i17 == 0) {
            if (this.f19900a1 == -1) {
                this.f19900a1 = 0;
            }
            if (this.f19901b1 == -1) {
                this.f19901b1 = 0;
            }
        } else {
            if (this.f19900a1 == -1) {
                this.f19900a1 = 0;
            }
            if (this.f19901b1 == -1) {
                this.f19901b1 = 0;
            }
        }
        e[] eVarArr = this.f19952L0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i14 = this.f19953M0;
            if (i19 >= i14) {
                break;
            }
            if (this.f19952L0[i19].V() == 8) {
                i20++;
            }
            i19++;
        }
        if (i20 > 0) {
            eVarArr = new e[i14 - i20];
            int i21 = 0;
            for (int i22 = 0; i22 < this.f19953M0; i22++) {
                e eVar = this.f19952L0[i22];
                if (eVar.V() != 8) {
                    eVarArr[i21] = eVar;
                    i21++;
                }
            }
            i15 = i21;
        } else {
            i15 = i14;
        }
        this.f19923x1 = eVarArr;
        this.f19924y1 = i15;
        int i23 = this.f19916q1;
        if (i23 == 0) {
            iArr = iArr2;
            z10 = true;
            q2(eVarArr, i15, this.f19918s1, i18, iArr2);
        } else if (i23 == 1) {
            z10 = true;
            iArr = iArr2;
            o2(eVarArr, i15, this.f19918s1, i18, iArr2);
        } else if (i23 == 2) {
            z10 = true;
            iArr = iArr2;
            n2(eVarArr, i15, this.f19918s1, i18, iArr2);
        } else if (i23 != 3) {
            z10 = true;
            iArr = iArr2;
        } else {
            z10 = true;
            iArr = iArr2;
            p2(eVarArr, i15, this.f19918s1, i18, iArr2);
        }
        int iMin = iArr[0] + iA1 + iB1;
        int iMin2 = iArr[z10 ? 1 : 0] + iC1 + iZ1;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        I1(iMin, iMin2);
        l1(iMin);
        M0(iMin2);
        if (this.f19953M0 <= 0) {
            z10 = false;
        }
        H1(z10);
    }

    public void D2(int i10) {
        this.f19917r1 = i10;
    }

    public void E2(int i10) {
        this.f19918s1 = i10;
    }

    public void F2(int i10) {
        this.f19915p1 = i10;
    }

    public void G2(float f10) {
        this.f19907h1 = f10;
    }

    public void H2(int i10) {
        this.f19913n1 = i10;
    }

    public void I2(int i10) {
        this.f19901b1 = i10;
    }

    public void J2(int i10) {
        this.f19916q1 = i10;
    }

    @Override // a1.e
    public void g(X0.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((f) K()).R1();
        int i10 = this.f19916q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f19919t1.size();
                int i11 = 0;
                while (i11 < size) {
                    this.f19919t1.get(i11).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                k2(z11);
            } else if (i10 == 3) {
                int size2 = this.f19919t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    this.f19919t1.get(i12).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f19919t1.size() > 0) {
            this.f19919t1.get(0).d(z11, 0, true);
        }
        H1(false);
    }

    public void r2(float f10) {
        this.f19908i1 = f10;
    }

    public void s2(int i10) {
        this.f19902c1 = i10;
    }

    public void t2(float f10) {
        this.f19909j1 = f10;
    }

    public void u2(int i10) {
        this.f19903d1 = i10;
    }

    public void v2(int i10) {
        this.f19914o1 = i10;
    }

    public void w2(float f10) {
        this.f19906g1 = f10;
    }

    public void x2(int i10) {
        this.f19912m1 = i10;
    }

    public void y2(int i10) {
        this.f19900a1 = i10;
    }

    public void z2(float f10) {
        this.f19910k1 = f10;
    }
}
