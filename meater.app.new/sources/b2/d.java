package b2;

import androidx.media3.datasource.cache.Cache;
import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: CacheWriter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.cache.a f30096a;

    /* renamed from: b, reason: collision with root package name */
    private final Cache f30097b;

    /* renamed from: c, reason: collision with root package name */
    private final a2.g f30098c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30099d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f30100e;

    /* renamed from: f, reason: collision with root package name */
    private final a f30101f;

    /* renamed from: g, reason: collision with root package name */
    private long f30102g;

    /* renamed from: h, reason: collision with root package name */
    private long f30103h;

    /* renamed from: i, reason: collision with root package name */
    private long f30104i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f30105j;

    /* compiled from: CacheWriter.java */
    public interface a {
        void a(long j10, long j11, long j12);
    }

    public d(androidx.media3.datasource.cache.a aVar, a2.g gVar, byte[] bArr, a aVar2) {
        this.f30096a = aVar;
        this.f30097b = aVar.r();
        this.f30098c = gVar;
        this.f30100e = bArr == null ? new byte[131072] : bArr;
        this.f30101f = aVar2;
        this.f30099d = aVar.s().c(gVar);
        this.f30102g = gVar.f19989g;
    }

    private long c() {
        long j10 = this.f30103h;
        if (j10 == -1) {
            return -1L;
        }
        return j10 - this.f30098c.f19989g;
    }

    private void d(long j10) {
        this.f30104i += j10;
        a aVar = this.f30101f;
        if (aVar != null) {
            aVar.a(c(), this.f30104i, j10);
        }
    }

    private void e(long j10) {
        if (this.f30103h == j10) {
            return;
        }
        this.f30103h = j10;
        a aVar = this.f30101f;
        if (aVar != null) {
            aVar.a(c(), this.f30104i, 0L);
        }
    }

    private long f(long j10, long j11) throws IOException {
        long jC;
        boolean z10 = true;
        boolean z11 = j10 + j11 == this.f30103h || j11 == -1;
        if (j11 != -1) {
            try {
                jC = this.f30096a.c(this.f30098c.a().h(j10).g(j11).a());
            } catch (IOException unused) {
                a2.f.a(this.f30096a);
            }
        } else {
            z10 = false;
            jC = -1;
        }
        if (!z10) {
            g();
            try {
                jC = this.f30096a.c(this.f30098c.a().h(j10).g(-1L).a());
            } catch (IOException e10) {
                a2.f.a(this.f30096a);
                throw e10;
            }
        }
        if (z11 && jC != -1) {
            try {
                e(jC + j10);
            } catch (IOException e11) {
                a2.f.a(this.f30096a);
                throw e11;
            }
        }
        int iE = 0;
        int i10 = 0;
        while (iE != -1) {
            g();
            androidx.media3.datasource.cache.a aVar = this.f30096a;
            byte[] bArr = this.f30100e;
            iE = aVar.e(bArr, 0, bArr.length);
            if (iE != -1) {
                d(iE);
                i10 += iE;
            }
        }
        if (z11) {
            e(j10 + i10);
        }
        this.f30096a.close();
        return i10;
    }

    private void g() throws InterruptedIOException {
        if (this.f30105j) {
            throw new InterruptedIOException();
        }
    }

    public void a() throws InterruptedIOException {
        g();
        Cache cache = this.f30097b;
        String str = this.f30099d;
        a2.g gVar = this.f30098c;
        this.f30104i = cache.d(str, gVar.f19989g, gVar.f19990h);
        a2.g gVar2 = this.f30098c;
        long j10 = gVar2.f19990h;
        if (j10 != -1) {
            this.f30103h = gVar2.f19989g + j10;
        } else {
            long jD = e.d(this.f30097b.c(this.f30099d));
            if (jD == -1) {
                jD = -1;
            }
            this.f30103h = jD;
        }
        a aVar = this.f30101f;
        if (aVar != null) {
            aVar.a(c(), this.f30104i, 0L);
        }
        while (true) {
            long j11 = this.f30103h;
            if (j11 != -1 && this.f30102g >= j11) {
                return;
            }
            g();
            long j12 = this.f30103h;
            long jF = this.f30097b.f(this.f30099d, this.f30102g, j12 == -1 ? Long.MAX_VALUE : j12 - this.f30102g);
            if (jF > 0) {
                this.f30102g += jF;
            } else {
                long j13 = -jF;
                if (j13 == Long.MAX_VALUE) {
                    j13 = -1;
                }
                long j14 = this.f30102g;
                this.f30102g = j14 + f(j14, j13);
            }
        }
    }

    public void b() {
        this.f30105j = true;
    }
}
