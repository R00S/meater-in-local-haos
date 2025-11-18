package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzaw extends ByteArrayOutputStream {

    /* renamed from: f */
    private final zzal f22568f;

    public zzaw(zzal zzalVar, int i2) {
        this.f22568f = zzalVar;
        ((ByteArrayOutputStream) this).buf = zzalVar.m16646b(Math.max(i2, 256));
    }

    /* renamed from: a */
    private final void m17023a(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrM16646b = this.f22568f.m16646b((i3 + i2) << 1);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM16646b, 0, ((ByteArrayOutputStream) this).count);
        this.f22568f.m16645a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM16646b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22568f.m16645a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f22568f.m16645a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        m17023a(i3);
        super.write(bArr, i2, i3);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        m17023a(1);
        super.write(i2);
    }
}
