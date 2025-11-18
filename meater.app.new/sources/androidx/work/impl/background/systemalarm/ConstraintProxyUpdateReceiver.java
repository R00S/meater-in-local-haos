package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC0807n;
import androidx.work.impl.C0737j;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C0785d;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f4537a = AbstractC0807n.m5223f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class RunnableC0716a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Intent f4538f;

        /* renamed from: g */
        final /* synthetic */ Context f4539g;

        /* renamed from: h */
        final /* synthetic */ BroadcastReceiver.PendingResult f4540h;

        RunnableC0716a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4538f = intent;
            this.f4539g = context;
            this.f4540h = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f4538f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4538f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4538f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4538f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC0807n.m5221c().mo5224a(ConstraintProxyUpdateReceiver.f4537a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                C0785d.m5162a(this.f4539g, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C0785d.m5162a(this.f4539g, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C0785d.m5162a(this.f4539g, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C0785d.m5162a(this.f4539g, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4540h.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m4871a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C0737j.m4979p(context).m4998u().mo5205b(new RunnableC0716a(intent, context, goAsync()));
        } else {
            AbstractC0807n.m5221c().mo5224a(f4537a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
