package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import b6.e7;
import rk.C0461m;

/* loaded from: /tmp/meat/meat/classes.dex */
public class PasswordFieldComponent extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    e7 f10386q;

    /* renamed from: r, reason: collision with root package name */
    boolean f10387r;

    public PasswordFieldComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10387r = false;
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        e7 e7Var = (e7) androidx.databinding.g.h(LayoutInflater.from(context), 2131558669, this, true);
        this.f10386q = e7Var;
        int i10 = (int) (b1.f10467g / 15.3f);
        e7Var.U.getLayoutParams().width = i10;
        this.f10386q.U.getLayoutParams().height = i10;
        float d10 = m0.d() * 0.97f;
        this.f10386q.S.setTextSize(0, 1.15f * d10);
        this.f10386q.R.setTextSize(0, d10 * 0.95f);
        this.f10386q.T.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordFieldComponent.this.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        if (this.f10387r) {
            this.f10387r = false;
            this.f10386q.T.setImageResource(2131231283);
        } else {
            this.f10387r = true;
            this.f10386q.T.setImageResource(2131231284);
        }
        PasswordEditText passwordEditText = this.f10386q.R;
        passwordEditText.j(this.f10387r, passwordEditText.getText().toString());
    }

    public String getPasswordField() {
        return this.f10386q.R.getText().toString();
    }

    public void setModel(C0461m c0461m) {
        this.f10386q.T(c0461m);
    }
}
