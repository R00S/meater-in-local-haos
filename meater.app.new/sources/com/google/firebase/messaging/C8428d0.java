package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzg;
import com.google.android.gms.internal.firebase_messaging.zzh;
import com.google.android.gms.internal.firebase_messaging.zzo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.d0 */
/* loaded from: classes2.dex */
class C8428d0 implements Closeable {

    /* renamed from: f */
    private final URL f31983f;

    /* renamed from: g */
    private Task<Bitmap> f31984g;

    /* renamed from: h */
    private volatile InputStream f31985h;

    private C8428d0(URL url) {
        this.f31983f = url;
    }

    /* renamed from: b */
    private byte[] m26506b() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f31983f.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.f31985h = inputStream;
            byte[] bArrM20938a = zzg.m20938a(zzg.m20939b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String strValueOf = String.valueOf(this.f31983f);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(bArrM20938a.length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrM20938a.length <= 1048576) {
                return bArrM20938a;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    zzo.m20942a(th, th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static C8428d0 m26507c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C8428d0(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    /* renamed from: a */
    public Bitmap m26508a() throws IOException {
        String strValueOf = String.valueOf(this.f31983f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] bArrM26506b = m26506b();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM26506b, 0, bArrM26506b.length);
        if (bitmapDecodeByteArray == null) {
            String strValueOf2 = String.valueOf(this.f31983f);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf3 = String.valueOf(this.f31983f);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            zzh.m20941a(this.f31985h);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }

    /* renamed from: d */
    public Task<Bitmap> m26509d() {
        return (Task) Preconditions.m14372k(this.f31984g);
    }

    /* renamed from: e */
    public void m26510e(Executor executor) {
        this.f31984g = Tasks.m23661c(executor, new Callable(this) { // from class: com.google.firebase.messaging.c0

            /* renamed from: f */
            private final C8428d0 f31979f;

            {
                this.f31979f = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return this.f31979f.m26508a();
            }
        });
    }
}
