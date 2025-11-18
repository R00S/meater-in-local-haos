package com.google.firebase.crashlytics.internal.p184o;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* renamed from: com.google.firebase.crashlytics.h.o.h */
/* loaded from: classes2.dex */
class C8242h implements Closeable {

    /* renamed from: f */
    private static final Logger f31085f = Logger.getLogger(C8242h.class.getName());

    /* renamed from: g */
    private final RandomAccessFile f31086g;

    /* renamed from: h */
    int f31087h;

    /* renamed from: i */
    private int f31088i;

    /* renamed from: j */
    private b f31089j;

    /* renamed from: k */
    private b f31090k;

    /* renamed from: l */
    private final byte[] f31091l = new byte[16];

    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.h$a */
    class a implements d {

        /* renamed from: a */
        boolean f31092a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f31093b;

        a(StringBuilder sb) {
            this.f31093b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.C8242h.d
        /* renamed from: a */
        public void mo25525a(InputStream inputStream, int i2) throws IOException {
            if (this.f31092a) {
                this.f31092a = false;
            } else {
                this.f31093b.append(", ");
            }
            this.f31093b.append(i2);
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.h$b */
    static class b {

        /* renamed from: a */
        static final b f31095a = new b(0, 0);

        /* renamed from: b */
        final int f31096b;

        /* renamed from: c */
        final int f31097c;

        b(int i2, int i3) {
            this.f31096b = i2;
            this.f31097c = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.f31096b + ", length = " + this.f31097c + "]";
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.h$c */
    private final class c extends InputStream {

        /* renamed from: f */
        private int f31098f;

        /* renamed from: g */
        private int f31099g;

        /* synthetic */ c(C8242h c8242h, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            C8242h.m25515x(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f31099g;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            C8242h.this.m25502I(this.f31098f, bArr, i2, i3);
            this.f31098f = C8242h.this.m25505Q(this.f31098f + i3);
            this.f31099g -= i3;
            return i3;
        }

        private c(b bVar) {
            this.f31098f = C8242h.this.m25505Q(bVar.f31096b + 4);
            this.f31099g = bVar.f31097c;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f31099g == 0) {
                return -1;
            }
            C8242h.this.f31086g.seek(this.f31098f);
            int i2 = C8242h.this.f31086g.read();
            this.f31098f = C8242h.this.m25505Q(this.f31098f + 1);
            this.f31099g--;
            return i2;
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.h$d */
    public interface d {
        /* renamed from: a */
        void mo25525a(InputStream inputStream, int i2) throws IOException;
    }

    public C8242h(File file) throws IOException {
        if (!file.exists()) {
            m25514m(file);
        }
        this.f31086g = m25516y(file);
        m25499A();
    }

    /* renamed from: A */
    private void m25499A() throws IOException {
        this.f31086g.seek(0L);
        this.f31086g.readFully(this.f31091l);
        int iM25500B = m25500B(this.f31091l, 0);
        this.f31087h = iM25500B;
        if (iM25500B <= this.f31086g.length()) {
            this.f31088i = m25500B(this.f31091l, 4);
            int iM25500B2 = m25500B(this.f31091l, 8);
            int iM25500B3 = m25500B(this.f31091l, 12);
            this.f31089j = m25517z(iM25500B2);
            this.f31090k = m25517z(iM25500B3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f31087h + ", Actual length: " + this.f31086g.length());
    }

    /* renamed from: B */
    private static int m25500B(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    /* renamed from: D */
    private int m25501D() {
        return this.f31087h - m25519N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public void m25502I(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iM25505Q = m25505Q(i2);
        int i5 = iM25505Q + i4;
        int i6 = this.f31087h;
        if (i5 <= i6) {
            this.f31086g.seek(iM25505Q);
            this.f31086g.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iM25505Q;
        this.f31086g.seek(iM25505Q);
        this.f31086g.readFully(bArr, i3, i7);
        this.f31086g.seek(16L);
        this.f31086g.readFully(bArr, i3 + i7, i4 - i7);
    }

    /* renamed from: J */
    private void m25503J(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iM25505Q = m25505Q(i2);
        int i5 = iM25505Q + i4;
        int i6 = this.f31087h;
        if (i5 <= i6) {
            this.f31086g.seek(iM25505Q);
            this.f31086g.write(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iM25505Q;
        this.f31086g.seek(iM25505Q);
        this.f31086g.write(bArr, i3, i7);
        this.f31086g.seek(16L);
        this.f31086g.write(bArr, i3 + i7, i4 - i7);
    }

    /* renamed from: K */
    private void m25504K(int i2) throws IOException {
        this.f31086g.setLength(i2);
        this.f31086g.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public int m25505Q(int i2) {
        int i3 = this.f31087h;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    /* renamed from: T */
    private void m25506T(int i2, int i3, int i4, int i5) throws IOException {
        m25508Y(this.f31091l, i2, i3, i4, i5);
        this.f31086g.seek(0L);
        this.f31086g.write(this.f31091l);
    }

    /* renamed from: W */
    private static void m25507W(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    /* renamed from: Y */
    private static void m25508Y(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            m25507W(bArr, i2, i3);
            i2 += 4;
        }
    }

    /* renamed from: k */
    private void m25513k(int i2) throws IOException {
        int i3 = i2 + 4;
        int iM25501D = m25501D();
        if (iM25501D >= i3) {
            return;
        }
        int i4 = this.f31087h;
        do {
            iM25501D += i4;
            i4 <<= 1;
        } while (iM25501D < i3);
        m25504K(i4);
        b bVar = this.f31090k;
        int iM25505Q = m25505Q(bVar.f31096b + 4 + bVar.f31097c);
        if (iM25505Q < this.f31089j.f31096b) {
            FileChannel channel = this.f31086g.getChannel();
            channel.position(this.f31087h);
            long j2 = iM25505Q - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.f31090k.f31096b;
        int i6 = this.f31089j.f31096b;
        if (i5 < i6) {
            int i7 = (this.f31087h + i5) - 16;
            m25506T(i4, this.f31088i, i6, i7);
            this.f31090k = new b(i7, this.f31090k.f31097c);
        } else {
            m25506T(i4, this.f31088i, i6, i5);
        }
        this.f31087h = i4;
    }

    /* renamed from: m */
    private static void m25514m(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileM25516y = m25516y(file2);
        try {
            randomAccessFileM25516y.setLength(4096L);
            randomAccessFileM25516y.seek(0L);
            byte[] bArr = new byte[16];
            m25508Y(bArr, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            randomAccessFileM25516y.write(bArr);
            randomAccessFileM25516y.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileM25516y.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static <T> T m25515x(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: y */
    private static RandomAccessFile m25516y(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: z */
    private b m25517z(int i2) throws IOException {
        if (i2 == 0) {
            return b.f31095a;
        }
        this.f31086g.seek(i2);
        return new b(i2, this.f31086g.readInt());
    }

    /* renamed from: H */
    public synchronized void m25518H() throws IOException {
        if (m25524p()) {
            throw new NoSuchElementException();
        }
        if (this.f31088i == 1) {
            m25522j();
        } else {
            b bVar = this.f31089j;
            int iM25505Q = m25505Q(bVar.f31096b + 4 + bVar.f31097c);
            m25502I(iM25505Q, this.f31091l, 0, 4);
            int iM25500B = m25500B(this.f31091l, 0);
            m25506T(this.f31087h, this.f31088i - 1, iM25505Q, this.f31090k.f31096b);
            this.f31088i--;
            this.f31089j = new b(iM25505Q, iM25500B);
        }
    }

    /* renamed from: N */
    public int m25519N() {
        if (this.f31088i == 0) {
            return 16;
        }
        b bVar = this.f31090k;
        int i2 = bVar.f31096b;
        int i3 = this.f31089j.f31096b;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.f31097c + 16 : (((i2 + 4) + bVar.f31097c) + this.f31087h) - i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f31086g.close();
    }

    /* renamed from: e */
    public void m25520e(byte[] bArr) throws IOException {
        m25521f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public synchronized void m25521f(byte[] bArr, int i2, int i3) throws IOException {
        int iM25505Q;
        m25515x(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        m25513k(i3);
        boolean zM25524p = m25524p();
        if (zM25524p) {
            iM25505Q = 16;
        } else {
            b bVar = this.f31090k;
            iM25505Q = m25505Q(bVar.f31096b + 4 + bVar.f31097c);
        }
        b bVar2 = new b(iM25505Q, i3);
        m25507W(this.f31091l, 0, i3);
        m25503J(bVar2.f31096b, this.f31091l, 0, 4);
        m25503J(bVar2.f31096b + 4, bArr, i2, i3);
        m25506T(this.f31087h, this.f31088i + 1, zM25524p ? bVar2.f31096b : this.f31089j.f31096b, bVar2.f31096b);
        this.f31090k = bVar2;
        this.f31088i++;
        if (zM25524p) {
            this.f31089j = bVar2;
        }
    }

    /* renamed from: j */
    public synchronized void m25522j() throws IOException {
        m25506T(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
        this.f31088i = 0;
        b bVar = b.f31095a;
        this.f31089j = bVar;
        this.f31090k = bVar;
        if (this.f31087h > 4096) {
            m25504K(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        this.f31087h = RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
    }

    /* renamed from: l */
    public synchronized void m25523l(d dVar) throws IOException {
        int iM25505Q = this.f31089j.f31096b;
        for (int i2 = 0; i2 < this.f31088i; i2++) {
            b bVarM25517z = m25517z(iM25505Q);
            dVar.mo25525a(new c(this, bVarM25517z, null), bVarM25517z.f31097c);
            iM25505Q = m25505Q(bVarM25517z.f31096b + 4 + bVarM25517z.f31097c);
        }
    }

    /* renamed from: p */
    public synchronized boolean m25524p() {
        return this.f31088i == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8242h.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f31087h);
        sb.append(", size=");
        sb.append(this.f31088i);
        sb.append(", first=");
        sb.append(this.f31089j);
        sb.append(", last=");
        sb.append(this.f31090k);
        sb.append(", element lengths=[");
        try {
            m25523l(new a(sb));
        } catch (IOException e2) {
            f31085f.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}
