package b1;

import a1.d;
import a1.e;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2197b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<a1.e> f29994a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f29995b = new a();

    /* renamed from: c, reason: collision with root package name */
    private a1.f f29996c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: b1.b$a */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f29997k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f29998l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f29999m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f30000a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f30001b;

        /* renamed from: c, reason: collision with root package name */
        public int f30002c;

        /* renamed from: d, reason: collision with root package name */
        public int f30003d;

        /* renamed from: e, reason: collision with root package name */
        public int f30004e;

        /* renamed from: f, reason: collision with root package name */
        public int f30005f;

        /* renamed from: g, reason: collision with root package name */
        public int f30006g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f30007h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f30008i;

        /* renamed from: j, reason: collision with root package name */
        public int f30009j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: b1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0421b {
        void a();

        void b(a1.e eVar, a aVar);
    }

    public C2197b(a1.f fVar) {
        this.f29996c = fVar;
    }

    private boolean a(InterfaceC0421b interfaceC0421b, a1.e eVar, int i10) {
        this.f29995b.f30000a = eVar.A();
        this.f29995b.f30001b = eVar.T();
        this.f29995b.f30002c = eVar.W();
        this.f29995b.f30003d = eVar.x();
        a aVar = this.f29995b;
        aVar.f30008i = false;
        aVar.f30009j = i10;
        e.b bVar = aVar.f30000a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f30001b == bVar2;
        boolean z12 = z10 && eVar.f19819d0 > 0.0f;
        boolean z13 = z11 && eVar.f19819d0 > 0.0f;
        if (z12 && eVar.f19860y[0] == 4) {
            aVar.f30000a = e.b.FIXED;
        }
        if (z13 && eVar.f19860y[1] == 4) {
            aVar.f30001b = e.b.FIXED;
        }
        interfaceC0421b.b(eVar, aVar);
        eVar.l1(this.f29995b.f30004e);
        eVar.M0(this.f29995b.f30005f);
        eVar.L0(this.f29995b.f30007h);
        eVar.B0(this.f29995b.f30006g);
        a aVar2 = this.f29995b;
        aVar2.f30009j = a.f29997k;
        return aVar2.f30008i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(a1.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<a1.e> r0 = r13.f19968L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.V1(r1)
            b1.b$b r2 = r13.K1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<a1.e> r5 = r13.f19968L0
            java.lang.Object r5 = r5.get(r4)
            a1.e r5 = (a1.e) r5
            boolean r6 = r5 instanceof a1.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof a1.C1883a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            b1.l r6 = r5.f19820e
            if (r6 == 0) goto L47
            b1.n r7 = r5.f19822f
            if (r7 == 0) goto L47
            b1.g r6 = r6.f30077e
            boolean r6 = r6.f30030j
            if (r6 == 0) goto L47
            b1.g r6 = r7.f30077e
            boolean r6 = r6.f30030j
            if (r6 == 0) goto L47
            goto La0
        L47:
            a1.e$b r6 = r5.u(r3)
            r7 = 1
            a1.e$b r8 = r5.u(r7)
            a1.e$b r9 = a1.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f19856w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f19858x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.V1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof a1.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f19856w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f19858x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f19819d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = b1.C2197b.a.f29997k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C2197b.b(a1.f):void");
    }

    private void c(a1.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int I10 = fVar.I();
        int iH = fVar.H();
        fVar.b1(0);
        fVar.a1(0);
        fVar.l1(i11);
        fVar.M0(i12);
        fVar.b1(I10);
        fVar.a1(iH);
        this.f29996c.Z1(i10);
        this.f29996c.t1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    public long d(a1.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        boolean zI1;
        int i19;
        a1.f fVar2;
        int i20;
        boolean z11;
        boolean z12;
        int i21;
        int i22;
        boolean z13;
        int i23;
        C2197b c2197b = this;
        InterfaceC0421b interfaceC0421bK1 = fVar.K1();
        int size = fVar.f19968L0.size();
        int iW = fVar.W();
        int iX = fVar.x();
        boolean zB = a1.k.b(i10, 128);
        int i24 = 1;
        boolean z14 = zB || a1.k.b(i10, 64);
        if (z14) {
            for (int i25 = 0; i25 < size; i25++) {
                a1.e eVar = fVar.f19968L0.get(i25);
                e.b bVarA = eVar.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z15 = (bVarA == bVar) && (eVar.T() == bVar) && eVar.v() > 0.0f;
                if ((eVar.i0() && z15) || ((eVar.k0() && z15) || (eVar instanceof a1.l) || eVar.i0() || eVar.k0())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            boolean z16 = X0.d.f18533s;
        }
        boolean z17 = z14 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i26 = 2;
        if (z17) {
            int iMin = Math.min(fVar.G(), i14);
            int iMin2 = Math.min(fVar.F(), i16);
            if (i13 == 1073741824 && fVar.W() != iMin) {
                fVar.l1(iMin);
                fVar.O1();
            }
            if (i15 == 1073741824 && fVar.x() != iMin2) {
                fVar.M0(iMin2);
                fVar.O1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zI1 = fVar.G1(zB);
                i19 = 2;
                z10 = false;
            } else {
                boolean zH1 = fVar.H1(zB);
                z10 = false;
                if (i13 == 1073741824) {
                    zH1 &= fVar.I1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zI1 = fVar.I1(zB, 1) & zH1;
                    i19++;
                } else {
                    zI1 = zH1;
                }
            }
            if (zI1) {
                fVar.q1(i13 == 1073741824 ? true : z10, i15 == 1073741824 ? true : z10);
            }
        } else {
            z10 = false;
            zI1 = false;
            i19 = 0;
        }
        if (zI1 && i19 == 2) {
            return 0L;
        }
        int iL1 = fVar.L1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = c2197b.f29994a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, iW, iX);
        }
        if (size2 > 0) {
            e.b bVarA2 = fVar.A();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z18 = bVarA2 == bVar2 ? true : z10;
            boolean z19 = fVar.T() == bVar2 ? true : z10;
            int iMax = Math.max(fVar.W(), c2197b.f29996c.I());
            int iMax2 = Math.max(fVar.x(), c2197b.f29996c.H());
            boolean z20 = z10;
            boolean zG1 = z20;
            ?? r15 = z20;
            while (r15 < size2) {
                a1.e eVar2 = c2197b.f29994a.get(r15);
                if (eVar2 instanceof a1.l) {
                    int iW2 = eVar2.W();
                    int iX2 = eVar2.x();
                    boolean zA = zG1 | c2197b.a(interfaceC0421bK1, eVar2, a.f29998l);
                    int iW3 = eVar2.W();
                    i22 = iL1;
                    int iX3 = eVar2.x();
                    if (iW3 != iW2) {
                        eVar2.l1(iW3);
                        if (z18 && eVar2.M() > iMax) {
                            iMax = Math.max(iMax, eVar2.M() + eVar2.o(d.a.RIGHT).f());
                        }
                        z13 = true;
                    } else {
                        z13 = zA;
                    }
                    if (iX3 != iX2) {
                        eVar2.M0(iX3);
                        if (z19 && eVar2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.r() + eVar2.o(d.a.BOTTOM).f());
                        }
                        z13 = true;
                    }
                    zG1 = z13 | ((a1.l) eVar2).G1();
                    i23 = 1;
                } else {
                    i22 = iL1;
                    i23 = i24;
                }
                iL1 = i22;
                i24 = i23;
                i26 = 2;
                r15 += i23;
            }
            int i27 = iL1;
            int i28 = i26;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    a1.e eVar3 = c2197b.f29994a.get(i30);
                    if (((eVar3 instanceof a1.i) && !(eVar3 instanceof a1.l)) || (eVar3 instanceof a1.h) || eVar3.V() == 8 || ((z17 && eVar3.f19820e.f30077e.f30030j && eVar3.f19822f.f30077e.f30030j) || (eVar3 instanceof a1.l))) {
                        z11 = z17;
                    } else {
                        int iW4 = eVar3.W();
                        int iX4 = eVar3.x();
                        int iP = eVar3.p();
                        int i31 = a.f29998l;
                        z11 = z17;
                        if (i29 == 1) {
                            i31 = a.f29999m;
                        }
                        boolean zA2 = zG1 | c2197b.a(interfaceC0421bK1, eVar3, i31);
                        int iW5 = eVar3.W();
                        int iX5 = eVar3.x();
                        if (iW5 != iW4) {
                            eVar3.l1(iW5);
                            if (z18 && eVar3.M() > iMax) {
                                iMax = Math.max(iMax, eVar3.M() + eVar3.o(d.a.RIGHT).f());
                            }
                            z12 = true;
                        } else {
                            z12 = zA2;
                        }
                        if (iX5 != iX4) {
                            eVar3.M0(iX5);
                            if (z19 && eVar3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.r() + eVar3.o(d.a.BOTTOM).f());
                            }
                            z12 = true;
                        }
                        if (!eVar3.Z() || iP == eVar3.p()) {
                            zG1 = z12;
                        } else {
                            i21 = 1;
                            zG1 = true;
                            i30 += i21;
                            c2197b = this;
                            z17 = z11;
                        }
                    }
                    i21 = 1;
                    i30 += i21;
                    c2197b = this;
                    z17 = z11;
                }
                boolean z21 = z17;
                if (!zG1) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, iW, iX);
                i28 = 2;
                zG1 = false;
                c2197b = this;
                z17 = z21;
            }
            fVar2 = fVar;
            i20 = i27;
        } else {
            fVar2 = fVar;
            i20 = iL1;
        }
        fVar2.Y1(i20);
        return 0L;
    }

    public void e(a1.f fVar) {
        this.f29994a.clear();
        int size = fVar.f19968L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a1.e eVar = fVar.f19968L0.get(i10);
            e.b bVarA = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || eVar.T() == bVar) {
                this.f29994a.add(eVar);
            }
        }
        fVar.O1();
    }
}
