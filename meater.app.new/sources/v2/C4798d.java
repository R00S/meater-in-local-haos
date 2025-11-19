package v2;

import X1.C1808e;
import Y1.e;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AvcConfig.java */
/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4798d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f51127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51129c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51130d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51132f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51133g;

    /* renamed from: h, reason: collision with root package name */
    public final int f51134h;

    /* renamed from: i, reason: collision with root package name */
    public final int f51135i;

    /* renamed from: j, reason: collision with root package name */
    public final int f51136j;

    /* renamed from: k, reason: collision with root package name */
    public final float f51137k;

    /* renamed from: l, reason: collision with root package name */
    public final String f51138l;

    private C4798d(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f51127a = list;
        this.f51128b = i10;
        this.f51129c = i11;
        this.f51130d = i12;
        this.f51131e = i13;
        this.f51132f = i14;
        this.f51133g = i15;
        this.f51134h = i16;
        this.f51135i = i17;
        this.f51136j = i18;
        this.f51137k = f10;
        this.f51138l = str;
    }

    private static byte[] a(X1.y yVar) {
        int iP = yVar.P();
        int iF = yVar.f();
        yVar.X(iP);
        return C1808e.g(yVar.e(), iF, iP);
    }

    public static C4798d b(X1.y yVar) throws ParserException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        String strD;
        int i17;
        try {
            yVar.X(4);
            int iH = (yVar.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = yVar.H() & 31;
            for (int i18 = 0; i18 < iH2; i18++) {
                arrayList.add(a(yVar));
            }
            int iH3 = yVar.H();
            for (int i19 = 0; i19 < iH3; i19++) {
                arrayList.add(a(yVar));
            }
            if (iH2 > 0) {
                e.m mVarZ = Y1.e.z((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarZ.f19290f;
                int i21 = mVarZ.f19291g;
                int i22 = mVarZ.f19293i + 8;
                int i23 = mVarZ.f19294j + 8;
                int i24 = mVarZ.f19301q;
                int i25 = mVarZ.f19302r;
                int i26 = mVarZ.f19303s;
                int i27 = mVarZ.f19304t;
                float f11 = mVarZ.f19292h;
                strD = C1808e.d(mVarZ.f19285a, mVarZ.f19286b, mVarZ.f19287c);
                i16 = i26;
                i17 = i27;
                f10 = f11;
                i13 = i23;
                i14 = i24;
                i15 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                f10 = 1.0f;
                strD = null;
                i17 = 16;
            }
            return new C4798d(arrayList, iH, i10, i11, i12, i13, i14, i15, i16, i17, f10, strD);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
