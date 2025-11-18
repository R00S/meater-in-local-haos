package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@zzard
/* loaded from: classes2.dex */
public final class zzazx {

    /* renamed from: b */
    private static boolean f22744b = false;

    /* renamed from: c */
    private static boolean f22745c = false;

    /* renamed from: f */
    private final List<String> f22748f;

    /* renamed from: a */
    private static Object f22743a = new Object();

    /* renamed from: d */
    private static Clock f22746d = DefaultClock.m14620c();

    /* renamed from: e */
    private static final Set<String> f22747e = new HashSet(Arrays.asList(new String[0]));

    public zzazx() {
        this(null);
    }

    /* renamed from: a */
    public static boolean m17324a() {
        boolean z;
        synchronized (f22743a) {
            z = f22744b && f22745c;
        }
        return z;
    }

    /* renamed from: b */
    static final /* synthetic */ void m17325b(int i2, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i2);
        jsonWriter.endObject();
        m17326c(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: c */
    private static void m17326c(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f22747e.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        zzbad.m17351g("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* renamed from: d */
    static final /* synthetic */ void m17327d(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: e */
    private final void m17328e(String str, InterfaceC6884l6 interfaceC6884l6) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f22746d.mo14608a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f22748f.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            interfaceC6884l6.mo15260a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzbad.m17347c("unable to log", e2);
        }
        m17336r(stringWriter.toString());
    }

    /* renamed from: g */
    static final /* synthetic */ void m17329g(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(DeepLinkIntentReceiver.DeepLinksKeys.URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m17326c(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.m14602a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: k */
    static final /* synthetic */ void m17330k(byte[] bArr, JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String strM14602a = Base64Utils.m14602a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(strM14602a);
        } else {
            String strM17315t = zzazt.m17315t(strM14602a);
            if (strM17315t != null) {
                jsonWriter.name("bodydigest").value(strM17315t);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    /* renamed from: l */
    public static void m17331l(boolean z) {
        synchronized (f22743a) {
            f22744b = true;
            f22745c = z;
        }
    }

    /* renamed from: m */
    private final void m17332m(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) throws IOException {
        m17328e("onNetworkRequest", new InterfaceC6884l6(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.h6

            /* renamed from: a */
            private final String f19059a;

            /* renamed from: b */
            private final String f19060b;

            /* renamed from: c */
            private final Map f19061c;

            /* renamed from: d */
            private final byte[] f19062d;

            {
                this.f19059a = str;
                this.f19060b = str2;
                this.f19061c = map;
                this.f19062d = bArr;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC6884l6
            /* renamed from: a */
            public final void mo15260a(JsonWriter jsonWriter) throws IOException {
                zzazx.m17329g(this.f19059a, this.f19060b, this.f19061c, this.f19062d, jsonWriter);
            }
        });
    }

    /* renamed from: n */
    private final void m17333n(final Map<String, ?> map, final int i2) throws IOException {
        m17328e("onNetworkResponse", new InterfaceC6884l6(i2, map) { // from class: com.google.android.gms.internal.ads.i6

            /* renamed from: a */
            private final int f19293a;

            /* renamed from: b */
            private final Map f19294b;

            {
                this.f19293a = i2;
                this.f19294b = map;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC6884l6
            /* renamed from: a */
            public final void mo15260a(JsonWriter jsonWriter) throws IOException {
                zzazx.m17325b(this.f19293a, this.f19294b, jsonWriter);
            }
        });
    }

    /* renamed from: o */
    public static boolean m17334o(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21642I1)).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            zzbad.m17348d("Fail to determine debug setting.", e2);
            return false;
        }
    }

    /* renamed from: q */
    private final void m17335q(final String str) throws IOException {
        m17328e("onNetworkRequestError", new InterfaceC6884l6(str) { // from class: com.google.android.gms.internal.ads.k6

            /* renamed from: a */
            private final String f19522a;

            {
                this.f19522a = str;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC6884l6
            /* renamed from: a */
            public final void mo15260a(JsonWriter jsonWriter) throws IOException {
                zzazx.m17327d(this.f19522a, jsonWriter);
            }
        });
    }

    /* renamed from: r */
    private static synchronized void m17336r(String str) {
        zzbad.m17352h("GMA Debug BEGIN");
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 4000;
            String strValueOf = String.valueOf(str.substring(i2, Math.min(i3, str.length())));
            zzbad.m17352h(strValueOf.length() != 0 ? "GMA Debug CONTENT ".concat(strValueOf) : new String("GMA Debug CONTENT "));
            i2 = i3;
        }
        zzbad.m17352h("GMA Debug FINISH");
    }

    /* renamed from: t */
    public static void m17337t() {
        synchronized (f22743a) {
            f22744b = false;
            f22745c = false;
            zzbad.m17353i("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: u */
    public static boolean m17338u() {
        boolean z;
        synchronized (f22743a) {
            z = f22744b;
        }
        return z;
    }

    /* renamed from: f */
    public final void m17339f(String str, String str2, Map<String, ?> map, byte[] bArr) throws IOException {
        if (m17324a()) {
            m17332m(str, str2, map, bArr);
        }
    }

    /* renamed from: h */
    public final void m17340h(HttpURLConnection httpURLConnection, int i2) throws IOException {
        if (m17324a()) {
            String responseMessage = null;
            m17333n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i2);
            if (i2 < 200 || i2 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String strValueOf = String.valueOf(e2.getMessage());
                    zzbad.m17353i(strValueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(strValueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m17335q(responseMessage);
            }
        }
    }

    /* renamed from: i */
    public final void m17341i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (m17324a()) {
            m17332m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: j */
    public final void m17342j(Map<String, ?> map, int i2) throws IOException {
        if (m17324a()) {
            m17333n(map, i2);
            if (i2 < 200 || i2 >= 300) {
                m17335q(null);
            }
        }
    }

    /* renamed from: p */
    public final void m17343p(String str) throws IOException {
        if (m17324a() && str != null) {
            m17344s(str.getBytes());
        }
    }

    /* renamed from: s */
    public final void m17344s(final byte[] bArr) throws IOException {
        m17328e("onNetworkResponseBody", new InterfaceC6884l6(bArr) { // from class: com.google.android.gms.internal.ads.j6

            /* renamed from: a */
            private final byte[] f19461a;

            {
                this.f19461a = bArr;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC6884l6
            /* renamed from: a */
            public final void mo15260a(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
                zzazx.m17330k(this.f19461a, jsonWriter);
            }
        });
    }

    public zzazx(String str) {
        List<String> listAsList;
        if (m17324a()) {
            String[] strArr = new String[1];
            String strValueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = strValueOf.length() != 0 ? "network_request_".concat(strValueOf) : new String("network_request_");
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = new ArrayList<>();
        }
        this.f22748f = listAsList;
    }
}
