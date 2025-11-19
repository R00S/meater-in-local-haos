package ca;

import android.util.Pair;

/* compiled from: CoordinatesUtils.java */
/* renamed from: ca.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2352a {
    public static int a(Y9.a aVar, int i10) {
        if (aVar == null) {
            return 0;
        }
        return aVar.f() == Y9.b.HORIZONTAL ? e(aVar, i10) : f(aVar, i10);
    }

    private static int b(Y9.a aVar, int i10) {
        int iC = aVar.c();
        int iL = aVar.l();
        int iR = aVar.r();
        int iG = aVar.g();
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            int i13 = iR / 2;
            int i14 = i11 + iL + i13;
            if (i10 == i12) {
                return i14;
            }
            i11 = i14 + iL + iG + i13;
        }
        return aVar.b() == V9.a.DROP ? i11 + (iL * 2) : i11;
    }

    public static Pair<Integer, Float> c(Y9.a aVar, int i10, float f10, boolean z10) {
        int iC = aVar.c();
        int iP = aVar.p();
        if (z10) {
            i10 = (iC - 1) - i10;
        }
        boolean z11 = false;
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i11 = iC - 1;
            if (i10 > i11) {
                i10 = i11;
            }
        }
        boolean z12 = i10 > iP;
        if (!z10 ? i10 + 1 < iP : i10 - 1 < iP) {
            z11 = true;
        }
        if (z12 || z11) {
            aVar.T(i10);
            iP = i10;
        }
        if (iP != i10 || f10 == 0.0f) {
            f10 = 1.0f - f10;
        } else {
            i10 = z10 ? i10 - 1 : i10 + 1;
        }
        return new Pair<>(Integer.valueOf(i10), Float.valueOf(f10 <= 1.0f ? f10 < 0.0f ? 0.0f : f10 : 1.0f));
    }

    private static int d(Y9.a aVar) {
        int iL = aVar.l();
        return aVar.b() == V9.a.DROP ? iL * 3 : iL;
    }

    public static int e(Y9.a aVar, int i10) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.f() == Y9.b.HORIZONTAL ? b(aVar, i10) : d(aVar)) + aVar.i();
    }

    public static int f(Y9.a aVar, int i10) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.f() == Y9.b.HORIZONTAL ? d(aVar) : b(aVar, i10)) + aVar.k();
    }
}
