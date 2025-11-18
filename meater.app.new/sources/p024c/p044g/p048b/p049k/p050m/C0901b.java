package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0893f;
import p024c.p044g.p048b.p049k.C0894g;
import p024c.p044g.p048b.p049k.C0897j;
import p024c.p044g.p048b.p049k.C0898k;
import p024c.p044g.p048b.p049k.InterfaceC0895h;

/* compiled from: BasicMeasure.java */
/* renamed from: c.g.b.k.m.b */
/* loaded from: classes.dex */
public class C0901b {

    /* renamed from: a */
    private final ArrayList<C0892e> f6081a = new ArrayList<>();

    /* renamed from: b */
    private a f6082b = new a();

    /* renamed from: c */
    private C0893f f6083c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: c.g.b.k.m.b$a */
    public static class a {

        /* renamed from: a */
        public static int f6084a = 0;

        /* renamed from: b */
        public static int f6085b = 1;

        /* renamed from: c */
        public static int f6086c = 2;

        /* renamed from: d */
        public C0892e.b f6087d;

        /* renamed from: e */
        public C0892e.b f6088e;

        /* renamed from: f */
        public int f6089f;

        /* renamed from: g */
        public int f6090g;

        /* renamed from: h */
        public int f6091h;

        /* renamed from: i */
        public int f6092i;

        /* renamed from: j */
        public int f6093j;

        /* renamed from: k */
        public boolean f6094k;

        /* renamed from: l */
        public boolean f6095l;

        /* renamed from: m */
        public int f6096m;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: c.g.b.k.m.b$b */
    public interface b {
        /* renamed from: a */
        void mo1335a();

        /* renamed from: b */
        void mo1336b(C0892e c0892e, a aVar);
    }

    public C0901b(C0893f c0893f) {
        this.f6083c = c0893f;
    }

