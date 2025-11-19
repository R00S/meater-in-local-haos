package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import m1.C3946a;
import s1.C4456s;
import s1.C4469y0;
import s1.X;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
abstract class d extends e<View> {

    /* renamed from: E, reason: collision with root package name */
    final Rect f35895E;

    /* renamed from: F, reason: collision with root package name */
    final Rect f35896F;

    /* renamed from: G, reason: collision with root package name */
    private int f35897G;

    /* renamed from: H, reason: collision with root package name */
    private int f35898H;

    public d() {
        this.f35895E = new Rect();
        this.f35896F = new Rect();
        this.f35897G = 0;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.e
    protected void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewL = L(coordinatorLayout.r(view));
        if (viewL == null) {
            super.J(coordinatorLayout, view, i10);
            this.f35897G = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f35895E;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        C4469y0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && X.w(coordinatorLayout) && !X.w(view)) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f35896F;
        C4456s.a(R(fVar.f24689c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iM = M(viewL);
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.f35897G = rect2.top - viewL.getBottom();
    }

    abstract View L(List<View> list);

    final int M(View view) {
        if (this.f35898H == 0) {
            return 0;
        }
        float fN = N(view);
        int i10 = this.f35898H;
        return C3946a.b((int) (fN * i10), 0, i10);
    }

    float N(View view) {
        return 1.0f;
    }

    public final int O() {
        return this.f35898H;
    }

    int P(View view) {
        return view.getMeasuredHeight();
    }

    final int Q() {
        return this.f35897G;
    }

    public final void S(int i10) {
        this.f35898H = i10;
    }

    protected boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewL;
        C4469y0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewL = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (X.w(viewL) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iP = size + P(viewL);
        int measuredHeight = viewL.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iP -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iP, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35895E = new Rect();
        this.f35896F = new Rect();
        this.f35897G = 0;
    }
}
