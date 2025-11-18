package d8;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3079w {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39790a;

    C3079w(Context context) {
        this.f39790a = context;
    }

    private static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jB = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jB += b(file2);
            }
        }
        return jB;
    }

    final long a() {
        return b(new File(this.f39790a.getFilesDir(), "assetpacks"));
    }
}
