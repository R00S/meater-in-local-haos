package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: LeftSheetDelegate.java */
/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f37065a;

    a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f37065a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.d
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return Math.max(0, this.f37065a.m0() + this.f37065a.k0());
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return (-this.f37065a.d0()) - this.f37065a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int f() {
        return this.f37065a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int g() {
        return -this.f37065a.d0();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int h(V v10) {
        return v10.getRight() + this.f37065a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.d
    int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean m(float f10, float f11) {
        return e.a(f10, f11) && Math.abs(f10) > ((float) this.f37065a.o0());
    }

    @Override // com.google.android.material.sidesheet.d
    boolean n(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f37065a.i0())) > this.f37065a.j0();
    }

    @Override // com.google.android.material.sidesheet.d
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.d
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f37065a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
