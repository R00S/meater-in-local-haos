package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import b6.n9;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ProgressArcView extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    private Animation f10393q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10394r;

    /* renamed from: s, reason: collision with root package name */
    n9 f10395s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10396t;

    public ProgressArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10396t = false;
        a(context);
    }

    private void a(Context context) {
        n9 n9Var = (n9) androidx.databinding.g.h(LayoutInflater.from(context), 2131558723, this, true);
        this.f10395s = n9Var;
        if (this.f10394r) {
            n9Var.Q.setImageResource(2131231501);
        }
        this.f10393q = AnimationUtils.loadAnimation(context, 2130772021);
    }

    public void b() {
        if (!this.f10396t) {
            this.f10396t = true;
            this.f10393q.setFillAfter(true);
            this.f10395s.R.startAnimation(this.f10393q);
        }
    }

    public void c() {
        if (this.f10396t) {
            this.f10396t = false;
            this.f10395s.R.clearAnimation();
        }
    }

    public void d(Probe probe) {
        if (probe.getCookState() != DeviceCookState.COOK_STATE_COOK_CONFIGURED && probe.getCookState() != DeviceCookState.COOK_STATE_STARTED) {
            c();
        } else {
            b();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setAnimationRunning(boolean z10) {
        this.f10396t = z10;
    }
}
