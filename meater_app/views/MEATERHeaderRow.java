package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import b6.d5;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERHeaderRow extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    d5 f10321q;

    public MEATERHeaderRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15910f, 0, 0);
        this.f10321q = (d5) androidx.databinding.g.h(LayoutInflater.from(context), 2131558557, this, true);
        try {
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                this.f10321q.R.setText(string);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
