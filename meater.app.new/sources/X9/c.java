package X9;

import android.util.Pair;
import android.view.View;

/* compiled from: MeasureController.java */
/* loaded from: classes2.dex */
public class c {
    public Pair<Integer, Integer> a(Y9.a aVar, int i10, int i11) {
        int i12;
        int i13;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int iC = aVar.c();
        int iL = aVar.l();
        int iR = aVar.r();
        int iG = aVar.g();
        int i14 = aVar.i();
        int iK = aVar.k();
        int iJ = aVar.j();
        int iH = aVar.h();
        int i15 = iL * 2;
        Y9.b bVarF = aVar.f();
        if (iC != 0) {
            i13 = (i15 * iC) + (iR * 2 * iC) + (iG * (iC - 1));
            i12 = i15 + iR;
            if (bVarF != Y9.b.HORIZONTAL) {
                i13 = i12;
                i12 = i13;
            }
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (aVar.b() == V9.a.DROP) {
            if (bVarF == Y9.b.HORIZONTAL) {
                i12 *= 2;
            } else {
                i13 *= 2;
            }
        }
        Y9.b bVar = Y9.b.HORIZONTAL;
        int i16 = i13 + i14 + iJ;
        int i17 = i12 + iK + iH;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i16, size) : i16;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i17, size2) : i17;
        }
        if (size < 0) {
            size = 0;
        }
        int i18 = size2 >= 0 ? size2 : 0;
        aVar.Y(size);
        aVar.E(i18);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i18));
    }
}
