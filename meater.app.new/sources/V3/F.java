package V3;

import W3.c;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18019a = c.a.a("nm", "r", "hd");

    static S3.n a(W3.c cVar, L3.i iVar) {
        boolean zG = false;
        String strM = null;
        R3.b bVarF = null;
        while (cVar.f()) {
            int iQ = cVar.q(f18019a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                bVarF = C1790d.f(cVar, iVar, true);
            } else if (iQ != 2) {
                cVar.t();
            } else {
                zG = cVar.g();
            }
        }
        if (zG) {
            return null;
        }
        return new S3.n(strM, bVarF);
    }
}
