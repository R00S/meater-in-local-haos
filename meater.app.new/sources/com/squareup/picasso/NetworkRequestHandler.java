package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class NetworkRequestHandler extends RequestHandler {
    static final int RETRY_COUNT = 2;
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i2) throws IOException {
        Downloader.Response responseLoad = this.downloader.load(request.uri, request.networkPolicy);
        if (responseLoad == null) {
            return null;
        }
        Picasso.LoadedFrom loadedFrom = responseLoad.cached ? Picasso.LoadedFrom.DISK : Picasso.LoadedFrom.NETWORK;
        Bitmap bitmap = responseLoad.getBitmap();
        if (bitmap != null) {
            return new RequestHandler.Result(bitmap, loadedFrom);
        }
        InputStream inputStream = responseLoad.getInputStream();
        if (inputStream == null) {
            return null;
        }
        if (loadedFrom == Picasso.LoadedFrom.DISK && responseLoad.getContentLength() == 0) {
            Utils.closeQuietly(inputStream);
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && responseLoad.getContentLength() > 0) {
            this.stats.dispatchDownloadFinished(responseLoad.getContentLength());
        }
        return new RequestHandler.Result(inputStream, loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
        return true;
    }
}
