package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: Installation.java */
/* renamed from: io.sentry.android.core.a1 */
/* loaded from: classes2.dex */
final class C9262a1 {

    /* renamed from: a */
    static String f35857a;

    /* renamed from: b */
    private static final Charset f35858b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static synchronized String m30148a(Context context) throws RuntimeException {
        if (f35857a == null) {
            File file = new File(context.getFilesDir(), "INSTALLATION");
            try {
                if (!file.exists()) {
                    String strM30150c = m30150c(file);
                    f35857a = strM30150c;
                    return strM30150c;
                }
                f35857a = m30149b(file);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return f35857a;
    }

    /* renamed from: b */
    static String m30149b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f35858b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    static String m30150c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String string = UUID.randomUUID().toString();
            fileOutputStream.write(string.getBytes(f35858b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return string;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
