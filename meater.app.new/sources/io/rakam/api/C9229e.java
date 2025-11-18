package io.rakam.api;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Diagnostics.java */
/* renamed from: io.rakam.api.e */
/* loaded from: classes2.dex */
public class C9229e {

    /* renamed from: a */
    private static final C9232h f35639a = C9232h.m29964d();

    /* renamed from: b */
    protected static C9229e f35640b;

    /* renamed from: d */
    private volatile String f35642d;

    /* renamed from: e */
    private volatile OkHttpClient f35643e;

    /* renamed from: f */
    private volatile String f35644f;

    /* renamed from: i */
    HandlerThreadC9235k f35647i = new HandlerThreadC9235k("diagnosticThread");

    /* renamed from: c */
    volatile boolean f35641c = false;

    /* renamed from: g */
    int f35645g = 50;

    /* renamed from: h */
    String f35646h = "https://diagnostics.rakam.io/event/batch";

    /* renamed from: j */
    List<String> f35648j = new ArrayList(this.f35645g);

    /* renamed from: k */
    Map<String, JSONObject> f35649k = new HashMap(this.f35645g);

    /* compiled from: Diagnostics.java */
    /* renamed from: io.rakam.api.e$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f35650f;

        /* renamed from: g */
        final /* synthetic */ Throwable f35651g;

        a(String str, Throwable th) {
            this.f35650f = str;
            this.f35651g = th;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            JSONObject jSONObject = C9229e.this.f35649k.get(this.f35650f);
            try {
                if (jSONObject != null) {
                    jSONObject.put("count", jSONObject.optInt("count", 0) + 1);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error", C9231g.m29912i0(this.f35650f));
                jSONObject2.put("timestamp", System.currentTimeMillis());
                jSONObject2.put("device_id", C9229e.this.f35644f);
                jSONObject2.put("count", 1);
                Throwable th = this.f35651g;
                if (th != null) {
                    String stackTraceString = Log.getStackTraceString(th);
                    if (!C9234j.m29988d(stackTraceString)) {
                        jSONObject2.put("stack_trace", C9231g.m29912i0(stackTraceString));
                    }
                }
                if (C9229e.this.f35648j.size() >= C9229e.this.f35645g) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        C9229e.this.f35649k.remove(C9229e.this.f35648j.remove(0));
                    }
                }
                C9229e.this.f35649k.put(this.f35650f, jSONObject2);
                C9229e.this.f35648j.add(this.f35650f);
            } catch (JSONException unused) {
            }
        }
    }

    /* compiled from: Diagnostics.java */
    /* renamed from: io.rakam.api.e$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9229e.this.f35648j.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(C9229e.this.f35648j.size());
            Iterator<String> it = C9229e.this.f35648j.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new JSONObject().put("properties", C9229e.this.f35649k.get(it.next())).put("collection", "android_sdk_error"));
                } catch (JSONException e2) {
                    C9229e.f35639a.m29966b("RakamDiagnostics", "Unable to serialize events: " + e2.getMessage());
                }
            }
            if (new JSONArray((Collection) arrayList).length() > 0) {
                C9229e.this.m29889h(new JSONArray((Collection) arrayList));
            }
        }
    }

    private C9229e() {
        this.f35647i.start();
    }

    /* renamed from: e */
    static synchronized C9229e m29884e() {
        if (f35640b == null) {
            f35640b = new C9229e();
        }
        return f35640b;
    }

    /* renamed from: c */
    C9229e m29885c(OkHttpClient okHttpClient, String str, String str2) {
        this.f35641c = true;
        this.f35642d = str;
        this.f35643e = okHttpClient;
        this.f35644f = str2;
        return this;
    }

    /* renamed from: d */
    C9229e m29886d() {
        if (this.f35641c && !C9234j.m29988d(this.f35642d) && this.f35643e != null && !C9234j.m29988d(this.f35644f)) {
            m29890i(new b());
        }
        return this;
    }

    /* renamed from: f */
    C9229e m29887f(String str) {
        return m29888g(str, null);
    }

    /* renamed from: g */
    C9229e m29888g(String str, Throwable th) {
        if (this.f35641c && !C9234j.m29988d(str) && !C9234j.m29988d(this.f35644f)) {
            m29890i(new a(str, th));
        }
        return this;
    }

    /* renamed from: h */
    protected void m29889h(JSONArray jSONArray) {
        try {
            try {
                if (this.f35643e.newCall(new Request.Builder().url(this.f35646h).post(RequestBody.create(C9231g.f35655a, new JSONObject().put("api", new JSONObject().put("api_key", this.f35642d).put("library", new JSONObject().put("name", "rakam-android").put("version", "2.7.14")).put("upload_time", System.currentTimeMillis())).put("events", jSONArray).toString())).build()).execute().body().string().equals("1")) {
                    this.f35649k.clear();
                    this.f35648j.clear();
                }
            } catch (IOException | AssertionError | Exception unused) {
            }
        } catch (JSONException e2) {
            f35639a.m29966b("RakamDiagnostics", String.format("Failed to convert revenue object to JSON: %s", e2.toString()));
        }
    }

    /* renamed from: i */
    protected void m29890i(Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        HandlerThreadC9235k handlerThreadC9235k = this.f35647i;
        if (threadCurrentThread != handlerThreadC9235k) {
            handlerThreadC9235k.m29992a(runnable);
        } else {
            runnable.run();
        }
    }
}
