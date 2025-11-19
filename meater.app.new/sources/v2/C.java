package v2;

import X1.C1808e;
import Y1.e;
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig.java */
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f51016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51019d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51021f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51022g;

    /* renamed from: h, reason: collision with root package name */
    public final int f51023h;

    /* renamed from: i, reason: collision with root package name */
    public final int f51024i;

    /* renamed from: j, reason: collision with root package name */
    public final int f51025j;

    /* renamed from: k, reason: collision with root package name */
    public final float f51026k;

    /* renamed from: l, reason: collision with root package name */
    public final int f51027l;

    /* renamed from: m, reason: collision with root package name */
    public final String f51028m;

    /* renamed from: n, reason: collision with root package name */
    public final e.k f51029n;

    private C(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, String str, e.k kVar) {
        this.f51016a = list;
        this.f51017b = i10;
        this.f51018c = i11;
        this.f51019d = i12;
        this.f51020e = i13;
        this.f51021f = i14;
        this.f51022g = i15;
        this.f51023h = i16;
        this.f51024i = i17;
        this.f51025j = i18;
        this.f51026k = f10;
        this.f51027l = i19;
        this.f51028m = str;
        this.f51029n = kVar;
    }

    public static C a(X1.y yVar) {
        return b(yVar, false, null);
    }

    private static C b(X1.y yVar, boolean z10, e.k kVar) throws ParserException {
        int i10;
        int i11;
        e.g gVarQ;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            if (z10) {
                yVar.X(4);
            } else {
                yVar.X(21);
            }
            int iH = yVar.H() & 3;
            int iH2 = yVar.H();
            int iF = yVar.f();
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < iH2; i18++) {
                yVar.X(1);
                int iP = yVar.P();
                for (int i19 = 0; i19 < iP; i19++) {
                    int iP2 = yVar.P();
                    i17 += iP2 + 4;
                    yVar.X(iP2);
                }
            }
            yVar.W(iF);
            byte[] bArr = new byte[i17];
            e.k kVar2 = kVar;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            float f10 = 1.0f;
            String strF = null;
            int i29 = 0;
            int i30 = 0;
            while (i29 < iH2) {
                int iH3 = yVar.H() & 63;
                int iP3 = yVar.P();
                int i31 = i16;
                e.k kVarV = kVar2;
                while (i31 < iP3) {
                    int iP4 = yVar.P();
                    byte[] bArr2 = Y1.e.f19226a;
                    int i32 = iH2;
                    System.arraycopy(bArr2, i16, bArr, i30, bArr2.length);
                    int length = i30 + bArr2.length;
                    System.arraycopy(yVar.e(), yVar.f(), bArr, length, iP4);
                    if (iH3 == 32 && i31 == 0) {
                        kVarV = Y1.e.v(bArr, length, length + iP4);
                        i11 = i16;
                        i10 = iP3;
                    } else if (iH3 == 33 && i31 == 0) {
                        e.h hVarR = Y1.e.r(bArr, length, length + iP4, kVarV);
                        int i33 = hVarR.f19265g;
                        int i34 = hVarR.f19266h;
                        i22 = hVarR.f19262d + 8;
                        i23 = hVarR.f19263e + 8;
                        int i35 = hVarR.f19269k;
                        int i36 = hVarR.f19270l;
                        int i37 = hVarR.f19271m;
                        float f11 = hVarR.f19267i;
                        int i38 = hVarR.f19268j;
                        e.c cVar = hVarR.f19260b;
                        if (cVar != null) {
                            i12 = i38;
                            i13 = i35;
                            i10 = iP3;
                            i14 = i33;
                            i15 = i34;
                            strF = C1808e.f(cVar.f19235a, cVar.f19236b, cVar.f19237c, cVar.f19238d, cVar.f19239e, cVar.f19240f);
                        } else {
                            i12 = i38;
                            i13 = i35;
                            i10 = iP3;
                            i14 = i33;
                            i15 = i34;
                        }
                        i20 = i14;
                        i21 = i15;
                        i11 = 0;
                        i25 = i36;
                        i24 = i13;
                        i28 = i12;
                        f10 = f11;
                        i26 = i37;
                    } else {
                        i10 = iP3;
                        if (iH3 != 39 || i31 != 0 || (gVarQ = Y1.e.q(bArr, length, length + iP4)) == null || kVarV == null) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            i27 = gVarQ.f19253d == kVarV.f19278b.get(0).f19231b ? 4 : 5;
                        }
                    }
                    i30 = length + iP4;
                    yVar.X(iP4);
                    i31++;
                    iP3 = i10;
                    i16 = i11;
                    iH2 = i32;
                }
                i29++;
                kVar2 = kVarV;
            }
            return new C(i17 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iH + 1, i20, i21, i22, i23, i24, i25, i26, i27, f10, i28, strF, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw ParserException.a(sb2.toString(), e10);
        }
    }

    public static C c(X1.y yVar, e.k kVar) {
        return b(yVar, true, kVar);
    }
}
