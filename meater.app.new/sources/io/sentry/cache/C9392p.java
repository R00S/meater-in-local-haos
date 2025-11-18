package io.sentry.cache;

import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9504l2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* compiled from: CacheUtils.java */
/* renamed from: io.sentry.cache.p */
/* loaded from: classes2.dex */
final class C9392p {

    /* renamed from: a */
    private static final Charset f36234a = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m30620a(C9680x4 c9680x4, String str, String str2) {
        File fileM30621b = m30621b(c9680x4, str);
        if (fileM30621b == null) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileM30621b, str2);
        if (file.exists()) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "Deleting %s from scope cache", str2);
            if (file.delete()) {
                return;
            }
            c9680x4.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    private static File m30621b(C9680x4 c9680x4, String str) {
        String cacheDirPath = c9680x4.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    /* renamed from: c */
    static <T, R> T m30622c(C9680x4 c9680x4, String str, String str2, Class<T> cls, InterfaceC9504l2<R> interfaceC9504l2) {
        File fileM30621b = m30621b(c9680x4, str);
        if (fileM30621b == null) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileM30621b, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f36234a));
                try {
                    if (interfaceC9504l2 == null) {
                        T t = (T) c9680x4.getSerializer().mo30489c(bufferedReader, cls);
                        bufferedReader.close();
                        return t;
                    }
                    T t2 = (T) c9680x4.getSerializer().mo30491e(bufferedReader, cls, interfaceC9504l2);
                    bufferedReader.close();
                    return t2;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c9680x4.getLogger().mo30212a(EnumC9587s4.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    /* renamed from: d */
    static <T> void m30623d(C9680x4 c9680x4, T t, String str, String str2) {
        File fileM30621b = m30621b(c9680x4, str);
        if (fileM30621b == null) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file = new File(fileM30621b, str2);
        if (file.exists()) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file.delete()) {
                c9680x4.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f36234a));
                try {
                    c9680x4.getSerializer().mo30487a(t, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            c9680x4.getLogger().mo30212a(EnumC9587s4.ERROR, th3, "Error persisting entity: %s", str2);
        }
    }
}
