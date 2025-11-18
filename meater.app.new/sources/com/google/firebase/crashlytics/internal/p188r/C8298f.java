package com.google.firebase.crashlytics.internal.p188r;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.internal.C8179h;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* renamed from: com.google.firebase.crashlytics.h.r.f */
/* loaded from: classes2.dex */
public class C8298f {

    /* renamed from: a */
    private final File f31557a;

    /* renamed from: b */
    private final File f31558b;

    /* renamed from: c */
    private final File f31559c;

    /* renamed from: d */
    private final File f31560d;

    /* renamed from: e */
    private final File f31561e;

    /* renamed from: f */
    private final File f31562f;

    public C8298f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f31557a = filesDir;
        if (m25994v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m25993u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileM25989q = m25989q(new File(filesDir, str));
        this.f31558b = fileM25989q;
        this.f31559c = m25989q(new File(fileM25989q, "open-sessions"));
        this.f31560d = m25989q(new File(fileM25989q, "reports"));
        this.f31561e = m25989q(new File(fileM25989q, "priority-reports"));
        this.f31562f = m25989q(new File(fileM25989q, "native-reports"));
    }

    /* renamed from: a */
    private void m25987a(File file) {
        if (file.exists() && m25991s(file)) {
            C8179h.m25176f().m25177b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m25988n(String str) {
        return m25990r(new File(this.f31559c, str));
    }

    /* renamed from: q */
    private static synchronized File m25989q(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            C8179h.m25176f().m25177b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
            file.delete();
        }
        if (!file.mkdirs()) {
            C8179h.m25176f().m25179d("Could not create Crashlytics-specific directory: " + file);
        }
        return file;
    }

    /* renamed from: r */
    private static File m25990r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    static boolean m25991s(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m25991s(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static <T> List<T> m25992t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: u */
    static String m25993u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: v */
    private static boolean m25994v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void m25995b() {
        m25987a(new File(this.f31557a, ".com.google.firebase.crashlytics"));
        m25987a(new File(this.f31557a, ".com.google.firebase.crashlytics-ndk"));
        if (m25994v()) {
            m25987a(new File(this.f31557a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean m25996c(String str) {
        return m25991s(new File(this.f31559c, str));
    }

    /* renamed from: d */
    public List<String> m25997d() {
        return m25992t(this.f31559c.list());
    }

    /* renamed from: e */
    public File m25998e(String str) {
        return new File(this.f31558b, str);
    }

    /* renamed from: f */
    public List<File> m25999f(FilenameFilter filenameFilter) {
        return m25992t(this.f31558b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File m26000g(String str) {
        return new File(this.f31562f, str);
    }

    /* renamed from: h */
    public List<File> m26001h() {
        return m25992t(this.f31562f.listFiles());
    }

    /* renamed from: i */
    public File m26002i(String str) {
        return m25990r(new File(m25988n(str), "native"));
    }

    /* renamed from: j */
    public File m26003j(String str) {
        return new File(this.f31561e, str);
    }

    /* renamed from: k */
    public List<File> m26004k() {
        return m25992t(this.f31561e.listFiles());
    }

    /* renamed from: l */
    public File m26005l(String str) {
        return new File(this.f31560d, str);
    }

    /* renamed from: m */
    public List<File> m26006m() {
        return m25992t(this.f31560d.listFiles());
    }

    /* renamed from: o */
    public File m26007o(String str, String str2) {
        return new File(m25988n(str), str2);
    }

    /* renamed from: p */
    public List<File> m26008p(String str, FilenameFilter filenameFilter) {
        return m25992t(m25988n(str).listFiles(filenameFilter));
    }
}
