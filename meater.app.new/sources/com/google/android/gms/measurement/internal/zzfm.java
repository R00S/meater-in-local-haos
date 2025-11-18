package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfm {

    /* renamed from: a */
    final zzfx f29251a;

    zzfm(zzfx zzfxVar) {
        this.f29251a = zzfxVar;
    }

    @VisibleForTesting
    /* renamed from: c */
    private final boolean m23166c() {
        try {
            PackageManagerWrapper packageManagerWrapperM14674a = Wrappers.m14674a(this.f29251a.mo22834f());
            if (packageManagerWrapperM14674a != null) {
                return packageManagerWrapperM14674a.m14671e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f29251a.mo22836h().m23143N().m23147a("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e2) {
            this.f29251a.mo22836h().m23143N().m23148b("Failed to retrieve Play Store version", e2);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    final Bundle m23167a(String str, zzd zzdVar) {
        this.f29251a.mo22835g().mo22792d();
        if (zzdVar == null) {
            this.f29251a.mo22836h().m23140K().m23147a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleMo22129J = zzdVar.mo22129J(bundle);
            if (bundleMo22129J != null) {
                return bundleMo22129J;
            }
            this.f29251a.mo22836h().m23137H().m23147a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.f29251a.mo22836h().m23137H().m23148b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    protected final void m23168b(String str) {
        if (str == null || str.isEmpty()) {
            this.f29251a.mo22836h().m23143N().m23147a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f29251a.mo22835g().mo22792d();
        if (!m23166c()) {
            this.f29251a.mo22836h().m23143N().m23147a("Install Referrer Reporter is not available");
            return;
        }
        this.f29251a.mo22836h().m23143N().m23147a("Install Referrer Reporter is initializing");
        zzfl zzflVar = new zzfl(this, str);
        this.f29251a.mo22835g().mo22792d();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f29251a.mo22834f().getPackageManager();
        if (packageManager == null) {
            this.f29251a.mo22836h().m23140K().m23147a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.f29251a.mo22836h().m23143N().m23147a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !m23166c()) {
                this.f29251a.mo22836h().m23143N().m23147a("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.f29251a.mo22836h().m23143N().m23148b("Install Referrer Service is", ConnectionTracker.m14575b().m14580a(this.f29251a.mo22834f(), new Intent(intent), zzflVar, 1) ? "available" : "not available");
            } catch (Exception e2) {
                this.f29251a.mo22836h().m23137H().m23148b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }
}
