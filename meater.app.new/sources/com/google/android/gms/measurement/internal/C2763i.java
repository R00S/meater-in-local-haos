package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.apptionlabs.meater_app.data.Temperature;
import g7.C3445p;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2763i extends C2795m3 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f35394b;

    /* renamed from: c, reason: collision with root package name */
    private String f35395c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2777k f35396d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f35397e;

    C2763i(P2 p22) {
        super(p22);
        this.f35396d = new InterfaceC2777k() { // from class: com.google.android.gms.measurement.internal.l
            @Override // com.google.android.gms.measurement.internal.InterfaceC2777k
            public final String d(String str, String str2) {
                return null;
            }
        };
    }

    public static long L() {
        return K.f34971e.a(null).longValue();
    }

    public static long N() {
        return K.f34987l.a(null).intValue();
    }

    public static long S() {
        return K.f34933N.a(null).longValue();
    }

    public static long T() {
        return K.f34923I.a(null).longValue();
    }

    private final String d(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            C3445p.k(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            k().H().b("Could not find SystemProperties class", e10);
            return str2;
        } catch (IllegalAccessException e11) {
            k().H().b("Could not access SystemProperties.get()", e11);
            return str2;
        } catch (NoSuchMethodException e12) {
            k().H().b("Could not find SystemProperties.get() method", e12);
            return str2;
        } catch (InvocationTargetException e13) {
            k().H().b("SystemProperties.get() threw an exception", e13);
            return str2;
        }
    }

    private final Bundle x() {
        try {
            if (a().getPackageManager() == null) {
                k().H().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = l7.c.a(a()).c(a().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            k().H().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            k().H().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    final int A(String str, boolean z10) {
        return Math.max(s(str, z10), 256);
    }

    public final int B() {
        return j().d0(201500000, true) ? 100 : 25;
    }

    public final int C(String str) {
        return z(str, K.f34995p);
    }

    public final long D(String str, Y1<Long> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).longValue();
        }
        String strD = this.f35396d.d(str, y12.b());
        if (TextUtils.isEmpty(strD)) {
            return y12.a(null).longValue();
        }
        try {
            return y12.a(Long.valueOf(Long.parseLong(strD))).longValue();
        } catch (NumberFormatException unused) {
            return y12.a(null).longValue();
        }
    }

    public final v7.E E(String str, boolean z10) {
        Object obj;
        C3445p.e(str);
        Bundle bundleX = x();
        if (bundleX == null) {
            k().H().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleX.get(str);
        }
        if (obj == null) {
            return v7.E.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return v7.E.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return v7.E.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return v7.E.POLICY;
        }
        k().M().b("Invalid manifest metadata for", str);
        return v7.E.UNINITIALIZED;
    }

    final long F(String str) {
        return D(str, K.f34962b);
    }

    public final String G(String str, Y1<String> y12) {
        return TextUtils.isEmpty(str) ? y12.a(null) : y12.a(this.f35396d.d(str, y12.b()));
    }

    final Boolean H(String str) {
        C3445p.e(str);
        Bundle bundleX = x();
        if (bundleX == null) {
            k().H().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleX.containsKey(str)) {
            return Boolean.valueOf(bundleX.getBoolean(str));
        }
        return null;
    }

    public final boolean I(String str, Y1<Boolean> y12) {
        return K(str, y12);
    }

    final String J(String str) {
        return G(str, K.f34951W);
    }

    public final boolean K(String str, Y1<Boolean> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).booleanValue();
        }
        String strD = this.f35396d.d(str, y12.b());
        return TextUtils.isEmpty(strD) ? y12.a(null).booleanValue() : y12.a(Boolean.valueOf("1".equals(strD))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<java.lang.String> M(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            g7.C3445p.e(r4)
            android.os.Bundle r0 = r3.x()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.h2 r4 = r3.k()
            com.google.android.gms.measurement.internal.i2 r4 = r4.H()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.a()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.h2 r0 = r3.k()
            com.google.android.gms.measurement.internal.i2 r0 = r0.H()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2763i.M(java.lang.String):java.util.List");
    }

    public final void O(String str) {
        this.f35395c = str;
    }

    final boolean P(String str) {
        return K(str, K.f34949V);
    }

    public final boolean Q(String str) {
        return "1".equals(this.f35396d.d(str, "gaia_collection_enabled"));
    }

    public final boolean R(String str) {
        return "1".equals(this.f35396d.d(str, "measurement.event_sampling_enabled"));
    }

    public final String U() {
        return d("debug.firebase.analytics.app", "");
    }

    public final String V() {
        return d("debug.deferred.deeplink", "");
    }

    public final String W() {
        return this.f35395c;
    }

    public final boolean X() {
        Boolean boolH = H("google_analytics_adid_collection_enabled");
        return boolH == null || boolH.booleanValue();
    }

    public final boolean Y() {
        Boolean boolH = H("google_analytics_automatic_screen_reporting_enabled");
        return boolH == null || boolH.booleanValue();
    }

    public final boolean Z() {
        Boolean boolH = H("firebase_analytics_collection_deactivated");
        return boolH != null && boolH.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final boolean a0() {
        if (this.f35394b == null) {
            Boolean boolH = H("app_measurement_lite");
            this.f35394b = boolH;
            if (boolH == null) {
                this.f35394b = Boolean.FALSE;
            }
        }
        return this.f35394b.booleanValue() || !this.f35457a.w();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    public final double p(String str, Y1<Double> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).doubleValue();
        }
        String strD = this.f35396d.d(str, y12.b());
        if (TextUtils.isEmpty(strD)) {
            return y12.a(null).doubleValue();
        }
        try {
            return y12.a(Double.valueOf(Double.parseDouble(strD))).doubleValue();
        } catch (NumberFormatException unused) {
            return y12.a(null).doubleValue();
        }
    }

    final int q(String str) {
        return r(str, K.f34943S, Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, 2000);
    }

    public final int r(String str, Y1<Integer> y12, int i10, int i11) {
        return Math.max(Math.min(z(str, y12), i11), i10);
    }

    final int s(String str, boolean z10) {
        return z10 ? r(str, K.f34966c0, 100, Temperature.MAX_AMBIENT_SECOND_GEN_PROBE) : Temperature.MAX_AMBIENT_SECOND_GEN_PROBE;
    }

    final void t(InterfaceC2777k interfaceC2777k) {
        this.f35396d = interfaceC2777k;
    }

    public final boolean u(Y1<Boolean> y12) {
        return K(null, y12);
    }

    public final boolean v() {
        if (this.f35397e == null) {
            synchronized (this) {
                try {
                    if (this.f35397e == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String strA = com.google.android.gms.common.util.o.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f35397e = Boolean.valueOf(str != null && str.equals(strA));
                        }
                        if (this.f35397e == null) {
                            this.f35397e = Boolean.TRUE;
                            k().H().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f35397e.booleanValue();
    }

    public final boolean w() {
        Boolean boolH = H("google_analytics_sgtm_upload_enabled");
        if (boolH == null) {
            return false;
        }
        return boolH.booleanValue();
    }

    public final int y(String str) {
        return r(str, K.f34945T, 25, 100);
    }

    public final int z(String str, Y1<Integer> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).intValue();
        }
        String strD = this.f35396d.d(str, y12.b());
        if (TextUtils.isEmpty(strD)) {
            return y12.a(null).intValue();
        }
        try {
            return y12.a(Integer.valueOf(Integer.parseInt(strD))).intValue();
        } catch (NumberFormatException unused) {
            return y12.a(null).intValue();
        }
    }
}
