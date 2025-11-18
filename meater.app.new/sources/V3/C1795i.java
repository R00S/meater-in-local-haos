package V3;

import Q3.b;
import W3.c;
import android.graphics.PointF;

/* compiled from: DocumentDataParser.java */
/* renamed from: V3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1795i implements N<Q3.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1795i f18039a = new C1795i();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18040b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C1795i() {
    }

    @Override // V3.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Q3.b a(W3.c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.c();
        b.a aVar2 = aVar;
        String strM = null;
        String strM2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fJ = 0.0f;
        float fJ2 = 0.0f;
        float fJ3 = 0.0f;
        float fJ4 = 0.0f;
        int iK = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zG = true;
        while (cVar.f()) {
            switch (cVar.q(f18040b)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    strM2 = cVar.m();
                    break;
                case 2:
                    fJ = (float) cVar.j();
                    break;
                case 3:
                    int iK2 = cVar.k();
                    aVar2 = b.a.CENTER;
                    if (iK2 <= aVar2.ordinal() && iK2 >= 0) {
                        aVar2 = b.a.values()[iK2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    iK = cVar.k();
                    break;
                case 5:
                    fJ2 = (float) cVar.j();
                    break;
                case 6:
                    fJ3 = (float) cVar.j();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fJ4 = (float) cVar.j();
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    zG = cVar.g();
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    cVar.b();
                    PointF pointF3 = new PointF(((float) cVar.j()) * f10, ((float) cVar.j()) * f10);
                    cVar.d();
                    pointF = pointF3;
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    cVar.b();
                    PointF pointF4 = new PointF(((float) cVar.j()) * f10, ((float) cVar.j()) * f10);
                    cVar.d();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        return new Q3.b(strM, strM2, fJ, aVar2, iK, fJ2, fJ3, iD, iD2, fJ4, zG, pointF, pointF2);
    }
}
