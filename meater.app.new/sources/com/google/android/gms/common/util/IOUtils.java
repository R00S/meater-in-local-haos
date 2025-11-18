package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m14630a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static long m14631b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m14632c(inputStream, outputStream, false, 1024);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static long m14632c(InputStream inputStream, OutputStream outputStream, boolean z, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        long j2 = 0;
        while (true) {
            try {
                int i3 = inputStream.read(bArr, 0, i2);
                if (i3 == -1) {
                    break;
                }
                j2 += i3;
                outputStream.write(bArr, 0, i3);
            } catch (Throwable th) {
                if (z) {
                    m14630a(inputStream);
                    m14630a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m14630a(inputStream);
            m14630a(outputStream);
        }
        return j2;
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: d */
    public static byte[] m14633d(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m14632c(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
