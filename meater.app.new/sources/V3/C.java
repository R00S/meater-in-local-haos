package V3;

import S3.k;
import W3.c;
import android.graphics.PointF;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18016a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static S3.k a(W3.c cVar, L3.i iVar, int i10) {
        boolean zG = false;
        boolean z10 = i10 == 3;
        String strM = null;
        k.a aVarJ = null;
        R3.b bVarF = null;
        R3.m<PointF, PointF> mVarB = null;
        R3.b bVarF2 = null;
        R3.b bVarE = null;
        R3.b bVarE2 = null;
        R3.b bVarF3 = null;
        R3.b bVarF4 = null;
        while (cVar.f()) {
            switch (cVar.q(f18016a)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    aVarJ = k.a.j(cVar.k());
                    break;
                case 2:
                    bVarF = C1790d.f(cVar, iVar, false);
                    break;
                case 3:
                    mVarB = C1787a.b(cVar, iVar);
                    break;
                case 4:
                    bVarF2 = C1790d.f(cVar, iVar, false);
                    break;
                case 5:
                    bVarE2 = C1790d.e(cVar, iVar);
                    break;
                case 6:
                    bVarF4 = C1790d.f(cVar, iVar, false);
                    break;
                case 7:
                    bVarE = C1790d.e(cVar, iVar);
                    break;
                case 8:
                    bVarF3 = C1790d.f(cVar, iVar, false);
                    break;
                case 9:
                    zG = cVar.g();
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (cVar.k() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        return new S3.k(strM, aVarJ, bVarF, mVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zG, z10);
    }
}
