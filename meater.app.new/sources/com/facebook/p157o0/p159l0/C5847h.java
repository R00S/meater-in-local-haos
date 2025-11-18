package com.facebook.p157o0.p159l0;

import com.facebook.EnumC5659g0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p159l0.C5847h;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.C10775u;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9800l0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.p429io.C10556a;
import kotlin.ranges.IntRange;
import kotlin.text.C10547v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* renamed from: com.facebook.o0.l0.h */
/* loaded from: classes.dex */
public final class C5847h {

    /* renamed from: a */
    public static final C5847h f15048a = new C5847h();

    /* renamed from: b */
    private static final HashSet<Integer> f15049b = C10822w0.m38918e(200, 202);

    /* renamed from: c */
    private static final HashSet<Integer> f15050c = C10822w0.m38918e(503, 504, 429);

    /* renamed from: d */
    public static a f15051d;

    /* renamed from: e */
    public static List<Map<String, Object>> f15052e;

    /* renamed from: f */
    private static int f15053f;

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    /* renamed from: com.facebook.o0.l0.h$a */
    public static final class a {

        /* renamed from: a */
        private final String f15054a;

        /* renamed from: b */
        private final String f15055b;

        /* renamed from: c */
        private final String f15056c;

        public a(String str, String str2, String str3) {
            C9801m.m32346f(str, "datasetID");
            C9801m.m32346f(str2, "cloudBridgeURL");
            C9801m.m32346f(str3, "accessKey");
            this.f15054a = str;
            this.f15055b = str2;
            this.f15056c = str3;
        }

        /* renamed from: a */
        public final String m12349a() {
            return this.f15056c;
        }

        /* renamed from: b */
        public final String m12350b() {
            return this.f15055b;
        }

        /* renamed from: c */
        public final String m12351c() {
            return this.f15054a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9801m.m32341a(this.f15054a, aVar.f15054a) && C9801m.m32341a(this.f15055b, aVar.f15055b) && C9801m.m32341a(this.f15056c, aVar.f15056c);
        }

