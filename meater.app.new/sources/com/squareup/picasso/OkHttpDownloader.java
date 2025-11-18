package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.Downloader;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class OkHttpDownloader implements Downloader {
    private final OkHttpClient client;

    public OkHttpDownloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    private static OkHttpClient defaultOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        okHttpClient.setWriteTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    protected final OkHttpClient getClient() {
        return this.client;
    }

    @Override // com.squareup.picasso.Downloader
    public Downloader.Response load(Uri uri, int i2) throws IOException {
        CacheControl cacheControlBuild;
        if (i2 == 0) {
            cacheControlBuild = null;
        } else if (NetworkPolicy.isOfflineOnly(i2)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i2)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i2)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(uri.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseExecute = this.client.newCall(builderUrl.build()).execute();
        int iCode = responseExecute.code();
        if (iCode < 300) {
            boolean z = responseExecute.cacheResponse() != null;
            ResponseBody responseBodyBody = responseExecute.body();
            return new Downloader.Response(responseBodyBody.byteStream(), z, responseBodyBody.contentLength());
        }
        responseExecute.body().close();
        throw new Downloader.ResponseException(iCode + " " + responseExecute.message(), i2, iCode);
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        com.squareup.okhttp.Cache cache = this.client.getCache();
        if (cache != null) {
            try {
                cache.close();
            } catch (IOException unused) {
            }
        }
    }

    public OkHttpDownloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttpDownloader(Context context, long j2) {
        this(Utils.createDefaultCacheDir(context), j2);
    }

    public OkHttpDownloader(File file, long j2) {
        this(defaultOkHttpClient());
        try {
            this.client.setCache(new com.squareup.okhttp.Cache(file, j2));
        } catch (IOException unused) {
        }
    }

    public OkHttpDownloader(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }
}
