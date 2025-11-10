package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import b6.o6;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterTextRow extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    o6 f10381q;

    public MeaterTextRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15906b, 0, 0);
        this.f10381q = (o6) androidx.databinding.g.h(LayoutInflater.from(context), 2131558610, this, true);
        try {
            String string = obtainStyledAttributes.getString(2);
            if (string != null) {
                this.f10381q.S.setText(string);
            }
            if (obtainStyledAttributes.getBoolean(2, false)) {
                this.f10381q.Q.setVisibility(8);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(int i10) {
        this.f10381q.R.setImageResource(i10);
        this.f10381q.R.setVisibility(0);
    }
}
