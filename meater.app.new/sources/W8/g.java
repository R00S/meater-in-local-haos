package W8;

import N8.j;
import Q8.C1622j;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f18465a;

    /* renamed from: b, reason: collision with root package name */
    private final File f18466b;

    /* renamed from: c, reason: collision with root package name */
    private final File f18467c;

    /* renamed from: d, reason: collision with root package name */
    private final File f18468d;

    /* renamed from: e, reason: collision with root package name */
    private final File f18469e;

    /* renamed from: f, reason: collision with root package name */
    private final File f18470f;

    /* renamed from: g, reason: collision with root package name */
    private final File f18471g;

    public g(Context context) {
        String str;
        String strD = j.f12581a.e(context).d();
        this.f18465a = strD;
        File filesDir = context.getFilesDir();
        this.f18466b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileT = t(new File(filesDir, str));
        this.f18467c = fileT;
        this.f18468d = t(new File(fileT, "open-sessions"));
        this.f18469e = t(new File(fileT, "reports"));
        this.f18470f = t(new File(fileT, "priority-reports"));
        this.f18471g = t(new File(fileT, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f18466b, str);
        if (file.exists() && v(file)) {
            N8.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f18466b.exists() || (list = this.f18466b.list(new FilenameFilter() { // from class: W8.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return g.s(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return u(new File(this.f18468d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                N8.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                N8.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> w(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    static String x(String str) {
        return str.length() > 40 ? C1622j.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f18465a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f18468d, str));
    }

    public List<String> f() {
        return w(this.f18468d.list());
    }

    public File g(String str) {
        return new File(this.f18467c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return w(this.f18467c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f18471g, str);
    }

    public List<File> j() {
        return w(this.f18471g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f18470f, str);
    }

    public List<File> m() {
        return w(this.f18470f.listFiles());
    }

    public File n(String str) {
        return new File(this.f18469e, str);
    }

    public List<File> o() {
        return w(this.f18469e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
