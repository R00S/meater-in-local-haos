package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzhc extends AbstractC7833u2 {

    /* renamed from: c */
    @VisibleForTesting
    protected C7755l5 f29321c;

    /* renamed from: d */
    private zzgx f29322d;

    /* renamed from: e */
    private final Set<zzha> f29323e;

    /* renamed from: f */
    private boolean f29324f;

    /* renamed from: g */
    private final AtomicReference<String> f29325g;

    /* renamed from: h */
    @VisibleForTesting
    protected boolean f29326h;

    protected zzhc(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29323e = new CopyOnWriteArraySet();
        this.f29326h = true;
        this.f29325g = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final void m23255A0(Bundle bundle) {
        mo22792d();
        m22857x();
        Preconditions.m14372k(bundle);
        Preconditions.m14368g(bundle.getString("name"));
        if (!this.f28874a.m23236p()) {
            mo22836h().m23144O().m23147a("Conditional property not cleared since collection is disabled");
            return;
        }
        try {
            mo22796r().m23366Q(new zzv(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID), bundle.getString("origin"), new zzkj(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), mo22839l().m23522C(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m23256B0(boolean z) throws IllegalStateException {
        mo22792d();
        mo22790b();
        m22857x();
        mo22836h().m23144O().m23148b("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo22840m().m22831z(z);
        m23261l0();
    }

    /* renamed from: R */
    private final void m23260R(String str, String str2, long j2, Object obj) throws IllegalStateException {
        mo22835g().m23201z(new RunnableC7862x4(this, str, str2, obj, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m23261l0() throws IllegalStateException {
        if (mo22841n().m23564B(mo22795q().m23110C(), zzap.f29154l0)) {
            mo22792d();
            String strM23159a = mo22840m().f28867t.m23159a();
            if (strM23159a != null) {
                if ("unset".equals(strM23159a)) {
                    m23284V("app", "_npa", null, mo22837j().mo14608a());
                } else {
                    m23284V("app", "_npa", Long.valueOf("true".equals(strM23159a) ? 1L : 0L), mo22837j().mo14608a());
                }
            }
        }
        if (this.f28874a.m23236p() && this.f29326h) {
            mo22836h().m23144O().m23147a("Recording app launch after enabling measurement for the first time (FE)");
            m23296h0();
        } else {
            mo22836h().m23144O().m23147a("Updating Scion state (FE)");
            mo22796r().m23371W();
        }
    }

    @VisibleForTesting
    /* renamed from: m0 */
    private final ArrayList<Bundle> m23262m0(String str, String str2, String str3) {
        if (mo22835g().m23198I()) {
            mo22836h().m23137H().m23147a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (zzw.m23556a()) {
            mo22836h().m23137H().m23147a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.f28874a.mo22835g().m23201z(new RunnableC7665b5(this, atomicReference, str, str2, str3));
            try {
                atomicReference.wait(5000L);
            } catch (InterruptedException e2) {
                mo22836h().m23140K().m23149c("Interrupted waiting for get conditional user properties", str, e2);
            }
        }
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzkk.m23511l0(list);
        }
        mo22836h().m23140K().m23148b("Timed out waiting for get conditional user properties", str);
        return new ArrayList<>();
    }

    @VisibleForTesting
    /* renamed from: n0 */
    private final Map<String, Object> m23263n0(String str, String str2, String str3, boolean z) {
        if (mo22835g().m23198I()) {
            mo22836h().m23137H().m23147a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (zzw.m23556a()) {
            mo22836h().m23137H().m23147a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.f28874a.mo22835g().m23201z(new RunnableC7683d5(this, atomicReference, str, str2, str3, z));
            try {
                atomicReference.wait(5000L);
            } catch (InterruptedException e2) {
                mo22836h().m23140K().m23148b("Interrupted waiting for get user properties", e2);
            }
        }
        List<zzkj> list = (List) atomicReference.get();
        if (list == null) {
            mo22836h().m23140K().m23147a("Timed out waiting for handle get user properties");
            return Collections.emptyMap();
        }
        C0867a c0867a = new C0867a(list.size());
        for (zzkj zzkjVar : list) {
            c0867a.put(zzkjVar.f29388g, zzkjVar.m23494y());
        }
        return c0867a;
    }

    /* renamed from: q0 */
    private final void m23264q0(Bundle bundle, long j2) throws IllegalStateException {
        Preconditions.m14372k(bundle);
        zzgt.m23249a(bundle, RateAndReviewsFragment.BundleCons.APP_ID, String.class, null);
        zzgt.m23249a(bundle, "origin", String.class, null);
        zzgt.m23249a(bundle, "name", String.class, null);
        zzgt.m23249a(bundle, "value", Object.class, null);
        zzgt.m23249a(bundle, "trigger_event_name", String.class, null);
        zzgt.m23249a(bundle, "trigger_timeout", Long.class, 0L);
        zzgt.m23249a(bundle, "timed_out_event_name", String.class, null);
        zzgt.m23249a(bundle, "timed_out_event_params", Bundle.class, null);
        zzgt.m23249a(bundle, "triggered_event_name", String.class, null);
        zzgt.m23249a(bundle, "triggered_event_params", Bundle.class, null);
        zzgt.m23249a(bundle, "time_to_live", Long.class, 0L);
        zzgt.m23249a(bundle, "expired_event_name", String.class, null);
        zzgt.m23249a(bundle, "expired_event_params", Bundle.class, null);
        Preconditions.m14368g(bundle.getString("name"));
        Preconditions.m14368g(bundle.getString("origin"));
        Preconditions.m14372k(bundle.get("value"));
        bundle.putLong("creation_timestamp", j2);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (mo22839l().m23545o0(string) != 0) {
            mo22836h().m23137H().m23148b("Invalid conditional user property name", mo22838k().m23120B(string));
            return;
        }
        if (mo22839l().m23543j0(string, obj) != 0) {
            mo22836h().m23137H().m23149c("Invalid conditional user property value", mo22838k().m23120B(string), obj);
            return;
        }
        Object objM23546p0 = mo22839l().m23546p0(string, obj);
        if (objM23546p0 == null) {
            mo22836h().m23137H().m23149c("Unable to normalize conditional user property value", mo22838k().m23120B(string), obj);
            return;
        }
        zzgt.m23250b(bundle, objM23546p0);
        long j3 = bundle.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle.getString("trigger_event_name")) && (j3 > 15552000000L || j3 < 1)) {
            mo22836h().m23137H().m23149c("Invalid conditional user property timeout", mo22838k().m23120B(string), Long.valueOf(j3));
            return;
        }
        long j4 = bundle.getLong("time_to_live");
        if (j4 > 15552000000L || j4 < 1) {
            mo22836h().m23137H().m23149c("Invalid conditional user property time to live", mo22838k().m23120B(string), Long.valueOf(j4));
        } else {
            mo22835g().m23201z(new RunnableC7879z4(this, bundle));
        }
    }

    /* renamed from: t0 */
    private final void m23266t0(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) throws IllegalStateException {
        mo22835g().m23201z(new RunnableC7844v4(this, str, str2, j2, zzkk.m23510k0(bundle), z, z2, z3, str3));
    }

    /* renamed from: v0 */
    private final void m23267v0(String str, String str2, String str3, Bundle bundle) throws IllegalStateException {
        long jMo14608a = mo22837j().mo14608a();
        Preconditions.m14368g(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString(RateAndReviewsFragment.BundleCons.APP_ID, str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", jMo14608a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo22835g().m23201z(new RunnableC7674c5(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public final void m23268x0(Bundle bundle) {
        mo22792d();
        m22857x();
        Preconditions.m14372k(bundle);
        Preconditions.m14368g(bundle.getString("name"));
        Preconditions.m14368g(bundle.getString("origin"));
        Preconditions.m14372k(bundle.get("value"));
        if (!this.f28874a.m23236p()) {
            mo22836h().m23144O().m23147a("Conditional property not sent since collection is disabled");
            return;
        }
        zzkj zzkjVar = new zzkj(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            zzan zzanVarM23522C = mo22839l().m23522C(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L, true, false);
            mo22796r().m23366Q(new zzv(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID), bundle.getString("origin"), zzkjVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), mo22839l().m23522C(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L, true, false), bundle.getLong("trigger_timeout"), zzanVarM23522C, bundle.getLong("time_to_live"), mo22839l().m23522C(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7833u2
    /* renamed from: A */
    protected final boolean mo22854A() {
        return false;
    }

    /* renamed from: B */
    public final ArrayList<Bundle> m23269B(String str, String str2) {
        mo22790b();
        return m23262m0(null, str, str2);
    }

    /* renamed from: C */
    public final ArrayList<Bundle> m23270C(String str, String str2, String str3) {
        Preconditions.m14368g(str);
        mo22789a();
        return m23262m0(str, str2, str3);
    }

    /* renamed from: D */
    public final Map<String, Object> m23271D(String str, String str2, String str3, boolean z) {
        Preconditions.m14368g(str);
        mo22789a();
        return m23263n0(str, str2, str3, z);
    }

    /* renamed from: E */
    public final Map<String, Object> m23272E(String str, String str2, boolean z) {
        mo22790b();
        return m23263n0(null, str, str2, z);
    }

    /* renamed from: F */
    public final void m23273F(long j2) throws IllegalStateException {
        mo22790b();
        mo22835g().m23201z(new RunnableC7737j5(this, j2));
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    public final void m23274H(Bundle bundle) throws IllegalStateException {
        m23275I(bundle, mo22837j().mo14608a());
    }

    /* renamed from: I */
    public final void m23275I(Bundle bundle, long j2) throws IllegalStateException {
        Preconditions.m14372k(bundle);
        mo22790b();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(RateAndReviewsFragment.BundleCons.APP_ID))) {
            mo22836h().m23140K().m23147a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(RateAndReviewsFragment.BundleCons.APP_ID);
        m23264q0(bundle2, j2);
    }

    /* renamed from: J */
    public final void m23276J(zzgx zzgxVar) {
        zzgx zzgxVar2;
        mo22792d();
        mo22790b();
        m22857x();
        if (zzgxVar != null && zzgxVar != (zzgxVar2 = this.f29322d)) {
            Preconditions.m14376o(zzgxVar2 == null, "EventInterceptor already set.");
        }
        this.f29322d = zzgxVar;
    }

    /* renamed from: K */
    public final void m23277K(zzha zzhaVar) {
        mo22790b();
        m22857x();
        Preconditions.m14372k(zzhaVar);
        if (this.f29323e.add(zzhaVar)) {
            return;
        }
        mo22836h().m23140K().m23147a("OnEventListener already registered");
    }

    /* renamed from: O */
    final void m23278O(String str) {
        this.f29325g.set(str);
    }

    /* renamed from: P */
    final void m23279P(String str, String str2, long j2, Bundle bundle) throws IllegalStateException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mo22790b();
        mo22792d();
        m23280Q(str, str2, j2, bundle, true, this.f29322d == null || zzkk.m23515u0(str2), false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m23280Q(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36, java.lang.String r37) throws java.lang.IllegalStateException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhc.m23280Q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: S */
    public final void m23281S(String str, String str2, Bundle bundle) {
        m23283U(str, str2, bundle, true, true, mo22837j().mo14608a());
    }

    /* renamed from: T */
    public final void m23282T(String str, String str2, Bundle bundle, boolean z) throws IllegalStateException {
        m23283U(str, str2, bundle, false, true, mo22837j().mo14608a());
    }

    /* renamed from: U */
    public final void m23283U(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws IllegalStateException {
        mo22790b();
        m23266t0(str == null ? "app" : str, str2, j2, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f29322d == null || zzkk.m23515u0(str2), !z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m23284V(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) throws java.lang.IllegalStateException {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.m14368g(r9)
            com.google.android.gms.common.internal.Preconditions.m14368g(r10)
            r8.mo22792d()
            r8.mo22790b()
            r8.m22857x()
            com.google.android.gms.measurement.internal.zzx r0 = r8.mo22841n()
            com.google.android.gms.measurement.internal.zzeq r1 = r8.mo22795q()
            java.lang.String r1 = r1.m23110C()
            com.google.android.gms.measurement.internal.zzem<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzap.f29154l0
            boolean r0 = r0.m23564B(r1, r2)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L77
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L77
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L67
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L67
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L4c
            r4 = r2
            goto L4e
        L4c:
            r4 = 0
        L4e:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.r3 r0 = r8.mo22840m()
            com.google.android.gms.measurement.internal.zzfj r0 = r0.f28867t
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L62
            java.lang.String r11 = "true"
        L62:
            r0.m23160b(r11)
            r6 = r10
            goto L75
        L67:
            if (r11 != 0) goto L77
            com.google.android.gms.measurement.internal.r3 r10 = r8.mo22840m()
            com.google.android.gms.measurement.internal.zzfj r10 = r10.f28867t
            java.lang.String r0 = "unset"
            r10.m23160b(r0)
            r6 = r11
        L75:
            r3 = r1
            goto L79
        L77:
            r3 = r10
            r6 = r11
        L79:
            com.google.android.gms.measurement.internal.zzfx r10 = r8.f28874a
            boolean r10 = r10.m23236p()
            if (r10 != 0) goto L8f
            com.google.android.gms.measurement.internal.zzet r9 = r8.mo22836h()
            com.google.android.gms.measurement.internal.zzev r9 = r9.m23144O()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m23147a(r10)
            return
        L8f:
            com.google.android.gms.measurement.internal.zzfx r10 = r8.f28874a
            boolean r10 = r10.m23241u()
            if (r10 != 0) goto L98
            return
        L98:
            com.google.android.gms.measurement.internal.zzet r10 = r8.mo22836h()
            com.google.android.gms.measurement.internal.zzev r10 = r10.m23144O()
            com.google.android.gms.measurement.internal.zzer r11 = r8.mo22838k()
            java.lang.String r11 = r11.m23124y(r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.m23149c(r0, r11, r6)
            com.google.android.gms.measurement.internal.zzkj r10 = new com.google.android.gms.measurement.internal.zzkj
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzik r9 = r8.mo22796r()
            r9.m23365P(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhc.m23284V(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: W */
    public final void m23285W(String str, String str2, Object obj, boolean z) throws IllegalStateException {
        m23286X(str, str2, obj, z, mo22837j().mo14608a());
    }

    /* renamed from: X */
    public final void m23286X(String str, String str2, Object obj, boolean z, long j2) throws IllegalStateException {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int iM23545o0 = 6;
        if (z) {
            iM23545o0 = mo22839l().m23545o0(str2);
        } else {
            zzkk zzkkVarMo22839l = mo22839l();
            if (zzkkVarMo22839l.m23540b0("user property", str2)) {
                if (!zzkkVarMo22839l.m23541e0("user property", zzgy.f29311a, str2)) {
                    iM23545o0 = 15;
                } else if (zzkkVarMo22839l.m23539a0("user property", 24, str2)) {
                    iM23545o0 = 0;
                }
            }
        }
        if (iM23545o0 != 0) {
            mo22839l();
            this.f28874a.m23217I().m23527I(iM23545o0, "_ev", zzkk.m23498F(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            m23260R(str3, str2, j2, null);
            return;
        }
        int iM23543j0 = mo22839l().m23543j0(str2, obj);
        if (iM23543j0 != 0) {
            mo22839l();
            this.f28874a.m23217I().m23527I(iM23543j0, "_ev", zzkk.m23498F(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
        } else {
            Object objM23546p0 = mo22839l().m23546p0(str2, obj);
            if (objM23546p0 != null) {
                m23260R(str3, str2, j2, objM23546p0);
            }
        }
    }

    /* renamed from: Y */
    public final void m23287Y(String str, String str2, String str3, Bundle bundle) throws IllegalStateException {
        Preconditions.m14368g(str);
        mo22789a();
        m23267v0(str, str2, str3, bundle);
    }

    /* renamed from: Z */
    public final void m23288Z(boolean z) throws IllegalStateException {
        m22857x();
        mo22790b();
        mo22835g().m23201z(new RunnableC7719h5(this, z));
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    /* renamed from: a0 */
    public final void m23289a0() {
        if (mo22834f().getApplicationContext() instanceof Application) {
            ((Application) mo22834f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f29321c);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    /* renamed from: b0 */
    public final Boolean m23290b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo22835g().m23199v(atomicReference, 15000L, "boolean test flag value", new RunnableC7853w4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    /* renamed from: c0 */
    public final String m23291c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo22835g().m23199v(atomicReference, 15000L, "String test flag value", new RunnableC7692e5(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    /* renamed from: d0 */
    public final Long m23292d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo22835g().m23199v(atomicReference, 15000L, "long test flag value", new RunnableC7710g5(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    /* renamed from: e0 */
    public final Integer m23293e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo22835g().m23199v(atomicReference, 15000L, "int test flag value", new RunnableC7701f5(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    /* renamed from: f0 */
    public final Double m23294f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo22835g().m23199v(atomicReference, 15000L, "double test flag value", new RunnableC7728i5(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    /* renamed from: g0 */
    public final String m23295g0() {
        mo22790b();
        return this.f29325g.get();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    /* renamed from: h0 */
    public final void m23296h0() {
        mo22792d();
        mo22790b();
        m22857x();
        if (this.f28874a.m23241u()) {
            if (mo22841n().m23564B(this.f28874a.m23228T().m23110C(), zzap.f29092F0)) {
                zzx zzxVarMo22841n = mo22841n();
                zzxVarMo22841n.mo22832G();
                Boolean boolM23589u = zzxVarMo22841n.m23589u("google_analytics_deferred_deep_link_enabled");
                if (boolM23589u != null && boolM23589u.booleanValue()) {
                    mo22836h().m23144O().m23147a("Deferred Deep Link feature enabled.");
                    mo22835g().m23201z(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.u4

                        /* renamed from: f */
                        private final zzhc f28933f;

                        {
                            this.f28933f = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws IllegalStateException {
                            zzhc zzhcVar = this.f28933f;
                            zzhcVar.mo22792d();
                            if (zzhcVar.mo22840m().f28848A.m23158b()) {
                                zzhcVar.mo22836h().m23144O().m23147a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jM23155a = zzhcVar.mo22840m().f28849B.m23155a();
                            zzhcVar.mo22840m().f28849B.m23156b(1 + jM23155a);
                            if (jM23155a < 5) {
                                zzhcVar.f28874a.m23242v();
                            } else {
                                zzhcVar.mo22836h().m23140K().m23147a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzhcVar.mo22840m().f28848A.m23157a(true);
                            }
                        }
                    });
                }
            }
            mo22796r().m23373Y();
            this.f29326h = false;
            String strM22824K = mo22840m().m22824K();
            if (TextUtils.isEmpty(strM22824K)) {
                return;
            }
            mo22833e().m22807p();
            if (strM22824K.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strM22824K);
            m23281S("auto", "_ou", bundle);
        }
    }

    /* renamed from: i0 */
    public final String m23297i0() {
        zzig zzigVarM23339M = this.f28874a.m23225Q().m23339M();
        if (zzigVarM23339M != null) {
            return zzigVarM23339M.f29334a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    /* renamed from: j0 */
    public final String m23298j0() {
        zzig zzigVarM23339M = this.f28874a.m23225Q().m23339M();
        if (zzigVarM23339M != null) {
            return zzigVarM23339M.f29335b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    /* renamed from: k0 */
    public final String m23299k0() {
        if (this.f28874a.m23221M() != null) {
            return this.f28874a.m23221M();
        }
        try {
            return GoogleServices.m14021b();
        } catch (IllegalStateException e2) {
            this.f28874a.mo22836h().m23137H().m23148b("getGoogleAppId failed with exception", e2);
            return null;
        }
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

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzb mo22793o() {
        return super.mo22793o();
    }

    /* renamed from: o0 */
    public final void m23300o0(long j2) throws IllegalStateException {
        mo22790b();
        mo22835g().m23201z(new RunnableC7764m5(this, j2));
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzhc mo22794p() {
        return super.mo22794p();
    }

    /* renamed from: p0 */
    public final void m23301p0(Bundle bundle) throws IllegalStateException {
        Preconditions.m14372k(bundle);
        Preconditions.m14368g(bundle.getString(RateAndReviewsFragment.BundleCons.APP_ID));
        mo22789a();
        m23264q0(new Bundle(bundle), mo22837j().mo14608a());
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzeq mo22795q() {
        return super.mo22795q();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzik mo22796r() {
        return super.mo22796r();
    }

    /* renamed from: r0 */
    public final void m23302r0(zzha zzhaVar) {
        mo22790b();
        m22857x();
        Preconditions.m14372k(zzhaVar);
        if (this.f29323e.remove(zzhaVar)) {
            return;
        }
        mo22836h().m23140K().m23147a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ zzif mo22797s() {
        return super.mo22797s();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzep mo22798t() {
        return super.mo22798t();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzjl mo22799u() {
        return super.mo22799u();
    }

    /* renamed from: u0 */
    final void m23303u0(String str, String str2, Bundle bundle) throws IllegalStateException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mo22790b();
        mo22792d();
        m23279P(str, str2, mo22837j().mo14608a(), bundle);
    }

    /* renamed from: w0 */
    public final void m23304w0(boolean z) throws IllegalStateException {
        m22857x();
        mo22790b();
        mo22835g().m23201z(new RunnableC7746k5(this, z));
    }

    /* renamed from: y0 */
    public final void m23305y0(String str, String str2, Bundle bundle) throws IllegalStateException {
        mo22790b();
        m23267v0(null, str, str2, bundle);
    }

    /* renamed from: z0 */
    public final void m23306z0(long j2) throws IllegalStateException {
        m23278O(null);
        mo22835g().m23201z(new RunnableC7871y4(this, j2));
    }
}
