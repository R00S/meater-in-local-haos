package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes2.dex */
class C7935c<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {

    /* renamed from: a */
    private C7936d f29666a;

    /* renamed from: b */
    private int f29667b;

    /* renamed from: c */
    private int f29668c;

    public C7935c() {
        this.f29667b = 0;
        this.f29668c = 0;
    }

    /* renamed from: E */
    public int mo23760E() {
        C7936d c7936d = this.f29666a;
        if (c7936d != null) {
            return c7936d.m23801c();
        }
        return 0;
    }

    /* renamed from: F */
    protected void mo23793F(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.m1422I(v, i2);
    }

    /* renamed from: G */
    public boolean mo23761G(int i2) {
        C7936d c7936d = this.f29666a;
        if (c7936d != null) {
            return c7936d.m23804f(i2);
        }
        this.f29667b = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    /* renamed from: l */
    public boolean mo1458l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        mo23793F(coordinatorLayout, v, i2);
        if (this.f29666a == null) {
            this.f29666a = new C7936d(v);
        }
        this.f29666a.m23802d();
        this.f29666a.m23799a();
        int i3 = this.f29667b;
        if (i3 != 0) {
            this.f29666a.m23804f(i3);
            this.f29667b = 0;
        }
        int i4 = this.f29668c;
        if (i4 == 0) {
            return true;
        }
        this.f29666a.m23803e(i4);
        this.f29668c = 0;
        return true;
    }

    public C7935c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29667b = 0;
        this.f29668c = 0;
    }
}
