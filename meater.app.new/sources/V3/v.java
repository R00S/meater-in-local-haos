package V3;

import T3.e;
import W3.c;
import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18071a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18072b = c.a.a("d", "a");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f18073c = c.a.a("ty", "nm");

    /* compiled from: LayerParser.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18074a;

        static {
            int[] iArr = new int[e.b.values().length];
            f18074a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18074a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static T3.e a(L3.i iVar) {
        Rect rectB = iVar.b();
        return new T3.e(Collections.emptyList(), iVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new R3.l(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null, S3.h.NORMAL);
    }

    public static T3.e b(W3.c cVar, L3.i iVar) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        e.b bVar = e.b.NONE;
        S3.h hVar = S3.h.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.c();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        e.b bVar2 = bVar;
        S3.h hVar2 = hVar;
        e.a aVar = null;
        String strM = null;
        R3.j jVarD = null;
        R3.k kVarA = null;
        R3.b bVarF = null;
        S3.a aVarB = null;
        C1796j c1796jB = null;
        long jK = 0;
        boolean z11 = false;
        int iK = 0;
        int iK2 = 0;
        int color = 0;
        boolean zG = false;
        float fJ = 0.0f;
        float fJ2 = 0.0f;
        float fJ3 = 0.0f;
        float fJ4 = 0.0f;
        float f11 = 0.0f;
        long jK2 = -1;
        float fJ5 = 1.0f;
        String strM2 = "UNSET";
        String strM3 = null;
        R3.l lVar = null;
        while (cVar.f()) {
            switch (cVar.q(f18071a)) {
                case 0:
                    strM2 = cVar.m();
                    break;
                case 1:
                    jK = cVar.k();
                    break;
                case 2:
                    strM = cVar.m();
                    break;
                case 3:
                    int iK3 = cVar.k();
                    aVar = e.a.UNKNOWN;
                    if (iK3 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[iK3];
                        break;
                    }
                case 4:
                    jK2 = cVar.k();
                    break;
                case 5:
                    iK = (int) (cVar.k() * X3.j.e());
                    break;
                case 6:
                    iK2 = (int) (cVar.k() * X3.j.e());
                    break;
                case 7:
                    color = Color.parseColor(cVar.m());
                    break;
                case 8:
                    lVar = C1789c.g(cVar, iVar);
                    break;
                case 9:
                    int iK4 = cVar.k();
                    if (iK4 < e.b.values().length) {
                        bVar2 = e.b.values()[iK4];
                        int i10 = a.f18074a[bVar2.ordinal()];
                        if (i10 == 1) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        iVar.r(1);
                        break;
                    } else {
                        iVar.a("Unsupported matte type: " + iK4);
                        break;
                    }
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    cVar.b();
                    while (cVar.f()) {
                        arrayList2.add(x.a(cVar, iVar));
                    }
                    iVar.r(arrayList2.size());
                    cVar.d();
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    cVar.b();
                    while (cVar.f()) {
                        S3.c cVarA = C1794h.a(cVar, iVar);
                        if (cVarA != null) {
                            arrayList3.add(cVarA);
                        }
                    }
                    cVar.d();
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    cVar.c();
                    while (cVar.f()) {
                        int iQ = cVar.q(f18072b);
                        if (iQ == 0) {
                            jVarD = C1790d.d(cVar, iVar);
                        } else if (iQ != 1) {
                            cVar.s();
                            cVar.t();
                        } else {
                            cVar.b();
                            if (cVar.f()) {
                                kVarA = C1788b.a(cVar, iVar);
                            }
                            while (cVar.f()) {
                                cVar.t();
                            }
                            cVar.d();
                        }
                    }
                    cVar.e();
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    cVar.b();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.f()) {
                        cVar.c();
                        while (cVar.f()) {
                            int iQ2 = cVar.q(f18073c);
                            if (iQ2 == 0) {
                                int iK5 = cVar.k();
                                if (iK5 == 29) {
                                    aVarB = C1791e.b(cVar, iVar);
                                } else if (iK5 == 25) {
                                    c1796jB = new C1797k().b(cVar, iVar);
                                }
                            } else if (iQ2 != 1) {
                                cVar.s();
                                cVar.t();
                            } else {
                                arrayList4.add(cVar.m());
                            }
                        }
                        cVar.e();
                    }
                    cVar.d();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    fJ5 = (float) cVar.j();
                    break;
                case 15:
                    fJ2 = (float) cVar.j();
                    break;
                case 16:
                    fJ3 = (float) (cVar.j() * X3.j.e());
                    break;
                case 17:
                    fJ4 = (float) (cVar.j() * X3.j.e());
                    break;
                case 18:
                    fJ = (float) cVar.j();
                    break;
                case 19:
                    f11 = (float) cVar.j();
                    break;
                case 20:
                    bVarF = C1790d.f(cVar, iVar, false);
                    break;
                case 21:
                    strM3 = cVar.m();
                    break;
                case 22:
                    zG = cVar.g();
                    break;
                case 23:
                    if (cVar.k() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case 24:
                    int iK6 = cVar.k();
                    if (iK6 < S3.h.values().length) {
                        hVar2 = S3.h.values()[iK6];
                        break;
                    } else {
                        iVar.a("Unsupported Blend Mode: " + iK6);
                        hVar2 = S3.h.NORMAL;
                        break;
                    }
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        ArrayList arrayList5 = new ArrayList();
        if (fJ > 0.0f) {
            arrayList = arrayList2;
            z10 = z11;
            arrayList5.add(new Y3.a(iVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fJ)));
            f10 = 0.0f;
        } else {
            arrayList = arrayList2;
            z10 = z11;
            f10 = 0.0f;
        }
        if (f11 <= f10) {
            f11 = iVar.f();
        }
        arrayList5.add(new Y3.a(iVar, fValueOf2, fValueOf2, null, fJ, Float.valueOf(f11)));
        arrayList5.add(new Y3.a(iVar, fValueOf, fValueOf, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (strM2.endsWith(".ai") || "ai".equals(strM3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (lVar == null) {
                lVar = new R3.l();
            }
            lVar.m(z10);
        }
        return new T3.e(arrayList3, iVar, strM2, jK, aVar, jK2, strM, arrayList, lVar, iK, iK2, color, fJ5, fJ2, fJ3, fJ4, jVarD, kVarA, arrayList5, bVar2, bVarF, zG, aVarB, c1796jB, hVar2);
    }
}
