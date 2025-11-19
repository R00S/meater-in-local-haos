package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
class e<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: B, reason: collision with root package name */
    private f f35899B;

    /* renamed from: C, reason: collision with root package name */
    private int f35900C;

    /* renamed from: D, reason: collision with root package name */
    private int f35901D;

    public e() {
        this.f35900C = 0;
        this.f35901D = 0;
    }

    public int I() {
        f fVar = this.f35899B;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    protected void J(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.I(v10, i10);
    }

    public boolean K(int i10) {
        f fVar = this.f35899B;
        if (fVar != null) {
            return fVar.e(i10);
        }
        this.f35900C = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        J(coordinatorLayout, v10, i10);
        if (this.f35899B == null) {
            this.f35899B = new f(v10);
        }
        this.f35899B.c();
        this.f35899B.a();
        int i11 = this.f35900C;
        if (i11 != 0) {
            this.f35899B.e(i11);
            this.f35900C = 0;
        }
        int i12 = this.f35901D;
        if (i12 == 0) {
            return true;
        }
        this.f35899B.d(i12);
        this.f35901D = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35900C = 0;
        this.f35901D = 0;
    }
}
