package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import m1.C3946a;

/* compiled from: MultiBrowseCarouselStrategy.java */
/* loaded from: classes2.dex */
public final class i extends d {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f36272d = {1};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f36273e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    private int f36274c = 0;

    @Override // com.google.android.material.carousel.d
    f g(b bVar, View view) {
        float fC = bVar.c();
        if (bVar.j()) {
            fC = bVar.b();
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.j()) {
            f10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = f10;
        float fD = d() + f11;
        float fMax = Math.max(c() + f11, fD);
        float fMin = Math.min(measuredHeight + f11, fC);
        float fA = C3946a.a((measuredHeight / 3.0f) + f11, fD + f11, fMax + f11);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f36272d;
        if (fC < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f36273e;
        if (bVar.e() == 1) {
            iArrA = d.a(iArrA);
            iArrA2 = d.a(iArrA2);
        }
        int[] iArr = iArrA;
        int[] iArr2 = iArrA2;
        int iMax = (int) Math.max(1.0d, Math.floor(((fC - (e.i(iArr2) * f12)) - (e.i(iArr) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(fC / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(fC, fA, fD, fMax, iArr, f12, iArr2, fMin, iArr3);
        this.f36274c = aVarC.e();
        if (i(aVarC, bVar.a())) {
            aVarC = a.c(fC, fA, fD, fMax, new int[]{aVarC.f36233c}, f12, new int[]{aVarC.f36234d}, fMin, new int[]{aVarC.f36237g});
        }
        return e.d(view.getContext(), f11, fC, aVarC, bVar.e());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i10) {
        return (i10 < this.f36274c && bVar.a() >= this.f36274c) || (i10 >= this.f36274c && bVar.a() < this.f36274c);
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f36233c > 0 || aVar.f36234d > 1);
        while (iE > 0) {
            int i11 = aVar.f36233c;
            if (i11 > 0) {
                aVar.f36233c = i11 - 1;
            } else {
                int i12 = aVar.f36234d;
                if (i12 > 1) {
                    aVar.f36234d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
