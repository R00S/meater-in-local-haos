package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import g7.C3445p;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import z7.AbstractC5208j;
import z7.C5209k;

/* compiled from: ImageDownload.java */
/* loaded from: classes2.dex */
public class D implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    private final URL f38229B;

    /* renamed from: C, reason: collision with root package name */
    private volatile Future<?> f38230C;

    /* renamed from: D, reason: collision with root package name */
    private AbstractC5208j<Bitmap> f38231D;

    private D(URL url) {
        this.f38229B = url;
    }

    private byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f38229B.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = C2917b.d(C2917b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f38229B);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static D d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new D(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(C5209k c5209k) {
        try {
            c5209k.c(b());
        } catch (Exception e10) {
            c5209k.b(e10);
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f38229B);
        }
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f38229B);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f38229B);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38230C.cancel(true);
    }

    public AbstractC5208j<Bitmap> e() {
        return (AbstractC5208j) C3445p.k(this.f38231D);
    }

    public void g(ExecutorService executorService) {
        final C5209k c5209k = new C5209k();
        this.f38230C = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f38227B.f(c5209k);
            }
        });
        this.f38231D = c5209k.a();
    }
}