        public int hashCode() {
            return (((this.f15054a.hashCode() * 31) + this.f15055b.hashCode()) * 31) + this.f15056c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f15054a + ", cloudBridgeURL=" + this.f15055b + ", accessKey=" + this.f15056c + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    /* renamed from: com.facebook.o0.l0.h$b */
    static final class b extends Lambda implements Function2<String, Integer, C10775u> {

        /* renamed from: f */
        final /* synthetic */ List<Map<String, Object>> f15057f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f15057f = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m12352c(Integer num, List list) {
            C9801m.m32346f(list, "$processedEvents");
            if (C10782c0.m38577K(C5847h.f15049b, num)) {
                return;
            }
            C5847h.f15048a.m12345f(num, list, 5);
        }

        /* renamed from: b */
        public final void m12354b(String str, final Integer num) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            final List<Map<String, Object>> list = this.f15057f;
            C5696p0.m11527B0(new Runnable() { // from class: com.facebook.o0.l0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5847h.b.m12352c(num, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C10775u invoke(String str, Integer num) {
            m12354b(str, num);
            return C10775u.f41439a;
        }
    }

    private C5847h() {
    }

    /* renamed from: c */
    public static final void m12337c(String str, String str2, String str3) {
        C9801m.m32346f(str, "datasetID");
        C9801m.m32346f(str2, "url");
        C9801m.m32346f(str3, "accessKey");
        C5684j0.a aVar = C5684j0.f14429a;
        EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
        C5847h c5847h = f15048a;
        aVar.m11455c(enumC5659g0, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        c5847h.m12347i(new a(str, str2, str3));
        c5847h.m12348j(new ArrayList());
    }

    /* renamed from: k */
    private final List<Map<String, Object>> m12339k(GraphRequest graphRequest) {
        JSONObject jSONObjectM11183p = graphRequest.m11183p();
        if (jSONObjectM11183p == null) {
            return null;
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        Map<String, ? extends Object> mapM38809u = C10810q0.m38809u(C5696p0.m11578l(jSONObjectM11183p));
        Object objM11188v = graphRequest.m11188v();
        if (objM11188v == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        mapM38809u.put("custom_events", objM11188v);
        StringBuilder sb = new StringBuilder();
        for (String str : mapM38809u.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(mapM38809u.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return C5846g.f15026a.m12325e(mapM38809u);
    }

    /* renamed from: l */
    public static final void m12340l(final GraphRequest graphRequest) {
        C9801m.m32346f(graphRequest, "request");
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11527B0(new Runnable() { // from class: com.facebook.o0.l0.b
            @Override // java.lang.Runnable
            public final void run() throws JSONException, IOException {
                C5847h.m12341m(graphRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m12341m(GraphRequest graphRequest) throws JSONException, IOException {
        C9801m.m32346f(graphRequest, "$request");
        String strM11184q = graphRequest.m11184q();
        List listM37582v0 = strM11184q == null ? null : C10547v.m37582v0(strM11184q, new String[]{"/"}, false, 0, 6, null);
        if (listM37582v0 == null || listM37582v0.size() != 2) {
            C5684j0.f14429a.m11455c(EnumC5659g0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            C5847h c5847h = f15048a;
            String str = c5847h.m12343d().m12350b() + "/capi/" + c5847h.m12343d().m12351c() + "/events";
            List<Map<String, Object>> listM12339k = c5847h.m12339k(graphRequest);
            if (listM12339k == null) {
                return;
            }
            c5847h.m12342b(listM12339k);
            int iMin = Math.min(c5847h.m12344e().size(), 10);
            List listM38616v0 = C10782c0.m38616v0(c5847h.m12344e(), new IntRange(0, iMin - 1));
            c5847h.m12344e().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listM38616v0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", c5847h.m12343d().m12349a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            C5684j0.a aVar = C5684j0.f14429a;
            EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
            String string = jSONObject.toString(2);
            C9801m.m32345e(string, "jsonBodyStr.toString(2)");
            aVar.m11455c(enumC5659g0, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, string);
            c5847h.m12346h(str, "POST", jSONObject.toString(), C10808p0.m38794f(C10773s.m38547a("Content-Type", "application/json")), 60000, new b(listM38616v0));
        } catch (UninitializedPropertyAccessException e2) {
            C5684j0.f14429a.m11455c(EnumC5659g0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e2);
        }
    }

    /* renamed from: b */
    public final void m12342b(List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            m12344e().addAll(list);
        }
        int iMax = Math.max(0, m12344e().size() - 1000);
        if (iMax > 0) {
            m12348j(C9800l0.m32327b(C10782c0.m38581M(m12344e(), iMax)));
        }
    }

    /* renamed from: d */
    public final a m12343d() {
        a aVar = f15051d;
        if (aVar != null) {
            return aVar;
        }
        C9801m.m32363w("credentials");
        throw null;
    }

    /* renamed from: e */
    public final List<Map<String, Object>> m12344e() {
        List<Map<String, Object>> list = f15052e;
        if (list != null) {
            return list;
        }
        C9801m.m32363w("transformedEvents");
        throw null;
    }

    /* renamed from: f */
    public final void m12345f(Integer num, List<? extends Map<String, ? extends Object>> list, int i2) {
        C9801m.m32346f(list, "processedEvents");
        if (C10782c0.m38577K(f15050c, num)) {
            if (f15053f >= i2) {
                m12344e().clear();
                f15053f = 0;
            } else {
                m12344e().addAll(0, list);
                f15053f++;
            }
        }
    }

    /* renamed from: h */
    public final void m12346h(String str, String str2, String str3, Map<String, String> map, int i2, Function2<? super String, ? super Integer, C10775u> function2) throws IOException {
        Set<String> setKeySet;
        C9801m.m32346f(str, "urlStr");
        C9801m.m32346f(str2, "requestMethod");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(str2);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str4 : setKeySet) {
                    httpURLConnection.setRequestProperty(str4, map.get(str4));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(i2);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(str3);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb = new StringBuilder();
            if (f15049b.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C10556a.m37638a(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                C10775u c10775u = C10775u.f41439a;
                C10556a.m37638a(bufferedReader, null);
            }
            String string = sb.toString();
            C9801m.m32345e(string, "connResponseSB.toString()");
            C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 != null) {
                function2.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e2) {
            C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e2.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e3) {
            C5684j0.f14429a.m11455c(EnumC5659g0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e3.toString());
        }
    }

    /* renamed from: i */
    public final void m12347i(a aVar) {
        C9801m.m32346f(aVar, "<set-?>");
        f15051d = aVar;
    }

    /* renamed from: j */
    public final void m12348j(List<Map<String, Object>> list) {
        C9801m.m32346f(list, "<set-?>");
        f15052e = list;
    }
}
