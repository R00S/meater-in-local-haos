package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface Downloader {

    public static class ResponseException extends IOException {
        final boolean localCacheOnly;
        final int responseCode;

        public ResponseException(String str, int i2, int i3) {
            super(str);
            this.localCacheOnly = NetworkPolicy.isOfflineOnly(i2);
            this.responseCode = i3;
        }
    }

    Response load(Uri uri, int i2) throws IOException;

    void shutdown();

    public static class Response {
        final Bitmap bitmap;
        final boolean cached;
        final long contentLength;
        final InputStream stream;

        @Deprecated
        public Response(Bitmap bitmap, boolean z) {
            if (bitmap == null) {
                throw new IllegalArgumentException("Bitmap may not be null.");
            }
            this.stream = null;
            this.bitmap = bitmap;
            this.cached = z;
            this.contentLength = -1L;
        }

        @Deprecated
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public long getContentLength() {
            return this.contentLength;
        }

        public InputStream getInputStream() {
            return this.stream;
        }

        @Deprecated
        public Response(InputStream inputStream, boolean z) {
            this(inputStream, z, -1L);
        }

        @Deprecated
        public Response(Bitmap bitmap, boolean z, long j2) {
            this(bitmap, z);
        }

        public Response(InputStream inputStream, boolean z, long j2) {
            if (inputStream != null) {
                this.stream = inputStream;
                this.bitmap = null;
                this.cached = z;
                this.contentLength = j2;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }
}
