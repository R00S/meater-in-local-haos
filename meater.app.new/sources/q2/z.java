package q2;

import U1.G;
import U1.H;
import X1.L;
import android.util.Pair;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.u0;
import java.util.Arrays;

/* compiled from: MappingTrackSelector.java */
/* loaded from: classes.dex */
public abstract class z extends AbstractC4270C {

    /* renamed from: c, reason: collision with root package name */
    private a f47986c;

    /* compiled from: MappingTrackSelector.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f47987a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f47988b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f47989c;

        /* renamed from: d, reason: collision with root package name */
        private final n2.x[] f47990d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f47991e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f47992f;

        /* renamed from: g, reason: collision with root package name */
        private final n2.x f47993g;

        a(String[] strArr, int[] iArr, n2.x[] xVarArr, int[] iArr2, int[][][] iArr3, n2.x xVar) {
            this.f47988b = strArr;
            this.f47989c = iArr;
            this.f47990d = xVarArr;
            this.f47992f = iArr3;
            this.f47991e = iArr2;
            this.f47993g = xVar;
            this.f47987a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f47990d[i10].b(i11).f16862a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f47990d[i10].b(i11).a(iArr[i12]).f17162o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !L.d(str, str2);
                }
                iMin = Math.min(iMin, u0.F(this.f47992f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f47991e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f47992f[i10][i11][i12];
        }

        public int d() {
            return this.f47987a;
        }

        public int e(int i10) {
            return this.f47989c[i10];
        }

        public n2.x f(int i10) {
            return this.f47990d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return u0.T(c(i10, i11, i12));
        }

        public n2.x h() {
            return this.f47993g;
        }
    }

    private static int n(u0[] u0VarArr, H h10, int[] iArr, boolean z10) {
        int length = u0VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < u0VarArr.length; i11++) {
            u0 u0Var = u0VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < h10.f16862a; i12++) {
                iMax = Math.max(iMax, u0.T(u0Var.a(h10.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] o(u0 u0Var, H h10) {
        int[] iArr = new int[h10.f16862a];
        for (int i10 = 0; i10 < h10.f16862a; i10++) {
            iArr[i10] = u0Var.a(h10.a(i10));
        }
        return iArr;
    }

    private static int[] p(u0[] u0VarArr) {
        int length = u0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = u0VarArr[i10].I();
        }
        return iArr;
    }

    @Override // q2.AbstractC4270C
    public final void i(Object obj) {
        this.f47986c = (a) obj;
    }

    @Override // q2.AbstractC4270C
    public final C4271D k(u0[] u0VarArr, n2.x xVar, r.b bVar, G g10) {
        int[] iArr = new int[u0VarArr.length + 1];
        int length = u0VarArr.length + 1;
        H[][] hArr = new H[length][];
        int[][][] iArr2 = new int[u0VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = xVar.f45677a;
            hArr[i10] = new H[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrP = p(u0VarArr);
        for (int i12 = 0; i12 < xVar.f45677a; i12++) {
            H hB = xVar.b(i12);
            int iN = n(u0VarArr, hB, iArr, hB.f16864c == 5);
            int[] iArrO = iN == u0VarArr.length ? new int[hB.f16862a] : o(u0VarArr[iN], hB);
            int i13 = iArr[iN];
            hArr[iN][i13] = hB;
            iArr2[iN][i13] = iArrO;
            iArr[iN] = i13 + 1;
        }
        n2.x[] xVarArr = new n2.x[u0VarArr.length];
        String[] strArr = new String[u0VarArr.length];
        int[] iArr3 = new int[u0VarArr.length];
        for (int i14 = 0; i14 < u0VarArr.length; i14++) {
            int i15 = iArr[i14];
            xVarArr[i14] = new n2.x((H[]) L.V0(hArr[i14], i15));
            iArr2[i14] = (int[][]) L.V0(iArr2[i14], i15);
            strArr[i14] = u0VarArr[i14].getName();
            iArr3[i14] = u0VarArr[i14].l();
        }
        a aVar = new a(strArr, iArr3, xVarArr, iArrP, iArr2, new n2.x((H[]) L.V0(hArr[u0VarArr.length], iArr[u0VarArr.length])));
        Pair<d2.G[], x[]> pairQ = q(aVar, iArr2, iArrP, bVar, g10);
        return new C4271D((d2.G[]) pairQ.first, (x[]) pairQ.second, C4269B.b(aVar, (InterfaceC4268A[]) pairQ.second), aVar);
    }

    protected abstract Pair<d2.G[], x[]> q(a aVar, int[][][] iArr, int[] iArr2, r.b bVar, G g10);
}
