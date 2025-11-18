package com.google.android.material.tabs;

import C7.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.a0;

/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: B, reason: collision with root package name */
    public final CharSequence f37151B;

    /* renamed from: C, reason: collision with root package name */
    public final Drawable f37152C;

    /* renamed from: D, reason: collision with root package name */
    public final int f37153D;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0 a0VarU = a0.u(context, attributeSet, m.f2767R6);
        this.f37151B = a0VarU.p(m.f2797U6);
        this.f37152C = a0VarU.g(m.f2777S6);
        this.f37153D = a0VarU.n(m.f2787T6, 0);
        a0VarU.x();
    }
}
