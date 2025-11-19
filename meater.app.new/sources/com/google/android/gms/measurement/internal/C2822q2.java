package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2822q2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final C2880y5 f35523a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35524b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35525c;

    C2822q2(C2880y5 c2880y5) {
        C3445p.k(c2880y5);
        this.f35523a = c2880y5;
    }

    public final void b() {
        this.f35523a.O0();
        this.f35523a.o().n();
        if (this.f35524b) {
            return;
        }
        this.f35523a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f35525c = this.f35523a.C0().C();
        this.f35523a.k().L().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f35525c));
        this.f35524b = true;
    }

    public final void c() {
        this.f35523a.O0();
        this.f35523a.o().n();
        this.f35523a.o().n();
        if (this.f35524b) {
            this.f35523a.k().L().a("Unregistering connectivity change receiver");
            this.f35524b = false;
            this.f35525c = false;
            try {
                this.f35523a.a().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f35523a.k().H().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f35523a.O0();
        String action = intent.getAction();
        this.f35523a.k().L().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f35523a.k().M().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zC = this.f35523a.C0().C();
        if (this.f35525c != zC) {
            this.f35525c = zC;
            this.f35523a.o().E(new RunnableC2842t2(this, zC));
        }
    }
}
