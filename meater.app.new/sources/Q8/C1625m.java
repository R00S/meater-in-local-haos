package Q8;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: CrashlyticsAppQualitySessionsStore.java */
/* renamed from: Q8.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1625m {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f14473d = new FilenameFilter() { // from class: Q8.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C1625m.d(file, str);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<File> f14474e = new Comparator() { // from class: Q8.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1625m.e((File) obj, (File) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final W8.g f14475a;

    /* renamed from: b, reason: collision with root package name */
    private String f14476b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f14477c = null;

    C1625m(W8.g gVar) {
        this.f14475a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(W8.g gVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            N8.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String g(W8.g gVar, String str) {
        List<File> listR = gVar.r(str, f14473d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f14474e)).getName().substring(4);
        }
        N8.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f14476b, str)) {
            return this.f14477c;
        }
        return g(this.f14475a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f14477c, str)) {
            f(this.f14475a, this.f14476b, str);
            this.f14477c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f14476b, str)) {
            f(this.f14475a, str, this.f14477c);
            this.f14476b = str;
        }
    }
}
