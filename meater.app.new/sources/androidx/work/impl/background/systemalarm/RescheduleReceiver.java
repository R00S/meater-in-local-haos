package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.impl.C0737j;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4542a = AbstractC0807n.m5223f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC0807n.m5221c().mo5224a(f4542a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            context.startService(C0718b.m4881e(context));
            return;
        }
        try {
            C0737j.m4979p(context).m5001y(goAsync());
        } catch (IllegalStateException e2) {
            AbstractC0807n.m5221c().mo5225b(f4542a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
