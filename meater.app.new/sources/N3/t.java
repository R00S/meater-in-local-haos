package N3;

import L3.y;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: r, reason: collision with root package name */
    private final T3.b f12501r;

    /* renamed from: s, reason: collision with root package name */
    private final String f12502s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f12503t;

    /* renamed from: u, reason: collision with root package name */
    private final O3.a<Integer, Integer> f12504u;

    /* renamed from: v, reason: collision with root package name */
    private O3.a<ColorFilter, ColorFilter> f12505v;

    public t(com.airbnb.lottie.n nVar, T3.b bVar, S3.s sVar) {
        super(nVar, bVar, sVar.b().j(), sVar.e().j(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f12501r = bVar;
        this.f12502s = sVar.h();
        this.f12503t = sVar.k();
        O3.a<Integer, Integer> aVarH = sVar.c().h();
        this.f12504u = aVarH;
        aVarH.a(this);
        bVar.j(aVarH);
    }

    @Override // N3.a, Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        super.c(t10, cVar);
        if (t10 == y.f9223b) {
            this.f12504u.o(cVar);
            return;
        }
        if (t10 == y.f9216K) {
            O3.a<ColorFilter, ColorFilter> aVar = this.f12505v;
            if (aVar != null) {
                this.f12501r.I(aVar);
            }
            if (cVar == null) {
                this.f12505v = null;
                return;
            }
            O3.q qVar = new O3.q(cVar);
            this.f12505v = qVar;
            qVar.a(this);
            this.f12501r.j(this.f12504u);
        }
    }

    @Override // N3.a, N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12503t) {
            return;
        }
        this.f12367i.setColor(((O3.b) this.f12504u).q());
        O3.a<ColorFilter, ColorFilter> aVar = this.f12505v;
        if (aVar != null) {
            this.f12367i.setColorFilter(aVar.h());
        }
        super.g(canvas, matrix, i10);
    }

    @Override // N3.c
    public String getName() {
        return this.f12502s;
    }
}
