package q2;

import U1.C1727c;
import U1.G;
import U1.J;
import X1.C1804a;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.t0;
import androidx.media3.exoplayer.u0;

/* compiled from: TrackSelector.java */
/* renamed from: q2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4270C {

    /* renamed from: a, reason: collision with root package name */
    private a f47803a;

    /* renamed from: b, reason: collision with root package name */
    private r2.d f47804b;

    protected final r2.d b() {
        return (r2.d) C1804a.i(this.f47804b);
    }

    public J c() {
        return J.f16871C;
    }

    public u0.a d() {
        return null;
    }

    public void e(a aVar, r2.d dVar) {
        this.f47803a = aVar;
        this.f47804b = dVar;
    }

    protected final void f() {
        a aVar = this.f47803a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void g(t0 t0Var) {
        a aVar = this.f47803a;
        if (aVar != null) {
            aVar.a(t0Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.f47803a = null;
        this.f47804b = null;
    }

    public abstract C4271D k(u0[] u0VarArr, n2.x xVar, r.b bVar, G g10);

    /* compiled from: TrackSelector.java */
    /* renamed from: q2.C$a */
    public interface a {
        void b();

        default void a(t0 t0Var) {
        }
    }

    public void l(C1727c c1727c) {
    }

    public void m(J j10) {
    }
}
