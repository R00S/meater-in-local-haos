package com.bumptech.glide.p121k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* renamed from: com.bumptech.glide.k.b */
/* loaded from: classes.dex */
class C5358b implements Closeable {

    /* renamed from: f */
    private final InputStream f13158f;

    /* renamed from: g */
    private final Charset f13159g;

    /* renamed from: h */
    private byte[] f13160h;

    /* renamed from: i */
    private int f13161i;

    /* renamed from: j */
    private int f13162j;

    /* compiled from: StrictLineReader.java */
    /* renamed from: com.bumptech.glide.k.b$a */
    class a extends ByteArrayOutputStream {
        a(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, C5358b.this.f13159g.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public C5358b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m10100b() throws IOException {
        InputStream inputStream = this.f13158f;
        byte[] bArr = this.f13160h;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.f13161i = 0;
        this.f13162j = i2;
    }

    /* renamed from: c */
    public boolean m10101c() {
        return this.f13162j == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f13158f) {
            if (this.f13160h != null) {
                this.f13160h = null;
                this.f13158f.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m10102d() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f13158f
            monitor-enter(r0)
            byte[] r1 = r7.f13160h     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L83
            int r1 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.f13162j     // Catch: java.lang.Throwable -> L8b
            if (r1 < r2) goto L10
            r7.m10100b()     // Catch: java.lang.Throwable -> L8b
        L10:
            int r1 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
        L12:
            int r2 = r7.f13162j     // Catch: java.lang.Throwable -> L8b
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f13160h     // Catch: java.lang.Throwable -> L8b
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L8b
            if (r4 != r3) goto L42
            int r3 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
            if (r1 == r3) goto L2b
            int r3 = r1 + (-1)
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L8b
            r4 = 13
            if (r2 != r4) goto L2b
            goto L2c
        L2b:
            r3 = r1
        L2c:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L8b
            byte[] r4 = r7.f13160h     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 - r5
            java.nio.charset.Charset r6 = r7.f13159g     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L8b
            int r1 = r1 + 1
            r7.f13161i = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r2
        L42:
            int r1 = r1 + 1
            goto L12
        L45:
            com.bumptech.glide.k.b$a r1 = new com.bumptech.glide.k.b$a     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.f13162j     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
        L51:
            byte[] r2 = r7.f13160h     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.f13162j     // Catch: java.lang.Throwable -> L8b
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L8b
            r2 = -1
            r7.f13162j = r2     // Catch: java.lang.Throwable -> L8b
            r7.m10100b()     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
        L63:
            int r4 = r7.f13162j     // Catch: java.lang.Throwable -> L8b
            if (r2 == r4) goto L51
            byte[] r4 = r7.f13160h     // Catch: java.lang.Throwable -> L8b
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L8b
            if (r5 != r3) goto L80
            int r3 = r7.f13161i     // Catch: java.lang.Throwable -> L8b
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L8b
        L76:
            int r2 = r2 + 1
            r7.f13161i = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8e:
            throw r1
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p121k.C5358b.m10102d():java.lang.String");
    }

    public C5358b(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C5359c.f13164a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f13158f = inputStream;
        this.f13159g = charset;
        this.f13160h = new byte[i2];
    }
}
