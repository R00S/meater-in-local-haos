package androidx.media3.exoplayer.source;

import U1.v;
import X1.C1804a;
import androidx.media3.exoplayer.source.r;

/* compiled from: ExternallyLoadedMediaSource.java */
/* renamed from: androidx.media3.exoplayer.source.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2148l extends AbstractC2137a {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC2146j f27779h;

    /* renamed from: i, reason: collision with root package name */
    private final long f27780i;

    /* renamed from: j, reason: collision with root package name */
    private U1.v f27781j;

    @Override // androidx.media3.exoplayer.source.r
    public q a(r.b bVar, r2.b bVar2, long j10) {
        U1.v vVarH = h();
        C1804a.e(vVarH.f17234b);
        C1804a.f(vVarH.f17234b.f17327b, "Externally loaded mediaItems require a MIME type.");
        v.h hVar = vVarH.f17234b;
        return new C2147k(hVar.f17326a, hVar.f17327b, this.f27779h);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized U1.v h() {
        return this.f27781j;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void j(U1.v vVar) {
        this.f27781j = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        ((C2147k) qVar).n();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void y(a2.n nVar) {
        z(new n2.u(this.f27780i, true, false, false, null, h()));
    }

    private C2148l(U1.v vVar, long j10, InterfaceC2146j interfaceC2146j) {
        this.f27781j = vVar;
        this.f27780i = j10;
        this.f27779h = interfaceC2146j;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i() {
    }

    /* compiled from: ExternallyLoadedMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.l$b */
    public static final class b implements r.a {

        /* renamed from: c, reason: collision with root package name */
        private final long f27782c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC2146j f27783d;

        public b(long j10, InterfaceC2146j interfaceC2146j) {
            this.f27782c = j10;
            this.f27783d = interfaceC2146j;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2148l c(U1.v vVar) {
            return new C2148l(vVar, this.f27782c, this.f27783d);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a d(androidx.media3.exoplayer.upstream.b bVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a e(i2.k kVar) {
            return this;
        }
    }
}
