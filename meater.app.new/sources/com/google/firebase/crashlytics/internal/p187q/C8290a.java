package com.google.firebase.crashlytics.internal.p187q;

import com.google.firebase.crashlytics.internal.C8179h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.HttpUrl;

/* compiled from: HttpGetRequest.java */
/* renamed from: com.google.firebase.crashlytics.h.q.a */
/* loaded from: classes2.dex */
public class C8290a {

    /* renamed from: a */
    private final String f31539a;

    /* renamed from: b */
    private final Map<String, String> f31540b;

    /* renamed from: c */
    private final Map<String, String> f31541c = new HashMap();

    public C8290a(String str, Map<String, String> map) {
        this.f31539a = str;
        this.f31540b = map;
    }

    /* renamed from: a */
    private String m25948a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        sb.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), "UTF-8") : HttpUrl.FRAGMENT_ENCODE_SET);
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append("&");
            sb.append(next2.getKey());
            sb.append("=");
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), "UTF-8") : HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private String m25949b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strM25948a = m25948a(map);
        if (strM25948a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strM25948a;
        }
        if (!str.endsWith("&")) {
            strM25948a = "&" + strM25948a;
        }
        return str + strM25948a;
    }

    /* renamed from: e */
    private String m25950e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i2);
        }
    }

    /* renamed from: c */
    public C8292c m25951c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String strM25950e = null;
        inputStream = null;
        try {
            String strM25949b = m25949b(this.f31539a, this.f31540b);
            C8179h.m25176f().m25183i("GET Request URL: " + strM25949b);
            httpsURLConnection = (HttpsURLConnection) new URL(strM25949b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f31541c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strM25950e = m25950e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C8292c(responseCode, strM25950e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C8290a m25952d(String str, String str2) {
        this.f31541c.put(str, str2);
        return this;
    }
}