    /* renamed from: a */
    private boolean m5800a(b bVar, C0892e c0892e, int i2) {
        this.f6082b.f6087d = c0892e.m5742y();
        this.f6082b.f6088e = c0892e.m5680O();
        this.f6082b.f6089f = c0892e.m5686R();
        this.f6082b.f6090g = c0892e.m5736v();
        a aVar = this.f6082b;
        aVar.f6095l = false;
        aVar.f6096m = i2;
        C0892e.b bVar2 = aVar.f6087d;
        C0892e.b bVar3 = C0892e.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f6088e == bVar3;
        boolean z3 = z && c0892e.f5966X > 0.0f;
        boolean z4 = z2 && c0892e.f5966X > 0.0f;
        if (z3 && c0892e.f6004s[0] == 4) {
            aVar.f6087d = C0892e.b.FIXED;
        }
        if (z4 && c0892e.f6004s[1] == 4) {
            aVar.f6088e = C0892e.b.FIXED;
        }
        bVar.mo1336b(c0892e, aVar);
        c0892e.m5693U0(this.f6082b.f6091h);
        c0892e.m5737v0(this.f6082b.f6092i);
        c0892e.m5735u0(this.f6082b.f6094k);
        c0892e.m5715k0(this.f6082b.f6093j);
        a aVar2 = this.f6082b;
        aVar2.f6096m = a.f6084a;
        return aVar2.f6095l;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a4 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5801b(p024c.p044g.p048b.p049k.C0893f r13) {
        /*
            r12 = this;
            java.util.ArrayList<c.g.b.k.e> r0 = r13.f6080D0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m5752B1(r1)
            c.g.b.k.m.b$b r2 = r13.m5768r1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Laa
            java.util.ArrayList<c.g.b.k.e> r5 = r13.f6080D0
            java.lang.Object r5 = r5.get(r4)
            c.g.b.k.e r5 = (p024c.p044g.p048b.p049k.C0892e) r5
            boolean r6 = r5 instanceof p024c.p044g.p048b.p049k.C0894g
            if (r6 == 0) goto L22
            goto La4
        L22:
            boolean r6 = r5 instanceof p024c.p044g.p048b.p049k.C0888a
            if (r6 == 0) goto L28
            goto La4
        L28:
            boolean r6 = r5.m5705c0()
            if (r6 == 0) goto L30
            goto La4
        L30:
            if (r1 == 0) goto L47
            c.g.b.k.m.l r6 = r5.f5978f
            if (r6 == 0) goto L47
            c.g.b.k.m.n r7 = r5.f5980g
            if (r7 == 0) goto L47
            c.g.b.k.m.g r6 = r6.f6163e
            boolean r6 = r6.f6117j
            if (r6 == 0) goto L47
            c.g.b.k.m.g r6 = r7.f6163e
            boolean r6 = r6.f6117j
            if (r6 == 0) goto L47
            goto La4
        L47:
            c.g.b.k.e$b r6 = r5.m5730s(r3)
            r7 = 1
            c.g.b.k.e$b r8 = r5.m5730s(r7)
            c.g.b.k.e$b r9 = p024c.p044g.p048b.p049k.C0892e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f6000q
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f6002r
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.m5752B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof p024c.p044g.p048b.p049k.C0898k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f6000q
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.m5701Z()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f6002r
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.m5701Z()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f5966X
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La4
        L9b:
            int r6 = p024c.p044g.p048b.p049k.p050m.C0901b.a.f6084a
            r12.m5800a(r2, r5, r6)
            c.g.b.e r5 = r13.f6031I0
            if (r5 != 0) goto La8
        La4:
            int r4 = r4 + 1
            goto L12
        La8:
            r13 = 0
            throw r13
        Laa:
            r2.mo1335a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.p050m.C0901b.m5801b(c.g.b.k.f):void");
    }

    /* renamed from: c */
    private void m5802c(C0893f c0893f, String str, int i2, int i3) {
        int iM5664G = c0893f.m5664G();
        int iM5662F = c0893f.m5662F();
        c0893f.m5673K0(0);
        c0893f.m5671J0(0);
        c0893f.m5693U0(i2);
        c0893f.m5737v0(i3);
        c0893f.m5673K0(iM5664G);
        c0893f.m5671J0(iM5662F);
        this.f6083c.mo5758b1();
    }

    /* renamed from: d */
    public long m5803d(C0893f c0893f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean zM5767q1;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        int i13;
        boolean z4;
        int i14;
        int i15;
        boolean z5;
        b bVarM5768r1 = c0893f.m5768r1();
        int size = c0893f.f6080D0.size();
        int iM5686R = c0893f.m5686R();
        int iM5736v = c0893f.m5736v();
        boolean zM5793b = C0897j.m5793b(i2, 128);
        boolean z6 = zM5793b || C0897j.m5793b(i2, 64);
        if (z6) {
            for (int i16 = 0; i16 < size; i16++) {
                C0892e c0892e = c0893f.f6080D0.get(i16);
                C0892e.b bVarM5742y = c0892e.m5742y();
                C0892e.b bVar = C0892e.b.MATCH_CONSTRAINT;
                boolean z7 = (bVarM5742y == bVar) && (c0892e.m5680O() == bVar) && c0892e.m5732t() > 0.0f;
                if ((c0892e.m5701Z() && z7) || ((c0892e.m5704b0() && z7) || (c0892e instanceof C0898k) || c0892e.m5701Z() || c0892e.m5704b0())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6 && C0881d.f5822g != null) {
            throw null;
        }
        boolean z8 = z6 & ((i5 == 1073741824 && i7 == 1073741824) || zM5793b);
        if (z8) {
            int iMin = Math.min(c0893f.m5660E(), i6);
            int iMin2 = Math.min(c0893f.m5658D(), i8);
            if (i5 == 1073741824 && c0893f.m5686R() != iMin) {
                c0893f.m5693U0(iMin);
                c0893f.m5771u1();
            }
            if (i7 == 1073741824 && c0893f.m5736v() != iMin2) {
                c0893f.m5737v0(iMin2);
                c0893f.m5771u1();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                zM5767q1 = c0893f.m5765o1(zM5793b);
                i11 = 2;
            } else {
                boolean zM5766p1 = c0893f.m5766p1(zM5793b);
                if (i5 == 1073741824) {
                    zM5766p1 &= c0893f.m5767q1(zM5793b, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    zM5767q1 = c0893f.m5767q1(zM5793b, 1) & zM5766p1;
                    i11++;
                } else {
                    zM5767q1 = zM5766p1;
                }
            }
            if (zM5767q1) {
                c0893f.mo5700Y0(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            zM5767q1 = false;
            i11 = 0;
        }
        if (zM5767q1 && i11 == 2) {
            return 0L;
        }
        int iM5769s1 = c0893f.m5769s1();
        if (size > 0) {
            m5801b(c0893f);
        }
        m5804e(c0893f);
        int size2 = this.f6081a.size();
        if (size > 0) {
            m5802c(c0893f, "First pass", iM5686R, iM5736v);
        }
        if (size2 > 0) {
            C0892e.b bVarM5742y2 = c0893f.m5742y();
            C0892e.b bVar2 = C0892e.b.WRAP_CONTENT;
            boolean z9 = bVarM5742y2 == bVar2;
            boolean z10 = c0893f.m5680O() == bVar2;
            int iMax = Math.max(c0893f.m5686R(), this.f6083c.m5664G());
            int iMax2 = Math.max(c0893f.m5736v(), this.f6083c.m5662F());
            int i17 = 0;
            boolean zM5795d1 = false;
            while (i17 < size2) {
                C0892e c0892e2 = this.f6081a.get(i17);
                if (c0892e2 instanceof C0898k) {
                    int iM5686R2 = c0892e2.m5686R();
                    i14 = iM5769s1;
                    int iM5736v2 = c0892e2.m5736v();
                    i15 = iM5686R;
                    boolean zM5800a = m5800a(bVarM5768r1, c0892e2, a.f6085b) | zM5795d1;
                    if (c0893f.f6031I0 != null) {
                        throw null;
                    }
                    int iM5686R3 = c0892e2.m5686R();
                    int iM5736v3 = c0892e2.m5736v();
                    if (iM5686R3 != iM5686R2) {
                        c0892e2.m5693U0(iM5686R3);
                        if (z9 && c0892e2.m5672K() > iMax) {
                            iMax = Math.max(iMax, c0892e2.m5672K() + c0892e2.mo5718m(C0891d.b.RIGHT).m5634e());
                        }
                        z5 = true;
                    } else {
                        z5 = zM5800a;
                    }
                    if (iM5736v3 != iM5736v2) {
                        c0892e2.m5737v0(iM5736v3);
                        if (z10 && c0892e2.m5724p() > iMax2) {
                            iMax2 = Math.max(iMax2, c0892e2.m5724p() + c0892e2.mo5718m(C0891d.b.BOTTOM).m5634e());
                        }
                        z5 = true;
                    }
                    zM5795d1 = z5 | ((C0898k) c0892e2).m5795d1();
                } else {
                    i14 = iM5769s1;
                    i15 = iM5686R;
                }
                i17++;
                iM5769s1 = i14;
                iM5686R = i15;
            }
            int i18 = iM5769s1;
            int i19 = iM5686R;
            int i20 = 0;
            int i21 = 2;
            while (i20 < i21) {
                int i22 = 0;
                while (i22 < size2) {
                    C0892e c0892e3 = this.f6081a.get(i22);
                    if (((c0892e3 instanceof InterfaceC0895h) && !(c0892e3 instanceof C0898k)) || (c0892e3 instanceof C0894g) || c0892e3.m5684Q() == 8 || ((z8 && c0892e3.f5978f.f6163e.f6117j && c0892e3.f5980g.f6163e.f6117j) || (c0892e3 instanceof C0898k))) {
                        z3 = z8;
                        i13 = size2;
                    } else {
                        int iM5686R4 = c0892e3.m5686R();
                        int iM5736v4 = c0892e3.m5736v();
                        z3 = z8;
                        int iM5720n = c0892e3.m5720n();
                        int i23 = a.f6085b;
                        i13 = size2;
                        if (i20 == 1) {
                            i23 = a.f6086c;
                        }
                        boolean zM5800a2 = m5800a(bVarM5768r1, c0892e3, i23) | zM5795d1;
                        if (c0893f.f6031I0 != null) {
                            throw null;
                        }
                        int iM5686R5 = c0892e3.m5686R();
                        int iM5736v5 = c0892e3.m5736v();
                        if (iM5686R5 != iM5686R4) {
                            c0892e3.m5693U0(iM5686R5);
                            if (z9 && c0892e3.m5672K() > iMax) {
                                iMax = Math.max(iMax, c0892e3.m5672K() + c0892e3.mo5718m(C0891d.b.RIGHT).m5634e());
                            }
                            z4 = true;
                        } else {
                            z4 = zM5800a2;
                        }
                        if (iM5736v5 != iM5736v4) {
                            c0892e3.m5737v0(iM5736v5);
                            if (z10 && c0892e3.m5724p() > iMax2) {
                                iMax2 = Math.max(iMax2, c0892e3.m5724p() + c0892e3.mo5718m(C0891d.b.BOTTOM).m5634e());
                            }
                            z4 = true;
                        }
                        zM5795d1 = (!c0892e3.m5692U() || iM5720n == c0892e3.m5720n()) ? z4 : true;
                    }
                    i22++;
                    size2 = i13;
                    z8 = z3;
                }
                boolean z11 = z8;
                int i24 = size2;
                if (!zM5795d1) {
                    break;
                }
                m5802c(c0893f, "intermediate pass", i19, iM5736v);
                i20++;
                size2 = i24;
                z8 = z11;
                i21 = 2;
                zM5795d1 = false;
            }
            if (zM5795d1) {
                m5802c(c0893f, "2nd pass", i19, iM5736v);
                if (c0893f.m5686R() < iMax) {
                    c0893f.m5693U0(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c0893f.m5736v() < iMax2) {
                    c0893f.m5737v0(iMax2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    m5802c(c0893f, "3rd pass", i19, iM5736v);
                }
            }
            i12 = i18;
        } else {
            i12 = iM5769s1;
        }
        c0893f.m5754E1(i12);
        return 0L;
    }

    /* renamed from: e */
    public void m5804e(C0893f c0893f) {
        this.f6081a.clear();
        int size = c0893f.f6080D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0892e c0892e = c0893f.f6080D0.get(i2);
            C0892e.b bVarM5742y = c0892e.m5742y();
            C0892e.b bVar = C0892e.b.MATCH_CONSTRAINT;
            if (bVarM5742y == bVar || c0892e.m5680O() == bVar) {
                this.f6081a.add(c0892e);
            }
        }
        c0893f.m5771u1();
    }
}
