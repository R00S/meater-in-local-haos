package com.apptionlabs.meater_app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c6.h;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.Probe;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERCookBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals(MEATERIntent.INTENT_NOTIFICATION_DISMISS)) {
            long longExtra = intent.getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, -1L);
            for (Probe probe : h.f8879a.M()) {
                if (probe.getDeviceID() == longExtra && probe.localNotification != null) {
                    probe.setStopUpdateLiveNotification(true);
                    probe.localNotification.o();
                }
            }
        }
    }
}
