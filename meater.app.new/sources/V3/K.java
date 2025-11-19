package V3;

import W3.c;

/* compiled from: ShapePathParser.java */
/* loaded from: classes.dex */
class K {

    /* renamed from: a, reason: collision with root package name */
    static c.a f18025a = c.a.a("nm", "ind", "ks", "hd");

    static S3.r a(W3.c cVar, L3.i iVar) {
        String strM = null;
        int iK = 0;
        boolean zG = false;
        R3.h hVarK = null;
        while (cVar.f()) {
            int iQ = cVar.q(f18025a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                iK = cVar.k();
            } else if (iQ == 2) {
                hVarK = C1790d.k(cVar, iVar);
            } else if (iQ != 3) {
                cVar.t();
            } else {
                zG = cVar.g();
            }
        }
        return new S3.r(strM, iK, hVarK, zG);
    }
}
