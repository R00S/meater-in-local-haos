package Q8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: NativeSessionFileGzipper.java */
/* loaded from: classes2.dex */
class P {
    private static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        C1622j.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C1622j.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void b(File file, List<O> list) throws IOException {
        for (O o10 : list) {
            InputStream inputStreamK = null;
            try {
                inputStreamK = o10.k();
                if (inputStreamK != null) {
                    a(inputStreamK, new File(file, o10.l()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1622j.g(null);
                throw th;
            }
            C1622j.g(inputStreamK);
        }
    }
}
