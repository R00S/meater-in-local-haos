package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import okhttp3.HttpUrl;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzif extends AbstractC7833u2 {

    /* renamed from: c */
    @VisibleForTesting
    protected zzig f29328c;

    /* renamed from: d */
    private volatile zzig f29329d;

    /* renamed from: e */
    private zzig f29330e;

    /* renamed from: f */
    private final Map<Activity, zzig> f29331f;

    /* renamed from: g */
    private zzig f29332g;

    /* renamed from: h */
    private String f29333h;

    public zzif(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29331f = new C0867a();
    }

    @VisibleForTesting
    /* renamed from: B */
    private static String m23328B(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : HttpUrl.FRAGMENT_ENCODE_SET;
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: E */
    private final void m23329E(Activity activity, zzig zzigVar, boolean z) throws IllegalStateException {
        zzig zzigVar2 = this.f29329d == null ? this.f29330e : this.f29329d;
        if (zzigVar.f29335b == null) {
            zzigVar = new zzig(zzigVar.f29334a, m23328B(activity.getClass().getCanonicalName()), zzigVar.f29336c);
        }
        this.f29330e = this.f29329d;
        this.f29329d = zzigVar;
        mo22835g().m23201z(new RunnableC7836u5(this, z, zzigVar2, zzigVar));
    }

    /* renamed from: I */
    public static void m23331I(zzig zzigVar, Bundle bundle, boolean z) {
        if (bundle != null && zzigVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = zzigVar.f29334a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzigVar.f29335b);
            bundle.putLong("_si", zzigVar.f29336c);
            return;
        }
        if (bundle != null && zzigVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m23332J(zzig zzigVar, boolean z) {
        mo22793o().m23077v(mo22837j().mo14609b());
        if (mo22799u().m23399E(zzigVar.f29337d, z)) {
            zzigVar.f29337d = false;
        }
    }

    /* renamed from: Q */
    private final zzig m23333Q(Activity activity) {
        Preconditions.m14372k(activity);
        zzig zzigVar = this.f29331f.get(activity);
        if (zzigVar != null) {
            return zzigVar;
        }
        zzig zzigVar2 = new zzig(null, m23328B(activity.getClass().getCanonicalName()), mo22839l().m23552w0());
        this.f29331f.put(activity, zzigVar2);
        return zzigVar2;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7833u2
    /* renamed from: A */
    protected final boolean mo22854A() {
        return false;
    }

    /* renamed from: C */
    public final void m23334C(Activity activity) throws IllegalStateException {
        m23329E(activity, m23333Q(activity), false);
        zzb zzbVarMo22793o = mo22793o();
        zzbVarMo22793o.mo22835g().m23201z(new RunnableC7813s0(zzbVarMo22793o, zzbVarMo22793o.mo22837j().mo14609b()));
    }

    /* renamed from: D */
    public final void m23335D(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f29331f.put(activity, new zzig(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)));
    }

    /* renamed from: F */
    public final void m23336F(Activity activity, String str, String str2) throws IllegalStateException {
        if (this.f29329d == null) {
            mo22836h().m23142M().m23147a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f29331f.get(activity) == null) {
            mo22836h().m23142M().m23147a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m23328B(activity.getClass().getCanonicalName());
        }
        boolean zEquals = this.f29329d.f29335b.equals(str2);
        boolean zM23514t0 = zzkk.m23514t0(this.f29329d.f29334a, str);
        if (zEquals && zM23514t0) {
            mo22836h().m23142M().m23147a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            mo22836h().m23142M().m23148b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            mo22836h().m23142M().m23148b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        mo22836h().m23145P().m23149c("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzig zzigVar = new zzig(str, str2, mo22839l().m23552w0());
        this.f29331f.put(activity, zzigVar);
        m23329E(activity, zzigVar, true);
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: K */
    public final void m23337K(String str, zzig zzigVar) {
        mo22792d();
        synchronized (this) {
            String str2 = this.f29333h;
            if (str2 == null || str2.equals(str) || zzigVar != null) {
                this.f29333h = str;
                this.f29332g = zzigVar;
            }
        }
    }

    /* renamed from: L */
    public final zzig m23338L() {
        m22857x();
        mo22792d();
        return this.f29328c;
    }

    /* renamed from: M */
    public final zzig m23339M() {
        mo22790b();
        return this.f29329d;
    }

    /* renamed from: N */
    public final void m23340N(Activity activity) throws IllegalStateException {
        zzig zzigVarM23333Q = m23333Q(activity);
        this.f29330e = this.f29329d;
        this.f29329d = null;
        mo22835g().m23201z(new RunnableC7827t5(this, zzigVarM23333Q));
    }

    /* renamed from: O */
    public final void m23341O(Activity activity, Bundle bundle) {
        zzig zzigVar;
        if (bundle == null || (zzigVar = this.f29331f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, zzigVar.f29336c);
        bundle2.putString("name", zzigVar.f29334a);
        bundle2.putString("referrer_name", zzigVar.f29335b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: P */
    public final void m23342P(Activity activity) {
        this.f29331f.remove(activity);
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
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

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzb mo22793o() {
        return super.mo22793o();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzhc mo22794p() {
        return super.mo22794p();
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
}
