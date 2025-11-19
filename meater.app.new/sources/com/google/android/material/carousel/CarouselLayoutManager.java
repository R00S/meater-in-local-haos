package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.material.carousel.f;
import j1.C3718c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m1.C3946a;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.q implements com.google.android.material.carousel.b, RecyclerView.B.b {

    /* renamed from: A, reason: collision with root package name */
    private int f36207A;

    /* renamed from: B, reason: collision with root package name */
    private Map<Integer, f> f36208B;

    /* renamed from: C, reason: collision with root package name */
    private com.google.android.material.carousel.c f36209C;

    /* renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f36210D;

    /* renamed from: E, reason: collision with root package name */
    private int f36211E;

    /* renamed from: F, reason: collision with root package name */
    private int f36212F;

    /* renamed from: G, reason: collision with root package name */
    private int f36213G;

    /* renamed from: s, reason: collision with root package name */
    int f36214s;

    /* renamed from: t, reason: collision with root package name */
    int f36215t;

    /* renamed from: u, reason: collision with root package name */
    int f36216u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f36217v;

    /* renamed from: w, reason: collision with root package name */
    private final c f36218w;

    /* renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.d f36219x;

    /* renamed from: y, reason: collision with root package name */
    private g f36220y;

    /* renamed from: z, reason: collision with root package name */
    private f f36221z;

    class a extends m {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.B
        public PointF a(int i10) {
            return CarouselLayoutManager.this.d(i10);
        }

        @Override // androidx.recyclerview.widget.m
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f36220y == null || !CarouselLayoutManager.this.j()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.m
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f36220y == null || CarouselLayoutManager.this.j()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final View f36223a;

        /* renamed from: b, reason: collision with root package name */
        final float f36224b;

        /* renamed from: c, reason: collision with root package name */
        final float f36225c;

        /* renamed from: d, reason: collision with root package name */
        final d f36226d;

        b(View view, float f10, float f11, d dVar) {
            this.f36223a = view;
            this.f36224b = f10;
            this.f36225c = f11;
            this.f36226d = dVar;
        }
    }

    private static class c extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        private final Paint f36227a;

        /* renamed from: b, reason: collision with root package name */
        private List<f.c> f36228b;

        c() {
            Paint paint = new Paint();
            this.f36227a = paint;
            this.f36228b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
            super.i(canvas, recyclerView, c10);
            this.f36227a.setStrokeWidth(recyclerView.getResources().getDimension(C7.e.f2429z));
            for (f.c cVar : this.f36228b) {
                this.f36227a.setColor(C3718c.c(-65281, -16776961, cVar.f36259c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).j()) {
                    canvas.drawLine(cVar.f36258b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).B2(), cVar.f36258b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).w2(), this.f36227a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f36258b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.f36258b, this.f36227a);
                }
            }
        }

        void j(List<f.c> list) {
            this.f36228b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final f.c f36229a;

        /* renamed from: b, reason: collision with root package name */
        final f.c f36230b;

        d(f.c cVar, f.c cVar2) {
            r1.i.a(cVar.f36257a <= cVar2.f36257a);
            this.f36229a = cVar;
            this.f36230b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new i());
    }

    private int A2() {
        return this.f36209C.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B2() {
        return this.f36209C.l();
    }

    private int C2() {
        if (R() || !this.f36219x.f()) {
            return 0;
        }
        return v2() == 1 ? h0() : j0();
    }

    private int D2(int i10, f fVar) {
        return G2() ? (int) (((o2() - fVar.h().f36257a) - (i10 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i10 * fVar.f()) - fVar.a().f36257a) + (fVar.f() / 2.0f));
    }

    private int E2(int i10, f fVar) {
        int i11 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f10 = (i10 * fVar.f()) + (fVar.f() / 2.0f);
            int iO2 = (G2() ? (int) ((o2() - cVar.f36257a) - f10) : (int) (f10 - cVar.f36257a)) - this.f36214s;
            if (Math.abs(i11) > Math.abs(iO2)) {
                i11 = iO2;
            }
        }
        return i11;
    }

    private static d F2(List<f.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = list.get(i14);
            float f15 = z10 ? cVar.f36258b : cVar.f36257a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private boolean H2(float f10, d dVar) {
        float fA2 = a2(f10, t2(f10, dVar) / 2.0f);
        if (G2()) {
            if (fA2 >= 0.0f) {
                return false;
            }
        } else if (fA2 <= o2()) {
            return false;
        }
        return true;
    }

    private boolean I2(float f10, d dVar) {
        float fZ1 = Z1(f10, t2(f10, dVar) / 2.0f);
        if (G2()) {
            if (fZ1 <= o2()) {
                return false;
            }
        } else if (fZ1 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J2(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: H7.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f5606B.O2();
            }
        });
    }

    private void K2() {
        if (this.f36217v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View viewN = N(i10);
                Log.d("CarouselLayoutManager", "item position " + l0(viewN) + ", center:" + p2(viewN) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b L2(RecyclerView.x xVar, float f10, int i10) {
        View viewO = xVar.o(i10);
        F0(viewO, 0, 0);
        float fZ1 = Z1(f10, this.f36221z.f() / 2.0f);
        d dVarF2 = F2(this.f36221z.g(), fZ1, false);
        return new b(viewO, fZ1, e2(viewO, fZ1, dVarF2), dVarF2);
    }

    private float M2(View view, float f10, float f11, Rect rect) {
        float fZ1 = Z1(f10, f11);
        d dVarF2 = F2(this.f36221z.g(), fZ1, false);
        float fE2 = e2(view, fZ1, dVarF2);
        super.U(view, rect);
        W2(view, fZ1, dVarF2);
        this.f36209C.o(view, rect, f11, fE2);
        return fE2;
    }

    private void N2(RecyclerView.x xVar) {
        View viewO = xVar.o(0);
        F0(viewO, 0, 0);
        f fVarG = this.f36219x.g(this, viewO);
        if (G2()) {
            fVarG = f.n(fVarG, o2());
        }
        this.f36220y = g.f(this, fVarG, q2(), s2(), C2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2() {
        this.f36220y = null;
        y1();
    }

    private void P2(RecyclerView.x xVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fP2 = p2(viewN);
            if (!I2(fP2, F2(this.f36221z.g(), fP2, true))) {
                break;
            } else {
                r1(viewN, xVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fP22 = p2(viewN2);
            if (!H2(fP22, F2(this.f36221z.g(), fP22, true))) {
                return;
            } else {
                r1(viewN2, xVar);
            }
        }
    }

    private int Q2(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f36220y == null) {
            N2(xVar);
        }
        int iI2 = i2(i10, this.f36214s, this.f36215t, this.f36216u);
        this.f36214s += iI2;
        X2(this.f36220y);
        float f10 = this.f36221z.f() / 2.0f;
        float fF2 = f2(l0(N(0)));
        Rect rect = new Rect();
        float f11 = G2() ? this.f36221z.h().f36258b : this.f36221z.a().f36258b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View viewN = N(i11);
            float fAbs = Math.abs(f11 - M2(viewN, fF2, f10, rect));
            if (viewN != null && fAbs < f12) {
                this.f36212F = l0(viewN);
                f12 = fAbs;
            }
            fF2 = Z1(fF2, this.f36221z.f());
        }
        l2(xVar, c10);
        return iI2;
    }

    private void R2(RecyclerView recyclerView, int i10) {
        if (j()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void T2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7.m.f2831Y0);
            S2(typedArrayObtainStyledAttributes.getInt(C7.m.f2841Z0, 0));
            V2(typedArrayObtainStyledAttributes.getInt(C7.m.f2846Z5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void W2(View view, float f10, d dVar) {
        if (view instanceof h) {
            f.c cVar = dVar.f36229a;
            float f11 = cVar.f36259c;
            f.c cVar2 = dVar.f36230b;
            float fB = D7.a.b(f11, cVar2.f36259c, cVar.f36257a, cVar2.f36257a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.f36209C.f(height, width, D7.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), D7.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fE2 = e2(view, f10, dVar);
            RectF rectF = new RectF(fE2 - (rectFF.width() / 2.0f), fE2 - (rectFF.height() / 2.0f), fE2 + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fE2);
            RectF rectF2 = new RectF(y2(), B2(), z2(), w2());
            if (this.f36219x.f()) {
                this.f36209C.a(rectFF, rectF, rectF2);
            }
            this.f36209C.n(rectFF, rectF, rectF2);
            ((h) view).a(rectFF);
        }
    }

    private void X2(g gVar) {
        int i10 = this.f36216u;
        int i11 = this.f36215t;
        if (i10 <= i11) {
            this.f36221z = G2() ? gVar.h() : gVar.l();
        } else {
            this.f36221z = gVar.j(this.f36214s, i11, i10);
        }
        this.f36218w.j(this.f36221z.g());
    }

    private void Y1(View view, int i10, b bVar) {
        float f10 = this.f36221z.f() / 2.0f;
        i(view, i10);
        float f11 = bVar.f36225c;
        this.f36209C.m(view, (int) (f11 - f10), (int) (f11 + f10));
        W2(view, bVar.f36224b, bVar.f36226d);
    }

    private void Y2() {
        int iA = a();
        int i10 = this.f36211E;
        if (iA == i10 || this.f36220y == null) {
            return;
        }
        if (this.f36219x.h(this, i10)) {
            O2();
        }
        this.f36211E = iA;
    }

    private float Z1(float f10, float f11) {
        return G2() ? f10 - f11 : f10 + f11;
    }

    private void Z2() {
        if (!this.f36217v || O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < O() - 1) {
            int iL0 = l0(N(i10));
            int i11 = i10 + 1;
            int iL02 = l0(N(i11));
            if (iL0 > iL02) {
                K2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iL0 + "] and child at index [" + i11 + "] had adapter position [" + iL02 + "].");
            }
            i10 = i11;
        }
    }

    private float a2(float f10, float f11) {
        return G2() ? f10 + f11 : f10 - f11;
    }

    private void b2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0 || i10 >= a()) {
            return;
        }
        b bVarL2 = L2(xVar, f2(i10), i10);
        Y1(bVarL2.f36223a, i11, bVarL2);
    }

    private void c2(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        float fF2 = f2(i10);
        while (i10 < c10.b()) {
            b bVarL2 = L2(xVar, fF2, i10);
            if (H2(bVarL2.f36225c, bVarL2.f36226d)) {
                return;
            }
            fF2 = Z1(fF2, this.f36221z.f());
            if (!I2(bVarL2.f36225c, bVarL2.f36226d)) {
                Y1(bVarL2.f36223a, -1, bVarL2);
            }
            i10++;
        }
    }

    private void d2(RecyclerView.x xVar, int i10) {
        float fF2 = f2(i10);
        while (i10 >= 0) {
            b bVarL2 = L2(xVar, fF2, i10);
            if (I2(bVarL2.f36225c, bVarL2.f36226d)) {
                return;
            }
            fF2 = a2(fF2, this.f36221z.f());
            if (!H2(bVarL2.f36225c, bVarL2.f36226d)) {
                Y1(bVarL2.f36223a, 0, bVarL2);
            }
            i10--;
        }
    }

    private float e2(View view, float f10, d dVar) {
        f.c cVar = dVar.f36229a;
        float f11 = cVar.f36258b;
        f.c cVar2 = dVar.f36230b;
        float fB = D7.a.b(f11, cVar2.f36258b, cVar.f36257a, cVar2.f36257a, f10);
        if (dVar.f36230b != this.f36221z.c() && dVar.f36229a != this.f36221z.j()) {
            return fB;
        }
        float fE = this.f36209C.e((RecyclerView.r) view.getLayoutParams()) / this.f36221z.f();
        f.c cVar3 = dVar.f36230b;
        return fB + ((f10 - cVar3.f36257a) * ((1.0f - cVar3.f36259c) + fE));
    }

    private float f2(int i10) {
        return Z1(A2() - this.f36214s, this.f36221z.f() * i10);
    }

    private int g2(RecyclerView.C c10, g gVar) {
        boolean zG2 = G2();
        f fVarL = zG2 ? gVar.l() : gVar.h();
        f.c cVarA = zG2 ? fVarL.a() : fVarL.h();
        int iB = (int) (((((c10.b() - 1) * fVarL.f()) * (zG2 ? -1.0f : 1.0f)) - (cVarA.f36257a - A2())) + (x2() - cVarA.f36257a) + (zG2 ? -cVarA.f36263g : cVarA.f36264h));
        return zG2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int i2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int j2(g gVar) {
        boolean zG2 = G2();
        f fVarH = zG2 ? gVar.h() : gVar.l();
        return (int) (A2() - a2((zG2 ? fVarH.h() : fVarH.a()).f36257a, fVarH.f() / 2.0f));
    }

    private int k2(int i10) {
        int iV2 = v2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (iV2 == 0) {
                return G2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return iV2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (iV2 == 0) {
                return G2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return iV2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    private void l2(RecyclerView.x xVar, RecyclerView.C c10) {
        P2(xVar);
        if (O() == 0) {
            d2(xVar, this.f36207A - 1);
            c2(xVar, c10, this.f36207A);
        } else {
            int iL0 = l0(N(0));
            int iL02 = l0(N(O() - 1));
            d2(xVar, iL0 - 1);
            c2(xVar, c10, iL02 + 1);
        }
        Z2();
    }

    private View m2() {
        return N(G2() ? 0 : O() - 1);
    }

    private View n2() {
        return N(G2() ? O() - 1 : 0);
    }

    private int o2() {
        return j() ? b() : c();
    }

    private float p2(View view) {
        super.U(view, new Rect());
        return j() ? r0.centerX() : r0.centerY();
    }

    private int q2() {
        int i10;
        int i11;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) N(0).getLayoutParams();
        if (this.f36209C.f36239a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i10 + i11;
    }

    private f r2(int i10) {
        f fVar;
        Map<Integer, f> map = this.f36208B;
        return (map == null || (fVar = map.get(Integer.valueOf(C3946a.b(i10, 0, Math.max(0, a() + (-1)))))) == null) ? this.f36220y.g() : fVar;
    }

    private int s2() {
        if (R() || !this.f36219x.f()) {
            return 0;
        }
        return v2() == 1 ? k0() : i0();
    }

    private float t2(float f10, d dVar) {
        f.c cVar = dVar.f36229a;
        float f11 = cVar.f36260d;
        f.c cVar2 = dVar.f36230b;
        return D7.a.b(f11, cVar2.f36260d, cVar.f36258b, cVar2.f36258b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w2() {
        return this.f36209C.g();
    }

    private int x2() {
        return this.f36209C.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.f36209C.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z2() {
        return this.f36209C.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.C c10) {
        return this.f36216u - this.f36215t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (p()) {
            return Q2(i10, xVar, c10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.f36212F = i10;
        if (this.f36220y == null) {
            return;
        }
        this.f36214s = D2(i10, r2(i10));
        this.f36207A = C3946a.b(i10, 0, Math.max(0, a() - 1));
        X2(this.f36220y);
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        if (q()) {
            return Q2(i10, xVar, c10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void F0(View view, int i10, int i11) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        Rect rect = new Rect();
        o(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        g gVar = this.f36220y;
        float f10 = (gVar == null || this.f36209C.f36239a != 0) ? ((ViewGroup.MarginLayoutParams) rVar).width : gVar.g().f();
        g gVar2 = this.f36220y;
        view.measure(RecyclerView.q.P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, (int) f10, p()), RecyclerView.q.P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, (int) ((gVar2 == null || this.f36209C.f36239a != 1) ? ((ViewGroup.MarginLayoutParams) rVar).height : gVar2.g().f()), q()));
    }

    boolean G2() {
        return j() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.f36219x.e(recyclerView.getContext());
        O2();
        recyclerView.addOnLayoutChangeListener(this.f36210D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.f36210D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        O1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        int iK2;
        if (O() == 0 || (iK2 = k2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iK2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            b2(xVar, l0(N(0)) - 1, 0);
            return n2();
        }
        if (l0(view) == a() - 1) {
            return null;
        }
        b2(xVar, l0(N(O() - 1)) + 1, -1);
        return m2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void S2(int i10) {
        this.f36213G = i10;
        O2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (j()) {
            fCenterY = rect.centerX();
        }
        float fT2 = t2(fCenterY, F2(this.f36221z.g(), fCenterY, true));
        float fWidth = j() ? (rect.width() - fT2) / 2.0f : 0.0f;
        float fHeight = j() ? 0.0f : (rect.height() - fT2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void U2(com.google.android.material.carousel.d dVar) {
        this.f36219x = dVar;
        O2();
    }

    public void V2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        com.google.android.material.carousel.c cVar = this.f36209C;
        if (cVar == null || i10 != cVar.f36239a) {
            this.f36209C = com.google.android.material.carousel.c.c(this, i10);
            O2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        super.W0(recyclerView, i10, i11);
        Y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        super.Z0(recyclerView, i10, i11);
        Y2();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return s0();
    }

    @Override // com.google.android.material.carousel.b
    public int c() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.C c10) {
        if (c10.b() <= 0 || o2() <= 0.0f) {
            p1(xVar);
            this.f36207A = 0;
            return;
        }
        boolean zG2 = G2();
        boolean z10 = this.f36220y == null;
        if (z10) {
            N2(xVar);
        }
        int iJ2 = j2(this.f36220y);
        int iG2 = g2(c10, this.f36220y);
        this.f36215t = zG2 ? iG2 : iJ2;
        if (zG2) {
            iG2 = iJ2;
        }
        this.f36216u = iG2;
        if (z10) {
            this.f36214s = iJ2;
            this.f36208B = this.f36220y.i(a(), this.f36215t, this.f36216u, G2());
            int i10 = this.f36212F;
            if (i10 != -1) {
                this.f36214s = D2(i10, r2(i10));
            }
        }
        int i11 = this.f36214s;
        this.f36214s = i11 + i2(0, i11, this.f36215t, this.f36216u);
        this.f36207A = C3946a.b(this.f36207A, 0, c10.b());
        X2(this.f36220y);
        B(xVar);
        l2(xVar, c10);
        this.f36211E = a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B.b
    public PointF d(int i10) {
        if (this.f36220y == null) {
            return null;
        }
        int iU2 = u2(i10, r2(i10));
        return j() ? new PointF(iU2, 0.0f) : new PointF(0.0f, iU2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.C c10) {
        super.d1(c10);
        if (O() == 0) {
            this.f36207A = 0;
        } else {
            this.f36207A = l0(N(0));
        }
        Z2();
    }

    @Override // com.google.android.material.carousel.b
    public int e() {
        return this.f36213G;
    }

    int h2(int i10) {
        return (int) (this.f36214s - D2(i10, r2(i10)));
    }

    @Override // com.google.android.material.carousel.b
    public boolean j() {
        return this.f36209C.f36239a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return !j();
    }

    int u2(int i10, f fVar) {
        return D2(i10, fVar) - this.f36214s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.C c10) {
        if (O() == 0 || this.f36220y == null || a() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f36220y.g().f() / x(c10)));
    }

    public int v2() {
        return this.f36209C.f36239a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.C c10) {
        return this.f36214s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.C c10) {
        return this.f36216u - this.f36215t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iE2;
        if (this.f36220y == null || (iE2 = E2(l0(view), r2(l0(view)))) == 0) {
            return false;
        }
        R2(recyclerView, E2(l0(view), this.f36220y.j(this.f36214s + i2(iE2, this.f36214s, this.f36215t, this.f36216u), this.f36215t, this.f36216u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.C c10) {
        if (O() == 0 || this.f36220y == null || a() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f36220y.g().f() / A(c10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.C c10) {
        return this.f36214s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i10) {
        this.f36217v = false;
        this.f36218w = new c();
        this.f36207A = 0;
        this.f36210D = new View.OnLayoutChangeListener() { // from class: H7.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f5605a.J2(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f36212F = -1;
        this.f36213G = 0;
        U2(dVar);
        V2(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f36217v = false;
        this.f36218w = new c();
        this.f36207A = 0;
        this.f36210D = new View.OnLayoutChangeListener() { // from class: H7.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f5605a.J2(view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f36212F = -1;
        this.f36213G = 0;
        U2(new i());
        T2(context, attributeSet);
    }
}
