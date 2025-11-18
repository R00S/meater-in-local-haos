package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC0807n;
import androidx.work.C0704c;
import androidx.work.EnumC0808o;
import androidx.work.impl.p016n.C0775p;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4536a = AbstractC0807n.m5223f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m4870a(Context context, List<C0775p> list) {
        Iterator<C0775p> it = list.iterator();
        boolean zM4804f = false;
        boolean zM4805g = false;
        boolean zM4807i = false;
        boolean z = false;
        while (it.hasNext()) {
            C0704c c0704c = it.next().f4808l;
            zM4804f |= c0704c.m4804f();
            zM4805g |= c0704c.m4805g();
            zM4807i |= c0704c.m4807i();
            z |= c0704c.m4800b() != EnumC0808o.NOT_REQUIRED;
            if (zM4804f && zM4805g && zM4807i && z) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m4871a(context, zM4804f, zM4805g, zM4807i, z));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC0807n.m5221c().mo5224a(f4536a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(C0718b.m4878a(context));
    }
}
