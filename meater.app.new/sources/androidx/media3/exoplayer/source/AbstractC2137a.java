package androidx.media3.exoplayer.source;

import X1.C1804a;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import e2.v1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: BaseMediaSource.java */
/* renamed from: androidx.media3.exoplayer.source.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2137a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<r.c> f27710a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<r.c> f27711b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final s.a f27712c = new s.a();

    /* renamed from: d, reason: collision with root package name */
    private final h.a f27713d = new h.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f27714e;

    /* renamed from: f, reason: collision with root package name */
    private U1.G f27715f;

    /* renamed from: g, reason: collision with root package name */
    private v1 f27716g;

    protected abstract void A();

    @Override // androidx.media3.exoplayer.source.r
    public final void b(Handler handler, s sVar) {
        C1804a.e(handler);
        C1804a.e(sVar);
        this.f27712c.h(handler, sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void c(r.c cVar) {
        C1804a.e(this.f27714e);
        boolean zIsEmpty = this.f27711b.isEmpty();
        this.f27711b.add(cVar);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void d(s sVar) {
        this.f27712c.E(sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void e(r.c cVar) {
        this.f27710a.remove(cVar);
        if (!this.f27710a.isEmpty()) {
            f(cVar);
            return;
        }
        this.f27714e = null;
        this.f27715f = null;
        this.f27716g = null;
        this.f27711b.clear();
        A();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void f(r.c cVar) {
        boolean zIsEmpty = this.f27711b.isEmpty();
        this.f27711b.remove(cVar);
        if (zIsEmpty || !this.f27711b.isEmpty()) {
            return;
        }
        u();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void m(r.c cVar, a2.n nVar, v1 v1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f27714e;
        C1804a.a(looper == null || looper == looperMyLooper);
        this.f27716g = v1Var;
        U1.G g10 = this.f27715f;
        this.f27710a.add(cVar);
        if (this.f27714e == null) {
            this.f27714e = looperMyLooper;
            this.f27711b.add(cVar);
            y(nVar);
        } else if (g10 != null) {
            c(cVar);
            cVar.a(this, g10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void n(Handler handler, androidx.media3.exoplayer.drm.h hVar) {
        C1804a.e(handler);
        C1804a.e(hVar);
        this.f27713d.g(handler, hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void o(androidx.media3.exoplayer.drm.h hVar) {
        this.f27713d.t(hVar);
    }

    protected final h.a q(int i10, r.b bVar) {
        return this.f27713d.u(i10, bVar);
    }

    protected final h.a r(r.b bVar) {
        return this.f27713d.u(0, bVar);
    }

    protected final s.a s(int i10, r.b bVar) {
        return this.f27712c.H(i10, bVar);
    }

    protected final s.a t(r.b bVar) {
        return this.f27712c.H(0, bVar);
    }

    protected final v1 w() {
        return (v1) C1804a.i(this.f27716g);
    }

    protected final boolean x() {
        return !this.f27711b.isEmpty();
    }

    protected abstract void y(a2.n nVar);

    protected final void z(U1.G g10) {
        this.f27715f = g10;
        Iterator<r.c> it = this.f27710a.iterator();
        while (it.hasNext()) {
            it.next().a(this, g10);
        }
    }

    protected void u() {
    }

    protected void v() {
    }
}
