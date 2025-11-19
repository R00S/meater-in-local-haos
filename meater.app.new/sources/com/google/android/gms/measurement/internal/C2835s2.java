package com.google.android.gms.measurement.internal;

import Y6.a;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C2823q3;
import g7.C3445p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2835s2 extends AbstractC2816p3 {

    /* renamed from: B, reason: collision with root package name */
    static final Pair<String, Long> f35595B = new Pair<>("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final C2849u2 f35596A;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f35597c;

    /* renamed from: d, reason: collision with root package name */
    private Object f35598d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f35599e;

    /* renamed from: f, reason: collision with root package name */
    public C2863w2 f35600f;

    /* renamed from: g, reason: collision with root package name */
    public final C2870x2 f35601g;

    /* renamed from: h, reason: collision with root package name */
    public final C2870x2 f35602h;

    /* renamed from: i, reason: collision with root package name */
    public final C2877y2 f35603i;

    /* renamed from: j, reason: collision with root package name */
    private String f35604j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35605k;

    /* renamed from: l, reason: collision with root package name */
    private long f35606l;

    /* renamed from: m, reason: collision with root package name */
    public final C2870x2 f35607m;

    /* renamed from: n, reason: collision with root package name */
    public final C2856v2 f35608n;

    /* renamed from: o, reason: collision with root package name */
    public final C2877y2 f35609o;

    /* renamed from: p, reason: collision with root package name */
    public final C2849u2 f35610p;

    /* renamed from: q, reason: collision with root package name */
    public final C2856v2 f35611q;

    /* renamed from: r, reason: collision with root package name */
    public final C2870x2 f35612r;

    /* renamed from: s, reason: collision with root package name */
    public final C2870x2 f35613s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35614t;

    /* renamed from: u, reason: collision with root package name */
    public C2856v2 f35615u;

    /* renamed from: v, reason: collision with root package name */
    public C2856v2 f35616v;

    /* renamed from: w, reason: collision with root package name */
    public C2870x2 f35617w;

    /* renamed from: x, reason: collision with root package name */
    public final C2877y2 f35618x;

    /* renamed from: y, reason: collision with root package name */
    public final C2877y2 f35619y;

    /* renamed from: z, reason: collision with root package name */
    public final C2870x2 f35620z;

    C2835s2(P2 p22) {
        super(p22);
        this.f35598d = new Object();
        this.f35607m = new C2870x2(this, "session_timeout", 1800000L);
        this.f35608n = new C2856v2(this, "start_new_session", true);
        this.f35612r = new C2870x2(this, "last_pause_time", 0L);
        this.f35613s = new C2870x2(this, "session_id", 0L);
        this.f35609o = new C2877y2(this, "non_personalized_ads", null);
        this.f35610p = new C2849u2(this, "last_received_uri_timestamps_by_source", null);
        this.f35611q = new C2856v2(this, "allow_remote_dynamite", false);
        this.f35601g = new C2870x2(this, "first_open_time", 0L);
        this.f35602h = new C2870x2(this, "app_install_time", 0L);
        this.f35603i = new C2877y2(this, "app_instance_id", null);
        this.f35615u = new C2856v2(this, "app_backgrounded", false);
        this.f35616v = new C2856v2(this, "deep_link_retrieval_complete", false);
        this.f35617w = new C2870x2(this, "deep_link_retrieval_attempts", 0L);
        this.f35618x = new C2877y2(this, "firebase_feature_rollouts", null);
        this.f35619y = new C2877y2(this, "deferred_attribution_cache", null);
        this.f35620z = new C2870x2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f35596A = new C2849u2(this, "default_event_parameters", null);
    }

    final boolean A(C c10) {
        n();
        if (!C2823q3.l(c10.a(), M().a())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putString("dma_consent_settings", c10.j());
        editorEdit.apply();
        return true;
    }

    final boolean B(C2823q3 c2823q3) {
        n();
        int iB = c2823q3.b();
        if (!y(iB)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putString("consent_settings", c2823q3.v());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        return true;
    }

    protected final boolean C(C2783k5 c2783k5) {
        n();
        String string = K().getString("stored_tcf_param", "");
        String strG = c2783k5.g();
        if (strG.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putString("stored_tcf_param", strG);
        editorEdit.apply();
        return true;
    }

    final void D() {
        n();
        Boolean boolQ = Q();
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolQ != null) {
            w(boolQ);
        }
    }

    final boolean E() {
        SharedPreferences sharedPreferences = this.f35597c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void F(Boolean bool) {
        n();
        SharedPreferences.Editor editorEdit = K().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    final void G(String str) {
        n();
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void H(boolean z10) {
        n();
        k().L().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    protected final SharedPreferences I() {
        n();
        q();
        if (this.f35599e == null) {
            synchronized (this.f35598d) {
                try {
                    if (this.f35599e == null) {
                        String str = a().getPackageName() + "_preferences";
                        k().L().b("Default prefs file", str);
                        this.f35599e = a().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f35599e;
    }

    final void J(String str) {
        n();
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    protected final SharedPreferences K() {
        n();
        q();
        C3445p.k(this.f35597c);
        return this.f35597c;
    }

    final SparseArray<Long> L() {
        Bundle bundleA = this.f35610p.a();
        if (bundleA == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            k().H().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final C M() {
        n();
        return C.c(K().getString("dma_consent_settings", null));
    }

    final C2823q3 N() {
        n();
        return C2823q3.e(K().getString("consent_settings", "G1"), K().getInt("consent_source", 100));
    }

    final Boolean O() {
        n();
        if (K().contains("use_service")) {
            return Boolean.valueOf(K().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean P() {
        n();
        if (K().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(K().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean Q() {
        n();
        if (K().contains("measurement_enabled")) {
            return Boolean.valueOf(K().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String R() {
        n();
        String string = K().getString("previous_os_version", null);
        e().q();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = K().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final String S() {
        n();
        return K().getString("admob_app_id", null);
    }

    final String T() {
        n();
        return K().getString("gmp_app_id", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2816p3
    protected final void p() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f35597c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f35614t = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f35597c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f35600f = new C2863w2(this, "health_monitor", Math.max(0L, K.f34968d.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2816p3
    protected final boolean u() {
        return true;
    }

    final Pair<String, Boolean> v(String str) {
        n();
        if (!N().m(C2823q3.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long jC = b().c();
        if (this.f35604j != null && jC < this.f35606l) {
            return new Pair<>(this.f35604j, Boolean.valueOf(this.f35605k));
        }
        this.f35606l = jC + c().F(str);
        Y6.a.b(true);
        try {
            a.C0284a c0284aA = Y6.a.a(a());
            this.f35604j = "";
            String strA = c0284aA.a();
            if (strA != null) {
                this.f35604j = strA;
            }
            this.f35605k = c0284aA.b();
        } catch (Exception e10) {
            k().G().b("Unable to get advertising id", e10);
            this.f35604j = "";
        }
        Y6.a.b(false);
        return new Pair<>(this.f35604j, Boolean.valueOf(this.f35605k));
    }

    final void w(Boolean bool) {
        n();
        SharedPreferences.Editor editorEdit = K().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void x(boolean z10) {
        n();
        SharedPreferences.Editor editorEdit = K().edit();
        editorEdit.putBoolean("use_service", z10);
        editorEdit.apply();
    }

    final boolean y(int i10) {
        return C2823q3.l(i10, K().getInt("consent_source", 100));
    }

    final boolean z(long j10) {
        return j10 - this.f35607m.a() > this.f35612r.a();
    }
}
