package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import java.util.Iterator;
import p024c.p044g.p048b.p049k.C0888a;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0893f;
import p024c.p044g.p048b.p049k.C0894g;
import p024c.p044g.p048b.p049k.p050m.C0901b;

/* compiled from: Direct.java */
/* renamed from: c.g.b.k.m.h */
/* loaded from: classes.dex */
public class C0907h {

    /* renamed from: a */
    private static C0901b.a f6130a = new C0901b.a();

    /* renamed from: a */
    private static boolean m5831a(C0892e c0892e) {
        C0892e.b bVarM5742y = c0892e.m5742y();
        C0892e.b bVarM5680O = c0892e.m5680O();
        C0893f c0893f = c0892e.m5668I() != null ? (C0893f) c0892e.m5668I() : null;
        if (c0893f != null) {
            c0893f.m5742y();
            C0892e.b bVar = C0892e.b.FIXED;
        }
        if (c0893f != null) {
            c0893f.m5680O();
            C0892e.b bVar2 = C0892e.b.FIXED;
        }
        C0892e.b bVar3 = C0892e.b.FIXED;
        boolean z = bVarM5742y == bVar3 || bVarM5742y == C0892e.b.WRAP_CONTENT || (bVarM5742y == C0892e.b.MATCH_CONSTRAINT && c0892e.f6000q == 0 && c0892e.f5966X == 0.0f && c0892e.m5694V(0)) || c0892e.mo5614e0();
        boolean z2 = bVarM5680O == bVar3 || bVarM5680O == C0892e.b.WRAP_CONTENT || (bVarM5680O == C0892e.b.MATCH_CONSTRAINT && c0892e.f6002r == 0 && c0892e.f5966X == 0.0f && c0892e.m5694V(1)) || c0892e.mo5616f0();
        if (c0892e.f5966X <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: b */
    private static void m5832b(C0892e c0892e, C0901b.b bVar, boolean z) {
        C0891d c0891d;
        C0891d c0891d2;
        C0891d c0891d3;
        C0891d c0891d4;
        C0891d c0891d5;
        if (!(c0892e instanceof C0893f) && c0892e.m5706d0() && m5831a(c0892e)) {
            C0893f.m5746A1(c0892e, bVar, new C0901b.a(), C0901b.a.f6084a);
        }
        C0891d c0891dMo5718m = c0892e.mo5718m(C0891d.b.LEFT);
        C0891d c0891dMo5718m2 = c0892e.mo5718m(C0891d.b.RIGHT);
        int iM5633d = c0891dMo5718m.m5633d();
        int iM5633d2 = c0891dMo5718m2.m5633d();
        if (c0891dMo5718m.m5632c() != null && c0891dMo5718m.m5642m()) {
            Iterator<C0891d> it = c0891dMo5718m.m5632c().iterator();
            while (it.hasNext()) {
                C0891d next = it.next();
                C0892e c0892e2 = next.f5922d;
                boolean zM5831a = m5831a(c0892e2);
                if (c0892e2.m5706d0() && zM5831a) {
                    C0893f.m5746A1(c0892e2, bVar, new C0901b.a(), C0901b.a.f6084a);
                }
                C0892e.b bVarM5742y = c0892e2.m5742y();
                C0892e.b bVar2 = C0892e.b.MATCH_CONSTRAINT;
                if (bVarM5742y != bVar2 || zM5831a) {
                    if (!c0892e2.m5706d0()) {
                        C0891d c0891d6 = c0892e2.f5951I;
                        if (next == c0891d6 && c0892e2.f5953K.f5924f == null) {
                            int iM5634e = c0891d6.m5634e() + iM5633d;
                            c0892e2.m5725p0(iM5634e, c0892e2.m5686R() + iM5634e);
                            m5832b(c0892e2, bVar, z);
                        } else {
                            C0891d c0891d7 = c0892e2.f5953K;
                            if (next == c0891d7 && c0891d6.f5924f == null) {
                                int iM5634e2 = iM5633d - c0891d7.m5634e();
                                c0892e2.m5725p0(iM5634e2 - c0892e2.m5686R(), iM5634e2);
                                m5832b(c0892e2, bVar, z);
                            } else if (next == c0891d6 && (c0891d3 = c0891d7.f5924f) != null && c0891d3.m5642m() && !c0892e2.m5701Z()) {
                                m5834d(bVar, c0892e2, z);
                            }
                        }
                    }
                } else if (c0892e2.m5742y() == bVar2 && c0892e2.f6008u >= 0 && c0892e2.f6006t >= 0 && (c0892e2.m5684Q() == 8 || (c0892e2.f6000q == 0 && c0892e2.m5732t() == 0.0f))) {
                    if (!c0892e2.m5701Z() && !c0892e2.m5705c0()) {
                        if (((next == c0892e2.f5951I && (c0891d5 = c0892e2.f5953K.f5924f) != null && c0891d5.m5642m()) || (next == c0892e2.f5953K && (c0891d4 = c0892e2.f5951I.f5924f) != null && c0891d4.m5642m())) && !c0892e2.m5701Z()) {
                            m5835e(c0892e, bVar, c0892e2, z);
                        }
                    }
                }
            }
        }
        if ((c0892e instanceof C0894g) || c0891dMo5718m2.m5632c() == null || !c0891dMo5718m2.m5642m()) {
            return;
        }
        Iterator<C0891d> it2 = c0891dMo5718m2.m5632c().iterator();
        while (it2.hasNext()) {
            C0891d next2 = it2.next();
            C0892e c0892e3 = next2.f5922d;
            boolean zM5831a2 = m5831a(c0892e3);
            if (c0892e3.m5706d0() && zM5831a2) {
                C0893f.m5746A1(c0892e3, bVar, new C0901b.a(), C0901b.a.f6084a);
            }
            boolean z2 = (next2 == c0892e3.f5951I && (c0891d2 = c0892e3.f5953K.f5924f) != null && c0891d2.m5642m()) || (next2 == c0892e3.f5953K && (c0891d = c0892e3.f5951I.f5924f) != null && c0891d.m5642m());
            C0892e.b bVarM5742y2 = c0892e3.m5742y();
            C0892e.b bVar3 = C0892e.b.MATCH_CONSTRAINT;
            if (bVarM5742y2 != bVar3 || zM5831a2) {
                if (!c0892e3.m5706d0()) {
                    C0891d c0891d8 = c0892e3.f5951I;
                    if (next2 == c0891d8 && c0892e3.f5953K.f5924f == null) {
                        int iM5634e3 = c0891d8.m5634e() + iM5633d2;
                        c0892e3.m5725p0(iM5634e3, c0892e3.m5686R() + iM5634e3);
                        m5832b(c0892e3, bVar, z);
                    } else {
                        C0891d c0891d9 = c0892e3.f5953K;
                        if (next2 == c0891d9 && c0891d8.f5924f == null) {
                            int iM5634e4 = iM5633d2 - c0891d9.m5634e();
                            c0892e3.m5725p0(iM5634e4 - c0892e3.m5686R(), iM5634e4);
                            m5832b(c0892e3, bVar, z);
                        } else if (z2 && !c0892e3.m5701Z()) {
                            m5834d(bVar, c0892e3, z);
                        }
                    }
                }
            } else if (c0892e3.m5742y() == bVar3 && c0892e3.f6008u >= 0 && c0892e3.f6006t >= 0 && (c0892e3.m5684Q() == 8 || (c0892e3.f6000q == 0 && c0892e3.m5732t() == 0.0f))) {
                if (!c0892e3.m5701Z() && !c0892e3.m5705c0() && z2 && !c0892e3.m5701Z()) {
                    m5835e(c0892e, bVar, c0892e3, z);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m5833c(C0888a c0888a, C0901b.b bVar, int i2, boolean z) {
        if (c0888a.m5612c1()) {
            if (i2 == 0) {
                m5832b(c0888a, bVar, z);
            } else {
                m5839i(c0888a, bVar);
            }
        }
    }

    /* renamed from: d */
    private static void m5834d(C0901b.b bVar, C0892e c0892e, boolean z) {
        float fM5738w = c0892e.m5738w();
        int iM5633d = c0892e.f5951I.f5924f.m5633d();
        int iM5633d2 = c0892e.f5953K.f5924f.m5633d();
        int iM5634e = c0892e.f5951I.m5634e() + iM5633d;
        int iM5634e2 = iM5633d2 - c0892e.f5953K.m5634e();
        if (iM5633d == iM5633d2) {
            fM5738w = 0.5f;
        } else {
            iM5633d = iM5634e;
            iM5633d2 = iM5634e2;
        }
        int iM5686R = c0892e.m5686R();
        int i2 = (iM5633d2 - iM5633d) - iM5686R;
        if (iM5633d > iM5633d2) {
            i2 = (iM5633d - iM5633d2) - iM5686R;
        }
        int i3 = ((int) ((fM5738w * i2) + 0.5f)) + iM5633d;
        int i4 = i3 + iM5686R;
        if (iM5633d > iM5633d2) {
            i4 = i3 - iM5686R;
        }
        c0892e.m5725p0(i3, i4);
        m5832b(c0892e, bVar, z);
    }

    /* renamed from: e */
    private static void m5835e(C0892e c0892e, C0901b.b bVar, C0892e c0892e2, boolean z) {
        float fM5738w = c0892e2.m5738w();
        int iM5633d = c0892e2.f5951I.f5924f.m5633d() + c0892e2.f5951I.m5634e();
        int iM5633d2 = c0892e2.f5953K.f5924f.m5633d() - c0892e2.f5953K.m5634e();
        if (iM5633d2 >= iM5633d) {
            int iM5686R = c0892e2.m5686R();
            if (c0892e2.m5684Q() != 8) {
                int i2 = c0892e2.f6000q;
                if (i2 == 2) {
                    iM5686R = (int) (c0892e2.m5738w() * 0.5f * (c0892e instanceof C0893f ? c0892e.m5686R() : c0892e.m5668I().m5686R()));
                } else if (i2 == 0) {
                    iM5686R = iM5633d2 - iM5633d;
                }
                iM5686R = Math.max(c0892e2.f6006t, iM5686R);
                int i3 = c0892e2.f6008u;
                if (i3 > 0) {
                    iM5686R = Math.min(i3, iM5686R);
                }
            }
            int i4 = iM5633d + ((int) ((fM5738w * ((iM5633d2 - iM5633d) - iM5686R)) + 0.5f));
            c0892e2.m5725p0(i4, iM5686R + i4);
            m5832b(c0892e2, bVar, z);
        }
    }

    /* renamed from: f */
    private static void m5836f(C0901b.b bVar, C0892e c0892e) {
        float fM5676M = c0892e.m5676M();
        int iM5633d = c0892e.f5952J.f5924f.m5633d();
        int iM5633d2 = c0892e.f5954L.f5924f.m5633d();
        int iM5634e = c0892e.f5952J.m5634e() + iM5633d;
        int iM5634e2 = iM5633d2 - c0892e.f5954L.m5634e();
        if (iM5633d == iM5633d2) {
            fM5676M = 0.5f;
        } else {
            iM5633d = iM5634e;
            iM5633d2 = iM5634e2;
        }
        int iM5736v = c0892e.m5736v();
        int i2 = (iM5633d2 - iM5633d) - iM5736v;
        if (iM5633d > iM5633d2) {
            i2 = (iM5633d - iM5633d2) - iM5736v;
        }
        int i3 = (int) ((fM5676M * i2) + 0.5f);
        int i4 = iM5633d + i3;
        int i5 = i4 + iM5736v;
        if (iM5633d > iM5633d2) {
            i4 = iM5633d - i3;
            i5 = i4 - iM5736v;
        }
        c0892e.m5731s0(i4, i5);
        m5839i(c0892e, bVar);
    }

    /* renamed from: g */
    private static void m5837g(C0892e c0892e, C0901b.b bVar, C0892e c0892e2) {
        float fM5676M = c0892e2.m5676M();
        int iM5633d = c0892e2.f5952J.f5924f.m5633d() + c0892e2.f5952J.m5634e();
        int iM5633d2 = c0892e2.f5954L.f5924f.m5633d() - c0892e2.f5954L.m5634e();
        if (iM5633d2 >= iM5633d) {
            int iM5736v = c0892e2.m5736v();
            if (c0892e2.m5684Q() != 8) {
                int i2 = c0892e2.f6002r;
                if (i2 == 2) {
                    iM5736v = (int) (fM5676M * 0.5f * (c0892e instanceof C0893f ? c0892e.m5736v() : c0892e.m5668I().m5736v()));
                } else if (i2 == 0) {
                    iM5736v = iM5633d2 - iM5633d;
                }
                iM5736v = Math.max(c0892e2.f6012w, iM5736v);
                int i3 = c0892e2.f6014x;
                if (i3 > 0) {
                    iM5736v = Math.min(i3, iM5736v);
                }
            }
            int i4 = iM5633d + ((int) ((fM5676M * ((iM5633d2 - iM5633d) - iM5736v)) + 0.5f));
            c0892e2.m5731s0(i4, iM5736v + i4);
            m5839i(c0892e2, bVar);
        }
    }

    /* renamed from: h */
    public static void m5838h(C0893f c0893f, C0901b.b bVar) {
        C0892e.b bVarM5742y = c0893f.m5742y();
        C0892e.b bVarM5680O = c0893f.m5680O();
        c0893f.m5711i0();
        ArrayList<C0892e> arrayListM5797a1 = c0893f.m5797a1();
        int size = arrayListM5797a1.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListM5797a1.get(i2).m5711i0();
        }
        boolean zM5774x1 = c0893f.m5774x1();
        if (bVarM5742y == C0892e.b.FIXED) {
            c0893f.m5725p0(0, c0893f.m5686R());
        } else {
            c0893f.m5727q0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0892e c0892e = arrayListM5797a1.get(i3);
            if (c0892e instanceof C0894g) {
                C0894g c0894g = (C0894g) c0892e;
                if (c0894g.m5778b1() == 1) {
                    if (c0894g.m5779c1() != -1) {
                        c0894g.m5782f1(c0894g.m5779c1());
                    } else if (c0894g.m5780d1() != -1 && c0893f.mo5614e0()) {
                        c0894g.m5782f1(c0893f.m5686R() - c0894g.m5780d1());
                    } else if (c0893f.mo5614e0()) {
                        c0894g.m5782f1((int) ((c0894g.m5781e1() * c0893f.m5686R()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c0892e instanceof C0888a) && ((C0888a) c0892e).m5619g1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                C0892e c0892e2 = arrayListM5797a1.get(i4);
                if (c0892e2 instanceof C0894g) {
                    C0894g c0894g2 = (C0894g) c0892e2;
                    if (c0894g2.m5778b1() == 1) {
                        m5832b(c0894g2, bVar, zM5774x1);
                    }
                }
            }
        }
        m5832b(c0893f, bVar, zM5774x1);
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                C0892e c0892e3 = arrayListM5797a1.get(i5);
                if (c0892e3 instanceof C0888a) {
                    C0888a c0888a = (C0888a) c0892e3;
                    if (c0888a.m5619g1() == 0) {
                        m5833c(c0888a, bVar, 0, zM5774x1);
                    }
                }
            }
        }
        if (bVarM5680O == C0892e.b.FIXED) {
            c0893f.m5731s0(0, c0893f.m5736v());
        } else {
            c0893f.m5729r0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            C0892e c0892e4 = arrayListM5797a1.get(i6);
            if (c0892e4 instanceof C0894g) {
                C0894g c0894g3 = (C0894g) c0892e4;
                if (c0894g3.m5778b1() == 0) {
                    if (c0894g3.m5779c1() != -1) {
                        c0894g3.m5782f1(c0894g3.m5779c1());
                    } else if (c0894g3.m5780d1() != -1 && c0893f.mo5616f0()) {
                        c0894g3.m5782f1(c0893f.m5736v() - c0894g3.m5780d1());
                    } else if (c0893f.mo5616f0()) {
                        c0894g3.m5782f1((int) ((c0894g3.m5781e1() * c0893f.m5736v()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c0892e4 instanceof C0888a) && ((C0888a) c0892e4).m5619g1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i7 = 0; i7 < size; i7++) {
                C0892e c0892e5 = arrayListM5797a1.get(i7);
                if (c0892e5 instanceof C0894g) {
                    C0894g c0894g4 = (C0894g) c0892e5;
                    if (c0894g4.m5778b1() == 0) {
                        m5839i(c0894g4, bVar);
                    }
                }
            }
        }
        m5839i(c0893f, bVar);
        if (z4) {
            for (int i8 = 0; i8 < size; i8++) {
                C0892e c0892e6 = arrayListM5797a1.get(i8);
                if (c0892e6 instanceof C0888a) {
                    C0888a c0888a2 = (C0888a) c0892e6;
                    if (c0888a2.m5619g1() == 1) {
                        m5833c(c0888a2, bVar, 1, zM5774x1);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            C0892e c0892e7 = arrayListM5797a1.get(i9);
            if (c0892e7.m5706d0() && m5831a(c0892e7)) {
                C0893f.m5746A1(c0892e7, bVar, f6130a, C0901b.a.f6084a);
                m5832b(c0892e7, bVar, zM5774x1);
                m5839i(c0892e7, bVar);
            }
        }
    }

    /* renamed from: i */
    private static void m5839i(C0892e c0892e, C0901b.b bVar) {
        C0891d c0891d;
        C0891d c0891d2;
        C0891d c0891d3;
        C0891d c0891d4;
        C0891d c0891d5;
        if (!(c0892e instanceof C0893f) && c0892e.m5706d0() && m5831a(c0892e)) {
            C0893f.m5746A1(c0892e, bVar, new C0901b.a(), C0901b.a.f6084a);
        }
        C0891d c0891dMo5718m = c0892e.mo5718m(C0891d.b.TOP);
        C0891d c0891dMo5718m2 = c0892e.mo5718m(C0891d.b.BOTTOM);
        int iM5633d = c0891dMo5718m.m5633d();
        int iM5633d2 = c0891dMo5718m2.m5633d();
        if (c0891dMo5718m.m5632c() != null && c0891dMo5718m.m5642m()) {
            Iterator<C0891d> it = c0891dMo5718m.m5632c().iterator();
            while (it.hasNext()) {
                C0891d next = it.next();
                C0892e c0892e2 = next.f5922d;
                boolean zM5831a = m5831a(c0892e2);
                if (c0892e2.m5706d0() && zM5831a) {
                    C0893f.m5746A1(c0892e2, bVar, new C0901b.a(), C0901b.a.f6084a);
                }
                C0892e.b bVarM5680O = c0892e2.m5680O();
                C0892e.b bVar2 = C0892e.b.MATCH_CONSTRAINT;
                if (bVarM5680O != bVar2 || zM5831a) {
                    if (!c0892e2.m5706d0()) {
                        C0891d c0891d6 = c0892e2.f5952J;
                        if (next == c0891d6 && c0892e2.f5954L.f5924f == null) {
                            int iM5634e = c0891d6.m5634e() + iM5633d;
                            c0892e2.m5731s0(iM5634e, c0892e2.m5736v() + iM5634e);
                            m5839i(c0892e2, bVar);
                        } else {
                            C0891d c0891d7 = c0892e2.f5954L;
                            if (next == c0891d7 && c0891d7.f5924f == null) {
                                int iM5634e2 = iM5633d - c0891d7.m5634e();
                                c0892e2.m5731s0(iM5634e2 - c0892e2.m5736v(), iM5634e2);
                                m5839i(c0892e2, bVar);
                            } else if (next == c0891d6 && (c0891d3 = c0891d7.f5924f) != null && c0891d3.m5642m()) {
                                m5836f(bVar, c0892e2);
                            }
                        }
                    }
                } else if (c0892e2.m5680O() == bVar2 && c0892e2.f6014x >= 0 && c0892e2.f6012w >= 0 && (c0892e2.m5684Q() == 8 || (c0892e2.f6002r == 0 && c0892e2.m5732t() == 0.0f))) {
                    if (!c0892e2.m5704b0() && !c0892e2.m5705c0()) {
                        if (((next == c0892e2.f5952J && (c0891d5 = c0892e2.f5954L.f5924f) != null && c0891d5.m5642m()) || (next == c0892e2.f5954L && (c0891d4 = c0892e2.f5952J.f5924f) != null && c0891d4.m5642m())) && !c0892e2.m5704b0()) {
                            m5837g(c0892e, bVar, c0892e2);
                        }
                    }
                }
            }
        }
        if (c0892e instanceof C0894g) {
            return;
        }
        if (c0891dMo5718m2.m5632c() != null && c0891dMo5718m2.m5642m()) {
            Iterator<C0891d> it2 = c0891dMo5718m2.m5632c().iterator();
            while (it2.hasNext()) {
                C0891d next2 = it2.next();
                C0892e c0892e3 = next2.f5922d;
                boolean zM5831a2 = m5831a(c0892e3);
                if (c0892e3.m5706d0() && zM5831a2) {
                    C0893f.m5746A1(c0892e3, bVar, new C0901b.a(), C0901b.a.f6084a);
                }
                boolean z = (next2 == c0892e3.f5952J && (c0891d2 = c0892e3.f5954L.f5924f) != null && c0891d2.m5642m()) || (next2 == c0892e3.f5954L && (c0891d = c0892e3.f5952J.f5924f) != null && c0891d.m5642m());
                C0892e.b bVarM5680O2 = c0892e3.m5680O();
                C0892e.b bVar3 = C0892e.b.MATCH_CONSTRAINT;
                if (bVarM5680O2 != bVar3 || zM5831a2) {
                    if (!c0892e3.m5706d0()) {
                        C0891d c0891d8 = c0892e3.f5952J;
                        if (next2 == c0891d8 && c0892e3.f5954L.f5924f == null) {
                            int iM5634e3 = c0891d8.m5634e() + iM5633d2;
                            c0892e3.m5731s0(iM5634e3, c0892e3.m5736v() + iM5634e3);
                            m5839i(c0892e3, bVar);
                        } else {
                            C0891d c0891d9 = c0892e3.f5954L;
                            if (next2 == c0891d9 && c0891d8.f5924f == null) {
                                int iM5634e4 = iM5633d2 - c0891d9.m5634e();
                                c0892e3.m5731s0(iM5634e4 - c0892e3.m5736v(), iM5634e4);
                                m5839i(c0892e3, bVar);
                            } else if (z && !c0892e3.m5704b0()) {
                                m5836f(bVar, c0892e3);
                            }
                        }
                    }
                } else if (c0892e3.m5680O() == bVar3 && c0892e3.f6014x >= 0 && c0892e3.f6012w >= 0 && (c0892e3.m5684Q() == 8 || (c0892e3.f6002r == 0 && c0892e3.m5732t() == 0.0f))) {
                    if (!c0892e3.m5704b0() && !c0892e3.m5705c0() && z && !c0892e3.m5704b0()) {
                        m5837g(c0892e, bVar, c0892e3);
                    }
                }
            }
        }
        C0891d c0891dMo5718m3 = c0892e.mo5718m(C0891d.b.BASELINE);
        if (c0891dMo5718m3.m5632c() == null || !c0891dMo5718m3.m5642m()) {
            return;
        }
        int iM5633d3 = c0891dMo5718m3.m5633d();
        Iterator<C0891d> it3 = c0891dMo5718m3.m5632c().iterator();
        while (it3.hasNext()) {
            C0891d next3 = it3.next();
            C0892e c0892e4 = next3.f5922d;
            boolean zM5831a3 = m5831a(c0892e4);
            if (c0892e4.m5706d0() && zM5831a3) {
                C0893f.m5746A1(c0892e4, bVar, new C0901b.a(), C0901b.a.f6084a);
            }
            if (c0892e4.m5680O() != C0892e.b.MATCH_CONSTRAINT || zM5831a3) {
                if (!c0892e4.m5706d0() && next3 == c0892e4.f5955M) {
                    c0892e4.m5723o0(iM5633d3);
                    m5839i(c0892e4, bVar);
                }
            }
        }
    }
}
