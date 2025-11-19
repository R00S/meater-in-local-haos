package com.google.firebase.remoteconfig.internal;

import E9.i;
import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigSharedPrefsClient.java */
/* loaded from: classes2.dex */
public class t {

    /* renamed from: f, reason: collision with root package name */
    static final Date f38763f = new Date(-1);

    /* renamed from: g, reason: collision with root package name */
    static final Date f38764g = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f38765a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38766b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f38767c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f38768d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f38769e = new Object();

    /* compiled from: ConfigSharedPrefsClient.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f38770a;

        /* renamed from: b, reason: collision with root package name */
        private Date f38771b;

        a(int i10, Date date) {
            this.f38770a = i10;
            this.f38771b = date;
        }

        Date a() {
            return this.f38771b;
        }

        int b() {
            return this.f38770a;
        }
    }

    /* compiled from: ConfigSharedPrefsClient.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f38772a;

        /* renamed from: b, reason: collision with root package name */
        private Date f38773b;

        public b(int i10, Date date) {
            this.f38772a = i10;
            this.f38773b = date;
        }

        Date a() {
            return this.f38773b;
        }

        int b() {
            return this.f38772a;
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f38765a = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.f38767c) {
            aVar = new a(this.f38765a.getInt("num_failed_fetches", 0), new Date(this.f38765a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map<String, String> b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f38765a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.f38765a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public E9.h d() {
        v vVarA;
        synchronized (this.f38766b) {
            long j10 = this.f38765a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f38765a.getInt("last_fetch_status", 0);
            vVarA = v.b().c(i10).d(j10).b(new i.b().d(this.f38765a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f38765a.getLong("minimum_fetch_interval_in_seconds", m.f38699j)).c()).a();
        }
        return vVarA;
    }

    String e() {
        return this.f38765a.getString("last_fetch_etag", null);
    }

    Date f() {
        return new Date(this.f38765a.getLong("last_fetch_time_in_millis", -1L));
    }

    long g() {
        return this.f38765a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.f38765a.getLong("minimum_fetch_interval_in_seconds", m.f38699j);
    }

    public b i() {
        b bVar;
        synchronized (this.f38768d) {
            bVar = new b(this.f38765a.getInt("num_failed_realtime_streams", 0), new Date(this.f38765a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void j() {
        l(0, f38764g);
    }

    void k() {
        o(0, f38764g);
    }

    void l(int i10, Date date) {
        synchronized (this.f38767c) {
            this.f38765a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void m(String str) {
        synchronized (this.f38766b) {
            this.f38765a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void n(long j10) {
        synchronized (this.f38766b) {
            this.f38765a.edit().putLong("last_template_version", j10).apply();
        }
    }

    void o(int i10, Date date) {
        synchronized (this.f38768d) {
            this.f38765a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void p() {
        synchronized (this.f38766b) {
            this.f38765a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void q(Date date) {
        synchronized (this.f38766b) {
            this.f38765a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void r() {
        synchronized (this.f38766b) {
            this.f38765a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
