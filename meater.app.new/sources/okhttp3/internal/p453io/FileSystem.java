package okhttp3.internal.p453io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p353j.C9718q;
import p353j.C9719r;
import p353j.InterfaceC9696b0;
import p353j.InterfaceC9700d0;

/* compiled from: FileSystem.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001b"}, m32267d2 = {"Lokhttp3/internal/io/FileSystem;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/File;", "file", "Lj/d0;", "source", "(Ljava/io/File;)Lj/d0;", "Lj/b0;", "sink", "(Ljava/io/File;)Lj/b0;", "appendingSink", "Lkotlin/u;", "delete", "(Ljava/io/File;)V", HttpUrl.FRAGMENT_ENCODE_SET, "exists", "(Ljava/io/File;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "size", "(Ljava/io/File;)J", "from", "to", "rename", "(Ljava/io/File;Ljava/io/File;)V", "directory", "deleteContents", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface FileSystem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: FileSystem.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m32267d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/io/FileSystem;", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "<init>", "()V", "SystemFileSystem", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: FileSystem.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m32267d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "Lj/d0;", "source", "(Ljava/io/File;)Lj/d0;", "Lj/b0;", "sink", "(Ljava/io/File;)Lj/b0;", "appendingSink", "Lkotlin/u;", "delete", "(Ljava/io/File;)V", HttpUrl.FRAGMENT_ENCODE_SET, "exists", "(Ljava/io/File;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "size", "(Ljava/io/File;)J", "from", "to", "rename", "(Ljava/io/File;Ljava/io/File;)V", "directory", "deleteContents", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.p453io.FileSystem
            public InterfaceC9696b0 appendingSink(File file) throws FileNotFoundException {
                C9801m.m32346f(file, "file");
                try {
                    return C9718q.m32117a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C9718q.m32117a(file);
                }
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public void delete(File file) throws IOException {
                C9801m.m32346f(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public void deleteContents(File directory) throws IOException {
                C9801m.m32346f(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    C9801m.m32345e(file, "file");
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public boolean exists(File file) {
                C9801m.m32346f(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public void rename(File from, File to) throws IOException {
                C9801m.m32346f(from, "from");
                C9801m.m32346f(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public InterfaceC9696b0 sink(File file) throws FileNotFoundException {
                C9801m.m32346f(file, "file");
                try {
                    return C9719r.m32135g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C9719r.m32135g(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public long size(File file) {
                C9801m.m32346f(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.p453io.FileSystem
            public InterfaceC9700d0 source(File file) throws FileNotFoundException {
                C9801m.m32346f(file, "file");
                return C9718q.m32126j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    InterfaceC9696b0 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File directory) throws IOException;

    boolean exists(File file);

    void rename(File from, File to) throws IOException;

    InterfaceC9696b0 sink(File file) throws FileNotFoundException;

    long size(File file);

    InterfaceC9700d0 source(File file) throws FileNotFoundException;
}
