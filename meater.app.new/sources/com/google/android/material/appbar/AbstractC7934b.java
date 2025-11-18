package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0285c0;
import androidx.core.view.C0286d;
import androidx.core.view.C0311u;
import java.util.List;
import p024c.p052i.p056g.C0937a;

/* compiled from: HeaderScrollingViewBehavior.java */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes2.dex */
abstract class AbstractC7934b extends C7935c<View> {

    /* renamed from: d */
    final Rect f29662d;

    /* renamed from: e */
    final Rect f29663e;

    /* renamed from: f */
    private int f29664f;

    /* renamed from: g */
    private int f29665g;

    public AbstractC7934b() {
        this.f29662d = new Rect();
        this.f29663e = new Rect();
        this.f29664f = 0;
    }

    /* renamed from: N */
    private static int m23792N(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    @Override // com.google.android.material.appbar.C7935c
    /* renamed from: F */
    protected void mo23793F(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View viewMo23765H = mo23765H(coordinatorLayout.m1434r(view));
        if (viewMo23765H == null) {
            super.mo23793F(coordinatorLayout, view, i2);
            this.f29664f = 0;
            return;
        }
        CoordinatorLayout.C0229f c0229f = (CoordinatorLayout.C0229f) view.getLayoutParams();
        Rect rect = this.f29662d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0229f).leftMargin, viewMo23765H.getBottom() + ((ViewGroup.MarginLayoutParams) c0229f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin, ((coordinatorLayout.getHeight() + viewMo23765H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin);
        C0285c0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && C0311u.m2156v(coordinatorLayout) && !C0311u.m2156v(view)) {
            rect.left += lastWindowInsets.m1882i();
            rect.right -= lastWindowInsets.m1883j();
        }
        Rect rect2 = this.f29663e;
        C0286d.m1931a(m23792N(c0229f.f2005c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
        int iM23794I = m23794I(viewMo23765H);
        view.layout(rect2.left, rect2.top - iM23794I, rect2.right, rect2.bottom - iM23794I);
        this.f29664f = rect2.top - viewMo23765H.getBottom();
    }

    /* renamed from: H */
    abstract View mo23765H(List<View> list);

    /* renamed from: I */
    final int m23794I(View view) {
        if (this.f29665g == 0) {
            return 0;
        }
        float fMo23766J = mo23766J(view);
        int i2 = this.f29665g;
        return C0937a.m5966b((int) (fMo23766J * i2), 0, i2);
    }

    /* renamed from: J */
    abstract float mo23766J(View view);

    /* renamed from: K */
    public final int m23795K() {
        return this.f29665g;
    }

    /* renamed from: L */
    int mo23767L(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: M */
    final int m23796M() {
        return this.f29664f;
    }

    /* renamed from: O */
    public final void m23797O(int i2) {
        this.f29665g = i2;
    }

    /* renamed from: P */
    protected boolean m23798P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: m */
    public boolean mo1459m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        View viewMo23765H;
        C0285c0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (viewMo23765H = mo23765H(coordinatorLayout.m1434r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0311u.m2156v(viewMo23765H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m1884k() + lastWindowInsets.m1881h();
        }
        int iMo23767L = size + mo23767L(viewMo23765H);
        int measuredHeight = viewMo23765H.getMeasuredHeight();
        if (m23798P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iMo23767L -= measuredHeight;
        }
        coordinatorLayout.m1423J(view, i2, i3, View.MeasureSpec.makeMeasureSpec(iMo23767L, i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    public AbstractC7934b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29662d = new Rect();
        this.f29663e = new Rect();
        this.f29664f = 0;
    }
}
