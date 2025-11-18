package V3;

import W3.c;
import java.util.ArrayList;

/* compiled from: FontCharacterParser.java */
/* renamed from: V3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1799m {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18054a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18055b = c.a.a("shapes");

    static Q3.d a(W3.c cVar, L3.i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        double dJ = 0.0d;
        String strM = null;
        String strM2 = null;
        char cCharAt = 0;
        double dJ2 = 0.0d;
        while (cVar.f()) {
            int iQ = cVar.q(f18054a);
            if (iQ == 0) {
                cCharAt = cVar.m().charAt(0);
            } else if (iQ == 1) {
                dJ2 = cVar.j();
            } else if (iQ == 2) {
                dJ = cVar.j();
            } else if (iQ == 3) {
                strM = cVar.m();
            } else if (iQ == 4) {
                strM2 = cVar.m();
            } else if (iQ != 5) {
                cVar.s();
                cVar.t();
            } else {
                cVar.c();
                while (cVar.f()) {
                    if (cVar.q(f18055b) != 0) {
                        cVar.s();
                        cVar.t();
                    } else {
                        cVar.b();
                        while (cVar.f()) {
                            arrayList.add((S3.q) C1794h.a(cVar, iVar));
                        }
                        cVar.d();
                    }
                }
                cVar.e();
            }
        }
        cVar.e();
        return new Q3.d(arrayList, cCharAt, dJ2, dJ, strM, strM2);
    }
}
