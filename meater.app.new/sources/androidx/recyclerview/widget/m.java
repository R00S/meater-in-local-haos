package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class m extends RecyclerView.B {

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    protected PointF f28994k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f28995l;

    /* renamed from: n, reason: collision with root package name */
    private float f28997n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f28992i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f28993j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f28996m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f28998o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f28999p = 0;

    @SuppressLint({"UnknownNullness"})
    public m(Context context) {
        this.f28995l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f28996m) {
            this.f28997n = v(this.f28995l);
            this.f28996m = true;
        }
        return this.f28997n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f28994k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    protected void C(RecyclerView.B.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f28994k = pointFA;
        this.f28998o = (int) (pointFA.x * 10000.0f);
        this.f28999p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f28998o * 1.2f), (int) (this.f28999p * 1.2f), (int) (x(10000) * 1.2f), this.f28992i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    @SuppressLint({"UnknownNullness"})
    protected void l(int i10, int i11, RecyclerView.C c10, RecyclerView.B.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f28998o = y(this.f28998o, i10);
        int iY = y(this.f28999p, i11);
        this.f28999p = iY;
        if (this.f28998o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    protected void n() {
        this.f28999p = 0;
        this.f28998o = 0;
        this.f28994k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    @SuppressLint({"UnknownNullness"})
    protected void o(View view, RecyclerView.C c10, RecyclerView.B.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f28993j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i10) {
        RecyclerView.q qVarE = e();
        if (qVarE == null || !qVarE.p()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(qVarE.V(view) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, qVarE.Y(view) + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, qVarE.i0(), qVarE.s0() - qVarE.j0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.q qVarE = e();
        if (qVarE == null || !qVarE.q()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(qVarE.Z(view) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, qVarE.T(view) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin, qVarE.k0(), qVarE.b0() - qVarE.h0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    protected int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f28994k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    protected void m() {
    }
}
