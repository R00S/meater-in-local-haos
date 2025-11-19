package Y1;

import U1.C1733i;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.C1808e;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m8.AbstractC4009y;
import o8.C4142b;

/* compiled from: NalUnitUtil.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f19226a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f19227b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f19228c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f19229d = new int[10];

    /* compiled from: NalUnitUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19230a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19231b;

        public a(int i10, int i11) {
            this.f19230a = i10;
            this.f19231b = i11;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19232a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19233b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19234c;

        public b(int i10, int i11, int i12) {
            this.f19232a = i10;
            this.f19233b = i11;
            this.f19234c = i12;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f19235a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19236b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19237c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19238d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f19239e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19240f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f19235a = i10;
            this.f19236b = z10;
            this.f19237c = i11;
            this.f19238d = i12;
            this.f19239e = iArr;
            this.f19240f = i13;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC4009y<c> f19241a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f19242b;

        public d(List<c> list, int[] iArr) {
            this.f19241a = AbstractC4009y.B(list);
            this.f19242b = iArr;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* renamed from: Y1.e$e, reason: collision with other inner class name */
    public static final class C0282e {

        /* renamed from: a, reason: collision with root package name */
        public final int f19243a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19244b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19245c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19246d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19247e;

        public C0282e(int i10, int i11, int i12, int i13, int i14) {
            this.f19243a = i10;
            this.f19244b = i11;
            this.f19245c = i12;
            this.f19246d = i13;
            this.f19247e = i14;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC4009y<C0282e> f19248a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f19249b;

        public f(List<C0282e> list, int[] iArr) {
            this.f19248a = AbstractC4009y.B(list);
            this.f19249b = iArr;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f19250a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19251b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19252c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19253d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19254e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19255f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19256g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19257h;

        /* renamed from: i, reason: collision with root package name */
        public final int f19258i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f19250a = i10;
            this.f19251b = i11;
            this.f19252c = i12;
            this.f19253d = i13;
            this.f19254e = i14;
            this.f19255f = i15;
            this.f19256g = i16;
            this.f19257h = i17;
            this.f19258i = i18;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final b f19259a;

        /* renamed from: b, reason: collision with root package name */
        public final c f19260b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19261c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19262d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19263e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19264f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19265g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19266h;

        /* renamed from: i, reason: collision with root package name */
        public final float f19267i;

        /* renamed from: j, reason: collision with root package name */
        public final int f19268j;

        /* renamed from: k, reason: collision with root package name */
        public final int f19269k;

        /* renamed from: l, reason: collision with root package name */
        public final int f19270l;

        /* renamed from: m, reason: collision with root package name */
        public final int f19271m;

        public h(b bVar, c cVar, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, int i17, int i18, int i19) {
            this.f19259a = bVar;
            this.f19260b = cVar;
            this.f19261c = i10;
            this.f19262d = i11;
            this.f19263e = i12;
            this.f19264f = i13;
            this.f19265g = i14;
            this.f19266h = i15;
            this.f19267i = f10;
            this.f19268j = i16;
            this.f19269k = i17;
            this.f19270l = i18;
            this.f19271m = i19;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final int f19272a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19273b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19274c;

        public i(int i10, int i11, int i12) {
            this.f19272a = i10;
            this.f19273b = i11;
            this.f19274c = i12;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC4009y<i> f19275a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f19276b;

        public j(List<i> list, int[] iArr) {
            this.f19275a = AbstractC4009y.B(list);
            this.f19276b = iArr;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final b f19277a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC4009y<a> f19278b;

        /* renamed from: c, reason: collision with root package name */
        public final d f19279c;

        /* renamed from: d, reason: collision with root package name */
        public final f f19280d;

        /* renamed from: e, reason: collision with root package name */
        public final j f19281e;

        public k(b bVar, List<a> list, d dVar, f fVar, j jVar) {
            this.f19277a = bVar;
            this.f19278b = list != null ? AbstractC4009y.B(list) : AbstractC4009y.G();
            this.f19279c = dVar;
            this.f19280d = fVar;
            this.f19281e = jVar;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final int f19282a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19283b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19284c;

        public l(int i10, int i11, boolean z10) {
            this.f19282a = i10;
            this.f19283b = i11;
            this.f19284c = z10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public final int f19285a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19286b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19287c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19288d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19289e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19290f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19291g;

        /* renamed from: h, reason: collision with root package name */
        public final float f19292h;

        /* renamed from: i, reason: collision with root package name */
        public final int f19293i;

        /* renamed from: j, reason: collision with root package name */
        public final int f19294j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f19295k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f19296l;

        /* renamed from: m, reason: collision with root package name */
        public final int f19297m;

        /* renamed from: n, reason: collision with root package name */
        public final int f19298n;

        /* renamed from: o, reason: collision with root package name */
        public final int f19299o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f19300p;

        /* renamed from: q, reason: collision with root package name */
        public final int f19301q;

        /* renamed from: r, reason: collision with root package name */
        public final int f19302r;

        /* renamed from: s, reason: collision with root package name */
        public final int f19303s;

        /* renamed from: t, reason: collision with root package name */
        public final int f19304t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f19285a = i10;
            this.f19286b = i11;
            this.f19287c = i12;
            this.f19288d = i13;
            this.f19289e = i14;
            this.f19290f = i15;
            this.f19291g = i16;
            this.f19292h = f10;
            this.f19293i = i17;
            this.f19294j = i18;
            this.f19295k = z10;
            this.f19296l = z11;
            this.f19297m = i19;
            this.f19298n = i20;
            this.f19299o = i21;
            this.f19300p = z12;
            this.f19301q = i22;
            this.f19302r = i23;
            this.f19303s = i24;
            this.f19304t = i25;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Y1.e.m A(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.A(byte[], int, int):Y1.e$m");
    }

    private static void B(Y1.f fVar, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean zE = fVar.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !zE) ? i12 == 0 : fVar.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            fVar.i();
                        }
                    }
                    fVar.i();
                    fVar.i();
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void C(Y1.f fVar, boolean z10, int i10) {
        ?? r92;
        ?? r12;
        boolean zE;
        boolean zE2;
        if (z10) {
            boolean zE3 = fVar.e();
            boolean zE4 = fVar.e();
            if (zE3 || zE4) {
                zE = fVar.e();
                if (zE) {
                    fVar.m(19);
                }
                fVar.m(8);
                if (zE) {
                    fVar.m(4);
                }
                fVar.m(15);
                r12 = zE4;
                r92 = zE3;
            } else {
                zE = false;
                r12 = zE4;
                r92 = zE3;
            }
        } else {
            r92 = 0;
            r12 = 0;
            zE = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean zE5 = fVar.e();
            if (!zE5) {
                zE5 = fVar.e();
            }
            if (zE5) {
                fVar.i();
                zE2 = false;
            } else {
                zE2 = fVar.e();
            }
            int i12 = !zE2 ? fVar.i() : 0;
            int i13 = r92 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    fVar.i();
                    fVar.i();
                    if (zE) {
                        fVar.i();
                        fVar.i();
                    }
                    fVar.l();
                }
            }
        }
    }

    private static void D(Y1.f fVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (fVar.e()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        fVar.h();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        fVar.h();
                    }
                } else {
                    fVar.i();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void E(Y1.f fVar) {
        int i10 = fVar.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0 || !fVar.e()) {
                int i14 = fVar.i();
                int i15 = fVar.i();
                int[] iArr2 = new int[i14];
                int i16 = 0;
                while (i16 < i14) {
                    iArr2[i16] = (i16 > 0 ? iArr2[i16 - 1] : 0) - (fVar.i() + 1);
                    fVar.l();
                    i16++;
                }
                int[] iArr3 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr3[i17] = (i17 > 0 ? iArr3[i17 - 1] : 0) + fVar.i() + 1;
                    fVar.l();
                    i17++;
                }
                i11 = i14;
                iArr = iArr2;
                i12 = i15;
                iArrCopyOf = iArr3;
            } else {
                int i18 = i11 + i12;
                int i19 = (1 - ((fVar.e() ? 1 : 0) * 2)) * (fVar.i() + 1);
                int i20 = i18 + 1;
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 <= i18; i21++) {
                    if (fVar.e()) {
                        zArr[i21] = true;
                    } else {
                        zArr[i21] = fVar.e();
                    }
                }
                int[] iArr4 = new int[i20];
                int[] iArr5 = new int[i20];
                int i22 = 0;
                for (int i23 = i12 - 1; i23 >= 0; i23--) {
                    int i24 = iArrCopyOf[i23] + i19;
                    if (i24 < 0 && zArr[i11 + i23]) {
                        iArr4[i22] = i24;
                        i22++;
                    }
                }
                if (i19 < 0 && zArr[i18]) {
                    iArr4[i22] = i19;
                    i22++;
                }
                for (int i25 = 0; i25 < i11; i25++) {
                    int i26 = iArr[i25] + i19;
                    if (i26 < 0 && zArr[i25]) {
                        iArr4[i22] = i26;
                        i22++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i22);
                int i27 = 0;
                for (int i28 = i11 - 1; i28 >= 0; i28--) {
                    int i29 = iArr[i28] + i19;
                    if (i29 > 0 && zArr[i28]) {
                        iArr5[i27] = i29;
                        i27++;
                    }
                }
                if (i19 > 0 && zArr[i18]) {
                    iArr5[i27] = i19;
                    i27++;
                }
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = iArrCopyOf[i30] + i19;
                    if (i31 > 0 && zArr[i11 + i30]) {
                        iArr5[i27] = i31;
                        i27++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i27);
                iArr = iArrCopyOf2;
                i11 = i22;
                i12 = i27;
            }
        }
    }

    private static void F(Y1.f fVar) {
        int i10 = fVar.i() + 1;
        fVar.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            fVar.i();
            fVar.i();
            fVar.l();
        }
        fVar.m(20);
    }

    private static void G(Y1.f fVar, int i10) {
        int iH = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iH != 0) {
                iH = ((fVar.h() + i11) + 256) % 256;
            }
            if (iH != 0) {
                i11 = iH;
            }
        }
    }

    private static void H(Y1.f fVar, int i10, boolean[][] zArr) {
        int i11 = fVar.i() + 2;
        if (fVar.e()) {
            fVar.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        fVar.m(i11);
                    }
                }
            }
        }
        int i14 = fVar.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            fVar.m(8);
        }
    }

    public static int I(byte[] bArr, int i10) {
        int i11;
        synchronized (f19228c) {
            int iG = 0;
            int i12 = 0;
            while (iG < i10) {
                try {
                    iG = g(bArr, iG, i10);
                    if (iG < i10) {
                        int[] iArr = f19229d;
                        if (iArr.length <= i12) {
                            f19229d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f19229d[i12] = iG;
                        iG += 3;
                        i12++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f19229d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(Y1.f fVar) {
        fVar.m(4);
        int iF = fVar.f(3);
        fVar.l();
        c cVarN = n(fVar, true, iF, null);
        return C1808e.f(cVarN.f19235a, cVarN.f19236b, cVarN.f19237c, cVarN.f19238d, cVarN.f19239e, cVarN.f19240f);
    }

    public static int e(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        C1804a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            c(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    c(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static AbstractC4009y<Integer> f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        int i10 = 0;
        while (i10 < bArr.length) {
            int iE = e(bArr, i10, bArr.length, zArr);
            if (iE != bArr.length) {
                aVarY.a(Integer.valueOf(iE));
            }
            i10 = iE + 3;
        }
        return aVarY.k();
    }

    private static int g(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String h(List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                AbstractC4009y<Integer> abstractC4009yF = f(bArr);
                for (int i11 = 0; i11 < abstractC4009yF.size(); i11++) {
                    if (abstractC4009yF.get(i11).intValue() + 3 < length) {
                        Y1.f fVar = new Y1.f(bArr, abstractC4009yF.get(i11).intValue() + 3, length);
                        b bVarM = m(fVar);
                        if (bVarM.f19232a == 33 && bVarM.f19233b == 0) {
                            return d(fVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean k(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & 31;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    public static boolean l(s sVar, byte b10) {
        if ((Objects.equals(sVar.f17162o, "video/avc") || z.b(sVar.f17158k, "video/avc")) && (b10 & 31) == 6) {
            return true;
        }
        return (Objects.equals(sVar.f17162o, "video/hevc") || z.b(sVar.f17158k, "video/hevc")) && ((b10 & 126) >> 1) == 39;
    }

    private static b m(Y1.f fVar) {
        fVar.l();
        return new b(fVar.f(6), fVar.f(6), fVar.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Y1.e.c n(Y1.f r19, boolean r20, int r21, Y1.e.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.f(r5)
            boolean r8 = r19.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r19.e()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f19235a
            boolean r8 = r2.f19236b
            int r9 = r2.f19237c
            int r11 = r2.f19238d
            int[] r4 = r2.f19239e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.f(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r19.e()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r19.e()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.m(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.m(r6)
        L7b:
            Y1.e$c r0 = new Y1.e$c
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.n(Y1.f, boolean, int, Y1.e$c):Y1.e$c");
    }

    private static C0282e o(Y1.f fVar) {
        int i10;
        int i11;
        int iF;
        int iF2 = fVar.f(16);
        int iF3 = fVar.f(16);
        if (fVar.e()) {
            int iF4 = fVar.f(2);
            if (iF4 == 3) {
                fVar.l();
            }
            int iF5 = fVar.f(4);
            iF = fVar.f(4);
            i11 = iF5;
            i10 = iF4;
        } else {
            i10 = 0;
            i11 = 0;
            iF = 0;
        }
        if (fVar.e()) {
            int i12 = fVar.i();
            int i13 = fVar.i();
            int i14 = fVar.i();
            int i15 = fVar.i();
            iF2 = b(iF2, i10, i12, i13);
            iF3 = a(iF3, i10, i14, i15);
        }
        return new C0282e(i10, i11, iF, iF2, iF3);
    }

    private static f p(Y1.f fVar, int i10) {
        int i11 = fVar.i();
        int i12 = i11 + 1;
        AbstractC4009y.a aVarZ = AbstractC4009y.z(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            aVarZ.a(o(fVar));
        }
        int i14 = 1;
        if (i12 <= 1 || !fVar.e()) {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        } else {
            int iD = C4142b.d(i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = fVar.f(iD);
                i14++;
            }
        }
        return new f(aVarZ.k(), iArr);
    }

    public static g q(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 != 0 && i11 > i12) {
            Y1.f fVar = new Y1.f(bArr, i12, i11 + 1);
            while (fVar.c(16)) {
                int iF = fVar.f(8);
                int i13 = 0;
                while (iF == 255) {
                    i13 += 255;
                    iF = fVar.f(8);
                }
                int i14 = i13 + iF;
                int iF2 = fVar.f(8);
                int i15 = 0;
                while (iF2 == 255) {
                    i15 += 255;
                    iF2 = fVar.f(8);
                }
                int i16 = i15 + iF2;
                if (i16 == 0 || !fVar.c(i16)) {
                    break;
                }
                if (i14 == 176) {
                    int i17 = fVar.i();
                    boolean zE = fVar.e();
                    int i18 = zE ? fVar.i() : 0;
                    int i19 = fVar.i();
                    int i20 = -1;
                    int i21 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int iF5 = -1;
                    int iF6 = -1;
                    for (int i22 = 0; i22 <= i19; i22++) {
                        i20 = fVar.i();
                        i21 = fVar.i();
                        iF3 = fVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = fVar.f(iF3 == 0 ? Math.max(0, i17 - 30) : Math.max(0, (iF3 + i17) - 31));
                        if (zE) {
                            iF5 = fVar.f(6);
                            if (iF5 == 63) {
                                return null;
                            }
                            iF6 = fVar.f(iF5 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (iF5 + i18) - 31));
                        }
                        if (fVar.e()) {
                            fVar.m(10);
                        }
                    }
                    return new g(i17, i18, i19 + 1, i20, i21, iF3, iF4, iF5, iF6);
                }
            }
        }
        return null;
    }

    public static h r(byte[] bArr, int i10, int i11, k kVar) {
        return s(bArr, i10 + 2, i11, m(new Y1.f(bArr, i10, i11)), kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Y1.e.h s(byte[] r20, int r21, int r22, Y1.e.b r23, Y1.e.k r24) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.s(byte[], int, int, Y1.e$b, Y1.e$k):Y1.e$h");
    }

    private static i t(Y1.f fVar) {
        fVar.m(3);
        int i10 = fVar.e() ? 1 : 2;
        int iJ = C1733i.j(fVar.f(8));
        int iK = C1733i.k(fVar.f(8));
        fVar.m(8);
        return new i(iJ, i10, iK);
    }

    private static j u(Y1.f fVar, int i10, int i11, int[] iArr) {
        if (!fVar.e() ? fVar.e() : true) {
            fVar.l();
        }
        boolean zE = fVar.e();
        boolean zE2 = fVar.e();
        if (zE || zE2) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    boolean zE3 = zE ? fVar.e() : false;
                    boolean zE4 = zE2 ? fVar.e() : false;
                    if (zE3) {
                        fVar.m(32);
                    }
                    if (zE4) {
                        fVar.m(18);
                    }
                }
            }
        }
        boolean zE5 = fVar.e();
        int iF = zE5 ? fVar.f(4) + 1 : i10;
        AbstractC4009y.a aVarZ = AbstractC4009y.z(iF);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < iF; i14++) {
            aVarZ.a(t(fVar));
        }
        if (zE5 && iF > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = fVar.f(4);
            }
        }
        return new j(aVarZ.k(), iArr2);
    }

    public static k v(byte[] bArr, int i10, int i11) {
        Y1.f fVar = new Y1.f(bArr, i10, i11);
        return w(fVar, m(fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0546 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Y1.e.k w(Y1.f r37, Y1.e.b r38) {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.w(Y1.f, Y1.e$b):Y1.e$k");
    }

    public static l x(byte[] bArr, int i10, int i11) {
        return y(bArr, i10 + 1, i11);
    }

    public static l y(byte[] bArr, int i10, int i11) {
        Y1.f fVar = new Y1.f(bArr, i10, i11);
        int i12 = fVar.i();
        int i13 = fVar.i();
        fVar.l();
        return new l(i12, i13, fVar.e());
    }

    public static m z(byte[] bArr, int i10, int i11) {
        return A(bArr, i10 + 1, i11);
    }
}
