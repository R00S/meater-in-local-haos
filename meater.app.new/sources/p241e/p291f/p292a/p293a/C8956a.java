package p241e.p291f.p292a.p293a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Indicative.java */
/* renamed from: e.f.a.a.a */
/* loaded from: classes.dex */
public class C8956a {

    /* renamed from: a */
    private static C8956a f34474a;

    /* renamed from: b */
    private Context f34475b;

    /* renamed from: c */
    private String f34476c;

    /* compiled from: Indicative.java */
    /* renamed from: e.f.a.a.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private String f34477a;

        /* renamed from: b */
        private String f34478b;

        /* renamed from: c */
        private long f34479c = System.currentTimeMillis();

        /* renamed from: d */
        private String f34480d;

        /* renamed from: e */
        private Map<String, Object> f34481e;

        public a(String str, String str2, String str3, Map<String, Object> map) {
            this.f34477a = str;
            this.f34478b = str2;
            this.f34480d = str3;
            this.f34481e = map;
        }

        /* renamed from: a */
        public JSONObject m28551a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("apiKey", this.f34477a);
                jSONObject.put("eventName", this.f34478b);
                jSONObject.put("eventTime", this.f34479c);
                jSONObject.put("eventUniqueId", this.f34480d);
                Map<String, Object> map = this.f34481e;
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Object> entry : this.f34481e.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("properties", jSONObject2);
                }
            } catch (JSONException e2) {
                Log.v("Indicative", "Event" + e2.getMessage(), e2.fillInStackTrace());
            }
            return jSONObject;
        }
    }

    /* compiled from: Indicative.java */
    /* renamed from: e.f.a.a.a$b */
    /* loaded from: classes2.dex */
    public class b extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private Context f34482a;

        /* renamed from: b */
        private String f34483b;

        public b(Context context, String str) {
            this.f34482a = context;
            this.f34483b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                BasicHttpParams basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
                HttpPost httpPost = new HttpPost("https://api.indicative.com/service/event");
                httpPost.setHeader("Content-Type", "application/json");
                httpPost.addHeader("Indicative-Client", "Android");
                httpPost.setEntity(new StringEntity(this.f34483b, "UTF-8"));
                return Integer.valueOf(defaultHttpClient.execute(httpPost).getStatusLine().getStatusCode());
            } catch (Exception e2) {
                Log.v("Indicative", "AsyncTask: " + e2.getMessage(), e2);
                return 400;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0 || num.intValue() == 408 || num.intValue() == 500) {
                C8956a.m28529b(this.f34483b);
            }
        }
    }

    /* compiled from: Indicative.java */
    /* renamed from: e.f.a.a.a$c */
    /* loaded from: classes2.dex */
    public class c extends Thread {

        /* renamed from: f */
        private Context f34485f;

        /* renamed from: g */
        private Handler f34486g;

        c(Context context, Handler handler) {
            this.f34485f = context;
            this.f34486g = handler;
            setName("SendEventsTimer");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C8956a.this.m28550s(this.f34485f);
            this.f34486g.postDelayed(this, 60000L);
        }
    }

    private C8956a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m28529b(String str) {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not recording event");
            return;
        }
        SharedPreferences sharedPreferences = m28538k().f34475b.getSharedPreferences("indicative_events", 0);
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).commit();
    }

    /* renamed from: c */
    public static void m28530c(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Boolean) {
                m28533f(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            } else if (entry.getValue() instanceof String) {
                m28532e(entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue() instanceof Integer) {
                m28531d(entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
        }
    }

    /* renamed from: d */
    public static void m28531d(String str, int i2) {
        m28534g(str, i2);
    }

    /* renamed from: e */
    public static void m28532e(String str, String str2) {
        m28535h(str, str2);
    }

    /* renamed from: f */
    public static void m28533f(String str, boolean z) {
        m28536i(str, z);
    }

    /* renamed from: g */
    private static synchronized void m28534g(String str, int i2) {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
        } else {
            m28538k().f34475b.getSharedPreferences("indicative_prop_cache", 0).edit().putInt(str, i2).commit();
        }
    }

    /* renamed from: h */
    private static synchronized void m28535h(String str, String str2) {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
        } else {
            m28538k().f34475b.getSharedPreferences("indicative_prop_cache", 0).edit().putString(str, str2).commit();
        }
    }

    /* renamed from: i */
    private static synchronized void m28536i(String str, boolean z) {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
        } else {
            m28538k().f34475b.getSharedPreferences("indicative_prop_cache", 0).edit().putBoolean(str, z).commit();
        }
    }

    /* renamed from: j */
    private static synchronized Map<String, Object> m28537j() {
        if (m28538k().f34475b != null) {
            return m28538k().f34475b.getSharedPreferences("indicative_prop_cache", 0).getAll();
        }
        Log.v("Indicative", "Indicative instance has not been initialized; not getting common props");
        return new HashMap();
    }

    /* renamed from: k */
    public static C8956a m28538k() {
        if (f34474a == null) {
            f34474a = new C8956a();
        }
        return f34474a;
    }

    /* renamed from: l */
    private static synchronized String m28539l() {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not setting up unique id");
            return null;
        }
        SharedPreferences sharedPreferences = m28538k().f34475b.getSharedPreferences("indicative_unique", 0);
        String string = sharedPreferences.getString("indicative_unique", null);
        if (string == null || string.isEmpty()) {
            string = sharedPreferences.getString("uuid", null);
        }
        return string;
    }

    /* renamed from: m */
    public static C8956a m28540m(Context context, String str) {
        C8956a c8956aM28538k = m28538k();
        c8956aM28538k.f34476c = str;
        c8956aM28538k.f34475b = context;
        m28546u();
        c8956aM28538k.m28549r();
        return c8956aM28538k;
    }

    /* renamed from: n */
    public static void m28541n(String str) {
        m28542o(str, null, null);
    }

    /* renamed from: o */
    public static void m28542o(String str, String str2, Map<String, Object> map) {
        m28543p(str, str2, map, false);
    }

    /* renamed from: p */
    public static void m28543p(String str, String str2, Map<String, Object> map, boolean z) {
        Map<String, Object> mapM28537j = m28537j();
        if (map != null) {
            mapM28537j.putAll(map);
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = m28539l();
        }
        String string = new a(m28538k().f34476c, str, str2, mapM28537j).m28551a().toString();
        if (z) {
            m28538k().m28545t(string);
        } else {
            m28529b(string);
        }
    }

    /* renamed from: q */
    public static void m28544q(String str, Map<String, Object> map) {
        m28542o(str, null, map);
    }

    /* renamed from: t */
    private void m28545t(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        new b(m28538k().f34475b, str).execute(new Void[0]);
    }

    /* renamed from: u */
    private static synchronized void m28546u() {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not setting up unique id");
            return;
        }
        SharedPreferences sharedPreferences = m28538k().f34475b.getSharedPreferences("indicative_unique", 0);
        if (sharedPreferences.getString("uuid", null) == null) {
            sharedPreferences.edit().putString("uuid", UUID.randomUUID().toString()).commit();
        }
    }

    /* renamed from: v */
    public static void m28547v(String str) {
        m28548w(str);
    }

    /* renamed from: w */
    private static synchronized void m28548w(String str) {
        if (m28538k().f34475b == null) {
            Log.v("Indicative", "Indicative instance has not been initialized; not setting up unique id");
        } else {
            m28538k().f34475b.getSharedPreferences("indicative_unique", 0).edit().putString("indicative_unique", str).commit();
        }
    }

    /* renamed from: r */
    public void m28549r() {
        Handler handler = new Handler();
        handler.post(new c(this.f34475b, handler));
    }

    /* renamed from: s */
    public synchronized void m28550s(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("indicative_events", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            for (String str : all.keySet()) {
                for (int i2 = 0; i2 < ((Integer) all.get(str)).intValue(); i2++) {
                    new b(context, str).execute(new Void[0]);
                    int i3 = sharedPreferences.getInt(str, 0);
                    if (i3 > 1) {
                        sharedPreferences.edit().putInt(str, i3 - 1).commit();
                    } else {
                        sharedPreferences.edit().remove(str).commit();
                    }
                }
            }
        }
    }
}
