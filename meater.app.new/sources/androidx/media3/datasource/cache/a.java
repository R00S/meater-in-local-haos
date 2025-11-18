package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.L;
import a2.InterfaceC1887d;
import a2.k;
import a2.m;
import a2.n;
import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: CacheDataSource.java */
/* loaded from: classes.dex */
public final class a implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final Cache f26212a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a f26213b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f26214c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.datasource.a f26215d;

    /* renamed from: e, reason: collision with root package name */
    private final b2.b f26216e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26217f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26218g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f26219h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f26220i;

    /* renamed from: j, reason: collision with root package name */
    private a2.g f26221j;

    /* renamed from: k, reason: collision with root package name */
    private a2.g f26222k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.media3.datasource.a f26223l;

    /* renamed from: m, reason: collision with root package name */
    private long f26224m;

    /* renamed from: n, reason: collision with root package name */
    private long f26225n;

    /* renamed from: o, reason: collision with root package name */
    private long f26226o;

    /* renamed from: p, reason: collision with root package name */
    private b2.c f26227p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26228q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26229r;

    /* renamed from: s, reason: collision with root package name */
    private long f26230s;

    /* renamed from: t, reason: collision with root package name */
    private long f26231t;

    /* compiled from: CacheDataSource.java */
    public interface b {
    }

    /* compiled from: CacheDataSource.java */
    public static final class c implements a.InterfaceC0371a {

        /* renamed from: a, reason: collision with root package name */
        private Cache f26232a;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1887d.a f26234c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f26236e;

        /* renamed from: f, reason: collision with root package name */
        private a.InterfaceC0371a f26237f;

        /* renamed from: g, reason: collision with root package name */
        private PriorityTaskManager f26238g;

        /* renamed from: h, reason: collision with root package name */
        private int f26239h;

        /* renamed from: i, reason: collision with root package name */
        private int f26240i;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0371a f26233b = new FileDataSource.a();

        /* renamed from: d, reason: collision with root package name */
        private b2.b f26235d = b2.b.f30089a;

        private a c(androidx.media3.datasource.a aVar, int i10, int i11) {
            InterfaceC1887d interfaceC1887dA;
            Cache cache = (Cache) C1804a.e(this.f26232a);
            if (this.f26236e || aVar == null) {
                interfaceC1887dA = null;
            } else {
                InterfaceC1887d.a aVar2 = this.f26234c;
                interfaceC1887dA = aVar2 != null ? aVar2.a() : new CacheDataSink.a().b(cache).a();
            }
            return new a(cache, aVar, this.f26233b.a(), interfaceC1887dA, this.f26235d, i10, this.f26238g, i11, null);
        }

        @Override // androidx.media3.datasource.a.InterfaceC0371a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a() {
            a.InterfaceC0371a interfaceC0371a = this.f26237f;
            return c(interfaceC0371a != null ? interfaceC0371a.a() : null, this.f26240i, this.f26239h);
        }

        public c d(Cache cache) {
            this.f26232a = cache;
            return this;
        }

        public c e(a.InterfaceC0371a interfaceC0371a) {
            this.f26233b = interfaceC0371a;
            return this;
        }

        public c f(InterfaceC1887d.a aVar) {
            this.f26234c = aVar;
            this.f26236e = aVar == null;
            return this;
        }

        public c g(int i10) {
            this.f26240i = i10;
            return this;
        }

        public c h(a.InterfaceC0371a interfaceC0371a) {
            this.f26237f = interfaceC0371a;
            return this;
        }
    }

    private void B(a2.g gVar, boolean z10) throws InterruptedIOException {
        b2.c cVarG;
        long jMin;
        a2.g gVarA;
        androidx.media3.datasource.a aVar;
        String str = (String) L.i(gVar.f19991i);
        if (this.f26229r) {
            cVarG = null;
        } else if (this.f26217f) {
            try {
                cVarG = this.f26212a.g(str, this.f26225n, this.f26226o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cVarG = this.f26212a.e(str, this.f26225n, this.f26226o);
        }
        if (cVarG == null) {
            aVar = this.f26215d;
            gVarA = gVar.a().h(this.f26225n).g(this.f26226o).a();
        } else if (cVarG.f30093E) {
            Uri uriFromFile = Uri.fromFile((File) L.i(cVarG.f30094F));
            long j10 = cVarG.f30091C;
            long j11 = this.f26225n - j10;
            long jMin2 = cVarG.f30092D - j11;
            long j12 = this.f26226o;
            if (j12 != -1) {
                jMin2 = Math.min(jMin2, j12);
            }
            gVarA = gVar.a().i(uriFromFile).k(j10).h(j11).g(jMin2).a();
            aVar = this.f26213b;
        } else {
            if (cVarG.n()) {
                jMin = this.f26226o;
            } else {
                jMin = cVarG.f30092D;
                long j13 = this.f26226o;
                if (j13 != -1) {
                    jMin = Math.min(jMin, j13);
                }
            }
            gVarA = gVar.a().h(this.f26225n).g(jMin).a();
            aVar = this.f26214c;
            if (aVar == null) {
                aVar = this.f26215d;
                this.f26212a.h(cVarG);
                cVarG = null;
            }
        }
        this.f26231t = (this.f26229r || aVar != this.f26215d) ? Long.MAX_VALUE : this.f26225n + 102400;
        if (z10) {
            C1804a.g(v());
            if (aVar == this.f26215d) {
                return;
            }
            try {
                q();
            } finally {
            }
        }
        if (cVarG != null && cVarG.j()) {
            this.f26227p = cVarG;
        }
        this.f26223l = aVar;
        this.f26222k = gVarA;
        this.f26224m = 0L;
        long jC = aVar.c(gVarA);
        b2.f fVar = new b2.f();
        if (gVarA.f19990h == -1 && jC != -1) {
            this.f26226o = jC;
            b2.f.g(fVar, this.f26225n + jC);
        }
        if (x()) {
            Uri uriD = aVar.d();
            this.f26220i = uriD;
            b2.f.h(fVar, gVar.f19983a.equals(uriD) ? null : this.f26220i);
        }
        if (y()) {
            this.f26212a.b(str, fVar);
        }
    }

    private void C(String str) {
        this.f26226o = 0L;
        if (y()) {
            b2.f fVar = new b2.f();
            b2.f.g(fVar, this.f26225n);
            this.f26212a.b(str, fVar);
        }
    }

    private int D(a2.g gVar) {
        if (this.f26218g && this.f26228q) {
            return 0;
        }
        return (this.f26219h && gVar.f19990h == -1) ? 1 : -1;
    }

    private void q() {
        androidx.media3.datasource.a aVar = this.f26223l;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.f26222k = null;
            this.f26223l = null;
            b2.c cVar = this.f26227p;
            if (cVar != null) {
                this.f26212a.h(cVar);
                this.f26227p = null;
            }
        }
    }

    private static Uri t(Cache cache, String str, Uri uri) {
        Uri uriA = b2.e.a(cache.c(str));
        return uriA != null ? uriA : uri;
    }

    private void u(Throwable th) {
        if (w() || (th instanceof Cache.CacheException)) {
            this.f26228q = true;
        }
    }

    private boolean v() {
        return this.f26223l == this.f26215d;
    }

    private boolean w() {
        return this.f26223l == this.f26213b;
    }

    private boolean x() {
        return !w();
    }

    private boolean y() {
        return this.f26223l == this.f26214c;
    }

    @Override // androidx.media3.datasource.a
    public long c(a2.g gVar) {
        try {
            String strC = this.f26216e.c(gVar);
            a2.g gVarA = gVar.a().f(strC).a();
            this.f26221j = gVarA;
            this.f26220i = t(this.f26212a, strC, gVarA.f19983a);
            this.f26225n = gVar.f19989g;
            int iD = D(gVar);
            boolean z10 = iD != -1;
            this.f26229r = z10;
            if (z10) {
                A(iD);
            }
            if (this.f26229r) {
                this.f26226o = -1L;
            } else {
                long jD = b2.e.d(this.f26212a.c(strC));
                this.f26226o = jD;
                if (jD != -1) {
                    long j10 = jD - gVar.f19989g;
                    this.f26226o = j10;
                    if (j10 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = gVar.f19990h;
            if (jMin != -1) {
                long j11 = this.f26226o;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f26226o = jMin;
            }
            long j12 = this.f26226o;
            if (j12 > 0 || j12 == -1) {
                B(gVarA, false);
            }
            long j13 = gVar.f19990h;
            return j13 != -1 ? j13 : this.f26226o;
        } catch (Throwable th) {
            u(th);
            throw th;
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f26221j = null;
        this.f26220i = null;
        this.f26225n = 0L;
        z();
        try {
            q();
        } catch (Throwable th) {
            u(th);
            throw th;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f26220i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:9:0x0021, B:11:0x0029, B:14:0x0030, B:16:0x0044, B:18:0x004a, B:19:0x0050, B:21:0x0061, B:22:0x0065, B:24:0x006b, B:26:0x0071, B:28:0x0077, B:29:0x0083, B:35:0x0091), top: B:39:0x0021 }] */
    @Override // U1.InterfaceC1734j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(byte[] r16, int r17, int r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            r2 = 0
            if (r0 != 0) goto L7
            return r2
        L7:
            long r3 = r1.f26226o
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = -1
            if (r3 != 0) goto L11
            return r4
        L11:
            a2.g r3 = r1.f26221j
            java.lang.Object r3 = X1.C1804a.e(r3)
            a2.g r3 = (a2.g) r3
            a2.g r7 = r1.f26222k
            java.lang.Object r7 = X1.C1804a.e(r7)
            a2.g r7 = (a2.g) r7
            long r8 = r1.f26225n     // Catch: java.lang.Throwable -> L2e
            long r10 = r1.f26231t     // Catch: java.lang.Throwable -> L2e
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L30
            r8 = 1
            r15.B(r3, r8)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L9c
        L30:
            androidx.media3.datasource.a r8 = r1.f26223l     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = X1.C1804a.e(r8)     // Catch: java.lang.Throwable -> L2e
            androidx.media3.datasource.a r8 = (androidx.media3.datasource.a) r8     // Catch: java.lang.Throwable -> L2e
            r9 = r16
            r10 = r17
            int r8 = r8.e(r9, r10, r0)     // Catch: java.lang.Throwable -> L2e
            r11 = -1
            if (r8 == r4) goto L65
            boolean r0 = r15.w()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L50
            long r2 = r1.f26230s     // Catch: java.lang.Throwable -> L2e
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f26230s = r2     // Catch: java.lang.Throwable -> L2e
        L50:
            long r2 = r1.f26225n     // Catch: java.lang.Throwable -> L2e
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f26225n = r2     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.f26224m     // Catch: java.lang.Throwable -> L2e
            long r2 = r2 + r4
            r1.f26224m = r2     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.f26226o     // Catch: java.lang.Throwable -> L2e
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L90
            long r2 = r2 - r4
            r1.f26226o = r2     // Catch: java.lang.Throwable -> L2e
            goto L90
        L65:
            boolean r4 = r15.x()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L83
            long r13 = r7.f19990h     // Catch: java.lang.Throwable -> L2e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L77
            long r11 = r1.f26224m     // Catch: java.lang.Throwable -> L2e
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L83
        L77:
            java.lang.String r0 = r3.f19991i     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = X1.L.i(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e
            r15.C(r0)     // Catch: java.lang.Throwable -> L2e
            goto L90
        L83:
            long r11 = r1.f26226o     // Catch: java.lang.Throwable -> L2e
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 > 0) goto L91
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 != 0) goto L90
            goto L91
        L90:
            return r8
        L91:
            r15.q()     // Catch: java.lang.Throwable -> L2e
            r15.B(r3, r2)     // Catch: java.lang.Throwable -> L2e
            int r0 = r15.e(r16, r17, r18)     // Catch: java.lang.Throwable -> L2e
            return r0
        L9c:
            r15.u(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.cache.a.e(byte[], int, int):int");
    }

    @Override // androidx.media3.datasource.a
    public void g(n nVar) {
        C1804a.e(nVar);
        this.f26213b.g(nVar);
        this.f26215d.g(nVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        return x() ? this.f26215d.l() : Collections.emptyMap();
    }

    public Cache r() {
        return this.f26212a;
    }

    public b2.b s() {
        return this.f26216e;
    }

    private a(Cache cache, androidx.media3.datasource.a aVar, androidx.media3.datasource.a aVar2, InterfaceC1887d interfaceC1887d, b2.b bVar, int i10, PriorityTaskManager priorityTaskManager, int i11, b bVar2) {
        this.f26212a = cache;
        this.f26213b = aVar2;
        this.f26216e = bVar == null ? b2.b.f30089a : bVar;
        this.f26217f = (i10 & 1) != 0;
        this.f26218g = (i10 & 2) != 0;
        this.f26219h = (i10 & 4) != 0;
        if (aVar == null) {
            this.f26215d = androidx.media3.datasource.f.f26289a;
            this.f26214c = null;
        } else {
            aVar = priorityTaskManager != null ? new k(aVar, priorityTaskManager, i11) : aVar;
            this.f26215d = aVar;
            this.f26214c = interfaceC1887d != null ? new m(aVar, interfaceC1887d) : null;
        }
    }

    private void z() {
    }

    private void A(int i10) {
    }
}
