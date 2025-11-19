package v2;

import X1.C1804a;

/* compiled from: CeaUtil.java */
/* renamed from: v2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4800f {
    public static void a(long j10, X1.y yVar, O[] oArr) {
        while (true) {
            if (yVar.a() <= 1) {
                return;
            }
            int iC = c(yVar);
            int iC2 = c(yVar);
            int iF = yVar.f() + iC2;
            if (iC2 == -1 || iC2 > yVar.a()) {
                X1.n.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = yVar.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iH = yVar.H();
                int iP = yVar.P();
                int iQ = iP == 49 ? yVar.q() : 0;
                int iH2 = yVar.H();
                if (iP == 47) {
                    yVar.X(1);
                }
                boolean z10 = iH == 181 && (iP == 49 || iP == 47) && iH2 == 3;
                if (iP == 49) {
                    z10 &= iQ == 1195456820;
                }
                if (z10) {
                    b(j10, yVar, oArr);
                }
            }
            yVar.W(iF);
        }
    }

    public static void b(long j10, X1.y yVar, O[] oArr) {
        int iH = yVar.H();
        if ((iH & 64) != 0) {
            yVar.X(1);
            int i10 = (iH & 31) * 3;
            int iF = yVar.f();
            for (O o10 : oArr) {
                yVar.W(iF);
                o10.d(yVar, i10);
                C1804a.g(j10 != -9223372036854775807L);
                o10.e(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(X1.y yVar) {
        int i10 = 0;
        while (yVar.a() != 0) {
            int iH = yVar.H();
            i10 += iH;
            if (iH != 255) {
                return i10;
            }
        }
        return -1;
    }
}
