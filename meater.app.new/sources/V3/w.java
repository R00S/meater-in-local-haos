package V3;

import T3.e;
import W3.c;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s.C4411v;
import s.Y;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18075a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static c.a f18076b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f18077c = c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final c.a f18078d = c.a.a("cm", "tm", "dr");

    public static L3.i a(W3.c cVar) {
        HashMap map;
        ArrayList arrayList;
        W3.c cVar2 = cVar;
        float fE = X3.j.e();
        C4411v<T3.e> c4411v = new C4411v<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        Y<Q3.d> y10 = new Y<>();
        L3.i iVar = new L3.i();
        cVar.c();
        float fJ = 0.0f;
        float fJ2 = 0.0f;
        float fJ3 = 0.0f;
        int iK = 0;
        int iK2 = 0;
        while (cVar.f()) {
            switch (cVar2.q(f18075a)) {
                case 0:
                    iK = cVar.k();
                    continue;
                    cVar2 = cVar;
                case 1:
                    iK2 = cVar.k();
                    continue;
                    cVar2 = cVar;
                case 2:
                    fJ = (float) cVar.j();
                    continue;
                    cVar2 = cVar;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fJ2 = ((float) cVar.j()) - 0.01f;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fJ3 = (float) cVar.j();
                    break;
                case 5:
                    String[] strArrSplit = cVar.m().split("\\.");
                    if (!X3.j.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    cVar2 = cVar;
                case 6:
                    e(cVar2, iVar, arrayList2, c4411v);
                    continue;
                    cVar2 = cVar;
                case 7:
                    b(cVar2, iVar, map2, map3);
                    continue;
                    cVar2 = cVar;
                case 8:
                    d(cVar2, map4);
                    continue;
                    cVar2 = cVar;
                case 9:
                    c(cVar2, iVar, y10);
                    continue;
                    cVar2 = cVar;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    f(cVar2, arrayList3);
                    continue;
                    cVar2 = cVar;
                default:
                    cVar.s();
                    cVar.t();
                    continue;
                    cVar2 = cVar;
            }
            map4 = map;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        iVar.s(new Rect(0, 0, (int) (iK * fE), (int) (iK2 * fE)), fJ, fJ2, fJ3, arrayList2, c4411v, map2, map3, X3.j.e(), y10, map4, arrayList3);
        return iVar;
    }

    private static void b(W3.c cVar, L3.i iVar, Map<String, List<T3.e>> map, Map<String, L3.u> map2) {
        cVar.b();
        while (cVar.f()) {
            ArrayList arrayList = new ArrayList();
            C4411v c4411v = new C4411v();
            cVar.c();
            int iK = 0;
            int iK2 = 0;
            String strM = null;
            String strM2 = null;
            String strM3 = null;
            while (cVar.f()) {
                int iQ = cVar.q(f18076b);
                if (iQ == 0) {
                    strM = cVar.m();
                } else if (iQ == 1) {
                    cVar.b();
                    while (cVar.f()) {
                        T3.e eVarB = v.b(cVar, iVar);
                        c4411v.k(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.d();
                } else if (iQ == 2) {
                    iK = cVar.k();
                } else if (iQ == 3) {
                    iK2 = cVar.k();
                } else if (iQ == 4) {
                    strM2 = cVar.m();
                } else if (iQ != 5) {
                    cVar.s();
                    cVar.t();
                } else {
                    strM3 = cVar.m();
                }
            }
            cVar.e();
            if (strM2 != null) {
                L3.u uVar = new L3.u(iK, iK2, strM, strM2, strM3);
                map2.put(uVar.e(), uVar);
            } else {
                map.put(strM, arrayList);
            }
        }
        cVar.d();
    }

    private static void c(W3.c cVar, L3.i iVar, Y<Q3.d> y10) {
        cVar.b();
        while (cVar.f()) {
            Q3.d dVarA = C1799m.a(cVar, iVar);
            y10.n(dVarA.hashCode(), dVarA);
        }
        cVar.d();
    }

    private static void d(W3.c cVar, Map<String, Q3.c> map) {
        cVar.c();
        while (cVar.f()) {
            if (cVar.q(f18077c) != 0) {
                cVar.s();
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    Q3.c cVarA = C1800n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.d();
            }
        }
        cVar.e();
    }

    private static void e(W3.c cVar, L3.i iVar, List<T3.e> list, C4411v<T3.e> c4411v) {
        cVar.b();
        int i10 = 0;
        while (cVar.f()) {
            T3.e eVarB = v.b(cVar, iVar);
            if (eVarB.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(eVarB);
            c4411v.k(eVarB.e(), eVarB);
            if (i10 > 4) {
                X3.d.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.d();
    }

    private static void f(W3.c cVar, List<Q3.h> list) {
        cVar.b();
        while (cVar.f()) {
            cVar.c();
            float fJ = 0.0f;
            String strM = null;
            float fJ2 = 0.0f;
            while (cVar.f()) {
                int iQ = cVar.q(f18078d);
                if (iQ == 0) {
                    strM = cVar.m();
                } else if (iQ == 1) {
                    fJ = (float) cVar.j();
                } else if (iQ != 2) {
                    cVar.s();
                    cVar.t();
                } else {
                    fJ2 = (float) cVar.j();
                }
            }
            cVar.e();
            list.add(new Q3.h(strM, fJ, fJ2));
        }
        cVar.d();
    }
}
