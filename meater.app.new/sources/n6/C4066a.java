package n6;

import java.io.File;

/* compiled from: FileService.java */
/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C4066a {
    C4066a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
