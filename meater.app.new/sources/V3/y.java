package V3;

import S3.j;
import W3.c;

/* compiled from: MergePathsParser.java */
/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18079a = c.a.a("nm", "mm", "hd");

    static S3.j a(W3.c cVar) {
        String strM = null;
        boolean zG = false;
        j.a aVarJ = null;
        while (cVar.f()) {
            int iQ = cVar.q(f18079a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                aVarJ = j.a.j(cVar.k());
            } else if (iQ != 2) {
                cVar.s();
                cVar.t();
            } else {
                zG = cVar.g();
            }
        }
        return new S3.j(strM, aVarJ, zG);
    }
}
