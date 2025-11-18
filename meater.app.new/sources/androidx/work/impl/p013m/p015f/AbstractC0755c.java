package androidx.work.impl.p013m.p015f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC0807n;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* renamed from: androidx.work.impl.m.f.c */
/* loaded from: classes.dex */
public abstract class AbstractC0755c<T> extends AbstractC0756d<T> {

    /* renamed from: g */
    private static final String f4743g = AbstractC0807n.m5223f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: h */
    private final BroadcastReceiver f4744h;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* renamed from: androidx.work.impl.m.f.c$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC0755c.this.mo5053h(context, intent);
            }
        }
    }

    public AbstractC0755c(Context context, InterfaceC0799a interfaceC0799a) {
        super(context, interfaceC0799a);
        this.f4744h = new a();
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: e */
    public void mo5056e() {
        AbstractC0807n.m5221c().mo5224a(f4743g, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f4748c.registerReceiver(this.f4744h, mo5052g());
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: f */
    public void mo5057f() {
        AbstractC0807n.m5221c().mo5224a(f4743g, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f4748c.unregisterReceiver(this.f4744h);
    }

    /* renamed from: g */
    public abstract IntentFilter mo5052g();

    /* renamed from: h */
    public abstract void mo5053h(Context context, Intent intent);
}
