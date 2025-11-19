package U3;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: NetworkCache.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final e f17542a;

    public g(e eVar) {
        this.f17542a = eVar;
    }

    private static String b(String str, c cVar, boolean z10) throws NoSuchAlgorithmException {
        String strJ = z10 ? cVar.j() : cVar.f17541B;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strJ.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strJ;
    }

    private File c(String str) {
        File file = new File(e(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(e(), b(str, c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private static String d(String str, int i10) throws NoSuchAlgorithmException {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i10);
        }
    }

    private File e() {
        File fileA = this.f17542a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    Pair<c, InputStream> a(String str) {
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileC);
            c cVar = fileC.getAbsolutePath().endsWith(".zip") ? c.ZIP : fileC.getAbsolutePath().endsWith(".gz") ? c.GZIP : c.JSON;
            X3.d.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, c cVar) throws NoSuchAlgorithmException {
        File file = new File(e(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        X3.d.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        X3.d.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File g(String str, InputStream inputStream, c cVar) throws NoSuchAlgorithmException, IOException {
        File file = new File(e(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
