package androidx.constraintlayout.widget;

import a1.d;
import a1.e;
import a1.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b1.C2197b;
import com.apptionlabs.meater_app.data.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: c0, reason: collision with root package name */
    private static j f23920c0;

    /* renamed from: B, reason: collision with root package name */
    SparseArray<View> f23921B;

    /* renamed from: C, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f23922C;

    /* renamed from: D, reason: collision with root package name */
    protected a1.f f23923D;

    /* renamed from: E, reason: collision with root package name */
    private int f23924E;

    /* renamed from: F, reason: collision with root package name */
    private int f23925F;

    /* renamed from: G, reason: collision with root package name */
    private int f23926G;

    /* renamed from: H, reason: collision with root package name */
    private int f23927H;

    /* renamed from: I, reason: collision with root package name */
    protected boolean f23928I;

    /* renamed from: J, reason: collision with root package name */
    private int f23929J;

    /* renamed from: K, reason: collision with root package name */
    private androidx.constraintlayout.widget.d f23930K;

    /* renamed from: L, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f23931L;

    /* renamed from: M, reason: collision with root package name */
    private int f23932M;

    /* renamed from: N, reason: collision with root package name */
    private HashMap<String, Integer> f23933N;

    /* renamed from: O, reason: collision with root package name */
    private int f23934O;

    /* renamed from: P, reason: collision with root package name */
    private int f23935P;

    /* renamed from: Q, reason: collision with root package name */
    int f23936Q;

    /* renamed from: R, reason: collision with root package name */
    int f23937R;

    /* renamed from: S, reason: collision with root package name */
    int f23938S;

    /* renamed from: T, reason: collision with root package name */
    int f23939T;

    /* renamed from: U, reason: collision with root package name */
    private SparseArray<a1.e> f23940U;

    /* renamed from: V, reason: collision with root package name */
    c f23941V;

    /* renamed from: W, reason: collision with root package name */
    private int f23942W;

    /* renamed from: a0, reason: collision with root package name */
    private int f23943a0;

    /* renamed from: b0, reason: collision with root package name */
    private ArrayList<d> f23944b0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23945a;

        static {
            int[] iArr = new int[e.b.values().length];
            f23945a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23945a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23945a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23945a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements C2197b.InterfaceC0421b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f24022a;

        /* renamed from: b, reason: collision with root package name */
        int f24023b;

        /* renamed from: c, reason: collision with root package name */
        int f24024c;

        /* renamed from: d, reason: collision with root package name */
        int f24025d;

        /* renamed from: e, reason: collision with root package name */
        int f24026e;

        /* renamed from: f, reason: collision with root package name */
        int f24027f;

        /* renamed from: g, reason: collision with root package name */
        int f24028g;

        c(ConstraintLayout constraintLayout) {
            this.f24022a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            return View.MeasureSpec.getMode(i11) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i12 == View.MeasureSpec.getSize(i11);
        }

        @Override // b1.C2197b.InterfaceC0421b
        public final void a() {
            int childCount = this.f24022a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f24022a.getChildAt(i10);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f24022a);
                }
            }
            int size = this.f24022a.f23922C.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f24022a.f23922C.get(i11)).p(this.f24022a);
                }
            }
        }

        @Override // b1.C2197b.InterfaceC0421b
        @SuppressLint({"WrongCall"})
        public final void b(a1.e eVar, C2197b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i10;
            int measuredHeight;
            int i11;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f30004e = 0;
                aVar.f30005f = 0;
                aVar.f30006g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            e.b bVar = aVar.f30000a;
            e.b bVar2 = aVar.f30001b;
            int i12 = aVar.f30002c;
            int i13 = aVar.f30003d;
            int i14 = this.f24023b + this.f24024c;
            int i15 = this.f24025d;
            View view = (View) eVar.s();
            int[] iArr = a.f23945a;
            int i16 = iArr[bVar.ordinal()];
            if (i16 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i16 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f24027f, i15, -2);
            } else if (i16 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f24027f, i15 + eVar.B(), -1);
            } else if (i16 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f24027f, i15, -2);
                boolean z10 = eVar.f19856w == 1;
                int i17 = aVar.f30009j;
                if (i17 == C2197b.a.f29998l || i17 == C2197b.a.f29999m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f30009j == C2197b.a.f29999m || !z10 || ((z10 && z11) || (view instanceof g) || eVar.n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i18 = iArr[bVar2.ordinal()];
            if (i18 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (i18 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f24028g, i14, -2);
            } else if (i18 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f24028g, i14 + eVar.U(), -1);
            } else if (i18 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f24028g, i14, -2);
                boolean z12 = eVar.f19858x == 1;
                int i19 = aVar.f30009j;
                if (i19 == C2197b.a.f29998l || i19 == C2197b.a.f29999m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f30009j == C2197b.a.f29999m || !z12 || ((z12 && z13) || (view instanceof g) || eVar.o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            a1.f fVar = (a1.f) eVar.K();
            if (fVar != null && a1.k.b(ConstraintLayout.this.f23929J, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), iMakeMeasureSpec, eVar.W()) && d(eVar.D(), iMakeMeasureSpec2, eVar.x())) {
                aVar.f30004e = eVar.W();
                aVar.f30005f = eVar.x();
                aVar.f30006g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z18 = z14 && eVar.f19819d0 > 0.0f;
            boolean z19 = z15 && eVar.f19819d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i20 = aVar.f30009j;
            if (i20 != C2197b.a.f29998l && i20 != C2197b.a.f29999m && z14 && eVar.f19856w == 0 && z15 && eVar.f19858x == 0) {
                i11 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof k) && (eVar instanceof l)) {
                    ((k) view).t((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i21 = eVar.f19862z;
                iMax = i21 > 0 ? Math.max(i21, measuredWidth) : measuredWidth;
                int i22 = eVar.f19776A;
                if (i22 > 0) {
                    iMax = Math.min(i22, iMax);
                }
                int i23 = eVar.f19780C;
                if (i23 > 0) {
                    measuredHeight = Math.max(i23, measuredHeight2);
                    i10 = iMakeMeasureSpec;
                } else {
                    i10 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i24 = eVar.f19782D;
                if (i24 > 0) {
                    measuredHeight = Math.min(i24, measuredHeight);
                }
                int i25 = iMakeMeasureSpec2;
                if (!a1.k.b(ConstraintLayout.this.f23929J, 1)) {
                    if (z18 && z16) {
                        iMax = (int) ((measuredHeight * eVar.f19819d0) + 0.5f);
                    } else if (z19 && z17) {
                        measuredHeight = (int) ((iMax / eVar.f19819d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i10;
                    int iMakeMeasureSpec4 = measuredHeight2 != measuredHeight ? View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824) : i25;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.W0(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i11 = -1;
            }
            boolean z20 = baseline != i11;
            aVar.f30008i = (iMax == aVar.f30002c && measuredHeight == aVar.f30003d) ? false : true;
            if (bVar5.f23985g0) {
                z20 = true;
            }
            if (z20 && baseline != -1 && eVar.p() != baseline) {
                aVar.f30008i = true;
            }
            aVar.f30004e = iMax;
            aVar.f30005f = measuredHeight;
            aVar.f30007h = z20;
            aVar.f30006g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f24023b = i12;
            this.f24024c = i13;
            this.f24025d = i14;
            this.f24026e = i15;
            this.f24027f = i10;
            this.f24028g = i11;
        }
    }

    public interface d {
        boolean a(int i10, int i11, int i12, View view, b bVar);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23921B = new SparseArray<>();
        this.f23922C = new ArrayList<>(4);
        this.f23923D = new a1.f();
        this.f23924E = 0;
        this.f23925F = 0;
        this.f23926G = Integer.MAX_VALUE;
        this.f23927H = Integer.MAX_VALUE;
        this.f23928I = true;
        this.f23929J = 257;
        this.f23930K = null;
        this.f23931L = null;
        this.f23932M = -1;
        this.f23933N = new HashMap<>();
        this.f23934O = -1;
        this.f23935P = -1;
        this.f23936Q = -1;
        this.f23937R = -1;
        this.f23938S = 0;
        this.f23939T = 0;
        this.f23940U = new SparseArray<>();
        this.f23941V = new c(this);
        this.f23942W = 0;
        this.f23943a0 = 0;
        s(attributeSet, 0, 0);
    }

    private void B(a1.e eVar, b bVar, SparseArray<a1.e> sparseArray, int i10, d.a aVar) {
        View view = this.f23921B.get(i10);
        a1.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f23985g0 = true;
        d.a aVar2 = d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f23985g0 = true;
            bVar2.f24015v0.L0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.f23949D, bVar.f23948C, true);
        eVar.L0(true);
        eVar.o(d.a.TOP).q();
        eVar.o(d.a.BOTTOM).q();
    }

    private boolean C() throws Resources.NotFoundException {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            y();
        }
        return z10;
    }

    static /* synthetic */ X0.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (f23920c0 == null) {
            f23920c0 = new j();
        }
        return f23920c0;
    }

    private a1.e p(int i10) {
        if (i10 == 0) {
            return this.f23923D;
        }
        View viewFindViewById = this.f23921B.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f23923D;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f24015v0;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f23923D.C0(this);
        this.f23923D.X1(this.f23941V);
        this.f23921B.put(getId(), this);
        this.f23930K = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f24393V0, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == i.f24479f1) {
                    this.f23924E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23924E);
                } else if (index == i.f24488g1) {
                    this.f23925F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23925F);
                } else if (index == i.f24461d1) {
                    this.f23926G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23926G);
                } else if (index == i.f24470e1) {
                    this.f23927H = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23927H);
                } else if (index == i.f24339O2) {
                    this.f23929J = typedArrayObtainStyledAttributes.getInt(index, this.f23929J);
                } else if (index == i.f24298J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f23931L = null;
                        }
                    }
                } else if (index == i.f24551n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f23930K = dVar;
                        dVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f23930K = null;
                    }
                    this.f23932M = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f23923D.Y1(this.f23929J);
    }

    private void u() {
        this.f23928I = true;
        this.f23934O = -1;
        this.f23935P = -1;
        this.f23936Q = -1;
        this.f23937R = -1;
        this.f23938S = 0;
        this.f23939T = 0;
    }

    private void y() throws Resources.NotFoundException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            a1.e eVarR = r(getChildAt(i10));
            if (eVarR != null) {
                eVarR.t0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    p(childAt.getId()).D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f23932M != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f23932M && (childAt2 instanceof e)) {
                    this.f23930K = ((e) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.d dVar = this.f23930K;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f23923D.v1();
        int size = this.f23922C.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f23922C.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.f23940U.clear();
        this.f23940U.put(0, this.f23923D);
        this.f23940U.put(getId(), this.f23923D);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f23940U.put(childAt4.getId(), r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            a1.e eVarR2 = r(childAt5);
            if (eVarR2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f23923D.b(eVarR2);
                e(zIsInEditMode, childAt5, eVarR2, bVar, this.f23940U);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 a1.e$b) = (r2v3 a1.e$b), (r2v0 a1.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void A(a1.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f23941V
            int r1 = r0.f24026e
            int r0 = r0.f24025d
            a1.e$b r2 = a1.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f23926G
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            a1.e$b r9 = a1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f23924E
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            a1.e$b r9 = a1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f23924E
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.f23927H
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            a1.e$b r2 = a1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f23925F
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            a1.e$b r2 = a1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f23925F
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.W()
            if (r10 != r11) goto L69
            int r11 = r8.x()
            if (r12 == r11) goto L6c
        L69:
            r8.P1()
        L6c:
            r8.n1(r6)
            r8.o1(r6)
            int r11 = r7.f23926G
            int r11 = r11 - r0
            r8.Y0(r11)
            int r11 = r7.f23927H
            int r11 = r11 - r1
            r8.X0(r11)
            r8.b1(r6)
            r8.a1(r6)
            r8.Q0(r9)
            r8.l1(r10)
            r8.h1(r2)
            r8.M0(r12)
            int r9 = r7.f23924E
            int r9 = r9 - r0
            r8.b1(r9)
            int r9 = r7.f23925F
            int r9 = r9 - r1
            r8.a1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.A(a1.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f23922C;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f23922C.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    protected void e(boolean z10, View view, a1.e eVar, b bVar, SparseArray<a1.e> sparseArray) {
        a1.e eVar2;
        a1.e eVar3;
        a1.e eVar4;
        a1.e eVar5;
        int i10;
        bVar.a();
        bVar.f24017w0 = false;
        eVar.k1(view.getVisibility());
        if (bVar.f23991j0) {
            eVar.U0(true);
            eVar.k1(8);
        }
        eVar.C0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(eVar, this.f23923D.R1());
        }
        if (bVar.f23987h0) {
            a1.h hVar = (a1.h) eVar;
            int i11 = bVar.f24009s0;
            int i12 = bVar.f24011t0;
            float f10 = bVar.f24013u0;
            if (f10 != -1.0f) {
                hVar.A1(f10);
                return;
            } else if (i11 != -1) {
                hVar.y1(i11);
                return;
            } else {
                if (i12 != -1) {
                    hVar.z1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f23995l0;
        int i14 = bVar.f23997m0;
        int i15 = bVar.f23999n0;
        int i16 = bVar.f24001o0;
        int i17 = bVar.f24003p0;
        int i18 = bVar.f24005q0;
        float f11 = bVar.f24007r0;
        int i19 = bVar.f24002p;
        if (i19 != -1) {
            a1.e eVar6 = sparseArray.get(i19);
            if (eVar6 != null) {
                eVar.l(eVar6, bVar.f24006r, bVar.f24004q);
            }
        } else {
            if (i13 != -1) {
                a1.e eVar7 = sparseArray.get(i13);
                if (eVar7 != null) {
                    d.a aVar = d.a.LEFT;
                    eVar.e0(aVar, eVar7, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                eVar.e0(d.a.LEFT, eVar2, d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                a1.e eVar8 = sparseArray.get(i15);
                if (eVar8 != null) {
                    eVar.e0(d.a.RIGHT, eVar8, d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = sparseArray.get(i16)) != null) {
                d.a aVar2 = d.a.RIGHT;
                eVar.e0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f23988i;
            if (i20 != -1) {
                a1.e eVar9 = sparseArray.get(i20);
                if (eVar9 != null) {
                    d.a aVar3 = d.a.TOP;
                    eVar.e0(aVar3, eVar9, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f24018x);
                }
            } else {
                int i21 = bVar.f23990j;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.e0(d.a.TOP, eVar4, d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f24018x);
                }
            }
            int i22 = bVar.f23992k;
            if (i22 != -1) {
                a1.e eVar10 = sparseArray.get(i22);
                if (eVar10 != null) {
                    eVar.e0(d.a.BOTTOM, eVar10, d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f24020z);
                }
            } else {
                int i23 = bVar.f23994l;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    d.a aVar4 = d.a.BOTTOM;
                    eVar.e0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f24020z);
                }
            }
            int i24 = bVar.f23996m;
            if (i24 != -1) {
                B(eVar, bVar, sparseArray, i24, d.a.BASELINE);
            } else {
                int i25 = bVar.f23998n;
                if (i25 != -1) {
                    B(eVar, bVar, sparseArray, i25, d.a.TOP);
                } else {
                    int i26 = bVar.f24000o;
                    if (i26 != -1) {
                        B(eVar, bVar, sparseArray, i26, d.a.BOTTOM);
                    }
                }
            }
            if (f11 >= 0.0f) {
                eVar.N0(f11);
            }
            float f12 = bVar.f23953H;
            if (f12 >= 0.0f) {
                eVar.e1(f12);
            }
        }
        if (z10 && ((i10 = bVar.f23969X) != -1 || bVar.f23970Y != -1)) {
            eVar.c1(i10, bVar.f23970Y);
        }
        if (bVar.f23981e0) {
            eVar.Q0(e.b.FIXED);
            eVar.l1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.Q0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f23973a0) {
                eVar.Q0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.Q0(e.b.MATCH_PARENT);
            }
            eVar.o(d.a.LEFT).f19762g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.o(d.a.RIGHT).f19762g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.Q0(e.b.MATCH_CONSTRAINT);
            eVar.l1(0);
        }
        if (bVar.f23983f0) {
            eVar.h1(e.b.FIXED);
            eVar.M0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.h1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f23975b0) {
                eVar.h1(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.h1(e.b.MATCH_PARENT);
            }
            eVar.o(d.a.TOP).f19762g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.o(d.a.BOTTOM).f19762g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.h1(e.b.MATCH_CONSTRAINT);
            eVar.M0(0);
        }
        eVar.E0(bVar.f23954I);
        eVar.S0(bVar.f23957L);
        eVar.j1(bVar.f23958M);
        eVar.O0(bVar.f23959N);
        eVar.f1(bVar.f23960O);
        eVar.m1(bVar.f23979d0);
        eVar.R0(bVar.f23961P, bVar.f23963R, bVar.f23965T, bVar.f23967V);
        eVar.i1(bVar.f23962Q, bVar.f23964S, bVar.f23966U, bVar.f23968W);
    }

    protected boolean f(int i10, int i11) {
        boolean zA = false;
        if (this.f23944b0 == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        Iterator<d> it = this.f23944b0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            Iterator<a1.e> it2 = this.f23923D.s1().iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next().s();
                zA |= next.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return zA;
    }

    @Override // android.view.View
    public void forceLayout() {
        u();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f23927H;
    }

    public int getMaxWidth() {
        return this.f23926G;
    }

    public int getMinHeight() {
        return this.f23925F;
    }

    public int getMinWidth() {
        return this.f23924E;
    }

    public int getOptimizationLevel() {
        return this.f23923D.L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f23923D.f19840o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f23923D.f19840o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f23923D.f19840o = "parent";
            }
        }
        if (this.f23923D.t() == null) {
            a1.f fVar = this.f23923D;
            fVar.D0(fVar.f19840o);
            Log.v("ConstraintLayout", " setDebugName " + this.f23923D.t());
        }
        Iterator<a1.e> it = this.f23923D.s1().iterator();
        while (it.hasNext()) {
            a1.e next = it.next();
            View view = (View) next.s();
            if (view != null) {
                if (next.f19840o == null && (id2 = view.getId()) != -1) {
                    next.f19840o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.t() == null) {
                    next.D0(next.f19840o);
                    Log.v("ConstraintLayout", " setDebugName " + next.t());
                }
            }
        }
        this.f23923D.O(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object i(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f23933N;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f23933N.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            a1.e eVar = bVar.f24015v0;
            if ((childAt.getVisibility() != 8 || bVar.f23987h0 || bVar.f23989i0 || bVar.f23993k0 || zIsInEditMode) && !bVar.f23991j0) {
                int iX = eVar.X();
                int iY = eVar.Y();
                int iW = eVar.W() + iX;
                int iX2 = eVar.x() + iY;
                childAt.layout(iX, iY, iW, iX2);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iX, iY, iW, iX2);
                }
            }
        }
        int size = this.f23922C.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f23922C.get(i15).o(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean zF = this.f23928I | f(i10, i11);
        this.f23928I = zF;
        if (!zF) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f23928I = true;
                    break;
                }
                i12++;
            }
        }
        this.f23942W = i10;
        this.f23943a0 = i11;
        this.f23923D.a2(t());
        if (this.f23928I) {
            this.f23928I = false;
            if (C()) {
                this.f23923D.c2();
            }
        }
        this.f23923D.J1(null);
        x(this.f23923D, this.f23929J, i10, i11);
        w(i10, i11, this.f23923D.W(), this.f23923D.x(), this.f23923D.S1(), this.f23923D.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        a1.e eVarR = r(view);
        if ((view instanceof Guideline) && !(eVarR instanceof a1.h)) {
            b bVar = (b) view.getLayoutParams();
            a1.h hVar = new a1.h();
            bVar.f24015v0 = hVar;
            bVar.f23987h0 = true;
            hVar.B1(bVar.f23971Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).f23989i0 = true;
            if (!this.f23922C.contains(bVar2)) {
                this.f23922C.add(bVar2);
            }
        }
        this.f23921B.put(view.getId(), view);
        this.f23928I = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f23921B.remove(view.getId());
        this.f23923D.u1(r(view));
        this.f23922C.remove(view);
        this.f23928I = true;
    }

    public View q(int i10) {
        return this.f23921B.get(i10);
    }

    public final a1.e r(View view) {
        if (view == this) {
            return this.f23923D;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f24015v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f24015v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.d dVar) {
        this.f23930K = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f23921B.remove(getId());
        super.setId(i10);
        this.f23921B.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f23927H) {
            return;
        }
        this.f23927H = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f23926G) {
            return;
        }
        this.f23926G = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f23925F) {
            return;
        }
        this.f23925F = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f23924E) {
            return;
        }
        this.f23924E = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.f23931L;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f23929J = i10;
        this.f23923D.Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void v(int i10) {
        this.f23931L = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    protected void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f23941V;
        int i14 = cVar.f24026e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f24025d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f23926G, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f23927H, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f23934O = iMin;
        this.f23935P = iMin2;
    }

    protected void x(a1.f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i13 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f23941V.c(i11, i12, iMax, iMax2, paddingWidth, i13);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? t() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        A(fVar, mode, i14, mode2, i15);
        fVar.T1(i10, mode, i14, mode2, i15, this.f23934O, this.f23935P, iMax5, iMax);
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f23933N == null) {
                this.f23933N = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f23933N.put(strSubstring, num);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23921B = new SparseArray<>();
        this.f23922C = new ArrayList<>(4);
        this.f23923D = new a1.f();
        this.f23924E = 0;
        this.f23925F = 0;
        this.f23926G = Integer.MAX_VALUE;
        this.f23927H = Integer.MAX_VALUE;
        this.f23928I = true;
        this.f23929J = 257;
        this.f23930K = null;
        this.f23931L = null;
        this.f23932M = -1;
        this.f23933N = new HashMap<>();
        this.f23934O = -1;
        this.f23935P = -1;
        this.f23936Q = -1;
        this.f23937R = -1;
        this.f23938S = 0;
        this.f23939T = 0;
        this.f23940U = new SparseArray<>();
        this.f23941V = new c(this);
        this.f23942W = 0;
        this.f23943a0 = 0;
        s(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f23946A;

        /* renamed from: B, reason: collision with root package name */
        public int f23947B;

        /* renamed from: C, reason: collision with root package name */
        public int f23948C;

        /* renamed from: D, reason: collision with root package name */
        public int f23949D;

        /* renamed from: E, reason: collision with root package name */
        boolean f23950E;

        /* renamed from: F, reason: collision with root package name */
        boolean f23951F;

        /* renamed from: G, reason: collision with root package name */
        public float f23952G;

        /* renamed from: H, reason: collision with root package name */
        public float f23953H;

        /* renamed from: I, reason: collision with root package name */
        public String f23954I;

        /* renamed from: J, reason: collision with root package name */
        float f23955J;

        /* renamed from: K, reason: collision with root package name */
        int f23956K;

        /* renamed from: L, reason: collision with root package name */
        public float f23957L;

        /* renamed from: M, reason: collision with root package name */
        public float f23958M;

        /* renamed from: N, reason: collision with root package name */
        public int f23959N;

        /* renamed from: O, reason: collision with root package name */
        public int f23960O;

        /* renamed from: P, reason: collision with root package name */
        public int f23961P;

        /* renamed from: Q, reason: collision with root package name */
        public int f23962Q;

        /* renamed from: R, reason: collision with root package name */
        public int f23963R;

        /* renamed from: S, reason: collision with root package name */
        public int f23964S;

        /* renamed from: T, reason: collision with root package name */
        public int f23965T;

        /* renamed from: U, reason: collision with root package name */
        public int f23966U;

        /* renamed from: V, reason: collision with root package name */
        public float f23967V;

        /* renamed from: W, reason: collision with root package name */
        public float f23968W;

        /* renamed from: X, reason: collision with root package name */
        public int f23969X;

        /* renamed from: Y, reason: collision with root package name */
        public int f23970Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f23971Z;

        /* renamed from: a, reason: collision with root package name */
        public int f23972a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f23973a0;

        /* renamed from: b, reason: collision with root package name */
        public int f23974b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f23975b0;

        /* renamed from: c, reason: collision with root package name */
        public float f23976c;

        /* renamed from: c0, reason: collision with root package name */
        public String f23977c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f23978d;

        /* renamed from: d0, reason: collision with root package name */
        public int f23979d0;

        /* renamed from: e, reason: collision with root package name */
        public int f23980e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f23981e0;

        /* renamed from: f, reason: collision with root package name */
        public int f23982f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f23983f0;

        /* renamed from: g, reason: collision with root package name */
        public int f23984g;

        /* renamed from: g0, reason: collision with root package name */
        boolean f23985g0;

        /* renamed from: h, reason: collision with root package name */
        public int f23986h;

        /* renamed from: h0, reason: collision with root package name */
        boolean f23987h0;

        /* renamed from: i, reason: collision with root package name */
        public int f23988i;

        /* renamed from: i0, reason: collision with root package name */
        boolean f23989i0;

        /* renamed from: j, reason: collision with root package name */
        public int f23990j;

        /* renamed from: j0, reason: collision with root package name */
        boolean f23991j0;

        /* renamed from: k, reason: collision with root package name */
        public int f23992k;

        /* renamed from: k0, reason: collision with root package name */
        boolean f23993k0;

        /* renamed from: l, reason: collision with root package name */
        public int f23994l;

        /* renamed from: l0, reason: collision with root package name */
        int f23995l0;

        /* renamed from: m, reason: collision with root package name */
        public int f23996m;

        /* renamed from: m0, reason: collision with root package name */
        int f23997m0;

        /* renamed from: n, reason: collision with root package name */
        public int f23998n;

        /* renamed from: n0, reason: collision with root package name */
        int f23999n0;

        /* renamed from: o, reason: collision with root package name */
        public int f24000o;

        /* renamed from: o0, reason: collision with root package name */
        int f24001o0;

        /* renamed from: p, reason: collision with root package name */
        public int f24002p;

        /* renamed from: p0, reason: collision with root package name */
        int f24003p0;

        /* renamed from: q, reason: collision with root package name */
        public int f24004q;

        /* renamed from: q0, reason: collision with root package name */
        int f24005q0;

        /* renamed from: r, reason: collision with root package name */
        public float f24006r;

        /* renamed from: r0, reason: collision with root package name */
        float f24007r0;

        /* renamed from: s, reason: collision with root package name */
        public int f24008s;

        /* renamed from: s0, reason: collision with root package name */
        int f24009s0;

        /* renamed from: t, reason: collision with root package name */
        public int f24010t;

        /* renamed from: t0, reason: collision with root package name */
        int f24011t0;

        /* renamed from: u, reason: collision with root package name */
        public int f24012u;

        /* renamed from: u0, reason: collision with root package name */
        float f24013u0;

        /* renamed from: v, reason: collision with root package name */
        public int f24014v;

        /* renamed from: v0, reason: collision with root package name */
        a1.e f24015v0;

        /* renamed from: w, reason: collision with root package name */
        public int f24016w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f24017w0;

        /* renamed from: x, reason: collision with root package name */
        public int f24018x;

        /* renamed from: y, reason: collision with root package name */
        public int f24019y;

        /* renamed from: z, reason: collision with root package name */
        public int f24020z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f24021a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f24021a = sparseIntArray;
                sparseIntArray.append(i.f24651z2, 64);
                sparseIntArray.append(i.f24453c2, 65);
                sparseIntArray.append(i.f24534l2, 8);
                sparseIntArray.append(i.f24543m2, 9);
                sparseIntArray.append(i.f24561o2, 10);
                sparseIntArray.append(i.f24570p2, 11);
                sparseIntArray.append(i.f24619v2, 12);
                sparseIntArray.append(i.f24611u2, 13);
                sparseIntArray.append(i.f24370S1, 14);
                sparseIntArray.append(i.f24362R1, 15);
                sparseIntArray.append(i.f24330N1, 16);
                sparseIntArray.append(i.f24346P1, 52);
                sparseIntArray.append(i.f24338O1, 53);
                sparseIntArray.append(i.f24378T1, 2);
                sparseIntArray.append(i.f24394V1, 3);
                sparseIntArray.append(i.f24386U1, 4);
                sparseIntArray.append(i.f24259E2, 49);
                sparseIntArray.append(i.f24267F2, 50);
                sparseIntArray.append(i.f24426Z1, 5);
                sparseIntArray.append(i.f24435a2, 6);
                sparseIntArray.append(i.f24444b2, 7);
                sparseIntArray.append(i.f24290I1, 67);
                sparseIntArray.append(i.f24401W0, 1);
                sparseIntArray.append(i.f24579q2, 17);
                sparseIntArray.append(i.f24587r2, 18);
                sparseIntArray.append(i.f24418Y1, 19);
                sparseIntArray.append(i.f24410X1, 20);
                sparseIntArray.append(i.f24299J2, 21);
                sparseIntArray.append(i.f24323M2, 22);
                sparseIntArray.append(i.f24307K2, 23);
                sparseIntArray.append(i.f24283H2, 24);
                sparseIntArray.append(i.f24315L2, 25);
                sparseIntArray.append(i.f24291I2, 26);
                sparseIntArray.append(i.f24275G2, 55);
                sparseIntArray.append(i.f24331N2, 54);
                sparseIntArray.append(i.f24498h2, 29);
                sparseIntArray.append(i.f24627w2, 30);
                sparseIntArray.append(i.f24402W1, 44);
                sparseIntArray.append(i.f24516j2, 45);
                sparseIntArray.append(i.f24643y2, 46);
                sparseIntArray.append(i.f24507i2, 47);
                sparseIntArray.append(i.f24635x2, 48);
                sparseIntArray.append(i.f24314L1, 27);
                sparseIntArray.append(i.f24306K1, 28);
                sparseIntArray.append(i.f24227A2, 31);
                sparseIntArray.append(i.f24462d2, 32);
                sparseIntArray.append(i.f24243C2, 33);
                sparseIntArray.append(i.f24235B2, 34);
                sparseIntArray.append(i.f24251D2, 35);
                sparseIntArray.append(i.f24480f2, 36);
                sparseIntArray.append(i.f24471e2, 37);
                sparseIntArray.append(i.f24489g2, 38);
                sparseIntArray.append(i.f24525k2, 39);
                sparseIntArray.append(i.f24603t2, 40);
                sparseIntArray.append(i.f24552n2, 41);
                sparseIntArray.append(i.f24354Q1, 42);
                sparseIntArray.append(i.f24322M1, 43);
                sparseIntArray.append(i.f24595s2, 51);
                sparseIntArray.append(i.f24347P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23972a = -1;
            this.f23974b = -1;
            this.f23976c = -1.0f;
            this.f23978d = true;
            this.f23980e = -1;
            this.f23982f = -1;
            this.f23984g = -1;
            this.f23986h = -1;
            this.f23988i = -1;
            this.f23990j = -1;
            this.f23992k = -1;
            this.f23994l = -1;
            this.f23996m = -1;
            this.f23998n = -1;
            this.f24000o = -1;
            this.f24002p = -1;
            this.f24004q = 0;
            this.f24006r = 0.0f;
            this.f24008s = -1;
            this.f24010t = -1;
            this.f24012u = -1;
            this.f24014v = -1;
            this.f24016w = Integer.MIN_VALUE;
            this.f24018x = Integer.MIN_VALUE;
            this.f24019y = Integer.MIN_VALUE;
            this.f24020z = Integer.MIN_VALUE;
            this.f23946A = Integer.MIN_VALUE;
            this.f23947B = Integer.MIN_VALUE;
            this.f23948C = Integer.MIN_VALUE;
            this.f23949D = 0;
            this.f23950E = true;
            this.f23951F = true;
            this.f23952G = 0.5f;
            this.f23953H = 0.5f;
            this.f23954I = null;
            this.f23955J = 0.0f;
            this.f23956K = 1;
            this.f23957L = -1.0f;
            this.f23958M = -1.0f;
            this.f23959N = 0;
            this.f23960O = 0;
            this.f23961P = 0;
            this.f23962Q = 0;
            this.f23963R = 0;
            this.f23964S = 0;
            this.f23965T = 0;
            this.f23966U = 0;
            this.f23967V = 1.0f;
            this.f23968W = 1.0f;
            this.f23969X = -1;
            this.f23970Y = -1;
            this.f23971Z = -1;
            this.f23973a0 = false;
            this.f23975b0 = false;
            this.f23977c0 = null;
            this.f23979d0 = 0;
            this.f23981e0 = true;
            this.f23983f0 = true;
            this.f23985g0 = false;
            this.f23987h0 = false;
            this.f23989i0 = false;
            this.f23991j0 = false;
            this.f23993k0 = false;
            this.f23995l0 = -1;
            this.f23997m0 = -1;
            this.f23999n0 = -1;
            this.f24001o0 = -1;
            this.f24003p0 = Integer.MIN_VALUE;
            this.f24005q0 = Integer.MIN_VALUE;
            this.f24007r0 = 0.5f;
            this.f24015v0 = new a1.e();
            this.f24017w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f23972a = bVar.f23972a;
                this.f23974b = bVar.f23974b;
                this.f23976c = bVar.f23976c;
                this.f23978d = bVar.f23978d;
                this.f23980e = bVar.f23980e;
                this.f23982f = bVar.f23982f;
                this.f23984g = bVar.f23984g;
                this.f23986h = bVar.f23986h;
                this.f23988i = bVar.f23988i;
                this.f23990j = bVar.f23990j;
                this.f23992k = bVar.f23992k;
                this.f23994l = bVar.f23994l;
                this.f23996m = bVar.f23996m;
                this.f23998n = bVar.f23998n;
                this.f24000o = bVar.f24000o;
                this.f24002p = bVar.f24002p;
                this.f24004q = bVar.f24004q;
                this.f24006r = bVar.f24006r;
                this.f24008s = bVar.f24008s;
                this.f24010t = bVar.f24010t;
                this.f24012u = bVar.f24012u;
                this.f24014v = bVar.f24014v;
                this.f24016w = bVar.f24016w;
                this.f24018x = bVar.f24018x;
                this.f24019y = bVar.f24019y;
                this.f24020z = bVar.f24020z;
                this.f23946A = bVar.f23946A;
                this.f23947B = bVar.f23947B;
                this.f23948C = bVar.f23948C;
                this.f23949D = bVar.f23949D;
                this.f23952G = bVar.f23952G;
                this.f23953H = bVar.f23953H;
                this.f23954I = bVar.f23954I;
                this.f23955J = bVar.f23955J;
                this.f23956K = bVar.f23956K;
                this.f23957L = bVar.f23957L;
                this.f23958M = bVar.f23958M;
                this.f23959N = bVar.f23959N;
                this.f23960O = bVar.f23960O;
                this.f23973a0 = bVar.f23973a0;
                this.f23975b0 = bVar.f23975b0;
                this.f23961P = bVar.f23961P;
                this.f23962Q = bVar.f23962Q;
                this.f23963R = bVar.f23963R;
                this.f23965T = bVar.f23965T;
                this.f23964S = bVar.f23964S;
                this.f23966U = bVar.f23966U;
                this.f23967V = bVar.f23967V;
                this.f23968W = bVar.f23968W;
                this.f23969X = bVar.f23969X;
                this.f23970Y = bVar.f23970Y;
                this.f23971Z = bVar.f23971Z;
                this.f23981e0 = bVar.f23981e0;
                this.f23983f0 = bVar.f23983f0;
                this.f23985g0 = bVar.f23985g0;
                this.f23987h0 = bVar.f23987h0;
                this.f23995l0 = bVar.f23995l0;
                this.f23997m0 = bVar.f23997m0;
                this.f23999n0 = bVar.f23999n0;
                this.f24001o0 = bVar.f24001o0;
                this.f24003p0 = bVar.f24003p0;
                this.f24005q0 = bVar.f24005q0;
                this.f24007r0 = bVar.f24007r0;
                this.f23977c0 = bVar.f23977c0;
                this.f23979d0 = bVar.f23979d0;
                this.f24015v0 = bVar.f24015v0;
                this.f23950E = bVar.f23950E;
                this.f23951F = bVar.f23951F;
            }
        }

        public void a() {
            this.f23987h0 = false;
            this.f23981e0 = true;
            this.f23983f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f23973a0) {
                this.f23981e0 = false;
                if (this.f23961P == 0) {
                    this.f23961P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f23975b0) {
                this.f23983f0 = false;
                if (this.f23962Q == 0) {
                    this.f23962Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f23981e0 = false;
                if (i10 == 0 && this.f23961P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f23973a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f23983f0 = false;
                if (i11 == 0 && this.f23962Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f23975b0 = true;
                }
            }
            if (this.f23976c == -1.0f && this.f23972a == -1 && this.f23974b == -1) {
                return;
            }
            this.f23987h0 = true;
            this.f23981e0 = true;
            this.f23983f0 = true;
            if (!(this.f24015v0 instanceof a1.h)) {
                this.f24015v0 = new a1.h();
            }
            ((a1.h) this.f24015v0).B1(this.f23971Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23972a = -1;
            this.f23974b = -1;
            this.f23976c = -1.0f;
            this.f23978d = true;
            this.f23980e = -1;
            this.f23982f = -1;
            this.f23984g = -1;
            this.f23986h = -1;
            this.f23988i = -1;
            this.f23990j = -1;
            this.f23992k = -1;
            this.f23994l = -1;
            this.f23996m = -1;
            this.f23998n = -1;
            this.f24000o = -1;
            this.f24002p = -1;
            this.f24004q = 0;
            this.f24006r = 0.0f;
            this.f24008s = -1;
            this.f24010t = -1;
            this.f24012u = -1;
            this.f24014v = -1;
            this.f24016w = Integer.MIN_VALUE;
            this.f24018x = Integer.MIN_VALUE;
            this.f24019y = Integer.MIN_VALUE;
            this.f24020z = Integer.MIN_VALUE;
            this.f23946A = Integer.MIN_VALUE;
            this.f23947B = Integer.MIN_VALUE;
            this.f23948C = Integer.MIN_VALUE;
            this.f23949D = 0;
            this.f23950E = true;
            this.f23951F = true;
            this.f23952G = 0.5f;
            this.f23953H = 0.5f;
            this.f23954I = null;
            this.f23955J = 0.0f;
            this.f23956K = 1;
            this.f23957L = -1.0f;
            this.f23958M = -1.0f;
            this.f23959N = 0;
            this.f23960O = 0;
            this.f23961P = 0;
            this.f23962Q = 0;
            this.f23963R = 0;
            this.f23964S = 0;
            this.f23965T = 0;
            this.f23966U = 0;
            this.f23967V = 1.0f;
            this.f23968W = 1.0f;
            this.f23969X = -1;
            this.f23970Y = -1;
            this.f23971Z = -1;
            this.f23973a0 = false;
            this.f23975b0 = false;
            this.f23977c0 = null;
            this.f23979d0 = 0;
            this.f23981e0 = true;
            this.f23983f0 = true;
            this.f23985g0 = false;
            this.f23987h0 = false;
            this.f23989i0 = false;
            this.f23991j0 = false;
            this.f23993k0 = false;
            this.f23995l0 = -1;
            this.f23997m0 = -1;
            this.f23999n0 = -1;
            this.f24001o0 = -1;
            this.f24003p0 = Integer.MIN_VALUE;
            this.f24005q0 = Integer.MIN_VALUE;
            this.f24007r0 = 0.5f;
            this.f24015v0 = new a1.e();
            this.f24017w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f24393V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f24021a.get(index);
                switch (i11) {
                    case 1:
                        this.f23971Z = typedArrayObtainStyledAttributes.getInt(index, this.f23971Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f24002p);
                        this.f24002p = resourceId;
                        if (resourceId == -1) {
                            this.f24002p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f24004q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24004q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f24006r) % 360.0f;
                        this.f24006r = f10;
                        if (f10 < 0.0f) {
                            this.f24006r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f23972a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23972a);
                        break;
                    case 6:
                        this.f23974b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23974b);
                        break;
                    case 7:
                        this.f23976c = typedArrayObtainStyledAttributes.getFloat(index, this.f23976c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23980e);
                        this.f23980e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f23980e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23982f);
                        this.f23982f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f23982f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23984g);
                        this.f23984g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f23984g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23986h);
                        this.f23986h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f23986h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23988i);
                        this.f23988i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f23988i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23990j);
                        this.f23990j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f23990j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23992k);
                        this.f23992k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f23992k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23994l);
                        this.f23994l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f23994l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23996m);
                        this.f23996m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f23996m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f24008s);
                        this.f24008s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f24008s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f24010t);
                        this.f24010t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f24010t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f24012u);
                        this.f24012u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f24012u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f24014v);
                        this.f24014v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f24014v = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f24016w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24016w);
                        break;
                    case 22:
                        this.f24018x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24018x);
                        break;
                    case 23:
                        this.f24019y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24019y);
                        break;
                    case 24:
                        this.f24020z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f24020z);
                        break;
                    case 25:
                        this.f23946A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23946A);
                        break;
                    case 26:
                        this.f23947B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23947B);
                        break;
                    case 27:
                        this.f23973a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f23973a0);
                        break;
                    case 28:
                        this.f23975b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f23975b0);
                        break;
                    case 29:
                        this.f23952G = typedArrayObtainStyledAttributes.getFloat(index, this.f23952G);
                        break;
                    case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                        this.f23953H = typedArrayObtainStyledAttributes.getFloat(index, this.f23953H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f23961P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f23962Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f23963R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23963R);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f23963R) == -2) {
                                this.f23963R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f23965T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23965T);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f23965T) == -2) {
                                this.f23965T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f23967V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f23967V));
                        this.f23961P = 2;
                        break;
                    case 36:
                        try {
                            this.f23964S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23964S);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f23964S) == -2) {
                                this.f23964S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f23966U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23966U);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f23966U) == -2) {
                                this.f23966U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f23968W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f23968W));
                        this.f23962Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.d.r(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f23957L = typedArrayObtainStyledAttributes.getFloat(index, this.f23957L);
                                break;
                            case 46:
                                this.f23958M = typedArrayObtainStyledAttributes.getFloat(index, this.f23958M);
                                break;
                            case 47:
                                this.f23959N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f23960O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f23969X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23969X);
                                break;
                            case 50:
                                this.f23970Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f23970Y);
                                break;
                            case 51:
                                this.f23977c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f23998n);
                                this.f23998n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f23998n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f24000o);
                                this.f24000o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f24000o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f23949D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23949D);
                                break;
                            case 55:
                                this.f23948C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f23948C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.d.p(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f23950E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.d.p(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f23951F = true;
                                        break;
                                    case 66:
                                        this.f23979d0 = typedArrayObtainStyledAttributes.getInt(index, this.f23979d0);
                                        break;
                                    case 67:
                                        this.f23978d = typedArrayObtainStyledAttributes.getBoolean(index, this.f23978d);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f23972a = -1;
            this.f23974b = -1;
            this.f23976c = -1.0f;
            this.f23978d = true;
            this.f23980e = -1;
            this.f23982f = -1;
            this.f23984g = -1;
            this.f23986h = -1;
            this.f23988i = -1;
            this.f23990j = -1;
            this.f23992k = -1;
            this.f23994l = -1;
            this.f23996m = -1;
            this.f23998n = -1;
            this.f24000o = -1;
            this.f24002p = -1;
            this.f24004q = 0;
            this.f24006r = 0.0f;
            this.f24008s = -1;
            this.f24010t = -1;
            this.f24012u = -1;
            this.f24014v = -1;
            this.f24016w = Integer.MIN_VALUE;
            this.f24018x = Integer.MIN_VALUE;
            this.f24019y = Integer.MIN_VALUE;
            this.f24020z = Integer.MIN_VALUE;
            this.f23946A = Integer.MIN_VALUE;
            this.f23947B = Integer.MIN_VALUE;
            this.f23948C = Integer.MIN_VALUE;
            this.f23949D = 0;
            this.f23950E = true;
            this.f23951F = true;
            this.f23952G = 0.5f;
            this.f23953H = 0.5f;
            this.f23954I = null;
            this.f23955J = 0.0f;
            this.f23956K = 1;
            this.f23957L = -1.0f;
            this.f23958M = -1.0f;
            this.f23959N = 0;
            this.f23960O = 0;
            this.f23961P = 0;
            this.f23962Q = 0;
            this.f23963R = 0;
            this.f23964S = 0;
            this.f23965T = 0;
            this.f23966U = 0;
            this.f23967V = 1.0f;
            this.f23968W = 1.0f;
            this.f23969X = -1;
            this.f23970Y = -1;
            this.f23971Z = -1;
            this.f23973a0 = false;
            this.f23975b0 = false;
            this.f23977c0 = null;
            this.f23979d0 = 0;
            this.f23981e0 = true;
            this.f23983f0 = true;
            this.f23985g0 = false;
            this.f23987h0 = false;
            this.f23989i0 = false;
            this.f23991j0 = false;
            this.f23993k0 = false;
            this.f23995l0 = -1;
            this.f23997m0 = -1;
            this.f23999n0 = -1;
            this.f24001o0 = -1;
            this.f24003p0 = Integer.MIN_VALUE;
            this.f24005q0 = Integer.MIN_VALUE;
            this.f24007r0 = 0.5f;
            this.f24015v0 = new a1.e();
            this.f24017w0 = false;
        }
    }
}
