package A0;

import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aZ\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "oldSize", "newSize", "LA0/p;", "cb", "LA0/x;", "d", "(IILA0/p;)LA0/x;", "diagonals", "callback", "Loa/F;", "b", "(LA0/x;LA0/p;)V", "e", "(IILA0/p;)V", "oldStart", "oldEnd", "newStart", "newEnd", "LA0/f;", "forward", "backward", "", "snake", "", "h", "(IIIILA0/p;[I[I[I)Z", "g", "(IIIILA0/p;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "(IIIIZ[I)V", "i", "j", "([III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {
    private static final void b(C0844x c0844x, InterfaceC0837p interfaceC0837p) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c0844x.getLastIndex()) {
            int i13 = i10 + 2;
            int iB = c0844x.b(i10) - c0844x.b(i13);
            int iB2 = c0844x.b(i10 + 1) - c0844x.b(i13);
            int iB3 = c0844x.b(i13);
            i10 += 3;
            while (i11 < iB) {
                interfaceC0837p.a(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                interfaceC0837p.d(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC0837p.c(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, InterfaceC0837p interfaceC0837p, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = i17 % 2 == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && C0827f.b(iArr2, i19 + 1) < C0827f.b(iArr2, i19 - 1))) {
                iB = C0827f.b(iArr2, i19 + 1);
                i15 = iB;
            } else {
                iB = C0827f.b(iArr2, i19 - 1);
                i15 = iB - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 + 1;
            while (i15 > i10 && i20 > i12) {
                if (!interfaceC0837p.b(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            C0827f.d(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (C0827f.b(iArr, i16) >= i15) {
                    f(i15, i20, iB, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final C0844x d(int i10, int i11, InterfaceC0837p interfaceC0837p) {
        int i12 = ((i10 + i11) + 1) / 2;
        C0844x c0844x = new C0844x(i12 * 3);
        C0844x c0844x2 = new C0844x(i12 * 4);
        c0844x2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrA = C0827f.a(new int[i13]);
        int[] iArrA2 = C0827f.a(new int[i13]);
        int[] iArrB = x0.b(new int[5]);
        while (c0844x2.d()) {
            int iF = c0844x2.f();
            int iF2 = c0844x2.f();
            int iF3 = c0844x2.f();
            int iF4 = c0844x2.f();
            int[] iArr = iArrA;
            int[] iArr2 = iArrA2;
            if (h(iF4, iF3, iF2, iF, interfaceC0837p, iArrA, iArrA2, iArrB)) {
                if (x0.c(iArrB) > 0) {
                    x0.a(iArrB, c0844x);
                }
                c0844x2.h(iF4, x0.h(iArrB), iF2, x0.i(iArrB));
                c0844x2.h(x0.d(iArrB), iF3, x0.e(iArrB), iF);
            }
            iArrA = iArr;
            iArrA2 = iArr2;
        }
        c0844x.j();
        c0844x.g(i10, i11, 0);
        return c0844x;
    }

    public static final void e(int i10, int i11, InterfaceC0837p interfaceC0837p) {
        b(d(i10, i11, interfaceC0837p), interfaceC0837p);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    private static final boolean g(int i10, int i11, int i12, int i13, InterfaceC0837p interfaceC0837p, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = Math.abs(i17) % 2 == 1;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && C0827f.b(iArr, i19 + 1) > C0827f.b(iArr, i19 - 1))) {
                iB = C0827f.b(iArr, i19 + 1);
                i15 = iB;
            } else {
                iB = C0827f.b(iArr, i19 - 1);
                i15 = iB + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 - 1;
            while (i15 < i11 && i20 < i13) {
                if (!interfaceC0837p.b(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            C0827f.d(iArr, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 + 1 && i16 <= i14 - 1) {
                if (C0827f.b(iArr2, i16) <= i15) {
                    f(iB, i21, i15, i20, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, InterfaceC0837p interfaceC0837p, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            C0827f.d(iArr, 1, i10);
            C0827f.d(iArr2, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i17;
                if (g(i10, i11, i12, i13, interfaceC0837p, iArr, iArr2, i17, iArr3) || c(i10, i11, i12, i13, interfaceC0837p, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i17 = i18 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
