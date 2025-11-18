package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.p010t.C0661a;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0664d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;

/* compiled from: SQLiteCopyOpenHelper.java */
/* renamed from: androidx.room.o */
/* loaded from: classes.dex */
class C0656o implements InterfaceC1009c {

    /* renamed from: f */
    private final Context f4346f;

    /* renamed from: g */
    private final String f4347g;

    /* renamed from: h */
    private final File f4348h;

    /* renamed from: i */
    private final int f4349i;

    /* renamed from: j */
    private final InterfaceC1009c f4350j;

    /* renamed from: k */
    private C0642a f4351k;

    /* renamed from: l */
    private boolean f4352l;

    C0656o(Context context, String str, File file, int i2, InterfaceC1009c interfaceC1009c) {
        this.f4346f = context;
        this.f4347g = str;
        this.f4348h = file;
        this.f4349i = i2;
        this.f4350j = interfaceC1009c;
    }

    /* renamed from: a */
    private void m4663a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f4347g != null) {
            channel = Channels.newChannel(this.f4346f.getAssets().open(this.f4347g));
        } else {
            if (this.f4348h == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f4348h).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4346f.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        C0664d.m4677a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* renamed from: c */
    private void m4664c() {
        String databaseName = getDatabaseName();
        File databasePath = this.f4346f.getDatabasePath(databaseName);
        C0642a c0642a = this.f4351k;
        C0661a c0661a = new C0661a(databaseName, this.f4346f.getFilesDir(), c0642a == null || c0642a.f4245j);
        try {
            c0661a.m4670b();
            if (!databasePath.exists()) {
                try {
                    m4663a(databasePath);
                    c0661a.m4671c();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.f4351k == null) {
                c0661a.m4671c();
                return;
            }
            try {
                int iM4676c = C0663c.m4676c(databasePath);
                int i2 = this.f4349i;
                if (iM4676c == i2) {
                    c0661a.m4671c();
                    return;
                }
                if (this.f4351k.m4586a(iM4676c, i2)) {
                    c0661a.m4671c();
                    return;
                }
                if (this.f4346f.deleteDatabase(databaseName)) {
                    try {
                        m4663a(databasePath);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c0661a.m4671c();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                c0661a.m4671c();
                return;
            }
        } catch (Throwable th) {
            c0661a.m4671c();
            throw th;
        }
        c0661a.m4671c();
        throw th;
    }

    /* renamed from: b */
    void m4665b(C0642a c0642a) {
        this.f4351k = c0642a;
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f4350j.close();
        this.f4352l = false;
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c
    public String getDatabaseName() {
        return this.f4350j.getDatabaseName();
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c
    /* renamed from: s0 */
    public synchronized InterfaceC1008b mo4666s0() {
        if (!this.f4352l) {
            m4664c();
            this.f4352l = true;
        }
        return this.f4350j.mo4666s0();
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4350j.setWriteAheadLoggingEnabled(z);
    }
}
