package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* renamed from: com.google.firebase.crashlytics.h.n.r */
/* loaded from: classes2.dex */
class C8226r implements InterfaceC8215l0 {

    /* renamed from: a */
    private final byte[] f30960a;

    /* renamed from: b */
    private final String f30961b;

    /* renamed from: c */
    private final String f30962c;

    C8226r(String str, String str2, byte[] bArr) {
        this.f30961b = str;
        this.f30962c = str2;
        this.f30960a = bArr;
    }

    /* renamed from: d */
    private byte[] m25322d() throws IOException {
        if (m25323e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f30960a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m25323e() {
        byte[] bArr = this.f30960a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8215l0
    /* renamed from: a */
    public String mo25251a() {
        return this.f30962c;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8215l0
    /* renamed from: b */
    public InputStream mo25252b() {
        if (m25323e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f30960a);
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8215l0
    /* renamed from: c */
    public AbstractC8258f0.d.b mo25253c() throws IOException {
        byte[] bArrM25322d = m25322d();
        if (bArrM25322d == null) {
            return null;
        }
        return AbstractC8258f0.d.b.m25675a().mo25679b(bArrM25322d).mo25680c(this.f30961b).mo25678a();
    }
}
