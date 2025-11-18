package P2;

import X1.y;
import v2.InterfaceC4811q;
import v2.N;

/* compiled from: Sniffer.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13872a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f13872a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static N b(InterfaceC4811q interfaceC4811q) {
        return c(interfaceC4811q, true, false);
    }

    private static N c(InterfaceC4811q interfaceC4811q, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        int[] iArr;
        long jA = interfaceC4811q.a();
        long j10 = -1;
        long j11 = 4096;
        if (jA != -1 && jA <= 4096) {
            j11 = jA;
        }
        int i13 = (int) j11;
        y yVar = new y(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (i15 < i13) {
            yVar.S(8);
            if (!interfaceC4811q.h(yVar.e(), i14, 8, true)) {
                break;
            }
            long J10 = yVar.J();
            int iQ = yVar.q();
            if (J10 == 1) {
                interfaceC4811q.p(yVar.e(), 8, 8);
                i11 = 16;
                yVar.V(16);
                J10 = yVar.A();
            } else {
                if (J10 == 0) {
                    long jA2 = interfaceC4811q.a();
                    if (jA2 != j10) {
                        J10 = (jA2 - interfaceC4811q.i()) + 8;
                    }
                }
                i11 = 8;
            }
            long j12 = J10;
            long j13 = i11;
            if (j12 < j13) {
                return new a(iQ, j12, i11);
            }
            i15 += i11;
            if (iQ == 1836019574) {
                i13 += (int) j12;
                if (jA != -1 && i13 > jA) {
                    i13 = (int) jA;
                }
            } else {
                if (iQ == 1836019558 || iQ == 1836475768) {
                    i10 = 1;
                    break;
                }
                long j14 = jA;
                if (iQ == 1835295092) {
                    z13 = true;
                }
                if ((i15 + j12) - j13 >= i13) {
                    i10 = 0;
                    break;
                }
                int i16 = (int) (j12 - j13);
                i15 += i16;
                if (iQ != 1718909296) {
                    i12 = 0;
                    if (i16 != 0) {
                        interfaceC4811q.j(i16);
                    }
                } else {
                    if (i16 < 8) {
                        return new a(iQ, i16, 8);
                    }
                    yVar.S(i16);
                    i12 = 0;
                    interfaceC4811q.p(yVar.e(), 0, i16);
                    int iQ2 = yVar.q();
                    if (a(iQ2, z11)) {
                        z13 = true;
                    }
                    yVar.X(4);
                    int iA = yVar.a() / 4;
                    if (!z13 && iA > 0) {
                        iArr = new int[iA];
                        int i17 = 0;
                        while (true) {
                            if (i17 >= iA) {
                                z12 = z13;
                                break;
                            }
                            int iQ3 = yVar.q();
                            iArr[i17] = iQ3;
                            if (a(iQ3, z11)) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        }
                    } else {
                        z12 = z13;
                        iArr = null;
                    }
                    if (!z12) {
                        return new w(iQ2, iArr);
                    }
                    z13 = z12;
                }
                i14 = i12;
                jA = j14;
            }
            j10 = -1;
        }
        i10 = i14;
        if (!z13) {
            return n.f13859a;
        }
        if (z10 != i10) {
            return i10 != 0 ? i.f13818b : i.f13819c;
        }
        return null;
    }

    public static N d(InterfaceC4811q interfaceC4811q, boolean z10) {
        return c(interfaceC4811q, false, z10);
    }
}
