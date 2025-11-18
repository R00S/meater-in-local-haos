package androidx.media3.exoplayer.source;

import U1.G;
import X1.C1804a;
import android.os.Handler;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: CompositeMediaSource.java */
/* renamed from: androidx.media3.exoplayer.source.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2139c<T> extends AbstractC2137a {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f27727h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private Handler f27728i;

    /* renamed from: j, reason: collision with root package name */
    private a2.n f27729j;

    /* compiled from: CompositeMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.c$a */
    private final class a implements s, androidx.media3.exoplayer.drm.h {

        /* renamed from: B, reason: collision with root package name */
        private final T f27730B;

        /* renamed from: C, reason: collision with root package name */
        private s.a f27731C;

        /* renamed from: D, reason: collision with root package name */
        private h.a f27732D;

        public a(T t10) {
            this.f27731C = AbstractC2139c.this.t(null);
            this.f27732D = AbstractC2139c.this.r(null);
            this.f27730B = t10;
        }

        private boolean d(int i10, r.b bVar) {
            r.b bVarC;
            if (bVar != null) {
                bVarC = AbstractC2139c.this.C(this.f27730B, bVar);
                if (bVarC == null) {
                    return false;
                }
            } else {
                bVarC = null;
            }
            int iE = AbstractC2139c.this.E(this.f27730B, i10);
            s.a aVar = this.f27731C;
            if (aVar.f27817a != iE || !X1.L.d(aVar.f27818b, bVarC)) {
                this.f27731C = AbstractC2139c.this.s(iE, bVarC);
            }
            h.a aVar2 = this.f27732D;
            if (aVar2.f27124a == iE && X1.L.d(aVar2.f27125b, bVarC)) {
                return true;
            }
            this.f27732D = AbstractC2139c.this.q(iE, bVarC);
            return true;
        }

        private n2.j e(n2.j jVar, r.b bVar) {
            long jD = AbstractC2139c.this.D(this.f27730B, jVar.f45632f, bVar);
            long jD2 = AbstractC2139c.this.D(this.f27730B, jVar.f45633g, bVar);
            return (jD == jVar.f45632f && jD2 == jVar.f45633g) ? jVar : new n2.j(jVar.f45627a, jVar.f45628b, jVar.f45629c, jVar.f45630d, jVar.f45631e, jD, jD2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void D(int i10, r.b bVar, n2.j jVar) {
            if (d(i10, bVar)) {
                this.f27731C.G(e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void I(int i10, r.b bVar, n2.j jVar) {
            if (d(i10, bVar)) {
                this.f27731C.k(e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void L(int i10, r.b bVar, n2.i iVar, n2.j jVar, IOException iOException, boolean z10) {
            if (d(i10, bVar)) {
                this.f27731C.A(iVar, e(jVar, bVar), iOException, z10);
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i10, r.b bVar, n2.i iVar, n2.j jVar) {
            if (d(i10, bVar)) {
                this.f27731C.D(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Q(int i10, r.b bVar) {
            if (d(i10, bVar)) {
                this.f27732D.j();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void T(int i10, r.b bVar, n2.i iVar, n2.j jVar) {
            if (d(i10, bVar)) {
                this.f27731C.u(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void c0(int i10, r.b bVar) {
            if (d(i10, bVar)) {
                this.f27732D.h();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void e0(int i10, r.b bVar, n2.i iVar, n2.j jVar) {
            if (d(i10, bVar)) {
                this.f27731C.x(iVar, e(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void h0(int i10, r.b bVar) {
            if (d(i10, bVar)) {
                this.f27732D.m();
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void i0(int i10, r.b bVar, int i11) {
            if (d(i10, bVar)) {
                this.f27732D.k(i11);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void m0(int i10, r.b bVar) {
            if (d(i10, bVar)) {
                this.f27732D.i();
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void n0(int i10, r.b bVar, Exception exc) {
            if (d(i10, bVar)) {
                this.f27732D.l(exc);
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.c$b */
    private static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final r f27734a;

        /* renamed from: b, reason: collision with root package name */
        public final r.c f27735b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC2139c<T>.a f27736c;

        public b(r rVar, r.c cVar, AbstractC2139c<T>.a aVar) {
            this.f27734a = rVar;
            this.f27735b = cVar;
            this.f27736c = aVar;
        }
    }

    protected AbstractC2139c() {
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
        for (b<T> bVar : this.f27727h.values()) {
            bVar.f27734a.e(bVar.f27735b);
            bVar.f27734a.d(bVar.f27736c);
            bVar.f27734a.o(bVar.f27736c);
        }
        this.f27727h.clear();
    }

    protected abstract r.b C(T t10, r.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public abstract void F(T t10, r rVar, U1.G g10);

    protected final void H(final T t10, r rVar) {
        C1804a.a(!this.f27727h.containsKey(t10));
        r.c cVar = new r.c() { // from class: n2.c
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar2, G g10) {
                this.f45611a.F(t10, rVar2, g10);
            }
        };
        a aVar = new a(t10);
        this.f27727h.put(t10, new b<>(rVar, cVar, aVar));
        rVar.b((Handler) C1804a.e(this.f27728i), aVar);
        rVar.n((Handler) C1804a.e(this.f27728i), aVar);
        rVar.m(cVar, this.f27729j, w());
        if (x()) {
            return;
        }
        rVar.f(cVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i() {
        Iterator<b<T>> it = this.f27727h.values().iterator();
        while (it.hasNext()) {
            it.next().f27734a.i();
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void u() {
        for (b<T> bVar : this.f27727h.values()) {
            bVar.f27734a.f(bVar.f27735b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void v() {
        for (b<T> bVar : this.f27727h.values()) {
            bVar.f27734a.c(bVar.f27735b);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void y(a2.n nVar) {
        this.f27729j = nVar;
        this.f27728i = X1.L.A();
    }

    protected int E(T t10, int i10) {
        return i10;
    }

    protected long D(T t10, long j10, r.b bVar) {
        return j10;
    }
}
