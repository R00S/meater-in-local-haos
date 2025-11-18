package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaxc implements zzaxb {

    /* renamed from: b */
    private boolean f22627b;

    /* renamed from: d */
    private zzbbh<?> f22629d;

    /* renamed from: f */
    private SharedPreferences f22631f;

    /* renamed from: g */
    private SharedPreferences.Editor f22632g;

    /* renamed from: j */
    private String f22635j;

    /* renamed from: k */
    private String f22636k;

    /* renamed from: a */
    private final Object f22626a = new Object();

    /* renamed from: c */
    private final List<Runnable> f22628c = new ArrayList();

    /* renamed from: e */
    private zzuu f22630e = null;

    /* renamed from: h */
    private boolean f22633h = false;

    /* renamed from: i */
    private boolean f22634i = true;

    /* renamed from: l */
    private boolean f22637l = false;

    /* renamed from: m */
    private String f22638m = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: n */
    private long f22639n = 0;

    /* renamed from: o */
    private long f22640o = 0;

    /* renamed from: p */
    private long f22641p = 0;

    /* renamed from: q */
    private int f22642q = -1;

    /* renamed from: r */
    private int f22643r = 0;

    /* renamed from: s */
    private Set<String> f22644s = Collections.emptySet();

    /* renamed from: t */
    private JSONObject f22645t = new JSONObject();

    /* renamed from: u */
    private boolean f22646u = true;

    /* renamed from: v */
    private boolean f22647v = true;

    /* renamed from: w */
    private String f22648w = null;

    /* renamed from: C */
    private final void m17113C(Bundle bundle) {
        zzaxg.f22651a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.c5

            /* renamed from: f */
            private final zzaxc f18407f;

            {
                this.f18407f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18407f.mo17101o();
            }
        });
    }

    /* renamed from: E */
    private final void m17114E() throws ExecutionException, InterruptedException, TimeoutException {
        zzbbh<?> zzbbhVar = this.f22629d;
        if (zzbbhVar == null || zzbbhVar.isDone()) {
            return;
        }
        try {
            this.f22629d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            zzbad.m17348d("Interrupted while waiting for preferences loaded.", e2);
        } catch (CancellationException e3) {
            e = e3;
            zzbad.m17347c("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e4) {
            e = e4;
            zzbad.m17347c("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e5) {
            e = e5;
            zzbad.m17347c("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    /* renamed from: F */
    private final Bundle m17115F() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f22626a) {
            bundle.putBoolean("use_https", this.f22634i);
            bundle.putBoolean("content_url_opted_out", this.f22646u);
            bundle.putBoolean("content_vertical_opted_out", this.f22647v);
            bundle.putBoolean("auto_collect_location", this.f22637l);
            bundle.putInt("version_code", this.f22643r);
            bundle.putStringArray("never_pool_slots", (String[]) this.f22644s.toArray(new String[0]));
            bundle.putString("app_settings_json", this.f22638m);
            bundle.putLong("app_settings_last_update_ms", this.f22639n);
            bundle.putLong("app_last_background_time_ms", this.f22640o);
            bundle.putInt("request_in_session_count", this.f22642q);
            bundle.putLong("first_ad_req_time_ms", this.f22641p);
            bundle.putString("native_advanced_settings", this.f22645t.toString());
            bundle.putString("display_cutout", this.f22648w);
            String str = this.f22635j;
            if (str != null) {
                bundle.putString("content_url_hashes", str);
            }
            String str2 = this.f22636k;
            if (str2 != null) {
                bundle.putString("content_vertical_hashes", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: A */
    public final String mo17086A() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        m17114E();
        synchronized (this.f22626a) {
            str = this.f22636k;
        }
        return str;
    }

    /* renamed from: B */
    public final void m17116B(final Context context, String str, boolean z) {
        final String strConcat = str == null ? "admob" : str.length() != 0 ? "admob__".concat(str) : new String("admob__");
        this.f22629d = zzaxg.m17119b(new Runnable(this, context, strConcat) { // from class: com.google.android.gms.internal.ads.b5

            /* renamed from: f */
            private final zzaxc f18245f;

            /* renamed from: g */
            private final Context f18246g;

            /* renamed from: h */
            private final String f18247h;

            {
                this.f18245f = this;
                this.f18246g = context;
                this.f18247h = strConcat;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18245f.m17117D(this.f18246g, this.f18247h);
            }
        });
        this.f22627b = z;
    }

    /* renamed from: D */
    final /* synthetic */ void m17117D(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.f22626a) {
            this.f22631f = sharedPreferences;
            this.f22632g = editorEdit;
            if (PlatformVersion.m14645i() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.f22633h = z;
            this.f22634i = this.f22631f.getBoolean("use_https", this.f22634i);
            this.f22646u = this.f22631f.getBoolean("content_url_opted_out", this.f22646u);
            this.f22635j = this.f22631f.getString("content_url_hashes", this.f22635j);
            this.f22637l = this.f22631f.getBoolean("auto_collect_location", this.f22637l);
            this.f22647v = this.f22631f.getBoolean("content_vertical_opted_out", this.f22647v);
            this.f22636k = this.f22631f.getString("content_vertical_hashes", this.f22636k);
            this.f22643r = this.f22631f.getInt("version_code", this.f22643r);
            this.f22638m = this.f22631f.getString("app_settings_json", this.f22638m);
            this.f22639n = this.f22631f.getLong("app_settings_last_update_ms", this.f22639n);
            this.f22640o = this.f22631f.getLong("app_last_background_time_ms", this.f22640o);
            this.f22642q = this.f22631f.getInt("request_in_session_count", this.f22642q);
            this.f22641p = this.f22631f.getLong("first_ad_req_time_ms", this.f22641p);
            this.f22644s = this.f22631f.getStringSet("never_pool_slots", this.f22644s);
            this.f22648w = this.f22631f.getString("display_cutout", this.f22648w);
            try {
                this.f22645t = new JSONObject(this.f22631f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                zzbad.m17348d("Could not convert native advanced settings to json object", e2);
            }
            m17113C(m17115F());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: a */
    public final JSONObject mo17087a() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        m17114E();
        synchronized (this.f22626a) {
            jSONObject = this.f22645t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: b */
    public final boolean mo17088b() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        m17114E();
        synchronized (this.f22626a) {
            z = this.f22647v;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: c */
    public final void mo17089c(String str) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            long jMo14608a = zzk.zzln().mo14608a();
            this.f22639n = jMo14608a;
            if (str != null && !str.equals(this.f22638m)) {
                this.f22638m = str;
                SharedPreferences.Editor editor = this.f22632g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f22632g.putLong("app_settings_last_update_ms", jMo14608a);
                    this.f22632g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", jMo14608a);
                m17113C(bundle);
                Iterator<Runnable> it = this.f22628c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: d */
    public final long mo17090d() throws ExecutionException, InterruptedException, TimeoutException {
        long j2;
        m17114E();
        synchronized (this.f22626a) {
            j2 = this.f22641p;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: e */
    public final void mo17091e(int i2) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22643r == i2) {
                return;
            }
            this.f22643r = i2;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putInt("version_code", i2);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i2);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: f */
    public final void mo17092f(String str) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (TextUtils.equals(this.f22648w, str)) {
                return;
            }
            this.f22648w = str;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("display_cutout", str);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: g */
    public final String mo17093g() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        m17114E();
        synchronized (this.f22626a) {
            str = this.f22635j;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: h */
    public final void mo17094h(long j2) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22640o == j2) {
                return;
            }
            this.f22640o = j2;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j2);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j2);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: i */
    public final int mo17095i() throws ExecutionException, InterruptedException, TimeoutException {
        int i2;
        m17114E();
        synchronized (this.f22626a) {
            i2 = this.f22642q;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: j */
    public final void mo17096j(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22647v == z) {
                return;
            }
            this.f22647v = z;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.f22646u);
            bundle.putBoolean("content_vertical_opted_out", this.f22647v);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: k */
    public final boolean mo17097k() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        m17114E();
        synchronized (this.f22626a) {
            z = this.f22646u;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: l */
    public final void mo17098l(String str) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (str != null) {
                if (!str.equals(this.f22635j)) {
                    this.f22635j = str;
                    SharedPreferences.Editor editor = this.f22632g;
                    if (editor != null) {
                        editor.putString("content_url_hashes", str);
                        this.f22632g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    m17113C(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: m */
    public final long mo17099m() throws ExecutionException, InterruptedException, TimeoutException {
        long j2;
        m17114E();
        synchronized (this.f22626a) {
            j2 = this.f22640o;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: n */
    public final void mo17100n(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22637l == z) {
                return;
            }
            this.f22637l = z;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putBoolean("auto_collect_location", z);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: o */
    public final zzuu mo17101o() {
        if (!this.f22627b || !PlatformVersion.m14637a()) {
            return null;
        }
        if (mo17097k() && mo17088b()) {
            return null;
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21797h0)).booleanValue()) {
            return null;
        }
        synchronized (this.f22626a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f22630e == null) {
                this.f22630e = new zzuu();
            }
            this.f22630e.m20637e();
            zzbad.m17352h("start fetching content...");
            return this.f22630e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: p */
    public final void mo17102p(String str) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (str != null) {
                if (!str.equals(this.f22636k)) {
                    this.f22636k = str;
                    SharedPreferences.Editor editor = this.f22632g;
                    if (editor != null) {
                        editor.putString("content_vertical_hashes", str);
                        this.f22632g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    m17113C(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: q */
    public final zzawl mo17103q() throws ExecutionException, InterruptedException, TimeoutException {
        zzawl zzawlVar;
        m17114E();
        synchronized (this.f22626a) {
            zzawlVar = new zzawl(this.f22638m, this.f22639n);
        }
        return zzawlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: r */
    public final void mo17104r(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22646u == z) {
                return;
            }
            this.f22646u = z;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.f22646u);
            bundle.putBoolean("content_vertical_opted_out", this.f22647v);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: s */
    public final int mo17105s() throws ExecutionException, InterruptedException, TimeoutException {
        int i2;
        m17114E();
        synchronized (this.f22626a) {
            i2 = this.f22643r;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: t */
    public final String mo17106t() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        m17114E();
        synchronized (this.f22626a) {
            str = this.f22648w;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: u */
    public final void mo17107u(Runnable runnable) {
        this.f22628c.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: v */
    public final void mo17108v(int i2) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22642q == i2) {
                return;
            }
            this.f22642q = i2;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i2);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i2);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: w */
    public final boolean mo17109w() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        m17114E();
        synchronized (this.f22626a) {
            z = this.f22637l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: x */
    public final void mo17110x(long j2) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            if (this.f22641p == j2) {
                return;
            }
            this.f22641p = j2;
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j2);
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j2);
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: y */
    public final void mo17111y() throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            this.f22645t = new JSONObject();
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m17113C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    /* renamed from: z */
    public final void mo17112z(String str, String str2, boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        m17114E();
        synchronized (this.f22626a) {
            JSONArray jSONArrayOptJSONArray = this.f22645t.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (!str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        i2++;
                    } else if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i2;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzk.zzln().mo14608a());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.f22645t.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e2) {
                zzbad.m17348d("Could not update native advanced settings", e2);
            }
            SharedPreferences.Editor editor = this.f22632g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f22645t.toString());
                this.f22632g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f22645t.toString());
            m17113C(bundle);
        }
    }
}
