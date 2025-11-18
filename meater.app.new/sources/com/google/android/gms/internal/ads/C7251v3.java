package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.v3 */
/* loaded from: classes2.dex */
final class C7251v3 extends FilterInputStream {

    /* renamed from: f */
    private final HttpURLConnection f20718f;

    C7251v3(HttpURLConnection httpURLConnection) {
        super(zzat.m16931c(httpURLConnection));
        this.f20718f = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f20718f.disconnect();
    }
}
