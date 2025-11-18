package com.facebook;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse.kt */
/* renamed from: com.facebook.d0 */
/* loaded from: classes.dex */
public final class C5653d0 {

    /* renamed from: a */
    public static final a f14271a = new a(null);

    /* renamed from: b */
    private static final String f14272b = C5653d0.class.getCanonicalName();

    /* renamed from: c */
    private final GraphRequest f14273c;

    /* renamed from: d */
    private final HttpURLConnection f14274d;

    /* renamed from: e */
    private final String f14275e;

    /* renamed from: f */
    private final JSONObject f14276f;

    /* renamed from: g */
    private final JSONArray f14277g;

    /* renamed from: h */
    private final FacebookRequestError f14278h;

    /* renamed from: i */
    private final JSONObject f14279i;

    /* renamed from: j */
    private final JSONArray f14280j;

    /* compiled from: GraphResponse.kt */
    /* renamed from: com.facebook.d0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: b */
        private final C5653d0 m11341b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError facebookRequestErrorM11149a = FacebookRequestError.f14134f.m11149a(jSONObject, obj2, httpURLConnection);
                if (facebookRequestErrorM11149a != null) {
                    Log.e(C5653d0.f14272b, facebookRequestErrorM11149a.toString());
                    if (facebookRequestErrorM11149a.m11140b() == 190) {
                        C5696p0 c5696p0 = C5696p0.f14478a;
                        if (C5696p0.m11552W(graphRequest.m11181l())) {
                            if (facebookRequestErrorM11149a.m11145g() != 493) {
                                AccessToken.f14054f.m11108h(null);
                            } else {
                                AccessToken.C5603c c5603c = AccessToken.f14054f;
                                AccessToken accessTokenM11105e = c5603c.m11105e();
                                if (C9801m.m32341a(accessTokenM11105e != null ? Boolean.valueOf(accessTokenM11105e.m11095n()) : null, Boolean.FALSE)) {
                                    c5603c.m11104d();
                                }
                            }
                        }
                    }
                    return new C5653d0(graphRequest, httpURLConnection, facebookRequestErrorM11149a);
                }
                C5696p0 c5696p02 = C5696p0.f14478a;
                Object objM11543M = C5696p0.m11543M(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objM11543M instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objM11543M;
                    return new C5653d0(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (objM11543M instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM11543M;
                    return new C5653d0(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                obj = JSONObject.NULL;
                C9801m.m32345e(obj, "NULL");
            }
            if (obj == JSONObject.NULL) {
                return new C5653d0(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException(C9801m.m32354n("Got unexpected object type in response, class: ", obj.getClass().getSimpleName()));
        }

        /* renamed from: c */
        private final List<C5653d0> m11342c(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws JSONException, FacebookException {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i2 = 0;
            if (size == 1) {
                GraphRequest graphRequest = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put("code", httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e2) {
                    arrayList.add(new C5653d0(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
                } catch (JSONException e3) {
                    arrayList.add(new C5653d0(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    if (length > 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            GraphRequest graphRequest2 = list.get(i2);
                            try {
                                Object obj3 = ((JSONArray) obj2).get(i2);
                                C9801m.m32345e(obj3, "obj");
                                arrayList.add(m11341b(graphRequest2, httpURLConnection, obj3, obj));
                            } catch (FacebookException e4) {
                                arrayList.add(new C5653d0(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                            } catch (JSONException e5) {
                                arrayList.add(new C5653d0(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e5)));
                            }
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }

        /* renamed from: a */
        public final List<C5653d0> m11343a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            C9801m.m32346f(list, "requests");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C5653d0((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        /* renamed from: d */
        public final List<C5653d0> m11344d(InputStream inputStream, HttpURLConnection httpURLConnection, C5646c0 c5646c0) throws Throwable {
            C9801m.m32346f(c5646c0, "requests");
            C5696p0 c5696p0 = C5696p0.f14478a;
            String strM11593s0 = C5696p0.m11593s0(inputStream);
            C5684j0.f14429a.m11455c(EnumC5659g0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strM11593s0.length()), strM11593s0);
            return m11345e(strM11593s0, httpURLConnection, c5646c0);
        }

        /* renamed from: e */
        public final List<C5653d0> m11345e(String str, HttpURLConnection httpURLConnection, C5646c0 c5646c0) throws JSONException, FacebookException, IOException {
            C9801m.m32346f(str, "responseString");
            C9801m.m32346f(c5646c0, "requests");
            Object objNextValue = new JSONTokener(str).nextValue();
            C9801m.m32345e(objNextValue, "resultObject");
            List<C5653d0> listM11342c = m11342c(httpURLConnection, c5646c0, objNextValue);
            C5684j0.f14429a.m11455c(EnumC5659g0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", c5646c0.m11331v(), Integer.valueOf(str.length()), listM11342c);
            return listM11342c;
        }

        /* renamed from: f */
        public final List<C5653d0> m11346f(HttpURLConnection httpURLConnection, C5646c0 c5646c0) {
            List<C5653d0> listM11343a;
            C9801m.m32346f(httpURLConnection, "connection");
            C9801m.m32346f(c5646c0, "requests");
            InputStream errorStream = null;
            try {
                try {
                    try {
                        C5641a0 c5641a0 = C5641a0.f14199a;
                    } catch (FacebookException e2) {
                        C5684j0.f14429a.m11455c(EnumC5659g0.REQUESTS, "Response", "Response <Error>: %s", e2);
                        listM11343a = m11343a(c5646c0, httpURLConnection, e2);
                    }
                } catch (Exception e3) {
                    C5684j0.f14429a.m11455c(EnumC5659g0.REQUESTS, "Response", "Response <Error>: %s", e3);
                    listM11343a = m11343a(c5646c0, httpURLConnection, new FacebookException(e3));
                }
                if (!C5641a0.m11303v()) {
                    Log.e(C5653d0.f14272b, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                listM11343a = m11344d(errorStream, httpURLConnection, c5646c0);
                return listM11343a;
            } finally {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11570h(null);
            }
        }
    }

    public C5653d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        C9801m.m32346f(graphRequest, "request");
        this.f14273c = graphRequest;
        this.f14274d = httpURLConnection;
        this.f14275e = str;
        this.f14276f = jSONObject;
        this.f14277g = jSONArray;
        this.f14278h = facebookRequestError;
        this.f14279i = jSONObject;
        this.f14280j = jSONArray;
    }

    /* renamed from: b */
    public final FacebookRequestError m11338b() {
        return this.f14278h;
    }

    /* renamed from: c */
    public final JSONObject m11339c() {
        return this.f14276f;
    }

    /* renamed from: d */
    public final JSONObject m11340d() {
        return this.f14279i;
    }

    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f14274d;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            C9801m.m32345e(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f14276f + ", error: " + this.f14278h + "}";
        C9801m.m32345e(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5653d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        C9801m.m32346f(graphRequest, "request");
        C9801m.m32346f(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5653d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        C9801m.m32346f(graphRequest, "request");
        C9801m.m32346f(str, "rawResponse");
        C9801m.m32346f(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5653d0(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        C9801m.m32346f(graphRequest, "request");
        C9801m.m32346f(facebookRequestError, "error");
    }
}
