package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import b6.u8;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERHeaderTextOnly extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    u8 f10322q;

    public MEATERHeaderTextOnly(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15910f, 0, 0);
        this.f10322q = (u8) androidx.databinding.g.h(LayoutInflater.from(context), 2131558714, this, true);
        try {
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                this.f10322q.S.setText(string);
            }
            if (obtainStyledAttributes.getBoolean(2, false)) {
                this.f10322q.R.setVisibility(8);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(String str) {
        this.f10322q.S.setText(str);
    }
}
