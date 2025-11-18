package V3;

import W3.c;

/* compiled from: BlurEffectParser.java */
/* renamed from: V3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1791e {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18034a = c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18035b = c.a.a("ty", "v");

    private static S3.a a(W3.c cVar, L3.i iVar) {
        cVar.c();
        S3.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.f()) {
                int iQ = cVar.q(f18035b);
                if (iQ != 0) {
                    if (iQ != 1) {
                        cVar.s();
                        cVar.t();
                    } else if (z10) {
                        aVar = new S3.a(C1790d.e(cVar, iVar));
                    } else {
                        cVar.t();
                    }
                } else if (cVar.k() == 0) {
                    z10 = true;
                }
            }
            cVar.e();
            return aVar;
        }
    }

    static S3.a b(W3.c cVar, L3.i iVar) {
        S3.a aVar = null;
        while (cVar.f()) {
            if (cVar.q(f18034a) != 0) {
                cVar.s();
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    S3.a aVarA = a(cVar, iVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.d();
            }
        }
        return aVar;
    }
}
