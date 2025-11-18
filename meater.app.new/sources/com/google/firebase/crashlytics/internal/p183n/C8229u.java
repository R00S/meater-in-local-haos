package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p024c.p052i.p059j.C0953c;

/* compiled from: CrashlyticsAppQualitySessionsStore.java */
/* renamed from: com.google.firebase.crashlytics.h.n.u */
/* loaded from: classes2.dex */
class C8229u {

    /* renamed from: a */
    private static final FilenameFilter f30978a = new FilenameFilter() { // from class: com.google.firebase.crashlytics.h.n.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* renamed from: b */
    private static final Comparator<File> f30979b = new Comparator() { // from class: com.google.firebase.crashlytics.h.n.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C8229u.m25358c((File) obj, (File) obj2);
        }
    };

    /* renamed from: c */
    private final C8298f f30980c;

    /* renamed from: d */
    private String f30981d = null;

    /* renamed from: e */
    private String f30982e = null;

    C8229u(C8298f c8298f) {
        this.f30980c = c8298f;
    }

    /* renamed from: c */
    static /* synthetic */ int m25358c(File file, File file2) {
        return (file2.lastModified() > file.lastModified() ? 1 : (file2.lastModified() == file.lastModified() ? 0 : -1));
    }

    /* renamed from: d */
    private static void m25359d(C8298f c8298f, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c8298f.m26007o(str, "aqs." + str2).createNewFile();
        } catch (IOException e2) {
            C8179h.m25176f().m25186l("Failed to persist App Quality Sessions session id.", e2);
        }
    }

    /* renamed from: e */
    static String m25360e(C8298f c8298f, String str) {
        List<File> listM26008p = c8298f.m26008p(str, f30978a);
        if (!listM26008p.isEmpty()) {
            return ((File) Collections.min(listM26008p, f30979b)).getName().substring(4);
        }
        C8179h.m25176f().m25185k("Unable to read App Quality Sessions session id.");
        return null;
    }

    /* renamed from: a */
    public synchronized String m25361a(String str) {
        if (C0953c.m6055a(this.f30981d, str)) {
            return this.f30982e;
        }
        return m25360e(this.f30980c, str);
    }

    /* renamed from: f */
    public synchronized void m25362f(String str) {
        if (!C0953c.m6055a(this.f30982e, str)) {
            m25359d(this.f30980c, this.f30981d, str);
            this.f30982e = str;
        }
    }

    /* renamed from: g */
    public synchronized void m25363g(String str) {
        if (!C0953c.m6055a(this.f30981d, str)) {
            m25359d(this.f30980c, str, this.f30982e);
            this.f30981d = str;
        }
    }
}
