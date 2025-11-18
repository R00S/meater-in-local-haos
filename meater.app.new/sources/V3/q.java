package V3;

import S3.s;
import W3.c;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: GradientStrokeParser.java */
/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18060a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18061b = c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f18062c = c.a.a("n", "v");

    static S3.f a(W3.c cVar, L3.i iVar) {
        String str;
        R3.c cVar2;
        ArrayList arrayList = new ArrayList();
        float fJ = 0.0f;
        String strM = null;
        S3.g gVar = null;
        R3.c cVarG = null;
        R3.f fVarI = null;
        R3.f fVarI2 = null;
        R3.b bVarE = null;
        s.b bVar = null;
        s.c cVar3 = null;
        R3.b bVar2 = null;
        boolean zG = false;
        R3.d dVar = null;
        while (cVar.f()) {
            switch (cVar.q(f18060a)) {
                case 0:
                    strM = cVar.m();
                    continue;
                case 1:
                    str = strM;
                    cVar.c();
                    int iK = -1;
                    while (cVar.f()) {
                        int iQ = cVar.q(f18061b);
                        if (iQ != 0) {
                            cVar2 = cVarG;
                            if (iQ != 1) {
                                cVar.s();
                                cVar.t();
                            } else {
                                cVarG = C1790d.g(cVar, iVar, iK);
                            }
                        } else {
                            cVar2 = cVarG;
                            iK = cVar.k();
                        }
                        cVarG = cVar2;
                    }
                    cVar.e();
                    break;
                case 2:
                    dVar = C1790d.h(cVar, iVar);
                    continue;
                case 3:
                    str = strM;
                    gVar = cVar.k() == 1 ? S3.g.LINEAR : S3.g.RADIAL;
                    break;
                case 4:
                    fVarI = C1790d.i(cVar, iVar);
                    continue;
                case 5:
                    fVarI2 = C1790d.i(cVar, iVar);
                    continue;
                case 6:
                    bVarE = C1790d.e(cVar, iVar);
                    continue;
                case 7:
                    str = strM;
                    bVar = s.b.values()[cVar.k() - 1];
                    break;
                case 8:
                    str = strM;
                    cVar3 = s.c.values()[cVar.k() - 1];
                    break;
                case 9:
                    str = strM;
                    fJ = (float) cVar.j();
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    zG = cVar.g();
                    continue;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        String strM2 = null;
                        R3.b bVarE2 = null;
                        while (cVar.f()) {
                            int iQ2 = cVar.q(f18062c);
                            if (iQ2 != 0) {
                                R3.b bVar3 = bVar2;
                                if (iQ2 != 1) {
                                    cVar.s();
                                    cVar.t();
                                } else {
                                    bVarE2 = C1790d.e(cVar, iVar);
                                }
                                bVar2 = bVar3;
                            } else {
                                strM2 = cVar.m();
                            }
                        }
                        R3.b bVar4 = bVar2;
                        cVar.e();
                        if (strM2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strM2.equals("d") || strM2.equals("g")) {
                                iVar.u(true);
                                arrayList.add(bVarE2);
                            }
                            bVar2 = bVar4;
                        }
                    }
                    R3.b bVar5 = bVar2;
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((R3.b) arrayList.get(0));
                    }
                    bVar2 = bVar5;
                    continue;
                    break;
                default:
                    cVar.s();
                    cVar.t();
                    continue;
            }
            strM = str;
        }
        String str2 = strM;
        if (dVar == null) {
            dVar = new R3.d(Collections.singletonList(new Y3.a(100)));
        }
        return new S3.f(str2, gVar, cVarG, dVar, fVarI, fVarI2, bVarE, bVar, cVar3, fJ, arrayList, bVar2, zG);
    }
}
