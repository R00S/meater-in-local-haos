package V3;

import W3.c;
import android.graphics.Path;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes.dex */
class I {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18023a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static S3.p a(W3.c cVar, L3.i iVar) {
        R3.d dVar = null;
        String strM = null;
        R3.a aVarC = null;
        boolean zG = false;
        boolean zG2 = false;
        int iK = 1;
        while (cVar.f()) {
            int iQ = cVar.q(f18023a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                aVarC = C1790d.c(cVar, iVar);
            } else if (iQ == 2) {
                dVar = C1790d.h(cVar, iVar);
            } else if (iQ == 3) {
                zG = cVar.g();
            } else if (iQ == 4) {
                iK = cVar.k();
            } else if (iQ != 5) {
                cVar.s();
                cVar.t();
            } else {
                zG2 = cVar.g();
            }
        }
        if (dVar == null) {
            dVar = new R3.d(Collections.singletonList(new Y3.a(100)));
        }
        return new S3.p(strM, zG, iK == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zG2);
    }
}
