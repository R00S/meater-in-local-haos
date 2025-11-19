package S8;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* loaded from: classes2.dex */
class h implements Closeable {

    /* renamed from: H, reason: collision with root package name */
    private static final Logger f15544H = Logger.getLogger(h.class.getName());

    /* renamed from: B, reason: collision with root package name */
    private final RandomAccessFile f15545B;

    /* renamed from: C, reason: collision with root package name */
    int f15546C;

    /* renamed from: D, reason: collision with root package name */
    private int f15547D;

    /* renamed from: E, reason: collision with root package name */
    private b f15548E;

    /* renamed from: F, reason: collision with root package name */
    private b f15549F;

    /* renamed from: G, reason: collision with root package name */
    private final byte[] f15550G = new byte[16];

    /* compiled from: QueueFile.java */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f15551a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f15552b;

        a(StringBuilder sb2) {
            this.f15552b = sb2;
        }

        @Override // S8.h.d
        public void a(InputStream inputStream, int i10) {
            if (this.f15551a) {
                this.f15551a = false;
            } else {
                this.f15552b.append(", ");
            }
            this.f15552b.append(i10);
        }
    }

    /* compiled from: QueueFile.java */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f15554c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f15555a;

        /* renamed from: b, reason: collision with root package name */
        final int f15556b;

        b(int i10, int i11) {
            this.f15555a = i10;
            this.f15556b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f15555a + ", length = " + this.f15556b + "]";
        }
    }

    /* compiled from: QueueFile.java */
    private final class c extends InputStream {

        /* renamed from: B, reason: collision with root package name */
        private int f15557B;

        /* renamed from: C, reason: collision with root package name */
        private int f15558C;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.n(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f15558C;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.x(this.f15557B, bArr, i10, i11);
            this.f15557B = h.this.K(this.f15557B + i11);
            this.f15558C -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f15557B = h.this.K(bVar.f15555a + 4);
            this.f15558C = bVar.f15556b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f15558C == 0) {
                return -1;
            }
            h.this.f15545B.seek(this.f15557B);
            int i10 = h.this.f15545B.read();
            this.f15557B = h.this.K(this.f15557B + 1);
            this.f15558C--;
            return i10;
        }
    }

    /* compiled from: QueueFile.java */
    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            l(file);
        }
        this.f15545B = o(file);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K(int i10) {
        int i11 = this.f15546C;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void L(int i10, int i11, int i12, int i13) throws IOException {
        P(this.f15550G, i10, i11, i12, i13);
        this.f15545B.seek(0L);
        this.f15545B.write(this.f15550G);
    }

    private static void N(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void P(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            N(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void j(int i10) throws IOException {
        int i11 = i10 + 4;
        int iT = t();
        if (iT >= i11) {
            return;
        }
        int i12 = this.f15546C;
        do {
            iT += i12;
            i12 <<= 1;
        } while (iT < i11);
        z(i12);
        b bVar = this.f15549F;
        int iK = K(bVar.f15555a + 4 + bVar.f15556b);
        if (iK < this.f15548E.f15555a) {
            FileChannel channel = this.f15545B.getChannel();
            channel.position(this.f15546C);
            long j10 = iK - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f15549F.f15555a;
        int i14 = this.f15548E.f15555a;
        if (i13 < i14) {
            int i15 = (this.f15546C + i13) - 16;
            L(i12, this.f15547D, i14, i15);
            this.f15549F = new b(i15, this.f15549F.f15556b);
        } else {
            L(i12, this.f15547D, i14, i13);
        }
        this.f15546C = i12;
    }

    private static void l(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileO = o(file2);
        try {
            randomAccessFileO.setLength(4096L);
            randomAccessFileO.seek(0L);
            byte[] bArr = new byte[16];
            P(bArr, 4096, 0, 0, 0);
            randomAccessFileO.write(bArr);
            randomAccessFileO.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileO.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T n(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile o(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b p(int i10) throws IOException {
        if (i10 == 0) {
            return b.f15554c;
        }
        this.f15545B.seek(i10);
        return new b(i10, this.f15545B.readInt());
    }

    private void q() throws IOException {
        this.f15545B.seek(0L);
        this.f15545B.readFully(this.f15550G);
        int iS = s(this.f15550G, 0);
        this.f15546C = iS;
        if (iS <= this.f15545B.length()) {
            this.f15547D = s(this.f15550G, 4);
            int iS2 = s(this.f15550G, 8);
            int iS3 = s(this.f15550G, 12);
            this.f15548E = p(iS2);
            this.f15549F = p(iS3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f15546C + ", Actual length: " + this.f15545B.length());
    }

    private static int s(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int t() {
        return this.f15546C - C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iK = K(i10);
        int i13 = iK + i12;
        int i14 = this.f15546C;
        if (i13 <= i14) {
            this.f15545B.seek(iK);
            this.f15545B.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iK;
        this.f15545B.seek(iK);
        this.f15545B.readFully(bArr, i11, i15);
        this.f15545B.seek(16L);
        this.f15545B.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void y(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iK = K(i10);
        int i13 = iK + i12;
        int i14 = this.f15546C;
        if (i13 <= i14) {
            this.f15545B.seek(iK);
            this.f15545B.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iK;
        this.f15545B.seek(iK);
        this.f15545B.write(bArr, i11, i15);
        this.f15545B.seek(16L);
        this.f15545B.write(bArr, i11 + i15, i12 - i15);
    }

    private void z(int i10) throws IOException {
        this.f15545B.setLength(i10);
        this.f15545B.getChannel().force(true);
    }

    public int C() {
        if (this.f15547D == 0) {
            return 16;
        }
        b bVar = this.f15549F;
        int i10 = bVar.f15555a;
        int i11 = this.f15548E.f15555a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f15556b + 16 : (((i10 + 4) + bVar.f15556b) + this.f15546C) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f15545B.close();
    }

    public void e(byte[] bArr) {
        f(bArr, 0, bArr.length);
    }

    public synchronized void f(byte[] bArr, int i10, int i11) {
        int iK;
        try {
            n(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            j(i11);
            boolean zM = m();
            if (zM) {
                iK = 16;
            } else {
                b bVar = this.f15549F;
                iK = K(bVar.f15555a + 4 + bVar.f15556b);
            }
            b bVar2 = new b(iK, i11);
            N(this.f15550G, 0, i11);
            y(bVar2.f15555a, this.f15550G, 0, 4);
            y(bVar2.f15555a + 4, bArr, i10, i11);
            L(this.f15546C, this.f15547D + 1, zM ? bVar2.f15555a : this.f15548E.f15555a, bVar2.f15555a);
            this.f15549F = bVar2;
            this.f15547D++;
            if (zM) {
                this.f15548E = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() {
        try {
            L(4096, 0, 0, 0);
            this.f15547D = 0;
            b bVar = b.f15554c;
            this.f15548E = bVar;
            this.f15549F = bVar;
            if (this.f15546C > 4096) {
                z(4096);
            }
            this.f15546C = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k(d dVar) {
        int iK = this.f15548E.f15555a;
        for (int i10 = 0; i10 < this.f15547D; i10++) {
            b bVarP = p(iK);
            dVar.a(new c(this, bVarP, null), bVarP.f15556b);
            iK = K(bVarP.f15555a + 4 + bVarP.f15556b);
        }
    }

    public synchronized boolean m() {
        return this.f15547D == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f15546C);
        sb2.append(", size=");
        sb2.append(this.f15547D);
        sb2.append(", first=");
        sb2.append(this.f15548E);
        sb2.append(", last=");
        sb2.append(this.f15549F);
        sb2.append(", element lengths=[");
        try {
            k(new a(sb2));
        } catch (IOException e10) {
            f15544H.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public synchronized void u() {
        try {
            if (m()) {
                throw new NoSuchElementException();
            }
            if (this.f15547D == 1) {
                g();
            } else {
                b bVar = this.f15548E;
                int iK = K(bVar.f15555a + 4 + bVar.f15556b);
                x(iK, this.f15550G, 0, 4);
                int iS = s(this.f15550G, 0);
                L(this.f15546C, this.f15547D - 1, iK, this.f15549F.f15555a);
                this.f15547D--;
                this.f15548E = new b(iK, iS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
