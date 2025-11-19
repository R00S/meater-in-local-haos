package N3;

import L3.C1360e;
import L3.y;
import O3.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import j1.C3720e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f12398a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f12399b;

    /* renamed from: c, reason: collision with root package name */
    private final T3.b f12400c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12401d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12402e;

    /* renamed from: f, reason: collision with root package name */
    private final List<m> f12403f;

    /* renamed from: g, reason: collision with root package name */
    private final O3.a<Integer, Integer> f12404g;

    /* renamed from: h, reason: collision with root package name */
    private final O3.a<Integer, Integer> f12405h;

    /* renamed from: i, reason: collision with root package name */
    private O3.a<ColorFilter, ColorFilter> f12406i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.n f12407j;

    /* renamed from: k, reason: collision with root package name */
    private O3.a<Float, Float> f12408k;

    /* renamed from: l, reason: collision with root package name */
    float f12409l;

    /* renamed from: m, reason: collision with root package name */
    private O3.c f12410m;

    public g(com.airbnb.lottie.n nVar, T3.b bVar, S3.p pVar) {
        Path path = new Path();
        this.f12398a = path;
        M3.a aVar = new M3.a(1);
        this.f12399b = aVar;
        this.f12403f = new ArrayList();
        this.f12400c = bVar;
        this.f12401d = pVar.d();
        this.f12402e = pVar.f();
        this.f12407j = nVar;
        if (bVar.x() != null) {
            O3.a<Float, Float> aVarH = bVar.x().a().h();
            this.f12408k = aVarH;
            aVarH.a(this);
            bVar.j(this.f12408k);
        }
        if (bVar.z() != null) {
            this.f12410m = new O3.c(this, bVar, bVar.z());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f12404g = null;
            this.f12405h = null;
            return;
        }
        C3720e.b(aVar, bVar.w().j());
        path.setFillType(pVar.c());
        O3.a<Integer, Integer> aVarH2 = pVar.b().h();
        this.f12404g = aVarH2;
        aVarH2.a(this);
        bVar.j(aVarH2);
        O3.a<Integer, Integer> aVarH3 = pVar.e().h();
        this.f12405h = aVarH3;
        aVarH3.a(this);
        bVar.j(aVarH3);
    }

    @Override // O3.a.b
    public void a() {
        this.f12407j.invalidateSelf();
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f12403f.add((m) cVar);
            }
        }
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        O3.c cVar2;
        O3.c cVar3;
        O3.c cVar4;
        O3.c cVar5;
        O3.c cVar6;
        if (t10 == y.f9222a) {
            this.f12404g.o(cVar);
            return;
        }
        if (t10 == y.f9225d) {
            this.f12405h.o(cVar);
            return;
        }
        if (t10 == y.f9216K) {
            O3.a<ColorFilter, ColorFilter> aVar = this.f12406i;
            if (aVar != null) {
                this.f12400c.I(aVar);
            }
            if (cVar == null) {
                this.f12406i = null;
                return;
            }
            O3.q qVar = new O3.q(cVar);
            this.f12406i = qVar;
            qVar.a(this);
            this.f12400c.j(this.f12406i);
            return;
        }
        if (t10 == y.f9231j) {
            O3.a<Float, Float> aVar2 = this.f12408k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            O3.q qVar2 = new O3.q(cVar);
            this.f12408k = qVar2;
            qVar2.a(this);
            this.f12400c.j(this.f12408k);
            return;
        }
        if (t10 == y.f9226e && (cVar6 = this.f12410m) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t10 == y.f9212G && (cVar5 = this.f12410m) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t10 == y.f9213H && (cVar4 = this.f12410m) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t10 == y.f9214I && (cVar3 = this.f12410m) != null) {
            cVar3.e(cVar);
        } else {
            if (t10 != y.f9215J || (cVar2 = this.f12410m) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
    }

    @Override // N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f12398a.reset();
        for (int i10 = 0; i10 < this.f12403f.size(); i10++) {
            this.f12398a.addPath(this.f12403f.get(i10).h(), matrix);
        }
        this.f12398a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12402e) {
            return;
        }
        if (C1360e.g()) {
            C1360e.b("FillContent#draw");
        }
        this.f12399b.setColor((X3.i.c((int) ((((i10 / 255.0f) * this.f12405h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((O3.b) this.f12404g).q() & 16777215));
        O3.a<ColorFilter, ColorFilter> aVar = this.f12406i;
        if (aVar != null) {
            this.f12399b.setColorFilter(aVar.h());
        }
        O3.a<Float, Float> aVar2 = this.f12408k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f12399b.setMaskFilter(null);
            } else if (fFloatValue != this.f12409l) {
                this.f12399b.setMaskFilter(this.f12400c.y(fFloatValue));
            }
            this.f12409l = fFloatValue;
        }
        O3.c cVar = this.f12410m;
        if (cVar != null) {
            cVar.b(this.f12399b);
        }
        this.f12398a.reset();
        for (int i11 = 0; i11 < this.f12403f.size(); i11++) {
            this.f12398a.addPath(this.f12403f.get(i11).h(), matrix);
        }
        canvas.drawPath(this.f12398a, this.f12399b);
        if (C1360e.g()) {
            C1360e.c("FillContent#draw");
        }
    }

    @Override // N3.c
    public String getName() {
        return this.f12401d;
    }
}
