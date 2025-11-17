package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.c;
import java.util.ArrayList;

/* loaded from: /tmp/meat/meat/classes.dex */
public class AlertView extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    ArrayList<TextView> f10185q;

    /* renamed from: r, reason: collision with root package name */
    b6.r0 f10186r;

    public AlertView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10185q = new ArrayList<>();
        b(context);
    }

    private void b(Context context) {
        b6.r0 r0Var = (b6.r0) androidx.databinding.g.h(LayoutInflater.from(context), 2131558461, this, true);
        this.f10186r = r0Var;
        this.f10185q.add(r0Var.S);
        this.f10185q.add(this.f10186r.U);
        this.f10185q.add(this.f10186r.W);
        this.f10185q.add(this.f10186r.Y);
        this.f10185q.add(this.f10186r.f8191a0);
        this.f10186r.S.setTextSize(0, m0.d());
        this.f10186r.U.setTextSize(0, m0.d());
        this.f10186r.W.setTextSize(0, m0.d());
        this.f10186r.Y.setTextSize(0, m0.d());
        this.f10186r.f8191a0.setTextSize(0, m0.d());
        a();
    }

    private void d(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            this.f10186r.Z.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    this.f10186r.X.setVisibility(0);
                    return;
                }
                this.f10186r.V.setVisibility(0);
                return;
            }
            this.f10186r.T.setVisibility(0);
            return;
        }
        this.f10186r.R.setVisibility(0);
    }

    public void a() {
        this.f10186r.R.setVisibility(8);
        this.f10186r.T.setVisibility(8);
        this.f10186r.V.setVisibility(8);
        this.f10186r.X.setVisibility(8);
        this.f10186r.Z.setVisibility(8);
        this.f10186r.R.setVisibility(8);
        this.f10186r.f8197g0.setVisibility(8);
        this.f10186r.f8194d0.setVisibility(8);
        this.f10186r.f8193c0.setVisibility(8);
    }

    public void c(Context context, ArrayList<String> arrayList) {
        a();
        if (arrayList.size() != 0) {
            if (arrayList.size() > 1) {
                this.f10186r.f8193c0.setVisibility(0);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    this.f10185q.get(i10).setText(arrayList.get(i10));
                    d(i10);
                }
            } else {
                String str = arrayList.get(0);
                if (str.length() > 50) {
                    this.f10186r.f8194d0.setVisibility(0);
                    this.f10186r.f8195e0.setText(str);
                } else {
                    this.f10186r.f8197g0.setVisibility(0);
                    this.f10186r.f8198h0.setText(str);
                }
            }
            c.b i11 = b8.c.p(context).i(c.EnumC0118c.ALERT_SOUND);
            if (i11 != null) {
                i11.g(true);
            }
        }
    }
}
