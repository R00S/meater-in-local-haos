package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import com.squareup.picasso.Downloader;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class UrlConnectionDownloader implements Downloader {
    private static final String FORCE_CACHE = "only-if-cached,max-age=2147483647";
    static final String RESPONSE_SOURCE = "X-Android-Response-Source";
    static volatile Object cache;
    private final Context context;
    private static final Object lock = new Object();
    private static final ThreadLocal<StringBuilder> CACHE_HEADER_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.UrlConnectionDownloader.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    private static class ResponseCacheIcs {
        private ResponseCacheIcs() {
        }

        static void close(Object obj) throws IOException {
            try {
                ((HttpResponseCache) obj).close();
            } catch (IOException unused) {
            }
        }

        static Object install(Context context) throws IOException {
            File fileCreateDefaultCacheDir = Utils.createDefaultCacheDir(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(fileCreateDefaultCacheDir, Utils.calculateDiskCacheSize(fileCreateDefaultCacheDir)) : installed;
        }
    }

    public UrlConnectionDownloader(Context context) {
        this.context = context.getApplicationContext();
    }

    private static void installCacheIfNeeded(Context context) {
        if (cache == null) {
            try {
                synchronized (lock) {
                    if (cache == null) {
                        cache = ResponseCacheIcs.install(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.squareup.picasso.Downloader
    public Downloader.Response load(Uri uri, int i2) throws IOException {
        String string;
        if (Build.VERSION.SDK_INT >= 14) {
            installCacheIfNeeded(this.context);
        }
        HttpURLConnection httpURLConnectionOpenConnection = openConnection(uri);
        httpURLConnectionOpenConnection.setUseCaches(true);
        if (i2 != 0) {
            if (NetworkPolicy.isOfflineOnly(i2)) {
                string = FORCE_CACHE;
            } else {
                StringBuilder sb = CACHE_HEADER_BUILDER.get();
                sb.setLength(0);
                if (!NetworkPolicy.shouldReadFromDiskCache(i2)) {
                    sb.append("no-cache");
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i2)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                string = sb.toString();
            }
            httpURLConnectionOpenConnection.setRequestProperty("Cache-Control", string);
        }
        int responseCode = httpURLConnectionOpenConnection.getResponseCode();
        if (responseCode < 300) {
            return new Downloader.Response(httpURLConnectionOpenConnection.getInputStream(), Utils.parseResponseSourceHeader(httpURLConnectionOpenConnection.getHeaderField(RESPONSE_SOURCE)), httpURLConnectionOpenConnection.getHeaderFieldInt("Content-Length", -1));
        }
        httpURLConnectionOpenConnection.disconnect();
        throw new Downloader.ResponseException(responseCode + " " + httpURLConnectionOpenConnection.getResponseMessage(), i2, responseCode);
    }

    protected HttpURLConnection openConnection(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() throws IOException {
        if (Build.VERSION.SDK_INT < 14 || cache == null) {
            return;
        }
        ResponseCacheIcs.close(cache);
    }
}
