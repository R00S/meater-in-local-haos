package V3;

import W3.c;

/* compiled from: FontParser.java */
/* renamed from: V3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1800n {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18056a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static Q3.c a(W3.c cVar) {
        cVar.c();
        String strM = null;
        String strM2 = null;
        float fJ = 0.0f;
        String strM3 = null;
        while (cVar.f()) {
            int iQ = cVar.q(f18056a);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                strM3 = cVar.m();
            } else if (iQ == 2) {
                strM2 = cVar.m();
            } else if (iQ != 3) {
                cVar.s();
                cVar.t();
            } else {
                fJ = (float) cVar.j();
            }
        }
        cVar.e();
        return new Q3.c(strM, strM3, strM2, fJ);
    }
}
