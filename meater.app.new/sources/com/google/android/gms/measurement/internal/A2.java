package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2455d0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    final P2 f34737a;

    A2(C2880y5 c2880y5) {
        this.f34737a = c2880y5.G0();
    }

    final Bundle a(String str, InterfaceC2455d0 interfaceC2455d0) {
        this.f34737a.o().n();
        if (interfaceC2455d0 == null) {
            this.f34737a.k().M().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleH = interfaceC2455d0.h(bundle);
            if (bundleH != null) {
                return bundleH;
            }
            this.f34737a.k().H().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f34737a.k().H().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            l7.b bVarA = l7.c.a(this.f34737a.a());
            if (bVarA != null) {
                return bVarA.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f34737a.k().L().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f34737a.k().L().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
