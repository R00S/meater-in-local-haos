package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import m6.EnumC3966a;
import s6.C4488h;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes2.dex */
public class j implements d<InputStream> {

    /* renamed from: H, reason: collision with root package name */
    static final b f33047H = new a();

    /* renamed from: B, reason: collision with root package name */
    private final C4488h f33048B;

    /* renamed from: C, reason: collision with root package name */
    private final int f33049C;

    /* renamed from: D, reason: collision with root package name */
    private final b f33050D;

    /* renamed from: E, reason: collision with root package name */
    private HttpURLConnection f33051E;

    /* renamed from: F, reason: collision with root package name */
    private InputStream f33052F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f33053G;

    /* compiled from: HttpUrlFetcher.java */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    interface b {
        HttpURLConnection a(URL url);
    }

    public j(C4488h c4488h, int i10) {
        this(c4488h, i10, f33047H);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.f33050D.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f33049C);
            httpURLConnectionA.setReadTimeout(this.f33049C);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f33052F = H6.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f33052F = httpURLConnection.getInputStream();
            }
            return this.f33052F;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map<String, String> map) throws IOException {
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f33051E = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f33052F = this.f33051E.getInputStream();
            if (this.f33053G) {
                return null;
            }
            int iF = f(this.f33051E);
            if (h(iF)) {
                return g(this.f33051E);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.f33051E.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f33051E.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", f(this.f33051E), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f33052F;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f33051E;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f33051E = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f33053G = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3966a d() {
        return EnumC3966a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long jB = H6.g.b();
        try {
            try {
                aVar.f(j(this.f33048B.h(), 0, null, this.f33048B.e()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb2 = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(H6.g.a(jB));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + H6.g.a(jB));
            }
            throw th;
        }
    }

    j(C4488h c4488h, int i10, b bVar) {
        this.f33048B = c4488h;
        this.f33049C = i10;
        this.f33050D = bVar;
    }
}
