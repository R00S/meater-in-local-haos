package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import t1.t;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: U, reason: collision with root package name */
    private static final Set<Integer> f28494U = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: I, reason: collision with root package name */
    boolean f28495I;

    /* renamed from: J, reason: collision with root package name */
    int f28496J;

    /* renamed from: K, reason: collision with root package name */
    int[] f28497K;

    /* renamed from: L, reason: collision with root package name */
    View[] f28498L;

    /* renamed from: M, reason: collision with root package name */
    final SparseIntArray f28499M;

    /* renamed from: N, reason: collision with root package name */
    final SparseIntArray f28500N;

    /* renamed from: O, reason: collision with root package name */
    d f28501O;

    /* renamed from: P, reason: collision with root package name */
    final Rect f28502P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f28503Q;

    /* renamed from: R, reason: collision with root package name */
    private int f28504R;

    /* renamed from: S, reason: collision with root package name */
    int f28505S;

    /* renamed from: T, reason: collision with root package name */
    int f28506T;

    private static class a {
        static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f28509a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f28510b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f28511c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f28512d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f28512d) {
                return d(i10, i11);
            }
            int i12 = this.f28510b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f28510b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f28511c) {
                return e(i10, i11);
            }
            int i12 = this.f28509a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f28509a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f28512d || (iA = a(this.f28510b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f28510b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f28511c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f28509a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f28509a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.d.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f28510b.clear();
        }

        public void h() {
            this.f28509a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f28495I = false;
        this.f28496J = -1;
        this.f28499M = new SparseIntArray();
        this.f28500N = new SparseIntArray();
        this.f28501O = new b();
        this.f28502P = new Rect();
        this.f28504R = -1;
        this.f28505S = -1;
        this.f28506T = -1;
        u3(RecyclerView.q.m0(context, attributeSet, i10, i11).f28729b);
    }

    private void Q2(RecyclerView.x xVar, RecyclerView.C c10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f28498L[i11];
            c cVar = (c) view.getLayoutParams();
            int iP3 = p3(xVar, c10, l0(view));
            cVar.f28508f = iP3;
            cVar.f28507e = i14;
            i14 += iP3;
            i11 += i13;
        }
    }

    private void R2() {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            c cVar = (c) N(i10).getLayoutParams();
            int iA = cVar.a();
            this.f28499M.put(iA, cVar.f());
            this.f28500N.put(iA, cVar.e());
        }
    }

    private void S2(int i10) {
        this.f28497K = T2(this.f28497K, this.f28496J, i10);
    }

    static int[] T2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void U2() {
        this.f28499M.clear();
        this.f28500N.clear();
    }

    private int V2(RecyclerView.C c10) {
        if (O() != 0 && c10.b() != 0) {
            Y1();
            boolean zT2 = t2();
            View viewD2 = d2(!zT2, true);
            View viewC2 = c2(!zT2, true);
            if (viewD2 != null && viewC2 != null) {
                int iB = this.f28501O.b(l0(viewD2), this.f28496J);
                int iB2 = this.f28501O.b(l0(viewC2), this.f28496J);
                int iMax = this.f28526x ? Math.max(0, ((this.f28501O.b(c10.b() - 1, this.f28496J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zT2) {
                    return Math.round((iMax * (Math.abs(this.f28523u.d(viewC2) - this.f28523u.g(viewD2)) / ((this.f28501O.b(l0(viewC2), this.f28496J) - this.f28501O.b(l0(viewD2), this.f28496J)) + 1))) + (this.f28523u.m() - this.f28523u.g(viewD2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int W2(RecyclerView.C c10) {
        if (O() != 0 && c10.b() != 0) {
            Y1();
            View viewD2 = d2(!t2(), true);
            View viewC2 = c2(!t2(), true);
            if (viewD2 != null && viewC2 != null) {
                if (!t2()) {
                    return this.f28501O.b(c10.b() - 1, this.f28496J) + 1;
                }
                int iD = this.f28523u.d(viewC2) - this.f28523u.g(viewD2);
                int iB = this.f28501O.b(l0(viewD2), this.f28496J);
                return (int) ((iD / ((this.f28501O.b(l0(viewC2), this.f28496J) - iB) + 1)) * (this.f28501O.b(c10.b() - 1, this.f28496J) + 1));
            }
        }
        return 0;
    }

    private void X2(RecyclerView.x xVar, RecyclerView.C c10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iO3 = o3(xVar, c10, aVar.f28530b);
        if (z10) {
            while (iO3 > 0) {
                int i11 = aVar.f28530b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f28530b = i12;
                iO3 = o3(xVar, c10, i12);
            }
            return;
        }
        int iB = c10.b() - 1;
        int i13 = aVar.f28530b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iO32 = o3(xVar, c10, i14);
            if (iO32 <= iO3) {
                break;
            }
            i13 = i14;
            iO3 = iO32;
        }
        aVar.f28530b = i13;
    }

    private void Y2() {
        View[] viewArr = this.f28498L;
        if (viewArr == null || viewArr.length != this.f28496J) {
            this.f28498L = new View[this.f28496J];
        }
    }

    private View Z2() {
        for (int i10 = 0; i10 < O(); i10++) {
            View viewN = N(i10);
            Objects.requireNonNull(viewN);
            if (a.a(viewN)) {
                return N(i10);
            }
        }
        return null;
    }

    private int c3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                return -1;
            }
            if (this.f28521s == 1) {
                if (iI3 < i10 && h3(i13).contains(Integer.valueOf(i11))) {
                    this.f28505S = iI3;
                    return i13;
                }
            } else if (iI3 < i10 && iG3 == i11) {
                this.f28505S = ((Integer) Collections.max(j3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    private int d3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < a(); i13++) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                return -1;
            }
            if (this.f28521s == 1) {
                if (iI3 > i10 && (iG3 == i11 || h3(i13).contains(Integer.valueOf(i11)))) {
                    this.f28505S = iI3;
                    return i13;
                }
            } else if (iI3 > i10 && iG3 == i11) {
                this.f28505S = i3(i13);
                return i13;
            }
        }
        return -1;
    }

    private int e3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                return -1;
            }
            if (this.f28521s == 1) {
                if ((iI3 == i10 && iG3 < i11) || iI3 < i10) {
                    this.f28505S = iI3;
                    this.f28506T = iG3;
                    return i13;
                }
            } else if (j3(i13).contains(Integer.valueOf(i10)) && iG3 < i11) {
                this.f28506T = iG3;
                return i13;
            }
        }
        return -1;
    }

    private int f3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < a(); i13++) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f28521s == 1) {
                if ((iI3 == i10 && iG3 > i11) || iI3 > i10) {
                    this.f28505S = iI3;
                    this.f28506T = iG3;
                    return i13;
                }
            } else if (iG3 > i11 && j3(i13).contains(Integer.valueOf(i10))) {
                this.f28506T = iG3;
                return i13;
            }
        }
        return -1;
    }

    private int g3(int i10) {
        if (this.f28521s == 0) {
            RecyclerView recyclerView = this.f28709b;
            return n3(recyclerView.f28569D, recyclerView.f28584K0, i10);
        }
        RecyclerView recyclerView2 = this.f28709b;
        return o3(recyclerView2.f28569D, recyclerView2.f28584K0, i10);
    }

    private Set<Integer> h3(int i10) {
        return k3(g3(i10), i10);
    }

    private int i3(int i10) {
        if (this.f28521s == 1) {
            RecyclerView recyclerView = this.f28709b;
            return n3(recyclerView.f28569D, recyclerView.f28584K0, i10);
        }
        RecyclerView recyclerView2 = this.f28709b;
        return o3(recyclerView2.f28569D, recyclerView2.f28584K0, i10);
    }

    private Set<Integer> j3(int i10) {
        return k3(i3(i10), i10);
    }

    private Set<Integer> k3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f28709b;
        int iP3 = p3(recyclerView.f28569D, recyclerView.f28584K0, i11);
        for (int i12 = i10; i12 < i10 + iP3; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    private int n3(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        if (!c10.e()) {
            return this.f28501O.b(i10, this.f28496J);
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.f28501O.b(iF, this.f28496J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int o3(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        if (!c10.e()) {
            return this.f28501O.c(i10, this.f28496J);
        }
        int i11 = this.f28500N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.f28501O.c(iF, this.f28496J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int p3(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        if (!c10.e()) {
            return this.f28501O.f(i10);
        }
        int i11 = this.f28499M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.f28501O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void q3(float f10, int i10) {
        S2(Math.max(Math.round(f10 * this.f28496J), i10));
    }

    private boolean r3(int i10) {
        return (j3(i10).contains(Integer.valueOf(this.f28505S)) && h3(i10).contains(Integer.valueOf(this.f28506T))) ? false : true;
    }

    private void s3(View view, int i10, boolean z10) {
        int iP;
        int iP2;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f28733b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int iL3 = l3(cVar.f28507e, cVar.f28508f);
        if (this.f28521s == 1) {
            iP2 = RecyclerView.q.P(iL3, i10, i12, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            iP = RecyclerView.q.P(this.f28523u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int iP3 = RecyclerView.q.P(iL3, i10, i11, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int iP4 = RecyclerView.q.P(this.f28523u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        t3(view, iP2, iP, z10);
    }

    private void t3(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? M1(view, i10, i11, rVar) : K1(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    private void w3() {
        int iB0;
        int iK0;
        if (r2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        S2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.C c10) {
        return this.f28503Q ? W2(c10) : super.A(c10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        w3();
        Y2();
        return super.B1(i10, xVar, c10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        w3();
        Y2();
        return super.D1(i10, xVar, c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        if (this.f28497K == null) {
            super.H1(rect, i10, i11);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f28521s == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            int[] iArr = this.f28497K;
            iS = RecyclerView.q.s(i10, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            int[] iArr2 = this.f28497K;
            iS2 = RecyclerView.q.s(i11, iArr2[iArr2.length - 1] + iK0, f0());
        }
        G1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void H2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.H2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f28521s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View O0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.C r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.f28516D == null && !this.f28495I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.x xVar, RecyclerView.C c10, t1.t tVar) {
        super.R0(xVar, c10, tVar);
        tVar.h0(GridView.class.getName());
        RecyclerView.h hVar = this.f28709b.f28589N;
        if (hVar == null || hVar.h() <= 1) {
            return;
        }
        tVar.b(t.a.f49777V);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f28521s == 1) {
            return Math.min(this.f28496J, a());
        }
        if (c10.b() < 1) {
            return 0;
        }
        return n3(xVar, c10, c10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void S1(RecyclerView.C c10, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int iF = this.f28496J;
        for (int i10 = 0; i10 < this.f28496J && cVar.c(c10) && iF > 0; i10++) {
            int i11 = cVar.f28541d;
            cVar2.a(i11, Math.max(0, cVar.f28544g));
            iF -= this.f28501O.f(i11);
            cVar.f28541d += cVar.f28542e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(RecyclerView.x xVar, RecyclerView.C c10, View view, t1.t tVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, tVar);
            return;
        }
        c cVar = (c) layoutParams;
        int iN3 = n3(xVar, c10, cVar.a());
        if (this.f28521s == 0) {
            tVar.k0(t.f.a(cVar.e(), cVar.f(), iN3, 1, false, false));
        } else {
            tVar.k0(t.f.a(iN3, 1, cVar.e(), cVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        this.f28501O.h();
        this.f28501O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.f28501O.h();
        this.f28501O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f28501O.h();
        this.f28501O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        this.f28501O.h();
        this.f28501O.g();
    }

    int a3(int i10) {
        if (i10 < 0 || this.f28521s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < a(); i11++) {
            for (Integer num : j3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f28505S = iIntValue;
                this.f28506T = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f28501O.h();
        this.f28501O.g();
    }

    int b3(int i10) {
        if (i10 < 0 || this.f28521s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < a(); i11++) {
            for (Integer num : j3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f28505S = iIntValue;
                this.f28506T = g3(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.C c10) {
        if (c10.e()) {
            R2();
        }
        super.c1(xVar, c10);
        U2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.C c10) {
        View viewH;
        super.d1(c10);
        this.f28495I = false;
        int i10 = this.f28504R;
        if (i10 == -1 || (viewH = H(i10)) == null) {
            return;
        }
        viewH.sendAccessibilityEvent(67108864);
        this.f28504R = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    boolean l1(int i10, Bundle bundle) {
        RecyclerView.G gN0;
        int iE3;
        if (i10 != t.a.f49777V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.l1(i10, bundle);
            }
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i11 != -1 && i12 != -1) {
                int iH = this.f28709b.f28589N.h();
                int i13 = 0;
                while (true) {
                    if (i13 >= iH) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f28709b;
                    int iO3 = o3(recyclerView.f28569D, recyclerView.f28584K0, i13);
                    RecyclerView recyclerView2 = this.f28709b;
                    int iN3 = n3(recyclerView2.f28569D, recyclerView2.f28584K0, i13);
                    if (this.f28521s != 1) {
                        if (iO3 == i11 && iN3 == i12) {
                            break;
                        }
                        i13++;
                    } else {
                        if (iO3 == i12 && iN3 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    E2(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View viewZ2 = Z2();
        if (viewZ2 == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!f28494U.contains(Integer.valueOf(i14)) || (gN0 = this.f28709b.n0(viewZ2)) == null) {
            return false;
        }
        int absoluteAdapterPosition = gN0.getAbsoluteAdapterPosition();
        int iI3 = i3(absoluteAdapterPosition);
        int iG3 = g3(absoluteAdapterPosition);
        if (iI3 >= 0 && iG3 >= 0) {
            if (r3(absoluteAdapterPosition)) {
                this.f28505S = iI3;
                this.f28506T = iG3;
            }
            int i15 = this.f28505S;
            if (i15 == -1) {
                i15 = iI3;
            }
            int i16 = this.f28506T;
            if (i16 != -1) {
                iG3 = i16;
            }
            if (i14 == 17) {
                iE3 = e3(i15, iG3, absoluteAdapterPosition);
            } else if (i14 == 33) {
                iE3 = c3(i15, iG3, absoluteAdapterPosition);
            } else if (i14 == 66) {
                iE3 = f3(i15, iG3, absoluteAdapterPosition);
            } else {
                if (i14 != 130) {
                    return false;
                }
                iE3 = d3(i15, iG3, absoluteAdapterPosition);
            }
            if (iE3 == -1 && this.f28521s == 0) {
                if (i14 == 17) {
                    iE3 = b3(iI3);
                } else if (i14 == 66) {
                    iE3 = a3(iI3);
                }
            }
            if (iE3 != -1) {
                C1(iE3);
                this.f28504R = iE3;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View l2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10, boolean z11) {
        int i10;
        int iO;
        int iO2 = O();
        int i11 = 1;
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
        }
        int iB = c10.b();
        Y1();
        int iM = this.f28523u.m();
        int i12 = this.f28523u.i();
        View view = null;
        View view2 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && o3(xVar, c10, iL0) == 0) {
                if (((RecyclerView.r) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f28523u.g(viewN) < i12 && this.f28523u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i11;
        }
        return view != null ? view : view2;
    }

    int l3(int i10, int i11) {
        if (this.f28521s != 1 || !s2()) {
            int[] iArr = this.f28497K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f28497K;
        int i12 = this.f28496J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public int m3() {
        return this.f28496J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f28521s == 0) {
            return Math.min(this.f28496J, a());
        }
        if (c10.b() < 1) {
            return 0;
        }
        return n3(xVar, c10, c10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.x xVar, RecyclerView.C c10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iF;
        int iF2;
        int iF3;
        int i17;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f28523u.l();
        boolean z10 = iL != 1073741824;
        int i18 = O() > 0 ? this.f28497K[this.f28496J] : 0;
        if (z10) {
            w3();
        }
        boolean z11 = cVar.f28542e == 1;
        int iO3 = this.f28496J;
        if (!z11) {
            iO3 = o3(xVar, c10, cVar.f28541d) + p3(xVar, c10, cVar.f28541d);
        }
        int i19 = 0;
        while (i19 < this.f28496J && cVar.c(c10) && iO3 > 0) {
            int i20 = cVar.f28541d;
            int iP3 = p3(xVar, c10, i20);
            if (iP3 > this.f28496J) {
                throw new IllegalArgumentException("Item at position " + i20 + " requires " + iP3 + " spans but GridLayoutManager has only " + this.f28496J + " spans.");
            }
            iO3 -= iP3;
            if (iO3 < 0 || (viewD = cVar.d(xVar)) == null) {
                break;
            }
            this.f28498L[i19] = viewD;
            i19++;
        }
        if (i19 == 0) {
            bVar.f28535b = true;
            return;
        }
        Q2(xVar, c10, i19, z11);
        float f10 = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i19; i22++) {
            View view = this.f28498L[i22];
            if (cVar.f28549l == null) {
                if (z11) {
                    h(view);
                } else {
                    i(view, 0);
                }
            } else if (z11) {
                f(view);
            } else {
                g(view, 0);
            }
            o(view, this.f28502P);
            s3(view, iL, false);
            int iE = this.f28523u.e(view);
            if (iE > i21) {
                i21 = iE;
            }
            float f11 = (this.f28523u.f(view) * 1.0f) / ((c) view.getLayoutParams()).f28508f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            q3(f10, i18);
            i21 = 0;
            for (int i23 = 0; i23 < i19; i23++) {
                View view2 = this.f28498L[i23];
                s3(view2, 1073741824, true);
                int iE2 = this.f28523u.e(view2);
                if (iE2 > i21) {
                    i21 = iE2;
                }
            }
        }
        for (int i24 = 0; i24 < i19; i24++) {
            View view3 = this.f28498L[i24];
            if (this.f28523u.e(view3) != i21) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.f28733b;
                int i25 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i26 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int iL3 = l3(cVar2.f28507e, cVar2.f28508f);
                if (this.f28521s == 1) {
                    iP2 = RecyclerView.q.P(iL3, 1073741824, i26, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                    iP = RecyclerView.q.P(iL3, 1073741824, i25, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                t3(view3, iP2, iP, true);
            }
        }
        bVar.f28534a = i21;
        if (this.f28521s == 1) {
            if (cVar.f28543f == -1) {
                i15 = cVar.f28539b;
                i17 = i15 - i21;
            } else {
                i17 = cVar.f28539b;
                i15 = i17 + i21;
            }
            i13 = i17;
            i14 = 0;
            i12 = 0;
        } else {
            if (cVar.f28543f == -1) {
                i11 = cVar.f28539b;
                i10 = i11 - i21;
            } else {
                i10 = cVar.f28539b;
                i11 = i10 + i21;
            }
            i12 = i10;
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        int i27 = 0;
        while (i27 < i19) {
            View view4 = this.f28498L[i27];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.f28521s == 1) {
                if (s2()) {
                    int iI0 = i0() + this.f28497K[this.f28496J - cVar3.f28507e];
                    iF3 = i15;
                    iF = iI0;
                    iF2 = iI0 - this.f28523u.f(view4);
                } else {
                    int iI02 = i0() + this.f28497K[cVar3.f28507e];
                    iF3 = i15;
                    iF2 = iI02;
                    iF = this.f28523u.f(view4) + iI02;
                }
                i16 = i13;
            } else {
                int iK0 = k0() + this.f28497K[cVar3.f28507e];
                i16 = iK0;
                iF = i14;
                iF2 = i12;
                iF3 = this.f28523u.f(view4) + iK0;
            }
            E0(view4, iF2, i16, iF, iF3);
            if (cVar3.c() || cVar3.b()) {
                bVar.f28536c = true;
            }
            bVar.f28537d |= view4.hasFocusable();
            i27++;
            i15 = iF3;
            i14 = iF;
            i12 = iF2;
            i13 = i16;
        }
        Arrays.fill(this.f28498L, (Object) null);
    }

    public void u3(int i10) {
        if (i10 == this.f28496J) {
            return;
        }
        this.f28495I = true;
        if (i10 >= 1) {
            this.f28496J = i10;
            this.f28501O.h();
            y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void v3(d dVar) {
        this.f28501O = dVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.C c10) {
        return this.f28503Q ? V2(c10) : super.w(c10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void w2(RecyclerView.x xVar, RecyclerView.C c10, LinearLayoutManager.a aVar, int i10) {
        super.w2(xVar, c10, aVar, i10);
        w3();
        if (c10.b() > 0 && !c10.e()) {
            X2(xVar, c10, aVar, i10);
        }
        Y2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.C c10) {
        return this.f28503Q ? W2(c10) : super.x(c10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.C c10) {
        return this.f28503Q ? V2(c10) : super.z(c10);
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e, reason: collision with root package name */
        int f28507e;

        /* renamed from: f, reason: collision with root package name */
        int f28508f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28507e = -1;
            this.f28508f = 0;
        }

        public int e() {
            return this.f28507e;
        }

        public int f() {
            return this.f28508f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f28507e = -1;
            this.f28508f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f28507e = -1;
            this.f28508f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28507e = -1;
            this.f28508f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f28495I = false;
        this.f28496J = -1;
        this.f28499M = new SparseIntArray();
        this.f28500N = new SparseIntArray();
        this.f28501O = new b();
        this.f28502P = new Rect();
        this.f28504R = -1;
        this.f28505S = -1;
        this.f28506T = -1;
        u3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f28495I = false;
        this.f28496J = -1;
        this.f28499M = new SparseIntArray();
        this.f28500N = new SparseIntArray();
        this.f28501O = new b();
        this.f28502P = new Rect();
        this.f28504R = -1;
        this.f28505S = -1;
        this.f28506T = -1;
        u3(i10);
    }
}
