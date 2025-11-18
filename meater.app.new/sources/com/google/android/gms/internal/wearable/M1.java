package com.google.android.gms.internal.wearable;

import A7.C0854h;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class M1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static File a(ParcelFileDescriptor parcelFileDescriptor, File file) throws IOException {
        IOException e10;
        FileOutputStream fileOutputStream;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            file.mkdirs();
            File fileCreateTempFile = File.createTempFile("asset", ".tmp", file);
            C0854h c0854h = 0;
            try {
                try {
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    b(autoCloseInputStream);
                    b(c0854h);
                    fileCreateTempFile.delete();
                    throw th;
                }
                try {
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int i10 = autoCloseInputStream.read(bArr);
                        if (i10 < 0) {
                            b(autoCloseInputStream);
                            b(fileOutputStream);
                            return fileCreateTempFile;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                th = th2;
                c0854h = ".tmp";
                b(autoCloseInputStream);
                b(c0854h);
                fileCreateTempFile.delete();
                throw th;
            }
        } finally {
            b(autoCloseInputStream);
        }
    }

    private static void b(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
