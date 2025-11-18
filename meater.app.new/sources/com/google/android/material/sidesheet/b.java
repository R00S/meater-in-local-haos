package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes2.dex */
final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f37066a;

    b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f37066a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // com.google.android.material.sidesheet.d
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return Math.max(0, (e() - this.f37066a.d0()) - this.f37066a.k0());
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return this.f37066a.n0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return this.f37066a.n0();
    }

    @Override // com.google.android.material.sidesheet.d
    int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int h(V v10) {
        return v10.getLeft() - this.f37066a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.d
    int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f37066a.o0());
    }

    @Override // com.google.android.material.sidesheet.d
    boolean n(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f37066a.i0())) > this.f37066a.j0();
    }

    @Override // com.google.android.material.sidesheet.d
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.d
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iN0 = this.f37066a.n0();
        if (i10 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i10;
        }
    }
}
