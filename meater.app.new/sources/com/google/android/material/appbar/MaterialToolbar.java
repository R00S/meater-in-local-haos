package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0311u;
import com.google.android.material.theme.p178a.C8079a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8901h;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: U */
    private static final int f29651U = C8917k.f33999x;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33810K);
    }

    /* renamed from: P */
    private void m23787P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C8900g c8900g = new C8900g();
            c8900g.m28284X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c8900g.m28278N(context);
            c8900g.m28283W(C0311u.m2152t(this));
            C0311u.m2139m0(this, c8900g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8901h.m28311e(this);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C8901h.m28310d(this, f2);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(C8079a.m24906c(context, attributeSet, i2, f29651U), attributeSet, i2);
        m23787P(getContext());
    }
}
