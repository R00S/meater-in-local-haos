package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p3 */
/* loaded from: classes2.dex */
class C7789p3 extends BroadcastReceiver {

    /* renamed from: a */
    @VisibleForTesting
    private static final String f28818a = C7789p3.class.getName();

    /* renamed from: b */
    private final zzkc f28819b;

    /* renamed from: c */
    private boolean f28820c;

    /* renamed from: d */
    private boolean f28821d;

    C7789p3(zzkc zzkcVar) {
        Preconditions.m14372k(zzkcVar);
        this.f28819b = zzkcVar;
    }

    /* renamed from: b */
    public final void m22804b() {
        this.f28819b.m23451c0();
        this.f28819b.mo22835g().mo22792d();
        if (this.f28820c) {
            return;
        }
        this.f28819b.mo22834f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f28821d = this.f28819b.m23443U().m23154z();
        this.f28819b.mo22836h().m23145P().m23148b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f28821d));
        this.f28820c = true;
    }

    /* renamed from: c */
    public final void m22805c() {
        this.f28819b.m23451c0();
        this.f28819b.mo22835g().mo22792d();
        this.f28819b.mo22835g().mo22792d();
        if (this.f28820c) {
            this.f28819b.mo22836h().m23145P().m23147a("Unregistering connectivity change receiver");
            this.f28820c = false;
            this.f28821d = false;
            try {
                this.f28819b.mo22834f().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f28819b.mo22836h().m23137H().m23148b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws IllegalStateException {
        this.f28819b.m23451c0();
        String action = intent.getAction();
        this.f28819b.mo22836h().m23145P().m23148b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f28819b.mo22836h().m23140K().m23148b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM23154z = this.f28819b.m23443U().m23154z();
        if (this.f28821d != zM23154z) {
            this.f28821d = zM23154z;
            this.f28819b.mo22835g().m23201z(new RunnableC7780o3(this, zM23154z));
        }
    }
}
