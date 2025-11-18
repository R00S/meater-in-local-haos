package p241e.p307h.p308a.p314j0;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import p241e.p307h.p308a.p315k0.C9033c;

/* compiled from: FileDownloadRandomAccessFile.java */
/* renamed from: e.h.a.j0.b */
/* loaded from: classes2.dex */
public class C9029b implements InterfaceC9028a {

    /* renamed from: a */
    private final BufferedOutputStream f34807a;

    /* renamed from: b */
    private final FileDescriptor f34808b;

    /* renamed from: c */
    private final RandomAccessFile f34809c;

    /* compiled from: FileDownloadRandomAccessFile.java */
    /* renamed from: e.h.a.j0.b$a */
    public static class a implements C9033c.e {
        @Override // p241e.p307h.p308a.p315k0.C9033c.e
        /* renamed from: a */
        public InterfaceC9028a mo28928a(File file) throws IOException {
            return new C9029b(file);
        }

        @Override // p241e.p307h.p308a.p315k0.C9033c.e
        /* renamed from: b */
        public boolean mo28929b() {
            return true;
        }
    }

    C9029b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f34809c = randomAccessFile;
        this.f34808b = randomAccessFile.getFD();
        this.f34807a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // p241e.p307h.p308a.p314j0.InterfaceC9028a
    /* renamed from: a */
    public void mo28925a(long j2) throws IOException {
        this.f34809c.setLength(j2);
    }

    @Override // p241e.p307h.p308a.p314j0.InterfaceC9028a
    /* renamed from: b */
    public void mo28926b() throws IOException {
        this.f34807a.flush();
        this.f34808b.sync();
    }

    @Override // p241e.p307h.p308a.p314j0.InterfaceC9028a
    /* renamed from: c */
    public void mo28927c(long j2) throws IOException {
        this.f34809c.seek(j2);
    }

    @Override // p241e.p307h.p308a.p314j0.InterfaceC9028a
    public void close() throws IOException {
        this.f34807a.close();
        this.f34809c.close();
    }

    @Override // p241e.p307h.p308a.p314j0.InterfaceC9028a
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.f34807a.write(bArr, i2, i3);
    }
}
