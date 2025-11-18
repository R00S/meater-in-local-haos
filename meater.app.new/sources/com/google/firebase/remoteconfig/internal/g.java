package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    private static final Date f38672h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f38673a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f38674b;

    /* renamed from: c, reason: collision with root package name */
    private Date f38675c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f38676d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f38677e;

    /* renamed from: f, reason: collision with root package name */
    private long f38678f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f38679g;

    /* compiled from: ConfigContainer.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f38680a;

        /* renamed from: b, reason: collision with root package name */
        private Date f38681b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f38682c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f38683d;

        /* renamed from: e, reason: collision with root package name */
        private long f38684e;

        /* renamed from: f, reason: collision with root package name */
        private JSONArray f38685f;

        public g a() {
            return new g(this.f38680a, this.f38681b, this.f38682c, this.f38683d, this.f38684e, this.f38685f);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f38680a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f38682c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f38681b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f38683d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b f(JSONArray jSONArray) {
            try {
                this.f38685f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j10) {
            this.f38684e = j10;
            return this;
        }

        private b() {
            this.f38680a = new JSONObject();
            this.f38681b = g.f38672h;
            this.f38682c = new JSONArray();
            this.f38683d = new JSONObject();
            this.f38684e = 0L;
            this.f38685f = new JSONArray();
        }
    }

    static g b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static g d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f38676d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f38673a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public Set<String> f(g gVar) throws JSONException {
        JSONObject jSONObjectG = d(gVar.f38673a).g();
        Map<String, Map<String, String>> mapC = c();
        Map<String, Map<String, String>> mapC2 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!gVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(gVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !gVar.i().has(next)) || (!i().has(next) && gVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !mapC.get(next).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f38674b;
    }

    public Date h() {
        return this.f38675c;
    }

    public int hashCode() {
        return this.f38673a.hashCode();
    }

    public JSONObject i() {
        return this.f38677e;
    }

    public JSONArray j() {
        return this.f38679g;
    }

    public long k() {
        return this.f38678f;
    }

    public String toString() {
        return this.f38673a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f38674b = jSONObject;
        this.f38675c = date;
        this.f38676d = jSONArray;
        this.f38677e = jSONObject2;
        this.f38678f = j10;
        this.f38679g = jSONArray2;
        this.f38673a = jSONObject3;
    }
}
