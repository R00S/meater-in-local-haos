package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.p092pt.BuildConfig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* loaded from: classes2.dex */
final class C7807r3 extends AbstractC7799q4 {

    /* renamed from: c */
    @VisibleForTesting
    static final Pair<String, Long> f28847c = new Pair<>(HttpUrl.FRAGMENT_ENCODE_SET, 0L);

    /* renamed from: A */
    public zzfi f28848A;

    /* renamed from: B */
    public zzfh f28849B;

    /* renamed from: C */
    public final zzfj f28850C;

    /* renamed from: d */
    private SharedPreferences f28851d;

    /* renamed from: e */
    public zzfk f28852e;

    /* renamed from: f */
    public final zzfh f28853f;

    /* renamed from: g */
    public final zzfh f28854g;

    /* renamed from: h */
    public final zzfh f28855h;

    /* renamed from: i */
    public final zzfh f28856i;

    /* renamed from: j */
    public final zzfh f28857j;

    /* renamed from: k */
    public final zzfh f28858k;

    /* renamed from: l */
    public final zzfh f28859l;

    /* renamed from: m */
    public final zzfj f28860m;

    /* renamed from: n */
    private String f28861n;

    /* renamed from: o */
    private boolean f28862o;

    /* renamed from: p */
    private long f28863p;

    /* renamed from: q */
    public final zzfh f28864q;

    /* renamed from: r */
    public final zzfh f28865r;

    /* renamed from: s */
    public final zzfi f28866s;

    /* renamed from: t */
    public final zzfj f28867t;

    /* renamed from: u */
    public final zzfi f28868u;

    /* renamed from: v */
    public final zzfi f28869v;

    /* renamed from: w */
    public final zzfh f28870w;

    /* renamed from: x */
    public final zzfh f28871x;

    /* renamed from: y */
    public boolean f28872y;

    /* renamed from: z */
    public zzfi f28873z;

