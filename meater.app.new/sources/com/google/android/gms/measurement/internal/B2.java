package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2455d0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class B2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2455d0 f34752B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f34753C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2884z2 f34754D;

    B2(ServiceConnectionC2884z2 serviceConnectionC2884z2, InterfaceC2455d0 interfaceC2455d0, ServiceConnection serviceConnection) {
        this.f34752B = interfaceC2455d0;
        this.f34753C = serviceConnection;
        this.f34754D = serviceConnectionC2884z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC2884z2 serviceConnectionC2884z2 = this.f34754D;
        A2 a22 = serviceConnectionC2884z2.f35781C;
        String str = serviceConnectionC2884z2.f35780B;
        InterfaceC2455d0 interfaceC2455d0 = this.f34752B;
        ServiceConnection serviceConnection = this.f34753C;
        Bundle bundleA = a22.a(str, interfaceC2455d0);
        a22.f34737a.o().n();
        a22.f34737a.n();
        if (bundleA != null) {
            long j10 = bundleA.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                a22.f34737a.k().M().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleA.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    a22.f34737a.k().H().a("No referrer defined in Install Referrer response");
                } else {
                    a22.f34737a.k().L().b("InstallReferrer API result", string);
                    Bundle bundleD = a22.f34737a.P().D(Uri.parse("?" + string));
                    if (bundleD == null) {
                        a22.f34737a.k().H().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (bundleD.containsKey("gclid") || bundleD.containsKey("gbraid")) {
                            long j11 = bundleA.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j11 > 0) {
                                bundleD.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == a22.f34737a.H().f35602h.a()) {
                            a22.f34737a.k().L().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (a22.f34737a.s()) {
                            a22.f34737a.H().f35602h.b(j10);
                            a22.f34737a.k().L().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleD.putString("_cis", "referrer API v2");
                            a22.f34737a.J().m0("auto", "_cmp", bundleD, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            j7.b.b().c(a22.f34737a.a(), serviceConnection);
        }
    }
}
