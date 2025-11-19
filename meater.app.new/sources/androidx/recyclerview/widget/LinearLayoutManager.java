package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import t1.t;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.q implements RecyclerView.B.b {

    /* renamed from: A, reason: collision with root package name */
    int f28513A;

    /* renamed from: B, reason: collision with root package name */
    int f28514B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f28515C;

    /* renamed from: D, reason: collision with root package name */
    d f28516D;

    /* renamed from: E, reason: collision with root package name */
    final a f28517E;

    /* renamed from: F, reason: collision with root package name */
    private final b f28518F;

    /* renamed from: G, reason: collision with root package name */
    private int f28519G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f28520H;

    /* renamed from: s, reason: collision with root package name */
    int f28521s;

    /* renamed from: t, reason: collision with root package name */
    private c f28522t;

    /* renamed from: u, reason: collision with root package name */
    q f28523u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f28524v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f28525w;

    /* renamed from: x, reason: collision with root package name */
    boolean f28526x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f28527y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f28528z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        q f28529a;

        /* renamed from: b, reason: collision with root package name */
        int f28530b;

        /* renamed from: c, reason: collision with root package name */
        int f28531c;

        /* renamed from: d, reason: collision with root package name */
        boolean f28532d;

        /* renamed from: e, reason: collision with root package name */
        boolean f28533e;

        a() {
            e();
        }

        void a() {
            this.f28531c = this.f28532d ? this.f28529a.i() : this.f28529a.m();
        }

        public void b(View view, int i10) {
            if (this.f28532d) {
                this.f28531c = this.f28529a.d(view) + this.f28529a.o();
            } else {
                this.f28531c = this.f28529a.g(view);
            }
            this.f28530b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f28529a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f28530b = i10;
            if (this.f28532d) {
                int i11 = (this.f28529a.i() - iO) - this.f28529a.d(view);
                this.f28531c = this.f28529a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f28531c - this.f28529a.e(view);
                    int iM = this.f28529a.m();
                    int iMin = iE - (iM + Math.min(this.f28529a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f28531c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f28529a.g(view);
            int iM2 = iG - this.f28529a.m();
            this.f28531c = iG;
            if (iM2 > 0) {
                int i12 = (this.f28529a.i() - Math.min(0, (this.f28529a.i() - iO) - this.f28529a.d(view))) - (iG + this.f28529a.e(view));
                if (i12 < 0) {
                    this.f28531c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.C c10) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.c() && rVar.a() >= 0 && rVar.a() < c10.b();
        }

        void e() {
            this.f28530b = -1;
            this.f28531c = Integer.MIN_VALUE;
            this.f28532d = false;
            this.f28533e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f28530b + ", mCoordinate=" + this.f28531c + ", mLayoutFromEnd=" + this.f28532d + ", mValid=" + this.f28533e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f28534a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f28535b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f28536c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28537d;

        protected b() {
        }

        void a() {
            this.f28534a = 0;
            this.f28535b = false;
            this.f28536c = false;
            this.f28537d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f28539b;

        /* renamed from: c, reason: collision with root package name */
        int f28540c;

        /* renamed from: d, reason: collision with root package name */
        int f28541d;

        /* renamed from: e, reason: collision with root package name */
        int f28542e;

        /* renamed from: f, reason: collision with root package name */
        int f28543f;

        /* renamed from: g, reason: collision with root package name */
        int f28544g;

        /* renamed from: k, reason: collision with root package name */
        int f28548k;

        /* renamed from: m, reason: collision with root package name */
        boolean f28550m;

        /* renamed from: a, reason: collision with root package name */
        boolean f28538a = true;

        /* renamed from: h, reason: collision with root package name */
        int f28545h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f28546i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f28547j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.G> f28549l = null;

        c() {
        }

        private View e() {
            int size = this.f28549l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f28549l.get(i10).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.c() && this.f28541d == rVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f28541d = -1;
            } else {
                this.f28541d = ((RecyclerView.r) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.C c10) {
            int i10 = this.f28541d;
            return i10 >= 0 && i10 < c10.b();
        }

        View d(RecyclerView.x xVar) {
            if (this.f28549l != null) {
                return e();
            }
            View viewO = xVar.o(this.f28541d);
            this.f28541d += this.f28542e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f28549l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f28549l.get(i11).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.c() && (iA = (rVar.a() - this.f28541d) * this.f28542e) >= 0 && iA < i10) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        int f28551B;

        /* renamed from: C, reason: collision with root package name */
        int f28552C;

        /* renamed from: D, reason: collision with root package name */
        boolean f28553D;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f28551B >= 0;
        }

        void b() {
            this.f28551B = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f28551B);
            parcel.writeInt(this.f28552C);
            parcel.writeInt(this.f28553D ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f28551B = parcel.readInt();
            this.f28552C = parcel.readInt();
            this.f28553D = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f28551B = dVar.f28551B;
            this.f28552C = dVar.f28552C;
            this.f28553D = dVar.f28553D;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f28526x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f28523u.d(viewN) > i12 || this.f28523u.p(viewN) > i12) {
                    y2(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f28523u.d(viewN2) > i12 || this.f28523u.p(viewN2) > i12) {
                y2(xVar, i14, i15);
                return;
            }
        }
    }

    private void C2() {
        if (this.f28521s == 1 || !s2()) {
            this.f28526x = this.f28525w;
        } else {
            this.f28526x = !this.f28525w;
        }
    }

    private boolean I2(RecyclerView.x xVar, RecyclerView.C c10, a aVar) {
        View viewL2;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, c10)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z11 = this.f28524v;
        boolean z12 = this.f28527y;
        if (z11 != z12 || (viewL2 = l2(xVar, c10, aVar.f28532d, z12)) == null) {
            return false;
        }
        aVar.b(viewL2, l0(viewL2));
        if (!c10.e() && Q1()) {
            int iG = this.f28523u.g(viewL2);
            int iD = this.f28523u.d(viewL2);
            int iM = this.f28523u.m();
            int i10 = this.f28523u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f28532d) {
                    iM = i10;
                }
                aVar.f28531c = iM;
            }
        }
        return true;
    }

    private boolean J2(RecyclerView.C c10, a aVar) {
        int i10;
        if (!c10.e() && (i10 = this.f28513A) != -1) {
            if (i10 >= 0 && i10 < c10.b()) {
                aVar.f28530b = this.f28513A;
                d dVar = this.f28516D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.f28516D.f28553D;
                    aVar.f28532d = z10;
                    if (z10) {
                        aVar.f28531c = this.f28523u.i() - this.f28516D.f28552C;
                    } else {
                        aVar.f28531c = this.f28523u.m() + this.f28516D.f28552C;
                    }
                    return true;
                }
                if (this.f28514B != Integer.MIN_VALUE) {
                    boolean z11 = this.f28526x;
                    aVar.f28532d = z11;
                    if (z11) {
                        aVar.f28531c = this.f28523u.i() - this.f28514B;
                    } else {
                        aVar.f28531c = this.f28523u.m() + this.f28514B;
                    }
                    return true;
                }
                View viewH = H(this.f28513A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f28532d = (this.f28513A < l0(N(0))) == this.f28526x;
                    }
                    aVar.a();
                } else {
                    if (this.f28523u.e(viewH) > this.f28523u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f28523u.g(viewH) - this.f28523u.m() < 0) {
                        aVar.f28531c = this.f28523u.m();
                        aVar.f28532d = false;
                        return true;
                    }
                    if (this.f28523u.i() - this.f28523u.d(viewH) < 0) {
                        aVar.f28531c = this.f28523u.i();
                        aVar.f28532d = true;
                        return true;
                    }
                    aVar.f28531c = aVar.f28532d ? this.f28523u.d(viewH) + this.f28523u.o() : this.f28523u.g(viewH);
                }
                return true;
            }
            this.f28513A = -1;
            this.f28514B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void K2(RecyclerView.x xVar, RecyclerView.C c10, a aVar) {
        if (J2(c10, aVar) || I2(xVar, c10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f28530b = this.f28527y ? c10.b() - 1 : 0;
    }

    private void L2(int i10, int i11, boolean z10, RecyclerView.C c10) {
        int iM;
        this.f28522t.f28550m = B2();
        this.f28522t.f28543f = i10;
        int[] iArr = this.f28520H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(c10, iArr);
        int iMax = Math.max(0, this.f28520H[0]);
        int iMax2 = Math.max(0, this.f28520H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f28522t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f28545h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f28546i = iMax;
        if (z11) {
            cVar.f28545h = i12 + this.f28523u.j();
            View viewO2 = o2();
            c cVar2 = this.f28522t;
            cVar2.f28542e = this.f28526x ? -1 : 1;
            int iL0 = l0(viewO2);
            c cVar3 = this.f28522t;
            cVar2.f28541d = iL0 + cVar3.f28542e;
            cVar3.f28539b = this.f28523u.d(viewO2);
            iM = this.f28523u.d(viewO2) - this.f28523u.i();
        } else {
            View viewP2 = p2();
            this.f28522t.f28545h += this.f28523u.m();
            c cVar4 = this.f28522t;
            cVar4.f28542e = this.f28526x ? 1 : -1;
            int iL02 = l0(viewP2);
            c cVar5 = this.f28522t;
            cVar4.f28541d = iL02 + cVar5.f28542e;
            cVar5.f28539b = this.f28523u.g(viewP2);
            iM = (-this.f28523u.g(viewP2)) + this.f28523u.m();
        }
        c cVar6 = this.f28522t;
        cVar6.f28540c = i11;
        if (z10) {
            cVar6.f28540c = i11 - iM;
        }
        cVar6.f28544g = iM;
    }

    private void M2(int i10, int i11) {
        this.f28522t.f28540c = this.f28523u.i() - i11;
        c cVar = this.f28522t;
        cVar.f28542e = this.f28526x ? -1 : 1;
        cVar.f28541d = i10;
        cVar.f28543f = 1;
        cVar.f28539b = i11;
        cVar.f28544g = Integer.MIN_VALUE;
    }

    private void N2(a aVar) {
        M2(aVar.f28530b, aVar.f28531c);
    }

    private void O2(int i10, int i11) {
        this.f28522t.f28540c = i11 - this.f28523u.m();
        c cVar = this.f28522t;
        cVar.f28541d = i10;
        cVar.f28542e = this.f28526x ? 1 : -1;
        cVar.f28543f = -1;
        cVar.f28539b = i11;
        cVar.f28544g = Integer.MIN_VALUE;
    }

    private void P2(a aVar) {
        O2(aVar.f28530b, aVar.f28531c);
    }

    private int T1(RecyclerView.C c10) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return t.a(c10, this.f28523u, d2(!this.f28528z, true), c2(!this.f28528z, true), this, this.f28528z);
    }

    private int U1(RecyclerView.C c10) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return t.b(c10, this.f28523u, d2(!this.f28528z, true), c2(!this.f28528z, true), this, this.f28528z, this.f28526x);
    }

    private int V1(RecyclerView.C c10) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return t.c(c10, this.f28523u, d2(!this.f28528z, true), c2(!this.f28528z, true), this, this.f28528z);
    }

    private View b2() {
        return h2(0, O());
    }

    private View f2() {
        return h2(O() - 1, -1);
    }

    private View j2() {
        return this.f28526x ? b2() : f2();
    }

    private View k2() {
        return this.f28526x ? f2() : b2();
    }

    private int m2(int i10, RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int i11;
        int i12 = this.f28523u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -D2(-i12, xVar, c10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f28523u.i() - i14) <= 0) {
            return i13;
        }
        this.f28523u.r(i11);
        return i11 + i13;
    }

    private int n2(int i10, RecyclerView.x xVar, RecyclerView.C c10, boolean z10) {
        int iM;
        int iM2 = i10 - this.f28523u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -D2(iM2, xVar, c10);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f28523u.m()) <= 0) {
            return i11;
        }
        this.f28523u.r(-iM);
        return i11 - iM;
    }

    private View o2() {
        return N(this.f28526x ? 0 : O() - 1);
    }

    private View p2() {
        return N(this.f28526x ? O() - 1 : 0);
    }

    private void v2(RecyclerView.x xVar, RecyclerView.C c10, int i10, int i11) {
        if (!c10.g() || O() == 0 || c10.e() || !Q1()) {
            return;
        }
        List<RecyclerView.G> listK = xVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.G g10 = listK.get(i12);
            if (!g10.isRemoved()) {
                if ((g10.getLayoutPosition() < iL0) != this.f28526x) {
                    iE += this.f28523u.e(g10.itemView);
                } else {
                    iE2 += this.f28523u.e(g10.itemView);
                }
            }
        }
        this.f28522t.f28549l = listK;
        if (iE > 0) {
            O2(l0(p2()), i10);
            c cVar = this.f28522t;
            cVar.f28545h = iE;
            cVar.f28540c = 0;
            cVar.a();
            Z1(xVar, this.f28522t, c10, false);
        }
        if (iE2 > 0) {
            M2(l0(o2()), i11);
            c cVar2 = this.f28522t;
            cVar2.f28545h = iE2;
            cVar2.f28540c = 0;
            cVar2.a();
            Z1(xVar, this.f28522t, c10, false);
        }
        this.f28522t.f28549l = null;
    }

    private void x2(RecyclerView.x xVar, c cVar) {
        if (!cVar.f28538a || cVar.f28550m) {
            return;
        }
        int i10 = cVar.f28544g;
        int i11 = cVar.f28546i;
        if (cVar.f28543f == -1) {
            z2(xVar, i10, i11);
        } else {
            A2(xVar, i10, i11);
        }
    }

    private void y2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                s1(i10, xVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                s1(i12, xVar);
            }
        }
    }

    private void z2(RecyclerView.x xVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f28523u.h() - i10) + i11;
        if (this.f28526x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f28523u.g(viewN) < iH || this.f28523u.q(viewN) < iH) {
                    y2(xVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f28523u.g(viewN2) < iH || this.f28523u.q(viewN2) < iH) {
                y2(xVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int A(RecyclerView.C c10) {
        return V1(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f28525w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f28521s == 1) {
            return 0;
        }
        return D2(i10, xVar, c10);
    }

    boolean B2() {
        return this.f28523u.k() == 0 && this.f28523u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.f28513A = i10;
        this.f28514B = Integer.MIN_VALUE;
        d dVar = this.f28516D;
        if (dVar != null) {
            dVar.b();
        }
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f28521s == 0) {
            return 0;
        }
        return D2(i10, xVar, c10);
    }

    int D2(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        Y1();
        this.f28522t.f28538a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        L2(i11, iAbs, true, c10);
        c cVar = this.f28522t;
        int iZ1 = cVar.f28544g + Z1(xVar, cVar, c10, false);
        if (iZ1 < 0) {
            return 0;
        }
        if (iAbs > iZ1) {
            i10 = i11 * iZ1;
        }
        this.f28523u.r(-i10);
        this.f28522t.f28548k = i10;
        return i10;
    }

    public void E2(int i10, int i11) {
        this.f28513A = i10;
        this.f28514B = i11;
        d dVar = this.f28516D;
        if (dVar != null) {
            dVar.b();
        }
        y1();
    }

    public void F2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f28521s || this.f28523u == null) {
            q qVarB = q.b(this, i10);
            this.f28523u = qVarB;
            this.f28517E.f28529a = qVarB;
            this.f28521s = i10;
            y1();
        }
    }

    public void G2(boolean z10) {
        l(null);
        if (z10 == this.f28525w) {
            return;
        }
        this.f28525w = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    public void H2(boolean z10) {
        l(null);
        if (this.f28527y == z10) {
            return;
        }
        this.f28527y = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean L1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        if (this.f28515C) {
            p1(xVar);
            xVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void N1(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        m mVar = new m(recyclerView.getContext());
        mVar.p(i10);
        O1(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        int iW1;
        C2();
        if (O() == 0 || (iW1 = W1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        Y1();
        L2(iW1, (int) (this.f28523u.n() * 0.33333334f), false, c10);
        c cVar = this.f28522t;
        cVar.f28544g = Integer.MIN_VALUE;
        cVar.f28538a = false;
        Z1(xVar, cVar, c10, true);
        View viewK2 = iW1 == -1 ? k2() : j2();
        View viewP2 = iW1 == -1 ? p2() : o2();
        if (!viewP2.hasFocusable()) {
            return viewK2;
        }
        if (viewK2 == null) {
            return null;
        }
        return viewP2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(e2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.f28516D == null && this.f28524v == this.f28527y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.x xVar, RecyclerView.C c10, t1.t tVar) {
        super.R0(xVar, c10, tVar);
        RecyclerView.h hVar = this.f28709b.f28589N;
        if (hVar == null || hVar.h() <= 0) {
            return;
        }
        tVar.b(t.a.f49757B);
    }

    protected void R1(RecyclerView.C c10, int[] iArr) {
        int i10;
        int iQ2 = q2(c10);
        if (this.f28522t.f28543f == -1) {
            i10 = 0;
        } else {
            i10 = iQ2;
            iQ2 = 0;
        }
        iArr[0] = iQ2;
        iArr[1] = i10;
    }

    void S1(RecyclerView.C c10, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f28541d;
        if (i10 < 0 || i10 >= c10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f28544g));
    }

    int W1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f28521s == 1) ? 1 : Integer.MIN_VALUE : this.f28521s == 0 ? 1 : Integer.MIN_VALUE : this.f28521s == 1 ? -1 : Integer.MIN_VALUE : this.f28521s == 0 ? -1 : Integer.MIN_VALUE : (this.f28521s != 1 && s2()) ? -1 : 1 : (this.f28521s != 1 && s2()) ? 1 : -1;
    }

    c X1() {
        return new c();
    }

    void Y1() {
        if (this.f28522t == null) {
            this.f28522t = X1();
        }
    }

    int Z1(RecyclerView.x xVar, c cVar, RecyclerView.C c10, boolean z10) {
        int i10 = cVar.f28540c;
        int i11 = cVar.f28544g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f28544g = i11 + i10;
            }
            x2(xVar, cVar);
        }
        int i12 = cVar.f28540c + cVar.f28545h;
        b bVar = this.f28518F;
        while (true) {
            if ((!cVar.f28550m && i12 <= 0) || !cVar.c(c10)) {
                break;
            }
            bVar.a();
            u2(xVar, c10, cVar, bVar);
            if (!bVar.f28535b) {
                cVar.f28539b += bVar.f28534a * cVar.f28543f;
                if (!bVar.f28536c || cVar.f28549l != null || !c10.e()) {
                    int i13 = cVar.f28540c;
                    int i14 = bVar.f28534a;
                    cVar.f28540c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f28544g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f28534a;
                    cVar.f28544g = i16;
                    int i17 = cVar.f28540c;
                    if (i17 < 0) {
                        cVar.f28544g = i16 + i17;
                    }
                    x2(xVar, cVar);
                }
                if (z10 && bVar.f28537d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f28540c;
    }

    public int a2() {
        View viewI2 = i2(0, O(), true, false);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void c1(RecyclerView.x xVar, RecyclerView.C c10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iM2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f28516D == null && this.f28513A == -1) && c10.b() == 0) {
            p1(xVar);
            return;
        }
        d dVar = this.f28516D;
        if (dVar != null && dVar.a()) {
            this.f28513A = this.f28516D.f28551B;
        }
        Y1();
        this.f28522t.f28538a = false;
        C2();
        View viewA0 = a0();
        a aVar = this.f28517E;
        if (!aVar.f28533e || this.f28513A != -1 || this.f28516D != null) {
            aVar.e();
            a aVar2 = this.f28517E;
            aVar2.f28532d = this.f28526x ^ this.f28527y;
            K2(xVar, c10, aVar2);
            this.f28517E.f28533e = true;
        } else if (viewA0 != null && (this.f28523u.g(viewA0) >= this.f28523u.i() || this.f28523u.d(viewA0) <= this.f28523u.m())) {
            this.f28517E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f28522t;
        cVar.f28543f = cVar.f28548k >= 0 ? 1 : -1;
        int[] iArr = this.f28520H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(c10, iArr);
        int iMax = Math.max(0, this.f28520H[0]) + this.f28523u.m();
        int iMax2 = Math.max(0, this.f28520H[1]) + this.f28523u.j();
        if (c10.e() && (i14 = this.f28513A) != -1 && this.f28514B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f28526x) {
                i15 = this.f28523u.i() - this.f28523u.d(viewH);
                iG = this.f28514B;
            } else {
                iG = this.f28523u.g(viewH) - this.f28523u.m();
                i15 = this.f28514B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f28517E;
        if (!aVar3.f28532d ? !this.f28526x : this.f28526x) {
            i16 = 1;
        }
        w2(xVar, c10, aVar3, i16);
        B(xVar);
        this.f28522t.f28550m = B2();
        this.f28522t.f28547j = c10.e();
        this.f28522t.f28546i = 0;
        a aVar4 = this.f28517E;
        if (aVar4.f28532d) {
            P2(aVar4);
            c cVar2 = this.f28522t;
            cVar2.f28545h = iMax;
            Z1(xVar, cVar2, c10, false);
            c cVar3 = this.f28522t;
            i11 = cVar3.f28539b;
            int i18 = cVar3.f28541d;
            int i19 = cVar3.f28540c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            N2(this.f28517E);
            c cVar4 = this.f28522t;
            cVar4.f28545h = iMax2;
            cVar4.f28541d += cVar4.f28542e;
            Z1(xVar, cVar4, c10, false);
            c cVar5 = this.f28522t;
            i10 = cVar5.f28539b;
            int i20 = cVar5.f28540c;
            if (i20 > 0) {
                O2(i18, i11);
                c cVar6 = this.f28522t;
                cVar6.f28545h = i20;
                Z1(xVar, cVar6, c10, false);
                i11 = this.f28522t.f28539b;
            }
        } else {
            N2(aVar4);
            c cVar7 = this.f28522t;
            cVar7.f28545h = iMax2;
            Z1(xVar, cVar7, c10, false);
            c cVar8 = this.f28522t;
            i10 = cVar8.f28539b;
            int i21 = cVar8.f28541d;
            int i22 = cVar8.f28540c;
            if (i22 > 0) {
                iMax += i22;
            }
            P2(this.f28517E);
            c cVar9 = this.f28522t;
            cVar9.f28545h = iMax;
            cVar9.f28541d += cVar9.f28542e;
            Z1(xVar, cVar9, c10, false);
            c cVar10 = this.f28522t;
            i11 = cVar10.f28539b;
            int i23 = cVar10.f28540c;
            if (i23 > 0) {
                M2(i21, i10);
                c cVar11 = this.f28522t;
                cVar11.f28545h = i23;
                Z1(xVar, cVar11, c10, false);
                i10 = this.f28522t.f28539b;
            }
        }
        if (O() > 0) {
            if (this.f28526x ^ this.f28527y) {
                int iM22 = m2(i10, xVar, c10, true);
                i12 = i11 + iM22;
                i13 = i10 + iM22;
                iM2 = n2(i12, xVar, c10, false);
            } else {
                int iN2 = n2(i11, xVar, c10, true);
                i12 = i11 + iN2;
                i13 = i10 + iN2;
                iM2 = m2(i13, xVar, c10, false);
            }
            i11 = i12 + iM2;
            i10 = i13 + iM2;
        }
        v2(xVar, c10, i11, i10);
        if (c10.e()) {
            this.f28517E.e();
        } else {
            this.f28523u.s();
        }
        this.f28524v = this.f28527y;
    }

    View c2(boolean z10, boolean z11) {
        return this.f28526x ? i2(0, O(), z10, z11) : i2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B.b
    @SuppressLint({"UnknownNullness"})
    public PointF d(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f28526x ? -1 : 1;
        return this.f28521s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void d1(RecyclerView.C c10) {
        super.d1(c10);
        this.f28516D = null;
        this.f28513A = -1;
        this.f28514B = Integer.MIN_VALUE;
        this.f28517E.e();
    }

    View d2(boolean z10, boolean z11) {
        return this.f28526x ? i2(O() - 1, -1, z10, z11) : i2(0, O(), z10, z11);
    }

    public int e2() {
        View viewI2 = i2(0, O(), false, true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    public int g2() {
        View viewI2 = i2(O() - 1, -1, false, true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f28516D = dVar;
            if (this.f28513A != -1) {
                dVar.b();
            }
            y1();
        }
    }

    View h2(int i10, int i11) {
        int i12;
        int i13;
        Y1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f28523u.g(N(i10)) < this.f28523u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f28521s == 0 ? this.f28712e.a(i10, i11, i12, i13) : this.f28713f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public Parcelable i1() {
        if (this.f28516D != null) {
            return new d(this.f28516D);
        }
        d dVar = new d();
        if (O() > 0) {
            Y1();
            boolean z10 = this.f28524v ^ this.f28526x;
            dVar.f28553D = z10;
            if (z10) {
                View viewO2 = o2();
                dVar.f28552C = this.f28523u.i() - this.f28523u.d(viewO2);
                dVar.f28551B = l0(viewO2);
            } else {
                View viewP2 = p2();
                dVar.f28551B = l0(viewP2);
                dVar.f28552C = this.f28523u.g(viewP2) - this.f28523u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View i2(int i10, int i11, boolean z10, boolean z11) {
        Y1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f28521s == 0 ? this.f28712e.a(i10, i11, i12, i13) : this.f28713f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void l(String str) {
        if (this.f28516D == null) {
            super.l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean l1(int i10, Bundle bundle) {
        int iMin;
        if (super.l1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f28521s == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f28709b;
                iMin = Math.min(i11, o0(recyclerView.f28569D, recyclerView.f28584K0) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f28709b;
                iMin = Math.min(i12, S(recyclerView2.f28569D, recyclerView2.f28584K0) - 1);
            }
            if (iMin >= 0) {
                E2(iMin, 0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View l2(androidx.recyclerview.widget.RecyclerView.x r17, androidx.recyclerview.widget.RecyclerView.C r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.Y1()
            int r1 = r16.O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.O()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.q r7 = r0.f28523u
            int r7 = r7.m()
            androidx.recyclerview.widget.q r8 = r0.f28523u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.N(r1)
            int r13 = r0.l0(r12)
            androidx.recyclerview.widget.q r14 = r0.f28523u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.q r15 = r0.f28523u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$r r13 = (androidx.recyclerview.widget.RecyclerView.r) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.l2(androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f28521s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f28521s == 1;
    }

    @Deprecated
    protected int q2(RecyclerView.C c10) {
        if (c10.d()) {
            return this.f28523u.n();
        }
        return 0;
    }

    public int r2() {
        return this.f28521s;
    }

    protected boolean s2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void t(int i10, int i11, RecyclerView.C c10, RecyclerView.q.c cVar) {
        if (this.f28521s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        Y1();
        L2(i10 > 0 ? 1 : -1, Math.abs(i10), true, c10);
        S1(c10, this.f28522t, cVar);
    }

    public boolean t2() {
        return this.f28528z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void u(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f28516D;
        if (dVar == null || !dVar.a()) {
            C2();
            z10 = this.f28526x;
            i11 = this.f28513A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f28516D;
            z10 = dVar2.f28553D;
            i11 = dVar2.f28551B;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f28519G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    void u2(RecyclerView.x xVar, RecyclerView.C c10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int iI0;
        int iF;
        View viewD = cVar.d(xVar);
        if (viewD == null) {
            bVar.f28535b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) viewD.getLayoutParams();
        if (cVar.f28549l == null) {
            if (this.f28526x == (cVar.f28543f == -1)) {
                h(viewD);
            } else {
                i(viewD, 0);
            }
        } else {
            if (this.f28526x == (cVar.f28543f == -1)) {
                f(viewD);
            } else {
                g(viewD, 0);
            }
        }
        F0(viewD, 0, 0);
        bVar.f28534a = this.f28523u.e(viewD);
        if (this.f28521s == 1) {
            if (s2()) {
                iF = s0() - j0();
                iI0 = iF - this.f28523u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f28523u.f(viewD) + iI0;
            }
            if (cVar.f28543f == -1) {
                int i13 = cVar.f28539b;
                i12 = i13;
                i11 = iF;
                i10 = i13 - bVar.f28534a;
            } else {
                int i14 = cVar.f28539b;
                i10 = i14;
                i11 = iF;
                i12 = bVar.f28534a + i14;
            }
        } else {
            int iK0 = k0();
            int iF2 = this.f28523u.f(viewD) + iK0;
            if (cVar.f28543f == -1) {
                int i15 = cVar.f28539b;
                i11 = i15;
                i10 = iK0;
                i12 = iF2;
                iI0 = i15 - bVar.f28534a;
            } else {
                int i16 = cVar.f28539b;
                i10 = iK0;
                i11 = bVar.f28534a + i16;
                i12 = iF2;
                iI0 = i16;
            }
        }
        E0(viewD, iI0, i10, i11, i12);
        if (rVar.c() || rVar.b()) {
            bVar.f28536c = true;
        }
        bVar.f28537d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int v(RecyclerView.C c10) {
        return T1(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.C c10) {
        return U1(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int x(RecyclerView.C c10) {
        return V1(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.C c10) {
        return T1(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.C c10) {
        return U1(c10);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f28521s = 1;
        this.f28525w = false;
        this.f28526x = false;
        this.f28527y = false;
        this.f28528z = true;
        this.f28513A = -1;
        this.f28514B = Integer.MIN_VALUE;
        this.f28516D = null;
        this.f28517E = new a();
        this.f28518F = new b();
        this.f28519G = 2;
        this.f28520H = new int[2];
        F2(i10);
        G2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f28521s = 1;
        this.f28525w = false;
        this.f28526x = false;
        this.f28527y = false;
        this.f28528z = true;
        this.f28513A = -1;
        this.f28514B = Integer.MIN_VALUE;
        this.f28516D = null;
        this.f28517E = new a();
        this.f28518F = new b();
        this.f28519G = 2;
        this.f28520H = new int[2];
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        F2(dVarM0.f28728a);
        G2(dVarM0.f28730c);
        H2(dVarM0.f28731d);
    }

    void w2(RecyclerView.x xVar, RecyclerView.C c10, a aVar, int i10) {
    }
}
