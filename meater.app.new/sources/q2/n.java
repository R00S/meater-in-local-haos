package q2;

import U1.C1727c;
import U1.H;
import U1.I;
import U1.J;
import X1.C1804a;
import X1.L;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.t0;
import androidx.media3.exoplayer.u0;
import f2.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import m8.AbstractC3999n;
import m8.AbstractC4009y;
import m8.U;
import q2.C4272a;
import q2.n;
import q2.x;
import q2.z;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes.dex */
public class n extends z implements u0.a {

    /* renamed from: k, reason: collision with root package name */
    private static final U<Integer> f47854k = U.b(new Comparator() { // from class: q2.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.T((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final Object f47855d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f47856e;

    /* renamed from: f, reason: collision with root package name */
    private final x.b f47857f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f47858g;

    /* renamed from: h, reason: collision with root package name */
    private e f47859h;

    /* renamed from: i, reason: collision with root package name */
    private g f47860i;

    /* renamed from: j, reason: collision with root package name */
    private C1727c f47861j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    static final class b extends i<b> implements Comparable<b> {

        /* renamed from: F, reason: collision with root package name */
        private final int f47862F;

        /* renamed from: G, reason: collision with root package name */
        private final boolean f47863G;

        /* renamed from: H, reason: collision with root package name */
        private final String f47864H;

        /* renamed from: I, reason: collision with root package name */
        private final e f47865I;

        /* renamed from: J, reason: collision with root package name */
        private final boolean f47866J;

        /* renamed from: K, reason: collision with root package name */
        private final int f47867K;

        /* renamed from: L, reason: collision with root package name */
        private final int f47868L;

        /* renamed from: M, reason: collision with root package name */
        private final int f47869M;

        /* renamed from: N, reason: collision with root package name */
        private final boolean f47870N;

        /* renamed from: O, reason: collision with root package name */
        private final boolean f47871O;

        /* renamed from: P, reason: collision with root package name */
        private final int f47872P;

        /* renamed from: Q, reason: collision with root package name */
        private final int f47873Q;

        /* renamed from: R, reason: collision with root package name */
        private final boolean f47874R;

        /* renamed from: S, reason: collision with root package name */
        private final int f47875S;

        /* renamed from: T, reason: collision with root package name */
        private final int f47876T;

        /* renamed from: U, reason: collision with root package name */
        private final int f47877U;

        /* renamed from: V, reason: collision with root package name */
        private final int f47878V;

        /* renamed from: W, reason: collision with root package name */
        private final boolean f47879W;

        /* renamed from: X, reason: collision with root package name */
        private final boolean f47880X;

        /* renamed from: Y, reason: collision with root package name */
        private final boolean f47881Y;

        public b(int i10, H h10, int i11, e eVar, int i12, boolean z10, l8.n<U1.s> nVar, int i13) {
            int i14;
            int iH;
            int iH2;
            super(i10, h10, i11);
            this.f47865I = eVar;
            int i15 = eVar.f47916s0 ? 24 : 16;
            this.f47870N = eVar.f47912o0 && (i13 & i15) != 0;
            this.f47864H = n.Y(this.f47965E.f17151d);
            this.f47866J = u0.s(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f16919n.size()) {
                    iH = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iH = n.H(this.f47965E, eVar.f16919n.get(i16), false);
                    if (iH > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f47868L = i16;
            this.f47867K = iH;
            this.f47869M = n.K(this.f47965E.f17153f, eVar.f16920o);
            U1.s sVar = this.f47965E;
            int i17 = sVar.f17153f;
            this.f47871O = i17 == 0 || (i17 & 1) != 0;
            this.f47874R = (sVar.f17152e & 1) != 0;
            this.f47881Y = n.O(sVar);
            U1.s sVar2 = this.f47965E;
            int i18 = sVar2.f17137D;
            this.f47875S = i18;
            this.f47876T = sVar2.f17138E;
            int i19 = sVar2.f17157j;
            this.f47877U = i19;
            this.f47863G = (i19 == -1 || i19 <= eVar.f16922q) && (i18 == -1 || i18 <= eVar.f16921p) && nVar.apply(sVar2);
            String[] strArrO0 = L.o0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrO0.length) {
                    iH2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    iH2 = n.H(this.f47965E, strArrO0[i20], false);
                    if (iH2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f47872P = i20;
            this.f47873Q = iH2;
            int i21 = 0;
            while (true) {
                if (i21 < eVar.f16923r.size()) {
                    String str = this.f47965E.f17162o;
                    if (str != null && str.equals(eVar.f16923r.get(i21))) {
                        i14 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f47878V = i14;
            this.f47879W = u0.q(i12) == 128;
            this.f47880X = u0.x(i12) == 64;
            this.f47862F = t(i12, z10, i15);
        }

        public static int n(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC4009y<b> s(int i10, H h10, e eVar, int[] iArr, boolean z10, l8.n<U1.s> nVar, int i11) {
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            for (int i12 = 0; i12 < h10.f16862a; i12++) {
                aVarY.a(new b(i10, h10, i12, eVar, iArr[i12], z10, nVar, i11));
            }
            return aVarY.k();
        }

        private int t(int i10, boolean z10, int i11) {
            if (!u0.s(i10, this.f47865I.f47918u0)) {
                return 0;
            }
            if (!this.f47863G && !this.f47865I.f47911n0) {
                return 0;
            }
            e eVar = this.f47865I;
            if (eVar.f16924s.f16936a == 2 && !n.Z(eVar, i10, this.f47965E)) {
                return 0;
            }
            if (u0.s(i10, false) && this.f47863G && this.f47965E.f17157j != -1) {
                e eVar2 = this.f47865I;
                if (!eVar2.f16931z && !eVar2.f16930y && ((eVar2.f47920w0 || !z10) && eVar2.f16924s.f16936a != 2 && (i10 & i11) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q2.n.i
        public int c() {
            return this.f47862F;
        }

        @Override // java.lang.Comparable
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            U uG = (this.f47863G && this.f47866J) ? n.f47854k : n.f47854k.g();
            AbstractC3999n abstractC3999nF = AbstractC3999n.j().g(this.f47866J, bVar.f47866J).f(Integer.valueOf(this.f47868L), Integer.valueOf(bVar.f47868L), U.d().g()).d(this.f47867K, bVar.f47867K).d(this.f47869M, bVar.f47869M).g(this.f47874R, bVar.f47874R).g(this.f47871O, bVar.f47871O).f(Integer.valueOf(this.f47872P), Integer.valueOf(bVar.f47872P), U.d().g()).d(this.f47873Q, bVar.f47873Q).g(this.f47863G, bVar.f47863G).f(Integer.valueOf(this.f47878V), Integer.valueOf(bVar.f47878V), U.d().g());
            if (this.f47865I.f16930y) {
                abstractC3999nF = abstractC3999nF.f(Integer.valueOf(this.f47877U), Integer.valueOf(bVar.f47877U), n.f47854k.g());
            }
            AbstractC3999n abstractC3999nF2 = abstractC3999nF.g(this.f47879W, bVar.f47879W).g(this.f47880X, bVar.f47880X).g(this.f47881Y, bVar.f47881Y).f(Integer.valueOf(this.f47875S), Integer.valueOf(bVar.f47875S), uG).f(Integer.valueOf(this.f47876T), Integer.valueOf(bVar.f47876T), uG);
            if (L.d(this.f47864H, bVar.f47864H)) {
                abstractC3999nF2 = abstractC3999nF2.f(Integer.valueOf(this.f47877U), Integer.valueOf(bVar.f47877U), uG);
            }
            return abstractC3999nF2.i();
        }

        @Override // q2.n.i
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean j(b bVar) {
            int i10;
            String str;
            int i11;
            if ((this.f47865I.f47914q0 || ((i11 = this.f47965E.f17137D) != -1 && i11 == bVar.f47965E.f17137D)) && (this.f47870N || ((str = this.f47965E.f17162o) != null && TextUtils.equals(str, bVar.f47965E.f17162o)))) {
                e eVar = this.f47865I;
                if ((eVar.f47913p0 || ((i10 = this.f47965E.f17138E) != -1 && i10 == bVar.f47965E.f17138E)) && (eVar.f47915r0 || (this.f47879W == bVar.f47879W && this.f47880X == bVar.f47880X))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    static final class c extends i<c> implements Comparable<c> {

        /* renamed from: F, reason: collision with root package name */
        private final int f47882F;

        /* renamed from: G, reason: collision with root package name */
        private final int f47883G;

        public c(int i10, H h10, int i11, e eVar, int i12) {
            super(i10, h10, i11);
            this.f47882F = u0.s(i12, eVar.f47918u0) ? 1 : 0;
            this.f47883G = this.f47965E.e();
        }

        public static int n(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC4009y<c> s(int i10, H h10, e eVar, int[] iArr) {
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            for (int i11 = 0; i11 < h10.f16862a; i11++) {
                aVarY.a(new c(i10, h10, i11, eVar, iArr[i11]));
            }
            return aVarY.k();
        }

        @Override // q2.n.i
        public int c() {
            return this.f47882F;
        }

        @Override // java.lang.Comparable
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f47883G, cVar.f47883G);
        }

        @Override // q2.n.i
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar) {
            return false;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    private static final class d implements Comparable<d> {

        /* renamed from: B, reason: collision with root package name */
        private final boolean f47884B;

        /* renamed from: C, reason: collision with root package name */
        private final boolean f47885C;

        public d(U1.s sVar, int i10) {
            this.f47884B = (sVar.f17152e & 1) != 0;
            this.f47885C = u0.s(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return AbstractC3999n.j().g(this.f47885C, dVar.f47885C).g(this.f47884B, dVar.f47884B).i();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class e extends J {

        /* renamed from: A0, reason: collision with root package name */
        public static final e f47886A0;

        /* renamed from: B0, reason: collision with root package name */
        @Deprecated
        public static final e f47887B0;

        /* renamed from: C0, reason: collision with root package name */
        private static final String f47888C0;

        /* renamed from: D0, reason: collision with root package name */
        private static final String f47889D0;

        /* renamed from: E0, reason: collision with root package name */
        private static final String f47890E0;

        /* renamed from: F0, reason: collision with root package name */
        private static final String f47891F0;

        /* renamed from: G0, reason: collision with root package name */
        private static final String f47892G0;

        /* renamed from: H0, reason: collision with root package name */
        private static final String f47893H0;

        /* renamed from: I0, reason: collision with root package name */
        private static final String f47894I0;

        /* renamed from: J0, reason: collision with root package name */
        private static final String f47895J0;

        /* renamed from: K0, reason: collision with root package name */
        private static final String f47896K0;

        /* renamed from: L0, reason: collision with root package name */
        private static final String f47897L0;

        /* renamed from: M0, reason: collision with root package name */
        private static final String f47898M0;

        /* renamed from: N0, reason: collision with root package name */
        private static final String f47899N0;

        /* renamed from: O0, reason: collision with root package name */
        private static final String f47900O0;

        /* renamed from: P0, reason: collision with root package name */
        private static final String f47901P0;

        /* renamed from: Q0, reason: collision with root package name */
        private static final String f47902Q0;

        /* renamed from: R0, reason: collision with root package name */
        private static final String f47903R0;

        /* renamed from: S0, reason: collision with root package name */
        private static final String f47904S0;

        /* renamed from: T0, reason: collision with root package name */
        private static final String f47905T0;

        /* renamed from: U0, reason: collision with root package name */
        private static final String f47906U0;

        /* renamed from: j0, reason: collision with root package name */
        public final boolean f47907j0;

        /* renamed from: k0, reason: collision with root package name */
        public final boolean f47908k0;

        /* renamed from: l0, reason: collision with root package name */
        public final boolean f47909l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f47910m0;

        /* renamed from: n0, reason: collision with root package name */
        public final boolean f47911n0;

        /* renamed from: o0, reason: collision with root package name */
        public final boolean f47912o0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f47913p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f47914q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f47915r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f47916s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f47917t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f47918u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f47919v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f47920w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f47921x0;

        /* renamed from: y0, reason: collision with root package name */
        private final SparseArray<Map<n2.x, f>> f47922y0;

        /* renamed from: z0, reason: collision with root package name */
        private final SparseBooleanArray f47923z0;

        /* compiled from: DefaultTrackSelector.java */
        public static final class a extends J.c {

            /* renamed from: C, reason: collision with root package name */
            private boolean f47924C;

            /* renamed from: D, reason: collision with root package name */
            private boolean f47925D;

            /* renamed from: E, reason: collision with root package name */
            private boolean f47926E;

            /* renamed from: F, reason: collision with root package name */
            private boolean f47927F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f47928G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f47929H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f47930I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f47931J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f47932K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f47933L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f47934M;

            /* renamed from: N, reason: collision with root package name */
            private boolean f47935N;

            /* renamed from: O, reason: collision with root package name */
            private boolean f47936O;

            /* renamed from: P, reason: collision with root package name */
            private boolean f47937P;

            /* renamed from: Q, reason: collision with root package name */
            private boolean f47938Q;

            /* renamed from: R, reason: collision with root package name */
            private final SparseArray<Map<n2.x, f>> f47939R;

            /* renamed from: S, reason: collision with root package name */
            private final SparseBooleanArray f47940S;

            private static SparseArray<Map<n2.x, f>> j0(SparseArray<Map<n2.x, f>> sparseArray) {
                SparseArray<Map<n2.x, f>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void k0() {
                this.f47924C = true;
                this.f47925D = false;
                this.f47926E = true;
                this.f47927F = false;
                this.f47928G = true;
                this.f47929H = false;
                this.f47930I = false;
                this.f47931J = false;
                this.f47932K = false;
                this.f47933L = true;
                this.f47934M = true;
                this.f47935N = true;
                this.f47936O = false;
                this.f47937P = true;
                this.f47938Q = false;
            }

            @Override // U1.J.c
            /* renamed from: h0, reason: merged with bridge method [inline-methods] */
            public e C() {
                return new e(this);
            }

            @Override // U1.J.c
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public a D(int i10) {
                super.D(i10);
                return this;
            }

            protected a l0(J j10) {
                super.G(j10);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: m0, reason: merged with bridge method [inline-methods] */
            public a H(int i10) {
                super.H(i10);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: n0, reason: merged with bridge method [inline-methods] */
            public a I(I i10) {
                super.I(i10);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a J(String str) {
                super.J(str);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: p0, reason: merged with bridge method [inline-methods] */
            public a K(Context context) {
                super.K(context);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: q0, reason: merged with bridge method [inline-methods] */
            public a L(String... strArr) {
                super.L(strArr);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: r0, reason: merged with bridge method [inline-methods] */
            public a M(int i10) {
                super.M(i10);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public a N(int i10, boolean z10) {
                super.N(i10, z10);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a O(int i10, int i11, boolean z10) {
                super.O(i10, i11, z10);
                return this;
            }

            @Override // U1.J.c
            /* renamed from: u0, reason: merged with bridge method [inline-methods] */
            public a P(Context context, boolean z10) {
                super.P(context, z10);
                return this;
            }

            @Deprecated
            public a() {
                this.f47939R = new SparseArray<>();
                this.f47940S = new SparseBooleanArray();
                k0();
            }

            public a(Context context) {
                super(context);
                this.f47939R = new SparseArray<>();
                this.f47940S = new SparseBooleanArray();
                k0();
            }

            private a(e eVar) {
                super(eVar);
                this.f47924C = eVar.f47907j0;
                this.f47925D = eVar.f47908k0;
                this.f47926E = eVar.f47909l0;
                this.f47927F = eVar.f47910m0;
                this.f47928G = eVar.f47911n0;
                this.f47929H = eVar.f47912o0;
                this.f47930I = eVar.f47913p0;
                this.f47931J = eVar.f47914q0;
                this.f47932K = eVar.f47915r0;
                this.f47933L = eVar.f47916s0;
                this.f47934M = eVar.f47917t0;
                this.f47935N = eVar.f47918u0;
                this.f47936O = eVar.f47919v0;
                this.f47937P = eVar.f47920w0;
                this.f47938Q = eVar.f47921x0;
                this.f47939R = j0(eVar.f47922y0);
                this.f47940S = eVar.f47923z0.clone();
            }
        }

        static {
            e eVarC = new a().C();
            f47886A0 = eVarC;
            f47887B0 = eVarC;
            f47888C0 = L.B0(1000);
            f47889D0 = L.B0(1001);
            f47890E0 = L.B0(1002);
            f47891F0 = L.B0(1003);
            f47892G0 = L.B0(1004);
            f47893H0 = L.B0(1005);
            f47894I0 = L.B0(1006);
            f47895J0 = L.B0(1007);
            f47896K0 = L.B0(1008);
            f47897L0 = L.B0(1009);
            f47898M0 = L.B0(1010);
            f47899N0 = L.B0(1011);
            f47900O0 = L.B0(1012);
            f47901P0 = L.B0(1013);
            f47902Q0 = L.B0(1014);
            f47903R0 = L.B0(1015);
            f47904S0 = L.B0(1016);
            f47905T0 = L.B0(1017);
            f47906U0 = L.B0(1018);
        }

        private static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(SparseArray<Map<n2.x, f>> sparseArray, SparseArray<Map<n2.x, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !f(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean f(Map<n2.x, f> map, Map<n2.x, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<n2.x, f> entry : map.entrySet()) {
                n2.x key = entry.getKey();
                if (!map2.containsKey(key) || !L.d(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static e h(Context context) {
            return new a(context).C();
        }

        @Override // U1.J
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return super.equals(eVar) && this.f47907j0 == eVar.f47907j0 && this.f47908k0 == eVar.f47908k0 && this.f47909l0 == eVar.f47909l0 && this.f47910m0 == eVar.f47910m0 && this.f47911n0 == eVar.f47911n0 && this.f47912o0 == eVar.f47912o0 && this.f47913p0 == eVar.f47913p0 && this.f47914q0 == eVar.f47914q0 && this.f47915r0 == eVar.f47915r0 && this.f47916s0 == eVar.f47916s0 && this.f47917t0 == eVar.f47917t0 && this.f47918u0 == eVar.f47918u0 && this.f47919v0 == eVar.f47919v0 && this.f47920w0 == eVar.f47920w0 && this.f47921x0 == eVar.f47921x0 && d(this.f47923z0, eVar.f47923z0) && e(this.f47922y0, eVar.f47922y0);
        }

        @Override // U1.J
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        @Override // U1.J
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f47907j0 ? 1 : 0)) * 31) + (this.f47908k0 ? 1 : 0)) * 31) + (this.f47909l0 ? 1 : 0)) * 31) + (this.f47910m0 ? 1 : 0)) * 31) + (this.f47911n0 ? 1 : 0)) * 31) + (this.f47912o0 ? 1 : 0)) * 31) + (this.f47913p0 ? 1 : 0)) * 31) + (this.f47914q0 ? 1 : 0)) * 31) + (this.f47915r0 ? 1 : 0)) * 31) + (this.f47916s0 ? 1 : 0)) * 31) + (this.f47917t0 ? 1 : 0)) * 31) + (this.f47918u0 ? 1 : 0)) * 31) + (this.f47919v0 ? 1 : 0)) * 31) + (this.f47920w0 ? 1 : 0)) * 31) + (this.f47921x0 ? 1 : 0);
        }

        public boolean i(int i10) {
            return this.f47923z0.get(i10);
        }

        @Deprecated
        public f j(int i10, n2.x xVar) {
            Map<n2.x, f> map = this.f47922y0.get(i10);
            if (map != null) {
                return map.get(xVar);
            }
            return null;
        }

        @Deprecated
        public boolean k(int i10, n2.x xVar) {
            Map<n2.x, f> map = this.f47922y0.get(i10);
            return map != null && map.containsKey(xVar);
        }

        private e(a aVar) {
            super(aVar);
            this.f47907j0 = aVar.f47924C;
            this.f47908k0 = aVar.f47925D;
            this.f47909l0 = aVar.f47926E;
            this.f47910m0 = aVar.f47927F;
            this.f47911n0 = aVar.f47928G;
            this.f47912o0 = aVar.f47929H;
            this.f47913p0 = aVar.f47930I;
            this.f47914q0 = aVar.f47931J;
            this.f47915r0 = aVar.f47932K;
            this.f47916s0 = aVar.f47933L;
            this.f47917t0 = aVar.f47934M;
            this.f47918u0 = aVar.f47935N;
            this.f47919v0 = aVar.f47936O;
            this.f47920w0 = aVar.f47937P;
            this.f47921x0 = aVar.f47938Q;
            this.f47922y0 = aVar.f47939R;
            this.f47923z0 = aVar.f47940S;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    public static final class f {

        /* renamed from: d, reason: collision with root package name */
        private static final String f47941d = L.B0(0);

        /* renamed from: e, reason: collision with root package name */
        private static final String f47942e = L.B0(1);

        /* renamed from: f, reason: collision with root package name */
        private static final String f47943f = L.B0(2);

        /* renamed from: a, reason: collision with root package name */
        public final int f47944a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f47945b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47946c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f47944a == fVar.f47944a && Arrays.equals(this.f47945b, fVar.f47945b) && this.f47946c == fVar.f47946c;
        }

        public int hashCode() {
            return (((this.f47944a * 31) + Arrays.hashCode(this.f47945b)) * 31) + this.f47946c;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f47947a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f47948b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f47949c;

        /* renamed from: d, reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f47950d;

        /* compiled from: DefaultTrackSelector.java */
        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f47951a;

            a(n nVar) {
                this.f47951a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f47951a.W();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f47951a.W();
            }
        }

        private g(Spatializer spatializer) {
            this.f47947a = spatializer;
            this.f47948b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(audioManager.getSpatializer());
        }

        public boolean a(C1727c c1727c, U1.s sVar) throws IllegalArgumentException {
            int i10;
            if (Objects.equals(sVar.f17162o, "audio/eac3-joc")) {
                i10 = sVar.f17137D;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(sVar.f17162o, "audio/iamf")) {
                i10 = sVar.f17137D;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(sVar.f17162o, "audio/ac4")) {
                i10 = sVar.f17137D;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = sVar.f17137D;
            }
            int iM = L.M(i10);
            if (iM == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM);
            int i11 = sVar.f17138E;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f47947a.canBeSpatialized(c1727c.a().f17038a, channelMask.build());
        }

        public void b(n nVar, Looper looper) {
            if (this.f47950d == null && this.f47949c == null) {
                this.f47950d = new a(nVar);
                Handler handler = new Handler(looper);
                this.f47949c = handler;
                Spatializer spatializer = this.f47947a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new G(handler), this.f47950d);
            }
        }

        public boolean c() {
            return this.f47947a.isAvailable();
        }

        public boolean d() {
            return this.f47947a.isEnabled();
        }

        public boolean e() {
            return this.f47948b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f47950d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f47949c == null) {
                return;
            }
            this.f47947a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) L.i(this.f47949c)).removeCallbacksAndMessages(null);
            this.f47949c = null;
            this.f47950d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    static final class h extends i<h> implements Comparable<h> {

        /* renamed from: F, reason: collision with root package name */
        private final int f47953F;

        /* renamed from: G, reason: collision with root package name */
        private final boolean f47954G;

        /* renamed from: H, reason: collision with root package name */
        private final boolean f47955H;

        /* renamed from: I, reason: collision with root package name */
        private final boolean f47956I;

        /* renamed from: J, reason: collision with root package name */
        private final int f47957J;

        /* renamed from: K, reason: collision with root package name */
        private final int f47958K;

        /* renamed from: L, reason: collision with root package name */
        private final int f47959L;

        /* renamed from: M, reason: collision with root package name */
        private final int f47960M;

        /* renamed from: N, reason: collision with root package name */
        private final boolean f47961N;

        public h(int i10, H h10, int i11, e eVar, int i12, String str) {
            int iH;
            super(i10, h10, i11);
            int i13 = 0;
            this.f47954G = u0.s(i12, false);
            int i14 = this.f47965E.f17152e & (~eVar.f16927v);
            this.f47955H = (i14 & 1) != 0;
            this.f47956I = (i14 & 2) != 0;
            AbstractC4009y<String> abstractC4009yH = eVar.f16925t.isEmpty() ? AbstractC4009y.H("") : eVar.f16925t;
            int i15 = 0;
            while (true) {
                if (i15 >= abstractC4009yH.size()) {
                    i15 = Integer.MAX_VALUE;
                    iH = 0;
                    break;
                } else {
                    iH = n.H(this.f47965E, abstractC4009yH.get(i15), eVar.f16928w);
                    if (iH > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f47957J = i15;
            this.f47958K = iH;
            int iK = n.K(this.f47965E.f17153f, eVar.f16926u);
            this.f47959L = iK;
            this.f47961N = (this.f47965E.f17153f & 1088) != 0;
            int iH2 = n.H(this.f47965E, str, n.Y(str) == null);
            this.f47960M = iH2;
            boolean z10 = iH > 0 || (eVar.f16925t.isEmpty() && iK > 0) || this.f47955H || (this.f47956I && iH2 > 0);
            if (u0.s(i12, eVar.f47918u0) && z10) {
                i13 = 1;
            }
            this.f47953F = i13;
        }

        public static int n(List<h> list, List<h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC4009y<h> s(int i10, H h10, e eVar, int[] iArr, String str) {
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            for (int i11 = 0; i11 < h10.f16862a; i11++) {
                aVarY.a(new h(i10, h10, i11, eVar, iArr[i11], str));
            }
            return aVarY.k();
        }

        @Override // q2.n.i
        public int c() {
            return this.f47953F;
        }

        @Override // java.lang.Comparable
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC3999n abstractC3999nD = AbstractC3999n.j().g(this.f47954G, hVar.f47954G).f(Integer.valueOf(this.f47957J), Integer.valueOf(hVar.f47957J), U.d().g()).d(this.f47958K, hVar.f47958K).d(this.f47959L, hVar.f47959L).g(this.f47955H, hVar.f47955H).f(Boolean.valueOf(this.f47956I), Boolean.valueOf(hVar.f47956I), this.f47958K == 0 ? U.d() : U.d().g()).d(this.f47960M, hVar.f47960M);
            if (this.f47959L == 0) {
                abstractC3999nD = abstractC3999nD.h(this.f47961N, hVar.f47961N);
            }
            return abstractC3999nD.i();
        }

        @Override // q2.n.i
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public boolean j(h hVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    static abstract class i<T extends i<T>> {

        /* renamed from: B, reason: collision with root package name */
        public final int f47962B;

        /* renamed from: C, reason: collision with root package name */
        public final H f47963C;

        /* renamed from: D, reason: collision with root package name */
        public final int f47964D;

        /* renamed from: E, reason: collision with root package name */
        public final U1.s f47965E;

        /* compiled from: DefaultTrackSelector.java */
        public interface a<T extends i<T>> {
            List<T> a(int i10, H h10, int[] iArr);
        }

        public i(int i10, H h10, int i11) {
            this.f47962B = i10;
            this.f47963C = h10;
            this.f47964D = i11;
            this.f47965E = h10.a(i11);
        }

        public abstract int c();

        public abstract boolean j(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    static final class j extends i<j> {

        /* renamed from: F, reason: collision with root package name */
        private final boolean f47966F;

        /* renamed from: G, reason: collision with root package name */
        private final e f47967G;

        /* renamed from: H, reason: collision with root package name */
        private final boolean f47968H;

        /* renamed from: I, reason: collision with root package name */
        private final boolean f47969I;

        /* renamed from: J, reason: collision with root package name */
        private final boolean f47970J;

        /* renamed from: K, reason: collision with root package name */
        private final int f47971K;

        /* renamed from: L, reason: collision with root package name */
        private final int f47972L;

        /* renamed from: M, reason: collision with root package name */
        private final int f47973M;

        /* renamed from: N, reason: collision with root package name */
        private final int f47974N;

        /* renamed from: O, reason: collision with root package name */
        private final boolean f47975O;

        /* renamed from: P, reason: collision with root package name */
        private final boolean f47976P;

        /* renamed from: Q, reason: collision with root package name */
        private final int f47977Q;

        /* renamed from: R, reason: collision with root package name */
        private final boolean f47978R;

        /* renamed from: S, reason: collision with root package name */
        private final boolean f47979S;

        /* renamed from: T, reason: collision with root package name */
        private final int f47980T;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(int r5, U1.H r6, int r7, q2.n.e r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.n.j.<init>(int, U1.H, int, q2.n$e, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int s(j jVar, j jVar2) {
            AbstractC3999n abstractC3999nG = AbstractC3999n.j().g(jVar.f47969I, jVar2.f47969I).d(jVar.f47974N, jVar2.f47974N).g(jVar.f47975O, jVar2.f47975O).g(jVar.f47970J, jVar2.f47970J).g(jVar.f47966F, jVar2.f47966F).g(jVar.f47968H, jVar2.f47968H).f(Integer.valueOf(jVar.f47973M), Integer.valueOf(jVar2.f47973M), U.d().g()).g(jVar.f47978R, jVar2.f47978R).g(jVar.f47979S, jVar2.f47979S);
            if (jVar.f47978R && jVar.f47979S) {
                abstractC3999nG = abstractC3999nG.d(jVar.f47980T, jVar2.f47980T);
            }
            return abstractC3999nG.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int t(j jVar, j jVar2) {
            U uG = (jVar.f47966F && jVar.f47969I) ? n.f47854k : n.f47854k.g();
            AbstractC3999n abstractC3999nJ = AbstractC3999n.j();
            if (jVar.f47967G.f16930y) {
                abstractC3999nJ = abstractC3999nJ.f(Integer.valueOf(jVar.f47971K), Integer.valueOf(jVar2.f47971K), n.f47854k.g());
            }
            return abstractC3999nJ.f(Integer.valueOf(jVar.f47972L), Integer.valueOf(jVar2.f47972L), uG).f(Integer.valueOf(jVar.f47971K), Integer.valueOf(jVar2.f47971K), uG).i();
        }

        public static int u(List<j> list, List<j> list2) {
            return AbstractC3999n.j().f((j) Collections.max(list, new Comparator() { // from class: q2.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.s((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: q2.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.s((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: q2.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.s((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: q2.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.t((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: q2.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.t((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: q2.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.t((n.j) obj, (n.j) obj2);
                }
            }).i();
        }

        public static AbstractC4009y<j> v(int i10, H h10, e eVar, int[] iArr, int i11) {
            int I10 = n.I(h10, eVar.f16914i, eVar.f16915j, eVar.f16916k);
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            for (int i12 = 0; i12 < h10.f16862a; i12++) {
                int iE = h10.a(i12).e();
                aVarY.a(new j(i10, h10, i12, eVar, iArr[i12], i11, I10 == Integer.MAX_VALUE || (iE != -1 && iE <= I10)));
            }
            return aVarY.k();
        }

        private int w(int i10, int i11) {
            if ((this.f47965E.f17153f & 16384) != 0 || !u0.s(i10, this.f47967G.f47918u0)) {
                return 0;
            }
            if (!this.f47966F && !this.f47967G.f47907j0) {
                return 0;
            }
            if (u0.s(i10, false) && this.f47968H && this.f47966F && this.f47965E.f17157j != -1) {
                e eVar = this.f47967G;
                if (!eVar.f16931z && !eVar.f16930y && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q2.n.i
        public int c() {
            return this.f47977Q;
        }

        @Override // q2.n.i
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public boolean j(j jVar) {
            return (this.f47976P || L.d(this.f47965E.f17162o, jVar.f47965E.f17162o)) && (this.f47967G.f47910m0 || (this.f47978R == jVar.f47978R && this.f47979S == jVar.f47979S));
        }
    }

    public n(Context context) {
        this(context, new C4272a.b());
    }

    private static void E(z.a aVar, e eVar, x.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            n2.x xVarF = aVar.f(i10);
            if (eVar.k(i10, xVarF)) {
                f fVarJ = eVar.j(i10, xVarF);
                aVarArr[i10] = (fVarJ == null || fVarJ.f47945b.length == 0) ? null : new x.a(xVarF.b(fVarJ.f47944a), fVarJ.f47945b, fVarJ.f47946c);
            }
        }
    }

    private static void F(z.a aVar, J j10, x.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            G(aVar.f(i10), j10, map);
        }
        G(aVar.h(), j10, map);
        for (int i11 = 0; i11 < iD; i11++) {
            I i12 = (I) map.get(Integer.valueOf(aVar.e(i11)));
            if (i12 != null) {
                aVarArr[i11] = (i12.f16870b.isEmpty() || aVar.f(i11).d(i12.f16869a) == -1) ? null : new x.a(i12.f16869a, p8.f.l(i12.f16870b));
            }
        }
    }

    private static void G(n2.x xVar, J j10, Map<Integer, I> map) {
        I i10;
        for (int i11 = 0; i11 < xVar.f45677a; i11++) {
            I i12 = j10.f16904A.get(xVar.b(i11));
            if (i12 != null && ((i10 = map.get(Integer.valueOf(i12.a()))) == null || (i10.f16870b.isEmpty() && !i12.f16870b.isEmpty()))) {
                map.put(Integer.valueOf(i12.a()), i12);
            }
        }
    }

    protected static int H(U1.s sVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(sVar.f17151d)) {
            return 4;
        }
        String strY = Y(str);
        String strY2 = Y(sVar.f17151d);
        if (strY2 == null || strY == null) {
            return (z10 && strY2 == null) ? 1 : 0;
        }
        if (strY2.startsWith(strY) || strY.startsWith(strY2)) {
            return 3;
        }
        return L.m1(strY2, "-")[0].equals(L.m1(strY, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(H h10, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < h10.f16862a; i14++) {
                U1.s sVarA = h10.a(i14);
                int i15 = sVarA.f17169v;
                if (i15 > 0 && (i12 = sVarA.f17170w) > 0) {
                    Point pointC = C4269B.c(z10, i10, i11, i15, i12);
                    int i16 = sVarA.f17169v;
                    int i17 = sVarA.f17170w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointC.x * 0.98f)) && i17 >= ((int) (pointC.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(U1.s sVar) {
        boolean z10;
        int i10;
        g gVar;
        g gVar2;
        synchronized (this.f47855d) {
            try {
                if (this.f47859h.f47917t0 && !this.f47858g && (i10 = sVar.f17137D) != -1 && i10 > 2 && (!N(sVar) || (L.f18626a >= 32 && (gVar2 = this.f47860i) != null && gVar2.e()))) {
                    z10 = L.f18626a >= 32 && (gVar = this.f47860i) != null && gVar.e() && this.f47860i.c() && this.f47860i.d() && this.f47860i.a(this.f47861j, sVar);
                }
            } finally {
            }
        }
        return z10;
    }

    private static boolean N(U1.s sVar) {
        String str = sVar.f17162o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(U1.s sVar) {
        String str = sVar.f17162o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List P(e eVar, boolean z10, int[] iArr, int i10, H h10, int[] iArr2) {
        return b.s(i10, h10, eVar, iArr2, z10, new l8.n() { // from class: q2.m
            @Override // l8.n
            public final boolean apply(Object obj) {
                return this.f47853B.M((U1.s) obj);
            }
        }, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List Q(e eVar, int i10, H h10, int[] iArr) {
        return c.s(i10, h10, eVar, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List R(e eVar, String str, int i10, H h10, int[] iArr) {
        return h.s(i10, h10, eVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List S(e eVar, int[] iArr, int i10, H h10, int[] iArr2) {
        return j.v(i10, h10, eVar, iArr2, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void U(e eVar, z.a aVar, int[][][] iArr, d2.G[] gArr, x[] xVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            x xVar = xVarArr[i12];
            if (iE != 1 && xVar != null) {
                return;
            }
            if (iE == 1 && xVar != null && xVar.length() == 1) {
                if (Z(eVar, iArr[i12][aVar.f(i12).d(xVar.b())][xVar.i(0)], xVar.n())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f16924s.f16937b ? 1 : 2;
            d2.G g10 = gArr[i10];
            if (g10 != null && g10.f39675b) {
                z10 = true;
            }
            gArr[i10] = new d2.G(i13, z10);
        }
    }

    private static void V(z.a aVar, int[][][] iArr, d2.G[] gArr, x[] xVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            x xVar = xVarArr[i12];
            if ((iE == 1 || iE == 2) && xVar != null && a0(iArr[i12], aVar.f(i12), xVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            d2.G g10 = new d2.G(0, true);
            gArr[i11] = g10;
            gArr[i10] = g10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        boolean z10;
        g gVar;
        synchronized (this.f47855d) {
            try {
                z10 = this.f47859h.f47917t0 && !this.f47858g && L.f18626a >= 32 && (gVar = this.f47860i) != null && gVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            f();
        }
    }

    private void X(t0 t0Var) {
        boolean z10;
        synchronized (this.f47855d) {
            z10 = this.f47859h.f47921x0;
        }
        if (z10) {
            g(t0Var);
        }
    }

    protected static String Y(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Z(e eVar, int i10, U1.s sVar) {
        if (u0.N(i10) == 0) {
            return false;
        }
        if (eVar.f16924s.f16938c && (u0.N(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f16924s.f16937b) {
            return !(sVar.f17140G != 0 || sVar.f17141H != 0) || ((u0.N(i10) & 1024) != 0);
        }
        return true;
    }

    private static boolean a0(int[][] iArr, n2.x xVar, x xVar2) {
        if (xVar2 == null) {
            return false;
        }
        int iD = xVar.d(xVar2.b());
        for (int i10 = 0; i10 < xVar2.length(); i10++) {
            if (u0.z(iArr[iD][xVar2.i(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends i<T>> Pair<x.a, Integer> g0(int i10, z.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessH;
        z.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                n2.x xVarF = aVar3.f(i12);
                for (int i13 = 0; i13 < xVarF.f45677a; i13++) {
                    H hB = xVarF.b(i13);
                    List<T> listA = aVar2.a(i12, hB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[hB.f16862a];
                    int i14 = 0;
                    while (i14 < hB.f16862a) {
                        T t10 = listA.get(i14);
                        int iC = t10.c();
                        if (zArr[i14] || iC == 0) {
                            i11 = iD;
                        } else {
                            if (iC == 1) {
                                randomAccessH = AbstractC4009y.H(t10);
                                i11 = iD;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < hB.f16862a) {
                                    T t11 = listA.get(i15);
                                    int i16 = iD;
                                    if (t11.c() == 2 && t10.j(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                i11 = iD;
                                randomAccessH = arrayList2;
                            }
                            arrayList.add(randomAccessH);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f47964D;
        }
        i iVar = (i) list.get(0);
        return Pair.create(new x.a(iVar.f47963C, iArr2), Integer.valueOf(iVar.f47962B));
    }

    private void i0(e eVar) {
        boolean zEquals;
        C1804a.e(eVar);
        synchronized (this.f47855d) {
            zEquals = this.f47859h.equals(eVar);
            this.f47859h = eVar;
        }
        if (zEquals) {
            return;
        }
        if (eVar.f47917t0 && this.f47856e == null) {
            X1.n.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    @Override // q2.AbstractC4270C
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f47855d) {
            eVar = this.f47859h;
        }
        return eVar;
    }

    @Override // androidx.media3.exoplayer.u0.a
    public void a(t0 t0Var) {
        X(t0Var);
    }

    protected x.a[] b0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int iD = aVar.d();
        x.a[] aVarArr = new x.a[iD];
        Pair<x.a, Integer> pairH0 = h0(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair<x.a, Integer> pairD0 = (eVar.f16929x || pairH0 == null) ? d0(aVar, iArr, eVar) : null;
        if (pairD0 != null) {
            aVarArr[((Integer) pairD0.second).intValue()] = (x.a) pairD0.first;
        } else if (pairH0 != null) {
            aVarArr[((Integer) pairH0.second).intValue()] = (x.a) pairH0.first;
        }
        Pair<x.a, Integer> pairC0 = c0(aVar, iArr, iArr2, eVar);
        if (pairC0 != null) {
            aVarArr[((Integer) pairC0.second).intValue()] = (x.a) pairC0.first;
        }
        if (pairC0 != null) {
            Object obj = pairC0.first;
            str = ((x.a) obj).f47981a.a(((x.a) obj).f47982b[0]).f17151d;
        }
        Pair<x.a, Integer> pairF0 = f0(aVar, iArr, eVar, str);
        if (pairF0 != null) {
            aVarArr[((Integer) pairF0.second).intValue()] = (x.a) pairF0.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = e0(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair<x.a, Integer> c0(z.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f45677a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return g0(1, aVar, iArr, new i.a() { // from class: q2.g
            @Override // q2.n.i.a
            public final List a(int i11, H h10, int[] iArr3) {
                return this.f47845a.P(eVar, z10, iArr2, i11, h10, iArr3);
            }
        }, new Comparator() { // from class: q2.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.n((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<x.a, Integer> d0(z.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f16924s.f16936a == 2) {
            return null;
        }
        return g0(4, aVar, iArr, new i.a() { // from class: q2.e
            @Override // q2.n.i.a
            public final List a(int i10, H h10, int[] iArr2) {
                return n.Q(eVar, i10, h10, iArr2);
            }
        }, new Comparator() { // from class: q2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.n((List) obj, (List) obj2);
            }
        });
    }

    protected x.a e0(int i10, n2.x xVar, int[][] iArr, e eVar) {
        if (eVar.f16924s.f16936a == 2) {
            return null;
        }
        int i11 = 0;
        H h10 = null;
        d dVar = null;
        for (int i12 = 0; i12 < xVar.f45677a; i12++) {
            H hB = xVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < hB.f16862a; i13++) {
                if (u0.s(iArr2[i13], eVar.f47918u0)) {
                    d dVar2 = new d(hB.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        h10 = hB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (h10 == null) {
            return null;
        }
        return new x.a(h10, i11);
    }

    protected Pair<x.a, Integer> f0(z.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f16924s.f16936a == 2) {
            return null;
        }
        return g0(3, aVar, iArr, new i.a() { // from class: q2.k
            @Override // q2.n.i.a
            public final List a(int i10, H h10, int[] iArr2) {
                return n.R(eVar, str, i10, h10, iArr2);
            }
        }, new Comparator() { // from class: q2.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.n((List) obj, (List) obj2);
            }
        });
    }

    @Override // q2.AbstractC4270C
    public boolean h() {
        return true;
    }

    protected Pair<x.a, Integer> h0(z.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        if (eVar.f16924s.f16936a == 2) {
            return null;
        }
        return g0(2, aVar, iArr, new i.a() { // from class: q2.i
            @Override // q2.n.i.a
            public final List a(int i10, H h10, int[] iArr3) {
                return n.S(eVar, iArr2, i10, h10, iArr3);
            }
        }, new Comparator() { // from class: q2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.u((List) obj, (List) obj2);
            }
        });
    }

    @Override // q2.AbstractC4270C
    public void j() {
        g gVar;
        synchronized (this.f47855d) {
            try {
                if (L.f18626a >= 32 && (gVar = this.f47860i) != null) {
                    gVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.j();
    }

    @Override // q2.AbstractC4270C
    public void l(C1727c c1727c) {
        boolean zEquals;
        synchronized (this.f47855d) {
            zEquals = this.f47861j.equals(c1727c);
            this.f47861j = c1727c;
        }
        if (zEquals) {
            return;
        }
        W();
    }

    @Override // q2.AbstractC4270C
    public void m(J j10) {
        if (j10 instanceof e) {
            i0((e) j10);
        }
        i0(new e.a().l0(j10).C());
    }

    @Override // q2.z
    protected final Pair<d2.G[], x[]> q(z.a aVar, int[][][] iArr, int[] iArr2, r.b bVar, U1.G g10) {
        e eVar;
        g gVar;
        synchronized (this.f47855d) {
            try {
                eVar = this.f47859h;
                if (eVar.f47917t0 && L.f18626a >= 32 && (gVar = this.f47860i) != null) {
                    gVar.b(this, (Looper) C1804a.i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iD = aVar.d();
        x.a[] aVarArrB0 = b0(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, aVarArrB0);
        E(aVar, eVar, aVarArrB0);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.i(i10) || eVar.f16905B.contains(Integer.valueOf(iE))) {
                aVarArrB0[i10] = null;
            }
        }
        x[] xVarArrA = this.f47857f.a(aVarArrB0, b(), bVar, g10);
        d2.G[] gArr = new d2.G[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            gArr[i11] = (eVar.i(i11) || eVar.f16905B.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && xVarArrA[i11] == null)) ? null : d2.G.f39673c;
        }
        if (eVar.f47919v0) {
            V(aVar, iArr, gArr, xVarArrA);
        }
        if (eVar.f16924s.f16936a != 0) {
            U(eVar, aVar, iArr, gArr, xVarArrA);
        }
        return Pair.create(gArr, xVarArrA);
    }

    public n(Context context, x.b bVar) {
        this(context, e.h(context), bVar);
    }

    public n(Context context, J j10, x.b bVar) {
        this(j10, bVar, context);
    }

    private n(J j10, x.b bVar, Context context) {
        this.f47855d = new Object();
        this.f47856e = context != null ? context.getApplicationContext() : null;
        this.f47857f = bVar;
        if (j10 instanceof e) {
            this.f47859h = (e) j10;
        } else {
            this.f47859h = (context == null ? e.f47886A0 : e.h(context)).a().l0(j10).C();
        }
        this.f47861j = C1727c.f17026g;
        boolean z10 = context != null && L.J0(context);
        this.f47858g = z10;
        if (!z10 && context != null && L.f18626a >= 32) {
            this.f47860i = g.g(context);
        }
        if (this.f47859h.f47917t0 && context == null) {
            X1.n.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // q2.AbstractC4270C
    public u0.a d() {
        return this;
    }
}
