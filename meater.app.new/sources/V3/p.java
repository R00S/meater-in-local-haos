package V3;

import W3.c;
import android.graphics.Path;
import java.util.Collections;

/* compiled from: GradientFillParser.java */
/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18058a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18059b = c.a.a("p", "k");

    static S3.e a(W3.c cVar, L3.i iVar) {
        R3.d dVarH = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strM = null;
        S3.g gVar = null;
        R3.c cVarG = null;
        R3.f fVarI = null;
        R3.f fVarI2 = null;
        boolean zG = false;
        while (cVar.f()) {
            switch (cVar.q(f18058a)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    cVar.c();
                    int iK = -1;
                    while (cVar.f()) {
                        int iQ = cVar.q(f18059b);
                        if (iQ == 0) {
                            iK = cVar.k();
                        } else if (iQ != 1) {
                            cVar.s();
                            cVar.t();
                        } else {
                            cVarG = C1790d.g(cVar, iVar, iK);
                        }
                    }
                    cVar.e();
                    break;
                case 2:
                    dVarH = C1790d.h(cVar, iVar);
                    break;
                case 3:
                    gVar = cVar.k() == 1 ? S3.g.LINEAR : S3.g.RADIAL;
                    break;
                case 4:
                    fVarI = C1790d.i(cVar, iVar);
                    break;
                case 5:
                    fVarI2 = C1790d.i(cVar, iVar);
                    break;
                case 6:
                    fillType = cVar.k() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zG = cVar.g();
                    break;
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        return new S3.e(strM, gVar, fillType, cVarG, dVarH == null ? new R3.d(Collections.singletonList(new Y3.a(100))) : dVarH, fVarI, fVarI2, null, null, zG);
    }
}
