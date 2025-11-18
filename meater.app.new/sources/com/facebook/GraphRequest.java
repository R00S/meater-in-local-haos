package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.facebook.C5646c0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5680h0;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5692n0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5698q0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C10803n;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class GraphRequest {

    /* renamed from: a */
    public static final C5632c f14159a = new C5632c(null);

    /* renamed from: b */
    public static final String f14160b = GraphRequest.class.getSimpleName();

    /* renamed from: c */
    private static final String f14161c;

    /* renamed from: d */
    private static String f14162d;

    /* renamed from: e */
    private static final Pattern f14163e;

    /* renamed from: f */
    private static volatile String f14164f;

    /* renamed from: g */
    private AccessToken f14165g;

    /* renamed from: h */
    private String f14166h;

    /* renamed from: i */
    private JSONObject f14167i;

    /* renamed from: j */
    private String f14168j;

    /* renamed from: k */
    private String f14169k;

    /* renamed from: l */
    private boolean f14170l;

    /* renamed from: m */
    private Bundle f14171m;

    /* renamed from: n */
    private Object f14172n;

    /* renamed from: o */
    private String f14173o;

    /* renamed from: p */
    private InterfaceC5631b f14174p;

    /* renamed from: q */
    private EnumC5655e0 f14175q;

    /* renamed from: r */
    private boolean f14176r;

    /* renamed from: s */
    private String f14177s;

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$a */
    private static final class C5630a {

        /* renamed from: a */
        private final GraphRequest f14181a;

        /* renamed from: b */
        private final Object f14182b;

        public C5630a(GraphRequest graphRequest, Object obj) {
            C9801m.m32346f(graphRequest, "request");
            this.f14181a = graphRequest;
            this.f14182b = obj;
        }

        /* renamed from: a */
        public final GraphRequest m11194a() {
            return this.f14181a;
        }

        /* renamed from: b */
        public final Object m11195b() {
            return this.f14182b;
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$b */
    public interface InterfaceC5631b {
        /* renamed from: b */
        void mo11196b(C5653d0 c5653d0);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$c */
    public static final class C5632c {
        private C5632c() {
        }

        public /* synthetic */ C5632c(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final String m11197C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            C9801m.m32345e(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m11198D(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.InterfaceC5634e r12) {
            /*
                r9 = this;
                boolean r0 = r9.m11216s(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r3 = r11
                int r0 = kotlin.text.C10537l.m37468W(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = kotlin.text.C10537l.m37468W(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = 1
                goto L24
            L23:
                r11 = 0
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.C10537l.m37483q(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = 1
                goto L45
            L44:
                r5 = 0
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.C9801m.m32345e(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C9801m.m32345e(r4, r6)
                r9.m11199E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C5632c.m11198D(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$e):void");
        }

        /* renamed from: E */
        private final void m11199E(String str, Object obj, InterfaceC5634e interfaceC5634e, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        C9801m.m32345e(objOpt, "jsonObject.opt(propertyName)");
                        m11199E(str2, objOpt, interfaceC5634e, z);
                    }
                    return;
                }
                if (jSONObject.has(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)) {
                    String strOptString = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                    C9801m.m32345e(strOptString, "jsonObject.optString(\"id\")");
                    m11199E(str, strOptString, interfaceC5634e, z);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    C9801m.m32345e(strOptString2, "jsonObject.optString(\"url\")");
                    m11199E(str, strOptString2, interfaceC5634e, z);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        C9801m.m32345e(string, "jsonObject.toString()");
                        m11199E(str, string, interfaceC5634e, z);
                        return;
                    }
                    return;
                }
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    interfaceC5634e.mo11239a(str, obj.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    C9801m.m32345e(str3, "iso8601DateFormat.format(date)");
                    interfaceC5634e.mo11239a(str, str3);
                    return;
                }
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11575j0(GraphRequest.f14160b, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.f37185a;
                String str4 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                C9801m.m32345e(str4, "java.lang.String.format(locale, format, *args)");
                Object objOpt2 = jSONArray.opt(i2);
                C9801m.m32345e(objOpt2, "jsonArray.opt(i)");
                m11199E(str4, objOpt2, interfaceC5634e, z);
                if (i3 >= length) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        /* renamed from: F */
        private final void m11200F(C5646c0 c5646c0, C5684j0 c5684j0, int i2, URL url, OutputStream outputStream, boolean z) throws JSONException, IOException {
            C5636g c5636g = new C5636g(outputStream, c5684j0, z);
            if (i2 != 1) {
                String strM11211n = m11211n(c5646c0);
                if (strM11211n.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                c5636g.mo11239a("batch_app_id", strM11211n);
                HashMap map = new HashMap();
                m11204K(c5636g, c5646c0, map);
                if (c5684j0 != null) {
                    c5684j0.m11447b("  Attachments:\n");
                }
                m11202I(map, c5636g);
                return;
            }
            GraphRequest graphRequestM11327r = c5646c0.get(0);
            HashMap map2 = new HashMap();
            for (String str : graphRequestM11327r.m11186t().keySet()) {
                Object obj = graphRequestM11327r.m11186t().get(str);
                if (m11217t(obj)) {
                    C9801m.m32345e(str, RoomNotification.KEY);
                    map2.put(str, new C5630a(graphRequestM11327r, obj));
                }
            }
            if (c5684j0 != null) {
                c5684j0.m11447b("  Parameters:\n");
            }
            m11203J(graphRequestM11327r.m11186t(), c5636g, graphRequestM11327r);
            if (c5684j0 != null) {
                c5684j0.m11447b("  Attachments:\n");
            }
            m11202I(map2, c5636g);
            JSONObject jSONObjectM11183p = graphRequestM11327r.m11183p();
            if (jSONObjectM11183p != null) {
                String path = url.getPath();
                C9801m.m32345e(path, "url.path");
                m11198D(jSONObjectM11183p, path, c5636g);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public static final void m11201H(ArrayList arrayList, C5646c0 c5646c0) {
            C9801m.m32346f(arrayList, "$callbacks");
            C9801m.m32346f(c5646c0, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InterfaceC5631b interfaceC5631b = (InterfaceC5631b) pair.first;
                Object obj = pair.second;
                C9801m.m32345e(obj, "pair.second");
                interfaceC5631b.mo11196b((C5653d0) obj);
            }
            Iterator<C5646c0.a> it2 = c5646c0.m11330u().iterator();
            while (it2.hasNext()) {
                it2.next().mo11312a(c5646c0);
            }
        }

        /* renamed from: I */
        private final void m11202I(Map<String, C5630a> map, C5636g c5636g) throws IOException {
            for (Map.Entry<String, C5630a> entry : map.entrySet()) {
                if (GraphRequest.f14159a.m11217t(entry.getValue().m11195b())) {
                    c5636g.m11249j(entry.getKey(), entry.getValue().m11195b(), entry.getValue().m11194a());
                }
            }
        }

        /* renamed from: J */
        private final void m11203J(Bundle bundle, C5636g c5636g, GraphRequest graphRequest) throws IOException {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (m11218u(obj)) {
                    C9801m.m32345e(str, RoomNotification.KEY);
                    c5636g.m11249j(str, obj, graphRequest);
                }
            }
        }

        /* renamed from: K */
        private final void m11204K(C5636g c5636g, Collection<GraphRequest> collection, Map<String, C5630a> map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = collection.iterator();
            while (it.hasNext()) {
                it.next().m11156C(jSONArray, map);
            }
            c5636g.m11251l("batch", jSONArray, collection);
        }

        /* renamed from: M */
        private final void m11205M(HttpURLConnection httpURLConnection, boolean z) {
            if (!z) {
                httpURLConnection.setRequestProperty("Content-Type", m11212o());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        /* renamed from: e */
        private final HttpURLConnection m11210e(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("User-Agent", m11213p());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* renamed from: n */
        private final String m11211n(C5646c0 c5646c0) {
            String strM11328s = c5646c0.m11328s();
            if (strM11328s != null && (!c5646c0.isEmpty())) {
                return strM11328s;
            }
            Iterator<GraphRequest> it = c5646c0.iterator();
            while (it.hasNext()) {
                AccessToken accessTokenM11181l = it.next().m11181l();
                if (accessTokenM11181l != null) {
                    return accessTokenM11181l.m11084c();
                }
            }
            String str = GraphRequest.f14162d;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            C5641a0 c5641a0 = C5641a0.f14199a;
            return C5641a0.m11285d();
        }

        /* renamed from: o */
        private final String m11212o() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f14161c}, 1));
            C9801m.m32345e(str, "java.lang.String.format(format, *args)");
            return str;
        }

        /* renamed from: p */
        private final String m11213p() {
            if (GraphRequest.f14164f == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.2.0"}, 2));
                C9801m.m32345e(str, "java.lang.String.format(format, *args)");
                GraphRequest.f14164f = str;
                C5680h0 c5680h0 = C5680h0.f14422a;
                String strM11441a = C5680h0.m11441a();
                C5696p0 c5696p0 = C5696p0.f14478a;
                if (!C5696p0.m11557a0(strM11441a)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f14164f, strM11441a}, 2));
                    C9801m.m32345e(str2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.f14164f = str2;
                }
            }
            return GraphRequest.f14164f;
        }

        /* renamed from: q */
        private final boolean m11214q(C5646c0 c5646c0) {
            Iterator<C5646c0.a> it = c5646c0.m11330u().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C5646c0.c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = c5646c0.iterator();
            while (it2.hasNext()) {
                if (it2.next().m11182n() instanceof InterfaceC5635f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r */
        private final boolean m11215r(C5646c0 c5646c0) {
            Iterator<GraphRequest> it = c5646c0.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                Iterator<String> it2 = next.m11186t().keySet().iterator();
                while (it2.hasNext()) {
                    if (m11217t(next.m11186t().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: s */
        private final boolean m11216s(String str) {
            Matcher matcher = GraphRequest.f14163e.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                C9801m.m32345e(str, "matcher.group(1)");
            }
            return C10546u.m37511E(str, "me/", false, 2, null) || C10546u.m37511E(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final boolean m11217t(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final boolean m11218u(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static final void m11221z(InterfaceC5633d interfaceC5633d, C5653d0 c5653d0) {
            C9801m.m32346f(c5653d0, "response");
            if (interfaceC5633d == null) {
                return;
            }
            interfaceC5633d.m11238a(c5653d0.m11339c(), c5653d0);
        }

        /* renamed from: A */
        public final GraphRequest m11222A(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC5631b interfaceC5631b) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, EnumC5655e0.POST, interfaceC5631b, null, 32, null);
            graphRequest.m11175F(jSONObject);
            return graphRequest;
        }

        /* renamed from: B */
        public final GraphRequest m11223B(AccessToken accessToken, String str, Bundle bundle, InterfaceC5631b interfaceC5631b) {
            return new GraphRequest(accessToken, str, bundle, EnumC5655e0.POST, interfaceC5631b, null, 32, null);
        }

        /* renamed from: G */
        public final void m11224G(final C5646c0 c5646c0, List<C5653d0> list) {
            C9801m.m32346f(c5646c0, "requests");
            C9801m.m32346f(list, "responses");
            int size = c5646c0.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    GraphRequest graphRequestM11327r = c5646c0.get(i2);
                    if (graphRequestM11327r.m11182n() != null) {
                        arrayList.add(new Pair(graphRequestM11327r.m11182n(), list.get(i2)));
                    }
                    if (i3 >= size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.C5632c.m11201H(arrayList, c5646c0);
                    }
                };
                Handler handlerM11329t = c5646c0.m11329t();
                if ((handlerM11329t == null ? null : Boolean.valueOf(handlerM11329t.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m11225L(com.facebook.C5646c0 r14, java.net.HttpURLConnection r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C5632c.m11225L(com.facebook.c0, java.net.HttpURLConnection):void");
        }

        /* renamed from: N */
        public final HttpURLConnection m11226N(C5646c0 c5646c0) throws Throwable {
            URL url;
            C9801m.m32346f(c5646c0, "requests");
            m11227O(c5646c0);
            try {
                if (c5646c0.size() == 1) {
                    url = new URL(c5646c0.get(0).m11189w());
                } else {
                    C5692n0 c5692n0 = C5692n0.f14464a;
                    url = new URL(C5692n0.m11517h());
                }
                HttpURLConnection httpURLConnectionM11210e = null;
                try {
                    httpURLConnectionM11210e = m11210e(url);
                    m11225L(c5646c0, httpURLConnectionM11210e);
                    return httpURLConnectionM11210e;
                } catch (IOException e2) {
                    C5696p0 c5696p0 = C5696p0.f14478a;
                    C5696p0.m11584o(httpURLConnectionM11210e);
                    throw new FacebookException("could not construct request body", e2);
                } catch (JSONException e3) {
                    C5696p0 c5696p02 = C5696p0.f14478a;
                    C5696p0.m11584o(httpURLConnectionM11210e);
                    throw new FacebookException("could not construct request body", e3);
                }
            } catch (MalformedURLException e4) {
                throw new FacebookException("could not construct URL for request", e4);
            }
        }

        /* renamed from: O */
        public final void m11227O(C5646c0 c5646c0) {
            C9801m.m32346f(c5646c0, "requests");
            Iterator<GraphRequest> it = c5646c0.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                if (EnumC5655e0.GET == next.m11185s()) {
                    C5696p0 c5696p0 = C5696p0.f14478a;
                    if (C5696p0.m11557a0(next.m11186t().getString("fields"))) {
                        C5684j0.a aVar = C5684j0.f14429a;
                        EnumC5659g0 enumC5659g0 = EnumC5659g0.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String strM11184q = next.m11184q();
                        if (strM11184q == null) {
                            strM11184q = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        sb.append(strM11184q);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.m11453a(enumC5659g0, 5, "Request", sb.toString());
                    }
                }
            }
        }

        /* renamed from: f */
        public final C5653d0 m11228f(GraphRequest graphRequest) {
            C9801m.m32346f(graphRequest, "request");
            List<C5653d0> listM11231i = m11231i(graphRequest);
            if (listM11231i.size() == 1) {
                return listM11231i.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        /* renamed from: g */
        public final List<C5653d0> m11229g(C5646c0 c5646c0) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionM11226N;
            List<C5653d0> listM11235m;
            C9801m.m32346f(c5646c0, "requests");
            C5698q0 c5698q0 = C5698q0.f14500a;
            C5698q0.m11641i(c5646c0, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionM11226N = m11226N(c5646c0);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                httpURLConnectionM11226N = null;
            } catch (Throwable th) {
                th = th;
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11584o(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionM11226N != null) {
                    listM11235m = m11235m(httpURLConnectionM11226N, c5646c0);
                } else {
                    List<C5653d0> listM11343a = C5653d0.f14271a.m11343a(c5646c0.m11332w(), null, new FacebookException(exc));
                    m11224G(c5646c0, listM11343a);
                    listM11235m = listM11343a;
                }
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11584o(httpURLConnectionM11226N);
                return listM11235m;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionM11226N;
                C5696p0 c5696p03 = C5696p0.f14478a;
                C5696p0.m11584o(httpURLConnection);
                throw th;
            }
        }

        /* renamed from: h */
        public final List<C5653d0> m11230h(Collection<GraphRequest> collection) {
            C9801m.m32346f(collection, "requests");
            return m11229g(new C5646c0(collection));
        }

        /* renamed from: i */
        public final List<C5653d0> m11231i(GraphRequest... graphRequestArr) {
            C9801m.m32346f(graphRequestArr, "requests");
            return m11230h(C10803n.m38746Z(graphRequestArr));
        }

        /* renamed from: j */
        public final AsyncTaskC5643b0 m11232j(C5646c0 c5646c0) {
            C9801m.m32346f(c5646c0, "requests");
            C5698q0 c5698q0 = C5698q0.f14500a;
            C5698q0.m11641i(c5646c0, "requests");
            AsyncTaskC5643b0 asyncTaskC5643b0 = new AsyncTaskC5643b0(c5646c0);
            C5641a0 c5641a0 = C5641a0.f14199a;
            asyncTaskC5643b0.executeOnExecutor(C5641a0.m11292k(), new Void[0]);
            return asyncTaskC5643b0;
        }

        /* renamed from: k */
        public final AsyncTaskC5643b0 m11233k(Collection<GraphRequest> collection) {
            C9801m.m32346f(collection, "requests");
            return m11232j(new C5646c0(collection));
        }

        /* renamed from: l */
        public final AsyncTaskC5643b0 m11234l(GraphRequest... graphRequestArr) {
            C9801m.m32346f(graphRequestArr, "requests");
            return m11233k(C10803n.m38746Z(graphRequestArr));
        }

        /* renamed from: m */
        public final List<C5653d0> m11235m(HttpURLConnection httpURLConnection, C5646c0 c5646c0) {
            C9801m.m32346f(httpURLConnection, "connection");
            C9801m.m32346f(c5646c0, "requests");
            List<C5653d0> listM11346f = C5653d0.f14271a.m11346f(httpURLConnection, c5646c0);
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11584o(httpURLConnection);
            int size = c5646c0.size();
            if (size == listM11346f.size()) {
                m11224G(c5646c0, listM11346f);
                C5955v.f15573a.m12923e().m12913d();
                return listM11346f;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listM11346f.size()), Integer.valueOf(size)}, 2));
            C9801m.m32345e(str, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(str);
        }

        /* renamed from: x */
        public final GraphRequest m11236x(AccessToken accessToken, String str, InterfaceC5631b interfaceC5631b) {
            return new GraphRequest(accessToken, str, null, null, interfaceC5631b, null, 32, null);
        }

        /* renamed from: y */
        public final GraphRequest m11237y(AccessToken accessToken, final InterfaceC5633d interfaceC5633d) {
            return new GraphRequest(accessToken, "me", null, null, new InterfaceC5631b() { // from class: com.facebook.p
                @Override // com.facebook.GraphRequest.InterfaceC5631b
                /* renamed from: b */
                public final void mo11196b(C5653d0 c5653d0) {
                    GraphRequest.C5632c.m11221z(interfaceC5633d, c5653d0);
                }
            }, null, 32, null);
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$d */
    public interface InterfaceC5633d {
        /* renamed from: a */
        void m11238a(JSONObject jSONObject, C5653d0 c5653d0);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$e */
    private interface InterfaceC5634e {
        /* renamed from: a */
        void mo11239a(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$f */
    public interface InterfaceC5635f extends InterfaceC5631b {
        /* renamed from: a */
        void m11240a(long j2, long j3);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$g */
    private static final class C5636g implements InterfaceC5634e {

        /* renamed from: a */
        private final OutputStream f14183a;

        /* renamed from: b */
        private final C5684j0 f14184b;

        /* renamed from: c */
        private boolean f14185c;

        /* renamed from: d */
        private final boolean f14186d;

        public C5636g(OutputStream outputStream, C5684j0 c5684j0, boolean z) {
            C9801m.m32346f(outputStream, "outputStream");
            this.f14183a = outputStream;
            this.f14184b = c5684j0;
            this.f14185c = true;
            this.f14186d = z;
        }

        /* renamed from: b */
        private final RuntimeException m11241b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.GraphRequest.InterfaceC5634e
        /* renamed from: a */
        public void mo11239a(String str, String str2) throws IOException {
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(str2, "value");
            m11245f(str, null, null);
            m11248i("%s", str2);
            m11250k();
            C5684j0 c5684j0 = this.f14184b;
            if (c5684j0 == null) {
                return;
            }
            c5684j0.m11449d(C9801m.m32354n("    ", str), str2);
        }

        /* renamed from: c */
        public final void m11242c(String str, Object... objArr) throws IOException {
            C9801m.m32346f(str, "format");
            C9801m.m32346f(objArr, "args");
            if (this.f14186d) {
                OutputStream outputStream = this.f14183a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                C9801m.m32345e(str2, "java.lang.String.format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                C9801m.m32345e(strEncode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(Charsets.f40651b);
                C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f14185c) {
                OutputStream outputStream2 = this.f14183a;
                Charset charset = Charsets.f40651b;
                byte[] bytes2 = "--".getBytes(charset);
                C9801m.m32345e(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f14183a;
                String str3 = GraphRequest.f14161c;
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str3.getBytes(charset);
                C9801m.m32345e(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f14183a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                C9801m.m32345e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f14185c = false;
            }
            OutputStream outputStream5 = this.f14183a;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f37185a;
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
            String str4 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            C9801m.m32345e(str4, "java.lang.String.format(format, *args)");
            Charset charset2 = Charsets.f40651b;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes5 = str4.getBytes(charset2);
            C9801m.m32345e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: d */
        public final void m11243d(String str, Bitmap bitmap) throws IOException {
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(bitmap, "bitmap");
            m11245f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f14183a);
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5684j0 c5684j0 = this.f14184b;
            if (c5684j0 == null) {
                return;
            }
            c5684j0.m11449d(C9801m.m32354n("    ", str), "<Image>");
        }

        /* renamed from: e */
        public final void m11244e(String str, byte[] bArr) throws IOException {
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(bArr, "bytes");
            m11245f(str, str, "content/unknown");
            this.f14183a.write(bArr);
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5684j0 c5684j0 = this.f14184b;
            if (c5684j0 == null) {
                return;
            }
            String strM32354n = C9801m.m32354n("    ", str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            C9801m.m32345e(str2, "java.lang.String.format(locale, format, *args)");
            c5684j0.m11449d(strM32354n, str2);
        }

        /* renamed from: f */
        public final void m11245f(String str, String str2, String str3) throws IOException {
            if (!this.f14186d) {
                m11242c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m11242c("; filename=\"%s\"", str2);
                }
                m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
                if (str3 != null) {
                    m11248i("%s: %s", "Content-Type", str3);
                }
                m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
                return;
            }
            OutputStream outputStream = this.f14183a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            C9801m.m32345e(str4, "java.lang.String.format(format, *args)");
            Charset charset = Charsets.f40651b;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str4.getBytes(charset);
            C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: g */
        public final void m11246g(String str, Uri uri, String str2) throws IOException {
            int iM11582n;
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m11245f(str, str, str2);
            if (this.f14183a instanceof C5742j0) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                ((C5742j0) this.f14183a).m11833b(C5696p0.m11600x(uri));
                iM11582n = 0;
            } else {
                C5641a0 c5641a0 = C5641a0.f14199a;
                InputStream inputStreamOpenInputStream = C5641a0.m11284c().getContentResolver().openInputStream(uri);
                C5696p0 c5696p02 = C5696p0.f14478a;
                iM11582n = C5696p0.m11582n(inputStreamOpenInputStream, this.f14183a) + 0;
            }
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5684j0 c5684j0 = this.f14184b;
            if (c5684j0 == null) {
                return;
            }
            String strM32354n = C9801m.m32354n("    ", str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM11582n)}, 1));
            C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
            c5684j0.m11449d(strM32354n, str3);
        }

        /* renamed from: h */
        public final void m11247h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int iM11582n;
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m11245f(str, str, str2);
            OutputStream outputStream = this.f14183a;
            if (outputStream instanceof C5742j0) {
                ((C5742j0) outputStream).m11833b(parcelFileDescriptor.getStatSize());
                iM11582n = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                C5696p0 c5696p0 = C5696p0.f14478a;
                iM11582n = C5696p0.m11582n(autoCloseInputStream, this.f14183a) + 0;
            }
            m11248i(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            m11250k();
            C5684j0 c5684j0 = this.f14184b;
            if (c5684j0 == null) {
                return;
            }
            String strM32354n = C9801m.m32354n("    ", str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM11582n)}, 1));
            C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
            c5684j0.m11449d(strM32354n, str3);
        }

        /* renamed from: i */
        public final void m11248i(String str, Object... objArr) throws IOException {
            C9801m.m32346f(str, "format");
            C9801m.m32346f(objArr, "args");
            m11242c(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f14186d) {
                return;
            }
            m11242c("\r\n", new Object[0]);
        }

        /* renamed from: j */
        public final void m11249j(String str, Object obj, GraphRequest graphRequest) throws IOException {
            C9801m.m32346f(str, RoomNotification.KEY);
            Closeable closeable = this.f14183a;
            if (closeable instanceof InterfaceC5746l0) {
                ((InterfaceC5746l0) closeable).mo11832a(graphRequest);
            }
            C5632c c5632c = GraphRequest.f14159a;
            if (c5632c.m11218u(obj)) {
                mo11239a(str, c5632c.m11197C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                m11243d(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                m11244e(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                m11246g(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                m11247h(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw m11241b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable parcelableM11191b = parcelableResourceWithMimeType.m11191b();
            String strM11190a = parcelableResourceWithMimeType.m11190a();
            if (parcelableM11191b instanceof ParcelFileDescriptor) {
                m11247h(str, (ParcelFileDescriptor) parcelableM11191b, strM11190a);
            } else {
                if (!(parcelableM11191b instanceof Uri)) {
                    throw m11241b();
                }
                m11246g(str, (Uri) parcelableM11191b, strM11190a);
            }
        }

        /* renamed from: k */
        public final void m11250k() throws IOException {
            if (!this.f14186d) {
                m11248i("--%s", GraphRequest.f14161c);
                return;
            }
            OutputStream outputStream = this.f14183a;
            byte[] bytes = "&".getBytes(Charsets.f40651b);
            C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: l */
        public final void m11251l(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws JSONException, IOException {
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(jSONArray, "requestJsonArray");
            C9801m.m32346f(collection, "requests");
            Closeable closeable = this.f14183a;
            if (!(closeable instanceof InterfaceC5746l0)) {
                String string = jSONArray.toString();
                C9801m.m32345e(string, "requestJsonArray.toString()");
                mo11239a(str, string);
                return;
            }
            InterfaceC5746l0 interfaceC5746l0 = (InterfaceC5746l0) closeable;
            m11245f(str, null, null);
            m11242c("[", new Object[0]);
            int i2 = 0;
            for (GraphRequest graphRequest : collection) {
                int i3 = i2 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                interfaceC5746l0.mo11832a(graphRequest);
                if (i2 > 0) {
                    m11242c(",%s", jSONObject.toString());
                } else {
                    m11242c("%s", jSONObject.toString());
                }
                i2 = i3;
            }
            m11242c("]", new Object[0]);
            C5684j0 c5684j0 = this.f14184b;
            if (c5684j0 == null) {
                return;
            }
            String strM32354n = C9801m.m32354n("    ", str);
            String string2 = jSONArray.toString();
            C9801m.m32345e(string2, "requestJsonArray.toString()");
            c5684j0.m11449d(strM32354n, string2);
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$h */
    public static final class C5637h implements InterfaceC5634e {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f14187a;

        C5637h(ArrayList<String> arrayList) {
            this.f14187a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC5634e
        /* renamed from: a */
        public void mo11239a(String str, String str2) throws IOException {
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(str2, "value");
            ArrayList<String> arrayList = this.f14187a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str3 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
            arrayList.add(str3);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C9801m.m32345e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        if (iNextInt > 0) {
            int i2 = 0;
            do {
                i2++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i2 < iNextInt);
        }
        String string = sb.toString();
        C9801m.m32345e(string, "buffer.toString()");
        f14161c = string;
        f14163e = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC5655e0 enumC5655e0, InterfaceC5631b interfaceC5631b, String str2, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? null : accessToken, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? null : enumC5655e0, (i2 & 16) != 0 ? null : interfaceC5631b, (i2 & 32) != 0 ? null : str2);
    }

    /* renamed from: B */
    public static final GraphRequest m11155B(AccessToken accessToken, InterfaceC5633d interfaceC5633d) {
        return f14159a.m11237y(accessToken, interfaceC5633d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m11156C(JSONArray jSONArray, Map<String, C5630a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f14168j;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f14170l);
        }
        String str2 = this.f14169k;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strM11187u = m11187u();
        jSONObject.put("relative_url", strM11187u);
        jSONObject.put("method", this.f14175q);
        AccessToken accessToken = this.f14165g;
        if (accessToken != null) {
            C5684j0.f14429a.m11456d(accessToken.m11093l());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f14171m.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f14171m.get(it.next());
            if (f14159a.m11217t(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new C5630a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f14167i;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f14159a.m11198D(jSONObject2, strM11187u, new C5637h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: J */
    private final boolean m11157J() {
        String strM11167m = m11167m();
        boolean zM37538J = strM11167m == null ? false : C10547v.m37538J(strM11167m, "|", false, 2, null);
        if (((strM11167m == null || !C10546u.m37511E(strM11167m, "IG", false, 2, null) || zM37538J) ? false : true) && m11171y()) {
            return true;
        }
        return (m11172z() || zM37538J) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m11158a(InterfaceC5631b interfaceC5631b, C5653d0 c5653d0) {
        C9801m.m32346f(c5653d0, "response");
        JSONObject jSONObjectM11339c = c5653d0.m11339c();
        JSONObject jSONObjectOptJSONObject = jSONObjectM11339c == null ? null : jSONObjectM11339c.optJSONObject("__debug__");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("messages");
        if (jSONArrayOptJSONArray != null) {
            int i2 = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    String strOptString = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("message");
                    String strOptString2 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("type");
                    String strOptString3 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("link");
                    if (strOptString != null && strOptString2 != null) {
                        EnumC5659g0 enumC5659g0 = EnumC5659g0.GRAPH_API_DEBUG_INFO;
                        if (C9801m.m32341a(strOptString2, "warning")) {
                            enumC5659g0 = EnumC5659g0.GRAPH_API_DEBUG_WARNING;
                        }
                        C5696p0 c5696p0 = C5696p0.f14478a;
                        if (!C5696p0.m11557a0(strOptString3)) {
                            strOptString = ((Object) strOptString) + " Link: " + ((Object) strOptString3);
                        }
                        C5684j0.a aVar = C5684j0.f14429a;
                        String str = f14160b;
                        C9801m.m32345e(str, "TAG");
                        aVar.m11454b(enumC5659g0, str, strOptString);
                    }
                    if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
        if (interfaceC5631b == null) {
            return;
        }
        interfaceC5631b.mo11196b(c5653d0);
    }

    /* renamed from: h */
    private final void m11165h() {
        Bundle bundle = this.f14171m;
        if (m11157J()) {
            bundle.putString("access_token", m11168o());
        } else {
            String strM11167m = m11167m();
            if (strM11167m != null) {
                bundle.putString("access_token", strM11167m);
            }
        }
        if (!bundle.containsKey("access_token")) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (C5696p0.m11557a0(C5641a0.m11290i())) {
                Log.w(f14160b, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", BodyInterceptorV3.RESPONSE_MODE_JSON);
        C5641a0 c5641a02 = C5641a0.f14199a;
        if (C5641a0.m11306y(EnumC5659g0.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C5641a0.m11306y(EnumC5659g0.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* renamed from: i */
    private final String m11166i(String str, boolean z) {
        if (!z && this.f14175q == EnumC5655e0.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f14171m.keySet()) {
            Object obj = this.f14171m.get(str2);
            if (obj == null) {
                obj = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C5632c c5632c = f14159a;
            if (c5632c.m11218u(obj)) {
                builderBuildUpon.appendQueryParameter(str2, c5632c.m11197C(obj).toString());
            } else if (this.f14175q != EnumC5655e0.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        C9801m.m32345e(string, "uriBuilder.toString()");
        return string;
    }

    /* renamed from: m */
    private final String m11167m() {
        AccessToken accessToken = this.f14165g;
        if (accessToken != null) {
            if (!this.f14171m.containsKey("access_token")) {
                String strM11093l = accessToken.m11093l();
                C5684j0.f14429a.m11456d(strM11093l);
                return strM11093l;
            }
        } else if (!this.f14171m.containsKey("access_token")) {
            return m11168o();
        }
        return this.f14171m.getString("access_token");
    }

    /* renamed from: o */
    private final String m11168o() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        String strM11285d = C5641a0.m11285d();
        String strM11290i = C5641a0.m11290i();
        if (strM11285d.length() > 0) {
            if (strM11290i.length() > 0) {
                return strM11285d + '|' + strM11290i;
            }
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11575j0(f14160b, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    /* renamed from: r */
    private final String m11169r() {
        if (f14163e.matcher(this.f14166h).matches()) {
            return this.f14166h;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f14173o, this.f14166h}, 2));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: x */
    private final String m11170x(String str) {
        if (!m11172z()) {
            C5692n0 c5692n0 = C5692n0.f14464a;
            str = C5692n0.m11515f();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, m11169r()}, 2));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* renamed from: y */
    private final boolean m11171y() {
        if (this.f14166h == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        C5641a0 c5641a0 = C5641a0.f14199a;
        sb.append(C5641a0.m11285d());
        sb.append("/?.*");
        return this.f14176r || Pattern.matches(sb.toString(), this.f14166h) || Pattern.matches("^/?app/?.*", this.f14166h);
    }

    /* renamed from: z */
    private final boolean m11172z() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C9801m.m32341a(C5641a0.m11296o(), "instagram.com")) {
            return !m11171y();
        }
        return true;
    }

    /* renamed from: D */
    public final void m11173D(final InterfaceC5631b interfaceC5631b) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11306y(EnumC5659g0.GRAPH_API_DEBUG_INFO) || C5641a0.m11306y(EnumC5659g0.GRAPH_API_DEBUG_WARNING)) {
            this.f14174p = new InterfaceC5631b() { // from class: com.facebook.q
                @Override // com.facebook.GraphRequest.InterfaceC5631b
                /* renamed from: b */
                public final void mo11196b(C5653d0 c5653d0) {
                    GraphRequest.m11158a(interfaceC5631b, c5653d0);
                }
            };
        } else {
            this.f14174p = interfaceC5631b;
        }
    }

    /* renamed from: E */
    public final void m11174E(boolean z) {
        this.f14176r = z;
    }

    /* renamed from: F */
    public final void m11175F(JSONObject jSONObject) {
        this.f14167i = jSONObject;
    }

    /* renamed from: G */
    public final void m11176G(EnumC5655e0 enumC5655e0) {
        if (this.f14177s != null && enumC5655e0 != EnumC5655e0.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (enumC5655e0 == null) {
            enumC5655e0 = EnumC5655e0.GET;
        }
        this.f14175q = enumC5655e0;
    }

    /* renamed from: H */
    public final void m11177H(Bundle bundle) {
        C9801m.m32346f(bundle, "<set-?>");
        this.f14171m = bundle;
    }

    /* renamed from: I */
    public final void m11178I(Object obj) {
        this.f14172n = obj;
    }

    /* renamed from: j */
    public final C5653d0 m11179j() {
        return f14159a.m11228f(this);
    }

    /* renamed from: k */
    public final AsyncTaskC5643b0 m11180k() {
        return f14159a.m11234l(this);
    }

    /* renamed from: l */
    public final AccessToken m11181l() {
        return this.f14165g;
    }

    /* renamed from: n */
    public final InterfaceC5631b m11182n() {
        return this.f14174p;
    }

    /* renamed from: p */
    public final JSONObject m11183p() {
        return this.f14167i;
    }

    /* renamed from: q */
    public final String m11184q() {
        return this.f14166h;
    }

    /* renamed from: s */
    public final EnumC5655e0 m11185s() {
        return this.f14175q;
    }

    /* renamed from: t */
    public final Bundle m11186t() {
        return this.f14171m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f14165g;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f14166h);
        sb.append(", graphObject: ");
        sb.append(this.f14167i);
        sb.append(", httpMethod: ");
        sb.append(this.f14175q);
        sb.append(", parameters: ");
        sb.append(this.f14171m);
        sb.append("}");
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return string;
    }

    /* renamed from: u */
    public final String m11187u() {
        if (this.f14177s != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        C5692n0 c5692n0 = C5692n0.f14464a;
        String strM11170x = m11170x(C5692n0.m11517h());
        m11165h();
        Uri uri = Uri.parse(m11166i(strM11170x, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: v */
    public final Object m11188v() {
        return this.f14172n;
    }

    /* renamed from: w */
    public final String m11189w() {
        String strM11518i;
        String str = this.f14177s;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f14166h;
        if (this.f14175q == EnumC5655e0.POST && str2 != null && C10546u.m37514p(str2, "/videos", false, 2, null)) {
            C5692n0 c5692n0 = C5692n0.f14464a;
            strM11518i = C5692n0.m11519j();
        } else {
            C5692n0 c5692n02 = C5692n0.f14464a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            strM11518i = C5692n0.m11518i(C5641a0.m11296o());
        }
        String strM11170x = m11170x(strM11518i);
        m11165h();
        return m11166i(strM11170x, false);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC5655e0 enumC5655e0, InterfaceC5631b interfaceC5631b, String str2) {
        this.f14170l = true;
        this.f14165g = accessToken;
        this.f14166h = str;
        this.f14173o = str2;
        m11173D(interfaceC5631b);
        m11176G(enumC5655e0);
        if (bundle != null) {
            this.f14171m = new Bundle(bundle);
        } else {
            this.f14171m = new Bundle();
        }
        if (this.f14173o == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            this.f14173o = C5641a0.m11295n();
        }
    }

    /* compiled from: GraphRequest.kt */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: g */
        private final String f14179g;

        /* renamed from: h */
        private final RESOURCE f14180h;

        /* renamed from: f */
        public static final C5629b f14178f = new C5629b(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C5628a();

        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        public static final class C5628a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            C5628a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
                C9801m.m32346f(parcel, "source");
                return new ParcelableResourceWithMimeType<>(parcel, (C9789g) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?>[] newArray(int i2) {
                return new ParcelableResourceWithMimeType[i2];
            }
        }

        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$b */
        public static final class C5629b {
            private C5629b() {
            }

            public /* synthetic */ C5629b(C9789g c9789g) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C9789g c9789g) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f14179g = str;
            this.f14180h = resource;
        }

        /* renamed from: a */
        public final String m11190a() {
            return this.f14179g;
        }

        /* renamed from: b */
        public final RESOURCE m11191b() {
            return this.f14180h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9801m.m32346f(parcel, "out");
            parcel.writeString(this.f14179g);
            parcel.writeParcelable(this.f14180h, i2);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f14179g = parcel.readString();
            C5641a0 c5641a0 = C5641a0.f14199a;
            this.f14180h = (RESOURCE) parcel.readParcelable(C5641a0.m11284c().getClassLoader());
        }
    }
}
