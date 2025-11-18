package xc;

import Cc.B;
import Cc.o;
import Cc.p;
import Cc.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: FileSystem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lxc/a;", "", "Ljava/io/File;", "file", "LCc/B;", "a", "(Ljava/io/File;)LCc/B;", "LCc/z;", "b", "(Ljava/io/File;)LCc/z;", "g", "Loa/F;", "f", "(Ljava/io/File;)V", "", "d", "(Ljava/io/File;)Z", "", "h", "(Ljava/io/File;)J", "from", "to", "e", "(Ljava/io/File;Ljava/io/File;)V", "directory", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5088a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f52922a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC5088a f52921b = new Companion.C0773a();

    /* compiled from: FileSystem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Lxc/a$a;", "", "<init>", "()V", "Lxc/a;", "SYSTEM", "Lxc/a;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: xc.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f52922a = new Companion();

        /* compiled from: FileSystem.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxc/a$a$a;", "Lxc/a;", "<init>", "()V", "Ljava/io/File;", "file", "LCc/B;", "a", "(Ljava/io/File;)LCc/B;", "LCc/z;", "b", "(Ljava/io/File;)LCc/z;", "g", "Loa/F;", "f", "(Ljava/io/File;)V", "", "d", "(Ljava/io/File;)Z", "", "h", "(Ljava/io/File;)J", "from", "to", "e", "(Ljava/io/File;Ljava/io/File;)V", "directory", "c", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: xc.a$a$a, reason: collision with other inner class name */
        private static final class C0773a implements InterfaceC5088a {
            @Override // xc.InterfaceC5088a
            public B a(File file) {
                C3862t.g(file, "file");
                return o.j(file);
            }

            @Override // xc.InterfaceC5088a
            public z b(File file) {
                C3862t.g(file, "file");
                try {
                    return p.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return p.g(file, false, 1, null);
                }
            }

            @Override // xc.InterfaceC5088a
            public void c(File directory) throws IOException {
                C3862t.g(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        C3862t.f(file, "file");
                        c(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // xc.InterfaceC5088a
            public boolean d(File file) {
                C3862t.g(file, "file");
                return file.exists();
            }

            @Override // xc.InterfaceC5088a
            public void e(File from, File to) throws IOException {
                C3862t.g(from, "from");
                C3862t.g(to, "to");
                f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // xc.InterfaceC5088a
            public void f(File file) throws IOException {
                C3862t.g(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // xc.InterfaceC5088a
            public z g(File file) {
                C3862t.g(file, "file");
                try {
                    return o.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return o.a(file);
                }
            }

            @Override // xc.InterfaceC5088a
            public long h(File file) {
                C3862t.g(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    B a(File file);

    z b(File file);

    void c(File directory);

    boolean d(File file);

    void e(File from, File to);

    void f(File file);

    z g(File file);

    long h(File file);
}
