package V3;

import W3.c;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser.java */
/* loaded from: classes.dex */
class J {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18024a = c.a.a("nm", "hd", "it");

    static S3.q a(W3.c cVar, L3.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strM = null;
        boolean zG = false;
        while (cVar.f()) {
            int iQ = cVar.q(f18024a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                zG = cVar.g();
            } else if (iQ != 2) {
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    S3.c cVarA = C1794h.a(cVar, iVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.d();
            }
        }
        return new S3.q(strM, arrayList, zG);
    }
}
