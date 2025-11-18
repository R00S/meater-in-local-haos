package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import java.util.List;
import p241e.p254e.p256b.p271c.p282u.InterfaceC8941a;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0226c<View> {

    /* renamed from: a */
    private int f30602a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class ViewTreeObserverOnPreDrawListenerC8080a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f30603f;

        /* renamed from: g */
        final /* synthetic */ int f30604g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC8941a f30605h;

        ViewTreeObserverOnPreDrawListenerC8080a(View view, int i2, InterfaceC8941a interfaceC8941a) {
            this.f30603f = view;
            this.f30604g = i2;
            this.f30605h = interfaceC8941a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f30603f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f30602a == this.f30604g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC8941a interfaceC8941a = this.f30605h;
                expandableBehavior.mo24910H((View) interfaceC8941a, this.f30603f, interfaceC8941a.mo24473a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f30602a = 0;
    }

    /* renamed from: F */
    private boolean m24908F(boolean z) {
        if (!z) {
            return this.f30602a == 1;
        }
        int i2 = this.f30602a;
        return i2 == 0 || i2 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    protected InterfaceC8941a m24909G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listM1434r = coordinatorLayout.m1434r(view);
        int size = listM1434r.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = listM1434r.get(i2);
            if (mo1451e(coordinatorLayout, view, view2)) {
                return (InterfaceC8941a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo24910H(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: h */
    public boolean mo1454h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC8941a interfaceC8941a = (InterfaceC8941a) view2;
        if (!m24908F(interfaceC8941a.mo24473a())) {
            return false;
        }
        this.f30602a = interfaceC8941a.mo24473a() ? 1 : 2;
        return mo24910H((View) interfaceC8941a, view, interfaceC8941a.mo24473a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: l */
    public boolean mo1458l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        InterfaceC8941a interfaceC8941aM24909G;
        if (C0311u.m2102O(view) || (interfaceC8941aM24909G = m24909G(coordinatorLayout, view)) == null || !m24908F(interfaceC8941aM24909G.mo24473a())) {
            return false;
        }
        int i3 = interfaceC8941aM24909G.mo24473a() ? 1 : 2;
        this.f30602a = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8080a(view, i3, interfaceC8941aM24909G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30602a = 0;
    }
}
