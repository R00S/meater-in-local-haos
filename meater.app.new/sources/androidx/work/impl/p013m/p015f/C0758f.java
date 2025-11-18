package androidx.work.impl.p013m.p015f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC0807n;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: StorageNotLowTracker.java */
/* renamed from: androidx.work.impl.m.f.f */
/* loaded from: classes.dex */
public class C0758f extends AbstractC0755c<Boolean> {

    /* renamed from: i */
    private static final String f4760i = AbstractC0807n.m5223f("StorageNotLowTracker");

    public C0758f(Context context, InterfaceC0799a interfaceC0799a) {
        super(context, interfaceC0799a);
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0755c
    /* renamed from: g */
    public IntentFilter mo5052g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0755c
    /* renamed from: h */
    public void mo5053h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4760i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            m5060d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            m5060d(Boolean.TRUE);
        }
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo5051b() {
        Intent intentRegisterReceiver = this.f4748c.registerReceiver(null, mo5052g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
