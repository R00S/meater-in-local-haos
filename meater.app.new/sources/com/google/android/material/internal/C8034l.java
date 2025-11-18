package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes2.dex */
public class C8034l extends ImageButton {

    /* renamed from: f */
    private int f30429f;

    public C8034l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void m24703b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f30429f = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f30429f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        m24703b(i2, true);
    }

    public C8034l(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f30429f = getVisibility();
    }
}
