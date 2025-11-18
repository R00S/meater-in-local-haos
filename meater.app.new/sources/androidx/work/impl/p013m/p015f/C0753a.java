package androidx.work.impl.p013m.p015f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: BatteryChargingTracker.java */
/* renamed from: androidx.work.impl.m.f.a */
/* loaded from: classes.dex */
public class C0753a extends AbstractC0755c<Boolean> {

    /* renamed from: i */
    private static final String f4741i = AbstractC0807n.m5223f("BatteryChrgTracker");

    public C0753a(Context context, InterfaceC0799a interfaceC0799a) {
        super(context, interfaceC0799a);
    }

    /* renamed from: j */
    private boolean m5050j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0755c
    /* renamed from: g */
    public IntentFilter mo5052g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // androidx.work.impl.p013m.p015f.AbstractC0755c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5053h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            androidx.work.n r7 = androidx.work.AbstractC0807n.m5221c()
            java.lang.String r0 = androidx.work.impl.p013m.p015f.C0753a.f4741i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo5224a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r1 = -1
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3c
            goto L26
        L3c:
            r1 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L51
            goto L26
        L47:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L50
            goto L26
        L50:
            r1 = 0
        L51:
            switch(r1) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.m5060d(r6)
            goto L6c
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.m5060d(r6)
            goto L6c
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.m5060d(r6)
            goto L6c
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.m5060d(r6)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p013m.p015f.C0753a.mo5053h(android.content.Context, android.content.Intent):void");
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo5051b() {
        Intent intentRegisterReceiver = this.f4748c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(m5050j(intentRegisterReceiver));
        }
        AbstractC0807n.m5221c().mo5225b(f4741i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
