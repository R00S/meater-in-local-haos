package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERSpinner extends AppCompatImageView {

    /* renamed from: t, reason: collision with root package name */
    private Timer f10363t;

    /* renamed from: u, reason: collision with root package name */
    private int f10364u;

    /* renamed from: v, reason: collision with root package name */
    Handler f10365v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MEATERSpinner.this.f10365v.obtainMessage(1).sendToTarget();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MEATERSpinner.this.d();
        }
    }

    public MEATERSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10365v = new b(Looper.getMainLooper());
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i10 = this.f10364u;
        if (i10 < 11) {
            this.f10364u = i10 + 1;
        } else {
            this.f10364u = 0;
        }
        try {
            setImageDrawable(f8.l0.j(getContext(), new int[]{2131231319, 2131231323, 2131231324, 2131231325, 2131231326, 2131231327, 2131231328, 2131231329, 2131231330, 2131231320, 2131231321, 2131231322}[this.f10364u]));
        } catch (Resources.NotFoundException unused) {
            g();
        }
    }

    private void e() {
        setImageResource(2131231319);
    }

    private void f() {
        g();
        Timer timer = new Timer();
        this.f10363t = timer;
        timer.scheduleAtFixedRate(new a(), 0L, 100L);
    }

    private void g() {
        Timer timer = this.f10363t;
        if (timer != null) {
            timer.cancel();
            this.f10363t = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }
}
