package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ScrollViewExt extends HorizontalScrollView {

    /* renamed from: q, reason: collision with root package name */
    private k1 f10423q;

    public ScrollViewExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10423q = null;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        k1 k1Var = this.f10423q;
        if (k1Var != null) {
            k1Var.b(this, i10, i11, i12, i13);
        }
    }

    public void setScrollViewListener(k1 k1Var) {
        this.f10423q = k1Var;
    }
}
