package com.airbnb.lottie.p116t;

import android.content.Context;
import cm.aptoide.p092pt.utils.MultiDexHelper;
import com.airbnb.lottie.C5179c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0955e;

/* compiled from: NetworkCache.java */
/* renamed from: com.airbnb.lottie.t.b */
/* loaded from: classes.dex */
class C5277b {

    /* renamed from: a */
    private final Context f12894a;

    /* renamed from: b */
    private final String f12895b;

    C5277b(Context context, String str) {
        this.f12894a = context.getApplicationContext();
        this.f12895b = str;
    }

    /* renamed from: b */
    private static String m9762b(String str, EnumC5276a enumC5276a, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", HttpUrl.FRAGMENT_ENCODE_SET));
        sb.append(z ? enumC5276a.f12893i : enumC5276a.m9761g());
        return sb.toString();
    }

    /* renamed from: c */
    private File m9763c(String str) throws FileNotFoundException {
        File file = new File(this.f12894a.getCacheDir(), m9762b(str, EnumC5276a.Json, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f12894a.getCacheDir(), m9762b(str, EnumC5276a.Zip, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: a */
    C0955e<EnumC5276a, InputStream> m9764a() {
        try {
            File fileM9763c = m9763c(this.f12895b);
            if (fileM9763c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileM9763c);
            EnumC5276a enumC5276a = fileM9763c.getAbsolutePath().endsWith(MultiDexHelper.EXTRACTED_SUFFIX) ? EnumC5276a.Zip : EnumC5276a.Json;
            C5179c.m9392b("Cache hit for " + this.f12895b + " at " + fileM9763c.getAbsolutePath());
            return new C0955e<>(enumC5276a, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    void m9765d(EnumC5276a enumC5276a) {
        File file = new File(this.f12894a.getCacheDir(), m9762b(this.f12895b, enumC5276a, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", HttpUrl.FRAGMENT_ENCODE_SET));
        boolean zRenameTo = file.renameTo(file2);
        C5179c.m9392b("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        C5179c.m9394d("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* renamed from: e */
    File m9766e(InputStream inputStream, EnumC5276a enumC5276a) throws IOException {
        File file = new File(this.f12894a.getCacheDir(), m9762b(this.f12895b, enumC5276a, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
