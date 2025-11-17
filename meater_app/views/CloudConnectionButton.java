package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CloudConnectionButton extends AppCompatImageView {

    /* renamed from: t, reason: collision with root package name */
    private CloudMQTTConnectionState f10232t;

    /* renamed from: u, reason: collision with root package name */
    private Timer f10233u;

    /* renamed from: v, reason: collision with root package name */
    private int f10234v;

    /* renamed from: w, reason: collision with root package name */
    Handler f10235w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            CloudConnectionButton.this.f10235w.obtainMessage(1).sendToTarget();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CloudConnectionButton.this.d();
        }
    }

    public CloudConnectionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10235w = new b(Looper.getMainLooper());
        setup(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f10232t != CloudMQTTConnectionState.CONNECTING) {
            return;
        }
        int[] iArr = {2131231366, 2131231367, 2131231368, 2131231369};
        int i10 = this.f10234v;
        if (i10 < 3) {
            this.f10234v = i10 + 1;
        } else {
            this.f10234v = 0;
        }
        try {
            setImageDrawable(f8.l0.j(getContext(), iArr[this.f10234v]));
        } catch (Resources.NotFoundException unused) {
        }
    }

    private void setup(Context context) {
        setImageResource(2131231365);
    }

    public void setConnectionState(CloudMQTTConnectionState cloudMQTTConnectionState) {
        Timer timer = this.f10233u;
        if (timer != null) {
            timer.cancel();
            this.f10233u = null;
        }
        this.f10232t = cloudMQTTConnectionState;
        if (cloudMQTTConnectionState == CloudMQTTConnectionState.DISCONNECTED) {
            setImageResource(0);
            setImageResource(2131231365);
            return;
        }
        if (cloudMQTTConnectionState == CloudMQTTConnectionState.CONNECTING) {
            this.f10234v = 0;
            setImageResource(0);
            setImageResource(2131231366);
            Timer timer2 = new Timer();
            this.f10233u = timer2;
            timer2.scheduleAtFixedRate(new a(), 0L, 250L);
            return;
        }
        if (cloudMQTTConnectionState == CloudMQTTConnectionState.CONNECTED) {
            setImageResource(0);
            setImageResource(2131231364);
        }
    }
}
