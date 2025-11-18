package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzx extends C7808r4 {

    /* renamed from: b */
    private Boolean f29434b;

    /* renamed from: c */
    private InterfaceC7865x7 f29435c;

    /* renamed from: d */
    private Boolean f29436d;

    zzx(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29435c = C7659b.f28552a;
        zzap.m23022d(zzfxVar);
    }

    /* renamed from: N */
    public static long m23557N() {
        return zzap.f29101K.m23095a(null).longValue();
    }

    /* renamed from: U */
    public static long m23558U() {
        return zzap.f29151k.m23095a(null).longValue();
    }

    /* renamed from: X */
    public static boolean m23559X() {
        return zzap.f29143g.m23095a(null).booleanValue();
    }

    /* renamed from: i */
    private final String m23560i(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e2) {
            mo22836h().m23137H().m23148b("Could not find SystemProperties class", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            mo22836h().m23137H().m23148b("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (NoSuchMethodException e4) {
            mo22836h().m23137H().m23148b("Could not find SystemProperties.get() method", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            mo22836h().m23137H().m23148b("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    @VisibleForTesting
    /* renamed from: s */
    private final Bundle m23561s() {
        try {
            if (mo22834f().getPackageManager() == null) {
                mo22836h().m23137H().m23147a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM14669c = Wrappers.m14674a(mo22834f()).m14669c(mo22834f().getPackageName(), 128);
            if (applicationInfoM14669c != null) {
                return applicationInfoM14669c.metaData;
            }
            mo22836h().m23137H().m23147a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            mo22836h().m23137H().m23148b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    /* renamed from: z */
    static String m23562z() {
        return zzap.f29145h.m23095a(null);
    }

    /* renamed from: A */
    public final boolean m23563A(String str) {
        return "1".equals(this.f29435c.mo22702i(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: B */
    public final boolean m23564B(String str, zzem<Boolean> zzemVar) {
        return m23593y(str, zzemVar);
    }

    /* renamed from: C */
    public final long m23565C() {
        mo22832G();
        return 18202L;
    }

    /* renamed from: D */
    final boolean m23566D(String str) {
        return m23593y(str, zzap.f29121U);
    }

    /* renamed from: E */
    public final boolean m23567E() {
        if (this.f29436d == null) {
            synchronized (this) {
                if (this.f29436d == null) {
                    ApplicationInfo applicationInfo = mo22834f().getApplicationInfo();
                    String strM14653a = ProcessUtils.m14653a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f29436d = Boolean.valueOf(str != null && str.equals(strM14653a));
                    }
                    if (this.f29436d == null) {
                        this.f29436d = Boolean.TRUE;
                        mo22836h().m23137H().m23147a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f29436d.booleanValue();
    }

    /* renamed from: F */
    final boolean m23568F(String str) {
        return m23593y(str, zzap.f29109O);
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    final String m23569H(String str) {
        zzem<String> zzemVar = zzap.f29111P;
        return str == null ? zzemVar.m23095a(null) : zzemVar.m23095a(this.f29435c.mo22702i(str, zzemVar.m23096b()));
    }

    /* renamed from: I */
    public final boolean m23570I() {
        mo22832G();
        Boolean boolM23589u = m23589u("firebase_analytics_collection_deactivated");
        return boolM23589u != null && boolM23589u.booleanValue();
    }

    /* renamed from: J */
    public final Boolean m23571J() {
        mo22832G();
        return m23589u("firebase_analytics_collection_enabled");
    }

    /* renamed from: K */
    final boolean m23572K(String str) {
        return m23593y(str, zzap.f29123V);
    }

    /* renamed from: L */
    public final Boolean m23573L() {
        mo22790b();
        Boolean boolM23589u = m23589u("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(boolM23589u == null || boolM23589u.booleanValue());
    }

    /* renamed from: M */
    final boolean m23574M(String str) {
        return m23593y(str, zzap.f29127X);
    }

    /* renamed from: O */
    final boolean m23575O(String str) {
        return m23593y(str, zzap.f29125W);
    }

    /* renamed from: P */
    final boolean m23576P(String str) {
        return m23593y(str, zzap.f29129Y);
    }

    /* renamed from: Q */
    final boolean m23577Q(String str) {
        return m23593y(str, zzap.f29130Z);
    }

    /* renamed from: R */
    final boolean m23578R(String str) {
        return m23593y(str, zzap.f29132a0);
    }

    /* renamed from: S */
    final boolean m23579S(String str) {
        return m23593y(str, zzap.f29134b0);
    }

    /* renamed from: T */
    final boolean m23580T(String str) {
        return m23593y(str, zzap.f29148i0);
    }

    /* renamed from: V */
    public final String m23581V() {
        return m23560i("debug.firebase.analytics.app", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: W */
    public final String m23582W() {
        return m23560i("debug.deferred.deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: Y */
    final boolean m23583Y() {
        if (this.f29434b == null) {
            Boolean boolM23589u = m23589u("app_measurement_lite");
            this.f29434b = boolM23589u;
            if (boolM23589u == null) {
                this.f29434b = Boolean.FALSE;
            }
        }
        return this.f29434b.booleanValue() || !this.f28874a.m23224P();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    /* renamed from: o */
    public final int m23584o(String str) {
        return m23588t(str, zzap.f29173v);
    }

    /* renamed from: p */
    public final long m23585p(String str, zzem<Long> zzemVar) {
        if (str == null) {
            return zzemVar.m23095a(null).longValue();
        }
        String strMo22702i = this.f29435c.mo22702i(str, zzemVar.m23096b());
        if (TextUtils.isEmpty(strMo22702i)) {
            return zzemVar.m23095a(null).longValue();
        }
        try {
            return zzemVar.m23095a(Long.valueOf(Long.parseLong(strMo22702i))).longValue();
        } catch (NumberFormatException unused) {
            return zzemVar.m23095a(null).longValue();
        }
    }

    /* renamed from: q */
    final void m23586q(InterfaceC7865x7 interfaceC7865x7) {
        this.f29435c = interfaceC7865x7;
    }

    /* renamed from: r */
    public final boolean m23587r(zzem<Boolean> zzemVar) {
        return m23593y(null, zzemVar);
    }

    /* renamed from: t */
    public final int m23588t(String str, zzem<Integer> zzemVar) {
        if (str == null) {
            return zzemVar.m23095a(null).intValue();
        }
        String strMo22702i = this.f29435c.mo22702i(str, zzemVar.m23096b());
        if (TextUtils.isEmpty(strMo22702i)) {
            return zzemVar.m23095a(null).intValue();
        }
        try {
            return zzemVar.m23095a(Integer.valueOf(Integer.parseInt(strMo22702i))).intValue();
        } catch (NumberFormatException unused) {
            return zzemVar.m23095a(null).intValue();
        }
    }

    @VisibleForTesting
    /* renamed from: u */
    final Boolean m23589u(String str) {
        Preconditions.m14368g(str);
        Bundle bundleM23561s = m23561s();
        if (bundleM23561s == null) {
            mo22836h().m23137H().m23147a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM23561s.containsKey(str)) {
            return Boolean.valueOf(bundleM23561s.getBoolean(str));
        }
        return null;
    }

    /* renamed from: v */
    public final double m23590v(String str, zzem<Double> zzemVar) {
        if (str == null) {
            return zzemVar.m23095a(null).doubleValue();
        }
        String strMo22702i = this.f29435c.mo22702i(str, zzemVar.m23096b());
        if (TextUtils.isEmpty(strMo22702i)) {
            return zzemVar.m23095a(null).doubleValue();
        }
        try {
            return zzemVar.m23095a(Double.valueOf(Double.parseDouble(strMo22702i))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzemVar.m23095a(null).doubleValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<java.lang.String> m23591w(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.m14368g(r4)
            android.os.Bundle r0 = r3.m23561s()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.zzet r4 = r3.mo22836h()
            com.google.android.gms.measurement.internal.zzev r4 = r4.m23137H()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m23147a(r0)
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
            android.content.Context r0 = r3.mo22834f()     // Catch: android.content.res.Resources.NotFoundException -> L43
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
            com.google.android.gms.measurement.internal.zzet r0 = r3.mo22836h()
            com.google.android.gms.measurement.internal.zzev r0 = r0.m23137H()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m23148b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.m23591w(java.lang.String):java.util.List");
    }

    /* renamed from: x */
    public final boolean m23592x(String str) {
        return "1".equals(this.f29435c.mo22702i(str, "gaia_collection_enabled"));
    }

    /* renamed from: y */
    public final boolean m23593y(String str, zzem<Boolean> zzemVar) {
        if (str == null) {
            return zzemVar.m23095a(null).booleanValue();
        }
        String strMo22702i = this.f29435c.mo22702i(str, zzemVar.m23096b());
        return TextUtils.isEmpty(strMo22702i) ? zzemVar.m23095a(null).booleanValue() : zzemVar.m23095a(Boolean.valueOf(Boolean.parseBoolean(strMo22702i))).booleanValue();
    }
}
