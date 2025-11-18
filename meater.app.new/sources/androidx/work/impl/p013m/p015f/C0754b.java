package androidx.work.impl.p013m.p015f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC0807n;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: BatteryNotLowTracker.java */
/* renamed from: androidx.work.impl.m.f.b */
/* loaded from: classes.dex */
public class C0754b extends AbstractC0755c<Boolean> {

    /* renamed from: i */
    private static final String f4742i = AbstractC0807n.m5223f("BatteryNotLowTracker");

    public C0754b(Context context, InterfaceC0799a interfaceC0799a) {
        super(context, interfaceC0799a);
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0755c
    /* renamed from: g */
    public IntentFilter mo5052g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0755c
    /* renamed from: h */
    public void mo5053h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4742i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            m5060d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            m5060d(Boolean.FALSE);
        }
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo5051b() {
        Intent intentRegisterReceiver = this.f4748c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        AbstractC0807n.m5221c().mo5225b(f4742i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
