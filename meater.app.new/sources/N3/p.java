package N3;

import L3.y;
import O3.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f12480a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f12481b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.n f12482c;

    /* renamed from: d, reason: collision with root package name */
    private final T3.b f12483d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12484e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12485f;

    /* renamed from: g, reason: collision with root package name */
    private final O3.a<Float, Float> f12486g;

    /* renamed from: h, reason: collision with root package name */
    private final O3.a<Float, Float> f12487h;

    /* renamed from: i, reason: collision with root package name */
    private final O3.p f12488i;

    /* renamed from: j, reason: collision with root package name */
    private d f12489j;

    public p(com.airbnb.lottie.n nVar, T3.b bVar, S3.m mVar) {
        this.f12482c = nVar;
        this.f12483d = bVar;
        this.f12484e = mVar.c();
        this.f12485f = mVar.f();
        O3.a<Float, Float> aVarH = mVar.b().h();
        this.f12486g = aVarH;
        bVar.j(aVarH);
        aVarH.a(this);
        O3.a<Float, Float> aVarH2 = mVar.d().h();
        this.f12487h = aVarH2;
        bVar.j(aVarH2);
        aVarH2.a(this);
        O3.p pVarB = mVar.e().b();
        this.f12488i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // O3.a.b
    public void a() {
        this.f12482c.invalidateSelf();
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        this.f12489j.b(list, list2);
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        if (this.f12488i.c(t10, cVar)) {
            return;
        }
        if (t10 == y.f9242u) {
            this.f12486g.o(cVar);
        } else if (t10 == y.f9243v) {
            this.f12487h.o(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f12489j.k().size(); i11++) {
            c cVar = this.f12489j.k().get(i11);
            if (cVar instanceof k) {
                X3.i.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f12489j.e(rectF, matrix, z10);
    }

    @Override // N3.j
    public void f(ListIterator<c> listIterator) {
        if (this.f12489j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f12489j = new d(this.f12482c, this.f12483d, "Repeater", this.f12485f, arrayList, null);
    }

    @Override // N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f12486g.h().floatValue();
        float fFloatValue2 = this.f12487h.h().floatValue();
        float fFloatValue3 = this.f12488i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f12488i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f12480a.set(matrix);
            float f10 = i11;
            this.f12480a.preConcat(this.f12488i.g(f10 + fFloatValue2));
            this.f12489j.g(canvas, this.f12480a, (int) (i10 * X3.i.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // N3.c
    public String getName() {
        return this.f12484e;
    }

    @Override // N3.m
    public Path h() {
        Path pathH = this.f12489j.h();
        this.f12481b.reset();
        float fFloatValue = this.f12486g.h().floatValue();
        float fFloatValue2 = this.f12487h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f12480a.set(this.f12488i.g(i10 + fFloatValue2));
            this.f12481b.addPath(pathH, this.f12480a);
        }
        return this.f12481b;
    }
}
