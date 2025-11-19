package androidx.media3.exoplayer.source;

import U1.G;
import U1.v;
import X1.C1804a;
import android.net.Uri;
import android.os.Looper;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.w;
import e2.v1;
import n2.C4054b;
import s2.InterfaceExecutorC4472a;
import v2.C4806l;

/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes.dex */
public final class C extends AbstractC2137a implements B.c {

    /* renamed from: h, reason: collision with root package name */
    private final a.InterfaceC0371a f27559h;

    /* renamed from: i, reason: collision with root package name */
    private final w.a f27560i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f27561j;

    /* renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f27562k;

    /* renamed from: l, reason: collision with root package name */
    private final int f27563l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f27564m;

    /* renamed from: n, reason: collision with root package name */
    private final l8.s<InterfaceExecutorC4472a> f27565n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27566o;

    /* renamed from: p, reason: collision with root package name */
    private long f27567p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27568q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27569r;

    /* renamed from: s, reason: collision with root package name */
    private a2.n f27570s;

    /* renamed from: t, reason: collision with root package name */
    private U1.v f27571t;

    /* compiled from: ProgressiveMediaSource.java */
    class a extends m {
        a(U1.G g10) {
            super(g10);
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f16826f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.c o(int i10, G.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f16854k = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    public static final class b implements t {

        /* renamed from: c, reason: collision with root package name */
        private final a.InterfaceC0371a f27573c;

        /* renamed from: d, reason: collision with root package name */
        private w.a f27574d;

        /* renamed from: e, reason: collision with root package name */
        private i2.k f27575e;

        /* renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f27576f;

        /* renamed from: g, reason: collision with root package name */
        private int f27577g;

        /* renamed from: h, reason: collision with root package name */
        private l8.s<InterfaceExecutorC4472a> f27578h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f27579i;

        public b(a.InterfaceC0371a interfaceC0371a) {
            this(interfaceC0371a, new C4806l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ w i(v2.u uVar, v1 v1Var) {
            return new C4054b(uVar);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C c(U1.v vVar) {
            C1804a.e(vVar.f17234b);
            return new C(vVar, this.f27573c, this.f27574d, this.f27575e.a(vVar), this.f27576f, this.f27577g, this.f27579i, this.f27578h, null);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b e(i2.k kVar) {
            this.f27575e = (i2.k) C1804a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b d(androidx.media3.exoplayer.upstream.b bVar) {
            this.f27576f = (androidx.media3.exoplayer.upstream.b) C1804a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        b l(boolean z10) {
            this.f27579i = z10;
            return this;
        }

        public b(a.InterfaceC0371a interfaceC0371a, final v2.u uVar) {
            this(interfaceC0371a, new w.a() { // from class: n2.r
                @Override // androidx.media3.exoplayer.source.w.a
                public final androidx.media3.exoplayer.source.w a(v1 v1Var) {
                    return C.b.i(uVar, v1Var);
                }
            });
        }

        public b(a.InterfaceC0371a interfaceC0371a, w.a aVar) {
            this(interfaceC0371a, aVar, new androidx.media3.exoplayer.drm.g(), new androidx.media3.exoplayer.upstream.a(), 1048576);
        }

        public b(a.InterfaceC0371a interfaceC0371a, w.a aVar, i2.k kVar, androidx.media3.exoplayer.upstream.b bVar, int i10) {
            this.f27573c = interfaceC0371a;
            this.f27574d = aVar;
            this.f27575e = kVar;
            this.f27576f = bVar;
            this.f27577g = i10;
        }
    }

    /* synthetic */ C(U1.v vVar, a.InterfaceC0371a interfaceC0371a, w.a aVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, boolean z10, l8.s sVar, a aVar2) {
        this(vVar, interfaceC0371a, aVar, iVar, bVar, i10, z10, sVar);
    }

    private v.h B() {
        return (v.h) C1804a.e(h().f17234b);
    }

    private void C() {
        U1.G uVar = new n2.u(this.f27567p, this.f27568q, false, this.f27569r, null, h());
        if (this.f27566o) {
            uVar = new a(uVar);
        }
        z(uVar);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
        this.f27561j.c();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q a(r.b bVar, r2.b bVar2, long j10) {
        androidx.media3.datasource.a aVarA = this.f27559h.a();
        a2.n nVar = this.f27570s;
        if (nVar != null) {
            aVarA.g(nVar);
        }
        v.h hVarB = B();
        Uri uri = hVarB.f17326a;
        w wVarA = this.f27560i.a(w());
        androidx.media3.exoplayer.drm.i iVar = this.f27561j;
        h.a aVarR = r(bVar);
        androidx.media3.exoplayer.upstream.b bVar3 = this.f27562k;
        s.a aVarT = t(bVar);
        String str = hVarB.f17330e;
        int i10 = this.f27563l;
        boolean z10 = this.f27564m;
        long jQ0 = X1.L.Q0(hVarB.f17334i);
        l8.s<InterfaceExecutorC4472a> sVar = this.f27565n;
        return new B(uri, aVarA, wVarA, iVar, aVarR, bVar3, aVarT, this, bVar2, str, i10, z10, jQ0, sVar != null ? sVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.B.c
    public void g(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f27567p;
        }
        if (!this.f27566o && this.f27567p == j10 && this.f27568q == z10 && this.f27569r == z11) {
            return;
        }
        this.f27567p = j10;
        this.f27568q = z10;
        this.f27569r = z11;
        this.f27566o = false;
        C();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized U1.v h() {
        return this.f27571t;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void j(U1.v vVar) {
        this.f27571t = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        ((B) qVar).h0();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void y(a2.n nVar) {
        this.f27570s = nVar;
        this.f27561j.e((Looper) C1804a.e(Looper.myLooper()), w());
        this.f27561j.i();
        C();
    }

    private C(U1.v vVar, a.InterfaceC0371a interfaceC0371a, w.a aVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, boolean z10, l8.s<InterfaceExecutorC4472a> sVar) {
        this.f27571t = vVar;
        this.f27559h = interfaceC0371a;
        this.f27560i = aVar;
        this.f27561j = iVar;
        this.f27562k = bVar;
        this.f27563l = i10;
        this.f27564m = z10;
        this.f27566o = true;
        this.f27567p = -9223372036854775807L;
        this.f27565n = sVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i() {
    }
}
