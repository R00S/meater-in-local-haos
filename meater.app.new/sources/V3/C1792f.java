package V3;

import W3.c;
import android.graphics.PointF;

/* compiled from: CircleShapeParser.java */
/* renamed from: V3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1792f {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18036a = c.a.a("nm", "p", "s", "hd", "d");

    static S3.b a(W3.c cVar, L3.i iVar, int i10) {
        boolean z10 = i10 == 3;
        boolean zG = false;
        String strM = null;
        R3.m<PointF, PointF> mVarB = null;
        R3.f fVarI = null;
        while (cVar.f()) {
            int iQ = cVar.q(f18036a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                mVarB = C1787a.b(cVar, iVar);
            } else if (iQ == 2) {
                fVarI = C1790d.i(cVar, iVar);
            } else if (iQ == 3) {
                zG = cVar.g();
            } else if (iQ != 4) {
                cVar.s();
                cVar.t();
            } else {
                z10 = cVar.k() == 3;
            }
        }
        return new S3.b(strM, mVarB, fVarI, z10, zG);
    }
}
