package com.facebook.p157o0.p165q0;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.C9801m;

/* compiled from: FileDownloadTask.kt */
/* renamed from: com.facebook.o0.q0.k */
/* loaded from: classes2.dex */
public final class AsyncTaskC5906k extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    private final String f15383a;

    /* renamed from: b */
    private final File f15384b;

    /* renamed from: c */
    private final a f15385c;

    /* compiled from: FileDownloadTask.kt */
    /* renamed from: com.facebook.o0.q0.k$a */
    public interface a {
        /* renamed from: a */
        void mo12645a(File file);
    }

    public AsyncTaskC5906k(String str, File file, a aVar) {
        C9801m.m32346f(str, "uriStr");
        C9801m.m32346f(file, "destFile");
        C9801m.m32346f(aVar, "onSuccess");
        this.f15383a = str;
        this.f15384b = file;
        this.f15385c = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(String... strArr) throws IOException {
        C9801m.m32346f(strArr, "args");
        try {
            URL url = new URL(this.f15383a);
            int contentLength = url.openConnection().getContentLength();
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            byte[] bArr = new byte[contentLength];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f15384b));
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
            dataOutputStream.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    protected void m12644b(boolean z) {
        if (z) {
            this.f15385c.mo12645a(this.f15384b);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        m12644b(bool.booleanValue());
    }
}
