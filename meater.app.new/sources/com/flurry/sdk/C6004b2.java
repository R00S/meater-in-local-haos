package com.flurry.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.b2 */
/* loaded from: classes2.dex */
public final class C6004b2 {

    /* renamed from: a */
    private static String f15679a = "FileUtil";

    /* renamed from: com.flurry.sdk.b2$a */
    static class a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f15680a;

        a(Pattern pattern) {
            this.f15680a = pattern;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return this.f15680a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static File m12967a() {
        return C6002b0.m12964a().getFilesDir();
    }

    /* renamed from: b */
    public static boolean m12968b(File file) {
        if (file == null || file.getAbsoluteFile() == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
            return true;
        }
        C6021d1.m13030c(6, f15679a, "Unable to create persistent dir: ".concat(String.valueOf(parentFile)));
        return false;
    }

    /* renamed from: c */
    public static String[] m12969c(File file, Pattern pattern) {
        if (!file.exists()) {
            return new String[0];
        }
        String[] list = file.list(new a(pattern));
        return list == null ? new String[0] : list;
    }

    @TargetApi(21)
    /* renamed from: d */
    public static File m12970d() {
        File file;
        Context contextM12964a = C6002b0.m12964a();
        if (C6013c2.m12991g(21)) {
            file = contextM12964a.getNoBackupFilesDir();
        } else {
            file = new File(contextM12964a.getFilesDir().getPath() + File.separator + "no_backup");
        }
        return new File(file.getPath() + File.separator + ".flurryNoBackup");
    }

    /* renamed from: e */
    public static boolean m12971e(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        for (String str : file.list()) {
            if (!m12971e(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m12972f(java.io.File r6) {
        /*
            r0 = 4
            r1 = 0
            if (r6 == 0) goto L61
            boolean r2 = r6.exists()
            if (r2 != 0) goto Lb
            goto L61
        Lb:
            java.lang.String r2 = com.flurry.sdk.C6004b2.f15679a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Loading persistent data: "
            r3.<init>(r4)
            java.lang.String r4 = r6.getAbsolutePath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.flurry.sdk.C6021d1.m13030c(r0, r2, r3)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L46
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r6.<init>()     // Catch: java.lang.Throwable -> L44
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L44
        L30:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L44
            if (r3 <= 0) goto L40
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L44
            r5 = 0
            r4.<init>(r2, r5, r3)     // Catch: java.lang.Throwable -> L44
            r6.append(r4)     // Catch: java.lang.Throwable -> L44
            goto L30
        L40:
            com.flurry.sdk.C6013c2.m12990f(r0)
            goto L54
        L44:
            r6 = move-exception
            goto L48
        L46:
            r6 = move-exception
            r0 = r1
        L48:
            r2 = 6
            java.lang.String r3 = com.flurry.sdk.C6004b2.f15679a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.C6021d1.m13031d(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L5c
            com.flurry.sdk.C6013c2.m12990f(r0)
            r6 = r1
        L54:
            if (r6 == 0) goto L5b
            java.lang.String r6 = r6.toString()
            return r6
        L5b:
            return r1
        L5c:
            r6 = move-exception
            com.flurry.sdk.C6013c2.m12990f(r0)
            throw r6
        L61:
            java.lang.String r6 = com.flurry.sdk.C6004b2.f15679a
            java.lang.String r2 = "Persistent file doesn't exist."
            com.flurry.sdk.C6021d1.m13030c(r0, r6, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6004b2.m12972f(java.io.File):java.lang.String");
    }
}
