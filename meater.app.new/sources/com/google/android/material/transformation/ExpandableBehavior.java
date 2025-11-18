package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import s1.X;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: B, reason: collision with root package name */
    private int f37532B;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f37533B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f37534C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ P7.a f37535D;

        a(View view, int i10, P7.a aVar) {
            this.f37533B = view;
            this.f37534C = i10;
            this.f37535D = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f37533B.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f37532B == this.f37534C) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                P7.a aVar = this.f37535D;
                expandableBehavior.L((View) aVar, this.f37533B, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f37532B = 0;
    }

    private boolean J(boolean z10) {
        if (!z10) {
            return this.f37532B == 1;
        }
        int i10 = this.f37532B;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected P7.a K(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listR.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (P7.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        P7.a aVar = (P7.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f37532B = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        P7.a aVarK;
        if (X.R(view) || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i11 = aVarK.a() ? 1 : 2;
        this.f37532B = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37532B = 0;
    }
}
