package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s3.C4475b;
import s3.C4476c;
import u3.InterfaceC4669g;
import u3.InterfaceC4670h;
import w3.C4976a;

/* compiled from: SQLiteCopyOpenHelper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00103R\u0016\u00107\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Landroidx/room/D;", "Lu3/h;", "Landroidx/room/i;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILu3/h;)V", "", "writable", "Loa/F;", "e", "(Z)V", "destinationFile", "b", "(Ljava/io/File;Z)V", "databaseFile", "c", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "Landroidx/room/h;", "databaseConfiguration", "d", "(Landroidx/room/h;)V", "B", "Landroid/content/Context;", "C", "Ljava/lang/String;", "D", "Ljava/io/File;", "E", "Ljava/util/concurrent/Callable;", "F", "I", "G", "Lu3/h;", "a", "()Lu3/h;", "H", "Landroidx/room/h;", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lu3/g;", "getWritableDatabase", "()Lu3/g;", "writableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D implements InterfaceC4670h, InterfaceC2179i {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final String copyFromAssetPath;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final File copyFromFile;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Callable<InputStream> copyFromInputStream;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final int databaseVersion;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4670h delegate;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private C2178h databaseConfiguration;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean verified;

    public D(Context context, String str, File file, Callable<InputStream> callable, int i10, InterfaceC4670h delegate) {
        C3862t.g(context, "context");
        C3862t.g(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.delegate = delegate;
    }

    private final void b(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            C3862t.f(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            C3862t.f(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                C3862t.f(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        C3862t.f(output, "output");
        C4476c.a(readableByteChannelNewChannel, output);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        C3862t.f(intermediateFile, "intermediateFile");
        c(intermediateFile, writable);
        if (intermediateFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final void c(File databaseFile, boolean writable) {
        C2178h c2178h = this.databaseConfiguration;
        if (c2178h == null) {
            C3862t.u("databaseConfiguration");
            c2178h = null;
        }
        c2178h.getClass();
    }

    private final void e(boolean writable) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.context.getDatabasePath(databaseName);
        C2178h c2178h = this.databaseConfiguration;
        C2178h c2178h2 = null;
        if (c2178h == null) {
            C3862t.u("databaseConfiguration");
            c2178h = null;
        }
        C4976a c4976a = new C4976a(databaseName, this.context.getFilesDir(), c2178h.multiInstanceInvalidation);
        try {
            C4976a.c(c4976a, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    C3862t.f(databaseFile, "databaseFile");
                    b(databaseFile, writable);
                    c4976a.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                C3862t.f(databaseFile, "databaseFile");
                int iC = C4475b.c(databaseFile);
                if (iC == this.databaseVersion) {
                    c4976a.d();
                    return;
                }
                C2178h c2178h3 = this.databaseConfiguration;
                if (c2178h3 == null) {
                    C3862t.u("databaseConfiguration");
                } else {
                    c2178h2 = c2178h3;
                }
                if (c2178h2.a(iC, this.databaseVersion)) {
                    c4976a.d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        b(databaseFile, writable);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c4976a.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c4976a.d();
                return;
            }
        } catch (Throwable th) {
            c4976a.d();
            throw th;
        }
        c4976a.d();
        throw th;
    }

    @Override // androidx.room.InterfaceC2179i
    /* renamed from: a, reason: from getter */
    public InterfaceC4670h getDelegate() {
        return this.delegate;
    }

    @Override // u3.InterfaceC4670h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    public final void d(C2178h databaseConfiguration) {
        C3862t.g(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // u3.InterfaceC4670h
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // u3.InterfaceC4670h
    public InterfaceC4669g getWritableDatabase() throws IOException {
        if (!this.verified) {
            e(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    @Override // u3.InterfaceC4670h
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
