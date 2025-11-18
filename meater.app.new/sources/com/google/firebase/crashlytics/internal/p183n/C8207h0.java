package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* renamed from: com.google.firebase.crashlytics.h.n.h0 */
/* loaded from: classes2.dex */
class C8207h0 implements InterfaceC8215l0 {

    /* renamed from: a */
    private final File f30916a;

    /* renamed from: b */
    private final String f30917b;

    /* renamed from: c */
    private final String f30918c;

    C8207h0(String str, String str2, File file) {
        this.f30917b = str;
        this.f30918c = str2;
        this.f30916a = file;
    }

    /* renamed from: d */
    private byte[] m25250d() throws IOException {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamMo25252b = mo25252b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamMo25252b == null) {
                        byteArrayOutputStream.close();
                        if (inputStreamMo25252b != null) {
                            inputStreamMo25252b.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i2 = inputStreamMo25252b.read(bArr);
                            if (i2 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamMo25252b.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i2);
                        } finally {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (inputStreamMo25252b != null) {
                    try {
                        inputStreamMo25252b.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8215l0
    /* renamed from: a */
    public String mo25251a() {
        return this.f30918c;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8215l0
    /* renamed from: b */
    public InputStream mo25252b() {
        if (this.f30916a.exists() && this.f30916a.isFile()) {
            try {
                return new FileInputStream(this.f30916a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8215l0
    /* renamed from: c */
    public AbstractC8258f0.d.b mo25253c() throws IOException {
        byte[] bArrM25250d = m25250d();
        if (bArrM25250d != null) {
            return AbstractC8258f0.d.b.m25675a().mo25679b(bArrM25250d).mo25680c(this.f30917b).mo25678a();
        }
        return null;
    }
}
