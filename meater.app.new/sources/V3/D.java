package V3;

import W3.c;
import android.graphics.PointF;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18017a = c.a.a("nm", "p", "s", "r", "hd");

    static S3.l a(W3.c cVar, L3.i iVar) {
        String strM = null;
        R3.m<PointF, PointF> mVarB = null;
        R3.f fVarI = null;
        R3.b bVarE = null;
        boolean zG = false;
        while (cVar.f()) {
            int iQ = cVar.q(f18017a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                mVarB = C1787a.b(cVar, iVar);
            } else if (iQ == 2) {
                fVarI = C1790d.i(cVar, iVar);
            } else if (iQ == 3) {
                bVarE = C1790d.e(cVar, iVar);
            } else if (iQ != 4) {
                cVar.t();
            } else {
                zG = cVar.g();
            }
        }
        return new S3.l(strM, mVarB, fVarI, bVarE, zG);
    }
}
