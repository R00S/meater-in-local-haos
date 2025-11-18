package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: classes.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0387a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation.java */
    private static class b {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(Build.VERSION.SDK_INT >= 34 ? b.a(context).getCacheDir() : C0387a.a(b.a(context)))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
