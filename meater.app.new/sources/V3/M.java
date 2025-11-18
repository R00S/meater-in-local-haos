package V3;

import S3.t;
import W3.c;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes.dex */
class M {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18028a = c.a.a("s", "e", "o", "nm", "m", "hd");

    static S3.t a(W3.c cVar, L3.i iVar) {
        String strM = null;
        t.a aVarJ = null;
        R3.b bVarF = null;
        R3.b bVarF2 = null;
        R3.b bVarF3 = null;
        boolean zG = false;
        while (cVar.f()) {
            int iQ = cVar.q(f18028a);
            if (iQ == 0) {
                bVarF = C1790d.f(cVar, iVar, false);
            } else if (iQ == 1) {
                bVarF2 = C1790d.f(cVar, iVar, false);
            } else if (iQ == 2) {
                bVarF3 = C1790d.f(cVar, iVar, false);
            } else if (iQ == 3) {
                strM = cVar.m();
            } else if (iQ == 4) {
                aVarJ = t.a.j(cVar.k());
            } else if (iQ != 5) {
                cVar.t();
            } else {
                zG = cVar.g();
            }
        }
        return new S3.t(strM, aVarJ, bVarF, bVarF2, bVarF3, zG);
    }
}
