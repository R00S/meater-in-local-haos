package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import t1.t;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.B.b {

    /* renamed from: B, reason: collision with root package name */
    private BitSet f28753B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f28758G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f28759H;

    /* renamed from: I, reason: collision with root package name */
    private e f28760I;

    /* renamed from: J, reason: collision with root package name */
    private int f28761J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f28766O;

    /* renamed from: t, reason: collision with root package name */
    f[] f28769t;

    /* renamed from: u, reason: collision with root package name */
    q f28770u;

    /* renamed from: v, reason: collision with root package name */
    q f28771v;

    /* renamed from: w, reason: collision with root package name */
    private int f28772w;

    /* renamed from: x, reason: collision with root package name */
    private int f28773x;

    /* renamed from: y, reason: collision with root package name */
    private final l f28774y;

    /* renamed from: s, reason: collision with root package name */
    private int f28768s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f28775z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f28752A = false;

    /* renamed from: C, reason: collision with root package name */
    int f28754C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f28755D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    d f28756E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f28757F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f28762K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f28763L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f28764M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f28765N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f28767P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.X1();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f28777a;

        /* renamed from: b, reason: collision with root package name */
        int f28778b;

        /* renamed from: c, reason: collision with root package name */
        boolean f28779c;

        /* renamed from: d, reason: collision with root package name */
        boolean f28780d;

        /* renamed from: e, reason: collision with root package name */
        boolean f28781e;

        /* renamed from: f, reason: collision with root package name */
        int[] f28782f;

        b() {
            c();
        }

        void a() {
            this.f28778b = this.f28779c ? StaggeredGridLayoutManager.this.f28770u.i() : StaggeredGridLayoutManager.this.f28770u.m();
        }

        void b(int i10) {
            if (this.f28779c) {
                this.f28778b = StaggeredGridLayoutManager.this.f28770u.i() - i10;
            } else {
                this.f28778b = StaggeredGridLayoutManager.this.f28770u.m() + i10;
            }
        }

        void c() {
            this.f28777a = -1;
            this.f28778b = Integer.MIN_VALUE;
            this.f28779c = false;
            this.f28780d = false;
            this.f28781e = false;
            int[] iArr = this.f28782f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f28782f;
            if (iArr == null || iArr.length < length) {
                this.f28782f = new int[StaggeredGridLayoutManager.this.f28769t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f28782f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e, reason: collision with root package name */
        f f28784e;

        /* renamed from: f, reason: collision with root package name */
        boolean f28785f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f28784e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f28806e;
        }

        public boolean f() {
            return this.f28785f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        int f28792B;

        /* renamed from: C, reason: collision with root package name */
        int f28793C;

        /* renamed from: D, reason: collision with root package name */
        int f28794D;

        /* renamed from: E, reason: collision with root package name */
        int[] f28795E;

        /* renamed from: F, reason: collision with root package name */
        int f28796F;

        /* renamed from: G, reason: collision with root package name */
        int[] f28797G;

        /* renamed from: H, reason: collision with root package name */
        List<d.a> f28798H;

        /* renamed from: I, reason: collision with root package name */
        boolean f28799I;

        /* renamed from: J, reason: collision with root package name */
        boolean f28800J;

        /* renamed from: K, reason: collision with root package name */
        boolean f28801K;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void a() {
            this.f28795E = null;
            this.f28794D = 0;
            this.f28792B = -1;
            this.f28793C = -1;
        }

        void b() {
            this.f28795E = null;
            this.f28794D = 0;
            this.f28796F = 0;
            this.f28797G = null;
            this.f28798H = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f28792B);
            parcel.writeInt(this.f28793C);
            parcel.writeInt(this.f28794D);
            if (this.f28794D > 0) {
                parcel.writeIntArray(this.f28795E);
            }
            parcel.writeInt(this.f28796F);
            if (this.f28796F > 0) {
                parcel.writeIntArray(this.f28797G);
            }
            parcel.writeInt(this.f28799I ? 1 : 0);
            parcel.writeInt(this.f28800J ? 1 : 0);
            parcel.writeInt(this.f28801K ? 1 : 0);
            parcel.writeList(this.f28798H);
        }

        e(Parcel parcel) {
            this.f28792B = parcel.readInt();
            this.f28793C = parcel.readInt();
            int i10 = parcel.readInt();
            this.f28794D = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f28795E = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f28796F = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f28797G = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f28799I = parcel.readInt() == 1;
            this.f28800J = parcel.readInt() == 1;
            this.f28801K = parcel.readInt() == 1;
            this.f28798H = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f28794D = eVar.f28794D;
            this.f28792B = eVar.f28792B;
            this.f28793C = eVar.f28793C;
            this.f28795E = eVar.f28795E;
            this.f28796F = eVar.f28796F;
            this.f28797G = eVar.f28797G;
            this.f28799I = eVar.f28799I;
            this.f28800J = eVar.f28800J;
            this.f28801K = eVar.f28801K;
            this.f28798H = eVar.f28798H;
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f28802a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f28803b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f28804c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f28805d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f28806e;

        f(int i10) {
            this.f28806e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f28784e = this;
            this.f28802a.add(view);
            this.f28804c = Integer.MIN_VALUE;
            if (this.f28802a.size() == 1) {
                this.f28803b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f28805d += StaggeredGridLayoutManager.this.f28770u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f28770u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f28770u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f28804c = iL;
                    this.f28803b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f28802a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f28804c = StaggeredGridLayoutManager.this.f28770u.d(view);
            if (cVarN.f28785f && (aVarF = StaggeredGridLayoutManager.this.f28756E.f(cVarN.a())) != null && aVarF.f28789C == 1) {
                this.f28804c += aVarF.a(this.f28806e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f28802a.get(0);
            c cVarN = n(view);
            this.f28803b = StaggeredGridLayoutManager.this.f28770u.g(view);
            if (cVarN.f28785f && (aVarF = StaggeredGridLayoutManager.this.f28756E.f(cVarN.a())) != null && aVarF.f28789C == -1) {
                this.f28803b -= aVarF.a(this.f28806e);
            }
        }

        void e() {
            this.f28802a.clear();
            q();
            this.f28805d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f28775z ? i(this.f28802a.size() - 1, -1, true) : i(0, this.f28802a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f28775z ? i(0, this.f28802a.size(), true) : i(this.f28802a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f28770u.m();
            int i12 = StaggeredGridLayoutManager.this.f28770u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f28802a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f28770u.g(view);
                int iD = StaggeredGridLayoutManager.this.f28770u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f28805d;
        }

        int k() {
            int i10 = this.f28804c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f28804c;
        }

        int l(int i10) {
            int i11 = this.f28804c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f28802a.size() == 0) {
                return i10;
            }
            c();
            return this.f28804c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f28802a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f28802a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f28775z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f28775z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f28802a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f28802a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f28775z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f28775z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f28803b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f28803b;
        }

        int p(int i10) {
            int i11 = this.f28803b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f28802a.size() == 0) {
                return i10;
            }
            d();
            return this.f28803b;
        }

        void q() {
            this.f28803b = Integer.MIN_VALUE;
            this.f28804c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f28803b;
            if (i11 != Integer.MIN_VALUE) {
                this.f28803b = i11 + i10;
            }
            int i12 = this.f28804c;
            if (i12 != Integer.MIN_VALUE) {
                this.f28804c = i12 + i10;
            }
        }

        void s() {
            int size = this.f28802a.size();
            View viewRemove = this.f28802a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f28784e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f28805d -= StaggeredGridLayoutManager.this.f28770u.e(viewRemove);
            }
            if (size == 1) {
                this.f28803b = Integer.MIN_VALUE;
            }
            this.f28804c = Integer.MIN_VALUE;
        }

        void t() {
            View viewRemove = this.f28802a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f28784e = null;
            if (this.f28802a.size() == 0) {
                this.f28804c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f28805d -= StaggeredGridLayoutManager.this.f28770u.e(viewRemove);
            }
            this.f28803b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f28784e = this;
            this.f28802a.add(0, view);
            this.f28803b = Integer.MIN_VALUE;
            if (this.f28802a.size() == 1) {
                this.f28804c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f28805d += StaggeredGridLayoutManager.this.f28770u.e(view);
            }
        }

        void v(int i10) {
            this.f28803b = i10;
            this.f28804c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        M2(dVarM0.f28728a);
        O2(dVarM0.f28729b);
        N2(dVarM0.f28730c);
        this.f28774y = new l();
        f2();
    }

    private void A2(View view, c cVar, boolean z10) {
        if (cVar.f28785f) {
            if (this.f28772w == 1) {
                z2(view, this.f28761J, RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f28761J, z10);
                return;
            }
        }
        if (this.f28772w == 1) {
            z2(view, RecyclerView.q.P(this.f28773x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.P(this.f28773x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void B2(androidx.recyclerview.widget.RecyclerView.x r9, androidx.recyclerview.widget.RecyclerView.C r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C, boolean):void");
    }

    private boolean C2(int i10) {
        if (this.f28772w == 0) {
            return (i10 == -1) != this.f28752A;
        }
        return ((i10 == -1) == this.f28752A) == y2();
    }

    private void E2(View view) {
        for (int i10 = this.f28768s - 1; i10 >= 0; i10--) {
            this.f28769t[i10].u(view);
        }
    }

    private void F2(RecyclerView.x xVar, l lVar) {
        if (!lVar.f28983a || lVar.f28991i) {
            return;
        }
        if (lVar.f28984b == 0) {
            if (lVar.f28987e == -1) {
                G2(xVar, lVar.f28989g);
                return;
            } else {
                H2(xVar, lVar.f28988f);
                return;
            }
        }
        if (lVar.f28987e != -1) {
            int iS2 = s2(lVar.f28989g) - lVar.f28989g;
            H2(xVar, iS2 < 0 ? lVar.f28988f : Math.min(iS2, lVar.f28984b) + lVar.f28988f);
        } else {
            int i10 = lVar.f28988f;
            int iR2 = i10 - r2(i10);
            G2(xVar, iR2 < 0 ? lVar.f28989g : lVar.f28989g - Math.min(iR2, lVar.f28984b));
        }
    }

    private void G2(RecyclerView.x xVar, int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f28770u.g(viewN) < i10 || this.f28770u.q(viewN) < i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f28785f) {
                for (int i11 = 0; i11 < this.f28768s; i11++) {
                    if (this.f28769t[i11].f28802a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f28768s; i12++) {
                    this.f28769t[i12].s();
                }
            } else if (cVar.f28784e.f28802a.size() == 1) {
                return;
            } else {
                cVar.f28784e.s();
            }
            r1(viewN, xVar);
        }
    }

    private void H2(RecyclerView.x xVar, int i10) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f28770u.d(viewN) > i10 || this.f28770u.p(viewN) > i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f28785f) {
                for (int i11 = 0; i11 < this.f28768s; i11++) {
                    if (this.f28769t[i11].f28802a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f28768s; i12++) {
                    this.f28769t[i12].t();
                }
            } else if (cVar.f28784e.f28802a.size() == 1) {
                return;
            } else {
                cVar.f28784e.t();
            }
            r1(viewN, xVar);
        }
    }

    private void I2() {
        if (this.f28771v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = N(i10);
            float fE = this.f28771v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f28768s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f28773x;
        int iRound = Math.round(fMax * this.f28768s);
        if (this.f28771v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f28771v.n());
        }
        U2(iRound);
        if (this.f28773x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN2 = N(i12);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f28785f) {
                if (y2() && this.f28772w == 1) {
                    int i13 = this.f28768s;
                    int i14 = cVar.f28784e.f28806e;
                    viewN2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f28773x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f28784e.f28806e;
                    int i16 = this.f28773x * i15;
                    int i17 = i15 * i11;
                    if (this.f28772w == 1) {
                        viewN2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewN2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void J2() {
        if (this.f28772w == 1 || !y2()) {
            this.f28752A = this.f28775z;
        } else {
            this.f28752A = !this.f28775z;
        }
    }

    private void L2(int i10) {
        l lVar = this.f28774y;
        lVar.f28987e = i10;
        lVar.f28986d = this.f28752A != (i10 == -1) ? -1 : 1;
    }

    private void P2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f28768s; i12++) {
            if (!this.f28769t[i12].f28802a.isEmpty()) {
                V2(this.f28769t[i12], i10, i11);
            }
        }
    }

    private boolean Q2(RecyclerView.C c10, b bVar) {
        bVar.f28777a = this.f28758G ? l2(c10.b()) : h2(c10.b());
        bVar.f28778b = Integer.MIN_VALUE;
        return true;
    }

    private void R1(View view) {
        for (int i10 = this.f28768s - 1; i10 >= 0; i10--) {
            this.f28769t[i10].a(view);
        }
    }

    private void S1(b bVar) {
        e eVar = this.f28760I;
        int i10 = eVar.f28794D;
        if (i10 > 0) {
            if (i10 == this.f28768s) {
                for (int i11 = 0; i11 < this.f28768s; i11++) {
                    this.f28769t[i11].e();
                    e eVar2 = this.f28760I;
                    int i12 = eVar2.f28795E[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f28800J ? this.f28770u.i() : this.f28770u.m();
                    }
                    this.f28769t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f28760I;
                eVar3.f28792B = eVar3.f28793C;
            }
        }
        e eVar4 = this.f28760I;
        this.f28759H = eVar4.f28801K;
        N2(eVar4.f28799I);
        J2();
        e eVar5 = this.f28760I;
        int i13 = eVar5.f28792B;
        if (i13 != -1) {
            this.f28754C = i13;
            bVar.f28779c = eVar5.f28800J;
        } else {
            bVar.f28779c = this.f28752A;
        }
        if (eVar5.f28796F > 1) {
            d dVar = this.f28756E;
            dVar.f28786a = eVar5.f28797G;
            dVar.f28787b = eVar5.f28798H;
        }
    }

    private void T2(int i10, RecyclerView.C c10) {
        int iN;
        int iN2;
        int iC;
        l lVar = this.f28774y;
        boolean z10 = false;
        lVar.f28984b = 0;
        lVar.f28985c = i10;
        if (!C0() || (iC = c10.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f28752A == (iC < i10)) {
                iN = this.f28770u.n();
                iN2 = 0;
            } else {
                iN2 = this.f28770u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f28774y.f28988f = this.f28770u.m() - iN2;
            this.f28774y.f28989g = this.f28770u.i() + iN;
        } else {
            this.f28774y.f28989g = this.f28770u.h() + iN;
            this.f28774y.f28988f = -iN2;
        }
        l lVar2 = this.f28774y;
        lVar2.f28990h = false;
        lVar2.f28983a = true;
        if (this.f28770u.k() == 0 && this.f28770u.h() == 0) {
            z10 = true;
        }
        lVar2.f28991i = z10;
    }

    private void V1(View view, c cVar, l lVar) {
        if (lVar.f28987e == 1) {
            if (cVar.f28785f) {
                R1(view);
                return;
            } else {
                cVar.f28784e.a(view);
                return;
            }
        }
        if (cVar.f28785f) {
            E2(view);
        } else {
            cVar.f28784e.u(view);
        }
    }

    private void V2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.f28753B.set(fVar.f28806e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.f28753B.set(fVar.f28806e, false);
        }
    }

    private int W1(int i10) {
        if (O() == 0) {
            return this.f28752A ? 1 : -1;
        }
        return (i10 < o2()) != this.f28752A ? -1 : 1;
    }

    private int W2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean Y1(f fVar) {
        if (this.f28752A) {
            if (fVar.k() < this.f28770u.i()) {
                ArrayList<View> arrayList = fVar.f28802a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f28785f;
            }
        } else if (fVar.o() > this.f28770u.m()) {
            return !fVar.n(fVar.f28802a.get(0)).f28785f;
        }
        return false;
    }

    private int Z1(RecyclerView.C c10) {
        if (O() == 0) {
            return 0;
        }
        return t.a(c10, this.f28770u, j2(!this.f28765N), i2(!this.f28765N), this, this.f28765N);
    }

    private int a2(RecyclerView.C c10) {
        if (O() == 0) {
            return 0;
        }
        return t.b(c10, this.f28770u, j2(!this.f28765N), i2(!this.f28765N), this, this.f28765N, this.f28752A);
    }

    private int b2(RecyclerView.C c10) {
        if (O() == 0) {
            return 0;
        }
        return t.c(c10, this.f28770u, j2(!this.f28765N), i2(!this.f28765N), this, this.f28765N);
    }

    private int c2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f28772w == 1) ? 1 : Integer.MIN_VALUE : this.f28772w == 0 ? 1 : Integer.MIN_VALUE : this.f28772w == 1 ? -1 : Integer.MIN_VALUE : this.f28772w == 0 ? -1 : Integer.MIN_VALUE : (this.f28772w != 1 && y2()) ? -1 : 1 : (this.f28772w != 1 && y2()) ? 1 : -1;
    }

    private d.a d2(int i10) {
        d.a aVar = new d.a();
        aVar.f28790D = new int[this.f28768s];
        for (int i11 = 0; i11 < this.f28768s; i11++) {
            aVar.f28790D[i11] = i10 - this.f28769t[i11].l(i10);
        }
        return aVar;
    }

    private d.a e2(int i10) {
        d.a aVar = new d.a();
        aVar.f28790D = new int[this.f28768s];
        for (int i11 = 0; i11 < this.f28768s; i11++) {
            aVar.f28790D[i11] = this.f28769t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void f2() {
        this.f28770u = q.b(this, this.f28772w);
        this.f28771v = q.b(this, 1 - this.f28772w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int g2(RecyclerView.x xVar, l lVar, RecyclerView.C c10) {
        f fVarU2;
        int iE;
        int i10;
        int iE2;
        int iE3;
        boolean z10;
        ?? r92 = 0;
        this.f28753B.set(0, this.f28768s, true);
        int i11 = this.f28774y.f28991i ? lVar.f28987e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : lVar.f28987e == 1 ? lVar.f28989g + lVar.f28984b : lVar.f28988f - lVar.f28984b;
        P2(lVar.f28987e, i11);
        int i12 = this.f28752A ? this.f28770u.i() : this.f28770u.m();
        boolean z11 = false;
        while (lVar.a(c10) && (this.f28774y.f28991i || !this.f28753B.isEmpty())) {
            View viewB = lVar.b(xVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.f28756E.g(iA);
            boolean z12 = iG == -1 ? true : r92;
            if (z12) {
                fVarU2 = cVar.f28785f ? this.f28769t[r92] : u2(lVar);
                this.f28756E.n(iA, fVarU2);
            } else {
                fVarU2 = this.f28769t[iG];
            }
            f fVar = fVarU2;
            cVar.f28784e = fVar;
            if (lVar.f28987e == 1) {
                h(viewB);
            } else {
                i(viewB, r92);
            }
            A2(viewB, cVar, r92);
            if (lVar.f28987e == 1) {
                int iQ2 = cVar.f28785f ? q2(i12) : fVar.l(i12);
                int iE4 = this.f28770u.e(viewB) + iQ2;
                if (z12 && cVar.f28785f) {
                    d.a aVarD2 = d2(iQ2);
                    aVarD2.f28789C = -1;
                    aVarD2.f28788B = iA;
                    this.f28756E.a(aVarD2);
                }
                i10 = iE4;
                iE = iQ2;
            } else {
                int iT2 = cVar.f28785f ? t2(i12) : fVar.p(i12);
                iE = iT2 - this.f28770u.e(viewB);
                if (z12 && cVar.f28785f) {
                    d.a aVarE2 = e2(iT2);
                    aVarE2.f28789C = 1;
                    aVarE2.f28788B = iA;
                    this.f28756E.a(aVarE2);
                }
                i10 = iT2;
            }
            if (cVar.f28785f && lVar.f28986d == -1) {
                if (z12) {
                    this.f28764M = true;
                } else {
                    if (!(lVar.f28987e == 1 ? T1() : U1())) {
                        d.a aVarF = this.f28756E.f(iA);
                        if (aVarF != null) {
                            aVarF.f28791E = true;
                        }
                        this.f28764M = true;
                    }
                }
            }
            V1(viewB, cVar, lVar);
            if (y2() && this.f28772w == 1) {
                int i13 = cVar.f28785f ? this.f28771v.i() : this.f28771v.i() - (((this.f28768s - 1) - fVar.f28806e) * this.f28773x);
                iE3 = i13;
                iE2 = i13 - this.f28771v.e(viewB);
            } else {
                int iM = cVar.f28785f ? this.f28771v.m() : (fVar.f28806e * this.f28773x) + this.f28771v.m();
                iE2 = iM;
                iE3 = this.f28771v.e(viewB) + iM;
            }
            if (this.f28772w == 1) {
                E0(viewB, iE2, iE, iE3, i10);
            } else {
                E0(viewB, iE, iE2, i10, iE3);
            }
            if (cVar.f28785f) {
                P2(this.f28774y.f28987e, i11);
            } else {
                V2(fVar, this.f28774y.f28987e, i11);
            }
            F2(xVar, this.f28774y);
            if (!this.f28774y.f28990h || !viewB.hasFocusable()) {
                z10 = false;
            } else if (cVar.f28785f) {
                this.f28753B.clear();
                z10 = false;
            } else {
                z10 = false;
                this.f28753B.set(fVar.f28806e, false);
            }
            r92 = z10;
            z11 = true;
        }
        int i14 = r92;
        if (!z11) {
            F2(xVar, this.f28774y);
        }
        int iM2 = this.f28774y.f28987e == -1 ? this.f28770u.m() - t2(this.f28770u.m()) : q2(this.f28770u.i()) - this.f28770u.i();
        return iM2 > 0 ? Math.min(lVar.f28984b, iM2) : i14;
    }

    private int h2(int i10) {
        int iO = O();
        for (int i11 = 0; i11 < iO; i11++) {
            int iL0 = l0(N(i11));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private int l2(int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private void m2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int i10;
        int iQ2 = q2(Integer.MIN_VALUE);
        if (iQ2 != Integer.MIN_VALUE && (i10 = this.f28770u.i() - iQ2) > 0) {
            int i11 = i10 - (-K2(-i10, xVar, c10));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f28770u.r(i11);
        }
    }

    private void n2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int iM;
        int iT2 = t2(Integer.MAX_VALUE);
        if (iT2 != Integer.MAX_VALUE && (iM = iT2 - this.f28770u.m()) > 0) {
            int iK2 = iM - K2(iM, xVar, c10);
            if (!z10 || iK2 <= 0) {
                return;
            }
            this.f28770u.r(-iK2);
        }
    }

    private int q2(int i10) {
        int iL = this.f28769t[0].l(i10);
        for (int i11 = 1; i11 < this.f28768s; i11++) {
            int iL2 = this.f28769t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int r2(int i10) {
        int iP = this.f28769t[0].p(i10);
        for (int i11 = 1; i11 < this.f28768s; i11++) {
            int iP2 = this.f28769t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int s2(int i10) {
        int iL = this.f28769t[0].l(i10);
        for (int i11 = 1; i11 < this.f28768s; i11++) {
            int iL2 = this.f28769t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int t2(int i10) {
        int iP = this.f28769t[0].p(i10);
        for (int i11 = 1; i11 < this.f28768s; i11++) {
            int iP2 = this.f28769t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f u2(l lVar) {
        int i10;
        int i11;
        int i12;
        if (C2(lVar.f28987e)) {
            i11 = this.f28768s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f28768s;
            i11 = 0;
            i12 = 1;
        }
        f fVar = null;
        if (lVar.f28987e == 1) {
            int iM = this.f28770u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                f fVar2 = this.f28769t[i11];
                int iL = fVar2.l(iM);
                if (iL < i13) {
                    fVar = fVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i14 = this.f28770u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar3 = this.f28769t[i11];
            int iP = fVar3.p(i14);
            if (iP > i15) {
                fVar = fVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f28752A
            if (r0 == 0) goto L9
            int r0 = r6.p2()
            goto Ld
        L9:
            int r0 = r6.o2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f28756E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f28756E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f28756E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f28756E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f28756E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f28752A
            if (r7 == 0) goto L4e
            int r7 = r6.o2()
            goto L52
        L4e:
            int r7 = r6.p2()
        L52:
            if (r3 > r7) goto L57
            r6.y1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2(int, int, int):void");
    }

    private void z2(View view, int i10, int i11, boolean z10) {
        o(view, this.f28762K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f28762K;
        int iW2 = W2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f28762K;
        int iW22 = W2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? M1(view, iW2, iW22, cVar) : K1(view, iW2, iW22, cVar)) {
            view.measure(iW2, iW22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.C c10) {
        return b2(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f28775z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        return K2(i10, xVar, c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        e eVar = this.f28760I;
        if (eVar != null && eVar.f28792B != i10) {
            eVar.a();
        }
        this.f28754C = i10;
        this.f28755D = Integer.MIN_VALUE;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        return K2(i10, xVar, c10);
    }

    void D2(int i10, RecyclerView.C c10) {
        int iO2;
        int i11;
        if (i10 > 0) {
            iO2 = p2();
            i11 = 1;
        } else {
            iO2 = o2();
            i11 = -1;
        }
        this.f28774y.f28983a = true;
        T2(iO2, c10);
        L2(i11);
        l lVar = this.f28774y;
        lVar.f28985c = iO2 + lVar.f28986d;
        lVar.f28984b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f28768s; i11++) {
            this.f28769t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f28772w == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            iS = RecyclerView.q.s(i10, (this.f28773x * this.f28768s) + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            iS2 = RecyclerView.q.s(i11, (this.f28773x * this.f28768s) + iK0, f0());
        }
        G1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f28772w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I0(int i10) {
        super.I0(i10);
        for (int i11 = 0; i11 < this.f28768s; i11++) {
            this.f28769t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void J0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f28756E.b();
        for (int i10 = 0; i10 < this.f28768s; i10++) {
            this.f28769t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int K2(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        D2(i10, c10);
        int iG2 = g2(xVar, this.f28774y, c10);
        if (this.f28774y.f28984b >= iG2) {
            i10 = i10 < 0 ? -iG2 : iG2;
        }
        this.f28770u.r(-i10);
        this.f28758G = this.f28752A;
        l lVar = this.f28774y;
        lVar.f28984b = 0;
        F2(xVar, lVar);
        return i10;
    }

    public void M2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i10 == this.f28772w) {
            return;
        }
        this.f28772w = i10;
        q qVar = this.f28770u;
        this.f28770u = this.f28771v;
        this.f28771v = qVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        t1(this.f28767P);
        for (int i10 = 0; i10 < this.f28768s; i10++) {
            this.f28769t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        m mVar = new m(recyclerView.getContext());
        mVar.p(i10);
        O1(mVar);
    }

    public void N2(boolean z10) {
        l(null);
        e eVar = this.f28760I;
        if (eVar != null && eVar.f28799I != z10) {
            eVar.f28799I = z10;
        }
        this.f28775z = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        J2();
        int iC2 = c2(i10);
        if (iC2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z10 = cVar.f28785f;
        f fVar = cVar.f28784e;
        int iP2 = iC2 == 1 ? p2() : o2();
        T2(iP2, c10);
        L2(iC2);
        l lVar = this.f28774y;
        lVar.f28985c = lVar.f28986d + iP2;
        lVar.f28984b = (int) (this.f28770u.n() * 0.33333334f);
        l lVar2 = this.f28774y;
        lVar2.f28990h = true;
        lVar2.f28983a = false;
        g2(xVar, lVar2, c10);
        this.f28758G = this.f28752A;
        if (!z10 && (viewM = fVar.m(iP2, iC2)) != null && viewM != viewG) {
            return viewM;
        }
        if (C2(iC2)) {
            for (int i11 = this.f28768s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f28769t[i11].m(iP2, iC2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f28768s; i12++) {
                View viewM3 = this.f28769t[i12].m(iP2, iC2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f28775z ^ true) == (iC2 == -1);
        if (!z10) {
            View viewH = H(z11 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (C2(iC2)) {
            for (int i13 = this.f28768s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f28806e) {
                    View viewH2 = H(z11 ? this.f28769t[i13].f() : this.f28769t[i13].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f28768s; i14++) {
                View viewH3 = H(z11 ? this.f28769t[i14].f() : this.f28769t[i14].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void O2(int i10) {
        l(null);
        if (i10 != this.f28768s) {
            x2();
            this.f28768s = i10;
            this.f28753B = new BitSet(this.f28768s);
            this.f28769t = new f[this.f28768s];
            for (int i11 = 0; i11 < this.f28768s; i11++) {
                this.f28769t[i11] = new f(i11);
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            View viewJ2 = j2(false);
            View viewI2 = i2(false);
            if (viewJ2 == null || viewI2 == null) {
                return;
            }
            int iL0 = l0(viewJ2);
            int iL02 = l0(viewI2);
            if (iL0 < iL02) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL02);
            } else {
                accessibilityEvent.setFromIndex(iL02);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.f28760I == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.x xVar, RecyclerView.C c10, t1.t tVar) {
        super.R0(xVar, c10, tVar);
        tVar.h0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    boolean R2(RecyclerView.C c10, b bVar) {
        int i10;
        if (!c10.e() && (i10 = this.f28754C) != -1) {
            if (i10 >= 0 && i10 < c10.b()) {
                e eVar = this.f28760I;
                if (eVar == null || eVar.f28792B == -1 || eVar.f28794D < 1) {
                    View viewH = H(this.f28754C);
                    if (viewH != null) {
                        bVar.f28777a = this.f28752A ? p2() : o2();
                        if (this.f28755D != Integer.MIN_VALUE) {
                            if (bVar.f28779c) {
                                bVar.f28778b = (this.f28770u.i() - this.f28755D) - this.f28770u.d(viewH);
                            } else {
                                bVar.f28778b = (this.f28770u.m() + this.f28755D) - this.f28770u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f28770u.e(viewH) > this.f28770u.n()) {
                            bVar.f28778b = bVar.f28779c ? this.f28770u.i() : this.f28770u.m();
                            return true;
                        }
                        int iG = this.f28770u.g(viewH) - this.f28770u.m();
                        if (iG < 0) {
                            bVar.f28778b = -iG;
                            return true;
                        }
                        int i11 = this.f28770u.i() - this.f28770u.d(viewH);
                        if (i11 < 0) {
                            bVar.f28778b = i11;
                            return true;
                        }
                        bVar.f28778b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f28754C;
                        bVar.f28777a = i12;
                        int i13 = this.f28755D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f28779c = W1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f28780d = true;
                    }
                } else {
                    bVar.f28778b = Integer.MIN_VALUE;
                    bVar.f28777a = this.f28754C;
                }
                return true;
            }
            this.f28754C = -1;
            this.f28755D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f28772w == 1) {
            return Math.min(this.f28768s, c10.b());
        }
        return -1;
    }

    void S2(RecyclerView.C c10, b bVar) {
        if (R2(c10, bVar) || Q2(c10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f28777a = 0;
    }

    boolean T1() {
        int iL = this.f28769t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f28768s; i10++) {
            if (this.f28769t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(RecyclerView.x xVar, RecyclerView.C c10, View view, t1.t tVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, tVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f28772w == 0) {
            tVar.k0(t.f.a(cVar.e(), cVar.f28785f ? this.f28768s : 1, -1, -1, false, false));
        } else {
            tVar.k0(t.f.a(-1, -1, cVar.e(), cVar.f28785f ? this.f28768s : 1, false, false));
        }
    }

    boolean U1() {
        int iP = this.f28769t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f28768s; i10++) {
            if (this.f28769t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void U2(int i10) {
        this.f28773x = i10 / this.f28768s;
        this.f28761J = View.MeasureSpec.makeMeasureSpec(i10, this.f28771v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.f28756E.b();
        y1();
    }

    boolean X1() {
        int iO2;
        int iP2;
        if (O() == 0 || this.f28757F == 0 || !v0()) {
            return false;
        }
        if (this.f28752A) {
            iO2 = p2();
            iP2 = o2();
        } else {
            iO2 = o2();
            iP2 = p2();
        }
        if (iO2 == 0 && w2() != null) {
            this.f28756E.b();
            z1();
            y1();
            return true;
        }
        if (!this.f28764M) {
            return false;
        }
        int i10 = this.f28752A ? -1 : 1;
        int i11 = iP2 + 1;
        d.a aVarE = this.f28756E.e(iO2, i11, i10, true);
        if (aVarE == null) {
            this.f28764M = false;
            this.f28756E.d(i11);
            return false;
        }
        d.a aVarE2 = this.f28756E.e(iO2, aVarE.f28788B, i10 * (-1), true);
        if (aVarE2 == null) {
            this.f28756E.d(aVarE.f28788B);
        } else {
            this.f28756E.d(aVarE2.f28788B + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        v2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        v2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.C c10) {
        B2(xVar, c10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B.b
    public PointF d(int i10) {
        int iW1 = W1(i10);
        PointF pointF = new PointF();
        if (iW1 == 0) {
            return null;
        }
        if (this.f28772w == 0) {
            pointF.x = iW1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iW1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.C c10) {
        super.d1(c10);
        this.f28754C = -1;
        this.f28755D = Integer.MIN_VALUE;
        this.f28760I = null;
        this.f28763L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f28760I = eVar;
            if (this.f28754C != -1) {
                eVar.a();
                this.f28760I.b();
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable i1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f28760I != null) {
            return new e(this.f28760I);
        }
        e eVar = new e();
        eVar.f28799I = this.f28775z;
        eVar.f28800J = this.f28758G;
        eVar.f28801K = this.f28759H;
        d dVar = this.f28756E;
        if (dVar == null || (iArr = dVar.f28786a) == null) {
            eVar.f28796F = 0;
        } else {
            eVar.f28797G = iArr;
            eVar.f28796F = iArr.length;
            eVar.f28798H = dVar.f28787b;
        }
        if (O() > 0) {
            eVar.f28792B = this.f28758G ? p2() : o2();
            eVar.f28793C = k2();
            int i10 = this.f28768s;
            eVar.f28794D = i10;
            eVar.f28795E = new int[i10];
            for (int i11 = 0; i11 < this.f28768s; i11++) {
                if (this.f28758G) {
                    iP = this.f28769t[i11].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f28770u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f28769t[i11].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f28770u.m();
                        iP -= iM;
                    }
                }
                eVar.f28795E[i11] = iP;
            }
        } else {
            eVar.f28792B = -1;
            eVar.f28793C = -1;
            eVar.f28794D = 0;
        }
        return eVar;
    }

    View i2(boolean z10) {
        int iM = this.f28770u.m();
        int i10 = this.f28770u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f28770u.g(viewN);
            int iD = this.f28770u.d(viewN);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(int i10) {
        if (i10 == 0) {
            X1();
        }
    }

    View j2(boolean z10) {
        int iM = this.f28770u.m();
        int i10 = this.f28770u.i();
        int iO = O();
        View view = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = N(i11);
            int iG = this.f28770u.g(viewN);
            if (this.f28770u.d(viewN) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int k2() {
        View viewI2 = this.f28752A ? i2(true) : j2(true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l(String str) {
        if (this.f28760I == null) {
            super.l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f28772w == 0) {
            return Math.min(this.f28768s, c10.b());
        }
        return -1;
    }

    int o2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f28772w == 0;
    }

    int p2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f28772w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void t(int i10, int i11, RecyclerView.C c10, RecyclerView.q.c cVar) {
        int iL;
        int iP;
        if (this.f28772w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        D2(i10, c10);
        int[] iArr = this.f28766O;
        if (iArr == null || iArr.length < this.f28768s) {
            this.f28766O = new int[this.f28768s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f28768s; i13++) {
            l lVar = this.f28774y;
            if (lVar.f28986d == -1) {
                iL = lVar.f28988f;
                iP = this.f28769t[i13].p(iL);
            } else {
                iL = this.f28769t[i13].l(lVar.f28989g);
                iP = this.f28774y.f28989g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f28766O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f28766O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f28774y.a(c10); i15++) {
            cVar.a(this.f28774y.f28985c, this.f28766O[i15]);
            l lVar2 = this.f28774y;
            lVar2.f28985c += lVar2.f28986d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.C c10) {
        return Z1(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.C c10) {
        return a2(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return this.f28757F != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View w2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f28768s
            r2.<init>(r3)
            int r3 = r12.f28768s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f28772w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.y2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f28752A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f28784e
            int r9 = r9.f28806e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f28784e
            boolean r9 = r12.Y1(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f28784e
            int r9 = r9.f28806e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f28785f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.f28752A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.q r10 = r12.f28770u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.q r11 = r12.f28770u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.q r10 = r12.f28770u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.q r11 = r12.f28770u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f28784e
            int r8 = r8.f28806e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f28784e
            int r9 = r9.f28806e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.C c10) {
        return b2(c10);
    }

    public void x2() {
        this.f28756E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.C c10) {
        return Z1(c10);
    }

    boolean y2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.C c10) {
        return a2(c10);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f28786a;

        /* renamed from: b, reason: collision with root package name */
        List<a> f28787b;

        d() {
        }

        private int i(int i10) {
            if (this.f28787b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f28787b.remove(aVarF);
            }
            int size = this.f28787b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f28787b.get(i11).f28788B >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = this.f28787b.get(i11);
            this.f28787b.remove(i11);
            return aVar.f28788B;
        }

        private void l(int i10, int i11) {
            List<a> list = this.f28787b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f28787b.get(size);
                int i12 = aVar.f28788B;
                if (i12 >= i10) {
                    aVar.f28788B = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<a> list = this.f28787b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f28787b.get(size);
                int i13 = aVar.f28788B;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f28787b.remove(size);
                    } else {
                        aVar.f28788B = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f28787b == null) {
                this.f28787b = new ArrayList();
            }
            int size = this.f28787b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f28787b.get(i10);
                if (aVar2.f28788B == aVar.f28788B) {
                    this.f28787b.remove(i10);
                }
                if (aVar2.f28788B >= aVar.f28788B) {
                    this.f28787b.add(i10, aVar);
                    return;
                }
            }
            this.f28787b.add(aVar);
        }

        void b() {
            int[] iArr = this.f28786a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f28787b = null;
        }

        void c(int i10) {
            int[] iArr = this.f28786a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f28786a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f28786a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f28786a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<a> list = this.f28787b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f28787b.get(size).f28788B >= i10) {
                        this.f28787b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f28787b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f28787b.get(i13);
                int i14 = aVar.f28788B;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f28789C == i12 || (z10 && aVar.f28791E))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f28787b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f28787b.get(size);
                if (aVar.f28788B == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f28786a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f28786a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f28786a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f28786a.length;
            }
            int iMin = Math.min(i11 + 1, this.f28786a.length);
            Arrays.fill(this.f28786a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f28786a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f28786a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f28786a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f28786a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f28786a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f28786a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f28786a[i10] = fVar.f28806e;
        }

        int o(int i10) {
            int length = this.f28786a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0388a();

            /* renamed from: B, reason: collision with root package name */
            int f28788B;

            /* renamed from: C, reason: collision with root package name */
            int f28789C;

            /* renamed from: D, reason: collision with root package name */
            int[] f28790D;

            /* renamed from: E, reason: collision with root package name */
            boolean f28791E;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0388a implements Parcelable.Creator<a> {
                C0388a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f28788B = parcel.readInt();
                this.f28789C = parcel.readInt();
                this.f28791E = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f28790D = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f28790D;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f28788B + ", mGapDir=" + this.f28789C + ", mHasUnwantedGapAfter=" + this.f28791E + ", mGapPerSpan=" + Arrays.toString(this.f28790D) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f28788B);
                parcel.writeInt(this.f28789C);
                parcel.writeInt(this.f28791E ? 1 : 0);
                int[] iArr = this.f28790D;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f28790D);
                }
            }

            a() {
            }
        }
    }
}
