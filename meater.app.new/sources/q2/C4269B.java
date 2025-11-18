package q2;

import U1.H;
import U1.K;
import java.util.Arrays;
import java.util.List;
import m8.AbstractC4009y;
import q2.z;

/* compiled from: TrackSelectionUtil.java */
/* renamed from: q2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4269B {
    public static K a(z.a aVar, List<? extends InterfaceC4268A>[] listArr) {
        boolean z10;
        AbstractC4009y.a aVar2 = new AbstractC4009y.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            n2.x xVarF = aVar.f(i10);
            List<? extends InterfaceC4268A> list = listArr[i10];
            for (int i11 = 0; i11 < xVarF.f45677a; i11++) {
                H hB = xVarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = hB.f16862a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < hB.f16862a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        InterfaceC4268A interfaceC4268A = list.get(i14);
                        if (interfaceC4268A.b().equals(hB) && interfaceC4268A.u(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new K.a(hB, z11, iArr, zArr));
            }
        }
        n2.x xVarH = aVar.h();
        for (int i15 = 0; i15 < xVarH.f45677a; i15++) {
            H hB2 = xVarH.b(i15);
            int[] iArr2 = new int[hB2.f16862a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new K.a(hB2, false, iArr2, new boolean[hB2.f16862a]));
        }
        return new K(aVar2.k());
    }

    public static K b(z.a aVar, InterfaceC4268A[] interfaceC4268AArr) {
        List[] listArr = new List[interfaceC4268AArr.length];
        for (int i10 = 0; i10 < interfaceC4268AArr.length; i10++) {
            InterfaceC4268A interfaceC4268A = interfaceC4268AArr[i10];
            listArr[i10] = interfaceC4268A != null ? AbstractC4009y.H(interfaceC4268A) : AbstractC4009y.G();
        }
        return a(aVar, listArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point c(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = X1.L.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = X1.L.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C4269B.c(boolean, int, int, int, int):android.graphics.Point");
    }
}
