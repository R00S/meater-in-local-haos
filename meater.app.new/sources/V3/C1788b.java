package V3;

import W3.c;

/* compiled from: AnimatableTextPropertiesParser.java */
/* renamed from: V3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1788b {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18030a = c.a.a("a");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18031b = c.a.a("fc", "sc", "sw", "t");

    public static R3.k a(W3.c cVar, L3.i iVar) {
        cVar.c();
        R3.k kVarB = null;
        while (cVar.f()) {
            if (cVar.q(f18030a) != 0) {
                cVar.s();
                cVar.t();
            } else {
                kVarB = b(cVar, iVar);
            }
        }
        cVar.e();
        return kVarB == null ? new R3.k(null, null, null, null) : kVarB;
    }

    private static R3.k b(W3.c cVar, L3.i iVar) {
        cVar.c();
        R3.a aVarC = null;
        R3.a aVarC2 = null;
        R3.b bVarE = null;
        R3.b bVarE2 = null;
        while (cVar.f()) {
            int iQ = cVar.q(f18031b);
            if (iQ == 0) {
                aVarC = C1790d.c(cVar, iVar);
            } else if (iQ == 1) {
                aVarC2 = C1790d.c(cVar, iVar);
            } else if (iQ == 2) {
                bVarE = C1790d.e(cVar, iVar);
            } else if (iQ != 3) {
                cVar.s();
                cVar.t();
            } else {
                bVarE2 = C1790d.e(cVar, iVar);
            }
        }
        cVar.e();
        return new R3.k(aVarC, aVarC2, bVarE, bVarE2);
    }
}
