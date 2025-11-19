package V3;

import W3.c;

/* compiled from: RepeaterParser.java */
/* loaded from: classes.dex */
class E {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18018a = c.a.a("nm", "c", "o", "tr", "hd");

    static S3.m a(W3.c cVar, L3.i iVar) {
        String strM = null;
        R3.b bVarF = null;
        R3.b bVarF2 = null;
        R3.l lVarG = null;
        boolean zG = false;
        while (cVar.f()) {
            int iQ = cVar.q(f18018a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                bVarF = C1790d.f(cVar, iVar, false);
            } else if (iQ == 2) {
                bVarF2 = C1790d.f(cVar, iVar, false);
            } else if (iQ == 3) {
                lVarG = C1789c.g(cVar, iVar);
            } else if (iQ != 4) {
                cVar.t();
            } else {
                zG = cVar.g();
            }
        }
        return new S3.m(strM, bVarF, bVarF2, lVarG, zG);
    }
}
