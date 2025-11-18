package X1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: AtomicFile.java */
/* renamed from: X1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1805b {

    /* renamed from: a, reason: collision with root package name */
    private final File f18643a;

    /* renamed from: b, reason: collision with root package name */
    private final File f18644b;

    /* compiled from: AtomicFile.java */
    /* renamed from: X1.b$a */
    private static final class a extends OutputStream {

        /* renamed from: B, reason: collision with root package name */
        private final FileOutputStream f18645B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f18646C = false;

        public a(File file) {
            this.f18645B = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18646C) {
                return;
            }
            this.f18646C = true;
            flush();
            try {
                this.f18645B.getFD().sync();
            } catch (IOException e10) {
                n.i("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f18645B.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f18645B.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f18645B.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18645B.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f18645B.write(bArr, i10, i11);
        }
    }

    public C1805b(File file) {
        this.f18643a = file;
        this.f18644b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f18644b.exists()) {
            this.f18643a.delete();
            this.f18644b.renameTo(this.f18643a);
        }
    }

    public void a() {
        this.f18643a.delete();
        this.f18644b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f18644b.delete();
    }

    public boolean c() {
        return this.f18643a.exists() || this.f18644b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f18643a);
    }

    public OutputStream f() throws IOException {
        if (this.f18643a.exists()) {
            if (this.f18644b.exists()) {
                this.f18643a.delete();
            } else if (!this.f18643a.renameTo(this.f18644b)) {
                n.h("AtomicFile", "Couldn't rename file " + this.f18643a + " to backup file " + this.f18644b);
            }
        }
        try {
            return new a(this.f18643a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f18643a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f18643a, e10);
            }
            try {
                return new a(this.f18643a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f18643a, e11);
            }
        }
    }
}
