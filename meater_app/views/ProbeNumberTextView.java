package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import b6.m7;
import rk.C0455g;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ProbeNumberTextView extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    C0455g f10390q;

    /* renamed from: r, reason: collision with root package name */
    int f10391r;

    /* renamed from: s, reason: collision with root package name */
    m7 f10392s;

    public ProbeNumberTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        this.f10392s = (m7) androidx.databinding.g.h(LayoutInflater.from(context), 2131558675, this, true);
    }

    public void setModel(C0455g c0455g) {
        int i10;
        this.f10390q = c0455g;
        this.f10392s.U(c0455g);
        m7 m7Var = this.f10392s;
        FrameLayout frameLayout = m7Var.Q;
        if (m7Var.T().i()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
    }

    public void setProbeNumber(int i10) {
        if (this.f10391r != i10 && i10 > 0 && i10 < 5) {
            setVisibility(0);
            this.f10391r = i10;
            this.f10392s.R.setText(String.valueOf(i10));
            return;
        }
        setVisibility(8);
    }
}
