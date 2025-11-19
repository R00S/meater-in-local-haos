package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.L;
import X1.n;
import a2.InterfaceC1887d;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CacheDataSink implements InterfaceC1887d {

    /* renamed from: a, reason: collision with root package name */
    private final Cache f26199a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26200b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26201c;

    /* renamed from: d, reason: collision with root package name */
    private a2.g f26202d;

    /* renamed from: e, reason: collision with root package name */
    private long f26203e;

    /* renamed from: f, reason: collision with root package name */
    private File f26204f;

    /* renamed from: g, reason: collision with root package name */
    private OutputStream f26205g;

    /* renamed from: h, reason: collision with root package name */
    private long f26206h;

    /* renamed from: i, reason: collision with root package name */
    private long f26207i;

    /* renamed from: j, reason: collision with root package name */
    private g f26208j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class a implements InterfaceC1887d.a {

        /* renamed from: a, reason: collision with root package name */
        private Cache f26209a;

        /* renamed from: b, reason: collision with root package name */
        private long f26210b = 5242880;

        /* renamed from: c, reason: collision with root package name */
        private int f26211c = 20480;

        @Override // a2.InterfaceC1887d.a
        public InterfaceC1887d a() {
            return new CacheDataSink((Cache) C1804a.e(this.f26209a), this.f26210b, this.f26211c);
        }

        public a b(Cache cache) {
            this.f26209a = cache;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j10, int i10) {
        C1804a.h(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            n.h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f26199a = (Cache) C1804a.e(cache);
        this.f26200b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f26201c = i10;
    }

    private void a() throws IOException {
        OutputStream outputStream = this.f26205g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            L.m(this.f26205g);
            this.f26205g = null;
            File file = (File) L.i(this.f26204f);
            this.f26204f = null;
            this.f26199a.j(file, this.f26206h);
        } catch (Throwable th) {
            L.m(this.f26205g);
            this.f26205g = null;
            File file2 = (File) L.i(this.f26204f);
            this.f26204f = null;
            file2.delete();
            throw th;
        }
    }

    private void b(a2.g gVar) {
        long j10 = gVar.f19990h;
        this.f26204f = this.f26199a.a((String) L.i(gVar.f19991i), gVar.f19989g + this.f26207i, j10 != -1 ? Math.min(j10 - this.f26207i, this.f26203e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f26204f);
        if (this.f26201c > 0) {
            g gVar2 = this.f26208j;
            if (gVar2 == null) {
                this.f26208j = new g(fileOutputStream, this.f26201c);
            } else {
                gVar2.a(fileOutputStream);
            }
            this.f26205g = this.f26208j;
        } else {
            this.f26205g = fileOutputStream;
        }
        this.f26206h = 0L;
    }

    @Override // a2.InterfaceC1887d
    public void c(a2.g gVar) throws CacheDataSinkException {
        C1804a.e(gVar.f19991i);
        if (gVar.f19990h == -1 && gVar.d(2)) {
            this.f26202d = null;
            return;
        }
        this.f26202d = gVar;
        this.f26203e = gVar.d(4) ? this.f26200b : Long.MAX_VALUE;
        this.f26207i = 0L;
        try {
            b(gVar);
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // a2.InterfaceC1887d
    public void close() throws CacheDataSinkException {
        if (this.f26202d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e10) {
            throw new CacheDataSinkException(e10);
        }
    }

    @Override // a2.InterfaceC1887d
    public void v(byte[] bArr, int i10, int i11) throws IOException {
        a2.g gVar = this.f26202d;
        if (gVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f26206h == this.f26203e) {
                    a();
                    b(gVar);
                }
                int iMin = (int) Math.min(i11 - i12, this.f26203e - this.f26206h);
                ((OutputStream) L.i(this.f26205g)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f26206h += j10;
                this.f26207i += j10;
            } catch (IOException e10) {
                throw new CacheDataSinkException(e10);
            }
        }
    }
}