    C7807r3(zzfx zzfxVar) {
        super(zzfxVar);
        this.f28853f = new zzfh(this, "last_upload", 0L);
        this.f28854g = new zzfh(this, "last_upload_attempt", 0L);
        this.f28855h = new zzfh(this, "backoff", 0L);
        this.f28856i = new zzfh(this, "last_delete_stale", 0L);
        this.f28864q = new zzfh(this, "time_before_start", 10000L);
        this.f28865r = new zzfh(this, "session_timeout", BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS);
        this.f28866s = new zzfi(this, "start_new_session", true);
        this.f28870w = new zzfh(this, "last_pause_time", 0L);
        this.f28871x = new zzfh(this, "time_active", 0L);
        this.f28867t = new zzfj(this, "non_personalized_ads", null);
        this.f28868u = new zzfi(this, "use_dynamite_api", false);
        this.f28869v = new zzfi(this, "allow_remote_dynamite", false);
        this.f28857j = new zzfh(this, "midnight_offset", 0L);
        this.f28858k = new zzfh(this, "first_open_time", 0L);
        this.f28859l = new zzfh(this, "app_install_time", 0L);
        this.f28860m = new zzfj(this, "app_instance_id", null);
        this.f28873z = new zzfi(this, "app_backgrounded", false);
        this.f28848A = new zzfi(this, "deep_link_retrieval_complete", false);
        this.f28849B = new zzfh(this, "deep_link_retrieval_attempts", 0L);
        this.f28850C = new zzfj(this, "firebase_feature_rollouts", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final SharedPreferences m22813N() {
        mo22792d();
        m22807p();
        return this.f28851d;
    }

    /* renamed from: A */
    final void m22815A(String str) {
        mo22792d();
        SharedPreferences.Editor editorEdit = m22813N().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    /* renamed from: B */
    final boolean m22816B(boolean z) {
        mo22792d();
        return m22813N().getBoolean("measurement_enabled", z);
    }

    /* renamed from: C */
    final void m22817C(String str) {
        mo22792d();
        SharedPreferences.Editor editorEdit = m22813N().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    /* renamed from: D */
    final void m22818D(boolean z) {
        mo22792d();
        mo22836h().m23145P().m23148b("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m22813N().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* renamed from: E */
    final String m22819E() {
        mo22792d();
        return m22813N().getString("gmp_app_id", null);
    }

    /* renamed from: F */
    final String m22820F() {
        mo22792d();
        return m22813N().getString("admob_app_id", null);
    }

    /* renamed from: H */
    final Boolean m22821H() {
        mo22792d();
        if (m22813N().contains("use_service")) {
            return Boolean.valueOf(m22813N().getBoolean("use_service", false));
        }
        return null;
    }

    /* renamed from: I */
    final void m22822I() {
        mo22792d();
        mo22836h().m23145P().m23147a("Clearing collection preferences.");
        if (mo22841n().m23587r(zzap.f29156m0)) {
            Boolean boolM22823J = m22823J();
            SharedPreferences.Editor editorEdit = m22813N().edit();
            editorEdit.clear();
            editorEdit.apply();
            if (boolM22823J != null) {
                m22831z(boolM22823J.booleanValue());
                return;
            }
            return;
        }
        boolean zContains = m22813N().contains("measurement_enabled");
        boolean zM22816B = zContains ? m22816B(true) : true;
        SharedPreferences.Editor editorEdit2 = m22813N().edit();
        editorEdit2.clear();
        editorEdit2.apply();
        if (zContains) {
            m22831z(zM22816B);
        }
    }

    /* renamed from: J */
    final Boolean m22823J() {
        mo22792d();
        if (m22813N().contains("measurement_enabled")) {
            return Boolean.valueOf(m22813N().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: K */
    protected final String m22824K() {
        mo22792d();
        String string = m22813N().getString("previous_os_version", null);
        mo22833e().m22807p();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = m22813N().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    /* renamed from: L */
    final boolean m22825L() {
        mo22792d();
        return m22813N().getBoolean("deferred_analytics_collection", false);
    }

    /* renamed from: M */
    final boolean m22826M() {
        return this.f28851d.contains("deferred_analytics_collection");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: o */
    protected final void mo22806o() {
        SharedPreferences sharedPreferences = mo22834f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f28851d = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f28872y = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f28851d.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f28852e = new zzfk(this, "health_monitor", Math.max(0L, zzap.f29149j.m23095a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: s */
    protected final boolean mo22810s() {
        return true;
    }

    /* renamed from: v */
    final Pair<String, Boolean> m22827v(String str) {
        mo22792d();
        long jMo14609b = mo22837j().mo14609b();
        if (this.f28861n != null && jMo14609b < this.f28863p) {
            return new Pair<>(this.f28861n, Boolean.valueOf(this.f28862o));
        }
        this.f28863p = jMo14609b + mo22841n().m23585p(str, zzap.f29147i);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo22834f());
            if (advertisingIdInfo != null) {
                this.f28861n = advertisingIdInfo.getId();
                this.f28862o = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f28861n == null) {
                this.f28861n = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } catch (Exception e2) {
            mo22836h().m23144O().m23148b("Unable to get advertising id", e2);
            this.f28861n = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f28861n, Boolean.valueOf(this.f28862o));
    }

    /* renamed from: w */
    final void m22828w(boolean z) {
        mo22792d();
        mo22836h().m23145P().m23148b("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m22813N().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    /* renamed from: x */
    final boolean m22829x(long j2) {
        return j2 - this.f28865r.m23155a() > this.f28870w.m23155a();
    }

    /* renamed from: y */
    final String m22830y(String str) {
        mo22792d();
        String str2 = (String) m22827v(str).first;
        MessageDigest messageDigestM23495A0 = zzkk.m23495A0();
        if (messageDigestM23495A0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM23495A0.digest(str2.getBytes())));
    }

    /* renamed from: z */
    final void m22831z(boolean z) {
        mo22792d();
        mo22836h().m23145P().m23148b("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m22813N().edit();
        editorEdit.putBoolean("measurement_enabled", z);
        editorEdit.apply();
    }
}
