package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.L;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SimpleCacheSpan.java */
/* loaded from: classes.dex */
final class i extends b2.c {

    /* renamed from: H, reason: collision with root package name */
    private static final Pattern f26286H = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: I, reason: collision with root package name */
    private static final Pattern f26287I = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: J, reason: collision with root package name */
    private static final Pattern f26288J = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private i(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static i s(File file, long j10, long j11, f fVar) {
        File file2;
        String strI;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileX = x(file, fVar);
            if (fileX == null) {
                return null;
            }
            file2 = fileX;
            name = fileX.getName();
        }
        Matcher matcher = f26288J.matcher(name);
        if (!matcher.matches() || (strI = fVar.i(Integer.parseInt((String) C1804a.e(matcher.group(1))))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new i(strI, Long.parseLong((String) C1804a.e(matcher.group(2))), length, j11 == -9223372036854775807L ? Long.parseLong((String) C1804a.e(matcher.group(3))) : j11, file2);
    }

    public static i t(File file, long j10, f fVar) {
        return s(file, j10, -9223372036854775807L, fVar);
    }

    public static i u(String str, long j10, long j11) {
        return new i(str, j10, j11, -9223372036854775807L, null);
    }

    public static i v(String str, long j10) {
        return new i(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File w(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    private static File x(File file, f fVar) {
        String strT1;
        String name = file.getName();
        Matcher matcher = f26287I.matcher(name);
        if (matcher.matches()) {
            strT1 = L.t1((String) C1804a.e(matcher.group(1)));
        } else {
            matcher = f26286H.matcher(name);
            strT1 = matcher.matches() ? (String) C1804a.e(matcher.group(1)) : null;
        }
        if (strT1 == null) {
            return null;
        }
        File fileW = w((File) C1804a.i(file.getParentFile()), fVar.e(strT1), Long.parseLong((String) C1804a.e(matcher.group(2))), Long.parseLong((String) C1804a.e(matcher.group(3))));
        if (file.renameTo(fileW)) {
            return fileW;
        }
        return null;
    }

    public i p(File file, long j10) {
        C1804a.g(this.f30093E);
        return new i(this.f30090B, this.f30091C, this.f30092D, j10, file);
    }
}
